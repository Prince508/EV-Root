package L2;

import C2.k;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import q2.h;
import q2.i;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final d f1341a;
    private static volatile Choreographer choreographer;

    static {
        Object a3;
        try {
            h.a aVar = h.f8868e;
            a3 = h.a(new c(a(Looper.getMainLooper(), true), null, 2, null));
        } catch (Throwable th) {
            h.a aVar2 = h.f8868e;
            a3 = h.a(i.a(th));
        }
        f1341a = (d) (h.c(a3) ? null : a3);
    }

    public static final Handler a(Looper looper, boolean z3) {
        if (!z3) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            k.c(invoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) invoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
