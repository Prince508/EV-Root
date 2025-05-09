package M2;

import K2.AbstractC0230e0;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public abstract /* synthetic */ class l {
    public static final void a(s sVar, Throwable th) {
        if (th != null) {
            r0 = th instanceof CancellationException ? (CancellationException) th : null;
            if (r0 == null) {
                r0 = AbstractC0230e0.a("Channel was consumed, consumer had failed", th);
            }
        }
        sVar.b(r0);
    }
}
