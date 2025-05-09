package s;

import java.util.ArrayList;
import java.util.Iterator;
import s.d;
import s.i;

/* loaded from: classes.dex */
public class b implements d.a {

    /* renamed from: e, reason: collision with root package name */
    public a f9029e;

    /* renamed from: a, reason: collision with root package name */
    public i f9025a = null;

    /* renamed from: b, reason: collision with root package name */
    public float f9026b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9027c = false;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f9028d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public boolean f9030f = false;

    public interface a {
        float a(int i3);

        float b(b bVar, boolean z3);

        float c(i iVar, boolean z3);

        void clear();

        i d(int i3);

        float e(i iVar);

        boolean f(i iVar);

        void g(float f3);

        void h(i iVar, float f3, boolean z3);

        void i(i iVar, float f3);

        void j();

        int k();
    }

    public b() {
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String A() {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s.b.A():java.lang.String");
    }

    public void B(d dVar, i iVar, boolean z3) {
        if (iVar.f9075g) {
            this.f9026b += iVar.f9074f * this.f9029e.e(iVar);
            this.f9029e.c(iVar, z3);
            if (z3) {
                iVar.c(this);
            }
        }
    }

    public void C(b bVar, boolean z3) {
        this.f9026b += bVar.f9026b * this.f9029e.b(bVar, z3);
        if (z3) {
            bVar.f9025a.c(this);
        }
    }

    public void D(d dVar) {
        if (dVar.f9044f.length == 0) {
            return;
        }
        boolean z3 = false;
        while (!z3) {
            int k3 = this.f9029e.k();
            for (int i3 = 0; i3 < k3; i3++) {
                i d3 = this.f9029e.d(i3);
                if (d3.f9072d != -1 || d3.f9075g) {
                    this.f9028d.add(d3);
                }
            }
            if (this.f9028d.size() > 0) {
                Iterator it = this.f9028d.iterator();
                while (it.hasNext()) {
                    i iVar = (i) it.next();
                    if (iVar.f9075g) {
                        B(dVar, iVar, true);
                    } else {
                        C(dVar.f9044f[iVar.f9072d], true);
                    }
                }
                this.f9028d.clear();
            } else {
                z3 = true;
            }
        }
    }

    @Override // s.d.a
    public void a(i iVar) {
        int i3 = iVar.f9073e;
        float f3 = 1.0f;
        if (i3 != 1) {
            if (i3 == 2) {
                f3 = 1000.0f;
            } else if (i3 == 3) {
                f3 = 1000000.0f;
            } else if (i3 == 4) {
                f3 = 1.0E9f;
            } else if (i3 == 5) {
                f3 = 1.0E12f;
            }
        }
        this.f9029e.i(iVar, f3);
    }

    @Override // s.d.a
    public i b(d dVar, boolean[] zArr) {
        return x(zArr, null);
    }

    @Override // s.d.a
    public void c(d.a aVar) {
        if (aVar instanceof b) {
            b bVar = (b) aVar;
            this.f9025a = null;
            this.f9029e.clear();
            for (int i3 = 0; i3 < bVar.f9029e.k(); i3++) {
                this.f9029e.h(bVar.f9029e.d(i3), bVar.f9029e.a(i3), true);
            }
        }
    }

    @Override // s.d.a
    public void clear() {
        this.f9029e.clear();
        this.f9025a = null;
        this.f9026b = 0.0f;
    }

    public b d(d dVar, int i3) {
        this.f9029e.i(dVar.o(i3, "ep"), 1.0f);
        this.f9029e.i(dVar.o(i3, "em"), -1.0f);
        return this;
    }

    public b e(i iVar, int i3) {
        this.f9029e.i(iVar, i3);
        return this;
    }

    public boolean f(d dVar) {
        boolean z3;
        i g3 = g(dVar);
        if (g3 == null) {
            z3 = true;
        } else {
            y(g3);
            z3 = false;
        }
        if (this.f9029e.k() == 0) {
            this.f9030f = true;
        }
        return z3;
    }

    public i g(d dVar) {
        boolean v3;
        boolean v4;
        int k3 = this.f9029e.k();
        i iVar = null;
        float f3 = 0.0f;
        float f4 = 0.0f;
        boolean z3 = false;
        boolean z4 = false;
        i iVar2 = null;
        for (int i3 = 0; i3 < k3; i3++) {
            float a3 = this.f9029e.a(i3);
            i d3 = this.f9029e.d(i3);
            if (d3.f9078j == i.a.UNRESTRICTED) {
                if (iVar == null) {
                    v4 = v(d3, dVar);
                } else if (f3 > a3) {
                    v4 = v(d3, dVar);
                } else if (!z3 && v(d3, dVar)) {
                    f3 = a3;
                    iVar = d3;
                    z3 = true;
                }
                z3 = v4;
                f3 = a3;
                iVar = d3;
            } else if (iVar == null && a3 < 0.0f) {
                if (iVar2 == null) {
                    v3 = v(d3, dVar);
                } else if (f4 > a3) {
                    v3 = v(d3, dVar);
                } else if (!z4 && v(d3, dVar)) {
                    f4 = a3;
                    iVar2 = d3;
                    z4 = true;
                }
                z4 = v3;
                f4 = a3;
                iVar2 = d3;
            }
        }
        return iVar != null ? iVar : iVar2;
    }

    @Override // s.d.a
    public i getKey() {
        return this.f9025a;
    }

    public b h(i iVar, i iVar2, int i3, float f3, i iVar3, i iVar4, int i4) {
        if (iVar2 == iVar3) {
            this.f9029e.i(iVar, 1.0f);
            this.f9029e.i(iVar4, 1.0f);
            this.f9029e.i(iVar2, -2.0f);
            return this;
        }
        if (f3 == 0.5f) {
            this.f9029e.i(iVar, 1.0f);
            this.f9029e.i(iVar2, -1.0f);
            this.f9029e.i(iVar3, -1.0f);
            this.f9029e.i(iVar4, 1.0f);
            if (i3 > 0 || i4 > 0) {
                this.f9026b = (-i3) + i4;
                return this;
            }
        } else {
            if (f3 <= 0.0f) {
                this.f9029e.i(iVar, -1.0f);
                this.f9029e.i(iVar2, 1.0f);
                this.f9026b = i3;
                return this;
            }
            if (f3 >= 1.0f) {
                this.f9029e.i(iVar4, -1.0f);
                this.f9029e.i(iVar3, 1.0f);
                this.f9026b = -i4;
                return this;
            }
            float f4 = 1.0f - f3;
            this.f9029e.i(iVar, f4 * 1.0f);
            this.f9029e.i(iVar2, f4 * (-1.0f));
            this.f9029e.i(iVar3, (-1.0f) * f3);
            this.f9029e.i(iVar4, 1.0f * f3);
            if (i3 > 0 || i4 > 0) {
                this.f9026b = ((-i3) * f4) + (i4 * f3);
                return this;
            }
        }
        return this;
    }

    public b i(i iVar, int i3) {
        this.f9025a = iVar;
        float f3 = i3;
        iVar.f9074f = f3;
        this.f9026b = f3;
        this.f9030f = true;
        return this;
    }

    public b j(i iVar, i iVar2, float f3) {
        this.f9029e.i(iVar, -1.0f);
        this.f9029e.i(iVar2, f3);
        return this;
    }

    public b k(i iVar, i iVar2, i iVar3, i iVar4, float f3) {
        this.f9029e.i(iVar, -1.0f);
        this.f9029e.i(iVar2, 1.0f);
        this.f9029e.i(iVar3, f3);
        this.f9029e.i(iVar4, -f3);
        return this;
    }

    public b l(float f3, float f4, float f5, i iVar, i iVar2, i iVar3, i iVar4) {
        this.f9026b = 0.0f;
        if (f4 == 0.0f || f3 == f5) {
            this.f9029e.i(iVar, 1.0f);
            this.f9029e.i(iVar2, -1.0f);
            this.f9029e.i(iVar4, 1.0f);
            this.f9029e.i(iVar3, -1.0f);
            return this;
        }
        if (f3 == 0.0f) {
            this.f9029e.i(iVar, 1.0f);
            this.f9029e.i(iVar2, -1.0f);
            return this;
        }
        if (f5 == 0.0f) {
            this.f9029e.i(iVar3, 1.0f);
            this.f9029e.i(iVar4, -1.0f);
            return this;
        }
        float f6 = (f3 / f4) / (f5 / f4);
        this.f9029e.i(iVar, 1.0f);
        this.f9029e.i(iVar2, -1.0f);
        this.f9029e.i(iVar4, f6);
        this.f9029e.i(iVar3, -f6);
        return this;
    }

    public b m(i iVar, int i3) {
        if (i3 < 0) {
            this.f9026b = i3 * (-1);
            this.f9029e.i(iVar, 1.0f);
            return this;
        }
        this.f9026b = i3;
        this.f9029e.i(iVar, -1.0f);
        return this;
    }

    public b n(i iVar, i iVar2, int i3) {
        boolean z3 = false;
        if (i3 != 0) {
            if (i3 < 0) {
                i3 *= -1;
                z3 = true;
            }
            this.f9026b = i3;
        }
        if (z3) {
            this.f9029e.i(iVar, 1.0f);
            this.f9029e.i(iVar2, -1.0f);
            return this;
        }
        this.f9029e.i(iVar, -1.0f);
        this.f9029e.i(iVar2, 1.0f);
        return this;
    }

    public b o(i iVar, i iVar2, i iVar3, int i3) {
        boolean z3 = false;
        if (i3 != 0) {
            if (i3 < 0) {
                i3 *= -1;
                z3 = true;
            }
            this.f9026b = i3;
        }
        if (z3) {
            this.f9029e.i(iVar, 1.0f);
            this.f9029e.i(iVar2, -1.0f);
            this.f9029e.i(iVar3, -1.0f);
            return this;
        }
        this.f9029e.i(iVar, -1.0f);
        this.f9029e.i(iVar2, 1.0f);
        this.f9029e.i(iVar3, 1.0f);
        return this;
    }

    public b p(i iVar, i iVar2, i iVar3, int i3) {
        boolean z3 = false;
        if (i3 != 0) {
            if (i3 < 0) {
                i3 *= -1;
                z3 = true;
            }
            this.f9026b = i3;
        }
        if (z3) {
            this.f9029e.i(iVar, 1.0f);
            this.f9029e.i(iVar2, -1.0f);
            this.f9029e.i(iVar3, 1.0f);
            return this;
        }
        this.f9029e.i(iVar, -1.0f);
        this.f9029e.i(iVar2, 1.0f);
        this.f9029e.i(iVar3, -1.0f);
        return this;
    }

    public b q(i iVar, i iVar2, i iVar3, i iVar4, float f3) {
        this.f9029e.i(iVar3, 0.5f);
        this.f9029e.i(iVar4, 0.5f);
        this.f9029e.i(iVar, -0.5f);
        this.f9029e.i(iVar2, -0.5f);
        this.f9026b = -f3;
        return this;
    }

    public void r() {
        float f3 = this.f9026b;
        if (f3 < 0.0f) {
            this.f9026b = f3 * (-1.0f);
            this.f9029e.j();
        }
    }

    public boolean s() {
        i iVar = this.f9025a;
        if (iVar != null) {
            return iVar.f9078j == i.a.UNRESTRICTED || this.f9026b >= 0.0f;
        }
        return false;
    }

    public boolean t(i iVar) {
        return this.f9029e.f(iVar);
    }

    public String toString() {
        return A();
    }

    public boolean u() {
        return this.f9025a == null && this.f9026b == 0.0f && this.f9029e.k() == 0;
    }

    public final boolean v(i iVar, d dVar) {
        return iVar.f9081m <= 1;
    }

    public i w(i iVar) {
        return x(null, iVar);
    }

    public final i x(boolean[] zArr, i iVar) {
        i.a aVar;
        int k3 = this.f9029e.k();
        i iVar2 = null;
        float f3 = 0.0f;
        for (int i3 = 0; i3 < k3; i3++) {
            float a3 = this.f9029e.a(i3);
            if (a3 < 0.0f) {
                i d3 = this.f9029e.d(i3);
                if ((zArr == null || !zArr[d3.f9071c]) && d3 != iVar && (((aVar = d3.f9078j) == i.a.SLACK || aVar == i.a.ERROR) && a3 < f3)) {
                    f3 = a3;
                    iVar2 = d3;
                }
            }
        }
        return iVar2;
    }

    public void y(i iVar) {
        i iVar2 = this.f9025a;
        if (iVar2 != null) {
            this.f9029e.i(iVar2, -1.0f);
            this.f9025a = null;
        }
        float c3 = this.f9029e.c(iVar, true) * (-1.0f);
        this.f9025a = iVar;
        if (c3 == 1.0f) {
            return;
        }
        this.f9026b /= c3;
        this.f9029e.g(c3);
    }

    public void z() {
        this.f9025a = null;
        this.f9029e.clear();
        this.f9026b = 0.0f;
        this.f9030f = false;
    }

    public b(c cVar) {
        this.f9029e = new C0702a(this, cVar);
    }
}
