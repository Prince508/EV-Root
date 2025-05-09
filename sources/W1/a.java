package W1;

import b2.InterfaceC0369a;
import c2.C0400d;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static a f2337d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f2338e;

    /* renamed from: a, reason: collision with root package name */
    public C0400d f2339a;

    /* renamed from: b, reason: collision with root package name */
    public FlutterJNI.c f2340b;

    /* renamed from: c, reason: collision with root package name */
    public ExecutorService f2341c;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public C0400d f2342a;

        /* renamed from: b, reason: collision with root package name */
        public FlutterJNI.c f2343b;

        /* renamed from: c, reason: collision with root package name */
        public ExecutorService f2344c;

        /* renamed from: W1.a$b$a, reason: collision with other inner class name */
        public class ThreadFactoryC0067a implements ThreadFactory {

            /* renamed from: a, reason: collision with root package name */
            public int f2345a;

            public ThreadFactoryC0067a() {
                this.f2345a = 0;
            }

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable);
                StringBuilder sb = new StringBuilder();
                sb.append("flutter-worker-");
                int i3 = this.f2345a;
                this.f2345a = i3 + 1;
                sb.append(i3);
                thread.setName(sb.toString());
                return thread;
            }
        }

        public a a() {
            b();
            return new a(this.f2342a, null, this.f2343b, this.f2344c);
        }

        public final void b() {
            if (this.f2343b == null) {
                this.f2343b = new FlutterJNI.c();
            }
            if (this.f2344c == null) {
                this.f2344c = Executors.newCachedThreadPool(new ThreadFactoryC0067a());
            }
            if (this.f2342a == null) {
                this.f2342a = new C0400d(this.f2343b.a(), this.f2344c);
            }
        }
    }

    public static a e() {
        f2338e = true;
        if (f2337d == null) {
            f2337d = new b().a();
        }
        return f2337d;
    }

    public InterfaceC0369a a() {
        return null;
    }

    public ExecutorService b() {
        return this.f2341c;
    }

    public C0400d c() {
        return this.f2339a;
    }

    public FlutterJNI.c d() {
        return this.f2340b;
    }

    public a(C0400d c0400d, InterfaceC0369a interfaceC0369a, FlutterJNI.c cVar, ExecutorService executorService) {
        this.f2339a = c0400d;
        this.f2340b = cVar;
        this.f2341c = executorService;
    }
}
