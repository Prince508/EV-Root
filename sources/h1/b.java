package H1;

import O1.J;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f758a = new a().d();

    /* renamed from: b, reason: collision with root package name */
    public static final J f759b = J.V();

    /* renamed from: c, reason: collision with root package name */
    public static final J f760c = J.V();

    static {
        try {
            a();
        } catch (GeneralSecurityException e3) {
            throw new ExceptionInInitializerError(e3);
        }
    }

    public static void a() {
        c.e();
        if (F1.a.a()) {
            return;
        }
        a.m(true);
    }
}
