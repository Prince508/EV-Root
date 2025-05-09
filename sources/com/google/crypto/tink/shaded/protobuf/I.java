package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC0434z;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class I extends LinkedHashMap {

    /* renamed from: f, reason: collision with root package name */
    public static final I f5737f;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5738e;

    static {
        I i3 = new I();
        f5737f = i3;
        i3.k();
    }

    public I() {
        this.f5738e = true;
    }

    public static int a(Map map) {
        int i3 = 0;
        for (Map.Entry entry : map.entrySet()) {
            i3 += b(entry.getValue()) ^ b(entry.getKey());
        }
        return i3;
    }

    public static int b(Object obj) {
        if (obj instanceof byte[]) {
            return AbstractC0434z.d((byte[]) obj);
        }
        if (obj instanceof AbstractC0434z.a) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    public static void c(Map map) {
        for (Object obj : map.keySet()) {
            AbstractC0434z.a(obj);
            AbstractC0434z.a(map.get(obj));
        }
    }

    public static I e() {
        return f5737f;
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
        return this.f5738e;
    }

    public void k() {
        this.f5738e = false;
    }

    public void l(I i3) {
        f();
        if (i3.isEmpty()) {
            return;
        }
        putAll(i3);
    }

    public I m() {
        return isEmpty() ? new I() : new I(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        f();
        AbstractC0434z.a(obj);
        AbstractC0434z.a(obj2);
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

    public I(Map map) {
        super(map);
        this.f5738e = true;
    }
}
