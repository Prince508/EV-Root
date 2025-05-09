package y1;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* renamed from: y1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0772a extends AbstractC0774c {

    /* renamed from: a, reason: collision with root package name */
    public final SideSheetBehavior f10185a;

    public C0772a(SideSheetBehavior sideSheetBehavior) {
        this.f10185a = sideSheetBehavior;
    }

    @Override // y1.AbstractC0774c
    public int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // y1.AbstractC0774c
    public float b(int i3) {
        float d3 = d();
        return (i3 - d3) / (c() - d3);
    }

    @Override // y1.AbstractC0774c
    public int c() {
        return Math.max(0, this.f10185a.f0() + this.f10185a.d0());
    }

    @Override // y1.AbstractC0774c
    public int d() {
        return (-this.f10185a.Y()) - this.f10185a.d0();
    }

    @Override // y1.AbstractC0774c
    public int e() {
        return this.f10185a.d0();
    }

    @Override // y1.AbstractC0774c
    public int f() {
        return -this.f10185a.Y();
    }

    @Override // y1.AbstractC0774c
    public int g(View view) {
        return view.getRight() + this.f10185a.d0();
    }

    @Override // y1.AbstractC0774c
    public int h(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getLeft();
    }

    @Override // y1.AbstractC0774c
    public int i() {
        return 1;
    }

    @Override // y1.AbstractC0774c
    public boolean j(float f3) {
        return f3 > 0.0f;
    }

    @Override // y1.AbstractC0774c
    public boolean k(View view) {
        return view.getRight() < (c() - d()) / 2;
    }

    @Override // y1.AbstractC0774c
    public boolean l(float f3, float f4) {
        return AbstractC0775d.a(f3, f4) && Math.abs(f3) > ((float) this.f10185a.h0());
    }

    @Override // y1.AbstractC0774c
    public boolean m(View view, float f3) {
        return Math.abs(((float) view.getLeft()) + (f3 * this.f10185a.b0())) > this.f10185a.c0();
    }

    @Override // y1.AbstractC0774c
    public void n(ViewGroup.MarginLayoutParams marginLayoutParams, int i3, int i4) {
        if (i3 <= this.f10185a.g0()) {
            marginLayoutParams.leftMargin = i4;
        }
    }
}
