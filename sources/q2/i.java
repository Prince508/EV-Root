package q2;

import q2.h;

/* loaded from: classes.dex */
public abstract class i {
    public static final Object a(Throwable th) {
        C2.k.e(th, "exception");
        return new h.b(th);
    }

    public static final void b(Object obj) {
        if (obj instanceof h.b) {
            throw ((h.b) obj).f8869e;
        }
    }
}
