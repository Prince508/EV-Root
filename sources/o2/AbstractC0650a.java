package o2;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;

/* renamed from: o2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0650a {
    public static Handler a(Looper looper) {
        Handler createAsync;
        if (Build.VERSION.SDK_INT < 28) {
            return new Handler(looper);
        }
        createAsync = Handler.createAsync(looper);
        return createAsync;
    }
}
