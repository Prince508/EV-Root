package K2;

/* loaded from: classes.dex */
public final class J0 {

    /* renamed from: a, reason: collision with root package name */
    public static final J0 f1157a = new J0();

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f1158b = P2.K.a(new P2.F("ThreadLocalEventLoop"));

    public final Z a() {
        return (Z) f1158b.get();
    }

    public final Z b() {
        ThreadLocal threadLocal = f1158b;
        Z z3 = (Z) threadLocal.get();
        if (z3 != null) {
            return z3;
        }
        Z a3 = AbstractC0226c0.a();
        threadLocal.set(a3);
        return a3;
    }

    public final void c() {
        f1158b.set(null);
    }

    public final void d(Z z3) {
        f1158b.set(z3);
    }
}
