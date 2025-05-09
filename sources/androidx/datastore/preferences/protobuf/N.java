package androidx.datastore.preferences.protobuf;

import j.AbstractC0515e;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class N implements Y {

    /* renamed from: a, reason: collision with root package name */
    public final J f3576a;

    /* renamed from: b, reason: collision with root package name */
    public final f0 f3577b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3578c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0328n f3579d;

    public N(f0 f0Var, AbstractC0328n abstractC0328n, J j3) {
        this.f3577b = f0Var;
        this.f3578c = abstractC0328n.e(j3);
        this.f3579d = abstractC0328n;
        this.f3576a = j3;
    }

    private int j(f0 f0Var, Object obj) {
        return f0Var.i(f0Var.g(obj));
    }

    private void k(f0 f0Var, AbstractC0328n abstractC0328n, Object obj, X x3, C0327m c0327m) {
        f0 f0Var2;
        AbstractC0328n abstractC0328n2;
        X x4;
        C0327m c0327m2;
        Object f3 = f0Var.f(obj);
        C0331q d3 = abstractC0328n.d(obj);
        while (x3.G() != Integer.MAX_VALUE) {
            try {
                f0Var2 = f0Var;
                abstractC0328n2 = abstractC0328n;
                x4 = x3;
                c0327m2 = c0327m;
            } catch (Throwable th) {
                th = th;
                f0Var2 = f0Var;
            }
            try {
                if (!m(x4, c0327m2, abstractC0328n2, d3, f0Var2, f3)) {
                    f0Var2.o(obj, f3);
                    return;
                }
                x3 = x4;
                c0327m = c0327m2;
                abstractC0328n = abstractC0328n2;
                f0Var = f0Var2;
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                f0Var2.o(obj, f3);
                throw th3;
            }
        }
        f0Var.o(obj, f3);
    }

    public static N l(f0 f0Var, AbstractC0328n abstractC0328n, J j3) {
        return new N(f0Var, abstractC0328n, j3);
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public void a(Object obj, Object obj2) {
        a0.F(this.f3577b, obj, obj2);
        if (this.f3578c) {
            a0.D(this.f3579d, obj, obj2);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public final boolean b(Object obj) {
        return this.f3579d.c(obj).k();
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public boolean c(Object obj, Object obj2) {
        if (!this.f3577b.g(obj).equals(this.f3577b.g(obj2))) {
            return false;
        }
        if (this.f3578c) {
            return this.f3579d.c(obj).equals(this.f3579d.c(obj2));
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public int d(Object obj) {
        int j3 = j(this.f3577b, obj);
        return this.f3578c ? j3 + this.f3579d.c(obj).f() : j3;
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public Object e() {
        return this.f3576a.b().d();
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public void f(Object obj) {
        this.f3577b.j(obj);
        this.f3579d.f(obj);
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public int g(Object obj) {
        int hashCode = this.f3577b.g(obj).hashCode();
        return this.f3578c ? (hashCode * 53) + this.f3579d.c(obj).hashCode() : hashCode;
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public void h(Object obj, X x3, C0327m c0327m) {
        k(this.f3577b, this.f3579d, obj, x3, c0327m);
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public void i(Object obj, m0 m0Var) {
        Iterator n3 = this.f3579d.c(obj).n();
        if (n3.hasNext()) {
            AbstractC0515e.a(((Map.Entry) n3.next()).getKey());
            throw null;
        }
        n(this.f3577b, obj, m0Var);
    }

    public final boolean m(X x3, C0327m c0327m, AbstractC0328n abstractC0328n, C0331q c0331q, f0 f0Var, Object obj) {
        int i3 = x3.i();
        if (i3 != l0.f3713a) {
            if (l0.b(i3) != 2) {
                return x3.n();
            }
            Object b3 = abstractC0328n.b(c0327m, this.f3576a, l0.a(i3));
            if (b3 == null) {
                return f0Var.m(obj, x3);
            }
            abstractC0328n.h(x3, b3, c0327m, c0331q);
            return true;
        }
        Object obj2 = null;
        int i4 = 0;
        AbstractC0320f abstractC0320f = null;
        while (x3.G() != Integer.MAX_VALUE) {
            int i5 = x3.i();
            if (i5 == l0.f3715c) {
                i4 = x3.g();
                obj2 = abstractC0328n.b(c0327m, this.f3576a, i4);
            } else if (i5 == l0.f3716d) {
                if (obj2 != null) {
                    abstractC0328n.h(x3, obj2, c0327m, c0331q);
                } else {
                    abstractC0320f = x3.c();
                }
            } else if (!x3.n()) {
                break;
            }
        }
        if (x3.i() != l0.f3714b) {
            throw C0335v.a();
        }
        if (abstractC0320f != null) {
            if (obj2 != null) {
                abstractC0328n.i(abstractC0320f, obj2, c0327m, c0331q);
            } else {
                f0Var.d(obj, i4, abstractC0320f);
            }
        }
        return true;
    }

    public final void n(f0 f0Var, Object obj, m0 m0Var) {
        f0Var.s(f0Var.g(obj), m0Var);
    }
}
