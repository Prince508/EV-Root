package u2;

import s2.i;

/* loaded from: classes.dex */
public abstract class d extends AbstractC0748a {

    /* renamed from: f, reason: collision with root package name */
    public final s2.i f9643f;

    /* renamed from: g, reason: collision with root package name */
    public transient s2.e f9644g;

    public d(s2.e eVar, s2.i iVar) {
        super(eVar);
        this.f9643f = iVar;
    }

    @Override // s2.e
    public s2.i c() {
        s2.i iVar = this.f9643f;
        C2.k.b(iVar);
        return iVar;
    }

    @Override // u2.AbstractC0748a
    public void n() {
        s2.e eVar = this.f9644g;
        if (eVar != null && eVar != this) {
            i.b a3 = c().a(s2.f.f9290d);
            C2.k.b(a3);
            ((s2.f) a3).B(eVar);
        }
        this.f9644g = C0750c.f9642e;
    }

    public final s2.e o() {
        s2.e eVar = this.f9644g;
        if (eVar == null) {
            s2.f fVar = (s2.f) c().a(s2.f.f9290d);
            if (fVar == null || (eVar = fVar.J(this)) == null) {
                eVar = this;
            }
            this.f9644g = eVar;
        }
        return eVar;
    }

    public d(s2.e eVar) {
        this(eVar, eVar != null ? eVar.c() : null);
    }
}
