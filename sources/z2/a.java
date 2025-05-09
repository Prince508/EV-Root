package z2;

import java.io.Closeable;
import q2.AbstractC0672a;

/* loaded from: classes.dex */
public abstract class a {
    public static final void a(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                AbstractC0672a.a(th, th2);
            }
        }
    }
}
