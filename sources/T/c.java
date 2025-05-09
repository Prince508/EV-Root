package T;

import K.O;
import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import java.util.Arrays;

/* loaded from: classes.dex */
public class c {

    /* renamed from: x, reason: collision with root package name */
    public static final Interpolator f2003x = new a();

    /* renamed from: a, reason: collision with root package name */
    public int f2004a;

    /* renamed from: b, reason: collision with root package name */
    public int f2005b;

    /* renamed from: d, reason: collision with root package name */
    public float[] f2007d;

    /* renamed from: e, reason: collision with root package name */
    public float[] f2008e;

    /* renamed from: f, reason: collision with root package name */
    public float[] f2009f;

    /* renamed from: g, reason: collision with root package name */
    public float[] f2010g;

    /* renamed from: h, reason: collision with root package name */
    public int[] f2011h;

    /* renamed from: i, reason: collision with root package name */
    public int[] f2012i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f2013j;

    /* renamed from: k, reason: collision with root package name */
    public int f2014k;

    /* renamed from: l, reason: collision with root package name */
    public VelocityTracker f2015l;

    /* renamed from: m, reason: collision with root package name */
    public float f2016m;

    /* renamed from: n, reason: collision with root package name */
    public float f2017n;

    /* renamed from: o, reason: collision with root package name */
    public int f2018o;

    /* renamed from: p, reason: collision with root package name */
    public final int f2019p;

    /* renamed from: q, reason: collision with root package name */
    public int f2020q;

    /* renamed from: r, reason: collision with root package name */
    public OverScroller f2021r;

    /* renamed from: s, reason: collision with root package name */
    public final AbstractC0053c f2022s;

    /* renamed from: t, reason: collision with root package name */
    public View f2023t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2024u;

    /* renamed from: v, reason: collision with root package name */
    public final ViewGroup f2025v;

    /* renamed from: c, reason: collision with root package name */
    public int f2006c = -1;

    /* renamed from: w, reason: collision with root package name */
    public final Runnable f2026w = new b();

