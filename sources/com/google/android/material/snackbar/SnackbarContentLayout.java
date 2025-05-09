package com.google.android.material.snackbar;

import K.O;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import e1.AbstractC0464a;
import e1.c;
import e1.e;
import f1.AbstractC0474a;
import t1.d;

/* loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: e, reason: collision with root package name */
    public TextView f5510e;

    /* renamed from: f, reason: collision with root package name */
    public Button f5511f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f5512g;

    /* renamed from: h, reason: collision with root package name */
    public int f5513h;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5512g = d.g(context, AbstractC0464a.f6808z, AbstractC0474a.f7195b);
    }

    public static void a(View view, int i3, int i4) {
        if (O.Q(view)) {
            O.w0(view, O.B(view), i3, O.A(view), i4);
        } else {
            view.setPadding(view.getPaddingLeft(), i3, view.getPaddingRight(), i4);
        }
    }

    public final boolean b(int i3, int i4, int i5) {
        boolean z3;
        if (i3 != getOrientation()) {
            setOrientation(i3);
            z3 = true;
        } else {
            z3 = false;
        }
        if (this.f5510e.getPaddingTop() == i4 && this.f5510e.getPaddingBottom() == i5) {
            return z3;
        }
        a(this.f5510e, i4, i5);
        return true;
    }

    public Button getActionView() {
        return this.f5511f;
    }

    public TextView getMessageView() {
        return this.f5510e;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f5510e = (TextView) findViewById(e.f6876E);
        this.f5511f = (Button) findViewById(e.f6875D);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i3, int i4) {
        super.onMeasure(i3, i4);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(c.f6842d);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(c.f6841c);
        Layout layout = this.f5510e.getLayout();
        boolean z3 = layout != null && layout.getLineCount() > 1;
        if (!z3 || this.f5513h <= 0 || this.f5511f.getMeasuredWidth() <= this.f5513h) {
            if (!z3) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!b(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!b(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i3, i4);
    }

    public void setMaxInlineActionWidth(int i3) {
        this.f5513h = i3;
    }
}
