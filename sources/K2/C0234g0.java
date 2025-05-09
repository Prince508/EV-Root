package K2;

import P2.AbstractC0276c;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: K2.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0234g0 extends AbstractC0232f0 implements Q {

    /* renamed from: h, reason: collision with root package name */
    public final Executor f1196h;

    public C0234g0(Executor executor) {
        this.f1196h = executor;
        AbstractC0276c.a(q());
    }

    @Override // K2.F
    public void c(s2.i iVar, Runnable runnable) {
        try {
            Executor q3 = q();
            AbstractC0225c.a();
            q3.execute(runnable);
        } catch (RejectedExecutionException e3) {
            AbstractC0225c.a();
            o(iVar, e3);
            V.b().c(iVar, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor q3 = q();
        ExecutorService executorService = q3 instanceof ExecutorService ? (ExecutorService) q3 : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0234g0) && ((C0234g0) obj).q() == q();
    }

    public int hashCode() {
        return System.identityHashCode(q());
    }

    public final void o(s2.i iVar, RejectedExecutionException rejectedExecutionException) {
        t0.c(iVar, AbstractC0230e0.a("The task was rejected", rejectedExecutionException));
    }

    public Executor q() {
        return this.f1196h;
    }

    @Override // K2.F
    public String toString() {
        return q().toString();
    }
}
