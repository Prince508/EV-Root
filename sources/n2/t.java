package N2;

import P2.F;

/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final F f1523a = new F("NONE");

    /* renamed from: b, reason: collision with root package name */
    public static final F f1524b = new F("PENDING");

    public static final n a(Object obj) {
        if (obj == null) {
            obj = O2.m.f1628a;
        }
        return new s(obj);
    }

    public static final d d(r rVar, s2.i iVar, int i3, M2.a aVar) {
        return (((i3 < 0 || i3 >= 2) && i3 != -2) || aVar != M2.a.DROP_OLDEST) ? q.a(rVar, iVar, i3, aVar) : rVar;
    }
}
