package u;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import t.e;
import u.b;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public t.f f9543a;

    /* renamed from: d, reason: collision with root package name */
    public t.f f9546d;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9544b = true;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9545c = true;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f9547e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f9548f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public b.InterfaceC0158b f9549g = null;

    /* renamed from: h, reason: collision with root package name */
    public b.a f9550h = new b.a();

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f9551i = new ArrayList();

    public e(t.f fVar) {
        this.f9543a = fVar;
        this.f9546d = fVar;
    }

    public final void a(f fVar, int i3, int i4, f fVar2, ArrayList arrayList, k kVar) {
        int i5;
        f fVar3;
        ArrayList arrayList2;
        m mVar = fVar.f9555d;
        if (mVar.f9589c == null) {
            t.f fVar4 = this.f9543a;
            if (mVar == fVar4.f9371e || mVar == fVar4.f9373f) {
                return;
            }
            if (kVar == null) {
                kVar = new k(mVar, i4);
                arrayList.add(kVar);
            }
            k kVar2 = kVar;
            mVar.f9589c = kVar2;
            kVar2.a(mVar);
            for (d dVar : mVar.f9594h.f9562k) {
                if (dVar instanceof f) {
                    i5 = i3;
                    fVar3 = fVar2;
                    arrayList2 = arrayList;
                    a((f) dVar, i5, 0, fVar3, arrayList2, kVar2);
                } else {
                    i5 = i3;
                    fVar3 = fVar2;
                    arrayList2 = arrayList;
                }
                i3 = i5;
                fVar2 = fVar3;
                arrayList = arrayList2;
            }
            int i6 = i3;
            f fVar5 = fVar2;
            ArrayList arrayList3 = arrayList;
            for (d dVar2 : mVar.f9595i.f9562k) {
                if (dVar2 instanceof f) {
                    a((f) dVar2, i6, 1, fVar5, arrayList3, kVar2);
                }
            }
            if (i6 == 1 && (mVar instanceof l)) {
                for (d dVar3 : ((l) mVar).f9584k.f9562k) {
                    if (dVar3 instanceof f) {
                        a((f) dVar3, i6, 2, fVar5, arrayList3, kVar2);
                    }
                }
            }
            for (f fVar6 : mVar.f9594h.f9563l) {
                if (fVar6 == fVar5) {
                    kVar2.f9578b = true;
                }
                a(fVar6, i6, 0, fVar5, arrayList3, kVar2);
            }
            for (f fVar7 : mVar.f9595i.f9563l) {
                if (fVar7 == fVar5) {
                    kVar2.f9578b = true;
                }
                a(fVar7, i6, 1, fVar5, arrayList3, kVar2);
            }
            if (i6 == 1 && (mVar instanceof l)) {
                Iterator it = ((l) mVar).f9584k.f9563l.iterator();
                while (it.hasNext()) {
                    a((f) it.next(), i6, 2, fVar5, arrayList3, kVar2);
                }
            }
        }
    }

    public final boolean b(t.f fVar) {
        e.b bVar;
        int i3;
        char c3;
        e.b bVar2;
        float f3;
        e.b bVar3;
        e.b[] bVarArr;
        e.b bVar4;
        e.b bVar5;
        e.b bVar6;
        e.b bVar7;
        Iterator it = fVar.f9506w0.iterator();
        while (it.hasNext()) {
            t.e eVar = (t.e) it.next();
            e.b[] bVarArr2 = eVar.f9349M;
            e.b bVar8 = bVarArr2[0];
            e.b bVar9 = bVarArr2[1];
            if (eVar.O() == 8) {
                eVar.f9363a = true;
            } else {
                if (eVar.f9395q < 1.0f && bVar8 == e.b.MATCH_CONSTRAINT) {
                    eVar.f9385l = 2;
                }
                if (eVar.f9401t < 1.0f && bVar9 == e.b.MATCH_CONSTRAINT) {
                    eVar.f9387m = 2;
                }
                if (eVar.t() > 0.0f) {
                    e.b bVar10 = e.b.MATCH_CONSTRAINT;
                    if (bVar8 == bVar10 && (bVar9 == e.b.WRAP_CONTENT || bVar9 == e.b.FIXED)) {
                        eVar.f9385l = 3;
                    } else if (bVar9 == bVar10 && (bVar8 == e.b.WRAP_CONTENT || bVar8 == e.b.FIXED)) {
                        eVar.f9387m = 3;
                    } else if (bVar8 == bVar10 && bVar9 == bVar10) {
                        if (eVar.f9385l == 0) {
                            eVar.f9385l = 3;
                        }
                        if (eVar.f9387m == 0) {
                            eVar.f9387m = 3;
                        }
                    }
                }
                e.b bVar11 = e.b.MATCH_CONSTRAINT;
                if (bVar8 == bVar11 && eVar.f9385l == 1 && (eVar.f9338B.f9321d == null || eVar.f9340D.f9321d == null)) {
                    bVar8 = e.b.WRAP_CONTENT;
                }
                if (bVar9 == bVar11 && eVar.f9387m == 1 && (eVar.f9339C.f9321d == null || eVar.f9341E.f9321d == null)) {
                    bVar9 = e.b.WRAP_CONTENT;
                }
                j jVar = eVar.f9371e;
                jVar.f9590d = bVar8;
                int i4 = eVar.f9385l;
                jVar.f9587a = i4;
                l lVar = eVar.f9373f;
                lVar.f9590d = bVar9;
                int i5 = eVar.f9387m;
                lVar.f9587a = i5;
                e.b bVar12 = e.b.MATCH_PARENT;
                if ((bVar8 == bVar12 || bVar8 == e.b.FIXED || bVar8 == e.b.WRAP_CONTENT) && (bVar9 == bVar12 || bVar9 == e.b.FIXED || bVar9 == e.b.WRAP_CONTENT)) {
                    e.b bVar13 = bVar9;
                    e.b bVar14 = bVar8;
                    int P3 = eVar.P();
                    if (bVar14 == bVar12) {
                        P3 = (fVar.P() - eVar.f9338B.f9322e) - eVar.f9340D.f9322e;
                        bVar14 = e.b.FIXED;
                    }
                    int i6 = P3;
                    int v3 = eVar.v();
                    if (bVar13 == bVar12) {
                        v3 = (fVar.v() - eVar.f9339C.f9322e) - eVar.f9341E.f9322e;
                        bVar13 = e.b.FIXED;
                    }
                    l(eVar, bVar14, i6, bVar13, v3);
                    eVar.f9371e.f9591e.d(eVar.P());
                    eVar.f9373f.f9591e.d(eVar.v());
                    eVar.f9363a = true;
                } else {
                    if (bVar8 == bVar11) {
                        bVar2 = bVar11;
                        e.b bVar15 = e.b.WRAP_CONTENT;
                        c3 = 0;
                        if (bVar9 != bVar15 && bVar9 != e.b.FIXED) {
                            bVar = bVar9;
                            i3 = 3;
                        } else if (i4 == 3) {
                            if (bVar9 == bVar15) {
                                l(eVar, bVar15, 0, bVar15, 0);
                            }
                            int v4 = eVar.v();
                            int i7 = (int) ((v4 * eVar.f9353Q) + 0.5f);
                            e.b bVar16 = e.b.FIXED;
                            l(eVar, bVar16, i7, bVar16, v4);
                            eVar.f9371e.f9591e.d(eVar.P());
                            eVar.f9373f.f9591e.d(eVar.v());
                            eVar.f9363a = true;
                        } else if (i4 == 1) {
                            l(eVar, bVar15, 0, bVar9, 0);
                            eVar.f9371e.f9591e.f9573m = eVar.P();
                        } else {
                            bVar = bVar9;
                            i3 = 3;
                            if (i4 == 2) {
                                e.b bVar17 = fVar.f9349M[0];
                                e.b bVar18 = e.b.FIXED;
                                if (bVar17 == bVar18 || bVar17 == bVar12) {
                                    l(eVar, bVar18, (int) ((eVar.f9395q * fVar.P()) + 0.5f), bVar, eVar.v());
                                    eVar.f9371e.f9591e.d(eVar.P());
                                    eVar.f9373f.f9591e.d(eVar.v());
                                    eVar.f9363a = true;
                                }
                            } else {
                                t.d[] dVarArr = eVar.f9346J;
                                f3 = 1.0f;
                                if (dVarArr[0].f9321d == null || dVarArr[1].f9321d == null) {
                                    l(eVar, bVar15, 0, bVar, 0);
                                    eVar.f9371e.f9591e.d(eVar.P());
                                    eVar.f9373f.f9591e.d(eVar.v());
                                    eVar.f9363a = true;
                                } else {
                                    if (bVar == bVar2 || !(bVar8 == (bVar6 = e.b.WRAP_CONTENT) || bVar8 == e.b.FIXED)) {
                                        bVar3 = bVar8;
                                    } else if (i5 == i3) {
                                        if (bVar8 == bVar6) {
                                            l(eVar, bVar6, 0, bVar6, 0);
                                        }
                                        int P4 = eVar.P();
                                        float f4 = eVar.f9353Q;
                                        if (eVar.u() == -1) {
                                            f4 = f3 / f4;
                                        }
                                        e.b bVar19 = e.b.FIXED;
                                        l(eVar, bVar19, P4, bVar19, (int) ((P4 * f4) + 0.5f));
                                        eVar.f9371e.f9591e.d(eVar.P());
                                        eVar.f9373f.f9591e.d(eVar.v());
                                        eVar.f9363a = true;
                                    } else if (i5 == 1) {
                                        l(eVar, bVar8, 0, bVar6, 0);
                                        eVar.f9373f.f9591e.f9573m = eVar.v();
                                    } else {
                                        bVar3 = bVar8;
                                        if (i5 == 2) {
                                            e.b bVar20 = fVar.f9349M[1];
                                            bVar7 = bVar;
                                            e.b bVar21 = e.b.FIXED;
                                            if (bVar20 == bVar21 || bVar20 == bVar12) {
                                                l(eVar, bVar3, eVar.P(), bVar21, (int) ((eVar.f9401t * fVar.v()) + 0.5f));
                                                eVar.f9371e.f9591e.d(eVar.P());
                                                eVar.f9373f.f9591e.d(eVar.v());
                                                eVar.f9363a = true;
                                            } else {
                                                bVar = bVar7;
                                            }
                                        } else {
                                            bVar7 = bVar;
                                            t.d[] dVarArr2 = eVar.f9346J;
                                            if (dVarArr2[2].f9321d == null || dVarArr2[i3].f9321d == null) {
                                                l(eVar, bVar6, 0, bVar7, 0);
                                                eVar.f9371e.f9591e.d(eVar.P());
                                                eVar.f9373f.f9591e.d(eVar.v());
                                                eVar.f9363a = true;
                                            } else {
                                                bVar = bVar7;
                                            }
                                        }
                                    }
                                    if (bVar3 == bVar2 && bVar == bVar2) {
                                        if (i4 != 1 || i5 == 1) {
                                            e.b bVar22 = e.b.WRAP_CONTENT;
                                            l(eVar, bVar22, 0, bVar22, 0);
                                            eVar.f9371e.f9591e.f9573m = eVar.P();
                                            eVar.f9373f.f9591e.f9573m = eVar.v();
                                        } else if (i5 == 2 && i4 == 2 && ((bVar4 = (bVarArr = fVar.f9349M)[c3]) == (bVar5 = e.b.FIXED) || bVar4 == bVar5)) {
                                            e.b bVar23 = bVarArr[1];
                                            if (bVar23 == bVar5 || bVar23 == bVar5) {
                                                l(eVar, bVar5, (int) ((eVar.f9395q * fVar.P()) + 0.5f), bVar5, (int) ((eVar.f9401t * fVar.v()) + 0.5f));
                                                eVar.f9371e.f9591e.d(eVar.P());
                                                eVar.f9373f.f9591e.d(eVar.v());
                                                eVar.f9363a = true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        bVar = bVar9;
                        i3 = 3;
                        c3 = 0;
                        bVar2 = bVar11;
                    }
                    f3 = 1.0f;
                    if (bVar == bVar2) {
                    }
                    bVar3 = bVar8;
                    if (bVar3 == bVar2) {
                        if (i4 != 1) {
                        }
                        e.b bVar222 = e.b.WRAP_CONTENT;
                        l(eVar, bVar222, 0, bVar222, 0);
                        eVar.f9371e.f9591e.f9573m = eVar.P();
                        eVar.f9373f.f9591e.f9573m = eVar.v();
                    }
                }
            }
        }
        return false;
    }

    public void c() {
        d(this.f9547e);
        this.f9551i.clear();
        k.f9576h = 0;
        i(this.f9543a.f9371e, 0, this.f9551i);
        i(this.f9543a.f9373f, 1, this.f9551i);
        this.f9544b = false;
    }

    public void d(ArrayList arrayList) {
        arrayList.clear();
        this.f9546d.f9371e.f();
        this.f9546d.f9373f.f();
        arrayList.add(this.f9546d.f9371e);
        arrayList.add(this.f9546d.f9373f);
        Iterator it = this.f9546d.f9506w0.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            t.e eVar = (t.e) it.next();
            if (eVar instanceof t.h) {
                arrayList.add(new h(eVar));
            } else {
                if (eVar.V()) {
                    if (eVar.f9367c == null) {
                        eVar.f9367c = new c(eVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar.f9367c);
                } else {
                    arrayList.add(eVar.f9371e);
                }
                if (eVar.X()) {
                    if (eVar.f9369d == null) {
                        eVar.f9369d = new c(eVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(eVar.f9369d);
                } else {
                    arrayList.add(eVar.f9373f);
                }
                if (eVar instanceof t.j) {
                    arrayList.add(new i(eVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((m) it2.next()).f();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            m mVar = (m) it3.next();
            if (mVar.f9588b != this.f9546d) {
                mVar.d();
            }
        }
    }

    public final int e(t.f fVar, int i3) {
        int size = this.f9551i.size();
        long j3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            j3 = Math.max(j3, ((k) this.f9551i.get(i4)).b(fVar, i3));
        }
        return (int) j3;
    }

    public boolean f(boolean z3) {
        boolean z4;
        boolean z5 = false;
        if (this.f9544b || this.f9545c) {
            Iterator it = this.f9543a.f9506w0.iterator();
            while (it.hasNext()) {
                t.e eVar = (t.e) it.next();
                eVar.f9363a = false;
                eVar.f9371e.r();
                eVar.f9373f.q();
            }
            t.f fVar = this.f9543a;
            fVar.f9363a = false;
            fVar.f9371e.r();
            this.f9543a.f9373f.q();
            this.f9545c = false;
        }
        if (b(this.f9546d)) {
            return false;
        }
        this.f9543a.F0(0);
        this.f9543a.G0(0);
        e.b s3 = this.f9543a.s(0);
        e.b s4 = this.f9543a.s(1);
        if (this.f9544b) {
            c();
        }
        int Q3 = this.f9543a.Q();
        int R3 = this.f9543a.R();
        this.f9543a.f9371e.f9594h.d(Q3);
        this.f9543a.f9373f.f9594h.d(R3);
        m();
        e.b bVar = e.b.WRAP_CONTENT;
        if (s3 == bVar || s4 == bVar) {
            if (z3) {
                Iterator it2 = this.f9547e.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (!((m) it2.next()).m()) {
                        z3 = false;
                        break;
                    }
                }
            }
            if (z3 && s3 == e.b.WRAP_CONTENT) {
                this.f9543a.l0(e.b.FIXED);
                t.f fVar2 = this.f9543a;
                fVar2.E0(e(fVar2, 0));
                t.f fVar3 = this.f9543a;
                fVar3.f9371e.f9591e.d(fVar3.P());
            }
            if (z3 && s4 == e.b.WRAP_CONTENT) {
                this.f9543a.A0(e.b.FIXED);
                t.f fVar4 = this.f9543a;
                fVar4.h0(e(fVar4, 1));
                t.f fVar5 = this.f9543a;
                fVar5.f9373f.f9591e.d(fVar5.v());
            }
        }
        t.f fVar6 = this.f9543a;
        e.b bVar2 = fVar6.f9349M[0];
        e.b bVar3 = e.b.FIXED;
        if (bVar2 == bVar3 || bVar2 == e.b.MATCH_PARENT) {
            int P3 = fVar6.P() + Q3;
            this.f9543a.f9371e.f9595i.d(P3);
            this.f9543a.f9371e.f9591e.d(P3 - Q3);
            m();
            t.f fVar7 = this.f9543a;
            e.b bVar4 = fVar7.f9349M[1];
            if (bVar4 == bVar3 || bVar4 == e.b.MATCH_PARENT) {
                int v3 = fVar7.v() + R3;
                this.f9543a.f9373f.f9595i.d(v3);
                this.f9543a.f9373f.f9591e.d(v3 - R3);
            }
            m();
            z4 = true;
        } else {
            z4 = false;
        }
        Iterator it3 = this.f9547e.iterator();
        while (it3.hasNext()) {
            m mVar = (m) it3.next();
            if (mVar.f9588b != this.f9543a || mVar.f9593g) {
                mVar.e();
            }
        }
        Iterator it4 = this.f9547e.iterator();
        while (true) {
            if (!it4.hasNext()) {
                z5 = true;
                break;
            }
            m mVar2 = (m) it4.next();
            if (z4 || mVar2.f9588b != this.f9543a) {
                if (!mVar2.f9594h.f9561j) {
                    break;
                }
                if (!mVar2.f9595i.f9561j) {
                    if (!(mVar2 instanceof h)) {
                        break;
                    }
                }
                if (!mVar2.f9591e.f9561j && !(mVar2 instanceof c) && !(mVar2 instanceof h)) {
                    break;
                }
            }
        }
        this.f9543a.l0(s3);
        this.f9543a.A0(s4);
        return z5;
    }

    public boolean g(boolean z3) {
        if (this.f9544b) {
            Iterator it = this.f9543a.f9506w0.iterator();
            while (it.hasNext()) {
                t.e eVar = (t.e) it.next();
                eVar.f9363a = false;
                j jVar = eVar.f9371e;
                jVar.f9591e.f9561j = false;
                jVar.f9593g = false;
                jVar.r();
                l lVar = eVar.f9373f;
                lVar.f9591e.f9561j = false;
                lVar.f9593g = false;
                lVar.q();
            }
            t.f fVar = this.f9543a;
            fVar.f9363a = false;
            j jVar2 = fVar.f9371e;
            jVar2.f9591e.f9561j = false;
            jVar2.f9593g = false;
            jVar2.r();
            l lVar2 = this.f9543a.f9373f;
            lVar2.f9591e.f9561j = false;
            lVar2.f9593g = false;
            lVar2.q();
            c();
        }
        if (b(this.f9546d)) {
            return false;
        }
        this.f9543a.F0(0);
        this.f9543a.G0(0);
        this.f9543a.f9371e.f9594h.d(0);
        this.f9543a.f9373f.f9594h.d(0);
        return true;
    }

    public boolean h(boolean z3, int i3) {
        boolean z4;
        e.b bVar;
        boolean z5 = false;
        e.b s3 = this.f9543a.s(0);
        e.b s4 = this.f9543a.s(1);
        int Q3 = this.f9543a.Q();
        int R3 = this.f9543a.R();
        if (z3 && (s3 == (bVar = e.b.WRAP_CONTENT) || s4 == bVar)) {
            Iterator it = this.f9547e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                m mVar = (m) it.next();
                if (mVar.f9592f == i3 && !mVar.m()) {
                    z3 = false;
                    break;
                }
            }
            if (i3 == 0) {
                if (z3 && s3 == e.b.WRAP_CONTENT) {
                    this.f9543a.l0(e.b.FIXED);
                    t.f fVar = this.f9543a;
                    fVar.E0(e(fVar, 0));
                    t.f fVar2 = this.f9543a;
                    fVar2.f9371e.f9591e.d(fVar2.P());
                }
            } else if (z3 && s4 == e.b.WRAP_CONTENT) {
                this.f9543a.A0(e.b.FIXED);
                t.f fVar3 = this.f9543a;
                fVar3.h0(e(fVar3, 1));
                t.f fVar4 = this.f9543a;
                fVar4.f9373f.f9591e.d(fVar4.v());
            }
        }
        if (i3 == 0) {
            t.f fVar5 = this.f9543a;
            e.b bVar2 = fVar5.f9349M[0];
            if (bVar2 == e.b.FIXED || bVar2 == e.b.MATCH_PARENT) {
                int P3 = fVar5.P() + Q3;
                this.f9543a.f9371e.f9595i.d(P3);
                this.f9543a.f9371e.f9591e.d(P3 - Q3);
                z4 = true;
            }
            z4 = false;
        } else {
            t.f fVar6 = this.f9543a;
            e.b bVar3 = fVar6.f9349M[1];
            if (bVar3 == e.b.FIXED || bVar3 == e.b.MATCH_PARENT) {
                int v3 = fVar6.v() + R3;
                this.f9543a.f9373f.f9595i.d(v3);
                this.f9543a.f9373f.f9591e.d(v3 - R3);
                z4 = true;
            }
            z4 = false;
        }
        m();
        Iterator it2 = this.f9547e.iterator();
        while (it2.hasNext()) {
            m mVar2 = (m) it2.next();
            if (mVar2.f9592f == i3 && (mVar2.f9588b != this.f9543a || mVar2.f9593g)) {
                mVar2.e();
            }
        }
        Iterator it3 = this.f9547e.iterator();
        while (true) {
            if (!it3.hasNext()) {
                z5 = true;
                break;
            }
            m mVar3 = (m) it3.next();
            if (mVar3.f9592f == i3 && (z4 || mVar3.f9588b != this.f9543a)) {
                if (!mVar3.f9594h.f9561j) {
                    break;
                }
                if (!mVar3.f9595i.f9561j) {
                    break;
                }
                if (!(mVar3 instanceof c) && !mVar3.f9591e.f9561j) {
                    break;
                }
            }
        }
        this.f9543a.l0(s3);
        this.f9543a.A0(s4);
        return z5;
    }

    public final void i(m mVar, int i3, ArrayList arrayList) {
        for (d dVar : mVar.f9594h.f9562k) {
            if (dVar instanceof f) {
                a((f) dVar, i3, 0, mVar.f9595i, arrayList, null);
            } else if (dVar instanceof m) {
                a(((m) dVar).f9594h, i3, 0, mVar.f9595i, arrayList, null);
            }
        }
        for (d dVar2 : mVar.f9595i.f9562k) {
            if (dVar2 instanceof f) {
                a((f) dVar2, i3, 1, mVar.f9594h, arrayList, null);
            } else if (dVar2 instanceof m) {
                a(((m) dVar2).f9595i, i3, 1, mVar.f9594h, arrayList, null);
            }
        }
        int i4 = i3;
        if (i4 == 1) {
            for (d dVar3 : ((l) mVar).f9584k.f9562k) {
                if (dVar3 instanceof f) {
                    a((f) dVar3, i4, 2, null, arrayList, null);
                }
                i4 = i3;
            }
        }
    }

    public void j() {
        this.f9544b = true;
    }

    public void k() {
        this.f9545c = true;
    }

    public final void l(t.e eVar, e.b bVar, int i3, e.b bVar2, int i4) {
        b.a aVar = this.f9550h;
        aVar.f9531a = bVar;
        aVar.f9532b = bVar2;
        aVar.f9533c = i3;
        aVar.f9534d = i4;
        this.f9549g.a(eVar, aVar);
        eVar.E0(this.f9550h.f9535e);
        eVar.h0(this.f9550h.f9536f);
        eVar.g0(this.f9550h.f9538h);
        eVar.b0(this.f9550h.f9537g);
    }

    public void m() {
        g gVar;
        Iterator it = this.f9543a.f9506w0.iterator();
        while (it.hasNext()) {
            t.e eVar = (t.e) it.next();
            if (!eVar.f9363a) {
                e.b[] bVarArr = eVar.f9349M;
                boolean z3 = false;
                e.b bVar = bVarArr[0];
                e.b bVar2 = bVarArr[1];
                int i3 = eVar.f9385l;
                int i4 = eVar.f9387m;
                e.b bVar3 = e.b.WRAP_CONTENT;
                boolean z4 = bVar == bVar3 || (bVar == e.b.MATCH_CONSTRAINT && i3 == 1);
                if (bVar2 == bVar3 || (bVar2 == e.b.MATCH_CONSTRAINT && i4 == 1)) {
                    z3 = true;
                }
                g gVar2 = eVar.f9371e.f9591e;
                boolean z5 = gVar2.f9561j;
                g gVar3 = eVar.f9373f.f9591e;
                boolean z6 = gVar3.f9561j;
                if (z5 && z6) {
                    e.b bVar4 = e.b.FIXED;
                    l(eVar, bVar4, gVar2.f9558g, bVar4, gVar3.f9558g);
                    eVar.f9363a = true;
                } else if (z5 && z3) {
                    l(eVar, e.b.FIXED, gVar2.f9558g, bVar3, gVar3.f9558g);
                    if (bVar2 == e.b.MATCH_CONSTRAINT) {
                        eVar.f9373f.f9591e.f9573m = eVar.v();
                    } else {
                        eVar.f9373f.f9591e.d(eVar.v());
                        eVar.f9363a = true;
                    }
                } else if (z6 && z4) {
                    l(eVar, bVar3, gVar2.f9558g, e.b.FIXED, gVar3.f9558g);
                    if (bVar == e.b.MATCH_CONSTRAINT) {
                        eVar.f9371e.f9591e.f9573m = eVar.P();
                    } else {
                        eVar.f9371e.f9591e.d(eVar.P());
                        eVar.f9363a = true;
                    }
                }
                if (eVar.f9363a && (gVar = eVar.f9373f.f9585l) != null) {
                    gVar.d(eVar.n());
                }
            }
        }
    }

    public void n(b.InterfaceC0158b interfaceC0158b) {
        this.f9549g = interfaceC0158b;
    }
}
