package M2;

import K2.E;
import K2.I;
import K2.InterfaceC0243l;
import K2.K;
import q2.h;

/* loaded from: classes.dex */
public abstract class p {

    public static final class a extends u2.d {

        /* renamed from: h, reason: collision with root package name */
        public Object f1425h;

        /* renamed from: i, reason: collision with root package name */
        public Object f1426i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f1427j;

        /* renamed from: k, reason: collision with root package name */
        public int f1428k;

        public a(s2.e eVar) {
            super(eVar);
        }

        @Override // u2.AbstractC0748a
        public final Object l(Object obj) {
            this.f1427j = obj;
            this.f1428k |= Integer.MIN_VALUE;
            return p.a(null, null, this);
        }
    }

    public static final class b extends C2.l implements B2.l {

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0243l f1429f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC0243l interfaceC0243l) {
            super(1);
            this.f1429f = interfaceC0243l;
        }

        public final void a(Throwable th) {
            InterfaceC0243l interfaceC0243l = this.f1429f;
            h.a aVar = q2.h.f8868e;
            interfaceC0243l.u(q2.h.a(q2.n.f8874a));
        }

        @Override // B2.l
        public /* bridge */ /* synthetic */ Object j(Object obj) {
            a((Throwable) obj);
            return q2.n.f8874a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(M2.r r4, B2.a r5, s2.e r6) {
        /*
            boolean r0 = r6 instanceof M2.p.a
            if (r0 == 0) goto L13
            r0 = r6
            M2.p$a r0 = (M2.p.a) r0
            int r1 = r0.f1428k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f1428k = r1
            goto L18
        L13:
            M2.p$a r0 = new M2.p$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f1427j
            java.lang.Object r1 = t2.AbstractC0733c.c()
            int r2 = r0.f1428k
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r4 = r0.f1426i
            r5 = r4
            B2.a r5 = (B2.a) r5
            java.lang.Object r4 = r0.f1425h
            M2.r r4 = (M2.r) r4
            q2.i.b(r6)     // Catch: java.lang.Throwable -> L32
            goto L75
        L32:
            r4 = move-exception
            goto L7b
        L34:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3c:
            q2.i.b(r6)
            s2.i r6 = r0.c()
            K2.p0$b r2 = K2.p0.f1211b
            s2.i$b r6 = r6.a(r2)
            if (r6 != r4) goto L7f
            r0.f1425h = r4     // Catch: java.lang.Throwable -> L32
            r0.f1426i = r5     // Catch: java.lang.Throwable -> L32
            r0.f1428k = r3     // Catch: java.lang.Throwable -> L32
            K2.m r6 = new K2.m     // Catch: java.lang.Throwable -> L32
            s2.e r2 = t2.AbstractC0732b.b(r0)     // Catch: java.lang.Throwable -> L32
            r6.<init>(r2, r3)     // Catch: java.lang.Throwable -> L32
            r6.A()     // Catch: java.lang.Throwable -> L32
            M2.p$b r2 = new M2.p$b     // Catch: java.lang.Throwable -> L32
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L32
            r4.E(r2)     // Catch: java.lang.Throwable -> L32
            java.lang.Object r4 = r6.w()     // Catch: java.lang.Throwable -> L32
            java.lang.Object r6 = t2.AbstractC0733c.c()     // Catch: java.lang.Throwable -> L32
            if (r4 != r6) goto L72
            u2.h.c(r0)     // Catch: java.lang.Throwable -> L32
        L72:
            if (r4 != r1) goto L75
            return r1
        L75:
            r5.b()
            q2.n r4 = q2.n.f8874a
            return r4
        L7b:
            r5.b()
            throw r4
        L7f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: M2.p.a(M2.r, B2.a, s2.e):java.lang.Object");
    }

    public static final s b(I i3, s2.i iVar, int i4, M2.a aVar, K k3, B2.l lVar, B2.p pVar) {
        q qVar = new q(E.d(i3, iVar), g.b(i4, aVar, null, 4, null));
        if (lVar != null) {
            qVar.g(lVar);
        }
        qVar.S0(k3, qVar, pVar);
        return qVar;
    }

    public static /* synthetic */ s c(I i3, s2.i iVar, int i4, M2.a aVar, K k3, B2.l lVar, B2.p pVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            iVar = s2.j.f9292e;
        }
        if ((i5 & 2) != 0) {
            i4 = 0;
        }
        if ((i5 & 4) != 0) {
            aVar = M2.a.SUSPEND;
        }
        if ((i5 & 8) != 0) {
            k3 = K.DEFAULT;
        }
        if ((i5 & 16) != 0) {
            lVar = null;
        }
        B2.l lVar2 = lVar;
        return b(i3, iVar, i4, aVar, k3, lVar2, pVar);
    }
}
