package V;

import C2.s;
import C2.t;
import K2.AbstractC0257w;
import K2.I;
import K2.InterfaceC0255u;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import r2.u;
import t2.AbstractC0733c;
import u2.AbstractC0749b;

/* loaded from: classes.dex */
public final class m implements V.f {

    /* renamed from: k, reason: collision with root package name */
    public static final a f2230k = new a(null);

    /* renamed from: l, reason: collision with root package name */
    public static final Set f2231l = new LinkedHashSet();

    /* renamed from: m, reason: collision with root package name */
    public static final Object f2232m = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final B2.a f2233a;

    /* renamed from: b, reason: collision with root package name */
    public final V.k f2234b;

    /* renamed from: c, reason: collision with root package name */
    public final V.b f2235c;

    /* renamed from: d, reason: collision with root package name */
    public final I f2236d;

    /* renamed from: e, reason: collision with root package name */
    public final N2.d f2237e;

    /* renamed from: f, reason: collision with root package name */
    public final String f2238f;

    /* renamed from: g, reason: collision with root package name */
    public final q2.d f2239g;

    /* renamed from: h, reason: collision with root package name */
    public final N2.n f2240h;

    /* renamed from: i, reason: collision with root package name */
    public List f2241i;

    /* renamed from: j, reason: collision with root package name */
    public final V.l f2242j;

    public static final class a {
        public /* synthetic */ a(C2.g gVar) {
            this();
        }

        public final Set a() {
            return m.f2231l;
        }

        public final Object b() {
            return m.f2232m;
        }

        public a() {
        }
    }

    public static abstract class b {

        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            public final V.n f2243a;

            public a(V.n nVar) {
                super(null);
                this.f2243a = nVar;
            }

            public V.n a() {
                return this.f2243a;
            }
        }

        /* renamed from: V.m$b$b, reason: collision with other inner class name */
        public static final class C0063b extends b {

            /* renamed from: a, reason: collision with root package name */
            public final B2.p f2244a;

            /* renamed from: b, reason: collision with root package name */
            public final InterfaceC0255u f2245b;

            /* renamed from: c, reason: collision with root package name */
            public final V.n f2246c;

            /* renamed from: d, reason: collision with root package name */
            public final s2.i f2247d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0063b(B2.p pVar, InterfaceC0255u interfaceC0255u, V.n nVar, s2.i iVar) {
                super(null);
                C2.k.e(pVar, "transform");
                C2.k.e(interfaceC0255u, "ack");
                C2.k.e(iVar, "callerContext");
                this.f2244a = pVar;
                this.f2245b = interfaceC0255u;
                this.f2246c = nVar;
                this.f2247d = iVar;
            }

            public final InterfaceC0255u a() {
                return this.f2245b;
            }

            public final s2.i b() {
                return this.f2247d;
            }

            public V.n c() {
                return this.f2246c;
            }

            public final B2.p d() {
                return this.f2244a;
            }
        }

        public /* synthetic */ b(C2.g gVar) {
            this();
        }

