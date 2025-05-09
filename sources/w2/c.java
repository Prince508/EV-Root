package w2;

/* loaded from: classes.dex */
public abstract class c {
    public static final int a(int i3, int i4, int i5) {
        return c(c(i3, i5) - c(i4, i5), i5);
    }

    public static final int b(int i3, int i4, int i5) {
        if (i5 > 0) {
            if (i3 < i4) {
                return i4 - a(i4, i3, i5);
            }
        } else {
            if (i5 >= 0) {
                throw new IllegalArgumentException("Step is zero.");
            }
            if (i3 > i4) {
                return i4 + a(i3, i4, -i5);
            }
        }
        return i4;
    }

    public static final int c(int i3, int i4) {
        int i5 = i3 % i4;
        return i5 >= 0 ? i5 : i5 + i4;
    }
}
