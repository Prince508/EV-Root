package U2;

/* loaded from: classes.dex */
public abstract class c {
    public static long a(long j3) {
        short s3 = (short) (j3 & 65535);
        short s4 = (short) ((j3 >>> 16) & 65535);
        short b3 = (short) (b((short) (s3 + s4), 9) + s3);
        short s5 = (short) (s4 ^ s3);
        return ((b(s5, 10) | (b3 << 16)) << 16) | ((short) (((short) (b(s3, 13) ^ s5)) ^ (s5 << 5)));
    }

    public static short b(short s3, int i3) {
        return (short) ((s3 >>> (32 - i3)) | (s3 << i3));
    }

    public static long c(long j3) {
        long j4 = (j3 ^ (j3 >>> 33)) * 7109453100751455733L;
        return ((j4 ^ (j4 >>> 28)) * (-3808689974395783757L)) >>> 32;
    }
}
