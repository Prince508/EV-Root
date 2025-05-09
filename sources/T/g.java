package t;

import java.util.ArrayList;
import t.e;

/* loaded from: classes.dex */
public class g extends l {

    /* renamed from: i1, reason: collision with root package name */
    public e[] f9463i1;

    /* renamed from: L0, reason: collision with root package name */
    public int f9440L0 = -1;

    /* renamed from: M0, reason: collision with root package name */
    public int f9441M0 = -1;

    /* renamed from: N0, reason: collision with root package name */
    public int f9442N0 = -1;

    /* renamed from: O0, reason: collision with root package name */
    public int f9443O0 = -1;

    /* renamed from: P0, reason: collision with root package name */
    public int f9444P0 = -1;

    /* renamed from: Q0, reason: collision with root package name */
    public int f9445Q0 = -1;

    /* renamed from: R0, reason: collision with root package name */
    public float f9446R0 = 0.5f;

    /* renamed from: S0, reason: collision with root package name */
    public float f9447S0 = 0.5f;

    /* renamed from: T0, reason: collision with root package name */
    public float f9448T0 = 0.5f;

    /* renamed from: U0, reason: collision with root package name */
    public float f9449U0 = 0.5f;

    /* renamed from: V0, reason: collision with root package name */
    public float f9450V0 = 0.5f;

    /* renamed from: W0, reason: collision with root package name */
    public float f9451W0 = 0.5f;

    /* renamed from: X0, reason: collision with root package name */
    public int f9452X0 = 0;

    /* renamed from: Y0, reason: collision with root package name */
    public int f9453Y0 = 0;

    /* renamed from: Z0, reason: collision with root package name */
    public int f9454Z0 = 2;

    /* renamed from: a1, reason: collision with root package name */
    public int f9455a1 = 2;

    /* renamed from: b1, reason: collision with root package name */
    public int f9456b1 = 0;

    /* renamed from: c1, reason: collision with root package name */
    public int f9457c1 = -1;

    /* renamed from: d1, reason: collision with root package name */
    public int f9458d1 = 0;

    /* renamed from: e1, reason: collision with root package name */
    public ArrayList f9459e1 = new ArrayList();

    /* renamed from: f1, reason: collision with root package name */
    public e[] f9460f1 = null;

    /* renamed from: g1, reason: collision with root package name */
    public e[] f9461g1 = null;

    /* renamed from: h1, reason: collision with root package name */
    public int[] f9462h1 = null;

    /* renamed from: j1, reason: collision with root package name */
    public int f9464j1 = 0;

    public class a {

        /* renamed from: a, reason: collision with root package name */
        public int f9465a;

        /* renamed from: d, reason: collision with root package name */
        public d f9468d;

        /* renamed from: e, reason: collision with root package name */
        public d f9469e;

        /* renamed from: f, reason: collision with root package name */
        public d f9470f;

        /* renamed from: g, reason: collision with root package name */
        public d f9471g;

        /* renamed from: h, reason: collision with root package name */
        public int f9472h;

        /* renamed from: i, reason: collision with root package name */
        public int f9473i;

        /* renamed from: j, reason: collision with root package name */
        public int f9474j;

        /* renamed from: k, reason: collision with root package name */
        public int f9475k;

        /* renamed from: q, reason: collision with root package name */
        public int f9481q;

        /* renamed from: b, reason: collision with root package name */
        public e f9466b = null;

        /* renamed from: c, reason: collision with root package name */
        public int f9467c = 0;

        /* renamed from: l, reason: collision with root package name */
        public int f9476l = 0;

        /* renamed from: m, reason: collision with root package name */
        public int f9477m = 0;

        /* renamed from: n, reason: collision with root package name */
        public int f9478n = 0;

        /* renamed from: o, reason: collision with root package name */
        public int f9479o = 0;

        /* renamed from: p, reason: collision with root package name */
        public int f9480p = 0;

        public a(int i3, d dVar, d dVar2, d dVar3, d dVar4, int i4) {
            this.f9472h = 0;
            this.f9473i = 0;
            this.f9474j = 0;
            this.f9475k = 0;
            this.f9481q = 0;
            this.f9465a = i3;
            this.f9468d = dVar;
            this.f9469e = dVar2;
            this.f9470f = dVar3;
            this.f9471g = dVar4;
            this.f9472h = g.this.P0();
            this.f9473i = g.this.R0();
            this.f9474j = g.this.Q0();
            this.f9475k = g.this.O0();
            this.f9481q = i4;
        }

