package J2;

/* loaded from: classes.dex */
public abstract class d {
    public static void a(Appendable appendable, Object obj, B2.l lVar) {
        C2.k.e(appendable, "<this>");
        if (lVar != null) {
            appendable.append((CharSequence) lVar.j(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            appendable.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            appendable.append(((Character) obj).charValue());
        } else {
            appendable.append(obj.toString());
        }
    }
}
