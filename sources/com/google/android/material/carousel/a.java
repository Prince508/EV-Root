package com.google.android.material.carousel;

import android.content.Context;
import com.google.android.material.carousel.b;
import k1.AbstractC0532f;
import k1.C0527a;

/* loaded from: classes.dex */
public abstract class a {
    public static float a(float f3, float f4, int i3) {
        return f3 + (Math.max(0, i3 - 1) * f4);
    }

    public static float b(float f3, float f4, int i3) {
        return i3 > 0 ? f3 + (f4 / 2.0f) : f3;
    }

    public static b c(Context context, float f3, float f4, C0527a c0527a) {
        float f5;
        float f6;
        float min = Math.min(f(context) + f3, c0527a.f8133f);
        float f7 = min / 2.0f;
        float f8 = 0.0f - f7;
        float b3 = b(0.0f, c0527a.f8129b, c0527a.f8130c);
        float j3 = j(0.0f, a(b3, c0527a.f8129b, (int) Math.floor(c0527a.f8130c / 2.0f)), c0527a.f8129b, c0527a.f8130c);
        float b4 = b(j3, c0527a.f8132e, c0527a.f8131d);
        float j4 = j(j3, a(b4, c0527a.f8132e, (int) Math.floor(c0527a.f8131d / 2.0f)), c0527a.f8132e, c0527a.f8131d);
        float b5 = b(j4, c0527a.f8133f, c0527a.f8134g);
        float j5 = j(j4, a(b5, c0527a.f8133f, c0527a.f8134g), c0527a.f8133f, c0527a.f8134g);
        float b6 = b(j5, c0527a.f8132e, c0527a.f8131d);
        float b7 = b(j(j5, a(b6, c0527a.f8132e, (int) Math.ceil(c0527a.f8131d / 2.0f)), c0527a.f8132e, c0527a.f8131d), c0527a.f8129b, c0527a.f8130c);
        float f9 = f7 + f4;
        float b8 = AbstractC0532f.b(min, c0527a.f8133f, f3);
        float b9 = AbstractC0532f.b(c0527a.f8129b, c0527a.f8133f, f3);
        float b10 = AbstractC0532f.b(c0527a.f8132e, c0527a.f8133f, f3);
        b.C0106b a3 = new b.C0106b(c0527a.f8133f, f4).a(f8, b8, min);
        if (c0527a.f8130c > 0) {
            f5 = 2.0f;
            f6 = f9;
            a3.g(b3, b9, c0527a.f8129b, (int) Math.floor(r7 / 2.0f));
        } else {
            f5 = 2.0f;
            f6 = f9;
        }
        if (c0527a.f8131d > 0) {
            a3.g(b4, b10, c0527a.f8132e, (int) Math.floor(r4 / f5));
        }
        a3.h(b5, 0.0f, c0527a.f8133f, c0527a.f8134g, true);
        if (c0527a.f8131d > 0) {
            a3.g(b6, b10, c0527a.f8132e, (int) Math.ceil(r4 / f5));
        }
        if (c0527a.f8130c > 0) {
            a3.g(b7, b9, c0527a.f8129b, (int) Math.ceil(r0 / f5));
        }
        a3.a(f6, b8, min);
        return a3.i();
    }

    public static b d(Context context, float f3, float f4, C0527a c0527a, int i3) {
        return i3 == 1 ? c(context, f3, f4, c0527a) : e(context, f3, f4, c0527a);
    }

    public static b e(Context context, float f3, float f4, C0527a c0527a) {
        float min = Math.min(f(context) + f3, c0527a.f8133f);
        float f5 = min / 2.0f;
        float f6 = 0.0f - f5;
        float b3 = b(0.0f, c0527a.f8133f, c0527a.f8134g);
        float j3 = j(0.0f, a(b3, c0527a.f8133f, c0527a.f8134g), c0527a.f8133f, c0527a.f8134g);
        float b4 = b(j3, c0527a.f8132e, c0527a.f8131d);
        float b5 = b(j(j3, b4, c0527a.f8132e, c0527a.f8131d), c0527a.f8129b, c0527a.f8130c);
        float f7 = f5 + f4;
        float b6 = AbstractC0532f.b(min, c0527a.f8133f, f3);
        float b7 = AbstractC0532f.b(c0527a.f8129b, c0527a.f8133f, f3);
        float b8 = AbstractC0532f.b(c0527a.f8132e, c0527a.f8133f, f3);
        b.C0106b h3 = new b.C0106b(c0527a.f8133f, f4).a(f6, b6, min).h(b3, 0.0f, c0527a.f8133f, c0527a.f8134g, true);
        if (c0527a.f8131d > 0) {
            h3.b(b4, b8, c0527a.f8132e);
        }
        int i3 = c0527a.f8130c;
        if (i3 > 0) {
            h3.g(b5, b7, c0527a.f8129b, i3);
        }
        h3.a(f7, b6, min);
        return h3.i();
    }

    public static float f(Context context) {
        return context.getResources().getDimension(e1.c.f6850l);
    }

    public static float g(Context context) {
        return context.getResources().getDimension(e1.c.f6851m);
    }

    public static float h(Context context) {
        return context.getResources().getDimension(e1.c.f6852n);
    }

    public static int i(int[] iArr) {
        int i3 = Integer.MIN_VALUE;
        for (int i4 : iArr) {
            if (i4 > i3) {
                i3 = i4;
            }
        }
        return i3;
    }

    public static float j(float f3, float f4, float f5, int i3) {
        return i3 > 0 ? f4 + (f5 / 2.0f) : f3;
    }
}
