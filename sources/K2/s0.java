package K2;

/* loaded from: classes.dex */
public class s0 extends w0 implements InterfaceC0258x {

    /* renamed from: g, reason: collision with root package name */
    public final boolean f1216g;

    public s0(p0 p0Var) {
        super(true);
        m0(p0Var);
        this.f1216g = P0();
    }

    public final boolean P0() {
        w0 z3;
        r i02 = i0();
        C0253s c0253s = i02 instanceof C0253s ? (C0253s) i02 : null;
        if (c0253s != null && (z3 = c0253s.z()) != null) {
            while (!z3.f0()) {
                r i03 = z3.i0();
                C0253s c0253s2 = i03 instanceof C0253s ? (C0253s) i03 : null;
                if (c0253s2 != null && (z3 = c0253s2.z()) != null) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // K2.w0
    public boolean f0() {
        return this.f1216g;
    }

    @Override // K2.w0
    public boolean g0() {
        return true;
    }
}
