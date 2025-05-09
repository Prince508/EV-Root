package P2;

import K2.Q;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: P2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0286m extends K2.F implements Q {

    /* renamed from: l, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1772l = AtomicIntegerFieldUpdater.newUpdater(C0286m.class, "runningWorkers");

    /* renamed from: g, reason: collision with root package name */
    public final K2.F f1773g;

    /* renamed from: h, reason: collision with root package name */
    public final int f1774h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Q f1775i;

    /* renamed from: j, reason: collision with root package name */
    public final r f1776j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f1777k;
    private volatile int runningWorkers;

    /* renamed from: P2.m$a */
    public final class a implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        public Runnable f1778e;

        public a(Runnable runnable) {
            this.f1778e = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i3 = 0;
            while (true) {
                try {
                    this.f1778e.run();
                } catch (Throwable th) {
                    K2.H.a(s2.j.f9292e, th);
                }
                Runnable s3 = C0286m.this.s();
                if (s3 == null) {
                    return;
                }
                this.f1778e = s3;
                i3++;
                if (i3 >= 16 && C0286m.this.f1773g.j(C0286m.this)) {
                    C0286m.this.f1773g.c(C0286m.this, this);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0286m(K2.F f3, int i3) {
        this.f1773g = f3;
        this.f1774h = i3;
        Q q3 = f3 instanceof Q ? (Q) f3 : null;
        this.f1775i = q3 == null ? K2.O.a() : q3;
        this.f1776j = new r(false);
        this.f1777k = new Object();
    }

    @Override // K2.F
    public void c(s2.i iVar, Runnable runnable) {
        Runnable s3;
        this.f1776j.a(runnable);
        if (f1772l.get(this) >= this.f1774h || !t() || (s3 = s()) == null) {
            return;
        }
        this.f1773g.c(this, new a(s3));
    }

    public final Runnable s() {
        while (true) {
            Runnable runnable = (Runnable) this.f1776j.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f1777k) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1772l;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f1776j.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean t() {
        synchronized (this.f1777k) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1772l;
            if (atomicIntegerFieldUpdater.get(this) >= this.f1774h) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }
}
