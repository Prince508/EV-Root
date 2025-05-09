package Y;

import B2.p;
import q2.i;
import q2.n;
import t2.AbstractC0733c;
import u2.k;

/* loaded from: classes.dex */
public final class b implements V.f {

    /* renamed from: a, reason: collision with root package name */
    public final V.f f2380a;

    public static final class a extends k implements p {

        /* renamed from: i, reason: collision with root package name */
        public int f2381i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f2382j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ p f2383k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p pVar, s2.e eVar) {
            super(2, eVar);
            this.f2383k = pVar;
        }

        @Override // u2.AbstractC0748a
        public final s2.e a(Object obj, s2.e eVar) {
            a aVar = new a(this.f2383k, eVar);
            aVar.f2382j = obj;
            return aVar;
        }

        @Override // u2.AbstractC0748a
        public final Object l(Object obj) {
            Object c3 = AbstractC0733c.c();
            int i3 = this.f2381i;
            if (i3 == 0) {
                i.b(obj);
                d dVar = (d) this.f2382j;
                p pVar = this.f2383k;
                this.f2381i = 1;
                obj = pVar.h(dVar, this);
                if (obj == c3) {
                    return c3;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i.b(obj);
            }
            d dVar2 = (d) obj;
            ((Y.a) dVar2).g();
            return dVar2;
        }

        @Override // B2.p
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public final Object h(d dVar, s2.e eVar) {
            return ((a) a(dVar, eVar)).l(n.f8874a);
        }
    }

    public b(V.f fVar) {
        C2.k.e(fVar, "delegate");
        this.f2380a = fVar;
    }

    @Override // V.f
    public Object a(p pVar, s2.e eVar) {
        return this.f2380a.a(new a(pVar, null), eVar);
    }

    @Override // V.f
    public N2.d b() {
        return this.f2380a.b();
    }
}
