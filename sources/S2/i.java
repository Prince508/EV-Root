package s2;

import B2.p;
import C2.k;
import s2.f;
import s2.i;

/* loaded from: classes.dex */
public interface i {

    public static final class a {
        public static i b(i iVar, i iVar2) {
            k.e(iVar2, "context");
            return iVar2 == j.f9292e ? iVar : (i) iVar2.e(iVar, new p() { // from class: s2.h
                @Override // B2.p
                public final Object h(Object obj, Object obj2) {
                    i c3;
                    c3 = i.a.c((i) obj, (i.b) obj2);
                    return c3;
                }
            });
        }

        public static i c(i iVar, b bVar) {
            k.e(iVar, "acc");
            k.e(bVar, "element");
            i H3 = iVar.H(bVar.getKey());
            j jVar = j.f9292e;
            if (H3 == jVar) {
                return bVar;
            }
            f.b bVar2 = f.f9290d;
            f fVar = (f) H3.a(bVar2);
            if (fVar == null) {
                return new d(H3, bVar);
            }
            i H4 = H3.H(bVar2);
            return H4 == jVar ? new d(bVar, fVar) : new d(new d(H4, bVar), fVar);
        }
    }

    public interface b extends i {

        public static final class a {
            public static Object a(b bVar, Object obj, p pVar) {
                k.e(pVar, "operation");
                return pVar.h(obj, bVar);
            }

            public static b b(b bVar, c cVar) {
                k.e(cVar, "key");
                if (!k.a(bVar.getKey(), cVar)) {
                    return null;
                }
                k.c(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return bVar;
            }

            public static i c(b bVar, c cVar) {
                k.e(cVar, "key");
                return k.a(bVar.getKey(), cVar) ? j.f9292e : bVar;
            }

            public static i d(b bVar, i iVar) {
                k.e(iVar, "context");
                return a.b(bVar, iVar);
            }
        }

        @Override // s2.i
        b a(c cVar);

        c getKey();
    }

    public interface c {
    }

    i H(c cVar);

    b a(c cVar);

    Object e(Object obj, p pVar);

    i r(i iVar);
}
