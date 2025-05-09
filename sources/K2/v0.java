package K2;

/* loaded from: classes.dex */
public abstract class v0 extends B implements W, InterfaceC0242k0 {

    /* renamed from: h, reason: collision with root package name */
    public w0 f1217h;

    public final void A(w0 w0Var) {
        this.f1217h = w0Var;
    }

    @Override // K2.W
    public void a() {
        z().D0(this);
    }

    @Override // K2.InterfaceC0242k0
    public boolean d() {
        return true;
    }

    @Override // K2.InterfaceC0242k0
    public A0 f() {
        return null;
    }

    @Override // P2.q
    public String toString() {
        return M.a(this) + '@' + M.b(this) + "[job@" + M.b(z()) + ']';
    }

    public final w0 z() {
        w0 w0Var = this.f1217h;
        if (w0Var != null) {
            return w0Var;
        }
        C2.k.o("job");
        return null;
    }
}
