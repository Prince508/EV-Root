package K2;

import s2.i;

/* loaded from: classes.dex */
public abstract class E {

    public static final class a extends C2.l implements B2.p {

        /* renamed from: f, reason: collision with root package name */
        public static final a f1148f = new a();

        public a() {
            super(2);
        }

        @Override // B2.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final s2.i h(s2.i iVar, i.b bVar) {
            return iVar.r(bVar);
        }
    }

    public static final class b extends C2.l implements B2.p {

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ C2.t f1149f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ boolean f1150g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C2.t tVar, boolean z3) {
            super(2);
            this.f1149f = tVar;
            this.f1150g = z3;
        }

        @Override // B2.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final s2.i h(s2.i iVar, i.b bVar) {
            return iVar.r(bVar);
        }
    }

    public static final class c extends C2.l implements B2.p {

        /* renamed from: f, reason: collision with root package name */
        public static final c f1151f = new c();

        public c() {
            super(2);
        }

        public final Boolean a(boolean z3, i.b bVar) {
            return Boolean.valueOf(z3);
        }

        @Override // B2.p
        public /* bridge */ /* synthetic */ Object h(Object obj, Object obj2) {
            return a(((Boolean) obj).booleanValue(), (i.b) obj2);
        }
    }

    public static final s2.i a(s2.i iVar, s2.i iVar2, boolean z3) {
        boolean c3 = c(iVar);
        boolean c4 = c(iVar2);
        if (!c3 && !c4) {
            return iVar.r(iVar2);
        }
        C2.t tVar = new C2.t();
        tVar.f321e = iVar2;
        s2.j jVar = s2.j.f9292e;
        s2.i iVar3 = (s2.i) iVar.e(jVar, new b(tVar, z3));
        if (c4) {
            tVar.f321e = ((s2.i) tVar.f321e).e(jVar, a.f1148f);
        }
        return iVar3.r((s2.i) tVar.f321e);
    }

    public static final String b(s2.i iVar) {
        return null;
    }

    public static final boolean c(s2.i iVar) {
        return ((Boolean) iVar.e(Boolean.FALSE, c.f1151f)).booleanValue();
    }

    public static final s2.i d(I i3, s2.i iVar) {
        s2.i a3 = a(i3.t(), iVar, true);
        return (a3 == V.a() || a3.a(s2.f.f9290d) != null) ? a3 : a3.r(V.a());
    }

    public static final s2.i e(s2.i iVar, s2.i iVar2) {
        return !c(iVar2) ? iVar.r(iVar2) : a(iVar, iVar2, false);
    }

    public static final L0 f(u2.e eVar) {
        while (!(eVar instanceof S) && (eVar = eVar.m()) != null) {
            if (eVar instanceof L0) {
                return (L0) eVar;
            }
        }
        return null;
    }

    public static final L0 g(s2.e eVar, s2.i iVar, Object obj) {
        if (!(eVar instanceof u2.e) || iVar.a(M0.f1167e) == null) {
            return null;
        }
        L0 f3 = f((u2.e) eVar);
        if (f3 != null) {
            f3.U0(iVar, obj);
        }
        return f3;
    }
}
