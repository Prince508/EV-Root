package O2;

import K2.t0;
import s2.i;
import t2.AbstractC0733c;

/* loaded from: classes.dex */
public final class n extends u2.d implements N2.e, u2.e {

    /* renamed from: h, reason: collision with root package name */
    public final N2.e f1631h;

    /* renamed from: i, reason: collision with root package name */
    public final s2.i f1632i;

    /* renamed from: j, reason: collision with root package name */
    public final int f1633j;

    /* renamed from: k, reason: collision with root package name */
    public s2.i f1634k;

    /* renamed from: l, reason: collision with root package name */
    public s2.e f1635l;

    public static final class a extends C2.l implements B2.p {

        /* renamed from: f, reason: collision with root package name */
        public static final a f1636f = new a();

        public a() {
            super(2);
        }

        public final Integer a(int i3, i.b bVar) {
            return Integer.valueOf(i3 + 1);
        }

        @Override // B2.p
        public /* bridge */ /* synthetic */ Object h(Object obj, Object obj2) {
            return a(((Number) obj).intValue(), (i.b) obj2);
        }
    }

    public n(N2.e eVar, s2.i iVar) {
        super(l.f1626e, s2.j.f9292e);
        this.f1631h = eVar;
        this.f1632i = iVar;
        this.f1633j = ((Number) iVar.e(0, a.f1636f)).intValue();
    }

    @Override // u2.d, s2.e
    public s2.i c() {
        s2.i iVar = this.f1634k;
        return iVar == null ? s2.j.f9292e : iVar;
    }

    @Override // N2.e
    public Object d(Object obj, s2.e eVar) {
        try {
            Object q3 = q(eVar, obj);
            if (q3 == AbstractC0733c.c()) {
                u2.h.c(eVar);
            }
            return q3 == AbstractC0733c.c() ? q3 : q2.n.f8874a;
        } catch (Throwable th) {
            this.f1634k = new i(th, eVar.c());
            throw th;
        }
    }

    @Override // u2.AbstractC0748a
    public StackTraceElement k() {
        return null;
    }

    @Override // u2.AbstractC0748a
    public Object l(Object obj) {
        Throwable b3 = q2.h.b(obj);
        if (b3 != null) {
            this.f1634k = new i(b3, c());
        }
        s2.e eVar = this.f1635l;
        if (eVar != null) {
            eVar.u(obj);
        }
        return AbstractC0733c.c();
    }

    @Override // u2.AbstractC0748a, u2.e
    public u2.e m() {
        s2.e eVar = this.f1635l;
        if (eVar instanceof u2.e) {
            return (u2.e) eVar;
        }
        return null;
    }

    @Override // u2.d, u2.AbstractC0748a
    public void n() {
        super.n();
    }

    public final void p(s2.i iVar, s2.i iVar2, Object obj) {
        if (iVar2 instanceof i) {
            r((i) iVar2, obj);
        }
        p.a(this, iVar);
    }

    public final Object q(s2.e eVar, Object obj) {
        B2.q qVar;
        s2.i c3 = eVar.c();
        t0.e(c3);
        s2.i iVar = this.f1634k;
        if (iVar != c3) {
            p(c3, iVar, obj);
            this.f1634k = c3;
        }
        this.f1635l = eVar;
        qVar = o.f1637a;
        N2.e eVar2 = this.f1631h;
        C2.k.c(eVar2, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        C2.k.c(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        Object g3 = qVar.g(eVar2, obj, this);
        if (!C2.k.a(g3, AbstractC0733c.c())) {
            this.f1635l = null;
        }
        return g3;
    }

    public final void r(i iVar, Object obj) {
        throw new IllegalStateException(J2.g.i("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + iVar.f1624e + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }
}
