package K2;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public final class N extends AbstractC0222a0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: m, reason: collision with root package name */
    public static final N f1168m;

    /* renamed from: n, reason: collision with root package name */
    public static final long f1169n;

    static {
        Long l3;
        N n3 = new N();
        f1168m = n3;
        Z.w(n3, false, 1, null);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l3 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l3 = 1000L;
        }
        f1169n = timeUnit.toNanos(l3.longValue());
    }

    @Override // K2.AbstractC0222a0, K2.Z
    public void K() {
        debugStatus = 4;
        super.K();
    }

    @Override // K2.AbstractC0224b0
    public Thread L() {
        Thread thread = _thread;
        return thread == null ? X() : thread;
    }

    @Override // K2.AbstractC0222a0
    public void P(Runnable runnable) {
        if (Y()) {
            b0();
        }
        super.P(runnable);
    }

    public final synchronized void W() {
        if (Z()) {
            debugStatus = 3;
            U();
            C2.k.c(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    public final synchronized Thread X() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    public final boolean Y() {
        return debugStatus == 4;
    }

    public final boolean Z() {
        int i3 = debugStatus;
        return i3 == 2 || i3 == 3;
    }

    public final synchronized boolean a0() {
        if (Z()) {
            return false;
        }
        debugStatus = 1;
        C2.k.c(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return true;
    }

    public final void b0() {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean S3;
        J0.f1157a.d(this);
        AbstractC0225c.a();
        try {
            if (!a0()) {
                if (S3) {
                    return;
                } else {
                    return;
                }
            }
            long j3 = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long E3 = E();
                if (E3 == Long.MAX_VALUE) {
                    AbstractC0225c.a();
                    long nanoTime = System.nanoTime();
                    if (j3 == Long.MAX_VALUE) {
                        j3 = f1169n + nanoTime;
                    }
                    long j4 = j3 - nanoTime;
                    if (j4 <= 0) {
                        _thread = null;
                        W();
                        AbstractC0225c.a();
                        if (S()) {
                            return;
                        }
                        L();
                        return;
                    }
                    E3 = G2.e.c(E3, j4);
                } else {
                    j3 = Long.MAX_VALUE;
                }
                if (E3 > 0) {
                    if (Z()) {
                        _thread = null;
                        W();
                        AbstractC0225c.a();
                        if (S()) {
                            return;
                        }
                        L();
                        return;
                    }
                    AbstractC0225c.a();
                    LockSupport.parkNanos(this, E3);
                }
            }
        } finally {
            _thread = null;
            W();
            AbstractC0225c.a();
            if (!S()) {
                L();
            }
        }
    }
}
