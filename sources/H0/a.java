package H0;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final ByteBuffer f641a;

    /* renamed from: b, reason: collision with root package name */
    public e f642b;

    /* renamed from: c, reason: collision with root package name */
    public d f643c;

    /* renamed from: d, reason: collision with root package name */
    public int f644d;

    /* renamed from: e, reason: collision with root package name */
    public int f645e = 1;

    /* renamed from: f, reason: collision with root package name */
    public String f646f;

    /* renamed from: g, reason: collision with root package name */
    public String f647g;

    /* renamed from: h, reason: collision with root package name */
    public int f648h;

    /* renamed from: i, reason: collision with root package name */
    public List f649i;

    /* renamed from: j, reason: collision with root package name */
    public ByteBuffer f650j;

    /* renamed from: k, reason: collision with root package name */
    public int f651k;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final long f652a;

        /* renamed from: b, reason: collision with root package name */
        public final long f653b;

        /* renamed from: c, reason: collision with root package name */
        public final int f654c;

        /* renamed from: d, reason: collision with root package name */
        public final int f655d;

        /* renamed from: e, reason: collision with root package name */
        public final e f656e;

        /* renamed from: f, reason: collision with root package name */
        public final d f657f;

        public int a() {
            int i3 = this.f654c;
            if (i3 != 1) {
                switch (i3) {
                    case 16:
                    case 17:
                    case 18:
                        break;
                    default:
                        throw new f("Cannot coerce to int: value type " + this.f654c);
                }
            }
            return this.f655d;
        }

        public int b() {
            d dVar = this.f657f;
            if (dVar != null) {
                return dVar.a(this.f653b);
            }
            return 0;
        }

        public String c() {
            int i3 = this.f654c;
            if (i3 == 1) {
                return "@" + Integer.toHexString(this.f655d);
            }
            if (i3 == 3) {
                return this.f656e.c(this.f655d & 4294967295L);
            }
            switch (i3) {
                case 16:
                    return Integer.toString(this.f655d);
                case 17:
                    return "0x" + Integer.toHexString(this.f655d);
                case 18:
                    return Boolean.toString(this.f655d != 0);
                default:
                    throw new f("Cannot coerce to string: value type " + this.f654c);
            }
        }

        public int d() {
            return this.f654c;
        }

        public b(long j3, long j4, int i3, int i4, e eVar, d dVar) {
            this.f652a = j3;
            this.f653b = j4;
            this.f654c = i3;
            this.f655d = i4;
            this.f656e = eVar;
            this.f657f = dVar;
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f658a;

        /* renamed from: b, reason: collision with root package name */
        public final ByteBuffer f659b;

        /* renamed from: c, reason: collision with root package name */
        public final ByteBuffer f660c;

        public c(int i3, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
            this.f658a = i3;
            this.f659b = byteBuffer;
            this.f660c = byteBuffer2;
        }

        public static c a(ByteBuffer byteBuffer) {
            if (byteBuffer.remaining() < 8) {
                byteBuffer.position(byteBuffer.limit());
                return null;
            }
            int position = byteBuffer.position();
            int q3 = a.q(byteBuffer);
            int q4 = a.q(byteBuffer);
            long r3 = a.r(byteBuffer);
            if (r3 - 8 > byteBuffer.remaining()) {
                byteBuffer.position(byteBuffer.limit());
                return null;
            }
            if (q4 < 8) {
                throw new f("Malformed chunk: header too short: " + q4 + " bytes");
            }
            if (q4 <= r3) {
                int i3 = q4 + position;
                long j3 = position + r3;
                c cVar = new c(q3, a.w(byteBuffer, position, i3), a.x(byteBuffer, i3, j3));
                byteBuffer.position((int) j3);
                return cVar;
            }
            throw new f("Malformed chunk: header too long: " + q4 + " bytes. Chunk size: " + r3 + " bytes");
        }

        public ByteBuffer b() {
            ByteBuffer slice = this.f660c.slice();
            slice.order(this.f660c.order());
            return slice;
        }

        public ByteBuffer c() {
            ByteBuffer slice = this.f659b.slice();
            slice.order(this.f659b.order());
            return slice;
        }

        public int d() {
            return this.f658a;
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final ByteBuffer f661a;

        /* renamed from: b, reason: collision with root package name */
        public final int f662b;

        public d(c cVar) {
            ByteBuffer slice = cVar.b().slice();
            this.f661a = slice;
            slice.order(cVar.b().order());
            this.f662b = slice.remaining() / 4;
        }

        public int a(long j3) {
            if (j3 < 0 || j3 >= this.f662b) {
                return 0;
            }
            return this.f661a.getInt(((int) j3) * 4);
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public final ByteBuffer f663a;

        /* renamed from: b, reason: collision with root package name */
        public final ByteBuffer f664b;

        /* renamed from: c, reason: collision with root package name */
        public final int f665c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f666d;

        /* renamed from: e, reason: collision with root package name */
        public final Map f667e = new HashMap();

        public e(c cVar) {
            long j3;
            int remaining;
            ByteBuffer c3 = cVar.c();
            int remaining2 = c3.remaining();
            c3.position(8);
            if (c3.remaining() < 20) {
                throw new f("XML chunk's header too short. Required at least 20 bytes. Available: " + c3.remaining() + " bytes");
            }
            long r3 = a.r(c3);
            if (r3 > 2147483647L) {
                throw new f("Too many strings: " + r3);
            }
            int i3 = (int) r3;
            this.f665c = i3;
            long r4 = a.r(c3);
            if (r4 > 2147483647L) {
                throw new f("Too many styles: " + r4);
            }
            long r5 = a.r(c3);
            long r6 = a.r(c3);
            long r7 = a.r(c3);
            ByteBuffer b3 = cVar.b();
            if (i3 > 0) {
                long j4 = remaining2;
                j3 = 0;
                int i4 = (int) (r6 - j4);
                if (r4 <= 0) {
                    remaining = b3.remaining();
                } else {
                    if (r7 < r6) {
                        throw new f("Styles offset (" + r7 + ") < strings offset (" + r6 + ")");
                    }
                    remaining = (int) (r7 - j4);
                }
                this.f664b = a.w(b3, i4, remaining);
            } else {
                j3 = 0;
                this.f664b = ByteBuffer.allocate(0);
            }
            this.f666d = (256 & r5) != j3;
            this.f663a = b3;
        }

        public static String a(ByteBuffer byteBuffer) {
            byte[] bArr;
            int i3;
            int q3 = a.q(byteBuffer);
            if ((32768 & q3) != 0) {
                q3 = ((q3 & 32767) << 16) | a.q(byteBuffer);
            }
            if (q3 > 1073741823) {
                throw new f("String too long: " + q3 + " uint16s");
            }
            int i4 = q3 * 2;
            if (byteBuffer.hasArray()) {
                bArr = byteBuffer.array();
                i3 = byteBuffer.arrayOffset() + byteBuffer.position();
                byteBuffer.position(byteBuffer.position() + i4);
            } else {
                bArr = new byte[i4];
                byteBuffer.get(bArr);
                i3 = 0;
            }
            int i5 = i3 + i4;
            if (bArr[i5] != 0 || bArr[i5 + 1] != 0) {
                throw new f("UTF-16 encoded form of string not NULL terminated");
            }
            try {
                return new String(bArr, i3, i4, "UTF-16LE");
            } catch (UnsupportedEncodingException e3) {
                throw new RuntimeException("UTF-16LE character encoding not supported", e3);
            }
        }

        public static String b(ByteBuffer byteBuffer) {
            byte[] bArr;
            int i3;
            if ((a.t(byteBuffer) & 128) != 0) {
                a.t(byteBuffer);
            }
            int t3 = a.t(byteBuffer);
            if ((t3 & 128) != 0) {
                t3 = ((t3 & 127) << 8) | a.t(byteBuffer);
            }
            if (byteBuffer.hasArray()) {
                bArr = byteBuffer.array();
                i3 = byteBuffer.arrayOffset() + byteBuffer.position();
                byteBuffer.position(byteBuffer.position() + t3);
            } else {
                bArr = new byte[t3];
                byteBuffer.get(bArr);
                i3 = 0;
            }
            if (bArr[i3 + t3] != 0) {
                throw new f("UTF-8 encoded form of string not NULL terminated");
            }
            try {
                return new String(bArr, i3, t3, "UTF-8");
            } catch (UnsupportedEncodingException e3) {
                throw new RuntimeException("UTF-8 character encoding not supported", e3);
            }
        }

        public String c(long j3) {
            if (j3 < 0) {
                throw new f("Unsuported string index: " + j3);
            }
            if (j3 >= this.f665c) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unsuported string index: ");
                sb.append(j3);
                sb.append(", max: ");
                sb.append(this.f665c - 1);
                throw new f(sb.toString());
            }
            int i3 = (int) j3;
            String str = (String) this.f667e.get(Integer.valueOf(i3));
            if (str != null) {
                return str;
            }
            long s3 = a.s(this.f663a, i3 * 4);
            if (s3 < this.f664b.capacity()) {
                this.f664b.position((int) s3);
                String b3 = this.f666d ? b(this.f664b) : a(this.f664b);
                this.f667e.put(Integer.valueOf(i3), b3);
                return b3;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Offset of string idx ");
            sb2.append(i3);
            sb2.append(" out of bounds: ");
            sb2.append(s3);
            sb2.append(", max: ");
            sb2.append(this.f664b.capacity() - 1);
            throw new f(sb2.toString());
        }
    }

    public static class f extends Exception {
        public f(String str) {
            super(str);
        }
    }

    public a(ByteBuffer byteBuffer) {
        c cVar;
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        while (byteBuffer.hasRemaining() && (cVar = c.a(byteBuffer)) != null) {
            if (cVar.d() == 3) {
                break;
            }
        }
        cVar = null;
        if (cVar == null) {
            throw new f("No XML chunk in file");
        }
        this.f641a = cVar.b();
    }

    public static int q(ByteBuffer byteBuffer) {
        return byteBuffer.getShort() & 65535;
    }

    public static long r(ByteBuffer byteBuffer) {
        return byteBuffer.getInt() & 4294967295L;
    }

    public static long s(ByteBuffer byteBuffer, int i3) {
        return byteBuffer.getInt(i3) & 4294967295L;
    }

    public static int t(ByteBuffer byteBuffer) {
        return byteBuffer.get() & 255;
    }

    public static ByteBuffer w(ByteBuffer byteBuffer, int i3, int i4) {
        if (i3 < 0) {
            throw new IllegalArgumentException("start: " + i3);
        }
        if (i4 < i3) {
            throw new IllegalArgumentException("end < start: " + i4 + " < " + i3);
        }
        int capacity = byteBuffer.capacity();
        if (i4 > byteBuffer.capacity()) {
            throw new IllegalArgumentException("end > capacity: " + i4 + " > " + capacity);
        }
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        try {
            byteBuffer.position(0);
            byteBuffer.limit(i4);
            byteBuffer.position(i3);
            ByteBuffer slice = byteBuffer.slice();
            slice.order(byteBuffer.order());
            return slice;
        } finally {
            byteBuffer.position(0);
            byteBuffer.limit(limit);
            byteBuffer.position(position);
        }
    }

    public static ByteBuffer x(ByteBuffer byteBuffer, long j3, long j4) {
        if (j3 < 0) {
            throw new IllegalArgumentException("start: " + j3);
        }
        if (j4 < j3) {
            throw new IllegalArgumentException("end < start: " + j4 + " < " + j3);
        }
        int capacity = byteBuffer.capacity();
        if (j4 <= byteBuffer.capacity()) {
            return w(byteBuffer, (int) j3, (int) j4);
        }
        throw new IllegalArgumentException("end > capacity: " + j4 + " > " + capacity);
    }

    public final b g(int i3) {
        if (this.f645e != 3) {
            throw new IndexOutOfBoundsException("Current event not a START_ELEMENT");
        }
        if (i3 < 0) {
            throw new IndexOutOfBoundsException("index must be >= 0");
        }
        if (i3 < this.f648h) {
            v();
            return (b) this.f649i.get(i3);
        }
        throw new IndexOutOfBoundsException("index must be <= attr count (" + this.f648h + ")");
    }

    public int h() {
        if (this.f645e != 3) {
            return -1;
        }
        return this.f648h;
    }

    public int i(int i3) {
        return g(i3).a();
    }

    public int j(int i3) {
        return g(i3).b();
    }

    public String k(int i3) {
        return g(i3).c();
    }

    public int l(int i3) {
        int d3 = g(i3).d();
        if (d3 == 1) {
            return 3;
        }
        if (d3 == 3) {
            return 1;
        }
        switch (d3) {
            case 16:
            case 17:
                return 2;
            case 18:
                return 4;
            default:
                return 0;
        }
    }

    public int m() {
        return this.f644d;
    }

    public int n() {
        return this.f645e;
    }

    public String o() {
        int i3 = this.f645e;
        if (i3 == 3 || i3 == 4) {
            return this.f646f;
        }
        return null;
    }

    public String p() {
        int i3 = this.f645e;
        if (i3 == 3 || i3 == 4) {
            return this.f647g;
        }
        return null;
    }

    public int u() {
        c a3;
        int i3;
        int i4 = 1;
        if (this.f645e == 4) {
            this.f644d--;
        }
        while (this.f641a.hasRemaining() && (a3 = c.a(this.f641a)) != null) {
            int d3 = a3.d();
            if (d3 == i4) {
                i3 = i4;
                if (this.f642b != null) {
                    throw new f("Multiple string pools not supported");
                }
                this.f642b = new e(a3);
            } else if (d3 != 384) {
                if (d3 == 258) {
                    if (this.f642b == null) {
                        throw new f("Named element encountered before string pool");
                    }
                    ByteBuffer b3 = a3.b();
                    if (b3.remaining() < 20) {
                        throw new f("Start element chunk too short. Need at least 20 bytes. Available: " + b3.remaining() + " bytes");
                    }
                    long r3 = r(b3);
                    long r4 = r(b3);
                    int q3 = q(b3);
                    int q4 = q(b3);
                    int q5 = q(b3);
                    long j3 = q3;
                    long j4 = (q5 * q4) + j3;
                    b3.position(0);
                    if (q3 > b3.remaining()) {
                        throw new f("Attributes start offset out of bounds: " + q3 + ", max: " + b3.remaining());
                    }
                    if (j4 > b3.remaining()) {
                        throw new f("Attributes end offset out of bounds: " + j4 + ", max: " + b3.remaining());
                    }
                    this.f646f = this.f642b.c(r4);
                    this.f647g = r3 != 4294967295L ? this.f642b.c(r3) : "";
                    this.f648h = q5;
                    this.f649i = null;
                    this.f651k = q4;
                    this.f650j = x(b3, j3, j4);
                    this.f644d++;
                    this.f645e = 3;
                    return 3;
                }
                if (d3 == 259) {
                    if (this.f642b == null) {
                        throw new f("Named element encountered before string pool");
                    }
                    ByteBuffer b4 = a3.b();
                    if (b4.remaining() < 8) {
                        throw new f("End element chunk too short. Need at least 8 bytes. Available: " + b4.remaining() + " bytes");
                    }
                    long r5 = r(b4);
                    this.f646f = this.f642b.c(r(b4));
                    this.f647g = r5 != 4294967295L ? this.f642b.c(r5) : "";
                    this.f645e = 4;
                    this.f649i = null;
                    this.f650j = null;
                    return 4;
                }
                i3 = i4;
            } else {
                i3 = i4;
                if (this.f643c != null) {
                    throw new f("Multiple resource maps not supported");
                }
                this.f643c = new d(a3);
            }
            i4 = i3;
        }
        this.f645e = 2;
        return 2;
    }

    public final void v() {
        if (this.f649i != null) {
            return;
        }
        this.f649i = new ArrayList(this.f648h);
        for (int i3 = 0; i3 < this.f648h; i3++) {
            int i4 = this.f651k;
            int i5 = i3 * i4;
            ByteBuffer w3 = w(this.f650j, i5, i4 + i5);
            long r3 = r(w3);
            long r4 = r(w3);
            w3.position(w3.position() + 7);
            this.f649i.add(new b(r3, r4, t(w3), (int) r(w3), this.f642b, this.f643c));
        }
    }
}
