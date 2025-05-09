package P2;

import java.util.Iterator;
import q2.AbstractC0672a;

/* renamed from: P2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0281h {
    public static final void a(s2.i iVar, Throwable th) {
        Iterator it = AbstractC0280g.a().iterator();
        while (it.hasNext()) {
            try {
                ((K2.G) it.next()).l(iVar, th);
            } catch (Throwable th2) {
                AbstractC0280g.b(K2.H.b(th, th2));
            }
        }
        try {
            AbstractC0672a.a(th, new C0282i(iVar));
        } catch (Throwable unused) {
        }
        AbstractC0280g.b(th);
    }
}