        public b() {
        }
    }

    public static final class c extends OutputStream {

        /* renamed from: e, reason: collision with root package name */
        public final FileOutputStream f2248e;

        public c(FileOutputStream fileOutputStream) {
            C2.k.e(fileOutputStream, "fileOutputStream");
            this.f2248e = fileOutputStream;
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            this.f2248e.flush();
        }

        @Override // java.io.OutputStream
        public void write(int i3) {
            this.f2248e.write(i3);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            C2.k.e(bArr, I1.b.f822b);
            this.f2248e.write(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i3, int i4) {
            C2.k.e(bArr, "bytes");
            this.f2248e.write(bArr, i3, i4);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    public static final class d extends C2.l implements B2.l {
        public d() {
            super(1);
        }

        public final void a(Throwable th) {
            if (th != null) {
                m.this.f2240h.setValue(new V.h(th));
            }
            a aVar = m.f2230k;
            Object b3 = aVar.b();
            m mVar = m.this;
            synchronized (b3) {
                aVar.a().remove(mVar.r().getAbsolutePath());
                q2.n nVar = q2.n.f8874a;
            }
        }

        @Override // B2.l
        public /* bridge */ /* synthetic */ Object j(Object obj) {
            a((Throwable) obj);
            return q2.n.f8874a;
        }
    }

    public static final class e extends C2.l implements B2.p {

        /* renamed from: f, reason: collision with root package name */
        public static final e f2250f = new e();

        public e() {
            super(2);
        }

        public final void a(b bVar, Throwable th) {
            C2.k.e(bVar, "msg");
            if (bVar instanceof b.C0063b) {
                InterfaceC0255u a3 = ((b.C0063b) bVar).a();
                if (th == null) {
                    th = new CancellationException("DataStore scope was cancelled before updateData could complete");
                }
                a3.y(th);
            }
        }

        @Override // B2.p
        public /* bridge */ /* synthetic */ Object h(Object obj, Object obj2) {
            a((b) obj, (Throwable) obj2);
            return q2.n.f8874a;
        }
    }

    public static final class f extends u2.k implements B2.p {

        /* renamed from: i, reason: collision with root package name */
        public int f2251i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f2252j;

        public f(s2.e eVar) {
            super(2, eVar);
        }

        @Override // u2.AbstractC0748a
        public final s2.e a(Object obj, s2.e eVar) {
            f fVar = m.this.new f(eVar);
            fVar.f2252j = obj;
            return fVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
        
            if (r4.f2253k.s((V.m.b.a) r5, r4) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
        
            if (r4.f2253k.t((V.m.b.C0063b) r5, r4) == r0) goto L19;
         */
        @Override // u2.AbstractC0748a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object l(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = t2.AbstractC0733c.c()
                int r1 = r4.f2251i
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1b
                if (r1 == r3) goto L17
                if (r1 != r2) goto Lf
                goto L17
            Lf:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L17:
                q2.i.b(r5)
                goto L44
            L1b:
                q2.i.b(r5)
                java.lang.Object r5 = r4.f2252j
                V.m$b r5 = (V.m.b) r5
                boolean r1 = r5 instanceof V.m.b.a
                if (r1 == 0) goto L33
                V.m r1 = V.m.this
                V.m$b$a r5 = (V.m.b.a) r5
                r4.f2251i = r3
                java.lang.Object r5 = V.m.i(r1, r5, r4)
                if (r5 != r0) goto L44
                goto L43
            L33:
                boolean r1 = r5 instanceof V.m.b.C0063b
                if (r1 == 0) goto L44
                V.m r1 = V.m.this
                V.m$b$b r5 = (V.m.b.C0063b) r5
                r4.f2251i = r2
                java.lang.Object r5 = V.m.j(r1, r5, r4)
                if (r5 != r0) goto L44
            L43:
                return r0
            L44:
                q2.n r5 = q2.n.f8874a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: V.m.f.l(java.lang.Object):java.lang.Object");
        }

        @Override // B2.p
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public final Object h(b bVar, s2.e eVar) {
            return ((f) a(bVar, eVar)).l(q2.n.f8874a);
        }
    }

    public static final class g extends u2.k implements B2.p {

        /* renamed from: i, reason: collision with root package name */
        public int f2254i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f2255j;

        public static final class a extends u2.k implements B2.p {

            /* renamed from: i, reason: collision with root package name */
            public int f2257i;

            /* renamed from: j, reason: collision with root package name */
            public /* synthetic */ Object f2258j;

            /* renamed from: k, reason: collision with root package name */
            public final /* synthetic */ V.n f2259k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(V.n nVar, s2.e eVar) {
                super(2, eVar);
                this.f2259k = nVar;
            }

            @Override // u2.AbstractC0748a
            public final s2.e a(Object obj, s2.e eVar) {
                a aVar = new a(this.f2259k, eVar);
                aVar.f2258j = obj;
                return aVar;
            }

            @Override // u2.AbstractC0748a
            public final Object l(Object obj) {
                AbstractC0733c.c();
                if (this.f2257i != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q2.i.b(obj);
                V.n nVar = (V.n) this.f2258j;
                V.n nVar2 = this.f2259k;
                boolean z3 = false;
                if (!(nVar2 instanceof V.c) && !(nVar2 instanceof V.h) && nVar == nVar2) {
                    z3 = true;
                }
                return AbstractC0749b.a(z3);
            }

            @Override // B2.p
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public final Object h(V.n nVar, s2.e eVar) {
                return ((a) a(nVar, eVar)).l(q2.n.f8874a);
            }
        }

        public static final class b implements N2.d {

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ N2.d f2260e;

            public static final class a implements N2.e {

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ N2.e f2261e;

                /* renamed from: V.m$g$b$a$a, reason: collision with other inner class name */
                public static final class C0064a extends u2.d {

                    /* renamed from: h, reason: collision with root package name */
                    public /* synthetic */ Object f2262h;

                    /* renamed from: i, reason: collision with root package name */
                    public int f2263i;

                    public C0064a(s2.e eVar) {
                        super(eVar);
                    }

                    @Override // u2.AbstractC0748a
                    public final Object l(Object obj) {
                        this.f2262h = obj;
                        this.f2263i |= Integer.MIN_VALUE;
                        return a.this.d(null, this);
                    }
                }

                public a(N2.e eVar) {
                    this.f2261e = eVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // N2.e
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public java.lang.Object d(java.lang.Object r5, s2.e r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof V.m.g.b.a.C0064a
                        if (r0 == 0) goto L13
                        r0 = r6
                        V.m$g$b$a$a r0 = (V.m.g.b.a.C0064a) r0
                        int r1 = r0.f2263i
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f2263i = r1
                        goto L18
                    L13:
                        V.m$g$b$a$a r0 = new V.m$g$b$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f2262h
                        java.lang.Object r1 = t2.AbstractC0733c.c()
                        int r2 = r0.f2263i
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
                        N2.e r6 = r4.f2261e
                        V.n r5 = (V.n) r5
                        boolean r2 = r5 instanceof V.j
                        if (r2 != 0) goto L6f
                        boolean r2 = r5 instanceof V.h
                        if (r2 != 0) goto L68
                        boolean r2 = r5 instanceof V.c
                        if (r2 == 0) goto L56
                        V.c r5 = (V.c) r5
                        java.lang.Object r5 = r5.b()
                        r0.f2263i = r3
                        java.lang.Object r5 = r6.d(r5, r0)
                        if (r5 != r1) goto L53
                        return r1
                    L53:
                        q2.n r5 = q2.n.f8874a
                        return r5
                    L56:
                        boolean r5 = r5 instanceof V.o
                        if (r5 == 0) goto L62
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
                        r5.<init>(r6)
                        throw r5
                    L62:
                        q2.f r5 = new q2.f
                        r5.<init>()
                        throw r5
                    L68:
                        V.h r5 = (V.h) r5
                        java.lang.Throwable r5 = r5.a()
                        throw r5
                    L6f:
                        V.j r5 = (V.j) r5
                        java.lang.Throwable r5 = r5.a()
                        throw r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: V.m.g.b.a.d(java.lang.Object, s2.e):java.lang.Object");
                }
            }

            public b(N2.d dVar) {
                this.f2260e = dVar;
            }

            @Override // N2.d
            public Object b(N2.e eVar, s2.e eVar2) {
                Object b3 = this.f2260e.b(new a(eVar), eVar2);
                return b3 == AbstractC0733c.c() ? b3 : q2.n.f8874a;
            }
        }

        public g(s2.e eVar) {
            super(2, eVar);
        }

        @Override // u2.AbstractC0748a
        public final s2.e a(Object obj, s2.e eVar) {
            g gVar = m.this.new g(eVar);
            gVar.f2255j = obj;
            return gVar;
        }

        @Override // u2.AbstractC0748a
        public final Object l(Object obj) {
            Object c3 = AbstractC0733c.c();
            int i3 = this.f2254i;
            if (i3 == 0) {
                q2.i.b(obj);
                N2.e eVar = (N2.e) this.f2255j;
                V.n nVar = (V.n) m.this.f2240h.getValue();
                if (!(nVar instanceof V.c)) {
                    m.this.f2242j.e(new b.a(nVar));
                }
                b bVar = new b(N2.f.b(m.this.f2240h, new a(nVar, null)));
                this.f2254i = 1;
                if (N2.f.d(eVar, bVar, this) == c3) {
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
        public final Object h(N2.e eVar, s2.e eVar2) {
            return ((g) a(eVar, eVar2)).l(q2.n.f8874a);
        }
    }

    public static final class h extends C2.l implements B2.a {
        public h() {
            super(0);
        }

        @Override // B2.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final File b() {
            File file = (File) m.this.f2233a.b();
            String absolutePath = file.getAbsolutePath();
            a aVar = m.f2230k;
            synchronized (aVar.b()) {
                if (aVar.a().contains(absolutePath)) {
                    throw new IllegalStateException(("There are multiple DataStores active for the same file: " + file + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                }
                Set a3 = aVar.a();
                C2.k.d(absolutePath, "it");
                a3.add(absolutePath);
            }
            return file;
        }
    }

    public static final class i extends u2.d {

        /* renamed from: h, reason: collision with root package name */
        public Object f2266h;

        /* renamed from: i, reason: collision with root package name */
        public Object f2267i;

        /* renamed from: j, reason: collision with root package name */
        public Object f2268j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f2269k;

        /* renamed from: m, reason: collision with root package name */
        public int f2271m;

        public i(s2.e eVar) {
            super(eVar);
        }

        @Override // u2.AbstractC0748a
        public final Object l(Object obj) {
            this.f2269k = obj;
            this.f2271m |= Integer.MIN_VALUE;
            return m.this.t(null, this);
        }
    }

    public static final class j extends u2.d {

        /* renamed from: h, reason: collision with root package name */
        public Object f2272h;

        /* renamed from: i, reason: collision with root package name */
        public Object f2273i;

        /* renamed from: j, reason: collision with root package name */
        public Object f2274j;

        /* renamed from: k, reason: collision with root package name */
        public Object f2275k;

        /* renamed from: l, reason: collision with root package name */
        public Object f2276l;

        /* renamed from: m, reason: collision with root package name */
        public Object f2277m;

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f2278n;

        /* renamed from: p, reason: collision with root package name */
        public int f2280p;

        public j(s2.e eVar) {
            super(eVar);
        }

        @Override // u2.AbstractC0748a
        public final Object l(Object obj) {
            this.f2278n = obj;
            this.f2280p |= Integer.MIN_VALUE;
            return m.this.u(this);
        }
    }

    public static final class k implements V.i {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ T2.a f2281a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s f2282b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ t f2283c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ m f2284d;

        public static final class a extends u2.d {

            /* renamed from: h, reason: collision with root package name */
            public Object f2285h;

            /* renamed from: i, reason: collision with root package name */
            public Object f2286i;

            /* renamed from: j, reason: collision with root package name */
            public Object f2287j;

            /* renamed from: k, reason: collision with root package name */
            public Object f2288k;

            /* renamed from: l, reason: collision with root package name */
            public Object f2289l;

            /* renamed from: m, reason: collision with root package name */
            public /* synthetic */ Object f2290m;

            /* renamed from: o, reason: collision with root package name */
            public int f2292o;

            public a(s2.e eVar) {
                super(eVar);
            }

            @Override // u2.AbstractC0748a
            public final Object l(Object obj) {
                this.f2290m = obj;
                this.f2292o |= Integer.MIN_VALUE;
                return k.this.a(null, this);
            }
        }

        public k(T2.a aVar, s sVar, t tVar, m mVar) {
            this.f2281a = aVar;
            this.f2282b = sVar;
            this.f2283c = tVar;
            this.f2284d = mVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x00ba A[Catch: all -> 0x0056, TRY_LEAVE, TryCatch #0 {all -> 0x0056, blocks: (B:27:0x0052, B:28:0x00b2, B:30:0x00ba), top: B:26:0x0052 }] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00d0  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x009a A[Catch: all -> 0x00d7, TRY_LEAVE, TryCatch #1 {all -> 0x00d7, blocks: (B:40:0x0096, B:42:0x009a, B:45:0x00da, B:46:0x00e1), top: B:39:0x0096 }] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00da A[Catch: all -> 0x00d7, TRY_ENTER, TryCatch #1 {all -> 0x00d7, blocks: (B:40:0x0096, B:42:0x009a, B:45:0x00da, B:46:0x00e1), top: B:39:0x0096 }] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
        @Override // V.i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object a(B2.p r10, s2.e r11) {
            /*
                Method dump skipped, instructions count: 230
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: V.m.k.a(B2.p, s2.e):java.lang.Object");
        }
    }

    public static final class l extends u2.d {

        /* renamed from: h, reason: collision with root package name */
        public Object f2293h;

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f2294i;

        /* renamed from: k, reason: collision with root package name */
        public int f2296k;

        public l(s2.e eVar) {
            super(eVar);
        }

        @Override // u2.AbstractC0748a
        public final Object l(Object obj) {
            this.f2294i = obj;
            this.f2296k |= Integer.MIN_VALUE;
            return m.this.v(this);
        }
    }

    /* renamed from: V.m$m, reason: collision with other inner class name */
    public static final class C0065m extends u2.d {

        /* renamed from: h, reason: collision with root package name */
        public Object f2297h;

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f2298i;

        /* renamed from: k, reason: collision with root package name */
        public int f2300k;

        public C0065m(s2.e eVar) {
            super(eVar);
        }

        @Override // u2.AbstractC0748a
        public final Object l(Object obj) {
            this.f2298i = obj;
            this.f2300k |= Integer.MIN_VALUE;
            return m.this.w(this);
        }
    }

    public static final class n extends u2.d {

        /* renamed from: h, reason: collision with root package name */
        public Object f2301h;

        /* renamed from: i, reason: collision with root package name */
        public Object f2302i;

        /* renamed from: j, reason: collision with root package name */
        public Object f2303j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f2304k;

        /* renamed from: m, reason: collision with root package name */
        public int f2306m;

        public n(s2.e eVar) {
            super(eVar);
        }

        @Override // u2.AbstractC0748a
        public final Object l(Object obj) {
            this.f2304k = obj;
            this.f2306m |= Integer.MIN_VALUE;
            return m.this.x(this);
        }
    }

    public static final class o extends u2.d {

        /* renamed from: h, reason: collision with root package name */
        public Object f2307h;

        /* renamed from: i, reason: collision with root package name */
        public Object f2308i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f2309j;

        /* renamed from: l, reason: collision with root package name */
        public int f2311l;

        public o(s2.e eVar) {
            super(eVar);
        }

        @Override // u2.AbstractC0748a
        public final Object l(Object obj) {
            this.f2309j = obj;
            this.f2311l |= Integer.MIN_VALUE;
            return m.this.y(this);
        }
    }

    public static final class p extends u2.d {

        /* renamed from: h, reason: collision with root package name */
        public Object f2312h;

        /* renamed from: i, reason: collision with root package name */
        public Object f2313i;

        /* renamed from: j, reason: collision with root package name */
        public Object f2314j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f2315k;

        /* renamed from: m, reason: collision with root package name */
        public int f2317m;

        public p(s2.e eVar) {
            super(eVar);
        }

        @Override // u2.AbstractC0748a
        public final Object l(Object obj) {
            this.f2315k = obj;
            this.f2317m |= Integer.MIN_VALUE;
            return m.this.z(null, null, this);
        }
    }

    public static final class q extends u2.k implements B2.p {

        /* renamed from: i, reason: collision with root package name */
        public int f2318i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ B2.p f2319j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ Object f2320k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(B2.p pVar, Object obj, s2.e eVar) {
            super(2, eVar);
            this.f2319j = pVar;
            this.f2320k = obj;
        }

        @Override // u2.AbstractC0748a
        public final s2.e a(Object obj, s2.e eVar) {
            return new q(this.f2319j, this.f2320k, eVar);
        }

        @Override // u2.AbstractC0748a
        public final Object l(Object obj) {
            Object c3 = AbstractC0733c.c();
            int i3 = this.f2318i;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q2.i.b(obj);
                return obj;
            }
            q2.i.b(obj);
            B2.p pVar = this.f2319j;
            Object obj2 = this.f2320k;
            this.f2318i = 1;
            Object h3 = pVar.h(obj2, this);
            return h3 == c3 ? c3 : h3;
        }

        @Override // B2.p
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public final Object h(I i3, s2.e eVar) {
            return ((q) a(i3, eVar)).l(q2.n.f8874a);
        }
    }

    public static final class r extends u2.d {

        /* renamed from: h, reason: collision with root package name */
        public Object f2321h;

        /* renamed from: i, reason: collision with root package name */
        public Object f2322i;

        /* renamed from: j, reason: collision with root package name */
        public Object f2323j;

        /* renamed from: k, reason: collision with root package name */
        public Object f2324k;

        /* renamed from: l, reason: collision with root package name */
        public Object f2325l;

        /* renamed from: m, reason: collision with root package name */
        public /* synthetic */ Object f2326m;

        /* renamed from: o, reason: collision with root package name */
        public int f2328o;

        public r(s2.e eVar) {
            super(eVar);
        }

        @Override // u2.AbstractC0748a
        public final Object l(Object obj) {
            this.f2326m = obj;
            this.f2328o |= Integer.MIN_VALUE;
            return m.this.A(null, this);
        }
    }

    public m(B2.a aVar, V.k kVar, List list, V.b bVar, I i3) {
        C2.k.e(aVar, "produceFile");
        C2.k.e(kVar, "serializer");
        C2.k.e(list, "initTasksList");
        C2.k.e(bVar, "corruptionHandler");
        C2.k.e(i3, "scope");
        this.f2233a = aVar;
        this.f2234b = kVar;
        this.f2235c = bVar;
        this.f2236d = i3;
        this.f2237e = N2.f.g(new g(null));
        this.f2238f = ".tmp";
        this.f2239g = q2.e.a(new h());
        this.f2240h = N2.t.a(V.o.f2329a);
        this.f2241i = u.x(list);
        this.f2242j = new V.l(i3, new d(), e.f2250f, new f(null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a2 A[Catch: IOException -> 0x00be, TRY_ENTER, TryCatch #3 {IOException -> 0x00be, blocks: (B:14:0x0092, B:19:0x00a2, B:20:0x00bd, B:27:0x00c5, B:28:0x00c8, B:24:0x00c3), top: B:7:0x0021, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.FileOutputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.StringBuilder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object A(java.lang.Object r8, s2.e r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof V.m.r
            if (r0 == 0) goto L13
            r0 = r9
            V.m$r r0 = (V.m.r) r0
            int r1 = r0.f2328o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2328o = r1
            goto L18
        L13:
            V.m$r r0 = new V.m$r
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f2326m
            java.lang.Object r1 = t2.AbstractC0733c.c()
            int r2 = r0.f2328o
            r3 = 1
            if (r2 == 0) goto L48
            if (r2 != r3) goto L40
            java.lang.Object r8 = r0.f2325l
            java.io.FileOutputStream r8 = (java.io.FileOutputStream) r8
            java.lang.Object r1 = r0.f2324k
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r2 = r0.f2323j
            java.io.Closeable r2 = (java.io.Closeable) r2
            java.lang.Object r3 = r0.f2322i
            java.io.File r3 = (java.io.File) r3
            java.lang.Object r0 = r0.f2321h
            V.m r0 = (V.m) r0
            q2.i.b(r9)     // Catch: java.lang.Throwable -> L3d
            goto L89
        L3d:
            r8 = move-exception
            goto Lc3
        L40:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L48:
            q2.i.b(r9)
            java.io.File r9 = r7.r()
            r7.q(r9)
            java.io.File r9 = new java.io.File
            java.io.File r2 = r7.r()
            java.lang.String r2 = r2.getAbsolutePath()
            java.lang.String r4 = r7.f2238f
            java.lang.String r2 = C2.k.j(r2, r4)
            r9.<init>(r2)
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.io.IOException -> Lc9
            r2.<init>(r9)     // Catch: java.io.IOException -> Lc9
            V.k r4 = r7.f2234b     // Catch: java.lang.Throwable -> Lc1
            V.m$c r5 = new V.m$c     // Catch: java.lang.Throwable -> Lc1
            r5.<init>(r2)     // Catch: java.lang.Throwable -> Lc1
            r0.f2321h = r7     // Catch: java.lang.Throwable -> Lc1
            r0.f2322i = r9     // Catch: java.lang.Throwable -> Lc1
            r0.f2323j = r2     // Catch: java.lang.Throwable -> Lc1
            r6 = 0
            r0.f2324k = r6     // Catch: java.lang.Throwable -> Lc1
            r0.f2325l = r2     // Catch: java.lang.Throwable -> Lc1
            r0.f2328o = r3     // Catch: java.lang.Throwable -> Lc1
            java.lang.Object r8 = r4.a(r8, r5, r0)     // Catch: java.lang.Throwable -> Lc1
            if (r8 != r1) goto L85
            return r1
        L85:
            r0 = r7
            r3 = r9
            r8 = r2
            r1 = r6
        L89:
            java.io.FileDescriptor r8 = r8.getFD()     // Catch: java.lang.Throwable -> L3d
            r8.sync()     // Catch: java.lang.Throwable -> L3d
            q2.n r8 = q2.n.f8874a     // Catch: java.lang.Throwable -> L3d
            z2.a.a(r2, r1)     // Catch: java.io.IOException -> Lbe
            java.io.File r8 = r0.r()     // Catch: java.io.IOException -> Lbe
            boolean r8 = r3.renameTo(r8)     // Catch: java.io.IOException -> Lbe
            if (r8 == 0) goto La2
            q2.n r8 = q2.n.f8874a
            return r8
        La2:
            java.io.IOException r8 = new java.io.IOException     // Catch: java.io.IOException -> Lbe
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Lbe
            r9.<init>()     // Catch: java.io.IOException -> Lbe
            java.lang.String r0 = "Unable to rename "
            r9.append(r0)     // Catch: java.io.IOException -> Lbe
            r9.append(r3)     // Catch: java.io.IOException -> Lbe
            java.lang.String r0 = ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file."
            r9.append(r0)     // Catch: java.io.IOException -> Lbe
            java.lang.String r9 = r9.toString()     // Catch: java.io.IOException -> Lbe
            r8.<init>(r9)     // Catch: java.io.IOException -> Lbe
            throw r8     // Catch: java.io.IOException -> Lbe
        Lbe:
            r8 = move-exception
            r9 = r3
            goto Lca
        Lc1:
            r8 = move-exception
            r3 = r9
        Lc3:
            throw r8     // Catch: java.lang.Throwable -> Lc4
        Lc4:
            r9 = move-exception
            z2.a.a(r2, r8)     // Catch: java.io.IOException -> Lbe
            throw r9     // Catch: java.io.IOException -> Lbe
        Lc9:
            r8 = move-exception
        Lca:
            boolean r0 = r9.exists()
            if (r0 == 0) goto Ld3
            r9.delete()
        Ld3:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: V.m.A(java.lang.Object, s2.e):java.lang.Object");
    }

    @Override // V.f
    public Object a(B2.p pVar, s2.e eVar) {
        InterfaceC0255u b3 = AbstractC0257w.b(null, 1, null);
        this.f2242j.e(new b.C0063b(pVar, b3, (V.n) this.f2240h.getValue(), eVar.c()));
        return b3.F(eVar);
    }

    @Override // V.f
    public N2.d b() {
        return this.f2237e;
    }

    public final void q(File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (!parentFile.isDirectory()) {
            throw new IOException(C2.k.j("Unable to create parent directories of ", file));
        }
    }

    public final File r() {
        return (File) this.f2239g.getValue();
    }

    public final Object s(b.a aVar, s2.e eVar) {
        V.n nVar = (V.n) this.f2240h.getValue();
        if (!(nVar instanceof V.c)) {
            if (nVar instanceof V.j) {
                if (nVar == aVar.a()) {
                    Object w3 = w(eVar);
                    return w3 == AbstractC0733c.c() ? w3 : q2.n.f8874a;
                }
            } else {
                if (C2.k.a(nVar, V.o.f2329a)) {
                    Object w4 = w(eVar);
                    return w4 == AbstractC0733c.c() ? w4 : q2.n.f8874a;
                }
                if (nVar instanceof V.h) {
                    throw new IllegalStateException("Can't read in final state.");
                }
            }
        }
        return q2.n.f8874a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(5:5|6|7|(5:(1:(1:(1:12)(2:19|20))(3:21|22|23))(1:28)|13|14|15|16)(5:29|30|31|(6:33|(1:35)|26|14|15|16)(3:36|(1:38)(1:54)|(2:40|(2:42|(1:44)(1:45))(2:46|47))(2:48|(2:50|51)(2:52|53)))|27)|24))|59|6|7|(0)(0)|24|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00bb, code lost:
    
        if (r9 != r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0034, code lost:
    
        r10 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r9v20, types: [K2.u] */
    /* JADX WARN: Type inference failed for: r9v27, types: [K2.u] */
    /* JADX WARN: Type inference failed for: r9v3, types: [K2.u] */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v32 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object t(V.m.b.C0063b r9, s2.e r10) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: V.m.t(V.m$b$b, s2.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object u(s2.e r14) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: V.m.u(s2.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object v(s2.e r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof V.m.l
            if (r0 == 0) goto L13
            r0 = r5
            V.m$l r0 = (V.m.l) r0
            int r1 = r0.f2296k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2296k = r1
            goto L18
        L13:
            V.m$l r0 = new V.m$l
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f2294i
            java.lang.Object r1 = t2.AbstractC0733c.c()
            int r2 = r0.f2296k
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r0 = r0.f2293h
            V.m r0 = (V.m) r0
            q2.i.b(r5)     // Catch: java.lang.Throwable -> L2d
            goto L45
        L2d:
            r5 = move-exception
            goto L4a
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L37:
            q2.i.b(r5)
            r0.f2293h = r4     // Catch: java.lang.Throwable -> L48
            r0.f2296k = r3     // Catch: java.lang.Throwable -> L48
            java.lang.Object r5 = r4.u(r0)     // Catch: java.lang.Throwable -> L48
            if (r5 != r1) goto L45
            return r1
        L45:
            q2.n r5 = q2.n.f8874a
            return r5
        L48:
            r5 = move-exception
            r0 = r4
        L4a:
            N2.n r0 = r0.f2240h
            V.j r1 = new V.j
            r1.<init>(r5)
            r0.setValue(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: V.m.v(s2.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object w(s2.e r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof V.m.C0065m
            if (r0 == 0) goto L13
            r0 = r5
            V.m$m r0 = (V.m.C0065m) r0
            int r1 = r0.f2300k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2300k = r1
            goto L18
        L13:
            V.m$m r0 = new V.m$m
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f2298i
            java.lang.Object r1 = t2.AbstractC0733c.c()
            int r2 = r0.f2300k
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r0 = r0.f2297h
            V.m r0 = (V.m) r0
            q2.i.b(r5)     // Catch: java.lang.Throwable -> L2d
            goto L51
        L2d:
            r5 = move-exception
            goto L47
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L37:
            q2.i.b(r5)
            r0.f2297h = r4     // Catch: java.lang.Throwable -> L45
            r0.f2300k = r3     // Catch: java.lang.Throwable -> L45
            java.lang.Object r5 = r4.u(r0)     // Catch: java.lang.Throwable -> L45
            if (r5 != r1) goto L51
            return r1
        L45:
            r5 = move-exception
            r0 = r4
        L47:
            N2.n r0 = r0.f2240h
            V.j r1 = new V.j
            r1.<init>(r5)
            r0.setValue(r1)
        L51:
            q2.n r5 = q2.n.f8874a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: V.m.w(s2.e):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r0v11, types: [V.m] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2, types: [V.m$n, s2.e] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [V.m] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.FileInputStream, java.io.InputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v9, types: [V.k] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object x(s2.e r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof V.m.n
            if (r0 == 0) goto L13
            r0 = r6
            V.m$n r0 = (V.m.n) r0
            int r1 = r0.f2306m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2306m = r1
            goto L18
        L13:
            V.m$n r0 = new V.m$n
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f2304k
            java.lang.Object r1 = t2.AbstractC0733c.c()
            int r2 = r0.f2306m
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r1 = r0.f2303j
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r2 = r0.f2302i
            java.io.Closeable r2 = (java.io.Closeable) r2
            java.lang.Object r0 = r0.f2301h
            V.m r0 = (V.m) r0
            q2.i.b(r6)     // Catch: java.lang.Throwable -> L35
            goto L5f
        L35:
            r6 = move-exception
            goto L67
        L37:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3f:
            q2.i.b(r6)
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L6d
            java.io.File r6 = r5.r()     // Catch: java.io.FileNotFoundException -> L6d
            r2.<init>(r6)     // Catch: java.io.FileNotFoundException -> L6d
            V.k r6 = r5.f2234b     // Catch: java.lang.Throwable -> L65
            r0.f2301h = r5     // Catch: java.lang.Throwable -> L65
            r0.f2302i = r2     // Catch: java.lang.Throwable -> L65
            r4 = 0
            r0.f2303j = r4     // Catch: java.lang.Throwable -> L65
            r0.f2306m = r3     // Catch: java.lang.Throwable -> L65
            java.lang.Object r6 = r6.b(r2, r0)     // Catch: java.lang.Throwable -> L65
            if (r6 != r1) goto L5d
            return r1
        L5d:
            r0 = r5
            r1 = r4
        L5f:
            z2.a.a(r2, r1)     // Catch: java.io.FileNotFoundException -> L63
            return r6
        L63:
            r6 = move-exception
            goto L6f
        L65:
            r6 = move-exception
            r0 = r5
        L67:
            throw r6     // Catch: java.lang.Throwable -> L68
        L68:
            r1 = move-exception
            z2.a.a(r2, r6)     // Catch: java.io.FileNotFoundException -> L63
            throw r1     // Catch: java.io.FileNotFoundException -> L63
        L6d:
            r6 = move-exception
            r0 = r5
        L6f:
            java.io.File r1 = r0.r()
            boolean r1 = r1.exists()
            if (r1 != 0) goto L80
            V.k r6 = r0.f2234b
            java.lang.Object r6 = r6.c()
            return r6
        L80:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: V.m.x(s2.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object y(s2.e r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof V.m.o
            if (r0 == 0) goto L13
            r0 = r8
            V.m$o r0 = (V.m.o) r0
            int r1 = r0.f2311l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2311l = r1
            goto L18
        L13:
            V.m$o r0 = new V.m$o
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f2309j
            java.lang.Object r1 = t2.AbstractC0733c.c()
            int r2 = r0.f2311l
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L55
            if (r2 == r5) goto L4b
            if (r2 == r4) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r1 = r0.f2308i
            java.lang.Object r0 = r0.f2307h
            V.a r0 = (V.a) r0
            q2.i.b(r8)     // Catch: java.io.IOException -> L35
            return r1
        L35:
            r8 = move-exception
            goto L89
        L37:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3f:
            java.lang.Object r2 = r0.f2308i
            V.a r2 = (V.a) r2
            java.lang.Object r4 = r0.f2307h
            V.m r4 = (V.m) r4
            q2.i.b(r8)
            goto L79
        L4b:
            java.lang.Object r2 = r0.f2307h
            V.m r2 = (V.m) r2
            q2.i.b(r8)     // Catch: V.a -> L53
            return r8
        L53:
            r8 = move-exception
            goto L66
        L55:
            q2.i.b(r8)
            r0.f2307h = r7     // Catch: V.a -> L64
            r0.f2311l = r5     // Catch: V.a -> L64
            java.lang.Object r8 = r7.x(r0)     // Catch: V.a -> L64
            if (r8 != r1) goto L63
            goto L85
        L63:
            return r8
        L64:
            r8 = move-exception
            r2 = r7
        L66:
            V.b r5 = r2.f2235c
            r0.f2307h = r2
            r0.f2308i = r8
            r0.f2311l = r4
            java.lang.Object r4 = r5.a(r8, r0)
            if (r4 != r1) goto L75
            goto L85
        L75:
            r6 = r2
            r2 = r8
            r8 = r4
            r4 = r6
        L79:
            r0.f2307h = r2     // Catch: java.io.IOException -> L87
            r0.f2308i = r8     // Catch: java.io.IOException -> L87
            r0.f2311l = r3     // Catch: java.io.IOException -> L87
            java.lang.Object r0 = r4.A(r8, r0)     // Catch: java.io.IOException -> L87
            if (r0 != r1) goto L86
        L85:
            return r1
        L86:
            return r8
        L87:
            r8 = move-exception
            r0 = r2
        L89:
            q2.AbstractC0672a.a(r0, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: V.m.y(s2.e):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object z(B2.p r8, s2.i r9, s2.e r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof V.m.p
            if (r0 == 0) goto L13
            r0 = r10
            V.m$p r0 = (V.m.p) r0
            int r1 = r0.f2317m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2317m = r1
            goto L18
        L13:
            V.m$p r0 = new V.m$p
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f2315k
            java.lang.Object r1 = t2.AbstractC0733c.c()
            int r2 = r0.f2317m
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L49
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L33
            java.lang.Object r8 = r0.f2313i
            java.lang.Object r9 = r0.f2312h
            V.m r9 = (V.m) r9
            q2.i.b(r10)
            goto L8e
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            java.lang.Object r8 = r0.f2314j
            java.lang.Object r9 = r0.f2313i
            V.c r9 = (V.c) r9
            java.lang.Object r2 = r0.f2312h
            V.m r2 = (V.m) r2
            q2.i.b(r10)
            goto L73
        L49:
            q2.i.b(r10)
            N2.n r10 = r7.f2240h
            java.lang.Object r10 = r10.getValue()
            V.c r10 = (V.c) r10
            r10.a()
            java.lang.Object r2 = r10.b()
            V.m$q r6 = new V.m$q
            r6.<init>(r8, r2, r3)
            r0.f2312h = r7
            r0.f2313i = r10
            r0.f2314j = r2
            r0.f2317m = r5
            java.lang.Object r8 = K2.AbstractC0233g.e(r9, r6, r0)
            if (r8 != r1) goto L6f
            goto L8b
        L6f:
            r9 = r10
            r10 = r8
            r8 = r2
            r2 = r7
        L73:
            r9.a()
            boolean r9 = C2.k.a(r8, r10)
            if (r9 == 0) goto L7d
            return r8
        L7d:
            r0.f2312h = r2
            r0.f2313i = r10
            r0.f2314j = r3
            r0.f2317m = r4
            java.lang.Object r8 = r2.A(r10, r0)
            if (r8 != r1) goto L8c
        L8b:
            return r1
        L8c:
            r8 = r10
            r9 = r2
        L8e:
            N2.n r9 = r9.f2240h
            V.c r10 = new V.c
            if (r8 == 0) goto L99
            int r0 = r8.hashCode()
            goto L9a
        L99:
            r0 = 0
        L9a:
            r10.<init>(r8, r0)
            r9.setValue(r10)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: V.m.z(B2.p, s2.i, s2.e):java.lang.Object");
    }
}
