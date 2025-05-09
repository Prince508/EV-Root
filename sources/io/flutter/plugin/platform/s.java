package io.flutter.plugin.platform;

import android.content.Context;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

/* loaded from: classes.dex */
public class s extends ViewGroup {

    /* renamed from: e, reason: collision with root package name */
    public final Rect f7736e;

    /* renamed from: f, reason: collision with root package name */
    public final Rect f7737f;

    public s(Context context) {
        super(context);
        this.f7736e = new Rect();
        this.f7737f = new Rect();
    }

    public static int a(int i3) {
        return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), Integer.MIN_VALUE);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) childAt.getLayoutParams();
            this.f7736e.set(i3, i4, i5, i6);
            Gravity.apply(layoutParams.gravity, childAt.getMeasuredWidth(), childAt.getMeasuredHeight(), this.f7736e, layoutParams.x, layoutParams.y, this.f7737f);
            Rect rect = this.f7737f;
            childAt.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i3, int i4) {
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            getChildAt(i5).measure(a(i3), a(i4));
        }
        super.onMeasure(i3, i4);
    }
}
