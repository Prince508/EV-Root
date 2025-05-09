package androidx.core.widget;

import K.A;
import K.AbstractC0218x;
import K.B;
import K.C0184a;
import K.C0210o;
import K.C0219y;
import K.InterfaceC0211p;
import K.O;
import L.x;
import L.z;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import java.util.ArrayList;
import y.AbstractC0768a;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements A {

    /* renamed from: G, reason: collision with root package name */
    public static final float f3507G = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: H, reason: collision with root package name */
    public static final a f3508H = new a();

    /* renamed from: I, reason: collision with root package name */
    public static final int[] f3509I = {R.attr.fillViewport};

    /* renamed from: A, reason: collision with root package name */
    public e f3510A;

    /* renamed from: B, reason: collision with root package name */
    public final B f3511B;

    /* renamed from: C, reason: collision with root package name */
    public final C0219y f3512C;

    /* renamed from: D, reason: collision with root package name */
    public float f3513D;

    /* renamed from: E, reason: collision with root package name */
    public final c f3514E;

    /* renamed from: F, reason: collision with root package name */
    public C0210o f3515F;

    /* renamed from: e, reason: collision with root package name */
    public final float f3516e;

    /* renamed from: f, reason: collision with root package name */
    public long f3517f;

    /* renamed from: g, reason: collision with root package name */
    public final Rect f3518g;

    /* renamed from: h, reason: collision with root package name */
    public OverScroller f3519h;

    /* renamed from: i, reason: collision with root package name */
    public EdgeEffect f3520i;

    /* renamed from: j, reason: collision with root package name */
    public EdgeEffect f3521j;

    /* renamed from: k, reason: collision with root package name */
    public int f3522k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3523l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3524m;

    /* renamed from: n, reason: collision with root package name */
    public View f3525n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f3526o;

    /* renamed from: p, reason: collision with root package name */
    public VelocityTracker f3527p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3528q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3529r;

    /* renamed from: s, reason: collision with root package name */
    public int f3530s;

    /* renamed from: t, reason: collision with root package name */
    public int f3531t;

    /* renamed from: u, reason: collision with root package name */
    public int f3532u;

    /* renamed from: v, reason: collision with root package name */
    public int f3533v;

    /* renamed from: w, reason: collision with root package name */
    public final int[] f3534w;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f3535x;

    /* renamed from: y, reason: collision with root package name */
    public int f3536y;

    /* renamed from: z, reason: collision with root package name */
    public int f3537z;

    public static class a extends C0184a {
        @Override // K.C0184a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            z.a(accessibilityEvent, nestedScrollView.getScrollX());
            z.b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // K.C0184a
        public void g(View view, x xVar) {
            int scrollRange;
            super.g(view, xVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            xVar.j0(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            xVar.B0(true);
            if (nestedScrollView.getScrollY() > 0) {
                xVar.b(x.a.f1289r);
                xVar.b(x.a.f1256C);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                xVar.b(x.a.f1288q);
                xVar.b(x.a.f1258E);
            }
        }

        @Override // K.C0184a
        public boolean j(View view, int i3, Bundle bundle) {
            if (super.j(view, i3, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i3 != 4096) {
                if (i3 == 8192 || i3 == 16908344) {
                    int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (max == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.W(0, max, true);
                    return true;
                }
                if (i3 != 16908346) {
                    return false;
                }
            }
            int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (min == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.W(0, min, true);
            return true;
        }
    }

    public static class b {
        public static boolean a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    public class c implements InterfaceC0211p {
        public c() {
        }

        @Override // K.InterfaceC0211p
        public boolean a(float f3) {
            if (f3 == 0.0f) {
                return false;
            }
            c();
            NestedScrollView.this.v((int) f3);
            return true;
        }

        @Override // K.InterfaceC0211p
        public float b() {
            return -NestedScrollView.this.getVerticalScrollFactorCompat();
        }

        @Override // K.InterfaceC0211p
        public void c() {
            NestedScrollView.this.f3519h.abortAnimation();
        }
    }

    public interface d {
    }

    public static class e extends View.BaseSavedState {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: e, reason: collision with root package name */
        public int f3539e;

        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public e[] newArray(int i3) {
                return new e[i3];
            }
        }

        public e(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f3539e + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i3) {
            super.writeToParcel(parcel, i3);
            parcel.writeInt(this.f3539e);
        }

        public e(Parcel parcel) {
            super(parcel);
            this.f3539e = parcel.readInt();
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0768a.f10110c);
    }

    public static boolean F(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && F((View) parent, view2);
    }

    public static int l(int i3, int i4, int i5) {
        if (i4 >= i5 || i3 < 0) {
            return 0;
        }
        return i4 + i3 > i5 ? i5 - i4 : i3;
    }

    public final void A() {
        VelocityTracker velocityTracker = this.f3527p;
        if (velocityTracker == null) {
            this.f3527p = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    public final void B() {
        this.f3519h = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f3530s = viewConfiguration.getScaledTouchSlop();
        this.f3531t = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f3532u = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    public final void C() {
        if (this.f3527p == null) {
            this.f3527p = VelocityTracker.obtain();
        }
    }

    public final void D(int i3, int i4) {
        this.f3522k = i3;
        this.f3533v = i4;
        X(2, 0);
    }

    public final boolean E(View view) {
        return !G(view, 0, getHeight());
    }

    public final boolean G(View view, int i3, int i4) {
        view.getDrawingRect(this.f3518g);
        offsetDescendantRectToMyCoords(view, this.f3518g);
        return this.f3518g.bottom + i3 >= getScrollY() && this.f3518g.top - i3 <= getScrollY() + i4;
    }

    public final void H(int i3, int i4, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i3);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f3512C.e(0, scrollY2, 0, i3 - scrollY2, null, i4, iArr);
    }

    public final void I(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f3533v) {
            int i3 = actionIndex == 0 ? 1 : 0;
            this.f3522k = (int) motionEvent.getY(i3);
            this.f3533v = motionEvent.getPointerId(i3);
            VelocityTracker velocityTracker = this.f3527p;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public boolean J(int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, boolean z3) {
        boolean z4;
        boolean z5;
        int i11;
        int overScrollMode = getOverScrollMode();
        boolean z6 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z7 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z8 = overScrollMode == 0 || (overScrollMode == 1 && z6);
        boolean z9 = overScrollMode == 0 || (overScrollMode == 1 && z7);
        int i12 = i5 + i3;
        int i13 = !z8 ? 0 : i9;
        int i14 = i6 + i4;
        int i15 = !z9 ? 0 : i10;
        int i16 = -i13;
        int i17 = i13 + i7;
        int i18 = -i15;
        int i19 = i15 + i8;
        if (i12 > i17) {
            i12 = i17;
            z4 = true;
        } else if (i12 < i16) {
            z4 = true;
            i12 = i16;
        } else {
            z4 = false;
        }
        if (i14 > i19) {
            i14 = i19;
            z5 = true;
        } else if (i14 < i18) {
            z5 = true;
            i14 = i18;
        } else {
            z5 = false;
        }
        if (!z5 || y(1)) {
            i11 = i12;
        } else {
            int i20 = i12;
            this.f3519h.springBack(i20, i14, 0, 0, 0, getScrollRange());
            i11 = i20;
        }
        onOverScrolled(i11, i14, z4, z5);
        return z4 || z5;
    }

    public boolean K(int i3) {
        boolean z3 = i3 == 130;
        int height = getHeight();
        if (z3) {
            this.f3518g.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f3518g;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f3518g.top = getScrollY() - height;
            Rect rect2 = this.f3518g;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f3518g;
        int i4 = rect3.top;
        int i5 = height + i4;
        rect3.bottom = i5;
        return O(i3, i4, i5);
    }

    public final void L() {
        VelocityTracker velocityTracker = this.f3527p;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f3527p = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int M(int r4, float r5) {
        /*
            r3 = this;
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r4 = (float) r4
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r4 = r4 / r0
            android.widget.EdgeEffect r0 = r3.f3520i
            float r0 = Q.c.b(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L31
            android.widget.EdgeEffect r0 = r3.f3520i
            float r4 = -r4
            float r4 = Q.c.d(r0, r4, r5)
            float r4 = -r4
            android.widget.EdgeEffect r5 = r3.f3520i
            float r5 = Q.c.b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L2f
            android.widget.EdgeEffect r5 = r3.f3520i
            r5.onRelease()
        L2f:
            r1 = r4
            goto L54
        L31:
            android.widget.EdgeEffect r0 = r3.f3521j
            float r0 = Q.c.b(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L54
            android.widget.EdgeEffect r0 = r3.f3521j
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r5
            float r4 = Q.c.d(r0, r4, r2)
            android.widget.EdgeEffect r5 = r3.f3521j
            float r5 = Q.c.b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L2f
            android.widget.EdgeEffect r5 = r3.f3521j
            r5.onRelease()
            goto L2f
        L54:
            int r4 = r3.getHeight()
            float r4 = (float) r4
            float r1 = r1 * r4
            int r4 = java.lang.Math.round(r1)
            if (r4 == 0) goto L63
            r3.invalidate()
        L63:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.M(int, float):int");
    }

    public final void N(boolean z3) {
        if (z3) {
            X(2, 1);
        } else {
            Z(1);
        }
        this.f3537z = getScrollY();
        postInvalidateOnAnimation();
    }

    public final boolean O(int i3, int i4, int i5) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i6 = height + scrollY;
        boolean z3 = false;
        boolean z4 = i3 == 33;
        View u3 = u(z4, i4, i5);
        if (u3 == null) {
            u3 = this;
        }
        if (i4 < scrollY || i5 > i6) {
            P(z4 ? i4 - scrollY : i5 - i6, 0, 1, true);
            z3 = true;
        }
        if (u3 != findFocus()) {
            u3.requestFocus(i3);
        }
        return z3;
    }

    public final int P(int i3, int i4, int i5, boolean z3) {
        int i6;
        int i7;
        VelocityTracker velocityTracker;
        if (i5 == 1) {
            X(2, i5);
        }
        boolean z4 = false;
        if (o(0, i3, this.f3535x, this.f3534w, i5)) {
            int i8 = i3 - this.f3535x[1];
            i7 = this.f3534w[1];
            i6 = i8;
        } else {
            i6 = i3;
            i7 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        boolean z5 = j() && !z3;
        int i9 = i6;
        boolean z6 = J(0, i6, 0, scrollY, 0, scrollRange, 0, 0, true) && !y(i5);
        int scrollY2 = getScrollY() - scrollY;
        int[] iArr = this.f3535x;
        iArr[1] = 0;
        p(0, scrollY2, 0, i9 - scrollY2, this.f3534w, i5, iArr);
        int i10 = i7 + this.f3534w[1];
        int i11 = i9 - this.f3535x[1];
        int i12 = scrollY + i11;
        if (i12 < 0) {
            if (z5) {
                Q.c.d(this.f3520i, (-i11) / getHeight(), i4 / getWidth());
                if (!this.f3521j.isFinished()) {
                    this.f3521j.onRelease();
                }
            }
        } else if (i12 > scrollRange && z5) {
            Q.c.d(this.f3521j, i11 / getHeight(), 1.0f - (i4 / getWidth()));
            if (!this.f3520i.isFinished()) {
                this.f3520i.onRelease();
            }
        }
        if (this.f3520i.isFinished() && this.f3521j.isFinished()) {
            z4 = z6;
        } else {
            postInvalidateOnAnimation();
        }
        if (z4 && i5 == 0 && (velocityTracker = this.f3527p) != null) {
            velocityTracker.clear();
        }
        if (i5 == 1) {
            Z(i5);
            this.f3520i.onRelease();
            this.f3521j.onRelease();
        }
        return i10;
    }

    public final void Q(View view) {
        view.getDrawingRect(this.f3518g);
        offsetDescendantRectToMyCoords(view, this.f3518g);
        int m3 = m(this.f3518g);
        if (m3 != 0) {
            scrollBy(0, m3);
        }
    }

    public final boolean R(Rect rect, boolean z3) {
        int m3 = m(rect);
        boolean z4 = m3 != 0;
        if (z4) {
            if (z3) {
                scrollBy(0, m3);
                return z4;
            }
            T(0, m3);
        }
        return z4;
    }

    public final boolean S(EdgeEffect edgeEffect, int i3) {
        if (i3 > 0) {
            return true;
        }
        return x(-i3) < Q.c.b(edgeEffect) * ((float) getHeight());
    }

    public final void T(int i3, int i4) {
        U(i3, i4, 250, false);
    }

    public final void U(int i3, int i4, int i5, boolean z3) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f3517f > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f3519h.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i4 + scrollY, Math.max(0, height - height2))) - scrollY, i5);
            N(z3);
        } else {
            if (!this.f3519h.isFinished()) {
                g();
            }
            scrollBy(i3, i4);
        }
        this.f3517f = AnimationUtils.currentAnimationTimeMillis();
    }

    public void V(int i3, int i4, int i5, boolean z3) {
        U(i3 - getScrollX(), i4 - getScrollY(), i5, z3);
    }

    public void W(int i3, int i4, boolean z3) {
        V(i3, i4, 250, z3);
    }

    public boolean X(int i3, int i4) {
        return this.f3512C.p(i3, i4);
    }

    public final boolean Y(MotionEvent motionEvent) {
        boolean z3;
        if (Q.c.b(this.f3520i) != 0.0f) {
            Q.c.d(this.f3520i, 0.0f, motionEvent.getX() / getWidth());
            z3 = true;
        } else {
            z3 = false;
        }
        if (Q.c.b(this.f3521j) == 0.0f) {
            return z3;
        }
        Q.c.d(this.f3521j, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public void Z(int i3) {
        this.f3512C.r(i3);
    }

    @Override // K.InterfaceC0220z
    public void a(View view, View view2, int i3, int i4) {
        this.f3511B.c(view, view2, i3, i4);
        X(2, i4);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // K.InterfaceC0220z
    public void b(View view, int i3) {
        this.f3511B.d(view, i3);
        Z(i3);
    }

    @Override // K.InterfaceC0220z
    public void c(View view, int i3, int i4, int[] iArr, int i5) {
        o(i3, i4, iArr, null, i5);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        int i3;
        if (this.f3519h.isFinished()) {
            return;
        }
        this.f3519h.computeScrollOffset();
        int currY = this.f3519h.getCurrY();
        int n3 = n(currY - this.f3537z);
        this.f3537z = currY;
        int[] iArr = this.f3535x;
        iArr[1] = 0;
        o(0, n3, iArr, null, 1);
        int i4 = n3 - this.f3535x[1];
        int scrollRange = getScrollRange();
        if (i4 != 0) {
            int scrollY = getScrollY();
            J(0, i4, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            i3 = scrollRange;
            int scrollY2 = getScrollY() - scrollY;
            int i5 = i4 - scrollY2;
            int[] iArr2 = this.f3535x;
            iArr2[1] = 0;
            p(0, scrollY2, 0, i5, this.f3534w, 1, iArr2);
            i4 = i5 - this.f3535x[1];
        } else {
            i3 = scrollRange;
        }
        if (i4 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && i3 > 0)) {
                if (i4 < 0) {
                    if (this.f3520i.isFinished()) {
                        this.f3520i.onAbsorb((int) this.f3519h.getCurrVelocity());
                    }
                } else if (this.f3521j.isFinished()) {
                    this.f3521j.onAbsorb((int) this.f3519h.getCurrVelocity());
                }
            }
            g();
        }
        if (this.f3519h.isFinished()) {
            Z(1);
        } else {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    @Override // K.A
    public void d(View view, int i3, int i4, int i5, int i6, int i7, int[] iArr) {
        H(i6, i7, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || t(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f3, float f4, boolean z3) {
        return this.f3512C.a(f3, f4, z3);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f3, float f4) {
        return this.f3512C.b(f3, f4);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i3, int i4, int[] iArr, int[] iArr2) {
        return o(i3, i4, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i3, int i4, int i5, int i6, int[] iArr) {
        return this.f3512C.f(i3, i4, i5, i6, iArr);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i3;
        super.draw(canvas);
        int scrollY = getScrollY();
        int i4 = 0;
        if (!this.f3520i.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (b.a(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                i3 = getPaddingLeft();
            } else {
                i3 = 0;
            }
            if (b.a(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                min += getPaddingTop();
            }
            canvas.translate(i3, min);
            this.f3520i.setSize(width, height);
            if (this.f3520i.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(save);
        }
        if (this.f3521j.isFinished()) {
            return;
        }
        int save2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int max = Math.max(getScrollRange(), scrollY) + height2;
        if (b.a(this)) {
            width2 -= getPaddingLeft() + getPaddingRight();
            i4 = getPaddingLeft();
        }
        if (b.a(this)) {
            height2 -= getPaddingTop() + getPaddingBottom();
            max -= getPaddingBottom();
        }
        canvas.translate(i4 - width2, max);
        canvas.rotate(180.0f, width2, 0.0f);
        this.f3521j.setSize(width2, height2);
        if (this.f3521j.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(save2);
    }

    @Override // K.InterfaceC0220z
    public void e(View view, int i3, int i4, int i5, int i6, int i7) {
        H(i6, i7, null);
    }

    @Override // K.InterfaceC0220z
    public boolean f(View view, View view2, int i3, int i4) {
        return (i3 & 2) != 0;
    }

    public final void g() {
        this.f3519h.abortAnimation();
        Z(1);
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f3511B.a();
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.f3513D == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f3513D = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f3513D;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return y(0);
    }

    public boolean i(int i3) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i3);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus == null || !G(findNextFocus, maxScrollAmount, getHeight())) {
            if (i3 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i3 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i3 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            P(maxScrollAmount, 0, 1, true);
        } else {
            findNextFocus.getDrawingRect(this.f3518g);
            offsetDescendantRectToMyCoords(findNextFocus, this.f3518g);
            P(m(this.f3518g), 0, 1, true);
            findNextFocus.requestFocus(i3);
        }
        if (findFocus != null && findFocus.isFocused() && E(findFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f3512C.l();
    }

    public final boolean j() {
        int overScrollMode = getOverScrollMode();
        return overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0);
    }

    public final boolean k() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                return true;
            }
        }
        return false;
    }

    public int m(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i3 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i4 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i3 - verticalFadingEdgeLength : i3;
        int i5 = rect.bottom;
        if (i5 > i4 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i4, (childAt.getBottom() + layoutParams.bottomMargin) - i3);
        }
        if (rect.top >= scrollY || i5 >= i4) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i4 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.ViewGroup
    public void measureChild(View view, int i3, int i4) {
        view.measure(ViewGroup.getChildMeasureSpec(i3, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i3, int i4, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i3, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i4, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public int n(int i3) {
        int height = getHeight();
        if (i3 > 0 && Q.c.b(this.f3520i) != 0.0f) {
            int round = Math.round(((-height) / 4.0f) * Q.c.d(this.f3520i, ((-i3) * 4.0f) / height, 0.5f));
            if (round != i3) {
                this.f3520i.finish();
            }
            return i3 - round;
        }
        if (i3 >= 0 || Q.c.b(this.f3521j) == 0.0f) {
            return i3;
        }
        float f3 = height;
        int round2 = Math.round((f3 / 4.0f) * Q.c.d(this.f3521j, (i3 * 4.0f) / f3, 0.5f));
        if (round2 != i3) {
            this.f3521j.finish();
        }
        return i3 - round2;
    }

    public boolean o(int i3, int i4, int[] iArr, int[] iArr2, int i5) {
        return this.f3512C.d(i3, i4, iArr, iArr2, i5);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3524m = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i3;
        int i4;
        float f3;
        if (motionEvent.getAction() == 8 && !this.f3526o) {
            if (AbstractC0218x.a(motionEvent, 2)) {
                i3 = 9;
                f3 = motionEvent.getAxisValue(9);
                i4 = (int) motionEvent.getX();
            } else if (AbstractC0218x.a(motionEvent, 4194304)) {
                float axisValue = motionEvent.getAxisValue(26);
                i4 = getWidth() / 2;
                i3 = 26;
                f3 = axisValue;
            } else {
                i3 = 0;
                i4 = 0;
                f3 = 0.0f;
            }
            if (f3 != 0.0f) {
                P(-((int) (f3 * getVerticalScrollFactorCompat())), i4, 1, AbstractC0218x.a(motionEvent, 8194));
                if (i3 != 0) {
                    this.f3515F.g(motionEvent, i3);
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z3 = true;
        if (action == 2 && this.f3526o) {
            return true;
        }
        int i3 = action & 255;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = this.f3533v;
                    if (i4 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i4);
                        if (findPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i4 + " in onInterceptTouchEvent");
                        } else {
                            int y3 = (int) motionEvent.getY(findPointerIndex);
                            if (Math.abs(y3 - this.f3522k) > this.f3530s && (2 & getNestedScrollAxes()) == 0) {
                                this.f3526o = true;
                                this.f3522k = y3;
                                C();
                                this.f3527p.addMovement(motionEvent);
                                this.f3536y = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                } else if (i3 != 3) {
                    if (i3 == 6) {
                        I(motionEvent);
                    }
                }
            }
            this.f3526o = false;
            this.f3533v = -1;
            L();
            if (this.f3519h.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            Z(0);
        } else {
            int y4 = (int) motionEvent.getY();
            if (z((int) motionEvent.getX(), y4)) {
                this.f3522k = y4;
                this.f3533v = motionEvent.getPointerId(0);
                A();
                this.f3527p.addMovement(motionEvent);
                this.f3519h.computeScrollOffset();
                if (!Y(motionEvent) && this.f3519h.isFinished()) {
                    z3 = false;
                }
                this.f3526o = z3;
                X(2, 0);
            } else {
                if (!Y(motionEvent) && this.f3519h.isFinished()) {
                    z3 = false;
                }
                this.f3526o = z3;
                L();
            }
        }
        return this.f3526o;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        super.onLayout(z3, i3, i4, i5, i6);
        int i7 = 0;
        this.f3523l = false;
        View view = this.f3525n;
        if (view != null && F(view, this)) {
            Q(this.f3525n);
        }
        this.f3525n = null;
        if (!this.f3524m) {
            if (this.f3510A != null) {
                scrollTo(getScrollX(), this.f3510A.f3539e);
                this.f3510A = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i7 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i6 - i4) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int l3 = l(scrollY, paddingTop, i7);
            if (l3 != scrollY) {
                scrollTo(getScrollX(), l3);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f3524m = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i3, int i4) {
        super.onMeasure(i3, i4);
        if (this.f3528q && View.MeasureSpec.getMode(i4) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i3, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f3, float f4, boolean z3) {
        if (z3) {
            return false;
        }
        dispatchNestedFling(0.0f, f4, true);
        v((int) f4);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f3, float f4) {
        return dispatchNestedPreFling(f3, f4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i3, int i4, int[] iArr) {
        c(view, i3, i4, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i3, int i4, int i5, int i6) {
        H(i6, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i3) {
        a(view, view2, i3, 0);
    }

    @Override // android.view.View
    public void onOverScrolled(int i3, int i4, boolean z3, boolean z4) {
        super.scrollTo(i3, i4);
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i3, Rect rect) {
        if (i3 == 2) {
            i3 = 130;
        } else if (i3 == 1) {
            i3 = 33;
        }
        View findNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i3) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i3);
        if (findNextFocus == null || E(findNextFocus)) {
            return false;
        }
        return findNextFocus.requestFocus(i3, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.getSuperState());
        this.f3510A = eVar;
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        e eVar = new e(super.onSaveInstanceState());
        eVar.f3539e = getScrollY();
        return eVar;
    }

    @Override // android.view.View
    public void onScrollChanged(int i3, int i4, int i5, int i6) {
        super.onScrollChanged(i3, i4, i5, i6);
    }

    @Override // android.view.View
    public void onSizeChanged(int i3, int i4, int i5, int i6) {
        super.onSizeChanged(i3, i4, i5, i6);
        View findFocus = findFocus();
        if (findFocus == null || this == findFocus || !G(findFocus, 0, i6)) {
            return;
        }
        findFocus.getDrawingRect(this.f3518g);
        offsetDescendantRectToMyCoords(findFocus, this.f3518g);
        q(m(this.f3518g));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i3) {
        return f(view, view2, i3, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        b(view, 0);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        C();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f3536y = 0;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(0.0f, this.f3536y);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f3527p;
                velocityTracker.computeCurrentVelocity(1000, this.f3532u);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f3533v);
                if (Math.abs(yVelocity) >= this.f3531t) {
                    if (!r(yVelocity)) {
                        int i3 = -yVelocity;
                        float f3 = i3;
                        if (!dispatchNestedPreFling(0.0f, f3)) {
                            dispatchNestedFling(0.0f, f3, true);
                            v(i3);
                        }
                    }
                } else if (this.f3519h.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                s();
            } else if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f3533v);
                if (findPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f3533v + " in onTouchEvent");
                } else {
                    int y3 = (int) motionEvent.getY(findPointerIndex);
                    int i4 = this.f3522k - y3;
                    int M3 = i4 - M(i4, motionEvent.getX(findPointerIndex));
                    if (!this.f3526o && Math.abs(M3) > this.f3530s) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f3526o = true;
                        M3 = M3 > 0 ? M3 - this.f3530s : M3 + this.f3530s;
                    }
                    if (this.f3526o) {
                        int P3 = P(M3, (int) motionEvent.getX(findPointerIndex), 0, false);
                        this.f3522k = y3 - P3;
                        this.f3536y += P3;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f3526o && getChildCount() > 0 && this.f3519h.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                s();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f3522k = (int) motionEvent.getY(actionIndex);
                this.f3533v = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                I(motionEvent);
                this.f3522k = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f3533v));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f3526o && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f3519h.isFinished()) {
                g();
            }
            D((int) motionEvent.getY(), motionEvent.getPointerId(0));
        }
        VelocityTracker velocityTracker2 = this.f3527p;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    public void p(int i3, int i4, int i5, int i6, int[] iArr, int i7, int[] iArr2) {
        this.f3512C.e(i3, i4, i5, i6, iArr, i7, iArr2);
    }

    public final void q(int i3) {
        if (i3 != 0) {
            if (this.f3529r) {
                T(0, i3);
            } else {
                scrollBy(0, i3);
            }
        }
    }

    public final boolean r(int i3) {
        if (Q.c.b(this.f3520i) != 0.0f) {
            if (S(this.f3520i, i3)) {
                this.f3520i.onAbsorb(i3);
                return true;
            }
            v(-i3);
            return true;
        }
        if (Q.c.b(this.f3521j) == 0.0f) {
            return false;
        }
        int i4 = -i3;
        if (S(this.f3521j, i4)) {
            this.f3521j.onAbsorb(i4);
            return true;
        }
        v(i4);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.f3523l) {
            this.f3525n = view2;
        } else {
            Q(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z3) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return R(rect, z3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z3) {
        if (z3) {
            L();
        }
        super.requestDisallowInterceptTouchEvent(z3);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f3523l = true;
        super.requestLayout();
    }

    public final void s() {
        this.f3533v = -1;
        this.f3526o = false;
        L();
        Z(0);
        this.f3520i.onRelease();
        this.f3521j.onRelease();
    }

    @Override // android.view.View
    public void scrollTo(int i3, int i4) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int l3 = l(i3, width, width2);
            int l4 = l(i4, height, height2);
            if (l3 == getScrollX() && l4 == getScrollY()) {
                return;
            }
            super.scrollTo(l3, l4);
        }
    }

    public void setFillViewport(boolean z3) {
        if (z3 != this.f3528q) {
            this.f3528q = z3;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z3) {
        this.f3512C.m(z3);
    }

    public void setOnScrollChangeListener(d dVar) {
    }

    public void setSmoothScrollingEnabled(boolean z3) {
        this.f3529r = z3;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i3) {
        return X(i3, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        Z(0);
    }

    public boolean t(KeyEvent keyEvent) {
        this.f3518g.setEmpty();
        if (!k()) {
            if (isFocused() && keyEvent.getKeyCode() != 4) {
                View findFocus = findFocus();
                if (findFocus == this) {
                    findFocus = null;
                }
                View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, 130);
                if (findNextFocus != null && findNextFocus != this && findNextFocus.requestFocus(130)) {
                    return true;
                }
            }
            return false;
        }
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                return keyEvent.isAltPressed() ? w(33) : i(33);
            }
            if (keyCode == 20) {
                return keyEvent.isAltPressed() ? w(130) : i(130);
            }
            if (keyCode == 62) {
                K(keyEvent.isShiftPressed() ? 33 : 130);
                return false;
            }
            if (keyCode == 92) {
                return w(33);
            }
            if (keyCode == 93) {
                return w(130);
            }
            if (keyCode == 122) {
                K(33);
                return false;
            }
            if (keyCode == 123) {
                K(130);
                return false;
            }
        }
        return false;
    }

    public final View u(boolean z3, int i3, int i4) {
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z4 = false;
        for (int i5 = 0; i5 < size; i5++) {
            View view2 = focusables.get(i5);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i3 < bottom && top < i4) {
                boolean z5 = i3 < top && bottom < i4;
                if (view == null) {
                    view = view2;
                    z4 = z5;
                } else {
                    boolean z6 = (z3 && top < view.getTop()) || (!z3 && bottom > view.getBottom());
                    if (z4) {
                        if (z5) {
                            if (!z6) {
                            }
                            view = view2;
                        }
                    } else if (z5) {
                        view = view2;
                        z4 = true;
                    } else {
                        if (!z6) {
                        }
                        view = view2;
                    }
                }
            }
        }
        return view;
    }

    public void v(int i3) {
        if (getChildCount() > 0) {
            this.f3519h.fling(getScrollX(), getScrollY(), 0, i3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            N(true);
        }
    }

    public boolean w(int i3) {
        int childCount;
        boolean z3 = i3 == 130;
        int height = getHeight();
        Rect rect = this.f3518g;
        rect.top = 0;
        rect.bottom = height;
        if (z3 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f3518g.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f3518g;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f3518g;
        return O(i3, rect3.top, rect3.bottom);
    }

    public final float x(int i3) {
        double log = Math.log((Math.abs(i3) * 0.35f) / (this.f3516e * 0.015f));
        float f3 = f3507G;
        return (float) (this.f3516e * 0.015f * Math.exp((f3 / (f3 - 1.0d)) * log));
    }

    public boolean y(int i3) {
        return this.f3512C.k(i3);
    }

    public final boolean z(int i3, int i4) {
        if (getChildCount() > 0) {
            int scrollY = getScrollY();
            View childAt = getChildAt(0);
            if (i4 >= childAt.getTop() - scrollY && i4 < childAt.getBottom() - scrollY && i3 >= childAt.getLeft() && i3 < childAt.getRight()) {
                return true;
            }
        }
        return false;
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        this.f3518g = new Rect();
        this.f3523l = true;
        this.f3524m = false;
        this.f3525n = null;
        this.f3526o = false;
        this.f3529r = true;
        this.f3533v = -1;
        this.f3534w = new int[2];
        this.f3535x = new int[2];
        c cVar = new c();
        this.f3514E = cVar;
        this.f3515F = new C0210o(getContext(), cVar);
        this.f3520i = Q.c.a(context, attributeSet);
        this.f3521j = Q.c.a(context, attributeSet);
        this.f3516e = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        B();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3509I, i3, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f3511B = new B(this);
        this.f3512C = new C0219y(this);
        setNestedScrollingEnabled(true);
        O.j0(this, f3508H);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i3) {
        if (getChildCount() <= 0) {
            super.addView(view, i3);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i3, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
