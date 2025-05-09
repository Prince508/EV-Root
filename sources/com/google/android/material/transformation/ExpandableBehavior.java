package com.google.android.material.transformation;

import K.O;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import j.AbstractC0515e;
import java.util.List;
import q1.InterfaceC0671a;

@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.b {

    /* renamed from: a, reason: collision with root package name */
    public int f5705a;

    public ExpandableBehavior() {
        this.f5705a = 0;
    }

    public InterfaceC0671a E(CoordinatorLayout coordinatorLayout, View view) {
        List q3 = coordinatorLayout.q(view);
        int size = q3.size();
        for (int i3 = 0; i3 < size; i3++) {
            View view2 = (View) q3.get(i3);
            if (e(coordinatorLayout, view, view2)) {
                AbstractC0515e.a(view2);
                return null;
            }
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public abstract boolean e(CoordinatorLayout coordinatorLayout, View view, View view2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        AbstractC0515e.a(view2);
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i3) {
        if (O.O(view)) {
            return false;
        }
        E(coordinatorLayout, view);
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5705a = 0;
    }
}
