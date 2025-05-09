package u2;

import C2.u;

/* loaded from: classes.dex */
public abstract class k extends d implements C2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f9651h;

    public k(int i3, s2.e eVar) {
        super(eVar);
        this.f9651h = i3;
    }

    @Override // C2.h
    public int e() {
        return this.f9651h;
    }

    @Override // u2.AbstractC0748a
    public String toString() {
        if (f() != null) {
            return super.toString();
        }
        String f3 = u.f(this);
        C2.k.d(f3, "renderLambdaToString(...)");
        return f3;
    }
}
