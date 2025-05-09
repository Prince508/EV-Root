package r2;

import java.util.Set;

/* renamed from: r2.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0687E extends AbstractC0686D {
    public static Set b() {
        return y.f9012e;
    }

    public static final Set c(Set set) {
        C2.k.e(set, "<this>");
        int size = set.size();
        return size != 0 ? size != 1 ? set : AbstractC0686D.a(set.iterator().next()) : b();
    }

    public static Set d(Object... objArr) {
        C2.k.e(objArr, "elements");
        return AbstractC0697j.q(objArr);
    }
}
