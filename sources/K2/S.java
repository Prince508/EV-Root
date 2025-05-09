package K2;

import P2.AbstractC0284k;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import t2.AbstractC0732b;
import t2.AbstractC0733c;

/* loaded from: classes.dex */
public final class S extends P2.B {

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1173i = AtomicIntegerFieldUpdater.newUpdater(S.class, "_decision");
    private volatile int _decision;

    public S(s2.i iVar, s2.e eVar) {
        super(iVar, eVar);
    }

    private final boolean U0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1173i;
        do {
            int i3 = atomicIntegerFieldUpdater.get(this);
            if (i3 != 0) {
                if (i3 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f1173i.compareAndSet(this, 0, 2));
        return true;
    }

    private final boolean V0() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1173i;
        do {
            int i3 = atomicIntegerFieldUpdater.get(this);
            if (i3 != 0) {
                if (i3 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f1173i.compareAndSet(this, 0, 1));
        return true;
    }

    @Override // P2.B, K2.w0
    public void O(Object obj) {
        P0(obj);
    }

    @Override // P2.B, K2.AbstractC0221a
    public void P0(Object obj) {
        if (U0()) {
            return;
        }
        AbstractC0284k.c(AbstractC0732b.b(this.f1737h), D.a(obj, this.f1737h), null, 2, null);
    }

    public final Object T0() {
        if (V0()) {
            return AbstractC0733c.c();
        }
        Object h3 = x0.h(j0());
        if (h3 instanceof C0260z) {
            throw ((C0260z) h3).f1245a;
        }
        return h3;
    }
}
