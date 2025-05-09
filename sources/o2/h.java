package O2;

import t2.AbstractC0733c;

/* loaded from: classes.dex */
public final class h extends g {
    public /* synthetic */ h(N2.d dVar, s2.i iVar, int i3, M2.a aVar, int i4, C2.g gVar) {
        this(dVar, (i4 & 2) != 0 ? s2.j.f9292e : iVar, (i4 & 4) != 0 ? -3 : i3, (i4 & 8) != 0 ? M2.a.SUSPEND : aVar);
    }

    @Override // O2.e
    public e f(s2.i iVar, int i3, M2.a aVar) {
        return new h(this.f1620h, iVar, i3, aVar);
    }

    @Override // O2.g
    public Object m(N2.e eVar, s2.e eVar2) {
        Object b3 = this.f1620h.b(eVar, eVar2);
        return b3 == AbstractC0733c.c() ? b3 : q2.n.f8874a;
    }

    public h(N2.d dVar, s2.i iVar, int i3, M2.a aVar) {
        super(dVar, iVar, i3, aVar);
    }
}
