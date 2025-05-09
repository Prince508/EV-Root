package P2;

import a.C0310a;
import q2.h;
import u2.AbstractC0748a;

/* loaded from: classes.dex */
public abstract class E {

    /* renamed from: a, reason: collision with root package name */
    public static final StackTraceElement f1740a = new C0310a().a();

    /* renamed from: b, reason: collision with root package name */
    public static final String f1741b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f1742c;

    static {
        Object a3;
        Object a4;
        try {
            h.a aVar = q2.h.f8868e;
            a3 = q2.h.a(AbstractC0748a.class.getCanonicalName());
        } catch (Throwable th) {
            h.a aVar2 = q2.h.f8868e;
            a3 = q2.h.a(q2.i.a(th));
        }
        if (q2.h.b(a3) != null) {
            a3 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f1741b = (String) a3;
        try {
            a4 = q2.h.a(E.class.getCanonicalName());
        } catch (Throwable th2) {
            h.a aVar3 = q2.h.f8868e;
            a4 = q2.h.a(q2.i.a(th2));
        }
        if (q2.h.b(a4) != null) {
            a4 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f1742c = (String) a4;
    }

    public static final Throwable a(Throwable th) {
        return th;
    }
}
