package U2;

/* loaded from: classes.dex */
public abstract class b {
    public static long a(int i3, String[] strArr, long j3) {
        return (strArr[i3 / 8191].charAt(i3 % 8191) << 32) ^ c.a(j3);
    }

    public static String b(long j3, String[] strArr) {
        long a3 = c.a(c.c(4294967295L & j3));
        long j4 = (a3 >>> 32) & 65535;
        long a4 = c.a(a3);
        int i3 = (int) (((j3 >>> 32) ^ j4) ^ ((a4 >>> 16) & (-65536)));
        long a5 = a(i3, strArr, a4);
        int i4 = (int) ((a5 >>> 32) & 65535);
        char[] cArr = new char[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            a5 = a(i3 + i5 + 1, strArr, a5);
            cArr[i5] = (char) ((a5 >>> 32) & 65535);
        }
        return new String(cArr);
    }
}
