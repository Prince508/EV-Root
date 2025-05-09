package s2;

import C2.k;
import s2.i;

/* loaded from: classes.dex */
public interface f extends i.b {

    /* renamed from: d, reason: collision with root package name */
    public static final b f9290d = b.f9291e;

    public static final class a {
        public static i.b a(f fVar, i.c cVar) {
            i.b b3;
            k.e(cVar, "key");
            if (!(cVar instanceof s2.b)) {
                if (f.f9290d != cVar) {
                    return null;
                }
                k.c(fVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return fVar;
            }
            s2.b bVar = (s2.b) cVar;
            if (!bVar.a(fVar.getKey()) || (b3 = bVar.b(fVar)) == null) {
                return null;
            }
            return b3;
        }

        public static i b(f fVar, i.c cVar) {
            k.e(cVar, "key");
            if (!(cVar instanceof s2.b)) {
                return f.f9290d == cVar ? j.f9292e : fVar;
            }
            s2.b bVar = (s2.b) cVar;
            return (!bVar.a(fVar.getKey()) || bVar.b(fVar) == null) ? fVar : j.f9292e;
        }
    }

    public static final class b implements i.c {

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ b f9291e = new b();
    }

    void B(e eVar);

    e J(e eVar);
}
