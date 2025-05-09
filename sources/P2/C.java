package P2;

import K2.C0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public abstract class C extends AbstractC0278e implements C0 {

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1738h = AtomicIntegerFieldUpdater.newUpdater(C.class, "cleanedAndPointers");
    private volatile int cleanedAndPointers;

    /* renamed from: g, reason: collision with root package name */
    public final long f1739g;

    public C(long j3, C c3, int i3) {
        super(c3);
        this.f1739g = j3;
        this.cleanedAndPointers = i3 << 16;
    }

    @Override // P2.AbstractC0278e
    public boolean h() {
        return f1738h.get(this) == n() && !i();
    }

    public final boolean m() {
        return f1738h.addAndGet(this, -65536) == n() && !i();
    }

    public abstract int n();

    public abstract void o(int i3, Throwable th, s2.i iVar);

    public final void p() {
        if (f1738h.incrementAndGet(this) == n()) {
            k();
        }
    }

    public final boolean q() {
        int i3;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1738h;
        do {
            i3 = atomicIntegerFieldUpdater.get(this);
            if (i3 == n() && !i()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, 65536 + i3));
        return true;
    }
}
