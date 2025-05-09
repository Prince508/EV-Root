package K2;

import K2.p0;
import P2.q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p.AbstractC0657b;
import q2.AbstractC0672a;
import s2.i;
import t2.AbstractC0732b;
import t2.AbstractC0733c;

/* loaded from: classes.dex */
public class w0 implements p0, InterfaceC0254t, D0 {

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1218e = AtomicReferenceFieldUpdater.newUpdater(w0.class, Object.class, "_state");

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1219f = AtomicReferenceFieldUpdater.newUpdater(w0.class, Object.class, "_parentHandle");
    private volatile Object _parentHandle;
    private volatile Object _state;

    public static final class a extends C0245m {

        /* renamed from: m, reason: collision with root package name */
        public final w0 f1220m;

        public a(s2.e eVar, w0 w0Var) {
            super(eVar, 1);
            this.f1220m = w0Var;
        }

        @Override // K2.C0245m
        public String J() {
            return "AwaitContinuation";
        }

        @Override // K2.C0245m
        public Throwable s(p0 p0Var) {
            Throwable e3;
            Object j02 = this.f1220m.j0();
            return (!(j02 instanceof c) || (e3 = ((c) j02).e()) == null) ? j02 instanceof C0260z ? ((C0260z) j02).f1245a : p0Var.i() : e3;
        }
    }

    public static final class b extends v0 {

        /* renamed from: i, reason: collision with root package name */
        public final w0 f1221i;

        /* renamed from: j, reason: collision with root package name */
        public final c f1222j;

        /* renamed from: k, reason: collision with root package name */
        public final C0253s f1223k;

        /* renamed from: l, reason: collision with root package name */
        public final Object f1224l;

        public b(w0 w0Var, c cVar, C0253s c0253s, Object obj) {
            this.f1221i = w0Var;
            this.f1222j = cVar;
            this.f1223k = c0253s;
            this.f1224l = obj;
        }

        @Override // B2.l
        public /* bridge */ /* synthetic */ Object j(Object obj) {
            y((Throwable) obj);
            return q2.n.f8874a;
        }

        @Override // K2.B
        public void y(Throwable th) {
            this.f1221i.Z(this.f1222j, this.f1223k, this.f1224l);
        }
    }

    public static final class c implements InterfaceC0242k0 {

        /* renamed from: f, reason: collision with root package name */
        public static final AtomicIntegerFieldUpdater f1225f = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isCompleting");

        /* renamed from: g, reason: collision with root package name */
        public static final AtomicReferenceFieldUpdater f1226g = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_rootCause");

        /* renamed from: h, reason: collision with root package name */
        public static final AtomicReferenceFieldUpdater f1227h = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_exceptionsHolder");
        private volatile Object _exceptionsHolder;
        private volatile int _isCompleting;
        private volatile Object _rootCause;

        /* renamed from: e, reason: collision with root package name */
        public final A0 f1228e;

        public c(A0 a02, boolean z3, Throwable th) {
            this.f1228e = a02;
            this._isCompleting = z3 ? 1 : 0;
            this._rootCause = th;
        }

        public final void a(Throwable th) {
            Throwable e3 = e();
            if (e3 == null) {
                m(th);
                return;
            }
            if (th == e3) {
                return;
            }
            Object c3 = c();
            if (c3 == null) {
                l(th);
                return;
            }
            if (c3 instanceof Throwable) {
                if (th == c3) {
                    return;
                }
                ArrayList b3 = b();
                b3.add(c3);
                b3.add(th);
                l(b3);
                return;
            }
            if (c3 instanceof ArrayList) {
                ((ArrayList) c3).add(th);
                return;
            }
            throw new IllegalStateException(("State is " + c3).toString());
        }

        public final ArrayList b() {
            return new ArrayList(4);
        }

        public final Object c() {
            return f1227h.get(this);
        }

        @Override // K2.InterfaceC0242k0
        public boolean d() {
            return e() == null;
        }

        public final Throwable e() {
            return (Throwable) f1226g.get(this);
        }

        @Override // K2.InterfaceC0242k0
        public A0 f() {
            return this.f1228e;
        }

