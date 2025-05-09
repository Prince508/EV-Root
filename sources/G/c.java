package G;

import J.g;
import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public abstract class c {

    public static class a implements Executor {

        /* renamed from: e */
        public final Handler f567e;

        public a(Handler handler) {
            this.f567e = (Handler) g.g(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.f567e.post((Runnable) g.g(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f567e + " is shutting down");
        }
    }

    public static Executor a(Handler handler) {
        return new a(handler);
    }
}
