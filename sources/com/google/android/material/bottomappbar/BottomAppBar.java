package com.google.android.material.bottomappbar;

import K.O;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import e1.AbstractC0464a;
import e1.i;
import j.AbstractC0515e;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public abstract class BottomAppBar extends Toolbar {

    /* renamed from: a0, reason: collision with root package name */
    public static final int f5023a0 = i.f6954f;

    /* renamed from: b0, reason: collision with root package name */
    public static final int f5024b0 = AbstractC0464a.f6801s;

    /* renamed from: c0, reason: collision with root package name */
    public static final int f5025c0 = AbstractC0464a.f6808z;

    public static /* synthetic */ void M(BottomAppBar bottomAppBar) {
        throw null;
    }

    public static /* synthetic */ View N(BottomAppBar bottomAppBar) {
        throw null;
    }

    public static void P(BottomAppBar bottomAppBar, View view) {
        ((CoordinatorLayout.e) view.getLayoutParams()).f3473d = 17;
        throw null;
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: m, reason: collision with root package name */
        public final Rect f5026m;

        /* renamed from: n, reason: collision with root package name */
        public WeakReference f5027n;

        /* renamed from: o, reason: collision with root package name */
        public int f5028o;

        /* renamed from: p, reason: collision with root package name */
        public final View.OnLayoutChangeListener f5029p;

        public class a implements View.OnLayoutChangeListener {
            public a() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                AbstractC0515e.a(Behavior.this.f5027n.get());
                view.removeOnLayoutChangeListener(this);
            }
        }

        public Behavior() {
            this.f5029p = new a();
            this.f5026m = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public /* bridge */ /* synthetic */ boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i3, int i4) {
            AbstractC0515e.a(view);
            return P(coordinatorLayout, null, view2, view3, i3, i4);
        }

        public boolean O(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i3) {
            this.f5027n = new WeakReference(bottomAppBar);
            View N3 = BottomAppBar.N(bottomAppBar);
            if (N3 != null && !O.O(N3)) {
                BottomAppBar.P(bottomAppBar, N3);
                this.f5028o = ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.e) N3.getLayoutParams())).bottomMargin;
                N3.addOnLayoutChangeListener(this.f5029p);
                BottomAppBar.M(bottomAppBar);
            }
            coordinatorLayout.G(bottomAppBar, i3);
            return super.l(coordinatorLayout, bottomAppBar, i3);
        }

        public boolean P(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i3, int i4) {
            throw null;
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.b
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, View view, int i3) {
            AbstractC0515e.a(view);
            return O(coordinatorLayout, null, i3);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f5029p = new a();
            this.f5026m = new Rect();
        }
    }
}
