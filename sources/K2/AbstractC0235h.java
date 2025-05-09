package K2;

/* renamed from: K2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0235h {
    public static final Object a(s2.i iVar, B2.p pVar) {
        Z a3;
        s2.i d3;
        Thread currentThread = Thread.currentThread();
        s2.f fVar = (s2.f) iVar.a(s2.f.f9290d);
        if (fVar == null) {
            a3 = J0.f1157a.b();
            d3 = E.d(C0238i0.f1197e, iVar.r(a3));
        } else {
            Z z3 = fVar instanceof Z ? (Z) fVar : null;
            if (z3 != null) {
                Z z4 = z3.I() ? z3 : null;
                if (z4 != null) {
                    a3 = z4;
                    d3 = E.d(C0238i0.f1197e, iVar);
                }
            }
            a3 = J0.f1157a.a();
            d3 = E.d(C0238i0.f1197e, iVar);
        }
        C0229e c0229e = new C0229e(d3, currentThread, a3);
        c0229e.S0(K.DEFAULT, c0229e, pVar);
        return c0229e.T0();
    }

    public static /* synthetic */ Object b(s2.i iVar, B2.p pVar, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            iVar = s2.j.f9292e;
        }
        return AbstractC0233g.c(iVar, pVar);
    }
}
