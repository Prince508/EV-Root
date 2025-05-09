package K2;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public abstract /* synthetic */ class u0 {
    public static final InterfaceC0258x a(p0 p0Var) {
        return new s0(p0Var);
    }

    public static /* synthetic */ InterfaceC0258x b(p0 p0Var, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            p0Var = null;
        }
        return t0.a(p0Var);
    }

    public static final void c(s2.i iVar, CancellationException cancellationException) {
        p0 p0Var = (p0) iVar.a(p0.f1211b);
        if (p0Var != null) {
            p0Var.b(cancellationException);
        }
    }

    public static final void d(p0 p0Var) {
        if (!p0Var.d()) {
            throw p0Var.i();
        }
    }

    public static final void e(s2.i iVar) {
        p0 p0Var = (p0) iVar.a(p0.f1211b);
        if (p0Var != null) {
            t0.d(p0Var);
        }
    }
}
