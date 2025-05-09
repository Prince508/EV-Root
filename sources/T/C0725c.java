package t;

import java.util.ArrayList;
import t.e;

/* renamed from: t.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0725c {

    /* renamed from: a, reason: collision with root package name */
    public e f9296a;

    /* renamed from: b, reason: collision with root package name */
    public e f9297b;

    /* renamed from: c, reason: collision with root package name */
    public e f9298c;

    /* renamed from: d, reason: collision with root package name */
    public e f9299d;

    /* renamed from: e, reason: collision with root package name */
    public e f9300e;

    /* renamed from: f, reason: collision with root package name */
    public e f9301f;

    /* renamed from: g, reason: collision with root package name */
    public e f9302g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f9303h;

    /* renamed from: i, reason: collision with root package name */
    public int f9304i;

    /* renamed from: j, reason: collision with root package name */
    public int f9305j;

    /* renamed from: k, reason: collision with root package name */
    public float f9306k = 0.0f;

    /* renamed from: l, reason: collision with root package name */
    public int f9307l;

    /* renamed from: m, reason: collision with root package name */
    public int f9308m;

    /* renamed from: n, reason: collision with root package name */
    public int f9309n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f9310o;

    /* renamed from: p, reason: collision with root package name */
    public int f9311p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f9312q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f9313r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f9314s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f9315t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f9316u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f9317v;

    public C0725c(e eVar, int i3, boolean z3) {
        this.f9296a = eVar;
        this.f9311p = i3;
        this.f9312q = z3;
    }

    public static boolean c(e eVar, int i3) {
        if (eVar.O() == 8 || eVar.f9349M[i3] != e.b.MATCH_CONSTRAINT) {
            return false;
        }
        int i4 = eVar.f9389n[i3];
        return i4 == 0 || i4 == 3;
    }

    public void a() {
        if (!this.f9317v) {
            b();
        }
        this.f9317v = true;
    }

    public final void b() {
        int i3 = this.f9311p * 2;
        e eVar = this.f9296a;
        this.f9310o = true;
        e eVar2 = eVar;
        boolean z3 = false;
        while (!z3) {
            this.f9304i++;
            e[] eVarArr = eVar.f9400s0;
            int i4 = this.f9311p;
            e eVar3 = null;
            eVarArr[i4] = null;
            eVar.f9398r0[i4] = null;
            if (eVar.O() != 8) {
                this.f9307l++;
                e.b s3 = eVar.s(this.f9311p);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (s3 != bVar) {
                    this.f9308m += eVar.A(this.f9311p);
                }
                int c3 = this.f9308m + eVar.f9346J[i3].c();
                this.f9308m = c3;
                int i5 = i3 + 1;
                this.f9308m = c3 + eVar.f9346J[i5].c();
                int c4 = this.f9309n + eVar.f9346J[i3].c();
                this.f9309n = c4;
                this.f9309n = c4 + eVar.f9346J[i5].c();
                if (this.f9297b == null) {
                    this.f9297b = eVar;
                }
                this.f9299d = eVar;
                e.b[] bVarArr = eVar.f9349M;
                int i6 = this.f9311p;
                if (bVarArr[i6] == bVar) {
                    int i7 = eVar.f9389n[i6];
                    if (i7 == 0 || i7 == 3 || i7 == 2) {
                        this.f9305j++;
                        float f3 = eVar.f9396q0[i6];
                        if (f3 > 0.0f) {
                            this.f9306k += f3;
                        }
                        if (c(eVar, i6)) {
                            if (f3 < 0.0f) {
                                this.f9313r = true;
                            } else {
                                this.f9314s = true;
                            }
                            if (this.f9303h == null) {
                                this.f9303h = new ArrayList();
                            }
                            this.f9303h.add(eVar);
                        }
                        if (this.f9301f == null) {
                            this.f9301f = eVar;
                        }
                        e eVar4 = this.f9302g;
                        if (eVar4 != null) {
                            eVar4.f9398r0[this.f9311p] = eVar;
                        }
                        this.f9302g = eVar;
                    }
                    if (this.f9311p == 0) {
                        if (eVar.f9385l != 0) {
                            this.f9310o = false;
                        } else if (eVar.f9391o != 0 || eVar.f9393p != 0) {
                            this.f9310o = false;
                        }
                    } else if (eVar.f9387m != 0) {
                        this.f9310o = false;
                    } else if (eVar.f9397r != 0 || eVar.f9399s != 0) {
                        this.f9310o = false;
                    }
                    if (eVar.f9353Q != 0.0f) {
                        this.f9310o = false;
                        this.f9316u = true;
                    }
                }
            }
            if (eVar2 != eVar) {
                eVar2.f9400s0[this.f9311p] = eVar;
            }
            d dVar = eVar.f9346J[i3 + 1].f9321d;
            if (dVar != null) {
                e eVar5 = dVar.f9319b;
                d dVar2 = eVar5.f9346J[i3].f9321d;
                if (dVar2 != null && dVar2.f9319b == eVar) {
                    eVar3 = eVar5;
                }
            }
            if (eVar3 == null) {
                eVar3 = eVar;
                z3 = true;
            }
            eVar2 = eVar;
            eVar = eVar3;
        }
        e eVar6 = this.f9297b;
        if (eVar6 != null) {
            this.f9308m -= eVar6.f9346J[i3].c();
        }
        e eVar7 = this.f9299d;
        if (eVar7 != null) {
            this.f9308m -= eVar7.f9346J[i3 + 1].c();
        }
        this.f9298c = eVar;
        if (this.f9311p == 0 && this.f9312q) {
            this.f9300e = eVar;
        } else {
            this.f9300e = this.f9296a;
        }
        this.f9315t = this.f9314s && this.f9313r;
    }
}
