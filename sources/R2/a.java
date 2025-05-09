package R2;

import C2.t;
import K2.AbstractC0225c;
import K2.M;
import P2.A;
import P2.F;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public final class a implements Executor, Closeable {

    /* renamed from: l, reason: collision with root package name */
    public static final C0049a f1907l = new C0049a(null);

    /* renamed from: m, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1908m = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack");

    /* renamed from: n, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1909n = AtomicLongFieldUpdater.newUpdater(a.class, "controlState");

    /* renamed from: o, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1910o = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated");

    /* renamed from: p, reason: collision with root package name */
    public static final F f1911p = new F("NOT_IN_STACK");
    private volatile int _isTerminated;
    private volatile long controlState;

    /* renamed from: e, reason: collision with root package name */
    public final int f1912e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1913f;

    /* renamed from: g, reason: collision with root package name */
    public final long f1914g;

    /* renamed from: h, reason: collision with root package name */
    public final String f1915h;

    /* renamed from: i, reason: collision with root package name */
    public final R2.d f1916i;

    /* renamed from: j, reason: collision with root package name */
    public final R2.d f1917j;

    /* renamed from: k, reason: collision with root package name */
    public final A f1918k;
    private volatile long parkedWorkersStack;

    /* renamed from: R2.a$a, reason: collision with other inner class name */
    public static final class C0049a {
        public /* synthetic */ C0049a(C2.g gVar) {
            this();
        }

        public C0049a() {
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1919a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.PARKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.BLOCKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.CPU_ACQUIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.DORMANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d.TERMINATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f1919a = iArr;
        }
    }

    public enum d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public a(int i3, int i4, long j3, String str) {
        this.f1912e = i3;
        this.f1913f = i4;
        this.f1914g = j3;
        this.f1915h = str;
        if (i3 < 1) {
            throw new IllegalArgumentException(("Core pool size " + i3 + " should be at least 1").toString());
        }
        if (i4 < i3) {
            throw new IllegalArgumentException(("Max pool size " + i4 + " should be greater than or equals to core pool size " + i3).toString());
        }
        if (i4 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i4 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j3 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j3 + " must be positive").toString());
        }
        this.f1916i = new R2.d();
        this.f1917j = new R2.d();
        this.f1918k = new A((i3 + 1) * 2);
        this.controlState = i3 << 42;
        this._isTerminated = 0;
    }

    public static /* synthetic */ void g(a aVar, Runnable runnable, i iVar, boolean z3, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            iVar = l.f1954g;
        }
        if ((i3 & 4) != 0) {
            z3 = false;
        }
        aVar.f(runnable, iVar, z3);
    }

    public static /* synthetic */ boolean s(a aVar, long j3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j3 = f1909n.get(aVar);
        }
        return aVar.r(j3);
    }

    public final boolean b(h hVar) {
        return hVar.f1945f.a() == 1 ? this.f1917j.a(hVar) : this.f1916i.a(hVar);
    }

    public final int c() {
        synchronized (this.f1918k) {
            try {
                if (h()) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f1909n;
                long j3 = atomicLongFieldUpdater.get(this);
                int i3 = (int) (j3 & 2097151);
                int a3 = G2.e.a(i3 - ((int) ((j3 & 4398044413952L) >> 21)), 0);
                if (a3 >= this.f1912e) {
                    return 0;
                }
                if (i3 >= this.f1913f) {
                    return 0;
                }
                int i4 = ((int) (f1909n.get(this) & 2097151)) + 1;
                if (i4 <= 0 || this.f1918k.b(i4) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                c cVar = new c(this, i4);
                this.f1918k.c(i4, cVar);
                if (i4 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i5 = a3 + 1;
                cVar.start();
                return i5;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        n(10000L);
    }

    public final h d(Runnable runnable, i iVar) {
        long a3 = l.f1953f.a();
        if (!(runnable instanceof h)) {
            return new k(runnable, a3, iVar);
        }
        h hVar = (h) runnable;
        hVar.f1944e = a3;
        hVar.f1945f = iVar;
        return hVar;
    }

    public final c e() {
        Thread currentThread = Thread.currentThread();
        c cVar = currentThread instanceof c ? (c) currentThread : null;
        if (cVar == null || !C2.k.a(a.this, this)) {
            return null;
        }
        return cVar;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        g(this, runnable, null, false, 6, null);
    }

    public final void f(Runnable runnable, i iVar, boolean z3) {
        AbstractC0225c.a();
        h d3 = d(runnable, iVar);
        boolean z4 = false;
        boolean z5 = d3.f1945f.a() == 1;
        long addAndGet = z5 ? f1909n.addAndGet(this, 2097152L) : 0L;
        c e3 = e();
        h q3 = q(e3, d3, z3);
        if (q3 != null && !b(q3)) {
            throw new RejectedExecutionException(this.f1915h + " was terminated");
        }
        if (z3 && e3 != null) {
            z4 = true;
        }
        if (z5) {
            o(addAndGet, z4);
        } else {
            if (z4) {
                return;
            }
            p();
        }
    }

    public final boolean h() {
        return f1910o.get(this) != 0;
    }

    public final int i(c cVar) {
        Object i3 = cVar.i();
        while (i3 != f1911p) {
            if (i3 == null) {
                return 0;
            }
            c cVar2 = (c) i3;
            int h3 = cVar2.h();
            if (h3 != 0) {
                return h3;
            }
            i3 = cVar2.i();
        }
        return -1;
    }

    public final c j() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1908m;
        while (true) {
            long j3 = atomicLongFieldUpdater.get(this);
            c cVar = (c) this.f1918k.b((int) (2097151 & j3));
            if (cVar == null) {
                return null;
            }
            long j4 = (2097152 + j3) & (-2097152);
            int i3 = i(cVar);
            if (i3 >= 0 && f1908m.compareAndSet(this, j3, i3 | j4)) {
                cVar.r(f1911p);
                return cVar;
            }
        }
    }

    public final boolean k(c cVar) {
        long j3;
        int h3;
        if (cVar.i() != f1911p) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1908m;
        do {
            j3 = atomicLongFieldUpdater.get(this);
            h3 = cVar.h();
            cVar.r(this.f1918k.b((int) (2097151 & j3)));
        } while (!f1908m.compareAndSet(this, j3, ((2097152 + j3) & (-2097152)) | h3));
        return true;
    }

    public final void l(c cVar, int i3, int i4) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1908m;
        while (true) {
            long j3 = atomicLongFieldUpdater.get(this);
            int i5 = (int) (2097151 & j3);
            long j4 = (2097152 + j3) & (-2097152);
            if (i5 == i3) {
                i5 = i4 == 0 ? i(cVar) : i4;
            }
            if (i5 >= 0) {
                if (f1908m.compareAndSet(this, j3, j4 | i5)) {
                    return;
                }
            }
        }
    }

    public final void m(h hVar) {
        try {
            hVar.run();
        } catch (Throwable th) {
            try {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
            } finally {
                AbstractC0225c.a();
            }
        }
    }

    public final void n(long j3) {
        int i3;
        h hVar;
        if (f1910o.compareAndSet(this, 0, 1)) {
            c e3 = e();
            synchronized (this.f1918k) {
                i3 = (int) (f1909n.get(this) & 2097151);
            }
            if (1 <= i3) {
                int i4 = 1;
                while (true) {
                    Object b3 = this.f1918k.b(i4);
                    C2.k.b(b3);
                    c cVar = (c) b3;
                    if (cVar != e3) {
                        while (cVar.isAlive()) {
                            LockSupport.unpark(cVar);
                            cVar.join(j3);
                        }
                        cVar.f1921e.f(this.f1917j);
                    }
                    if (i4 == i3) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
            this.f1917j.b();
            this.f1916i.b();
            while (true) {
                if (e3 != null) {
                    hVar = e3.g(true);
                    if (hVar != null) {
                        continue;
                        m(hVar);
                    }
                }
                hVar = (h) this.f1916i.d();
                if (hVar == null && (hVar = (h) this.f1917j.d()) == null) {
                    break;
                }
                m(hVar);
            }
            if (e3 != null) {
                e3.u(d.TERMINATED);
            }
            f1908m.set(this, 0L);
            f1909n.set(this, 0L);
        }
    }

    public final void o(long j3, boolean z3) {
        if (z3 || t() || r(j3)) {
            return;
        }
        t();
    }

    public final void p() {
        if (t() || s(this, 0L, 1, null)) {
            return;
        }
        t();
    }

    public final h q(c cVar, h hVar, boolean z3) {
        if (cVar == null || cVar.f1923g == d.TERMINATED) {
            return hVar;
        }
        if (hVar.f1945f.a() == 0 && cVar.f1923g == d.BLOCKING) {
            return hVar;
        }
        cVar.f1927k = true;
        return cVar.f1921e.a(hVar, z3);
    }

    public final boolean r(long j3) {
        if (G2.e.a(((int) (2097151 & j3)) - ((int) ((j3 & 4398044413952L) >> 21)), 0) < this.f1912e) {
            int c3 = c();
            if (c3 == 1 && this.f1912e > 1) {
                c();
            }
            if (c3 > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean t() {
        c j3;
        do {
            j3 = j();
            if (j3 == null) {
                return false;
            }
        } while (!c.j().compareAndSet(j3, -1, 0));
        LockSupport.unpark(j3);
        return true;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        int a3 = this.f1918k.a();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 1; i8 < a3; i8++) {
            c cVar = (c) this.f1918k.b(i8);
            if (cVar != null) {
                int e3 = cVar.f1921e.e();
                int i9 = b.f1919a[cVar.f1923g.ordinal()];
                if (i9 == 1) {
                    i5++;
                } else if (i9 == 2) {
                    i4++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(e3);
                    sb.append('b');
                    arrayList.add(sb.toString());
                } else if (i9 == 3) {
                    i3++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(e3);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (i9 == 4) {
                    i6++;
                    if (e3 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(e3);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (i9 == 5) {
                    i7++;
                }
            }
        }
        long j3 = f1909n.get(this);
        return this.f1915h + '@' + M.b(this) + "[Pool Size {core = " + this.f1912e + ", max = " + this.f1913f + "}, Worker States {CPU = " + i3 + ", blocking = " + i4 + ", parked = " + i5 + ", dormant = " + i6 + ", terminated = " + i7 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f1916i.c() + ", global blocking queue size = " + this.f1917j.c() + ", Control State {created workers= " + ((int) (2097151 & j3)) + ", blocking tasks = " + ((int) ((4398044413952L & j3) >> 21)) + ", CPUs acquired = " + (this.f1912e - ((int) ((9223367638808264704L & j3) >> 42))) + "}]";
    }

    public final class c extends Thread {

        /* renamed from: m, reason: collision with root package name */
        public static final AtomicIntegerFieldUpdater f1920m = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl");

        /* renamed from: e, reason: collision with root package name */
        public final n f1921e;

        /* renamed from: f, reason: collision with root package name */
        public final t f1922f;

        /* renamed from: g, reason: collision with root package name */
        public d f1923g;

        /* renamed from: h, reason: collision with root package name */
        public long f1924h;

        /* renamed from: i, reason: collision with root package name */
        public long f1925i;
        private volatile int indexInArray;

        /* renamed from: j, reason: collision with root package name */
        public int f1926j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f1927k;
        private volatile Object nextParkedWorker;
        private volatile int workerCtl;

        public c() {
            setDaemon(true);
            this.f1921e = new n();
            this.f1922f = new t();
            this.f1923g = d.DORMANT;
            this.nextParkedWorker = a.f1911p;
            this.f1926j = E2.c.f343e.b();
        }

        public static final AtomicIntegerFieldUpdater j() {
            return f1920m;
        }

        public final void b(int i3) {
            if (i3 == 0) {
                return;
            }
            a.f1909n.addAndGet(a.this, -2097152L);
            if (this.f1923g != d.TERMINATED) {
                this.f1923g = d.DORMANT;
            }
        }

        public final void c(int i3) {
            if (i3 != 0 && u(d.BLOCKING)) {
                a.this.p();
            }
        }

        public final void d(h hVar) {
            int a3 = hVar.f1945f.a();
            k(a3);
            c(a3);
            a.this.m(hVar);
            b(a3);
        }

        public final h e(boolean z3) {
            h o3;
            h o4;
            if (z3) {
                boolean z4 = m(a.this.f1912e * 2) == 0;
                if (z4 && (o4 = o()) != null) {
                    return o4;
                }
                h g3 = this.f1921e.g();
                if (g3 != null) {
                    return g3;
                }
                if (!z4 && (o3 = o()) != null) {
                    return o3;
                }
            } else {
                h o5 = o();
                if (o5 != null) {
                    return o5;
                }
            }
            return v(3);
        }

        public final h f() {
            h h3 = this.f1921e.h();
            if (h3 != null) {
                return h3;
            }
            h hVar = (h) a.this.f1917j.d();
            return hVar == null ? v(1) : hVar;
        }

        public final h g(boolean z3) {
            return s() ? e(z3) : f();
        }

        public final int h() {
            return this.indexInArray;
        }

        public final Object i() {
            return this.nextParkedWorker;
        }

        public final void k(int i3) {
            this.f1924h = 0L;
            if (this.f1923g == d.PARKING) {
                this.f1923g = d.BLOCKING;
            }
        }

        public final boolean l() {
            return this.nextParkedWorker != a.f1911p;
        }

        public final int m(int i3) {
            int i4 = this.f1926j;
            int i5 = i4 ^ (i4 << 13);
            int i6 = i5 ^ (i5 >> 17);
            int i7 = i6 ^ (i6 << 5);
            this.f1926j = i7;
            int i8 = i3 - 1;
            return (i8 & i3) == 0 ? i7 & i8 : (i7 & Integer.MAX_VALUE) % i3;
        }

        public final void n() {
            if (this.f1924h == 0) {
                this.f1924h = System.nanoTime() + a.this.f1914g;
            }
            LockSupport.parkNanos(a.this.f1914g);
            if (System.nanoTime() - this.f1924h >= 0) {
                this.f1924h = 0L;
                w();
            }
        }

        public final h o() {
            if (m(2) == 0) {
                h hVar = (h) a.this.f1916i.d();
                return hVar != null ? hVar : (h) a.this.f1917j.d();
            }
            h hVar2 = (h) a.this.f1917j.d();
            return hVar2 != null ? hVar2 : (h) a.this.f1916i.d();
        }

        public final void p() {
            loop0: while (true) {
                boolean z3 = false;
                while (!a.this.h() && this.f1923g != d.TERMINATED) {
                    h g3 = g(this.f1927k);
                    if (g3 != null) {
                        this.f1925i = 0L;
                        d(g3);
                    } else {
                        this.f1927k = false;
                        if (this.f1925i == 0) {
                            t();
                        } else if (z3) {
                            u(d.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f1925i);
                            this.f1925i = 0L;
                        } else {
                            z3 = true;
                        }
                    }
                }
            }
            u(d.TERMINATED);
        }

        public final void q(int i3) {
            StringBuilder sb = new StringBuilder();
            sb.append(a.this.f1915h);
            sb.append("-worker-");
            sb.append(i3 == 0 ? "TERMINATED" : String.valueOf(i3));
            setName(sb.toString());
            this.indexInArray = i3;
        }

        public final void r(Object obj) {
            this.nextParkedWorker = obj;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            p();
        }

        public final boolean s() {
            long j3;
            if (this.f1923g == d.CPU_ACQUIRED) {
                return true;
            }
            a aVar = a.this;
            AtomicLongFieldUpdater atomicLongFieldUpdater = a.f1909n;
            do {
                j3 = atomicLongFieldUpdater.get(aVar);
                if (((int) ((9223367638808264704L & j3) >> 42)) == 0) {
                    return false;
                }
            } while (!a.f1909n.compareAndSet(aVar, j3, j3 - 4398046511104L));
            this.f1923g = d.CPU_ACQUIRED;
            return true;
        }

        public final void t() {
            if (!l()) {
                a.this.k(this);
                return;
            }
            f1920m.set(this, -1);
            while (l() && f1920m.get(this) == -1 && !a.this.h() && this.f1923g != d.TERMINATED) {
                u(d.PARKING);
                Thread.interrupted();
                n();
            }
        }

        public final boolean u(d dVar) {
            d dVar2 = this.f1923g;
            boolean z3 = dVar2 == d.CPU_ACQUIRED;
            if (z3) {
                a.f1909n.addAndGet(a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f1923g = dVar;
            }
            return z3;
        }

        public final h v(int i3) {
            int i4 = (int) (a.f1909n.get(a.this) & 2097151);
            if (i4 < 2) {
                return null;
            }
            int m3 = m(i4);
            a aVar = a.this;
            long j3 = Long.MAX_VALUE;
            for (int i5 = 0; i5 < i4; i5++) {
                m3++;
                if (m3 > i4) {
                    m3 = 1;
                }
                c cVar = (c) aVar.f1918k.b(m3);
                if (cVar != null && cVar != this) {
                    long n3 = cVar.f1921e.n(i3, this.f1922f);
                    if (n3 == -1) {
                        t tVar = this.f1922f;
                        h hVar = (h) tVar.f321e;
                        tVar.f321e = null;
                        return hVar;
                    }
                    if (n3 > 0) {
                        j3 = Math.min(j3, n3);
                    }
                }
            }
            if (j3 == Long.MAX_VALUE) {
                j3 = 0;
            }
            this.f1925i = j3;
            return null;
        }

        public final void w() {
            a aVar = a.this;
            synchronized (aVar.f1918k) {
                try {
                    if (aVar.h()) {
                        return;
                    }
                    if (((int) (a.f1909n.get(aVar) & 2097151)) <= aVar.f1912e) {
                        return;
                    }
                    if (f1920m.compareAndSet(this, -1, 1)) {
                        int i3 = this.indexInArray;
                        q(0);
                        aVar.l(this, i3, 0);
                        int andDecrement = (int) (a.f1909n.getAndDecrement(aVar) & 2097151);
                        if (andDecrement != i3) {
                            Object b3 = aVar.f1918k.b(andDecrement);
                            C2.k.b(b3);
                            c cVar = (c) b3;
                            aVar.f1918k.c(i3, cVar);
                            cVar.q(i3);
                            aVar.l(cVar, andDecrement, i3);
                        }
                        aVar.f1918k.c(andDecrement, null);
                        q2.n nVar = q2.n.f8874a;
                        this.f1923g = d.TERMINATED;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public c(a aVar, int i3) {
            this();
            q(i3);
        }
    }
}
