package N2;

/* loaded from: classes.dex */
public abstract /* synthetic */ class m {

    public static final class a implements e {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ C2.t f1506e;

        public a(C2.t tVar) {
            this.f1506e = tVar;
        }

        @Override // N2.e
        public Object d(Object obj, s2.e eVar) {
            this.f1506e.f321e = obj;
            throw new O2.a(this);
        }
    }

    public static final class b extends u2.d {

        /* renamed from: h, reason: collision with root package name */
        public Object f1507h;

        /* renamed from: i, reason: collision with root package name */
        public Object f1508i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f1509j;

        /* renamed from: k, reason: collision with root package name */
        public int f1510k;

        public b(s2.e eVar) {
            super(eVar);
        }

        @Override // u2.AbstractC0748a
        public final Object l(Object obj) {
            this.f1509j = obj;
            this.f1510k |= Integer.MIN_VALUE;
            return f.f(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(N2.d r4, s2.e r5) {
        /*
            boolean r0 = r5 instanceof N2.m.b
            if (r0 == 0) goto L13
            r0 = r5
            N2.m$b r0 = (N2.m.b) r0
            int r1 = r0.f1510k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1510k = r1
            goto L18
        L13:
            N2.m$b r0 = new N2.m$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f1509j
            java.lang.Object r1 = t2.AbstractC0733c.c()
            int r2 = r0.f1510k
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f1508i
            N2.m$a r4 = (N2.m.a) r4
            java.lang.Object r0 = r0.f1507h
            C2.t r0 = (C2.t) r0
            q2.i.b(r5)     // Catch: O2.a -> L31
            goto L5e
        L31:
            r5 = move-exception
            goto L5b
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            q2.i.b(r5)
            C2.t r5 = new C2.t
            r5.<init>()
            N2.m$a r2 = new N2.m$a
            r2.<init>(r5)
            r0.f1507h = r5     // Catch: O2.a -> L57
            r0.f1508i = r2     // Catch: O2.a -> L57
            r0.f1510k = r3     // Catch: O2.a -> L57
            java.lang.Object r4 = r4.b(r2, r0)     // Catch: O2.a -> L57
            if (r4 != r1) goto L55
            return r1
        L55:
            r0 = r5
            goto L5e
        L57:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L5b:
            O2.j.a(r5, r4)
        L5e:
            java.lang.Object r4 = r0.f321e
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: N2.m.a(N2.d, s2.e):java.lang.Object");
    }
}
