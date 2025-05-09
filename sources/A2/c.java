package a2;

import a2.c;
import i2.InterfaceC0504b;
import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import o2.C0654e;

/* loaded from: classes.dex */
public class c implements InterfaceC0504b, a2.f {

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f2682a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f2683b;

    /* renamed from: c, reason: collision with root package name */
    public Map f2684c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2685d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f2686e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f2687f;

    /* renamed from: g, reason: collision with root package name */
    public int f2688g;

    /* renamed from: h, reason: collision with root package name */
    public final d f2689h;

    /* renamed from: i, reason: collision with root package name */
    public WeakHashMap f2690i;

    /* renamed from: j, reason: collision with root package name */
    public i f2691j;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final ByteBuffer f2692a;

        /* renamed from: b, reason: collision with root package name */
        public int f2693b;

        /* renamed from: c, reason: collision with root package name */
        public long f2694c;

        public b(ByteBuffer byteBuffer, int i3, long j3) {
            this.f2692a = byteBuffer;
            this.f2693b = i3;
            this.f2694c = j3;
        }
    }

    /* renamed from: a2.c$c, reason: collision with other inner class name */
    public static class C0075c implements d {

        /* renamed from: a, reason: collision with root package name */
        public final ExecutorService f2695a;

        public C0075c(ExecutorService executorService) {
            this.f2695a = executorService;
        }

        @Override // a2.c.d
        public void a(Runnable runnable) {
            this.f2695a.execute(runnable);
        }
    }

    public interface d {
        void a(Runnable runnable);
    }

    public static class e implements i {

        /* renamed from: a, reason: collision with root package name */
        public ExecutorService f2696a = W1.a.e().b();

        @Override // a2.c.i
        public d a(InterfaceC0504b.d dVar) {
            return dVar.a() ? new h(this.f2696a) : new C0075c(this.f2696a);
        }
    }

    public static class f {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC0504b.a f2697a;

        /* renamed from: b, reason: collision with root package name */
        public final d f2698b;

        public f(InterfaceC0504b.a aVar, d dVar) {
            this.f2697a = aVar;
            this.f2698b = dVar;
        }
    }

    public static class g implements InterfaceC0504b.InterfaceC0126b {

        /* renamed from: a, reason: collision with root package name */
        public final FlutterJNI f2699a;

        /* renamed from: b, reason: collision with root package name */
        public final int f2700b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicBoolean f2701c = new AtomicBoolean(false);

        public g(FlutterJNI flutterJNI, int i3) {
            this.f2699a = flutterJNI;
            this.f2700b = i3;
        }

        @Override // i2.InterfaceC0504b.InterfaceC0126b
        public void a(ByteBuffer byteBuffer) {
            if (this.f2701c.getAndSet(true)) {
                throw new IllegalStateException("Reply already submitted");
            }
            if (byteBuffer == null) {
                this.f2699a.invokePlatformMessageEmptyResponseCallback(this.f2700b);
            } else {
                this.f2699a.invokePlatformMessageResponseCallback(this.f2700b, byteBuffer, byteBuffer.position());
            }
        }
    }

    public static class h implements d {

        /* renamed from: a, reason: collision with root package name */
        public final ExecutorService f2702a;

        /* renamed from: b, reason: collision with root package name */
        public final ConcurrentLinkedQueue f2703b = new ConcurrentLinkedQueue();

        /* renamed from: c, reason: collision with root package name */
        public final AtomicBoolean f2704c = new AtomicBoolean(false);

        public h(ExecutorService executorService) {
            this.f2702a = executorService;
        }

        @Override // a2.c.d
        public void a(Runnable runnable) {
            this.f2703b.add(runnable);
            this.f2702a.execute(new Runnable() { // from class: a2.d
                @Override // java.lang.Runnable
                public final void run() {
                    c.h.this.d();
                }
            });
        }

        public final void d() {
            if (this.f2704c.compareAndSet(false, true)) {
                try {
                    Runnable runnable = (Runnable) this.f2703b.poll();
                    if (runnable != null) {
                        runnable.run();
                    }
                } finally {
                    this.f2704c.set(false);
                    if (!this.f2703b.isEmpty()) {
                        this.f2702a.execute(new Runnable() { // from class: a2.e
                            @Override // java.lang.Runnable
                            public final void run() {
                                c.h.this.d();
                            }
                        });
                    }
                }
            }
        }
    }

    public interface i {
        d a(InterfaceC0504b.d dVar);
    }

    public static class j implements InterfaceC0504b.c {
        public j() {
        }
    }

    public c(FlutterJNI flutterJNI, i iVar) {
        this.f2683b = new HashMap();
        this.f2684c = new HashMap();
        this.f2685d = new Object();
        this.f2686e = new AtomicBoolean(false);
        this.f2687f = new HashMap();
        this.f2688g = 1;
        this.f2689h = new a2.g();
        this.f2690i = new WeakHashMap();
        this.f2682a = flutterJNI;
        this.f2691j = iVar;
    }

    public static /* synthetic */ void h(c cVar, String str, int i3, f fVar, ByteBuffer byteBuffer, long j3) {
        cVar.getClass();
        C0654e.e("PlatformChannel ScheduleHandler on " + str, i3);
        try {
            C0654e f3 = C0654e.f("DartMessenger#handleMessageFromDart on " + str);
            try {
                cVar.k(fVar, byteBuffer, i3);
                if (byteBuffer != null && byteBuffer.isDirect()) {
                    byteBuffer.limit(0);
                }
                if (f3 != null) {
                    f3.close();
                }
            } finally {
            }
        } finally {
            cVar.f2682a.cleanupMessageData(j3);
        }
    }

    public static void j(Error error) {
        Thread currentThread = Thread.currentThread();
        if (currentThread.getUncaughtExceptionHandler() == null) {
            throw error;
        }
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, error);
    }

    @Override // i2.InterfaceC0504b
    public InterfaceC0504b.c a(InterfaceC0504b.d dVar) {
        d a3 = this.f2691j.a(dVar);
        j jVar = new j();
        this.f2690i.put(jVar, a3);
        return jVar;
    }

    @Override // i2.InterfaceC0504b
    public void b(String str, InterfaceC0504b.a aVar) {
        d(str, aVar, null);
    }

    @Override // i2.InterfaceC0504b
    public void c(String str, ByteBuffer byteBuffer, InterfaceC0504b.InterfaceC0126b interfaceC0126b) {
        C0654e f3 = C0654e.f("DartMessenger#send on " + str);
        try {
            W1.b.f("DartMessenger", "Sending message with callback over channel '" + str + "'");
            int i3 = this.f2688g;
            this.f2688g = i3 + 1;
            if (interfaceC0126b != null) {
                this.f2687f.put(Integer.valueOf(i3), interfaceC0126b);
            }
            if (byteBuffer == null) {
                this.f2682a.dispatchEmptyPlatformMessage(str, i3);
            } else {
                this.f2682a.dispatchPlatformMessage(str, byteBuffer, byteBuffer.position(), i3);
            }
            if (f3 != null) {
                f3.close();
            }
        } catch (Throwable th) {
            if (f3 != null) {
                try {
                    f3.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // i2.InterfaceC0504b
    public void d(String str, InterfaceC0504b.a aVar, InterfaceC0504b.c cVar) {
        d dVar;
        if (aVar == null) {
            W1.b.f("DartMessenger", "Removing handler for channel '" + str + "'");
            synchronized (this.f2685d) {
                this.f2683b.remove(str);
            }
            return;
        }
        if (cVar != null) {
            dVar = (d) this.f2690i.get(cVar);
            if (dVar == null) {
                throw new IllegalArgumentException("Unrecognized TaskQueue, use BinaryMessenger to create your TaskQueue (ex makeBackgroundTaskQueue).");
            }
        } else {
            dVar = null;
        }
        W1.b.f("DartMessenger", "Setting handler for channel '" + str + "'");
        synchronized (this.f2685d) {
            try {
                this.f2683b.put(str, new f(aVar, dVar));
                List<b> list = (List) this.f2684c.remove(str);
                if (list == null) {
                    return;
                }
                for (b bVar : list) {
                    i(str, (f) this.f2683b.get(str), bVar.f2692a, bVar.f2693b, bVar.f2694c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a2.f
    public void e(int i3, ByteBuffer byteBuffer) {
        W1.b.f("DartMessenger", "Received message reply from Dart.");
        InterfaceC0504b.InterfaceC0126b interfaceC0126b = (InterfaceC0504b.InterfaceC0126b) this.f2687f.remove(Integer.valueOf(i3));
        if (interfaceC0126b != null) {
            try {
                W1.b.f("DartMessenger", "Invoking registered callback for reply from Dart.");
                interfaceC0126b.a(byteBuffer);
                if (byteBuffer == null || !byteBuffer.isDirect()) {
                    return;
                }
                byteBuffer.limit(0);
            } catch (Error e3) {
                j(e3);
            } catch (Exception e4) {
                W1.b.c("DartMessenger", "Uncaught exception in binary message reply handler", e4);
            }
        }
    }

    @Override // a2.f
    public void g(String str, ByteBuffer byteBuffer, int i3, long j3) {
        f fVar;
        boolean z3;
        W1.b.f("DartMessenger", "Received message from Dart over channel '" + str + "'");
        synchronized (this.f2685d) {
            try {
                fVar = (f) this.f2683b.get(str);
                z3 = this.f2686e.get() && fVar == null;
                if (z3) {
                    if (!this.f2684c.containsKey(str)) {
                        this.f2684c.put(str, new LinkedList());
                    }
                    ((List) this.f2684c.get(str)).add(new b(byteBuffer, i3, j3));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z3) {
            return;
        }
        i(str, fVar, byteBuffer, i3, j3);
    }

    public final void i(final String str, final f fVar, final ByteBuffer byteBuffer, final int i3, final long j3) {
        d dVar = fVar != null ? fVar.f2698b : null;
        C0654e.b("PlatformChannel ScheduleHandler on " + str, i3);
        Runnable runnable = new Runnable() { // from class: a2.b
            @Override // java.lang.Runnable
            public final void run() {
                c.h(c.this, str, i3, fVar, byteBuffer, j3);
            }
        };
        if (dVar == null) {
            dVar = this.f2689h;
        }
        dVar.a(runnable);
    }

    public final void k(f fVar, ByteBuffer byteBuffer, int i3) {
        if (fVar == null) {
            W1.b.f("DartMessenger", "No registered handler for message. Responding to Dart with empty reply message.");
            this.f2682a.invokePlatformMessageEmptyResponseCallback(i3);
            return;
        }
        try {
            W1.b.f("DartMessenger", "Deferring to registered handler to process message.");
            fVar.f2697a.a(byteBuffer, new g(this.f2682a, i3));
        } catch (Error e3) {
            j(e3);
        } catch (Exception e4) {
            W1.b.c("DartMessenger", "Uncaught exception in binary message listener", e4);
            this.f2682a.invokePlatformMessageEmptyResponseCallback(i3);
        }
    }

    public c(FlutterJNI flutterJNI) {
        this(flutterJNI, new e());
    }
}
