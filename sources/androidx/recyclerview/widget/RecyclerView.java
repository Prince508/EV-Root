package androidx.recyclerview.widget;

import K.AbstractC0218x;
import K.C0184a;
import K.C0219y;
import K.O;
import K.T;
import L.x;
import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.b;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.k;
import androidx.recyclerview.widget.o;
import androidx.recyclerview.widget.p;
import j.AbstractC0515e;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import m0.AbstractC0595a;
import m0.AbstractC0596b;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {

    /* renamed from: A0, reason: collision with root package name */
    public static final int[] f4214A0 = {R.attr.nestedScrollingEnabled};

    /* renamed from: B0, reason: collision with root package name */
    public static final boolean f4215B0 = false;

    /* renamed from: C0, reason: collision with root package name */
    public static final boolean f4216C0 = true;

    /* renamed from: D0, reason: collision with root package name */
    public static final boolean f4217D0 = true;

    /* renamed from: E0, reason: collision with root package name */
    public static final boolean f4218E0 = true;

    /* renamed from: F0, reason: collision with root package name */
    public static final boolean f4219F0 = false;

    /* renamed from: G0, reason: collision with root package name */
    public static final boolean f4220G0 = false;

    /* renamed from: H0, reason: collision with root package name */
    public static final Class[] f4221H0;

    /* renamed from: I0, reason: collision with root package name */
    public static final Interpolator f4222I0;

    /* renamed from: A, reason: collision with root package name */
    public boolean f4223A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f4224B;

    /* renamed from: C, reason: collision with root package name */
    public int f4225C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f4226D;

    /* renamed from: E, reason: collision with root package name */
    public final AccessibilityManager f4227E;

    /* renamed from: F, reason: collision with root package name */
    public List f4228F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f4229G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f4230H;

    /* renamed from: I, reason: collision with root package name */
    public int f4231I;

    /* renamed from: J, reason: collision with root package name */
    public int f4232J;

    /* renamed from: K, reason: collision with root package name */
    public k f4233K;

    /* renamed from: L, reason: collision with root package name */
    public EdgeEffect f4234L;

    /* renamed from: M, reason: collision with root package name */
    public EdgeEffect f4235M;

    /* renamed from: N, reason: collision with root package name */
    public EdgeEffect f4236N;

    /* renamed from: O, reason: collision with root package name */
    public EdgeEffect f4237O;

    /* renamed from: P, reason: collision with root package name */
    public l f4238P;

    /* renamed from: Q, reason: collision with root package name */
    public int f4239Q;

    /* renamed from: R, reason: collision with root package name */
    public int f4240R;

    /* renamed from: S, reason: collision with root package name */
    public VelocityTracker f4241S;

    /* renamed from: T, reason: collision with root package name */
    public int f4242T;

    /* renamed from: U, reason: collision with root package name */
    public int f4243U;

    /* renamed from: V, reason: collision with root package name */
    public int f4244V;

    /* renamed from: W, reason: collision with root package name */
    public int f4245W;

    /* renamed from: a0, reason: collision with root package name */
    public int f4246a0;

    /* renamed from: b0, reason: collision with root package name */
    public q f4247b0;

    /* renamed from: c0, reason: collision with root package name */
    public final int f4248c0;

    /* renamed from: d0, reason: collision with root package name */
    public final int f4249d0;

    /* renamed from: e, reason: collision with root package name */
    public final w f4250e;

    /* renamed from: e0, reason: collision with root package name */
    public float f4251e0;

    /* renamed from: f, reason: collision with root package name */
    public final u f4252f;

    /* renamed from: f0, reason: collision with root package name */
    public float f4253f0;

    /* renamed from: g, reason: collision with root package name */
    public x f4254g;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f4255g0;

    /* renamed from: h, reason: collision with root package name */
    public a f4256h;

    /* renamed from: h0, reason: collision with root package name */
    public final B f4257h0;

    /* renamed from: i, reason: collision with root package name */
    public b f4258i;

    /* renamed from: i0, reason: collision with root package name */
    public androidx.recyclerview.widget.e f4259i0;

    /* renamed from: j, reason: collision with root package name */
    public final androidx.recyclerview.widget.p f4260j;

    /* renamed from: j0, reason: collision with root package name */
    public e.b f4261j0;

    /* renamed from: k, reason: collision with root package name */
    public boolean f4262k;

    /* renamed from: k0, reason: collision with root package name */
    public final z f4263k0;

    /* renamed from: l, reason: collision with root package name */
    public final Runnable f4264l;

    /* renamed from: l0, reason: collision with root package name */
    public s f4265l0;

    /* renamed from: m, reason: collision with root package name */
    public final Rect f4266m;

    /* renamed from: m0, reason: collision with root package name */
    public List f4267m0;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f4268n;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f4269n0;

    /* renamed from: o, reason: collision with root package name */
    public final RectF f4270o;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f4271o0;

    /* renamed from: p, reason: collision with root package name */
    public g f4272p;

    /* renamed from: p0, reason: collision with root package name */
    public l.a f4273p0;

    /* renamed from: q, reason: collision with root package name */
    public o f4274q;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f4275q0;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f4276r;

    /* renamed from: r0, reason: collision with root package name */
    public androidx.recyclerview.widget.k f4277r0;

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f4278s;

    /* renamed from: s0, reason: collision with root package name */
    public final int[] f4279s0;

    /* renamed from: t, reason: collision with root package name */
    public r f4280t;

    /* renamed from: t0, reason: collision with root package name */
    public C0219y f4281t0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f4282u;

    /* renamed from: u0, reason: collision with root package name */
    public final int[] f4283u0;

    /* renamed from: v, reason: collision with root package name */
    public boolean f4284v;

    /* renamed from: v0, reason: collision with root package name */
    public final int[] f4285v0;

    /* renamed from: w, reason: collision with root package name */
    public boolean f4286w;

    /* renamed from: w0, reason: collision with root package name */
    public final int[] f4287w0;

    /* renamed from: x, reason: collision with root package name */
    public boolean f4288x;

    /* renamed from: x0, reason: collision with root package name */
    public final List f4289x0;

    /* renamed from: y, reason: collision with root package name */
    public int f4290y;

    /* renamed from: y0, reason: collision with root package name */
    public Runnable f4291y0;

    /* renamed from: z, reason: collision with root package name */
    public boolean f4292z;

    /* renamed from: z0, reason: collision with root package name */
    public final p.b f4293z0;

    public static abstract class A {
    }

    public class B implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        public int f4294e;

        /* renamed from: f, reason: collision with root package name */
        public int f4295f;

        /* renamed from: g, reason: collision with root package name */
        public OverScroller f4296g;

        /* renamed from: h, reason: collision with root package name */
        public Interpolator f4297h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f4298i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f4299j;

        public B() {
            Interpolator interpolator = RecyclerView.f4222I0;
            this.f4297h = interpolator;
            this.f4298i = false;
            this.f4299j = false;
            this.f4296g = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        public final int a(int i3, int i4, int i5, int i6) {
            int i7;
            int abs = Math.abs(i3);
            int abs2 = Math.abs(i4);
            boolean z3 = abs > abs2;
            int sqrt = (int) Math.sqrt((i5 * i5) + (i6 * i6));
            int sqrt2 = (int) Math.sqrt((i3 * i3) + (i4 * i4));
            RecyclerView recyclerView = RecyclerView.this;
            int width = z3 ? recyclerView.getWidth() : recyclerView.getHeight();
            int i8 = width / 2;
            float f3 = width;
            float f4 = i8;
            float b3 = f4 + (b(Math.min(1.0f, (sqrt2 * 1.0f) / f3)) * f4);
            if (sqrt > 0) {
                i7 = Math.round(Math.abs(b3 / sqrt) * 1000.0f) * 4;
            } else {
                if (!z3) {
                    abs = abs2;
                }
                i7 = (int) (((abs / f3) + 1.0f) * 300.0f);
            }
            return Math.min(i7, 2000);
        }

        public final float b(float f3) {
            return (float) Math.sin((f3 - 0.5f) * 0.47123894f);
        }

        public void c(int i3, int i4) {
            RecyclerView.this.setScrollState(2);
            this.f4295f = 0;
            this.f4294e = 0;
            Interpolator interpolator = this.f4297h;
            Interpolator interpolator2 = RecyclerView.f4222I0;
            if (interpolator != interpolator2) {
                this.f4297h = interpolator2;
                this.f4296g = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f4296g.fling(0, 0, i3, i4, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            e();
        }

        public final void d() {
            RecyclerView.this.removeCallbacks(this);
            O.b0(RecyclerView.this, this);
        }

        public void e() {
            if (this.f4298i) {
                this.f4299j = true;
            } else {
                d();
            }
        }

        public void f(int i3, int i4, int i5, Interpolator interpolator) {
            if (i5 == Integer.MIN_VALUE) {
                i5 = a(i3, i4, 0, 0);
            }
            int i6 = i5;
            if (interpolator == null) {
                interpolator = RecyclerView.f4222I0;
            }
            if (this.f4297h != interpolator) {
                this.f4297h = interpolator;
                this.f4296g = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f4295f = 0;
            this.f4294e = 0;
            RecyclerView.this.setScrollState(2);
            this.f4296g.startScroll(0, 0, i3, i4, i6);
            e();
        }

        public void g() {
            RecyclerView.this.removeCallbacks(this);
            this.f4296g.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i3;
            int i4;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f4274q == null) {
                g();
                return;
            }
            this.f4299j = false;
            this.f4298i = true;
            recyclerView.t();
            OverScroller overScroller = this.f4296g;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i5 = currX - this.f4294e;
                int i6 = currY - this.f4295f;
                this.f4294e = currX;
                this.f4295f = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.f4287w0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.E(i5, i6, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.f4287w0;
                    i5 -= iArr2[0];
                    i6 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.s(i5, i6);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.f4272p != null) {
                    int[] iArr3 = recyclerView3.f4287w0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.e1(i5, i6, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.f4287w0;
                    int i7 = iArr4[0];
                    int i8 = iArr4[1];
                    i5 -= i7;
                    i6 -= i8;
                    y yVar = recyclerView4.f4274q.f4344g;
                    if (yVar != null && !yVar.g() && yVar.h()) {
                        int b3 = RecyclerView.this.f4263k0.b();
                        if (b3 == 0) {
                            yVar.r();
                        } else if (yVar.f() >= b3) {
                            yVar.p(b3 - 1);
                            yVar.j(i7, i8);
                        } else {
                            yVar.j(i7, i8);
                        }
                    }
                    i4 = i8;
                    i3 = i7;
                } else {
                    i3 = 0;
                    i4 = 0;
                }
                int i9 = i5;
                int i10 = i6;
                if (!RecyclerView.this.f4276r.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.f4287w0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.F(i3, i4, i9, i10, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.f4287w0;
                int i11 = i9 - iArr6[0];
                int i12 = i10 - iArr6[1];
                if (i3 != 0 || i4 != 0) {
                    recyclerView6.H(i3, i4);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z3 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i11 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i12 != 0));
                y yVar2 = RecyclerView.this.f4274q.f4344g;
                if ((yVar2 == null || !yVar2.g()) && z3) {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i13 = i11 < 0 ? -currVelocity : i11 > 0 ? currVelocity : 0;
                        if (i12 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i12 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.a(i13, currVelocity);
                    }
                    if (RecyclerView.f4218E0) {
                        RecyclerView.this.f4261j0.b();
                    }
                } else {
                    e();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    androidx.recyclerview.widget.e eVar = recyclerView7.f4259i0;
                    if (eVar != null) {
                        eVar.f(recyclerView7, i3, i4);
                    }
                }
            }
            y yVar3 = RecyclerView.this.f4274q.f4344g;
            if (yVar3 != null && yVar3.g()) {
                yVar3.j(0, 0);
            }
            this.f4298i = false;
            if (this.f4299j) {
                d();
            } else {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.r1(1);
            }
        }
    }

    public static abstract class C {

        /* renamed from: s, reason: collision with root package name */
        public static final List f4301s = Collections.EMPTY_LIST;

        /* renamed from: a, reason: collision with root package name */
        public final View f4302a;

        /* renamed from: b, reason: collision with root package name */
        public WeakReference f4303b;

        /* renamed from: j, reason: collision with root package name */
        public int f4311j;

        /* renamed from: r, reason: collision with root package name */
        public RecyclerView f4319r;

        /* renamed from: c, reason: collision with root package name */
        public int f4304c = -1;

        /* renamed from: d, reason: collision with root package name */
        public int f4305d = -1;

        /* renamed from: e, reason: collision with root package name */
        public long f4306e = -1;

        /* renamed from: f, reason: collision with root package name */
        public int f4307f = -1;

        /* renamed from: g, reason: collision with root package name */
        public int f4308g = -1;

        /* renamed from: h, reason: collision with root package name */
        public C f4309h = null;

        /* renamed from: i, reason: collision with root package name */
        public C f4310i = null;

        /* renamed from: k, reason: collision with root package name */
        public List f4312k = null;

        /* renamed from: l, reason: collision with root package name */
        public List f4313l = null;

        /* renamed from: m, reason: collision with root package name */
        public int f4314m = 0;

        /* renamed from: n, reason: collision with root package name */
        public u f4315n = null;

        /* renamed from: o, reason: collision with root package name */
        public boolean f4316o = false;

        /* renamed from: p, reason: collision with root package name */
        public int f4317p = 0;

        /* renamed from: q, reason: collision with root package name */
        public int f4318q = -1;

        public C(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.f4302a = view;
        }

        public void A(int i3, boolean z3) {
            if (this.f4305d == -1) {
                this.f4305d = this.f4304c;
            }
            if (this.f4308g == -1) {
                this.f4308g = this.f4304c;
            }
            if (z3) {
                this.f4308g += i3;
            }
            this.f4304c += i3;
            if (this.f4302a.getLayoutParams() != null) {
                ((p) this.f4302a.getLayoutParams()).f4364c = true;
            }
        }

        public void B(RecyclerView recyclerView) {
            int i3 = this.f4318q;
            if (i3 != -1) {
                this.f4317p = i3;
            } else {
                this.f4317p = O.u(this.f4302a);
            }
            recyclerView.h1(this, 4);
        }

        public void C(RecyclerView recyclerView) {
            recyclerView.h1(this, this.f4317p);
            this.f4317p = 0;
        }

        public void D() {
            this.f4311j = 0;
            this.f4304c = -1;
            this.f4305d = -1;
            this.f4306e = -1L;
            this.f4308g = -1;
            this.f4314m = 0;
            this.f4309h = null;
            this.f4310i = null;
            d();
            this.f4317p = 0;
            this.f4318q = -1;
            RecyclerView.q(this);
        }

        public void E() {
            if (this.f4305d == -1) {
                this.f4305d = this.f4304c;
            }
        }

        public void F(int i3, int i4) {
            this.f4311j = (i3 & i4) | (this.f4311j & (~i4));
        }

        public final void G(boolean z3) {
            int i3 = this.f4314m;
            int i4 = z3 ? i3 - 1 : i3 + 1;
            this.f4314m = i4;
            if (i4 < 0) {
                this.f4314m = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z3 && i4 == 1) {
                this.f4311j |= 16;
            } else if (z3 && i4 == 0) {
                this.f4311j &= -17;
            }
        }

        public void H(u uVar, boolean z3) {
            this.f4315n = uVar;
            this.f4316o = z3;
        }

        public boolean I() {
            return (this.f4311j & 16) != 0;
        }

        public boolean J() {
            return (this.f4311j & 128) != 0;
        }

        public void K() {
            this.f4315n.J(this);
        }

        public boolean L() {
            return (this.f4311j & 32) != 0;
        }

        public void a(Object obj) {
            if (obj == null) {
                b(1024);
            } else if ((1024 & this.f4311j) == 0) {
                g();
                this.f4312k.add(obj);
            }
        }

        public void b(int i3) {
            this.f4311j = i3 | this.f4311j;
        }

        public void c() {
            this.f4305d = -1;
            this.f4308g = -1;
        }

        public void d() {
            List list = this.f4312k;
            if (list != null) {
                list.clear();
            }
            this.f4311j &= -1025;
        }

        public void e() {
            this.f4311j &= -33;
        }

        public void f() {
            this.f4311j &= -257;
        }

        public final void g() {
            if (this.f4312k == null) {
                ArrayList arrayList = new ArrayList();
                this.f4312k = arrayList;
                this.f4313l = Collections.unmodifiableList(arrayList);
            }
        }

        public boolean h() {
            return (this.f4311j & 16) == 0 && O.L(this.f4302a);
        }

        public void i(int i3, int i4, boolean z3) {
            b(8);
            A(i4, z3);
            this.f4304c = i3;
        }

        public final int j() {
            RecyclerView recyclerView = this.f4319r;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.a0(this);
        }

        public final long k() {
            return this.f4306e;
        }

        public final int l() {
            return this.f4307f;
        }

        public final int m() {
            int i3 = this.f4308g;
            return i3 == -1 ? this.f4304c : i3;
        }

        public final int n() {
            return this.f4305d;
        }

        public List o() {
            if ((this.f4311j & 1024) != 0) {
                return f4301s;
            }
            List list = this.f4312k;
            return (list == null || list.size() == 0) ? f4301s : this.f4313l;
        }

        public boolean p(int i3) {
            return (i3 & this.f4311j) != 0;
        }

        public boolean q() {
            return (this.f4311j & 512) != 0 || t();
        }

        public boolean r() {
            return (this.f4302a.getParent() == null || this.f4302a.getParent() == this.f4319r) ? false : true;
        }

        public boolean s() {
            return (this.f4311j & 1) != 0;
        }

        public boolean t() {
            return (this.f4311j & 4) != 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f4304c + " id=" + this.f4306e + ", oldPos=" + this.f4305d + ", pLpos:" + this.f4308g);
            if (w()) {
                sb.append(" scrap ");
                sb.append(this.f4316o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (t()) {
                sb.append(" invalid");
            }
            if (!s()) {
                sb.append(" unbound");
            }
            if (z()) {
                sb.append(" update");
            }
            if (v()) {
                sb.append(" removed");
            }
            if (J()) {
                sb.append(" ignored");
            }
            if (x()) {
                sb.append(" tmpDetached");
            }
            if (!u()) {
                sb.append(" not recyclable(" + this.f4314m + ")");
            }
            if (q()) {
                sb.append(" undefined adapter position");
            }
            if (this.f4302a.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        public final boolean u() {
            return (this.f4311j & 16) == 0 && !O.L(this.f4302a);
        }

        public boolean v() {
            return (this.f4311j & 8) != 0;
        }

        public boolean w() {
            return this.f4315n != null;
        }

        public boolean x() {
            return (this.f4311j & 256) != 0;
        }

        public boolean y() {
            return (this.f4311j & 2) != 0;
        }

        public boolean z() {
            return (this.f4311j & 2) != 0;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a, reason: case insensitive filesystem */
    public class RunnableC0350a implements Runnable {
        public RunnableC0350a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.f4288x || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.f4282u) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.f4223A) {
                recyclerView2.f4292z = true;
            } else {
                recyclerView2.t();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b, reason: case insensitive filesystem */
    public class RunnableC0351b implements Runnable {
        public RunnableC0351b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l lVar = RecyclerView.this.f4238P;
            if (lVar != null) {
                lVar.u();
            }
            RecyclerView.this.f4275q0 = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c, reason: case insensitive filesystem */
    public static class InterpolatorC0352c implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f3) {
            float f4 = f3 - 1.0f;
            return (f4 * f4 * f4 * f4 * f4) + 1.0f;
        }
    }

    public class d implements p.b {
        public d() {
        }

        @Override // androidx.recyclerview.widget.p.b
        public void a(C c3) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f4274q.q1(c3.f4302a, recyclerView.f4252f);
        }

        @Override // androidx.recyclerview.widget.p.b
        public void b(C c3, l.b bVar, l.b bVar2) {
            RecyclerView.this.k(c3, bVar, bVar2);
        }

        @Override // androidx.recyclerview.widget.p.b
        public void c(C c3, l.b bVar, l.b bVar2) {
            RecyclerView.this.f4252f.J(c3);
            RecyclerView.this.m(c3, bVar, bVar2);
        }

        @Override // androidx.recyclerview.widget.p.b
        public void d(C c3, l.b bVar, l.b bVar2) {
            c3.G(false);
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f4229G) {
                if (recyclerView.f4238P.b(c3, c3, bVar, bVar2)) {
                    RecyclerView.this.K0();
                }
            } else if (recyclerView.f4238P.d(c3, bVar, bVar2)) {
                RecyclerView.this.K0();
            }
        }
    }

    public class e implements b.InterfaceC0097b {
        public e() {
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0097b
        public View a(int i3) {
            return RecyclerView.this.getChildAt(i3);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0097b
        public void b(View view) {
            C e02 = RecyclerView.e0(view);
            if (e02 != null) {
                e02.B(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0097b
        public void c(int i3) {
            View childAt = RecyclerView.this.getChildAt(i3);
            if (childAt != null) {
                RecyclerView.this.y(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i3);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0097b
        public void d() {
            int k3 = k();
            for (int i3 = 0; i3 < k3; i3++) {
                View a3 = a(i3);
                RecyclerView.this.y(a3);
                a3.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0097b
        public C e(View view) {
            return RecyclerView.e0(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0097b
        public void f(int i3) {
            C e02;
            View a3 = a(i3);
            if (a3 != null && (e02 = RecyclerView.e0(a3)) != null) {
                if (e02.x() && !e02.J()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + e02 + RecyclerView.this.O());
                }
                e02.b(256);
            }
            RecyclerView.this.detachViewFromParent(i3);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0097b
        public void g(View view) {
            C e02 = RecyclerView.e0(view);
            if (e02 != null) {
                e02.C(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0097b
        public void h(View view, int i3, ViewGroup.LayoutParams layoutParams) {
            C e02 = RecyclerView.e0(view);
            if (e02 != null) {
                if (!e02.x() && !e02.J()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + e02 + RecyclerView.this.O());
                }
                e02.f();
            }
            RecyclerView.this.attachViewToParent(view, i3, layoutParams);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0097b
        public void i(View view, int i3) {
            RecyclerView.this.addView(view, i3);
            RecyclerView.this.x(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0097b
        public int j(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0097b
        public int k() {
            return RecyclerView.this.getChildCount();
        }
    }

    public class f implements a.InterfaceC0096a {
        public f() {
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0096a
        public void a(int i3, int i4) {
            RecyclerView.this.A0(i3, i4);
            RecyclerView.this.f4269n0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0096a
        public void b(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0096a
        public C c(int i3) {
            C Y2 = RecyclerView.this.Y(i3, true);
            if (Y2 == null || RecyclerView.this.f4258i.n(Y2.f4302a)) {
                return null;
            }
            return Y2;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0096a
        public void d(int i3, int i4) {
            RecyclerView.this.B0(i3, i4, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f4269n0 = true;
            recyclerView.f4263k0.f4400d += i4;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0096a
        public void e(int i3, int i4) {
            RecyclerView.this.B0(i3, i4, false);
            RecyclerView.this.f4269n0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0096a
        public void f(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0096a
        public void g(int i3, int i4) {
            RecyclerView.this.z0(i3, i4);
            RecyclerView.this.f4269n0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0096a
        public void h(int i3, int i4, Object obj) {
            RecyclerView.this.u1(i3, i4, obj);
            RecyclerView.this.f4271o0 = true;
        }

        public void i(a.b bVar) {
            int i3 = bVar.f4478a;
            if (i3 == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.f4274q.V0(recyclerView, bVar.f4479b, bVar.f4481d);
                return;
            }
            if (i3 == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.f4274q.Y0(recyclerView2, bVar.f4479b, bVar.f4481d);
            } else if (i3 == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.f4274q.a1(recyclerView3, bVar.f4479b, bVar.f4481d, bVar.f4480c);
            } else {
                if (i3 != 8) {
                    return;
                }
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.f4274q.X0(recyclerView4, bVar.f4479b, bVar.f4481d, 1);
            }
        }
    }

    public static abstract class g {

        /* renamed from: a, reason: collision with root package name */
        public final h f4325a = new h();

        /* renamed from: b, reason: collision with root package name */
        public boolean f4326b = false;

        public final void a(C c3, int i3) {
            c3.f4304c = i3;
            if (g()) {
                c3.f4306e = d(i3);
            }
            c3.F(1, 519);
            G.d.a("RV OnBindView");
            j(c3, i3, c3.o());
            c3.d();
            ViewGroup.LayoutParams layoutParams = c3.f4302a.getLayoutParams();
            if (layoutParams instanceof p) {
                ((p) layoutParams).f4364c = true;
            }
            G.d.b();
        }

        public final C b(ViewGroup viewGroup, int i3) {
            try {
                G.d.a("RV CreateView");
                C k3 = k(viewGroup, i3);
                if (k3.f4302a.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                k3.f4307f = i3;
                return k3;
            } finally {
                G.d.b();
            }
        }

        public abstract int c();

        public long d(int i3) {
            return -1L;
        }

        public int e(int i3) {
            return 0;
        }

        public final boolean f() {
            return this.f4325a.a();
        }

        public final boolean g() {
            return this.f4326b;
        }

        public void h(RecyclerView recyclerView) {
        }

        public abstract void i(C c3, int i3);

        public void j(C c3, int i3, List list) {
            i(c3, i3);
        }

        public abstract C k(ViewGroup viewGroup, int i3);

        public void l(RecyclerView recyclerView) {
        }

        public boolean m(C c3) {
            return false;
        }

        public void n(C c3) {
        }

        public void o(C c3) {
        }

        public void p(C c3) {
        }

        public void q(i iVar) {
            this.f4325a.registerObserver(iVar);
        }

        public void r(boolean z3) {
            if (f()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.f4326b = z3;
        }

        public void s(i iVar) {
            this.f4325a.unregisterObserver(iVar);
        }
    }

    public static class h extends Observable {
        public boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }
    }

    public static abstract class i {
    }

    public interface j {
    }

    public static class k {
        public EdgeEffect a(RecyclerView recyclerView, int i3) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public static abstract class l {

        /* renamed from: a, reason: collision with root package name */
        public a f4327a = null;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList f4328b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        public long f4329c = 120;

        /* renamed from: d, reason: collision with root package name */
        public long f4330d = 120;

        /* renamed from: e, reason: collision with root package name */
        public long f4331e = 250;

        /* renamed from: f, reason: collision with root package name */
        public long f4332f = 250;

        public interface a {
            void a(C c3);
        }

        public static class b {

            /* renamed from: a, reason: collision with root package name */
            public int f4333a;

            /* renamed from: b, reason: collision with root package name */
            public int f4334b;

            /* renamed from: c, reason: collision with root package name */
            public int f4335c;

            /* renamed from: d, reason: collision with root package name */
            public int f4336d;

            public b a(C c3) {
                return b(c3, 0);
            }

            public b b(C c3, int i3) {
                View view = c3.f4302a;
                this.f4333a = view.getLeft();
                this.f4334b = view.getTop();
                this.f4335c = view.getRight();
                this.f4336d = view.getBottom();
                return this;
            }
        }

        public static int e(C c3) {
            int i3 = c3.f4311j;
            int i4 = i3 & 14;
            if (c3.t()) {
                return 4;
            }
            if ((i3 & 4) == 0) {
                int n3 = c3.n();
                int j3 = c3.j();
                if (n3 != -1 && j3 != -1 && n3 != j3) {
                    return i4 | 2048;
                }
            }
            return i4;
        }

        public abstract boolean a(C c3, b bVar, b bVar2);

        public abstract boolean b(C c3, C c4, b bVar, b bVar2);

        public abstract boolean c(C c3, b bVar, b bVar2);

        public abstract boolean d(C c3, b bVar, b bVar2);

        public abstract boolean f(C c3);

        public boolean g(C c3, List list) {
            return f(c3);
        }

        public final void h(C c3) {
            r(c3);
            a aVar = this.f4327a;
            if (aVar != null) {
                aVar.a(c3);
            }
        }

        public final void i() {
            if (this.f4328b.size() <= 0) {
                this.f4328b.clear();
            } else {
                AbstractC0515e.a(this.f4328b.get(0));
                throw null;
            }
        }

        public abstract void j(C c3);

        public abstract void k();

        public long l() {
            return this.f4329c;
        }

        public long m() {
            return this.f4332f;
        }

        public long n() {
            return this.f4331e;
        }

        public long o() {
            return this.f4330d;
        }

        public abstract boolean p();

        public b q() {
            return new b();
        }

        public void r(C c3) {
        }

        public b s(z zVar, C c3) {
            return q().a(c3);
        }

        public b t(z zVar, C c3, int i3, List list) {
            return q().a(c3);
        }

        public abstract void u();

        public void v(a aVar) {
            this.f4327a = aVar;
        }
    }

    public class m implements l.a {
        public m() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.l.a
        public void a(C c3) {
            c3.G(true);
            if (c3.f4309h != null && c3.f4310i == null) {
                c3.f4309h = null;
            }
            c3.f4310i = null;
            if (c3.I() || RecyclerView.this.T0(c3.f4302a) || !c3.x()) {
                return;
            }
            RecyclerView.this.removeDetachedView(c3.f4302a, false);
        }
    }

    public static abstract class n {
        public void d(Rect rect, int i3, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        public void e(Rect rect, View view, RecyclerView recyclerView, z zVar) {
            d(rect, ((p) view.getLayoutParams()).a(), recyclerView);
        }

        public void f(Canvas canvas, RecyclerView recyclerView) {
        }

        public void g(Canvas canvas, RecyclerView recyclerView, z zVar) {
            f(canvas, recyclerView);
        }

        public void h(Canvas canvas, RecyclerView recyclerView) {
        }

        public void i(Canvas canvas, RecyclerView recyclerView, z zVar) {
            h(canvas, recyclerView);
        }
    }

    public static abstract class o {

        /* renamed from: a, reason: collision with root package name */
        public androidx.recyclerview.widget.b f4338a;

        /* renamed from: b, reason: collision with root package name */
        public RecyclerView f4339b;

        /* renamed from: c, reason: collision with root package name */
        public final o.b f4340c;

        /* renamed from: d, reason: collision with root package name */
        public final o.b f4341d;

        /* renamed from: e, reason: collision with root package name */
        public androidx.recyclerview.widget.o f4342e;

        /* renamed from: f, reason: collision with root package name */
        public androidx.recyclerview.widget.o f4343f;

        /* renamed from: g, reason: collision with root package name */
        public y f4344g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f4345h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f4346i;

        /* renamed from: j, reason: collision with root package name */
        public boolean f4347j;

        /* renamed from: k, reason: collision with root package name */
        public boolean f4348k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f4349l;

        /* renamed from: m, reason: collision with root package name */
        public int f4350m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f4351n;

        /* renamed from: o, reason: collision with root package name */
        public int f4352o;

        /* renamed from: p, reason: collision with root package name */
        public int f4353p;

        /* renamed from: q, reason: collision with root package name */
        public int f4354q;

        /* renamed from: r, reason: collision with root package name */
        public int f4355r;

        public class a implements o.b {
            public a() {
            }

            @Override // androidx.recyclerview.widget.o.b
            public View a(int i3) {
                return o.this.N(i3);
            }

            @Override // androidx.recyclerview.widget.o.b
            public int b() {
                return o.this.s0() - o.this.j0();
            }

            @Override // androidx.recyclerview.widget.o.b
            public int c() {
                return o.this.i0();
            }

            @Override // androidx.recyclerview.widget.o.b
            public int d(View view) {
                return o.this.Y(view) + ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).rightMargin;
            }

            @Override // androidx.recyclerview.widget.o.b
            public int e(View view) {
                return o.this.V(view) - ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).leftMargin;
            }
        }

        public class b implements o.b {
            public b() {
            }

            @Override // androidx.recyclerview.widget.o.b
            public View a(int i3) {
                return o.this.N(i3);
            }

            @Override // androidx.recyclerview.widget.o.b
            public int b() {
                return o.this.b0() - o.this.h0();
            }

            @Override // androidx.recyclerview.widget.o.b
            public int c() {
                return o.this.k0();
            }

            @Override // androidx.recyclerview.widget.o.b
            public int d(View view) {
                return o.this.T(view) + ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).bottomMargin;
            }

            @Override // androidx.recyclerview.widget.o.b
            public int e(View view) {
                return o.this.Z(view) - ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).topMargin;
            }
        }

        public interface c {
            void a(int i3, int i4);
        }

        public static class d {

            /* renamed from: a, reason: collision with root package name */
            public int f4358a;

            /* renamed from: b, reason: collision with root package name */
            public int f4359b;

            /* renamed from: c, reason: collision with root package name */
            public boolean f4360c;

            /* renamed from: d, reason: collision with root package name */
            public boolean f4361d;
        }

        public o() {
            a aVar = new a();
            this.f4340c = aVar;
            b bVar = new b();
            this.f4341d = bVar;
            this.f4342e = new androidx.recyclerview.widget.o(aVar);
            this.f4343f = new androidx.recyclerview.widget.o(bVar);
            this.f4345h = false;
            this.f4346i = false;
            this.f4347j = false;
            this.f4348k = true;
            this.f4349l = true;
        }

        public static boolean A0(int i3, int i4, int i5) {
            int mode = View.MeasureSpec.getMode(i4);
            int size = View.MeasureSpec.getSize(i4);
            if (i5 > 0 && i3 != i5) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i3;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i3;
            }
            return true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
        
            if (r5 == 1073741824) goto L14;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int P(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L1d
                if (r7 < 0) goto L12
            L10:
                r5 = r3
                goto L30
            L12:
                if (r7 != r1) goto L1a
                if (r5 == r2) goto L22
                if (r5 == 0) goto L1a
                if (r5 == r3) goto L22
            L1a:
                r5 = r6
                r7 = r5
                goto L30
            L1d:
                if (r7 < 0) goto L20
                goto L10
            L20:
                if (r7 != r1) goto L24
            L22:
                r7 = r4
                goto L30
            L24:
                if (r7 != r0) goto L1a
                if (r5 == r2) goto L2e
                if (r5 != r3) goto L2b
                goto L2e
            L2b:
                r7 = r4
                r5 = r6
                goto L30
            L2e:
                r7 = r4
                r5 = r2
            L30:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.o.P(int, int, int, int, boolean):int");
        }

        public static d m0(Context context, AttributeSet attributeSet, int i3, int i4) {
            d dVar = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m0.c.f8502f, i3, i4);
            dVar.f4358a = obtainStyledAttributes.getInt(m0.c.f8503g, 1);
            dVar.f4359b = obtainStyledAttributes.getInt(m0.c.f8513q, 1);
            dVar.f4360c = obtainStyledAttributes.getBoolean(m0.c.f8512p, false);
            dVar.f4361d = obtainStyledAttributes.getBoolean(m0.c.f8514r, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        public static int s(int i3, int i4, int i5) {
            int mode = View.MeasureSpec.getMode(i3);
            int size = View.MeasureSpec.getSize(i3);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i4, i5) : size : Math.min(size, Math.max(i4, i5));
        }

        public abstract int A(z zVar);

        public abstract int A1(int i3, u uVar, z zVar);

        public void B(u uVar) {
            for (int O3 = O() - 1; O3 >= 0; O3--) {
                z1(uVar, O3, N(O3));
            }
        }

        public boolean B0() {
            y yVar = this.f4344g;
            return yVar != null && yVar.h();
        }

        public abstract void B1(int i3);

        public void C(int i3) {
            D(i3, N(i3));
        }

        public boolean C0(View view, boolean z3, boolean z4) {
            boolean z5 = this.f4342e.b(view, 24579) && this.f4343f.b(view, 24579);
            return z3 ? z5 : !z5;
        }

        public abstract int C1(int i3, u uVar, z zVar);

        public final void D(int i3, View view) {
            this.f4338a.d(i3);
        }

        public void D0(View view, int i3, int i4, int i5, int i6) {
            p pVar = (p) view.getLayoutParams();
            Rect rect = pVar.f4363b;
            view.layout(i3 + rect.left + ((ViewGroup.MarginLayoutParams) pVar).leftMargin, i4 + rect.top + ((ViewGroup.MarginLayoutParams) pVar).topMargin, (i5 - rect.right) - ((ViewGroup.MarginLayoutParams) pVar).rightMargin, (i6 - rect.bottom) - ((ViewGroup.MarginLayoutParams) pVar).bottomMargin);
        }

        public void D1(RecyclerView recyclerView) {
            E1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public void E(RecyclerView recyclerView) {
            this.f4346i = true;
            K0(recyclerView);
        }

        public void E0(View view, int i3, int i4) {
            p pVar = (p) view.getLayoutParams();
            Rect i02 = this.f4339b.i0(view);
            int i5 = i3 + i02.left + i02.right;
            int i6 = i4 + i02.top + i02.bottom;
            int P3 = P(s0(), t0(), i0() + j0() + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin + i5, ((ViewGroup.MarginLayoutParams) pVar).width, p());
            int P4 = P(b0(), c0(), k0() + h0() + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin + i6, ((ViewGroup.MarginLayoutParams) pVar).height, q());
            if (J1(view, P3, P4, pVar)) {
                view.measure(P3, P4);
            }
        }

        public void E1(int i3, int i4) {
            this.f4354q = View.MeasureSpec.getSize(i3);
            int mode = View.MeasureSpec.getMode(i3);
            this.f4352o = mode;
            if (mode == 0 && !RecyclerView.f4216C0) {
                this.f4354q = 0;
            }
            this.f4355r = View.MeasureSpec.getSize(i4);
            int mode2 = View.MeasureSpec.getMode(i4);
            this.f4353p = mode2;
            if (mode2 != 0 || RecyclerView.f4216C0) {
                return;
            }
            this.f4355r = 0;
        }

        public void F(RecyclerView recyclerView, u uVar) {
            this.f4346i = false;
            M0(recyclerView, uVar);
        }

        public void F0(int i3, int i4) {
            View N3 = N(i3);
            if (N3 != null) {
                C(i3);
                m(N3, i4);
            } else {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i3 + this.f4339b.toString());
            }
        }

        public void F1(int i3, int i4) {
            this.f4339b.setMeasuredDimension(i3, i4);
        }

        public View G(View view) {
            View Q3;
            RecyclerView recyclerView = this.f4339b;
            if (recyclerView == null || (Q3 = recyclerView.Q(view)) == null || this.f4338a.n(Q3)) {
                return null;
            }
            return Q3;
        }

        public void G0(int i3) {
            RecyclerView recyclerView = this.f4339b;
            if (recyclerView != null) {
                recyclerView.x0(i3);
            }
        }

        public void G1(Rect rect, int i3, int i4) {
            F1(s(i3, rect.width() + i0() + j0(), g0()), s(i4, rect.height() + k0() + h0(), f0()));
        }

        public View H(int i3) {
            int O3 = O();
            for (int i4 = 0; i4 < O3; i4++) {
                View N3 = N(i4);
                C e02 = RecyclerView.e0(N3);
                if (e02 != null && e02.m() == i3 && !e02.J() && (this.f4339b.f4263k0.e() || !e02.v())) {
                    return N3;
                }
            }
            return null;
        }

        public void H0(int i3) {
            RecyclerView recyclerView = this.f4339b;
            if (recyclerView != null) {
                recyclerView.y0(i3);
            }
        }

        public void H1(int i3, int i4) {
            int O3 = O();
            if (O3 == 0) {
                this.f4339b.v(i3, i4);
                return;
            }
            int i5 = Integer.MIN_VALUE;
            int i6 = Integer.MAX_VALUE;
            int i7 = Integer.MIN_VALUE;
            int i8 = Integer.MAX_VALUE;
            for (int i9 = 0; i9 < O3; i9++) {
                View N3 = N(i9);
                Rect rect = this.f4339b.f4266m;
                U(N3, rect);
                int i10 = rect.left;
                if (i10 < i8) {
                    i8 = i10;
                }
                int i11 = rect.right;
                if (i11 > i5) {
                    i5 = i11;
                }
                int i12 = rect.top;
                if (i12 < i6) {
                    i6 = i12;
                }
                int i13 = rect.bottom;
                if (i13 > i7) {
                    i7 = i13;
                }
            }
            this.f4339b.f4266m.set(i8, i6, i5, i7);
            G1(this.f4339b.f4266m, i3, i4);
        }

        public abstract p I();

        public void I0(g gVar, g gVar2) {
        }

        public void I1(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f4339b = null;
                this.f4338a = null;
                this.f4354q = 0;
                this.f4355r = 0;
            } else {
                this.f4339b = recyclerView;
                this.f4338a = recyclerView.f4258i;
                this.f4354q = recyclerView.getWidth();
                this.f4355r = recyclerView.getHeight();
            }
            this.f4352o = 1073741824;
            this.f4353p = 1073741824;
        }

        public p J(Context context, AttributeSet attributeSet) {
            return new p(context, attributeSet);
        }

        public boolean J0(RecyclerView recyclerView, ArrayList arrayList, int i3, int i4) {
            return false;
        }

        public boolean J1(View view, int i3, int i4, p pVar) {
            return (!view.isLayoutRequested() && this.f4348k && A0(view.getWidth(), i3, ((ViewGroup.MarginLayoutParams) pVar).width) && A0(view.getHeight(), i4, ((ViewGroup.MarginLayoutParams) pVar).height)) ? false : true;
        }

        public p K(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof p ? new p((p) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new p((ViewGroup.MarginLayoutParams) layoutParams) : new p(layoutParams);
        }

        public void K0(RecyclerView recyclerView) {
        }

        public boolean K1() {
            return false;
        }

        public int L() {
            return -1;
        }

        public void L0(RecyclerView recyclerView) {
        }

        public boolean L1(View view, int i3, int i4, p pVar) {
            return (this.f4348k && A0(view.getMeasuredWidth(), i3, ((ViewGroup.MarginLayoutParams) pVar).width) && A0(view.getMeasuredHeight(), i4, ((ViewGroup.MarginLayoutParams) pVar).height)) ? false : true;
        }

        public int M(View view) {
            return ((p) view.getLayoutParams()).f4363b.bottom;
        }

        public void M0(RecyclerView recyclerView, u uVar) {
            L0(recyclerView);
        }

        public abstract void M1(RecyclerView recyclerView, z zVar, int i3);

        public View N(int i3) {
            androidx.recyclerview.widget.b bVar = this.f4338a;
            if (bVar != null) {
                return bVar.f(i3);
            }
            return null;
        }

        public abstract View N0(View view, int i3, u uVar, z zVar);

        public void N1(y yVar) {
            y yVar2 = this.f4344g;
            if (yVar2 != null && yVar != yVar2 && yVar2.h()) {
                this.f4344g.r();
            }
            this.f4344g = yVar;
            yVar.q(this.f4339b, this);
        }

        public int O() {
            androidx.recyclerview.widget.b bVar = this.f4338a;
            if (bVar != null) {
                return bVar.g();
            }
            return 0;
        }

        public void O0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f4339b;
            P0(recyclerView.f4252f, recyclerView.f4263k0, accessibilityEvent);
        }

        public void O1() {
            y yVar = this.f4344g;
            if (yVar != null) {
                yVar.r();
            }
        }

        public void P0(u uVar, z zVar, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f4339b;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z3 = true;
            if (!recyclerView.canScrollVertically(1) && !this.f4339b.canScrollVertically(-1) && !this.f4339b.canScrollHorizontally(-1) && !this.f4339b.canScrollHorizontally(1)) {
                z3 = false;
            }
            accessibilityEvent.setScrollable(z3);
            g gVar = this.f4339b.f4272p;
            if (gVar != null) {
                accessibilityEvent.setItemCount(gVar.c());
            }
        }

        public boolean P1() {
            return false;
        }

        public final int[] Q(View view, Rect rect) {
            int i02 = i0();
            int k02 = k0();
            int s02 = s0() - j0();
            int b02 = b0() - h0();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i3 = left - i02;
            int min = Math.min(0, i3);
            int i4 = top - k02;
            int min2 = Math.min(0, i4);
            int i5 = width - s02;
            int max = Math.max(0, i5);
            int max2 = Math.max(0, height - b02);
            if (d0() != 1) {
                if (min == 0) {
                    min = Math.min(i3, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i5);
            }
            if (min2 == 0) {
                min2 = Math.min(i4, max2);
            }
            return new int[]{max, min2};
        }

        public void Q0(L.x xVar) {
            RecyclerView recyclerView = this.f4339b;
            R0(recyclerView.f4252f, recyclerView.f4263k0, xVar);
        }

        public boolean R() {
            RecyclerView recyclerView = this.f4339b;
            return recyclerView != null && recyclerView.f4262k;
        }

        public void R0(u uVar, z zVar, L.x xVar) {
            if (this.f4339b.canScrollVertically(-1) || this.f4339b.canScrollHorizontally(-1)) {
                xVar.a(8192);
                xVar.B0(true);
            }
            if (this.f4339b.canScrollVertically(1) || this.f4339b.canScrollHorizontally(1)) {
                xVar.a(4096);
                xVar.B0(true);
            }
            xVar.l0(x.e.a(o0(uVar, zVar), S(uVar, zVar), z0(uVar, zVar), p0(uVar, zVar)));
        }

        public int S(u uVar, z zVar) {
            RecyclerView recyclerView = this.f4339b;
            if (recyclerView == null || recyclerView.f4272p == null || !p()) {
                return 1;
            }
            return this.f4339b.f4272p.c();
        }

        public void S0(View view, L.x xVar) {
            C e02 = RecyclerView.e0(view);
            if (e02 == null || e02.v() || this.f4338a.n(e02.f4302a)) {
                return;
            }
            RecyclerView recyclerView = this.f4339b;
            T0(recyclerView.f4252f, recyclerView.f4263k0, view, xVar);
        }

        public int T(View view) {
            return view.getBottom() + M(view);
        }

        public void T0(u uVar, z zVar, View view, L.x xVar) {
            xVar.m0(x.f.a(q() ? l0(view) : 0, 1, p() ? l0(view) : 0, 1, false, false));
        }

        public void U(View view, Rect rect) {
            RecyclerView.f0(view, rect);
        }

        public View U0(View view, int i3) {
            return null;
        }

        public int V(View view) {
            return view.getLeft() - e0(view);
        }

        public void V0(RecyclerView recyclerView, int i3, int i4) {
        }

        public int W(View view) {
            Rect rect = ((p) view.getLayoutParams()).f4363b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public void W0(RecyclerView recyclerView) {
        }

        public int X(View view) {
            Rect rect = ((p) view.getLayoutParams()).f4363b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public void X0(RecyclerView recyclerView, int i3, int i4, int i5) {
        }

        public int Y(View view) {
            return view.getRight() + n0(view);
        }

        public void Y0(RecyclerView recyclerView, int i3, int i4) {
        }

        public int Z(View view) {
            return view.getTop() - q0(view);
        }

        public void Z0(RecyclerView recyclerView, int i3, int i4) {
        }

        public View a0() {
            View focusedChild;
            RecyclerView recyclerView = this.f4339b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f4338a.n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public void a1(RecyclerView recyclerView, int i3, int i4, Object obj) {
            Z0(recyclerView, i3, i4);
        }

        public int b() {
            RecyclerView recyclerView = this.f4339b;
            g adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.c();
            }
            return 0;
        }

        public int b0() {
            return this.f4355r;
        }

        public abstract void b1(u uVar, z zVar);

        public int c0() {
            return this.f4353p;
        }

        public void c1(z zVar) {
        }

        public int d0() {
            return O.w(this.f4339b);
        }

        public void d1(u uVar, z zVar, int i3, int i4) {
            this.f4339b.v(i3, i4);
        }

        public int e0(View view) {
            return ((p) view.getLayoutParams()).f4363b.left;
        }

        public boolean e1(RecyclerView recyclerView, View view, View view2) {
            return B0() || recyclerView.s0();
        }

        public int f0() {
            return O.x(this.f4339b);
        }

        public boolean f1(RecyclerView recyclerView, z zVar, View view, View view2) {
            return e1(recyclerView, view, view2);
        }

        public void g(View view) {
            h(view, -1);
        }

        public int g0() {
            return O.y(this.f4339b);
        }

        public void g1(Parcelable parcelable) {
        }

        public void h(View view, int i3) {
            k(view, i3, true);
        }

        public int h0() {
            RecyclerView recyclerView = this.f4339b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public Parcelable h1() {
            return null;
        }

        public void i(View view) {
            j(view, -1);
        }

        public int i0() {
            RecyclerView recyclerView = this.f4339b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public void i1(int i3) {
        }

        public void j(View view, int i3) {
            k(view, i3, false);
        }

        public int j0() {
            RecyclerView recyclerView = this.f4339b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public void j1(y yVar) {
            if (this.f4344g == yVar) {
                this.f4344g = null;
            }
        }

        public final void k(View view, int i3, boolean z3) {
            C e02 = RecyclerView.e0(view);
            if (z3 || e02.v()) {
                this.f4339b.f4260j.b(e02);
            } else {
                this.f4339b.f4260j.p(e02);
            }
            p pVar = (p) view.getLayoutParams();
            if (e02.L() || e02.w()) {
                if (e02.w()) {
                    e02.K();
                } else {
                    e02.e();
                }
                this.f4338a.c(view, i3, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f4339b) {
                int m3 = this.f4338a.m(view);
                if (i3 == -1) {
                    i3 = this.f4338a.g();
                }
                if (m3 == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f4339b.indexOfChild(view) + this.f4339b.O());
                }
                if (m3 != i3) {
                    this.f4339b.f4274q.F0(m3, i3);
                }
            } else {
                this.f4338a.a(view, i3, false);
                pVar.f4364c = true;
                y yVar = this.f4344g;
                if (yVar != null && yVar.h()) {
                    this.f4344g.k(view);
                }
            }
            if (pVar.f4365d) {
                e02.f4302a.invalidate();
                pVar.f4365d = false;
            }
        }

        public int k0() {
            RecyclerView recyclerView = this.f4339b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public boolean k1(int i3, Bundle bundle) {
            RecyclerView recyclerView = this.f4339b;
            return l1(recyclerView.f4252f, recyclerView.f4263k0, i3, bundle);
        }

        public void l(String str) {
            RecyclerView recyclerView = this.f4339b;
            if (recyclerView != null) {
                recyclerView.n(str);
            }
        }

        public int l0(View view) {
            return ((p) view.getLayoutParams()).a();
        }

        public boolean l1(u uVar, z zVar, int i3, Bundle bundle) {
            int b02;
            int s02;
            int i4;
            int i5;
            RecyclerView recyclerView = this.f4339b;
            if (recyclerView == null) {
                return false;
            }
            if (i3 == 4096) {
                b02 = recyclerView.canScrollVertically(1) ? (b0() - k0()) - h0() : 0;
                if (this.f4339b.canScrollHorizontally(1)) {
                    s02 = (s0() - i0()) - j0();
                    i4 = b02;
                    i5 = s02;
                }
                i4 = b02;
                i5 = 0;
            } else if (i3 != 8192) {
                i5 = 0;
                i4 = 0;
            } else {
                b02 = recyclerView.canScrollVertically(-1) ? -((b0() - k0()) - h0()) : 0;
                if (this.f4339b.canScrollHorizontally(-1)) {
                    s02 = -((s0() - i0()) - j0());
                    i4 = b02;
                    i5 = s02;
                }
                i4 = b02;
                i5 = 0;
            }
            if (i4 == 0 && i5 == 0) {
                return false;
            }
            this.f4339b.m1(i5, i4, null, Integer.MIN_VALUE, true);
            return true;
        }

        public void m(View view, int i3) {
            n(view, i3, (p) view.getLayoutParams());
        }

        public boolean m1(View view, int i3, Bundle bundle) {
            RecyclerView recyclerView = this.f4339b;
            return n1(recyclerView.f4252f, recyclerView.f4263k0, view, i3, bundle);
        }

        public void n(View view, int i3, p pVar) {
            C e02 = RecyclerView.e0(view);
            if (e02.v()) {
                this.f4339b.f4260j.b(e02);
            } else {
                this.f4339b.f4260j.p(e02);
            }
            this.f4338a.c(view, i3, pVar, e02.v());
        }

        public int n0(View view) {
            return ((p) view.getLayoutParams()).f4363b.right;
        }

        public boolean n1(u uVar, z zVar, View view, int i3, Bundle bundle) {
            return false;
        }

        public void o(View view, Rect rect) {
            RecyclerView recyclerView = this.f4339b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.i0(view));
            }
        }

        public int o0(u uVar, z zVar) {
            RecyclerView recyclerView = this.f4339b;
            if (recyclerView == null || recyclerView.f4272p == null || !q()) {
                return 1;
            }
            return this.f4339b.f4272p.c();
        }

        public void o1(u uVar) {
            for (int O3 = O() - 1; O3 >= 0; O3--) {
                if (!RecyclerView.e0(N(O3)).J()) {
                    r1(O3, uVar);
                }
            }
        }

        public abstract boolean p();

        public int p0(u uVar, z zVar) {
            return 0;
        }

        public void p1(u uVar) {
            int j3 = uVar.j();
            for (int i3 = j3 - 1; i3 >= 0; i3--) {
                View n3 = uVar.n(i3);
                C e02 = RecyclerView.e0(n3);
                if (!e02.J()) {
                    e02.G(false);
                    if (e02.x()) {
                        this.f4339b.removeDetachedView(n3, false);
                    }
                    l lVar = this.f4339b.f4238P;
                    if (lVar != null) {
                        lVar.j(e02);
                    }
                    e02.G(true);
                    uVar.y(n3);
                }
            }
            uVar.e();
            if (j3 > 0) {
                this.f4339b.invalidate();
            }
        }

        public abstract boolean q();

        public int q0(View view) {
            return ((p) view.getLayoutParams()).f4363b.top;
        }

        public void q1(View view, u uVar) {
            t1(view);
            uVar.B(view);
        }

        public boolean r(p pVar) {
            return pVar != null;
        }

        public void r0(View view, boolean z3, Rect rect) {
            Matrix matrix;
            if (z3) {
                Rect rect2 = ((p) view.getLayoutParams()).f4363b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.f4339b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f4339b.f4270o;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public void r1(int i3, u uVar) {
            View N3 = N(i3);
            u1(i3);
            uVar.B(N3);
        }

        public int s0() {
            return this.f4354q;
        }

        public boolean s1(Runnable runnable) {
            RecyclerView recyclerView = this.f4339b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public void t(int i3, int i4, z zVar, c cVar) {
        }

        public int t0() {
            return this.f4352o;
        }

        public void t1(View view) {
            this.f4338a.p(view);
        }

        public void u(int i3, c cVar) {
        }

        public boolean u0() {
            int O3 = O();
            for (int i3 = 0; i3 < O3; i3++) {
                ViewGroup.LayoutParams layoutParams = N(i3).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public void u1(int i3) {
            if (N(i3) != null) {
                this.f4338a.q(i3);
            }
        }

        public abstract int v(z zVar);

        public boolean v0() {
            return this.f4346i;
        }

        public boolean v1(RecyclerView recyclerView, View view, Rect rect, boolean z3) {
            return w1(recyclerView, view, rect, z3, false);
        }

        public abstract int w(z zVar);

        public abstract boolean w0();

        public boolean w1(RecyclerView recyclerView, View view, Rect rect, boolean z3, boolean z4) {
            int[] Q3 = Q(view, rect);
            int i3 = Q3[0];
            int i4 = Q3[1];
            if ((z4 && !x0(recyclerView, i3, i4)) || (i3 == 0 && i4 == 0)) {
                return false;
            }
            if (z3) {
                recyclerView.scrollBy(i3, i4);
            } else {
                recyclerView.j1(i3, i4);
            }
            return true;
        }

        public abstract int x(z zVar);

        public final boolean x0(RecyclerView recyclerView, int i3, int i4) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int i02 = i0();
            int k02 = k0();
            int s02 = s0() - j0();
            int b02 = b0() - h0();
            Rect rect = this.f4339b.f4266m;
            U(focusedChild, rect);
            return rect.left - i3 < s02 && rect.right - i3 > i02 && rect.top - i4 < b02 && rect.bottom - i4 > k02;
        }

        public void x1() {
            RecyclerView recyclerView = this.f4339b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public abstract int y(z zVar);

        public final boolean y0() {
            return this.f4349l;
        }

        public void y1() {
            this.f4345h = true;
        }

        public abstract int z(z zVar);

        public boolean z0(u uVar, z zVar) {
            return false;
        }

        public final void z1(u uVar, int i3, View view) {
            C e02 = RecyclerView.e0(view);
            if (e02.J()) {
                return;
            }
            if (e02.t() && !e02.v() && !this.f4339b.f4272p.g()) {
                u1(i3);
                uVar.C(e02);
            } else {
                C(i3);
                uVar.D(view);
                this.f4339b.f4260j.k(e02);
            }
        }
    }

    public static abstract class q {
        public abstract boolean a(int i3, int i4);
    }

    public interface r {
        boolean a(RecyclerView recyclerView, MotionEvent motionEvent);

        void b(RecyclerView recyclerView, MotionEvent motionEvent);

        void c(boolean z3);
    }

    public static abstract class s {
        public void a(RecyclerView recyclerView, int i3) {
        }

        public abstract void b(RecyclerView recyclerView, int i3, int i4);
    }

    public static class t {

        /* renamed from: a, reason: collision with root package name */
        public SparseArray f4366a = new SparseArray();

        /* renamed from: b, reason: collision with root package name */
        public int f4367b = 0;

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            public final ArrayList f4368a = new ArrayList();

            /* renamed from: b, reason: collision with root package name */
            public int f4369b = 5;

            /* renamed from: c, reason: collision with root package name */
            public long f4370c = 0;

            /* renamed from: d, reason: collision with root package name */
            public long f4371d = 0;
        }

        public void a() {
            this.f4367b++;
        }

        public void b() {
            for (int i3 = 0; i3 < this.f4366a.size(); i3++) {
                ((a) this.f4366a.valueAt(i3)).f4368a.clear();
            }
        }

        public void c() {
            this.f4367b--;
        }

        public void d(int i3, long j3) {
            a g3 = g(i3);
            g3.f4371d = j(g3.f4371d, j3);
        }

        public void e(int i3, long j3) {
            a g3 = g(i3);
            g3.f4370c = j(g3.f4370c, j3);
        }

        public C f(int i3) {
            a aVar = (a) this.f4366a.get(i3);
            if (aVar == null || aVar.f4368a.isEmpty()) {
                return null;
            }
            ArrayList arrayList = aVar.f4368a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!((C) arrayList.get(size)).r()) {
                    return (C) arrayList.remove(size);
                }
            }
            return null;
        }

        public final a g(int i3) {
            a aVar = (a) this.f4366a.get(i3);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.f4366a.put(i3, aVar2);
            return aVar2;
        }

        public void h(g gVar, g gVar2, boolean z3) {
            if (gVar != null) {
                c();
            }
            if (!z3 && this.f4367b == 0) {
                b();
            }
            if (gVar2 != null) {
                a();
            }
        }

        public void i(C c3) {
            int l3 = c3.l();
            ArrayList arrayList = g(l3).f4368a;
            if (((a) this.f4366a.get(l3)).f4369b <= arrayList.size()) {
                return;
            }
            c3.D();
            arrayList.add(c3);
        }

        public long j(long j3, long j4) {
            return j3 == 0 ? j4 : ((j3 / 4) * 3) + (j4 / 4);
        }

        public boolean k(int i3, long j3, long j4) {
            long j5 = g(i3).f4371d;
            return j5 == 0 || j3 + j5 < j4;
        }

        public boolean l(int i3, long j3, long j4) {
            long j5 = g(i3).f4370c;
            return j5 == 0 || j3 + j5 < j4;
        }
    }

    public final class u {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f4372a;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList f4373b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f4374c;

        /* renamed from: d, reason: collision with root package name */
        public final List f4375d;

        /* renamed from: e, reason: collision with root package name */
        public int f4376e;

        /* renamed from: f, reason: collision with root package name */
        public int f4377f;

        /* renamed from: g, reason: collision with root package name */
        public t f4378g;

        public u() {
            ArrayList arrayList = new ArrayList();
            this.f4372a = arrayList;
            this.f4373b = null;
            this.f4374c = new ArrayList();
            this.f4375d = Collections.unmodifiableList(arrayList);
            this.f4376e = 2;
            this.f4377f = 2;
        }

        public void A(int i3) {
            a((C) this.f4374c.get(i3), true);
            this.f4374c.remove(i3);
        }

        public void B(View view) {
            C e02 = RecyclerView.e0(view);
            if (e02.x()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (e02.w()) {
                e02.K();
            } else if (e02.L()) {
                e02.e();
            }
            C(e02);
            if (RecyclerView.this.f4238P == null || e02.u()) {
                return;
            }
            RecyclerView.this.f4238P.j(e02);
        }

        public void C(C c3) {
            boolean z3;
            boolean z4 = true;
            if (c3.w() || c3.f4302a.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(c3.w());
                sb.append(" isAttached:");
                sb.append(c3.f4302a.getParent() != null);
                sb.append(RecyclerView.this.O());
                throw new IllegalArgumentException(sb.toString());
            }
            if (c3.x()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + c3 + RecyclerView.this.O());
            }
            if (c3.J()) {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.O());
            }
            boolean h3 = c3.h();
            g gVar = RecyclerView.this.f4272p;
            if ((gVar != null && h3 && gVar.m(c3)) || c3.u()) {
                if (this.f4377f <= 0 || c3.p(526)) {
                    z3 = false;
                } else {
                    int size = this.f4374c.size();
                    if (size >= this.f4377f && size > 0) {
                        A(0);
                        size--;
                    }
                    if (RecyclerView.f4218E0 && size > 0 && !RecyclerView.this.f4261j0.d(c3.f4304c)) {
                        int i3 = size - 1;
                        while (i3 >= 0) {
                            if (!RecyclerView.this.f4261j0.d(((C) this.f4374c.get(i3)).f4304c)) {
                                break;
                            } else {
                                i3--;
                            }
                        }
                        size = i3 + 1;
                    }
                    this.f4374c.add(size, c3);
                    z3 = true;
                }
                if (z3) {
                    z4 = false;
                } else {
                    a(c3, true);
                }
                r1 = z3;
            } else {
                z4 = false;
            }
            RecyclerView.this.f4260j.q(c3);
            if (r1 || z4 || !h3) {
                return;
            }
            c3.f4319r = null;
        }

        public void D(View view) {
            C e02 = RecyclerView.e0(view);
            if (!e02.p(12) && e02.y() && !RecyclerView.this.o(e02)) {
                if (this.f4373b == null) {
                    this.f4373b = new ArrayList();
                }
                e02.H(this, true);
                this.f4373b.add(e02);
                return;
            }
            if (!e02.t() || e02.v() || RecyclerView.this.f4272p.g()) {
                e02.H(this, false);
                this.f4372a.add(e02);
            } else {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.O());
            }
        }

        public void E(t tVar) {
            t tVar2 = this.f4378g;
            if (tVar2 != null) {
                tVar2.c();
            }
            this.f4378g = tVar;
            if (tVar == null || RecyclerView.this.getAdapter() == null) {
                return;
            }
            this.f4378g.a();
        }

        public void F(A a3) {
        }

        public void G(int i3) {
            this.f4376e = i3;
            K();
        }

        public final boolean H(C c3, int i3, int i4, long j3) {
            c3.f4319r = RecyclerView.this;
            int l3 = c3.l();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j3 != Long.MAX_VALUE && !this.f4378g.k(l3, nanoTime, j3)) {
                return false;
            }
            RecyclerView.this.f4272p.a(c3, i3);
            this.f4378g.d(c3.l(), RecyclerView.this.getNanoTime() - nanoTime);
            b(c3);
            if (!RecyclerView.this.f4263k0.e()) {
                return true;
            }
            c3.f4308g = i4;
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x014a  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x01a1  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x01cb A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:81:0x01af  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public androidx.recyclerview.widget.RecyclerView.C I(int r17, boolean r18, long r19) {
            /*
                Method dump skipped, instructions count: 522
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.u.I(int, boolean, long):androidx.recyclerview.widget.RecyclerView$C");
        }

        public void J(C c3) {
            if (c3.f4316o) {
                this.f4373b.remove(c3);
            } else {
                this.f4372a.remove(c3);
            }
            c3.f4315n = null;
            c3.f4316o = false;
            c3.e();
        }

        public void K() {
            o oVar = RecyclerView.this.f4274q;
            this.f4377f = this.f4376e + (oVar != null ? oVar.f4350m : 0);
            for (int size = this.f4374c.size() - 1; size >= 0 && this.f4374c.size() > this.f4377f; size--) {
                A(size);
            }
        }

        public boolean L(C c3) {
            if (c3.v()) {
                return RecyclerView.this.f4263k0.e();
            }
            int i3 = c3.f4304c;
            if (i3 >= 0 && i3 < RecyclerView.this.f4272p.c()) {
                if (RecyclerView.this.f4263k0.e() || RecyclerView.this.f4272p.e(c3.f4304c) == c3.l()) {
                    return !RecyclerView.this.f4272p.g() || c3.k() == RecyclerView.this.f4272p.d(c3.f4304c);
                }
                return false;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + c3 + RecyclerView.this.O());
        }

        public void M(int i3, int i4) {
            int i5;
            int i6 = i4 + i3;
            for (int size = this.f4374c.size() - 1; size >= 0; size--) {
                C c3 = (C) this.f4374c.get(size);
                if (c3 != null && (i5 = c3.f4304c) >= i3 && i5 < i6) {
                    c3.b(2);
                    A(size);
                }
            }
        }

        public void a(C c3, boolean z3) {
            RecyclerView.q(c3);
            View view = c3.f4302a;
            androidx.recyclerview.widget.k kVar = RecyclerView.this.f4277r0;
            if (kVar != null) {
                C0184a n3 = kVar.n();
                O.j0(view, n3 instanceof k.a ? ((k.a) n3).n(view) : null);
            }
            if (z3) {
                g(c3);
            }
            c3.f4319r = null;
            i().i(c3);
        }

        public final void b(C c3) {
            if (RecyclerView.this.r0()) {
                View view = c3.f4302a;
                if (O.u(view) == 0) {
                    O.r0(view, 1);
                }
                androidx.recyclerview.widget.k kVar = RecyclerView.this.f4277r0;
                if (kVar == null) {
                    return;
                }
                C0184a n3 = kVar.n();
                if (n3 instanceof k.a) {
                    ((k.a) n3).o(view);
                }
                O.j0(view, n3);
            }
        }

        public void c() {
            this.f4372a.clear();
            z();
        }

        public void d() {
            int size = this.f4374c.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((C) this.f4374c.get(i3)).c();
            }
            int size2 = this.f4372a.size();
            for (int i4 = 0; i4 < size2; i4++) {
                ((C) this.f4372a.get(i4)).c();
            }
            ArrayList arrayList = this.f4373b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    ((C) this.f4373b.get(i5)).c();
                }
            }
        }

        public void e() {
            this.f4372a.clear();
            ArrayList arrayList = this.f4373b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public int f(int i3) {
            if (i3 >= 0 && i3 < RecyclerView.this.f4263k0.b()) {
                return !RecyclerView.this.f4263k0.e() ? i3 : RecyclerView.this.f4256h.m(i3);
            }
            throw new IndexOutOfBoundsException("invalid position " + i3 + ". State item count is " + RecyclerView.this.f4263k0.b() + RecyclerView.this.O());
        }

        public void g(C c3) {
            RecyclerView.this.getClass();
            g gVar = RecyclerView.this.f4272p;
            if (gVar != null) {
                gVar.p(c3);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f4263k0 != null) {
                recyclerView.f4260j.q(c3);
            }
        }

        public C h(int i3) {
            int size;
            int m3;
            ArrayList arrayList = this.f4373b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i4 = 0; i4 < size; i4++) {
                    C c3 = (C) this.f4373b.get(i4);
                    if (!c3.L() && c3.m() == i3) {
                        c3.b(32);
                        return c3;
                    }
                }
                if (RecyclerView.this.f4272p.g() && (m3 = RecyclerView.this.f4256h.m(i3)) > 0 && m3 < RecyclerView.this.f4272p.c()) {
                    long d3 = RecyclerView.this.f4272p.d(m3);
                    for (int i5 = 0; i5 < size; i5++) {
                        C c4 = (C) this.f4373b.get(i5);
                        if (!c4.L() && c4.k() == d3) {
                            c4.b(32);
                            return c4;
                        }
                    }
                }
            }
            return null;
        }

        public t i() {
            if (this.f4378g == null) {
                this.f4378g = new t();
            }
            return this.f4378g;
        }

        public int j() {
            return this.f4372a.size();
        }

        public List k() {
            return this.f4375d;
        }

        public C l(long j3, int i3, boolean z3) {
            for (int size = this.f4372a.size() - 1; size >= 0; size--) {
                C c3 = (C) this.f4372a.get(size);
                if (c3.k() == j3 && !c3.L()) {
                    if (i3 == c3.l()) {
                        c3.b(32);
                        if (c3.v() && !RecyclerView.this.f4263k0.e()) {
                            c3.F(2, 14);
                        }
                        return c3;
                    }
                    if (!z3) {
                        this.f4372a.remove(size);
                        RecyclerView.this.removeDetachedView(c3.f4302a, false);
                        y(c3.f4302a);
                    }
                }
            }
            int size2 = this.f4374c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                C c4 = (C) this.f4374c.get(size2);
                if (c4.k() == j3 && !c4.r()) {
                    if (i3 == c4.l()) {
                        if (!z3) {
                            this.f4374c.remove(size2);
                        }
                        return c4;
                    }
                    if (!z3) {
                        A(size2);
                        return null;
                    }
                }
            }
        }

        public C m(int i3, boolean z3) {
            View e3;
            int size = this.f4372a.size();
            for (int i4 = 0; i4 < size; i4++) {
                C c3 = (C) this.f4372a.get(i4);
                if (!c3.L() && c3.m() == i3 && !c3.t() && (RecyclerView.this.f4263k0.f4404h || !c3.v())) {
                    c3.b(32);
                    return c3;
                }
            }
            if (z3 || (e3 = RecyclerView.this.f4258i.e(i3)) == null) {
                int size2 = this.f4374c.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    C c4 = (C) this.f4374c.get(i5);
                    if (!c4.t() && c4.m() == i3 && !c4.r()) {
                        if (!z3) {
                            this.f4374c.remove(i5);
                        }
                        return c4;
                    }
                }
                return null;
            }
            C e02 = RecyclerView.e0(e3);
            RecyclerView.this.f4258i.s(e3);
            int m3 = RecyclerView.this.f4258i.m(e3);
            if (m3 != -1) {
                RecyclerView.this.f4258i.d(m3);
                D(e3);
                e02.b(8224);
                return e02;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + e02 + RecyclerView.this.O());
        }

        public View n(int i3) {
            return ((C) this.f4372a.get(i3)).f4302a;
        }

        public View o(int i3) {
            return p(i3, false);
        }

        public View p(int i3, boolean z3) {
            return I(i3, z3, Long.MAX_VALUE).f4302a;
        }

        public final void q(ViewGroup viewGroup, boolean z3) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    q((ViewGroup) childAt, true);
                }
            }
            if (z3) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        public final void r(C c3) {
            View view = c3.f4302a;
            if (view instanceof ViewGroup) {
                q((ViewGroup) view, false);
            }
        }

        public void s() {
            int size = this.f4374c.size();
            for (int i3 = 0; i3 < size; i3++) {
                p pVar = (p) ((C) this.f4374c.get(i3)).f4302a.getLayoutParams();
                if (pVar != null) {
                    pVar.f4364c = true;
                }
            }
        }

        public void t() {
            int size = this.f4374c.size();
            for (int i3 = 0; i3 < size; i3++) {
                C c3 = (C) this.f4374c.get(i3);
                if (c3 != null) {
                    c3.b(6);
                    c3.a(null);
                }
            }
            g gVar = RecyclerView.this.f4272p;
            if (gVar == null || !gVar.g()) {
                z();
            }
        }

        public void u(int i3, int i4) {
            int size = this.f4374c.size();
            for (int i5 = 0; i5 < size; i5++) {
                C c3 = (C) this.f4374c.get(i5);
                if (c3 != null && c3.f4304c >= i3) {
                    c3.A(i4, true);
                }
            }
        }

        public void v(int i3, int i4) {
            int i5;
            int i6;
            int i7;
            int i8;
            if (i3 < i4) {
                i5 = -1;
                i7 = i3;
                i6 = i4;
            } else {
                i5 = 1;
                i6 = i3;
                i7 = i4;
            }
            int size = this.f4374c.size();
            for (int i9 = 0; i9 < size; i9++) {
                C c3 = (C) this.f4374c.get(i9);
                if (c3 != null && (i8 = c3.f4304c) >= i7 && i8 <= i6) {
                    if (i8 == i3) {
                        c3.A(i4 - i3, false);
                    } else {
                        c3.A(i5, false);
                    }
                }
            }
        }

        public void w(int i3, int i4, boolean z3) {
            int i5 = i3 + i4;
            for (int size = this.f4374c.size() - 1; size >= 0; size--) {
                C c3 = (C) this.f4374c.get(size);
                if (c3 != null) {
                    int i6 = c3.f4304c;
                    if (i6 >= i5) {
                        c3.A(-i4, z3);
                    } else if (i6 >= i3) {
                        c3.b(8);
                        A(size);
                    }
                }
            }
        }

        public void x(g gVar, g gVar2, boolean z3) {
            c();
            i().h(gVar, gVar2, z3);
        }

        public void y(View view) {
            C e02 = RecyclerView.e0(view);
            e02.f4315n = null;
            e02.f4316o = false;
            e02.e();
            C(e02);
        }

        public void z() {
            for (int size = this.f4374c.size() - 1; size >= 0; size--) {
                A(size);
            }
            this.f4374c.clear();
            if (RecyclerView.f4218E0) {
                RecyclerView.this.f4261j0.b();
            }
        }
    }

    public interface v {
    }

    public class w extends i {
        public w() {
        }
    }

    public static abstract class y {

        /* renamed from: b, reason: collision with root package name */
        public RecyclerView f4383b;

        /* renamed from: c, reason: collision with root package name */
        public o f4384c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f4385d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f4386e;

        /* renamed from: f, reason: collision with root package name */
        public View f4387f;

        /* renamed from: h, reason: collision with root package name */
        public boolean f4389h;

        /* renamed from: a, reason: collision with root package name */
        public int f4382a = -1;

        /* renamed from: g, reason: collision with root package name */
        public final a f4388g = new a(0, 0);

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            public int f4390a;

            /* renamed from: b, reason: collision with root package name */
            public int f4391b;

            /* renamed from: c, reason: collision with root package name */
            public int f4392c;

            /* renamed from: d, reason: collision with root package name */
            public int f4393d;

            /* renamed from: e, reason: collision with root package name */
            public Interpolator f4394e;

            /* renamed from: f, reason: collision with root package name */
            public boolean f4395f;

            /* renamed from: g, reason: collision with root package name */
            public int f4396g;

            public a(int i3, int i4) {
                this(i3, i4, Integer.MIN_VALUE, null);
            }

            public boolean a() {
                return this.f4393d >= 0;
            }

            public void b(int i3) {
                this.f4393d = i3;
            }

            public void c(RecyclerView recyclerView) {
                int i3 = this.f4393d;
                if (i3 >= 0) {
                    this.f4393d = -1;
                    recyclerView.u0(i3);
                    this.f4395f = false;
                } else {
                    if (!this.f4395f) {
                        this.f4396g = 0;
                        return;
                    }
                    e();
                    recyclerView.f4257h0.f(this.f4390a, this.f4391b, this.f4392c, this.f4394e);
                    int i4 = this.f4396g + 1;
                    this.f4396g = i4;
                    if (i4 > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f4395f = false;
                }
            }

            public void d(int i3, int i4, int i5, Interpolator interpolator) {
                this.f4390a = i3;
                this.f4391b = i4;
                this.f4392c = i5;
                this.f4394e = interpolator;
                this.f4395f = true;
            }

            public final void e() {
                if (this.f4394e != null && this.f4392c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.f4392c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            public a(int i3, int i4, int i5, Interpolator interpolator) {
                this.f4393d = -1;
                this.f4395f = false;
                this.f4396g = 0;
                this.f4390a = i3;
                this.f4391b = i4;
                this.f4392c = i5;
                this.f4394e = interpolator;
            }
        }

        public interface b {
            PointF e(int i3);
        }

        public PointF a(int i3) {
            Object e3 = e();
            if (e3 instanceof b) {
                return ((b) e3).e(i3);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        public View b(int i3) {
            return this.f4383b.f4274q.H(i3);
        }

        public int c() {
            return this.f4383b.f4274q.O();
        }

        public int d(View view) {
            return this.f4383b.c0(view);
        }

        public o e() {
            return this.f4384c;
        }

        public int f() {
            return this.f4382a;
        }

        public boolean g() {
            return this.f4385d;
        }

        public boolean h() {
            return this.f4386e;
        }

        public void i(PointF pointF) {
            float f3 = pointF.x;
            float f4 = pointF.y;
            float sqrt = (float) Math.sqrt((f3 * f3) + (f4 * f4));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        public void j(int i3, int i4) {
            PointF a3;
            RecyclerView recyclerView = this.f4383b;
            if (this.f4382a == -1 || recyclerView == null) {
                r();
            }
            if (this.f4385d && this.f4387f == null && this.f4384c != null && (a3 = a(this.f4382a)) != null) {
                float f3 = a3.x;
                if (f3 != 0.0f || a3.y != 0.0f) {
                    recyclerView.e1((int) Math.signum(f3), (int) Math.signum(a3.y), null);
                }
            }
            this.f4385d = false;
            View view = this.f4387f;
            if (view != null) {
                if (d(view) == this.f4382a) {
                    o(this.f4387f, recyclerView.f4263k0, this.f4388g);
                    this.f4388g.c(recyclerView);
                    r();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f4387f = null;
                }
            }
            if (this.f4386e) {
                l(i3, i4, recyclerView.f4263k0, this.f4388g);
                boolean a4 = this.f4388g.a();
                this.f4388g.c(recyclerView);
                if (a4 && this.f4386e) {
                    this.f4385d = true;
                    recyclerView.f4257h0.e();
                }
            }
        }

        public void k(View view) {
            if (d(view) == f()) {
                this.f4387f = view;
            }
        }

        public abstract void l(int i3, int i4, z zVar, a aVar);

        public abstract void m();

        public abstract void n();

        public abstract void o(View view, z zVar, a aVar);

        public void p(int i3) {
            this.f4382a = i3;
        }

        public void q(RecyclerView recyclerView, o oVar) {
            recyclerView.f4257h0.g();
            if (this.f4389h) {
                Log.w("RecyclerView", "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.f4383b = recyclerView;
            this.f4384c = oVar;
            int i3 = this.f4382a;
            if (i3 == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.f4263k0.f4397a = i3;
            this.f4386e = true;
            this.f4385d = true;
            this.f4387f = b(f());
            m();
            this.f4383b.f4257h0.e();
            this.f4389h = true;
        }

        public final void r() {
            if (this.f4386e) {
                this.f4386e = false;
                n();
                this.f4383b.f4263k0.f4397a = -1;
                this.f4387f = null;
                this.f4382a = -1;
                this.f4385d = false;
                this.f4384c.j1(this);
                this.f4384c = null;
                this.f4383b = null;
            }
        }
    }

    public static class z {

        /* renamed from: b, reason: collision with root package name */
        public SparseArray f4398b;

        /* renamed from: m, reason: collision with root package name */
        public int f4409m;

        /* renamed from: n, reason: collision with root package name */
        public long f4410n;

        /* renamed from: o, reason: collision with root package name */
        public int f4411o;

        /* renamed from: p, reason: collision with root package name */
        public int f4412p;

        /* renamed from: q, reason: collision with root package name */
        public int f4413q;

        /* renamed from: a, reason: collision with root package name */
        public int f4397a = -1;

        /* renamed from: c, reason: collision with root package name */
        public int f4399c = 0;

        /* renamed from: d, reason: collision with root package name */
        public int f4400d = 0;

        /* renamed from: e, reason: collision with root package name */
        public int f4401e = 1;

        /* renamed from: f, reason: collision with root package name */
        public int f4402f = 0;

        /* renamed from: g, reason: collision with root package name */
        public boolean f4403g = false;

        /* renamed from: h, reason: collision with root package name */
        public boolean f4404h = false;

        /* renamed from: i, reason: collision with root package name */
        public boolean f4405i = false;

        /* renamed from: j, reason: collision with root package name */
        public boolean f4406j = false;

        /* renamed from: k, reason: collision with root package name */
        public boolean f4407k = false;

        /* renamed from: l, reason: collision with root package name */
        public boolean f4408l = false;

        public void a(int i3) {
            if ((this.f4401e & i3) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i3) + " but it is " + Integer.toBinaryString(this.f4401e));
        }

        public int b() {
            return this.f4404h ? this.f4399c - this.f4400d : this.f4402f;
        }

        public int c() {
            return this.f4397a;
        }

        public boolean d() {
            return this.f4397a != -1;
        }

        public boolean e() {
            return this.f4404h;
        }

        public void f(g gVar) {
            this.f4401e = 1;
            this.f4402f = gVar.c();
            this.f4404h = false;
            this.f4405i = false;
            this.f4406j = false;
        }

        public boolean g() {
            return this.f4408l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f4397a + ", mData=" + this.f4398b + ", mItemCount=" + this.f4402f + ", mIsMeasuring=" + this.f4406j + ", mPreviousLayoutItemCount=" + this.f4399c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f4400d + ", mStructureChanged=" + this.f4403g + ", mInPreLayout=" + this.f4404h + ", mRunSimpleAnimations=" + this.f4407k + ", mRunPredictiveAnimations=" + this.f4408l + '}';
        }
    }

    static {
        Class cls = Integer.TYPE;
        f4221H0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f4222I0 = new InterpolatorC0352c();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0595a.f8493a);
    }

    public static RecyclerView U(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            RecyclerView U3 = U(viewGroup.getChildAt(i3));
            if (U3 != null) {
                return U3;
            }
        }
        return null;
    }

    public static C e0(View view) {
        if (view == null) {
            return null;
        }
        return ((p) view.getLayoutParams()).f4362a;
    }

    public static void f0(View view, Rect rect) {
        p pVar = (p) view.getLayoutParams();
        Rect rect2 = pVar.f4363b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) pVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) pVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) pVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin);
    }

    private C0219y getScrollingChildHelper() {
        if (this.f4281t0 == null) {
            this.f4281t0 = new C0219y(this);
        }
        return this.f4281t0;
    }

    public static void q(C c3) {
        WeakReference weakReference = c3.f4303b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == c3.f4302a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            c3.f4303b = null;
        }
    }

    public void A() {
        if (this.f4272p == null) {
            Log.e("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.f4274q == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        z zVar = this.f4263k0;
        zVar.f4406j = false;
        if (zVar.f4401e == 1) {
            B();
            this.f4274q.D1(this);
            C();
        } else if (!this.f4256h.q() && this.f4274q.s0() == getWidth() && this.f4274q.b0() == getHeight()) {
            this.f4274q.D1(this);
        } else {
            this.f4274q.D1(this);
            C();
        }
        D();
    }

    public void A0(int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int j3 = this.f4258i.j();
        if (i3 < i4) {
            i7 = -1;
            i6 = i3;
            i5 = i4;
        } else {
            i5 = i3;
            i6 = i4;
            i7 = 1;
        }
        for (int i9 = 0; i9 < j3; i9++) {
            C e02 = e0(this.f4258i.i(i9));
            if (e02 != null && (i8 = e02.f4304c) >= i6 && i8 <= i5) {
                if (i8 == i3) {
                    e02.A(i4 - i3, false);
                } else {
                    e02.A(i7, false);
                }
                this.f4263k0.f4403g = true;
            }
        }
        this.f4252f.v(i3, i4);
        requestLayout();
    }

    public final void B() {
        this.f4263k0.a(1);
        P(this.f4263k0);
        this.f4263k0.f4406j = false;
        o1();
        this.f4260j.f();
        E0();
        M0();
        b1();
        z zVar = this.f4263k0;
        zVar.f4405i = zVar.f4407k && this.f4271o0;
        this.f4271o0 = false;
        this.f4269n0 = false;
        zVar.f4404h = zVar.f4408l;
        zVar.f4402f = this.f4272p.c();
        T(this.f4279s0);
        if (this.f4263k0.f4407k) {
            int g3 = this.f4258i.g();
            for (int i3 = 0; i3 < g3; i3++) {
                C e02 = e0(this.f4258i.f(i3));
                if (!e02.J() && (!e02.t() || this.f4272p.g())) {
                    this.f4260j.e(e02, this.f4238P.t(this.f4263k0, e02, l.e(e02), e02.o()));
                    if (this.f4263k0.f4405i && e02.y() && !e02.v() && !e02.J() && !e02.t()) {
                        this.f4260j.c(b0(e02), e02);
                    }
                }
            }
        }
        if (this.f4263k0.f4408l) {
            c1();
            z zVar2 = this.f4263k0;
            boolean z3 = zVar2.f4403g;
            zVar2.f4403g = false;
            this.f4274q.b1(this.f4252f, zVar2);
            this.f4263k0.f4403g = z3;
            for (int i4 = 0; i4 < this.f4258i.g(); i4++) {
                C e03 = e0(this.f4258i.f(i4));
                if (!e03.J() && !this.f4260j.i(e03)) {
                    int e3 = l.e(e03);
                    boolean p3 = e03.p(8192);
                    if (!p3) {
                        e3 |= 4096;
                    }
                    l.b t3 = this.f4238P.t(this.f4263k0, e03, e3, e03.o());
                    if (p3) {
                        P0(e03, t3);
                    } else {
                        this.f4260j.a(e03, t3);
                    }
                }
            }
            r();
        } else {
            r();
        }
        F0();
        q1(false);
        this.f4263k0.f4401e = 2;
    }

    public void B0(int i3, int i4, boolean z3) {
        int i5 = i3 + i4;
        int j3 = this.f4258i.j();
        for (int i6 = 0; i6 < j3; i6++) {
            C e02 = e0(this.f4258i.i(i6));
            if (e02 != null && !e02.J()) {
                int i7 = e02.f4304c;
                if (i7 >= i5) {
                    e02.A(-i4, z3);
                    this.f4263k0.f4403g = true;
                } else if (i7 >= i3) {
                    e02.i(i3 - 1, -i4, z3);
                    this.f4263k0.f4403g = true;
                }
            }
        }
        this.f4252f.w(i3, i4, z3);
        requestLayout();
    }

    public final void C() {
        o1();
        E0();
        this.f4263k0.a(6);
        this.f4256h.j();
        this.f4263k0.f4402f = this.f4272p.c();
        z zVar = this.f4263k0;
        zVar.f4400d = 0;
        zVar.f4404h = false;
        this.f4274q.b1(this.f4252f, zVar);
        z zVar2 = this.f4263k0;
        zVar2.f4403g = false;
        this.f4254g = null;
        zVar2.f4407k = zVar2.f4407k && this.f4238P != null;
        zVar2.f4401e = 4;
        F0();
        q1(false);
    }

    public void C0(View view) {
    }

    public final void D() {
        RecyclerView recyclerView;
        this.f4263k0.a(4);
        o1();
        E0();
        z zVar = this.f4263k0;
        zVar.f4401e = 1;
        if (zVar.f4407k) {
            for (int g3 = this.f4258i.g() - 1; g3 >= 0; g3--) {
                C e02 = e0(this.f4258i.f(g3));
                if (!e02.J()) {
                    long b02 = b0(e02);
                    l.b s3 = this.f4238P.s(this.f4263k0, e02);
                    C g4 = this.f4260j.g(b02);
                    if (g4 == null || g4.J()) {
                        this.f4260j.d(e02, s3);
                    } else {
                        boolean h3 = this.f4260j.h(g4);
                        boolean h4 = this.f4260j.h(e02);
                        if (h3 && g4 == e02) {
                            this.f4260j.d(e02, s3);
                        } else {
                            l.b n3 = this.f4260j.n(g4);
                            this.f4260j.d(e02, s3);
                            l.b m3 = this.f4260j.m(e02);
                            if (n3 == null) {
                                j0(b02, e02, g4);
                            } else {
                                l(g4, e02, n3, m3, h3, h4);
                            }
                        }
                    }
                }
            }
            recyclerView = this;
            recyclerView.f4260j.o(recyclerView.f4293z0);
        } else {
            recyclerView = this;
        }
        recyclerView.f4274q.p1(recyclerView.f4252f);
        z zVar2 = recyclerView.f4263k0;
        zVar2.f4399c = zVar2.f4402f;
        recyclerView.f4229G = false;
        recyclerView.f4230H = false;
        zVar2.f4407k = false;
        zVar2.f4408l = false;
        recyclerView.f4274q.f4345h = false;
        ArrayList arrayList = recyclerView.f4252f.f4373b;
        if (arrayList != null) {
            arrayList.clear();
        }
        o oVar = recyclerView.f4274q;
        if (oVar.f4351n) {
            oVar.f4350m = 0;
            oVar.f4351n = false;
            recyclerView.f4252f.K();
        }
        recyclerView.f4274q.c1(recyclerView.f4263k0);
        F0();
        q1(false);
        recyclerView.f4260j.f();
        int[] iArr = recyclerView.f4279s0;
        if (w(iArr[0], iArr[1])) {
            H(0, 0);
        }
        Q0();
        Z0();
    }

    public void D0(View view) {
    }

    public boolean E(int i3, int i4, int[] iArr, int[] iArr2, int i5) {
        return getScrollingChildHelper().d(i3, i4, iArr, iArr2, i5);
    }

    public void E0() {
        this.f4231I++;
    }

    public final void F(int i3, int i4, int i5, int i6, int[] iArr, int i7, int[] iArr2) {
        getScrollingChildHelper().e(i3, i4, i5, i6, iArr, i7, iArr2);
    }

    public void F0() {
        G0(true);
    }

    public void G(int i3) {
        o oVar = this.f4274q;
        if (oVar != null) {
            oVar.i1(i3);
        }
        I0(i3);
        s sVar = this.f4265l0;
        if (sVar != null) {
            sVar.a(this, i3);
        }
        List list = this.f4267m0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((s) this.f4267m0.get(size)).a(this, i3);
            }
        }
    }

    public void G0(boolean z3) {
        int i3 = this.f4231I - 1;
        this.f4231I = i3;
        if (i3 < 1) {
            this.f4231I = 0;
            if (z3) {
                z();
                I();
            }
        }
    }

    public void H(int i3, int i4) {
        this.f4232J++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i3, scrollY - i4);
        J0(i3, i4);
        s sVar = this.f4265l0;
        if (sVar != null) {
            sVar.b(this, i3, i4);
        }
        List list = this.f4267m0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((s) this.f4267m0.get(size)).b(this, i3, i4);
            }
        }
        this.f4232J--;
    }

    public final void H0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f4240R) {
            int i3 = actionIndex == 0 ? 1 : 0;
            this.f4240R = motionEvent.getPointerId(i3);
            int x3 = (int) (motionEvent.getX(i3) + 0.5f);
            this.f4244V = x3;
            this.f4242T = x3;
            int y3 = (int) (motionEvent.getY(i3) + 0.5f);
            this.f4245W = y3;
            this.f4243U = y3;
        }
    }

    public void I() {
        int i3;
        for (int size = this.f4289x0.size() - 1; size >= 0; size--) {
            C c3 = (C) this.f4289x0.get(size);
            if (c3.f4302a.getParent() == this && !c3.J() && (i3 = c3.f4318q) != -1) {
                O.r0(c3.f4302a, i3);
                c3.f4318q = -1;
            }
        }
        this.f4289x0.clear();
    }

    public void I0(int i3) {
    }

    public final boolean J(MotionEvent motionEvent) {
        r rVar = this.f4280t;
        if (rVar == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return S(motionEvent);
        }
        rVar.b(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.f4280t = null;
        }
        return true;
    }

    public void J0(int i3, int i4) {
    }

    public void K() {
        if (this.f4237O != null) {
            return;
        }
        EdgeEffect a3 = this.f4233K.a(this, 3);
        this.f4237O = a3;
        if (this.f4262k) {
            a3.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            a3.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void K0() {
        if (this.f4275q0 || !this.f4282u) {
            return;
        }
        O.b0(this, this.f4291y0);
        this.f4275q0 = true;
    }

    public void L() {
        if (this.f4234L != null) {
            return;
        }
        EdgeEffect a3 = this.f4233K.a(this, 0);
        this.f4234L = a3;
        if (this.f4262k) {
            a3.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            a3.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final boolean L0() {
        return this.f4238P != null && this.f4274q.P1();
    }

    public void M() {
        if (this.f4236N != null) {
            return;
        }
        EdgeEffect a3 = this.f4233K.a(this, 2);
        this.f4236N = a3;
        if (this.f4262k) {
            a3.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            a3.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void M0() {
        boolean z3;
        if (this.f4229G) {
            this.f4256h.u();
            if (this.f4230H) {
                this.f4274q.W0(this);
            }
        }
        if (L0()) {
            this.f4256h.s();
        } else {
            this.f4256h.j();
        }
        boolean z4 = this.f4269n0 || this.f4271o0;
        this.f4263k0.f4407k = this.f4288x && this.f4238P != null && ((z3 = this.f4229G) || z4 || this.f4274q.f4345h) && (!z3 || this.f4272p.g());
        z zVar = this.f4263k0;
        zVar.f4408l = zVar.f4407k && z4 && !this.f4229G && L0();
    }

    public void N() {
        if (this.f4235M != null) {
            return;
        }
        EdgeEffect a3 = this.f4233K.a(this, 1);
        this.f4235M = a3;
        if (this.f4262k) {
            a3.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            a3.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void N0(boolean z3) {
        this.f4230H = z3 | this.f4230H;
        this.f4229G = true;
        w0();
    }

    public String O() {
        return " " + super.toString() + ", adapter:" + this.f4272p + ", layout:" + this.f4274q + ", context:" + getContext();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void O0(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 0
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1
            if (r1 >= 0) goto L21
            r6.L()
            android.widget.EdgeEffect r1 = r6.f4234L
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r2 - r9
            Q.c.c(r1, r4, r9)
        L1f:
            r9 = r3
            goto L3c
        L21:
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r1 <= 0) goto L3b
            r6.M()
            android.widget.EdgeEffect r1 = r6.f4236N
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            Q.c.c(r1, r4, r9)
            goto L1f
        L3b:
            r9 = 0
        L3c:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L56
            r6.N()
            android.widget.EdgeEffect r9 = r6.f4235M
            float r1 = -r10
            int r2 = r6.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            int r2 = r6.getWidth()
            float r2 = (float) r2
            float r7 = r7 / r2
            Q.c.c(r9, r1, r7)
            goto L72
        L56:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 <= 0) goto L71
            r6.K()
            android.widget.EdgeEffect r9 = r6.f4237O
            int r1 = r6.getHeight()
            float r1 = (float) r1
            float r1 = r10 / r1
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r2 = r2 - r7
            Q.c.c(r9, r1, r2)
            goto L72
        L71:
            r3 = r9
        L72:
            if (r3 != 0) goto L7e
            int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r7 != 0) goto L7e
            int r7 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r7 == 0) goto L7d
            goto L7e
        L7d:
            return
        L7e:
            K.O.a0(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.O0(float, float, float, float):void");
    }

    public final void P(z zVar) {
        if (getScrollState() != 2) {
            zVar.f4412p = 0;
            zVar.f4413q = 0;
        } else {
            OverScroller overScroller = this.f4257h0.f4296g;
            zVar.f4412p = overScroller.getFinalX() - overScroller.getCurrX();
            zVar.f4413q = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    public void P0(C c3, l.b bVar) {
        c3.F(0, 8192);
        if (this.f4263k0.f4405i && c3.y() && !c3.v() && !c3.J()) {
            this.f4260j.c(b0(c3), c3);
        }
        this.f4260j.e(c3, bVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View Q(android.view.View r3) {
        /*
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L4:
            if (r0 == 0) goto L14
            if (r0 == r2) goto L14
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L4
        L14:
            if (r0 != r2) goto L17
            return r3
        L17:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.Q(android.view.View):android.view.View");
    }

    public final void Q0() {
        View findViewById;
        if (!this.f4255g0 || this.f4272p == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (!f4220G0 || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                if (!this.f4258i.n(focusedChild)) {
                    return;
                }
            } else if (this.f4258i.g() == 0) {
                requestFocus();
                return;
            }
        }
        View view = null;
        C X2 = (this.f4263k0.f4410n == -1 || !this.f4272p.g()) ? null : X(this.f4263k0.f4410n);
        if (X2 != null && !this.f4258i.n(X2.f4302a) && X2.f4302a.hasFocusable()) {
            view = X2.f4302a;
        } else if (this.f4258i.g() > 0) {
            view = V();
        }
        if (view != null) {
            int i3 = this.f4263k0.f4411o;
            if (i3 != -1 && (findViewById = view.findViewById(i3)) != null && findViewById.isFocusable()) {
                view = findViewById;
            }
            view.requestFocus();
        }
    }

    public C R(View view) {
        View Q3 = Q(view);
        if (Q3 == null) {
            return null;
        }
        return d0(Q3);
    }

    public final void R0() {
        boolean z3;
        EdgeEffect edgeEffect = this.f4234L;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z3 = this.f4234L.isFinished();
        } else {
            z3 = false;
        }
        EdgeEffect edgeEffect2 = this.f4235M;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z3 |= this.f4235M.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f4236N;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z3 |= this.f4236N.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f4237O;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z3 |= this.f4237O.isFinished();
        }
        if (z3) {
            O.a0(this);
        }
    }

    public final boolean S(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f4278s.size();
        for (int i3 = 0; i3 < size; i3++) {
            r rVar = (r) this.f4278s.get(i3);
            if (rVar.a(this, motionEvent) && action != 3) {
                this.f4280t = rVar;
                return true;
            }
        }
        return false;
    }

    public void S0() {
        l lVar = this.f4238P;
        if (lVar != null) {
            lVar.k();
        }
        o oVar = this.f4274q;
        if (oVar != null) {
            oVar.o1(this.f4252f);
            this.f4274q.p1(this.f4252f);
        }
        this.f4252f.c();
    }

    public final void T(int[] iArr) {
        int g3 = this.f4258i.g();
        if (g3 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MIN_VALUE;
        for (int i5 = 0; i5 < g3; i5++) {
            C e02 = e0(this.f4258i.f(i5));
            if (!e02.J()) {
                int m3 = e02.m();
                if (m3 < i3) {
                    i3 = m3;
                }
                if (m3 > i4) {
                    i4 = m3;
                }
            }
        }
        iArr[0] = i3;
        iArr[1] = i4;
    }

    public boolean T0(View view) {
        o1();
        boolean r3 = this.f4258i.r(view);
        if (r3) {
            C e02 = e0(view);
            this.f4252f.J(e02);
            this.f4252f.C(e02);
        }
        q1(!r3);
        return r3;
    }

    public void U0(n nVar) {
        o oVar = this.f4274q;
        if (oVar != null) {
            oVar.l("Cannot remove item decoration during a scroll  or layout");
        }
        this.f4276r.remove(nVar);
        if (this.f4276r.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        v0();
        requestLayout();
    }

    public final View V() {
        C W2;
        z zVar = this.f4263k0;
        int i3 = zVar.f4409m;
        if (i3 == -1) {
            i3 = 0;
        }
        int b3 = zVar.b();
        for (int i4 = i3; i4 < b3; i4++) {
            C W3 = W(i4);
            if (W3 == null) {
                break;
            }
            if (W3.f4302a.hasFocusable()) {
                return W3.f4302a;
            }
        }
        int min = Math.min(b3, i3);
        do {
            min--;
            if (min < 0 || (W2 = W(min)) == null) {
                return null;
            }
        } while (!W2.f4302a.hasFocusable());
        return W2.f4302a;
    }

    public void V0(r rVar) {
        this.f4278s.remove(rVar);
        if (this.f4280t == rVar) {
            this.f4280t = null;
        }
    }

    public C W(int i3) {
        C c3 = null;
        if (this.f4229G) {
            return null;
        }
        int j3 = this.f4258i.j();
        for (int i4 = 0; i4 < j3; i4++) {
            C e02 = e0(this.f4258i.i(i4));
            if (e02 != null && !e02.v() && a0(e02) == i3) {
                if (!this.f4258i.n(e02.f4302a)) {
                    return e02;
                }
                c3 = e02;
            }
        }
        return c3;
    }

    public void W0(s sVar) {
        List list = this.f4267m0;
        if (list != null) {
            list.remove(sVar);
        }
    }

    public C X(long j3) {
        g gVar = this.f4272p;
        C c3 = null;
        if (gVar != null && gVar.g()) {
            int j4 = this.f4258i.j();
            for (int i3 = 0; i3 < j4; i3++) {
                C e02 = e0(this.f4258i.i(i3));
                if (e02 != null && !e02.v() && e02.k() == j3) {
                    if (!this.f4258i.n(e02.f4302a)) {
                        return e02;
                    }
                    c3 = e02;
                }
            }
        }
        return c3;
    }

    public void X0() {
        C c3;
        int g3 = this.f4258i.g();
        for (int i3 = 0; i3 < g3; i3++) {
            View f3 = this.f4258i.f(i3);
            C d02 = d0(f3);
            if (d02 != null && (c3 = d02.f4310i) != null) {
                View view = c3.f4302a;
                int left = f3.getLeft();
                int top = f3.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.recyclerview.widget.RecyclerView.C Y(int r6, boolean r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.b r0 = r5.f4258i
            int r0 = r0.j()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3a
            androidx.recyclerview.widget.b r3 = r5.f4258i
            android.view.View r3 = r3.i(r2)
            androidx.recyclerview.widget.RecyclerView$C r3 = e0(r3)
            if (r3 == 0) goto L37
            boolean r4 = r3.v()
            if (r4 != 0) goto L37
            if (r7 == 0) goto L23
            int r4 = r3.f4304c
            if (r4 == r6) goto L2a
            goto L37
        L23:
            int r4 = r3.m()
            if (r4 == r6) goto L2a
            goto L37
        L2a:
            androidx.recyclerview.widget.b r1 = r5.f4258i
            android.view.View r4 = r3.f4302a
            boolean r1 = r1.n(r4)
            if (r1 == 0) goto L36
            r1 = r3
            goto L37
        L36:
            return r3
        L37:
            int r2 = r2 + 1
            goto L8
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.Y(int, boolean):androidx.recyclerview.widget.RecyclerView$C");
    }

    public final void Y0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f4266m.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof p) {
            p pVar = (p) layoutParams;
            if (!pVar.f4364c) {
                Rect rect = pVar.f4363b;
                Rect rect2 = this.f4266m;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f4266m);
            offsetRectIntoDescendantCoords(view, this.f4266m);
        }
        this.f4274q.w1(this, view, this.f4266m, !this.f4288x, view2 == null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public boolean Z(int i3, int i4) {
        o oVar = this.f4274q;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.f4223A) {
            return false;
        }
        int p3 = oVar.p();
        boolean q3 = this.f4274q.q();
        if (p3 == 0 || Math.abs(i3) < this.f4248c0) {
            i3 = 0;
        }
        if (!q3 || Math.abs(i4) < this.f4248c0) {
            i4 = 0;
        }
        if (i3 == 0 && i4 == 0) {
            return false;
        }
        float f3 = i3;
        float f4 = i4;
        if (!dispatchNestedPreFling(f3, f4)) {
            boolean z3 = p3 != 0 || q3;
            dispatchNestedFling(f3, f4, z3);
            q qVar = this.f4247b0;
            if (qVar != null && qVar.a(i3, i4)) {
                return true;
            }
            if (z3) {
                if (q3) {
                    p3 = (p3 == true ? 1 : 0) | 2;
                }
                p1(p3, 1);
                int i5 = this.f4249d0;
                int max = Math.max(-i5, Math.min(i3, i5));
                int i6 = this.f4249d0;
                this.f4257h0.c(max, Math.max(-i6, Math.min(i4, i6)));
                return true;
            }
        }
        return false;
    }

    public final void Z0() {
        z zVar = this.f4263k0;
        zVar.f4410n = -1L;
        zVar.f4409m = -1;
        zVar.f4411o = -1;
    }

    public void a(int i3, int i4) {
        if (i3 < 0) {
            L();
            if (this.f4234L.isFinished()) {
                this.f4234L.onAbsorb(-i3);
            }
        } else if (i3 > 0) {
            M();
            if (this.f4236N.isFinished()) {
                this.f4236N.onAbsorb(i3);
            }
        }
        if (i4 < 0) {
            N();
            if (this.f4235M.isFinished()) {
                this.f4235M.onAbsorb(-i4);
            }
        } else if (i4 > 0) {
            K();
            if (this.f4237O.isFinished()) {
                this.f4237O.onAbsorb(i4);
            }
        }
        if (i3 == 0 && i4 == 0) {
            return;
        }
        O.a0(this);
    }

    public int a0(C c3) {
        if (c3.p(524) || !c3.s()) {
            return -1;
        }
        return this.f4256h.e(c3.f4304c);
    }

    public final void a1() {
        VelocityTracker velocityTracker = this.f4241S;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        r1(0);
        R0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i3, int i4) {
        o oVar = this.f4274q;
        if (oVar == null || !oVar.J0(this, arrayList, i3, i4)) {
            super.addFocusables(arrayList, i3, i4);
        }
    }

    public long b0(C c3) {
        return this.f4272p.g() ? c3.k() : c3.f4304c;
    }

    public final void b1() {
        View focusedChild = (this.f4255g0 && hasFocus() && this.f4272p != null) ? getFocusedChild() : null;
        C R3 = focusedChild != null ? R(focusedChild) : null;
        if (R3 == null) {
            Z0();
            return;
        }
        this.f4263k0.f4410n = this.f4272p.g() ? R3.k() : -1L;
        this.f4263k0.f4409m = this.f4229G ? -1 : R3.v() ? R3.f4305d : R3.j();
        this.f4263k0.f4411o = g0(R3.f4302a);
    }

    public int c0(View view) {
        C e02 = e0(view);
        if (e02 != null) {
            return e02.m();
        }
        return -1;
    }

    public void c1() {
        int j3 = this.f4258i.j();
        for (int i3 = 0; i3 < j3; i3++) {
            C e02 = e0(this.f4258i.i(i3));
            if (!e02.J()) {
                e02.E();
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof p) && this.f4274q.r((p) layoutParams);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        o oVar = this.f4274q;
        if (oVar != null && oVar.p()) {
            return this.f4274q.v(this.f4263k0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        o oVar = this.f4274q;
        if (oVar != null && oVar.p()) {
            return this.f4274q.w(this.f4263k0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        o oVar = this.f4274q;
        if (oVar != null && oVar.p()) {
            return this.f4274q.x(this.f4263k0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        o oVar = this.f4274q;
        if (oVar != null && oVar.q()) {
            return this.f4274q.y(this.f4263k0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        o oVar = this.f4274q;
        if (oVar != null && oVar.q()) {
            return this.f4274q.z(this.f4263k0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        o oVar = this.f4274q;
        if (oVar != null && oVar.q()) {
            return this.f4274q.A(this.f4263k0);
        }
        return 0;
    }

    public C d0(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return e0(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public boolean d1(int i3, int i4, MotionEvent motionEvent) {
        int i5;
        int i6;
        int i7;
        int i8;
        t();
        if (this.f4272p != null) {
            int[] iArr = this.f4287w0;
            iArr[0] = 0;
            iArr[1] = 0;
            e1(i3, i4, iArr);
            int[] iArr2 = this.f4287w0;
            int i9 = iArr2[0];
            int i10 = iArr2[1];
            i7 = i3 - i9;
            i8 = i4 - i10;
            i6 = i10;
            i5 = i9;
        } else {
            i5 = 0;
            i6 = 0;
            i7 = 0;
            i8 = 0;
        }
        if (!this.f4276r.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.f4287w0;
        iArr3[0] = 0;
        iArr3[1] = 0;
        F(i5, i6, i7, i8, this.f4283u0, 0, iArr3);
        int[] iArr4 = this.f4287w0;
        int i11 = iArr4[0];
        int i12 = i7 - i11;
        int i13 = iArr4[1];
        int i14 = i8 - i13;
        boolean z3 = (i11 == 0 && i13 == 0) ? false : true;
        int i15 = this.f4244V;
        int[] iArr5 = this.f4283u0;
        int i16 = iArr5[0];
        this.f4244V = i15 - i16;
        int i17 = this.f4245W;
        int i18 = iArr5[1];
        this.f4245W = i17 - i18;
        int[] iArr6 = this.f4285v0;
        iArr6[0] = iArr6[0] + i16;
        iArr6[1] = iArr6[1] + i18;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !AbstractC0218x.a(motionEvent, 8194)) {
                O0(motionEvent.getX(), i12, motionEvent.getY(), i14);
            }
            s(i3, i4);
        }
        if (i5 != 0 || i6 != 0) {
            H(i5, i6);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z3 && i5 == 0 && i6 == 0) ? false : true;
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f3, float f4, boolean z3) {
        return getScrollingChildHelper().a(f3, f4, z3);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f3, float f4) {
        return getScrollingChildHelper().b(f3, f4);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i3, int i4, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i3, i4, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i3, int i4, int i5, int i6, int[] iArr) {
        return getScrollingChildHelper().f(i3, i4, i5, i6, iArr);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z3;
        super.draw(canvas);
        int size = this.f4276r.size();
        boolean z4 = false;
        for (int i3 = 0; i3 < size; i3++) {
            ((n) this.f4276r.get(i3)).i(canvas, this, this.f4263k0);
        }
        EdgeEffect edgeEffect = this.f4234L;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z3 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f4262k ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f4234L;
            z3 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.f4235M;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f4262k) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f4235M;
            z3 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.f4236N;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f4262k ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f4236N;
            z3 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.f4237O;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f4262k) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f4237O;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z4 = true;
            }
            z3 |= z4;
            canvas.restoreToCount(save4);
        }
        if ((z3 || this.f4238P == null || this.f4276r.size() <= 0 || !this.f4238P.p()) ? z3 : true) {
            O.a0(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j3) {
        return super.drawChild(canvas, view, j3);
    }

    public void e1(int i3, int i4, int[] iArr) {
        o1();
        E0();
        G.d.a("RV Scroll");
        P(this.f4263k0);
        int A12 = i3 != 0 ? this.f4274q.A1(i3, this.f4252f, this.f4263k0) : 0;
        int C12 = i4 != 0 ? this.f4274q.C1(i4, this.f4252f, this.f4263k0) : 0;
        G.d.b();
        X0();
        F0();
        q1(false);
        if (iArr != null) {
            iArr[0] = A12;
            iArr[1] = C12;
        }
    }

    public final void f(C c3) {
        View view = c3.f4302a;
        boolean z3 = view.getParent() == this;
        this.f4252f.J(d0(view));
        if (c3.x()) {
            this.f4258i.c(view, -1, view.getLayoutParams(), true);
        } else if (z3) {
            this.f4258i.k(view);
        } else {
            this.f4258i.b(view, true);
        }
    }

    public void f1(int i3) {
        if (this.f4223A) {
            return;
        }
        s1();
        o oVar = this.f4274q;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            oVar.B1(i3);
            awakenScrollBars();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i3) {
        View view2;
        boolean z3;
        View U02 = this.f4274q.U0(view, i3);
        if (U02 != null) {
            return U02;
        }
        boolean z4 = (this.f4272p == null || this.f4274q == null || s0() || this.f4223A) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z4 && (i3 == 2 || i3 == 1)) {
            if (this.f4274q.q()) {
                int i4 = i3 == 2 ? 130 : 33;
                z3 = focusFinder.findNextFocus(this, view, i4) == null;
                if (f4219F0) {
                    i3 = i4;
                }
            } else {
                z3 = false;
            }
            if (!z3 && this.f4274q.p()) {
                int i5 = (this.f4274q.d0() == 1) ^ (i3 == 2) ? 66 : 17;
                boolean z5 = focusFinder.findNextFocus(this, view, i5) == null;
                if (f4219F0) {
                    i3 = i5;
                }
                z3 = z5;
            }
            if (z3) {
                t();
                if (Q(view) == null) {
                    return null;
                }
                o1();
                this.f4274q.N0(view, i3, this.f4252f, this.f4263k0);
                q1(false);
            }
            view2 = focusFinder.findNextFocus(this, view, i3);
        } else {
            View findNextFocus = focusFinder.findNextFocus(this, view, i3);
            if (findNextFocus == null && z4) {
                t();
                if (Q(view) == null) {
                    return null;
                }
                o1();
                view2 = this.f4274q.N0(view, i3, this.f4252f, this.f4263k0);
                q1(false);
            } else {
                view2 = findNextFocus;
            }
        }
        if (view2 == null || view2.hasFocusable()) {
            return t0(view, view2, i3) ? view2 : super.focusSearch(view, i3);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i3);
        }
        Y0(view2, null);
        return view;
    }

    public void g(n nVar) {
        h(nVar, -1);
    }

    public final int g0(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    public final void g1(g gVar, boolean z3, boolean z4) {
        g gVar2 = this.f4272p;
        if (gVar2 != null) {
            gVar2.s(this.f4250e);
            this.f4272p.l(this);
        }
        if (!z3 || z4) {
            S0();
        }
        this.f4256h.u();
        g gVar3 = this.f4272p;
        this.f4272p = gVar;
        if (gVar != null) {
            gVar.q(this.f4250e);
            gVar.h(this);
        }
        o oVar = this.f4274q;
        if (oVar != null) {
            oVar.I0(gVar3, this.f4272p);
        }
        this.f4252f.x(gVar3, this.f4272p, z3);
        this.f4263k0.f4403g = true;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        o oVar = this.f4274q;
        if (oVar != null) {
            return oVar.I();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + O());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        o oVar = this.f4274q;
        if (oVar != null) {
            return oVar.J(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + O());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public g getAdapter() {
        return this.f4272p;
    }

    @Override // android.view.View
    public int getBaseline() {
        o oVar = this.f4274q;
        return oVar != null ? oVar.L() : super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i3, int i4) {
        return super.getChildDrawingOrder(i3, i4);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f4262k;
    }

    public androidx.recyclerview.widget.k getCompatAccessibilityDelegate() {
        return this.f4277r0;
    }

    public k getEdgeEffectFactory() {
        return this.f4233K;
    }

    public l getItemAnimator() {
        return this.f4238P;
    }

    public int getItemDecorationCount() {
        return this.f4276r.size();
    }

    public o getLayoutManager() {
        return this.f4274q;
    }

    public int getMaxFlingVelocity() {
        return this.f4249d0;
    }

    public int getMinFlingVelocity() {
        return this.f4248c0;
    }

    public long getNanoTime() {
        if (f4218E0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public q getOnFlingListener() {
        return this.f4247b0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f4255g0;
    }

    public t getRecycledViewPool() {
        return this.f4252f.i();
    }

    public int getScrollState() {
        return this.f4239Q;
    }

    public void h(n nVar, int i3) {
        o oVar = this.f4274q;
        if (oVar != null) {
            oVar.l("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f4276r.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i3 < 0) {
            this.f4276r.add(nVar);
        } else {
            this.f4276r.add(i3, nVar);
        }
        v0();
        requestLayout();
    }

    public final String h0(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + '.' + str;
    }

    public boolean h1(C c3, int i3) {
        if (!s0()) {
            O.r0(c3.f4302a, i3);
            return true;
        }
        c3.f4318q = i3;
        this.f4289x0.add(c3);
        return false;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().j();
    }

    public void i(r rVar) {
        this.f4278s.add(rVar);
    }

    public Rect i0(View view) {
        p pVar = (p) view.getLayoutParams();
        if (!pVar.f4364c) {
            return pVar.f4363b;
        }
        if (this.f4263k0.e() && (pVar.b() || pVar.d())) {
            return pVar.f4363b;
        }
        Rect rect = pVar.f4363b;
        rect.set(0, 0, 0, 0);
        int size = this.f4276r.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.f4266m.set(0, 0, 0, 0);
            ((n) this.f4276r.get(i3)).e(this.f4266m, view, this, this.f4263k0);
            int i4 = rect.left;
            Rect rect2 = this.f4266m;
            rect.left = i4 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        pVar.f4364c = false;
        return rect;
    }

    public boolean i1(AccessibilityEvent accessibilityEvent) {
        if (!s0()) {
            return false;
        }
        int a3 = accessibilityEvent != null ? L.b.a(accessibilityEvent) : 0;
        this.f4225C |= a3 != 0 ? a3 : 0;
        return true;
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.f4282u;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f4223A;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().l();
    }

    public void j(s sVar) {
        if (this.f4267m0 == null) {
            this.f4267m0 = new ArrayList();
        }
        this.f4267m0.add(sVar);
    }

    public final void j0(long j3, C c3, C c4) {
        int g3 = this.f4258i.g();
        for (int i3 = 0; i3 < g3; i3++) {
            C e02 = e0(this.f4258i.f(i3));
            if (e02 != c3 && b0(e02) == j3) {
                g gVar = this.f4272p;
                if (gVar == null || !gVar.g()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + e02 + " \n View Holder 2:" + c3 + O());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + e02 + " \n View Holder 2:" + c3 + O());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + c4 + " cannot be found but it is necessary for " + c3 + O());
    }

    public void j1(int i3, int i4) {
        k1(i3, i4, null);
    }

    public void k(C c3, l.b bVar, l.b bVar2) {
        c3.G(false);
        if (this.f4238P.a(c3, bVar, bVar2)) {
            K0();
        }
    }

    public boolean k0() {
        return !this.f4288x || this.f4229G || this.f4256h.p();
    }

    public void k1(int i3, int i4, Interpolator interpolator) {
        l1(i3, i4, interpolator, Integer.MIN_VALUE);
    }

    public final void l(C c3, C c4, l.b bVar, l.b bVar2, boolean z3, boolean z4) {
        c3.G(false);
        if (z3) {
            f(c3);
        }
        if (c3 != c4) {
            if (z4) {
                f(c4);
            }
            c3.f4309h = c4;
            f(c3);
            this.f4252f.J(c3);
            c4.G(false);
            c4.f4310i = c3;
        }
        if (this.f4238P.b(c3, c4, bVar, bVar2)) {
            K0();
        }
    }

    public final boolean l0() {
        int g3 = this.f4258i.g();
        for (int i3 = 0; i3 < g3; i3++) {
            C e02 = e0(this.f4258i.f(i3));
            if (e02 != null && !e02.J() && e02.y()) {
                return true;
            }
        }
        return false;
    }

    public void l1(int i3, int i4, Interpolator interpolator, int i5) {
        m1(i3, i4, interpolator, i5, false);
    }

    public void m(C c3, l.b bVar, l.b bVar2) {
        f(c3);
        c3.G(false);
        if (this.f4238P.c(c3, bVar, bVar2)) {
            K0();
        }
    }

    public void m0() {
        this.f4256h = new a(new f());
    }

    public void m1(int i3, int i4, Interpolator interpolator, int i5, boolean z3) {
        o oVar = this.f4274q;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f4223A) {
            return;
        }
        if (!oVar.p()) {
            i3 = 0;
        }
        if (!this.f4274q.q()) {
            i4 = 0;
        }
        if (i3 == 0 && i4 == 0) {
            return;
        }
        if (i5 != Integer.MIN_VALUE && i5 <= 0) {
            scrollBy(i3, i4);
            return;
        }
        if (z3) {
            int i6 = i3 != 0 ? 1 : 0;
            if (i4 != 0) {
                i6 |= 2;
            }
            p1(i6, 1);
        }
        this.f4257h0.f(i3, i4, i5, interpolator);
    }

    public void n(String str) {
        if (s0()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + O());
        }
        if (this.f4232J > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + O()));
        }
    }

    public final void n0() {
        if (O.v(this) == 0) {
            O.t0(this, 8);
        }
    }

    public void n1(int i3) {
        if (this.f4223A) {
            return;
        }
        o oVar = this.f4274q;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            oVar.M1(this, this.f4263k0, i3);
        }
    }

    public boolean o(C c3) {
        l lVar = this.f4238P;
        return lVar == null || lVar.g(c3, c3.o());
    }

    public final void o0() {
        this.f4258i = new b(new e());
    }

    public void o1() {
        int i3 = this.f4290y + 1;
        this.f4290y = i3;
        if (i3 != 1 || this.f4223A) {
            return;
        }
        this.f4292z = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        if (r1 >= 30.0f) goto L22;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.f4231I = r0
            r1 = 1
            r5.f4282u = r1
            boolean r2 = r5.f4288x
            if (r2 == 0) goto L14
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L14
            goto L15
        L14:
            r1 = r0
        L15:
            r5.f4288x = r1
            androidx.recyclerview.widget.RecyclerView$o r1 = r5.f4274q
            if (r1 == 0) goto L1e
            r1.E(r5)
        L1e:
            r5.f4275q0 = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.f4218E0
            if (r0 == 0) goto L61
            java.lang.ThreadLocal r0 = androidx.recyclerview.widget.e.f4574i
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.e r1 = (androidx.recyclerview.widget.e) r1
            r5.f4259i0 = r1
            if (r1 != 0) goto L5c
            androidx.recyclerview.widget.e r1 = new androidx.recyclerview.widget.e
            r1.<init>()
            r5.f4259i0 = r1
            android.view.Display r1 = K.O.q(r5)
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L4e
            if (r1 == 0) goto L4e
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L4e
            goto L50
        L4e:
            r1 = 1114636288(0x42700000, float:60.0)
        L50:
            androidx.recyclerview.widget.e r2 = r5.f4259i0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f4578g = r3
            r0.set(r2)
        L5c:
            androidx.recyclerview.widget.e r0 = r5.f4259i0
            r0.a(r5)
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        androidx.recyclerview.widget.e eVar;
        super.onDetachedFromWindow();
        l lVar = this.f4238P;
        if (lVar != null) {
            lVar.k();
        }
        s1();
        this.f4282u = false;
        o oVar = this.f4274q;
        if (oVar != null) {
            oVar.F(this, this.f4252f);
        }
        this.f4289x0.clear();
        removeCallbacks(this.f4291y0);
        this.f4260j.j();
        if (!f4218E0 || (eVar = this.f4259i0) == null) {
            return;
        }
        eVar.j(this);
        this.f4259i0 = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f4276r.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((n) this.f4276r.get(i3)).g(canvas, this, this.f4263k0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$o r0 = r5.f4274q
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.f4223A
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L77
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3e
            androidx.recyclerview.widget.RecyclerView$o r0 = r5.f4274q
            boolean r0 = r0.q()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = r2
        L2d:
            androidx.recyclerview.widget.RecyclerView$o r3 = r5.f4274q
            boolean r3 = r3.p()
            if (r3 == 0) goto L3c
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L64
        L3c:
            r3 = r2
            goto L64
        L3e:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L62
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$o r3 = r5.f4274q
            boolean r3 = r3.q()
            if (r3 == 0) goto L57
            float r0 = -r0
            goto L3c
        L57:
            androidx.recyclerview.widget.RecyclerView$o r3 = r5.f4274q
            boolean r3 = r3.p()
            if (r3 == 0) goto L62
            r3 = r0
            r0 = r2
            goto L64
        L62:
            r0 = r2
            r3 = r0
        L64:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6c
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L77
        L6c:
            float r2 = r5.f4251e0
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.f4253f0
            float r0 = r0 * r3
            int r0 = (int) r0
            r5.d1(r2, r0, r6)
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z3;
        if (this.f4223A) {
            return false;
        }
        this.f4280t = null;
        if (S(motionEvent)) {
            p();
            return true;
        }
        o oVar = this.f4274q;
        if (oVar == null) {
            return false;
        }
        boolean p3 = oVar.p();
        boolean q3 = this.f4274q.q();
        if (this.f4241S == null) {
            this.f4241S = VelocityTracker.obtain();
        }
        this.f4241S.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f4224B) {
                this.f4224B = false;
            }
            this.f4240R = motionEvent.getPointerId(0);
            int x3 = (int) (motionEvent.getX() + 0.5f);
            this.f4244V = x3;
            this.f4242T = x3;
            int y3 = (int) (motionEvent.getY() + 0.5f);
            this.f4245W = y3;
            this.f4243U = y3;
            if (this.f4239Q == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                r1(1);
            }
            int[] iArr = this.f4285v0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i3 = p3;
            if (q3) {
                i3 = (p3 ? 1 : 0) | 2;
            }
            p1(i3, 0);
        } else if (actionMasked == 1) {
            this.f4241S.clear();
            r1(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f4240R);
            if (findPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f4240R + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x4 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y4 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.f4239Q != 1) {
                int i4 = x4 - this.f4242T;
                int i5 = y4 - this.f4243U;
                if (p3 == 0 || Math.abs(i4) <= this.f4246a0) {
                    z3 = false;
                } else {
                    this.f4244V = x4;
                    z3 = true;
                }
                if (q3 && Math.abs(i5) > this.f4246a0) {
                    this.f4245W = y4;
                    z3 = true;
                }
                if (z3) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            p();
        } else if (actionMasked == 5) {
            this.f4240R = motionEvent.getPointerId(actionIndex);
            int x5 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f4244V = x5;
            this.f4242T = x5;
            int y5 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f4245W = y5;
            this.f4243U = y5;
        } else if (actionMasked == 6) {
            H0(motionEvent);
        }
        return this.f4239Q == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        G.d.a("RV OnLayout");
        A();
        G.d.b();
        this.f4288x = true;
    }

    @Override // android.view.View
    public void onMeasure(int i3, int i4) {
        o oVar = this.f4274q;
        if (oVar == null) {
            v(i3, i4);
            return;
        }
        if (oVar.w0()) {
            int mode = View.MeasureSpec.getMode(i3);
            int mode2 = View.MeasureSpec.getMode(i4);
            this.f4274q.d1(this.f4252f, this.f4263k0, i3, i4);
            if ((mode == 1073741824 && mode2 == 1073741824) || this.f4272p == null) {
                return;
            }
            if (this.f4263k0.f4401e == 1) {
                B();
            }
            this.f4274q.E1(i3, i4);
            this.f4263k0.f4406j = true;
            C();
            this.f4274q.H1(i3, i4);
            if (this.f4274q.K1()) {
                this.f4274q.E1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.f4263k0.f4406j = true;
                C();
                this.f4274q.H1(i3, i4);
                return;
            }
            return;
        }
        if (this.f4284v) {
            this.f4274q.d1(this.f4252f, this.f4263k0, i3, i4);
            return;
        }
        if (this.f4226D) {
            o1();
            E0();
            M0();
            F0();
            z zVar = this.f4263k0;
            if (zVar.f4408l) {
                zVar.f4404h = true;
            } else {
                this.f4256h.j();
                this.f4263k0.f4404h = false;
            }
            this.f4226D = false;
            q1(false);
        } else if (this.f4263k0.f4408l) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        g gVar = this.f4272p;
        if (gVar != null) {
            this.f4263k0.f4402f = gVar.c();
        } else {
            this.f4263k0.f4402f = 0;
        }
        o1();
        this.f4274q.d1(this.f4252f, this.f4263k0, i3, i4);
        q1(false);
        this.f4263k0.f4404h = false;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i3, Rect rect) {
        if (s0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i3, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof x)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        x xVar = (x) parcelable;
        this.f4254g = xVar;
        super.onRestoreInstanceState(xVar.a());
        o oVar = this.f4274q;
        if (oVar == null || (parcelable2 = this.f4254g.f4381g) == null) {
            return;
        }
        oVar.g1(parcelable2);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        x xVar = new x(super.onSaveInstanceState());
        x xVar2 = this.f4254g;
        if (xVar2 != null) {
            xVar.b(xVar2);
            return xVar;
        }
        o oVar = this.f4274q;
        if (oVar != null) {
            xVar.f4381g = oVar.h1();
            return xVar;
        }
        xVar.f4381g = null;
        return xVar;
    }

    @Override // android.view.View
    public void onSizeChanged(int i3, int i4, int i5, int i6) {
        super.onSizeChanged(i3, i4, i5, i6);
        if (i3 == i5 && i4 == i6) {
            return;
        }
        q0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        a1();
        setScrollState(0);
    }

    public void p0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new androidx.recyclerview.widget.d(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(AbstractC0596b.f8494a), resources.getDimensionPixelSize(AbstractC0596b.f8496c), resources.getDimensionPixelOffset(AbstractC0596b.f8495b));
        } else {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + O());
        }
    }

    public boolean p1(int i3, int i4) {
        return getScrollingChildHelper().p(i3, i4);
    }

    public void q0() {
        this.f4237O = null;
        this.f4235M = null;
        this.f4236N = null;
        this.f4234L = null;
    }

    public void q1(boolean z3) {
        if (this.f4290y < 1) {
            this.f4290y = 1;
        }
        if (!z3 && !this.f4223A) {
            this.f4292z = false;
        }
        if (this.f4290y == 1) {
            if (z3 && this.f4292z && !this.f4223A && this.f4274q != null && this.f4272p != null) {
                A();
            }
            if (!this.f4223A) {
                this.f4292z = false;
            }
        }
        this.f4290y--;
    }

    public void r() {
        int j3 = this.f4258i.j();
        for (int i3 = 0; i3 < j3; i3++) {
            C e02 = e0(this.f4258i.i(i3));
            if (!e02.J()) {
                e02.c();
            }
        }
        this.f4252f.d();
    }

    public boolean r0() {
        AccessibilityManager accessibilityManager = this.f4227E;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public void r1(int i3) {
        getScrollingChildHelper().r(i3);
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z3) {
        C e02 = e0(view);
        if (e02 != null) {
            if (e02.x()) {
                e02.f();
            } else if (!e02.J()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + e02 + O());
            }
        }
        view.clearAnimation();
        y(view);
        super.removeDetachedView(view, z3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.f4274q.f1(this, this.f4263k0, view, view2) && view2 != null) {
            Y0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z3) {
        return this.f4274q.v1(this, view, rect, z3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z3) {
        int size = this.f4278s.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((r) this.f4278s.get(i3)).c(z3);
        }
        super.requestDisallowInterceptTouchEvent(z3);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f4290y != 0 || this.f4223A) {
            this.f4292z = true;
        } else {
            super.requestLayout();
        }
    }

    public void s(int i3, int i4) {
        boolean z3;
        EdgeEffect edgeEffect = this.f4234L;
        if (edgeEffect == null || edgeEffect.isFinished() || i3 <= 0) {
            z3 = false;
        } else {
            this.f4234L.onRelease();
            z3 = this.f4234L.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f4236N;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i3 < 0) {
            this.f4236N.onRelease();
            z3 |= this.f4236N.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f4235M;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i4 > 0) {
            this.f4235M.onRelease();
            z3 |= this.f4235M.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f4237O;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i4 < 0) {
            this.f4237O.onRelease();
            z3 |= this.f4237O.isFinished();
        }
        if (z3) {
            O.a0(this);
        }
    }

    public boolean s0() {
        return this.f4231I > 0;
    }

    public void s1() {
        setScrollState(0);
        t1();
    }

    @Override // android.view.View
    public void scrollBy(int i3, int i4) {
        o oVar = this.f4274q;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f4223A) {
            return;
        }
        boolean p3 = oVar.p();
        boolean q3 = this.f4274q.q();
        if (p3 || q3) {
            if (!p3) {
                i3 = 0;
            }
            if (!q3) {
                i4 = 0;
            }
            d1(i3, i4, null);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i3, int i4) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (i1(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.k kVar) {
        this.f4277r0 = kVar;
        O.j0(this, kVar);
    }

    public void setAdapter(g gVar) {
        setLayoutFrozen(false);
        g1(gVar, false, true);
        N0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(j jVar) {
        if (jVar == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z3) {
        if (z3 != this.f4262k) {
            q0();
        }
        this.f4262k = z3;
        super.setClipToPadding(z3);
        if (this.f4288x) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(k kVar) {
        J.g.g(kVar);
        this.f4233K = kVar;
        q0();
    }

    public void setHasFixedSize(boolean z3) {
        this.f4284v = z3;
    }

    public void setItemAnimator(l lVar) {
        l lVar2 = this.f4238P;
        if (lVar2 != null) {
            lVar2.k();
            this.f4238P.v(null);
        }
        this.f4238P = lVar;
        if (lVar != null) {
            lVar.v(this.f4273p0);
        }
    }

    public void setItemViewCacheSize(int i3) {
        this.f4252f.G(i3);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z3) {
        suppressLayout(z3);
    }

    public void setLayoutManager(o oVar) {
        if (oVar == this.f4274q) {
            return;
        }
        s1();
        if (this.f4274q != null) {
            l lVar = this.f4238P;
            if (lVar != null) {
                lVar.k();
            }
            this.f4274q.o1(this.f4252f);
            this.f4274q.p1(this.f4252f);
            this.f4252f.c();
            if (this.f4282u) {
                this.f4274q.F(this, this.f4252f);
            }
            this.f4274q.I1(null);
            this.f4274q = null;
        } else {
            this.f4252f.c();
        }
        this.f4258i.o();
        this.f4274q = oVar;
        if (oVar != null) {
            if (oVar.f4339b != null) {
                throw new IllegalArgumentException("LayoutManager " + oVar + " is already attached to a RecyclerView:" + oVar.f4339b.O());
            }
            oVar.I1(this);
            if (this.f4282u) {
                this.f4274q.E(this);
            }
        }
        this.f4252f.K();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z3) {
        getScrollingChildHelper().m(z3);
    }

    public void setOnFlingListener(q qVar) {
        this.f4247b0 = qVar;
    }

    @Deprecated
    public void setOnScrollListener(s sVar) {
        this.f4265l0 = sVar;
    }

    public void setPreserveFocusAfterLayout(boolean z3) {
        this.f4255g0 = z3;
    }

    public void setRecycledViewPool(t tVar) {
        this.f4252f.E(tVar);
    }

    public void setRecyclerListener(v vVar) {
    }

    public void setScrollState(int i3) {
        if (i3 == this.f4239Q) {
            return;
        }
        this.f4239Q = i3;
        if (i3 != 2) {
            t1();
        }
        G(i3);
    }

    public void setScrollingTouchSlop(int i3) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i3 != 0) {
            if (i3 == 1) {
                this.f4246a0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i3 + "; using default value");
        }
        this.f4246a0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(A a3) {
        this.f4252f.F(a3);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i3) {
        return getScrollingChildHelper().o(i3);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().q();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z3) {
        if (z3 != this.f4223A) {
            n("Do not suppressLayout in layout or scroll");
            if (z3) {
                long uptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
                this.f4223A = true;
                this.f4224B = true;
                s1();
                return;
            }
            this.f4223A = false;
            if (this.f4292z && this.f4274q != null && this.f4272p != null) {
                requestLayout();
            }
            this.f4292z = false;
        }
    }

    public void t() {
        if (!this.f4288x || this.f4229G) {
            G.d.a("RV FullInvalidate");
            A();
            G.d.b();
            return;
        }
        if (this.f4256h.p()) {
            if (!this.f4256h.o(4) || this.f4256h.o(11)) {
                if (this.f4256h.p()) {
                    G.d.a("RV FullInvalidate");
                    A();
                    G.d.b();
                    return;
                }
                return;
            }
            G.d.a("RV PartialInvalidate");
            o1();
            E0();
            this.f4256h.s();
            if (!this.f4292z) {
                if (l0()) {
                    A();
                } else {
                    this.f4256h.i();
                }
            }
            q1(true);
            F0();
            G.d.b();
        }
    }

    public final boolean t0(View view, View view2, int i3) {
        int i4;
        if (view2 == null || view2 == this || Q(view2) == null) {
            return false;
        }
        if (view == null || Q(view) == null) {
            return true;
        }
        this.f4266m.set(0, 0, view.getWidth(), view.getHeight());
        this.f4268n.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.f4266m);
        offsetDescendantRectToMyCoords(view2, this.f4268n);
        char c3 = 65535;
        int i5 = this.f4274q.d0() == 1 ? -1 : 1;
        Rect rect = this.f4266m;
        int i6 = rect.left;
        Rect rect2 = this.f4268n;
        int i7 = rect2.left;
        if ((i6 < i7 || rect.right <= i7) && rect.right < rect2.right) {
            i4 = 1;
        } else {
            int i8 = rect.right;
            int i9 = rect2.right;
            i4 = ((i8 > i9 || i6 >= i9) && i6 > i7) ? -1 : 0;
        }
        int i10 = rect.top;
        int i11 = rect2.top;
        if ((i10 < i11 || rect.bottom <= i11) && rect.bottom < rect2.bottom) {
            c3 = 1;
        } else {
            int i12 = rect.bottom;
            int i13 = rect2.bottom;
            if ((i12 <= i13 && i10 < i13) || i10 <= i11) {
                c3 = 0;
            }
        }
        if (i3 == 1) {
            return c3 < 0 || (c3 == 0 && i4 * i5 <= 0);
        }
        if (i3 == 2) {
            return c3 > 0 || (c3 == 0 && i4 * i5 >= 0);
        }
        if (i3 == 17) {
            return i4 < 0;
        }
        if (i3 == 33) {
            return c3 < 0;
        }
        if (i3 == 66) {
            return i4 > 0;
        }
        if (i3 == 130) {
            return c3 > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i3 + O());
    }

    public final void t1() {
        this.f4257h0.g();
        o oVar = this.f4274q;
        if (oVar != null) {
            oVar.O1();
        }
    }

    public final void u(Context context, String str, AttributeSet attributeSet, int i3, int i4) {
        Constructor constructor;
        Object[] objArr;
        if (str != null) {
            String trim = str.trim();
            if (trim.isEmpty()) {
                return;
            }
            String h02 = h0(context, trim);
            try {
                Class<? extends U> asSubclass = Class.forName(h02, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(o.class);
                try {
                    constructor = asSubclass.getConstructor(f4221H0);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i3), Integer.valueOf(i4)};
                } catch (NoSuchMethodException e3) {
                    try {
                        constructor = asSubclass.getConstructor(new Class[0]);
                        objArr = null;
                    } catch (NoSuchMethodException e4) {
                        e4.initCause(e3);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + h02, e4);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((o) constructor.newInstance(objArr));
            } catch (ClassCastException e5) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + h02, e5);
            } catch (ClassNotFoundException e6) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + h02, e6);
            } catch (IllegalAccessException e7) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + h02, e7);
            } catch (InstantiationException e8) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + h02, e8);
            } catch (InvocationTargetException e9) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + h02, e9);
            }
        }
    }

    public void u0(int i3) {
        if (this.f4274q == null) {
            return;
        }
        setScrollState(2);
        this.f4274q.B1(i3);
        awakenScrollBars();
    }

    public void u1(int i3, int i4, Object obj) {
        int i5;
        int j3 = this.f4258i.j();
        int i6 = i3 + i4;
        for (int i7 = 0; i7 < j3; i7++) {
            View i8 = this.f4258i.i(i7);
            C e02 = e0(i8);
            if (e02 != null && !e02.J() && (i5 = e02.f4304c) >= i3 && i5 < i6) {
                e02.b(2);
                e02.a(obj);
                ((p) i8.getLayoutParams()).f4364c = true;
            }
        }
        this.f4252f.M(i3, i4);
    }

    public void v(int i3, int i4) {
        setMeasuredDimension(o.s(i3, getPaddingLeft() + getPaddingRight(), O.y(this)), o.s(i4, getPaddingTop() + getPaddingBottom(), O.x(this)));
    }

    public void v0() {
        int j3 = this.f4258i.j();
        for (int i3 = 0; i3 < j3; i3++) {
            ((p) this.f4258i.i(i3).getLayoutParams()).f4364c = true;
        }
        this.f4252f.s();
    }

    public final boolean w(int i3, int i4) {
        T(this.f4279s0);
        int[] iArr = this.f4279s0;
        return (iArr[0] == i3 && iArr[1] == i4) ? false : true;
    }

    public void w0() {
        int j3 = this.f4258i.j();
        for (int i3 = 0; i3 < j3; i3++) {
            C e02 = e0(this.f4258i.i(i3));
            if (e02 != null && !e02.J()) {
                e02.b(6);
            }
        }
        v0();
        this.f4252f.t();
    }

    public void x(View view) {
        int size;
        C e02 = e0(view);
        C0(view);
        g gVar = this.f4272p;
        if (gVar != null && e02 != null) {
            gVar.n(e02);
        }
        if (this.f4228F == null || r2.size() - 1 < 0) {
            return;
        }
        AbstractC0515e.a(this.f4228F.get(size));
        throw null;
    }

    public void x0(int i3) {
        int g3 = this.f4258i.g();
        for (int i4 = 0; i4 < g3; i4++) {
            this.f4258i.f(i4).offsetLeftAndRight(i3);
        }
    }

    public void y(View view) {
        int size;
        C e02 = e0(view);
        D0(view);
        g gVar = this.f4272p;
        if (gVar != null && e02 != null) {
            gVar.o(e02);
        }
        if (this.f4228F == null || r2.size() - 1 < 0) {
            return;
        }
        AbstractC0515e.a(this.f4228F.get(size));
        throw null;
    }

    public void y0(int i3) {
        int g3 = this.f4258i.g();
        for (int i4 = 0; i4 < g3; i4++) {
            this.f4258i.f(i4).offsetTopAndBottom(i3);
        }
    }

    public final void z() {
        int i3 = this.f4225C;
        this.f4225C = 0;
        if (i3 == 0 || !r0()) {
            return;
        }
        AccessibilityEvent obtain = AccessibilityEvent.obtain();
        obtain.setEventType(2048);
        L.b.b(obtain, i3);
        sendAccessibilityEventUnchecked(obtain);
    }

    public void z0(int i3, int i4) {
        int j3 = this.f4258i.j();
        for (int i5 = 0; i5 < j3; i5++) {
            C e02 = e0(this.f4258i.i(i5));
            if (e02 != null && !e02.J() && e02.f4304c >= i3) {
                e02.A(i4, false);
                this.f4263k0.f4403g = true;
            }
        }
        this.f4252f.u(i3, i4);
        requestLayout();
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        this.f4250e = new w();
        this.f4252f = new u();
        this.f4260j = new androidx.recyclerview.widget.p();
        this.f4264l = new RunnableC0350a();
        this.f4266m = new Rect();
        this.f4268n = new Rect();
        this.f4270o = new RectF();
        this.f4276r = new ArrayList();
        this.f4278s = new ArrayList();
        this.f4290y = 0;
        this.f4229G = false;
        this.f4230H = false;
        this.f4231I = 0;
        this.f4232J = 0;
        this.f4233K = new k();
        this.f4238P = new c();
        this.f4239Q = 0;
        this.f4240R = -1;
        this.f4251e0 = Float.MIN_VALUE;
        this.f4253f0 = Float.MIN_VALUE;
        this.f4255g0 = true;
        this.f4257h0 = new B();
        this.f4261j0 = f4218E0 ? new e.b() : null;
        this.f4263k0 = new z();
        this.f4269n0 = false;
        this.f4271o0 = false;
        this.f4273p0 = new m();
        this.f4275q0 = false;
        this.f4279s0 = new int[2];
        this.f4283u0 = new int[2];
        this.f4285v0 = new int[2];
        this.f4287w0 = new int[2];
        this.f4289x0 = new ArrayList();
        this.f4291y0 = new RunnableC0351b();
        this.f4293z0 = new d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f4246a0 = viewConfiguration.getScaledTouchSlop();
        this.f4251e0 = T.f(viewConfiguration, context);
        this.f4253f0 = T.j(viewConfiguration, context);
        this.f4248c0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f4249d0 = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f4238P.v(this.f4273p0);
        m0();
        o0();
        n0();
        if (O.u(this) == 0) {
            O.r0(this, 1);
        }
        this.f4227E = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.k(this));
        int[] iArr = m0.c.f8502f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i3, 0);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, i3, 0);
        }
        String string = obtainStyledAttributes.getString(m0.c.f8511o);
        if (obtainStyledAttributes.getInt(m0.c.f8505i, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f4262k = obtainStyledAttributes.getBoolean(m0.c.f8504h, true);
        boolean z3 = obtainStyledAttributes.getBoolean(m0.c.f8506j, false);
        this.f4286w = z3;
        if (z3) {
            p0((StateListDrawable) obtainStyledAttributes.getDrawable(m0.c.f8509m), obtainStyledAttributes.getDrawable(m0.c.f8510n), (StateListDrawable) obtainStyledAttributes.getDrawable(m0.c.f8507k), obtainStyledAttributes.getDrawable(m0.c.f8508l));
        }
        obtainStyledAttributes.recycle();
        u(context, string, attributeSet, i3, 0);
        int[] iArr2 = f4214A0;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i3, 0);
        if (i4 >= 29) {
            saveAttributeDataForStyleable(context, iArr2, attributeSet, obtainStyledAttributes2, i3, 0);
        }
        boolean z4 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z4);
    }

    public static class p extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public C f4362a;

        /* renamed from: b, reason: collision with root package name */
        public final Rect f4363b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f4364c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f4365d;

        public p(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4363b = new Rect();
            this.f4364c = true;
            this.f4365d = false;
        }

        public int a() {
            return this.f4362a.m();
        }

        public boolean b() {
            return this.f4362a.y();
        }

        public boolean c() {
            return this.f4362a.v();
        }

        public boolean d() {
            return this.f4362a.t();
        }

        public p(int i3, int i4) {
            super(i3, i4);
            this.f4363b = new Rect();
            this.f4364c = true;
            this.f4365d = false;
        }

        public p(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f4363b = new Rect();
            this.f4364c = true;
            this.f4365d = false;
        }

        public p(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f4363b = new Rect();
            this.f4364c = true;
            this.f4365d = false;
        }

        public p(p pVar) {
            super((ViewGroup.LayoutParams) pVar);
            this.f4363b = new Rect();
            this.f4364c = true;
            this.f4365d = false;
        }
    }

    public static class x extends S.a {
        public static final Parcelable.Creator<x> CREATOR = new a();

        /* renamed from: g, reason: collision with root package name */
        public Parcelable f4381g;

        public static class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public x createFromParcel(Parcel parcel) {
                return new x(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public x createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new x(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public x[] newArray(int i3) {
                return new x[i3];
            }
        }

        public x(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f4381g = parcel.readParcelable(classLoader == null ? o.class.getClassLoader() : classLoader);
        }

        public void b(x xVar) {
            this.f4381g = xVar.f4381g;
        }

        @Override // S.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i3) {
            super.writeToParcel(parcel, i3);
            parcel.writeParcelable(this.f4381g, 0);
        }

        public x(Parcelable parcelable) {
            super(parcelable);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        o oVar = this.f4274q;
        if (oVar != null) {
            return oVar.K(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + O());
    }
}
