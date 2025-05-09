package s;

import java.util.Arrays;
import java.util.HashMap;
import s.i;
import t.d;

/* loaded from: classes.dex */
public class d {

    /* renamed from: q, reason: collision with root package name */
    public static int f9035q = 1000;

    /* renamed from: r, reason: collision with root package name */
    public static boolean f9036r = true;

    /* renamed from: s, reason: collision with root package name */
    public static long f9037s;

    /* renamed from: t, reason: collision with root package name */
    public static long f9038t;

    /* renamed from: c, reason: collision with root package name */
    public a f9041c;

    /* renamed from: f, reason: collision with root package name */
    public s.b[] f9044f;

    /* renamed from: m, reason: collision with root package name */
    public final c f9051m;

    /* renamed from: p, reason: collision with root package name */
    public a f9054p;

    /* renamed from: a, reason: collision with root package name */
    public int f9039a = 0;

    /* renamed from: b, reason: collision with root package name */
    public HashMap f9040b = null;

    /* renamed from: d, reason: collision with root package name */
    public int f9042d = 32;

    /* renamed from: e, reason: collision with root package name */
    public int f9043e = 32;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9045g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9046h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean[] f9047i = new boolean[32];

    /* renamed from: j, reason: collision with root package name */
    public int f9048j = 1;

    /* renamed from: k, reason: collision with root package name */
    public int f9049k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f9050l = 32;

    /* renamed from: n, reason: collision with root package name */
    public i[] f9052n = new i[f9035q];

    /* renamed from: o, reason: collision with root package name */
    public int f9053o = 0;

    public interface a {
        void a(i iVar);

        i b(d dVar, boolean[] zArr);

        void c(a aVar);

        void clear();

        i getKey();
    }

    public class b extends s.b {
        public b(c cVar) {
            this.f9029e = new j(this, cVar);
        }
    }

    public d() {
        this.f9044f = null;
        this.f9044f = new s.b[32];
        C();
        c cVar = new c();
        this.f9051m = cVar;
        this.f9041c = new h(cVar);
        if (f9036r) {
            this.f9054p = new b(cVar);
        } else {
            this.f9054p = new s.b(cVar);
        }
    }

    public static s.b s(d dVar, i iVar, i iVar2, float f3) {
        return dVar.r().j(iVar, iVar2, f3);
    }

    public static e w() {
        return null;
    }

    public void A(a aVar) {
        u(aVar);
        B(aVar, false);
        n();
    }

    public final int B(a aVar, boolean z3) {
        for (int i3 = 0; i3 < this.f9048j; i3++) {
            this.f9047i[i3] = false;
        }
        boolean z4 = false;
        int i4 = 0;
        while (!z4) {
            i4++;
            if (i4 < this.f9048j * 2) {
                if (aVar.getKey() != null) {
                    this.f9047i[aVar.getKey().f9071c] = true;
                }
                i b3 = aVar.b(this, this.f9047i);
                if (b3 != null) {
                    boolean[] zArr = this.f9047i;
                    int i5 = b3.f9071c;
                    if (!zArr[i5]) {
                        zArr[i5] = true;
                    }
                }
                if (b3 != null) {
                    float f3 = Float.MAX_VALUE;
                    int i6 = -1;
                    for (int i7 = 0; i7 < this.f9049k; i7++) {
                        s.b bVar = this.f9044f[i7];
                        if (bVar.f9025a.f9078j != i.a.UNRESTRICTED && !bVar.f9030f && bVar.t(b3)) {
                            float e3 = bVar.f9029e.e(b3);
                            if (e3 < 0.0f) {
                                float f4 = (-bVar.f9026b) / e3;
                                if (f4 < f3) {
                                    i6 = i7;
                                    f3 = f4;
                                }
                            }
                        }
                    }
                    if (i6 > -1) {
                        s.b bVar2 = this.f9044f[i6];
                        bVar2.f9025a.f9072d = -1;
                        bVar2.y(b3);
                        i iVar = bVar2.f9025a;
                        iVar.f9072d = i6;
                        iVar.g(bVar2);
                    }
                } else {
                    z4 = true;
                }
            }
            return i4;
        }
        return i4;
    }

