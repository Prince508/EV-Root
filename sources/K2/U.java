package K2;

import P2.C0283j;
import q2.h;

/* loaded from: classes.dex */
public abstract class U {
    public static final void a(T t3, int i3) {
        s2.e d3 = t3.d();
        boolean z3 = i3 == 4;
        if (z3 || !(d3 instanceof C0283j) || b(i3) != b(t3.f1174g)) {
            d(t3, d3, z3);
            return;
        }
        F f3 = ((C0283j) d3).f1766h;
        s2.i c3 = d3.c();
        if (f3.j(c3)) {
            f3.c(c3, t3);
        } else {
            e(t3);
        }
    }

    public static final boolean b(int i3) {
        return i3 == 1 || i3 == 2;
    }

    public static final boolean c(int i3) {
        return i3 == 2;
    }

    public static final void d(T t3, s2.e eVar, boolean z3) {
        Object f3;
        Object h3 = t3.h();
        Throwable e3 = t3.e(h3);
        if (e3 != null) {
            h.a aVar = q2.h.f8868e;
            f3 = q2.i.a(e3);
        } else {
            h.a aVar2 = q2.h.f8868e;
            f3 = t3.f(h3);
        }
        Object a3 = q2.h.a(f3);
        if (!z3) {
            eVar.u(a3);
            return;
        }
        C2.k.c(eVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        C0283j c0283j = (C0283j) eVar;
        s2.e eVar2 = c0283j.f1767i;
        Object obj = c0283j.f1769k;
        s2.i c3 = eVar2.c();
        Object c4 = P2.J.c(c3, obj);
        L0 g3 = c4 != P2.J.f1745a ? E.g(eVar2, c3, c4) : null;
        try {
            c0283j.f1767i.u(a3);
            q2.n nVar = q2.n.f8874a;
            if (g3 == null || g3.T0()) {
                P2.J.a(c3, c4);
            }
        } catch (Throwable th) {
            if (g3 == null || g3.T0()) {
                P2.J.a(c3, c4);
            }
            throw th;
        }
    }

    public static final void e(T t3) {
        Z b3 = J0.f1157a.b();
        if (b3.x()) {
            b3.t(t3);
            return;
        }
        b3.v(true);
        try {
            d(t3, t3.d(), true);
            do {
            } while (b3.G());
        } finally {
            try {
            } finally {
            }
        }
    }
}
