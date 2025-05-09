package R2;

import C2.t;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p.AbstractC0657b;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1957b = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "lastScheduledTask");

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1958c = AtomicIntegerFieldUpdater.newUpdater(n.class, "producerIndex");

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1959d = AtomicIntegerFieldUpdater.newUpdater(n.class, "consumerIndex");

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1960e = AtomicIntegerFieldUpdater.newUpdater(n.class, "blockingTasksInBuffer");

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReferenceArray f1961a = new AtomicReferenceArray(128);
    private volatile int blockingTasksInBuffer;
    private volatile int consumerIndex;
    private volatile Object lastScheduledTask;
    private volatile int producerIndex;

    public final h a(h hVar, boolean z3) {
        if (z3) {
            return b(hVar);
        }
        h hVar2 = (h) f1957b.getAndSet(this, hVar);
        if (hVar2 == null) {
            return null;
        }
        return b(hVar2);
    }

    public final h b(h hVar) {
        if (d() == 127) {
            return hVar;
        }
        if (hVar.f1945f.a() == 1) {
            f1960e.incrementAndGet(this);
        }
        int i3 = f1958c.get(this) & 127;
        while (this.f1961a.get(i3) != null) {
            Thread.yield();
        }
        this.f1961a.lazySet(i3, hVar);
        f1958c.incrementAndGet(this);
        return null;
    }

    public final void c(h hVar) {
        if (hVar == null || hVar.f1945f.a() != 1) {
            return;
        }
        f1960e.decrementAndGet(this);
    }

    public final int d() {
        return f1958c.get(this) - f1959d.get(this);
    }

    public final int e() {
        return f1957b.get(this) != null ? d() + 1 : d();
    }

    public final void f(d dVar) {
        h hVar = (h) f1957b.getAndSet(this, null);
        if (hVar != null) {
            dVar.a(hVar);
        }
        while (j(dVar)) {
        }
    }

    public final h g() {
        h hVar = (h) f1957b.getAndSet(this, null);
        return hVar == null ? i() : hVar;
    }

    public final h h() {
        return k(true);
    }

    public final h i() {
        h hVar;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1959d;
            int i3 = atomicIntegerFieldUpdater.get(this);
            if (i3 - f1958c.get(this) == 0) {
                return null;
            }
            int i4 = i3 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i3, i3 + 1) && (hVar = (h) this.f1961a.getAndSet(i4, null)) != null) {
                c(hVar);
                return hVar;
            }
        }
    }

    public final boolean j(d dVar) {
        h i3 = i();
        if (i3 == null) {
            return false;
        }
        dVar.a(i3);
        return true;
    }

    public final h k(boolean z3) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        h hVar;
        do {
            atomicReferenceFieldUpdater = f1957b;
            hVar = (h) atomicReferenceFieldUpdater.get(this);
            if (hVar != null) {
                if ((hVar.f1945f.a() == 1) == z3) {
                }
            }
            int i3 = f1959d.get(this);
            int i4 = f1958c.get(this);
            while (i3 != i4) {
                if (z3 && f1960e.get(this) == 0) {
                    return null;
                }
                i4--;
                h m3 = m(i4, z3);
                if (m3 != null) {
                    return m3;
                }
            }
            return null;
        } while (!AbstractC0657b.a(atomicReferenceFieldUpdater, this, hVar, null));
        return hVar;
    }

    public final h l(int i3) {
        int i4 = f1959d.get(this);
        int i5 = f1958c.get(this);
        boolean z3 = i3 == 1;
        while (i4 != i5) {
            if (z3 && f1960e.get(this) == 0) {
                return null;
            }
            int i6 = i4 + 1;
            h m3 = m(i4, z3);
            if (m3 != null) {
                return m3;
            }
            i4 = i6;
        }
        return null;
    }

    public final h m(int i3, boolean z3) {
        int i4 = i3 & 127;
        h hVar = (h) this.f1961a.get(i4);
        if (hVar != null) {
            if ((hVar.f1945f.a() == 1) == z3 && M2.i.a(this.f1961a, i4, hVar, null)) {
                if (z3) {
                    f1960e.decrementAndGet(this);
                }
                return hVar;
            }
        }
        return null;
    }

    public final long n(int i3, t tVar) {
        h i4 = i3 == 3 ? i() : l(i3);
        if (i4 == null) {
            return o(i3, tVar);
        }
        tVar.f321e = i4;
        return -1L;
    }

    public final long o(int i3, t tVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        h hVar;
        do {
            atomicReferenceFieldUpdater = f1957b;
            hVar = (h) atomicReferenceFieldUpdater.get(this);
            if (hVar == null) {
                return -2L;
            }
            if (((hVar.f1945f.a() != 1 ? 2 : 1) & i3) == 0) {
                return -2L;
            }
            long a3 = l.f1953f.a() - hVar.f1944e;
            long j3 = l.f1949b;
            if (a3 < j3) {
                return j3 - a3;
            }
        } while (!AbstractC0657b.a(atomicReferenceFieldUpdater, this, hVar, null));
        tVar.f321e = hVar;
        return -1L;
    }
}
