package K2;

import P2.C0283j;
import java.util.concurrent.CancellationException;
import q2.AbstractC0672a;
import q2.h;

/* loaded from: classes.dex */
public abstract class T extends R2.h {

    /* renamed from: g, reason: collision with root package name */
    public int f1174g;

    public T(int i3) {
        this.f1174g = i3;
    }

    public abstract void b(Object obj, Throwable th);

    public abstract s2.e d();

    public Throwable e(Object obj) {
        C0260z c0260z = obj instanceof C0260z ? (C0260z) obj : null;
        if (c0260z != null) {
            return c0260z.f1245a;
        }
        return null;
    }

    public final void g(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            AbstractC0672a.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        C2.k.b(th);
        H.a(d().c(), new L("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object h();

    @Override // java.lang.Runnable
    public final void run() {
        Object a3;
        Object a4;
        R2.i iVar = this.f1945f;
        try {
            s2.e d3 = d();
            C2.k.c(d3, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            C0283j c0283j = (C0283j) d3;
            s2.e eVar = c0283j.f1767i;
            Object obj = c0283j.f1769k;
            s2.i c3 = eVar.c();
            Object c4 = P2.J.c(c3, obj);
            L0 g3 = c4 != P2.J.f1745a ? E.g(eVar, c3, c4) : null;
            try {
                s2.i c5 = eVar.c();
                Object h3 = h();
                Throwable e3 = e(h3);
                p0 p0Var = (e3 == null && U.b(this.f1174g)) ? (p0) c5.a(p0.f1211b) : null;
                if (p0Var != null && !p0Var.d()) {
                    CancellationException i3 = p0Var.i();
                    b(h3, i3);
                    h.a aVar = q2.h.f8868e;
                    eVar.u(q2.h.a(q2.i.a(i3)));
                } else if (e3 != null) {
                    h.a aVar2 = q2.h.f8868e;
                    eVar.u(q2.h.a(q2.i.a(e3)));
                } else {
                    h.a aVar3 = q2.h.f8868e;
                    eVar.u(q2.h.a(f(h3)));
                }
                q2.n nVar = q2.n.f8874a;
                if (g3 == null || g3.T0()) {
                    P2.J.a(c3, c4);
                }
                try {
                    iVar.b();
                    a4 = q2.h.a(q2.n.f8874a);
                } catch (Throwable th) {
                    h.a aVar4 = q2.h.f8868e;
                    a4 = q2.h.a(q2.i.a(th));
                }
                g(null, q2.h.b(a4));
            } catch (Throwable th2) {
                if (g3 == null || g3.T0()) {
                    P2.J.a(c3, c4);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                h.a aVar5 = q2.h.f8868e;
                iVar.b();
                a3 = q2.h.a(q2.n.f8874a);
            } catch (Throwable th4) {
                h.a aVar6 = q2.h.f8868e;
                a3 = q2.h.a(q2.i.a(th4));
            }
            g(th3, q2.h.b(a3));
        }
    }

    public Object f(Object obj) {
        return obj;
    }
}
