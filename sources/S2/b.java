package s2;

import B2.l;
import C2.k;
import s2.i;

/* loaded from: classes.dex */
public abstract class b implements i.c {

    /* renamed from: e, reason: collision with root package name */
    public final l f9286e;

    /* renamed from: f, reason: collision with root package name */
    public final i.c f9287f;

    public b(i.c cVar, l lVar) {
        k.e(cVar, "baseKey");
        k.e(lVar, "safeCast");
        this.f9286e = lVar;
        this.f9287f = cVar instanceof b ? ((b) cVar).f9287f : cVar;
    }

    public final boolean a(i.c cVar) {
        k.e(cVar, "key");
        return cVar == this || this.f9287f == cVar;
    }

    public final i.b b(i.b bVar) {
        k.e(bVar, "element");
        return (i.b) this.f9286e.j(bVar);
    }
}
