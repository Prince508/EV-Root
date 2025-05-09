package R2;

import P2.G;
import P2.I;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final String f1948a = G.e("kotlinx.coroutines.scheduler.default.name", "DefaultDispatcher");

    /* renamed from: b, reason: collision with root package name */
    public static final long f1949b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f1950c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f1951d;

    /* renamed from: e, reason: collision with root package name */
    public static final long f1952e;

    /* renamed from: f, reason: collision with root package name */
    public static g f1953f;

    /* renamed from: g, reason: collision with root package name */
    public static final i f1954g;

    /* renamed from: h, reason: collision with root package name */
    public static final i f1955h;

    static {
        long f3;
        int e3;
        int e4;
        long f4;
        f3 = I.f("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 0L, 0L, 12, null);
        f1949b = f3;
        e3 = I.e("kotlinx.coroutines.scheduler.core.pool.size", G2.e.a(G.a(), 2), 1, 0, 8, null);
        f1950c = e3;
        e4 = I.e("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, null);
        f1951d = e4;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f4 = I.f("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 0L, 0L, 12, null);
        f1952e = timeUnit.toNanos(f4);
        f1953f = e.f1938a;
        f1954g = new j(0);
        f1955h = new j(1);
    }
}
