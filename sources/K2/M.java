package K2;

import P2.C0283j;
import q2.h;

/* loaded from: classes.dex */
public abstract class M {
    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(s2.e eVar) {
        Object a3;
        if (eVar instanceof C0283j) {
            return eVar.toString();
        }
        try {
            h.a aVar = q2.h.f8868e;
            a3 = q2.h.a(eVar + '@' + b(eVar));
        } catch (Throwable th) {
            h.a aVar2 = q2.h.f8868e;
            a3 = q2.h.a(q2.i.a(th));
        }
        if (q2.h.b(a3) != null) {
            a3 = eVar.getClass().getName() + '@' + b(eVar);
        }
        return (String) a3;
    }
}
