package C;

import android.graphics.Color;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f126a = new ThreadLocal();

    public static void a(int i3, int i4, int i5, double[] dArr) {
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d3 = i3 / 255.0d;
        double pow = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
        double d4 = i4 / 255.0d;
        double pow2 = d4 < 0.04045d ? d4 / 12.92d : Math.pow((d4 + 0.055d) / 1.055d, 2.4d);
        double d5 = i5 / 255.0d;
        double pow3 = d5 < 0.04045d ? d5 / 12.92d : Math.pow((d5 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.4124d * pow) + (0.3576d * pow2) + (0.1805d * pow3)) * 100.0d;
        dArr[1] = ((0.2126d * pow) + (0.7152d * pow2) + (0.0722d * pow3)) * 100.0d;
        dArr[2] = ((pow * 0.0193d) + (pow2 * 0.1192d) + (pow3 * 0.9505d)) * 100.0d;
    }

    public static int b(double d3, double d4, double d5) {
        double d6 = (((3.2406d * d3) + ((-1.5372d) * d4)) + ((-0.4986d) * d5)) / 100.0d;
        double d7 = ((((-0.9689d) * d3) + (1.8758d * d4)) + (0.0415d * d5)) / 100.0d;
        double d8 = (((0.0557d * d3) + ((-0.204d) * d4)) + (1.057d * d5)) / 100.0d;
        return Color.rgb(i((int) Math.round((d6 > 0.0031308d ? (Math.pow(d6, 0.4166666666666667d) * 1.055d) - 0.055d : d6 * 12.92d) * 255.0d), 0, 255), i((int) Math.round((d7 > 0.0031308d ? (Math.pow(d7, 0.4166666666666667d) * 1.055d) - 0.055d : d7 * 12.92d) * 255.0d), 0, 255), i((int) Math.round((d8 > 0.0031308d ? (Math.pow(d8, 0.4166666666666667d) * 1.055d) - 0.055d : d8 * 12.92d) * 255.0d), 0, 255));
    }

    public static int c(int i3, int i4, float f3) {
        float f4 = 1.0f - f3;
        return Color.argb((int) ((Color.alpha(i3) * f4) + (Color.alpha(i4) * f3)), (int) ((Color.red(i3) * f4) + (Color.red(i4) * f3)), (int) ((Color.green(i3) * f4) + (Color.green(i4) * f3)), (int) ((Color.blue(i3) * f4) + (Color.blue(i4) * f3)));
    }

    public static double d(int i3) {
        double[] j3 = j();
        e(i3, j3);
        return j3[1] / 100.0d;
    }

    public static void e(int i3, double[] dArr) {
        a(Color.red(i3), Color.green(i3), Color.blue(i3), dArr);
    }

    public static int f(int i3, int i4) {
        return 255 - (((255 - i4) * (255 - i3)) / 255);
    }

    public static int g(int i3, int i4) {
        int alpha = Color.alpha(i4);
        int alpha2 = Color.alpha(i3);
        int f3 = f(alpha2, alpha);
        return Color.argb(f3, h(Color.red(i3), alpha2, Color.red(i4), alpha, f3), h(Color.green(i3), alpha2, Color.green(i4), alpha, f3), h(Color.blue(i3), alpha2, Color.blue(i4), alpha, f3));
    }

    public static int h(int i3, int i4, int i5, int i6, int i7) {
        if (i7 == 0) {
            return 0;
        }
        return (((i3 * 255) * i4) + ((i5 * i6) * (255 - i4))) / (i7 * 255);
    }

    public static int i(int i3, int i4, int i5) {
        return i3 < i4 ? i4 : Math.min(i3, i5);
    }

    public static double[] j() {
        ThreadLocal threadLocal = f126a;
        double[] dArr = (double[]) threadLocal.get();
        if (dArr != null) {
            return dArr;
        }
        double[] dArr2 = new double[3];
        threadLocal.set(dArr2);
        return dArr2;
    }

    public static int k(int i3, int i4) {
        if (i4 < 0 || i4 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i3 & 16777215) | (i4 << 24);
    }
}
