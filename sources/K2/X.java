package K2;

/* loaded from: classes.dex */
public final class X extends AbstractC0239j {

    /* renamed from: e, reason: collision with root package name */
    public final W f1179e;

    public X(W w3) {
        this.f1179e = w3;
    }

    @Override // K2.AbstractC0241k
    public void a(Throwable th) {
        this.f1179e.a();
    }

    @Override // B2.l
    public /* bridge */ /* synthetic */ Object j(Object obj) {
        a((Throwable) obj);
        return q2.n.f8874a;
    }

    public String toString() {
        return "DisposeOnCancel[" + this.f1179e + ']';
    }
}
