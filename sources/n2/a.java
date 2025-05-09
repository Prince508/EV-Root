package N2;

/* loaded from: classes.dex */
public abstract class a implements d {

    /* renamed from: N2.a$a, reason: collision with other inner class name */
    public static final class C0040a extends u2.d {

        /* renamed from: h, reason: collision with root package name */
        public Object f1480h;

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f1481i;

        /* renamed from: k, reason: collision with root package name */
        public int f1483k;

        public C0040a(s2.e eVar) {
            super(eVar);
        }

        @Override // u2.AbstractC0748a
        public final Object l(Object obj) {
            this.f1481i = obj;
            this.f1483k |= Integer.MIN_VALUE;
            return a.this.b(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // N2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(N2.e r6, s2.e r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof N2.a.C0040a
            if (r0 == 0) goto L13
            r0 = r7
            N2.a$a r0 = (N2.a.C0040a) r0
            int r1 = r0.f1483k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1483k = r1
            goto L18
        L13:
            N2.a$a r0 = new N2.a$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f1481i
            java.lang.Object r1 = t2.AbstractC0733c.c()
            int r2 = r0.f1483k
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.f1480h
            O2.n r6 = (O2.n) r6
            q2.i.b(r7)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r7 = move-exception
            goto L59
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            q2.i.b(r7)
            O2.n r7 = new O2.n
            s2.i r2 = r0.c()
            r7.<init>(r6, r2)
            r0.f1480h = r7     // Catch: java.lang.Throwable -> L55
            r0.f1483k = r3     // Catch: java.lang.Throwable -> L55
            java.lang.Object r6 = r5.c(r7, r0)     // Catch: java.lang.Throwable -> L55
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r6 = r7
        L4f:
            r6.n()
            q2.n r6 = q2.n.f8874a
            return r6
        L55:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L59:
            r6.n()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: N2.a.b(N2.e, s2.e):java.lang.Object");
    }

    public abstract Object c(e eVar, s2.e eVar2);
}
