package K2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p.AbstractC0657b;

/* renamed from: K2.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0222a0 extends AbstractC0224b0 implements Q {

    /* renamed from: j, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1185j = AtomicReferenceFieldUpdater.newUpdater(AbstractC0222a0.class, Object.class, "_queue");

    /* renamed from: k, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1186k = AtomicReferenceFieldUpdater.newUpdater(AbstractC0222a0.class, Object.class, "_delayed");

    /* renamed from: l, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1187l = AtomicIntegerFieldUpdater.newUpdater(AbstractC0222a0.class, "_isCompleted");
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    /* renamed from: K2.a0$a */
    public static final class a extends P2.L {
    }

    private final boolean R() {
        return f1187l.get(this) != 0;
    }

    @Override // K2.Z
    public long E() {
        if (G()) {
            return 0L;
        }
        Runnable O3 = O();
        if (O3 == null) {
            return u();
        }
        O3.run();
        return 0L;
    }

    @Override // K2.Z
    public void K() {
        J0.f1157a.c();
        V(true);
        N();
        while (E() <= 0) {
        }
        T();
    }

    public final void N() {
        P2.F f3;
        P2.F f4;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1185j;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f1185j;
                f3 = AbstractC0228d0.f1190b;
                if (AbstractC0657b.a(atomicReferenceFieldUpdater2, this, null, f3)) {
                    return;
                }
            } else {
                if (obj instanceof P2.s) {
                    ((P2.s) obj).d();
                    return;
                }
                f4 = AbstractC0228d0.f1190b;
                if (obj == f4) {
                    return;
                }
                P2.s sVar = new P2.s(8, true);
                C2.k.c(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                sVar.a((Runnable) obj);
                if (AbstractC0657b.a(f1185j, this, obj, sVar)) {
                    return;
                }
            }
        }
    }

    public final Runnable O() {
        P2.F f3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1185j;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof P2.s) {
                C2.k.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                P2.s sVar = (P2.s) obj;
                Object j3 = sVar.j();
                if (j3 != P2.s.f1790h) {
                    return (Runnable) j3;
                }
                AbstractC0657b.a(f1185j, this, obj, sVar.i());
            } else {
                f3 = AbstractC0228d0.f1190b;
                if (obj == f3) {
                    return null;
                }
                if (AbstractC0657b.a(f1185j, this, obj, null)) {
                    C2.k.c(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                    return (Runnable) obj;
                }
            }
        }
    }

    public void P(Runnable runnable) {
        if (Q(runnable)) {
            M();
        } else {
            N.f1168m.P(runnable);
        }
    }

    public final boolean Q(Runnable runnable) {
        P2.F f3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1185j;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (R()) {
                return false;
            }
            if (obj == null) {
                if (AbstractC0657b.a(f1185j, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof P2.s) {
                C2.k.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                P2.s sVar = (P2.s) obj;
                int a3 = sVar.a(runnable);
                if (a3 == 0) {
                    return true;
                }
                if (a3 == 1) {
                    AbstractC0657b.a(f1185j, this, obj, sVar.i());
                } else if (a3 == 2) {
                    return false;
                }
            } else {
                f3 = AbstractC0228d0.f1190b;
                if (obj == f3) {
                    return false;
                }
                P2.s sVar2 = new P2.s(8, true);
                C2.k.c(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                sVar2.a((Runnable) obj);
                sVar2.a(runnable);
                if (AbstractC0657b.a(f1185j, this, obj, sVar2)) {
                    return true;
                }
            }
        }
    }

    public boolean S() {
        P2.F f3;
        if (!z()) {
            return false;
        }
        Object obj = f1185j.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof P2.s) {
            return ((P2.s) obj).g();
        }
        f3 = AbstractC0228d0.f1190b;
        return obj == f3;
    }

    public final void T() {
        AbstractC0225c.a();
        System.nanoTime();
    }

    public final void U() {
        f1185j.set(this, null);
        f1186k.set(this, null);
    }

    public final void V(boolean z3) {
        f1187l.set(this, z3 ? 1 : 0);
    }

    @Override // K2.F
    public final void c(s2.i iVar, Runnable runnable) {
        P(runnable);
    }

    @Override // K2.Z
    public long u() {
        P2.F f3;
        if (super.u() == 0) {
            return 0L;
        }
        Object obj = f1185j.get(this);
        if (obj != null) {
            if (!(obj instanceof P2.s)) {
                f3 = AbstractC0228d0.f1190b;
                return obj == f3 ? Long.MAX_VALUE : 0L;
            }
            if (!((P2.s) obj).g()) {
                return 0L;
            }
        }
        return Long.MAX_VALUE;
    }
}
