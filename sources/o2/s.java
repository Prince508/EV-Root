package O2;

import P2.J;
import t2.AbstractC0733c;

/* loaded from: classes.dex */
public final class s implements N2.e {

    /* renamed from: e, reason: collision with root package name */
    public final s2.i f1643e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f1644f;

    /* renamed from: g, reason: collision with root package name */
    public final B2.p f1645g;

    public static final class a extends u2.k implements B2.p {

        /* renamed from: i, reason: collision with root package name */
        public int f1646i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f1647j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ N2.e f1648k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(N2.e eVar, s2.e eVar2) {
            super(2, eVar2);
            this.f1648k = eVar;
        }

        @Override // u2.AbstractC0748a
        public final s2.e a(Object obj, s2.e eVar) {
            a aVar = new a(this.f1648k, eVar);
            aVar.f1647j = obj;
            return aVar;
        }

        @Override // u2.AbstractC0748a
        public final Object l(Object obj) {
            Object c3 = AbstractC0733c.c();
            int i3 = this.f1646i;
            if (i3 == 0) {
                q2.i.b(obj);
                Object obj2 = this.f1647j;
                N2.e eVar = this.f1648k;
                this.f1646i = 1;
                if (eVar.d(obj2, this) == c3) {
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
        public final Object h(Object obj, s2.e eVar) {
            return ((a) a(obj, eVar)).l(q2.n.f8874a);
        }
    }

    public s(N2.e eVar, s2.i iVar) {
        this.f1643e = iVar;
        this.f1644f = J.b(iVar);
        this.f1645g = new a(eVar, null);
    }

    @Override // N2.e
    public Object d(Object obj, s2.e eVar) {
        Object b3 = f.b(this.f1643e, obj, this.f1644f, this.f1645g, eVar);
        return b3 == AbstractC0733c.c() ? b3 : q2.n.f8874a;
    }
}
