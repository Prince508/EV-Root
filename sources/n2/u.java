package N2;

import K2.C0245m;
import P2.F;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p.AbstractC0657b;
import q2.h;
import t2.AbstractC0732b;
import t2.AbstractC0733c;

/* loaded from: classes.dex */
public final class u extends O2.d {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1525a = AtomicReferenceFieldUpdater.newUpdater(u.class, Object.class, "_state");
    private volatile Object _state;

    @Override // O2.d
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(s sVar) {
        F f3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1525a;
        if (atomicReferenceFieldUpdater.get(this) != null) {
            return false;
        }
        f3 = t.f1523a;
        atomicReferenceFieldUpdater.set(this, f3);
        return true;
    }

    public final Object e(s2.e eVar) {
        F f3;
        C0245m c0245m = new C0245m(AbstractC0732b.b(eVar), 1);
        c0245m.A();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1525a;
        f3 = t.f1523a;
        if (!AbstractC0657b.a(atomicReferenceFieldUpdater, this, f3, c0245m)) {
            h.a aVar = q2.h.f8868e;
            c0245m.u(q2.h.a(q2.n.f8874a));
        }
        Object w3 = c0245m.w();
        if (w3 == AbstractC0733c.c()) {
            u2.h.c(eVar);
        }
        return w3 == AbstractC0733c.c() ? w3 : q2.n.f8874a;
    }

    @Override // O2.d
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public s2.e[] b(s sVar) {
        f1525a.set(this, null);
        return O2.c.f1609a;
    }

    public final void g() {
        F f3;
        F f4;
        F f5;
        F f6;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1525a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return;
            }
            f3 = t.f1524b;
            if (obj == f3) {
                return;
            }
            f4 = t.f1523a;
            if (obj == f4) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f1525a;
                f5 = t.f1524b;
                if (AbstractC0657b.a(atomicReferenceFieldUpdater2, this, obj, f5)) {
                    return;
                }
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f1525a;
                f6 = t.f1523a;
                if (AbstractC0657b.a(atomicReferenceFieldUpdater3, this, obj, f6)) {
                    h.a aVar = q2.h.f8868e;
                    ((C0245m) obj).u(q2.h.a(q2.n.f8874a));
                    return;
                }
            }
        }
    }

    public final boolean h() {
        F f3;
        F f4;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1525a;
        f3 = t.f1523a;
        Object andSet = atomicReferenceFieldUpdater.getAndSet(this, f3);
        C2.k.b(andSet);
        f4 = t.f1524b;
        return andSet == f4;
    }
}
