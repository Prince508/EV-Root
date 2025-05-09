package P2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p.AbstractC0657b;

/* loaded from: classes.dex */
public class q {

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1781e = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_next");

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1782f = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_prev");

    /* renamed from: g, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1783g = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_removedRef");
    private volatile Object _next = this;
    private volatile Object _prev = this;
    private volatile Object _removedRef;

    public static abstract class a extends AbstractC0275b {

        /* renamed from: b, reason: collision with root package name */
        public final q f1784b;

        /* renamed from: c, reason: collision with root package name */
        public q f1785c;

        public a(q qVar) {
            this.f1784b = qVar;
        }

        @Override // P2.AbstractC0275b
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(q qVar, Object obj) {
            boolean z3 = obj == null;
            q qVar2 = z3 ? this.f1784b : this.f1785c;
            if (qVar2 != null && AbstractC0657b.a(q.f1781e, qVar, this, qVar2) && z3) {
                q qVar3 = this.f1784b;
                q qVar4 = this.f1785c;
                C2.k.b(qVar4);
                qVar3.p(qVar4);
            }
        }
    }

    public final boolean m(q qVar) {
        f1782f.lazySet(qVar, this);
        f1781e.lazySet(qVar, this);
        while (q() == this) {
            if (AbstractC0657b.a(f1781e, this, this, qVar)) {
                qVar.p(this);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
    
        if (p.AbstractC0657b.a(r4, r3, r2, ((P2.z) r5).f1801a) != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final P2.q n(P2.y r9) {
        /*
            r8 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = P2.q.f1782f
            java.lang.Object r0 = r0.get(r8)
            P2.q r0 = (P2.q) r0
            r1 = 0
            r2 = r0
        La:
            r3 = r1
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = P2.q.f1781e
            java.lang.Object r5 = r4.get(r2)
            if (r5 != r8) goto L1f
            if (r0 != r2) goto L16
            goto L28
        L16:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = P2.q.f1782f
            boolean r0 = p.AbstractC0657b.a(r1, r8, r0, r2)
            if (r0 != 0) goto L28
            goto L0
        L1f:
            boolean r6 = r8.t()
            if (r6 == 0) goto L26
            return r1
        L26:
            if (r5 != r9) goto L29
        L28:
            return r2
        L29:
            boolean r6 = r5 instanceof P2.y
            if (r6 == 0) goto L33
            P2.y r5 = (P2.y) r5
            r5.a(r2)
            goto L0
        L33:
            boolean r6 = r5 instanceof P2.z
            if (r6 == 0) goto L4f
            if (r3 == 0) goto L46
            P2.z r5 = (P2.z) r5
            P2.q r5 = r5.f1801a
            boolean r2 = p.AbstractC0657b.a(r4, r3, r2, r5)
            if (r2 != 0) goto L44
            goto L0
        L44:
            r2 = r3
            goto La
        L46:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = P2.q.f1782f
            java.lang.Object r2 = r4.get(r2)
            P2.q r2 = (P2.q) r2
            goto Lb
        L4f:
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            C2.k.c(r5, r3)
            r3 = r5
            P2.q r3 = (P2.q) r3
            r7 = r3
            r3 = r2
            r2 = r7
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: P2.q.n(P2.y):P2.q");
    }

    public final q o(q qVar) {
        while (qVar.t()) {
            qVar = (q) f1782f.get(qVar);
        }
        return qVar;
    }

    public final void p(q qVar) {
        q qVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1782f;
        do {
            qVar2 = (q) atomicReferenceFieldUpdater.get(qVar);
            if (q() != qVar) {
                return;
            }
        } while (!AbstractC0657b.a(f1782f, qVar, qVar2, this));
        if (t()) {
            qVar.n(null);
        }
    }

    public final Object q() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1781e;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof y)) {
                return obj;
            }
            ((y) obj).a(this);
        }
    }

    public final q r() {
        return p.b(q());
    }

    public final q s() {
        q n3 = n(null);
        return n3 == null ? o((q) f1782f.get(this)) : n3;
    }

    public boolean t() {
        return q() instanceof z;
    }

    public String toString() {
        return new C2.o(this) { // from class: P2.q.b
            @Override // H2.f
            public Object get() {
                return K2.M.a(this.f300f);
            }
        } + '@' + K2.M.b(this);
    }

    public boolean u() {
        return v() == null;
    }

    public final q v() {
        Object q3;
        q qVar;
        do {
            q3 = q();
            if (q3 instanceof z) {
                return ((z) q3).f1801a;
            }
            if (q3 == this) {
                return (q) q3;
            }
            C2.k.c(q3, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            qVar = (q) q3;
        } while (!AbstractC0657b.a(f1781e, this, q3, qVar.w()));
        qVar.n(null);
        return null;
    }

    public final z w() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1783g;
        z zVar = (z) atomicReferenceFieldUpdater.get(this);
        if (zVar != null) {
            return zVar;
        }
        z zVar2 = new z(this);
        atomicReferenceFieldUpdater.lazySet(this, zVar2);
        return zVar2;
    }

    public final int x(q qVar, q qVar2, a aVar) {
        f1782f.lazySet(qVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1781e;
        atomicReferenceFieldUpdater.lazySet(qVar, qVar2);
        aVar.f1785c = qVar2;
        if (AbstractC0657b.a(atomicReferenceFieldUpdater, this, qVar2, aVar)) {
            return aVar.a(this) == null ? 1 : 2;
        }
        return 0;
    }
}
