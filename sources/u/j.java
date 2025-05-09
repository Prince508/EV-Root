package u;

import t.d;
import t.e;
import u.f;
import u.m;

/* loaded from: classes.dex */
public class j extends m {

    /* renamed from: k, reason: collision with root package name */
    public static int[] f9574k = new int[2];

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9575a;

        static {
            int[] iArr = new int[m.b.values().length];
            f9575a = iArr;
            try {
                iArr[m.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9575a[m.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9575a[m.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public j(t.e eVar) {
        super(eVar);
        this.f9594h.f9556e = f.a.LEFT;
        this.f9595i.f9556e = f.a.RIGHT;
        this.f9592f = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x02a5, code lost:
    
        if (r7 != 1) goto L131;
     */
    @Override // u.m, u.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(u.d r14) {
        /*
            Method dump skipped, instructions count: 1067
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u.j.a(u.d):void");
    }

    @Override // u.m
    public void d() {
        t.e G3;
        t.e G4;
        t.e eVar = this.f9588b;
        if (eVar.f9363a) {
            this.f9591e.d(eVar.P());
        }
        if (this.f9591e.f9561j) {
            e.b bVar = this.f9590d;
            e.b bVar2 = e.b.MATCH_PARENT;
            if (bVar == bVar2 && (((G3 = this.f9588b.G()) != null && G3.y() == e.b.FIXED) || G3.y() == bVar2)) {
                b(this.f9594h, G3.f9371e.f9594h, this.f9588b.f9338B.c());
                b(this.f9595i, G3.f9371e.f9595i, -this.f9588b.f9340D.c());
                return;
            }
        } else {
            e.b y3 = this.f9588b.y();
            this.f9590d = y3;
            if (y3 != e.b.MATCH_CONSTRAINT) {
                e.b bVar3 = e.b.MATCH_PARENT;
                if (y3 == bVar3 && (((G4 = this.f9588b.G()) != null && G4.y() == e.b.FIXED) || G4.y() == bVar3)) {
                    int P3 = (G4.P() - this.f9588b.f9338B.c()) - this.f9588b.f9340D.c();
                    b(this.f9594h, G4.f9371e.f9594h, this.f9588b.f9338B.c());
                    b(this.f9595i, G4.f9371e.f9595i, -this.f9588b.f9340D.c());
                    this.f9591e.d(P3);
                    return;
                }
                if (this.f9590d == e.b.FIXED) {
                    this.f9591e.d(this.f9588b.P());
                }
            }
        }
        g gVar = this.f9591e;
        if (gVar.f9561j) {
            t.e eVar2 = this.f9588b;
            if (eVar2.f9363a) {
                t.d[] dVarArr = eVar2.f9346J;
                t.d dVar = dVarArr[0];
                t.d dVar2 = dVar.f9321d;
                if (dVar2 != null && dVarArr[1].f9321d != null) {
                    if (eVar2.V()) {
                        this.f9594h.f9557f = this.f9588b.f9346J[0].c();
                        this.f9595i.f9557f = -this.f9588b.f9346J[1].c();
                        return;
                    }
                    f h3 = h(this.f9588b.f9346J[0]);
                    if (h3 != null) {
                        b(this.f9594h, h3, this.f9588b.f9346J[0].c());
                    }
                    f h4 = h(this.f9588b.f9346J[1]);
                    if (h4 != null) {
                        b(this.f9595i, h4, -this.f9588b.f9346J[1].c());
                    }
                    this.f9594h.f9553b = true;
                    this.f9595i.f9553b = true;
                    return;
                }
                if (dVar2 != null) {
                    f h5 = h(dVar);
                    if (h5 != null) {
                        b(this.f9594h, h5, this.f9588b.f9346J[0].c());
                        b(this.f9595i, this.f9594h, this.f9591e.f9558g);
                        return;
                    }
                    return;
                }
                t.d dVar3 = dVarArr[1];
                if (dVar3.f9321d != null) {
                    f h6 = h(dVar3);
                    if (h6 != null) {
                        b(this.f9595i, h6, -this.f9588b.f9346J[1].c());
                        b(this.f9594h, this.f9595i, -this.f9591e.f9558g);
                        return;
                    }
                    return;
                }
                if ((eVar2 instanceof t.i) || eVar2.G() == null || this.f9588b.m(d.b.CENTER).f9321d != null) {
                    return;
                }
                b(this.f9594h, this.f9588b.G().f9371e.f9594h, this.f9588b.Q());
                b(this.f9595i, this.f9594h, this.f9591e.f9558g);
                return;
            }
        }
        if (this.f9590d == e.b.MATCH_CONSTRAINT) {
            t.e eVar3 = this.f9588b;
            int i3 = eVar3.f9385l;
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
            } else if (i3 == 3) {
                if (eVar3.f9387m == 3) {
                    this.f9594h.f9552a = this;
                    this.f9595i.f9552a = this;
                    l lVar = eVar3.f9373f;
                    lVar.f9594h.f9552a = this;
                    lVar.f9595i.f9552a = this;
                    gVar.f9552a = this;
                    if (eVar3.X()) {
                        this.f9591e.f9563l.add(this.f9588b.f9373f.f9591e);
                        this.f9588b.f9373f.f9591e.f9562k.add(this.f9591e);
                        l lVar2 = this.f9588b.f9373f;
                        lVar2.f9591e.f9552a = this;
                        this.f9591e.f9563l.add(lVar2.f9594h);
                        this.f9591e.f9563l.add(this.f9588b.f9373f.f9595i);
                        this.f9588b.f9373f.f9594h.f9562k.add(this.f9591e);
                        this.f9588b.f9373f.f9595i.f9562k.add(this.f9591e);
                    } else if (this.f9588b.V()) {
                        this.f9588b.f9373f.f9591e.f9563l.add(this.f9591e);
                        this.f9591e.f9562k.add(this.f9588b.f9373f.f9591e);
                    } else {
                        this.f9588b.f9373f.f9591e.f9563l.add(this.f9591e);
                    }
                } else {
                    g gVar4 = eVar3.f9373f.f9591e;
                    gVar.f9563l.add(gVar4);
                    gVar4.f9562k.add(this.f9591e);
                    this.f9588b.f9373f.f9594h.f9562k.add(this.f9591e);
                    this.f9588b.f9373f.f9595i.f9562k.add(this.f9591e);
                    g gVar5 = this.f9591e;
                    gVar5.f9553b = true;
                    gVar5.f9562k.add(this.f9594h);
                    this.f9591e.f9562k.add(this.f9595i);
                    this.f9594h.f9563l.add(this.f9591e);
                    this.f9595i.f9563l.add(this.f9591e);
                }
            }
        }
        t.e eVar4 = this.f9588b;
        t.d[] dVarArr2 = eVar4.f9346J;
        t.d dVar4 = dVarArr2[0];
        t.d dVar5 = dVar4.f9321d;
        if (dVar5 != null && dVarArr2[1].f9321d != null) {
            if (eVar4.V()) {
                this.f9594h.f9557f = this.f9588b.f9346J[0].c();
                this.f9595i.f9557f = -this.f9588b.f9346J[1].c();
                return;
            }
            f h7 = h(this.f9588b.f9346J[0]);
            f h8 = h(this.f9588b.f9346J[1]);
            h7.b(this);
            h8.b(this);
            this.f9596j = m.b.CENTER;
            return;
        }
        if (dVar5 != null) {
            f h9 = h(dVar4);
            if (h9 != null) {
                b(this.f9594h, h9, this.f9588b.f9346J[0].c());
                c(this.f9595i, this.f9594h, 1, this.f9591e);
                return;
            }
            return;
        }
        t.d dVar6 = dVarArr2[1];
        if (dVar6.f9321d != null) {
            f h10 = h(dVar6);
            if (h10 != null) {
                b(this.f9595i, h10, -this.f9588b.f9346J[1].c());
                c(this.f9594h, this.f9595i, -1, this.f9591e);
                return;
            }
            return;
        }
        if ((eVar4 instanceof t.i) || eVar4.G() == null) {
            return;
        }
        b(this.f9594h, this.f9588b.G().f9371e.f9594h, this.f9588b.Q());
        c(this.f9595i, this.f9594h, 1, this.f9591e);
    }

    @Override // u.m
    public void e() {
        f fVar = this.f9594h;
        if (fVar.f9561j) {
            this.f9588b.F0(fVar.f9558g);
        }
    }

    @Override // u.m
    public void f() {
        this.f9589c = null;
        this.f9594h.c();
        this.f9595i.c();
        this.f9591e.c();
        this.f9593g = false;
    }

    @Override // u.m
    public boolean m() {
        return this.f9590d != e.b.MATCH_CONSTRAINT || this.f9588b.f9385l == 0;
    }

    public final void q(int[] iArr, int i3, int i4, int i5, int i6, float f3, int i7) {
        int i8 = i4 - i3;
        int i9 = i6 - i5;
        if (i7 != -1) {
            if (i7 == 0) {
                iArr[0] = (int) ((i9 * f3) + 0.5f);
                iArr[1] = i9;
                return;
            } else {
                if (i7 != 1) {
                    return;
                }
                iArr[0] = i8;
                iArr[1] = (int) ((i8 * f3) + 0.5f);
                return;
            }
        }
        int i10 = (int) ((i9 * f3) + 0.5f);
        int i11 = (int) ((i8 / f3) + 0.5f);
        if (i10 <= i8) {
            iArr[0] = i10;
            iArr[1] = i9;
        } else if (i11 <= i9) {
            iArr[0] = i8;
            iArr[1] = i11;
        }
    }

    public void r() {
        this.f9593g = false;
        this.f9594h.c();
        this.f9594h.f9561j = false;
        this.f9595i.c();
        this.f9595i.f9561j = false;
        this.f9591e.f9561j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f9588b.r();
    }
}
