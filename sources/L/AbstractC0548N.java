package l;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

/* renamed from: l.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0548N {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f8275a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f8276b = {-16842910};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f8277c = {R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f8278d = {R.attr.state_activated};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f8279e = {R.attr.state_pressed};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f8280f = {R.attr.state_checked};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f8281g = {R.attr.state_selected};

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f8282h = {-16842919, -16842908};

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f8283i = new int[0];

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f8284j = new int[1];

    public static void a(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(d.i.f6296k0);
        try {
            if (!obtainStyledAttributes.hasValue(d.i.f6300l0)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i3) {
        ColorStateList e3 = e(context, i3);
        if (e3 != null && e3.isStateful()) {
            return e3.getColorForState(f8276b, e3.getDefaultColor());
        }
        TypedValue f3 = f();
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, f3, true);
        return d(context, i3, f3.getFloat());
    }

    public static int c(Context context, int i3) {
        int[] iArr = f8284j;
        iArr[0] = i3;
        C0552S s3 = C0552S.s(context, null, iArr);
        try {
            return s3.b(0, 0);
        } finally {
            s3.u();
        }
    }

    public static int d(Context context, int i3, float f3) {
        return C.a.k(c(context, i3), Math.round(Color.alpha(r0) * f3));
    }

    public static ColorStateList e(Context context, int i3) {
        int[] iArr = f8284j;
        iArr[0] = i3;
        C0552S s3 = C0552S.s(context, null, iArr);
        try {
            return s3.c(0);
        } finally {
            s3.u();
        }
    }

    public static TypedValue f() {
        ThreadLocal threadLocal = f8275a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }
}
