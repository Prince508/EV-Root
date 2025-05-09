package r2;

import java.util.Collections;
import java.util.Map;

/* renamed from: r2.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0684B extends AbstractC0683A {
    public static int a(int i3) {
        if (i3 < 0) {
            return i3;
        }
        if (i3 < 3) {
            return i3 + 1;
        }
        if (i3 < 1073741824) {
            return (int) ((i3 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static final Map b(q2.g gVar) {
        C2.k.e(gVar, "pair");
        Map singletonMap = Collections.singletonMap(gVar.c(), gVar.d());
        C2.k.d(singletonMap, "singletonMap(...)");
        return singletonMap;
    }

    public static final Map c(Map map) {
        C2.k.e(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        C2.k.d(singletonMap, "with(...)");
        return singletonMap;
    }
}
