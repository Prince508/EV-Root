package androidx.appcompat.widget;

import K.A;
import K.B;
import K.C0205k0;
import K.InterfaceC0220z;
import K.O;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import d.AbstractC0435a;
import l.InterfaceC0583x;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0220z, A {

    /* renamed from: I, reason: collision with root package name */
    public static final int[] f2910I = {AbstractC0435a.f6015b, R.attr.windowContentOverlay};

    /* renamed from: A, reason: collision with root package name */
    public C0205k0 f2911A;

    /* renamed from: B, reason: collision with root package name */
    public C0205k0 f2912B;

    /* renamed from: C, reason: collision with root package name */
    public OverScroller f2913C;

    /* renamed from: D, reason: collision with root package name */
    public ViewPropertyAnimator f2914D;

    /* renamed from: E, reason: collision with root package name */
    public final AnimatorListenerAdapter f2915E;

    /* renamed from: F, reason: collision with root package name */
    public final Runnable f2916F;

    /* renamed from: G, reason: collision with root package name */
    public final Runnable f2917G;

    /* renamed from: H, reason: collision with root package name */
    public final B f2918H;

    /* renamed from: e, reason: collision with root package name */
    public int f2919e;

    /* renamed from: f, reason: collision with root package name */
    public int f2920f;

    /* renamed from: g, reason: collision with root package name */
    public ContentFrameLayout f2921g;

    /* renamed from: h, reason: collision with root package name */
    public ActionBarContainer f2922h;

    /* renamed from: i, reason: collision with root package name */
    public InterfaceC0583x f2923i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f2924j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2925k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2926l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2927m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2928n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2929o;

    /* renamed from: p, reason: collision with root package name */
    public int f2930p;

    /* renamed from: q, reason: collision with root package name */
    public int f2931q;

    /* renamed from: r, reason: collision with root package name */
    public final Rect f2932r;

    /* renamed from: s, reason: collision with root package name */
    public final Rect f2933s;

    /* renamed from: t, reason: collision with root package name */
    public final Rect f2934t;

    /* renamed from: u, reason: collision with root package name */
    public final Rect f2935u;

    /* renamed from: v, reason: collision with root package name */
    public final Rect f2936v;

    /* renamed from: w, reason: collision with root package name */
    public final Rect f2937w;

    /* renamed from: x, reason: collision with root package name */
    public final Rect f2938x;

    /* renamed from: y, reason: collision with root package name */
    public C0205k0 f2939y;

    /* renamed from: z, reason: collision with root package name */
    public C0205k0 f2940z;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f2914D = null;
            actionBarOverlayLayout.f2929o = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f2914D = null;
            actionBarOverlayLayout.f2929o = false;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.l();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f2914D = actionBarOverlayLayout.f2922h.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f2915E);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.l();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f2914D = actionBarOverlayLayout.f2922h.animate().translationY(-ActionBarOverlayLayout.this.f2922h.getHeight()).setListener(ActionBarOverlayLayout.this.f2915E);
        }
    }

    public interface d {
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(int i3, int i4) {
            super(i3, i4);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2920f = 0;
        this.f2932r = new Rect();
        this.f2933s = new Rect();
        this.f2934t = new Rect();
        this.f2935u = new Rect();
        this.f2936v = new Rect();
        this.f2937w = new Rect();
        this.f2938x = new Rect();
        C0205k0 c0205k0 = C0205k0.f1019b;
        this.f2939y = c0205k0;
        this.f2940z = c0205k0;
        this.f2911A = c0205k0;
        this.f2912B = c0205k0;
        this.f2915E = new a();
        this.f2916F = new b();
        this.f2917G = new c();
        m(context);
        this.f2918H = new B(this);
    }

    @Override // K.InterfaceC0220z
    public void a(View view, View view2, int i3, int i4) {
        if (i4 == 0) {
            onNestedScrollAccepted(view, view2, i3);
        }
    }

    @Override // K.InterfaceC0220z
    public void b(View view, int i3) {
        if (i3 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // K.InterfaceC0220z
    public void c(View view, int i3, int i4, int[] iArr, int i5) {
        if (i5 == 0) {
            onNestedPreScroll(view, i3, i4, iArr);
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // K.A
    public void d(View view, int i3, int i4, int i5, int i6, int i7, int[] iArr) {
        e(view, i3, i4, i5, i6, i7);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f2924j == null || this.f2925k) {
            return;
        }
        int bottom = this.f2922h.getVisibility() == 0 ? (int) (this.f2922h.getBottom() + this.f2922h.getTranslationY() + 0.5f) : 0;
        this.f2924j.setBounds(0, bottom, getWidth(), this.f2924j.getIntrinsicHeight() + bottom);
        this.f2924j.draw(canvas);
    }

    @Override // K.InterfaceC0220z
    public void e(View view, int i3, int i4, int i5, int i6, int i7) {
        if (i7 == 0) {
            onNestedScroll(view, i3, i4, i5, i6);
        }
    }

    @Override // K.InterfaceC0220z
    public boolean f(View view, View view2, int i3, int i4) {
        return i4 == 0 && onStartNestedScroll(view, view2, i3);
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    public final void g() {
        l();
        this.f2917G.run();
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f2922h;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f2918H.a();
    }

    public CharSequence getTitle() {
        p();
        return this.f2923i.getTitle();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean h(android.view.View r3, android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r3 = (androidx.appcompat.widget.ActionBarOverlayLayout.e) r3
            r0 = 1
            if (r5 == 0) goto L13
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L13
            r3.leftMargin = r1
            r5 = r0
            goto L14
        L13:
            r5 = 0
        L14:
            if (r6 == 0) goto L1f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L1f
            r3.topMargin = r1
            r5 = r0
        L1f:
            if (r8 == 0) goto L2a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L2a
            r3.rightMargin = r8
            r5 = r0
        L2a:
            if (r7 == 0) goto L35
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L35
            r3.bottomMargin = r4
            return r0
        L35:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.h(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    @Override // android.view.ViewGroup
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final InterfaceC0583x k(View view) {
        if (view instanceof InterfaceC0583x) {
            return (InterfaceC0583x) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    public void l() {
        removeCallbacks(this.f2916F);
        removeCallbacks(this.f2917G);
        ViewPropertyAnimator viewPropertyAnimator = this.f2914D;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void m(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f2910I);
        this.f2919e = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f2924j = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f2925k = context.getApplicationInfo().targetSdkVersion < 19;
        this.f2913C = new OverScroller(context);
    }

    public final void n() {
        l();
        postDelayed(this.f2917G, 600L);
    }

    public final void o() {
        l();
        postDelayed(this.f2916F, 600L);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        p();
        C0205k0 u3 = C0205k0.u(windowInsets, this);
        boolean h3 = h(this.f2922h, new Rect(u3.i(), u3.k(), u3.j(), u3.h()), true, true, false, true);
        O.e(this, u3, this.f2932r);
        Rect rect = this.f2932r;
        C0205k0 l3 = u3.l(rect.left, rect.top, rect.right, rect.bottom);
        this.f2939y = l3;
        boolean z3 = true;
        if (!this.f2940z.equals(l3)) {
            this.f2940z = this.f2939y;
            h3 = true;
        }
        if (this.f2933s.equals(this.f2932r)) {
            z3 = h3;
        } else {
            this.f2933s.set(this.f2932r);
        }
        if (z3) {
            requestLayout();
        }
        return u3.a().c().b().s();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m(getContext());
        O.g0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i8 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i9 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i8, i9, measuredWidth + i8, measuredHeight + i9);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i3, int i4) {
        int measuredHeight;
        p();
        measureChildWithMargins(this.f2922h, i3, 0, i4, 0);
        e eVar = (e) this.f2922h.getLayoutParams();
        int max = Math.max(0, this.f2922h.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int max2 = Math.max(0, this.f2922h.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f2922h.getMeasuredState());
        boolean z3 = (O.H(this) & 256) != 0;
        if (z3) {
            measuredHeight = this.f2919e;
            if (this.f2927m && this.f2922h.getTabContainer() != null) {
                measuredHeight += this.f2919e;
            }
        } else {
            measuredHeight = this.f2922h.getVisibility() != 8 ? this.f2922h.getMeasuredHeight() : 0;
        }
        this.f2934t.set(this.f2932r);
        C0205k0 c0205k0 = this.f2939y;
        this.f2911A = c0205k0;
        if (this.f2926l || z3) {
            this.f2911A = new C0205k0.b(this.f2911A).d(C.b.b(c0205k0.i(), this.f2911A.k() + measuredHeight, this.f2911A.j(), this.f2911A.h())).a();
        } else {
            Rect rect = this.f2934t;
            rect.top += measuredHeight;
            rect.bottom = rect.bottom;
            this.f2911A = c0205k0.l(0, measuredHeight, 0, 0);
        }
        h(this.f2921g, this.f2934t, true, true, true, true);
        if (!this.f2912B.equals(this.f2911A)) {
            C0205k0 c0205k02 = this.f2911A;
            this.f2912B = c0205k02;
            O.f(this.f2921g, c0205k02);
        }
        measureChildWithMargins(this.f2921g, i3, 0, i4, 0);
        e eVar2 = (e) this.f2921g.getLayoutParams();
        int max3 = Math.max(max, this.f2921g.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int max4 = Math.max(max2, this.f2921g.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f2921g.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i3, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i4, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f3, float f4, boolean z3) {
        if (!this.f2928n || !z3) {
            return false;
        }
        if (r(f4)) {
            g();
        } else {
            q();
        }
        this.f2929o = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f3, float f4) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i3, int i4, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i3, int i4, int i5, int i6) {
        int i7 = this.f2930p + i4;
        this.f2930p = i7;
        setActionBarHideOffset(i7);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i3) {
        this.f2918H.b(view, view2, i3);
        this.f2930p = getActionBarHideOffset();
        l();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i3) {
        if ((i3 & 2) == 0 || this.f2922h.getVisibility() != 0) {
            return false;
        }
        return this.f2928n;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        if (!this.f2928n || this.f2929o) {
            return;
        }
        if (this.f2930p <= this.f2922h.getHeight()) {
            o();
        } else {
            n();
        }
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int i3) {
        super.onWindowSystemUiVisibilityChanged(i3);
        p();
        this.f2931q = i3;
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i3) {
        super.onWindowVisibilityChanged(i3);
        this.f2920f = i3;
    }

    public void p() {
        if (this.f2921g == null) {
            this.f2921g = (ContentFrameLayout) findViewById(d.e.f6102b);
            this.f2922h = (ActionBarContainer) findViewById(d.e.f6103c);
            this.f2923i = k(findViewById(d.e.f6101a));
        }
    }

    public final void q() {
        l();
        this.f2916F.run();
    }

    public final boolean r(float f3) {
        this.f2913C.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.f2913C.getFinalY() > this.f2922h.getHeight();
    }

    public void setActionBarHideOffset(int i3) {
        l();
        this.f2922h.setTranslationY(-Math.max(0, Math.min(i3, this.f2922h.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        if (getWindowToken() != null) {
            throw null;
        }
    }

    public void setHasNonEmbeddedTabs(boolean z3) {
        this.f2927m = z3;
    }

    public void setHideOnContentScrollEnabled(boolean z3) {
        if (z3 != this.f2928n) {
            this.f2928n = z3;
            if (z3) {
                return;
            }
            l();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i3) {
        p();
        this.f2923i.setIcon(i3);
    }

    public void setLogo(int i3) {
        p();
        this.f2923i.a(i3);
    }

    public void setOverlayMode(boolean z3) {
        this.f2926l = z3;
        this.f2925k = z3 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z3) {
    }

    public void setUiOptions(int i3) {
    }

    public void setWindowCallback(Window.Callback callback) {
        p();
        this.f2923i.c(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        p();
        this.f2923i.b(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        p();
        this.f2923i.setIcon(drawable);
    }
}
