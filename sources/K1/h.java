package K1;

import B1.v;
import B1.w;
import B1.x;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class h implements w {

    /* renamed from: a, reason: collision with root package name */
    public static final h f1097a = new h();

    public static class b implements g {

        /* renamed from: a, reason: collision with root package name */
        public final v f1098a;

        public b(v vVar) {
            this.f1098a = vVar;
        }
    }

    public static void d() {
        x.n(f1097a);
    }

    @Override // B1.w
    public Class a() {
        return g.class;
    }

    @Override // B1.w
    public Class b() {
        return g.class;
    }

    @Override // B1.w
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public g c(v vVar) {
        if (vVar == null) {
            throw new GeneralSecurityException("primitive set must be non-null");
        }
        if (vVar.e() == null) {
            throw new GeneralSecurityException("no primary in primitive set");
        }
        Iterator it = vVar.c().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((List) it.next()).iterator();
            while (it2.hasNext()) {
            }
        }
        return new b(vVar);
    }
}
