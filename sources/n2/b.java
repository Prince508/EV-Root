package N2;

/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: i, reason: collision with root package name */
    public final B2.p f1484i;

    public static final class a extends u2.d {

        /* renamed from: h, reason: collision with root package name */
        public Object f1485h;

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f1486i;

        /* renamed from: k, reason: collision with root package name */
        public int f1488k;

        public a(s2.e eVar) {
            super(eVar);
        }

        @Override // u2.AbstractC0748a
        public final Object l(Object obj) {
            this.f1486i = obj;
            this.f1488k |= Integer.MIN_VALUE;
            return b.this.e(null, this);
        }
    }

    public /* synthetic */ b(B2.p pVar, s2.i iVar, int i3, M2.a aVar, int i4, C2.g gVar) {
        this(pVar, (i4 & 2) != 0 ? s2.j.f9292e : iVar, (i4 & 4) != 0 ? -2 : i3, (i4 & 8) != 0 ? M2.a.SUSPEND : aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // N2.c, O2.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object e(M2.r r5, s2.e r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof N2.b.a
            if (r0 == 0) goto L13
            r0 = r6
            N2.b$a r0 = (N2.b.a) r0
            int r1 = r0.f1488k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1488k = r1
            goto L18
        L13:
            N2.b$a r0 = new N2.b$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f1486i
            java.lang.Object r1 = t2.AbstractC0733c.c()
            int r2 = r0.f1488k
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f1485h
            M2.r r5 = (M2.r) r5
            q2.i.b(r6)
            goto L43
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            q2.i.b(r6)
            r0.f1485h = r5
            r0.f1488k = r3
            java.lang.Object r6 = super.e(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            boolean r5 = r5.x()
            if (r5 == 0) goto L4c
            q2.n r5 = q2.n.f8874a
            return r5
        L4c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: N2.b.e(M2.r, s2.e):java.lang.Object");
    }

    @Override // O2.e
    public O2.e f(s2.i iVar, int i3, M2.a aVar) {
        return new b(this.f1484i, iVar, i3, aVar);
    }

    public b(B2.p pVar, s2.i iVar, int i3, M2.a aVar) {
        super(pVar, iVar, i3, aVar);
        this.f1484i = pVar;
    }
}
