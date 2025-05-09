package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class j extends n {

    /* renamed from: d, reason: collision with root package name */
    public i f4610d;

    /* renamed from: e, reason: collision with root package name */
    public i f4611e;

    public class a extends g {
        public a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.g, androidx.recyclerview.widget.RecyclerView.y
        public void o(View view, RecyclerView.z zVar, RecyclerView.y.a aVar) {
            j jVar = j.this;
            int[] c3 = jVar.c(jVar.f4618a.getLayoutManager(), view);
            int i3 = c3[0];
            int i4 = c3[1];
            int w3 = w(Math.max(Math.abs(i3), Math.abs(i4)));
            if (w3 > 0) {
                aVar.d(i3, i4, w3, this.f4599j);
            }
        }

        @Override // androidx.recyclerview.widget.g
        public float v(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.g
        public int x(int i3) {
            return Math.min(100, super.x(i3));
        }
    }

    @Override // androidx.recyclerview.widget.n
    public int[] c(RecyclerView.o oVar, View view) {
        int[] iArr = new int[2];
        if (oVar.p()) {
            iArr[0] = l(oVar, view, n(oVar));
        } else {
            iArr[0] = 0;
        }
        if (oVar.q()) {
            iArr[1] = l(oVar, view, p(oVar));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    @Override // androidx.recyclerview.widget.n
    public g e(RecyclerView.o oVar) {
        if (oVar instanceof RecyclerView.y.b) {
            return new a(this.f4618a.getContext());
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.n
    public View g(RecyclerView.o oVar) {
        if (oVar.q()) {
            return m(oVar, p(oVar));
        }
        if (oVar.p()) {
            return m(oVar, n(oVar));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.n
    public int h(RecyclerView.o oVar, int i3, int i4) {
        i o3;
        int b3 = oVar.b();
        if (b3 == 0 || (o3 = o(oVar)) == null) {
            return -1;
        }
        int O3 = oVar.O();
        View view = null;
        int i5 = Integer.MAX_VALUE;
        int i6 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i7 = 0; i7 < O3; i7++) {
            View N3 = oVar.N(i7);
            if (N3 != null) {
                int l3 = l(oVar, N3, o3);
                if (l3 <= 0 && l3 > i6) {
                    view2 = N3;
                    i6 = l3;
                }
                if (l3 >= 0 && l3 < i5) {
                    view = N3;
                    i5 = l3;
                }
            }
        }
        boolean q3 = q(oVar, i3, i4);
        if (q3 && view != null) {
            return oVar.l0(view);
        }
        if (!q3 && view2 != null) {
            return oVar.l0(view2);
        }
        if (q3) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int l02 = oVar.l0(view) + (r(oVar) == q3 ? -1 : 1);
        if (l02 < 0 || l02 >= b3) {
            return -1;
        }
        return l02;
    }

    public final int l(RecyclerView.o oVar, View view, i iVar) {
        return (iVar.g(view) + (iVar.e(view) / 2)) - (iVar.m() + (iVar.n() / 2));
    }

    public final View m(RecyclerView.o oVar, i iVar) {
        int O3 = oVar.O();
        View view = null;
        if (O3 == 0) {
            return null;
        }
        int m3 = iVar.m() + (iVar.n() / 2);
        int i3 = Integer.MAX_VALUE;
        for (int i4 = 0; i4 < O3; i4++) {
            View N3 = oVar.N(i4);
            int abs = Math.abs((iVar.g(N3) + (iVar.e(N3) / 2)) - m3);
            if (abs < i3) {
                view = N3;
                i3 = abs;
            }
        }
        return view;
    }

    public final i n(RecyclerView.o oVar) {
        i iVar = this.f4611e;
        if (iVar == null || iVar.f4607a != oVar) {
            this.f4611e = i.a(oVar);
        }
        return this.f4611e;
    }

    public final i o(RecyclerView.o oVar) {
        if (oVar.q()) {
            return p(oVar);
        }
        if (oVar.p()) {
            return n(oVar);
        }
        return null;
    }

    public final i p(RecyclerView.o oVar) {
        i iVar = this.f4610d;
        if (iVar == null || iVar.f4607a != oVar) {
            this.f4610d = i.c(oVar);
        }
        return this.f4610d;
    }

    public final boolean q(RecyclerView.o oVar, int i3, int i4) {
        return oVar.p() ? i3 > 0 : i4 > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean r(RecyclerView.o oVar) {
        PointF e3;
        int b3 = oVar.b();
        if (!(oVar instanceof RecyclerView.y.b) || (e3 = ((RecyclerView.y.b) oVar).e(b3 - 1)) == null) {
            return false;
        }
        return e3.x < 0.0f || e3.y < 0.0f;
    }
}
