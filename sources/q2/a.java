package Q2;

import B2.l;
import B2.p;
import P2.AbstractC0284k;
import q2.h;
import q2.i;
import q2.n;
import s2.e;
import t2.AbstractC0732b;

/* loaded from: classes.dex */
public abstract class a {
    public static final void a(e eVar, Throwable th) {
        h.a aVar = h.f8868e;
        eVar.u(h.a(i.a(th)));
        throw th;
    }

    public static final void b(p pVar, Object obj, e eVar, l lVar) {
        try {
            e b3 = AbstractC0732b.b(AbstractC0732b.a(pVar, obj, eVar));
            h.a aVar = h.f8868e;
            AbstractC0284k.b(b3, h.a(n.f8874a), lVar);
        } catch (Throwable th) {
            a(eVar, th);
        }
    }

    public static final void c(e eVar, e eVar2) {
        try {
            e b3 = AbstractC0732b.b(eVar);
            h.a aVar = h.f8868e;
            AbstractC0284k.c(b3, h.a(n.f8874a), null, 2, null);
        } catch (Throwable th) {
            a(eVar2, th);
        }
    }

    public static /* synthetic */ void d(p pVar, Object obj, e eVar, l lVar, int i3, Object obj2) {
        if ((i3 & 4) != 0) {
            lVar = null;
        }
        b(pVar, obj, eVar, lVar);
    }
}
