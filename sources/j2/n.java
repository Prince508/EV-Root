package J2;

/* loaded from: classes.dex */
public abstract class n extends m {
    public static final boolean l(String str, int i3, String str2, int i4, int i5, boolean z3) {
        C2.k.e(str, "<this>");
        C2.k.e(str2, "other");
        return !z3 ? str.regionMatches(i3, str2, i4, i5) : str.regionMatches(z3, i3, str2, i4, i5);
    }

    public static final String m(String str, String str2, String str3, boolean z3) {
        C2.k.e(str, "<this>");
        C2.k.e(str2, "oldValue");
        C2.k.e(str3, "newValue");
        int i3 = 0;
        int s3 = o.s(str, str2, 0, z3);
        if (s3 < 0) {
            return str;
        }
        int length = str2.length();
        int a3 = G2.e.a(length, 1);
        int length2 = (str.length() - length) + str3.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        do {
            sb.append((CharSequence) str, i3, s3);
            sb.append(str3);
            i3 = s3 + length;
            if (s3 >= str.length()) {
                break;
            }
            s3 = o.s(str, str2, s3 + a3, z3);
        } while (s3 > 0);
        sb.append((CharSequence) str, i3, str.length());
        String sb2 = sb.toString();
        C2.k.d(sb2, "toString(...)");
        return sb2;
    }

    public static /* synthetic */ String n(String str, String str2, String str3, boolean z3, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            z3 = false;
        }
        return m(str, str2, str3, z3);
    }

    public static final boolean o(String str, String str2, boolean z3) {
        C2.k.e(str, "<this>");
        C2.k.e(str2, "prefix");
        return !z3 ? str.startsWith(str2) : l(str, 0, str2, 0, str2.length(), z3);
    }

    public static /* synthetic */ boolean p(String str, String str2, boolean z3, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z3 = false;
        }
        return o(str, str2, z3);
    }
}
