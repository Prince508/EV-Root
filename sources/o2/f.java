package O2;

import C2.w;
import P2.J;
import t2.AbstractC0733c;

/* loaded from: classes.dex */
public abstract class f {
    public static final Object b(s2.i iVar, Object obj, Object obj2, B2.p pVar, s2.e eVar) {
        Object c3 = J.c(iVar, obj2);
        try {
            Object h3 = ((B2.p) w.a(pVar, 2)).h(obj, new r(eVar, iVar));
            J.a(iVar, c3);
            if (h3 == AbstractC0733c.c()) {
                u2.h.c(eVar);
            }
            return h3;
        } catch (Throwable th) {
            J.a(iVar, c3);
            throw th;
        }
    }

    public static /* synthetic */ Object c(s2.i iVar, Object obj, Object obj2, B2.p pVar, s2.e eVar, int i3, Object obj3) {
        if ((i3 & 4) != 0) {
            obj2 = J.b(iVar);
        }
        return b(iVar, obj, obj2, pVar, eVar);
    }

    public static final N2.e d(N2.e eVar, s2.i iVar) {
        return eVar instanceof q ? eVar : new s(eVar, iVar);
    }
}
