package P2;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p.AbstractC0657b;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: e, reason: collision with root package name */
    public static final a f1787e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1788f = AtomicReferenceFieldUpdater.newUpdater(s.class, Object.class, "_next");

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f1789g = AtomicLongFieldUpdater.newUpdater(s.class, "_state");

    /* renamed from: h, reason: collision with root package name */
    public static final F f1790h = new F("REMOVE_FROZEN");
    private volatile Object _next;
    private volatile long _state;

    /* renamed from: a, reason: collision with root package name */
    public final int f1791a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1792b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1793c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReferenceArray f1794d;

    public static final class a {
        public /* synthetic */ a(C2.g gVar) {
            this();
        }

        public final int a(long j3) {
            return (j3 & 2305843009213693952L) != 0 ? 2 : 1;
        }

        public final long b(long j3, int i3) {
            return d(j3, 1073741823L) | i3;
        }

        public final long c(long j3, int i3) {
            return d(j3, 1152921503533105152L) | (i3 << 30);
        }

        public final long d(long j3, long j4) {
            return j3 & (~j4);
        }

        public a() {
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f1795a;

        public b(int i3) {
            this.f1795a = i3;
        }
    }

    public s(int i3, boolean z3) {
        this.f1791a = i3;
        this.f1792b = z3;
        int i4 = i3 - 1;
        this.f1793c = i4;
        this.f1794d = new AtomicReferenceArray(i3);
        if (i4 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i3 & i4) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x004e, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int a(java.lang.Object r13) {
        /*
            r12 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = P2.s.f1789g
        L2:
            long r3 = r0.get(r12)
            r1 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r1 = r1 & r3
            r7 = 0
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L16
            P2.s$a r13 = P2.s.f1787e
            int r13 = r13.a(r3)
            return r13
        L16:
            r1 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r1 = r1 & r3
            int r1 = (int) r1
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r5 = r5 & r3
            r2 = 30
            long r5 = r5 >> r2
            int r9 = (int) r5
            int r10 = r12.f1793c
            int r2 = r9 + 2
            r2 = r2 & r10
            r5 = r1 & r10
            r6 = 1
            if (r2 != r5) goto L30
            return r6
        L30:
            boolean r2 = r12.f1792b
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r2 != 0) goto L4f
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r12.f1794d
            r11 = r9 & r10
            java.lang.Object r2 = r2.get(r11)
            if (r2 == 0) goto L4f
            int r2 = r12.f1791a
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 < r3) goto L4e
            int r9 = r9 - r1
            r1 = r9 & r5
            int r2 = r2 >> 1
            if (r1 <= r2) goto L2
        L4e:
            return r6
        L4f:
            int r1 = r9 + 1
            r1 = r1 & r5
            r2 = r1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = P2.s.f1789g
            P2.s$a r5 = P2.s.f1787e
            long r5 = r5.c(r3, r2)
            r2 = r12
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L2
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r2.f1794d
            r1 = r9 & r10
            r0.set(r1, r13)
            r0 = r2
        L6a:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = P2.s.f1789g
            long r3 = r1.get(r0)
            r5 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r3 = r3 & r5
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 == 0) goto L81
            P2.s r0 = r0.i()
            P2.s r0 = r0.e(r9, r13)
            if (r0 != 0) goto L6a
        L81:
            r13 = 0
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: P2.s.a(java.lang.Object):int");
    }

    public final s b(long j3) {
        s sVar = new s(this.f1791a * 2, this.f1792b);
        int i3 = (int) (1073741823 & j3);
        int i4 = (int) ((1152921503533105152L & j3) >> 30);
        while (true) {
            int i5 = this.f1793c;
            if ((i3 & i5) == (i4 & i5)) {
                f1789g.set(sVar, f1787e.d(j3, 1152921504606846976L));
                return sVar;
            }
            Object obj = this.f1794d.get(i5 & i3);
            if (obj == null) {
                obj = new b(i3);
            }
            sVar.f1794d.set(sVar.f1793c & i3, obj);
            i3++;
        }
    }

    public final s c(long j3) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1788f;
        while (true) {
            s sVar = (s) atomicReferenceFieldUpdater.get(this);
            if (sVar != null) {
                return sVar;
            }
            AbstractC0657b.a(f1788f, this, null, b(j3));
        }
    }

    public final boolean d() {
        long j3;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1789g;
        do {
            j3 = atomicLongFieldUpdater.get(this);
            if ((j3 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j3) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j3, 2305843009213693952L | j3));
        return true;
    }

    public final s e(int i3, Object obj) {
        Object obj2 = this.f1794d.get(this.f1793c & i3);
        if (!(obj2 instanceof b) || ((b) obj2).f1795a != i3) {
            return null;
        }
        this.f1794d.set(i3 & this.f1793c, obj);
        return this;
    }

    public final int f() {
        long j3 = f1789g.get(this);
        return (((int) ((j3 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j3))) & 1073741823;
    }

    public final boolean g() {
        long j3 = f1789g.get(this);
        return ((int) (1073741823 & j3)) == ((int) ((j3 & 1152921503533105152L) >> 30));
    }

    public final long h() {
        long j3;
        long j4;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1789g;
        do {
            j3 = atomicLongFieldUpdater.get(this);
            if ((j3 & 1152921504606846976L) != 0) {
                return j3;
            }
            j4 = 1152921504606846976L | j3;
        } while (!atomicLongFieldUpdater.compareAndSet(this, j3, j4));
        return j4;
    }

    public final s i() {
        return c(h());
    }

    public final Object j() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1789g;
        while (true) {
            long j3 = atomicLongFieldUpdater.get(this);
            if ((1152921504606846976L & j3) != 0) {
                return f1790h;
            }
            int i3 = (int) (1073741823 & j3);
            int i4 = this.f1793c;
            if ((((int) ((1152921503533105152L & j3) >> 30)) & i4) == (i3 & i4)) {
                return null;
            }
            Object obj = this.f1794d.get(i4 & i3);
            if (obj == null) {
                if (this.f1792b) {
                    return null;
                }
            } else {
                if (obj instanceof b) {
                    return null;
                }
                int i5 = (i3 + 1) & 1073741823;
                if (f1789g.compareAndSet(this, j3, f1787e.b(j3, i5))) {
                    this.f1794d.set(this.f1793c & i3, null);
                    return obj;
                }
                if (this.f1792b) {
                    s sVar = this;
                    do {
                        sVar = sVar.k(i3, i5);
                    } while (sVar != null);
                    return obj;
                }
            }
        }
    }

    public final s k(int i3, int i4) {
        long j3;
        int i5;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f1789g;
        do {
            j3 = atomicLongFieldUpdater.get(this);
            i5 = (int) (1073741823 & j3);
            if ((1152921504606846976L & j3) != 0) {
                return i();
            }
        } while (!f1789g.compareAndSet(this, j3, f1787e.b(j3, i4)));
        this.f1794d.set(this.f1793c & i5, null);
        return null;
    }
}
