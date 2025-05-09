package r2;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class r extends q {
    public static boolean l(Collection collection, Iterable iterable) {
        C2.k.e(collection, "<this>");
        C2.k.e(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            if (collection.add(it.next())) {
                z3 = true;
            }
        }
        return z3;
    }

    public static final boolean m(Iterable iterable, B2.l lVar, boolean z3) {
        Iterator it = iterable.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            if (((Boolean) lVar.j(it.next())).booleanValue() == z3) {
                it.remove();
                z4 = true;
            }
        }
        return z4;
    }

    public static boolean n(Iterable iterable, B2.l lVar) {
        C2.k.e(iterable, "<this>");
        C2.k.e(lVar, "predicate");
        return m(iterable, lVar, false);
    }
}
