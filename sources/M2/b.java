package M2;

import K2.AbstractC0249o;
import K2.C0245m;
import K2.InterfaceC0243l;
import K2.N0;
import P2.AbstractC0277d;
import P2.AbstractC0278e;
import P2.AbstractC0285l;
import P2.C;
import P2.D;
import P2.E;
import P2.F;
import P2.O;
import P2.x;
import j.AbstractC0515e;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p.AbstractC0657b;
import q2.AbstractC0672a;
import q2.h;
import t2.AbstractC0732b;
import t2.AbstractC0733c;
import u2.AbstractC0749b;

/* loaded from: classes.dex */
public class b implements d {

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1376h = AtomicLongFieldUpdater.newUpdater(b.class, "sendersAndCloseStatus");

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1377i = AtomicLongFieldUpdater.newUpdater(b.class, "receivers");

    /* renamed from: j, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1378j = AtomicLongFieldUpdater.newUpdater(b.class, "bufferEnd");

    /* renamed from: k, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1379k = AtomicLongFieldUpdater.newUpdater(b.class, "completedExpandBuffersAndPauseFlag");

    /* renamed from: l, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1380l = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "sendSegment");

    /* renamed from: m, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1381m = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "receiveSegment");

    /* renamed from: n, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1382n = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "bufferEndSegment");

    /* renamed from: o, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1383o = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_closeCause");

    /* renamed from: p, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1384p = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "closeHandler");
    private volatile Object _closeCause;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;

    /* renamed from: e, reason: collision with root package name */
    public final int f1385e;

    /* renamed from: f, reason: collision with root package name */
    public final B2.l f1386f;

    /* renamed from: g, reason: collision with root package name */
    public final B2.q f1387g;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;

    public final class a implements f, N0 {

        /* renamed from: e, reason: collision with root package name */
        public Object f1388e;

        /* renamed from: f, reason: collision with root package name */
        public C0245m f1389f;

        public a() {
            F f3;
            f3 = c.f1409p;
            this.f1388e = f3;
        }

        @Override // K2.N0
        public void a(C c3, int i3) {
            C0245m c0245m = this.f1389f;
            if (c0245m != null) {
                c0245m.a(c3, i3);
            }
        }

        @Override // M2.f
        public Object b(s2.e eVar) {
            F f3;
            F f4;
            F f5;
            b bVar = b.this;
            j jVar = (j) b.f1381m.get(bVar);
            while (!bVar.V()) {
                long andIncrement = b.f1377i.getAndIncrement(bVar);
                int i3 = c.f1395b;
                long j3 = andIncrement / i3;
                int i4 = (int) (andIncrement % i3);
                if (jVar.f1739g != j3) {
                    j H3 = bVar.H(j3, jVar);
                    if (H3 == null) {
                        continue;
                    } else {
                        jVar = H3;
                    }
                }
                Object A02 = bVar.A0(jVar, i4, andIncrement, null);
                f3 = c.f1406m;
                if (A02 == f3) {
                    throw new IllegalStateException("unreachable");
                }
                f4 = c.f1408o;
                if (A02 != f4) {
                    f5 = c.f1407n;
                    if (A02 == f5) {
                        return f(jVar, i4, andIncrement, eVar);
                    }
                    jVar.b();
                    this.f1388e = A02;
                    return AbstractC0749b.a(true);
                }
                if (andIncrement < bVar.O()) {
                    jVar.b();
                }
            }
            return AbstractC0749b.a(g());
        }

        public final Object f(j jVar, int i3, long j3, s2.e eVar) {
            F f3;
            F f4;
            Boolean a3;
            j jVar2;
            F f5;
            F f6;
            F f7;
            b bVar = b.this;
            C0245m b3 = AbstractC0249o.b(AbstractC0732b.b(eVar));
            try {
                this.f1389f = b3;
            } catch (Throwable th) {
                th = th;
            }
            try {
                Object A02 = bVar.A0(jVar, i3, j3, this);
                f3 = c.f1406m;
                if (A02 == f3) {
                    bVar.l0(this, jVar, i3);
                } else {
                    f4 = c.f1408o;
                    B2.l lVar = null;
                    if (A02 == f4) {
                        if (j3 < bVar.O()) {
                            jVar.b();
                        }
                        j jVar3 = (j) b.f1381m.get(bVar);
                        while (true) {
                            if (bVar.V()) {
                                h();
                                break;
                            }
                            long andIncrement = b.f1377i.getAndIncrement(bVar);
                            int i4 = c.f1395b;
                            long j4 = andIncrement / i4;
                            int i5 = (int) (andIncrement % i4);
                            if (jVar3.f1739g != j4) {
                                jVar2 = bVar.H(j4, jVar3);
                                if (jVar2 == null) {
                                }
                            } else {
                                jVar2 = jVar3;
                            }
                            Object A03 = bVar.A0(jVar2, i5, andIncrement, this);
                            f5 = c.f1406m;
                            if (A03 == f5) {
                                bVar.l0(this, jVar2, i5);
                                break;
                            }
                            f6 = c.f1408o;
                            if (A03 == f6) {
                                if (andIncrement < bVar.O()) {
                                    jVar2.b();
                                }
                                jVar3 = jVar2;
                            } else {
                                f7 = c.f1407n;
                                if (A03 == f7) {
                                    throw new IllegalStateException("unexpected");
                                }
                                jVar2.b();
                                this.f1388e = A03;
                                this.f1389f = null;
                                a3 = AbstractC0749b.a(true);
                                B2.l lVar2 = bVar.f1386f;
                                if (lVar2 != null) {
                                    lVar = x.a(lVar2, A03, b3.c());
                                }
                            }
                        }
                    } else {
                        jVar.b();
                        this.f1388e = A02;
                        this.f1389f = null;
                        a3 = AbstractC0749b.a(true);
                        B2.l lVar3 = bVar.f1386f;
                        if (lVar3 != null) {
                            lVar = x.a(lVar3, A02, b3.c());
                        }
                    }
                    b3.v(a3, lVar);
                }
                Object w3 = b3.w();
                if (w3 == AbstractC0733c.c()) {
                    u2.h.c(eVar);
                }
                return w3;
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                b3.L();
                throw th3;
            }
        }

        public final boolean g() {
            this.f1388e = c.z();
            Throwable K3 = b.this.K();
            if (K3 == null) {
                return false;
            }
            throw E.a(K3);
        }

        public final void h() {
            C0245m c0245m = this.f1389f;
            C2.k.b(c0245m);
            this.f1389f = null;
            this.f1388e = c.z();
            Throwable K3 = b.this.K();
            if (K3 == null) {
                h.a aVar = q2.h.f8868e;
                c0245m.u(q2.h.a(Boolean.FALSE));
            } else {
                h.a aVar2 = q2.h.f8868e;
                c0245m.u(q2.h.a(q2.i.a(K3)));
            }
        }

