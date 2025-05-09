package r1;

import K.W;
import android.R;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import m1.AbstractC0597a;

/* renamed from: r1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0680c {
    public static void a(Window window, boolean z3, Integer num, Integer num2) {
        boolean z4 = num == null || num.intValue() == 0;
        boolean z5 = num2 == null || num2.intValue() == 0;
        if (z4 || z5) {
            int b3 = AbstractC0597a.b(window.getContext(), R.attr.colorBackground, -16777216);
            if (z4) {
                num = Integer.valueOf(b3);
            }
            if (z5) {
                num2 = Integer.valueOf(b3);
            }
        }
        W.b(window, !z3);
        int c3 = c(window.getContext(), z3);
        int b4 = b(window.getContext(), z3);
        window.setStatusBarColor(c3);
        window.setNavigationBarColor(b4);
        f(window, d(c3, AbstractC0597a.h(num.intValue())));
        e(window, d(b4, AbstractC0597a.h(num2.intValue())));
    }

    public static int b(Context context, boolean z3) {
        if (z3 && Build.VERSION.SDK_INT < 27) {
            return C.a.k(AbstractC0597a.b(context, R.attr.navigationBarColor, -16777216), 128);
        }
        if (z3) {
            return 0;
        }
        return AbstractC0597a.b(context, R.attr.navigationBarColor, -16777216);
    }

    public static int c(Context context, boolean z3) {
        if (z3) {
            return 0;
        }
        return AbstractC0597a.b(context, R.attr.statusBarColor, -16777216);
    }

    public static boolean d(int i3, boolean z3) {
        if (AbstractC0597a.h(i3)) {
            return true;
        }
        return i3 == 0 && z3;
    }

    public static void e(Window window, boolean z3) {
        W.a(window, window.getDecorView()).a(z3);
    }

    public static void f(Window window, boolean z3) {
        W.a(window, window.getDecorView()).b(z3);
    }
}
