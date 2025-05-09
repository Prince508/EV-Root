package K2;

import t2.AbstractC0733c;

/* renamed from: K2.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0256v extends w0 implements InterfaceC0255u {
    public C0256v(p0 p0Var) {
        super(true);
        m0(p0Var);
    }

    @Override // K2.InterfaceC0255u
    public boolean C(Object obj) {
        return r0(obj);
    }

    @Override // K2.P
    public Object F(s2.e eVar) {
        Object P3 = P(eVar);
        AbstractC0733c.c();
        return P3;
    }

    @Override // K2.w0
    public boolean g0() {
        return true;
    }

    @Override // K2.InterfaceC0255u
    public boolean y(Throwable th) {
        return r0(new C0260z(th, false, 2, null));
    }
}
