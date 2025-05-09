package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.carousel.b;
import e1.j;
import f1.AbstractC0474a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import k1.AbstractC0531e;
import k1.AbstractC0532f;
import k1.C0533g;
import k1.InterfaceC0528b;

/* loaded from: classes.dex */
public class CarouselLayoutManager extends RecyclerView.o implements InterfaceC0528b, RecyclerView.y.b {

    /* renamed from: A, reason: collision with root package name */
    public int f5149A;

    /* renamed from: B, reason: collision with root package name */
    public Map f5150B;

    /* renamed from: C, reason: collision with root package name */
    public AbstractC0531e f5151C;

    /* renamed from: D, reason: collision with root package name */
    public final View.OnLayoutChangeListener f5152D;

    /* renamed from: E, reason: collision with root package name */
    public int f5153E;

    /* renamed from: F, reason: collision with root package name */
    public int f5154F;

    /* renamed from: G, reason: collision with root package name */
    public int f5155G;

    /* renamed from: s, reason: collision with root package name */
    public int f5156s;

    /* renamed from: t, reason: collision with root package name */
    public int f5157t;

    /* renamed from: u, reason: collision with root package name */
    public int f5158u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f5159v;

    /* renamed from: w, reason: collision with root package name */
    public final c f5160w;

    /* renamed from: x, reason: collision with root package name */
    public AbstractC0532f f5161x;

    /* renamed from: y, reason: collision with root package name */
    public com.google.android.material.carousel.c f5162y;

    /* renamed from: z, reason: collision with root package name */
    public com.google.android.material.carousel.b f5163z;

    public class a extends g {
        public a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.y
        public PointF a(int i3) {
            return CarouselLayoutManager.this.e(i3);
        }

        @Override // androidx.recyclerview.widget.g
        public int t(View view, int i3) {
            if (CarouselLayoutManager.this.f5162y == null || !CarouselLayoutManager.this.f()) {
                return 0;
            }
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return carouselLayoutManager.g2(carouselLayoutManager.l0(view));
        }

        @Override // androidx.recyclerview.widget.g
        public int u(View view, int i3) {
            if (CarouselLayoutManager.this.f5162y == null || CarouselLayoutManager.this.f()) {
                return 0;
            }
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return carouselLayoutManager.g2(carouselLayoutManager.l0(view));
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final View f5165a;

        /* renamed from: b, reason: collision with root package name */
        public final float f5166b;

        /* renamed from: c, reason: collision with root package name */
        public final float f5167c;

        /* renamed from: d, reason: collision with root package name */
        public final d f5168d;

        public b(View view, float f3, float f4, d dVar) {
            this.f5165a = view;
            this.f5166b = f3;
            this.f5167c = f4;
            this.f5168d = dVar;
        }
    }

    public static class c extends RecyclerView.n {

        /* renamed from: a, reason: collision with root package name */
        public final Paint f5169a;

        /* renamed from: b, reason: collision with root package name */
        public List f5170b;

