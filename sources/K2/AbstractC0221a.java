package K2;

/* renamed from: K2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0221a extends w0 implements p0, s2.e, I {

    /* renamed from: g, reason: collision with root package name */
    public final s2.i f1184g;

    public AbstractC0221a(s2.i iVar, boolean z3, boolean z4) {
        super(z4);
        if (z3) {
            m0((p0) iVar.a(p0.f1211b));
        }
        this.f1184g = iVar.r(this);
    }

    public void P0(Object obj) {
        O(obj);
    }

    public final void S0(K k3, Object obj, B2.p pVar) {
        k3.f(pVar, obj, this);
    }

    @Override // K2.w0
    public String W() {
        return M.a(this) + " was cancelled";
    }

    @Override // s2.e
    public final s2.i c() {
        return this.f1184g;
    }

    @Override // K2.w0, K2.p0
    public boolean d() {
        return super.d();
    }

    @Override // K2.w0
    public final void l0(Throwable th) {
        H.a(this.f1184g, th);
    }

    @Override // K2.I
    public s2.i t() {
        return this.f1184g;
    }

    @Override // s2.e
    public final void u(Object obj) {
        Object s02 = s0(D.d(obj, null, 1, null));
        if (s02 == x0.f1232b) {
            return;
        }
        P0(s02);
    }

    @Override // K2.w0
    public String u0() {
        String b3 = E.b(this.f1184g);
        if (b3 == null) {
            return super.u0();
        }
        return '\"' + b3 + "\":" + super.u0();
    }

    @Override // K2.w0
    public final void z0(Object obj) {
        if (!(obj instanceof C0260z)) {
            R0(obj);
        } else {
            C0260z c0260z = (C0260z) obj;
            Q0(c0260z.f1245a, c0260z.a());
        }
    }

    public void R0(Object obj) {
    }

    public void Q0(Throwable th, boolean z3) {
    }
}
