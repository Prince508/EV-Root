package g1;

import K.AbstractC0213s;
import K.C0205k0;
import K.O;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;

/* renamed from: g1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0482b extends c {

    /* renamed from: d, reason: collision with root package name */
    public final Rect f7222d;

    /* renamed from: e, reason: collision with root package name */
    public final Rect f7223e;

    /* renamed from: f, reason: collision with root package name */
    public int f7224f;

    /* renamed from: g, reason: collision with root package name */
    public int f7225g;

    public AbstractC0482b() {
        this.f7222d = new Rect();
        this.f7223e = new Rect();
        this.f7224f = 0;
    }

    public static int L(int i3) {
        if (i3 == 0) {
            return 8388659;
        }
        return i3;
    }

    @Override // g1.c
    public void F(CoordinatorLayout coordinatorLayout, View view, int i3) {
        View G3 = G(coordinatorLayout.q(view));
        if (G3 == null) {
            super.F(coordinatorLayout, view, i3);
            this.f7224f = 0;
            return;
        }
        CoordinatorLayout.e eVar = (CoordinatorLayout.e) view.getLayoutParams();
        Rect rect = this.f7222d;
        rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin, G3.getBottom() + ((ViewGroup.MarginLayoutParams) eVar).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin, ((coordinatorLayout.getHeight() + G3.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        C0205k0 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null && O.t(coordinatorLayout) && !O.t(view)) {
            rect.left += lastWindowInsets.i();
            rect.right -= lastWindowInsets.j();
        }
        Rect rect2 = this.f7223e;
        AbstractC0213s.a(L(eVar.f3472c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i3);
        int H3 = H(G3);
        view.layout(rect2.left, rect2.top - H3, rect2.right, rect2.bottom - H3);
        this.f7224f = rect2.top - G3.getBottom();
    }

    public abstract View G(List list);

    public final int H(View view) {
        if (this.f7225g == 0) {
            return 0;
        }
        float I3 = I(view);
        int i3 = this.f7225g;
        return F.a.b((int) (I3 * i3), 0, i3);
    }

    public abstract float I(View view);

    public int J(View view) {
        return view.getMeasuredHeight();
    }

    public final int K() {
        return this.f7224f;
    }

    public final void M(int i3) {
        this.f7225g = i3;
    }

    public boolean N() {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i3, int i4, int i5, int i6) {
        View G3;
        C0205k0 lastWindowInsets;
        int i7 = view.getLayoutParams().height;
        if ((i7 != -1 && i7 != -2) || (G3 = G(coordinatorLayout.q(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i5);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (O.t(G3) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.k() + lastWindowInsets.h();
        }
        int J3 = size + J(G3);
        int measuredHeight = G3.getMeasuredHeight();
        if (N()) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(0.0f);
            J3 -= measuredHeight;
        }
        coordinatorLayout.H(view, i3, i4, View.MeasureSpec.makeMeasureSpec(J3, i7 == -1 ? 1073741824 : Integer.MIN_VALUE), i6);
        return true;
    }

    public AbstractC0482b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7222d = new Rect();
        this.f7223e = new Rect();
        this.f7224f = 0;
    }
}
