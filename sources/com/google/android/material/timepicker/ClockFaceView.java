package com.google.android.material.timepicker;

import K.C0184a;
import K.O;
import L.x;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.google.android.material.timepicker.ClockHandView;
import e1.AbstractC0464a;
import e1.g;
import e1.i;
import e1.j;
import f.AbstractC0467a;
import java.util.Arrays;
import u1.AbstractC0740c;

/* loaded from: classes.dex */
class ClockFaceView extends d implements ClockHandView.b {

    /* renamed from: E, reason: collision with root package name */
    public final ClockHandView f5643E;

    /* renamed from: F, reason: collision with root package name */
    public final Rect f5644F;

    /* renamed from: G, reason: collision with root package name */
    public final RectF f5645G;

    /* renamed from: H, reason: collision with root package name */
    public final Rect f5646H;

    /* renamed from: I, reason: collision with root package name */
    public final SparseArray f5647I;

    /* renamed from: J, reason: collision with root package name */
    public final C0184a f5648J;

    /* renamed from: K, reason: collision with root package name */
    public final int[] f5649K;

    /* renamed from: L, reason: collision with root package name */
    public final float[] f5650L;

    /* renamed from: M, reason: collision with root package name */
    public final int f5651M;

    /* renamed from: N, reason: collision with root package name */
    public final int f5652N;

    /* renamed from: O, reason: collision with root package name */
    public final int f5653O;

    /* renamed from: P, reason: collision with root package name */
    public final int f5654P;

    /* renamed from: Q, reason: collision with root package name */
    public String[] f5655Q;

    /* renamed from: R, reason: collision with root package name */
    public float f5656R;

    /* renamed from: S, reason: collision with root package name */
    public final ColorStateList f5657S;

