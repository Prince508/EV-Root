package u;

import t.d;
import t.e;
import u.f;
import u.m;

/* loaded from: classes.dex */
public class l extends m {

    /* renamed from: k, reason: collision with root package name */
    public f f9584k;

    /* renamed from: l, reason: collision with root package name */
    public g f9585l;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9586a;

        static {
            int[] iArr = new int[m.b.values().length];
            f9586a = iArr;
            try {
                iArr[m.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9586a[m.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9586a[m.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public l(t.e eVar) {
        super(eVar);
        f fVar = new f(this);
        this.f9584k = fVar;
        this.f9585l = null;
        this.f9594h.f9556e = f.a.TOP;
        this.f9595i.f9556e = f.a.BOTTOM;
        fVar.f9556e = f.a.BASELINE;
        this.f9592f = 1;
    }

    @Override // u.m, u.d
    public void a(d dVar) {
        float f3;
        float t3;
        float f4;
        int i3;
        int i4 = a.f9586a[this.f9596j.ordinal()];
        if (i4 == 1) {
            p(dVar);
        } else if (i4 == 2) {
            o(dVar);
        } else if (i4 == 3) {
            t.e eVar = this.f9588b;
            n(dVar, eVar.f9339C, eVar.f9341E, 1);
            return;
        }
        g gVar = this.f9591e;
        if (gVar.f9554c && !gVar.f9561j && this.f9590d == e.b.MATCH_CONSTRAINT) {
            t.e eVar2 = this.f9588b;
            int i5 = eVar2.f9387m;
            if (i5 == 2) {
                t.e G3 = eVar2.G();
                if (G3 != null) {
                    if (G3.f9373f.f9591e.f9561j) {
                        this.f9591e.d((int) ((r7.f9558g * this.f9588b.f9401t) + 0.5f));
                    }
                }
            } else if (i5 == 3 && eVar2.f9371e.f9591e.f9561j) {
                int u3 = eVar2.u();
                if (u3 == -1) {
                    t.e eVar3 = this.f9588b;
                    f3 = eVar3.f9371e.f9591e.f9558g;
                    t3 = eVar3.t();
                } else if (u3 == 0) {
                    f4 = r7.f9371e.f9591e.f9558g * this.f9588b.t();
                    i3 = (int) (f4 + 0.5f);
                    this.f9591e.d(i3);
                } else if (u3 != 1) {
                    i3 = 0;
                    this.f9591e.d(i3);
                } else {
                    t.e eVar4 = this.f9588b;
                    f3 = eVar4.f9371e.f9591e.f9558g;
                    t3 = eVar4.t();
                }
                f4 = f3 / t3;
                i3 = (int) (f4 + 0.5f);
                this.f9591e.d(i3);
            }
        }
        f fVar = this.f9594h;
        if (fVar.f9554c) {
            f fVar2 = this.f9595i;
            if (fVar2.f9554c) {
                if (fVar.f9561j && fVar2.f9561j && this.f9591e.f9561j) {
                    return;
                }
                if (!this.f9591e.f9561j && this.f9590d == e.b.MATCH_CONSTRAINT) {
                    t.e eVar5 = this.f9588b;
                    if (eVar5.f9385l == 0 && !eVar5.X()) {
                        f fVar3 = (f) this.f9594h.f9563l.get(0);
                        f fVar4 = (f) this.f9595i.f9563l.get(0);
                        int i6 = fVar3.f9558g;
                        f fVar5 = this.f9594h;
                        int i7 = i6 + fVar5.f9557f;
                        int i8 = fVar4.f9558g + this.f9595i.f9557f;
                        fVar5.d(i7);
                        this.f9595i.d(i8);
                        this.f9591e.d(i8 - i7);
                        return;
                    }
                }
                if (!this.f9591e.f9561j && this.f9590d == e.b.MATCH_CONSTRAINT && this.f9587a == 1 && this.f9594h.f9563l.size() > 0 && this.f9595i.f9563l.size() > 0) {
                    f fVar6 = (f) this.f9594h.f9563l.get(0);
                    int i9 = (((f) this.f9595i.f9563l.get(0)).f9558g + this.f9595i.f9557f) - (fVar6.f9558g + this.f9594h.f9557f);
                    g gVar2 = this.f9591e;
                    int i10 = gVar2.f9573m;
                    if (i9 < i10) {
                        gVar2.d(i9);
                    } else {
                        gVar2.d(i10);
                    }
                }
                if (this.f9591e.f9561j && this.f9594h.f9563l.size() > 0 && this.f9595i.f9563l.size() > 0) {
                    f fVar7 = (f) this.f9594h.f9563l.get(0);
                    f fVar8 = (f) this.f9595i.f9563l.get(0);
                    int i11 = fVar7.f9558g + this.f9594h.f9557f;
                    int i12 = fVar8.f9558g + this.f9595i.f9557f;
                    float K3 = this.f9588b.K();
                    if (fVar7 == fVar8) {
                        i11 = fVar7.f9558g;
                        i12 = fVar8.f9558g;
                        K3 = 0.5f;
                    }
                    this.f9594h.d((int) (i11 + 0.5f + (((i12 - i11) - this.f9591e.f9558g) * K3)));
                    this.f9595i.d(this.f9594h.f9558g + this.f9591e.f9558g);
                }
            }
        }
    }

    @Override // u.m
    public void d() {
        t.e G3;
        t.e G4;
        t.e eVar = this.f9588b;
        if (eVar.f9363a) {
            this.f9591e.d(eVar.v());
        }
        if (!this.f9591e.f9561j) {
            this.f9590d = this.f9588b.M();
            if (this.f9588b.S()) {
                this.f9585l = new C0734a(this);
            }
            e.b bVar = this.f9590d;
            if (bVar != e.b.MATCH_CONSTRAINT) {
                if (bVar == e.b.MATCH_PARENT && (G4 = this.f9588b.G()) != null && G4.M() == e.b.FIXED) {
                    int v3 = (G4.v() - this.f9588b.f9339C.c()) - this.f9588b.f9341E.c();
                    b(this.f9594h, G4.f9373f.f9594h, this.f9588b.f9339C.c());
                    b(this.f9595i, G4.f9373f.f9595i, -this.f9588b.f9341E.c());
                    this.f9591e.d(v3);
                    return;
                }
                if (this.f9590d == e.b.FIXED) {
                    this.f9591e.d(this.f9588b.v());
                }
            }
        } else if (this.f9590d == e.b.MATCH_PARENT && (G3 = this.f9588b.G()) != null && G3.M() == e.b.FIXED) {
            b(this.f9594h, G3.f9373f.f9594h, this.f9588b.f9339C.c());
            b(this.f9595i, G3.f9373f.f9595i, -this.f9588b.f9341E.c());
            return;
        }
        g gVar = this.f9591e;
        boolean z3 = gVar.f9561j;
        if (z3) {
            t.e eVar2 = this.f9588b;
            if (eVar2.f9363a) {
                t.d[] dVarArr = eVar2.f9346J;
                t.d dVar = dVarArr[2];
                t.d dVar2 = dVar.f9321d;
                if (dVar2 != null && dVarArr[3].f9321d != null) {
                    if (eVar2.X()) {
                        this.f9594h.f9557f = this.f9588b.f9346J[2].c();
                        this.f9595i.f9557f = -this.f9588b.f9346J[3].c();
                    } else {
                        f h3 = h(this.f9588b.f9346J[2]);
                        if (h3 != null) {
                            b(this.f9594h, h3, this.f9588b.f9346J[2].c());
                        }
                        f h4 = h(this.f9588b.f9346J[3]);
                        if (h4 != null) {
                            b(this.f9595i, h4, -this.f9588b.f9346J[3].c());
                        }
                        this.f9594h.f9553b = true;
                        this.f9595i.f9553b = true;
                    }
                    if (this.f9588b.S()) {
                        b(this.f9584k, this.f9594h, this.f9588b.n());
                        return;
                    }
                    return;
                }
                if (dVar2 != null) {
                    f h5 = h(dVar);
                    if (h5 != null) {
                        b(this.f9594h, h5, this.f9588b.f9346J[2].c());
                        b(this.f9595i, this.f9594h, this.f9591e.f9558g);
                        if (this.f9588b.S()) {
                            b(this.f9584k, this.f9594h, this.f9588b.n());
                            return;
                        }
                        return;
                    }
                    return;
                }
                t.d dVar3 = dVarArr[3];
                if (dVar3.f9321d != null) {
                    f h6 = h(dVar3);
                    if (h6 != null) {
                        b(this.f9595i, h6, -this.f9588b.f9346J[3].c());
                        b(this.f9594h, this.f9595i, -this.f9591e.f9558g);
                    }
                    if (this.f9588b.S()) {
                        b(this.f9584k, this.f9594h, this.f9588b.n());
                        return;
                    }
                    return;
                }
                t.d dVar4 = dVarArr[4];
                if (dVar4.f9321d != null) {
                    f h7 = h(dVar4);
                    if (h7 != null) {
                        b(this.f9584k, h7, 0);
                        b(this.f9594h, this.f9584k, -this.f9588b.n());
                        b(this.f9595i, this.f9594h, this.f9591e.f9558g);
                        return;
                    }
                    return;
                }
                if ((eVar2 instanceof t.i) || eVar2.G() == null || this.f9588b.m(d.b.CENTER).f9321d != null) {
                    return;
                }
                b(this.f9594h, this.f9588b.G().f9373f.f9594h, this.f9588b.R());
                b(this.f9595i, this.f9594h, this.f9591e.f9558g);
                if (this.f9588b.S()) {
                    b(this.f9584k, this.f9594h, this.f9588b.n());
                    return;
                }
                return;
            }
        }
        if (z3 || this.f9590d != e.b.MATCH_CONSTRAINT) {
            gVar.b(this);
        } else {
            t.e eVar3 = this.f9588b;
            int i3 = eVar3.f9387m;
            if (i3 == 2) {
                t.e G5 = eVar3.G();
                if (G5 != null) {
                    g gVar2 = G5.f9373f.f9591e;
                    this.f9591e.f9563l.add(gVar2);
                    gVar2.f9562k.add(this.f9591e);
                    g gVar3 = this.f9591e;
                    gVar3.f9553b = true;
                    gVar3.f9562k.add(this.f9594h);
                    this.f9591e.f9562k.add(this.f9595i);
                }
            } else if (i3 == 3 && !eVar3.X()) {
                t.e eVar4 = this.f9588b;
                if (eVar4.f9385l != 3) {
                    g gVar4 = eVar4.f9371e.f9591e;
                    this.f9591e.f9563l.add(gVar4);
                    gVar4.f9562k.add(this.f9591e);
                    g gVar5 = this.f9591e;
                    gVar5.f9553b = true;
                    gVar5.f9562k.add(this.f9594h);
                    this.f9591e.f9562k.add(this.f9595i);
                }
            }
        }
        t.e eVar5 = this.f9588b;
        t.d[] dVarArr2 = eVar5.f9346J;
        t.d dVar5 = dVarArr2[2];
        t.d dVar6 = dVar5.f9321d;
        if (dVar6 != null && dVarArr2[3].f9321d != null) {
            if (eVar5.X()) {
                this.f9594h.f9557f = this.f9588b.f9346J[2].c();
                this.f9595i.f9557f = -this.f9588b.f9346J[3].c();
            } else {
                f h8 = h(this.f9588b.f9346J[2]);
                f h9 = h(this.f9588b.f9346J[3]);
                h8.b(this);
                h9.b(this);
                this.f9596j = m.b.CENTER;
            }
            if (this.f9588b.S()) {
                c(this.f9584k, this.f9594h, 1, this.f9585l);
            }
        } else if (dVar6 != null) {
            f h10 = h(dVar5);
            if (h10 != null) {
                b(this.f9594h, h10, this.f9588b.f9346J[2].c());
                c(this.f9595i, this.f9594h, 1, this.f9591e);
                if (this.f9588b.S()) {
                    c(this.f9584k, this.f9594h, 1, this.f9585l);
                }
                e.b bVar2 = this.f9590d;
                e.b bVar3 = e.b.MATCH_CONSTRAINT;
                if (bVar2 == bVar3 && this.f9588b.t() > 0.0f) {
                    j jVar = this.f9588b.f9371e;
                    if (jVar.f9590d == bVar3) {
                        jVar.f9591e.f9562k.add(this.f9591e);
                        this.f9591e.f9563l.add(this.f9588b.f9371e.f9591e);
                        this.f9591e.f9552a = this;
                    }
                }
            }
        } else {
            t.d dVar7 = dVarArr2[3];
            if (dVar7.f9321d != null) {
                f h11 = h(dVar7);
                if (h11 != null) {
                    b(this.f9595i, h11, -this.f9588b.f9346J[3].c());
                    c(this.f9594h, this.f9595i, -1, this.f9591e);
                    if (this.f9588b.S()) {
                        c(this.f9584k, this.f9594h, 1, this.f9585l);
                    }
                }
            } else {
                t.d dVar8 = dVarArr2[4];
                if (dVar8.f9321d != null) {
                    f h12 = h(dVar8);
                    if (h12 != null) {
                        b(this.f9584k, h12, 0);
                        c(this.f9594h, this.f9584k, -1, this.f9585l);
                        c(this.f9595i, this.f9594h, 1, this.f9591e);
                    }
                } else if (!(eVar5 instanceof t.i) && eVar5.G() != null) {
                    b(this.f9594h, this.f9588b.G().f9373f.f9594h, this.f9588b.R());
                    c(this.f9595i, this.f9594h, 1, this.f9591e);
                    if (this.f9588b.S()) {
                        c(this.f9584k, this.f9594h, 1, this.f9585l);
                    }
                    e.b bVar4 = this.f9590d;
                    e.b bVar5 = e.b.MATCH_CONSTRAINT;
                    if (bVar4 == bVar5 && this.f9588b.t() > 0.0f) {
                        j jVar2 = this.f9588b.f9371e;
                        if (jVar2.f9590d == bVar5) {
                            jVar2.f9591e.f9562k.add(this.f9591e);
                            this.f9591e.f9563l.add(this.f9588b.f9371e.f9591e);
                            this.f9591e.f9552a = this;
                        }
                    }
                }
            }
        }
        if (this.f9591e.f9563l.size() == 0) {
            this.f9591e.f9554c = true;
        }
    }

    @Override // u.m
    public void e() {
        f fVar = this.f9594h;
        if (fVar.f9561j) {
            this.f9588b.G0(fVar.f9558g);
        }
    }

    @Override // u.m
    public void f() {
        this.f9589c = null;
        this.f9594h.c();
        this.f9595i.c();
        this.f9584k.c();
        this.f9591e.c();
        this.f9593g = false;
    }

    @Override // u.m
    public boolean m() {
        return this.f9590d != e.b.MATCH_CONSTRAINT || this.f9588b.f9387m == 0;
    }

    public void q() {
        this.f9593g = false;
        this.f9594h.c();
        this.f9594h.f9561j = false;
        this.f9595i.c();
        this.f9595i.f9561j = false;
        this.f9584k.c();
        this.f9584k.f9561j = false;
        this.f9591e.f9561j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f9588b.r();
    }
}
