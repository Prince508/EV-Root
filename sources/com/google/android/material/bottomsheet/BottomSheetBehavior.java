package com.google.android.material.bottomsheet;

import K.O;
import L.A;
import L.x;
import T.c;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import e1.AbstractC0464a;
import e1.h;
import e1.i;
import e1.j;
import h1.C0489c;
import j.AbstractC0515e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import r1.n;
import t1.C0729b;
import u1.AbstractC0740c;
import x1.k;

/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.b {

    /* renamed from: i0, reason: collision with root package name */
    public static final int f5031i0 = i.f6950b;

    /* renamed from: A, reason: collision with root package name */
    public boolean f5032A;

    /* renamed from: B, reason: collision with root package name */
    public final g f5033B;

    /* renamed from: C, reason: collision with root package name */
    public ValueAnimator f5034C;

    /* renamed from: D, reason: collision with root package name */
    public int f5035D;

    /* renamed from: E, reason: collision with root package name */
    public int f5036E;

    /* renamed from: F, reason: collision with root package name */
    public int f5037F;

    /* renamed from: G, reason: collision with root package name */
    public float f5038G;

    /* renamed from: H, reason: collision with root package name */
    public int f5039H;

    /* renamed from: I, reason: collision with root package name */
    public float f5040I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f5041J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f5042K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f5043L;

    /* renamed from: M, reason: collision with root package name */
    public int f5044M;

    /* renamed from: N, reason: collision with root package name */
    public int f5045N;

    /* renamed from: O, reason: collision with root package name */
    public T.c f5046O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f5047P;

    /* renamed from: Q, reason: collision with root package name */
    public int f5048Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f5049R;

    /* renamed from: S, reason: collision with root package name */
    public float f5050S;

    /* renamed from: T, reason: collision with root package name */
    public int f5051T;

    /* renamed from: U, reason: collision with root package name */
    public int f5052U;

    /* renamed from: V, reason: collision with root package name */
    public int f5053V;

    /* renamed from: W, reason: collision with root package name */
    public WeakReference f5054W;

    /* renamed from: X, reason: collision with root package name */
    public WeakReference f5055X;

    /* renamed from: Y, reason: collision with root package name */
    public WeakReference f5056Y;

    /* renamed from: Z, reason: collision with root package name */
    public final ArrayList f5057Z;

    /* renamed from: a, reason: collision with root package name */
    public int f5058a;

    /* renamed from: a0, reason: collision with root package name */
    public VelocityTracker f5059a0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5060b;

    /* renamed from: b0, reason: collision with root package name */
    public C0729b f5061b0;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5062c;

    /* renamed from: c0, reason: collision with root package name */
    public int f5063c0;

    /* renamed from: d, reason: collision with root package name */
    public float f5064d;

    /* renamed from: d0, reason: collision with root package name */
    public int f5065d0;

    /* renamed from: e, reason: collision with root package name */
    public int f5066e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f5067e0;

    /* renamed from: f, reason: collision with root package name */
    public int f5068f;

    /* renamed from: f0, reason: collision with root package name */
    public Map f5069f0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5070g;

    /* renamed from: g0, reason: collision with root package name */
    public final SparseIntArray f5071g0;

    /* renamed from: h, reason: collision with root package name */
    public int f5072h;

    /* renamed from: h0, reason: collision with root package name */
    public final c.AbstractC0053c f5073h0;

    /* renamed from: i, reason: collision with root package name */
    public int f5074i;

    /* renamed from: j, reason: collision with root package name */
    public x1.g f5075j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f5076k;

    /* renamed from: l, reason: collision with root package name */
    public int f5077l;

    /* renamed from: m, reason: collision with root package name */
    public int f5078m;

    /* renamed from: n, reason: collision with root package name */
    public int f5079n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f5080o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f5081p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f5082q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f5083r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f5084s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f5085t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f5086u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f5087v;

    /* renamed from: w, reason: collision with root package name */
    public int f5088w;

    /* renamed from: x, reason: collision with root package name */
    public int f5089x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f5090y;

    /* renamed from: z, reason: collision with root package name */
    public k f5091z;

    public class a implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ View f5092e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f5093f;

        public a(View view, int i3) {
            this.f5092e = view;
            this.f5093f = i3;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.V0(this.f5092e, this.f5093f, false);
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {
        public b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f5075j != null) {
                BottomSheetBehavior.this.f5075j.U(floatValue);
            }
        }
    }

    public class c implements n.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f5096a;

        public c(boolean z3) {
            this.f5096a = z3;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00b4  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00c3  */
        @Override // r1.n.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public K.C0205k0 a(android.view.View r11, K.C0205k0 r12, r1.n.d r13) {
            /*
                r10 = this;
                int r0 = K.C0205k0.m.h()
                C.b r0 = r12.f(r0)
                int r1 = K.C0205k0.m.e()
                C.b r1 = r12.f(r1)
                com.google.android.material.bottomsheet.BottomSheetBehavior r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r3 = r0.f129b
                com.google.android.material.bottomsheet.BottomSheetBehavior.P(r2, r3)
                boolean r2 = r1.n.g(r11)
                int r3 = r11.getPaddingBottom()
                int r4 = r11.getPaddingLeft()
                int r5 = r11.getPaddingRight()
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.Q(r6)
                if (r6 == 0) goto L41
                com.google.android.material.bottomsheet.BottomSheetBehavior r3 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r6 = r12.h()
                com.google.android.material.bottomsheet.BottomSheetBehavior.S(r3, r6)
                int r3 = r13.f8993d
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.R(r6)
                int r3 = r3 + r6
            L41:
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.T(r6)
                if (r6 == 0) goto L53
                if (r2 == 0) goto L4e
                int r4 = r13.f8992c
                goto L50
            L4e:
                int r4 = r13.f8990a
            L50:
                int r6 = r0.f128a
                int r4 = r4 + r6
            L53:
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.U(r6)
                if (r6 == 0) goto L66
                if (r2 == 0) goto L60
                int r13 = r13.f8990a
                goto L62
            L60:
                int r13 = r13.f8992c
            L62:
                int r2 = r0.f130c
                int r5 = r13 + r2
            L66:
                android.view.ViewGroup$LayoutParams r13 = r11.getLayoutParams()
                android.view.ViewGroup$MarginLayoutParams r13 = (android.view.ViewGroup.MarginLayoutParams) r13
                com.google.android.material.bottomsheet.BottomSheetBehavior r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.V(r2)
                r6 = 0
                r7 = 1
                if (r2 == 0) goto L80
                int r2 = r13.leftMargin
                int r8 = r0.f128a
                if (r2 == r8) goto L80
                r13.leftMargin = r8
                r2 = r7
                goto L81
            L80:
                r2 = r6
            L81:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.W(r8)
                if (r8 == 0) goto L92
                int r8 = r13.rightMargin
                int r9 = r0.f130c
                if (r8 == r9) goto L92
                r13.rightMargin = r9
                r2 = r7
            L92:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.F(r8)
                if (r8 == 0) goto La3
                int r8 = r13.topMargin
                int r0 = r0.f129b
                if (r8 == r0) goto La3
                r13.topMargin = r0
                goto La4
            La3:
                r7 = r2
            La4:
                if (r7 == 0) goto La9
                r11.setLayoutParams(r13)
            La9:
                int r13 = r11.getPaddingTop()
                r11.setPadding(r4, r13, r5, r3)
                boolean r11 = r10.f5096a
                if (r11 == 0) goto Lbb
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r13 = r1.f131d
                com.google.android.material.bottomsheet.BottomSheetBehavior.G(r11, r13)
            Lbb:
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.Q(r11)
                if (r11 != 0) goto Lc9
                boolean r11 = r10.f5096a
                if (r11 == 0) goto Lc8
                goto Lc9
            Lc8:
                return r12
            Lc9:
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                com.google.android.material.bottomsheet.BottomSheetBehavior.H(r11, r6)
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.c.a(android.view.View, K.k0, r1.n$d):K.k0");
        }
    }

    public class d extends c.AbstractC0053c {

        /* renamed from: a, reason: collision with root package name */
        public long f5098a;

        public d() {
        }

        @Override // T.c.AbstractC0053c
        public int a(View view, int i3, int i4) {
            return view.getLeft();
        }

        @Override // T.c.AbstractC0053c
        public int b(View view, int i3, int i4) {
            return F.a.b(i3, BottomSheetBehavior.this.m0(), e(view));
        }

        @Override // T.c.AbstractC0053c
        public int e(View view) {
            return BottomSheetBehavior.this.e0() ? BottomSheetBehavior.this.f5053V : BottomSheetBehavior.this.f5039H;
        }

        @Override // T.c.AbstractC0053c
        public void j(int i3) {
            if (i3 == 1 && BottomSheetBehavior.this.f5043L) {
                BottomSheetBehavior.this.O0(1);
            }
        }

        @Override // T.c.AbstractC0053c
        public void k(View view, int i3, int i4, int i5, int i6) {
            BottomSheetBehavior.this.j0(i4);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
        
            if (r7.f5099b.Q0(r0, (r9 * 100.0f) / r10.f5053V) != false) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x003b, code lost:
        
            if (r9 > r7.f5099b.f5037F) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0090, code lost:
        
            if (java.lang.Math.abs(r8.getTop() - r7.f5099b.m0()) < java.lang.Math.abs(r8.getTop() - r7.f5099b.f5037F)) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00cf, code lost:
        
            if (r7.f5099b.T0() == false) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00f1, code lost:
        
            if (java.lang.Math.abs(r9 - r7.f5099b.f5036E) < java.lang.Math.abs(r9 - r7.f5099b.f5039H)) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x010d, code lost:
        
            if (r7.f5099b.T0() != false) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x0127, code lost:
        
            if (r7.f5099b.T0() == false) goto L63;
         */
        @Override // T.c.AbstractC0053c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void l(android.view.View r8, float r9, float r10) {
            /*
                Method dump skipped, instructions count: 308
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.d.l(android.view.View, float, float):void");
        }

        @Override // T.c.AbstractC0053c
        public boolean m(View view, int i3) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i4 = bottomSheetBehavior.f5044M;
            if (i4 == 1 || bottomSheetBehavior.f5067e0) {
                return false;
            }
            if (i4 == 3 && bottomSheetBehavior.f5063c0 == i3) {
                WeakReference weakReference = bottomSheetBehavior.f5056Y;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.f5098a = System.currentTimeMillis();
            WeakReference weakReference2 = BottomSheetBehavior.this.f5054W;
            return weakReference2 != null && weakReference2.get() == view;
        }

        public final boolean n(View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.f5053V + bottomSheetBehavior.m0()) / 2;
        }
    }

    public class e implements A {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f5100a;

        public e(int i3) {
            this.f5100a = i3;
        }

        @Override // L.A
        public boolean a(View view, A.a aVar) {
            BottomSheetBehavior.this.N0(this.f5100a);
            return true;
        }
    }

    public BottomSheetBehavior() {
        this.f5058a = 0;
        this.f5060b = true;
        this.f5062c = false;
        this.f5077l = -1;
        this.f5078m = -1;
        this.f5033B = new g(this, null);
        this.f5038G = 0.5f;
        this.f5040I = -1.0f;
        this.f5043L = true;
        this.f5044M = 4;
        this.f5045N = 4;
        this.f5050S = 0.1f;
        this.f5057Z = new ArrayList();
        this.f5065d0 = -1;
        this.f5071g0 = new SparseIntArray();
        this.f5073h0 = new d();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i3, int i4) {
        this.f5048Q = 0;
        this.f5049R = false;
        return (i3 & 2) != 0;
    }

    public void A0(boolean z3) {
        this.f5043L = z3;
    }

    public void B0(int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.f5035D = i3;
        Y0(this.f5044M, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0035, code lost:
    
        if (r4.getTop() <= r2.f5037F) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a9, code lost:
    
        r0 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0065, code lost:
    
        if (java.lang.Math.abs(r3 - r2.f5036E) < java.lang.Math.abs(r3 - r2.f5039H)) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007b, code lost:
    
        if (T0() != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008b, code lost:
    
        if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.f5039H)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a7, code lost:
    
        if (java.lang.Math.abs(r3 - r2.f5037F) < java.lang.Math.abs(r3 - r2.f5039H)) goto L51;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void C(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.m0()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.O0(r0)
            return
        Lf:
            boolean r3 = r2.v0()
            if (r3 == 0) goto L24
            java.lang.ref.WeakReference r3 = r2.f5056Y
            if (r3 == 0) goto L23
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto L23
            boolean r3 = r2.f5049R
            if (r3 != 0) goto L24
        L23:
            return
        L24:
            int r3 = r2.f5048Q
            r5 = 6
            if (r3 <= 0) goto L39
            boolean r3 = r2.f5060b
            if (r3 == 0) goto L2f
            goto Laa
        L2f:
            int r3 = r4.getTop()
            int r6 = r2.f5037F
            if (r3 <= r6) goto Laa
            goto La9
        L39:
            boolean r3 = r2.f5041J
            if (r3 == 0) goto L49
            float r3 = r2.o0()
            boolean r3 = r2.S0(r4, r3)
            if (r3 == 0) goto L49
            r0 = 5
            goto Laa
        L49:
            int r3 = r2.f5048Q
            r6 = 4
            if (r3 != 0) goto L8e
            int r3 = r4.getTop()
            boolean r1 = r2.f5060b
            if (r1 == 0) goto L68
            int r5 = r2.f5036E
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.f5039H
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L92
            goto Laa
        L68:
            int r1 = r2.f5037F
            if (r3 >= r1) goto L7e
            int r1 = r2.f5039H
            int r1 = r3 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r3 >= r1) goto L77
            goto Laa
        L77:
            boolean r3 = r2.T0()
            if (r3 == 0) goto La9
            goto L92
        L7e:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f5039H
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
            goto La9
        L8e:
            boolean r3 = r2.f5060b
            if (r3 == 0) goto L94
        L92:
            r0 = r6
            goto Laa
        L94:
            int r3 = r4.getTop()
            int r0 = r2.f5037F
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.f5039H
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
        La9:
            r0 = r5
        Laa:
            r3 = 0
            r2.V0(r4, r0, r3)
            r2.f5049R = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    public void C0(boolean z3) {
        if (this.f5060b == z3) {
            return;
        }
        this.f5060b = z3;
        if (this.f5054W != null) {
            Y();
        }
        O0((this.f5060b && this.f5044M == 6) ? 3 : this.f5044M);
        Y0(this.f5044M, true);
        W0();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f5044M == 1 && actionMasked == 0) {
            return true;
        }
        if (R0()) {
            this.f5046O.z(motionEvent);
        }
        if (actionMasked == 0) {
            x0();
        }
        if (this.f5059a0 == null) {
            this.f5059a0 = VelocityTracker.obtain();
        }
        this.f5059a0.addMovement(motionEvent);
        if (R0() && actionMasked == 2 && !this.f5047P && Math.abs(this.f5065d0 - motionEvent.getY()) > this.f5046O.u()) {
            this.f5046O.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f5047P;
    }

    public void D0(boolean z3) {
        this.f5080o = z3;
    }

    public void E0(float f3) {
        if (f3 <= 0.0f || f3 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f5038G = f3;
        if (this.f5054W != null) {
            a0();
        }
    }

    public void F0(boolean z3) {
        if (this.f5041J != z3) {
            this.f5041J = z3;
            if (!z3 && this.f5044M == 5) {
                N0(4);
            }
            W0();
        }
    }

    public void G0(int i3) {
        this.f5078m = i3;
    }

    public void H0(int i3) {
        this.f5077l = i3;
    }

    public void I0(int i3) {
        J0(i3, false);
    }

    public final void J0(int i3, boolean z3) {
        if (i3 == -1) {
            if (this.f5070g) {
                return;
            } else {
                this.f5070g = true;
            }
        } else {
            if (!this.f5070g && this.f5068f == i3) {
                return;
            }
            this.f5070g = false;
            this.f5068f = Math.max(0, i3);
        }
        a1(z3);
    }

    public void K0(int i3) {
        this.f5058a = i3;
    }

    public void L0(int i3) {
        this.f5066e = i3;
    }

    public void M0(boolean z3) {
        this.f5042K = z3;
    }

    public void N0(int i3) {
        if (i3 == 1 || i3 == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("STATE_");
            sb.append(i3 == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        }
        if (!this.f5041J && i3 == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i3);
            return;
        }
        int i4 = (i3 == 6 && this.f5060b && n0(i3) <= this.f5036E) ? 3 : i3;
        WeakReference weakReference = this.f5054W;
        if (weakReference == null || weakReference.get() == null) {
            O0(i3);
        } else {
            View view = (View) this.f5054W.get();
            z0(view, new a(view, i4));
        }
    }

    public void O0(int i3) {
        if (this.f5044M == i3) {
            return;
        }
        this.f5044M = i3;
        if (i3 == 4 || i3 == 3 || i3 == 6 || (this.f5041J && i3 == 5)) {
            this.f5045N = i3;
        }
        WeakReference weakReference = this.f5054W;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i3 == 3) {
            Z0(true);
        } else if (i3 == 6 || i3 == 5 || i3 == 4) {
            Z0(false);
        }
        Y0(i3, true);
        if (this.f5057Z.size() <= 0) {
            W0();
        } else {
            AbstractC0515e.a(this.f5057Z.get(0));
            throw null;
        }
    }

    public final void P0(View view) {
        boolean z3 = (Build.VERSION.SDK_INT < 29 || r0() || this.f5070g) ? false : true;
        if (this.f5081p || this.f5082q || this.f5083r || this.f5085t || this.f5086u || this.f5087v || z3) {
            n.b(view, new c(z3));
        }
    }

    public boolean Q0(long j3, float f3) {
        return false;
    }

    public final boolean R0() {
        if (this.f5046O != null) {
            return this.f5043L || this.f5044M == 1;
        }
        return false;
    }

    public boolean S0(View view, float f3) {
        if (this.f5042K) {
            return true;
        }
        if (t0() && view.getTop() >= this.f5039H) {
            return Math.abs((((float) view.getTop()) + (f3 * this.f5050S)) - ((float) this.f5039H)) / ((float) c0()) > 0.5f;
        }
        return false;
    }

    public boolean T0() {
        return false;
    }

    public boolean U0() {
        return true;
    }

    public final void V0(View view, int i3, boolean z3) {
        int n02 = n0(i3);
        T.c cVar = this.f5046O;
        if (cVar == null || (!z3 ? cVar.H(view, view.getLeft(), n02) : cVar.F(view.getLeft(), n02))) {
            O0(i3);
            return;
        }
        O0(2);
        Y0(i3, true);
        this.f5033B.c(i3);
    }

    public final void W0() {
        WeakReference weakReference = this.f5054W;
        if (weakReference != null) {
            X0((View) weakReference.get(), 0);
        }
        WeakReference weakReference2 = this.f5055X;
        if (weakReference2 != null) {
            X0((View) weakReference2.get(), 1);
        }
    }

    public final int X(View view, int i3, int i4) {
        return O.c(view, view.getResources().getString(i3), g0(i4));
    }

    public final void X0(View view, int i3) {
        if (view == null) {
            return;
        }
        f0(view, i3);
        if (!this.f5060b && this.f5044M != 6) {
            this.f5071g0.put(i3, X(view, h.f6929a, 6));
        }
        if (this.f5041J && t0() && this.f5044M != 5) {
            w0(view, x.a.f1296y, 5);
        }
        int i4 = this.f5044M;
        if (i4 == 3) {
            w0(view, x.a.f1295x, this.f5060b ? 4 : 6);
            return;
        }
        if (i4 == 4) {
            w0(view, x.a.f1294w, this.f5060b ? 3 : 6);
        } else {
            if (i4 != 6) {
                return;
            }
            w0(view, x.a.f1295x, 4);
            w0(view, x.a.f1294w, 3);
        }
    }

    public final void Y() {
        int c02 = c0();
        if (this.f5060b) {
            this.f5039H = Math.max(this.f5053V - c02, this.f5036E);
        } else {
            this.f5039H = this.f5053V - c02;
        }
    }

    public final void Y0(int i3, boolean z3) {
        boolean q02;
        ValueAnimator valueAnimator;
        if (i3 == 2 || this.f5032A == (q02 = q0()) || this.f5075j == null) {
            return;
        }
        this.f5032A = q02;
        if (!z3 || (valueAnimator = this.f5034C) == null) {
            ValueAnimator valueAnimator2 = this.f5034C;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f5034C.cancel();
            }
            this.f5075j.U(this.f5032A ? b0() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            this.f5034C.reverse();
        } else {
            this.f5034C.setFloatValues(this.f5075j.w(), q02 ? b0() : 1.0f);
            this.f5034C.start();
        }
    }

    public final float Z(float f3, RoundedCorner roundedCorner) {
        int radius;
        if (roundedCorner != null) {
            radius = roundedCorner.getRadius();
            float f4 = radius;
            if (f4 > 0.0f && f3 > 0.0f) {
                return f4 / f3;
            }
        }
        return 0.0f;
    }

    public final void Z0(boolean z3) {
        Map map;
        WeakReference weakReference = this.f5054W;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z3) {
                if (this.f5069f0 != null) {
                    return;
                } else {
                    this.f5069f0 = new HashMap(childCount);
                }
            }
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = coordinatorLayout.getChildAt(i3);
                if (childAt != this.f5054W.get()) {
                    if (z3) {
                        this.f5069f0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        if (this.f5062c) {
                            O.r0(childAt, 4);
                        }
                    } else if (this.f5062c && (map = this.f5069f0) != null && map.containsKey(childAt)) {
                        O.r0(childAt, ((Integer) this.f5069f0.get(childAt)).intValue());
                    }
                }
            }
            if (!z3) {
                this.f5069f0 = null;
            } else if (this.f5062c) {
                ((View) this.f5054W.get()).sendAccessibilityEvent(8);
            }
        }
    }

    public final void a0() {
        this.f5037F = (int) (this.f5053V * (1.0f - this.f5038G));
    }

    public final void a1(boolean z3) {
        View view;
        if (this.f5054W != null) {
            Y();
            if (this.f5044M != 4 || (view = (View) this.f5054W.get()) == null) {
                return;
            }
            if (z3) {
                N0(4);
            } else {
                view.requestLayout();
            }
        }
    }

    public final float b0() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        RoundedCorner roundedCorner;
        RoundedCorner roundedCorner2;
        if (this.f5075j == null || (weakReference = this.f5054W) == null || weakReference.get() == null || Build.VERSION.SDK_INT < 31) {
            return 0.0f;
        }
        View view = (View) this.f5054W.get();
        if (!p0() || (rootWindowInsets = view.getRootWindowInsets()) == null) {
            return 0.0f;
        }
        float C3 = this.f5075j.C();
        roundedCorner = rootWindowInsets.getRoundedCorner(0);
        float Z2 = Z(C3, roundedCorner);
        float D3 = this.f5075j.D();
        roundedCorner2 = rootWindowInsets.getRoundedCorner(1);
        return Math.max(Z2, Z(D3, roundedCorner2));
    }

    public final int c0() {
        int i3;
        return this.f5070g ? Math.min(Math.max(this.f5072h, this.f5053V - ((this.f5052U * 9) / 16)), this.f5051T) + this.f5088w : (this.f5080o || this.f5081p || (i3 = this.f5079n) <= 0) ? this.f5068f + this.f5088w : Math.max(this.f5068f, i3 + this.f5074i);
    }

    public final float d0(int i3) {
        float f3;
        float f4;
        int i4 = this.f5039H;
        if (i3 > i4 || i4 == m0()) {
            int i5 = this.f5039H;
            f3 = i5 - i3;
            f4 = this.f5053V - i5;
        } else {
            int i6 = this.f5039H;
            f3 = i6 - i3;
            f4 = i6 - m0();
        }
        return f3 / f4;
    }

    public final boolean e0() {
        return s0() && t0();
    }

    public final void f0(View view, int i3) {
        if (view == null) {
            return;
        }
        O.d0(view, 524288);
        O.d0(view, 262144);
        O.d0(view, 1048576);
        int i4 = this.f5071g0.get(i3, -1);
        if (i4 != -1) {
            O.d0(view, i4);
            this.f5071g0.delete(i3);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public void g(CoordinatorLayout.e eVar) {
        super.g(eVar);
        this.f5054W = null;
        this.f5046O = null;
        this.f5061b0 = null;
    }

    public final A g0(int i3) {
        return new e(i3);
    }

    public final void h0(Context context) {
        if (this.f5091z == null) {
            return;
        }
        x1.g gVar = new x1.g(this.f5091z);
        this.f5075j = gVar;
        gVar.J(context);
        ColorStateList colorStateList = this.f5076k;
        if (colorStateList != null) {
            this.f5075j.T(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.f5075j.setTint(typedValue.data);
    }

    public final void i0() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(b0(), 1.0f);
        this.f5034C = ofFloat;
        ofFloat.setDuration(500L);
        this.f5034C.addUpdateListener(new b());
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public void j() {
        super.j();
        this.f5054W = null;
        this.f5046O = null;
        this.f5061b0 = null;
    }

    public void j0(int i3) {
        if (((View) this.f5054W.get()) == null || this.f5057Z.isEmpty()) {
            return;
        }
        d0(i3);
        if (this.f5057Z.size() <= 0) {
            return;
        }
        AbstractC0515e.a(this.f5057Z.get(0));
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        int i3;
        T.c cVar;
        if (!view.isShown() || !this.f5043L) {
            this.f5047P = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            x0();
        }
        if (this.f5059a0 == null) {
            this.f5059a0 = VelocityTracker.obtain();
        }
        this.f5059a0.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x3 = (int) motionEvent.getX();
            this.f5065d0 = (int) motionEvent.getY();
            if (this.f5044M != 2) {
                WeakReference weakReference = this.f5056Y;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.z(view2, x3, this.f5065d0)) {
                    this.f5063c0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f5067e0 = true;
                }
            }
            this.f5047P = this.f5063c0 == -1 && !coordinatorLayout.z(view, x3, this.f5065d0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f5067e0 = false;
            this.f5063c0 = -1;
            if (this.f5047P) {
                this.f5047P = false;
                return false;
            }
        }
        if (!this.f5047P && (cVar = this.f5046O) != null && cVar.G(motionEvent)) {
            return true;
        }
        WeakReference weakReference2 = this.f5056Y;
        View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
        return (actionMasked != 2 || view3 == null || this.f5047P || this.f5044M == 1 || coordinatorLayout.z(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f5046O == null || (i3 = this.f5065d0) == -1 || Math.abs(((float) i3) - motionEvent.getY()) <= ((float) this.f5046O.u())) ? false : true;
    }

    public View k0(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (O.P(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View k02 = k0(viewGroup.getChildAt(i3));
                if (k02 != null) {
                    return k02;
                }
            }
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i3) {
        if (O.t(coordinatorLayout) && !O.t(view)) {
            view.setFitsSystemWindows(true);
        }
        if (this.f5054W == null) {
            this.f5072h = coordinatorLayout.getResources().getDimensionPixelSize(e1.c.f6839a);
            P0(view);
            O.A0(view, new C0489c(view));
            this.f5054W = new WeakReference(view);
            this.f5061b0 = new C0729b(view);
            x1.g gVar = this.f5075j;
            if (gVar != null) {
                O.n0(view, gVar);
                x1.g gVar2 = this.f5075j;
                float f3 = this.f5040I;
                if (f3 == -1.0f) {
                    f3 = O.r(view);
                }
                gVar2.S(f3);
            } else {
                ColorStateList colorStateList = this.f5076k;
                if (colorStateList != null) {
                    O.o0(view, colorStateList);
                }
            }
            W0();
            if (O.u(view) == 0) {
                O.r0(view, 1);
            }
        }
        if (this.f5046O == null) {
            this.f5046O = T.c.m(coordinatorLayout, this.f5073h0);
        }
        int top = view.getTop();
        coordinatorLayout.G(view, i3);
        this.f5052U = coordinatorLayout.getWidth();
        this.f5053V = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f5051T = height;
        int i4 = this.f5053V;
        int i5 = i4 - height;
        int i6 = this.f5089x;
        if (i5 < i6) {
            if (this.f5084s) {
                int i7 = this.f5078m;
                if (i7 != -1) {
                    i4 = Math.min(i4, i7);
                }
                this.f5051T = i4;
            } else {
                int i8 = i4 - i6;
                int i9 = this.f5078m;
                if (i9 != -1) {
                    i8 = Math.min(i8, i9);
                }
                this.f5051T = i8;
            }
        }
        this.f5036E = Math.max(0, this.f5053V - this.f5051T);
        a0();
        Y();
        int i10 = this.f5044M;
        if (i10 == 3) {
            O.U(view, m0());
        } else if (i10 == 6) {
            O.U(view, this.f5037F);
        } else if (this.f5041J && i10 == 5) {
            O.U(view, this.f5053V);
        } else if (i10 == 4) {
            O.U(view, this.f5039H);
        } else if (i10 == 1 || i10 == 2) {
            O.U(view, top - view.getTop());
        }
        Y0(this.f5044M, false);
        this.f5056Y = new WeakReference(k0(view));
        if (this.f5057Z.size() <= 0) {
            return true;
        }
        AbstractC0515e.a(this.f5057Z.get(0));
        throw null;
    }

    public final int l0(int i3, int i4, int i5, int i6) {
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

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i3, int i4, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(l0(i3, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i4, this.f5077l, marginLayoutParams.width), l0(i5, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i6, this.f5078m, marginLayoutParams.height));
        return true;
    }

    public int m0() {
        if (this.f5060b) {
            return this.f5036E;
        }
        return Math.max(this.f5035D, this.f5084s ? 0 : this.f5089x);
    }

    public final int n0(int i3) {
        if (i3 == 3) {
            return m0();
        }
        if (i3 == 4) {
            return this.f5039H;
        }
        if (i3 == 5) {
            return this.f5053V;
        }
        if (i3 == 6) {
            return this.f5037F;
        }
        throw new IllegalArgumentException("Invalid state to get top offset: " + i3);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean o(CoordinatorLayout coordinatorLayout, View view, View view2, float f3, float f4) {
        WeakReference weakReference;
        return v0() && (weakReference = this.f5056Y) != null && view2 == weakReference.get() && (this.f5044M != 3 || super.o(coordinatorLayout, view, view2, f3, f4));
    }

    public final float o0() {
        VelocityTracker velocityTracker = this.f5059a0;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f5064d);
        return this.f5059a0.getYVelocity(this.f5063c0);
    }

    public final boolean p0() {
        WeakReference weakReference = this.f5054W;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.f5054W.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i3, int i4, int[] iArr, int i5) {
        if (i5 == 1) {
            return;
        }
        WeakReference weakReference = this.f5056Y;
        View view3 = weakReference != null ? (View) weakReference.get() : null;
        if (!v0() || view2 == view3) {
            int top = view.getTop();
            int i6 = top - i4;
            if (i4 > 0) {
                if (i6 < m0()) {
                    int m02 = top - m0();
                    iArr[1] = m02;
                    O.U(view, -m02);
                    O0(3);
                } else {
                    if (!this.f5043L) {
                        return;
                    }
                    iArr[1] = i4;
                    O.U(view, -i4);
                    O0(1);
                }
            } else if (i4 < 0 && !view2.canScrollVertically(-1)) {
                if (i6 > this.f5039H && !e0()) {
                    int i7 = top - this.f5039H;
                    iArr[1] = i7;
                    O.U(view, -i7);
                    O0(4);
                } else {
                    if (!this.f5043L) {
                        return;
                    }
                    iArr[1] = i4;
                    O.U(view, -i4);
                    O0(1);
                }
            }
            j0(view.getTop());
            this.f5048Q = i4;
            this.f5049R = true;
        }
    }

    public final boolean q0() {
        if (this.f5044M == 3) {
            return this.f5090y || p0();
        }
        return false;
    }

    public boolean r0() {
        return this.f5080o;
    }

    public boolean s0() {
        return this.f5041J;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i3, int i4, int i5, int i6, int i7, int[] iArr) {
    }

    public boolean t0() {
        return true;
    }

    public final boolean u0(View view) {
        ViewParent parent = view.getParent();
        return parent != null && parent.isLayoutRequested() && O.N(view);
    }

    public boolean v0() {
        return true;
    }

    public final void w0(View view, x.a aVar, int i3) {
        O.f0(view, aVar, null, g0(i3));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public void x(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        f fVar = (f) parcelable;
        super.x(coordinatorLayout, view, fVar.a());
        y0(fVar);
        int i3 = fVar.f5102g;
        if (i3 == 1 || i3 == 2) {
            this.f5044M = 4;
            this.f5045N = 4;
        } else {
            this.f5044M = i3;
            this.f5045N = i3;
        }
    }

    public final void x0() {
        this.f5063c0 = -1;
        this.f5065d0 = -1;
        VelocityTracker velocityTracker = this.f5059a0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f5059a0 = null;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public Parcelable y(CoordinatorLayout coordinatorLayout, View view) {
        return new f(super.y(coordinatorLayout, view), this);
    }

    public final void y0(f fVar) {
        int i3 = this.f5058a;
        if (i3 == 0) {
            return;
        }
        if (i3 == -1 || (i3 & 1) == 1) {
            this.f5068f = fVar.f5103h;
        }
        if (i3 == -1 || (i3 & 2) == 2) {
            this.f5060b = fVar.f5104i;
        }
        if (i3 == -1 || (i3 & 4) == 4) {
            this.f5041J = fVar.f5105j;
        }
        if (i3 == -1 || (i3 & 8) == 8) {
            this.f5042K = fVar.f5106k;
        }
    }

    public final void z0(View view, Runnable runnable) {
        if (u0(view)) {
            view.post(runnable);
        } else {
            runnable.run();
        }
    }

    public class g {

        /* renamed from: a, reason: collision with root package name */
        public int f5107a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f5108b;

        /* renamed from: c, reason: collision with root package name */
        public final Runnable f5109c;

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                g.this.f5108b = false;
                T.c cVar = BottomSheetBehavior.this.f5046O;
                if (cVar != null && cVar.k(true)) {
                    g gVar = g.this;
                    gVar.c(gVar.f5107a);
                    return;
                }
                g gVar2 = g.this;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.f5044M == 2) {
                    bottomSheetBehavior.O0(gVar2.f5107a);
                }
            }
        }

        public g() {
            this.f5109c = new a();
        }

        public void c(int i3) {
            WeakReference weakReference = BottomSheetBehavior.this.f5054W;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f5107a = i3;
            if (this.f5108b) {
                return;
            }
            O.b0((View) BottomSheetBehavior.this.f5054W.get(), this.f5109c);
            this.f5108b = true;
        }

        public /* synthetic */ g(BottomSheetBehavior bottomSheetBehavior, a aVar) {
            this();
        }
    }

    public static class f extends S.a {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: g, reason: collision with root package name */
        public final int f5102g;

        /* renamed from: h, reason: collision with root package name */
        public int f5103h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f5104i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f5105j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f5106k;

        public class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public f createFromParcel(Parcel parcel) {
                return new f(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public f createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new f(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public f[] newArray(int i3) {
                return new f[i3];
            }
        }

        public f(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f5102g = parcel.readInt();
            this.f5103h = parcel.readInt();
            this.f5104i = parcel.readInt() == 1;
            this.f5105j = parcel.readInt() == 1;
            this.f5106k = parcel.readInt() == 1;
        }

        @Override // S.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i3) {
            super.writeToParcel(parcel, i3);
            parcel.writeInt(this.f5102g);
            parcel.writeInt(this.f5103h);
            parcel.writeInt(this.f5104i ? 1 : 0);
            parcel.writeInt(this.f5105j ? 1 : 0);
            parcel.writeInt(this.f5106k ? 1 : 0);
        }

        public f(Parcelable parcelable, BottomSheetBehavior bottomSheetBehavior) {
            super(parcelable);
            this.f5102g = bottomSheetBehavior.f5044M;
            this.f5103h = bottomSheetBehavior.f5068f;
            this.f5104i = bottomSheetBehavior.f5060b;
            this.f5105j = bottomSheetBehavior.f5041J;
            this.f5106k = bottomSheetBehavior.f5042K;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i3;
        this.f5058a = 0;
        this.f5060b = true;
        this.f5062c = false;
        this.f5077l = -1;
        this.f5078m = -1;
        this.f5033B = new g(this, null);
        this.f5038G = 0.5f;
        this.f5040I = -1.0f;
        this.f5043L = true;
        this.f5044M = 4;
        this.f5045N = 4;
        this.f5050S = 0.1f;
        this.f5057Z = new ArrayList();
        this.f5065d0 = -1;
        this.f5071g0 = new SparseIntArray();
        this.f5073h0 = new d();
        this.f5074i = context.getResources().getDimensionPixelSize(e1.c.f6832R);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f7152x);
        int i4 = j.f6965B;
        if (obtainStyledAttributes.hasValue(i4)) {
            this.f5076k = AbstractC0740c.a(context, obtainStyledAttributes, i4);
        }
        if (obtainStyledAttributes.hasValue(j.f7037T)) {
            this.f5091z = k.e(context, attributeSet, AbstractC0464a.f6783a, f5031i0).m();
        }
        h0(context);
        i0();
        this.f5040I = obtainStyledAttributes.getDimension(j.f6961A, -1.0f);
        int i5 = j.f7156y;
        if (obtainStyledAttributes.hasValue(i5)) {
            H0(obtainStyledAttributes.getDimensionPixelSize(i5, -1));
        }
        int i6 = j.f7160z;
        if (obtainStyledAttributes.hasValue(i6)) {
            G0(obtainStyledAttributes.getDimensionPixelSize(i6, -1));
        }
        int i7 = j.f6989H;
        TypedValue peekValue = obtainStyledAttributes.peekValue(i7);
        if (peekValue != null && (i3 = peekValue.data) == -1) {
            I0(i3);
        } else {
            I0(obtainStyledAttributes.getDimensionPixelSize(i7, -1));
        }
        F0(obtainStyledAttributes.getBoolean(j.f6985G, false));
        D0(obtainStyledAttributes.getBoolean(j.f7005L, false));
        C0(obtainStyledAttributes.getBoolean(j.f6977E, true));
        M0(obtainStyledAttributes.getBoolean(j.f7001K, false));
        A0(obtainStyledAttributes.getBoolean(j.f6969C, true));
        K0(obtainStyledAttributes.getInt(j.f6993I, 0));
        E0(obtainStyledAttributes.getFloat(j.f6981F, 0.5f));
        int i8 = j.f6973D;
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(i8);
        if (peekValue2 != null && peekValue2.type == 16) {
            B0(peekValue2.data);
        } else {
            B0(obtainStyledAttributes.getDimensionPixelOffset(i8, 0));
        }
        L0(obtainStyledAttributes.getInt(j.f6997J, 500));
        this.f5081p = obtainStyledAttributes.getBoolean(j.f7021P, false);
        this.f5082q = obtainStyledAttributes.getBoolean(j.f7025Q, false);
        this.f5083r = obtainStyledAttributes.getBoolean(j.f7029R, false);
        this.f5084s = obtainStyledAttributes.getBoolean(j.f7033S, true);
        this.f5085t = obtainStyledAttributes.getBoolean(j.f7009M, false);
        this.f5086u = obtainStyledAttributes.getBoolean(j.f7013N, false);
        this.f5087v = obtainStyledAttributes.getBoolean(j.f7017O, false);
        this.f5090y = obtainStyledAttributes.getBoolean(j.f7041U, true);
        obtainStyledAttributes.recycle();
        this.f5064d = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
