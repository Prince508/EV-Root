package P2;

import K2.AbstractC0221a;
import t2.AbstractC0732b;

/* loaded from: classes.dex */
public class B extends AbstractC0221a implements u2.e {

    /* renamed from: h, reason: collision with root package name */
    public final s2.e f1737h;

    public B(s2.i iVar, s2.e eVar) {
        super(iVar, true, true);
        this.f1737h = eVar;
    }

    @Override // K2.w0
    public void O(Object obj) {
        AbstractC0284k.c(AbstractC0732b.b(this.f1737h), K2.D.a(obj, this.f1737h), null, 2, null);
    }

    @Override // K2.AbstractC0221a
    public void P0(Object obj) {
        s2.e eVar = this.f1737h;
        eVar.u(K2.D.a(obj, eVar));
    }

    @Override // u2.e
    public final u2.e m() {
        s2.e eVar = this.f1737h;
        if (eVar instanceof u2.e) {
            return (u2.e) eVar;
        }
        return null;
    }

    @Override // K2.w0
    public final boolean p0() {
        return true;
    }
}
