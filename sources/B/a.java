package B;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f3a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4b;

    /* renamed from: c, reason: collision with root package name */
    public final float f5c;

    /* renamed from: d, reason: collision with root package name */
    public final float f6d;

    /* renamed from: e, reason: collision with root package name */
    public final float f7e;

    /* renamed from: f, reason: collision with root package name */
    public final float f8f;

    /* renamed from: g, reason: collision with root package name */
    public final float f9g;

    /* renamed from: h, reason: collision with root package name */
    public final float f10h;

    /* renamed from: i, reason: collision with root package name */
    public final float f11i;

    public a(float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11) {
        this.f3a = f3;
        this.f4b = f4;
        this.f5c = f5;
        this.f6d = f6;
        this.f7e = f7;
        this.f8f = f8;
        this.f9g = f9;
        this.f10h = f10;
        this.f11i = f11;
    }

    public static a b(float f3, float f4, float f5) {
        float f6 = 100.0f;
        float f7 = 1000.0f;
        float f8 = 0.0f;
        a aVar = null;
        float f9 = 1000.0f;
        while (Math.abs(f8 - f6) > 0.01f) {
            float f10 = ((f6 - f8) / 2.0f) + f8;
            int p3 = e(f10, f4, f3).p();
            float b3 = b.b(p3);
            float abs = Math.abs(f5 - b3);
            if (abs < 0.2f) {
                a c3 = c(p3);
                float a3 = c3.a(e(c3.k(), c3.i(), f3));
                if (a3 <= 1.0f) {
                    aVar = c3;
                    f7 = abs;
                    f9 = a3;
                }
            }
            if (f7 == 0.0f && f9 == 0.0f) {
                return aVar;
            }
            if (b3 < f5) {
                f8 = f10;
            } else {
                f6 = f10;
            }
        }
        return aVar;
    }

    public static a c(int i3) {
        float[] fArr = new float[7];
        float[] fArr2 = new float[3];
        d(i3, j.f40k, fArr, fArr2);
        return new a(fArr2[0], fArr2[1], fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5], fArr[6]);
    }

    public static void d(int i3, j jVar, float[] fArr, float[] fArr2) {
        b.f(i3, fArr2);
        float[][] fArr3 = b.f12a;
        float f3 = fArr2[0];
        float[] fArr4 = fArr3[0];
        float f4 = fArr4[0] * f3;
        float f5 = fArr2[1];
        float f6 = f4 + (fArr4[1] * f5);
        float f7 = fArr2[2];
        float f8 = f6 + (fArr4[2] * f7);
        float[] fArr5 = fArr3[1];
        float f9 = (fArr5[0] * f3) + (fArr5[1] * f5) + (fArr5[2] * f7);
        float[] fArr6 = fArr3[2];
        float f10 = (f3 * fArr6[0]) + (f5 * fArr6[1]) + (f7 * fArr6[2]);
        float f11 = jVar.i()[0] * f8;
        float f12 = jVar.i()[1] * f9;
        float f13 = jVar.i()[2] * f10;
        float pow = (float) Math.pow((jVar.c() * Math.abs(f11)) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow((jVar.c() * Math.abs(f12)) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((jVar.c() * Math.abs(f13)) / 100.0d, 0.42d);
        float signum = ((Math.signum(f11) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f12) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f13) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d3 = signum3;
        float f14 = ((float) (((signum * 11.0d) + (signum2 * (-12.0d))) + d3)) / 11.0f;
        float f15 = ((float) ((signum + signum2) - (d3 * 2.0d))) / 9.0f;
        float f16 = signum2 * 20.0f;
        float f17 = (((signum * 20.0f) + f16) + (21.0f * signum3)) / 20.0f;
        float f18 = (((signum * 40.0f) + f16) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f15, f14)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f19 = (3.1415927f * atan2) / 180.0f;
        float pow4 = ((float) Math.pow((f18 * jVar.f()) / jVar.a(), jVar.b() * jVar.j())) * 100.0f;
        float b3 = (4.0f / jVar.b()) * ((float) Math.sqrt(pow4 / 100.0f)) * (jVar.a() + 4.0f) * jVar.d();
        float sqrt = ((float) Math.sqrt(pow4 / 100.0d)) * ((float) Math.pow(1.64d - Math.pow(0.29d, jVar.e()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) atan2) < 20.14d ? 360.0f + atan2 : atan2) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * jVar.g()) * jVar.h()) * ((float) Math.sqrt((f14 * f14) + (f15 * f15)))) / (f17 + 0.305f), 0.9d));
        float d4 = jVar.d() * sqrt;
        float sqrt2 = ((float) Math.sqrt((r4 * jVar.b()) / (jVar.a() + 4.0f))) * 50.0f;
        float f20 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((0.0228f * d4) + 1.0f)) * 43.85965f;
        double d5 = f19;
        float cos = ((float) Math.cos(d5)) * log;
        float sin = log * ((float) Math.sin(d5));
        fArr2[0] = atan2;
        fArr2[1] = sqrt;
        if (fArr != null) {
            fArr[0] = pow4;
            fArr[1] = b3;
            fArr[2] = d4;
            fArr[3] = sqrt2;
            fArr[4] = f20;
            fArr[5] = cos;
            fArr[6] = sin;
        }
    }

    public static a e(float f3, float f4, float f5) {
        return f(f3, f4, f5, j.f40k);
    }

    public static a f(float f3, float f4, float f5, j jVar) {
        float b3 = (4.0f / jVar.b()) * ((float) Math.sqrt(f3 / 100.0d)) * (jVar.a() + 4.0f) * jVar.d();
        float d3 = jVar.d() * f4;
        float sqrt = ((float) Math.sqrt(((f4 / ((float) Math.sqrt(r4))) * jVar.b()) / (jVar.a() + 4.0f))) * 50.0f;
        float f6 = (1.7f * f3) / ((0.007f * f3) + 1.0f);
        float log = ((float) Math.log((d3 * 0.0228d) + 1.0d)) * 43.85965f;
        double d4 = (3.1415927f * f5) / 180.0f;
        return new a(f5, f4, f3, b3, d3, sqrt, f6, ((float) Math.cos(d4)) * log, log * ((float) Math.sin(d4)));
    }

    public static int m(float f3, float f4, float f5) {
        return n(f3, f4, f5, j.f40k);
    }

    public static int n(float f3, float f4, float f5, j jVar) {
        if (f4 < 1.0d || Math.round(f5) <= 0.0d || Math.round(f5) >= 100.0d) {
            return b.a(f5);
        }
        float min = f3 < 0.0f ? 0.0f : Math.min(360.0f, f3);
        a aVar = null;
        boolean z3 = true;
        float f6 = 0.0f;
        float f7 = f4;
        while (Math.abs(f6 - f4) >= 0.4f) {
            a b3 = b(min, f7, f5);
            if (!z3) {
                if (b3 == null) {
                    f4 = f7;
                } else {
                    f6 = f7;
                    aVar = b3;
                }
                f7 = ((f4 - f6) / 2.0f) + f6;
            } else {
                if (b3 != null) {
                    return b3.o(jVar);
                }
                f7 = ((f4 - f6) / 2.0f) + f6;
                z3 = false;
            }
        }
        return aVar == null ? b.a(f5) : aVar.o(jVar);
    }

    public float a(a aVar) {
        float l3 = l() - aVar.l();
        float g3 = g() - aVar.g();
        float h3 = h() - aVar.h();
        return (float) (Math.pow(Math.sqrt((l3 * l3) + (g3 * g3) + (h3 * h3)), 0.63d) * 1.41d);
    }

    public float g() {
        return this.f10h;
    }

    public float h() {
        return this.f11i;
    }

    public float i() {
        return this.f4b;
    }

    public float j() {
        return this.f3a;
    }

    public float k() {
        return this.f5c;
    }

    public float l() {
        return this.f9g;
    }

    public int o(j jVar) {
        float pow = (float) Math.pow(((((double) i()) == 0.0d || ((double) k()) == 0.0d) ? 0.0f : i() / ((float) Math.sqrt(k() / 100.0d))) / Math.pow(1.64d - Math.pow(0.29d, jVar.e()), 0.73d), 1.1111111111111112d);
        double j3 = (j() * 3.1415927f) / 180.0f;
        float cos = ((float) (Math.cos(2.0d + j3) + 3.8d)) * 0.25f;
        float a3 = jVar.a() * ((float) Math.pow(k() / 100.0d, (1.0d / jVar.b()) / jVar.j()));
        float g3 = cos * 3846.1538f * jVar.g() * jVar.h();
        float f3 = a3 / jVar.f();
        float sin = (float) Math.sin(j3);
        float cos2 = (float) Math.cos(j3);
        float f4 = (((0.305f + f3) * 23.0f) * pow) / (((g3 * 23.0f) + ((11.0f * pow) * cos2)) + ((pow * 108.0f) * sin));
        float f5 = cos2 * f4;
        float f6 = f4 * sin;
        float f7 = f3 * 460.0f;
        float f8 = (((451.0f * f5) + f7) + (288.0f * f6)) / 1403.0f;
        float f9 = ((f7 - (891.0f * f5)) - (261.0f * f6)) / 1403.0f;
        float signum = Math.signum(f8) * (100.0f / jVar.c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f8) * 27.13d) / (400.0d - Math.abs(f8))), 2.380952380952381d));
        float signum2 = Math.signum(f9) * (100.0f / jVar.c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f9) * 27.13d) / (400.0d - Math.abs(f9))), 2.380952380952381d));
        float signum3 = Math.signum(((f7 - (f5 * 220.0f)) - (f6 * 6300.0f)) / 1403.0f) * (100.0f / jVar.c()) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(r8) * 27.13d) / (400.0d - Math.abs(r8))), 2.380952380952381d));
        float f10 = signum / jVar.i()[0];
        float f11 = signum2 / jVar.i()[1];
        float f12 = signum3 / jVar.i()[2];
        float[][] fArr = b.f13b;
        float[] fArr2 = fArr[0];
        float f13 = (fArr2[0] * f10) + (fArr2[1] * f11) + (fArr2[2] * f12);
        float[] fArr3 = fArr[1];
        float f14 = (fArr3[0] * f10) + (fArr3[1] * f11) + (fArr3[2] * f12);
        float[] fArr4 = fArr[2];
        return C.a.b(f13, f14, (f10 * fArr4[0]) + (f11 * fArr4[1]) + (f12 * fArr4[2]));
    }

    public int p() {
        return o(j.f40k);
    }
}
