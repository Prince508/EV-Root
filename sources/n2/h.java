package N2;

import t2.AbstractC0733c;

/* loaded from: classes.dex */
public abstract /* synthetic */ class h {

    public static final class a extends u2.d {

        /* renamed from: h, reason: collision with root package name */
        public Object f1490h;

        /* renamed from: i, reason: collision with root package name */
        public Object f1491i;

        /* renamed from: j, reason: collision with root package name */
        public Object f1492j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f1493k;

        /* renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f1494l;

        /* renamed from: m, reason: collision with root package name */
        public int f1495m;

        public a(s2.e eVar) {
            super(eVar);
        }

        @Override // u2.AbstractC0748a
        public final Object l(Object obj) {
            this.f1494l = obj;
            this.f1495m |= Integer.MIN_VALUE;
            return h.c(null, null, false, this);
        }
    }

    public static final Object b(e eVar, M2.s sVar, s2.e eVar2) {
        Object c3 = c(eVar, sVar, true, eVar2);
        return c3 == AbstractC0733c.c() ? c3 : q2.n.f8874a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0091, code lost:
    
        if (r2.d(r9, r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #0 {all -> 0x003c, blocks: (B:12:0x0036, B:14:0x0062, B:20:0x0077, B:22:0x007f, B:32:0x0054, B:34:0x005e), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0091 -> B:13:0x0039). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(N2.e r6, M2.s r7, boolean r8, s2.e r9) {
        /*
            boolean r0 = r9 instanceof N2.h.a
            if (r0 == 0) goto L13
            r0 = r9
            N2.h$a r0 = (N2.h.a) r0
            int r1 = r0.f1495m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1495m = r1
            goto L18
        L13:
            N2.h$a r0 = new N2.h$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f1494l
            java.lang.Object r1 = t2.AbstractC0733c.c()
            int r2 = r0.f1495m
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L58
            if (r2 == r4) goto L46
            if (r2 != r3) goto L3e
            boolean r8 = r0.f1493k
            java.lang.Object r6 = r0.f1492j
            M2.f r6 = (M2.f) r6
            java.lang.Object r7 = r0.f1491i
            M2.s r7 = (M2.s) r7
            java.lang.Object r2 = r0.f1490h
            N2.e r2 = (N2.e) r2
            q2.i.b(r9)     // Catch: java.lang.Throwable -> L3c
        L39:
            r9 = r6
            r6 = r2
            goto L62
        L3c:
            r6 = move-exception
            goto L9d
        L3e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L46:
            boolean r8 = r0.f1493k
            java.lang.Object r6 = r0.f1492j
            M2.f r6 = (M2.f) r6
            java.lang.Object r7 = r0.f1491i
            M2.s r7 = (M2.s) r7
            java.lang.Object r2 = r0.f1490h
            N2.e r2 = (N2.e) r2
            q2.i.b(r9)     // Catch: java.lang.Throwable -> L3c
            goto L77
        L58:
            q2.i.b(r9)
            N2.f.e(r6)
            M2.f r9 = r7.iterator()     // Catch: java.lang.Throwable -> L3c
        L62:
            r0.f1490h = r6     // Catch: java.lang.Throwable -> L3c
            r0.f1491i = r7     // Catch: java.lang.Throwable -> L3c
            r0.f1492j = r9     // Catch: java.lang.Throwable -> L3c
            r0.f1493k = r8     // Catch: java.lang.Throwable -> L3c
            r0.f1495m = r4     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r2 = r9.b(r0)     // Catch: java.lang.Throwable -> L3c
            if (r2 != r1) goto L73
            goto L93
        L73:
            r5 = r2
            r2 = r6
            r6 = r9
            r9 = r5
        L77:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L3c
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L3c
            if (r9 == 0) goto L94
            java.lang.Object r9 = r6.next()     // Catch: java.lang.Throwable -> L3c
            r0.f1490h = r2     // Catch: java.lang.Throwable -> L3c
            r0.f1491i = r7     // Catch: java.lang.Throwable -> L3c
            r0.f1492j = r6     // Catch: java.lang.Throwable -> L3c
            r0.f1493k = r8     // Catch: java.lang.Throwable -> L3c
            r0.f1495m = r3     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r9 = r2.d(r9, r0)     // Catch: java.lang.Throwable -> L3c
            if (r9 != r1) goto L39
        L93:
            return r1
        L94:
            if (r8 == 0) goto L9a
            r6 = 0
            M2.k.a(r7, r6)
        L9a:
            q2.n r6 = q2.n.f8874a
            return r6
        L9d:
            throw r6     // Catch: java.lang.Throwable -> L9e
        L9e:
            r9 = move-exception
            if (r8 == 0) goto La4
            M2.k.a(r7, r6)
        La4:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: N2.h.c(N2.e, M2.s, boolean, s2.e):java.lang.Object");
    }
}
