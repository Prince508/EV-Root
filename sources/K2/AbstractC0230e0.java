package K2;

import java.util.concurrent.CancellationException;

/* renamed from: K2.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0230e0 {
    public static final CancellationException a(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }
}
