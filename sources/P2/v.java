package P2;

import K2.z0;
import java.util.List;

/* loaded from: classes.dex */
public abstract class v {
    public static final w a(Throwable th, String str) {
        if (th != null) {
            throw th;
        }
        d();
        throw new q2.c();
    }

    public static /* synthetic */ w b(Throwable th, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            th = null;
        }
        if ((i3 & 2) != 0) {
            str = null;
        }
        return a(th, str);
    }

    public static final boolean c(z0 z0Var) {
        return z0Var.o() instanceof w;
    }

    public static final Void d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    public static final z0 e(t tVar, List list) {
        try {
            return tVar.c(list);
        } catch (Throwable th) {
            return a(th, tVar.b());
        }
    }
}
