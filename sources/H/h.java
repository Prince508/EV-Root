package H;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public abstract class h {

    public static class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        public String f632a;

        /* renamed from: b, reason: collision with root package name */
        public int f633b;

        /* renamed from: H.h$a$a, reason: collision with other inner class name */
        public static class C0015a extends Thread {

            /* renamed from: e, reason: collision with root package name */
            public final int f634e;

            public C0015a(Runnable runnable, String str, int i3) {
                super(runnable, str);
                this.f634e = i3;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f634e);
                super.run();
            }
        }

        public a(String str, int i3) {
            this.f632a = str;
            this.f633b = i3;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0015a(runnable, this.f632a, this.f633b);
        }
    }

    public static class b implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        public Callable f635e;

        /* renamed from: f, reason: collision with root package name */
        public J.a f636f;

        /* renamed from: g, reason: collision with root package name */
        public Handler f637g;

        public class a implements Runnable {

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ J.a f638e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ Object f639f;

            public a(J.a aVar, Object obj) {
                this.f638e = aVar;
                this.f639f = obj;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f638e.accept(this.f639f);
            }
        }

        public b(Handler handler, Callable callable, J.a aVar) {
            this.f635e = callable;
            this.f636f = aVar;
            this.f637g = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            try {
                obj = this.f635e.call();
            } catch (Exception unused) {
                obj = null;
            }
            this.f637g.post(new a(this.f636f, obj));
        }
    }

    public static ThreadPoolExecutor a(String str, int i3, int i4) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i4, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i3));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    public static void b(Executor executor, Callable callable, J.a aVar) {
        executor.execute(new b(H.b.a(), callable, aVar));
    }

    public static Object c(ExecutorService executorService, Callable callable, int i3) {
        try {
            return executorService.submit(callable).get(i3, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e3) {
            throw e3;
        } catch (ExecutionException e4) {
            throw new RuntimeException(e4);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
