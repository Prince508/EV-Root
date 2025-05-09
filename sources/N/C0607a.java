package n;

import java.util.HashMap;
import java.util.Map;
import n.b;

/* renamed from: n.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0607a extends b {

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f8538i = new HashMap();

    public boolean contains(Object obj) {
        return this.f8538i.containsKey(obj);
    }

    @Override // n.b
    public b.c k(Object obj) {
        return (b.c) this.f8538i.get(obj);
    }

    @Override // n.b
    public Object o(Object obj, Object obj2) {
        b.c k3 = k(obj);
        if (k3 != null) {
            return k3.f8544f;
        }
        this.f8538i.put(obj, n(obj, obj2));
        return null;
    }

    @Override // n.b
    public Object p(Object obj) {
        Object p3 = super.p(obj);
        this.f8538i.remove(obj);
        return p3;
    }

    public Map.Entry q(Object obj) {
        if (contains(obj)) {
            return ((b.c) this.f8538i.get(obj)).f8546h;
        }
        return null;
    }
}
