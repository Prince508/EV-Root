package s;

import java.util.Arrays;
import s.b;

/* loaded from: classes.dex */
public class j implements b.a {

    /* renamed from: n, reason: collision with root package name */
    public static float f9089n = 0.001f;

    /* renamed from: a, reason: collision with root package name */
    public final int f9090a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f9091b = 16;

    /* renamed from: c, reason: collision with root package name */
    public int f9092c = 16;

    /* renamed from: d, reason: collision with root package name */
    public int[] f9093d = new int[16];

    /* renamed from: e, reason: collision with root package name */
    public int[] f9094e = new int[16];

    /* renamed from: f, reason: collision with root package name */
    public int[] f9095f = new int[16];

    /* renamed from: g, reason: collision with root package name */
    public float[] f9096g = new float[16];

    /* renamed from: h, reason: collision with root package name */
    public int[] f9097h = new int[16];

    /* renamed from: i, reason: collision with root package name */
    public int[] f9098i = new int[16];

    /* renamed from: j, reason: collision with root package name */
    public int f9099j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f9100k = -1;

    /* renamed from: l, reason: collision with root package name */
    public final b f9101l;

    /* renamed from: m, reason: collision with root package name */
    public final c f9102m;

    public j(b bVar, c cVar) {
        this.f9101l = bVar;
        this.f9102m = cVar;
        clear();
    }

