package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public final RecyclerView.o f4607a;

    /* renamed from: b, reason: collision with root package name */
    public int f4608b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f4609c;

    public static class a extends i {
        public a(RecyclerView.o oVar) {
            super(oVar, null);
        }

        @Override // androidx.recyclerview.widget.i
        public int d(View view) {
            return this.f4607a.Y(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int e(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f4607a.X(view) + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int f(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f4607a.W(view) + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int g(View view) {
            return this.f4607a.V(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int h() {
            return this.f4607a.s0();
        }

        @Override // androidx.recyclerview.widget.i
        public int i() {
            return this.f4607a.s0() - this.f4607a.j0();
        }

        @Override // androidx.recyclerview.widget.i
        public int j() {
            return this.f4607a.j0();
        }

        @Override // androidx.recyclerview.widget.i
        public int k() {
            return this.f4607a.t0();
        }

        @Override // androidx.recyclerview.widget.i
        public int l() {
            return this.f4607a.c0();
        }

        @Override // androidx.recyclerview.widget.i
        public int m() {
            return this.f4607a.i0();
        }

        @Override // androidx.recyclerview.widget.i
        public int n() {
            return (this.f4607a.s0() - this.f4607a.i0()) - this.f4607a.j0();
        }

        @Override // androidx.recyclerview.widget.i
        public int p(View view) {
            this.f4607a.r0(view, true, this.f4609c);
            return this.f4609c.right;
        }

        @Override // androidx.recyclerview.widget.i
        public int q(View view) {
            this.f4607a.r0(view, true, this.f4609c);
            return this.f4609c.left;
        }

        @Override // androidx.recyclerview.widget.i
        public void r(int i3) {
            this.f4607a.G0(i3);
        }
    }

    public static class b extends i {
        public b(RecyclerView.o oVar) {
            super(oVar, null);
        }

        @Override // androidx.recyclerview.widget.i
        public int d(View view) {
            return this.f4607a.T(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int e(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f4607a.W(view) + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int f(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f4607a.X(view) + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int g(View view) {
            return this.f4607a.Z(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int h() {
            return this.f4607a.b0();
        }

        @Override // androidx.recyclerview.widget.i
        public int i() {
            return this.f4607a.b0() - this.f4607a.h0();
        }

        @Override // androidx.recyclerview.widget.i
        public int j() {
            return this.f4607a.h0();
        }

        @Override // androidx.recyclerview.widget.i
        public int k() {
            return this.f4607a.c0();
        }

        @Override // androidx.recyclerview.widget.i
        public int l() {
            return this.f4607a.t0();
        }

        @Override // androidx.recyclerview.widget.i
        public int m() {
            return this.f4607a.k0();
        }

        @Override // androidx.recyclerview.widget.i
        public int n() {
            return (this.f4607a.b0() - this.f4607a.k0()) - this.f4607a.h0();
        }

        @Override // androidx.recyclerview.widget.i
        public int p(View view) {
            this.f4607a.r0(view, true, this.f4609c);
            return this.f4609c.bottom;
        }

        @Override // androidx.recyclerview.widget.i
        public int q(View view) {
            this.f4607a.r0(view, true, this.f4609c);
            return this.f4609c.top;
        }

        @Override // androidx.recyclerview.widget.i
        public void r(int i3) {
            this.f4607a.H0(i3);
        }
    }

    public /* synthetic */ i(RecyclerView.o oVar, a aVar) {
        this(oVar);
    }

    public static i a(RecyclerView.o oVar) {
        return new a(oVar);
    }

    public static i b(RecyclerView.o oVar, int i3) {
        if (i3 == 0) {
            return a(oVar);
        }
        if (i3 == 1) {
            return c(oVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static i c(RecyclerView.o oVar) {
        return new b(oVar);
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public int o() {
        if (Integer.MIN_VALUE == this.f4608b) {
            return 0;
        }
        return n() - this.f4608b;
    }

    public abstract int p(View view);

    public abstract int q(View view);

    public abstract void r(int i3);

    public void s() {
        this.f4608b = n();
    }

    public i(RecyclerView.o oVar) {
        this.f4608b = Integer.MIN_VALUE;
        this.f4609c = new Rect();
        this.f4607a = oVar;
    }
}
