package com.google.android.material.behavior;

import K.O;
import L.A;
import L.x;
import T.c;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.b {

    /* renamed from: a, reason: collision with root package name */
    public T.c f5006a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5007b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5008c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5010e;

    /* renamed from: d, reason: collision with root package name */
    public float f5009d = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public int f5011f = 2;

    /* renamed from: g, reason: collision with root package name */
    public float f5012g = 0.5f;

    /* renamed from: h, reason: collision with root package name */
    public float f5013h = 0.0f;

    /* renamed from: i, reason: collision with root package name */
    public float f5014i = 0.5f;

    /* renamed from: j, reason: collision with root package name */
    public final c.AbstractC0053c f5015j = new a();

    public class a extends c.AbstractC0053c {

        /* renamed from: a, reason: collision with root package name */
        public int f5016a;

        /* renamed from: b, reason: collision with root package name */
        public int f5017b = -1;

        public a() {
        }

        @Override // T.c.AbstractC0053c
        public int a(View view, int i3, int i4) {
            int width;
            int width2;
            int width3;
            boolean z3 = O.w(view) == 1;
            int i5 = SwipeDismissBehavior.this.f5011f;
            if (i5 == 0) {
                if (z3) {
                    width = this.f5016a - view.getWidth();
                    width2 = this.f5016a;
                } else {
                    width = this.f5016a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i5 != 1) {
                width = this.f5016a - view.getWidth();
                width2 = view.getWidth() + this.f5016a;
            } else if (z3) {
                width = this.f5016a;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.f5016a - view.getWidth();
                width2 = this.f5016a;
            }
            return SwipeDismissBehavior.H(width, i3, width2);
        }

        @Override // T.c.AbstractC0053c
        public int b(View view, int i3, int i4) {
            return view.getTop();
        }

        @Override // T.c.AbstractC0053c
        public int d(View view) {
            return view.getWidth();
        }

        @Override // T.c.AbstractC0053c
        public void i(View view, int i3) {
            this.f5017b = i3;
            this.f5016a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior.this.f5008c = true;
                parent.requestDisallowInterceptTouchEvent(true);
                SwipeDismissBehavior.this.f5008c = false;
            }
        }

        @Override // T.c.AbstractC0053c
        public void j(int i3) {
            SwipeDismissBehavior.this.getClass();
        }

        @Override // T.c.AbstractC0053c
        public void k(View view, int i3, int i4, int i5, int i6) {
            float width = view.getWidth() * SwipeDismissBehavior.this.f5013h;
            float width2 = view.getWidth() * SwipeDismissBehavior.this.f5014i;
            float abs = Math.abs(i3 - this.f5016a);
            if (abs <= width) {
                view.setAlpha(1.0f);
            } else if (abs >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.G(0.0f, 1.0f - SwipeDismissBehavior.J(width, width2, abs), 1.0f));
            }
        }

        @Override // T.c.AbstractC0053c
        public void l(View view, float f3, float f4) {
            int i3;
            boolean z3;
            this.f5017b = -1;
            int width = view.getWidth();
            if (n(view, f3)) {
                if (f3 >= 0.0f) {
                    int left = view.getLeft();
                    int i4 = this.f5016a;
                    if (left >= i4) {
                        i3 = i4 + width;
                        z3 = true;
                    }
                }
                i3 = this.f5016a - width;
                z3 = true;
            } else {
                i3 = this.f5016a;
                z3 = false;
            }
            if (SwipeDismissBehavior.this.f5006a.F(i3, view.getTop())) {
                O.b0(view, new c(view, z3));
            } else if (z3) {
                SwipeDismissBehavior.this.getClass();
            }
        }

        @Override // T.c.AbstractC0053c
        public boolean m(View view, int i3) {
            int i4 = this.f5017b;
            return (i4 == -1 || i4 == i3) && SwipeDismissBehavior.this.F(view);
        }

        public final boolean n(View view, float f3) {
            if (f3 == 0.0f) {
                return Math.abs(view.getLeft() - this.f5016a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.f5012g);
            }
            boolean z3 = O.w(view) == 1;
            int i3 = SwipeDismissBehavior.this.f5011f;
            if (i3 == 2) {
                return true;
            }
            if (i3 == 0) {
                return z3 ? f3 < 0.0f : f3 > 0.0f;
            }
            if (i3 == 1) {
                if (z3) {
                    return f3 > 0.0f;
                }
                if (f3 < 0.0f) {
                    return true;
                }
            }
            return false;
        }
    }

    public class b implements A {
        public b() {
        }

        @Override // L.A
        public boolean a(View view, A.a aVar) {
            if (!SwipeDismissBehavior.this.F(view)) {
                return false;
            }
            boolean z3 = O.w(view) == 1;
            int i3 = SwipeDismissBehavior.this.f5011f;
            O.T(view, (!(i3 == 0 && z3) && (i3 != 1 || z3)) ? view.getWidth() : -view.getWidth());
            view.setAlpha(0.0f);
            SwipeDismissBehavior.this.getClass();
            return true;
        }
    }

    public class c implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        public final View f5020e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f5021f;

        public c(View view, boolean z3) {
            this.f5020e = view;
            this.f5021f = z3;
        }

        @Override // java.lang.Runnable
        public void run() {
            T.c cVar = SwipeDismissBehavior.this.f5006a;
            if (cVar != null && cVar.k(true)) {
                O.b0(this.f5020e, this);
            } else if (this.f5021f) {
                SwipeDismissBehavior.this.getClass();
            }
        }
    }

    public static float G(float f3, float f4, float f5) {
        return Math.min(Math.max(f3, f4), f5);
    }

    public static int H(int i3, int i4, int i5) {
        return Math.min(Math.max(i3, i4), i5);
    }

    public static float J(float f3, float f4, float f5) {
        return (f5 - f3) / (f4 - f3);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (this.f5006a == null) {
            return false;
        }
        if (this.f5008c && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f5006a.z(motionEvent);
        return true;
    }

    public boolean F(View view) {
        return true;
    }

    public final void I(ViewGroup viewGroup) {
        if (this.f5006a == null) {
            this.f5006a = this.f5010e ? T.c.l(viewGroup, this.f5009d, this.f5015j) : T.c.m(viewGroup, this.f5015j);
        }
    }

    public void K(float f3) {
        this.f5014i = G(0.0f, f3, 1.0f);
    }

    public void L(float f3) {
        this.f5013h = G(0.0f, f3, 1.0f);
    }

    public void M(int i3) {
        this.f5011f = i3;
    }

    public final void N(View view) {
        O.d0(view, 1048576);
        if (F(view)) {
            O.f0(view, x.a.f1296y, null, new b());
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z3 = this.f5007b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z3 = coordinatorLayout.z(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f5007b = z3;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f5007b = false;
        }
        if (z3) {
            I(coordinatorLayout);
            if (!this.f5008c && this.f5006a.G(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i3) {
        boolean l3 = super.l(coordinatorLayout, view, i3);
        if (O.u(view) == 0) {
            O.r0(view, 1);
            N(view);
        }
        return l3;
    }
}
