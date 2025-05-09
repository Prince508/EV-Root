package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class D extends LinkedHashMap {

    /* renamed from: f, reason: collision with root package name */
    public static final D f3553f;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3554e;

    static {
        D d3 = new D();
        f3553f = d3;
        d3.k();
    }

    public D() {
        this.f3554e = true;
    }

    public static int a(Map map) {
        int i3 = 0;
        for (Map.Entry entry : map.entrySet()) {
            i3 += b(entry.getValue()) ^ b(entry.getKey());
        }
        return i3;
    }

    public static int b(Object obj) {
        return obj instanceof byte[] ? AbstractC0334u.d((byte[]) obj) : obj.hashCode();
    }

    public static void c(Map map) {
        for (Object obj : map.keySet()) {
            AbstractC0334u.a(obj);
            AbstractC0334u.a(map.get(obj));
        }
    }

    public static D e() {
        return f3553f;
    }

    public static boolean h(Object obj, Object obj2) {
        return ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) obj, (byte[]) obj2) : obj.equals(obj2);
    }

    public static boolean i(Map map, Map map2) {
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !h(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        f();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && i(this, (Map) obj);
    }

    public final void f() {
        if (!j()) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return a(this);
    }

    public boolean j() {
        return this.f3554e;
    }

    public void k() {
        this.f3554e = false;
    }

    public void l(D d3) {
        f();
        if (d3.isEmpty()) {
            return;
        }
        putAll(d3);
    }

    public D m() {
        return isEmpty() ? new D() : new D(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        f();
        AbstractC0334u.a(obj);
        AbstractC0334u.a(obj2);
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map map) {
        f();
        c(map);
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        f();
        return super.remove(obj);
    }

    public D(Map map) {
        super(map);
        this.f3554e = true;
    }
}
