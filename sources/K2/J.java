package K2;

import P2.C0279f;
import t2.AbstractC0733c;

/* loaded from: classes.dex */
public abstract class J {
    public static final I a(s2.i iVar) {
        InterfaceC0258x b3;
        if (iVar.a(p0.f1211b) == null) {
            b3 = u0.b(null, 1, null);
            iVar = iVar.r(b3);
        }
        return new C0279f(iVar);
    }

    public static final Object b(B2.p pVar, s2.e eVar) {
        P2.B b3 = new P2.B(eVar.c(), eVar);
        Object b4 = Q2.b.b(b3, b3, pVar);
        if (b4 == AbstractC0733c.c()) {
            u2.h.c(eVar);
        }
        return b4;
    }

    public static final void c(I i3) {
        t0.e(i3.t());
    }
}
