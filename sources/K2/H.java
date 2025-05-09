package K2;

import P2.AbstractC0281h;
import q2.AbstractC0672a;

/* loaded from: classes.dex */
public abstract class H {
    public static final void a(s2.i iVar, Throwable th) {
        try {
            G g3 = (G) iVar.a(G.f1155a);
            if (g3 != null) {
                g3.l(iVar, th);
            } else {
                AbstractC0281h.a(iVar, th);
            }
        } catch (Throwable th2) {
            AbstractC0281h.a(iVar, b(th, th2));
        }
    }

    public static final Throwable b(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        AbstractC0672a.a(runtimeException, th);
        return runtimeException;
    }
}
