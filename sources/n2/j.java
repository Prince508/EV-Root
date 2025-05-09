package N2;

import K2.p0;
import O2.k;

/* loaded from: classes.dex */
public abstract /* synthetic */ class j {
    public static final void a(s2.i iVar) {
        if (iVar.a(p0.f1211b) == null) {
            return;
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + iVar).toString());
    }

    public static final d b(d dVar, s2.i iVar) {
        a(iVar);
        if (C2.k.a(iVar, s2.j.f9292e)) {
            return dVar;
        }
        if (dVar instanceof O2.k) {
            return k.a.a((O2.k) dVar, iVar, 0, null, 6, null);
        }
        return new O2.h(dVar, iVar, 0, null, 12, null);
    }
}
