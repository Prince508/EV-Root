package V;

import B2.p;
import j.AbstractC0515e;
import java.util.Iterator;
import java.util.List;
import t2.AbstractC0733c;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final a f2200a = new a(null);

    public static final class a {

        /* renamed from: V.e$a$a, reason: collision with other inner class name */
        public static final class C0061a extends u2.k implements p {

            /* renamed from: i, reason: collision with root package name */
            public int f2201i;

            /* renamed from: j, reason: collision with root package name */
            public /* synthetic */ Object f2202j;

            /* renamed from: k, reason: collision with root package name */
            public final /* synthetic */ List f2203k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0061a(List list, s2.e eVar) {
                super(2, eVar);
                this.f2203k = list;
            }

            @Override // u2.AbstractC0748a
            public final s2.e a(Object obj, s2.e eVar) {
                C0061a c0061a = new C0061a(this.f2203k, eVar);
                c0061a.f2202j = obj;
                return c0061a;
            }

            @Override // u2.AbstractC0748a
            public final Object l(Object obj) {
                Object c3 = AbstractC0733c.c();
                int i3 = this.f2201i;
                if (i3 == 0) {
                    q2.i.b(obj);
                    i iVar = (i) this.f2202j;
                    a aVar = e.f2200a;
                    List list = this.f2203k;
                    this.f2201i = 1;
                    if (aVar.c(list, iVar, this) == c3) {
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
            public final Object h(i iVar, s2.e eVar) {
                return ((C0061a) a(iVar, eVar)).l(q2.n.f8874a);
            }
        }

        public static final class b extends u2.d {

            /* renamed from: h, reason: collision with root package name */
            public Object f2204h;

            /* renamed from: i, reason: collision with root package name */
            public Object f2205i;

            /* renamed from: j, reason: collision with root package name */
            public /* synthetic */ Object f2206j;

            /* renamed from: l, reason: collision with root package name */
            public int f2208l;

            public b(s2.e eVar) {
                super(eVar);
            }

            @Override // u2.AbstractC0748a
            public final Object l(Object obj) {
                this.f2206j = obj;
                this.f2208l |= Integer.MIN_VALUE;
                return a.this.c(null, null, this);
            }
        }

        public static final class c extends u2.k implements p {

            /* renamed from: i, reason: collision with root package name */
            public Object f2209i;

            /* renamed from: j, reason: collision with root package name */
            public Object f2210j;

            /* renamed from: k, reason: collision with root package name */
            public Object f2211k;

            /* renamed from: l, reason: collision with root package name */
            public int f2212l;

            /* renamed from: m, reason: collision with root package name */
            public /* synthetic */ Object f2213m;

            /* renamed from: n, reason: collision with root package name */
            public final /* synthetic */ List f2214n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ List f2215o;

            /* renamed from: V.e$a$c$a, reason: collision with other inner class name */
            public static final class C0062a extends u2.k implements B2.l {

                /* renamed from: i, reason: collision with root package name */
                public int f2216i;

                public C0062a(d dVar, s2.e eVar) {
                    super(1, eVar);
                }

                @Override // u2.AbstractC0748a
                public final Object l(Object obj) {
                    AbstractC0733c.c();
                    int i3 = this.f2216i;
                    if (i3 == 0) {
                        q2.i.b(obj);
                        this.f2216i = 1;
                        throw null;
                    }
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    q2.i.b(obj);
                    return q2.n.f8874a;
                }

                public final s2.e p(s2.e eVar) {
                    return new C0062a(null, eVar);
                }

                @Override // B2.l
                /* renamed from: q, reason: merged with bridge method [inline-methods] */
                public final Object j(s2.e eVar) {
                    return ((C0062a) p(eVar)).l(q2.n.f8874a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(List list, List list2, s2.e eVar) {
                super(2, eVar);
                this.f2214n = list;
                this.f2215o = list2;
            }

            @Override // u2.AbstractC0748a
            public final s2.e a(Object obj, s2.e eVar) {
                c cVar = new c(this.f2214n, this.f2215o, eVar);
                cVar.f2213m = obj;
                return cVar;
            }

            @Override // u2.AbstractC0748a
            public final Object l(Object obj) {
                List list;
                Iterator it;
                AbstractC0733c.c();
                int i3 = this.f2212l;
                if (i3 == 0) {
                    q2.i.b(obj);
                    obj = this.f2213m;
                    List list2 = this.f2214n;
                    list = this.f2215o;
                    it = list2.iterator();
                } else if (i3 == 1) {
                    Object obj2 = this.f2211k;
                    AbstractC0515e.a(this.f2210j);
                    Iterator it2 = (Iterator) this.f2209i;
                    List list3 = (List) this.f2213m;
                    q2.i.b(obj);
                    if (((Boolean) obj).booleanValue()) {
                        list3.add(new C0062a(null, null));
                        this.f2213m = list3;
                        this.f2209i = it2;
                        this.f2210j = null;
                        this.f2211k = null;
                        this.f2212l = 2;
                        throw null;
                    }
                    obj = obj2;
                    it = it2;
                    list = list3;
                } else {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) this.f2209i;
                    list = (List) this.f2213m;
                    q2.i.b(obj);
                }
                if (!it.hasNext()) {
                    return obj;
                }
                AbstractC0515e.a(it.next());
                this.f2213m = list;
                this.f2209i = it;
                this.f2210j = null;
                this.f2211k = obj;
                this.f2212l = 1;
                throw null;
            }

            @Override // B2.p
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public final Object h(Object obj, s2.e eVar) {
                return ((c) a(obj, eVar)).l(q2.n.f8874a);
            }
        }

        public /* synthetic */ a(C2.g gVar) {
            this();
        }

        public final p b(List list) {
            C2.k.e(list, "migrations");
            return new C0061a(list, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0046  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0086 -> B:13:0x0069). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0089 -> B:13:0x0069). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object c(java.util.List r7, V.i r8, s2.e r9) {
            /*
                r6 = this;
                boolean r0 = r9 instanceof V.e.a.b
                if (r0 == 0) goto L13
                r0 = r9
                V.e$a$b r0 = (V.e.a.b) r0
                int r1 = r0.f2208l
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f2208l = r1
                goto L18
            L13:
                V.e$a$b r0 = new V.e$a$b
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f2206j
                java.lang.Object r1 = t2.AbstractC0733c.c()
                int r2 = r0.f2208l
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L3e
                if (r2 != r3) goto L36
                java.lang.Object r7 = r0.f2205i
                java.util.Iterator r7 = (java.util.Iterator) r7
                java.lang.Object r8 = r0.f2204h
                C2.t r8 = (C2.t) r8
                q2.i.b(r9)     // Catch: java.lang.Throwable -> L34
                goto L69
            L34:
                r9 = move-exception
                goto L82
            L36:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L3e:
                java.lang.Object r7 = r0.f2204h
                java.util.List r7 = (java.util.List) r7
                q2.i.b(r9)
                goto L60
            L46:
                q2.i.b(r9)
                java.util.ArrayList r9 = new java.util.ArrayList
                r9.<init>()
                V.e$a$c r2 = new V.e$a$c
                r5 = 0
                r2.<init>(r7, r9, r5)
                r0.f2204h = r9
                r0.f2208l = r4
                java.lang.Object r7 = r8.a(r2, r0)
                if (r7 != r1) goto L5f
                goto L81
            L5f:
                r7 = r9
            L60:
                C2.t r8 = new C2.t
                r8.<init>()
                java.util.Iterator r7 = r7.iterator()
            L69:
                boolean r9 = r7.hasNext()
                if (r9 == 0) goto L94
                java.lang.Object r9 = r7.next()
                B2.l r9 = (B2.l) r9
                r0.f2204h = r8     // Catch: java.lang.Throwable -> L34
                r0.f2205i = r7     // Catch: java.lang.Throwable -> L34
                r0.f2208l = r3     // Catch: java.lang.Throwable -> L34
                java.lang.Object r9 = r9.j(r0)     // Catch: java.lang.Throwable -> L34
                if (r9 != r1) goto L69
            L81:
                return r1
            L82:
                java.lang.Object r2 = r8.f321e
                if (r2 != 0) goto L89
                r8.f321e = r9
                goto L69
            L89:
                C2.k.b(r2)
                java.lang.Object r2 = r8.f321e
                java.lang.Throwable r2 = (java.lang.Throwable) r2
                q2.AbstractC0672a.a(r2, r9)
                goto L69
            L94:
                java.lang.Object r7 = r8.f321e
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 != 0) goto L9d
                q2.n r7 = q2.n.f8874a
                return r7
            L9d:
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: V.e.a.c(java.util.List, V.i, s2.e):java.lang.Object");
        }

        public a() {
        }
    }
}
