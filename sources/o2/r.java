package O2;

/* loaded from: classes.dex */
public final class r implements s2.e, u2.e {

    /* renamed from: e, reason: collision with root package name */
    public final s2.e f1641e;

    /* renamed from: f, reason: collision with root package name */
    public final s2.i f1642f;

    public r(s2.e eVar, s2.i iVar) {
        this.f1641e = eVar;
        this.f1642f = iVar;
    }

    @Override // s2.e
    public s2.i c() {
        return this.f1642f;
    }

    @Override // u2.e
    public u2.e m() {
        s2.e eVar = this.f1641e;
        if (eVar instanceof u2.e) {
            return (u2.e) eVar;
        }
        return null;
    }

    @Override // s2.e
    public void u(Object obj) {
        this.f1641e.u(obj);
    }
}
