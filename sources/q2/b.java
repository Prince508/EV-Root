package Q2;

import B2.p;
import C2.w;
import K2.C0260z;
import K2.x0;
import P2.B;
import P2.J;
import q2.h;
import s2.e;
import s2.i;
import t2.AbstractC0733c;
import u2.h;

/* loaded from: classes.dex */
public abstract class b {
    public static final void a(p pVar, Object obj, e eVar) {
        e a3 = h.a(eVar);
        try {
            i c3 = eVar.c();
            Object c4 = J.c(c3, null);
            try {
                Object h3 = ((p) w.a(pVar, 2)).h(obj, a3);
                if (h3 != AbstractC0733c.c()) {
                    a3.u(q2.h.a(h3));
                }
            } finally {
                J.a(c3, c4);
            }
        } catch (Throwable th) {
            h.a aVar = q2.h.f8868e;
            a3.u(q2.h.a(q2.i.a(th)));
        }
    }

    public static final Object b(B b3, Object obj, p pVar) {
        Object c0260z;
        try {
            c0260z = ((p) w.a(pVar, 2)).h(obj, b3);
        } catch (Throwable th) {
            c0260z = new C0260z(th, false, 2, null);
        }
        if (c0260z == AbstractC0733c.c()) {
            return AbstractC0733c.c();
        }
        Object s02 = b3.s0(c0260z);
        if (s02 == x0.f1232b) {
            return AbstractC0733c.c();
        }
        if (s02 instanceof C0260z) {
            throw ((C0260z) s02).f1245a;
        }
        return x0.h(s02);
    }
}
