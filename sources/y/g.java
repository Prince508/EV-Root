package Y;

import B2.p;
import q2.i;
import q2.n;
import t2.AbstractC0733c;
import u2.k;

/* loaded from: classes.dex */
public abstract class g {

    public static final class a extends k implements p {

        /* renamed from: i, reason: collision with root package name */
        public int f2387i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f2388j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ p f2389k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p pVar, s2.e eVar) {
            super(2, eVar);
            this.f2389k = pVar;
        }

        @Override // u2.AbstractC0748a
        public final s2.e a(Object obj, s2.e eVar) {
            a aVar = new a(this.f2389k, eVar);
            aVar.f2388j = obj;
            return aVar;
        }

        @Override // u2.AbstractC0748a
        public final Object l(Object obj) {
            Object c3 = AbstractC0733c.c();
            int i3 = this.f2387i;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Y.a aVar = (Y.a) this.f2388j;
                i.b(obj);
                return aVar;
            }
            i.b(obj);
            Y.a c4 = ((d) this.f2388j).c();
            p pVar = this.f2389k;
            this.f2388j = c4;
            this.f2387i = 1;
            return pVar.h(c4, this) == c3 ? c3 : c4;
        }

        @Override // B2.p
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public final Object h(d dVar, s2.e eVar) {
            return ((a) a(dVar, eVar)).l(n.f8874a);
        }
    }

    public static final Object a(V.f fVar, p pVar, s2.e eVar) {
        return fVar.a(new a(pVar, null), eVar);
    }
}
