package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import e1.AbstractC0464a;
import f1.AbstractC0474a;
import j.AbstractC0515e;
import java.util.Iterator;
import java.util.LinkedHashSet;
import t1.d;

/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.b {

    /* renamed from: j, reason: collision with root package name */
    public static final int f4993j = AbstractC0464a.f6801s;

    /* renamed from: k, reason: collision with root package name */
    public static final int f4994k = AbstractC0464a.f6803u;

    /* renamed from: l, reason: collision with root package name */
    public static final int f4995l = AbstractC0464a.f6808z;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f4996a;

    /* renamed from: b, reason: collision with root package name */
    public int f4997b;

    /* renamed from: c, reason: collision with root package name */
    public int f4998c;

    /* renamed from: d, reason: collision with root package name */
    public TimeInterpolator f4999d;

    /* renamed from: e, reason: collision with root package name */
    public TimeInterpolator f5000e;

    /* renamed from: f, reason: collision with root package name */
    public int f5001f;

    /* renamed from: g, reason: collision with root package name */
    public int f5002g;

    /* renamed from: h, reason: collision with root package name */
    public int f5003h;

    /* renamed from: i, reason: collision with root package name */
    public ViewPropertyAnimator f5004i;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f5004i = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
        this.f4996a = new LinkedHashSet();
        this.f5001f = 0;
        this.f5002g = 2;
        this.f5003h = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i3, int i4) {
        return i3 == 2;
    }

    public final void F(View view, int i3, long j3, TimeInterpolator timeInterpolator) {
        this.f5004i = view.animate().translationY(i3).setInterpolator(timeInterpolator).setDuration(j3).setListener(new a());
    }

    public boolean G() {
        return this.f5002g == 1;
    }

    public boolean H() {
        return this.f5002g == 2;
    }

    public void I(View view) {
        J(view, true);
    }

    public void J(View view, boolean z3) {
        if (G()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f5004i;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        M(view, 1);
        int i3 = this.f5001f + this.f5003h;
        if (z3) {
            F(view, i3, this.f4998c, this.f5000e);
        } else {
            view.setTranslationY(i3);
        }
    }

    public void K(View view) {
        L(view, true);
    }

    public void L(View view, boolean z3) {
        if (H()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.f5004i;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            view.clearAnimation();
        }
        M(view, 2);
        if (z3) {
            F(view, 0, this.f4997b, this.f4999d);
        } else {
            view.setTranslationY(0);
        }
    }

    public final void M(View view, int i3) {
        this.f5002g = i3;
        Iterator it = this.f4996a.iterator();
        if (it.hasNext()) {
            AbstractC0515e.a(it.next());
            throw null;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i3) {
        this.f5001f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f4997b = d.f(view.getContext(), f4993j, 225);
        this.f4998c = d.f(view.getContext(), f4994k, 175);
        Context context = view.getContext();
        int i4 = f4995l;
        this.f4999d = d.g(context, i4, AbstractC0474a.f7197d);
        this.f5000e = d.g(view.getContext(), i4, AbstractC0474a.f7196c);
        return super.l(coordinatorLayout, view, i3);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i3, int i4, int i5, int i6, int i7, int[] iArr) {
        if (i4 > 0) {
            I(view);
        } else if (i4 < 0) {
            K(view);
        }
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4996a = new LinkedHashSet();
        this.f5001f = 0;
        this.f5002g = 2;
        this.f5003h = 0;
    }
}