    public final void C() {
        int i3 = 0;
        if (f9036r) {
            while (true) {
                s.b[] bVarArr = this.f9044f;
                if (i3 >= bVarArr.length) {
                    return;
                }
                s.b bVar = bVarArr[i3];
                if (bVar != null) {
                    this.f9051m.f9031a.a(bVar);
                }
                this.f9044f[i3] = null;
                i3++;
            }
        } else {
            while (true) {
                s.b[] bVarArr2 = this.f9044f;
                if (i3 >= bVarArr2.length) {
                    return;
                }
                s.b bVar2 = bVarArr2[i3];
                if (bVar2 != null) {
                    this.f9051m.f9032b.a(bVar2);
                }
                this.f9044f[i3] = null;
                i3++;
            }
        }
    }

    public void D() {
        c cVar;
        int i3 = 0;
        while (true) {
            cVar = this.f9051m;
            i[] iVarArr = cVar.f9034d;
            if (i3 >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i3];
            if (iVar != null) {
                iVar.d();
            }
            i3++;
        }
        cVar.f9033c.c(this.f9052n, this.f9053o);
        this.f9053o = 0;
        Arrays.fill(this.f9051m.f9034d, (Object) null);
        HashMap hashMap = this.f9040b;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f9039a = 0;
        this.f9041c.clear();
        this.f9048j = 1;
        for (int i4 = 0; i4 < this.f9049k; i4++) {
            this.f9044f[i4].f9027c = false;
        }
        C();
        this.f9049k = 0;
        if (f9036r) {
            this.f9054p = new b(this.f9051m);
        } else {
            this.f9054p = new s.b(this.f9051m);
        }
    }

    public final i a(i.a aVar, String str) {
        i iVar = (i) this.f9051m.f9033c.b();
        if (iVar == null) {
            iVar = new i(aVar, str);
            iVar.f(aVar, str);
        } else {
            iVar.d();
            iVar.f(aVar, str);
        }
        int i3 = this.f9053o;
        int i4 = f9035q;
        if (i3 >= i4) {
            int i5 = i4 * 2;
            f9035q = i5;
            this.f9052n = (i[]) Arrays.copyOf(this.f9052n, i5);
        }
        i[] iVarArr = this.f9052n;
        int i6 = this.f9053o;
        this.f9053o = i6 + 1;
        iVarArr[i6] = iVar;
        return iVar;
    }

    public void b(t.e eVar, t.e eVar2, float f3, int i3) {
        d.b bVar = d.b.LEFT;
        i q3 = q(eVar.m(bVar));
        d.b bVar2 = d.b.TOP;
        i q4 = q(eVar.m(bVar2));
        d.b bVar3 = d.b.RIGHT;
        i q5 = q(eVar.m(bVar3));
        d.b bVar4 = d.b.BOTTOM;
        i q6 = q(eVar.m(bVar4));
        i q7 = q(eVar2.m(bVar));
        i q8 = q(eVar2.m(bVar2));
        i q9 = q(eVar2.m(bVar3));
        i q10 = q(eVar2.m(bVar4));
        s.b r3 = r();
        double d3 = f3;
        double d4 = i3;
        r3.q(q4, q6, q8, q10, (float) (Math.sin(d3) * d4));
        d(r3);
        s.b r4 = r();
        r4.q(q3, q5, q7, q9, (float) (Math.cos(d3) * d4));
        d(r4);
    }

    public void c(i iVar, i iVar2, int i3, float f3, i iVar3, i iVar4, int i4, int i5) {
        s.b r3 = r();
        r3.h(iVar, iVar2, i3, f3, iVar3, iVar4, i4);
        if (i5 != 8) {
            r3.d(this, i5);
        }
        d(r3);
    }

    public void d(s.b bVar) {
        i w3;
        if (bVar == null) {
            return;
        }
        boolean z3 = true;
        if (this.f9049k + 1 >= this.f9050l || this.f9048j + 1 >= this.f9043e) {
            y();
        }
        boolean z4 = false;
        if (!bVar.f9030f) {
            bVar.D(this);
            if (bVar.u()) {
                return;
            }
            bVar.r();
            if (bVar.f(this)) {
                i p3 = p();
                bVar.f9025a = p3;
                l(bVar);
                this.f9054p.c(bVar);
                B(this.f9054p, true);
                if (p3.f9072d == -1) {
                    if (bVar.f9025a == p3 && (w3 = bVar.w(p3)) != null) {
                        bVar.y(w3);
                    }
                    if (!bVar.f9030f) {
                        bVar.f9025a.g(bVar);
                    }
                    this.f9049k--;
                }
            } else {
                z3 = false;
            }
            if (!bVar.s()) {
                return;
            } else {
                z4 = z3;
            }
        }
        if (z4) {
            return;
        }
        l(bVar);
    }

