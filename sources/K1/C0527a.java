package k1;

/* renamed from: k1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0527a {

    /* renamed from: a, reason: collision with root package name */
    public final int f8128a;

    /* renamed from: b, reason: collision with root package name */
    public float f8129b;

    /* renamed from: c, reason: collision with root package name */
    public int f8130c;

    /* renamed from: d, reason: collision with root package name */
    public int f8131d;

    /* renamed from: e, reason: collision with root package name */
    public float f8132e;

    /* renamed from: f, reason: collision with root package name */
    public float f8133f;

    /* renamed from: g, reason: collision with root package name */
    public final int f8134g;

    /* renamed from: h, reason: collision with root package name */
    public final float f8135h;

    public C0527a(int i3, float f3, float f4, float f5, int i4, float f6, int i5, float f7, int i6, float f8) {
        this.f8128a = i3;
        this.f8129b = F.a.a(f3, f4, f5);
        this.f8130c = i4;
        this.f8132e = f6;
        this.f8131d = i5;
        this.f8133f = f7;
        this.f8134g = i6;
        d(f8, f4, f5, f7);
        this.f8135h = b(f7);
    }

    public static C0527a c(float f3, float f4, float f5, float f6, int[] iArr, float f7, int[] iArr2, float f8, int[] iArr3) {
        C0527a c0527a = null;
        int i3 = 1;
        for (int i4 : iArr3) {
            int length = iArr2.length;
            int i5 = 0;
            while (i5 < length) {
                int i6 = iArr2[i5];
                int length2 = iArr.length;
                int i7 = 0;
                while (i7 < length2) {
                    int i8 = length;
                    int i9 = i5;
                    int i10 = i3;
                    int i11 = length2;
                    int i12 = i7;
                    C0527a c0527a2 = new C0527a(i10, f4, f5, f6, iArr[i7], f7, i6, f8, i4, f3);
                    if (c0527a == null || c0527a2.f8135h < c0527a.f8135h) {
                        if (c0527a2.f8135h == 0.0f) {
                            return c0527a2;
                        }
                        c0527a = c0527a2;
                    }
                    int i13 = i10 + 1;
                    i7 = i12 + 1;
                    i5 = i9;
                    i3 = i13;
                    length = i8;
                    length2 = i11;
                }
                i5++;
                i3 = i3;
                length = length;
            }
        }
        return c0527a;
    }

    public final float a(float f3, int i3, float f4, int i4, int i5) {
        if (i3 <= 0) {
            f4 = 0.0f;
        }
        float f5 = i4 / 2.0f;
        return (f3 - ((i3 + f5) * f4)) / (i5 + f5);
    }

    public final float b(float f3) {
        if (g()) {
            return Math.abs(f3 - this.f8133f) * this.f8128a;
        }
        return Float.MAX_VALUE;
    }

    public final void d(float f3, float f4, float f5, float f6) {
        float f7 = f3 - f();
        int i3 = this.f8130c;
        if (i3 > 0 && f7 > 0.0f) {
            float f8 = this.f8129b;
            this.f8129b = f8 + Math.min(f7 / i3, f5 - f8);
        } else if (i3 > 0 && f7 < 0.0f) {
            float f9 = this.f8129b;
            this.f8129b = f9 + Math.max(f7 / i3, f4 - f9);
        }
        int i4 = this.f8130c;
        float f10 = i4 > 0 ? this.f8129b : 0.0f;
        this.f8129b = f10;
        float a3 = a(f3, i4, f10, this.f8131d, this.f8134g);
        this.f8133f = a3;
        float f11 = (this.f8129b + a3) / 2.0f;
        this.f8132e = f11;
        int i5 = this.f8131d;
        if (i5 <= 0 || a3 == f6) {
            return;
        }
        float f12 = (f6 - a3) * this.f8134g;
        float min = Math.min(Math.abs(f12), f11 * 0.1f * i5);
        if (f12 > 0.0f) {
            this.f8132e -= min / this.f8131d;
            this.f8133f += min / this.f8134g;
        } else {
            this.f8132e += min / this.f8131d;
            this.f8133f -= min / this.f8134g;
        }
    }

    public int e() {
        return this.f8130c + this.f8131d + this.f8134g;
    }

    public final float f() {
        return (this.f8133f * this.f8134g) + (this.f8132e * this.f8131d) + (this.f8129b * this.f8130c);
    }

    public final boolean g() {
        int i3 = this.f8134g;
        if (i3 <= 0 || this.f8130c <= 0 || this.f8131d <= 0) {
            return i3 <= 0 || this.f8130c <= 0 || this.f8133f > this.f8129b;
        }
        float f3 = this.f8133f;
        float f4 = this.f8132e;
        return f3 > f4 && f4 > this.f8129b;
    }

    public String toString() {
        return "Arrangement [priority=" + this.f8128a + ", smallCount=" + this.f8130c + ", smallSize=" + this.f8129b + ", mediumCount=" + this.f8131d + ", mediumSize=" + this.f8132e + ", largeCount=" + this.f8134g + ", largeSize=" + this.f8133f + ", cost=" + this.f8135h + "]";
    }
}
