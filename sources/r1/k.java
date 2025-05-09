package r1;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import e1.AbstractC0464a;
import l.C0552S;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f8983a = {AbstractC0464a.f6788f};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f8984b = {AbstractC0464a.f6789g};

    public static void a(Context context) {
        e(context, f8983a, "Theme.AppCompat");
    }

    public static void b(Context context, AttributeSet attributeSet, int i3, int i4) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e1.j.j6, i3, i4);
        boolean z3 = obtainStyledAttributes.getBoolean(e1.j.l6, false);
        obtainStyledAttributes.recycle();
        if (z3) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(AbstractC0464a.f6795m, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                c(context);
            }
        }
        a(context);
    }

    public static void c(Context context) {
        e(context, f8984b, "Theme.MaterialComponents");
    }

    public static void d(Context context, AttributeSet attributeSet, int[] iArr, int i3, int i4, int... iArr2) {
        boolean z3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e1.j.j6, i3, i4);
        if (!obtainStyledAttributes.getBoolean(e1.j.m6, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 == null || iArr2.length == 0) {
            z3 = obtainStyledAttributes.getResourceId(e1.j.k6, -1) != -1;
        } else {
            z3 = f(context, attributeSet, iArr, i3, i4, iArr2);
        }
        obtainStyledAttributes.recycle();
        if (!z3) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    public static void e(Context context, int[] iArr, String str) {
        if (g(context, iArr)) {
            return;
        }
        throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
    }

    public static boolean f(Context context, AttributeSet attributeSet, int[] iArr, int i3, int i4, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i3, i4);
        for (int i5 : iArr2) {
            if (obtainStyledAttributes.getResourceId(i5, -1) == -1) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    public static boolean g(Context context, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i3 = 0; i3 < iArr.length; i3++) {
            if (!obtainStyledAttributes.hasValue(i3)) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    public static TypedArray h(Context context, AttributeSet attributeSet, int[] iArr, int i3, int i4, int... iArr2) {
        b(context, attributeSet, i3, i4);
        d(context, attributeSet, iArr, i3, i4, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i3, i4);
    }

    public static C0552S i(Context context, AttributeSet attributeSet, int[] iArr, int i3, int i4, int... iArr2) {
        b(context, attributeSet, i3, i4);
        d(context, attributeSet, iArr, i3, i4, iArr2);
        return C0552S.t(context, attributeSet, iArr, i3, i4);
    }
}
