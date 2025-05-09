package K2;

import q2.h;

/* loaded from: classes.dex */
public abstract class D {
    public static final Object a(Object obj, s2.e eVar) {
        if (!(obj instanceof C0260z)) {
            return q2.h.a(obj);
        }
        h.a aVar = q2.h.f8868e;
        return q2.h.a(q2.i.a(((C0260z) obj).f1245a));
    }

    public static final Object b(Object obj, B2.l lVar) {
        Throwable b3 = q2.h.b(obj);
        return b3 == null ? lVar != null ? new A(obj, lVar) : obj : new C0260z(b3, false, 2, null);
    }

    public static final Object c(Object obj, InterfaceC0243l interfaceC0243l) {
        Throwable b3 = q2.h.b(obj);
        return b3 == null ? obj : new C0260z(b3, false, 2, null);
    }

    public static /* synthetic */ Object d(Object obj, B2.l lVar, int i3, Object obj2) {
        if ((i3 & 1) != 0) {
            lVar = null;
        }
        return b(obj, lVar);
    }
}