        public c() {
            Paint paint = new Paint();
            this.f5169a = paint;
            this.f5170b = Collections.unmodifiableList(new ArrayList());
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
            super.i(canvas, recyclerView, zVar);
            this.f5169a.setStrokeWidth(recyclerView.getResources().getDimension(e1.c.f6849k));
            for (b.c cVar : this.f5170b) {
                this.f5169a.setColor(C.a.c(-65281, -16776961, cVar.f5188c));
                if (((CarouselLayoutManager) recyclerView.getLayoutManager()).f()) {
                    canvas.drawLine(cVar.f5187b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).A2(), cVar.f5187b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).v2(), this.f5169a);
                } else {
                    canvas.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).x2(), cVar.f5187b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).y2(), cVar.f5187b, this.f5169a);
                }
            }
        }

        public void j(List list) {
            this.f5170b = Collections.unmodifiableList(list);
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final b.c f5171a;

        /* renamed from: b, reason: collision with root package name */
        public final b.c f5172b;

        public d(b.c cVar, b.c cVar2) {
            J.g.a(cVar.f5186a <= cVar2.f5186a);
            this.f5171a = cVar;
            this.f5172b = cVar2;
        }
    }

    public CarouselLayoutManager() {
        this(new C0533g());
    }

    public static d E2(List list, float f3, boolean z3) {
        float f4 = Float.MAX_VALUE;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        float f5 = -3.4028235E38f;
        float f6 = Float.MAX_VALUE;
        float f7 = Float.MAX_VALUE;
        for (int i7 = 0; i7 < list.size(); i7++) {
            b.c cVar = (b.c) list.get(i7);
            float f8 = z3 ? cVar.f5187b : cVar.f5186a;
            float abs = Math.abs(f8 - f3);
            if (f8 <= f3 && abs <= f4) {
                i3 = i7;
                f4 = abs;
            }
            if (f8 > f3 && abs <= f6) {
                i5 = i7;
                f6 = abs;
            }
            if (f8 <= f7) {
                i4 = i7;
                f7 = f8;
            }
            if (f8 > f5) {
                i6 = i7;
                f5 = f8;
            }
        }
        if (i3 == -1) {
            i3 = i4;
        }
        if (i5 == -1) {
            i5 = i6;
        }
        return new d((b.c) list.get(i3), (b.c) list.get(i5));
    }

    private int O2(int i3, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (O() == 0 || i3 == 0) {
            return 0;
        }
        if (this.f5162y == null) {
            L2(uVar);
        }
        int h22 = h2(i3, this.f5156s, this.f5157t, this.f5158u);
        this.f5156s += h22;
        V2(this.f5162y);
        float f3 = this.f5163z.f() / 2.0f;
        float e22 = e2(l0(N(0)));
        Rect rect = new Rect();
        float f4 = F2() ? this.f5163z.h().f5187b : this.f5163z.a().f5187b;
        float f5 = Float.MAX_VALUE;
        for (int i4 = 0; i4 < O(); i4++) {
            View N3 = N(i4);
            float abs = Math.abs(f4 - K2(N3, e22, f3, rect));
            if (N3 != null && abs < f5) {
                this.f5154F = l0(N3);
                f5 = abs;
            }
            e22 = Y1(e22, this.f5163z.f());
        }
        k2(uVar, zVar);
        return h22;
    }

    public static /* synthetic */ void R1(final CarouselLayoutManager carouselLayoutManager, View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        carouselLayoutManager.getClass();
        if (i3 == i7 && i4 == i8 && i5 == i9 && i6 == i10) {
            return;
        }
        view.post(new Runnable() { // from class: k1.d
            @Override // java.lang.Runnable
            public final void run() {
                CarouselLayoutManager.this.M2();
            }
        });
    }

    public static int h2(int i3, int i4, int i5, int i6) {
        int i7 = i4 + i3;
        return i7 < i5 ? i5 - i4 : i7 > i6 ? i6 - i4 : i3;
    }

    private int j2(int i3) {
        int u22 = u2();
        if (i3 == 1) {
            return -1;
        }
        if (i3 == 2) {
            return 1;
        }
        if (i3 == 17) {
            if (u22 == 0) {
                return F2() ? 1 : -1;
            }
            return Integer.MIN_VALUE;
        }
        if (i3 == 33) {
            return u22 == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i3 == 66) {
            if (u22 == 0) {
                return F2() ? -1 : 1;
            }
            return Integer.MIN_VALUE;
        }
        if (i3 == 130) {
            return u22 == 1 ? 1 : Integer.MIN_VALUE;
        }
        Log.d("CarouselLayoutManager", "Unknown focus request:" + i3);
        return Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int A(RecyclerView.z zVar) {
        return this.f5158u - this.f5157t;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int A1(int i3, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (p()) {
            return O2(i3, uVar, zVar);
        }
        return 0;
    }

    public final int A2() {
        return this.f5151C.j();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void B1(int i3) {
        this.f5154F = i3;
        if (this.f5162y == null) {
            return;
        }
        this.f5156s = C2(i3, q2(i3));
        this.f5149A = F.a.b(i3, 0, Math.max(0, b() - 1));
        V2(this.f5162y);
        x1();
    }

    public final int B2() {
        if (R() || !this.f5161x.f()) {
            return 0;
        }
        return u2() == 1 ? h0() : j0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int C1(int i3, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (q()) {
            return O2(i3, uVar, zVar);
        }
        return 0;
    }

    public final int C2(int i3, com.google.android.material.carousel.b bVar) {
        return F2() ? (int) (((n2() - bVar.h().f5186a) - (i3 * bVar.f())) - (bVar.f() / 2.0f)) : (int) (((i3 * bVar.f()) - bVar.a().f5186a) + (bVar.f() / 2.0f));
    }

    public final int D2(int i3, com.google.android.material.carousel.b bVar) {
        int i4 = Integer.MAX_VALUE;
        for (b.c cVar : bVar.e()) {
            float f3 = (i3 * bVar.f()) + (bVar.f() / 2.0f);
            int n22 = (F2() ? (int) ((n2() - cVar.f5186a) - f3) : (int) (f3 - cVar.f5186a)) - this.f5156s;
            if (Math.abs(i4) > Math.abs(n22)) {
                i4 = n22;
            }
        }
        return i4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void E0(View view, int i3, int i4) {
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    public boolean F2() {
        return f() && d0() == 1;
    }

    public final boolean G2(float f3, d dVar) {
        float Z12 = Z1(f3, s2(f3, dVar) / 2.0f);
        return F2() ? Z12 < 0.0f : Z12 > ((float) n2());
    }

    public final boolean H2(float f3, d dVar) {
        float Y12 = Y1(f3, s2(f3, dVar) / 2.0f);
        return F2() ? Y12 > ((float) n2()) : Y12 < 0.0f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p I() {
        return new RecyclerView.p(-2, -2);
    }

    public final void I2() {
        if (this.f5159v && Log.isLoggable("CarouselLayoutManager", 3)) {
            Log.d("CarouselLayoutManager", "internal representation of views on the screen");
            for (int i3 = 0; i3 < O(); i3++) {
                View N3 = N(i3);
                Log.d("CarouselLayoutManager", "item position " + l0(N3) + ", center:" + o2(N3) + ", child index:" + i3);
            }
            Log.d("CarouselLayoutManager", "==============");
        }
    }

    public final b J2(RecyclerView.u uVar, float f3, int i3) {
        View o3 = uVar.o(i3);
        E0(o3, 0, 0);
        float Y12 = Y1(f3, this.f5163z.f() / 2.0f);
        d E22 = E2(this.f5163z.g(), Y12, false);
        return new b(o3, Y12, d2(o3, Y12, E22), E22);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void K0(RecyclerView recyclerView) {
        super.K0(recyclerView);
        this.f5161x.e(recyclerView.getContext());
        M2();
        recyclerView.addOnLayoutChangeListener(this.f5152D);
    }

    public final float K2(View view, float f3, float f4, Rect rect) {
        float Y12 = Y1(f3, f4);
        d E22 = E2(this.f5163z.g(), Y12, false);
        float d22 = d2(view, Y12, E22);
        super.U(view, rect);
        U2(view, Y12, E22);
        this.f5151C.l(view, rect, f4, d22);
        return d22;
    }

    public final void L2(RecyclerView.u uVar) {
        View o3 = uVar.o(0);
        E0(o3, 0, 0);
        com.google.android.material.carousel.b g3 = this.f5161x.g(this, o3);
        if (F2()) {
            g3 = com.google.android.material.carousel.b.n(g3, n2());
        }
        this.f5162y = com.google.android.material.carousel.c.f(this, g3, p2(), r2(), B2());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void M0(RecyclerView recyclerView, RecyclerView.u uVar) {
        super.M0(recyclerView, uVar);
        recyclerView.removeOnLayoutChangeListener(this.f5152D);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void M1(RecyclerView recyclerView, RecyclerView.z zVar, int i3) {
        a aVar = new a(recyclerView.getContext());
        aVar.p(i3);
        N1(aVar);
    }

    public final void M2() {
        this.f5162y = null;
        x1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View N0(View view, int i3, RecyclerView.u uVar, RecyclerView.z zVar) {
        int j22;
        if (O() == 0 || (j22 = j2(i3)) == Integer.MIN_VALUE) {
            return null;
        }
        if (j22 == -1) {
            if (l0(view) == 0) {
                return null;
            }
            a2(uVar, l0(N(0)) - 1, 0);
            return m2();
        }
        if (l0(view) == b() - 1) {
            return null;
        }
        a2(uVar, l0(N(O() - 1)) + 1, -1);
        return l2();
    }

    public final void N2(RecyclerView.u uVar) {
        while (O() > 0) {
            View N3 = N(0);
            float o22 = o2(N3);
            if (!H2(o22, E2(this.f5163z.g(), o22, true))) {
                break;
            } else {
                q1(N3, uVar);
            }
        }
        while (O() - 1 >= 0) {
            View N4 = N(O() - 1);
            float o23 = o2(N4);
            if (!G2(o23, E2(this.f5163z.g(), o23, true))) {
                return;
            } else {
                q1(N4, uVar);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void O0(AccessibilityEvent accessibilityEvent) {
        super.O0(accessibilityEvent);
        if (O() > 0) {
            accessibilityEvent.setFromIndex(l0(N(0)));
            accessibilityEvent.setToIndex(l0(N(O() - 1)));
        }
    }

    public final void P2(RecyclerView recyclerView, int i3) {
        if (f()) {
            recyclerView.scrollBy(i3, 0);
        } else {
            recyclerView.scrollBy(0, i3);
        }
    }

    public void Q2(int i3) {
        this.f5155G = i3;
        M2();
    }

    public final void R2(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f7054Y);
            Q2(obtainStyledAttributes.getInt(j.f7057Z, 0));
            T2(obtainStyledAttributes.getInt(j.E3, 0));
            obtainStyledAttributes.recycle();
        }
    }

    public void S2(AbstractC0532f abstractC0532f) {
        this.f5161x = abstractC0532f;
        M2();
    }

    public void T2(int i3) {
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i3);
        }
        l(null);
        AbstractC0531e abstractC0531e = this.f5151C;
        if (abstractC0531e == null || i3 != abstractC0531e.f8138a) {
            this.f5151C = AbstractC0531e.b(this, i3);
            M2();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void U(View view, Rect rect) {
        super.U(view, rect);
        float centerY = rect.centerY();
        if (f()) {
            centerY = rect.centerX();
        }
        float s22 = s2(centerY, E2(this.f5163z.g(), centerY, true));
        float width = f() ? (rect.width() - s22) / 2.0f : 0.0f;
        float height = f() ? 0.0f : (rect.height() - s22) / 2.0f;
        rect.set((int) (rect.left + width), (int) (rect.top + height), (int) (rect.right - width), (int) (rect.bottom - height));
    }

    public final void U2(View view, float f3, d dVar) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void V0(RecyclerView recyclerView, int i3, int i4) {
        super.V0(recyclerView, i3, i4);
        W2();
    }

    public final void V2(com.google.android.material.carousel.c cVar) {
        int i3 = this.f5158u;
        int i4 = this.f5157t;
        if (i3 <= i4) {
            this.f5163z = F2() ? cVar.h() : cVar.l();
        } else {
            this.f5163z = cVar.j(this.f5156s, i4, i3);
        }
        this.f5160w.j(this.f5163z.g());
    }

    public final void W2() {
        int b3 = b();
        int i3 = this.f5153E;
        if (b3 == i3 || this.f5162y == null) {
            return;
        }
        if (this.f5161x.h(this, i3)) {
            M2();
        }
        this.f5153E = b3;
    }

    public final void X1(View view, int i3, b bVar) {
        float f3 = this.f5163z.f() / 2.0f;
        j(view, i3);
        float f4 = bVar.f5167c;
        this.f5151C.k(view, (int) (f4 - f3), (int) (f4 + f3));
        U2(view, bVar.f5166b, bVar.f5168d);
    }

    public final void X2() {
        if (!this.f5159v || O() < 1) {
            return;
        }
        int i3 = 0;
        while (i3 < O() - 1) {
            int l02 = l0(N(i3));
            int i4 = i3 + 1;
            int l03 = l0(N(i4));
            if (l02 > l03) {
                I2();
                throw new IllegalStateException("Detected invalid child order. Child at index [" + i3 + "] had adapter position [" + l02 + "] and child at index [" + i4 + "] had adapter position [" + l03 + "].");
            }
            i3 = i4;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void Y0(RecyclerView recyclerView, int i3, int i4) {
        super.Y0(recyclerView, i3, i4);
        W2();
    }

    public final float Y1(float f3, float f4) {
        return F2() ? f3 - f4 : f3 + f4;
    }

    public final float Z1(float f3, float f4) {
        return F2() ? f3 + f4 : f3 - f4;
    }

    @Override // k1.InterfaceC0528b
    public int a() {
        return s0();
    }

    public final void a2(RecyclerView.u uVar, int i3, int i4) {
        if (i3 < 0 || i3 >= b()) {
            return;
        }
        b J22 = J2(uVar, e2(i3), i3);
        X1(J22.f5165a, i4, J22);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void b1(RecyclerView.u uVar, RecyclerView.z zVar) {
        if (zVar.b() <= 0 || n2() <= 0.0f) {
            o1(uVar);
            this.f5149A = 0;
            return;
        }
        boolean F22 = F2();
        boolean z3 = this.f5162y == null;
        if (z3) {
            L2(uVar);
        }
        int i22 = i2(this.f5162y);
        int f22 = f2(zVar, this.f5162y);
        this.f5157t = F22 ? f22 : i22;
        if (F22) {
            f22 = i22;
        }
        this.f5158u = f22;
        if (z3) {
            this.f5156s = i22;
            this.f5150B = this.f5162y.i(b(), this.f5157t, this.f5158u, F2());
            int i3 = this.f5154F;
            if (i3 != -1) {
                this.f5156s = C2(i3, q2(i3));
            }
        }
        int i4 = this.f5156s;
        this.f5156s = i4 + h2(0, i4, this.f5157t, this.f5158u);
        this.f5149A = F.a.b(this.f5149A, 0, zVar.b());
        V2(this.f5162y);
        B(uVar);
        k2(uVar, zVar);
        this.f5153E = b();
    }

    public final void b2(RecyclerView.u uVar, RecyclerView.z zVar, int i3) {
        float e22 = e2(i3);
        while (i3 < zVar.b()) {
            b J22 = J2(uVar, e22, i3);
            if (G2(J22.f5167c, J22.f5168d)) {
                return;
            }
            e22 = Y1(e22, this.f5163z.f());
            if (!H2(J22.f5167c, J22.f5168d)) {
                X1(J22.f5165a, -1, J22);
            }
            i3++;
        }
    }

    @Override // k1.InterfaceC0528b
    public int c() {
        return this.f5155G;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void c1(RecyclerView.z zVar) {
        super.c1(zVar);
        if (O() == 0) {
            this.f5149A = 0;
        } else {
            this.f5149A = l0(N(0));
        }
        X2();
    }

    public final void c2(RecyclerView.u uVar, int i3) {
        float e22 = e2(i3);
        while (i3 >= 0) {
            b J22 = J2(uVar, e22, i3);
            if (H2(J22.f5167c, J22.f5168d)) {
                return;
            }
            e22 = Z1(e22, this.f5163z.f());
            if (!G2(J22.f5167c, J22.f5168d)) {
                X1(J22.f5165a, 0, J22);
            }
            i3--;
        }
    }

    @Override // k1.InterfaceC0528b
    public int d() {
        return b0();
    }

    public final float d2(View view, float f3, d dVar) {
        b.c cVar = dVar.f5171a;
        float f4 = cVar.f5187b;
        b.c cVar2 = dVar.f5172b;
        float b3 = AbstractC0474a.b(f4, cVar2.f5187b, cVar.f5186a, cVar2.f5186a, f3);
        if (dVar.f5172b != this.f5163z.c() && dVar.f5171a != this.f5163z.j()) {
            return b3;
        }
        float d3 = this.f5151C.d((RecyclerView.p) view.getLayoutParams()) / this.f5163z.f();
        b.c cVar3 = dVar.f5172b;
        return b3 + ((f3 - cVar3.f5186a) * ((1.0f - cVar3.f5188c) + d3));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.y.b
    public PointF e(int i3) {
        if (this.f5162y == null) {
            return null;
        }
        int t22 = t2(i3, q2(i3));
        return f() ? new PointF(t22, 0.0f) : new PointF(0.0f, t22);
    }

    public final float e2(int i3) {
        return Y1(z2() - this.f5156s, this.f5163z.f() * i3);
    }

    @Override // k1.InterfaceC0528b
    public boolean f() {
        return this.f5151C.f8138a == 0;
    }

    public final int f2(RecyclerView.z zVar, com.google.android.material.carousel.c cVar) {
        boolean F22 = F2();
        com.google.android.material.carousel.b l3 = F22 ? cVar.l() : cVar.h();
        b.c a3 = F22 ? l3.a() : l3.h();
        int b3 = (int) (((((zVar.b() - 1) * l3.f()) * (F22 ? -1.0f : 1.0f)) - (a3.f5186a - z2())) + (w2() - a3.f5186a) + (F22 ? -a3.f5192g : a3.f5193h));
        return F22 ? Math.min(0, b3) : Math.max(0, b3);
    }

    public int g2(int i3) {
        return (int) (this.f5156s - C2(i3, q2(i3)));
    }

    public final int i2(com.google.android.material.carousel.c cVar) {
        boolean F22 = F2();
        com.google.android.material.carousel.b h3 = F22 ? cVar.h() : cVar.l();
        return (int) (z2() - Z1((F22 ? h3.h() : h3.a()).f5186a, h3.f() / 2.0f));
    }

    public final void k2(RecyclerView.u uVar, RecyclerView.z zVar) {
        N2(uVar);
        if (O() == 0) {
            c2(uVar, this.f5149A - 1);
            b2(uVar, zVar, this.f5149A);
        } else {
            int l02 = l0(N(0));
            int l03 = l0(N(O() - 1));
            c2(uVar, l02 - 1);
            b2(uVar, zVar, l03 + 1);
        }
        X2();
    }

    public final View l2() {
        return N(F2() ? 0 : O() - 1);
    }

    public final View m2() {
        return N(F2() ? O() - 1 : 0);
    }

    public final int n2() {
        return f() ? a() : d();
    }

    public final float o2(View view) {
        super.U(view, new Rect());
        return f() ? r0.centerX() : r0.centerY();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean p() {
        return f();
    }

    public final int p2() {
        int i3;
        int i4;
        if (O() <= 0) {
            return 0;
        }
        RecyclerView.p pVar = (RecyclerView.p) N(0).getLayoutParams();
        if (this.f5151C.f8138a == 0) {
            i3 = ((ViewGroup.MarginLayoutParams) pVar).leftMargin;
            i4 = ((ViewGroup.MarginLayoutParams) pVar).rightMargin;
        } else {
            i3 = ((ViewGroup.MarginLayoutParams) pVar).topMargin;
            i4 = ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
        }
        return i3 + i4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean q() {
        return !f();
    }

    public final com.google.android.material.carousel.b q2(int i3) {
        com.google.android.material.carousel.b bVar;
        Map map = this.f5150B;
        return (map == null || (bVar = (com.google.android.material.carousel.b) map.get(Integer.valueOf(F.a.b(i3, 0, Math.max(0, b() + (-1)))))) == null) ? this.f5162y.g() : bVar;
    }

    public final int r2() {
        if (R() || !this.f5161x.f()) {
            return 0;
        }
        return u2() == 1 ? k0() : i0();
    }

    public final float s2(float f3, d dVar) {
        b.c cVar = dVar.f5171a;
        float f4 = cVar.f5189d;
        b.c cVar2 = dVar.f5172b;
        return AbstractC0474a.b(f4, cVar2.f5189d, cVar.f5187b, cVar2.f5187b, f3);
    }

    public int t2(int i3, com.google.android.material.carousel.b bVar) {
        return C2(i3, bVar) - this.f5156s;
    }

    public int u2() {
        return this.f5151C.f8138a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int v(RecyclerView.z zVar) {
        if (O() == 0 || this.f5162y == null || b() <= 1) {
            return 0;
        }
        return (int) (s0() * (this.f5162y.g().f() / x(zVar)));
    }

    public final int v2() {
        return this.f5151C.e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int w(RecyclerView.z zVar) {
        return this.f5156s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean w0() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean w1(RecyclerView recyclerView, View view, Rect rect, boolean z3, boolean z4) {
        int D22;
        if (this.f5162y == null || (D22 = D2(l0(view), q2(l0(view)))) == 0) {
            return false;
        }
        P2(recyclerView, D2(l0(view), this.f5162y.j(this.f5156s + h2(D22, this.f5156s, this.f5157t, this.f5158u), this.f5157t, this.f5158u)));
        return true;
    }

    public final int w2() {
        return this.f5151C.f();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int x(RecyclerView.z zVar) {
        return this.f5158u - this.f5157t;
    }

    public final int x2() {
        return this.f5151C.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int y(RecyclerView.z zVar) {
        if (O() == 0 || this.f5162y == null || b() <= 1) {
            return 0;
        }
        return (int) (b0() * (this.f5162y.g().f() / A(zVar)));
    }

    public final int y2() {
        return this.f5151C.h();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int z(RecyclerView.z zVar) {
        return this.f5156s;
    }

    public final int z2() {
        return this.f5151C.i();
    }

    public CarouselLayoutManager(AbstractC0532f abstractC0532f) {
        this(abstractC0532f, 0);
    }

    public CarouselLayoutManager(AbstractC0532f abstractC0532f, int i3) {
        this.f5159v = false;
        this.f5160w = new c();
        this.f5149A = 0;
        this.f5152D = new View.OnLayoutChangeListener() { // from class: k1.c
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
                CarouselLayoutManager.R1(CarouselLayoutManager.this, view, i4, i5, i6, i7, i8, i9, i10, i11);
            }
        };
        this.f5154F = -1;
        this.f5155G = 0;
        S2(abstractC0532f);
        T2(i3);
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i3, int i4) {
        this.f5159v = false;
        this.f5160w = new c();
        this.f5149A = 0;
        this.f5152D = new View.OnLayoutChangeListener() { // from class: k1.c
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i42, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
                CarouselLayoutManager.R1(CarouselLayoutManager.this, view, i42, i5, i6, i7, i8, i9, i10, i11);
            }
        };
        this.f5154F = -1;
        this.f5155G = 0;
        S2(new C0533g());
        R2(context, attributeSet);
    }
}
