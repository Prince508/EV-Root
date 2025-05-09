package y1;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* renamed from: y1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0773b extends AbstractC0774c {

    /* renamed from: a, reason: collision with root package name */
    public final SideSheetBehavior f10186a;

    public C0773b(SideSheetBehavior sideSheetBehavior) {
        this.f10186a = sideSheetBehavior;
    }

    @Override // y1.AbstractC0774c
    public int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // y1.AbstractC0774c
    public float b(int i3) {
        float d3 = d();
        return (d3 - i3) / (d3 - c());
    }

    @Override // y1.AbstractC0774c
    public int c() {
        return Math.max(0, (d() - this.f10186a.Y()) - this.f10186a.d0());
    }

    @Override // y1.AbstractC0774c
    public int d() {
        return this.f10186a.g0();
    }

    @Override // y1.AbstractC0774c
    public int e() {
        return this.f10186a.g0();
    }

    @Override // y1.AbstractC0774c
    public int f() {
        return c();
    }

    @Override // y1.AbstractC0774c
    public int g(View view) {
        return view.getLeft() - this.f10186a.d0();
    }

    @Override // y1.AbstractC0774c
    public int h(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getRight();
    }

    @Override // y1.AbstractC0774c
    public int i() {
        return 0;
    }

    @Override // y1.AbstractC0774c
    public boolean j(float f3) {
        return f3 < 0.0f;
    }

    @Override // y1.AbstractC0774c
    public boolean k(View view) {
        return view.getLeft() > (d() + c()) / 2;
    }

    @Override // y1.AbstractC0774c
    public boolean l(float f3, float f4) {
        return AbstractC0775d.a(f3, f4) && Math.abs(f3) > ((float) this.f10186a.h0());
    }

    @Override // y1.AbstractC0774c
    public boolean m(View view, float f3) {
        return Math.abs(((float) view.getRight()) + (f3 * this.f10186a.b0())) > this.f10186a.c0();
    }

    @Override // y1.AbstractC0774c
    public void n(ViewGroup.MarginLayoutParams marginLayoutParams, int i3, int i4) {
        int g02 = this.f10186a.g0();
        if (i3 <= g02) {
            marginLayoutParams.rightMargin = g02 - i3;
        }
    }
}
