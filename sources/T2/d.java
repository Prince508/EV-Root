package T2;

import B2.l;
import B2.p;
import C2.j;
import C2.k;
import K2.InterfaceC0243l;
import K2.N0;
import M2.i;
import P2.AbstractC0277d;
import P2.C;
import P2.D;
import P2.F;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p.AbstractC0657b;
import q2.n;

/* loaded from: classes.dex */
public class d {

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2073c = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "head");

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f2074d = AtomicLongFieldUpdater.newUpdater(d.class, "deqIdx");

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2075e = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "tail");

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f2076f = AtomicLongFieldUpdater.newUpdater(d.class, "enqIdx");

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f2077g = AtomicIntegerFieldUpdater.newUpdater(d.class, "_availablePermits");
    private volatile int _availablePermits;

    /* renamed from: a, reason: collision with root package name */
    public final int f2078a;

    /* renamed from: b, reason: collision with root package name */
    public final l f2079b;
    private volatile long deqIdx;
    private volatile long enqIdx;
    private volatile Object head;
    private volatile Object tail;

    public /* synthetic */ class a extends j implements p {

        /* renamed from: n, reason: collision with root package name */
        public static final a f2080n = new a();

        public a() {
            super(2, e.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        @Override // B2.p
        public /* bridge */ /* synthetic */ Object h(Object obj, Object obj2) {
            return n(((Number) obj).longValue(), (f) obj2);
        }

        public final f n(long j3, f fVar) {
            f h3;
            h3 = e.h(j3, fVar);
            return h3;
        }
    }

    public static final class b extends C2.l implements l {
        public b() {
            super(1);
        }

        public final void a(Throwable th) {
            d.this.h();
        }

        @Override // B2.l
        public /* bridge */ /* synthetic */ Object j(Object obj) {
            a((Throwable) obj);
            return n.f8874a;
        }
    }

    public /* synthetic */ class c extends j implements p {

        /* renamed from: n, reason: collision with root package name */
        public static final c f2082n = new c();

        public c() {
            super(2, e.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        @Override // B2.p
        public /* bridge */ /* synthetic */ Object h(Object obj, Object obj2) {
            return n(((Number) obj).longValue(), (f) obj2);
        }

        public final f n(long j3, f fVar) {
            f h3;
            h3 = e.h(j3, fVar);
            return h3;
        }
    }

    public d(int i3, int i4) {
        this.f2078a = i3;
        if (i3 <= 0) {
            throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i3).toString());
        }
        if (i4 < 0 || i4 > i3) {
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i3).toString());
        }
        f fVar = new f(0L, null, 2);
        this.head = fVar;
        this.tail = fVar;
        this._availablePermits = i3 - i4;
        this.f2079b = new b();
    }

    public final void c(InterfaceC0243l interfaceC0243l) {
        while (f() <= 0) {
            k.c(interfaceC0243l, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (d((N0) interfaceC0243l)) {
                return;
            }
        }
        interfaceC0243l.v(n.f8874a, this.f2079b);
    }

    public final boolean d(N0 n02) {
        int i3;
        Object c3;
        int i4;
        F f3;
        F f4;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2075e;
        f fVar = (f) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f2076f.getAndIncrement(this);
        a aVar = a.f2080n;
        i3 = e.f2088f;
        long j3 = andIncrement / i3;
        loop0: while (true) {
            c3 = AbstractC0277d.c(fVar, j3, aVar);
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
        f fVar2 = (f) D.b(c3);
        i4 = e.f2088f;
        int i5 = (int) (andIncrement % i4);
        if (i.a(fVar2.r(), i5, null, n02)) {
            n02.a(fVar2, i5);
            return true;
        }
        f3 = e.f2084b;
        f4 = e.f2085c;
        if (!i.a(fVar2.r(), i5, f3, f4)) {
            return false;
        }
        if (n02 instanceof InterfaceC0243l) {
            k.c(n02, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            ((InterfaceC0243l) n02).v(n.f8874a, this.f2079b);
            return true;
        }
        throw new IllegalStateException(("unexpected: " + n02).toString());
    }

    public final void e() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        int i4;
        do {
            atomicIntegerFieldUpdater = f2077g;
            i3 = atomicIntegerFieldUpdater.get(this);
            i4 = this.f2078a;
            if (i3 <= i4) {
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, i4));
    }

    public final int f() {
        int andDecrement;
        do {
            andDecrement = f2077g.getAndDecrement(this);
        } while (andDecrement > this.f2078a);
        return andDecrement;
    }

    public int g() {
        return Math.max(f2077g.get(this), 0);
    }

    public void h() {
        do {
            int andIncrement = f2077g.getAndIncrement(this);
            if (andIncrement >= this.f2078a) {
                e();
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.f2078a).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!k());
    }

    public boolean i() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f2077g;
            int i3 = atomicIntegerFieldUpdater.get(this);
            if (i3 > this.f2078a) {
                e();
            } else {
                if (i3 <= 0) {
                    return false;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i3, i3 - 1)) {
                    return true;
                }
            }
        }
    }

    public final boolean j(Object obj) {
        if (!(obj instanceof InterfaceC0243l)) {
            throw new IllegalStateException(("unexpected: " + obj).toString());
        }
        k.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        InterfaceC0243l interfaceC0243l = (InterfaceC0243l) obj;
        Object z3 = interfaceC0243l.z(n.f8874a, null, this.f2079b);
        if (z3 == null) {
            return false;
        }
        interfaceC0243l.I(z3);
        return true;
    }

    public final boolean k() {
        int i3;
        Object c3;
        int i4;
        F f3;
        F f4;
        int i5;
        F f5;
        F f6;
        F f7;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2073c;
        f fVar = (f) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f2074d.getAndIncrement(this);
        i3 = e.f2088f;
        long j3 = andIncrement / i3;
        c cVar = c.f2082n;
        loop0: while (true) {
            c3 = AbstractC0277d.c(fVar, j3, cVar);
            if (D.c(c3)) {
                break;
            }
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
        }
        f fVar2 = (f) D.b(c3);
        fVar2.b();
        if (fVar2.f1739g > j3) {
            return false;
        }
        i4 = e.f2088f;
        int i6 = (int) (andIncrement % i4);
        f3 = e.f2084b;
        Object andSet = fVar2.r().getAndSet(i6, f3);
        if (andSet != null) {
            f4 = e.f2087e;
            if (andSet == f4) {
                return false;
            }
            return j(andSet);
        }
        i5 = e.f2083a;
        for (int i7 = 0; i7 < i5; i7++) {
            Object obj = fVar2.r().get(i6);
            f7 = e.f2085c;
            if (obj == f7) {
                return true;
            }
        }
        f5 = e.f2084b;
        f6 = e.f2086d;
        return !i.a(fVar2.r(), i6, f5, f6);
    }
}
