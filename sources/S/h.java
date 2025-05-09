package s;

import java.util.Arrays;
import java.util.Comparator;
import s.b;

/* loaded from: classes.dex */
public class h extends s.b {

    /* renamed from: g, reason: collision with root package name */
    public int f9058g;

    /* renamed from: h, reason: collision with root package name */
    public i[] f9059h;

    /* renamed from: i, reason: collision with root package name */
    public i[] f9060i;

    /* renamed from: j, reason: collision with root package name */
    public int f9061j;

    /* renamed from: k, reason: collision with root package name */
    public b f9062k;

    /* renamed from: l, reason: collision with root package name */
    public c f9063l;

    public class a implements Comparator {
        public a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(i iVar, i iVar2) {
            return iVar.f9071c - iVar2.f9071c;
        }
    }

    public class b implements Comparable {

        /* renamed from: e, reason: collision with root package name */
        public i f9065e;

        /* renamed from: f, reason: collision with root package name */
        public h f9066f;

        public b(h hVar) {
            this.f9066f = hVar;
        }

        public boolean c(i iVar, float f3) {
            boolean z3 = true;
            if (!this.f9065e.f9069a) {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f4 = iVar.f9077i[i3];
                    if (f4 != 0.0f) {
                        float f5 = f4 * f3;
                        if (Math.abs(f5) < 1.0E-4f) {
                            f5 = 0.0f;
                        }
                        this.f9065e.f9077i[i3] = f5;
                    } else {
                        this.f9065e.f9077i[i3] = 0.0f;
                    }
                }
                return true;
            }
            for (int i4 = 0; i4 < 9; i4++) {
                float[] fArr = this.f9065e.f9077i;
                float f6 = fArr[i4] + (iVar.f9077i[i4] * f3);
                fArr[i4] = f6;
                if (Math.abs(f6) < 1.0E-4f) {
                    this.f9065e.f9077i[i4] = 0.0f;
                } else {
                    z3 = false;
                }
            }
            if (z3) {
                h.this.G(this.f9065e);
            }
            return false;
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.f9065e.f9071c - ((i) obj).f9071c;
        }

        public void f(i iVar) {
            this.f9065e = iVar;
        }

        public final boolean g() {
            for (int i3 = 8; i3 >= 0; i3--) {
                float f3 = this.f9065e.f9077i[i3];
                if (f3 > 0.0f) {
                    return false;
                }
                if (f3 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean h(i iVar) {
            int i3 = 8;
            while (true) {
                if (i3 < 0) {
                    break;
                }
                float f3 = iVar.f9077i[i3];
                float f4 = this.f9065e.f9077i[i3];
                if (f4 == f3) {
                    i3--;
                } else if (f4 < f3) {
                    return true;
                }
            }
            return false;
        }

        public void i() {
            Arrays.fill(this.f9065e.f9077i, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f9065e != null) {
                for (int i3 = 0; i3 < 9; i3++) {
                    str = str + this.f9065e.f9077i[i3] + " ";
                }
            }
            return str + "] " + this.f9065e;
        }
    }

    public h(c cVar) {
        super(cVar);
        this.f9058g = 128;
        this.f9059h = new i[128];
        this.f9060i = new i[128];
        this.f9061j = 0;
        this.f9062k = new b(this);
        this.f9063l = cVar;
    }

    @Override // s.b
    public void C(s.b bVar, boolean z3) {
        i iVar = bVar.f9025a;
        if (iVar == null) {
            return;
        }
        b.a aVar = bVar.f9029e;
        int k3 = aVar.k();
        for (int i3 = 0; i3 < k3; i3++) {
            i d3 = aVar.d(i3);
            float a3 = aVar.a(i3);
            this.f9062k.f(d3);
            if (this.f9062k.c(iVar, a3)) {
                F(d3);
            }
            this.f9026b += bVar.f9026b * a3;
        }
        G(iVar);
    }

    public final void F(i iVar) {
        int i3;
        int i4 = this.f9061j + 1;
        i[] iVarArr = this.f9059h;
        if (i4 > iVarArr.length) {
            i[] iVarArr2 = (i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f9059h = iVarArr2;
            this.f9060i = (i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        i[] iVarArr3 = this.f9059h;
        int i5 = this.f9061j;
        iVarArr3[i5] = iVar;
        int i6 = i5 + 1;
        this.f9061j = i6;
        if (i6 > 1 && iVarArr3[i5].f9071c > iVar.f9071c) {
            int i7 = 0;
            while (true) {
                i3 = this.f9061j;
                if (i7 >= i3) {
                    break;
                }
                this.f9060i[i7] = this.f9059h[i7];
                i7++;
            }
            Arrays.sort(this.f9060i, 0, i3, new a());
            for (int i8 = 0; i8 < this.f9061j; i8++) {
                this.f9059h[i8] = this.f9060i[i8];
            }
        }
        iVar.f9069a = true;
        iVar.a(this);
    }

    public final void G(i iVar) {
        int i3 = 0;
        while (i3 < this.f9061j) {
            if (this.f9059h[i3] == iVar) {
                while (true) {
                    int i4 = this.f9061j;
                    if (i3 >= i4 - 1) {
                        this.f9061j = i4 - 1;
                        iVar.f9069a = false;
                        return;
                    } else {
                        i[] iVarArr = this.f9059h;
                        int i5 = i3 + 1;
                        iVarArr[i3] = iVarArr[i5];
                        i3 = i5;
                    }
                }
            } else {
                i3++;
            }
        }
    }

    @Override // s.b, s.d.a
    public void a(i iVar) {
        this.f9062k.f(iVar);
        this.f9062k.i();
        iVar.f9077i[iVar.f9073e] = 1.0f;
        F(iVar);
    }

    @Override // s.b, s.d.a
    public i b(d dVar, boolean[] zArr) {
        int i3 = -1;
        for (int i4 = 0; i4 < this.f9061j; i4++) {
            i iVar = this.f9059h[i4];
            if (!zArr[iVar.f9071c]) {
                this.f9062k.f(iVar);
                if (i3 == -1) {
                    if (!this.f9062k.g()) {
                    }
                    i3 = i4;
                } else {
                    if (!this.f9062k.h(this.f9059h[i3])) {
                    }
                    i3 = i4;
                }
            }
        }
        if (i3 == -1) {
            return null;
        }
        return this.f9059h[i3];
    }

    @Override // s.b, s.d.a
    public void clear() {
        this.f9061j = 0;
        this.f9026b = 0.0f;
    }

    @Override // s.b
    public String toString() {
        String str = " goal -> (" + this.f9026b + ") : ";
        for (int i3 = 0; i3 < this.f9061j; i3++) {
            this.f9062k.f(this.f9059h[i3]);
            str = str + this.f9062k + " ";
        }
        return str;
    }
}