    public s.b e(i iVar, i iVar2, int i3, int i4) {
        if (i4 == 8 && iVar2.f9075g && iVar.f9072d == -1) {
            iVar.e(this, iVar2.f9074f + i3);
            return null;
        }
        s.b r3 = r();
        r3.n(iVar, iVar2, i3);
        if (i4 != 8) {
            r3.d(this, i4);
        }
        d(r3);
        return r3;
    }

    public void f(i iVar, int i3) {
        int i4 = iVar.f9072d;
        if (i4 == -1) {
            iVar.e(this, i3);
            return;
        }
        if (i4 == -1) {
            s.b r3 = r();
            r3.i(iVar, i3);
            d(r3);
            return;
        }
        s.b bVar = this.f9044f[i4];
        if (bVar.f9030f) {
            bVar.f9026b = i3;
            return;
        }
        if (bVar.f9029e.k() == 0) {
            bVar.f9030f = true;
            bVar.f9026b = i3;
        } else {
            s.b r4 = r();
            r4.m(iVar, i3);
            d(r4);
        }
    }

    public void g(i iVar, i iVar2, int i3, boolean z3) {
        s.b r3 = r();
        i t3 = t();
        t3.f9073e = 0;
        r3.o(iVar, iVar2, t3, i3);
        d(r3);
    }

    public void h(i iVar, i iVar2, int i3, int i4) {
        s.b r3 = r();
        i t3 = t();
        t3.f9073e = 0;
        r3.o(iVar, iVar2, t3, i3);
        if (i4 != 8) {
            m(r3, (int) (r3.f9029e.e(t3) * (-1.0f)), i4);
        }
        d(r3);
    }

    public void i(i iVar, i iVar2, int i3, boolean z3) {
        s.b r3 = r();
        i t3 = t();
        t3.f9073e = 0;
        r3.p(iVar, iVar2, t3, i3);
        d(r3);
    }

    public void j(i iVar, i iVar2, int i3, int i4) {
        s.b r3 = r();
        i t3 = t();
        t3.f9073e = 0;
        r3.p(iVar, iVar2, t3, i3);
        if (i4 != 8) {
            m(r3, (int) (r3.f9029e.e(t3) * (-1.0f)), i4);
        }
        d(r3);
    }

    public void k(i iVar, i iVar2, i iVar3, i iVar4, float f3, int i3) {
        s.b r3 = r();
        r3.k(iVar, iVar2, iVar3, iVar4, f3);
        if (i3 != 8) {
            r3.d(this, i3);
        }
        d(r3);
    }

    public final void l(s.b bVar) {
        if (f9036r) {
            s.b bVar2 = this.f9044f[this.f9049k];
            if (bVar2 != null) {
                this.f9051m.f9031a.a(bVar2);
            }
        } else {
            s.b bVar3 = this.f9044f[this.f9049k];
            if (bVar3 != null) {
                this.f9051m.f9032b.a(bVar3);
            }
        }
        s.b[] bVarArr = this.f9044f;
        int i3 = this.f9049k;
        bVarArr[i3] = bVar;
        i iVar = bVar.f9025a;
        iVar.f9072d = i3;
        this.f9049k = i3 + 1;
        iVar.g(bVar);
    }

    public void m(s.b bVar, int i3, int i4) {
        bVar.e(o(i4, null), i3);
    }

    public final void n() {
        for (int i3 = 0; i3 < this.f9049k; i3++) {
            s.b bVar = this.f9044f[i3];
            bVar.f9025a.f9074f = bVar.f9026b;
        }
    }

    public i o(int i3, String str) {
        if (this.f9048j + 1 >= this.f9043e) {
            y();
        }
        i a3 = a(i.a.ERROR, str);
        int i4 = this.f9039a + 1;
        this.f9039a = i4;
        this.f9048j++;
        a3.f9071c = i4;
        a3.f9073e = i3;
        this.f9051m.f9034d[i4] = a3;
        this.f9041c.a(a3);
        return a3;
    }

    public i p() {
        if (this.f9048j + 1 >= this.f9043e) {
            y();
        }
        i a3 = a(i.a.SLACK, null);
        int i3 = this.f9039a + 1;
        this.f9039a = i3;
        this.f9048j++;
        a3.f9071c = i3;
        this.f9051m.f9034d[i3] = a3;
        return a3;
    }

