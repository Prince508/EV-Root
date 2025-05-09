package androidx.recyclerview.widget;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class n extends RecyclerView.q {

    /* renamed from: a, reason: collision with root package name */
    public RecyclerView f4618a;

    /* renamed from: b, reason: collision with root package name */
    public Scroller f4619b;

    /* renamed from: c, reason: collision with root package name */
    public final RecyclerView.s f4620c = new a();

    public class a extends RecyclerView.s {

        /* renamed from: a, reason: collision with root package name */
        public boolean f4621a = false;

        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void a(RecyclerView recyclerView, int i3) {
            super.a(recyclerView, i3);
            if (i3 == 0 && this.f4621a) {
                this.f4621a = false;
                n.this.k();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void b(RecyclerView recyclerView, int i3, int i4) {
            if (i3 == 0 && i4 == 0) {
                return;
            }
            this.f4621a = true;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean a(int i3, int i4) {
        RecyclerView.o layoutManager = this.f4618a.getLayoutManager();
        if (layoutManager == null || this.f4618a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f4618a.getMinFlingVelocity();
        return (Math.abs(i4) > minFlingVelocity || Math.abs(i3) > minFlingVelocity) && j(layoutManager, i3, i4);
    }

    public void b(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f4618a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            f();
        }
        this.f4618a = recyclerView;
        if (recyclerView != null) {
            i();
            this.f4619b = new Scroller(this.f4618a.getContext(), new DecelerateInterpolator());
            k();
        }
    }

    public abstract int[] c(RecyclerView.o oVar, View view);

    public RecyclerView.y d(RecyclerView.o oVar) {
        return e(oVar);
    }

    public abstract g e(RecyclerView.o oVar);

    public final void f() {
        this.f4618a.W0(this.f4620c);
        this.f4618a.setOnFlingListener(null);
    }

    public abstract View g(RecyclerView.o oVar);

    public abstract int h(RecyclerView.o oVar, int i3, int i4);

    public final void i() {
        if (this.f4618a.getOnFlingListener() != null) {
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
        this.f4618a.j(this.f4620c);
        this.f4618a.setOnFlingListener(this);
    }

    public final boolean j(RecyclerView.o oVar, int i3, int i4) {
        RecyclerView.y d3;
        int h3;
        if (!(oVar instanceof RecyclerView.y.b) || (d3 = d(oVar)) == null || (h3 = h(oVar, i3, i4)) == -1) {
            return false;
        }
        d3.p(h3);
        oVar.N1(d3);
        return true;
    }

    public void k() {
        RecyclerView.o layoutManager;
        View g3;
        RecyclerView recyclerView = this.f4618a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (g3 = g(layoutManager)) == null) {
            return;
        }
        int[] c3 = c(layoutManager, g3);
        int i3 = c3[0];
        if (i3 == 0 && c3[1] == 0) {
            return;
        }
        this.f4618a.j1(i3, c3[1]);
    }
}
