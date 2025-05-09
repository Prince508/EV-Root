package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes.dex */
public abstract class k0 {
    public abstract void a(Object obj, int i3, int i4);

    public abstract void b(Object obj, int i3, long j3);

    public abstract void c(Object obj, int i3, Object obj2);

    public abstract void d(Object obj, int i3, AbstractC0417h abstractC0417h);

    public abstract void e(Object obj, int i3, long j3);

    public abstract Object f(Object obj);

    public abstract Object g(Object obj);

    public abstract int h(Object obj);

    public abstract int i(Object obj);

    public abstract void j(Object obj);

    public abstract Object k(Object obj, Object obj2);

    public final void l(Object obj, d0 d0Var) {
        while (d0Var.G() != Integer.MAX_VALUE && m(obj, d0Var)) {
        }
    }

    public final boolean m(Object obj, d0 d0Var) {
        int i3 = d0Var.i();
        int a3 = q0.a(i3);
        int b3 = q0.b(i3);
        if (b3 == 0) {
            e(obj, a3, d0Var.z());
            return true;
        }
        if (b3 == 1) {
            b(obj, a3, d0Var.l());
            return true;
        }
        if (b3 == 2) {
            d(obj, a3, d0Var.c());
            return true;
        }
        if (b3 != 3) {
            if (b3 == 4) {
                return false;
            }
            if (b3 != 5) {
                throw A.e();
            }
            a(obj, a3, d0Var.B());
            return true;
        }
        Object n3 = n();
        int c3 = q0.c(a3, 4);
        l(n3, d0Var);
        if (c3 != d0Var.i()) {
            throw A.b();
        }
        c(obj, a3, r(n3));
        return true;
    }

    public abstract Object n();

    public abstract void o(Object obj, Object obj2);

    public abstract void p(Object obj, Object obj2);

    public abstract boolean q(d0 d0Var);

    public abstract Object r(Object obj);

    public abstract void s(Object obj, r0 r0Var);

    public abstract void t(Object obj, r0 r0Var);
}
