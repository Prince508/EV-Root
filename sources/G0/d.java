package G0;

import R0.j;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public abstract class d {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final long f575a;

        /* renamed from: b, reason: collision with root package name */
        public final U0.c f576b;

        public a(long j3, U0.c cVar) {
            this.f575a = j3;
            this.f576b = cVar;
        }

        public U0.c a() {
            return this.f576b;
        }

        public long b() {
            return this.f575a;
        }
    }

    public static byte[] a(byte[] bArr) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (NoSuchAlgorithmException e3) {
            throw new IllegalStateException("SHA-256 is not found", e3);
        }
    }

    public static a b(U0.c cVar, V0.b bVar) {
        long a3 = bVar.a();
        long c3 = bVar.c() + a3;
        long e3 = bVar.e();
        if (c3 != e3) {
            throw new b("ZIP Central Directory is not immediately followed by End of Central Directory. CD end: " + c3 + ", EoCD start: " + e3);
        }
        if (a3 < 32) {
            throw new b("APK too small for APK Signing Block. ZIP Central Directory offset: " + a3);
        }
        ByteBuffer c4 = cVar.c(a3 - 24, 24);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        c4.order(byteOrder);
        if (c4.getLong(8) != 2334950737559900225L || c4.getLong(16) != 3617552046287187010L) {
            throw new b("No APK Signing Block before ZIP Central Directory");
        }
        long j3 = c4.getLong(0);
        if (j3 < c4.capacity() || j3 > 2147483639) {
            throw new b("APK Signing Block size out of range: " + j3);
        }
        long j4 = (int) (8 + j3);
        long j5 = a3 - j4;
        if (j5 < 0) {
            throw new b("APK Signing Block offset out of range: " + j5);
        }
        ByteBuffer c5 = cVar.c(j5, 8);
        c5.order(byteOrder);
        long j6 = c5.getLong(0);
        if (j6 == j3) {
            return new a(j5, cVar.b(j5, j4));
        }
        throw new b("APK Signing Block sizes in header and footer do not match: " + j6 + " vs " + j3);
    }

    public static V0.b c(U0.c cVar) {
        j c3 = T0.c.c(cVar);
        if (c3 == null) {
            throw new V0.a("ZIP End of Central Directory record not found");
        }
        ByteBuffer byteBuffer = (ByteBuffer) c3.a();
        long longValue = ((Long) c3.b()).longValue();
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        long i3 = T0.c.i(byteBuffer);
        if (i3 > longValue) {
            throw new V0.a("ZIP Central Directory start offset out of range: " + i3 + ". ZIP End of Central Directory offset: " + longValue);
        }
        long j3 = T0.c.j(byteBuffer);
        long j4 = i3 + j3;
        if (j4 <= longValue) {
            return new V0.b(i3, j3, T0.c.k(byteBuffer), longValue, byteBuffer);
        }
        throw new V0.a("ZIP Central Directory overlaps with End of Central Directory. CD end: " + j4 + ", EoCD start: " + longValue);
    }
}
