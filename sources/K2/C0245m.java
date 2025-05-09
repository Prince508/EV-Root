package K2;

import K2.p0;
import P2.C0283j;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p.AbstractC0657b;
import t2.AbstractC0733c;

/* renamed from: K2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0245m extends T implements InterfaceC0243l, u2.e, N0 {

    /* renamed from: j, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1200j = AtomicIntegerFieldUpdater.newUpdater(C0245m.class, "_decisionAndIndex");

    /* renamed from: k, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1201k = AtomicReferenceFieldUpdater.newUpdater(C0245m.class, Object.class, "_state");

    /* renamed from: l, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1202l = AtomicReferenceFieldUpdater.newUpdater(C0245m.class, Object.class, "_parentHandle");
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* renamed from: h, reason: collision with root package name */
    public final s2.e f1203h;

    /* renamed from: i, reason: collision with root package name */
    public final s2.i f1204i;

    public C0245m(s2.e eVar, int i3) {
        super(i3);
        this.f1203h = eVar;
        this.f1204i = eVar.c();
        this._decisionAndIndex = 536870911;
        this._state = C0227d.f1188e;
    }

    private final boolean E() {
        if (!U.c(this.f1174g)) {
            return false;
        }
        s2.e eVar = this.f1203h;
        C2.k.c(eVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((C0283j) eVar).l();
    }

    public static /* synthetic */ void O(C0245m c0245m, Object obj, int i3, B2.l lVar, int i4, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i4 & 4) != 0) {
            lVar = null;
        }
        c0245m.N(obj, i3, lVar);
    }

    public void A() {
        W B3 = B();
        if (B3 != null && D()) {
            B3.a();
            f1202l.set(this, B0.f1147e);
        }
    }

    public final W B() {
        p0 p0Var = (p0) c().a(p0.f1211b);
        if (p0Var == null) {
            return null;
        }
        W d3 = p0.a.d(p0Var, true, false, new C0252q(this), 2, null);
        AbstractC0657b.a(f1202l, this, null, d3);
        return d3;
    }

    public final void C(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1201k;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof C0227d)) {
                if (obj2 instanceof AbstractC0239j ? true : obj2 instanceof P2.C) {
                    H(obj, obj2);
                } else {
                    if (obj2 instanceof C0260z) {
                        C0260z c0260z = (C0260z) obj2;
                        if (!c0260z.b()) {
                            H(obj, obj2);
                        }
                        if (obj2 instanceof C0251p) {
                            if (obj2 == null) {
                                c0260z = null;
                            }
                            Throwable th = c0260z != null ? c0260z.f1245a : null;
                            if (obj instanceof AbstractC0239j) {
                                j((AbstractC0239j) obj, th);
                                return;
                            } else {
                                C2.k.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                                l((P2.C) obj, th);
                                return;
                            }
                        }
                        return;
                    }
                    if (obj2 instanceof C0259y) {
                        C0259y c0259y = (C0259y) obj2;
                        if (c0259y.f1239b != null) {
                            H(obj, obj2);
                        }
                        if (obj instanceof P2.C) {
                            return;
                        }
                        C2.k.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        AbstractC0239j abstractC0239j = (AbstractC0239j) obj;
                        if (c0259y.c()) {
                            j(abstractC0239j, c0259y.f1242e);
                            return;
                        } else {
                            if (AbstractC0657b.a(f1201k, this, obj2, C0259y.b(c0259y, null, abstractC0239j, null, null, null, 29, null))) {
                                return;
                            }
                        }
                    } else {
                        if (obj instanceof P2.C) {
                            return;
                        }
                        C2.k.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        if (AbstractC0657b.a(f1201k, this, obj2, new C0259y(obj2, (AbstractC0239j) obj, null, null, null, 28, null))) {
                            return;
                        }
                    }
                }
            } else if (AbstractC0657b.a(f1201k, this, obj2, obj)) {
                return;
            }
        }
    }

    public boolean D() {
        return !(x() instanceof C0);
    }

    public final AbstractC0239j F(B2.l lVar) {
        return lVar instanceof AbstractC0239j ? (AbstractC0239j) lVar : new C0246m0(lVar);
    }

    @Override // K2.InterfaceC0243l
    public void G(B2.l lVar) {
        C(F(lVar));
    }

    public final void H(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    @Override // K2.InterfaceC0243l
    public void I(Object obj) {
        r(this.f1174g);
    }

    public String J() {
        return "CancellableContinuation";
    }

    public final void K(Throwable th) {
        if (o(th)) {
            return;
        }
        n(th);
        q();
    }

    public final void L() {
        Throwable p3;
        s2.e eVar = this.f1203h;
        C0283j c0283j = eVar instanceof C0283j ? (C0283j) eVar : null;
        if (c0283j == null || (p3 = c0283j.p(this)) == null) {
            return;
        }
        p();
        n(p3);
    }

    public final boolean M() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1201k;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if ((obj instanceof C0259y) && ((C0259y) obj).f1241d != null) {
            p();
            return false;
        }
        f1200j.set(this, 536870911);
        atomicReferenceFieldUpdater.set(this, C0227d.f1188e);
        return true;
    }

    public final void N(Object obj, int i3, B2.l lVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1201k;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof C0)) {
                Object obj3 = obj;
                B2.l lVar2 = lVar;
                if (obj2 instanceof C0251p) {
                    C0251p c0251p = (C0251p) obj2;
                    if (c0251p.c()) {
                        if (lVar2 != null) {
                            k(lVar2, c0251p.f1245a);
                            return;
                        }
                        return;
                    }
                }
                i(obj3);
                throw new q2.c();
            }
            Object obj4 = obj;
            int i4 = i3;
            B2.l lVar3 = lVar;
            if (AbstractC0657b.a(f1201k, this, obj2, P((C0) obj2, obj4, i4, lVar3, null))) {
                q();
                r(i4);
                return;
            } else {
                obj = obj4;
                i3 = i4;
                lVar = lVar3;
            }
        }
    }

    public final Object P(C0 c02, Object obj, int i3, B2.l lVar, Object obj2) {
        if (obj instanceof C0260z) {
            return obj;
        }
        if ((U.b(i3) || obj2 != null) && !(lVar == null && !(c02 instanceof AbstractC0239j) && obj2 == null)) {
            return new C0259y(obj, c02 instanceof AbstractC0239j ? (AbstractC0239j) c02 : null, lVar, obj2, null, 16, null);
        }
        return obj;
    }

    public final boolean Q() {
        int i3;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1200j;
        do {
            i3 = atomicIntegerFieldUpdater.get(this);
            int i4 = i3 >> 29;
            if (i4 != 0) {
                if (i4 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f1200j.compareAndSet(this, i3, 1073741824 + (536870911 & i3)));
        return true;
    }

    public final P2.F R(Object obj, Object obj2, B2.l lVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1201k;
        while (true) {
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof C0)) {
                Object obj4 = obj2;
                if ((obj3 instanceof C0259y) && obj4 != null && ((C0259y) obj3).f1241d == obj4) {
                    return AbstractC0247n.f1206a;
                }
                return null;
            }
            Object obj5 = obj;
            Object obj6 = obj2;
            B2.l lVar2 = lVar;
            if (AbstractC0657b.a(f1201k, this, obj3, P((C0) obj3, obj5, this.f1174g, lVar2, obj6))) {
                q();
                return AbstractC0247n.f1206a;
            }
            obj = obj5;
            lVar = lVar2;
            obj2 = obj6;
        }
    }

    public final boolean S() {
        int i3;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1200j;
        do {
            i3 = atomicIntegerFieldUpdater.get(this);
            int i4 = i3 >> 29;
            if (i4 != 0) {
                if (i4 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f1200j.compareAndSet(this, i3, 536870912 + (536870911 & i3)));
        return true;
    }

    @Override // K2.N0
    public void a(P2.C c3, int i3) {
        int i4;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1200j;
        do {
            i4 = atomicIntegerFieldUpdater.get(this);
            if ((i4 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i4, ((i4 >> 29) << 29) + i3));
        C(c3);
    }

    @Override // K2.T
    public void b(Object obj, Throwable th) {
        Throwable th2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1201k;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof C0) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof C0260z) {
                return;
            }
            if (obj2 instanceof C0259y) {
                C0259y c0259y = (C0259y) obj2;
                if (c0259y.c()) {
                    throw new IllegalStateException("Must be called at most once");
                }
                Throwable th3 = th;
                th2 = th3;
                if (AbstractC0657b.a(f1201k, this, obj2, C0259y.b(c0259y, null, null, null, null, th3, 15, null))) {
                    c0259y.d(this, th2);
                    return;
                }
            } else {
                th2 = th;
                if (AbstractC0657b.a(f1201k, this, obj2, new C0259y(obj2, null, null, null, th2, 14, null))) {
                    return;
                }
            }
            th = th2;
        }
    }

    @Override // s2.e
    public s2.i c() {
        return this.f1204i;
    }

    @Override // K2.T
    public final s2.e d() {
        return this.f1203h;
    }

    @Override // K2.T
    public Throwable e(Object obj) {
        Throwable e3 = super.e(obj);
        if (e3 != null) {
            return e3;
        }
        return null;
    }

    @Override // K2.T
    public Object f(Object obj) {
        return obj instanceof C0259y ? ((C0259y) obj).f1238a : obj;
    }

    @Override // K2.T
    public Object h() {
        return x();
    }

    public final Void i(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    public final void j(AbstractC0239j abstractC0239j, Throwable th) {
        try {
            abstractC0239j.a(th);
        } catch (Throwable th2) {
            H.a(c(), new C("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    public final void k(B2.l lVar, Throwable th) {
        try {
            lVar.j(th);
        } catch (Throwable th2) {
            H.a(c(), new C("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void l(P2.C c3, Throwable th) {
        int i3 = f1200j.get(this) & 536870911;
        if (i3 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            c3.o(i3, th, c());
        } catch (Throwable th2) {
            H.a(c(), new C("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // u2.e
    public u2.e m() {
        s2.e eVar = this.f1203h;
        if (eVar instanceof u2.e) {
            return (u2.e) eVar;
        }
        return null;
    }

    public boolean n(Throwable th) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1201k;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof C0)) {
                return false;
            }
        } while (!AbstractC0657b.a(f1201k, this, obj, new C0251p(this, th, (obj instanceof AbstractC0239j) || (obj instanceof P2.C))));
        C0 c02 = (C0) obj;
        if (c02 instanceof AbstractC0239j) {
            j((AbstractC0239j) obj, th);
        } else if (c02 instanceof P2.C) {
            l((P2.C) obj, th);
        }
        q();
        r(this.f1174g);
        return true;
    }

    public final boolean o(Throwable th) {
        if (!E()) {
            return false;
        }
        s2.e eVar = this.f1203h;
        C2.k.c(eVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((C0283j) eVar).n(th);
    }

    public final void p() {
        W t3 = t();
        if (t3 == null) {
            return;
        }
        t3.a();
        f1202l.set(this, B0.f1147e);
    }

    public final void q() {
        if (E()) {
            return;
        }
        p();
    }

    public final void r(int i3) {
        if (Q()) {
            return;
        }
        U.a(this, i3);
    }

    public Throwable s(p0 p0Var) {
        return p0Var.i();
    }

    public final W t() {
        return (W) f1202l.get(this);
    }

    public String toString() {
        return J() + '(' + M.c(this.f1203h) + "){" + y() + "}@" + M.b(this);
    }

    @Override // s2.e
    public void u(Object obj) {
        O(this, D.c(obj, this), this.f1174g, null, 4, null);
    }

    @Override // K2.InterfaceC0243l
    public void v(Object obj, B2.l lVar) {
        N(obj, this.f1174g, lVar);
    }

    public final Object w() {
        p0 p0Var;
        boolean E3 = E();
        if (S()) {
            if (t() == null) {
                B();
            }
            if (E3) {
                L();
            }
            return AbstractC0733c.c();
        }
        if (E3) {
            L();
        }
        Object x3 = x();
        if (x3 instanceof C0260z) {
            throw ((C0260z) x3).f1245a;
        }
        if (!U.b(this.f1174g) || (p0Var = (p0) c().a(p0.f1211b)) == null || p0Var.d()) {
            return f(x3);
        }
        CancellationException i3 = p0Var.i();
        b(x3, i3);
        throw i3;
    }

    public final Object x() {
        return f1201k.get(this);
    }

    public final String y() {
        Object x3 = x();
        return x3 instanceof C0 ? "Active" : x3 instanceof C0251p ? "Cancelled" : "Completed";
    }

    @Override // K2.InterfaceC0243l
    public Object z(Object obj, Object obj2, B2.l lVar) {
        return R(obj, obj2, lVar);
    }
}
