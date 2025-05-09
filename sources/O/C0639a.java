package o;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: o.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0639a extends g implements Map {

    /* renamed from: l, reason: collision with root package name */
    public f f8711l;

    /* renamed from: o.a$a, reason: collision with other inner class name */
    public class C0147a extends f {
        public C0147a() {
        }

        @Override // o.f
        public void a() {
            C0639a.this.clear();
        }

        @Override // o.f
        public Object b(int i3, int i4) {
            return C0639a.this.f8760f[(i3 << 1) + i4];
        }

        @Override // o.f
        public Map c() {
            return C0639a.this;
        }

        @Override // o.f
        public int d() {
            return C0639a.this.f8761g;
        }

        @Override // o.f
        public int e(Object obj) {
            return C0639a.this.f(obj);
        }

        @Override // o.f
        public int f(Object obj) {
            return C0639a.this.h(obj);
        }

        @Override // o.f
        public void g(Object obj, Object obj2) {
            C0639a.this.put(obj, obj2);
        }

        @Override // o.f
        public void h(int i3) {
            C0639a.this.k(i3);
        }

        @Override // o.f
        public Object i(int i3, Object obj) {
            return C0639a.this.l(i3, obj);
        }
    }

    public C0639a() {
    }

    @Override // java.util.Map
    public Set entrySet() {
        return n().l();
    }

    @Override // java.util.Map
    public Set keySet() {
        return n().m();
    }

    public final f n() {
        if (this.f8711l == null) {
            this.f8711l = new C0147a();
        }
        return this.f8711l;
    }

    public boolean o(Collection collection) {
        return f.p(this, collection);
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        c(this.f8761g + map.size());
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection values() {
        return n().n();
    }

    public C0639a(g gVar) {
        super(gVar);
    }
}