        public void b(e eVar) {
            if (this.f9465a == 0) {
                int B12 = g.this.B1(eVar, this.f9481q);
                if (eVar.y() == e.b.MATCH_CONSTRAINT) {
                    this.f9480p++;
                    B12 = 0;
                }
                this.f9476l += B12 + (eVar.O() != 8 ? g.this.f9452X0 : 0);
                int A12 = g.this.A1(eVar, this.f9481q);
                if (this.f9466b == null || this.f9467c < A12) {
                    this.f9466b = eVar;
                    this.f9467c = A12;
                    this.f9477m = A12;
                }
            } else {
                int B13 = g.this.B1(eVar, this.f9481q);
                int A13 = g.this.A1(eVar, this.f9481q);
                if (eVar.M() == e.b.MATCH_CONSTRAINT) {
                    this.f9480p++;
                    A13 = 0;
                }
                this.f9477m += A13 + (eVar.O() != 8 ? g.this.f9453Y0 : 0);
                if (this.f9466b == null || this.f9467c < B13) {
                    this.f9466b = eVar;
                    this.f9467c = B13;
                    this.f9476l = B13;
                }
            }
            this.f9479o++;
        }

        public void c() {
            this.f9467c = 0;
            this.f9466b = null;
            this.f9476l = 0;
            this.f9477m = 0;
            this.f9478n = 0;
            this.f9479o = 0;
            this.f9480p = 0;
        }

