package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public class h0 extends f0 {
    @Override // androidx.datastore.preferences.protobuf.f0
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public g0 g(Object obj) {
        return ((AbstractC0333t) obj).unknownFields;
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public int h(g0 g0Var) {
        return g0Var.f();
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public int i(g0 g0Var) {
        return g0Var.g();
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public g0 k(g0 g0Var, g0 g0Var2) {
        return g0Var2.equals(g0.e()) ? g0Var : g0.k(g0Var, g0Var2);
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public g0 n() {
        return g0.l();
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public void o(Object obj, g0 g0Var) {
        p(obj, g0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public void p(Object obj, g0 g0Var) {
        ((AbstractC0333t) obj).unknownFields = g0Var;
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public g0 r(g0 g0Var) {
        g0Var.j();
        return g0Var;
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public void s(g0 g0Var, m0 m0Var) {
        g0Var.o(m0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public void t(g0 g0Var, m0 m0Var) {
        g0Var.q(m0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public void j(Object obj) {
        g(obj).j();
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public boolean q(X x3) {
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public void a(g0 g0Var, int i3, int i4) {
        g0Var.n(l0.c(i3, 5), Integer.valueOf(i4));
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void b(g0 g0Var, int i3, long j3) {
        g0Var.n(l0.c(i3, 1), Long.valueOf(j3));
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public void c(g0 g0Var, int i3, g0 g0Var2) {
        g0Var.n(l0.c(i3, 3), g0Var2);
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void d(g0 g0Var, int i3, AbstractC0320f abstractC0320f) {
        g0Var.n(l0.c(i3, 2), abstractC0320f);
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public void e(g0 g0Var, int i3, long j3) {
        g0Var.n(l0.c(i3, 0), Long.valueOf(j3));
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public g0 f(Object obj) {
        g0 g3 = g(obj);
        if (g3 != g0.e()) {
            return g3;
        }
        g0 l3 = g0.l();
        p(obj, l3);
        return l3;
    }
}
