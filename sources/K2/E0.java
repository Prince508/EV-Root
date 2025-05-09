package K2;

import q2.h;

/* loaded from: classes.dex */
public final class E0 extends v0 {

    /* renamed from: i, reason: collision with root package name */
    public final C0245m f1152i;

    public E0(C0245m c0245m) {
        this.f1152i = c0245m;
    }

    @Override // B2.l
    public /* bridge */ /* synthetic */ Object j(Object obj) {
        y((Throwable) obj);
        return q2.n.f8874a;
    }

    @Override // K2.B
    public void y(Throwable th) {
        Object j02 = z().j0();
        if (j02 instanceof C0260z) {
            C0245m c0245m = this.f1152i;
            h.a aVar = q2.h.f8868e;
            c0245m.u(q2.h.a(q2.i.a(((C0260z) j02).f1245a)));
        } else {
            C0245m c0245m2 = this.f1152i;
            h.a aVar2 = q2.h.f8868e;
            c0245m2.u(q2.h.a(x0.h(j02)));
        }
    }
}
