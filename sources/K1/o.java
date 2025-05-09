package K1;

import O1.J;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final String f1135a = new k().d();

    /* renamed from: b, reason: collision with root package name */
    public static final J f1136b;

    /* renamed from: c, reason: collision with root package name */
    public static final J f1137c;

    /* renamed from: d, reason: collision with root package name */
    public static final J f1138d;

    static {
        J V2 = J.V();
        f1136b = V2;
        f1137c = V2;
        f1138d = V2;
        try {
            a();
        } catch (GeneralSecurityException e3) {
            throw new ExceptionInInitializerError(e3);
        }
    }

    public static void a() {
        b();
    }

    public static void b() {
        r.f();
        h.d();
        k.p(true);
        if (F1.a.a()) {
            return;
        }
        c.o(true);
    }
}
