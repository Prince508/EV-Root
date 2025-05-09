package K2;

import j.AbstractC0515e;

/* loaded from: classes.dex */
public final class K0 extends F {

    /* renamed from: g, reason: collision with root package name */
    public static final K0 f1165g = new K0();

    @Override // K2.F
    public void c(s2.i iVar, Runnable runnable) {
        AbstractC0515e.a(iVar.a(O0.f1172f));
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    @Override // K2.F
    public boolean j(s2.i iVar) {
        return false;
    }

    @Override // K2.F
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
