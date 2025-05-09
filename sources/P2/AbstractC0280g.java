package P2;

import java.util.Collection;
import java.util.ServiceLoader;

/* renamed from: P2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0280g {

    /* renamed from: a, reason: collision with root package name */
    public static final Collection f1763a = I2.g.c(I2.e.a(ServiceLoader.load(K2.G.class, K2.G.class.getClassLoader()).iterator()));

    public static final Collection a() {
        return f1763a;
    }

    public static final void b(Throwable th) {
        Thread currentThread = Thread.currentThread();
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
    }
}
