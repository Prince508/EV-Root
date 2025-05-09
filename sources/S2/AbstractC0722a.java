package s2;

import B2.p;
import C2.k;
import s2.i;

/* renamed from: s2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0722a implements i.b {

    /* renamed from: e, reason: collision with root package name */
    public final i.c f9285e;

    public AbstractC0722a(i.c cVar) {
        k.e(cVar, "key");
        this.f9285e = cVar;
    }

    @Override // s2.i
    public i H(i.c cVar) {
        return i.b.a.c(this, cVar);
    }

    @Override // s2.i.b, s2.i
    public i.b a(i.c cVar) {
        return i.b.a.b(this, cVar);
    }

    @Override // s2.i
    public Object e(Object obj, p pVar) {
        return i.b.a.a(this, obj, pVar);
    }

    @Override // s2.i.b
    public i.c getKey() {
        return this.f9285e;
    }

    @Override // s2.i
    public i r(i iVar) {
        return i.b.a.d(this, iVar);
    }
}
