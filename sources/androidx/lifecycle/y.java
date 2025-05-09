package androidx.lifecycle;

import androidx.lifecycle.AbstractC0347h;

/* loaded from: classes.dex */
public final class y implements InterfaceC0349j {

    /* renamed from: a, reason: collision with root package name */
    public final A f4037a;

    public y(A a3) {
        C2.k.e(a3, "provider");
        this.f4037a = a3;
    }

    @Override // androidx.lifecycle.InterfaceC0349j
    public void d(l lVar, AbstractC0347h.a aVar) {
        C2.k.e(lVar, "source");
        C2.k.e(aVar, "event");
        if (aVar == AbstractC0347h.a.ON_CREATE) {
            lVar.h().c(this);
            this.f4037a.c();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + aVar).toString());
        }
    }
}
