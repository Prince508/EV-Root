package K2;

import s2.f;
import t2.AbstractC0733c;

/* renamed from: K2.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0237i {
    public static final p0 a(I i3, s2.i iVar, K k3, B2.p pVar) {
        s2.i d3 = E.d(i3, iVar);
        F0 y0Var = k3.g() ? new y0(d3, pVar) : new F0(d3, true);
        y0Var.S0(k3, y0Var, pVar);
        return y0Var;
    }

    public static /* synthetic */ p0 b(I i3, s2.i iVar, K k3, B2.p pVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            iVar = s2.j.f9292e;
        }
        if ((i4 & 2) != 0) {
            k3 = K.DEFAULT;
        }
        return AbstractC0233g.a(i3, iVar, k3, pVar);
    }

    public static final Object c(s2.i iVar, B2.p pVar, s2.e eVar) {
        Object T02;
        s2.i c3 = eVar.c();
        s2.i e3 = E.e(c3, iVar);
        t0.e(e3);
        if (e3 == c3) {
            P2.B b3 = new P2.B(e3, eVar);
            T02 = Q2.b.b(b3, b3, pVar);
        } else {
            f.b bVar = s2.f.f9290d;
            if (C2.k.a(e3.a(bVar), c3.a(bVar))) {
                L0 l02 = new L0(e3, eVar);
                s2.i c4 = l02.c();
                Object c5 = P2.J.c(c4, null);
                try {
                    Object b4 = Q2.b.b(l02, l02, pVar);
                    P2.J.a(c4, c5);
                    T02 = b4;
                } catch (Throwable th) {
                    P2.J.a(c4, c5);
                    throw th;
                }
            } else {
                S s3 = new S(e3, eVar);
                Q2.a.d(pVar, s3, s3, null, 4, null);
                T02 = s3.T0();
            }
        }
        if (T02 == AbstractC0733c.c()) {
            u2.h.c(eVar);
        }
        return T02;
    }
}
