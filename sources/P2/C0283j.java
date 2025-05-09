package P2;

import K2.C0245m;
import K2.InterfaceC0243l;
import K2.J0;
import K2.T;
import K2.Z;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p.AbstractC0657b;

/* renamed from: P2.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0283j extends T implements u2.e, s2.e {

    /* renamed from: l, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1765l = AtomicReferenceFieldUpdater.newUpdater(C0283j.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* renamed from: h, reason: collision with root package name */
    public final K2.F f1766h;

    /* renamed from: i, reason: collision with root package name */
    public final s2.e f1767i;

    /* renamed from: j, reason: collision with root package name */
    public Object f1768j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f1769k;

    public C0283j(K2.F f3, s2.e eVar) {
        super(-1);
        F f4;
        this.f1766h = f3;
        this.f1767i = eVar;
        f4 = AbstractC0284k.f1770a;
        this.f1768j = f4;
        this.f1769k = J.b(c());
    }

    @Override // K2.T
    public void b(Object obj, Throwable th) {
        if (obj instanceof K2.A) {
            ((K2.A) obj).f1146b.j(th);
        }
    }

    @Override // s2.e
    public s2.i c() {
        return this.f1767i.c();
    }

    @Override // K2.T
    public Object h() {
        F f3;
        Object obj = this.f1768j;
        f3 = AbstractC0284k.f1770a;
        this.f1768j = f3;
        return obj;
    }

    public final void i() {
        while (f1765l.get(this) == AbstractC0284k.f1771b) {
        }
    }

    public final C0245m j() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1765l;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                f1765l.set(this, AbstractC0284k.f1771b);
                return null;
            }
            if (obj instanceof C0245m) {
                if (AbstractC0657b.a(f1765l, this, obj, AbstractC0284k.f1771b)) {
                    return (C0245m) obj;
                }
            } else if (obj != AbstractC0284k.f1771b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final C0245m k() {
        Object obj = f1765l.get(this);
        if (obj instanceof C0245m) {
            return (C0245m) obj;
        }
        return null;
    }

    public final boolean l() {
        return f1765l.get(this) != null;
    }

    @Override // u2.e
    public u2.e m() {
        s2.e eVar = this.f1767i;
        if (eVar instanceof u2.e) {
            return (u2.e) eVar;
        }
        return null;
    }

    public final boolean n(Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1765l;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            F f3 = AbstractC0284k.f1771b;
            if (C2.k.a(obj, f3)) {
                if (AbstractC0657b.a(f1765l, this, f3, th)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (AbstractC0657b.a(f1765l, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    public final void o() {
        i();
        C0245m k3 = k();
        if (k3 != null) {
            k3.p();
        }
    }

    public final Throwable p(InterfaceC0243l interfaceC0243l) {
        F f3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1765l;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            f3 = AbstractC0284k.f1771b;
            if (obj != f3) {
                if (obj instanceof Throwable) {
                    if (AbstractC0657b.a(f1765l, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!AbstractC0657b.a(f1765l, this, f3, interfaceC0243l));
        return null;
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f1766h + ", " + K2.M.c(this.f1767i) + ']';
    }

    @Override // s2.e
    public void u(Object obj) {
        s2.i c3 = this.f1767i.c();
        Object d3 = K2.D.d(obj, null, 1, null);
        if (this.f1766h.j(c3)) {
            this.f1768j = d3;
            this.f1174g = 0;
            this.f1766h.c(c3, this);
            return;
        }
        Z b3 = J0.f1157a.b();
        if (b3.x()) {
            this.f1768j = d3;
            this.f1174g = 0;
            b3.t(this);
            return;
        }
        b3.v(true);
        try {
            s2.i c4 = c();
            Object c5 = J.c(c4, this.f1769k);
            try {
                this.f1767i.u(obj);
                q2.n nVar = q2.n.f8874a;
                while (b3.G()) {
                }
            } finally {
                J.a(c4, c5);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // K2.T
    public s2.e d() {
        return this;
    }
}
