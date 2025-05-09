package U1;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class E {

    /* renamed from: a, reason: collision with root package name */
    public static final Handler f2109a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    public static final Executor f2110b = new Executor() { // from class: U1.D
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            E.a(runnable);
        }
    };

    public static void a(Runnable runnable) {
        if (T1.c.c()) {
            runnable.run();
        } else {
            f2109a.post(runnable);
        }
    }

    public static void b(Runnable runnable) {
        if (T1.c.c()) {
            runnable.run();
            return;
        }
        G g3 = new G(runnable);
        f2109a.post(g3);
        g3.a();
    }
}
