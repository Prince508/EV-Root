package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public abstract class f0 {
    public abstract void a(Object obj, int i3, int i4);

    public abstract void b(Object obj, int i3, long j3);

    public abstract void c(Object obj, int i3, Object obj2);

    public abstract void d(Object obj, int i3, AbstractC0320f abstractC0320f);

    public abstract void e(Object obj, int i3, long j3);

    public abstract Object f(Object obj);

    public abstract Object g(Object obj);

    public abstract int h(Object obj);

    public abstract int i(Object obj);

    public abstract void j(Object obj);

    public abstract Object k(Object obj, Object obj2);

    public final void l(Object obj, X x3) {
        while (x3.G() != Integer.MAX_VALUE && m(obj, x3)) {
        }
    }

    public final boolean m(Object obj, X x3) {
        int i3 = x3.i();
        int a3 = l0.a(i3);
        int b3 = l0.b(i3);
        if (b3 == 0) {
            e(obj, a3, x3.z());
            return true;
        }
        if (b3 == 1) {
            b(obj, a3, x3.l());
            return true;
        }
        if (b3 == 2) {
            d(obj, a3, x3.c());
            return true;
        }
        if (b3 != 3) {
            if (b3 == 4) {
                return false;
            }
            if (b3 != 5) {
                throw C0335v.d();
            }
            a(obj, a3, x3.B());
            return true;
        }
        Object n3 = n();
        int c3 = l0.c(a3, 4);
        l(n3, x3);
        if (c3 != x3.i()) {
            throw C0335v.a();
        }
        c(obj, a3, r(n3));
        return true;
    }

    public abstract Object n();

    public abstract void o(Object obj, Object obj2);

    public abstract void p(Object obj, Object obj2);

    public abstract boolean q(X x3);

    public abstract Object r(Object obj);

    public abstract void s(Object obj, m0 m0Var);

    public abstract void t(Object obj, m0 m0Var);
}
