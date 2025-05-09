package com.google.android.material.transformation;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

@Deprecated
/* loaded from: classes.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: b, reason: collision with root package name */
    public final Rect f5706b;

    /* renamed from: c, reason: collision with root package name */
    public final RectF f5707c;

    /* renamed from: d, reason: collision with root package name */
    public final RectF f5708d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f5709e;

    public FabTransformationBehavior() {
        this.f5706b = new Rect();
        this.f5707c = new RectF();
        this.f5708d = new RectF();
        this.f5709e = new int[2];
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() != 8) {
            return false;
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public void g(CoordinatorLayout.e eVar) {
        if (eVar.f3477h == 0) {
            eVar.f3477h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5706b = new Rect();
        this.f5707c = new RectF();
        this.f5708d = new RectF();
        this.f5709e = new int[2];
    }
}
