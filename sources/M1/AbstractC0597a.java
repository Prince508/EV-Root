package m1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import u1.AbstractC0739b;

/* renamed from: m1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0597a {
    public static int a(int i3, int i4) {
        return C.a.k(i3, (Color.alpha(i3) * i4) / 255);
    }

    public static int b(Context context, int i3, int i4) {
        Integer f3 = f(context, i3);
        return f3 != null ? f3.intValue() : i4;
    }

    public static int c(Context context, int i3, String str) {
        return l(context, AbstractC0739b.e(context, i3, str));
    }

    public static int d(View view, int i3) {
        return l(view.getContext(), AbstractC0739b.f(view, i3));
    }

    public static int e(View view, int i3, int i4) {
        return b(view.getContext(), i3, i4);
    }

    public static Integer f(Context context, int i3) {
        TypedValue a3 = AbstractC0739b.a(context, i3);
        if (a3 != null) {
            return Integer.valueOf(l(context, a3));
        }
        return null;
    }

    public static ColorStateList g(Context context, int i3) {
        TypedValue a3 = AbstractC0739b.a(context, i3);
        if (a3 == null) {
            return null;
        }
        int i4 = a3.resourceId;
        if (i4 != 0) {
            return A.a.c(context, i4);
        }
        int i5 = a3.data;
        if (i5 != 0) {
            return ColorStateList.valueOf(i5);
        }
        return null;
    }

    public static boolean h(int i3) {
        return i3 != 0 && C.a.d(i3) > 0.5d;
    }

    public static int i(int i3, int i4) {
        return C.a.g(i4, i3);
    }

    public static int j(int i3, int i4, float f3) {
        return i(i3, C.a.k(i4, Math.round(Color.alpha(i4) * f3)));
    }

    public static int k(View view, int i3, int i4, float f3) {
        return j(d(view, i3), d(view, i4), f3);
    }

    public static int l(Context context, TypedValue typedValue) {
        int i3 = typedValue.resourceId;
        return i3 != 0 ? A.a.b(context, i3) : typedValue.data;
    }
}