    public class a implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f3) {
            float f4 = f3 - 1.0f;
            return (f4 * f4 * f4 * f4 * f4) + 1.0f;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.E(0);
        }
    }

    public c(Context context, ViewGroup viewGroup, AbstractC0053c abstractC0053c) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (abstractC0053c == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f2025v = viewGroup;
        this.f2022s = abstractC0053c;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i3 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f2019p = i3;
        this.f2018o = i3;
        this.f2005b = viewConfiguration.getScaledTouchSlop();
        this.f2016m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f2017n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2021r = new OverScroller(context, f2003x);
    }

    public static c l(ViewGroup viewGroup, float f3, AbstractC0053c abstractC0053c) {
        c m3 = m(viewGroup, abstractC0053c);
        m3.f2005b = (int) (m3.f2005b * (1.0f / f3));
        return m3;
    }

    public static c m(ViewGroup viewGroup, AbstractC0053c abstractC0053c) {
        return new c(viewGroup.getContext(), viewGroup, abstractC0053c);
    }

    public final void A() {
        this.f2015l.computeCurrentVelocity(1000, this.f2016m);
        n(e(this.f2015l.getXVelocity(this.f2006c), this.f2017n, this.f2016m), e(this.f2015l.getYVelocity(this.f2006c), this.f2017n, this.f2016m));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r3v3, types: [T.c$c] */
    public final void B(float f3, float f4, int i3) {
        boolean c3 = c(f3, f4, i3, 1);
        boolean z3 = c3;
        if (c(f4, f3, i3, 4)) {
            z3 = (c3 ? 1 : 0) | 4;
        }
        boolean z4 = z3;
        if (c(f3, f4, i3, 2)) {
            z4 = (z3 ? 1 : 0) | 2;
        }
        ?? r02 = z4;
        if (c(f4, f3, i3, 8)) {
            r02 = (z4 ? 1 : 0) | 8;
        }
        if (r02 != 0) {
            int[] iArr = this.f2012i;
            iArr[i3] = iArr[i3] | r02;
            this.f2022s.f(r02, i3);
        }
    }

    public final void C(float f3, float f4, int i3) {
        q(i3);
        float[] fArr = this.f2007d;
        this.f2009f[i3] = f3;
        fArr[i3] = f3;
        float[] fArr2 = this.f2008e;
        this.f2010g[i3] = f4;
        fArr2[i3] = f4;
        this.f2011h[i3] = t((int) f3, (int) f4);
        this.f2014k |= 1 << i3;
    }

    public final void D(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i3 = 0; i3 < pointerCount; i3++) {
            int pointerId = motionEvent.getPointerId(i3);
            if (x(pointerId)) {
                float x3 = motionEvent.getX(i3);
                float y3 = motionEvent.getY(i3);
                this.f2009f[pointerId] = x3;
                this.f2010g[pointerId] = y3;
            }
        }
    }

    public void E(int i3) {
        this.f2025v.removeCallbacks(this.f2026w);
        if (this.f2004a != i3) {
            this.f2004a = i3;
            this.f2022s.j(i3);
            if (this.f2004a == 0) {
                this.f2023t = null;
            }
        }
    }

    public boolean F(int i3, int i4) {
        if (this.f2024u) {
            return s(i3, i4, (int) this.f2015l.getXVelocity(this.f2006c), (int) this.f2015l.getYVelocity(this.f2006c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e0, code lost:
    
        if (r12 != r11) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean G(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: T.c.G(android.view.MotionEvent):boolean");
    }

    public boolean H(View view, int i3, int i4) {
        this.f2023t = view;
        this.f2006c = -1;
        boolean s3 = s(i3, i4, 0, 0);
        if (!s3 && this.f2004a == 0 && this.f2023t != null) {
            this.f2023t = null;
        }
        return s3;
    }

    public boolean I(View view, int i3) {
        if (view == this.f2023t && this.f2006c == i3) {
            return true;
        }
        if (view == null || !this.f2022s.m(view, i3)) {
            return false;
        }
        this.f2006c = i3;
        b(view, i3);
        return true;
    }

    public void a() {
        this.f2006c = -1;
        g();
        VelocityTracker velocityTracker = this.f2015l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f2015l = null;
        }
    }

    public void b(View view, int i3) {
        if (view.getParent() == this.f2025v) {
            this.f2023t = view;
            this.f2006c = i3;
            this.f2022s.i(view, i3);
            E(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f2025v + ")");
    }

    public final boolean c(float f3, float f4, int i3, int i4) {
        float abs = Math.abs(f3);
        float abs2 = Math.abs(f4);
        if ((this.f2011h[i3] & i4) == i4 && (this.f2020q & i4) != 0 && (this.f2013j[i3] & i4) != i4 && (this.f2012i[i3] & i4) != i4) {
            int i5 = this.f2005b;
            if (abs > i5 || abs2 > i5) {
                if (abs < abs2 * 0.5f && this.f2022s.g(i4)) {
                    int[] iArr = this.f2013j;
                    iArr[i3] = iArr[i3] | i4;
                    return false;
                }
                if ((this.f2012i[i3] & i4) == 0 && abs > this.f2005b) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean d(View view, float f3, float f4) {
        if (view == null) {
            return false;
        }
        boolean z3 = this.f2022s.d(view) > 0;
        boolean z4 = this.f2022s.e(view) > 0;
        if (!z3 || !z4) {
            return z3 ? Math.abs(f3) > ((float) this.f2005b) : z4 && Math.abs(f4) > ((float) this.f2005b);
        }
        float f5 = (f3 * f3) + (f4 * f4);
        int i3 = this.f2005b;
        return f5 > ((float) (i3 * i3));
    }

    public final float e(float f3, float f4, float f5) {
        float abs = Math.abs(f3);
        if (abs < f4) {
            return 0.0f;
        }
        return abs > f5 ? f3 > 0.0f ? f5 : -f5 : f3;
    }

    public final int f(int i3, int i4, int i5) {
        int abs = Math.abs(i3);
        if (abs < i4) {
            return 0;
        }
        return abs > i5 ? i3 > 0 ? i5 : -i5 : i3;
    }

    public final void g() {
        float[] fArr = this.f2007d;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.f2008e, 0.0f);
        Arrays.fill(this.f2009f, 0.0f);
        Arrays.fill(this.f2010g, 0.0f);
        Arrays.fill(this.f2011h, 0);
        Arrays.fill(this.f2012i, 0);
        Arrays.fill(this.f2013j, 0);
        this.f2014k = 0;
    }

    public final void h(int i3) {
        if (this.f2007d == null || !w(i3)) {
            return;
        }
        this.f2007d[i3] = 0.0f;
        this.f2008e[i3] = 0.0f;
        this.f2009f[i3] = 0.0f;
        this.f2010g[i3] = 0.0f;
        this.f2011h[i3] = 0;
        this.f2012i[i3] = 0;
        this.f2013j[i3] = 0;
        this.f2014k = (~(1 << i3)) & this.f2014k;
    }

    public final int i(int i3, int i4, int i5) {
        if (i3 == 0) {
            return 0;
        }
        int width = this.f2025v.getWidth();
        float f3 = width / 2;
        float o3 = f3 + (o(Math.min(1.0f, Math.abs(i3) / width)) * f3);
        int abs = Math.abs(i4);
        return Math.min(abs > 0 ? Math.round(Math.abs(o3 / abs) * 1000.0f) * 4 : (int) (((Math.abs(i3) / i5) + 1.0f) * 256.0f), 600);
    }

    public final int j(View view, int i3, int i4, int i5, int i6) {
        float f3;
        float f4;
        float f5;
        float f6;
        int f7 = f(i5, (int) this.f2017n, (int) this.f2016m);
        int f8 = f(i6, (int) this.f2017n, (int) this.f2016m);
        int abs = Math.abs(i3);
        int abs2 = Math.abs(i4);
        int abs3 = Math.abs(f7);
        int abs4 = Math.abs(f8);
        int i7 = abs3 + abs4;
        int i8 = abs + abs2;
        if (f7 != 0) {
            f3 = abs3;
            f4 = i7;
        } else {
            f3 = abs;
            f4 = i8;
        }
        float f9 = f3 / f4;
        if (f8 != 0) {
            f5 = abs4;
            f6 = i7;
        } else {
            f5 = abs2;
            f6 = i8;
        }
        return (int) ((i(i3, f7, this.f2022s.d(view)) * f9) + (i(i4, f8, this.f2022s.e(view)) * (f5 / f6)));
    }

    public boolean k(boolean z3) {
        if (this.f2004a == 2) {
            boolean computeScrollOffset = this.f2021r.computeScrollOffset();
            int currX = this.f2021r.getCurrX();
            int currY = this.f2021r.getCurrY();
            int left = currX - this.f2023t.getLeft();
            int top = currY - this.f2023t.getTop();
            if (left != 0) {
                O.T(this.f2023t, left);
            }
            if (top != 0) {
                O.U(this.f2023t, top);
            }
            if (left != 0 || top != 0) {
                this.f2022s.k(this.f2023t, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f2021r.getFinalX() && currY == this.f2021r.getFinalY()) {
                this.f2021r.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z3) {
                    this.f2025v.post(this.f2026w);
                } else {
                    E(0);
                }
            }
        }
        return this.f2004a == 2;
    }

    public final void n(float f3, float f4) {
        this.f2024u = true;
        this.f2022s.l(this.f2023t, f3, f4);
        this.f2024u = false;
        if (this.f2004a == 1) {
            E(0);
        }
    }

    public final float o(float f3) {
        return (float) Math.sin((f3 - 0.5f) * 0.47123894f);
    }

    public final void p(int i3, int i4, int i5, int i6) {
        int left = this.f2023t.getLeft();
        int top = this.f2023t.getTop();
        if (i5 != 0) {
            i3 = this.f2022s.a(this.f2023t, i3, i5);
            O.T(this.f2023t, i3 - left);
        }
        int i7 = i3;
        if (i6 != 0) {
            i4 = this.f2022s.b(this.f2023t, i4, i6);
            O.U(this.f2023t, i4 - top);
        }
        int i8 = i4;
        if (i5 == 0 && i6 == 0) {
            return;
        }
        this.f2022s.k(this.f2023t, i7, i8, i7 - left, i8 - top);
    }

    public final void q(int i3) {
        float[] fArr = this.f2007d;
        if (fArr == null || fArr.length <= i3) {
            int i4 = i3 + 1;
            float[] fArr2 = new float[i4];
            float[] fArr3 = new float[i4];
            float[] fArr4 = new float[i4];
            float[] fArr5 = new float[i4];
            int[] iArr = new int[i4];
            int[] iArr2 = new int[i4];
            int[] iArr3 = new int[i4];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f2008e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f2009f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f2010g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f2011h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f2012i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f2013j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f2007d = fArr2;
            this.f2008e = fArr3;
            this.f2009f = fArr4;
            this.f2010g = fArr5;
            this.f2011h = iArr;
            this.f2012i = iArr2;
            this.f2013j = iArr3;
        }
    }

    public View r(int i3, int i4) {
        for (int childCount = this.f2025v.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f2025v.getChildAt(this.f2022s.c(childCount));
            if (i3 >= childAt.getLeft() && i3 < childAt.getRight() && i4 >= childAt.getTop() && i4 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean s(int i3, int i4, int i5, int i6) {
        int left = this.f2023t.getLeft();
        int top = this.f2023t.getTop();
        int i7 = i3 - left;
        int i8 = i4 - top;
        if (i7 == 0 && i8 == 0) {
            this.f2021r.abortAnimation();
            E(0);
            return false;
        }
        this.f2021r.startScroll(left, top, i7, i8, j(this.f2023t, i7, i8, i5, i6));
        E(2);
        return true;
    }

    public final int t(int i3, int i4) {
        int i5 = i3 < this.f2025v.getLeft() + this.f2018o ? 1 : 0;
        if (i4 < this.f2025v.getTop() + this.f2018o) {
            i5 |= 4;
        }
        if (i3 > this.f2025v.getRight() - this.f2018o) {
            i5 |= 2;
        }
        return i4 > this.f2025v.getBottom() - this.f2018o ? i5 | 8 : i5;
    }

    public int u() {
        return this.f2005b;
    }

    public boolean v(int i3, int i4) {
        return y(this.f2023t, i3, i4);
    }

    public boolean w(int i3) {
        return ((1 << i3) & this.f2014k) != 0;
    }

    public final boolean x(int i3) {
        if (w(i3)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i3 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    public boolean y(View view, int i3, int i4) {
        return view != null && i3 >= view.getLeft() && i3 < view.getRight() && i4 >= view.getTop() && i4 < view.getBottom();
    }

    public void z(MotionEvent motionEvent) {
        int i3;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f2015l == null) {
            this.f2015l = VelocityTracker.obtain();
        }
        this.f2015l.addMovement(motionEvent);
        int i4 = 0;
        if (actionMasked == 0) {
            float x3 = motionEvent.getX();
            float y3 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View r3 = r((int) x3, (int) y3);
            C(x3, y3, pointerId);
            I(r3, pointerId);
            int i5 = this.f2011h[pointerId];
            int i6 = this.f2020q;
            if ((i5 & i6) != 0) {
                this.f2022s.h(i5 & i6, pointerId);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f2004a == 1) {
                A();
            }
            a();
            return;
        }
        if (actionMasked == 2) {
            if (this.f2004a == 1) {
                if (x(this.f2006c)) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f2006c);
                    float x4 = motionEvent.getX(findPointerIndex);
                    float y4 = motionEvent.getY(findPointerIndex);
                    float[] fArr = this.f2009f;
                    int i7 = this.f2006c;
                    int i8 = (int) (x4 - fArr[i7]);
                    int i9 = (int) (y4 - this.f2010g[i7]);
                    p(this.f2023t.getLeft() + i8, this.f2023t.getTop() + i9, i8, i9);
                    D(motionEvent);
                    return;
                }
                return;
            }
            int pointerCount = motionEvent.getPointerCount();
            while (i4 < pointerCount) {
                int pointerId2 = motionEvent.getPointerId(i4);
                if (x(pointerId2)) {
                    float x5 = motionEvent.getX(i4);
                    float y5 = motionEvent.getY(i4);
                    float f3 = x5 - this.f2007d[pointerId2];
                    float f4 = y5 - this.f2008e[pointerId2];
                    B(f3, f4, pointerId2);
                    if (this.f2004a != 1) {
                        View r4 = r((int) x5, (int) y5);
                        if (d(r4, f3, f4) && I(r4, pointerId2)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i4++;
            }
            D(motionEvent);
            return;
        }
        if (actionMasked == 3) {
            if (this.f2004a == 1) {
                n(0.0f, 0.0f);
            }
            a();
            return;
        }
        if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x6 = motionEvent.getX(actionIndex);
            float y6 = motionEvent.getY(actionIndex);
            C(x6, y6, pointerId3);
            if (this.f2004a != 0) {
                if (v((int) x6, (int) y6)) {
                    I(this.f2023t, pointerId3);
                    return;
                }
                return;
            } else {
                I(r((int) x6, (int) y6), pointerId3);
                int i10 = this.f2011h[pointerId3];
                int i11 = this.f2020q;
                if ((i10 & i11) != 0) {
                    this.f2022s.h(i10 & i11, pointerId3);
                    return;
                }
                return;
            }
        }
        if (actionMasked != 6) {
            return;
        }
        int pointerId4 = motionEvent.getPointerId(actionIndex);
        if (this.f2004a == 1 && pointerId4 == this.f2006c) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (true) {
                if (i4 >= pointerCount2) {
                    i3 = -1;
                    break;
                }
                int pointerId5 = motionEvent.getPointerId(i4);
                if (pointerId5 != this.f2006c) {
                    View r5 = r((int) motionEvent.getX(i4), (int) motionEvent.getY(i4));
                    View view = this.f2023t;
                    if (r5 == view && I(view, pointerId5)) {
                        i3 = this.f2006c;
                        break;
                    }
                }
                i4++;
            }
            if (i3 == -1) {
                A();
            }
        }
        h(pointerId4);
    }

    /* renamed from: T.c$c, reason: collision with other inner class name */
    public static abstract class AbstractC0053c {
        public abstract int a(View view, int i3, int i4);

        public abstract int b(View view, int i3, int i4);

        public int d(View view) {
            return 0;
        }

        public int e(View view) {
            return 0;
        }

        public boolean g(int i3) {
            return false;
        }

        public abstract void j(int i3);

        public abstract void k(View view, int i3, int i4, int i5, int i6);

        public abstract void l(View view, float f3, float f4);

        public abstract boolean m(View view, int i3);

        public int c(int i3) {
            return i3;
        }

        public void f(int i3, int i4) {
        }

        public void h(int i3, int i4) {
        }

        public void i(View view, int i3) {
        }
    }
}
