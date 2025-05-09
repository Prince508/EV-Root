package J2;

/* loaded from: classes.dex */
public abstract class m extends l {
    public static Long j(String str) {
        C2.k.e(str, "<this>");
        return k(str, 10);
    }

    public static final Long k(String str, int i3) {
        boolean z3;
        C2.k.e(str, "<this>");
        a.a(i3);
        int length = str.length();
        Long l3 = null;
        if (length == 0) {
            return null;
        }
        int i4 = 0;
        char charAt = str.charAt(0);
        long j3 = -9223372036854775807L;
        if (C2.k.f(charAt, 48) < 0) {
            z3 = true;
            if (length == 1) {
                return null;
            }
            if (charAt == '+') {
                z3 = false;
                i4 = 1;
            } else {
                if (charAt != '-') {
                    return null;
                }
                j3 = Long.MIN_VALUE;
                i4 = 1;
            }
        } else {
            z3 = false;
        }
        long j4 = 0;
        long j5 = -256204778801521550L;
        while (i4 < length) {
            int b3 = a.b(str.charAt(i4), i3);
            if (b3 < 0) {
                return l3;
            }
            if (j4 < j5) {
                if (j5 != -256204778801521550L) {
                    return l3;
                }
                j5 = j3 / i3;
                if (j4 < j5) {
                    return l3;
                }
            }
            Long l4 = l3;
            int i5 = i4;
            long j6 = j4 * i3;
            long j7 = b3;
            if (j6 < j3 + j7) {
                return l4;
            }
            j4 = j6 - j7;
            i4 = i5 + 1;
            l3 = l4;
        }
        return z3 ? Long.valueOf(j4) : Long.valueOf(-j4);
    }
}
