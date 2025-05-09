package K2;

/* renamed from: K2.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0257w {
    public static final InterfaceC0255u a(p0 p0Var) {
        return new C0256v(p0Var);
    }

    public static /* synthetic */ InterfaceC0255u b(p0 p0Var, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            p0Var = null;
        }
        return a(p0Var);
    }

    public static final boolean c(InterfaceC0255u interfaceC0255u, Object obj) {
        Throwable b3 = q2.h.b(obj);
        return b3 == null ? interfaceC0255u.C(obj) : interfaceC0255u.y(b3);
    }
}
