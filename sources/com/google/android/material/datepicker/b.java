package com.google.android.material.datepicker;

import K.O;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import u1.AbstractC0740c;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f5307a;

    /* renamed from: b, reason: collision with root package name */
    public final ColorStateList f5308b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorStateList f5309c;

    /* renamed from: d, reason: collision with root package name */
    public final ColorStateList f5310d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5311e;

    /* renamed from: f, reason: collision with root package name */
    public final x1.k f5312f;

    public b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i3, x1.k kVar, Rect rect) {
        J.g.d(rect.left);
        J.g.d(rect.top);
        J.g.d(rect.right);
        J.g.d(rect.bottom);
        this.f5307a = rect;
        this.f5308b = colorStateList2;
        this.f5309c = colorStateList;
        this.f5310d = colorStateList3;
        this.f5311e = i3;
        this.f5312f = kVar;
    }

    public static b a(Context context, int i3) {
        J.g.b(i3 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i3, e1.j.f6976D2);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(e1.j.f6980E2, 0), obtainStyledAttributes.getDimensionPixelOffset(e1.j.f6988G2, 0), obtainStyledAttributes.getDimensionPixelOffset(e1.j.f6984F2, 0), obtainStyledAttributes.getDimensionPixelOffset(e1.j.f6992H2, 0));
        ColorStateList a3 = AbstractC0740c.a(context, obtainStyledAttributes, e1.j.f6996I2);
        ColorStateList a4 = AbstractC0740c.a(context, obtainStyledAttributes, e1.j.f7016N2);
        ColorStateList a5 = AbstractC0740c.a(context, obtainStyledAttributes, e1.j.f7008L2);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(e1.j.f7012M2, 0);
        x1.k m3 = x1.k.b(context, obtainStyledAttributes.getResourceId(e1.j.f7000J2, 0), obtainStyledAttributes.getResourceId(e1.j.f7004K2, 0)).m();
        obtainStyledAttributes.recycle();
        return new b(a3, a4, a5, dimensionPixelSize, m3, rect);
    }

    public void b(TextView textView) {
        c(textView, null, null);
    }

    public void c(TextView textView, ColorStateList colorStateList, ColorStateList colorStateList2) {
        x1.g gVar = new x1.g();
        x1.g gVar2 = new x1.g();
        gVar.setShapeAppearanceModel(this.f5312f);
        gVar2.setShapeAppearanceModel(this.f5312f);
        if (colorStateList == null) {
            colorStateList = this.f5309c;
        }
        gVar.T(colorStateList);
        gVar.Y(this.f5311e, this.f5310d);
        if (colorStateList2 == null) {
            colorStateList2 = this.f5308b;
        }
        textView.setTextColor(colorStateList2);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f5308b.withAlpha(30), gVar, gVar2);
        Rect rect = this.f5307a;
        O.n0(textView, new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
