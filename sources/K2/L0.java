package K2;

/* loaded from: classes.dex */
public final class L0 extends P2.B {

    /* renamed from: i, reason: collision with root package name */
    public final ThreadLocal f1166i;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public L0(s2.i r3, s2.e r4) {
        /*
            r2 = this;
            K2.M0 r0 = K2.M0.f1167e
            s2.i$b r1 = r3.a(r0)
            if (r1 != 0) goto Ld
            s2.i r0 = r3.r(r0)
            goto Le
        Ld:
            r0 = r3
        Le:
            r2.<init>(r0, r4)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f1166i = r0
            s2.i r4 = r4.c()
            s2.f$b r0 = s2.f.f9290d
            s2.i$b r4 = r4.a(r0)
            boolean r4 = r4 instanceof K2.F
            if (r4 != 0) goto L31
            r4 = 0
            java.lang.Object r4 = P2.J.c(r3, r4)
            P2.J.a(r3, r4)
            r2.U0(r3, r4)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: K2.L0.<init>(s2.i, s2.e):void");
    }

    @Override // P2.B, K2.AbstractC0221a
    public void P0(Object obj) {
        if (this.threadLocalIsSet) {
            q2.g gVar = (q2.g) this.f1166i.get();
            if (gVar != null) {
                P2.J.a((s2.i) gVar.a(), gVar.b());
            }
            this.f1166i.remove();
        }
        Object a3 = D.a(obj, this.f1737h);
        s2.e eVar = this.f1737h;
        s2.i c3 = eVar.c();
        Object c4 = P2.J.c(c3, null);
        L0 g3 = c4 != P2.J.f1745a ? E.g(eVar, c3, c4) : null;
        try {
            this.f1737h.u(a3);
            q2.n nVar = q2.n.f8874a;
            if (g3 == null || g3.T0()) {
                P2.J.a(c3, c4);
            }
        } catch (Throwable th) {
            if (g3 == null || g3.T0()) {
                P2.J.a(c3, c4);
            }
            throw th;
        }
    }

    public final boolean T0() {
        boolean z3 = this.threadLocalIsSet && this.f1166i.get() == null;
        this.f1166i.remove();
        return !z3;
    }

    public final void U0(s2.i iVar, Object obj) {
        this.threadLocalIsSet = true;
        this.f1166i.set(q2.k.a(iVar, obj));
    }
}
