package J2;

import java.util.Iterator;
import java.util.List;
import r2.AbstractC0697j;

/* loaded from: classes.dex */
public abstract class o extends n {

    public static final class a implements I2.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CharSequence f926a;

        public a(CharSequence charSequence) {
            this.f926a = charSequence;
        }

        @Override // I2.b
        public Iterator iterator() {
            return new c(this.f926a);
        }
    }

    public static /* synthetic */ int A(CharSequence charSequence, char c3, int i3, boolean z3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i3 = q(charSequence);
        }
        if ((i4 & 4) != 0) {
            z3 = false;
        }
        return z(charSequence, c3, i3, z3);
    }

    public static final int B(CharSequence charSequence, char[] cArr, int i3, boolean z3) {
        C2.k.e(charSequence, "<this>");
        C2.k.e(cArr, "chars");
        if (!z3 && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(AbstractC0697j.k(cArr), i3);
        }
        for (int b3 = G2.e.b(i3, q(charSequence)); -1 < b3; b3--) {
            char charAt = charSequence.charAt(b3);
            for (char c3 : cArr) {
                if (b.d(c3, charAt, z3)) {
                    return b3;
                }
            }
        }
        return -1;
    }

    public static final I2.b C(CharSequence charSequence) {
        C2.k.e(charSequence, "<this>");
        return new a(charSequence);
    }

    public static final List D(CharSequence charSequence) {
        C2.k.e(charSequence, "<this>");
        return I2.g.c(C(charSequence));
    }

    public static final boolean E(CharSequence charSequence, int i3, CharSequence charSequence2, int i4, int i5, boolean z3) {
        C2.k.e(charSequence, "<this>");
        C2.k.e(charSequence2, "other");
        if (i4 < 0 || i3 < 0 || i3 > charSequence.length() - i5 || i4 > charSequence2.length() - i5) {
            return false;
        }
        for (int i6 = 0; i6 < i5; i6++) {
            if (!b.d(charSequence.charAt(i3 + i6), charSequence2.charAt(i4 + i6), z3)) {
                return false;
            }
        }
        return true;
    }

    public static final String F(String str, char c3, String str2) {
        C2.k.e(str, "<this>");
        C2.k.e(str2, "missingDelimiterValue");
        int v3 = v(str, c3, 0, false, 6, null);
        if (v3 == -1) {
            return str2;
        }
        String substring = str.substring(v3 + 1, str.length());
        C2.k.d(substring, "substring(...)");
        return substring;
    }

    public static final String G(String str, String str2, String str3) {
        C2.k.e(str, "<this>");
        C2.k.e(str2, "delimiter");
        C2.k.e(str3, "missingDelimiterValue");
        int w3 = w(str, str2, 0, false, 6, null);
        if (w3 == -1) {
            return str3;
        }
        String substring = str.substring(w3 + str2.length(), str.length());
        C2.k.d(substring, "substring(...)");
        return substring;
    }

    public static /* synthetic */ String H(String str, char c3, String str2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            str2 = str;
        }
        return F(str, c3, str2);
    }

    public static /* synthetic */ String I(String str, String str2, String str3, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            str3 = str;
        }
        return G(str, str2, str3);
    }

    public static String J(String str, char c3, String str2) {
        C2.k.e(str, "<this>");
        C2.k.e(str2, "missingDelimiterValue");
        int A3 = A(str, c3, 0, false, 6, null);
        if (A3 == -1) {
            return str2;
        }
        String substring = str.substring(A3 + 1, str.length());
        C2.k.d(substring, "substring(...)");
        return substring;
    }

    public static /* synthetic */ String K(String str, char c3, String str2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            str2 = str;
        }
        return J(str, c3, str2);
    }

    public static final int q(CharSequence charSequence) {
        C2.k.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int r(CharSequence charSequence, char c3, int i3, boolean z3) {
        C2.k.e(charSequence, "<this>");
        return (z3 || !(charSequence instanceof String)) ? x(charSequence, new char[]{c3}, i3, z3) : ((String) charSequence).indexOf(c3, i3);
    }

    public static final int s(CharSequence charSequence, String str, int i3, boolean z3) {
        C2.k.e(charSequence, "<this>");
        C2.k.e(str, "string");
        return (z3 || !(charSequence instanceof String)) ? u(charSequence, str, i3, charSequence.length(), z3, false, 16, null) : ((String) charSequence).indexOf(str, i3);
    }

    public static final int t(CharSequence charSequence, CharSequence charSequence2, int i3, int i4, boolean z3, boolean z4) {
        G2.a cVar = !z4 ? new G2.c(G2.e.a(i3, 0), G2.e.b(i4, charSequence.length())) : G2.e.d(G2.e.b(i3, q(charSequence)), G2.e.a(i4, 0));
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            int i5 = cVar.i();
            int j3 = cVar.j();
            int k3 = cVar.k();
            if ((k3 <= 0 || i5 > j3) && (k3 >= 0 || j3 > i5)) {
                return -1;
            }
            int i6 = i5;
            while (true) {
                String str = (String) charSequence2;
                boolean z5 = z3;
                if (n.l(str, 0, (String) charSequence, i6, str.length(), z5)) {
                    return i6;
                }
                if (i6 == j3) {
                    return -1;
                }
                i6 += k3;
                z3 = z5;
            }
        } else {
            boolean z6 = z3;
            int i7 = cVar.i();
            int j4 = cVar.j();
            int k4 = cVar.k();
            if ((k4 <= 0 || i7 > j4) && (k4 >= 0 || j4 > i7)) {
                return -1;
            }
            int i8 = i7;
            while (true) {
                boolean z7 = z6;
                CharSequence charSequence3 = charSequence;
                CharSequence charSequence4 = charSequence2;
                z6 = z7;
                if (E(charSequence4, 0, charSequence3, i8, charSequence2.length(), z7)) {
                    return i8;
                }
                if (i8 == j4) {
                    return -1;
                }
                i8 += k4;
                charSequence2 = charSequence4;
                charSequence = charSequence3;
            }
        }
    }

    public static /* synthetic */ int u(CharSequence charSequence, CharSequence charSequence2, int i3, int i4, boolean z3, boolean z4, int i5, Object obj) {
        if ((i5 & 16) != 0) {
            z4 = false;
        }
        return t(charSequence, charSequence2, i3, i4, z3, z4);
    }

    public static /* synthetic */ int v(CharSequence charSequence, char c3, int i3, boolean z3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i3 = 0;
        }
        if ((i4 & 4) != 0) {
            z3 = false;
        }
        return r(charSequence, c3, i3, z3);
    }

    public static /* synthetic */ int w(CharSequence charSequence, String str, int i3, boolean z3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i3 = 0;
        }
        if ((i4 & 4) != 0) {
            z3 = false;
        }
        return s(charSequence, str, i3, z3);
    }

    public static final int x(CharSequence charSequence, char[] cArr, int i3, boolean z3) {
        C2.k.e(charSequence, "<this>");
        C2.k.e(cArr, "chars");
        if (!z3 && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(AbstractC0697j.k(cArr), i3);
        }
        int a3 = G2.e.a(i3, 0);
        int q3 = q(charSequence);
        if (a3 > q3) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(a3);
            for (char c3 : cArr) {
                if (b.d(c3, charAt, z3)) {
                    return a3;
                }
            }
            if (a3 == q3) {
                return -1;
            }
            a3++;
        }
    }

    public static boolean y(CharSequence charSequence) {
        C2.k.e(charSequence, "<this>");
        for (int i3 = 0; i3 < charSequence.length(); i3++) {
            if (!J2.a.c(charSequence.charAt(i3))) {
                return false;
            }
        }
        return true;
    }

    public static final int z(CharSequence charSequence, char c3, int i3, boolean z3) {
        C2.k.e(charSequence, "<this>");
        return (z3 || !(charSequence instanceof String)) ? B(charSequence, new char[]{c3}, i3, z3) : ((String) charSequence).lastIndexOf(c3, i3);
    }
}
