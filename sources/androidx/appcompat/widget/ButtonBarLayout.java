package androidx.appcompat.widget;

import K.O;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import d.e;
import d.i;

/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: e, reason: collision with root package name */
    public boolean f2964e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2965f;

    /* renamed from: g, reason: collision with root package name */
    public int f2966g;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2966g = -1;
        int[] iArr = i.f6304m0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        O.h0(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        this.f2964e = obtainStyledAttributes.getBoolean(i.f6308n0, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f2964e);
        }
    }

    private void setStacked(boolean z3) {
        if (this.f2965f != z3) {
            if (!z3 || this.f2964e) {
                this.f2965f = z3;
                setOrientation(z3 ? 1 : 0);
                setGravity(z3 ? 8388613 : 80);
                View findViewById = findViewById(e.f6123w);
                if (findViewById != null) {
                    findViewById.setVisibility(z3 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    public final int a(int i3) {
        int childCount = getChildCount();
        while (i3 < childCount) {
            if (getChildAt(i3).getVisibility() == 0) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    public final boolean b() {
        return this.f2965f;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i3, int i4) {
        int i5;
        boolean z3;
        int size = View.MeasureSpec.getSize(i3);
        int i6 = 0;
        if (this.f2964e) {
            if (size > this.f2966g && b()) {
                setStacked(false);
            }
            this.f2966g = size;
        }
        if (b() || View.MeasureSpec.getMode(i3) != 1073741824) {
            i5 = i3;
            z3 = false;
        } else {
            i5 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z3 = true;
        }
        super.onMeasure(i5, i4);
        if (this.f2964e && !b() && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z3 = true;
        }
        if (z3) {
            super.onMeasure(i3, i4);
        }
        int a3 = a(0);
        if (a3 >= 0) {
            View childAt = getChildAt(a3);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (b()) {
                int a4 = a(a3 + 1);
                if (a4 >= 0) {
                    paddingTop += getChildAt(a4).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                i6 = paddingTop;
            } else {
                i6 = paddingTop + getPaddingBottom();
            }
        }
        if (O.x(this) != i6) {
            setMinimumHeight(i6);
            if (i4 == 0) {
                super.onMeasure(i3, i4);
            }
        }
    }

    public void setAllowStacking(boolean z3) {
        if (this.f2964e != z3) {
            this.f2964e = z3;
            if (!z3 && b()) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
