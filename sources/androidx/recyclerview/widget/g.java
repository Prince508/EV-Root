package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class g extends RecyclerView.y {

    /* renamed from: k, reason: collision with root package name */
    public PointF f4600k;

    /* renamed from: l, reason: collision with root package name */
    public final DisplayMetrics f4601l;

    /* renamed from: n, reason: collision with root package name */
    public float f4603n;

    /* renamed from: i, reason: collision with root package name */
    public final LinearInterpolator f4598i = new LinearInterpolator();

    /* renamed from: j, reason: collision with root package name */
    public final DecelerateInterpolator f4599j = new DecelerateInterpolator();

    /* renamed from: m, reason: collision with root package name */
    public boolean f4602m = false;

    /* renamed from: o, reason: collision with root package name */
    public int f4604o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f4605p = 0;

    public g(Context context) {
        this.f4601l = context.getResources().getDisplayMetrics();
    }

    public final float A() {
        if (!this.f4602m) {
            this.f4603n = v(this.f4601l);
            this.f4602m = true;
        }
        return this.f4603n;
    }

    public int B() {
        PointF pointF = this.f4600k;
        if (pointF == null) {
            return 0;
        }
        float f3 = pointF.y;
        if (f3 == 0.0f) {
            return 0;
        }
        return f3 > 0.0f ? 1 : -1;
    }

    public void C(RecyclerView.y.a aVar) {
        PointF a3 = a(f());
        if (a3 == null || (a3.x == 0.0f && a3.y == 0.0f)) {
            aVar.b(f());
            r();
            return;
        }
        i(a3);
        this.f4600k = a3;
        this.f4604o = (int) (a3.x * 10000.0f);
        this.f4605p = (int) (a3.y * 10000.0f);
        aVar.d((int) (this.f4604o * 1.2f), (int) (this.f4605p * 1.2f), (int) (x(10000) * 1.2f), this.f4598i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.y
    public void l(int i3, int i4, RecyclerView.z zVar, RecyclerView.y.a aVar) {
        if (c() == 0) {
            r();
            return;
        }
        this.f4604o = y(this.f4604o, i3);
        int y3 = y(this.f4605p, i4);
        this.f4605p = y3;
        if (this.f4604o == 0 && y3 == 0) {
            C(aVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.y
    public void m() {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.y
    public void n() {
        this.f4605p = 0;
        this.f4604o = 0;
        this.f4600k = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.y
    public void o(View view, RecyclerView.z zVar, RecyclerView.y.a aVar) {
        int t3 = t(view, z());
        int u3 = u(view, B());
        int w3 = w((int) Math.sqrt((t3 * t3) + (u3 * u3)));
        if (w3 > 0) {
            aVar.d(-t3, -u3, w3, this.f4599j);
        }
    }

    public int s(int i3, int i4, int i5, int i6, int i7) {
        if (i7 == -1) {
            return i5 - i3;
        }
        if (i7 != 0) {
            if (i7 == 1) {
                return i6 - i4;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i8 = i5 - i3;
        if (i8 > 0) {
            return i8;
        }
        int i9 = i6 - i4;
        if (i9 < 0) {
            return i9;
        }
        return 0;
    }

    public int t(View view, int i3) {
        RecyclerView.o e3 = e();
        if (e3 == null || !e3.p()) {
            return 0;
        }
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        return s(e3.V(view) - ((ViewGroup.MarginLayoutParams) pVar).leftMargin, e3.Y(view) + ((ViewGroup.MarginLayoutParams) pVar).rightMargin, e3.i0(), e3.s0() - e3.j0(), i3);
    }

    public int u(View view, int i3) {
        RecyclerView.o e3 = e();
        if (e3 == null || !e3.q()) {
            return 0;
        }
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        return s(e3.Z(view) - ((ViewGroup.MarginLayoutParams) pVar).topMargin, e3.T(view) + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin, e3.k0(), e3.b0() - e3.h0(), i3);
    }

    public float v(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int w(int i3) {
        return (int) Math.ceil(x(i3) / 0.3356d);
    }

    public int x(int i3) {
        return (int) Math.ceil(Math.abs(i3) * A());
    }

    public final int y(int i3, int i4) {
        int i5 = i3 - i4;
        if (i3 * i5 <= 0) {
            return 0;
        }
        return i5;
    }

    public int z() {
        PointF pointF = this.f4600k;
        if (pointF == null) {
            return 0;
        }
        float f3 = pointF.x;
        if (f3 == 0.0f) {
            return 0;
        }
        return f3 > 0.0f ? 1 : -1;
    }
}
