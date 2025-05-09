package com.google.android.material.sidesheet;

import K.AbstractC0213s;
import K.O;
import L.A;
import L.x;
import T.c;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;
import e1.h;
import e1.i;
import e1.j;
import j.AbstractC0515e;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import t1.C0730c;
import u1.AbstractC0740c;
import x1.g;
import x1.k;
import y1.AbstractC0774c;
import y1.AbstractC0775d;
import y1.C0772a;
import y1.C0773b;

/* loaded from: classes.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.b {

    /* renamed from: a, reason: collision with root package name */
    public AbstractC0774c f5460a;

    /* renamed from: b, reason: collision with root package name */
    public float f5461b;

    /* renamed from: c, reason: collision with root package name */
    public g f5462c;

    /* renamed from: d, reason: collision with root package name */
    public ColorStateList f5463d;

    /* renamed from: e, reason: collision with root package name */
    public k f5464e;

    /* renamed from: f, reason: collision with root package name */
    public final c f5465f;

    /* renamed from: g, reason: collision with root package name */
    public float f5466g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5467h;

    /* renamed from: i, reason: collision with root package name */
    public int f5468i;

    /* renamed from: j, reason: collision with root package name */
    public int f5469j;

    /* renamed from: k, reason: collision with root package name */
    public T.c f5470k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f5471l;

    /* renamed from: m, reason: collision with root package name */
    public float f5472m;

    /* renamed from: n, reason: collision with root package name */
    public int f5473n;

    /* renamed from: o, reason: collision with root package name */
    public int f5474o;

    /* renamed from: p, reason: collision with root package name */
    public int f5475p;

    /* renamed from: q, reason: collision with root package name */
    public int f5476q;

    /* renamed from: r, reason: collision with root package name */
    public WeakReference f5477r;

    /* renamed from: s, reason: collision with root package name */
    public WeakReference f5478s;

    /* renamed from: t, reason: collision with root package name */
    public int f5479t;

    /* renamed from: u, reason: collision with root package name */
    public VelocityTracker f5480u;

    /* renamed from: v, reason: collision with root package name */
    public C0730c f5481v;

    /* renamed from: w, reason: collision with root package name */
    public int f5482w;

    /* renamed from: x, reason: collision with root package name */
    public final Set f5483x;

    /* renamed from: y, reason: collision with root package name */
    public final c.AbstractC0053c f5484y;

    /* renamed from: z, reason: collision with root package name */
    public static final int f5459z = h.f6948t;

    /* renamed from: A, reason: collision with root package name */
    public static final int f5458A = i.f6953e;

    public class a extends c.AbstractC0053c {
        public a() {
        }

        @Override // T.c.AbstractC0053c
        public int a(View view, int i3, int i4) {
            return F.a.b(i3, SideSheetBehavior.this.f5460a.f(), SideSheetBehavior.this.f5460a.e());
        }

        @Override // T.c.AbstractC0053c
        public int b(View view, int i3, int i4) {
            return view.getTop();
        }

        @Override // T.c.AbstractC0053c
        public int d(View view) {
            return SideSheetBehavior.this.f5473n + SideSheetBehavior.this.d0();
        }

        @Override // T.c.AbstractC0053c
        public void j(int i3) {
            if (i3 == 1 && SideSheetBehavior.this.f5467h) {
                SideSheetBehavior.this.z0(1);
            }
        }

        @Override // T.c.AbstractC0053c
        public void k(View view, int i3, int i4, int i5, int i6) {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            View Z2 = SideSheetBehavior.this.Z();
            if (Z2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) Z2.getLayoutParams()) != null) {
                SideSheetBehavior.this.f5460a.n(marginLayoutParams, view.getLeft(), view.getRight());
                Z2.setLayoutParams(marginLayoutParams);
            }
            SideSheetBehavior.this.V(view, i3);
        }

        @Override // T.c.AbstractC0053c
        public void l(View view, float f3, float f4) {
            int R3 = SideSheetBehavior.this.R(view, f3, f4);
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            sideSheetBehavior.E0(view, R3, sideSheetBehavior.D0());
        }

        @Override // T.c.AbstractC0053c
        public boolean m(View view, int i3) {
            return (SideSheetBehavior.this.f5468i == 1 || SideSheetBehavior.this.f5477r == null || SideSheetBehavior.this.f5477r.get() != view) ? false : true;
        }
    }

    public class c {

        /* renamed from: a, reason: collision with root package name */
        public int f5487a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f5488b;

        /* renamed from: c, reason: collision with root package name */
        public final Runnable f5489c = new Runnable() { // from class: y1.g
            @Override // java.lang.Runnable
            public final void run() {
                SideSheetBehavior.c.a(SideSheetBehavior.c.this);
            }
        };

        public c() {
        }

        public static /* synthetic */ void a(c cVar) {
            cVar.f5488b = false;
            if (SideSheetBehavior.this.f5470k != null && SideSheetBehavior.this.f5470k.k(true)) {
                cVar.b(cVar.f5487a);
            } else if (SideSheetBehavior.this.f5468i == 2) {
                SideSheetBehavior.this.z0(cVar.f5487a);
            }
        }

        public void b(int i3) {
            if (SideSheetBehavior.this.f5477r == null || SideSheetBehavior.this.f5477r.get() == null) {
                return;
            }
            this.f5487a = i3;
            if (this.f5488b) {
                return;
            }
            O.b0((View) SideSheetBehavior.this.f5477r.get(), this.f5489c);
            this.f5488b = true;
        }
    }

    public SideSheetBehavior() {
        this.f5465f = new c();
        this.f5467h = true;
        this.f5468i = 5;
        this.f5469j = 5;
        this.f5472m = 0.1f;
        this.f5479t = -1;
        this.f5483x = new LinkedHashSet();
        this.f5484y = new a();
    }

    private boolean A0() {
        if (this.f5470k != null) {
            return this.f5467h || this.f5468i == 1;
        }
        return false;
    }

    public static /* synthetic */ boolean E(SideSheetBehavior sideSheetBehavior, int i3, View view, A.a aVar) {
        sideSheetBehavior.y0(i3);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E0(View view, int i3, boolean z3) {
        if (!p0(view, i3, z3)) {
            z0(i3);
        } else {
            z0(2);
            this.f5465f.b(i3);
        }
    }

    public static /* synthetic */ void F(SideSheetBehavior sideSheetBehavior, int i3) {
        View view = (View) sideSheetBehavior.f5477r.get();
        if (view != null) {
            sideSheetBehavior.E0(view, i3, false);
        }
    }

    private void F0() {
        View view;
        WeakReference weakReference = this.f5477r;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        O.d0(view, 262144);
        O.d0(view, 1048576);
        if (this.f5468i != 5) {
            r0(view, x.a.f1296y, 5);
        }
        if (this.f5468i != 3) {
            r0(view, x.a.f1294w, 3);
        }
    }

    private A T(final int i3) {
        return new A() { // from class: y1.e
            @Override // L.A
            public final boolean a(View view, A.a aVar) {
                return SideSheetBehavior.E(SideSheetBehavior.this, i3, view, aVar);
            }
        };
    }

    private void U(Context context) {
        if (this.f5464e == null) {
            return;
        }
        g gVar = new g(this.f5464e);
        this.f5462c = gVar;
        gVar.J(context);
        ColorStateList colorStateList = this.f5463d;
        if (colorStateList != null) {
            this.f5462c.T(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.f5462c.setTint(typedValue.data);
    }

    private int X(int i3, int i4, int i5, int i6) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, i4, i6);
        if (i5 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i5), 1073741824);
        }
        if (size != 0) {
            i5 = Math.min(size, i5);
        }
        return View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
    }

    private void r0(View view, x.a aVar, int i3) {
        O.f0(view, aVar, null, T(i3));
    }

    private void t0(View view, Runnable runnable) {
        if (o0(view)) {
            view.post(runnable);
        } else {
            runnable.run();
        }
    }

    public boolean B0(View view, float f3) {
        return this.f5460a.m(view, f3);
    }

    public final boolean C0(View view) {
        return (view.isShown() || O.l(view) != null) && this.f5467h;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f5468i == 1 && actionMasked == 0) {
            return true;
        }
        if (A0()) {
            this.f5470k.z(motionEvent);
        }
        if (actionMasked == 0) {
            s0();
        }
        if (this.f5480u == null) {
            this.f5480u = VelocityTracker.obtain();
        }
        this.f5480u.addMovement(motionEvent);
        if (A0() && actionMasked == 2 && !this.f5471l && m0(motionEvent)) {
            this.f5470k.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f5471l;
    }

    public boolean D0() {
        return true;
    }

    public final void G0(k kVar) {
        g gVar = this.f5462c;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(kVar);
        }
    }

    public final void H0(View view) {
        int i3 = this.f5468i == 5 ? 4 : 0;
        if (view.getVisibility() != i3) {
            view.setVisibility(i3);
        }
    }

    public final int P(int i3, View view) {
        int i4 = this.f5468i;
        if (i4 == 1 || i4 == 2) {
            return i3 - this.f5460a.g(view);
        }
        if (i4 == 3) {
            return 0;
        }
        if (i4 == 5) {
            return this.f5460a.d();
        }
        throw new IllegalStateException("Unexpected value: " + this.f5468i);
    }

    public final float Q(float f3, float f4) {
        return Math.abs(f3 - f4);
    }

    public final int R(View view, float f3, float f4) {
        if (n0(f3)) {
            return 3;
        }
        if (B0(view, f3)) {
            return (this.f5460a.l(f3, f4) || this.f5460a.k(view)) ? 5 : 3;
        }
        if (f3 != 0.0f && AbstractC0775d.a(f3, f4)) {
            return 5;
        }
        int left = view.getLeft();
        return Math.abs(left - a0()) < Math.abs(left - this.f5460a.d()) ? 3 : 5;
    }

    public final void S() {
        WeakReference weakReference = this.f5478s;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f5478s = null;
    }

    public final void V(View view, int i3) {
        if (this.f5483x.isEmpty()) {
            return;
        }
        this.f5460a.b(i3);
        Iterator it = this.f5483x.iterator();
        if (it.hasNext()) {
            AbstractC0515e.a(it.next());
            throw null;
        }
    }

    public final void W(View view) {
        if (O.l(view) == null) {
            O.m0(view, view.getResources().getString(f5459z));
        }
    }

    public int Y() {
        return this.f5473n;
    }

    public View Z() {
        WeakReference weakReference = this.f5478s;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public int a0() {
        return this.f5460a.c();
    }

    public float b0() {
        return this.f5472m;
    }

    public float c0() {
        return 0.5f;
    }

    public int d0() {
        return this.f5476q;
    }

    public int e0(int i3) {
        if (i3 == 3) {
            return a0();
        }
        if (i3 == 5) {
            return this.f5460a.d();
        }
        throw new IllegalArgumentException("Invalid state to get outer edge offset: " + i3);
    }

    public int f0() {
        return this.f5475p;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public void g(CoordinatorLayout.e eVar) {
        super.g(eVar);
        this.f5477r = null;
        this.f5470k = null;
        this.f5481v = null;
    }

    public int g0() {
        return this.f5474o;
    }

    public int h0() {
        return 500;
    }

    public T.c i0() {
        return this.f5470k;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public void j() {
        super.j();
        this.f5477r = null;
        this.f5470k = null;
        this.f5481v = null;
    }

    public final CoordinatorLayout.e j0() {
        View view;
        WeakReference weakReference = this.f5477r;
        if (weakReference == null || (view = (View) weakReference.get()) == null || !(view.getLayoutParams() instanceof CoordinatorLayout.e)) {
            return null;
        }
        return (CoordinatorLayout.e) view.getLayoutParams();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        T.c cVar;
        if (!C0(view)) {
            this.f5471l = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            s0();
        }
        if (this.f5480u == null) {
            this.f5480u = VelocityTracker.obtain();
        }
        this.f5480u.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f5482w = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f5471l) {
            this.f5471l = false;
            return false;
        }
        return (this.f5471l || (cVar = this.f5470k) == null || !cVar.G(motionEvent)) ? false : true;
    }

    public final boolean k0() {
        CoordinatorLayout.e j02 = j0();
        return j02 != null && ((ViewGroup.MarginLayoutParams) j02).leftMargin > 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i3) {
        if (O.t(coordinatorLayout) && !O.t(view)) {
            view.setFitsSystemWindows(true);
        }
        if (this.f5477r == null) {
            this.f5477r = new WeakReference(view);
            this.f5481v = new C0730c(view);
            g gVar = this.f5462c;
            if (gVar != null) {
                O.n0(view, gVar);
                g gVar2 = this.f5462c;
                float f3 = this.f5466g;
                if (f3 == -1.0f) {
                    f3 = O.r(view);
                }
                gVar2.S(f3);
            } else {
                ColorStateList colorStateList = this.f5463d;
                if (colorStateList != null) {
                    O.o0(view, colorStateList);
                }
            }
            H0(view);
            F0();
            if (O.u(view) == 0) {
                O.r0(view, 1);
            }
            W(view);
        }
        x0(view, i3);
        if (this.f5470k == null) {
            this.f5470k = T.c.m(coordinatorLayout, this.f5484y);
        }
        int g3 = this.f5460a.g(view);
        coordinatorLayout.G(view, i3);
        this.f5474o = coordinatorLayout.getWidth();
        this.f5475p = this.f5460a.h(coordinatorLayout);
        this.f5473n = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        this.f5476q = marginLayoutParams != null ? this.f5460a.a(marginLayoutParams) : 0;
        O.T(view, P(g3, view));
        q0(coordinatorLayout);
        Iterator it = this.f5483x.iterator();
        while (it.hasNext()) {
            AbstractC0515e.a(it.next());
        }
        return true;
    }

    public final boolean l0() {
        CoordinatorLayout.e j02 = j0();
        return j02 != null && ((ViewGroup.MarginLayoutParams) j02).rightMargin > 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i3, int i4, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(X(i3, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i4, -1, marginLayoutParams.width), X(i5, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i6, -1, marginLayoutParams.height));
        return true;
    }

    public final boolean m0(MotionEvent motionEvent) {
        return A0() && Q((float) this.f5482w, motionEvent.getX()) > ((float) this.f5470k.u());
    }

    public final boolean n0(float f3) {
        return this.f5460a.j(f3);
    }

    public final boolean o0(View view) {
        ViewParent parent = view.getParent();
        return parent != null && parent.isLayoutRequested() && O.N(view);
    }

    public final boolean p0(View view, int i3, boolean z3) {
        int e02 = e0(i3);
        T.c i02 = i0();
        if (i02 != null) {
            return z3 ? i02.F(e02, view.getTop()) : i02.H(view, e02, view.getTop());
        }
        return false;
    }

    public final void q0(CoordinatorLayout coordinatorLayout) {
        int i3;
        View findViewById;
        if (this.f5478s != null || (i3 = this.f5479t) == -1 || (findViewById = coordinatorLayout.findViewById(i3)) == null) {
            return;
        }
        this.f5478s = new WeakReference(findViewById);
    }

    public final void s0() {
        VelocityTracker velocityTracker = this.f5480u;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f5480u = null;
        }
    }

    public void u0(int i3) {
        this.f5479t = i3;
        S();
        WeakReference weakReference = this.f5477r;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (i3 == -1 || !O.O(view)) {
                return;
            }
            view.requestLayout();
        }
    }

    public void v0(boolean z3) {
        this.f5467h = z3;
    }

    public final void w0(int i3) {
        AbstractC0774c abstractC0774c = this.f5460a;
        if (abstractC0774c == null || abstractC0774c.i() != i3) {
            if (i3 == 0) {
                this.f5460a = new C0773b(this);
                if (this.f5464e == null || l0()) {
                    return;
                }
                k.b v3 = this.f5464e.v();
                v3.E(0.0f).w(0.0f);
                G0(v3.m());
                return;
            }
            if (i3 == 1) {
                this.f5460a = new C0772a(this);
                if (this.f5464e == null || k0()) {
                    return;
                }
                k.b v4 = this.f5464e.v();
                v4.A(0.0f).s(0.0f);
                G0(v4.m());
                return;
            }
            throw new IllegalArgumentException("Invalid sheet edge position value: " + i3 + ". Must be 0 or 1.");
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public void x(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        b bVar = (b) parcelable;
        if (bVar.a() != null) {
            super.x(coordinatorLayout, view, bVar.a());
        }
        int i3 = bVar.f5486g;
        if (i3 == 1 || i3 == 2) {
            i3 = 5;
        }
        this.f5468i = i3;
        this.f5469j = i3;
    }

    public final void x0(View view, int i3) {
        w0(AbstractC0213s.b(((CoordinatorLayout.e) view.getLayoutParams()).f3472c, i3) == 3 ? 1 : 0);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public Parcelable y(CoordinatorLayout coordinatorLayout, View view) {
        return new b(super.y(coordinatorLayout, view), this);
    }

    public void y0(final int i3) {
        if (i3 == 1 || i3 == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("STATE_");
            sb.append(i3 == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        }
        WeakReference weakReference = this.f5477r;
        if (weakReference == null || weakReference.get() == null) {
            z0(i3);
        } else {
            t0((View) this.f5477r.get(), new Runnable() { // from class: y1.f
                @Override // java.lang.Runnable
                public final void run() {
                    SideSheetBehavior.F(SideSheetBehavior.this, i3);
                }
            });
        }
    }

    public void z0(int i3) {
        View view;
        if (this.f5468i == i3) {
            return;
        }
        this.f5468i = i3;
        if (i3 == 3 || i3 == 5) {
            this.f5469j = i3;
        }
        WeakReference weakReference = this.f5477r;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        H0(view);
        Iterator it = this.f5483x.iterator();
        if (it.hasNext()) {
            AbstractC0515e.a(it.next());
            throw null;
        }
        F0();
    }

    public static class b extends S.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: g, reason: collision with root package name */
        public final int f5486g;

        public class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i3) {
                return new b[i3];
            }
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f5486g = parcel.readInt();
        }

        @Override // S.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i3) {
            super.writeToParcel(parcel, i3);
            parcel.writeInt(this.f5486g);
        }

        public b(Parcelable parcelable, SideSheetBehavior sideSheetBehavior) {
            super(parcelable);
            this.f5486g = sideSheetBehavior.f5468i;
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5465f = new c();
        this.f5467h = true;
        this.f5468i = 5;
        this.f5469j = 5;
        this.f5472m = 0.1f;
        this.f5479t = -1;
        this.f5483x = new LinkedHashSet();
        this.f5484y = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.W3);
        int i3 = j.Y3;
        if (obtainStyledAttributes.hasValue(i3)) {
            this.f5463d = AbstractC0740c.a(context, obtainStyledAttributes, i3);
        }
        if (obtainStyledAttributes.hasValue(j.b4)) {
            this.f5464e = k.e(context, attributeSet, 0, f5458A).m();
        }
        int i4 = j.a4;
        if (obtainStyledAttributes.hasValue(i4)) {
            u0(obtainStyledAttributes.getResourceId(i4, -1));
        }
        U(context);
        this.f5466g = obtainStyledAttributes.getDimension(j.X3, -1.0f);
        v0(obtainStyledAttributes.getBoolean(j.Z3, true));
        obtainStyledAttributes.recycle();
        this.f5461b = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
