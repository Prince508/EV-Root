package N2;

import t2.AbstractC0733c;

/* loaded from: classes.dex */
public abstract /* synthetic */ class l {

    public static final class a implements d {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ d f1496e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ B2.p f1497f;

        public a(d dVar, B2.p pVar) {
            this.f1496e = dVar;
            this.f1497f = pVar;
        }

        @Override // N2.d
        public Object b(e eVar, s2.e eVar2) {
            Object b3 = this.f1496e.b(new b(new C2.s(), eVar, this.f1497f), eVar2);
            return b3 == AbstractC0733c.c() ? b3 : q2.n.f8874a;
        }
    }

    public static final class b implements e {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ C2.s f1498e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ e f1499f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ B2.p f1500g;

        public static final class a extends u2.d {

            /* renamed from: h, reason: collision with root package name */
            public Object f1501h;

            /* renamed from: i, reason: collision with root package name */
            public Object f1502i;

            /* renamed from: j, reason: collision with root package name */
            public /* synthetic */ Object f1503j;

            /* renamed from: l, reason: collision with root package name */
            public int f1505l;

            public a(s2.e eVar) {
                super(eVar);
            }

            @Override // u2.AbstractC0748a
            public final Object l(Object obj) {
                this.f1503j = obj;
                this.f1505l |= Integer.MIN_VALUE;
                return b.this.d(null, this);
            }
        }

        public b(C2.s sVar, e eVar, B2.p pVar) {
            this.f1498e = sVar;
            this.f1499f = eVar;
            this.f1500g = pVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0085, code lost:
        
            if (r8.d(r7, r0) == r1) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0056, code lost:
        
            if (r8.d(r7, r0) == r1) goto L33;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        @Override // N2.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object d(java.lang.Object r7, s2.e r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof N2.l.b.a
                if (r0 == 0) goto L13
                r0 = r8
                N2.l$b$a r0 = (N2.l.b.a) r0
                int r1 = r0.f1505l
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f1505l = r1
                goto L18
            L13:
                N2.l$b$a r0 = new N2.l$b$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f1503j
                java.lang.Object r1 = t2.AbstractC0733c.c()
                int r2 = r0.f1505l
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L45
                if (r2 == r5) goto L41
                if (r2 == r4) goto L37
                if (r2 != r3) goto L2f
                q2.i.b(r8)
                goto L88
            L2f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L37:
                java.lang.Object r7 = r0.f1502i
                java.lang.Object r2 = r0.f1501h
                N2.l$b r2 = (N2.l.b) r2
                q2.i.b(r8)
                goto L6c
            L41:
                q2.i.b(r8)
                goto L59
            L45:
                q2.i.b(r8)
                C2.s r8 = r6.f1498e
                boolean r8 = r8.f320e
                if (r8 == 0) goto L5c
                N2.e r8 = r6.f1499f
                r0.f1505l = r5
                java.lang.Object r7 = r8.d(r7, r0)
                if (r7 != r1) goto L59
                goto L87
            L59:
                q2.n r7 = q2.n.f8874a
                return r7
            L5c:
                B2.p r8 = r6.f1500g
                r0.f1501h = r6
                r0.f1502i = r7
                r0.f1505l = r4
                java.lang.Object r8 = r8.h(r7, r0)
                if (r8 != r1) goto L6b
                goto L87
            L6b:
                r2 = r6
            L6c:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L8b
                C2.s r8 = r2.f1498e
                r8.f320e = r5
                N2.e r8 = r2.f1499f
                r2 = 0
                r0.f1501h = r2
                r0.f1502i = r2
                r0.f1505l = r3
                java.lang.Object r7 = r8.d(r7, r0)
                if (r7 != r1) goto L88
            L87:
                return r1
            L88:
                q2.n r7 = q2.n.f8874a
                return r7
            L8b:
                q2.n r7 = q2.n.f8874a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: N2.l.b.d(java.lang.Object, s2.e):java.lang.Object");
        }
    }

    public static final d a(d dVar, B2.p pVar) {
        return new a(dVar, pVar);
    }
}
