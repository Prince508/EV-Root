package androidx.appcompat.widget;

import K.O;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import d.AbstractC0435a;
import d.e;
import d.f;
import d.i;
import l.AbstractC0560a;
import l.C0552S;
import l.c0;

/* loaded from: classes.dex */
public class ActionBarContextView extends AbstractC0560a {

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f2899l;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f2900m;

    /* renamed from: n, reason: collision with root package name */
    public View f2901n;

    /* renamed from: o, reason: collision with root package name */
    public View f2902o;

    /* renamed from: p, reason: collision with root package name */
    public LinearLayout f2903p;

    /* renamed from: q, reason: collision with root package name */
    public TextView f2904q;

    /* renamed from: r, reason: collision with root package name */
    public TextView f2905r;

    /* renamed from: s, reason: collision with root package name */
    public int f2906s;

    /* renamed from: t, reason: collision with root package name */
    public int f2907t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2908u;

    /* renamed from: v, reason: collision with root package name */
    public int f2909v;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0435a.f6017d);
    }

    public final void d() {
        if (this.f2903p == null) {
            LayoutInflater.from(getContext()).inflate(f.f6127a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f2903p = linearLayout;
            this.f2904q = (TextView) linearLayout.findViewById(e.f6105e);
            this.f2905r = (TextView) this.f2903p.findViewById(e.f6104d);
            if (this.f2906s != 0) {
                this.f2904q.setTextAppearance(getContext(), this.f2906s);
            }
            if (this.f2907t != 0) {
                this.f2905r.setTextAppearance(getContext(), this.f2907t);
            }
        }
        this.f2904q.setText(this.f2899l);
        this.f2905r.setText(this.f2900m);
        boolean isEmpty = TextUtils.isEmpty(this.f2899l);
        boolean isEmpty2 = TextUtils.isEmpty(this.f2900m);
        this.f2905r.setVisibility(!isEmpty2 ? 0 : 8);
        this.f2903p.setVisibility((isEmpty && isEmpty2) ? 8 : 0);
        if (this.f2903p.getParent() == null) {
            addView(this.f2903p);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // l.AbstractC0560a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // l.AbstractC0560a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f2900m;
    }

    public CharSequence getTitle() {
        return this.f2899l;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f8317h;
        if (aVar != null) {
            aVar.z();
            this.f8317h.A();
        }
    }

    @Override // l.AbstractC0560a, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        boolean a3 = c0.a(this);
        int paddingRight = a3 ? (i5 - i3) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i6 - i4) - getPaddingTop()) - getPaddingBottom();
        View view = this.f2901n;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f2901n.getLayoutParams();
            int i7 = a3 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i8 = a3 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int b3 = AbstractC0560a.b(paddingRight, i7, a3);
            paddingRight = AbstractC0560a.b(b3 + c(this.f2901n, b3, paddingTop, paddingTop2, a3), i8, a3);
        }
        int i9 = paddingRight;
        LinearLayout linearLayout = this.f2903p;
        if (linearLayout != null && this.f2902o == null && linearLayout.getVisibility() != 8) {
            i9 += c(this.f2903p, i9, paddingTop, paddingTop2, a3);
        }
        View view2 = this.f2902o;
        if (view2 != null) {
            c(view2, i9, paddingTop, paddingTop2, a3);
        }
        int paddingLeft = a3 ? getPaddingLeft() : (i5 - i3) - getPaddingRight();
        ActionMenuView actionMenuView = this.f8316g;
        if (actionMenuView != null) {
            c(actionMenuView, paddingLeft, paddingTop, paddingTop2, !a3);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i3, int i4) {
        if (View.MeasureSpec.getMode(i3) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i4) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i3);
        int i5 = this.f8318i;
        if (i5 <= 0) {
            i5 = View.MeasureSpec.getSize(i4);
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i6 = i5 - paddingTop;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, Integer.MIN_VALUE);
        View view = this.f2901n;
        if (view != null) {
            int a3 = a(view, paddingLeft, makeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f2901n.getLayoutParams();
            paddingLeft = a3 - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f8316g;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = a(this.f8316g, paddingLeft, makeMeasureSpec, 0);
        }
        LinearLayout linearLayout = this.f2903p;
        if (linearLayout != null && this.f2902o == null) {
            if (this.f2908u) {
                this.f2903p.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f2903p.getMeasuredWidth();
                boolean z3 = measuredWidth <= paddingLeft;
                if (z3) {
                    paddingLeft -= measuredWidth;
                }
                this.f2903p.setVisibility(z3 ? 0 : 8);
            } else {
                paddingLeft = a(linearLayout, paddingLeft, makeMeasureSpec, 0);
            }
        }
        View view2 = this.f2902o;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i7 = layoutParams.width;
            int i8 = i7 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i7 >= 0) {
                paddingLeft = Math.min(i7, paddingLeft);
            }
            int i9 = layoutParams.height;
            int i10 = i9 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i9 >= 0) {
                i6 = Math.min(i9, i6);
            }
            this.f2902o.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i8), View.MeasureSpec.makeMeasureSpec(i6, i10));
        }
        if (this.f8318i > 0) {
            setMeasuredDimension(size, i5);
            return;
        }
        int childCount = getChildCount();
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            int measuredHeight = getChildAt(i12).getMeasuredHeight() + paddingTop;
            if (measuredHeight > i11) {
                i11 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i11);
    }

    @Override // l.AbstractC0560a, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // l.AbstractC0560a
    public void setContentHeight(int i3) {
        this.f8318i = i3;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f2902o;
        if (view2 != null) {
            removeView(view2);
        }
        this.f2902o = view;
        if (view != null && (linearLayout = this.f2903p) != null) {
            removeView(linearLayout);
            this.f2903p = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f2900m = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.f2899l = charSequence;
        d();
        O.m0(this, charSequence);
    }

    public void setTitleOptional(boolean z3) {
        if (z3 != this.f2908u) {
            requestLayout();
        }
        this.f2908u = z3;
    }

    @Override // l.AbstractC0560a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i3) {
        super.setVisibility(i3);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        C0552S t3 = C0552S.t(context, attributeSet, i.f6343w, i3, 0);
        O.n0(this, t3.g(i.f6347x));
        this.f2906s = t3.m(i.f6160B, 0);
        this.f2907t = t3.m(i.f6156A, 0);
        this.f8318i = t3.l(i.f6355z, 0);
        this.f2909v = t3.m(i.f6351y, f.f6130d);
        t3.u();
    }
}
