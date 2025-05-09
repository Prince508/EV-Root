package K2;

/* renamed from: K2.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0246m0 extends AbstractC0239j {

    /* renamed from: e, reason: collision with root package name */
    public final B2.l f1205e;

    public C0246m0(B2.l lVar) {
        this.f1205e = lVar;
    }

    @Override // K2.AbstractC0241k
    public void a(Throwable th) {
        this.f1205e.j(th);
    }

    @Override // B2.l
    public /* bridge */ /* synthetic */ Object j(Object obj) {
        a((Throwable) obj);
        return q2.n.f8874a;
    }

    public String toString() {
        return "InvokeOnCancel[" + M.a(this.f1205e) + '@' + M.b(this) + ']';
    }
}
