package B1;

import O1.A;
import O1.C;
import O1.I;
import java.security.GeneralSecurityException;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final C.b f97a;

    public o(C.b bVar) {
        this.f97a = bVar;
    }

    public static o i() {
        return new o(C.d0());
    }

    public static o j(n nVar) {
        return new o((C.b) nVar.h().T());
    }

    public synchronized o a(l lVar) {
        b(lVar.b(), false);
        return this;
    }

    public synchronized int b(A a3, boolean z3) {
        C.c f3;
        try {
            f3 = f(a3);
            this.f97a.s(f3);
            if (z3) {
                this.f97a.w(f3.a0());
            }
        } catch (Throwable th) {
            throw th;
        }
        return f3.a0();
    }

    public final synchronized C.c c(O1.y yVar, I i3) {
        int g3;
        g3 = g();
        if (i3 == I.UNKNOWN_PREFIX) {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        return (C.c) C.c.e0().s(yVar).t(g3).v(O1.z.ENABLED).u(i3).j();
    }

    public synchronized n d() {
        return n.e((C) this.f97a.j());
    }

    public final synchronized boolean e(int i3) {
        Iterator it = this.f97a.v().iterator();
        while (it.hasNext()) {
            if (((C.c) it.next()).a0() == i3) {
                return true;
            }
        }
        return false;
    }

    public final synchronized C.c f(A a3) {
        return c(x.k(a3), a3.Z());
    }

    public final synchronized int g() {
        int c3;
        c3 = J1.t.c();
        while (e(c3)) {
            c3 = J1.t.c();
        }
        return c3;
    }

    public synchronized o h(int i3) {
        for (int i4 = 0; i4 < this.f97a.u(); i4++) {
            C.c t3 = this.f97a.t(i4);
            if (t3.a0() == i3) {
                if (!t3.c0().equals(O1.z.ENABLED)) {
                    throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + i3);
                }
                this.f97a.w(i3);
            }
        }
        throw new GeneralSecurityException("key not found: " + i3);
        return this;
    }
}
