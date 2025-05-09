package t;

import t.e;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static boolean[] f9492a = new boolean[3];

    public static void a(f fVar, s.d dVar, e eVar) {
        eVar.f9381j = -1;
        eVar.f9383k = -1;
        e.b bVar = fVar.f9349M[0];
        e.b bVar2 = e.b.WRAP_CONTENT;
        if (bVar != bVar2 && eVar.f9349M[0] == e.b.MATCH_PARENT) {
            int i3 = eVar.f9338B.f9322e;
            int P3 = fVar.P() - eVar.f9340D.f9322e;
            d dVar2 = eVar.f9338B;
            dVar2.f9324g = dVar.q(dVar2);
            d dVar3 = eVar.f9340D;
            dVar3.f9324g = dVar.q(dVar3);
            dVar.f(eVar.f9338B.f9324g, i3);
            dVar.f(eVar.f9340D.f9324g, P3);
            eVar.f9381j = 2;
            eVar.k0(i3, P3);
        }
        if (fVar.f9349M[1] == bVar2 || eVar.f9349M[1] != e.b.MATCH_PARENT) {
            return;
        }
        int i4 = eVar.f9339C.f9322e;
        int v3 = fVar.v() - eVar.f9341E.f9322e;
        d dVar4 = eVar.f9339C;
        dVar4.f9324g = dVar.q(dVar4);
        d dVar5 = eVar.f9341E;
        dVar5.f9324g = dVar.q(dVar5);
        dVar.f(eVar.f9339C.f9324g, i4);
        dVar.f(eVar.f9341E.f9324g, v3);
        if (eVar.f9361Y > 0 || eVar.O() == 8) {
            d dVar6 = eVar.f9342F;
            dVar6.f9324g = dVar.q(dVar6);
            dVar.f(eVar.f9342F.f9324g, eVar.f9361Y + i4);
        }
        eVar.f9383k = 2;
        eVar.z0(i4, v3);
    }

    public static final boolean b(int i3, int i4) {
        return (i3 & i4) == i4;
    }
}
