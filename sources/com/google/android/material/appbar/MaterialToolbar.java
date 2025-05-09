package com.google.android.material.appbar;

import D.a;
import K.O;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.widget.Toolbar;
import e1.AbstractC0464a;
import e1.i;
import o1.AbstractC0648d;
import r1.l;
import x1.g;
import x1.h;

/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: f0, reason: collision with root package name */
    public static final int f4986f0 = i.f6960l;

    /* renamed from: g0, reason: collision with root package name */
    public static final ImageView.ScaleType[] f4987g0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: a0, reason: collision with root package name */
    public Integer f4988a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f4989b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f4990c0;

    /* renamed from: d0, reason: collision with root package name */
    public ImageView.ScaleType f4991d0;

    /* renamed from: e0, reason: collision with root package name */
    public Boolean f4992e0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0464a.f6782G);
    }

    public final Pair M(TextView textView, TextView textView2) {
        int measuredWidth = getMeasuredWidth();
        int i3 = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                if (childAt.getRight() < i3 && childAt.getRight() > paddingLeft) {
                    paddingLeft = childAt.getRight();
                }
                if (childAt.getLeft() > i3 && childAt.getLeft() < paddingRight) {
                    paddingRight = childAt.getLeft();
                }
            }
        }
        return new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
    }

    public final void N(Context context) {
        Drawable background = getBackground();
        ColorStateList valueOf = background == null ? ColorStateList.valueOf(0) : AbstractC0648d.a(background);
        if (valueOf != null) {
            g gVar = new g();
            gVar.T(valueOf);
            gVar.J(context);
            gVar.S(O.r(this));
            O.n0(this, gVar);
        }
    }

    public final void O(View view, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i3 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i4 = measuredWidth2 + i3;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i3, 0), Math.max(i4 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i3 += max;
            i4 -= max;
            view.measure(View.MeasureSpec.makeMeasureSpec(i4 - i3, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i3, view.getTop(), i4, view.getBottom());
    }

    public final void P() {
        if (this.f4989b0 || this.f4990c0) {
            TextView e3 = l.e(this);
            TextView c3 = l.c(this);
            if (e3 == null && c3 == null) {
                return;
            }
            Pair M3 = M(e3, c3);
            if (this.f4989b0 && e3 != null) {
                O(e3, M3);
            }
            if (!this.f4990c0 || c3 == null) {
                return;
            }
            O(c3, M3);
        }
    }

    public final Drawable Q(Drawable drawable) {
        if (drawable == null || this.f4988a0 == null) {
            return drawable;
        }
        Drawable l3 = a.l(drawable.mutate());
        a.h(l3, this.f4988a0.intValue());
        return l3;
    }

    public final void R() {
        ImageView b3 = l.b(this);
        if (b3 != null) {
            Boolean bool = this.f4992e0;
            if (bool != null) {
                b3.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f4991d0;
            if (scaleType != null) {
                b3.setScaleType(scaleType);
            }
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f4991d0;
    }

    public Integer getNavigationIconTint() {
        return this.f4988a0;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.e(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        super.onLayout(z3, i3, i4, i5, i6);
        P();
        R();
    }

    @Override // android.view.View
    public void setElevation(float f3) {
        super.setElevation(f3);
        h.d(this, f3);
    }

    public void setLogoAdjustViewBounds(boolean z3) {
        Boolean bool = this.f4992e0;
        if (bool == null || bool.booleanValue() != z3) {
            this.f4992e0 = Boolean.valueOf(z3);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f4991d0 != scaleType) {
            this.f4991d0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(Q(drawable));
    }

    public void setNavigationIconTint(int i3) {
        this.f4988a0 = Integer.valueOf(i3);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z3) {
        if (this.f4990c0 != z3) {
            this.f4990c0 = z3;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z3) {
        if (this.f4989b0 != z3) {
            this.f4989b0 = z3;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void u(int i3) {
        Menu menu = getMenu();
        boolean z3 = menu instanceof d;
        if (z3) {
            ((d) menu).V();
        }
        super.u(i3);
        if (z3) {
            ((d) menu).U();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MaterialToolbar(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = com.google.android.material.appbar.MaterialToolbar.f4986f0
            android.content.Context r7 = A1.a.c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            android.content.Context r0 = r6.getContext()
            int[] r2 = e1.j.b3
            r7 = 0
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = r1.k.h(r0, r1, r2, r3, r4, r5)
            int r9 = e1.j.e3
            boolean r1 = r8.hasValue(r9)
            r2 = -1
            if (r1 == 0) goto L28
            int r9 = r8.getColor(r9, r2)
            r6.setNavigationIconTint(r9)
        L28:
            int r9 = e1.j.g3
            boolean r9 = r8.getBoolean(r9, r7)
            r6.f4989b0 = r9
            int r9 = e1.j.f3
            boolean r9 = r8.getBoolean(r9, r7)
            r6.f4990c0 = r9
            int r9 = e1.j.d3
            int r9 = r8.getInt(r9, r2)
            if (r9 < 0) goto L49
            android.widget.ImageView$ScaleType[] r1 = com.google.android.material.appbar.MaterialToolbar.f4987g0
            int r2 = r1.length
            if (r9 >= r2) goto L49
            r9 = r1[r9]
            r6.f4991d0 = r9
        L49:
            int r9 = e1.j.c3
            boolean r1 = r8.hasValue(r9)
            if (r1 == 0) goto L5b
            boolean r7 = r8.getBoolean(r9, r7)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r6.f4992e0 = r7
        L5b:
            r8.recycle()
            r6.N(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.MaterialToolbar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
