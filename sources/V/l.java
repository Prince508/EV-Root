package V;

import B2.p;
import K2.AbstractC0237i;
import K2.I;
import K2.p0;
import M2.h;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final I f2220a;

    /* renamed from: b, reason: collision with root package name */
    public final p f2221b;

    /* renamed from: c, reason: collision with root package name */
    public final M2.d f2222c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicInteger f2223d;

    public static final class a extends C2.l implements B2.l {

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ B2.l f2224f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ l f2225g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ p f2226h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(B2.l lVar, l lVar2, p pVar) {
            super(1);
            this.f2224f = lVar;
            this.f2225g = lVar2;
            this.f2226h = pVar;
        }

        public final void a(Throwable th) {
            q2.n nVar;
            this.f2224f.j(th);
            this.f2225g.f2222c.q(th);
            do {
                Object d3 = M2.h.d(this.f2225g.f2222c.o());
                if (d3 == null) {
                    nVar = null;
                } else {
                    this.f2226h.h(d3, th);
                    nVar = q2.n.f8874a;
                }
            } while (nVar != null);
        }

        @Override // B2.l
        public /* bridge */ /* synthetic */ Object j(Object obj) {
            a((Throwable) obj);
            return q2.n.f8874a;
        }
    }

    public static final class b extends u2.k implements p {

        /* renamed from: i, reason: collision with root package name */
        public Object f2227i;

        /* renamed from: j, reason: collision with root package name */
        public int f2228j;

        public b(s2.e eVar) {
            super(2, eVar);
        }

        @Override // u2.AbstractC0748a
        public final s2.e a(Object obj, s2.e eVar) {
            return l.this.new b(eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x005f, code lost:
        
            if (r1.h(r6, r5) == r0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0061, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x0053, code lost:
        
            if (r6 != r0) goto L18;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x005f -> B:6:0x0062). Please report as a decompilation issue!!! */
        @Override // u2.AbstractC0748a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object l(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = t2.AbstractC0733c.c()
                int r1 = r5.f2228j
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                q2.i.b(r6)
                goto L62
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.f2227i
                B2.p r1 = (B2.p) r1
                q2.i.b(r6)
                goto L56
            L22:
                q2.i.b(r6)
                V.l r6 = V.l.this
                java.util.concurrent.atomic.AtomicInteger r6 = V.l.c(r6)
                int r6 = r6.get()
                if (r6 <= 0) goto L33
                r6 = r3
                goto L34
            L33:
                r6 = 0
            L34:
                if (r6 == 0) goto L71
            L36:
                V.l r6 = V.l.this
                K2.I r6 = V.l.d(r6)
                K2.J.c(r6)
                V.l r6 = V.l.this
                B2.p r1 = V.l.a(r6)
                V.l r6 = V.l.this
                M2.d r6 = V.l.b(r6)
                r5.f2227i = r1
                r5.f2228j = r3
                java.lang.Object r6 = r6.w(r5)
                if (r6 != r0) goto L56
                goto L61
            L56:
                r4 = 0
                r5.f2227i = r4
                r5.f2228j = r2
                java.lang.Object r6 = r1.h(r6, r5)
                if (r6 != r0) goto L62
            L61:
                return r0
            L62:
                V.l r6 = V.l.this
                java.util.concurrent.atomic.AtomicInteger r6 = V.l.c(r6)
                int r6 = r6.decrementAndGet()
                if (r6 != 0) goto L36
                q2.n r6 = q2.n.f8874a
                return r6
            L71:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "Check failed."
                r6.<init>(r0)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: V.l.b.l(java.lang.Object):java.lang.Object");
        }

        @Override // B2.p
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public final Object h(I i3, s2.e eVar) {
            return ((b) a(i3, eVar)).l(q2.n.f8874a);
        }
    }

    public l(I i3, B2.l lVar, p pVar, p pVar2) {
        C2.k.e(i3, "scope");
        C2.k.e(lVar, "onComplete");
        C2.k.e(pVar, "onUndeliveredElement");
        C2.k.e(pVar2, "consumeMessage");
        this.f2220a = i3;
        this.f2221b = pVar2;
        this.f2222c = M2.g.b(Integer.MAX_VALUE, null, null, 6, null);
        this.f2223d = new AtomicInteger(0);
        p0 p0Var = (p0) i3.t().a(p0.f1211b);
        if (p0Var == null) {
            return;
        }
        p0Var.g(new a(lVar, this, pVar));
    }

    public final void e(Object obj) {
        Object s3 = this.f2222c.s(obj);
        if (s3 instanceof h.a) {
            Throwable c3 = M2.h.c(s3);
            if (c3 != null) {
                throw c3;
            }
            throw new M2.n("Channel was closed normally");
        }
        if (!M2.h.f(s3)) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.f2223d.getAndIncrement() == 0) {
            AbstractC0237i.b(this.f2220a, null, null, new b(null), 3, null);
        }
    }
}
