package Y;

import C2.k;
import C2.l;
import Y.d;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import r2.u;

/* loaded from: classes.dex */
public final class a extends d {

    /* renamed from: a, reason: collision with root package name */
    public final Map f2377a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f2378b;

    /* renamed from: Y.a$a, reason: collision with other inner class name */
    public static final class C0069a extends l implements B2.l {

        /* renamed from: f, reason: collision with root package name */
        public static final C0069a f2379f = new C0069a();

        public C0069a() {
            super(1);
        }

        @Override // B2.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence j(Map.Entry entry) {
            k.e(entry, "entry");
            return "  " + ((d.a) entry.getKey()).a() + " = " + entry.getValue();
        }
    }

    public /* synthetic */ a(Map map, boolean z3, int i3, C2.g gVar) {
        this((i3 & 1) != 0 ? new LinkedHashMap() : map, (i3 & 2) != 0 ? true : z3);
    }

    @Override // Y.d
    public Map a() {
        Map unmodifiableMap = Collections.unmodifiableMap(this.f2377a);
        k.d(unmodifiableMap, "unmodifiableMap(preferencesMap)");
        return unmodifiableMap;
    }

    @Override // Y.d
    public Object b(d.a aVar) {
        k.e(aVar, "key");
        return this.f2377a.get(aVar);
    }

    public final void e() {
        if (this.f2378b.get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return k.a(this.f2377a, ((a) obj).f2377a);
        }
        return false;
    }

    public final void f() {
        e();
        this.f2377a.clear();
    }

    public final void g() {
        this.f2378b.set(true);
    }

    public final void h(d.b... bVarArr) {
        k.e(bVarArr, "pairs");
        e();
        if (bVarArr.length <= 0) {
            return;
        }
        d.b bVar = bVarArr[0];
        throw null;
    }

    public int hashCode() {
        return this.f2377a.hashCode();
    }

    public final Object i(d.a aVar) {
        k.e(aVar, "key");
        e();
        return this.f2377a.remove(aVar);
    }

    public final void j(d.a aVar, Object obj) {
        k.e(aVar, "key");
        k(aVar, obj);
    }

    public final void k(d.a aVar, Object obj) {
        k.e(aVar, "key");
        e();
        if (obj == null) {
            i(aVar);
            return;
        }
        if (!(obj instanceof Set)) {
            this.f2377a.put(aVar, obj);
            return;
        }
        Map map = this.f2377a;
        Set unmodifiableSet = Collections.unmodifiableSet(u.A((Iterable) obj));
        k.d(unmodifiableSet, "unmodifiableSet(value.toSet())");
        map.put(aVar, unmodifiableSet);
    }

    public String toString() {
        return u.t(this.f2377a.entrySet(), ",\n", "{\n", "\n}", 0, null, C0069a.f2379f, 24, null);
    }

    public a(Map map, boolean z3) {
        k.e(map, "preferencesMap");
        this.f2377a = map;
        this.f2378b = new AtomicBoolean(z3);
    }
}