        public final boolean i(Object obj) {
            boolean B3;
            C0245m c0245m = this.f1389f;
            C2.k.b(c0245m);
            this.f1389f = null;
            this.f1388e = obj;
            Boolean bool = Boolean.TRUE;
            B2.l lVar = b.this.f1386f;
            B3 = c.B(c0245m, bool, lVar != null ? x.a(lVar, obj, c0245m.c()) : null);
            return B3;
        }

        public final void j() {
            C0245m c0245m = this.f1389f;
            C2.k.b(c0245m);
            this.f1389f = null;
            this.f1388e = c.z();
            Throwable K3 = b.this.K();
            if (K3 == null) {
                h.a aVar = q2.h.f8868e;
                c0245m.u(q2.h.a(Boolean.FALSE));
            } else {
                h.a aVar2 = q2.h.f8868e;
                c0245m.u(q2.h.a(q2.i.a(K3)));
            }
        }

        @Override // M2.f
        public Object next() {
            F f3;
            F f4;
            Object obj = this.f1388e;
            f3 = c.f1409p;
            if (obj == f3) {
                throw new IllegalStateException("`hasNext()` has not been invoked");
            }
            f4 = c.f1409p;
            this.f1388e = f4;
            if (obj != c.z()) {
                return obj;
            }
            throw E.a(b.this.L());
        }
    }

    /* renamed from: M2.b$b, reason: collision with other inner class name */
    public static final class C0038b extends C2.l implements B2.q {

        /* renamed from: M2.b$b$a */
        public static final class a extends C2.l implements B2.l {

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ Object f1392f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ b f1393g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Object obj, b bVar, S2.a aVar) {
                super(1);
                this.f1392f = obj;
                this.f1393g = bVar;
            }

            public final void a(Throwable th) {
                if (this.f1392f == c.z()) {
                    return;
                }
                B2.l lVar = this.f1393g.f1386f;
                throw null;
            }

            @Override // B2.l
            public /* bridge */ /* synthetic */ Object j(Object obj) {
                a((Throwable) obj);
                return q2.n.f8874a;
            }
        }

        public C0038b() {
            super(3);
        }

        public final B2.l a(S2.a aVar, Object obj, Object obj2) {
            return new a(obj2, b.this, aVar);
        }