    public i q(Object obj) {
        i iVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f9048j + 1 >= this.f9043e) {
            y();
        }
        if (obj instanceof t.d) {
            t.d dVar = (t.d) obj;
            iVar = dVar.f();
            if (iVar == null) {
                dVar.m(this.f9051m);
                iVar = dVar.f();
            }
            int i3 = iVar.f9071c;
            if (i3 != -1 && i3 <= this.f9039a && this.f9051m.f9034d[i3] != null) {
                return iVar;
            }
            if (i3 != -1) {
                iVar.d();
            }
            int i4 = this.f9039a + 1;
            this.f9039a = i4;
            this.f9048j++;
            iVar.f9071c = i4;
            iVar.f9078j = i.a.UNRESTRICTED;
            this.f9051m.f9034d[i4] = iVar;
        }
        return iVar;
    }

    public s.b r() {
        s.b bVar;
        if (f9036r) {
            bVar = (s.b) this.f9051m.f9031a.b();
            if (bVar == null) {
                bVar = new b(this.f9051m);
                f9038t++;
            } else {
                bVar.z();
            }
        } else {
            bVar = (s.b) this.f9051m.f9032b.b();
            if (bVar == null) {
                bVar = new s.b(this.f9051m);
                f9037s++;
            } else {
                bVar.z();
            }
        }
        i.b();
        return bVar;
    }

    public i t() {
        if (this.f9048j + 1 >= this.f9043e) {
            y();
        }
        i a3 = a(i.a.SLACK, null);
        int i3 = this.f9039a + 1;
        this.f9039a = i3;
        this.f9048j++;
        a3.f9071c = i3;
        this.f9051m.f9034d[i3] = a3;
        return a3;
    }

    public final int u(a aVar) {
        for (int i3 = 0; i3 < this.f9049k; i3++) {
            s.b bVar = this.f9044f[i3];
            if (bVar.f9025a.f9078j != i.a.UNRESTRICTED && bVar.f9026b < 0.0f) {
                boolean z3 = false;
                int i4 = 0;
                while (!z3) {
                    i4++;
                    float f3 = Float.MAX_VALUE;
                    int i5 = -1;
                    int i6 = -1;
                    int i7 = 0;
                    int i8 = 0;
                    while (true) {
                        if (i7 >= this.f9049k) {
                            break;
                        }
                        s.b bVar2 = this.f9044f[i7];
                        if (bVar2.f9025a.f9078j != i.a.UNRESTRICTED && !bVar2.f9030f && bVar2.f9026b < 0.0f) {
                            for (int i9 = 1; i9 < this.f9048j; i9++) {
                                i iVar = this.f9051m.f9034d[i9];
                                float e3 = bVar2.f9029e.e(iVar);
                                if (e3 > 0.0f) {
                                    for (int i10 = 0; i10 < 9; i10++) {
                                        float f4 = iVar.f9076h[i10] / e3;
                                        if ((f4 < f3 && i10 == i8) || i10 > i8) {
                                            f3 = f4;
                                            i5 = i7;
                                            i6 = i9;
                                            i8 = i10;
                                        }
                                    }
                                }
                            }
                        }
                        i7++;
                    }
                    if (i5 != -1) {
                        s.b bVar3 = this.f9044f[i5];
                        bVar3.f9025a.f9072d = -1;
                        bVar3.y(this.f9051m.f9034d[i6]);
                        i iVar2 = bVar3.f9025a;
                        iVar2.f9072d = i5;
                        iVar2.g(bVar3);
                    } else {
                        z3 = true;
                    }
                    if (i4 > this.f9048j / 2) {
                        z3 = true;
                    }
                }
                return i4;
            }
        }
        return 0;
    }

    public c v() {
        return this.f9051m;
    }

    public int x(Object obj) {
        i f3 = ((t.d) obj).f();
        if (f3 != null) {
            return (int) (f3.f9074f + 0.5f);
        }
        return 0;
    }

    public final void y() {
        int i3 = this.f9042d * 2;
        this.f9042d = i3;
        this.f9044f = (s.b[]) Arrays.copyOf(this.f9044f, i3);
        c cVar = this.f9051m;
        cVar.f9034d = (i[]) Arrays.copyOf(cVar.f9034d, this.f9042d);
        int i4 = this.f9042d;
        this.f9047i = new boolean[i4];
        this.f9043e = i4;
        this.f9050l = i4;
    }

    public void z() {
        if (!this.f9045g && !this.f9046h) {
            A(this.f9041c);
            return;
        }
        for (int i3 = 0; i3 < this.f9049k; i3++) {
            if (!this.f9044f[i3].f9030f) {
                A(this.f9041c);
                return;
            }
        }
        n();
    }
}
