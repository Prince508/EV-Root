package O2;

import s2.f;
import t2.AbstractC0733c;

/* loaded from: classes.dex */
public abstract class g extends e {

    /* renamed from: h, reason: collision with root package name */
    public final N2.d f1620h;

    public static final class a extends u2.k implements B2.p {

        /* renamed from: i, reason: collision with root package name */
        public int f1621i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f1622j;

        public a(s2.e eVar) {
            super(2, eVar);
        }

        @Override // u2.AbstractC0748a
        public final s2.e a(Object obj, s2.e eVar) {
            a aVar = g.this.new a(eVar);
            aVar.f1622j = obj;
            return aVar;
        }

        @Override // u2.AbstractC0748a
        public final Object l(Object obj) {
            Object c3 = AbstractC0733c.c();
            int i3 = this.f1621i;
            if (i3 == 0) {
                q2.i.b(obj);
                N2.e eVar = (N2.e) this.f1622j;
                g gVar = g.this;
                this.f1621i = 1;
                if (gVar.m(eVar, this) == c3) {
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
            return ((a) a(eVar, eVar2)).l(q2.n.f8874a);
        }
    }

    public g(N2.d dVar, s2.i iVar, int i3, M2.a aVar) {
        super(iVar, i3, aVar);
        this.f1620h = dVar;
    }

    public static /* synthetic */ Object j(g gVar, N2.e eVar, s2.e eVar2) {
        if (gVar.f1611f == -3) {
            s2.i c3 = eVar2.c();
            s2.i r3 = c3.r(gVar.f1610e);
            if (C2.k.a(r3, c3)) {
                Object m3 = gVar.m(eVar, eVar2);
                return m3 == AbstractC0733c.c() ? m3 : q2.n.f8874a;
            }
            f.b bVar = s2.f.f9290d;
            if (C2.k.a(r3.a(bVar), c3.a(bVar))) {
                Object l3 = gVar.l(eVar, r3, eVar2);
                return l3 == AbstractC0733c.c() ? l3 : q2.n.f8874a;
            }
        }
        Object b3 = super.b(eVar, eVar2);
        return b3 == AbstractC0733c.c() ? b3 : q2.n.f8874a;
    }

    public static /* synthetic */ Object k(g gVar, M2.r rVar, s2.e eVar) {
        Object m3 = gVar.m(new q(rVar), eVar);
        return m3 == AbstractC0733c.c() ? m3 : q2.n.f8874a;
    }

    @Override // O2.e, N2.d
    public Object b(N2.e eVar, s2.e eVar2) {
        return j(this, eVar, eVar2);
    }

    @Override // O2.e
    public Object e(M2.r rVar, s2.e eVar) {
        return k(this, rVar, eVar);
    }

    public final Object l(N2.e eVar, s2.i iVar, s2.e eVar2) {
        N2.e d3;
        d3 = f.d(eVar, eVar2.c());
        Object c3 = f.c(iVar, d3, null, new a(null), eVar2, 4, null);
        return c3 == AbstractC0733c.c() ? c3 : q2.n.f8874a;
    }

    public abstract Object m(N2.e eVar, s2.e eVar2);

    @Override // O2.e
    public String toString() {
        return this.f1620h + " -> " + super.toString();
    }
}
