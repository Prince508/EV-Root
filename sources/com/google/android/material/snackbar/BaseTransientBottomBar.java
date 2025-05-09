package com.google.android.material.snackbar;

import K.O;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import e1.AbstractC0464a;
import e1.j;
import f1.AbstractC0474a;
import j.AbstractC0515e;
import m1.AbstractC0597a;
import r1.n;
import u1.AbstractC0740c;
import x1.g;
import x1.k;

/* loaded from: classes.dex */
public abstract class BaseTransientBottomBar {

    /* renamed from: a, reason: collision with root package name */
    public static final TimeInterpolator f5491a = AbstractC0474a.f7195b;

    /* renamed from: b, reason: collision with root package name */
    public static final TimeInterpolator f5492b = AbstractC0474a.f7194a;

    /* renamed from: c, reason: collision with root package name */
    public static final TimeInterpolator f5493c = AbstractC0474a.f7197d;

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f5495e = false;

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f5496f = {AbstractC0464a.f6779D};

    /* renamed from: g, reason: collision with root package name */
    public static final String f5497g = BaseTransientBottomBar.class.getSimpleName();

    /* renamed from: d, reason: collision with root package name */
    public static final Handler f5494d = new Handler(Looper.getMainLooper(), new a());

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* renamed from: k, reason: collision with root package name */
        public final b f5498k = new b(this);

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean F(View view) {
            return this.f5498k.a(view);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.f5498k.b(coordinatorLayout, view, motionEvent);
            return super.k(coordinatorLayout, view, motionEvent);
        }
    }

    public class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i3 = message.what;
            if (i3 == 0) {
                AbstractC0515e.a(message.obj);
                throw null;
            }
            if (i3 != 1) {
                return false;
            }
            AbstractC0515e.a(message.obj);
            throw null;
        }
    }

    public static class b {
        public b(SwipeDismissBehavior swipeDismissBehavior) {
            swipeDismissBehavior.L(0.1f);
            swipeDismissBehavior.K(0.6f);
            swipeDismissBehavior.M(0);
        }

        public boolean a(View view) {
            return view instanceof c;
        }

        public void b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (coordinatorLayout.z(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                    com.google.android.material.snackbar.a.b().e(null);
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                com.google.android.material.snackbar.a.b().f(null);
            }
        }
    }

    public static class c extends FrameLayout {

        /* renamed from: o, reason: collision with root package name */
        public static final View.OnTouchListener f5499o = new a();

        /* renamed from: e, reason: collision with root package name */
        public k f5500e;

        /* renamed from: f, reason: collision with root package name */
        public int f5501f;

        /* renamed from: g, reason: collision with root package name */
        public final float f5502g;

        /* renamed from: h, reason: collision with root package name */
        public final float f5503h;

        /* renamed from: i, reason: collision with root package name */
        public final int f5504i;

        /* renamed from: j, reason: collision with root package name */
        public final int f5505j;

        /* renamed from: k, reason: collision with root package name */
        public ColorStateList f5506k;

        /* renamed from: l, reason: collision with root package name */
        public PorterDuff.Mode f5507l;

        /* renamed from: m, reason: collision with root package name */
        public Rect f5508m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f5509n;

        public class a implements View.OnTouchListener {
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        public c(Context context, AttributeSet attributeSet) {
            super(A1.a.c(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, j.e4);
            if (obtainStyledAttributes.hasValue(j.l4)) {
                O.q0(this, obtainStyledAttributes.getDimensionPixelSize(r2, 0));
            }
            this.f5501f = obtainStyledAttributes.getInt(j.h4, 0);
            if (obtainStyledAttributes.hasValue(j.n4) || obtainStyledAttributes.hasValue(j.o4)) {
                this.f5500e = k.e(context2, attributeSet, 0, 0).m();
            }
            this.f5502g = obtainStyledAttributes.getFloat(j.i4, 1.0f);
            setBackgroundTintList(AbstractC0740c.a(context2, obtainStyledAttributes, j.j4));
            setBackgroundTintMode(n.h(obtainStyledAttributes.getInt(j.k4, -1), PorterDuff.Mode.SRC_IN));
            this.f5503h = obtainStyledAttributes.getFloat(j.g4, 1.0f);
            this.f5504i = obtainStyledAttributes.getDimensionPixelSize(j.f4, -1);
            this.f5505j = obtainStyledAttributes.getDimensionPixelSize(j.m4, -1);
            obtainStyledAttributes.recycle();
            setOnTouchListener(f5499o);
            setFocusable(true);
            if (getBackground() == null) {
                O.n0(this, a());
            }
        }

        private void setBaseTransientBottomBar(BaseTransientBottomBar baseTransientBottomBar) {
        }

        public final Drawable a() {
            int k3 = AbstractC0597a.k(this, AbstractC0464a.f6790h, AbstractC0464a.f6787e, getBackgroundOverlayColorAlpha());
            k kVar = this.f5500e;
            Drawable d3 = kVar != null ? BaseTransientBottomBar.d(k3, kVar) : BaseTransientBottomBar.c(k3, getResources());
            if (this.f5506k == null) {
                return D.a.l(d3);
            }
            Drawable l3 = D.a.l(d3);
            D.a.i(l3, this.f5506k);
            return l3;
        }

        public final void b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.f5508m = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }

        public float getActionTextColorAlpha() {
            return this.f5503h;
        }

        public int getAnimationMode() {
            return this.f5501f;
        }

        public float getBackgroundOverlayColorAlpha() {
            return this.f5502g;
        }

        public int getMaxInlineActionWidth() {
            return this.f5505j;
        }

        public int getMaxWidth() {
            return this.f5504i;
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            O.g0(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        public void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
            super.onLayout(z3, i3, i4, i5, i6);
        }

        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i3, int i4) {
            super.onMeasure(i3, i4);
            if (this.f5504i > 0) {
                int measuredWidth = getMeasuredWidth();
                int i5 = this.f5504i;
                if (measuredWidth > i5) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), i4);
                }
            }
        }

        public void setAnimationMode(int i3) {
            this.f5501f = i3;
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.f5506k != null) {
                drawable = D.a.l(drawable.mutate());
                D.a.i(drawable, this.f5506k);
                D.a.j(drawable, this.f5507l);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f5506k = colorStateList;
            if (getBackground() != null) {
                Drawable l3 = D.a.l(getBackground().mutate());
                D.a.i(l3, colorStateList);
                D.a.j(l3, this.f5507l);
                if (l3 != getBackground()) {
                    super.setBackgroundDrawable(l3);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f5507l = mode;
            if (getBackground() != null) {
                Drawable l3 = D.a.l(getBackground().mutate());
                D.a.j(l3, mode);
                if (l3 != getBackground()) {
                    super.setBackgroundDrawable(l3);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (this.f5509n || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                return;
            }
            b((ViewGroup.MarginLayoutParams) layoutParams);
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f5499o);
            super.setOnClickListener(onClickListener);
        }
    }

    public static GradientDrawable c(int i3, Resources resources) {
        float dimension = resources.getDimension(e1.c.f6834T);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(dimension);
        gradientDrawable.setColor(i3);
        return gradientDrawable;
    }

    public static g d(int i3, k kVar) {
        g gVar = new g(kVar);
        gVar.T(ColorStateList.valueOf(i3));
        return gVar;
    }
}