        @Override // B2.q
        public /* bridge */ /* synthetic */ Object g(Object obj, Object obj2, Object obj3) {
            AbstractC0515e.a(obj);
            return a(null, obj2, obj3);
        }
    }

    public b(int i3, B2.l lVar) {
        long A3;
        F f3;
        this.f1385e = i3;
        this.f1386f = lVar;
        if (i3 < 0) {
            throw new IllegalArgumentException(("Invalid channel capacity: " + i3 + ", should be >=0").toString());
        }
        A3 = c.A(i3);
        this.bufferEnd = A3;
        this.completedExpandBuffersAndPauseFlag = J();
        j jVar = new j(0L, null, this, 3);
        this.sendSegment = jVar;
        this.receiveSegment = jVar;
        if (Z()) {
            jVar = c.f1394a;
            C2.k.c(jVar, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment = jVar;
        this.f1387g = lVar != null ? new C0038b() : null;
        f3 = c.f1412s;
        this._closeCause = f3;
    }

    public static /* synthetic */ void R(b bVar, long j3, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
        }
        if ((i3 & 1) != 0) {
            j3 = 1;
        }
        bVar.Q(j3);
    }

    public static /* synthetic */ Object n0(b bVar, s2.e eVar) {
        j jVar;
        F f3;
        F f4;
        F f5;
        j jVar2 = (j) f1381m.get(bVar);
        while (!bVar.V()) {
            long andIncrement = f1377i.getAndIncrement(bVar);
            int i3 = c.f1395b;
            long j3 = andIncrement / i3;
            int i4 = (int) (andIncrement % i3);
            if (jVar2.f1739g != j3) {
                j H3 = bVar.H(j3, jVar2);
                if (H3 == null) {
                    continue;
                } else {
                    jVar = H3;
                }
            } else {
                jVar = jVar2;
            }
            b bVar2 = bVar;
            Object A02 = bVar2.A0(jVar, i4, andIncrement, null);
            f3 = c.f1406m;
            if (A02 == f3) {
                throw new IllegalStateException("unexpected");
            }
            f4 = c.f1408o;
            if (A02 != f4) {
                f5 = c.f1407n;
                if (A02 == f5) {
                    return bVar2.o0(jVar, i4, andIncrement, eVar);
                }
                jVar.b();
                return A02;
            }
            if (andIncrement < bVar2.O()) {
                jVar.b();
            }
            bVar = bVar2;
            jVar2 = jVar;
        }
        throw E.a(bVar.L());
    }

    public static /* synthetic */ Object t0(b bVar, Object obj, s2.e eVar) {
        j jVar;
        j jVar2 = (j) f1380l.get(bVar);
        while (true) {
            long andIncrement = f1376h.getAndIncrement(bVar);
            long j3 = andIncrement & 1152921504606846975L;
            boolean X2 = bVar.X(andIncrement);
            int i3 = c.f1395b;
            long j4 = j3 / i3;
            int i4 = (int) (j3 % i3);
            if (jVar2.f1739g != j4) {
                j I3 = bVar.I(j4, jVar2);
                if (I3 != null) {
                    jVar = I3;
                } else if (X2) {
                    Object h02 = bVar.h0(obj, eVar);
                    if (h02 == AbstractC0733c.c()) {
                        return h02;
                    }
                }
            } else {
                jVar = jVar2;
            }
            b bVar2 = bVar;
            Object obj2 = obj;
            int C02 = bVar2.C0(jVar, i4, obj2, j3, null, X2);
            if (C02 == 0) {
                jVar.b();
                break;
            }
            if (C02 == 1) {
                break;
            }
            if (C02 != 2) {
                if (C02 == 3) {
                    Object u02 = bVar2.u0(jVar, i4, obj2, j3, eVar);
                    if (u02 == AbstractC0733c.c()) {
                        return u02;
                    }
                } else if (C02 != 4) {
                    if (C02 == 5) {
                        jVar.b();
                    }
                    bVar = bVar2;
                    jVar2 = jVar;
                    obj = obj2;
                } else {
                    if (j3 < bVar2.M()) {
                        jVar.b();
                    }
                    Object h03 = bVar2.h0(obj2, eVar);
                    if (h03 == AbstractC0733c.c()) {
                        return h03;
                    }
                }
            } else if (X2) {
                jVar.p();
                Object h04 = bVar2.h0(obj2, eVar);
                if (h04 == AbstractC0733c.c()) {
                    return h04;
                }
            }
        }
        return q2.n.f8874a;
    }

    public final void A(long j3) {
        p0(B(j3));
    }

    public final Object A0(j jVar, int i3, long j3, Object obj) {
        F f3;
        F f4;
        F f5;
        Object w3 = jVar.w(i3);
        if (w3 == null) {
            if (j3 >= (f1376h.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    f5 = c.f1407n;
                    return f5;
                }
                if (jVar.r(i3, w3, obj)) {
                    F();
                    f4 = c.f1406m;
                    return f4;
                }
            }
        } else if (w3 == c.f1397d) {
            f3 = c.f1402i;
            if (jVar.r(i3, w3, f3)) {
                F();
                return jVar.y(i3);
            }
        }
        return B0(jVar, i3, j3, obj);
    }

    public final j B(long j3) {
        j y3 = y();
        if (Y()) {
            long a02 = a0(y3);
            if (a02 != -1) {
                D(a02);
            }
        }
        v(y3, j3);
        return y3;
    }

    public final Object B0(j jVar, int i3, long j3, Object obj) {
        F f3;
        F f4;
        F f5;
        F f6;
        F f7;
        F f8;
        F f9;
        F f10;
        F f11;
        F f12;
        F f13;
        F f14;
        F f15;
        F f16;
        F f17;
        F f18;
        while (true) {
            Object w3 = jVar.w(i3);
            if (w3 != null) {
                f7 = c.f1398e;
                if (w3 != f7) {
                    if (w3 == c.f1397d) {
                        f8 = c.f1402i;
                        if (jVar.r(i3, w3, f8)) {
                            F();
                            return jVar.y(i3);
                        }
                    } else {
                        f9 = c.f1403j;
                        if (w3 == f9) {
                            f10 = c.f1408o;
                            return f10;
                        }
                        f11 = c.f1401h;
                        if (w3 == f11) {
                            f12 = c.f1408o;
                            return f12;
                        }
                        if (w3 == c.z()) {
                            F();
                            f13 = c.f1408o;
                            return f13;
                        }
                        f14 = c.f1400g;
                        if (w3 != f14) {
                            f15 = c.f1399f;
                            if (jVar.r(i3, w3, f15)) {
                                boolean z3 = w3 instanceof u;
                                if (z3) {
                                    w3 = ((u) w3).f1430a;
                                }
                                if (x0(w3, jVar, i3)) {
                                    f18 = c.f1402i;
                                    jVar.A(i3, f18);
                                    F();
                                    return jVar.y(i3);
                                }
                                f16 = c.f1403j;
                                jVar.A(i3, f16);
                                jVar.x(i3, false);
                                if (z3) {
                                    F();
                                }
                                f17 = c.f1408o;
                                return f17;
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            if (j3 < (f1376h.get(this) & 1152921504606846975L)) {
                f3 = c.f1401h;
                if (jVar.r(i3, w3, f3)) {
                    F();
                    f4 = c.f1408o;
                    return f4;
                }
            } else {
                if (obj == null) {
                    f5 = c.f1407n;
                    return f5;
                }
                if (jVar.r(i3, w3, obj)) {
                    F();
                    f6 = c.f1406m;
                    return f6;
                }
            }
        }
    }

    public final void C() {
        x();
    }

    public final int C0(j jVar, int i3, Object obj, long j3, Object obj2, boolean z3) {
        F f3;
        F f4;
        F f5;
        jVar.B(i3, obj);
        if (z3) {
            return D0(jVar, i3, obj, j3, obj2, z3);
        }
        Object w3 = jVar.w(i3);
        if (w3 == null) {
            if (t(j3)) {
                if (jVar.r(i3, null, c.f1397d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (jVar.r(i3, null, obj2)) {
                    return 2;
                }
            }
        } else if (w3 instanceof N0) {
            jVar.s(i3);
            if (w0(w3, obj)) {
                f5 = c.f1402i;
                jVar.A(i3, f5);
                j0();
                return 0;
            }
            f3 = c.f1404k;
            Object t3 = jVar.t(i3, f3);
            f4 = c.f1404k;
            if (t3 == f4) {
                return 5;
            }
            jVar.x(i3, true);
            return 5;
        }
        return D0(jVar, i3, obj, j3, obj2, z3);
    }

    public final void D(long j3) {
        F f3;
        O d3;
        j jVar = (j) f1381m.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f1377i;
            long j4 = atomicLongFieldUpdater.get(this);
            if (j3 < Math.max(this.f1385e + j4, J())) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j4, 1 + j4)) {
                int i3 = c.f1395b;
                long j5 = j4 / i3;
                int i4 = (int) (j4 % i3);
                if (jVar.f1739g != j5) {
                    j H3 = H(j5, jVar);
                    if (H3 == null) {
                        continue;
                    } else {
                        jVar = H3;
                    }
                }
                j jVar2 = jVar;
                Object A02 = A0(jVar2, i4, j4, null);
                f3 = c.f1408o;
                if (A02 != f3) {
                    jVar2.b();
                    B2.l lVar = this.f1386f;
                    if (lVar != null && (d3 = x.d(lVar, A02, null, 2, null)) != null) {
                        throw d3;
                    }
                } else if (j4 < O()) {
                    jVar2.b();
                }
                jVar = jVar2;
            }
        }
    }

    public final int D0(j jVar, int i3, Object obj, long j3, Object obj2, boolean z3) {
        F f3;
        F f4;
        F f5;
        F f6;
        F f7;
        F f8;
        F f9;
        while (true) {
            Object w3 = jVar.w(i3);
            if (w3 != null) {
                f4 = c.f1398e;
                if (w3 != f4) {
                    f5 = c.f1404k;
                    if (w3 == f5) {
                        jVar.s(i3);
                        return 5;
                    }
                    f6 = c.f1401h;
                    if (w3 == f6) {
                        jVar.s(i3);
                        return 5;
                    }
                    if (w3 == c.z()) {
                        jVar.s(i3);
                        C();
                        return 4;
                    }
                    jVar.s(i3);
                    if (w3 instanceof u) {
                        w3 = ((u) w3).f1430a;
                    }
                    if (w0(w3, obj)) {
                        f9 = c.f1402i;
                        jVar.A(i3, f9);
                        j0();
                        return 0;
                    }
                    f7 = c.f1404k;
                    Object t3 = jVar.t(i3, f7);
                    f8 = c.f1404k;
                    if (t3 != f8) {
                        jVar.x(i3, true);
                    }
                    return 5;
                }
                if (jVar.r(i3, w3, c.f1397d)) {
                    return 1;
                }
            } else if (!t(j3) || z3) {
                if (z3) {
                    f3 = c.f1403j;
                    if (jVar.r(i3, null, f3)) {
                        jVar.x(i3, false);
                        return 4;
                    }
                } else {
                    if (obj2 == null) {
                        return 3;
                    }
                    if (jVar.r(i3, null, obj2)) {
                        return 2;
                    }
                }
            } else if (jVar.r(i3, null, c.f1397d)) {
                return 1;
            }
        }
    }

    @Override // M2.t
    public void E(B2.l lVar) {
        F f3;
        F f4;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        F f5;
        F f6;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f1384p;
        if (AbstractC0657b.a(atomicReferenceFieldUpdater2, this, null, lVar)) {
            return;
        }
        do {
            Object obj = atomicReferenceFieldUpdater2.get(this);
            f3 = c.f1410q;
            if (obj != f3) {
                f4 = c.f1411r;
                if (obj == f4) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
            atomicReferenceFieldUpdater = f1384p;
            f5 = c.f1410q;
            f6 = c.f1411r;
        } while (!AbstractC0657b.a(atomicReferenceFieldUpdater, this, f5, f6));
        lVar.j(K());
    }

    public final void E0(long j3) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1377i;
        while (true) {
            long j4 = atomicLongFieldUpdater.get(this);
            if (j4 >= j3) {
                return;
            }
            long j5 = j3;
            if (f1377i.compareAndSet(this, j4, j5)) {
                return;
            } else {
                j3 = j5;
            }
        }
    }

    public final void F() {
        if (Z()) {
            return;
        }
        j jVar = (j) f1382n.get(this);
        while (true) {
            long andIncrement = f1378j.getAndIncrement(this);
            int i3 = c.f1395b;
            long j3 = andIncrement / i3;
            if (O() <= andIncrement) {
                if (jVar.f1739g < j3 && jVar.e() != null) {
                    e0(j3, jVar);
                }
                R(this, 0L, 1, null);
                return;
            }
            if (jVar.f1739g != j3) {
                j G3 = G(j3, jVar, andIncrement);
                if (G3 == null) {
                    continue;
                } else {
                    jVar = G3;
                }
            }
            if (y0(jVar, (int) (andIncrement % i3), andIncrement)) {
                R(this, 0L, 1, null);
                return;
            }
            R(this, 0L, 1, null);
        }
    }

    public final void F0(long j3) {
        long j4;
        long w3;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1376h;
        do {
            j4 = atomicLongFieldUpdater.get(this);
            long j5 = 1152921504606846975L & j4;
            if (j5 >= j3) {
                return;
            } else {
                w3 = c.w(j5, (int) (j4 >> 60));
            }
        } while (!f1376h.compareAndSet(this, j4, w3));
    }

    public final j G(long j3, j jVar, long j4) {
        Object c3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1382n;
        B2.p pVar = (B2.p) c.y();
        loop0: while (true) {
            c3 = AbstractC0277d.c(jVar, j3, pVar);
            if (!D.c(c3)) {
                C b3 = D.b(c3);
                while (true) {
                    C c4 = (C) atomicReferenceFieldUpdater.get(this);
                    if (c4.f1739g >= b3.f1739g) {
                        break loop0;
                    }
                    if (!b3.q()) {
                        break;
                    }
                    if (AbstractC0657b.a(atomicReferenceFieldUpdater, this, c4, b3)) {
                        if (c4.m()) {
                            c4.k();
                        }
                    } else if (b3.m()) {
                        b3.k();
                    }
                }
            } else {
                break;
            }
        }
        if (D.c(c3)) {
            C();
            e0(j3, jVar);
            R(this, 0L, 1, null);
            return null;
        }
        j jVar2 = (j) D.b(c3);
        long j5 = jVar2.f1739g;
        if (j5 <= j3) {
            return jVar2;
        }
        int i3 = c.f1395b;
        if (f1378j.compareAndSet(this, j4 + 1, j5 * i3)) {
            Q((jVar2.f1739g * i3) - j4);
        } else {
            R(this, 0L, 1, null);
        }
        return null;
    }

    public final void G0(long j3) {
        int i3;
        long v3;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long v4;
        long v5;
        b bVar = this;
        if (bVar.Z()) {
            return;
        }
        while (bVar.J() <= j3) {
            bVar = this;
        }
        i3 = c.f1396c;
        for (int i4 = 0; i4 < i3; i4++) {
            long J3 = bVar.J();
            if (J3 == (4611686018427387903L & f1379k.get(bVar)) && J3 == bVar.J()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f1379k;
        while (true) {
            long j4 = atomicLongFieldUpdater2.get(bVar);
            v3 = c.v(j4 & 4611686018427387903L, true);
            if (atomicLongFieldUpdater2.compareAndSet(bVar, j4, v3)) {
                break;
            } else {
                bVar = this;
            }
        }
        while (true) {
            long J4 = bVar.J();
            atomicLongFieldUpdater = f1379k;
            long j5 = atomicLongFieldUpdater.get(bVar);
            long j6 = j5 & 4611686018427387903L;
            boolean z3 = (4611686018427387904L & j5) != 0;
            if (J4 == j6 && J4 == bVar.J()) {
                break;
            }
            if (z3) {
                bVar = this;
            } else {
                v4 = c.v(j6, true);
                bVar = this;
                atomicLongFieldUpdater.compareAndSet(bVar, j5, v4);
            }
        }
        while (true) {
            long j7 = atomicLongFieldUpdater.get(bVar);
            v5 = c.v(j7 & 4611686018427387903L, false);
            if (atomicLongFieldUpdater.compareAndSet(bVar, j7, v5)) {
                return;
            } else {
                bVar = this;
            }
        }
    }

    public final j H(long j3, j jVar) {
        Object c3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1381m;
        B2.p pVar = (B2.p) c.y();
        loop0: while (true) {
            c3 = AbstractC0277d.c(jVar, j3, pVar);
            if (!D.c(c3)) {
                C b3 = D.b(c3);
                while (true) {
                    C c4 = (C) atomicReferenceFieldUpdater.get(this);
                    if (c4.f1739g >= b3.f1739g) {
                        break loop0;
                    }
                    if (!b3.q()) {
                        break;
                    }
                    if (AbstractC0657b.a(atomicReferenceFieldUpdater, this, c4, b3)) {
                        if (c4.m()) {
                            c4.k();
                        }
                    } else if (b3.m()) {
                        b3.k();
                    }
                }
            } else {
                break;
            }
        }
        if (D.c(c3)) {
            C();
            if (jVar.f1739g * c.f1395b < O()) {
                jVar.b();
            }
            return null;
        }
        j jVar2 = (j) D.b(c3);
        if (!Z() && j3 <= J() / c.f1395b) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f1382n;
            while (true) {
                C c5 = (C) atomicReferenceFieldUpdater2.get(this);
                if (c5.f1739g >= jVar2.f1739g || !jVar2.q()) {
                    break;
                }
                if (AbstractC0657b.a(atomicReferenceFieldUpdater2, this, c5, jVar2)) {
                    if (c5.m()) {
                        c5.k();
                    }
                } else if (jVar2.m()) {
                    jVar2.k();
                }
            }
        }
        long j4 = jVar2.f1739g;
        if (j4 <= j3) {
            return jVar2;
        }
        int i3 = c.f1395b;
        E0(j4 * i3);
        if (jVar2.f1739g * i3 < O()) {
            jVar2.b();
        }
        return null;
    }

    public final j I(long j3, j jVar) {
        Object c3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1380l;
        B2.p pVar = (B2.p) c.y();
        loop0: while (true) {
            c3 = AbstractC0277d.c(jVar, j3, pVar);
            if (!D.c(c3)) {
                C b3 = D.b(c3);
                while (true) {
                    C c4 = (C) atomicReferenceFieldUpdater.get(this);
                    if (c4.f1739g >= b3.f1739g) {
                        break loop0;
                    }
                    if (!b3.q()) {
                        break;
                    }
                    if (AbstractC0657b.a(atomicReferenceFieldUpdater, this, c4, b3)) {
                        if (c4.m()) {
                            c4.k();
                        }
                    } else if (b3.m()) {
                        b3.k();
                    }
                }
            } else {
                break;
            }
        }
        if (D.c(c3)) {
            C();
            if (jVar.f1739g * c.f1395b < M()) {
                jVar.b();
            }
            return null;
        }
        j jVar2 = (j) D.b(c3);
        long j4 = jVar2.f1739g;
        if (j4 <= j3) {
            return jVar2;
        }
        int i3 = c.f1395b;
        F0(j4 * i3);
        if (jVar2.f1739g * i3 < M()) {
            jVar2.b();
        }
        return null;
    }

    public final long J() {
        return f1378j.get(this);
    }

    public final Throwable K() {
        return (Throwable) f1383o.get(this);
    }

    public final Throwable L() {
        Throwable K3 = K();
        return K3 == null ? new m("Channel was closed") : K3;
    }

    public final long M() {
        return f1377i.get(this);
    }

    public final Throwable N() {
        Throwable K3 = K();
        return K3 == null ? new n("Channel was closed") : K3;
    }

    public final long O() {
        return f1376h.get(this) & 1152921504606846975L;
    }

    public final boolean P() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1381m;
            j jVar = (j) atomicReferenceFieldUpdater.get(this);
            long M3 = M();
            if (O() <= M3) {
                return false;
            }
            int i3 = c.f1395b;
            long j3 = M3 / i3;
            if (jVar.f1739g == j3 || (jVar = H(j3, jVar)) != null) {
                jVar.b();
                if (T(jVar, (int) (M3 % i3), M3)) {
                    return true;
                }
                f1377i.compareAndSet(this, M3, M3 + 1);
            } else if (((j) atomicReferenceFieldUpdater.get(this)).f1739g < j3) {
                return false;
            }
        }
    }

    public final void Q(long j3) {
        if ((f1379k.addAndGet(this, j3) & 4611686018427387904L) != 0) {
            while ((f1379k.get(this) & 4611686018427387904L) != 0) {
            }
        }
    }

    public final void S() {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1384p;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
        } while (!AbstractC0657b.a(atomicReferenceFieldUpdater, this, obj, obj == null ? c.f1410q : c.f1411r));
        if (obj == null) {
            return;
        }
        ((B2.l) obj).j(K());
    }

    public final boolean T(j jVar, int i3, long j3) {
        Object w3;
        F f3;
        F f4;
        F f5;
        F f6;
        F f7;
        F f8;
        F f9;
        do {
            w3 = jVar.w(i3);
            if (w3 != null) {
                f4 = c.f1398e;
                if (w3 != f4) {
                    if (w3 == c.f1397d) {
                        return true;
                    }
                    f5 = c.f1403j;
                    if (w3 == f5 || w3 == c.z()) {
                        return false;
                    }
                    f6 = c.f1402i;
                    if (w3 == f6) {
                        return false;
                    }
                    f7 = c.f1401h;
                    if (w3 == f7) {
                        return false;
                    }
                    f8 = c.f1400g;
                    if (w3 == f8) {
                        return true;
                    }
                    f9 = c.f1399f;
                    return w3 != f9 && j3 == M();
                }
            }
            f3 = c.f1401h;
        } while (!jVar.r(i3, w3, f3));
        F();
        return false;
    }

    public final boolean U(long j3, boolean z3) {
        int i3 = (int) (j3 >> 60);
        if (i3 == 0 || i3 == 1) {
            return false;
        }
        if (i3 == 2) {
            B(j3 & 1152921504606846975L);
            return (z3 && P()) ? false : true;
        }
        if (i3 == 3) {
            A(j3 & 1152921504606846975L);
            return true;
        }
        throw new IllegalStateException(("unexpected close status: " + i3).toString());
    }

    public boolean V() {
        return W(f1376h.get(this));
    }

    public final boolean W(long j3) {
        return U(j3, true);
    }

    public final boolean X(long j3) {
        return U(j3, false);
    }

    public boolean Y() {
        return false;
    }

    public final boolean Z() {
        long J3 = J();
        return J3 == 0 || J3 == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        r8 = (M2.j) r8.g();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a0(M2.j r8) {
        /*
            r7 = this;
        L0:
            int r0 = M2.c.f1395b
            int r0 = r0 + (-1)
        L4:
            r1 = -1
            r3 = -1
            if (r3 >= r0) goto L3c
            long r3 = r8.f1739g
            int r5 = M2.c.f1395b
            long r5 = (long) r5
            long r3 = r3 * r5
            long r5 = (long) r0
            long r3 = r3 + r5
            long r5 = r7.M()
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 >= 0) goto L1a
            return r1
        L1a:
            java.lang.Object r1 = r8.w(r0)
            if (r1 == 0) goto L2c
            P2.F r2 = M2.c.k()
            if (r1 != r2) goto L27
            goto L2c
        L27:
            P2.F r2 = M2.c.f1397d
            if (r1 != r2) goto L39
            return r3
        L2c:
            P2.F r2 = M2.c.z()
            boolean r1 = r8.r(r0, r1, r2)
            if (r1 == 0) goto L1a
            r8.p()
        L39:
            int r0 = r0 + (-1)
            goto L4
        L3c:
            P2.e r8 = r8.g()
            M2.j r8 = (M2.j) r8
            if (r8 != 0) goto L0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: M2.b.a0(M2.j):long");
    }

    @Override // M2.s
    public final void b(CancellationException cancellationException) {
        u(cancellationException);
    }

    public final void b0() {
        long j3;
        long w3;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1376h;
        do {
            j3 = atomicLongFieldUpdater.get(this);
            if (((int) (j3 >> 60)) != 0) {
                return;
            } else {
                w3 = c.w(1152921504606846975L & j3, 1);
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j3, w3));
    }

    public final void c0() {
        long j3;
        long w3;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1376h;
        do {
            j3 = atomicLongFieldUpdater.get(this);
            w3 = c.w(1152921504606846975L & j3, 3);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j3, w3));
    }

    public final void d0() {
        long j3;
        long w3;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1376h;
        do {
            j3 = atomicLongFieldUpdater.get(this);
            int i3 = (int) (j3 >> 60);
            if (i3 == 0) {
                w3 = c.w(1152921504606846975L & j3, 2);
            } else if (i3 != 1) {
                return;
            } else {
                w3 = c.w(1152921504606846975L & j3, 3);
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j3, w3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e0(long r5, M2.j r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.f1739g
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            P2.e r0 = r7.e()
            M2.j r0 = (M2.j) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.h()
            if (r5 == 0) goto L22
            P2.e r5 = r7.e()
            M2.j r5 = (M2.j) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = M2.b.f1382n
        L24:
            java.lang.Object r6 = r5.get(r4)
            P2.C r6 = (P2.C) r6
            long r0 = r6.f1739g
            long r2 = r7.f1739g
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L33
            return
        L33:
            boolean r0 = r7.q()
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r0 = p.AbstractC0657b.a(r5, r4, r6, r7)
            if (r0 == 0) goto L4a
            boolean r5 = r6.m()
            if (r5 == 0) goto L49
            r6.k()
        L49:
            return
        L4a:
            boolean r6 = r7.m()
            if (r6 == 0) goto L24
            r7.k()
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: M2.b.e0(long, M2.j):void");
    }

    public final void g0(InterfaceC0243l interfaceC0243l) {
        h.a aVar = q2.h.f8868e;
        interfaceC0243l.u(q2.h.a(q2.i.a(L())));
    }

    public final Object h0(Object obj, s2.e eVar) {
        O d3;
        C0245m c0245m = new C0245m(AbstractC0732b.b(eVar), 1);
        c0245m.A();
        B2.l lVar = this.f1386f;
        if (lVar == null || (d3 = x.d(lVar, obj, null, 2, null)) == null) {
            Throwable N3 = N();
            h.a aVar = q2.h.f8868e;
            c0245m.u(q2.h.a(q2.i.a(N3)));
        } else {
            AbstractC0672a.a(d3, N());
            h.a aVar2 = q2.h.f8868e;
            c0245m.u(q2.h.a(q2.i.a(d3)));
        }
        Object w3 = c0245m.w();
        if (w3 == AbstractC0733c.c()) {
            u2.h.c(eVar);
        }
        return w3 == AbstractC0733c.c() ? w3 : q2.n.f8874a;
    }

    public final void i0(Object obj, InterfaceC0243l interfaceC0243l) {
        B2.l lVar = this.f1386f;
        if (lVar != null) {
            x.b(lVar, obj, interfaceC0243l.c());
        }
        Throwable N3 = N();
        h.a aVar = q2.h.f8868e;
        interfaceC0243l.u(q2.h.a(q2.i.a(N3)));
    }

    @Override // M2.s
    public f iterator() {
        return new a();
    }

    @Override // M2.t
    public Object j(Object obj, s2.e eVar) {
        return t0(this, obj, eVar);
    }

    public final void l0(N0 n02, j jVar, int i3) {
        k0();
        n02.a(jVar, i3);
    }

    public final void m0(N0 n02, j jVar, int i3) {
        n02.a(jVar, i3 + c.f1395b);
    }

    @Override // M2.s
    public Object o() {
        Object obj;
        j jVar;
        F f3;
        F f4;
        F f5;
        long j3 = f1377i.get(this);
        long j4 = f1376h.get(this);
        if (W(j4)) {
            return h.f1418a.a(K());
        }
        if (j3 >= (j4 & 1152921504606846975L)) {
            return h.f1418a.b();
        }
        obj = c.f1404k;
        j jVar2 = (j) f1381m.get(this);
        while (!V()) {
            long andIncrement = f1377i.getAndIncrement(this);
            int i3 = c.f1395b;
            long j5 = andIncrement / i3;
            int i4 = (int) (andIncrement % i3);
            if (jVar2.f1739g != j5) {
                jVar = H(j5, jVar2);
                if (jVar == null) {
                    continue;
                }
            } else {
                jVar = jVar2;
            }
            Object A02 = A0(jVar, i4, andIncrement, obj);
            f3 = c.f1406m;
            if (A02 == f3) {
                N0 n02 = obj instanceof N0 ? (N0) obj : null;
                if (n02 != null) {
                    l0(n02, jVar, i4);
                }
                G0(andIncrement);
                jVar.p();
                return h.f1418a.b();
            }
            f4 = c.f1408o;
            if (A02 != f4) {
                f5 = c.f1407n;
                if (A02 == f5) {
                    throw new IllegalStateException("unexpected");
                }
                jVar.b();
                return h.f1418a.c(A02);
            }
            if (andIncrement < O()) {
                jVar.b();
            }
            jVar2 = jVar;
        }
        return h.f1418a.a(K());
    }

    public final Object o0(j jVar, int i3, long j3, s2.e eVar) {
        F f3;
        F f4;
        j jVar2;
        F f5;
        F f6;
        F f7;
        C0245m b3 = AbstractC0249o.b(AbstractC0732b.b(eVar));
        try {
            Object A02 = A0(jVar, i3, j3, b3);
            f3 = c.f1406m;
            if (A02 == f3) {
                l0(b3, jVar, i3);
            } else {
                f4 = c.f1408o;
                B2.l lVar = null;
                lVar = null;
                if (A02 == f4) {
                    if (j3 < O()) {
                        jVar.b();
                    }
                    j jVar3 = (j) f1381m.get(this);
                    while (true) {
                        if (V()) {
                            g0(b3);
                            break;
                        }
                        long andIncrement = f1377i.getAndIncrement(this);
                        int i4 = c.f1395b;
                        long j4 = andIncrement / i4;
                        int i5 = (int) (andIncrement % i4);
                        if (jVar3.f1739g != j4) {
                            j H3 = H(j4, jVar3);
                            if (H3 != null) {
                                jVar2 = H3;
                            }
                        } else {
                            jVar2 = jVar3;
                        }
                        A02 = A0(jVar2, i5, andIncrement, b3);
                        j jVar4 = jVar2;
                        f5 = c.f1406m;
                        if (A02 == f5) {
                            C0245m c0245m = b3 != null ? b3 : null;
                            if (c0245m != null) {
                                l0(c0245m, jVar4, i5);
                            }
                        } else {
                            f6 = c.f1408o;
                            if (A02 == f6) {
                                if (andIncrement < O()) {
                                    jVar4.b();
                                }
                                jVar3 = jVar4;
                            } else {
                                f7 = c.f1407n;
                                if (A02 == f7) {
                                    throw new IllegalStateException("unexpected");
                                }
                                jVar4.b();
                                B2.l lVar2 = this.f1386f;
                                if (lVar2 != null) {
                                    lVar = x.a(lVar2, A02, b3.c());
                                }
                            }
                        }
                    }
                } else {
                    jVar.b();
                    B2.l lVar3 = this.f1386f;
                    if (lVar3 != null) {
                        lVar = x.a(lVar3, A02, b3.c());
                    }
                }
                b3.v(A02, lVar);
            }
            Object w3 = b3.w();
            if (w3 == AbstractC0733c.c()) {
                u2.h.c(eVar);
            }
            return w3;
        } catch (Throwable th) {
            b3.L();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x00b3, code lost:
    
        r12 = (M2.j) r12.g();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p0(M2.j r12) {
        /*
            r11 = this;
            B2.l r0 = r11.f1386f
            r1 = 0
            r2 = 1
            java.lang.Object r3 = P2.AbstractC0285l.b(r1, r2, r1)
        L8:
            int r4 = M2.c.f1395b
            int r4 = r4 - r2
        Lb:
            r5 = -1
            if (r5 >= r4) goto Lb3
            long r6 = r12.f1739g
            int r8 = M2.c.f1395b
            long r8 = (long) r8
            long r6 = r6 * r8
            long r8 = (long) r4
            long r6 = r6 + r8
        L16:
            java.lang.Object r8 = r12.w(r4)
            P2.F r9 = M2.c.f()
            if (r8 == r9) goto Lbb
            P2.F r9 = M2.c.f1397d
            if (r8 != r9) goto L48
            long r9 = r11.M()
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 < 0) goto Lbb
            P2.F r9 = M2.c.z()
            boolean r8 = r12.r(r4, r8, r9)
            if (r8 == 0) goto L16
            if (r0 == 0) goto L40
            java.lang.Object r5 = r12.v(r4)
            P2.O r1 = P2.x.c(r0, r5, r1)
        L40:
            r12.s(r4)
            r12.p()
            goto Laf
        L48:
            P2.F r9 = M2.c.k()
            if (r8 == r9) goto La2
            if (r8 != 0) goto L51
            goto La2
        L51:
            boolean r9 = r8 instanceof K2.N0
            if (r9 != 0) goto L6e
            boolean r9 = r8 instanceof M2.u
            if (r9 == 0) goto L5a
            goto L6e
        L5a:
            P2.F r9 = M2.c.p()
            if (r8 == r9) goto Lbb
            P2.F r9 = M2.c.q()
            if (r8 != r9) goto L67
            goto Lbb
        L67:
            P2.F r9 = M2.c.p()
            if (r8 == r9) goto L16
            goto Laf
        L6e:
            long r9 = r11.M()
            int r9 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r9 < 0) goto Lbb
            boolean r9 = r8 instanceof M2.u
            if (r9 == 0) goto L80
            r9 = r8
            M2.u r9 = (M2.u) r9
            K2.N0 r9 = r9.f1430a
            goto L83
        L80:
            r9 = r8
            K2.N0 r9 = (K2.N0) r9
        L83:
            P2.F r10 = M2.c.z()
            boolean r8 = r12.r(r4, r8, r10)
            if (r8 == 0) goto L16
            if (r0 == 0) goto L97
            java.lang.Object r5 = r12.v(r4)
            P2.O r1 = P2.x.c(r0, r5, r1)
        L97:
            java.lang.Object r3 = P2.AbstractC0285l.c(r3, r9)
            r12.s(r4)
            r12.p()
            goto Laf
        La2:
            P2.F r9 = M2.c.z()
            boolean r8 = r12.r(r4, r8, r9)
            if (r8 == 0) goto L16
            r12.p()
        Laf:
            int r4 = r4 + (-1)
            goto Lb
        Lb3:
            P2.e r12 = r12.g()
            M2.j r12 = (M2.j) r12
            if (r12 != 0) goto L8
        Lbb:
            if (r3 == 0) goto Le1
            boolean r12 = r3 instanceof java.util.ArrayList
            if (r12 != 0) goto Lc7
            K2.N0 r3 = (K2.N0) r3
            r11.r0(r3)
            goto Le1
        Lc7:
            java.lang.String r12 = "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }"
            C2.k.c(r3, r12)
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r12 = r3.size()
            int r12 = r12 - r2
        Ld3:
            if (r5 >= r12) goto Le1
            java.lang.Object r0 = r3.get(r12)
            K2.N0 r0 = (K2.N0) r0
            r11.r0(r0)
            int r12 = r12 + (-1)
            goto Ld3
        Le1:
            if (r1 != 0) goto Le4
            return
        Le4:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: M2.b.p0(M2.j):void");
    }

    @Override // M2.t
    public boolean q(Throwable th) {
        return z(th, false);
    }

    public final void q0(N0 n02) {
        s0(n02, true);
    }

    public final void r0(N0 n02) {
        s0(n02, false);
    }

    @Override // M2.t
    public Object s(Object obj) {
        Object obj2;
        Object obj3;
        int i3;
        j jVar;
        b bVar;
        if (v0(f1376h.get(this))) {
            return h.f1418a.b();
        }
        obj2 = c.f1403j;
        j jVar2 = (j) f1380l.get(this);
        while (true) {
            long andIncrement = f1376h.getAndIncrement(this);
            long j3 = andIncrement & 1152921504606846975L;
            boolean X2 = X(andIncrement);
            int i4 = c.f1395b;
            long j4 = j3 / i4;
            int i5 = (int) (j3 % i4);
            if (jVar2.f1739g != j4) {
                j I3 = I(j4, jVar2);
                if (I3 != null) {
                    i3 = i5;
                    jVar = I3;
                    bVar = this;
                    obj3 = obj;
                } else if (X2) {
                    return h.f1418a.a(N());
                }
            } else {
                obj3 = obj;
                i3 = i5;
                jVar = jVar2;
                bVar = this;
            }
            int C02 = bVar.C0(jVar, i3, obj3, j3, obj2, X2);
            jVar2 = jVar;
            if (C02 == 0) {
                jVar2.b();
                return h.f1418a.c(q2.n.f8874a);
            }
            if (C02 == 1) {
                return h.f1418a.c(q2.n.f8874a);
            }
            if (C02 == 2) {
                if (X2) {
                    jVar2.p();
                    return h.f1418a.a(N());
                }
                N0 n02 = obj2 instanceof N0 ? (N0) obj2 : null;
                if (n02 != null) {
                    m0(n02, jVar2, i3);
                }
                jVar2.p();
                return h.f1418a.b();
            }
            if (C02 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (C02 == 4) {
                if (j3 < M()) {
                    jVar2.b();
                }
                return h.f1418a.a(N());
            }
            if (C02 == 5) {
                jVar2.b();
            }
            obj = obj3;
        }
    }

    public final void s0(N0 n02, boolean z3) {
        if (n02 instanceof InterfaceC0243l) {
            s2.e eVar = (s2.e) n02;
            h.a aVar = q2.h.f8868e;
            eVar.u(q2.h.a(q2.i.a(z3 ? L() : N())));
        } else {
            if (n02 instanceof a) {
                ((a) n02).j();
                return;
            }
            throw new IllegalStateException(("Unexpected waiter: " + n02).toString());
        }
    }

    public final boolean t(long j3) {
        return j3 < J() || j3 < M() + ((long) this.f1385e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x01bf, code lost:
    
        r16 = r7;
        r3 = (M2.j) r3.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01c8, code lost:
    
        if (r3 != null) goto L84;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 500
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: M2.b.toString():java.lang.String");
    }

    public boolean u(Throwable th) {
        if (th == null) {
            th = new CancellationException("Channel was cancelled");
        }
        return z(th, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0109 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object u0(M2.j r17, int r18, java.lang.Object r19, long r20, s2.e r22) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: M2.b.u0(M2.j, int, java.lang.Object, long, s2.e):java.lang.Object");
    }

    public final void v(j jVar, long j3) {
        F f3;
        Object b3 = AbstractC0285l.b(null, 1, null);
        loop0: while (jVar != null) {
            for (int i3 = c.f1395b - 1; -1 < i3; i3--) {
                if ((jVar.f1739g * c.f1395b) + i3 < j3) {
                    break loop0;
                }
                while (true) {
                    Object w3 = jVar.w(i3);
                    if (w3 != null) {
                        f3 = c.f1398e;
                        if (w3 != f3) {
                            if (!(w3 instanceof u)) {
                                if (!(w3 instanceof N0)) {
                                    break;
                                }
                                if (jVar.r(i3, w3, c.z())) {
                                    b3 = AbstractC0285l.c(b3, w3);
                                    jVar.x(i3, true);
                                    break;
                                }
                            } else {
                                if (jVar.r(i3, w3, c.z())) {
                                    b3 = AbstractC0285l.c(b3, ((u) w3).f1430a);
                                    jVar.x(i3, true);
                                    break;
                                }
                            }
                        }
                    }
                    if (jVar.r(i3, w3, c.z())) {
                        jVar.p();
                        break;
                    }
                }
            }
            jVar = (j) jVar.g();
        }
        if (b3 != null) {
            if (!(b3 instanceof ArrayList)) {
                q0((N0) b3);
                return;
            }
            C2.k.c(b3, "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
            ArrayList arrayList = (ArrayList) b3;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                q0((N0) arrayList.get(size));
            }
        }
    }

    public final boolean v0(long j3) {
        if (X(j3)) {
            return false;
        }
        return !t(j3 & 1152921504606846975L);
    }

    @Override // M2.s
    public Object w(s2.e eVar) {
        return n0(this, eVar);
    }

    public final boolean w0(Object obj, Object obj2) {
        boolean B3;
        if (obj instanceof a) {
            C2.k.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>");
            return ((a) obj).i(obj2);
        }
        if (!(obj instanceof InterfaceC0243l)) {
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        C2.k.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>");
        InterfaceC0243l interfaceC0243l = (InterfaceC0243l) obj;
        B2.l lVar = this.f1386f;
        B3 = c.B(interfaceC0243l, obj2, lVar != null ? x.a(lVar, obj2, interfaceC0243l.c()) : null);
        return B3;
    }

    @Override // M2.t
    public boolean x() {
        return X(f1376h.get(this));
    }

    public final boolean x0(Object obj, j jVar, int i3) {
        if (obj instanceof InterfaceC0243l) {
            C2.k.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            return c.C((InterfaceC0243l) obj, q2.n.f8874a, null, 2, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    public final j y() {
        Object obj = f1382n.get(this);
        j jVar = (j) f1380l.get(this);
        if (jVar.f1739g > ((j) obj).f1739g) {
            obj = jVar;
        }
        j jVar2 = (j) f1381m.get(this);
        if (jVar2.f1739g > ((j) obj).f1739g) {
            obj = jVar2;
        }
        return (j) AbstractC0277d.b((AbstractC0278e) obj);
    }

    public final boolean y0(j jVar, int i3, long j3) {
        F f3;
        F f4;
        Object w3 = jVar.w(i3);
        if ((w3 instanceof N0) && j3 >= f1377i.get(this)) {
            f3 = c.f1400g;
            if (jVar.r(i3, w3, f3)) {
                if (x0(w3, jVar, i3)) {
                    jVar.A(i3, c.f1397d);
                    return true;
                }
                f4 = c.f1403j;
                jVar.A(i3, f4);
                jVar.x(i3, false);
                return false;
            }
        }
        return z0(jVar, i3, j3);
    }

    public boolean z(Throwable th, boolean z3) {
        F f3;
        if (z3) {
            b0();
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1383o;
        f3 = c.f1412s;
        boolean a3 = AbstractC0657b.a(atomicReferenceFieldUpdater, this, f3, th);
        if (z3) {
            c0();
        } else {
            d0();
        }
        C();
        f0();
        if (a3) {
            S();
        }
        return a3;
    }

    public final boolean z0(j jVar, int i3, long j3) {
        F f3;
        F f4;
        F f5;
        F f6;
        F f7;
        F f8;
        F f9;
        F f10;
        while (true) {
            Object w3 = jVar.w(i3);
            if (!(w3 instanceof N0)) {
                f5 = c.f1403j;
                if (w3 != f5) {
                    if (w3 != null) {
                        if (w3 != c.f1397d) {
                            f7 = c.f1401h;
                            if (w3 == f7) {
                                break;
                            }
                            f8 = c.f1402i;
                            if (w3 == f8) {
                                break;
                            }
                            f9 = c.f1404k;
                            if (w3 == f9 || w3 == c.z()) {
                                return true;
                            }
                            f10 = c.f1399f;
                            if (w3 != f10) {
                                throw new IllegalStateException(("Unexpected cell state: " + w3).toString());
                            }
                        } else {
                            return true;
                        }
                    } else {
                        f6 = c.f1398e;
                        if (jVar.r(i3, w3, f6)) {
                            return true;
                        }
                    }
                } else {
                    return false;
                }
            } else if (j3 >= f1377i.get(this)) {
                f3 = c.f1400g;
                if (jVar.r(i3, w3, f3)) {
                    if (x0(w3, jVar, i3)) {
                        jVar.A(i3, c.f1397d);
                        return true;
                    }
                    f4 = c.f1403j;
                    jVar.A(i3, f4);
                    jVar.x(i3, false);
                    return false;
                }
            } else if (jVar.r(i3, w3, new u((N0) w3))) {
                return true;
            }
        }
    }

    public void f0() {
    }

    public void j0() {
    }

    public void k0() {
    }
}
