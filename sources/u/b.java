package u;

import java.util.ArrayList;
import t.d;
import t.e;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f9528a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public a f9529b = new a();

    /* renamed from: c, reason: collision with root package name */
    public t.f f9530c;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public e.b f9531a;

        /* renamed from: b, reason: collision with root package name */
        public e.b f9532b;

        /* renamed from: c, reason: collision with root package name */
        public int f9533c;

        /* renamed from: d, reason: collision with root package name */
        public int f9534d;

        /* renamed from: e, reason: collision with root package name */
        public int f9535e;

        /* renamed from: f, reason: collision with root package name */
        public int f9536f;

        /* renamed from: g, reason: collision with root package name */
        public int f9537g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f9538h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f9539i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f9540j;
    }

    /* renamed from: u.b$b, reason: collision with other inner class name */
    public interface InterfaceC0158b {
        void a(t.e eVar, a aVar);

        void b();
    }

    public b(t.f fVar) {
        this.f9530c = fVar;
    }

    public final boolean a(InterfaceC0158b interfaceC0158b, t.e eVar, boolean z3) {
        this.f9529b.f9531a = eVar.y();
        this.f9529b.f9532b = eVar.M();
        this.f9529b.f9533c = eVar.P();
        this.f9529b.f9534d = eVar.v();
        a aVar = this.f9529b;
        aVar.f9539i = false;
        aVar.f9540j = z3;
        e.b bVar = aVar.f9531a;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        boolean z4 = bVar == bVar2;
        boolean z5 = aVar.f9532b == bVar2;
        boolean z6 = z4 && eVar.f9353Q > 0.0f;
        boolean z7 = z5 && eVar.f9353Q > 0.0f;
        if (z6 && eVar.f9389n[0] == 4) {
            aVar.f9531a = e.b.FIXED;
        }
        if (z7 && eVar.f9389n[1] == 4) {
            aVar.f9532b = e.b.FIXED;
        }
        interfaceC0158b.a(eVar, aVar);
        eVar.E0(this.f9529b.f9535e);
        eVar.h0(this.f9529b.f9536f);
        eVar.g0(this.f9529b.f9538h);
        eVar.b0(this.f9529b.f9537g);
        a aVar2 = this.f9529b;
        aVar2.f9540j = false;
        return aVar2.f9539i;
    }

    public final void b(t.f fVar) {
        int size = fVar.f9506w0.size();
        InterfaceC0158b U02 = fVar.U0();
        for (int i3 = 0; i3 < size; i3++) {
            t.e eVar = (t.e) fVar.f9506w0.get(i3);
            if (!(eVar instanceof t.h) && (!eVar.f9371e.f9591e.f9561j || !eVar.f9373f.f9591e.f9561j)) {
                e.b s3 = eVar.s(0);
                e.b s4 = eVar.s(1);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (s3 != bVar || eVar.f9385l == 1 || s4 != bVar || eVar.f9387m == 1) {
                    a(U02, eVar, false);
                }
            }
        }
        U02.b();
    }

    public final void c(t.f fVar, String str, int i3, int i4) {
        int E3 = fVar.E();
        int D3 = fVar.D();
        fVar.u0(0);
        fVar.t0(0);
        fVar.E0(i3);
        fVar.h0(i4);
        fVar.u0(E3);
        fVar.t0(D3);
        this.f9530c.K0();
    }

    public long d(t.f fVar, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        int i12;
        boolean z3;
        int i13;
        long j3;
        boolean z4;
        boolean z5;
        int i14;
        InterfaceC0158b interfaceC0158b;
        boolean z6;
        int i15;
        boolean z7;
        boolean z8;
        boolean z9;
        int i16;
        InterfaceC0158b U02 = fVar.U0();
        int size = fVar.f9506w0.size();
        int P3 = fVar.P();
        int v3 = fVar.v();
        boolean b3 = t.k.b(i3, 128);
        int i17 = (b3 || t.k.b(i3, 64)) ? 1 : 0;
        if (i17 != 0) {
            for (int i18 = 0; i18 < size; i18++) {
                t.e eVar = (t.e) fVar.f9506w0.get(i18);
                e.b y3 = eVar.y();
                e.b bVar = e.b.MATCH_CONSTRAINT;
                i12 = 1;
                boolean z10 = (y3 == bVar) && (eVar.M() == bVar) && eVar.t() > 0.0f;
                if ((eVar.V() && z10) || ((eVar.X() && z10) || (eVar instanceof t.l) || eVar.V() || eVar.X())) {
                    i17 = 0;
                    break;
                }
            }
        }
        i12 = 1;
        if (i17 != 0) {
            int i19 = s.d.f9035q;
        }
        int i20 = 2;
        if ((i17 & (((i6 == 1073741824 && i8 == 1073741824) || b3) ? i12 : 0)) != 0) {
            int min = Math.min(fVar.C(), i7);
            int min2 = Math.min(fVar.B(), i9);
            if (i6 == 1073741824 && fVar.P() != min) {
                fVar.E0(min);
                fVar.X0();
            }
            if (i8 == 1073741824 && fVar.v() != min2) {
                fVar.h0(min2);
                fVar.X0();
            }
            if (i6 == 1073741824 && i8 == 1073741824) {
                z3 = fVar.R0(b3);
                i13 = 2;
            } else {
                boolean S02 = fVar.S0(b3);
                if (i6 == 1073741824) {
                    z9 = S02 & fVar.T0(b3, 0);
                    i16 = i12;
                } else {
                    z9 = S02;
                    i16 = 0;
                }
                if (i8 == 1073741824) {
                    int i21 = i12;
                    boolean T02 = fVar.T0(b3, i21) & z9;
                    i13 = i16 + i21;
                    z3 = T02;
                } else {
                    i13 = i16;
                    z3 = z9;
                }
            }
            if (z3) {
                fVar.I0(i6 == 1073741824, i8 == 1073741824);
            }
        } else {
            z3 = false;
            i13 = 0;
        }
        long j4 = 0;
        if (z3 && i13 == 2) {
            return 0L;
        }
        if (size > 0) {
            b(fVar);
        }
        int V02 = fVar.V0();
        int size2 = this.f9528a.size();
        if (size > 0) {
            c(fVar, "First pass", P3, v3);
        }
        if (size2 > 0) {
            e.b y4 = fVar.y();
            e.b bVar2 = e.b.WRAP_CONTENT;
            boolean z11 = y4 == bVar2;
            boolean z12 = fVar.M() == bVar2;
            int max = Math.max(fVar.P(), this.f9530c.E());
            int max2 = Math.max(fVar.v(), this.f9530c.D());
            int i22 = 0;
            boolean z13 = false;
            while (i22 < size2) {
                long j5 = j4;
                t.e eVar2 = (t.e) this.f9528a.get(i22);
                if (eVar2 instanceof t.l) {
                    int P4 = eVar2.P();
                    int v4 = eVar2.v();
                    boolean a3 = z13 | a(U02, eVar2, true);
                    z7 = z12;
                    int P5 = eVar2.P();
                    int v5 = eVar2.v();
                    if (P5 != P4) {
                        eVar2.E0(P5);
                        if (z11 && eVar2.I() > max) {
                            max = Math.max(max, eVar2.I() + eVar2.m(d.b.RIGHT).c());
                        }
                        z8 = true;
                    } else {
                        z8 = a3;
                    }
                    if (v5 != v4) {
                        eVar2.h0(v5);
                        if (z7 && eVar2.p() > max2) {
                            max2 = Math.max(max2, eVar2.p() + eVar2.m(d.b.BOTTOM).c());
                        }
                        z8 = true;
                    }
                    z13 = z8 | ((t.l) eVar2).V0();
                } else {
                    z7 = z12;
                }
                i22++;
                j4 = j5;
                z12 = z7;
                i20 = 2;
            }
            j3 = j4;
            boolean z14 = z12;
            int i23 = 0;
            for (int i24 = i20; i23 < i24; i24 = 2) {
                int i25 = 0;
                while (i25 < size2) {
                    t.e eVar3 = (t.e) this.f9528a.get(i25);
                    if (((eVar3 instanceof t.i) && !(eVar3 instanceof t.l)) || (eVar3 instanceof t.h) || eVar3.O() == 8 || ((eVar3.f9371e.f9591e.f9561j && eVar3.f9373f.f9591e.f9561j) || (eVar3 instanceof t.l))) {
                        i14 = i23;
                        interfaceC0158b = U02;
                    } else {
                        int P6 = eVar3.P();
                        int v6 = eVar3.v();
                        int n3 = eVar3.n();
                        i14 = i23;
                        boolean a4 = z13 | a(U02, eVar3, true);
                        int P7 = eVar3.P();
                        interfaceC0158b = U02;
                        int v7 = eVar3.v();
                        if (P7 != P6) {
                            eVar3.E0(P7);
                            if (z11 && eVar3.I() > max) {
                                max = Math.max(max, eVar3.I() + eVar3.m(d.b.RIGHT).c());
                            }
                            z6 = true;
                        } else {
                            z6 = a4;
                        }
                        if (v7 != v6) {
                            eVar3.h0(v7);
                            if (z14 && eVar3.p() > max2) {
                                max2 = Math.max(max2, eVar3.p() + eVar3.m(d.b.BOTTOM).c());
                            }
                            z6 = true;
                        }
                        if (!eVar3.S() || n3 == eVar3.n()) {
                            z13 = z6;
                        } else {
                            i15 = 1;
                            z13 = true;
                            i25 += i15;
                            U02 = interfaceC0158b;
                            i23 = i14;
                        }
                    }
                    i15 = 1;
                    i25 += i15;
                    U02 = interfaceC0158b;
                    i23 = i14;
                }
                int i26 = i23;
                InterfaceC0158b interfaceC0158b2 = U02;
                if (z13) {
                    c(fVar, "intermediate pass", P3, v3);
                    z13 = false;
                }
                i23 = i26 + 1;
                U02 = interfaceC0158b2;
            }
            if (z13) {
                c(fVar, "2nd pass", P3, v3);
                if (fVar.P() < max) {
                    fVar.E0(max);
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (fVar.v() < max2) {
                    fVar.h0(max2);
                    z5 = true;
                } else {
                    z5 = z4;
                }
                if (z5) {
                    c(fVar, "3rd pass", P3, v3);
                }
            }
        } else {
            j3 = 0;
        }
        fVar.g1(V02);
        return j3;
    }

    public void e(t.f fVar) {
        int i3;
        this.f9528a.clear();
        int size = fVar.f9506w0.size();
        while (i3 < size) {
            t.e eVar = (t.e) fVar.f9506w0.get(i3);
            e.b y3 = eVar.y();
            e.b bVar = e.b.MATCH_CONSTRAINT;
            if (y3 != bVar) {
                e.b y4 = eVar.y();
                e.b bVar2 = e.b.MATCH_PARENT;
                i3 = (y4 == bVar2 || eVar.M() == bVar || eVar.M() == bVar2) ? 0 : i3 + 1;
            }
            this.f9528a.add(eVar);
        }
        fVar.X0();
    }
}
