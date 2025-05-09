package p;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: p.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractFutureC0656a implements Future {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f8781d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f8782e = Logger.getLogger(AbstractFutureC0656a.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public static final b f8783f;

    /* renamed from: g, reason: collision with root package name */
    public static final Object f8784g;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f8785a;

    /* renamed from: b, reason: collision with root package name */
    public volatile e f8786b;

    /* renamed from: c, reason: collision with root package name */
    public volatile h f8787c;

    /* renamed from: p.a$b */
    public static abstract class b {
        public b() {
        }

        public abstract boolean a(AbstractFutureC0656a abstractFutureC0656a, e eVar, e eVar2);

        public abstract boolean b(AbstractFutureC0656a abstractFutureC0656a, Object obj, Object obj2);

        public abstract boolean c(AbstractFutureC0656a abstractFutureC0656a, h hVar, h hVar2);

        public abstract void d(h hVar, h hVar2);

        public abstract void e(h hVar, Thread thread);
    }

    /* renamed from: p.a$c */
    public static final class c {

        /* renamed from: c, reason: collision with root package name */
        public static final c f8788c;

        /* renamed from: d, reason: collision with root package name */
        public static final c f8789d;

        /* renamed from: a, reason: collision with root package name */
        public final boolean f8790a;

        /* renamed from: b, reason: collision with root package name */
        public final Throwable f8791b;

        static {
            if (AbstractFutureC0656a.f8781d) {
                f8789d = null;
                f8788c = null;
            } else {
                f8789d = new c(false, null);
                f8788c = new c(true, null);
            }
        }

        public c(boolean z3, Throwable th) {
            this.f8790a = z3;
            this.f8791b = th;
        }
    }

    /* renamed from: p.a$d */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f8792a;
    }

    /* renamed from: p.a$e */
    public static final class e {

        /* renamed from: d, reason: collision with root package name */
        public static final e f8793d = new e(null, null);

        /* renamed from: a, reason: collision with root package name */
        public final Runnable f8794a;

        /* renamed from: b, reason: collision with root package name */
        public final Executor f8795b;

        /* renamed from: c, reason: collision with root package name */
        public e f8796c;

        public e(Runnable runnable, Executor executor) {
            this.f8794a = runnable;
            this.f8795b = executor;
        }
    }

    /* renamed from: p.a$f */
    public static final class f extends b {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f8797a;

        /* renamed from: b, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f8798b;

        /* renamed from: c, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f8799c;

        /* renamed from: d, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f8800d;

        /* renamed from: e, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f8801e;

        public f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f8797a = atomicReferenceFieldUpdater;
            this.f8798b = atomicReferenceFieldUpdater2;
            this.f8799c = atomicReferenceFieldUpdater3;
            this.f8800d = atomicReferenceFieldUpdater4;
            this.f8801e = atomicReferenceFieldUpdater5;
        }

        @Override // p.AbstractFutureC0656a.b
        public boolean a(AbstractFutureC0656a abstractFutureC0656a, e eVar, e eVar2) {
            return AbstractC0657b.a(this.f8800d, abstractFutureC0656a, eVar, eVar2);
        }

        @Override // p.AbstractFutureC0656a.b
        public boolean b(AbstractFutureC0656a abstractFutureC0656a, Object obj, Object obj2) {
            return AbstractC0657b.a(this.f8801e, abstractFutureC0656a, obj, obj2);
        }

        @Override // p.AbstractFutureC0656a.b
        public boolean c(AbstractFutureC0656a abstractFutureC0656a, h hVar, h hVar2) {
            return AbstractC0657b.a(this.f8799c, abstractFutureC0656a, hVar, hVar2);
        }

        @Override // p.AbstractFutureC0656a.b
        public void d(h hVar, h hVar2) {
            this.f8798b.lazySet(hVar, hVar2);
        }

        @Override // p.AbstractFutureC0656a.b
        public void e(h hVar, Thread thread) {
            this.f8797a.lazySet(hVar, thread);
        }
    }

    /* renamed from: p.a$g */
    public static final class g extends b {
        public g() {
            super();
        }

        @Override // p.AbstractFutureC0656a.b
        public boolean a(AbstractFutureC0656a abstractFutureC0656a, e eVar, e eVar2) {
            synchronized (abstractFutureC0656a) {
                try {
                    if (abstractFutureC0656a.f8786b != eVar) {
                        return false;
                    }
                    abstractFutureC0656a.f8786b = eVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p.AbstractFutureC0656a.b
        public boolean b(AbstractFutureC0656a abstractFutureC0656a, Object obj, Object obj2) {
            synchronized (abstractFutureC0656a) {
                try {
                    if (abstractFutureC0656a.f8785a != obj) {
                        return false;
                    }
                    abstractFutureC0656a.f8785a = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p.AbstractFutureC0656a.b
        public boolean c(AbstractFutureC0656a abstractFutureC0656a, h hVar, h hVar2) {
            synchronized (abstractFutureC0656a) {
                try {
                    if (abstractFutureC0656a.f8787c != hVar) {
                        return false;
                    }
                    abstractFutureC0656a.f8787c = hVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p.AbstractFutureC0656a.b
        public void d(h hVar, h hVar2) {
            hVar.f8804b = hVar2;
        }

        @Override // p.AbstractFutureC0656a.b
        public void e(h hVar, Thread thread) {
            hVar.f8803a = thread;
        }
    }

    /* renamed from: p.a$h */
    public static final class h {

        /* renamed from: c, reason: collision with root package name */
        public static final h f8802c = new h(false);

        /* renamed from: a, reason: collision with root package name */
        public volatile Thread f8803a;

        /* renamed from: b, reason: collision with root package name */
        public volatile h f8804b;

        public h(boolean z3) {
        }

        public void a(h hVar) {
            AbstractFutureC0656a.f8783f.d(this, hVar);
        }

        public void b() {
            Thread thread = this.f8803a;
            if (thread != null) {
                this.f8803a = null;
                LockSupport.unpark(thread);
            }
        }

        public h() {
            AbstractFutureC0656a.f8783f.e(this, Thread.currentThread());
        }
    }

    static {
        b gVar;
        try {
            gVar = new f(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, I1.a.f810e), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, I1.b.f822b), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC0656a.class, h.class, I1.c.f825d), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC0656a.class, e.class, I1.b.f822b), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC0656a.class, Object.class, I1.a.f810e));
            th = null;
        } catch (Throwable th) {
            th = th;
            gVar = new g();
        }
        f8783f = gVar;
        if (th != null) {
            f8782e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f8784g = new Object();
    }

    public static CancellationException c(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    public static void e(AbstractFutureC0656a abstractFutureC0656a) {
        abstractFutureC0656a.k();
        abstractFutureC0656a.b();
        e d3 = abstractFutureC0656a.d(null);
        while (d3 != null) {
            e eVar = d3.f8796c;
            f(d3.f8794a, d3.f8795b);
            d3 = eVar;
        }
    }

    public static void f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e3) {
            f8782e.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e3);
        }
    }

    public static Object h(Future future) {
        Object obj;
        boolean z3 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z3 = true;
            } catch (Throwable th) {
                if (z3) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z3) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void a(StringBuilder sb) {
        try {
            Object h3 = h(this);
            sb.append("SUCCESS, result=[");
            sb.append(n(h3));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e3) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e3.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e4) {
            sb.append("FAILURE, cause=[");
            sb.append(e4.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        Object obj = this.f8785a;
        if (obj == null) {
            if (f8783f.b(this, obj, f8781d ? new c(z3, new CancellationException("Future.cancel() was called.")) : z3 ? c.f8788c : c.f8789d)) {
                if (z3) {
                    i();
                }
                e(this);
                return true;
            }
        }
        return false;
    }

    public final e d(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f8786b;
        } while (!f8783f.a(this, eVar2, e.f8793d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f8796c;
            eVar4.f8796c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    public final Object g(Object obj) {
        if (obj instanceof c) {
            throw c("Task was cancelled.", ((c) obj).f8791b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f8792a);
        }
        if (obj == f8784g) {
            return null;
        }
        return obj;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j3, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j3);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f8785a;
        if (obj != null) {
            return g(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            h hVar = this.f8787c;
            if (hVar != h.f8802c) {
                h hVar2 = new h();
                do {
                    hVar2.a(hVar);
                    if (f8783f.c(this, hVar, hVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                l(hVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f8785a;
                            if (obj2 != null) {
                                return g(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        l(hVar2);
                    } else {
                        hVar = this.f8787c;
                    }
                } while (hVar != h.f8802c);
            }
            return g(this.f8785a);
        }
        while (nanos > 0) {
            Object obj3 = this.f8785a;
            if (obj3 != null) {
                return g(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String abstractFutureC0656a = toString();
        String obj4 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj4.toLowerCase(locale);
        String str = "Waited " + j3 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j4 = -nanos;
            long convert = timeUnit.convert(j4, TimeUnit.NANOSECONDS);
            long nanos2 = j4 - timeUnit.toNanos(convert);
            boolean z3 = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str3 = str2 + convert + " " + lowerCase;
                if (z3) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z3) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + abstractFutureC0656a);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f8785a instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f8785a != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String j() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void k() {
        h hVar;
        do {
            hVar = this.f8787c;
        } while (!f8783f.c(this, hVar, h.f8802c));
        while (hVar != null) {
            hVar.b();
            hVar = hVar.f8804b;
        }
    }

    public final void l(h hVar) {
        hVar.f8803a = null;
        while (true) {
            h hVar2 = this.f8787c;
            if (hVar2 == h.f8802c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.f8804b;
                if (hVar2.f8803a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.f8804b = hVar4;
                    if (hVar3.f8803a == null) {
                        break;
                    }
                } else if (!f8783f.c(this, hVar2, hVar4)) {
                    break;
                }
                hVar2 = hVar4;
            }
            return;
        }
    }

    public boolean m(Object obj) {
        if (obj == null) {
            obj = f8784g;
        }
        if (!f8783f.b(this, null, obj)) {
            return false;
        }
        e(this);
        return true;
    }

    public final String n(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                str = j();
            } catch (RuntimeException e3) {
                str = "Exception thrown from implementation: " + e3.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public void b() {
    }

    public void i() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f8785a;
            if (obj2 != null) {
                return g(obj2);
            }
            h hVar = this.f8787c;
            if (hVar != h.f8802c) {
                h hVar2 = new h();
                do {
                    hVar2.a(hVar);
                    if (f8783f.c(this, hVar, hVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f8785a;
                            } else {
                                l(hVar2);
                                throw new InterruptedException();
                            }
                        } while (!(obj != null));
                        return g(obj);
                    }
                    hVar = this.f8787c;
                } while (hVar != h.f8802c);
            }
            return g(this.f8785a);
        }
        throw new InterruptedException();
    }
}
