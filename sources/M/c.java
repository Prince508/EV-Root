package m;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class c extends e {

    /* renamed from: c, reason: collision with root package name */
    public static volatile c f8483c;

    /* renamed from: d, reason: collision with root package name */
    public static final Executor f8484d = new Executor() { // from class: m.a
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            c.f().c(runnable);
        }
    };

    /* renamed from: e, reason: collision with root package name */
    public static final Executor f8485e = new Executor() { // from class: m.b
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            c.f().a(runnable);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public e f8486a;

    /* renamed from: b, reason: collision with root package name */
    public final e f8487b;

    public c() {
        d dVar = new d();
        this.f8487b = dVar;
        this.f8486a = dVar;
    }

    public static c f() {
        if (f8483c != null) {
            return f8483c;
        }
        synchronized (c.class) {
            try {
                if (f8483c == null) {
                    f8483c = new c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f8483c;
    }

    @Override // m.e
    public void a(Runnable runnable) {
        this.f8486a.a(runnable);
    }

    @Override // m.e
    public boolean b() {
        return this.f8486a.b();
    }

    @Override // m.e
    public void c(Runnable runnable) {
        this.f8486a.c(runnable);
    }
}
