package o;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f8724a = new int[0];

    /* renamed from: b, reason: collision with root package name */
    public static final long[] f8725b = new long[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Object[] f8726c = new Object[0];

    public static int a(int[] iArr, int i3, int i4) {
        int i5 = i3 - 1;
        int i6 = 0;
        while (i6 <= i5) {
            int i7 = (i6 + i5) >>> 1;
            int i8 = iArr[i7];
            if (i8 < i4) {
                i6 = i7 + 1;
            } else {
                if (i8 <= i4) {
                    return i7;
                }
                i5 = i7 - 1;
            }
        }
        return ~i6;
    }

    public static int b(long[] jArr, int i3, long j3) {
        int i4 = i3 - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            long j4 = jArr[i6];
            if (j4 < j3) {
                i5 = i6 + 1;
            } else {
                if (j4 <= j3) {
                    return i6;
                }
                i4 = i6 - 1;
            }
        }
        return ~i5;
    }

    public static boolean c(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int d(int i3) {
        for (int i4 = 4; i4 < 32; i4++) {
            int i5 = (1 << i4) - 12;
            if (i3 <= i5) {
                return i5;
            }
        }
        return i3;
    }

    public static int e(int i3) {
        return d(i3 * 4) / 4;
    }

    public static int f(int i3) {
        return d(i3 * 8) / 8;
    }
}
