package T2;

import P2.F;
import P2.I;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final int f2083a;

    /* renamed from: b, reason: collision with root package name */
    public static final F f2084b;

    /* renamed from: c, reason: collision with root package name */
    public static final F f2085c;

    /* renamed from: d, reason: collision with root package name */
    public static final F f2086d;

    /* renamed from: e, reason: collision with root package name */
    public static final F f2087e;

    /* renamed from: f, reason: collision with root package name */
    public static final int f2088f;

    static {
        int e3;
        int e4;
        e3 = I.e("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);
        f2083a = e3;
        f2084b = new F("PERMIT");
        f2085c = new F("TAKEN");
        f2086d = new F("BROKEN");
        f2087e = new F("CANCELLED");
        e4 = I.e("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);
        f2088f = e4;
    }

    public static final f h(long j3, f fVar) {
        return new f(j3, fVar, 0);
    }
}
