package K2;

/* renamed from: K2.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0253s extends r0 implements r {

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceC0254t f1215i;

    public C0253s(InterfaceC0254t interfaceC0254t) {
        this.f1215i = interfaceC0254t;
    }

    @Override // K2.r
    public boolean c(Throwable th) {
        return z().X(th);
    }

    @Override // K2.r
    public p0 getParent() {
        return z();
    }

    @Override // B2.l
    public /* bridge */ /* synthetic */ Object j(Object obj) {
        y((Throwable) obj);
        return q2.n.f8874a;
    }

    @Override // K2.B
    public void y(Throwable th) {
        this.f1215i.h(z());
    }
}
