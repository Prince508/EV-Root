package r2;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: r2.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0685C extends AbstractC0684B {
    public static Map d() {
        x xVar = x.f9011e;
        C2.k.c(xVar, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return xVar;
    }

    public static final Map e(Map map) {
        C2.k.e(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? map : AbstractC0684B.c(map) : d();
    }

    public static final void f(Map map, Iterable iterable) {
        C2.k.e(map, "<this>");
        C2.k.e(iterable, "pairs");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            q2.g gVar = (q2.g) it.next();
            map.put(gVar.a(), gVar.b());
        }
    }

    public static Map g(Iterable iterable) {
        C2.k.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return e(h(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return d();
        }
        if (size != 1) {
            return h(iterable, new LinkedHashMap(AbstractC0684B.a(collection.size())));
        }
        return AbstractC0684B.b((q2.g) (iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next()));
    }

    public static final Map h(Iterable iterable, Map map) {
        C2.k.e(iterable, "<this>");
        C2.k.e(map, "destination");
        f(map, iterable);
        return map;
    }

    public static Map i(Map map) {
        C2.k.e(map, "<this>");
        return new LinkedHashMap(map);
    }
}