        public void d(boolean z3, int i3, boolean z4) {
            e eVar;
            int i4;
            char c3;
            int i5 = this.f9479o;
            for (int i6 = 0; i6 < i5 && this.f9478n + i6 < g.this.f9464j1; i6++) {
                e eVar2 = g.this.f9463i1[this.f9478n + i6];
                if (eVar2 != null) {
                    eVar2.Z();
                }
            }
            if (i5 == 0 || this.f9466b == null) {
                return;
            }
            boolean z5 = z4 && i3 == 0;
            int i7 = -1;
            int i8 = -1;
            for (int i9 = 0; i9 < i5; i9++) {
                int i10 = z3 ? (i5 - 1) - i9 : i9;
                if (this.f9478n + i10 >= g.this.f9464j1) {
                    break;
                }
                if (g.this.f9463i1[this.f9478n + i10].O() == 0) {
                    if (i7 == -1) {
                        i7 = i9;
                    }
                    i8 = i9;
                }
            }
            e eVar3 = null;
            if (this.f9465a != 0) {
                e eVar4 = this.f9466b;
                eVar4.j0(g.this.f9440L0);
                int i11 = this.f9472h;
                if (i3 > 0) {
                    i11 += g.this.f9452X0;
                }
                if (z3) {
                    eVar4.f9340D.a(this.f9470f, i11);
                    if (z4) {
                        eVar4.f9338B.a(this.f9468d, this.f9474j);
                    }
                    if (i3 > 0) {
                        this.f9470f.f9319b.f9338B.a(eVar4.f9340D, 0);
                    }
                } else {
                    eVar4.f9338B.a(this.f9468d, i11);
                    if (z4) {
                        eVar4.f9340D.a(this.f9470f, this.f9474j);
                    }
                    if (i3 > 0) {
                        this.f9468d.f9319b.f9340D.a(eVar4.f9338B, 0);
                    }
                }
                int i12 = 0;
                while (i12 < i5 && this.f9478n + i12 < g.this.f9464j1) {
                    e eVar5 = g.this.f9463i1[this.f9478n + i12];
                    if (i12 == 0) {
                        eVar5.j(eVar5.f9339C, this.f9469e, this.f9473i);
                        int i13 = g.this.f9441M0;
                        float f3 = g.this.f9447S0;
                        if (this.f9478n == 0 && g.this.f9443O0 != -1) {
                            i13 = g.this.f9443O0;
                            f3 = g.this.f9449U0;
                        } else if (z4 && g.this.f9445Q0 != -1) {
                            i13 = g.this.f9445Q0;
                            f3 = g.this.f9451W0;
                        }
                        eVar5.y0(i13);
                        eVar5.x0(f3);
                    }
                    if (i12 == i5 - 1) {
                        eVar5.j(eVar5.f9341E, this.f9471g, this.f9475k);
                    }
                    if (eVar3 != null) {
                        eVar5.f9339C.a(eVar3.f9341E, g.this.f9453Y0);
                        if (i12 == i7) {
                            eVar5.f9339C.n(this.f9473i);
                        }
                        eVar3.f9341E.a(eVar5.f9339C, 0);
                        if (i12 == i8 + 1) {
                            eVar3.f9341E.n(this.f9475k);
                        }
                    }
                    if (eVar5 != eVar4) {
                        if (z3) {
                            int i14 = g.this.f9454Z0;
                            if (i14 == 0) {
                                eVar5.f9340D.a(eVar4.f9340D, 0);
                            } else if (i14 == 1) {
                                eVar5.f9338B.a(eVar4.f9338B, 0);
                            } else if (i14 == 2) {
                                eVar5.f9338B.a(eVar4.f9338B, 0);
                                eVar5.f9340D.a(eVar4.f9340D, 0);
                            }
                        } else {
                            int i15 = g.this.f9454Z0;
                            if (i15 == 0) {
                                eVar5.f9338B.a(eVar4.f9338B, 0);
                            } else if (i15 == 1) {
                                eVar5.f9340D.a(eVar4.f9340D, 0);
                            } else if (i15 == 2) {
                                if (z5) {
                                    eVar5.f9338B.a(this.f9468d, this.f9472h);
                                    eVar5.f9340D.a(this.f9470f, this.f9474j);
                                } else {
                                    eVar5.f9338B.a(eVar4.f9338B, 0);
                                    eVar5.f9340D.a(eVar4.f9340D, 0);
                                }
                            }
                            i12++;
                            eVar3 = eVar5;
                        }
                    }
                    i12++;
                    eVar3 = eVar5;
                }
                return;
            }
            e eVar6 = this.f9466b;
            eVar6.y0(g.this.f9441M0);
            int i16 = this.f9473i;
            if (i3 > 0) {
                i16 += g.this.f9453Y0;
            }
            eVar6.f9339C.a(this.f9469e, i16);
            if (z4) {
                eVar6.f9341E.a(this.f9471g, this.f9475k);
            }
            if (i3 > 0) {
                this.f9469e.f9319b.f9341E.a(eVar6.f9339C, 0);
            }
            if (g.this.f9455a1 == 3 && !eVar6.S()) {
                for (int i17 = 0; i17 < i5; i17++) {
                    int i18 = z3 ? (i5 - 1) - i17 : i17;
                    if (this.f9478n + i18 >= g.this.f9464j1) {
                        break;
                    }
                    eVar = g.this.f9463i1[this.f9478n + i18];
                    if (eVar.S()) {
                        break;
                    }
                }
            }
            eVar = eVar6;
            int i19 = 0;
            while (i19 < i5) {
                int i20 = z3 ? (i5 - 1) - i19 : i19;
                if (this.f9478n + i20 >= g.this.f9464j1) {
                    return;
                }
                e eVar7 = g.this.f9463i1[this.f9478n + i20];
                if (i19 == 0) {
                    i4 = 1;
                    eVar7.j(eVar7.f9338B, this.f9468d, this.f9472h);
                } else {
                    i4 = 1;
                }
                if (i20 == 0) {
                    int i21 = g.this.f9440L0;
                    float f4 = g.this.f9446R0;
                    if (this.f9478n == 0 && g.this.f9442N0 != -1) {
                        i21 = g.this.f9442N0;
                        f4 = g.this.f9448T0;
                    } else if (z4 && g.this.f9444P0 != -1) {
                        i21 = g.this.f9444P0;
                        f4 = g.this.f9450V0;
                    }
                    eVar7.j0(i21);
                    eVar7.i0(f4);
                }
                if (i19 == i5 - 1) {
                    eVar7.j(eVar7.f9340D, this.f9470f, this.f9474j);
                }
                if (eVar3 != null) {
                    eVar7.f9338B.a(eVar3.f9340D, g.this.f9452X0);
                    if (i19 == i7) {
                        eVar7.f9338B.n(this.f9472h);
                    }
                    eVar3.f9340D.a(eVar7.f9338B, 0);
                    if (i19 == i8 + 1) {
                        eVar3.f9340D.n(this.f9474j);
                    }
                }
                if (eVar7 != eVar6) {
                    c3 = 3;
                    if (g.this.f9455a1 == 3 && eVar.S() && eVar7 != eVar && eVar7.S()) {
                        eVar7.f9342F.a(eVar.f9342F, 0);
                    } else {
                        int i22 = g.this.f9455a1;
                        if (i22 == 0) {
                            eVar7.f9339C.a(eVar6.f9339C, 0);
                        } else if (i22 == i4) {
                            eVar7.f9341E.a(eVar6.f9341E, 0);
                        } else if (z5) {
                            eVar7.f9339C.a(this.f9469e, this.f9473i);
                            eVar7.f9341E.a(this.f9471g, this.f9475k);
                        } else {
                            eVar7.f9339C.a(eVar6.f9339C, 0);
                            eVar7.f9341E.a(eVar6.f9341E, 0);
                        }
                    }
                } else {
                    c3 = 3;
                }
                i19++;
                eVar3 = eVar7;
            }
        }

