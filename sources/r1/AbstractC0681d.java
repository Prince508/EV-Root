package r1;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;

/* renamed from: r1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0681d extends androidx.appcompat.widget.b {

    /* renamed from: t, reason: collision with root package name */
    public Drawable f8955t;

    /* renamed from: u, reason: collision with root package name */
    public final Rect f8956u;

    /* renamed from: v, reason: collision with root package name */
    public final Rect f8957v;

    /* renamed from: w, reason: collision with root package name */
    public int f8958w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f8959x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f8960y;

    public AbstractC0681d(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        this.f8956u = new Rect();
        this.f8957v = new Rect();
        this.f8958w = 119;
        this.f8959x = true;
        this.f8960y = false;
        TypedArray h3 = k.h(context, attributeSet, e1.j.f7150w1, i3, 0, new int[0]);
        this.f8958w = h3.getInt(e1.j.f7158y1, this.f8958w);
        Drawable drawable = h3.getDrawable(e1.j.f7154x1);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f8959x = h3.getBoolean(e1.j.f7162z1, true);
        h3.recycle();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f8955t;
        if (drawable != null) {
            if (this.f8960y) {
                this.f8960y = false;
                Rect rect = this.f8956u;
                Rect rect2 = this.f8957v;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f8959x) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f8958w, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public void drawableHotspotChanged(float f3, float f4) {
        super.drawableHotspotChanged(f3, f4);
        Drawable drawable = this.f8955t;
        if (drawable != null) {
            drawable.setHotspot(f3, f4);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f8955t;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f8955t.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f8955t;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f8958w;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f8955t;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.b, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        super.onLayout(z3, i3, i4, i5, i6);
        this.f8960y = z3 | this.f8960y;
    }

    @Override // android.view.View
    public void onSizeChanged(int i3, int i4, int i5, int i6) {
        super.onSizeChanged(i3, i4, i5, i6);
        this.f8960y = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f8955t;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f8955t);
            }
            this.f8955t = drawable;
            this.f8960y = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f8958w == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i3) {
        if (this.f8958w != i3) {
            if ((8388615 & i3) == 0) {
                i3 |= 8388611;
            }
            if ((i3 & 112) == 0) {
                i3 |= 48;
            }
            this.f8958w = i3;
            if (i3 == 119 && this.f8955t != null) {
                this.f8955t.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f8955t;
    }
}
