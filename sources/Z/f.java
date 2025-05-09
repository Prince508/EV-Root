package Z;

import Z.b;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public double f2599a;

    /* renamed from: b, reason: collision with root package name */
    public double f2600b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2601c;

    /* renamed from: d, reason: collision with root package name */
    public double f2602d;

    /* renamed from: e, reason: collision with root package name */
    public double f2603e;

    /* renamed from: f, reason: collision with root package name */
    public double f2604f;

    /* renamed from: g, reason: collision with root package name */
    public double f2605g;

    /* renamed from: h, reason: collision with root package name */
    public double f2606h;

    /* renamed from: i, reason: collision with root package name */
    public double f2607i;

    /* renamed from: j, reason: collision with root package name */
    public final b.p f2608j;

    public f() {
        this.f2599a = Math.sqrt(1500.0d);
        this.f2600b = 0.5d;
        this.f2601c = false;
        this.f2607i = Double.MAX_VALUE;
        this.f2608j = new b.p();
    }

    public float a() {
        return (float) this.f2607i;
    }

    public final void b() {
        if (this.f2601c) {
            return;
        }
        if (this.f2607i == Double.MAX_VALUE) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        double d3 = this.f2600b;
        if (d3 > 1.0d) {
            double d4 = this.f2599a;
            this.f2604f = ((-d3) * d4) + (d4 * Math.sqrt((d3 * d3) - 1.0d));
            double d5 = this.f2600b;
            double d6 = this.f2599a;
            this.f2605g = ((-d5) * d6) - (d6 * Math.sqrt((d5 * d5) - 1.0d));
        } else if (d3 >= 0.0d && d3 < 1.0d) {
            this.f2606h = this.f2599a * Math.sqrt(1.0d - (d3 * d3));
        }
        this.f2601c = true;
    }

    public boolean c(float f3, float f4) {
        return ((double) Math.abs(f4)) < this.f2603e && ((double) Math.abs(f3 - a())) < this.f2602d;
    }

    public f d(float f3) {
        if (f3 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f2600b = f3;
        this.f2601c = false;
        return this;
    }

    public f e(float f3) {
        this.f2607i = f3;
        return this;
    }

    public f f(float f3) {
        if (f3 <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f2599a = Math.sqrt(f3);
        this.f2601c = false;
        return this;
    }

    public void g(double d3) {
        double abs = Math.abs(d3);
        this.f2602d = abs;
        this.f2603e = abs * 62.5d;
    }

    public b.p h(double d3, double d4, long j3) {
        double pow;
        double cos;
        b();
        double d5 = j3 / 1000.0d;
        double d6 = d3 - this.f2607i;
        double d7 = this.f2600b;
        if (d7 > 1.0d) {
            double d8 = this.f2605g;
            double d9 = this.f2604f;
            double d10 = d6 - (((d8 * d6) - d4) / (d8 - d9));
            double d11 = ((d6 * d8) - d4) / (d8 - d9);
            pow = (Math.pow(2.718281828459045d, d8 * d5) * d10) + (Math.pow(2.718281828459045d, this.f2604f * d5) * d11);
            double d12 = this.f2605g;
            double pow2 = d10 * d12 * Math.pow(2.718281828459045d, d12 * d5);
            double d13 = this.f2604f;
            cos = pow2 + (d11 * d13 * Math.pow(2.718281828459045d, d13 * d5));
        } else if (d7 == 1.0d) {
            double d14 = this.f2599a;
            double d15 = d4 + (d14 * d6);
            double d16 = d6 + (d15 * d5);
            pow = Math.pow(2.718281828459045d, (-d14) * d5) * d16;
            double pow3 = d16 * Math.pow(2.718281828459045d, (-this.f2599a) * d5);
            double d17 = this.f2599a;
            cos = (d15 * Math.pow(2.718281828459045d, (-d17) * d5)) + (pow3 * (-d17));
        } else {
            double d18 = 1.0d / this.f2606h;
            double d19 = this.f2599a;
            double d20 = d18 * ((d7 * d19 * d6) + d4);
            pow = Math.pow(2.718281828459045d, (-d7) * d19 * d5) * ((Math.cos(this.f2606h * d5) * d6) + (Math.sin(this.f2606h * d5) * d20));
            double d21 = this.f2599a;
            double d22 = this.f2600b;
            double pow4 = Math.pow(2.718281828459045d, (-d22) * d21 * d5);
            double d23 = this.f2606h;
            double sin = (-d23) * d6 * Math.sin(d23 * d5);
            double d24 = this.f2606h;
            cos = ((-d21) * pow * d22) + (pow4 * (sin + (d20 * d24 * Math.cos(d24 * d5))));
        }
        b.p pVar = this.f2608j;
        pVar.f2592a = (float) (pow + this.f2607i);
        pVar.f2593b = (float) cos;
        return pVar;
    }

    public f(float f3) {
        this.f2599a = Math.sqrt(1500.0d);
        this.f2600b = 0.5d;
        this.f2601c = false;
        this.f2607i = Double.MAX_VALUE;
        this.f2608j = new b.p();
        this.f2607i = f3;
    }
}