        public int e() {
            return this.f9465a == 1 ? this.f9477m - g.this.f9453Y0 : this.f9477m;
        }

        public int f() {
            return this.f9465a == 0 ? this.f9476l - g.this.f9452X0 : this.f9476l;
        }

        public void g(int i3) {
            int i4 = this.f9480p;
            if (i4 == 0) {
                return;
            }
            int i5 = this.f9479o;
            int i6 = i3 / i4;
            for (int i7 = 0; i7 < i5 && this.f9478n + i7 < g.this.f9464j1; i7++) {
                e eVar = g.this.f9463i1[this.f9478n + i7];
                if (this.f9465a == 0) {
                    if (eVar != null && eVar.y() == e.b.MATCH_CONSTRAINT && eVar.f9385l == 0) {
                        g.this.T0(eVar, e.b.FIXED, i6, eVar.M(), eVar.v());
                    }
                } else if (eVar != null && eVar.M() == e.b.MATCH_CONSTRAINT && eVar.f9387m == 0) {
                    int i8 = i6;
                    g.this.T0(eVar, eVar.y(), eVar.P(), e.b.FIXED, i8);
                    i6 = i8;
                }
            }
            h();
        }

        public final void h() {
            this.f9476l = 0;
            this.f9477m = 0;
            this.f9466b = null;
            this.f9467c = 0;
            int i3 = this.f9479o;
            for (int i4 = 0; i4 < i3 && this.f9478n + i4 < g.this.f9464j1; i4++) {
                e eVar = g.this.f9463i1[this.f9478n + i4];
                if (this.f9465a == 0) {
                    int P3 = eVar.P();
                    int i5 = g.this.f9452X0;
                    if (eVar.O() == 8) {
                        i5 = 0;
                    }
                    this.f9476l += P3 + i5;
                    int A12 = g.this.A1(eVar, this.f9481q);
                    if (this.f9466b == null || this.f9467c < A12) {
                        this.f9466b = eVar;
                        this.f9467c = A12;
                        this.f9477m = A12;
                    }
                } else {
                    int B12 = g.this.B1(eVar, this.f9481q);
                    int A13 = g.this.A1(eVar, this.f9481q);
                    int i6 = g.this.f9453Y0;
                    if (eVar.O() == 8) {
                        i6 = 0;
                    }
                    this.f9477m += A13 + i6;
                    if (this.f9466b == null || this.f9467c < B12) {
                        this.f9466b = eVar;
                        this.f9467c = B12;
                        this.f9476l = B12;
                    }
                }
            }
        }

        public void i(int i3) {
            this.f9478n = i3;
        }

        public void j(int i3, d dVar, d dVar2, d dVar3, d dVar4, int i4, int i5, int i6, int i7, int i8) {
            this.f9465a = i3;
            this.f9468d = dVar;
            this.f9469e = dVar2;
            this.f9470f = dVar3;
            this.f9471g = dVar4;
            this.f9472h = i4;
            this.f9473i = i5;
            this.f9474j = i6;
            this.f9475k = i7;
            this.f9481q = i8;
        }
    }

