package R2;

import K2.AbstractC0232f0;
import K2.F;
import P2.G;
import P2.I;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class b extends AbstractC0232f0 implements Executor {

    /* renamed from: h, reason: collision with root package name */
    public static final b f1935h = new b();

    /* renamed from: i, reason: collision with root package name */
    public static final F f1936i;

    static {
        int e3;
        m mVar = m.f1956g;
        e3 = I.e("kotlinx.coroutines.io.parallelism", G2.e.a(64, G.a()), 0, 0, 12, null);
        f1936i = mVar.m(e3);
    }

    @Override // K2.F
    public void c(s2.i iVar, Runnable runnable) {
        f1936i.c(iVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        c(s2.j.f9292e, runnable);
    }

    @Override // K2.F
    public String toString() {
        return "Dispatchers.IO";
    }
}
