package n2;

import android.util.Log;
import java.util.List;
import r2.AbstractC0700m;

/* renamed from: n2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0630m {
    public static final List b(Throwable th) {
        return AbstractC0700m.h(th.getClass().getSimpleName(), th.toString(), "Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
    }
}
