package n2;

import K2.AbstractC0235h;
import K2.I;
import Y.d;
import android.content.Context;
import android.util.Log;
import e2.InterfaceC0465a;
import i2.InterfaceC0504b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import n2.InterfaceC0611B;
import t2.AbstractC0733c;
import u2.AbstractC0749b;

/* renamed from: n2.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0615F implements InterfaceC0465a, InterfaceC0611B {

    /* renamed from: b, reason: collision with root package name */
    public Context f8566b;

    /* renamed from: c, reason: collision with root package name */
    public C0612C f8567c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC0613D f8568d = new C0619b();

    /* renamed from: n2.F$a */
    public static final class a extends u2.k implements B2.p {

        /* renamed from: i, reason: collision with root package name */
        public int f8569i;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ List f8571k;

        /* renamed from: n2.F$a$a, reason: collision with other inner class name */
        public static final class C0135a extends u2.k implements B2.p {

            /* renamed from: i, reason: collision with root package name */
            public int f8572i;

            /* renamed from: j, reason: collision with root package name */
            public /* synthetic */ Object f8573j;

            /* renamed from: k, reason: collision with root package name */
            public final /* synthetic */ List f8574k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0135a(List list, s2.e eVar) {
                super(2, eVar);
                this.f8574k = list;
            }

            @Override // u2.AbstractC0748a
            public final s2.e a(Object obj, s2.e eVar) {
                C0135a c0135a = new C0135a(this.f8574k, eVar);
                c0135a.f8573j = obj;
                return c0135a;
            }

            @Override // u2.AbstractC0748a
            public final Object l(Object obj) {
                AbstractC0733c.c();
                if (this.f8572i != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q2.i.b(obj);
                Y.a aVar = (Y.a) this.f8573j;
                List list = this.f8574k;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        aVar.i(Y.f.a((String) it.next()));
                    }
                } else {
                    aVar.f();
                }
                return q2.n.f8874a;
            }

            @Override // B2.p
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public final Object h(Y.a aVar, s2.e eVar) {
                return ((C0135a) a(aVar, eVar)).l(q2.n.f8874a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List list, s2.e eVar) {
            super(2, eVar);
            this.f8571k = list;
        }

        @Override // u2.AbstractC0748a
        public final s2.e a(Object obj, s2.e eVar) {
            return C0615F.this.new a(this.f8571k, eVar);
        }

        @Override // u2.AbstractC0748a
        public final Object l(Object obj) {
            V.f b3;
            Object c3 = AbstractC0733c.c();
            int i3 = this.f8569i;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q2.i.b(obj);
                return obj;
            }
            q2.i.b(obj);
            Context context = C0615F.this.f8566b;
            if (context == null) {
                C2.k.o("context");
                context = null;
            }
            b3 = AbstractC0616G.b(context);
            C0135a c0135a = new C0135a(this.f8571k, null);
            this.f8569i = 1;
            Object a3 = Y.g.a(b3, c0135a, this);
            return a3 == c3 ? c3 : a3;
        }

        @Override // B2.p
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public final Object h(I i3, s2.e eVar) {
            return ((a) a(i3, eVar)).l(q2.n.f8874a);
        }
    }

    /* renamed from: n2.F$b */
    public static final class b extends u2.k implements B2.p {

        /* renamed from: i, reason: collision with root package name */
        public int f8575i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f8576j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ d.a f8577k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f8578l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d.a aVar, String str, s2.e eVar) {
            super(2, eVar);
            this.f8577k = aVar;
            this.f8578l = str;
        }

        @Override // u2.AbstractC0748a
        public final s2.e a(Object obj, s2.e eVar) {
            b bVar = new b(this.f8577k, this.f8578l, eVar);
            bVar.f8576j = obj;
            return bVar;
        }

        @Override // u2.AbstractC0748a
        public final Object l(Object obj) {
            AbstractC0733c.c();
            if (this.f8575i != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q2.i.b(obj);
            ((Y.a) this.f8576j).j(this.f8577k, this.f8578l);
            return q2.n.f8874a;
        }

        @Override // B2.p
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public final Object h(Y.a aVar, s2.e eVar) {
            return ((b) a(aVar, eVar)).l(q2.n.f8874a);
        }
    }

    /* renamed from: n2.F$c */
    public static final class c extends u2.k implements B2.p {

        /* renamed from: i, reason: collision with root package name */
        public int f8579i;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ List f8581k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List list, s2.e eVar) {
            super(2, eVar);
            this.f8581k = list;
        }

        @Override // u2.AbstractC0748a
        public final s2.e a(Object obj, s2.e eVar) {
            return C0615F.this.new c(this.f8581k, eVar);
        }

        @Override // u2.AbstractC0748a
        public final Object l(Object obj) {
            Object c3 = AbstractC0733c.c();
            int i3 = this.f8579i;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q2.i.b(obj);
                return obj;
            }
            q2.i.b(obj);
            C0615F c0615f = C0615F.this;
            List list = this.f8581k;
            this.f8579i = 1;
            Object u3 = c0615f.u(list, this);
            return u3 == c3 ? c3 : u3;
        }

        @Override // B2.p
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public final Object h(I i3, s2.e eVar) {
            return ((c) a(i3, eVar)).l(q2.n.f8874a);
        }
    }

    /* renamed from: n2.F$d */
    public static final class d extends u2.k implements B2.p {

        /* renamed from: i, reason: collision with root package name */
        public Object f8582i;

        /* renamed from: j, reason: collision with root package name */
        public int f8583j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ String f8584k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C0615F f8585l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ C2.t f8586m;

        /* renamed from: n2.F$d$a */
        public static final class a implements N2.d {

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ N2.d f8587e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ d.a f8588f;

            /* renamed from: n2.F$d$a$a, reason: collision with other inner class name */
            public static final class C0136a implements N2.e {

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ N2.e f8589e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ d.a f8590f;

                /* renamed from: n2.F$d$a$a$a, reason: collision with other inner class name */
                public static final class C0137a extends u2.d {

                    /* renamed from: h, reason: collision with root package name */
                    public /* synthetic */ Object f8591h;

                    /* renamed from: i, reason: collision with root package name */
                    public int f8592i;

                    public C0137a(s2.e eVar) {
                        super(eVar);
                    }

                    @Override // u2.AbstractC0748a
                    public final Object l(Object obj) {
                        this.f8591h = obj;
                        this.f8592i |= Integer.MIN_VALUE;
                        return C0136a.this.d(null, this);
                    }
                }

                public C0136a(N2.e eVar, d.a aVar) {
                    this.f8589e = eVar;
                    this.f8590f = aVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // N2.e
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object d(java.lang.Object r5, s2.e r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof n2.C0615F.d.a.C0136a.C0137a
                        if (r0 == 0) goto L13
                        r0 = r6
                        n2.F$d$a$a$a r0 = (n2.C0615F.d.a.C0136a.C0137a) r0
                        int r1 = r0.f8592i
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f8592i = r1
                        goto L18
                    L13:
                        n2.F$d$a$a$a r0 = new n2.F$d$a$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f8591h
                        java.lang.Object r1 = t2.AbstractC0733c.c()
                        int r2 = r0.f8592i
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        q2.i.b(r6)
                        goto L47
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        q2.i.b(r6)
                        N2.e r6 = r4.f8589e
                        Y.d r5 = (Y.d) r5
                        Y.d$a r2 = r4.f8590f
                        java.lang.Object r5 = r5.b(r2)
                        r0.f8592i = r3
                        java.lang.Object r5 = r6.d(r5, r0)
                        if (r5 != r1) goto L47
                        return r1
                    L47:
                        q2.n r5 = q2.n.f8874a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: n2.C0615F.d.a.C0136a.d(java.lang.Object, s2.e):java.lang.Object");
                }
            }

            public a(N2.d dVar, d.a aVar) {
                this.f8587e = dVar;
                this.f8588f = aVar;
            }

            @Override // N2.d
            public Object b(N2.e eVar, s2.e eVar2) {
                Object b3 = this.f8587e.b(new C0136a(eVar, this.f8588f), eVar2);
                return b3 == AbstractC0733c.c() ? b3 : q2.n.f8874a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, C0615F c0615f, C2.t tVar, s2.e eVar) {
            super(2, eVar);
            this.f8584k = str;
            this.f8585l = c0615f;
            this.f8586m = tVar;
        }

        @Override // u2.AbstractC0748a
        public final s2.e a(Object obj, s2.e eVar) {
            return new d(this.f8584k, this.f8585l, this.f8586m, eVar);
        }

        @Override // u2.AbstractC0748a
        public final Object l(Object obj) {
            V.f b3;
            C2.t tVar;
            Object c3 = AbstractC0733c.c();
            int i3 = this.f8583j;
            if (i3 == 0) {
                q2.i.b(obj);
                d.a a3 = Y.f.a(this.f8584k);
                Context context = this.f8585l.f8566b;
                if (context == null) {
                    C2.k.o("context");
                    context = null;
                }
                b3 = AbstractC0616G.b(context);
                a aVar = new a(b3.b(), a3);
                C2.t tVar2 = this.f8586m;
                this.f8582i = tVar2;
                this.f8583j = 1;
                Object f3 = N2.f.f(aVar, this);
                if (f3 == c3) {
                    return c3;
                }
                tVar = tVar2;
                obj = f3;
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tVar = (C2.t) this.f8582i;
                q2.i.b(obj);
            }
            tVar.f321e = obj;
            return q2.n.f8874a;
        }

        @Override // B2.p
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public final Object h(I i3, s2.e eVar) {
            return ((d) a(i3, eVar)).l(q2.n.f8874a);
        }
    }

    /* renamed from: n2.F$e */
    public static final class e extends u2.k implements B2.p {

        /* renamed from: i, reason: collision with root package name */
        public Object f8594i;

        /* renamed from: j, reason: collision with root package name */
        public int f8595j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ String f8596k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C0615F f8597l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ C2.t f8598m;

        /* renamed from: n2.F$e$a */
        public static final class a implements N2.d {

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ N2.d f8599e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ d.a f8600f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ C0615F f8601g;

            /* renamed from: n2.F$e$a$a, reason: collision with other inner class name */
            public static final class C0138a implements N2.e {

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ N2.e f8602e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ d.a f8603f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ C0615F f8604g;

                /* renamed from: n2.F$e$a$a$a, reason: collision with other inner class name */
                public static final class C0139a extends u2.d {

                    /* renamed from: h, reason: collision with root package name */
                    public /* synthetic */ Object f8605h;

                    /* renamed from: i, reason: collision with root package name */
                    public int f8606i;

                    public C0139a(s2.e eVar) {
                        super(eVar);
                    }

                    @Override // u2.AbstractC0748a
                    public final Object l(Object obj) {
                        this.f8605h = obj;
                        this.f8606i |= Integer.MIN_VALUE;
                        return C0138a.this.d(null, this);
                    }
                }

                public C0138a(N2.e eVar, d.a aVar, C0615F c0615f) {
                    this.f8602e = eVar;
                    this.f8603f = aVar;
                    this.f8604g = c0615f;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // N2.e
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object d(java.lang.Object r5, s2.e r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof n2.C0615F.e.a.C0138a.C0139a
                        if (r0 == 0) goto L13
                        r0 = r6
                        n2.F$e$a$a$a r0 = (n2.C0615F.e.a.C0138a.C0139a) r0
                        int r1 = r0.f8606i
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f8606i = r1
                        goto L18
                    L13:
                        n2.F$e$a$a$a r0 = new n2.F$e$a$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f8605h
                        java.lang.Object r1 = t2.AbstractC0733c.c()
                        int r2 = r0.f8606i
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        q2.i.b(r6)
                        goto L53
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        q2.i.b(r6)
                        N2.e r6 = r4.f8602e
                        Y.d r5 = (Y.d) r5
                        Y.d$a r2 = r4.f8603f
                        java.lang.Object r5 = r5.b(r2)
                        n2.F r2 = r4.f8604g
                        n2.D r2 = n2.C0615F.r(r2)
                        java.lang.Object r5 = n2.AbstractC0616G.d(r5, r2)
                        java.lang.Double r5 = (java.lang.Double) r5
                        r0.f8606i = r3
                        java.lang.Object r5 = r6.d(r5, r0)
                        if (r5 != r1) goto L53
                        return r1
                    L53:
                        q2.n r5 = q2.n.f8874a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: n2.C0615F.e.a.C0138a.d(java.lang.Object, s2.e):java.lang.Object");
                }
            }

            public a(N2.d dVar, d.a aVar, C0615F c0615f) {
                this.f8599e = dVar;
                this.f8600f = aVar;
                this.f8601g = c0615f;
            }

            @Override // N2.d
            public Object b(N2.e eVar, s2.e eVar2) {
                Object b3 = this.f8599e.b(new C0138a(eVar, this.f8600f, this.f8601g), eVar2);
                return b3 == AbstractC0733c.c() ? b3 : q2.n.f8874a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, C0615F c0615f, C2.t tVar, s2.e eVar) {
            super(2, eVar);
            this.f8596k = str;
            this.f8597l = c0615f;
            this.f8598m = tVar;
        }

        @Override // u2.AbstractC0748a
        public final s2.e a(Object obj, s2.e eVar) {
            return new e(this.f8596k, this.f8597l, this.f8598m, eVar);
        }

        @Override // u2.AbstractC0748a
        public final Object l(Object obj) {
            V.f b3;
            C2.t tVar;
            Object c3 = AbstractC0733c.c();
            int i3 = this.f8595j;
            if (i3 == 0) {
                q2.i.b(obj);
                d.a f3 = Y.f.f(this.f8596k);
                Context context = this.f8597l.f8566b;
                if (context == null) {
                    C2.k.o("context");
                    context = null;
                }
                b3 = AbstractC0616G.b(context);
                a aVar = new a(b3.b(), f3, this.f8597l);
                C2.t tVar2 = this.f8598m;
                this.f8594i = tVar2;
                this.f8595j = 1;
                Object f4 = N2.f.f(aVar, this);
                if (f4 == c3) {
                    return c3;
                }
                tVar = tVar2;
                obj = f4;
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tVar = (C2.t) this.f8594i;
                q2.i.b(obj);
            }
            tVar.f321e = obj;
            return q2.n.f8874a;
        }

        @Override // B2.p
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public final Object h(I i3, s2.e eVar) {
            return ((e) a(i3, eVar)).l(q2.n.f8874a);
        }
    }

    /* renamed from: n2.F$f */
    public static final class f extends u2.k implements B2.p {

        /* renamed from: i, reason: collision with root package name */
        public Object f8608i;

        /* renamed from: j, reason: collision with root package name */
        public int f8609j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ String f8610k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C0615F f8611l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ C2.t f8612m;

        /* renamed from: n2.F$f$a */
        public static final class a implements N2.d {

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ N2.d f8613e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ d.a f8614f;

            /* renamed from: n2.F$f$a$a, reason: collision with other inner class name */
            public static final class C0140a implements N2.e {

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ N2.e f8615e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ d.a f8616f;

                /* renamed from: n2.F$f$a$a$a, reason: collision with other inner class name */
                public static final class C0141a extends u2.d {

                    /* renamed from: h, reason: collision with root package name */
                    public /* synthetic */ Object f8617h;

                    /* renamed from: i, reason: collision with root package name */
                    public int f8618i;

                    public C0141a(s2.e eVar) {
                        super(eVar);
                    }

                    @Override // u2.AbstractC0748a
                    public final Object l(Object obj) {
                        this.f8617h = obj;
                        this.f8618i |= Integer.MIN_VALUE;
                        return C0140a.this.d(null, this);
                    }
                }

                public C0140a(N2.e eVar, d.a aVar) {
                    this.f8615e = eVar;
                    this.f8616f = aVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // N2.e
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object d(java.lang.Object r5, s2.e r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof n2.C0615F.f.a.C0140a.C0141a
                        if (r0 == 0) goto L13
                        r0 = r6
                        n2.F$f$a$a$a r0 = (n2.C0615F.f.a.C0140a.C0141a) r0
                        int r1 = r0.f8618i
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f8618i = r1
                        goto L18
                    L13:
                        n2.F$f$a$a$a r0 = new n2.F$f$a$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f8617h
                        java.lang.Object r1 = t2.AbstractC0733c.c()
                        int r2 = r0.f8618i
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        q2.i.b(r6)
                        goto L47
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        q2.i.b(r6)
                        N2.e r6 = r4.f8615e
                        Y.d r5 = (Y.d) r5
                        Y.d$a r2 = r4.f8616f
                        java.lang.Object r5 = r5.b(r2)
                        r0.f8618i = r3
                        java.lang.Object r5 = r6.d(r5, r0)
                        if (r5 != r1) goto L47
                        return r1
                    L47:
                        q2.n r5 = q2.n.f8874a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: n2.C0615F.f.a.C0140a.d(java.lang.Object, s2.e):java.lang.Object");
                }
            }

            public a(N2.d dVar, d.a aVar) {
                this.f8613e = dVar;
                this.f8614f = aVar;
            }

            @Override // N2.d
            public Object b(N2.e eVar, s2.e eVar2) {
                Object b3 = this.f8613e.b(new C0140a(eVar, this.f8614f), eVar2);
                return b3 == AbstractC0733c.c() ? b3 : q2.n.f8874a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, C0615F c0615f, C2.t tVar, s2.e eVar) {
            super(2, eVar);
            this.f8610k = str;
            this.f8611l = c0615f;
            this.f8612m = tVar;
        }

        @Override // u2.AbstractC0748a
        public final s2.e a(Object obj, s2.e eVar) {
            return new f(this.f8610k, this.f8611l, this.f8612m, eVar);
        }

        @Override // u2.AbstractC0748a
        public final Object l(Object obj) {
            V.f b3;
            C2.t tVar;
            Object c3 = AbstractC0733c.c();
            int i3 = this.f8609j;
            if (i3 == 0) {
                q2.i.b(obj);
                d.a e3 = Y.f.e(this.f8610k);
                Context context = this.f8611l.f8566b;
                if (context == null) {
                    C2.k.o("context");
                    context = null;
                }
                b3 = AbstractC0616G.b(context);
                a aVar = new a(b3.b(), e3);
                C2.t tVar2 = this.f8612m;
                this.f8608i = tVar2;
                this.f8609j = 1;
                Object f3 = N2.f.f(aVar, this);
                if (f3 == c3) {
                    return c3;
                }
                tVar = tVar2;
                obj = f3;
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tVar = (C2.t) this.f8608i;
                q2.i.b(obj);
            }
            tVar.f321e = obj;
            return q2.n.f8874a;
        }

        @Override // B2.p
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public final Object h(I i3, s2.e eVar) {
            return ((f) a(i3, eVar)).l(q2.n.f8874a);
        }
    }

    /* renamed from: n2.F$g */
    public static final class g extends u2.k implements B2.p {

        /* renamed from: i, reason: collision with root package name */
        public int f8620i;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ List f8622k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(List list, s2.e eVar) {
            super(2, eVar);
            this.f8622k = list;
        }

        @Override // u2.AbstractC0748a
        public final s2.e a(Object obj, s2.e eVar) {
            return C0615F.this.new g(this.f8622k, eVar);
        }

        @Override // u2.AbstractC0748a
        public final Object l(Object obj) {
            Object c3 = AbstractC0733c.c();
            int i3 = this.f8620i;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q2.i.b(obj);
                return obj;
            }
            q2.i.b(obj);
            C0615F c0615f = C0615F.this;
            List list = this.f8622k;
            this.f8620i = 1;
            Object u3 = c0615f.u(list, this);
            return u3 == c3 ? c3 : u3;
        }

        @Override // B2.p
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public final Object h(I i3, s2.e eVar) {
            return ((g) a(i3, eVar)).l(q2.n.f8874a);
        }
    }

    /* renamed from: n2.F$h */
    public static final class h extends u2.d {

        /* renamed from: h, reason: collision with root package name */
        public Object f8623h;

        /* renamed from: i, reason: collision with root package name */
        public Object f8624i;

        /* renamed from: j, reason: collision with root package name */
        public Object f8625j;

        /* renamed from: k, reason: collision with root package name */
        public Object f8626k;

        /* renamed from: l, reason: collision with root package name */
        public Object f8627l;

        /* renamed from: m, reason: collision with root package name */
        public /* synthetic */ Object f8628m;

        /* renamed from: o, reason: collision with root package name */
        public int f8630o;

        public h(s2.e eVar) {
            super(eVar);
        }

        @Override // u2.AbstractC0748a
        public final Object l(Object obj) {
            this.f8628m = obj;
            this.f8630o |= Integer.MIN_VALUE;
            return C0615F.this.u(null, this);
        }
    }

    /* renamed from: n2.F$i */
    public static final class i extends u2.k implements B2.p {

        /* renamed from: i, reason: collision with root package name */
        public Object f8631i;

        /* renamed from: j, reason: collision with root package name */
        public int f8632j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ String f8633k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C0615F f8634l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ C2.t f8635m;

        /* renamed from: n2.F$i$a */
        public static final class a implements N2.d {

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ N2.d f8636e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ d.a f8637f;

            /* renamed from: n2.F$i$a$a, reason: collision with other inner class name */
            public static final class C0142a implements N2.e {

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ N2.e f8638e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ d.a f8639f;

                /* renamed from: n2.F$i$a$a$a, reason: collision with other inner class name */
                public static final class C0143a extends u2.d {

                    /* renamed from: h, reason: collision with root package name */
                    public /* synthetic */ Object f8640h;

                    /* renamed from: i, reason: collision with root package name */
                    public int f8641i;

                    public C0143a(s2.e eVar) {
                        super(eVar);
                    }

                    @Override // u2.AbstractC0748a
                    public final Object l(Object obj) {
                        this.f8640h = obj;
                        this.f8641i |= Integer.MIN_VALUE;
                        return C0142a.this.d(null, this);
                    }
                }

                public C0142a(N2.e eVar, d.a aVar) {
                    this.f8638e = eVar;
                    this.f8639f = aVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // N2.e
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object d(java.lang.Object r5, s2.e r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof n2.C0615F.i.a.C0142a.C0143a
                        if (r0 == 0) goto L13
                        r0 = r6
                        n2.F$i$a$a$a r0 = (n2.C0615F.i.a.C0142a.C0143a) r0
                        int r1 = r0.f8641i
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f8641i = r1
                        goto L18
                    L13:
                        n2.F$i$a$a$a r0 = new n2.F$i$a$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f8640h
                        java.lang.Object r1 = t2.AbstractC0733c.c()
                        int r2 = r0.f8641i
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        q2.i.b(r6)
                        goto L47
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        q2.i.b(r6)
                        N2.e r6 = r4.f8638e
                        Y.d r5 = (Y.d) r5
                        Y.d$a r2 = r4.f8639f
                        java.lang.Object r5 = r5.b(r2)
                        r0.f8641i = r3
                        java.lang.Object r5 = r6.d(r5, r0)
                        if (r5 != r1) goto L47
                        return r1
                    L47:
                        q2.n r5 = q2.n.f8874a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: n2.C0615F.i.a.C0142a.d(java.lang.Object, s2.e):java.lang.Object");
                }
            }

            public a(N2.d dVar, d.a aVar) {
                this.f8636e = dVar;
                this.f8637f = aVar;
            }

            @Override // N2.d
            public Object b(N2.e eVar, s2.e eVar2) {
                Object b3 = this.f8636e.b(new C0142a(eVar, this.f8637f), eVar2);
                return b3 == AbstractC0733c.c() ? b3 : q2.n.f8874a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, C0615F c0615f, C2.t tVar, s2.e eVar) {
            super(2, eVar);
            this.f8633k = str;
            this.f8634l = c0615f;
            this.f8635m = tVar;
        }

        @Override // u2.AbstractC0748a
        public final s2.e a(Object obj, s2.e eVar) {
            return new i(this.f8633k, this.f8634l, this.f8635m, eVar);
        }

        @Override // u2.AbstractC0748a
        public final Object l(Object obj) {
            V.f b3;
            C2.t tVar;
            Object c3 = AbstractC0733c.c();
            int i3 = this.f8632j;
            if (i3 == 0) {
                q2.i.b(obj);
                d.a f3 = Y.f.f(this.f8633k);
                Context context = this.f8634l.f8566b;
                if (context == null) {
                    C2.k.o("context");
                    context = null;
                }
                b3 = AbstractC0616G.b(context);
                a aVar = new a(b3.b(), f3);
                C2.t tVar2 = this.f8635m;
                this.f8631i = tVar2;
                this.f8632j = 1;
                Object f4 = N2.f.f(aVar, this);
                if (f4 == c3) {
                    return c3;
                }
                tVar = tVar2;
                obj = f4;
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tVar = (C2.t) this.f8631i;
                q2.i.b(obj);
            }
            tVar.f321e = obj;
            return q2.n.f8874a;
        }

        @Override // B2.p
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public final Object h(I i3, s2.e eVar) {
            return ((i) a(i3, eVar)).l(q2.n.f8874a);
        }
    }

    /* renamed from: n2.F$j */
    public static final class j implements N2.d {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ N2.d f8643e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ d.a f8644f;

        /* renamed from: n2.F$j$a */
        public static final class a implements N2.e {

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ N2.e f8645e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ d.a f8646f;

            /* renamed from: n2.F$j$a$a, reason: collision with other inner class name */
            public static final class C0144a extends u2.d {

                /* renamed from: h, reason: collision with root package name */
                public /* synthetic */ Object f8647h;

                /* renamed from: i, reason: collision with root package name */
                public int f8648i;

                public C0144a(s2.e eVar) {
                    super(eVar);
                }

                @Override // u2.AbstractC0748a
                public final Object l(Object obj) {
                    this.f8647h = obj;
                    this.f8648i |= Integer.MIN_VALUE;
                    return a.this.d(null, this);
                }
            }

            public a(N2.e eVar, d.a aVar) {
                this.f8645e = eVar;
                this.f8646f = aVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // N2.e
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object d(java.lang.Object r5, s2.e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof n2.C0615F.j.a.C0144a
                    if (r0 == 0) goto L13
                    r0 = r6
                    n2.F$j$a$a r0 = (n2.C0615F.j.a.C0144a) r0
                    int r1 = r0.f8648i
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f8648i = r1
                    goto L18
                L13:
                    n2.F$j$a$a r0 = new n2.F$j$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f8647h
                    java.lang.Object r1 = t2.AbstractC0733c.c()
                    int r2 = r0.f8648i
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    q2.i.b(r6)
                    goto L47
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    q2.i.b(r6)
                    N2.e r6 = r4.f8645e
                    Y.d r5 = (Y.d) r5
                    Y.d$a r2 = r4.f8646f
                    java.lang.Object r5 = r5.b(r2)
                    r0.f8648i = r3
                    java.lang.Object r5 = r6.d(r5, r0)
                    if (r5 != r1) goto L47
                    return r1
                L47:
                    q2.n r5 = q2.n.f8874a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: n2.C0615F.j.a.d(java.lang.Object, s2.e):java.lang.Object");
            }
        }

        public j(N2.d dVar, d.a aVar) {
            this.f8643e = dVar;
            this.f8644f = aVar;
        }

        @Override // N2.d
        public Object b(N2.e eVar, s2.e eVar2) {
            Object b3 = this.f8643e.b(new a(eVar, this.f8644f), eVar2);
            return b3 == AbstractC0733c.c() ? b3 : q2.n.f8874a;
        }
    }

    /* renamed from: n2.F$k */
    public static final class k implements N2.d {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ N2.d f8650e;

        /* renamed from: n2.F$k$a */
        public static final class a implements N2.e {

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ N2.e f8651e;

            /* renamed from: n2.F$k$a$a, reason: collision with other inner class name */
            public static final class C0145a extends u2.d {

                /* renamed from: h, reason: collision with root package name */
                public /* synthetic */ Object f8652h;

                /* renamed from: i, reason: collision with root package name */
                public int f8653i;

                public C0145a(s2.e eVar) {
                    super(eVar);
                }

                @Override // u2.AbstractC0748a
                public final Object l(Object obj) {
                    this.f8652h = obj;
                    this.f8653i |= Integer.MIN_VALUE;
                    return a.this.d(null, this);
                }
            }

            public a(N2.e eVar) {
                this.f8651e = eVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
            @Override // N2.e
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object d(java.lang.Object r5, s2.e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof n2.C0615F.k.a.C0145a
                    if (r0 == 0) goto L13
                    r0 = r6
                    n2.F$k$a$a r0 = (n2.C0615F.k.a.C0145a) r0
                    int r1 = r0.f8653i
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f8653i = r1
                    goto L18
                L13:
                    n2.F$k$a$a r0 = new n2.F$k$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f8652h
                    java.lang.Object r1 = t2.AbstractC0733c.c()
                    int r2 = r0.f8653i
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    q2.i.b(r6)
                    goto L49
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    q2.i.b(r6)
                    N2.e r6 = r4.f8651e
                    Y.d r5 = (Y.d) r5
                    java.util.Map r5 = r5.a()
                    java.util.Set r5 = r5.keySet()
                    r0.f8653i = r3
                    java.lang.Object r5 = r6.d(r5, r0)
                    if (r5 != r1) goto L49
                    return r1
                L49:
                    q2.n r5 = q2.n.f8874a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: n2.C0615F.k.a.d(java.lang.Object, s2.e):java.lang.Object");
            }
        }

        public k(N2.d dVar) {
            this.f8650e = dVar;
        }

        @Override // N2.d
        public Object b(N2.e eVar, s2.e eVar2) {
            Object b3 = this.f8650e.b(new a(eVar), eVar2);
            return b3 == AbstractC0733c.c() ? b3 : q2.n.f8874a;
        }
    }

    /* renamed from: n2.F$l */
    public static final class l extends u2.k implements B2.p {

        /* renamed from: i, reason: collision with root package name */
        public int f8655i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f8656j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ C0615F f8657k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ boolean f8658l;

        /* renamed from: n2.F$l$a */
        public static final class a extends u2.k implements B2.p {

            /* renamed from: i, reason: collision with root package name */
            public int f8659i;

            /* renamed from: j, reason: collision with root package name */
            public /* synthetic */ Object f8660j;

            /* renamed from: k, reason: collision with root package name */
            public final /* synthetic */ d.a f8661k;

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ boolean f8662l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d.a aVar, boolean z3, s2.e eVar) {
                super(2, eVar);
                this.f8661k = aVar;
                this.f8662l = z3;
            }

            @Override // u2.AbstractC0748a
            public final s2.e a(Object obj, s2.e eVar) {
                a aVar = new a(this.f8661k, this.f8662l, eVar);
                aVar.f8660j = obj;
                return aVar;
            }

            @Override // u2.AbstractC0748a
            public final Object l(Object obj) {
                AbstractC0733c.c();
                if (this.f8659i != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q2.i.b(obj);
                ((Y.a) this.f8660j).j(this.f8661k, AbstractC0749b.a(this.f8662l));
                return q2.n.f8874a;
            }

            @Override // B2.p
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public final Object h(Y.a aVar, s2.e eVar) {
                return ((a) a(aVar, eVar)).l(q2.n.f8874a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String str, C0615F c0615f, boolean z3, s2.e eVar) {
            super(2, eVar);
            this.f8656j = str;
            this.f8657k = c0615f;
            this.f8658l = z3;
        }

        @Override // u2.AbstractC0748a
        public final s2.e a(Object obj, s2.e eVar) {
            return new l(this.f8656j, this.f8657k, this.f8658l, eVar);
        }

        @Override // u2.AbstractC0748a
        public final Object l(Object obj) {
            V.f b3;
            Object c3 = AbstractC0733c.c();
            int i3 = this.f8655i;
            if (i3 == 0) {
                q2.i.b(obj);
                d.a a3 = Y.f.a(this.f8656j);
                Context context = this.f8657k.f8566b;
                if (context == null) {
                    C2.k.o("context");
                    context = null;
                }
                b3 = AbstractC0616G.b(context);
                a aVar = new a(a3, this.f8658l, null);
                this.f8655i = 1;
                if (Y.g.a(b3, aVar, this) == c3) {
                    return c3;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q2.i.b(obj);
            }
            return q2.n.f8874a;
        }

        @Override // B2.p
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public final Object h(I i3, s2.e eVar) {
            return ((l) a(i3, eVar)).l(q2.n.f8874a);
        }
    }

    /* renamed from: n2.F$m */
    public static final class m extends u2.k implements B2.p {

        /* renamed from: i, reason: collision with root package name */
        public int f8663i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f8664j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ C0615F f8665k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ double f8666l;

        /* renamed from: n2.F$m$a */
        public static final class a extends u2.k implements B2.p {

            /* renamed from: i, reason: collision with root package name */
            public int f8667i;

            /* renamed from: j, reason: collision with root package name */
            public /* synthetic */ Object f8668j;

            /* renamed from: k, reason: collision with root package name */
            public final /* synthetic */ d.a f8669k;

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ double f8670l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d.a aVar, double d3, s2.e eVar) {
                super(2, eVar);
                this.f8669k = aVar;
                this.f8670l = d3;
            }

            @Override // u2.AbstractC0748a
            public final s2.e a(Object obj, s2.e eVar) {
                a aVar = new a(this.f8669k, this.f8670l, eVar);
                aVar.f8668j = obj;
                return aVar;
            }

            @Override // u2.AbstractC0748a
            public final Object l(Object obj) {
                AbstractC0733c.c();
                if (this.f8667i != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q2.i.b(obj);
                ((Y.a) this.f8668j).j(this.f8669k, AbstractC0749b.b(this.f8670l));
                return q2.n.f8874a;
            }

            @Override // B2.p
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public final Object h(Y.a aVar, s2.e eVar) {
                return ((a) a(aVar, eVar)).l(q2.n.f8874a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(String str, C0615F c0615f, double d3, s2.e eVar) {
            super(2, eVar);
            this.f8664j = str;
            this.f8665k = c0615f;
            this.f8666l = d3;
        }

        @Override // u2.AbstractC0748a
        public final s2.e a(Object obj, s2.e eVar) {
            return new m(this.f8664j, this.f8665k, this.f8666l, eVar);
        }

        @Override // u2.AbstractC0748a
        public final Object l(Object obj) {
            V.f b3;
            Object c3 = AbstractC0733c.c();
            int i3 = this.f8663i;
            if (i3 == 0) {
                q2.i.b(obj);
                d.a b4 = Y.f.b(this.f8664j);
                Context context = this.f8665k.f8566b;
                if (context == null) {
                    C2.k.o("context");
                    context = null;
                }
                b3 = AbstractC0616G.b(context);
                a aVar = new a(b4, this.f8666l, null);
                this.f8663i = 1;
                if (Y.g.a(b3, aVar, this) == c3) {
                    return c3;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q2.i.b(obj);
            }
            return q2.n.f8874a;
        }

        @Override // B2.p
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public final Object h(I i3, s2.e eVar) {
            return ((m) a(i3, eVar)).l(q2.n.f8874a);
        }
    }

    /* renamed from: n2.F$n */
    public static final class n extends u2.k implements B2.p {

        /* renamed from: i, reason: collision with root package name */
        public int f8671i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f8672j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ C0615F f8673k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ long f8674l;

        /* renamed from: n2.F$n$a */
        public static final class a extends u2.k implements B2.p {

            /* renamed from: i, reason: collision with root package name */
            public int f8675i;

            /* renamed from: j, reason: collision with root package name */
            public /* synthetic */ Object f8676j;

            /* renamed from: k, reason: collision with root package name */
            public final /* synthetic */ d.a f8677k;

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ long f8678l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d.a aVar, long j3, s2.e eVar) {
                super(2, eVar);
                this.f8677k = aVar;
                this.f8678l = j3;
            }

            @Override // u2.AbstractC0748a
            public final s2.e a(Object obj, s2.e eVar) {
                a aVar = new a(this.f8677k, this.f8678l, eVar);
                aVar.f8676j = obj;
                return aVar;
            }

            @Override // u2.AbstractC0748a
            public final Object l(Object obj) {
                AbstractC0733c.c();
                if (this.f8675i != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q2.i.b(obj);
                ((Y.a) this.f8676j).j(this.f8677k, AbstractC0749b.c(this.f8678l));
                return q2.n.f8874a;
            }

            @Override // B2.p
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public final Object h(Y.a aVar, s2.e eVar) {
                return ((a) a(aVar, eVar)).l(q2.n.f8874a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(String str, C0615F c0615f, long j3, s2.e eVar) {
            super(2, eVar);
            this.f8672j = str;
            this.f8673k = c0615f;
            this.f8674l = j3;
        }

        @Override // u2.AbstractC0748a
        public final s2.e a(Object obj, s2.e eVar) {
            return new n(this.f8672j, this.f8673k, this.f8674l, eVar);
        }

        @Override // u2.AbstractC0748a
        public final Object l(Object obj) {
            V.f b3;
            Object c3 = AbstractC0733c.c();
            int i3 = this.f8671i;
            if (i3 == 0) {
                q2.i.b(obj);
                d.a e3 = Y.f.e(this.f8672j);
                Context context = this.f8673k.f8566b;
                if (context == null) {
                    C2.k.o("context");
                    context = null;
                }
                b3 = AbstractC0616G.b(context);
                a aVar = new a(e3, this.f8674l, null);
                this.f8671i = 1;
                if (Y.g.a(b3, aVar, this) == c3) {
                    return c3;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q2.i.b(obj);
            }
            return q2.n.f8874a;
        }

        @Override // B2.p
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public final Object h(I i3, s2.e eVar) {
            return ((n) a(i3, eVar)).l(q2.n.f8874a);
        }
    }

    /* renamed from: n2.F$o */
    public static final class o extends u2.k implements B2.p {

        /* renamed from: i, reason: collision with root package name */
        public int f8679i;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ String f8681k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f8682l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String str, String str2, s2.e eVar) {
            super(2, eVar);
            this.f8681k = str;
            this.f8682l = str2;
        }

        @Override // u2.AbstractC0748a
        public final s2.e a(Object obj, s2.e eVar) {
            return C0615F.this.new o(this.f8681k, this.f8682l, eVar);
        }

        @Override // u2.AbstractC0748a
        public final Object l(Object obj) {
            Object c3 = AbstractC0733c.c();
            int i3 = this.f8679i;
            if (i3 == 0) {
                q2.i.b(obj);
                C0615F c0615f = C0615F.this;
                String str = this.f8681k;
                String str2 = this.f8682l;
                this.f8679i = 1;
                if (c0615f.t(str, str2, this) == c3) {
                    return c3;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q2.i.b(obj);
            }
            return q2.n.f8874a;
        }

        @Override // B2.p
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public final Object h(I i3, s2.e eVar) {
            return ((o) a(i3, eVar)).l(q2.n.f8874a);
        }
    }

    /* renamed from: n2.F$p */
    public static final class p extends u2.k implements B2.p {

        /* renamed from: i, reason: collision with root package name */
        public int f8683i;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ String f8685k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f8686l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(String str, String str2, s2.e eVar) {
            super(2, eVar);
            this.f8685k = str;
            this.f8686l = str2;
        }

        @Override // u2.AbstractC0748a
        public final s2.e a(Object obj, s2.e eVar) {
            return C0615F.this.new p(this.f8685k, this.f8686l, eVar);
        }

        @Override // u2.AbstractC0748a
        public final Object l(Object obj) {
            Object c3 = AbstractC0733c.c();
            int i3 = this.f8683i;
            if (i3 == 0) {
                q2.i.b(obj);
                C0615F c0615f = C0615F.this;
                String str = this.f8685k;
                String str2 = this.f8686l;
                this.f8683i = 1;
                if (c0615f.t(str, str2, this) == c3) {
                    return c3;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q2.i.b(obj);
            }
            return q2.n.f8874a;
        }

        @Override // B2.p
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public final Object h(I i3, s2.e eVar) {
            return ((p) a(i3, eVar)).l(q2.n.f8874a);
        }
    }

    @Override // n2.InterfaceC0611B
    public Boolean a(String str, C0614E c0614e) {
        C2.k.e(str, "key");
        C2.k.e(c0614e, "options");
        C2.t tVar = new C2.t();
        AbstractC0235h.b(null, new d(str, this, tVar, null), 1, null);
        return (Boolean) tVar.f321e;
    }

    @Override // e2.InterfaceC0465a
    public void b(InterfaceC0465a.b bVar) {
        C2.k.e(bVar, "binding");
        InterfaceC0504b b3 = bVar.b();
        C2.k.d(b3, "getBinaryMessenger(...)");
        Context a3 = bVar.a();
        C2.k.d(a3, "getApplicationContext(...)");
        x(b3, a3);
        new C0618a().b(bVar);
    }

    @Override // n2.InterfaceC0611B
    public String c(String str, C0614E c0614e) {
        C2.k.e(str, "key");
        C2.k.e(c0614e, "options");
        C2.t tVar = new C2.t();
        AbstractC0235h.b(null, new i(str, this, tVar, null), 1, null);
        return (String) tVar.f321e;
    }

    @Override // n2.InterfaceC0611B
    public void d(String str, double d3, C0614E c0614e) {
        C2.k.e(str, "key");
        C2.k.e(c0614e, "options");
        AbstractC0235h.b(null, new m(str, this, d3, null), 1, null);
    }

    @Override // n2.InterfaceC0611B
    public void e(String str, List list, C0614E c0614e) {
        C2.k.e(str, "key");
        C2.k.e(list, "value");
        C2.k.e(c0614e, "options");
        AbstractC0235h.b(null, new p(str, "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIGxpc3Qu" + this.f8568d.a(list), null), 1, null);
    }

    @Override // n2.InterfaceC0611B
    public void f(List list, C0614E c0614e) {
        C2.k.e(c0614e, "options");
        AbstractC0235h.b(null, new a(list, null), 1, null);
    }

    @Override // n2.InterfaceC0611B
    public Map g(List list, C0614E c0614e) {
        Object b3;
        C2.k.e(c0614e, "options");
        b3 = AbstractC0235h.b(null, new c(list, null), 1, null);
        return (Map) b3;
    }

    @Override // n2.InterfaceC0611B
    public void h(String str, long j3, C0614E c0614e) {
        C2.k.e(str, "key");
        C2.k.e(c0614e, "options");
        AbstractC0235h.b(null, new n(str, this, j3, null), 1, null);
    }

    @Override // n2.InterfaceC0611B
    public Double i(String str, C0614E c0614e) {
        C2.k.e(str, "key");
        C2.k.e(c0614e, "options");
        C2.t tVar = new C2.t();
        AbstractC0235h.b(null, new e(str, this, tVar, null), 1, null);
        return (Double) tVar.f321e;
    }

    @Override // n2.InterfaceC0611B
    public List j(String str, C0614E c0614e) {
        C2.k.e(str, "key");
        C2.k.e(c0614e, "options");
        List list = (List) AbstractC0616G.d(c(str, c0614e), this.f8568d);
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof String) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // n2.InterfaceC0611B
    public Long k(String str, C0614E c0614e) {
        C2.k.e(str, "key");
        C2.k.e(c0614e, "options");
        C2.t tVar = new C2.t();
        AbstractC0235h.b(null, new f(str, this, tVar, null), 1, null);
        return (Long) tVar.f321e;
    }

    @Override // n2.InterfaceC0611B
    public void l(String str, boolean z3, C0614E c0614e) {
        C2.k.e(str, "key");
        C2.k.e(c0614e, "options");
        AbstractC0235h.b(null, new l(str, this, z3, null), 1, null);
    }

    @Override // n2.InterfaceC0611B
    public List m(List list, C0614E c0614e) {
        Object b3;
        C2.k.e(c0614e, "options");
        b3 = AbstractC0235h.b(null, new g(list, null), 1, null);
        return r2.u.x(((Map) b3).keySet());
    }

    @Override // n2.InterfaceC0611B
    public void n(String str, String str2, C0614E c0614e) {
        C2.k.e(str, "key");
        C2.k.e(str2, "value");
        C2.k.e(c0614e, "options");
        AbstractC0235h.b(null, new o(str, str2, null), 1, null);
    }

    @Override // e2.InterfaceC0465a
    public void p(InterfaceC0465a.b bVar) {
        C2.k.e(bVar, "binding");
        InterfaceC0611B.a aVar = InterfaceC0611B.f8557a;
        InterfaceC0504b b3 = bVar.b();
        C2.k.d(b3, "getBinaryMessenger(...)");
        aVar.q(b3, null, "data_store");
        C0612C c0612c = this.f8567c;
        if (c0612c != null) {
            c0612c.o();
        }
        this.f8567c = null;
    }

    public final Object t(String str, String str2, s2.e eVar) {
        V.f b3;
        d.a f3 = Y.f.f(str);
        Context context = this.f8566b;
        if (context == null) {
            C2.k.o("context");
            context = null;
        }
        b3 = AbstractC0616G.b(context);
        Object a3 = Y.g.a(b3, new b(f3, str2, null), eVar);
        return a3 == AbstractC0733c.c() ? a3 : q2.n.f8874a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a3, code lost:
    
        if (r10 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x00a3 -> B:11:0x00a6). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object u(java.util.List r9, s2.e r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof n2.C0615F.h
            if (r0 == 0) goto L13
            r0 = r10
            n2.F$h r0 = (n2.C0615F.h) r0
            int r1 = r0.f8630o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8630o = r1
            goto L18
        L13:
            n2.F$h r0 = new n2.F$h
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f8628m
            java.lang.Object r1 = t2.AbstractC0733c.c()
            int r2 = r0.f8630o
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L59
            if (r2 == r4) goto L49
            if (r2 != r3) goto L41
            java.lang.Object r9 = r0.f8627l
            Y.d$a r9 = (Y.d.a) r9
            java.lang.Object r2 = r0.f8626k
            java.util.Iterator r2 = (java.util.Iterator) r2
            java.lang.Object r4 = r0.f8625j
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r5 = r0.f8624i
            java.util.Set r5 = (java.util.Set) r5
            java.lang.Object r6 = r0.f8623h
            n2.F r6 = (n2.C0615F) r6
            q2.i.b(r10)
            goto La6
        L41:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L49:
            java.lang.Object r9 = r0.f8625j
            java.util.Map r9 = (java.util.Map) r9
            java.lang.Object r2 = r0.f8624i
            java.util.Set r2 = (java.util.Set) r2
            java.lang.Object r4 = r0.f8623h
            n2.F r4 = (n2.C0615F) r4
            q2.i.b(r10)
            goto L7b
        L59:
            q2.i.b(r10)
            if (r9 == 0) goto L64
            java.util.Set r9 = r2.u.A(r9)
        L62:
            r2 = r9
            goto L66
        L64:
            r9 = 0
            goto L62
        L66:
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>()
            r0.f8623h = r8
            r0.f8624i = r2
            r0.f8625j = r9
            r0.f8630o = r4
            java.lang.Object r10 = r8.w(r0)
            if (r10 != r1) goto L7a
            goto La5
        L7a:
            r4 = r8
        L7b:
            java.util.Set r10 = (java.util.Set) r10
            if (r10 == 0) goto Lc1
            java.util.Iterator r10 = r10.iterator()
            r5 = r2
            r6 = r4
            r4 = r9
            r2 = r10
        L87:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto Lc0
            java.lang.Object r9 = r2.next()
            Y.d$a r9 = (Y.d.a) r9
            r0.f8623h = r6
            r0.f8624i = r5
            r0.f8625j = r4
            r0.f8626k = r2
            r0.f8627l = r9
            r0.f8630o = r3
            java.lang.Object r10 = r6.v(r9, r0)
            if (r10 != r1) goto La6
        La5:
            return r1
        La6:
            java.lang.String r7 = r9.toString()
            boolean r7 = n2.AbstractC0616G.c(r7, r10, r5)
            if (r7 == 0) goto L87
            n2.D r7 = r6.f8568d
            java.lang.Object r10 = n2.AbstractC0616G.d(r10, r7)
            if (r10 == 0) goto L87
            java.lang.String r9 = r9.toString()
            r4.put(r9, r10)
            goto L87
        Lc0:
            return r4
        Lc1:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.C0615F.u(java.util.List, s2.e):java.lang.Object");
    }

    public final Object v(d.a aVar, s2.e eVar) {
        V.f b3;
        Context context = this.f8566b;
        if (context == null) {
            C2.k.o("context");
            context = null;
        }
        b3 = AbstractC0616G.b(context);
        return N2.f.f(new j(b3.b(), aVar), eVar);
    }

    public final Object w(s2.e eVar) {
        V.f b3;
        Context context = this.f8566b;
        if (context == null) {
            C2.k.o("context");
            context = null;
        }
        b3 = AbstractC0616G.b(context);
        return N2.f.f(new k(b3.b()), eVar);
    }

    public final void x(InterfaceC0504b interfaceC0504b, Context context) {
        this.f8566b = context;
        try {
            InterfaceC0611B.f8557a.q(interfaceC0504b, this, "data_store");
            this.f8567c = new C0612C(interfaceC0504b, context, this.f8568d);
        } catch (Exception e3) {
            Log.e("SharedPreferencesPlugin", "Received exception while setting up SharedPreferencesPlugin", e3);
        }
    }
}