    @Override // s.b.a
    public float a(int i3) {
        int i4 = this.f9099j;
        int i5 = this.f9100k;
        for (int i6 = 0; i6 < i4; i6++) {
            if (i6 == i3) {
                return this.f9096g[i5];
            }
            i5 = this.f9098i[i5];
            if (i5 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // s.b.a
    public float b(b bVar, boolean z3) {
        float e3 = e(bVar.f9025a);
        c(bVar.f9025a, z3);
        j jVar = (j) bVar.f9029e;
        int k3 = jVar.k();
        int i3 = 0;
        int i4 = 0;
        while (i3 < k3) {
            int i5 = jVar.f9095f[i4];
            if (i5 != -1) {
                h(this.f9102m.f9034d[i5], jVar.f9096g[i4] * e3, z3);
                i3++;
            }
            i4++;
        }
        return e3;
    }

    @Override // s.b.a
    public float c(i iVar, boolean z3) {
        int p3 = p(iVar);
        if (p3 == -1) {
            return 0.0f;
        }
        r(iVar);
        float f3 = this.f9096g[p3];
        if (this.f9100k == p3) {
            this.f9100k = this.f9098i[p3];
        }
        this.f9095f[p3] = -1;
        int[] iArr = this.f9097h;
        int i3 = iArr[p3];
        if (i3 != -1) {
            int[] iArr2 = this.f9098i;
            iArr2[i3] = iArr2[p3];
        }
        int i4 = this.f9098i[p3];
        if (i4 != -1) {
            iArr[i4] = iArr[p3];
        }
        this.f9099j--;
        iVar.f9081m--;
        if (z3) {
            iVar.c(this.f9101l);
        }
        return f3;
    }

    @Override // s.b.a
    public void clear() {
        int i3 = this.f9099j;
        for (int i4 = 0; i4 < i3; i4++) {
            i d3 = d(i4);
            if (d3 != null) {
                d3.c(this.f9101l);
            }
        }
        for (int i5 = 0; i5 < this.f9091b; i5++) {
            this.f9095f[i5] = -1;
            this.f9094e[i5] = -1;
        }
        for (int i6 = 0; i6 < this.f9092c; i6++) {
            this.f9093d[i6] = -1;
        }
        this.f9099j = 0;
        this.f9100k = -1;
    }

    @Override // s.b.a
    public i d(int i3) {
        int i4 = this.f9099j;
        if (i4 == 0) {
            return null;
        }
        int i5 = this.f9100k;
        for (int i6 = 0; i6 < i4; i6++) {
            if (i6 == i3 && i5 != -1) {
                return this.f9102m.f9034d[this.f9095f[i5]];
            }
            i5 = this.f9098i[i5];
            if (i5 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // s.b.a
    public float e(i iVar) {
        int p3 = p(iVar);
        if (p3 != -1) {
            return this.f9096g[p3];
        }
        return 0.0f;
    }

    @Override // s.b.a
    public boolean f(i iVar) {
        return p(iVar) != -1;
    }

    @Override // s.b.a
    public void g(float f3) {
        int i3 = this.f9099j;
        int i4 = this.f9100k;
        for (int i5 = 0; i5 < i3; i5++) {
            float[] fArr = this.f9096g;
            fArr[i4] = fArr[i4] / f3;
            i4 = this.f9098i[i4];
            if (i4 == -1) {
                return;
            }
        }
    }

    @Override // s.b.a
    public void h(i iVar, float f3, boolean z3) {
        float f4 = f9089n;
        if (f3 <= (-f4) || f3 >= f4) {
            int p3 = p(iVar);
            if (p3 == -1) {
                i(iVar, f3);
                return;
            }
            float[] fArr = this.f9096g;
            float f5 = fArr[p3] + f3;
            fArr[p3] = f5;
            float f6 = f9089n;
            if (f5 <= (-f6) || f5 >= f6) {
                return;
            }
            fArr[p3] = 0.0f;
            c(iVar, z3);
        }
    }

    @Override // s.b.a
    public void i(i iVar, float f3) {
        float f4 = f9089n;
        if (f3 > (-f4) && f3 < f4) {
            c(iVar, true);
            return;
        }
        if (this.f9099j == 0) {
            m(0, iVar, f3);
            l(iVar, 0);
            this.f9100k = 0;
            return;
        }
        int p3 = p(iVar);
        if (p3 != -1) {
            this.f9096g[p3] = f3;
            return;
        }
        if (this.f9099j + 1 >= this.f9091b) {
            o();
        }
        int i3 = this.f9099j;
        int i4 = this.f9100k;
        int i5 = -1;
        for (int i6 = 0; i6 < i3; i6++) {
            int i7 = this.f9095f[i4];
            int i8 = iVar.f9071c;
            if (i7 == i8) {
                this.f9096g[i4] = f3;
                return;
            }
            if (i7 < i8) {
                i5 = i4;
            }
            i4 = this.f9098i[i4];
            if (i4 == -1) {
                break;
            }
        }
        q(i5, iVar, f3);
    }

    @Override // s.b.a
    public void j() {
        int i3 = this.f9099j;
        int i4 = this.f9100k;
        for (int i5 = 0; i5 < i3; i5++) {
            float[] fArr = this.f9096g;
            fArr[i4] = fArr[i4] * (-1.0f);
            i4 = this.f9098i[i4];
            if (i4 == -1) {
                return;
            }
        }
    }

    @Override // s.b.a
    public int k() {
        return this.f9099j;
    }

    public final void l(i iVar, int i3) {
        int[] iArr;
        int i4 = iVar.f9071c % this.f9092c;
        int[] iArr2 = this.f9093d;
        int i5 = iArr2[i4];
        if (i5 == -1) {
            iArr2[i4] = i3;
        } else {
            while (true) {
                iArr = this.f9094e;
                int i6 = iArr[i5];
                if (i6 == -1) {
                    break;
                } else {
                    i5 = i6;
                }
            }
            iArr[i5] = i3;
        }
        this.f9094e[i3] = -1;
    }

    public final void m(int i3, i iVar, float f3) {
        this.f9095f[i3] = iVar.f9071c;
        this.f9096g[i3] = f3;
        this.f9097h[i3] = -1;
        this.f9098i[i3] = -1;
        iVar.a(this.f9101l);
        iVar.f9081m++;
        this.f9099j++;
    }

    public final int n() {
        for (int i3 = 0; i3 < this.f9091b; i3++) {
            if (this.f9095f[i3] == -1) {
                return i3;
            }
        }
        return -1;
    }

    public final void o() {
        int i3 = this.f9091b * 2;
        this.f9095f = Arrays.copyOf(this.f9095f, i3);
        this.f9096g = Arrays.copyOf(this.f9096g, i3);
        this.f9097h = Arrays.copyOf(this.f9097h, i3);
        this.f9098i = Arrays.copyOf(this.f9098i, i3);
        this.f9094e = Arrays.copyOf(this.f9094e, i3);
        for (int i4 = this.f9091b; i4 < i3; i4++) {
            this.f9095f[i4] = -1;
            this.f9094e[i4] = -1;
        }
        this.f9091b = i3;
    }

    public int p(i iVar) {
        if (this.f9099j == 0) {
            return -1;
        }
        int i3 = iVar.f9071c;
        int i4 = this.f9093d[i3 % this.f9092c];
        if (i4 == -1) {
            return -1;
        }
        if (this.f9095f[i4] == i3) {
            return i4;
        }
        do {
            i4 = this.f9094e[i4];
            if (i4 == -1) {
                break;
            }
        } while (this.f9095f[i4] != i3);
        if (i4 != -1 && this.f9095f[i4] == i3) {
            return i4;
        }
        return -1;
    }

    public final void q(int i3, i iVar, float f3) {
        int n3 = n();
        m(n3, iVar, f3);
        if (i3 != -1) {
            this.f9097h[n3] = i3;
            int[] iArr = this.f9098i;
            iArr[n3] = iArr[i3];
            iArr[i3] = n3;
        } else {
            this.f9097h[n3] = -1;
            if (this.f9099j > 0) {
                this.f9098i[n3] = this.f9100k;
                this.f9100k = n3;
            } else {
                this.f9098i[n3] = -1;
            }
        }
        int i4 = this.f9098i[n3];
        if (i4 != -1) {
            this.f9097h[i4] = n3;
        }
        l(iVar, n3);
    }

    public final void r(i iVar) {
        int[] iArr;
        int i3;
        int i4 = iVar.f9071c;
        int i5 = i4 % this.f9092c;
        int[] iArr2 = this.f9093d;
        int i6 = iArr2[i5];
        if (i6 == -1) {
            return;
        }
        if (this.f9095f[i6] == i4) {
            int[] iArr3 = this.f9094e;
            iArr2[i5] = iArr3[i6];
            iArr3[i6] = -1;
            return;
        }
        while (true) {
            iArr = this.f9094e;
            i3 = iArr[i6];
            if (i3 == -1 || this.f9095f[i3] == i4) {
                break;
            } else {
                i6 = i3;
            }
        }
        if (i3 == -1 || this.f9095f[i3] != i4) {
            return;
        }
        iArr[i6] = iArr[i3];
        iArr[i3] = -1;
    }

    public String toString() {
        String str = hashCode() + " { ";
        int i3 = this.f9099j;
        for (int i4 = 0; i4 < i3; i4++) {
            i d3 = d(i4);
            if (d3 != null) {
                String str2 = str + d3 + " = " + a(i4) + " ";
                int p3 = p(d3);
                String str3 = str2 + "[p: ";
                String str4 = (this.f9097h[p3] != -1 ? str3 + this.f9102m.f9034d[this.f9095f[this.f9097h[p3]]] : str3 + "none") + ", n: ";
                str = (this.f9098i[p3] != -1 ? str4 + this.f9102m.f9034d[this.f9095f[this.f9098i[p3]]] : str4 + "none") + "]";
            }
        }
        return str + " }";
    }
}
