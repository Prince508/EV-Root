package v1;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;

/* renamed from: v1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0758b {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f9878a = true;

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f9879b = {R.attr.state_pressed};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f9880c = {R.attr.state_hovered, R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f9881d = {R.attr.state_focused};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f9882e = {R.attr.state_hovered};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f9883f = {R.attr.state_selected, R.attr.state_pressed};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f9884g = {R.attr.state_selected, R.attr.state_hovered, R.attr.state_focused};

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f9885h = {R.attr.state_selected, R.attr.state_focused};

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f9886i = {R.attr.state_selected, R.attr.state_hovered};

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f9887j = {R.attr.state_selected};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f9888k = {R.attr.state_enabled, R.attr.state_pressed};

    /* renamed from: l, reason: collision with root package name */
    public static final String f9889l = AbstractC0758b.class.getSimpleName();

    public static ColorStateList a(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f9888k, 0)) != 0) {
            Log.w(f9889l, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    public static boolean b(int[] iArr) {
        boolean z3 = false;
        boolean z4 = false;
        for (int i3 : iArr) {
            if (i3 == 16842910) {
                z3 = true;
            } else if (i3 == 16842908 || i3 == 16842919 || i3 == 16843623) {
                z4 = true;
            }
        }
        return z3 && z4;
    }
}
