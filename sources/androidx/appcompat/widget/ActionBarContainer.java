package androidx.appcompat.widget;

import K.O;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import d.e;
import d.i;
import l.C0561b;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: e, reason: collision with root package name */
    public boolean f2889e;

    /* renamed from: f, reason: collision with root package name */
    public View f2890f;

    /* renamed from: g, reason: collision with root package name */
    public View f2891g;

    /* renamed from: h, reason: collision with root package name */
    public View f2892h;

    /* renamed from: i, reason: collision with root package name */
    public Drawable f2893i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f2894j;

    /* renamed from: k, reason: collision with root package name */
    public Drawable f2895k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2896l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2897m;

    /* renamed from: n, reason: collision with root package name */
    public int f2898n;

    public static class a {
        public static void a(ActionBarContainer actionBarContainer) {
            actionBarContainer.invalidateOutline();
        }
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        O.n0(this, new C0561b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f6255a);
        this.f2893i = obtainStyledAttributes.getDrawable(i.f6259b);
        this.f2894j = obtainStyledAttributes.getDrawable(i.f6267d);
        this.f2898n = obtainStyledAttributes.getDimensionPixelSize(i.f6287i, -1);
        boolean z3 = true;
        if (getId() == e.f6124x) {
            this.f2896l = true;
            this.f2895k = obtainStyledAttributes.getDrawable(i.f6263c);
        }
        obtainStyledAttributes.recycle();
        if (!this.f2896l ? this.f2893i != null || this.f2894j != null : this.f2895k != null) {
            z3 = false;
        }
        setWillNotDraw(z3);
    }

    public final int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public final boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f2893i;
        if (drawable != null && drawable.isStateful()) {
            this.f2893i.setState(getDrawableState());
        }
        Drawable drawable2 = this.f2894j;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f2894j.setState(getDrawableState());
        }
        Drawable drawable3 = this.f2895k;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f2895k.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f2890f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f2893i;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f2894j;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f2895k;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f2891g = findViewById(e.f6101a);
        this.f2892h = findViewById(e.f6106f);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f2889e || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        Drawable drawable;
        super.onLayout(z3, i3, i4, i5, i6);
        View view = this.f2890f;
        boolean z4 = true;
        boolean z5 = false;
        boolean z6 = (view == null || view.getVisibility() == 8) ? false : true;
        if (view != null && view.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int measuredHeight2 = measuredHeight - view.getMeasuredHeight();
            int i7 = layoutParams.bottomMargin;
            view.layout(i3, measuredHeight2 - i7, i5, measuredHeight - i7);
        }
        if (this.f2896l) {
            Drawable drawable2 = this.f2895k;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            z4 = z5;
        } else {
            if (this.f2893i != null) {
                if (this.f2891g.getVisibility() == 0) {
                    this.f2893i.setBounds(this.f2891g.getLeft(), this.f2891g.getTop(), this.f2891g.getRight(), this.f2891g.getBottom());
                } else {
                    View view2 = this.f2892h;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.f2893i.setBounds(0, 0, 0, 0);
                    } else {
                        this.f2893i.setBounds(this.f2892h.getLeft(), this.f2892h.getTop(), this.f2892h.getRight(), this.f2892h.getBottom());
                    }
                }
                z5 = true;
            }
            this.f2897m = z6;
            if (z6 && (drawable = this.f2894j) != null) {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            z4 = z5;
        }
        if (z4) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i3, int i4) {
        int i5;
        if (this.f2891g == null && View.MeasureSpec.getMode(i4) == Integer.MIN_VALUE && (i5 = this.f2898n) >= 0) {
            i4 = View.MeasureSpec.makeMeasureSpec(Math.min(i5, View.MeasureSpec.getSize(i4)), Integer.MIN_VALUE);
        }
        super.onMeasure(i3, i4);
        if (this.f2891g == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i4);
        View view = this.f2890f;
        if (view == null || view.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min((!b(this.f2891g) ? a(this.f2891g) : !b(this.f2892h) ? a(this.f2892h) : 0) + a(this.f2890f), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i4) : Integer.MAX_VALUE));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f2893i;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f2893i);
        }
        this.f2893i = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f2891g;
            if (view != null) {
                this.f2893i.setBounds(view.getLeft(), this.f2891g.getTop(), this.f2891g.getRight(), this.f2891g.getBottom());
            }
        }
        boolean z3 = false;
        if (!this.f2896l ? !(this.f2893i != null || this.f2894j != null) : this.f2895k == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        a.a(this);
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f2895k;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f2895k);
        }
        this.f2895k = drawable;
        boolean z3 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f2896l && (drawable2 = this.f2895k) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f2896l ? !(this.f2893i != null || this.f2894j != null) : this.f2895k == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        a.a(this);
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f2894j;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f2894j);
        }
        this.f2894j = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f2897m && (drawable2 = this.f2894j) != null) {
                drawable2.setBounds(this.f2890f.getLeft(), this.f2890f.getTop(), this.f2890f.getRight(), this.f2890f.getBottom());
            }
        }
        boolean z3 = false;
        if (!this.f2896l ? !(this.f2893i != null || this.f2894j != null) : this.f2895k == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        a.a(this);
    }

    public void setTabContainer(c cVar) {
        View view = this.f2890f;
        if (view != null) {
            removeView(view);
        }
        this.f2890f = cVar;
    }

    public void setTransitioning(boolean z3) {
        this.f2889e = z3;
        setDescendantFocusability(z3 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i3) {
        super.setVisibility(i3);
        boolean z3 = i3 == 0;
        Drawable drawable = this.f2893i;
        if (drawable != null) {
            drawable.setVisible(z3, false);
        }
        Drawable drawable2 = this.f2894j;
        if (drawable2 != null) {
            drawable2.setVisible(z3, false);
        }
        Drawable drawable3 = this.f2895k;
        if (drawable3 != null) {
            drawable3.setVisible(z3, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        if (drawable == this.f2893i && !this.f2896l) {
            return true;
        }
        if (drawable == this.f2894j && this.f2897m) {
            return true;
        }
        return (drawable == this.f2895k && this.f2896l) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i3) {
        if (i3 != 0) {
            return super.startActionModeForChild(view, callback, i3);
        }
        return null;
    }
}
