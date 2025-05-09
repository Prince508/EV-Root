package T0;

import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public class b {

    /* renamed from: j, reason: collision with root package name */
    public static final ByteBuffer f2040j = ByteBuffer.allocate(0);

    /* renamed from: a, reason: collision with root package name */
    public final String f2041a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2042b;

    /* renamed from: c, reason: collision with root package name */
    public final ByteBuffer f2043c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2044d;

    /* renamed from: e, reason: collision with root package name */
    public final long f2045e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2046f;

    /* renamed from: g, reason: collision with root package name */
    public final long f2047g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f2048h;

    /* renamed from: i, reason: collision with root package name */
    public final long f2049i;

    /* renamed from: T0.b$b, reason: collision with other inner class name */
    public static class C0055b implements U0.a, Closeable {

        /* renamed from: e, reason: collision with root package name */
        public final U0.a f2050e;

        /* renamed from: f, reason: collision with root package name */
        public Inflater f2051f;

        /* renamed from: g, reason: collision with root package name */
        public byte[] f2052g;

        /* renamed from: h, reason: collision with root package name */
        public byte[] f2053h;

        /* renamed from: i, reason: collision with root package name */
        public long f2054i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f2055j;

        @Override // U0.a
        public void a(byte[] bArr, int i3, int i4) {
            c();
            this.f2051f.setInput(bArr, i3, i4);
            if (this.f2052g == null) {
                this.f2052g = new byte[65536];
            }
            while (!this.f2051f.finished()) {
                try {
                    int inflate = this.f2051f.inflate(this.f2052g);
                    if (inflate == 0) {
                        return;
                    }
                    this.f2050e.a(this.f2052g, 0, inflate);
                    this.f2054i += inflate;
                } catch (DataFormatException e3) {
                    throw new IOException("Failed to inflate data", e3);
                }
            }
        }

        @Override // U0.a
        public void b(ByteBuffer byteBuffer) {
            c();
            if (byteBuffer.hasArray()) {
                a(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
                byteBuffer.position(byteBuffer.limit());
                return;
            }
            if (this.f2053h == null) {
                this.f2053h = new byte[65536];
            }
            while (byteBuffer.hasRemaining()) {
                int min = Math.min(byteBuffer.remaining(), this.f2053h.length);
                byteBuffer.get(this.f2053h, 0, min);
                a(this.f2053h, 0, min);
            }
        }

        public final void c() {
            if (this.f2055j) {
                throw new IllegalStateException("Closed");
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f2055j = true;
            this.f2053h = null;
            this.f2052g = null;
            Inflater inflater = this.f2051f;
            if (inflater != null) {
                inflater.end();
                this.f2051f = null;
            }
        }

        public long d() {
            return this.f2054i;
        }

        public C0055b(U0.a aVar) {
            this.f2051f = new Inflater(true);
            this.f2050e = aVar;
        }
    }

    public b(String str, int i3, ByteBuffer byteBuffer, long j3, long j4, int i4, long j5, boolean z3, long j6) {
        this.f2041a = str;
        this.f2042b = i3;
        this.f2043c = byteBuffer;
        this.f2044d = j3;
        this.f2045e = j4;
        this.f2046f = i4;
        this.f2047g = j5;
        this.f2048h = z3;
        this.f2049i = j6;
    }

    public static b a(U0.c cVar, T0.a aVar, long j3, boolean z3, boolean z4) {
        ByteOrder byteOrder;
        int i3;
        long j4;
        String f3 = aVar.f();
        int h3 = aVar.h();
        int i4 = h3 + 30;
        long e3 = aVar.e();
        long j5 = i4 + e3;
        if (j5 > j3) {
            throw new V0.a("Local File Header of " + f3 + " extends beyond start of Central Directory. LFH end: " + j5 + ", CD start: " + j3);
        }
        try {
            ByteBuffer c3 = cVar.c(e3, i4);
            ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
            c3.order(byteOrder2);
            int i5 = c3.getInt();
            if (i5 != 67324752) {
                throw new V0.a("Not a Local File Header record for entry " + f3 + ". Signature: 0x" + Long.toHexString(i5 & 4294967295L));
            }
            int i6 = c3.getShort(6) & 8;
            boolean z5 = i6 != 0;
            boolean z6 = (aVar.d() & 8) != 0;
            if (z5 != z6) {
                throw new V0.a("Data Descriptor presence mismatch between Local File Header and Central Directory for entry " + f3 + ". LFH: " + z5 + ", CD: " + z6);
            }
            boolean z7 = z5;
            long c4 = aVar.c();
            long a3 = aVar.a();
            long j6 = aVar.j();
            if (z7) {
                byteOrder = byteOrder2;
                i3 = i6;
            } else {
                byteOrder = byteOrder2;
                i3 = i6;
                long h4 = c.h(c3, 14);
                if (h4 != c4) {
                    throw new V0.a("CRC-32 mismatch between Local File Header and Central Directory for entry " + f3 + ". LFH: " + h4 + ", CD: " + c4);
                }
                long h5 = c.h(c3, 18);
                if (h5 != a3) {
                    throw new V0.a("Compressed size mismatch between Local File Header and Central Directory for entry " + f3 + ". LFH: " + h5 + ", CD: " + a3);
                }
                long h6 = c.h(c3, 22);
                if (h6 != j6) {
                    throw new V0.a("Uncompressed size mismatch between Local File Header and Central Directory for entry " + f3 + ". LFH: " + h6 + ", CD: " + j6);
                }
            }
            int f4 = c.f(c3, 26);
            if (f4 > h3) {
                throw new V0.a("Name mismatch between Local File Header and Central Directory for entry" + f3 + ". LFH: " + f4 + " bytes, CD: " + h3 + " bytes");
            }
            String g3 = T0.a.g(c3, 30, f4);
            if (!f3.equals(g3)) {
                throw new V0.a("Name mismatch between Local File Header and Central Directory. LFH: \"" + g3 + "\", CD: \"" + f3 + "\"");
            }
            int f5 = c.f(c3, 28);
            long j7 = e3 + 30 + f4;
            long j8 = f5 + j7;
            boolean z8 = aVar.b() != 0;
            if (!z8) {
                a3 = j6;
            }
            boolean z9 = z8;
            long j9 = j8 + a3;
            if (j9 > j3) {
                throw new V0.a("Local File Header data of " + f3 + " overlaps with Central Directory. LFH data start: " + j8 + ", LFH data end: " + j9 + ", CD start: " + j3);
            }
            ByteBuffer byteBuffer = f2040j;
            if (z3 && f5 > 0) {
                byteBuffer = cVar.c(j7, f5);
            }
            if (!z4 || i3 == 0) {
                j4 = j6;
            } else {
                long j10 = 12 + j9;
                j4 = j6;
                if (j10 > j3) {
                    throw new V0.a("Data Descriptor of " + f3 + " overlaps with Central Directory. Data Descriptor end: " + j9 + ", CD start: " + j3);
                }
                ByteBuffer c5 = cVar.c(j9, 4);
                c5.order(byteOrder);
                if (c5.getInt() == 134695760) {
                    j10 = 16 + j9;
                    if (j10 > j3) {
                        throw new V0.a("Data Descriptor of " + f3 + " overlaps with Central Directory. Data Descriptor end: " + j9 + ", CD start: " + j3);
                    }
                }
                j9 = j10;
            }
            return new b(f3, h3, byteBuffer, e3, j9 - e3, f4 + 30 + f5, a3, z9, j4);
        } catch (IOException e4) {
            throw new IOException("Failed to read Local File Header of " + f3, e4);
        }
    }

    public static byte[] b(U0.c cVar, T0.a aVar, long j3) {
        if (aVar.j() > 2147483647L) {
            throw new IOException(aVar.f() + " too large: " + aVar.j());
        }
        try {
            byte[] bArr = new byte[(int) aVar.j()];
            c(cVar, aVar, j3, new R0.b(ByteBuffer.wrap(bArr)));
            return bArr;
        } catch (OutOfMemoryError e3) {
            throw new IOException(aVar.f() + " too large: " + aVar.j(), e3);
        }
    }

    public static void c(U0.c cVar, T0.a aVar, long j3, U0.a aVar2) {
        a(cVar, aVar, j3, false, false).d(cVar, aVar2);
    }

    public void d(U0.c cVar, U0.a aVar) {
        long j3 = this.f2044d + this.f2046f;
        try {
            if (!this.f2048h) {
                cVar.a(j3, this.f2047g, aVar);
                return;
            }
            try {
                C0055b c0055b = new C0055b(aVar);
                try {
                    cVar.a(j3, this.f2047g, c0055b);
                    long d3 = c0055b.d();
                    if (d3 == this.f2049i) {
                        c0055b.close();
                        return;
                    }
                    throw new V0.a("Unexpected size of uncompressed data of " + this.f2041a + ". Expected: " + this.f2049i + " bytes, actual: " + d3 + " bytes");
                } finally {
                }
            } catch (IOException e3) {
                if (!(e3.getCause() instanceof DataFormatException)) {
                    throw e3;
                }
                throw new V0.a("Data of entry " + this.f2041a + " malformed", e3);
            }
        } catch (IOException e4) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to read data of ");
            sb.append(this.f2048h ? "compressed" : "uncompressed");
            sb.append(" entry ");
            sb.append(this.f2041a);
            throw new IOException(sb.toString(), e4);
        }
    }
}