        public final boolean g() {
            return e() != null;
        }

        public final boolean h() {
            return f1225f.get(this) != 0;
        }

        public final boolean i() {
            P2.F f3;
            Object c3 = c();
            f3 = x0.f1235e;
            return c3 == f3;
        }

        public final List j(Throwable th) {
            ArrayList arrayList;
            P2.F f3;
            Object c3 = c();
            if (c3 == null) {
                arrayList = b();
            } else if (c3 instanceof Throwable) {
                ArrayList b3 = b();
                b3.add(c3);
                arrayList = b3;
            } else {
                if (!(c3 instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + c3).toString());
                }
                arrayList = (ArrayList) c3;
            }
            Throwable e3 = e();
            if (e3 != null) {
                arrayList.add(0, e3);
            }
            if (th != null && !C2.k.a(th, e3)) {
                arrayList.add(th);
            }
            f3 = x0.f1235e;
            l(f3);
            return arrayList;
        }

        public final void k(boolean z3) {
            f1225f.set(this, z3 ? 1 : 0);
        }

        public final void l(Object obj) {
            f1227h.set(this, obj);
        }

        public final void m(Throwable th) {
            f1226g.set(this, th);
        }

        public String toString() {
            return "Finishing[cancelling=" + g() + ", completing=" + h() + ", rootCause=" + e() + ", exceptions=" + c() + ", list=" + f() + ']';
        }
    }

    public static final class d extends q.a {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ w0 f1229d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Object f1230e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(P2.q qVar, w0 w0Var, Object obj) {
            super(qVar);
            this.f1229d = w0Var;
            this.f1230e = obj;
        }

        @Override // P2.AbstractC0275b
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Object d(P2.q qVar) {
            if (this.f1229d.j0() == this.f1230e) {
                return null;
            }
            return P2.p.a();
        }
    }

    public w0(boolean z3) {
        this._state = z3 ? x0.f1237g : x0.f1236f;
    }

    public static /* synthetic */ CancellationException I0(w0 w0Var, Throwable th, String str, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((i3 & 1) != 0) {
            str = null;
        }
        return w0Var.H0(th, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [K2.j0] */
    public final void B0(Y y3) {
        A0 a02 = new A0();
        if (!y3.d()) {
            a02 = new C0240j0(a02);
        }
        AbstractC0657b.a(f1218e, this, y3, a02);
    }

    public final void C0(v0 v0Var) {
        v0Var.m(new A0());
        AbstractC0657b.a(f1218e, this, v0Var, v0Var.r());
    }

    public final void D0(v0 v0Var) {
        Object j02;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Y y3;
        do {
            j02 = j0();
            if (!(j02 instanceof v0)) {
                if (!(j02 instanceof InterfaceC0242k0) || ((InterfaceC0242k0) j02).f() == null) {
                    return;
                }
                v0Var.u();
                return;
            }
            if (j02 != v0Var) {
                return;
            }
            atomicReferenceFieldUpdater = f1218e;
            y3 = x0.f1237g;
        } while (!AbstractC0657b.a(atomicReferenceFieldUpdater, this, j02, y3));
    }

    public final void E0(r rVar) {
        f1219f.set(this, rVar);
    }

    public final int F0(Object obj) {
        Y y3;
        if (!(obj instanceof Y)) {
            if (!(obj instanceof C0240j0)) {
                return 0;
            }
            if (!AbstractC0657b.a(f1218e, this, obj, ((C0240j0) obj).f())) {
                return -1;
            }
            A0();
            return 1;
        }
        if (((Y) obj).d()) {
            return 0;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1218e;
        y3 = x0.f1237g;
        if (!AbstractC0657b.a(atomicReferenceFieldUpdater, this, obj, y3)) {
            return -1;
        }
        A0();
        return 1;
    }

    public final String G0(Object obj) {
        if (!(obj instanceof c)) {
            return obj instanceof InterfaceC0242k0 ? ((InterfaceC0242k0) obj).d() ? "Active" : "New" : obj instanceof C0260z ? "Cancelled" : "Completed";
        }
        c cVar = (c) obj;
        return cVar.g() ? "Cancelling" : cVar.h() ? "Completing" : "Active";
    }

    @Override // s2.i
    public s2.i H(i.c cVar) {
        return p0.a.e(this, cVar);
    }

    public final CancellationException H0(Throwable th, String str) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            if (str == null) {
                str = W();
            }
            cancellationException = new q0(str, th, this);
        }
        return cancellationException;
    }

    public final String J0() {
        return u0() + '{' + G0(j0()) + '}';
    }

    public final boolean K0(InterfaceC0242k0 interfaceC0242k0, Object obj) {
        if (!AbstractC0657b.a(f1218e, this, interfaceC0242k0, x0.g(obj))) {
            return false;
        }
        y0(null);
        z0(obj);
        Y(interfaceC0242k0, obj);
        return true;
    }

    public final boolean L0(InterfaceC0242k0 interfaceC0242k0, Throwable th) {
        A0 h02 = h0(interfaceC0242k0);
        if (h02 == null) {
            return false;
        }
        if (!AbstractC0657b.a(f1218e, this, interfaceC0242k0, new c(h02, false, th))) {
            return false;
        }
        w0(h02, th);
        return true;
    }

    public final boolean M(Object obj, A0 a02, v0 v0Var) {
        int x3;
        d dVar = new d(v0Var, this, obj);
        do {
            x3 = a02.s().x(v0Var, a02, dVar);
            if (x3 == 1) {
                return true;
            }
        } while (x3 != 2);
        return false;
    }

    public final Object M0(Object obj, Object obj2) {
        P2.F f3;
        P2.F f4;
        if (!(obj instanceof InterfaceC0242k0)) {
            f4 = x0.f1231a;
            return f4;
        }
        if ((!(obj instanceof Y) && !(obj instanceof v0)) || (obj instanceof C0253s) || (obj2 instanceof C0260z)) {
            return N0((InterfaceC0242k0) obj, obj2);
        }
        if (K0((InterfaceC0242k0) obj, obj2)) {
            return obj2;
        }
        f3 = x0.f1233c;
        return f3;
    }

    public final void N(Throwable th, List list) {
        if (list.size() <= 1) {
            return;
        }
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Throwable th2 = (Throwable) it.next();
            if (th2 != th && th2 != th && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                AbstractC0672a.a(th, th2);
            }
        }
    }

    public final Object N0(InterfaceC0242k0 interfaceC0242k0, Object obj) {
        P2.F f3;
        P2.F f4;
        P2.F f5;
        A0 h02 = h0(interfaceC0242k0);
        if (h02 == null) {
            f5 = x0.f1233c;
            return f5;
        }
        c cVar = interfaceC0242k0 instanceof c ? (c) interfaceC0242k0 : null;
        if (cVar == null) {
            cVar = new c(h02, false, null);
        }
        C2.t tVar = new C2.t();
        synchronized (cVar) {
            if (cVar.h()) {
                f4 = x0.f1231a;
                return f4;
            }
            cVar.k(true);
            if (cVar != interfaceC0242k0 && !AbstractC0657b.a(f1218e, this, interfaceC0242k0, cVar)) {
                f3 = x0.f1233c;
                return f3;
            }
            boolean g3 = cVar.g();
            C0260z c0260z = obj instanceof C0260z ? (C0260z) obj : null;
            if (c0260z != null) {
                cVar.a(c0260z.f1245a);
            }
            Throwable e3 = g3 ? null : cVar.e();
            tVar.f321e = e3;
            q2.n nVar = q2.n.f8874a;
            if (e3 != null) {
                w0(h02, e3);
            }
            C0253s c02 = c0(interfaceC0242k0);
            return (c02 == null || !O0(cVar, c02, obj)) ? b0(cVar, obj) : x0.f1232b;
        }
    }

    public final boolean O0(c cVar, C0253s c0253s, Object obj) {
        while (p0.a.d(c0253s.f1215i, false, false, new b(this, cVar, c0253s, obj), 1, null) == B0.f1147e) {
            c0253s = v0(c0253s);
            if (c0253s == null) {
                return false;
            }
        }
        return true;
    }

    public final Object P(s2.e eVar) {
        Object j02;
        do {
            j02 = j0();
            if (!(j02 instanceof InterfaceC0242k0)) {
                if (j02 instanceof C0260z) {
                    throw ((C0260z) j02).f1245a;
                }
                return x0.h(j02);
            }
        } while (F0(j02) < 0);
        return Q(eVar);
    }

    public final Object Q(s2.e eVar) {
        a aVar = new a(AbstractC0732b.b(eVar), this);
        aVar.A();
        AbstractC0249o.a(aVar, g(new E0(aVar)));
        Object w3 = aVar.w();
        if (w3 == AbstractC0733c.c()) {
            u2.h.c(eVar);
        }
        return w3;
    }

    public final boolean R(Throwable th) {
        return S(th);
    }

    public final boolean S(Object obj) {
        Object obj2;
        P2.F f3;
        P2.F f4;
        P2.F f5;
        obj2 = x0.f1231a;
        if (g0() && (obj2 = U(obj)) == x0.f1232b) {
            return true;
        }
        f3 = x0.f1231a;
        if (obj2 == f3) {
            obj2 = q0(obj);
        }
        f4 = x0.f1231a;
        if (obj2 == f4 || obj2 == x0.f1232b) {
            return true;
        }
        f5 = x0.f1234d;
        if (obj2 == f5) {
            return false;
        }
        O(obj2);
        return true;
    }

    public void T(Throwable th) {
        S(th);
    }

    public final Object U(Object obj) {
        P2.F f3;
        Object M02;
        P2.F f4;
        do {
            Object j02 = j0();
            if (!(j02 instanceof InterfaceC0242k0) || ((j02 instanceof c) && ((c) j02).h())) {
                f3 = x0.f1231a;
                return f3;
            }
            M02 = M0(j02, new C0260z(a0(obj), false, 2, null));
            f4 = x0.f1233c;
        } while (M02 == f4);
        return M02;
    }

    public final boolean V(Throwable th) {
        if (p0()) {
            return true;
        }
        boolean z3 = th instanceof CancellationException;
        r i02 = i0();
        return (i02 == null || i02 == B0.f1147e) ? z3 : i02.c(th) || z3;
    }

    public String W() {
        return "Job was cancelled";
    }

    public boolean X(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return S(th) && f0();
    }

    public final void Y(InterfaceC0242k0 interfaceC0242k0, Object obj) {
        r i02 = i0();
        if (i02 != null) {
            i02.a();
            E0(B0.f1147e);
        }
        C0260z c0260z = obj instanceof C0260z ? (C0260z) obj : null;
        Throwable th = c0260z != null ? c0260z.f1245a : null;
        if (!(interfaceC0242k0 instanceof v0)) {
            A0 f3 = interfaceC0242k0.f();
            if (f3 != null) {
                x0(f3, th);
                return;
            }
            return;
        }
        try {
            ((v0) interfaceC0242k0).y(th);
        } catch (Throwable th2) {
            l0(new C("Exception in completion handler " + interfaceC0242k0 + " for " + this, th2));
        }
    }

    public final void Z(c cVar, C0253s c0253s, Object obj) {
        C0253s v02 = v0(c0253s);
        if (v02 == null || !O0(cVar, v02, obj)) {
            O(b0(cVar, obj));
        }
    }

    @Override // s2.i.b, s2.i
    public i.b a(i.c cVar) {
        return p0.a.c(this, cVar);
    }

    public final Throwable a0(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new q0(W(), null, this) : th;
        }
        C2.k.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((D0) obj).f();
    }

    @Override // K2.p0
    public void b(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new q0(W(), null, this);
        }
        T(cancellationException);
    }

    public final Object b0(c cVar, Object obj) {
        boolean g3;
        Throwable e02;
        C0260z c0260z = obj instanceof C0260z ? (C0260z) obj : null;
        Throwable th = c0260z != null ? c0260z.f1245a : null;
        synchronized (cVar) {
            g3 = cVar.g();
            List j3 = cVar.j(th);
            e02 = e0(cVar, j3);
            if (e02 != null) {
                N(e02, j3);
            }
        }
        if (e02 != null && e02 != th) {
            obj = new C0260z(e02, false, 2, null);
        }
        if (e02 != null && (V(e02) || k0(e02))) {
            C2.k.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            ((C0260z) obj).b();
        }
        if (!g3) {
            y0(e02);
        }
        z0(obj);
        AbstractC0657b.a(f1218e, this, cVar, x0.g(obj));
        Y(cVar, obj);
        return obj;
    }

    public final C0253s c0(InterfaceC0242k0 interfaceC0242k0) {
        C0253s c0253s = interfaceC0242k0 instanceof C0253s ? (C0253s) interfaceC0242k0 : null;
        if (c0253s != null) {
            return c0253s;
        }
        A0 f3 = interfaceC0242k0.f();
        if (f3 != null) {
            return v0(f3);
        }
        return null;
    }

    @Override // K2.p0
    public boolean d() {
        Object j02 = j0();
        return (j02 instanceof InterfaceC0242k0) && ((InterfaceC0242k0) j02).d();
    }

    public final Throwable d0(Object obj) {
        C0260z c0260z = obj instanceof C0260z ? (C0260z) obj : null;
        if (c0260z != null) {
            return c0260z.f1245a;
        }
        return null;
    }

    @Override // s2.i
    public Object e(Object obj, B2.p pVar) {
        return p0.a.b(this, obj, pVar);
    }

    public final Throwable e0(c cVar, List list) {
        Object obj = null;
        if (list.isEmpty()) {
            if (cVar.g()) {
                return new q0(W(), null, this);
            }
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (!(((Throwable) next) instanceof CancellationException)) {
                obj = next;
                break;
            }
        }
        Throwable th = (Throwable) obj;
        return th != null ? th : (Throwable) list.get(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    @Override // K2.D0
    public CancellationException f() {
        CancellationException cancellationException;
        Object j02 = j0();
        if (j02 instanceof c) {
            cancellationException = ((c) j02).e();
        } else if (j02 instanceof C0260z) {
            cancellationException = ((C0260z) j02).f1245a;
        } else {
            if (j02 instanceof InterfaceC0242k0) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + j02).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        if (cancellationException2 != null) {
            return cancellationException2;
        }
        return new q0("Parent job is " + G0(j02), cancellationException, this);
    }

    public boolean f0() {
        return true;
    }

    @Override // K2.p0
    public final W g(B2.l lVar) {
        return p(false, true, lVar);
    }

    public boolean g0() {
        return false;
    }

    @Override // s2.i.b
    public final i.c getKey() {
        return p0.f1211b;
    }

    @Override // K2.p0
    public p0 getParent() {
        r i02 = i0();
        if (i02 != null) {
            return i02.getParent();
        }
        return null;
    }

    @Override // K2.InterfaceC0254t
    public final void h(D0 d02) {
        S(d02);
    }

    public final A0 h0(InterfaceC0242k0 interfaceC0242k0) {
        A0 f3 = interfaceC0242k0.f();
        if (f3 != null) {
            return f3;
        }
        if (interfaceC0242k0 instanceof Y) {
            return new A0();
        }
        if (interfaceC0242k0 instanceof v0) {
            C0((v0) interfaceC0242k0);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + interfaceC0242k0).toString());
    }

    @Override // K2.p0
    public final CancellationException i() {
        Object j02 = j0();
        if (!(j02 instanceof c)) {
            if (j02 instanceof InterfaceC0242k0) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (j02 instanceof C0260z) {
                return I0(this, ((C0260z) j02).f1245a, null, 1, null);
            }
            return new q0(M.a(this) + " has completed normally", null, this);
        }
        Throwable e3 = ((c) j02).e();
        if (e3 != null) {
            CancellationException H02 = H0(e3, M.a(this) + " is cancelling");
            if (H02 != null) {
                return H02;
            }
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    public final r i0() {
        return (r) f1219f.get(this);
    }

    public final Object j0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1218e;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof P2.y)) {
                return obj;
            }
            ((P2.y) obj).a(this);
        }
    }

    @Override // K2.p0
    public final boolean k() {
        int F02;
        do {
            F02 = F0(j0());
            if (F02 == 0) {
                return false;
            }
        } while (F02 != 1);
        return true;
    }

    public boolean k0(Throwable th) {
        return false;
    }

    public final void m0(p0 p0Var) {
        if (p0Var == null) {
            E0(B0.f1147e);
            return;
        }
        p0Var.k();
        r n3 = p0Var.n(this);
        E0(n3);
        if (o0()) {
            n3.a();
            E0(B0.f1147e);
        }
    }

    @Override // K2.p0
    public final r n(InterfaceC0254t interfaceC0254t) {
        W d3 = p0.a.d(this, true, false, new C0253s(interfaceC0254t), 2, null);
        C2.k.c(d3, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (r) d3;
    }

    public final boolean n0() {
        Object j02 = j0();
        if (j02 instanceof C0260z) {
            return true;
        }
        return (j02 instanceof c) && ((c) j02).g();
    }

    public final boolean o0() {
        return !(j0() instanceof InterfaceC0242k0);
    }

    @Override // K2.p0
    public final W p(boolean z3, boolean z4, B2.l lVar) {
        v0 t02 = t0(lVar, z3);
        while (true) {
            Object j02 = j0();
            if (j02 instanceof Y) {
                Y y3 = (Y) j02;
                if (!y3.d()) {
                    B0(y3);
                } else if (AbstractC0657b.a(f1218e, this, j02, t02)) {
                    break;
                }
            } else {
                if (!(j02 instanceof InterfaceC0242k0)) {
                    if (z4) {
                        C0260z c0260z = j02 instanceof C0260z ? (C0260z) j02 : null;
                        lVar.j(c0260z != null ? c0260z.f1245a : null);
                    }
                    return B0.f1147e;
                }
                A0 f3 = ((InterfaceC0242k0) j02).f();
                if (f3 == null) {
                    C2.k.c(j02, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    C0((v0) j02);
                } else {
                    W w3 = B0.f1147e;
                    if (z3 && (j02 instanceof c)) {
                        synchronized (j02) {
                            try {
                                r3 = ((c) j02).e();
                                if (r3 != null) {
                                    if ((lVar instanceof C0253s) && !((c) j02).h()) {
                                    }
                                    q2.n nVar = q2.n.f8874a;
                                }
                                if (M(j02, f3, t02)) {
                                    if (r3 == null) {
                                        return t02;
                                    }
                                    w3 = t02;
                                    q2.n nVar2 = q2.n.f8874a;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    if (r3 != null) {
                        if (z4) {
                            lVar.j(r3);
                        }
                        return w3;
                    }
                    if (M(j02, f3, t02)) {
                        break;
                    }
                }
            }
        }
        return t02;
    }

    public boolean p0() {
        return false;
    }

    public final Object q0(Object obj) {
        P2.F f3;
        P2.F f4;
        P2.F f5;
        P2.F f6;
        P2.F f7;
        P2.F f8;
        Throwable th = null;
        while (true) {
            Object j02 = j0();
            if (j02 instanceof c) {
                synchronized (j02) {
                    if (((c) j02).i()) {
                        f4 = x0.f1234d;
                        return f4;
                    }
                    boolean g3 = ((c) j02).g();
                    if (obj != null || !g3) {
                        if (th == null) {
                            th = a0(obj);
                        }
                        ((c) j02).a(th);
                    }
                    Throwable e3 = g3 ? null : ((c) j02).e();
                    if (e3 != null) {
                        w0(((c) j02).f(), e3);
                    }
                    f3 = x0.f1231a;
                    return f3;
                }
            }
            if (!(j02 instanceof InterfaceC0242k0)) {
                f5 = x0.f1234d;
                return f5;
            }
            if (th == null) {
                th = a0(obj);
            }
            InterfaceC0242k0 interfaceC0242k0 = (InterfaceC0242k0) j02;
            if (!interfaceC0242k0.d()) {
                Object M02 = M0(j02, new C0260z(th, false, 2, null));
                f7 = x0.f1231a;
                if (M02 == f7) {
                    throw new IllegalStateException(("Cannot happen in " + j02).toString());
                }
                f8 = x0.f1233c;
                if (M02 != f8) {
                    return M02;
                }
            } else if (L0(interfaceC0242k0, th)) {
                f6 = x0.f1231a;
                return f6;
            }
        }
    }

    @Override // s2.i
    public s2.i r(s2.i iVar) {
        return p0.a.f(this, iVar);
    }

    public final boolean r0(Object obj) {
        Object M02;
        P2.F f3;
        P2.F f4;
        do {
            M02 = M0(j0(), obj);
            f3 = x0.f1231a;
            if (M02 == f3) {
                return false;
            }
            if (M02 == x0.f1232b) {
                return true;
            }
            f4 = x0.f1233c;
        } while (M02 == f4);
        O(M02);
        return true;
    }

    public final Object s0(Object obj) {
        Object M02;
        P2.F f3;
        P2.F f4;
        do {
            M02 = M0(j0(), obj);
            f3 = x0.f1231a;
            if (M02 == f3) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, d0(obj));
            }
            f4 = x0.f1233c;
        } while (M02 == f4);
        return M02;
    }

    public final v0 t0(B2.l lVar, boolean z3) {
        v0 v0Var;
        if (z3) {
            v0Var = lVar instanceof r0 ? (r0) lVar : null;
            if (v0Var == null) {
                v0Var = new C0248n0(lVar);
            }
        } else {
            v0Var = lVar instanceof v0 ? (v0) lVar : null;
            if (v0Var == null) {
                v0Var = new C0250o0(lVar);
            }
        }
        v0Var.A(this);
        return v0Var;
    }

    public String toString() {
        return J0() + '@' + M.b(this);
    }

    public String u0() {
        return M.a(this);
    }

    public final C0253s v0(P2.q qVar) {
        while (qVar.t()) {
            qVar = qVar.s();
        }
        while (true) {
            qVar = qVar.r();
            if (!qVar.t()) {
                if (qVar instanceof C0253s) {
                    return (C0253s) qVar;
                }
                if (qVar instanceof A0) {
                    return null;
                }
            }
        }
    }

    public final void w0(A0 a02, Throwable th) {
        y0(th);
        Object q3 = a02.q();
        C2.k.c(q3, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        C c3 = null;
        for (P2.q qVar = (P2.q) q3; !C2.k.a(qVar, a02); qVar = qVar.r()) {
            if (qVar instanceof r0) {
                v0 v0Var = (v0) qVar;
                try {
                    v0Var.y(th);
                } catch (Throwable th2) {
                    if (c3 != null) {
                        AbstractC0672a.a(c3, th2);
                    } else {
                        c3 = new C("Exception in completion handler " + v0Var + " for " + this, th2);
                        q2.n nVar = q2.n.f8874a;
                    }
                }
            }
        }
        if (c3 != null) {
            l0(c3);
        }
        V(th);
    }

    public final void x0(A0 a02, Throwable th) {
        Object q3 = a02.q();
        C2.k.c(q3, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        C c3 = null;
        for (P2.q qVar = (P2.q) q3; !C2.k.a(qVar, a02); qVar = qVar.r()) {
            if (qVar instanceof v0) {
                v0 v0Var = (v0) qVar;
                try {
                    v0Var.y(th);
                } catch (Throwable th2) {
                    if (c3 != null) {
                        AbstractC0672a.a(c3, th2);
                    } else {
                        c3 = new C("Exception in completion handler " + v0Var + " for " + this, th2);
                        q2.n nVar = q2.n.f8874a;
                    }
                }
            }
        }
        if (c3 != null) {
            l0(c3);
        }
    }

    public void A0() {
    }

    public void O(Object obj) {
    }

    public void l0(Throwable th) {
        throw th;
    }

    public void y0(Throwable th) {
    }

    public void z0(Object obj) {
    }
}