    public class a implements ViewTreeObserver.OnPreDrawListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView.this.x(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.f5643E.i()) - ClockFaceView.this.f5651M);
            return true;
        }
    }

    public class b extends C0184a {
        public b() {
        }

        @Override // K.C0184a
        public void g(View view, x xVar) {
            super.g(view, xVar);
            int intValue = ((Integer) view.getTag(e1.e.f6898n)).intValue();
            if (intValue > 0) {
                xVar.G0((View) ClockFaceView.this.f5647I.get(intValue - 1));
            }
            xVar.m0(x.f.a(0, 1, intValue, 1, false, view.isSelected()));
            xVar.k0(true);
            xVar.b(x.a.f1280i);
        }

        @Override // K.C0184a
        public boolean j(View view, int i3, Bundle bundle) {
            if (i3 != 16) {
                return super.j(view, i3, bundle);
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            view.getHitRect(ClockFaceView.this.f5644F);
            float centerX = ClockFaceView.this.f5644F.centerX();
            float centerY = ClockFaceView.this.f5644F.centerY();
            ClockFaceView.this.f5643E.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
            ClockFaceView.this.f5643E.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
            return true;
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0464a.f6799q);
    }

    public static float I(float f3, float f4, float f5) {
        return Math.max(Math.max(f3, f4), f5);
    }

    public final void F() {
        RectF e3 = this.f5643E.e();
        TextView H3 = H(e3);
        for (int i3 = 0; i3 < this.f5647I.size(); i3++) {
            TextView textView = (TextView) this.f5647I.get(i3);
            if (textView != null) {
                textView.setSelected(textView == H3);
                textView.getPaint().setShader(G(e3, textView));
                textView.invalidate();
            }
        }
    }

    public final RadialGradient G(RectF rectF, TextView textView) {
        textView.getHitRect(this.f5644F);
        this.f5645G.set(this.f5644F);
        textView.getLineBounds(0, this.f5646H);
        RectF rectF2 = this.f5645G;
        Rect rect = this.f5646H;
        rectF2.inset(rect.left, rect.top);
        if (RectF.intersects(rectF, this.f5645G)) {
            return new RadialGradient(rectF.centerX() - this.f5645G.left, rectF.centerY() - this.f5645G.top, rectF.width() * 0.5f, this.f5649K, this.f5650L, Shader.TileMode.CLAMP);
        }
        return null;
    }

    public final TextView H(RectF rectF) {
        float f3 = Float.MAX_VALUE;
        TextView textView = null;
        for (int i3 = 0; i3 < this.f5647I.size(); i3++) {
            TextView textView2 = (TextView) this.f5647I.get(i3);
            if (textView2 != null) {
                textView2.getHitRect(this.f5644F);
                this.f5645G.set(this.f5644F);
                this.f5645G.union(rectF);
                float width = this.f5645G.width() * this.f5645G.height();
                if (width < f3) {
                    textView = textView2;
                    f3 = width;
                }
            }
        }
        return textView;
    }

    public void J(String[] strArr, int i3) {
        this.f5655Q = strArr;
        K(i3);
    }

    public final void K(int i3) {
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = this.f5647I.size();
        boolean z3 = false;
        for (int i4 = 0; i4 < Math.max(this.f5655Q.length, size); i4++) {
            TextView textView = (TextView) this.f5647I.get(i4);
            if (i4 >= this.f5655Q.length) {
                removeView(textView);
                this.f5647I.remove(i4);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(g.f6915d, (ViewGroup) this, false);
                    this.f5647I.put(i4, textView);
                    addView(textView);
                }
                textView.setText(this.f5655Q[i4]);
                textView.setTag(e1.e.f6898n, Integer.valueOf(i4));
                int i5 = (i4 / 12) + 1;
                textView.setTag(e1.e.f6893i, Integer.valueOf(i5));
                if (i5 > 1) {
                    z3 = true;
                }
                O.j0(textView, this.f5648J);
                textView.setTextColor(this.f5657S);
                if (i3 != 0) {
                    textView.setContentDescription(getResources().getString(i3, this.f5655Q[i4]));
                }
            }
        }
        this.f5643E.p(z3);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.b
    public void a(float f3, boolean z3) {
        if (Math.abs(this.f5656R - f3) > 0.001f) {
            this.f5656R = f3;
            F();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        x.J0(accessibilityNodeInfo).l0(x.e.a(1, this.f5655Q.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        super.onLayout(z3, i3, i4, i5, i6);
        F();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i3, int i4) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int I3 = (int) (this.f5654P / I(this.f5652N / displayMetrics.heightPixels, this.f5653O / displayMetrics.widthPixels, 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(I3, 1073741824);
        setMeasuredDimension(I3, I3);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    @Override // com.google.android.material.timepicker.d
    public void x(int i3) {
        if (i3 != w()) {
            super.x(i3);
            this.f5643E.l(w());
        }
    }

    @Override // com.google.android.material.timepicker.d
    public void z() {
        super.z();
        for (int i3 = 0; i3 < this.f5647I.size(); i3++) {
            ((TextView) this.f5647I.get(i3)).setVisibility(0);
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        this.f5644F = new Rect();
        this.f5645G = new RectF();
        this.f5646H = new Rect();
        this.f5647I = new SparseArray();
        this.f5650L = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f7034S0, i3, i.f6959k);
        Resources resources = getResources();
        ColorStateList a3 = AbstractC0740c.a(context, obtainStyledAttributes, j.f7042U0);
        this.f5657S = a3;
        LayoutInflater.from(context).inflate(g.f6916e, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(e1.e.f6892h);
        this.f5643E = clockHandView;
        this.f5651M = resources.getDimensionPixelSize(e1.c.f6855q);
        int colorForState = a3.getColorForState(new int[]{R.attr.state_selected}, a3.getDefaultColor());
        this.f5649K = new int[]{colorForState, colorForState, a3.getDefaultColor()};
        clockHandView.b(this);
        int defaultColor = AbstractC0467a.a(context, e1.b.f6810b).getDefaultColor();
        ColorStateList a4 = AbstractC0740c.a(context, obtainStyledAttributes, j.f7038T0);
        setBackgroundColor(a4 != null ? a4.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a());
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.f5648J = new b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        J(strArr, 0);
        this.f5652N = resources.getDimensionPixelSize(e1.c.f6818D);
        this.f5653O = resources.getDimensionPixelSize(e1.c.f6819E);
        this.f5654P = resources.getDimensionPixelSize(e1.c.f6857s);
    }
}