    public final int A1(e eVar, int i3) {
        e eVar2;
        if (eVar == null) {
            return 0;
        }
        if (eVar.M() == e.b.MATCH_CONSTRAINT) {
            int i4 = eVar.f9387m;
            if (i4 == 0) {
                return 0;
            }
            if (i4 == 2) {
                int i5 = (int) (eVar.f9401t * i3);
                if (i5 != eVar.v()) {
                    T0(eVar, eVar.y(), eVar.P(), e.b.FIXED, i5);
                }
                return i5;
            }
            eVar2 = eVar;
            if (i4 == 1) {
                return eVar2.v();
            }
            if (i4 == 3) {
                return (int) ((eVar2.P() * eVar2.f9353Q) + 0.5f);
            }
        } else {
            eVar2 = eVar;
        }
        return eVar2.v();
    }

    public final int B1(e eVar, int i3) {
        e eVar2;
        if (eVar == null) {
            return 0;
        }
        if (eVar.y() == e.b.MATCH_CONSTRAINT) {
            int i4 = eVar.f9385l;
            if (i4 == 0) {
                return 0;
            }
            if (i4 == 2) {
                int i5 = (int) (eVar.f9395q * i3);
                if (i5 != eVar.P()) {
                    T0(eVar, e.b.FIXED, i5, eVar.M(), eVar.v());
                }
                return i5;
            }
            eVar2 = eVar;
            if (i4 == 1) {
                return eVar2.P();
            }
            if (i4 == 3) {
                return (int) ((eVar2.v() * eVar2.f9353Q) + 0.5f);
            }
        } else {
            eVar2 = eVar;
        }
        return eVar2.P();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x010d -> B:22:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x010f -> B:22:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:80:0x0115 -> B:22:0x0059). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x0117 -> B:22:0x0059). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void C1(t.e[] r11, int r12, int r13, int r14, int[] r15) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t.g.C1(t.e[], int, int, int, int[]):void");
    }

    public final void D1(e[] eVarArr, int i3, int i4, int i5, int[] iArr) {
        int i6;
        g gVar;
        int i7;
        d dVar;
        int i8;
        g gVar2 = this;
        if (i3 == 0) {
            return;
        }
        gVar2.f9459e1.clear();
        int i9 = i5;
        a aVar = gVar2.new a(i4, gVar2.f9338B, gVar2.f9339C, gVar2.f9340D, gVar2.f9341E, i9);
        gVar2.f9459e1.add(aVar);
        if (i4 == 0) {
            i6 = 0;
            int i10 = 0;
            int i11 = 0;
            while (i11 < i3) {
                e eVar = eVarArr[i11];
                int B12 = gVar2.B1(eVar, i9);
                if (eVar.y() == e.b.MATCH_CONSTRAINT) {
                    i6++;
                }
                int i12 = i6;
                boolean z3 = (i10 == i9 || (gVar2.f9452X0 + i10) + B12 > i9) && aVar.f9466b != null;
                if (!z3 && i11 > 0 && (i8 = gVar2.f9457c1) > 0 && i11 % i8 == 0) {
                    z3 = true;
                }
                if (z3) {
                    aVar = gVar2.new a(i4, gVar2.f9338B, gVar2.f9339C, gVar2.f9340D, gVar2.f9341E, i9);
                    aVar.i(i11);
                    gVar2.f9459e1.add(aVar);
                } else if (i11 > 0) {
                    i10 += gVar2.f9452X0 + B12;
                    aVar.b(eVar);
                    i11++;
                    i6 = i12;
                }
                i10 = B12;
                aVar.b(eVar);
                i11++;
                i6 = i12;
            }
        } else {
            i6 = 0;
            int i13 = 0;
            int i14 = 0;
            while (i14 < i3) {
                e eVar2 = eVarArr[i14];
                int A12 = gVar2.A1(eVar2, i9);
                if (eVar2.M() == e.b.MATCH_CONSTRAINT) {
                    i6++;
                }
                int i15 = i6;
                boolean z4 = (i13 == i9 || (gVar2.f9453Y0 + i13) + A12 > i9) && aVar.f9466b != null;
                if (!z4 && i14 > 0 && (i7 = gVar2.f9457c1) > 0 && i14 % i7 == 0) {
                    z4 = true;
                }
                if (z4) {
                    aVar = gVar2.new a(i4, gVar2.f9338B, gVar2.f9339C, gVar2.f9340D, gVar2.f9341E, i9);
                    gVar = gVar2;
                    aVar.i(i14);
                    gVar.f9459e1.add(aVar);
                } else {
                    gVar = gVar2;
                    if (i14 > 0) {
                        i13 += gVar.f9453Y0 + A12;
                        aVar.b(eVar2);
                        i14++;
                        i9 = i5;
                        i6 = i15;
                        gVar2 = gVar;
                    }
                }
                i13 = A12;
                aVar.b(eVar2);
                i14++;
                i9 = i5;
                i6 = i15;
                gVar2 = gVar;
            }
        }
        g gVar3 = gVar2;
        int size = gVar3.f9459e1.size();
        d dVar2 = gVar3.f9338B;
        d dVar3 = gVar3.f9339C;
        d dVar4 = gVar3.f9340D;
        d dVar5 = gVar3.f9341E;
        int P02 = gVar3.P0();
        int R02 = gVar3.R0();
        int Q02 = gVar3.Q0();
        int O02 = gVar3.O0();
        e.b y3 = gVar3.y();
        e.b bVar = e.b.WRAP_CONTENT;
        boolean z5 = y3 == bVar || gVar3.M() == bVar;
        if (i6 > 0 && z5) {
            for (int i16 = 0; i16 < size; i16++) {
                a aVar2 = (a) gVar3.f9459e1.get(i16);
                if (i4 == 0) {
                    aVar2.g(i5 - aVar2.f());
                } else {
                    aVar2.g(i5 - aVar2.e());
                }
            }
        }
        d dVar6 = dVar2;
        int i17 = O02;
        int i18 = 0;
        int i19 = Q02;
        int i20 = R02;
        int i21 = P02;
        d dVar7 = dVar5;
        d dVar8 = dVar4;
        d dVar9 = dVar3;
        int i22 = 0;
        for (int i23 = 0; i23 < size; i23++) {
            a aVar3 = (a) gVar3.f9459e1.get(i23);
            if (i4 == 0) {
                if (i23 < size - 1) {
                    dVar7 = ((a) gVar3.f9459e1.get(i23 + 1)).f9466b.f9339C;
                    i17 = 0;
                } else {
                    dVar7 = gVar3.f9341E;
                    i17 = gVar3.O0();
                }
                d dVar10 = aVar3.f9466b.f9341E;
                int i24 = i22;
                aVar3.j(i4, dVar6, dVar9, dVar8, dVar7, i21, i20, i19, i17, i5);
                int max = Math.max(i18, aVar3.f());
                int e3 = aVar3.e() + i24;
                if (i23 > 0) {
                    e3 += gVar3.f9453Y0;
                }
                i22 = e3;
                i18 = max;
                dVar9 = dVar10;
                i20 = 0;
            } else {
                int i25 = i18;
                int i26 = i22;
                if (i23 < size - 1) {
                    dVar = ((a) gVar3.f9459e1.get(i23 + 1)).f9466b.f9338B;
                    i19 = 0;
                } else {
                    dVar = gVar3.f9340D;
                    i19 = gVar3.Q0();
                }
                dVar8 = dVar;
                d dVar11 = aVar3.f9466b.f9340D;
                aVar3.j(i4, dVar6, dVar9, dVar8, dVar7, i21, i20, i19, i17, i5);
                int f3 = aVar3.f() + i25;
                int max2 = Math.max(i26, aVar3.e());
                if (i23 > 0) {
                    f3 += gVar3.f9452X0;
                }
                int i27 = f3;
                i22 = max2;
                i18 = i27;
                i21 = 0;
                dVar6 = dVar11;
            }
        }
        iArr[0] = i18;
        iArr[1] = i22;
    }

    public final void E1(e[] eVarArr, int i3, int i4, int i5, int[] iArr) {
        a aVar;
        if (i3 == 0) {
            return;
        }
        if (this.f9459e1.size() == 0) {
            aVar = new a(i4, this.f9338B, this.f9339C, this.f9340D, this.f9341E, i5);
            this.f9459e1.add(aVar);
        } else {
            a aVar2 = (a) this.f9459e1.get(0);
            aVar2.c();
            aVar2.j(i4, this.f9338B, this.f9339C, this.f9340D, this.f9341E, P0(), R0(), Q0(), O0(), i5);
            aVar = aVar2;
        }
        for (int i6 = 0; i6 < i3; i6++) {
            aVar.b(eVarArr[i6]);
        }
        iArr[0] = aVar.f();
        iArr[1] = aVar.e();
    }

    public void F1(float f3) {
        this.f9448T0 = f3;
    }

    public void G1(int i3) {
        this.f9442N0 = i3;
    }

    public void H1(float f3) {
        this.f9449U0 = f3;
    }

    public void I1(int i3) {
        this.f9443O0 = i3;
    }

    public void J1(int i3) {
        this.f9454Z0 = i3;
    }

    public void K1(float f3) {
        this.f9446R0 = f3;
    }

    public void L1(int i3) {
        this.f9452X0 = i3;
    }

    public void M1(int i3) {
        this.f9440L0 = i3;
    }

    public void N1(float f3) {
        this.f9450V0 = f3;
    }

    public void O1(int i3) {
        this.f9444P0 = i3;
    }

    public void P1(float f3) {
        this.f9451W0 = f3;
    }

    public void Q1(int i3) {
        this.f9445Q0 = i3;
    }

    public void R1(int i3) {
        this.f9457c1 = i3;
    }

    @Override // t.l
    public void S0(int i3, int i4, int i5, int i6) {
        int i7;
        e[] eVarArr;
        if (this.f9491x0 > 0 && !U0()) {
            X0(0, 0);
            W0(false);
            return;
        }
        int P02 = P0();
        int Q02 = Q0();
        int R02 = R0();
        int O02 = O0();
        int[] iArr = new int[2];
        int i8 = (i4 - P02) - Q02;
        int i9 = this.f9458d1;
        if (i9 == 1) {
            i8 = (i6 - R02) - O02;
        }
        int i10 = i8;
        if (i9 == 0) {
            if (this.f9440L0 == -1) {
                this.f9440L0 = 0;
            }
            if (this.f9441M0 == -1) {
                this.f9441M0 = 0;
            }
        } else {
            if (this.f9440L0 == -1) {
                this.f9440L0 = 0;
            }
            if (this.f9441M0 == -1) {
                this.f9441M0 = 0;
            }
        }
        e[] eVarArr2 = this.f9490w0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i7 = this.f9491x0;
            if (i11 >= i7) {
                break;
            }
            if (this.f9490w0[i11].O() == 8) {
                i12++;
            }
            i11++;
        }
        if (i12 > 0) {
            e[] eVarArr3 = new e[i7 - i12];
            int i13 = 0;
            i7 = 0;
            while (i13 < this.f9491x0) {
                e eVar = this.f9490w0[i13];
                e[] eVarArr4 = eVarArr3;
                if (eVar.O() != 8) {
                    eVarArr4[i7] = eVar;
                    i7++;
                }
                i13++;
                eVarArr3 = eVarArr4;
            }
            eVarArr = eVarArr3;
        } else {
            eVarArr = eVarArr2;
        }
        int i14 = i7;
        this.f9463i1 = eVarArr;
        this.f9464j1 = i14;
        int i15 = this.f9456b1;
        if (i15 == 0) {
            E1(eVarArr, i14, this.f9458d1, i10, iArr);
        } else if (i15 == 1) {
            D1(eVarArr, i14, this.f9458d1, i10, iArr);
        } else if (i15 == 2) {
            C1(eVarArr, i14, this.f9458d1, i10, iArr);
        }
        int i16 = iArr[0] + P02 + Q02;
        int i17 = iArr[1] + R02 + O02;
        if (i3 == 1073741824) {
            i16 = i4;
        } else if (i3 == Integer.MIN_VALUE) {
            i16 = Math.min(i16, i4);
        } else if (i3 != 0) {
            i16 = 0;
        }
        if (i5 == 1073741824) {
            i17 = i6;
        } else if (i5 == Integer.MIN_VALUE) {
            i17 = Math.min(i17, i6);
        } else if (i5 != 0) {
            i17 = 0;
        }
        X0(i16, i17);
        E0(i16);
        h0(i17);
        W0(this.f9491x0 > 0);
    }

    public void S1(int i3) {
        this.f9458d1 = i3;
    }

    public void T1(int i3) {
        this.f9455a1 = i3;
    }

    public void U1(float f3) {
        this.f9447S0 = f3;
    }

    public void V1(int i3) {
        this.f9453Y0 = i3;
    }

    public void W1(int i3) {
        this.f9441M0 = i3;
    }

    public void X1(int i3) {
        this.f9456b1 = i3;
    }

    @Override // t.e
    public void f(s.d dVar) {
        super.f(dVar);
        boolean a12 = G() != null ? ((f) G()).a1() : false;
        int i3 = this.f9456b1;
        if (i3 != 0) {
            if (i3 == 1) {
                int size = this.f9459e1.size();
                int i4 = 0;
                while (i4 < size) {
                    ((a) this.f9459e1.get(i4)).d(a12, i4, i4 == size + (-1));
                    i4++;
                }
            } else if (i3 == 2) {
                z1(a12);
            }
        } else if (this.f9459e1.size() > 0) {
            ((a) this.f9459e1.get(0)).d(a12, 0, true);
        }
        W0(false);
    }

    public final void z1(boolean z3) {
        e eVar;
        if (this.f9462h1 == null || this.f9461g1 == null || this.f9460f1 == null) {
            return;
        }
        for (int i3 = 0; i3 < this.f9464j1; i3++) {
            this.f9463i1[i3].Z();
        }
        int[] iArr = this.f9462h1;
        int i4 = iArr[0];
        int i5 = iArr[1];
        e eVar2 = null;
        for (int i6 = 0; i6 < i4; i6++) {
            e eVar3 = this.f9461g1[z3 ? (i4 - i6) - 1 : i6];
            if (eVar3 != null && eVar3.O() != 8) {
                if (i6 == 0) {
                    eVar3.j(eVar3.f9338B, this.f9338B, P0());
                    eVar3.j0(this.f9440L0);
                    eVar3.i0(this.f9446R0);
                }
                if (i6 == i4 - 1) {
                    eVar3.j(eVar3.f9340D, this.f9340D, Q0());
                }
                if (i6 > 0) {
                    eVar3.j(eVar3.f9338B, eVar2.f9340D, this.f9452X0);
                    eVar2.j(eVar2.f9340D, eVar3.f9338B, 0);
                }
                eVar2 = eVar3;
            }
        }
        for (int i7 = 0; i7 < i5; i7++) {
            e eVar4 = this.f9460f1[i7];
            if (eVar4 != null && eVar4.O() != 8) {
                if (i7 == 0) {
                    eVar4.j(eVar4.f9339C, this.f9339C, R0());
                    eVar4.y0(this.f9441M0);
                    eVar4.x0(this.f9447S0);
                }
                if (i7 == i5 - 1) {
                    eVar4.j(eVar4.f9341E, this.f9341E, O0());
                }
                if (i7 > 0) {
                    eVar4.j(eVar4.f9339C, eVar2.f9341E, this.f9453Y0);
                    eVar2.j(eVar2.f9341E, eVar4.f9339C, 0);
                }
                eVar2 = eVar4;
            }
        }
        for (int i8 = 0; i8 < i4; i8++) {
            for (int i9 = 0; i9 < i5; i9++) {
                int i10 = (i9 * i4) + i8;
                if (this.f9458d1 == 1) {
                    i10 = (i8 * i5) + i9;
                }
                e[] eVarArr = this.f9463i1;
                if (i10 < eVarArr.length && (eVar = eVarArr[i10]) != null && eVar.O() != 8) {
                    e eVar5 = this.f9461g1[i8];
                    e eVar6 = this.f9460f1[i9];
                    if (eVar != eVar5) {
                        eVar.j(eVar.f9338B, eVar5.f9338B, 0);
                        eVar.j(eVar.f9340D, eVar5.f9340D, 0);
                    }
                    if (eVar != eVar6) {
                        eVar.j(eVar.f9339C, eVar6.f9339C, 0);
                        eVar.j(eVar.f9341E, eVar6.f9341E, 0);
                    }
                }
            }
        }
    }
}
