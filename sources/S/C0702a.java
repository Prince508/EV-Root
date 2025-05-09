package s;

import java.util.Arrays;
import s.b;

/* renamed from: s.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0702a implements b.a {

    /* renamed from: l, reason: collision with root package name */
    public static float f9013l = 0.001f;

    /* renamed from: b, reason: collision with root package name */
    public final b f9015b;

    /* renamed from: c, reason: collision with root package name */
    public final c f9016c;

    /* renamed from: a, reason: collision with root package name */
    public int f9014a = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f9017d = 8;

    /* renamed from: e, reason: collision with root package name */
    public i f9018e = null;

    /* renamed from: f, reason: collision with root package name */
    public int[] f9019f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    public int[] f9020g = new int[8];

    /* renamed from: h, reason: collision with root package name */
    public float[] f9021h = new float[8];

    /* renamed from: i, reason: collision with root package name */
    public int f9022i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f9023j = -1;

    /* renamed from: k, reason: collision with root package name */
    public boolean f9024k = false;

    public C0702a(b bVar, c cVar) {
        this.f9015b = bVar;
        this.f9016c = cVar;
    }

    @Override // s.b.a
    public float a(int i3) {
        int i4 = this.f9022i;
        for (int i5 = 0; i4 != -1 && i5 < this.f9014a; i5++) {
            if (i5 == i3) {
                return this.f9021h[i4];
            }
            i4 = this.f9020g[i4];
        }
        return 0.0f;
    }

    @Override // s.b.a
    public float b(b bVar, boolean z3) {
        float e3 = e(bVar.f9025a);
        c(bVar.f9025a, z3);
        b.a aVar = bVar.f9029e;
        int k3 = aVar.k();
        for (int i3 = 0; i3 < k3; i3++) {
            i d3 = aVar.d(i3);
            h(d3, aVar.e(d3) * e3, z3);
        }
        return e3;
    }

    @Override // s.b.a
    public final float c(i iVar, boolean z3) {
        if (this.f9018e == iVar) {
            this.f9018e = null;
        }
        int i3 = this.f9022i;
        if (i3 == -1) {
            return 0.0f;
        }
        int i4 = 0;
        int i5 = -1;
        while (i3 != -1 && i4 < this.f9014a) {
            if (this.f9019f[i3] == iVar.f9071c) {
                if (i3 == this.f9022i) {
                    this.f9022i = this.f9020g[i3];
                } else {
                    int[] iArr = this.f9020g;
                    iArr[i5] = iArr[i3];
                }
                if (z3) {
                    iVar.c(this.f9015b);
                }
                iVar.f9081m--;
                this.f9014a--;
                this.f9019f[i3] = -1;
                if (this.f9024k) {
                    this.f9023j = i3;
                }
                return this.f9021h[i3];
            }
            i4++;
            i5 = i3;
            i3 = this.f9020g[i3];
        }
        return 0.0f;
    }

    @Override // s.b.a
    public final void clear() {
        int i3 = this.f9022i;
        for (int i4 = 0; i3 != -1 && i4 < this.f9014a; i4++) {
            i iVar = this.f9016c.f9034d[this.f9019f[i3]];
            if (iVar != null) {
                iVar.c(this.f9015b);
            }
            i3 = this.f9020g[i3];
        }
        this.f9022i = -1;
        this.f9023j = -1;
        this.f9024k = false;
        this.f9014a = 0;
    }

    @Override // s.b.a
    public i d(int i3) {
        int i4 = this.f9022i;
        for (int i5 = 0; i4 != -1 && i5 < this.f9014a; i5++) {
            if (i5 == i3) {
                return this.f9016c.f9034d[this.f9019f[i4]];
            }
            i4 = this.f9020g[i4];
        }
        return null;
    }

    @Override // s.b.a
    public final float e(i iVar) {
        int i3 = this.f9022i;
        for (int i4 = 0; i3 != -1 && i4 < this.f9014a; i4++) {
            if (this.f9019f[i3] == iVar.f9071c) {
                return this.f9021h[i3];
            }
            i3 = this.f9020g[i3];
        }
        return 0.0f;
    }

    @Override // s.b.a
    public boolean f(i iVar) {
        int i3 = this.f9022i;
        if (i3 == -1) {
            return false;
        }
        for (int i4 = 0; i3 != -1 && i4 < this.f9014a; i4++) {
            if (this.f9019f[i3] == iVar.f9071c) {
                return true;
            }
            i3 = this.f9020g[i3];
        }
        return false;
    }

    @Override // s.b.a
    public void g(float f3) {
        int i3 = this.f9022i;
        for (int i4 = 0; i3 != -1 && i4 < this.f9014a; i4++) {
            float[] fArr = this.f9021h;
            fArr[i3] = fArr[i3] / f3;
            i3 = this.f9020g[i3];
        }
    }

    @Override // s.b.a
    public void h(i iVar, float f3, boolean z3) {
        float f4 = f9013l;
        if (f3 <= (-f4) || f3 >= f4) {
            int i3 = this.f9022i;
            if (i3 == -1) {
                this.f9022i = 0;
                this.f9021h[0] = f3;
                this.f9019f[0] = iVar.f9071c;
                this.f9020g[0] = -1;
                iVar.f9081m++;
                iVar.a(this.f9015b);
                this.f9014a++;
                if (this.f9024k) {
                    return;
                }
                int i4 = this.f9023j + 1;
                this.f9023j = i4;
                int[] iArr = this.f9019f;
                if (i4 >= iArr.length) {
                    this.f9024k = true;
                    this.f9023j = iArr.length - 1;
                    return;
                }
                return;
            }
            int i5 = -1;
            for (int i6 = 0; i3 != -1 && i6 < this.f9014a; i6++) {
                int i7 = this.f9019f[i3];
                int i8 = iVar.f9071c;
                if (i7 == i8) {
                    float[] fArr = this.f9021h;
                    float f5 = fArr[i3] + f3;
                    float f6 = f9013l;
                    if (f5 > (-f6) && f5 < f6) {
                        f5 = 0.0f;
                    }
                    fArr[i3] = f5;
                    if (f5 == 0.0f) {
                        if (i3 == this.f9022i) {
                            this.f9022i = this.f9020g[i3];
                        } else {
                            int[] iArr2 = this.f9020g;
                            iArr2[i5] = iArr2[i3];
                        }
                        if (z3) {
                            iVar.c(this.f9015b);
                        }
                        if (this.f9024k) {
                            this.f9023j = i3;
                        }
                        iVar.f9081m--;
                        this.f9014a--;
                        return;
                    }
                    return;
                }
                if (i7 < i8) {
                    i5 = i3;
                }
                i3 = this.f9020g[i3];
            }
            int i9 = this.f9023j;
            int i10 = i9 + 1;
            if (this.f9024k) {
                int[] iArr3 = this.f9019f;
                if (iArr3[i9] != -1) {
                    i9 = iArr3.length;
                }
            } else {
                i9 = i10;
            }
            int[] iArr4 = this.f9019f;
            if (i9 >= iArr4.length && this.f9014a < iArr4.length) {
                int i11 = 0;
                while (true) {
                    int[] iArr5 = this.f9019f;
                    if (i11 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i11] == -1) {
                        i9 = i11;
                        break;
                    }
                    i11++;
                }
            }
            int[] iArr6 = this.f9019f;
            if (i9 >= iArr6.length) {
                i9 = iArr6.length;
                int i12 = this.f9017d * 2;
                this.f9017d = i12;
                this.f9024k = false;
                this.f9023j = i9 - 1;
                this.f9021h = Arrays.copyOf(this.f9021h, i12);
                this.f9019f = Arrays.copyOf(this.f9019f, this.f9017d);
                this.f9020g = Arrays.copyOf(this.f9020g, this.f9017d);
            }
            this.f9019f[i9] = iVar.f9071c;
            this.f9021h[i9] = f3;
            if (i5 != -1) {
                int[] iArr7 = this.f9020g;
                iArr7[i9] = iArr7[i5];
                iArr7[i5] = i9;
            } else {
                this.f9020g[i9] = this.f9022i;
                this.f9022i = i9;
            }
            iVar.f9081m++;
            iVar.a(this.f9015b);
            this.f9014a++;
            if (!this.f9024k) {
                this.f9023j++;
            }
            int i13 = this.f9023j;
            int[] iArr8 = this.f9019f;
            if (i13 >= iArr8.length) {
                this.f9024k = true;
                this.f9023j = iArr8.length - 1;
            }
        }
    }

    @Override // s.b.a
    public final void i(i iVar, float f3) {
        if (f3 == 0.0f) {
            c(iVar, true);
            return;
        }
        int i3 = this.f9022i;
        if (i3 == -1) {
            this.f9022i = 0;
            this.f9021h[0] = f3;
            this.f9019f[0] = iVar.f9071c;
            this.f9020g[0] = -1;
            iVar.f9081m++;
            iVar.a(this.f9015b);
            this.f9014a++;
            if (this.f9024k) {
                return;
            }
            int i4 = this.f9023j + 1;
            this.f9023j = i4;
            int[] iArr = this.f9019f;
            if (i4 >= iArr.length) {
                this.f9024k = true;
                this.f9023j = iArr.length - 1;
                return;
            }
            return;
        }
        int i5 = -1;
        for (int i6 = 0; i3 != -1 && i6 < this.f9014a; i6++) {
            int i7 = this.f9019f[i3];
            int i8 = iVar.f9071c;
            if (i7 == i8) {
                this.f9021h[i3] = f3;
                return;
            }
            if (i7 < i8) {
                i5 = i3;
            }
            i3 = this.f9020g[i3];
        }
        int i9 = this.f9023j;
        int i10 = i9 + 1;
        if (this.f9024k) {
            int[] iArr2 = this.f9019f;
            if (iArr2[i9] != -1) {
                i9 = iArr2.length;
            }
        } else {
            i9 = i10;
        }
        int[] iArr3 = this.f9019f;
        if (i9 >= iArr3.length && this.f9014a < iArr3.length) {
            int i11 = 0;
            while (true) {
                int[] iArr4 = this.f9019f;
                if (i11 >= iArr4.length) {
                    break;
                }
                if (iArr4[i11] == -1) {
                    i9 = i11;
                    break;
                }
                i11++;
            }
        }
        int[] iArr5 = this.f9019f;
        if (i9 >= iArr5.length) {
            i9 = iArr5.length;
            int i12 = this.f9017d * 2;
            this.f9017d = i12;
            this.f9024k = false;
            this.f9023j = i9 - 1;
            this.f9021h = Arrays.copyOf(this.f9021h, i12);
            this.f9019f = Arrays.copyOf(this.f9019f, this.f9017d);
            this.f9020g = Arrays.copyOf(this.f9020g, this.f9017d);
        }
        this.f9019f[i9] = iVar.f9071c;
        this.f9021h[i9] = f3;
        if (i5 != -1) {
            int[] iArr6 = this.f9020g;
            iArr6[i9] = iArr6[i5];
            iArr6[i5] = i9;
        } else {
            this.f9020g[i9] = this.f9022i;
            this.f9022i = i9;
        }
        iVar.f9081m++;
        iVar.a(this.f9015b);
        int i13 = this.f9014a + 1;
        this.f9014a = i13;
        if (!this.f9024k) {
            this.f9023j++;
        }
        int[] iArr7 = this.f9019f;
        if (i13 >= iArr7.length) {
            this.f9024k = true;
        }
        if (this.f9023j >= iArr7.length) {
            this.f9024k = true;
            this.f9023j = iArr7.length - 1;
        }
    }

    @Override // s.b.a
    public void j() {
        int i3 = this.f9022i;
        for (int i4 = 0; i3 != -1 && i4 < this.f9014a; i4++) {
            float[] fArr = this.f9021h;
            fArr[i3] = fArr[i3] * (-1.0f);
            i3 = this.f9020g[i3];
        }
    }

    @Override // s.b.a
    public int k() {
        return this.f9014a;
    }

    public String toString() {
        int i3 = this.f9022i;
        String str = "";
        for (int i4 = 0; i3 != -1 && i4 < this.f9014a; i4++) {
            str = ((str + " -> ") + this.f9021h[i3] + " : ") + this.f9016c.f9034d[this.f9019f[i3]];
            i3 = this.f9020g[i3];
        }
        return str;
    }
}
