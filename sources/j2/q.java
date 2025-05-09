package J2;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class q extends p {
    public static final String L(String str, int i3) {
        C2.k.e(str, "<this>");
        if (i3 >= 0) {
            String substring = str.substring(G2.e.b(i3, str.length()));
            C2.k.d(substring, "substring(...)");
            return substring;
        }
        throw new IllegalArgumentException(("Requested character count " + i3 + " is less than zero.").toString());
    }

    public static char M(CharSequence charSequence) {
        C2.k.e(charSequence, "<this>");
        if (charSequence.length() != 0) {
            return charSequence.charAt(o.q(charSequence));
        }
        throw new NoSuchElementException("Char sequence is empty.");
    }
}
