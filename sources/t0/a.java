package T0;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Comparator;

/* loaded from: classes.dex */
public class a {

    /* renamed from: l, reason: collision with root package name */
    public static final Comparator f2028l = new b();

    /* renamed from: a, reason: collision with root package name */
    public final ByteBuffer f2029a;

    /* renamed from: b, reason: collision with root package name */
    public final short f2030b;

    /* renamed from: c, reason: collision with root package name */
    public final short f2031c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2032d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2033e;

    /* renamed from: f, reason: collision with root package name */
    public final long f2034f;

    /* renamed from: g, reason: collision with root package name */
    public final long f2035g;

    /* renamed from: h, reason: collision with root package name */
    public final long f2036h;

    /* renamed from: i, reason: collision with root package name */
    public final long f2037i;

    /* renamed from: j, reason: collision with root package name */
    public final String f2038j;

    /* renamed from: k, reason: collision with root package name */
    public final int f2039k;

    public static class b implements Comparator {
        public b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(a aVar, a aVar2) {
            long e3 = aVar.e();
            long e4 = aVar2.e();
            if (e3 > e4) {
                return 1;
            }
            return e3 < e4 ? -1 : 0;
        }
    }

    public a(ByteBuffer byteBuffer, short s3, short s4, int i3, int i4, long j3, long j4, long j5, long j6, String str, int i5) {
        this.f2029a = byteBuffer;
        this.f2030b = s3;
        this.f2031c = s4;
        this.f2033e = i4;
        this.f2032d = i3;
        this.f2034f = j3;
        this.f2035g = j4;
        this.f2036h = j5;
        this.f2037i = j6;
        this.f2038j = str;
        this.f2039k = i5;
    }

    public static String g(ByteBuffer byteBuffer, int i3, int i4) {
        byte[] bArr;
        int i5;
        if (byteBuffer.hasArray()) {
            bArr = byteBuffer.array();
            i5 = byteBuffer.arrayOffset() + i3;
        } else {
            bArr = new byte[i4];
            int position = byteBuffer.position();
            try {
                byteBuffer.position(i3);
                byteBuffer.get(bArr);
                byteBuffer.position(position);
                i5 = 0;
            } catch (Throwable th) {
                byteBuffer.position(position);
                throw th;
            }
        }
        return new String(bArr, i5, i4, StandardCharsets.UTF_8);
    }

    public static a i(ByteBuffer byteBuffer) {
        c.a(byteBuffer);
        if (byteBuffer.remaining() < 46) {
            throw new V0.a("Input too short. Need at least: 46 bytes, available: " + byteBuffer.remaining() + " bytes", new BufferUnderflowException());
        }
        int position = byteBuffer.position();
        int i3 = byteBuffer.getInt();
        if (i3 != 33639248) {
            throw new V0.a("Not a Central Directory record. Signature: 0x" + Long.toHexString(i3 & 4294967295L));
        }
        byteBuffer.position(position + 8);
        short s3 = byteBuffer.getShort();
        short s4 = byteBuffer.getShort();
        int e3 = c.e(byteBuffer);
        int e4 = c.e(byteBuffer);
        long g3 = c.g(byteBuffer);
        long g4 = c.g(byteBuffer);
        long g5 = c.g(byteBuffer);
        int e5 = c.e(byteBuffer);
        int e6 = c.e(byteBuffer);
        int e7 = c.e(byteBuffer);
        byteBuffer.position(position + 42);
        long g6 = c.g(byteBuffer);
        byteBuffer.position(position);
        int i4 = e5 + 46 + e6 + e7;
        if (i4 > byteBuffer.remaining()) {
            throw new V0.a("Input too short. Need: " + i4 + " bytes, available: " + byteBuffer.remaining() + " bytes", new BufferUnderflowException());
        }
        String g7 = g(byteBuffer, position + 46, e5);
        byteBuffer.position(position);
        int limit = byteBuffer.limit();
        int i5 = position + i4;
        try {
            byteBuffer.limit(i5);
            ByteBuffer slice = byteBuffer.slice();
            byteBuffer.limit(limit);
            byteBuffer.position(i5);
            return new a(slice, s3, s4, e3, e4, g3, g4, g5, g6, g7, e5);
        } catch (Throwable th) {
            byteBuffer.limit(limit);
            throw th;
        }
    }

    public long a() {
        return this.f2035g;
    }

    public short b() {
        return this.f2031c;
    }

    public long c() {
        return this.f2034f;
    }

    public short d() {
        return this.f2030b;
    }

    public long e() {
        return this.f2037i;
    }

    public String f() {
        return this.f2038j;
    }

    public int h() {
        return this.f2039k;
    }

    public long j() {
        return this.f2036h;
    }
}
