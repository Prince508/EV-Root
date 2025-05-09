package N2;

import t2.AbstractC0733c;

/* loaded from: classes.dex */
public abstract class c extends O2.e {

    /* renamed from: h, reason: collision with root package name */
    public final B2.p f1489h;

    public c(B2.p pVar, s2.i iVar, int i3, M2.a aVar) {
        super(iVar, i3, aVar);
        this.f1489h = pVar;
    }

    public static /* synthetic */ Object j(c cVar, M2.r rVar, s2.e eVar) {
        Object h3 = cVar.f1489h.h(rVar, eVar);
        return h3 == AbstractC0733c.c() ? h3 : q2.n.f8874a;
    }

    @Override // O2.e
    public Object e(M2.r rVar, s2.e eVar) {
        return j(this, rVar, eVar);
    }

    @Override // O2.e
    public String toString() {
        return "block[" + this.f1489h + "] -> " + super.toString();
    }
}
