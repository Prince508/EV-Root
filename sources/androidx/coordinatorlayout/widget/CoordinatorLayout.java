package androidx.coordinatorlayout.widget;

import K.A;
import K.AbstractC0213s;
import K.B;
import K.C;
import K.C0205k0;
import K.InterfaceC0220z;
import K.O;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import w.AbstractC0759a;
import w.AbstractC0760b;
import x.AbstractC0765c;
import x.C0764b;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC0220z, A {

    /* renamed from: A, reason: collision with root package name */
    public static final ThreadLocal f3443A;

    /* renamed from: B, reason: collision with root package name */
    public static final Comparator f3444B;

    /* renamed from: C, reason: collision with root package name */
    public static final J.d f3445C;

    /* renamed from: y, reason: collision with root package name */
    public static final String f3446y;

    /* renamed from: z, reason: collision with root package name */
    public static final Class[] f3447z;

    /* renamed from: e, reason: collision with root package name */
    public final List f3448e;

    /* renamed from: f, reason: collision with root package name */
    public final C0764b f3449f;

    /* renamed from: g, reason: collision with root package name */
    public final List f3450g;

    /* renamed from: h, reason: collision with root package name */
    public final List f3451h;

    /* renamed from: i, reason: collision with root package name */
    public Paint f3452i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f3453j;

    /* renamed from: k, reason: collision with root package name */
    public final int[] f3454k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3455l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3456m;

    /* renamed from: n, reason: collision with root package name */
    public int[] f3457n;

    /* renamed from: o, reason: collision with root package name */
    public View f3458o;

    /* renamed from: p, reason: collision with root package name */
    public View f3459p;

    /* renamed from: q, reason: collision with root package name */
    public f f3460q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3461r;

    /* renamed from: s, reason: collision with root package name */
    public C0205k0 f3462s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f3463t;

    /* renamed from: u, reason: collision with root package name */
    public Drawable f3464u;

    /* renamed from: v, reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f3465v;

    /* renamed from: w, reason: collision with root package name */
    public C f3466w;

    /* renamed from: x, reason: collision with root package name */
    public final B f3467x;

    public class a implements C {
        public a() {
        }

        @Override // K.C
        public C0205k0 a(View view, C0205k0 c0205k0) {
            return CoordinatorLayout.this.U(c0205k0);
        }
    }

    public static abstract class b {
        public b() {
        }

        public boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i3, int i4) {
            if (i4 == 0) {
                return z(coordinatorLayout, view, view2, view3, i3);
            }
            return false;
        }

        public void B(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        public void C(CoordinatorLayout coordinatorLayout, View view, View view2, int i3) {
            if (i3 == 0) {
                B(coordinatorLayout, view, view2);
            }
        }

        public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, View view) {
            return d(coordinatorLayout, view) > 0.0f;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            return false;
        }

        public int c(CoordinatorLayout coordinatorLayout, View view) {
            return -16777216;
        }

        public float d(CoordinatorLayout coordinatorLayout, View view) {
            return 0.0f;
        }

        public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public void g(e eVar) {
        }

        public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public void i(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        public void j() {
        }

        public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        public boolean l(CoordinatorLayout coordinatorLayout, View view, int i3) {
            return false;
        }

        public boolean m(CoordinatorLayout coordinatorLayout, View view, int i3, int i4, int i5, int i6) {
            return false;
        }

        public boolean n(CoordinatorLayout coordinatorLayout, View view, View view2, float f3, float f4, boolean z3) {
            return false;
        }

        public boolean o(CoordinatorLayout coordinatorLayout, View view, View view2, float f3, float f4) {
            return false;
        }

        public void p(CoordinatorLayout coordinatorLayout, View view, View view2, int i3, int i4, int[] iArr) {
        }

        public void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i3, int i4, int[] iArr, int i5) {
            if (i5 == 0) {
                p(coordinatorLayout, view, view2, i3, i4, iArr);
            }
        }

        public void r(CoordinatorLayout coordinatorLayout, View view, View view2, int i3, int i4, int i5, int i6) {
        }

        public void s(CoordinatorLayout coordinatorLayout, View view, View view2, int i3, int i4, int i5, int i6, int i7) {
            if (i7 == 0) {
                r(coordinatorLayout, view, view2, i3, i4, i5, i6);
            }
        }

        public void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i3, int i4, int i5, int i6, int i7, int[] iArr) {
            iArr[0] = iArr[0] + i5;
            iArr[1] = iArr[1] + i6;
            s(coordinatorLayout, view, view2, i3, i4, i5, i6, i7);
        }

        public void u(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i3) {
        }

        public void v(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i3, int i4) {
            if (i4 == 0) {
                u(coordinatorLayout, view, view2, view3, i3);
            }
        }

        public boolean w(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z3) {
            return false;
        }

        public void x(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        }

        public Parcelable y(CoordinatorLayout coordinatorLayout, View view) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        public boolean z(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i3) {
            return false;
        }

        public b(Context context, AttributeSet attributeSet) {
        }

        public C0205k0 f(CoordinatorLayout coordinatorLayout, View view, C0205k0 c0205k0) {
            return c0205k0;
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface c {
        Class value();
    }

    public class d implements ViewGroup.OnHierarchyChangeListener {
        public d() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f3465v;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.F(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f3465v;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public class f implements ViewTreeObserver.OnPreDrawListener {
        public f() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.F(0);
            return true;
        }
    }

    public static class h implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            float I3 = O.I(view);
            float I4 = O.I(view2);
            if (I3 > I4) {
                return -1;
            }
            return I3 < I4 ? 1 : 0;
        }
    }

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        f3446y = r02 != null ? r02.getName() : null;
        f3444B = new h();
        f3447z = new Class[]{Context.class, AttributeSet.class};
        f3443A = new ThreadLocal();
        f3445C = new J.f(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0759a.f9891a);
    }

    public static b I(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = f3446y;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal threadLocal = f3443A;
            Map map = (Map) threadLocal.get();
            if (map == null) {
                map = new HashMap();
                threadLocal.set(map);
            }
            Constructor<?> constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f3447z);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (b) constructor.newInstance(context, attributeSet);
        } catch (Exception e3) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e3);
        }
    }

    public static void M(Rect rect) {
        rect.setEmpty();
        f3445C.a(rect);
    }

    public static int P(int i3) {
        if (i3 == 0) {
            return 17;
        }
        return i3;
    }

    public static int Q(int i3) {
        if ((i3 & 7) == 0) {
            i3 |= 8388611;
        }
        return (i3 & 112) == 0 ? i3 | 48 : i3;
    }

    public static int R(int i3) {
        if (i3 == 0) {
            return 8388661;
        }
        return i3;
    }

    public static Rect g() {
        Rect rect = (Rect) f3445C.b();
        return rect == null ? new Rect() : rect;
    }

    private static int i(int i3, int i4, int i5) {
        return i3 < i4 ? i4 : i3 > i5 ? i5 : i3;
    }

    public final void A(View view, int i3) {
        e eVar = (e) view.getLayoutParams();
        Rect g3 = g();
        g3.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        if (this.f3462s != null && O.t(this) && !O.t(view)) {
            g3.left += this.f3462s.i();
            g3.top += this.f3462s.k();
            g3.right -= this.f3462s.j();
            g3.bottom -= this.f3462s.h();
        }
        Rect g4 = g();
        AbstractC0213s.a(Q(eVar.f3472c), view.getMeasuredWidth(), view.getMeasuredHeight(), g3, g4, i3);
        view.layout(g4.left, g4.top, g4.right, g4.bottom);
        M(g3);
        M(g4);
    }

    public final void B(View view, View view2, int i3) {
        Rect g3 = g();
        Rect g4 = g();
        try {
            r(view2, g3);
            s(view, i3, g3, g4);
            view.layout(g4.left, g4.top, g4.right, g4.bottom);
        } finally {
            M(g3);
            M(g4);
        }
    }

    public final void C(View view, int i3, int i4) {
        e eVar = (e) view.getLayoutParams();
        int b3 = AbstractC0213s.b(R(eVar.f3472c), i4);
        int i5 = b3 & 7;
        int i6 = b3 & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i4 == 1) {
            i3 = width - i3;
        }
        int u3 = u(i3) - measuredWidth;
        if (i5 == 1) {
            u3 += measuredWidth / 2;
        } else if (i5 == 5) {
            u3 += measuredWidth;
        }
        int i7 = i6 != 16 ? i6 != 80 ? 0 : measuredHeight : measuredHeight / 2;
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin, Math.min(u3, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar).topMargin, Math.min(i7, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    public final void D(View view, Rect rect, int i3) {
        boolean z3;
        boolean z4;
        int width;
        int i4;
        int i5;
        int i6;
        int height;
        int i7;
        int i8;
        int i9;
        if (O.O(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            e eVar = (e) view.getLayoutParams();
            b e3 = eVar.e();
            Rect g3 = g();
            Rect g4 = g();
            g4.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (e3 == null || !e3.b(this, view, g3)) {
                g3.set(g4);
            } else if (!g4.contains(g3)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + g3.toShortString() + " | Bounds:" + g4.toShortString());
            }
            M(g4);
            if (g3.isEmpty()) {
                M(g3);
                return;
            }
            int b3 = AbstractC0213s.b(eVar.f3477h, i3);
            boolean z5 = true;
            if ((b3 & 48) != 48 || (i8 = (g3.top - ((ViewGroup.MarginLayoutParams) eVar).topMargin) - eVar.f3479j) >= (i9 = rect.top)) {
                z3 = false;
            } else {
                T(view, i9 - i8);
                z3 = true;
            }
            if ((b3 & 80) == 80 && (height = ((getHeight() - g3.bottom) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) + eVar.f3479j) < (i7 = rect.bottom)) {
                T(view, height - i7);
                z3 = true;
            }
            if (!z3) {
                T(view, 0);
            }
            if ((b3 & 3) != 3 || (i5 = (g3.left - ((ViewGroup.MarginLayoutParams) eVar).leftMargin) - eVar.f3478i) >= (i6 = rect.left)) {
                z4 = false;
            } else {
                S(view, i6 - i5);
                z4 = true;
            }
            if ((b3 & 5) != 5 || (width = ((getWidth() - g3.right) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin) + eVar.f3478i) >= (i4 = rect.right)) {
                z5 = z4;
            } else {
                S(view, width - i4);
            }
            if (!z5) {
                S(view, 0);
            }
            M(g3);
        }
    }

    public void E(View view, int i3) {
        b e3;
        e eVar = (e) view.getLayoutParams();
        if (eVar.f3480k != null) {
            Rect g3 = g();
            Rect g4 = g();
            Rect g5 = g();
            r(eVar.f3480k, g3);
            p(view, false, g4);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            t(view, i3, g3, g5, eVar, measuredWidth, measuredHeight);
            boolean z3 = (g5.left == g4.left && g5.top == g4.top) ? false : true;
            j(eVar, g5, measuredWidth, measuredHeight);
            int i4 = g5.left - g4.left;
            int i5 = g5.top - g4.top;
            if (i4 != 0) {
                O.T(view, i4);
            }
            if (i5 != 0) {
                O.U(view, i5);
            }
            if (z3 && (e3 = eVar.e()) != null) {
                e3.h(this, view, eVar.f3480k);
            }
            M(g3);
            M(g4);
            M(g5);
        }
    }

    public final void F(int i3) {
        boolean z3;
        int w3 = O.w(this);
        int size = this.f3448e.size();
        Rect g3 = g();
        Rect g4 = g();
        Rect g5 = g();
        for (int i4 = 0; i4 < size; i4++) {
            View view = (View) this.f3448e.get(i4);
            e eVar = (e) view.getLayoutParams();
            if (i3 != 0 || view.getVisibility() != 8) {
                for (int i5 = 0; i5 < i4; i5++) {
                    if (eVar.f3481l == ((View) this.f3448e.get(i5))) {
                        E(view, w3);
                    }
                }
                p(view, true, g4);
                if (eVar.f3476g != 0 && !g4.isEmpty()) {
                    int b3 = AbstractC0213s.b(eVar.f3476g, w3);
                    int i6 = b3 & 112;
                    if (i6 == 48) {
                        g3.top = Math.max(g3.top, g4.bottom);
                    } else if (i6 == 80) {
                        g3.bottom = Math.max(g3.bottom, getHeight() - g4.top);
                    }
                    int i7 = b3 & 7;
                    if (i7 == 3) {
                        g3.left = Math.max(g3.left, g4.right);
                    } else if (i7 == 5) {
                        g3.right = Math.max(g3.right, getWidth() - g4.left);
                    }
                }
                if (eVar.f3477h != 0 && view.getVisibility() == 0) {
                    D(view, g3, w3);
                }
                if (i3 != 2) {
                    v(view, g5);
                    if (!g5.equals(g4)) {
                        L(view, g4);
                    }
                }
                for (int i8 = i4 + 1; i8 < size; i8++) {
                    View view2 = (View) this.f3448e.get(i8);
                    e eVar2 = (e) view2.getLayoutParams();
                    b e3 = eVar2.e();
                    if (e3 != null && e3.e(this, view2, view)) {
                        if (i3 == 0 && eVar2.f()) {
                            eVar2.j();
                        } else {
                            if (i3 != 2) {
                                z3 = e3.h(this, view2, view);
                            } else {
                                e3.i(this, view2, view);
                                z3 = true;
                            }
                            if (i3 == 1) {
                                eVar2.o(z3);
                            }
                        }
                    }
                }
            }
        }
        M(g3);
        M(g4);
        M(g5);
    }

    public void G(View view, int i3) {
        e eVar = (e) view.getLayoutParams();
        if (eVar.a()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        View view2 = eVar.f3480k;
        if (view2 != null) {
            B(view, view2, i3);
            return;
        }
        int i4 = eVar.f3474e;
        if (i4 >= 0) {
            C(view, i4, i3);
        } else {
            A(view, i3);
        }
    }

    public void H(View view, int i3, int i4, int i5, int i6) {
        measureChildWithMargins(view, i3, i4, i5, i6);
    }

    public final boolean J(MotionEvent motionEvent, int i3) {
        int actionMasked = motionEvent.getActionMasked();
        List list = this.f3450g;
        x(list);
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z3 = false;
        boolean z4 = false;
        for (int i4 = 0; i4 < size; i4++) {
            View view = (View) list.get(i4);
            e eVar = (e) view.getLayoutParams();
            b e3 = eVar.e();
            if (!(z3 || z4) || actionMasked == 0) {
                if (!z3 && e3 != null) {
                    if (i3 == 0) {
                        z3 = e3.k(this, view, motionEvent);
                    } else if (i3 == 1) {
                        z3 = e3.D(this, view, motionEvent);
                    }
                    if (z3) {
                        this.f3458o = view;
                    }
                }
                boolean c3 = eVar.c();
                boolean h3 = eVar.h(this, view);
                z4 = h3 && !c3;
                if (h3 && !z4) {
                    break;
                }
            } else if (e3 != null) {
                if (motionEvent2 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i3 == 0) {
                    e3.k(this, view, motionEvent2);
                } else if (i3 == 1) {
                    e3.D(this, view, motionEvent2);
                }
            }
        }
        list.clear();
        return z3;
    }

    public final void K() {
        this.f3448e.clear();
        this.f3449f.c();
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            e w3 = w(childAt);
            w3.d(this, childAt);
            this.f3449f.b(childAt);
            for (int i4 = 0; i4 < childCount; i4++) {
                if (i4 != i3) {
                    View childAt2 = getChildAt(i4);
                    if (w3.b(this, childAt, childAt2)) {
                        if (!this.f3449f.d(childAt2)) {
                            this.f3449f.b(childAt2);
                        }
                        this.f3449f.a(childAt2, childAt);
                    }
                }
            }
        }
        this.f3448e.addAll(this.f3449f.h());
        Collections.reverse(this.f3448e);
    }

    public void L(View view, Rect rect) {
        ((e) view.getLayoutParams()).p(rect);
    }

    public void N() {
        if (this.f3456m && this.f3460q != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f3460q);
        }
        this.f3461r = false;
    }

    public final void O(boolean z3) {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            b e3 = ((e) childAt.getLayoutParams()).e();
            if (e3 != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z3) {
                    e3.k(this, childAt, obtain);
                } else {
                    e3.D(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            ((e) getChildAt(i4).getLayoutParams()).l();
        }
        this.f3458o = null;
        this.f3455l = false;
    }

    public final void S(View view, int i3) {
        e eVar = (e) view.getLayoutParams();
        int i4 = eVar.f3478i;
        if (i4 != i3) {
            O.T(view, i3 - i4);
            eVar.f3478i = i3;
        }
    }

    public final void T(View view, int i3) {
        e eVar = (e) view.getLayoutParams();
        int i4 = eVar.f3479j;
        if (i4 != i3) {
            O.U(view, i3 - i4);
            eVar.f3479j = i3;
        }
    }

    public final C0205k0 U(C0205k0 c0205k0) {
        if (J.c.a(this.f3462s, c0205k0)) {
            return c0205k0;
        }
        this.f3462s = c0205k0;
        boolean z3 = false;
        boolean z4 = c0205k0 != null && c0205k0.k() > 0;
        this.f3463t = z4;
        if (!z4 && getBackground() == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        C0205k0 k3 = k(c0205k0);
        requestLayout();
        return k3;
    }

    public final void V() {
        if (!O.t(this)) {
            O.v0(this, null);
            return;
        }
        if (this.f3466w == null) {
            this.f3466w = new a();
        }
        O.v0(this, this.f3466w);
        setSystemUiVisibility(1280);
    }

    @Override // K.InterfaceC0220z
    public void a(View view, View view2, int i3, int i4) {
        b e3;
        View view3;
        View view4;
        int i5;
        int i6;
        this.f3467x.c(view, view2, i3, i4);
        this.f3459p = view2;
        int childCount = getChildCount();
        int i7 = 0;
        while (i7 < childCount) {
            View childAt = getChildAt(i7);
            e eVar = (e) childAt.getLayoutParams();
            if (eVar.i(i4) && (e3 = eVar.e()) != null) {
                view3 = view;
                view4 = view2;
                i5 = i3;
                i6 = i4;
                e3.v(this, childAt, view3, view4, i5, i6);
            } else {
                view3 = view;
                view4 = view2;
                i5 = i3;
                i6 = i4;
            }
            i7++;
            view = view3;
            view2 = view4;
            i3 = i5;
            i4 = i6;
        }
    }

    @Override // K.InterfaceC0220z
    public void b(View view, int i3) {
        this.f3467x.d(view, i3);
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            e eVar = (e) childAt.getLayoutParams();
            if (eVar.i(i3)) {
                b e3 = eVar.e();
                if (e3 != null) {
                    e3.C(this, childAt, view, i3);
                }
                eVar.k(i3);
                eVar.j();
            }
        }
        this.f3459p = null;
    }

    @Override // K.InterfaceC0220z
    public void c(View view, int i3, int i4, int[] iArr, int i5) {
        b e3;
        int childCount = getChildCount();
        boolean z3 = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.i(i5) && (e3 = eVar.e()) != null) {
                    int[] iArr2 = this.f3453j;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    e3.q(this, childAt, view, i3, i4, iArr2, i5);
                    int[] iArr3 = this.f3453j;
                    i6 = i3 > 0 ? Math.max(i6, iArr3[0]) : Math.min(i6, iArr3[0]);
                    int[] iArr4 = this.f3453j;
                    i7 = i4 > 0 ? Math.max(i7, iArr4[1]) : Math.min(i7, iArr4[1]);
                    z3 = true;
                }
            }
        }
        iArr[0] = i6;
        iArr[1] = i7;
        if (z3) {
            F(1);
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof e) && super.checkLayoutParams(layoutParams);
    }

    @Override // K.A
    public void d(View view, int i3, int i4, int i5, int i6, int i7, int[] iArr) {
        b e3;
        int childCount = getChildCount();
        boolean z3 = false;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.i(i7) && (e3 = eVar.e()) != null) {
                    int[] iArr2 = this.f3453j;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    e3.t(this, childAt, view, i3, i4, i5, i6, i7, iArr2);
                    int[] iArr3 = this.f3453j;
                    i8 = i5 > 0 ? Math.max(i8, iArr3[0]) : Math.min(i8, iArr3[0]);
                    int[] iArr4 = this.f3453j;
                    i9 = i6 > 0 ? Math.max(i9, iArr4[1]) : Math.min(i9, iArr4[1]);
                    z3 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i8;
        iArr[1] = iArr[1] + i9;
        if (z3) {
            F(1);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j3) {
        e eVar = (e) view.getLayoutParams();
        b bVar = eVar.f3470a;
        if (bVar != null) {
            float d3 = bVar.d(this, view);
            if (d3 > 0.0f) {
                if (this.f3452i == null) {
                    this.f3452i = new Paint();
                }
                this.f3452i.setColor(eVar.f3470a.c(this, view));
                this.f3452i.setAlpha(i(Math.round(d3 * 255.0f), 0, 255));
                int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.f3452i);
                canvas.restoreToCount(save);
                return super.drawChild(canvas, view, j3);
            }
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f3464u;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // K.InterfaceC0220z
    public void e(View view, int i3, int i4, int i5, int i6, int i7) {
        d(view, i3, i4, i5, i6, 0, this.f3454k);
    }

    @Override // K.InterfaceC0220z
    public boolean f(View view, View view2, int i3, int i4) {
        int childCount = getChildCount();
        boolean z3 = false;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                b e3 = eVar.e();
                if (e3 != null) {
                    boolean A3 = e3.A(this, childAt, view, view2, i3, i4);
                    z3 |= A3;
                    eVar.q(i4, A3);
                } else {
                    eVar.q(i4, false);
                }
            }
        }
        return z3;
    }

    public final List<View> getDependencySortedChildren() {
        K();
        return Collections.unmodifiableList(this.f3448e);
    }

    public final C0205k0 getLastWindowInsets() {
        return this.f3462s;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f3467x.a();
    }

    public Drawable getStatusBarBackground() {
        return this.f3464u;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    public void h() {
        if (this.f3456m) {
            if (this.f3460q == null) {
                this.f3460q = new f();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f3460q);
        }
        this.f3461r = true;
    }

    public final void j(e eVar, Rect rect, int i3, int i4) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i3) - ((ViewGroup.MarginLayoutParams) eVar).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) eVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i4) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin));
        rect.set(max, max2, i3 + max, i4 + max2);
    }

    public final C0205k0 k(C0205k0 c0205k0) {
        b e3;
        if (c0205k0.n()) {
            return c0205k0;
        }
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (O.t(childAt) && (e3 = ((e) childAt.getLayoutParams()).e()) != null) {
                c0205k0 = e3.f(this, childAt, c0205k0);
                if (c0205k0.n()) {
                    return c0205k0;
                }
            }
        }
        return c0205k0;
    }

    public void l() {
        int childCount = getChildCount();
        boolean z3 = false;
        int i3 = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            if (y(getChildAt(i3))) {
                z3 = true;
                break;
            }
            i3++;
        }
        if (z3 != this.f3461r) {
            if (z3) {
                h();
            } else {
                N();
            }
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e ? new e((e) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        O(false);
        if (this.f3461r) {
            if (this.f3460q == null) {
                this.f3460q = new f();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f3460q);
        }
        if (this.f3462s == null && O.t(this)) {
            O.g0(this);
        }
        this.f3456m = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        O(false);
        if (this.f3461r && this.f3460q != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f3460q);
        }
        View view = this.f3459p;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f3456m = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f3463t || this.f3464u == null) {
            return;
        }
        C0205k0 c0205k0 = this.f3462s;
        int k3 = c0205k0 != null ? c0205k0.k() : 0;
        if (k3 > 0) {
            this.f3464u.setBounds(0, 0, getWidth(), k3);
            this.f3464u.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            O(true);
        }
        boolean J3 = J(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return J3;
        }
        O(true);
        return J3;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        b e3;
        int w3 = O.w(this);
        int size = this.f3448e.size();
        for (int i7 = 0; i7 < size; i7++) {
            View view = (View) this.f3448e.get(i7);
            if (view.getVisibility() != 8 && ((e3 = ((e) view.getLayoutParams()).e()) == null || !e3.l(this, view, w3))) {
                G(view, w3);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x012f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r27, int r28) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f3, float f4, boolean z3) {
        b e3;
        View view2;
        float f5;
        float f6;
        boolean z4;
        int childCount = getChildCount();
        int i3 = 0;
        boolean z5 = false;
        while (i3 < childCount) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.i(0) && (e3 = eVar.e()) != null) {
                    view2 = view;
                    f5 = f3;
                    f6 = f4;
                    z4 = z3;
                    z5 |= e3.n(this, childAt, view2, f5, f6, z4);
                    i3++;
                    view = view2;
                    f3 = f5;
                    f4 = f6;
                    z3 = z4;
                }
            }
            view2 = view;
            f5 = f3;
            f6 = f4;
            z4 = z3;
            i3++;
            view = view2;
            f3 = f5;
            f4 = f6;
            z3 = z4;
        }
        if (z5) {
            F(1);
        }
        return z5;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f3, float f4) {
        b e3;
        View view2;
        float f5;
        float f6;
        int childCount = getChildCount();
        int i3 = 0;
        boolean z3 = false;
        while (i3 < childCount) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.i(0) && (e3 = eVar.e()) != null) {
                    view2 = view;
                    f5 = f3;
                    f6 = f4;
                    z3 |= e3.o(this, childAt, view2, f5, f6);
                    i3++;
                    view = view2;
                    f3 = f5;
                    f4 = f6;
                }
            }
            view2 = view;
            f5 = f3;
            f6 = f4;
            i3++;
            view = view2;
            f3 = f5;
            f4 = f6;
        }
        return z3;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i3, int i4, int[] iArr) {
        c(view, i3, i4, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i3, int i4, int i5, int i6) {
        e(view, i3, i4, i5, i6, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i3) {
        a(view, view2, i3, 0);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.a());
        SparseArray sparseArray = gVar.f3489g;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            int id = childAt.getId();
            b e3 = w(childAt).e();
            if (id != -1 && e3 != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                e3.x(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable y3;
        g gVar = new g(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            int id = childAt.getId();
            b e3 = ((e) childAt.getLayoutParams()).e();
            if (id != -1 && e3 != null && (y3 = e3.y(this, childAt)) != null) {
                sparseArray.append(id, y3);
            }
        }
        gVar.f3489g = sparseArray;
        return gVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i3) {
        return f(view, view2, i3, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        b(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r3 != false) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r1.getActionMasked()
            android.view.View r3 = r0.f3458o
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L17
            boolean r3 = r0.J(r1, r4)
            if (r3 == 0) goto L15
            goto L18
        L15:
            r6 = r5
            goto L2c
        L17:
            r3 = r5
        L18:
            android.view.View r6 = r0.f3458o
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$e r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout.e) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$b r6 = r6.e()
            if (r6 == 0) goto L15
            android.view.View r7 = r0.f3458o
            boolean r6 = r6.D(r0, r7, r1)
        L2c:
            android.view.View r7 = r0.f3458o
            r8 = 0
            if (r7 != 0) goto L37
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L4a
        L37:
            if (r3 == 0) goto L4a
            long r9 = android.os.SystemClock.uptimeMillis()
            r15 = 0
            r16 = 0
            r13 = 3
            r14 = 0
            r11 = r9
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L4a:
            if (r8 == 0) goto L4f
            r8.recycle()
        L4f:
            if (r2 == r4) goto L56
            r1 = 3
            if (r2 != r1) goto L55
            goto L56
        L55:
            return r6
        L56:
            r0.O(r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void p(View view, boolean z3, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z3) {
            r(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public List q(View view) {
        List g3 = this.f3449f.g(view);
        this.f3451h.clear();
        if (g3 != null) {
            this.f3451h.addAll(g3);
        }
        return this.f3451h;
    }

    public void r(View view, Rect rect) {
        AbstractC0765c.a(this, view, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z3) {
        b e3 = ((e) view.getLayoutParams()).e();
        if (e3 == null || !e3.w(this, view, rect, z3)) {
            return super.requestChildRectangleOnScreen(view, rect, z3);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z3) {
        super.requestDisallowInterceptTouchEvent(z3);
        if (!z3 || this.f3455l) {
            return;
        }
        O(false);
        this.f3455l = true;
    }

    public void s(View view, int i3, Rect rect, Rect rect2) {
        e eVar = (e) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        t(view, i3, rect, rect2, eVar, measuredWidth, measuredHeight);
        j(eVar, rect2, measuredWidth, measuredHeight);
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z3) {
        super.setFitsSystemWindows(z3);
        V();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f3465v = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f3464u;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.f3464u = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.f3464u.setState(getDrawableState());
                }
                D.a.g(this.f3464u, O.w(this));
                this.f3464u.setVisible(getVisibility() == 0, false);
                this.f3464u.setCallback(this);
            }
            O.a0(this);
        }
    }

    public void setStatusBarBackgroundColor(int i3) {
        setStatusBarBackground(new ColorDrawable(i3));
    }

    public void setStatusBarBackgroundResource(int i3) {
        setStatusBarBackground(i3 != 0 ? A.a.d(getContext(), i3) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i3) {
        super.setVisibility(i3);
        boolean z3 = i3 == 0;
        Drawable drawable = this.f3464u;
        if (drawable == null || drawable.isVisible() == z3) {
            return;
        }
        this.f3464u.setVisible(z3, false);
    }

    public final void t(View view, int i3, Rect rect, Rect rect2, e eVar, int i4, int i5) {
        int b3 = AbstractC0213s.b(P(eVar.f3472c), i3);
        int b4 = AbstractC0213s.b(Q(eVar.f3473d), i3);
        int i6 = b3 & 7;
        int i7 = b3 & 112;
        int i8 = b4 & 7;
        int i9 = b4 & 112;
        int width = i8 != 1 ? i8 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int height = i9 != 16 ? i9 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i6 == 1) {
            width -= i4 / 2;
        } else if (i6 != 5) {
            width -= i4;
        }
        if (i7 == 16) {
            height -= i5 / 2;
        } else if (i7 != 80) {
            height -= i5;
        }
        rect2.set(width, height, i4 + width, i5 + height);
    }

    public final int u(int i3) {
        int[] iArr = this.f3457n;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i3);
            return 0;
        }
        if (i3 >= 0 && i3 < iArr.length) {
            return iArr[i3];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i3 + " out of range for " + this);
        return 0;
    }

    public void v(View view, Rect rect) {
        rect.set(((e) view.getLayoutParams()).g());
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f3464u;
    }

    public e w(View view) {
        e eVar = (e) view.getLayoutParams();
        if (!eVar.f3471b) {
            c cVar = null;
            for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                cVar = (c) cls.getAnnotation(c.class);
                if (cVar != null) {
                    break;
                }
            }
            if (cVar != null) {
                try {
                    eVar.n((b) cVar.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                } catch (Exception e3) {
                    Log.e("CoordinatorLayout", "Default behavior class " + cVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e3);
                }
            }
            eVar.f3471b = true;
        }
        return eVar;
    }

    public final void x(List list) {
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i3) : i3));
        }
        Comparator comparator = f3444B;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    public final boolean y(View view) {
        return this.f3449f.i(view);
    }

    public boolean z(View view, int i3, int i4) {
        Rect g3 = g();
        r(view, g3);
        try {
            return g3.contains(i3, i4);
        } finally {
            M(g3);
        }
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        CoordinatorLayout coordinatorLayout;
        Context context2;
        this.f3448e = new ArrayList();
        this.f3449f = new C0764b();
        this.f3450g = new ArrayList();
        this.f3451h = new ArrayList();
        this.f3453j = new int[2];
        this.f3454k = new int[2];
        this.f3467x = new B(this);
        TypedArray obtainStyledAttributes = i3 == 0 ? context.obtainStyledAttributes(attributeSet, w.c.f9894b, 0, AbstractC0760b.f9892a) : context.obtainStyledAttributes(attributeSet, w.c.f9894b, i3, 0);
        if (Build.VERSION.SDK_INT < 29) {
            coordinatorLayout = this;
            context2 = context;
        } else if (i3 == 0) {
            coordinatorLayout = this;
            context2 = context;
            coordinatorLayout.saveAttributeDataForStyleable(context2, w.c.f9894b, attributeSet, obtainStyledAttributes, 0, AbstractC0760b.f9892a);
        } else {
            context2 = context;
            coordinatorLayout = this;
            coordinatorLayout.saveAttributeDataForStyleable(context2, w.c.f9894b, attributeSet, obtainStyledAttributes, i3, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(w.c.f9895c, 0);
        if (resourceId != 0) {
            Resources resources = context2.getResources();
            coordinatorLayout.f3457n = resources.getIntArray(resourceId);
            float f3 = resources.getDisplayMetrics().density;
            int length = coordinatorLayout.f3457n.length;
            for (int i4 = 0; i4 < length; i4++) {
                coordinatorLayout.f3457n[i4] = (int) (r12[i4] * f3);
            }
        }
        coordinatorLayout.f3464u = obtainStyledAttributes.getDrawable(w.c.f9896d);
        obtainStyledAttributes.recycle();
        V();
        super.setOnHierarchyChangeListener(new d());
        if (O.u(this) == 0) {
            O.r0(this, 1);
        }
    }

    public static class g extends S.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: g, reason: collision with root package name */
        public SparseArray f3489g;

        public static class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public g[] newArray(int i3) {
                return new g[i3];
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.f3489g = new SparseArray(readInt);
            for (int i3 = 0; i3 < readInt; i3++) {
                this.f3489g.append(iArr[i3], readParcelableArray[i3]);
            }
        }

        @Override // S.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i3) {
            super.writeToParcel(parcel, i3);
            SparseArray sparseArray = this.f3489g;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i4 = 0; i4 < size; i4++) {
                iArr[i4] = this.f3489g.keyAt(i4);
                parcelableArr[i4] = (Parcelable) this.f3489g.valueAt(i4);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i3);
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static class e extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public b f3470a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f3471b;

        /* renamed from: c, reason: collision with root package name */
        public int f3472c;

        /* renamed from: d, reason: collision with root package name */
        public int f3473d;

        /* renamed from: e, reason: collision with root package name */
        public int f3474e;

        /* renamed from: f, reason: collision with root package name */
        public int f3475f;

        /* renamed from: g, reason: collision with root package name */
        public int f3476g;

        /* renamed from: h, reason: collision with root package name */
        public int f3477h;

        /* renamed from: i, reason: collision with root package name */
        public int f3478i;

        /* renamed from: j, reason: collision with root package name */
        public int f3479j;

        /* renamed from: k, reason: collision with root package name */
        public View f3480k;

        /* renamed from: l, reason: collision with root package name */
        public View f3481l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f3482m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f3483n;

        /* renamed from: o, reason: collision with root package name */
        public boolean f3484o;

        /* renamed from: p, reason: collision with root package name */
        public boolean f3485p;

        /* renamed from: q, reason: collision with root package name */
        public final Rect f3486q;

        /* renamed from: r, reason: collision with root package name */
        public Object f3487r;

        public e(int i3, int i4) {
            super(i3, i4);
            this.f3471b = false;
            this.f3472c = 0;
            this.f3473d = 0;
            this.f3474e = -1;
            this.f3475f = -1;
            this.f3476g = 0;
            this.f3477h = 0;
            this.f3486q = new Rect();
        }

        public boolean a() {
            return this.f3480k == null && this.f3475f != -1;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 == this.f3481l || r(view2, O.w(coordinatorLayout))) {
                return true;
            }
            b bVar = this.f3470a;
            return bVar != null && bVar.e(coordinatorLayout, view, view2);
        }

        public boolean c() {
            if (this.f3470a == null) {
                this.f3482m = false;
            }
            return this.f3482m;
        }

        public View d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f3475f == -1) {
                this.f3481l = null;
                this.f3480k = null;
                return null;
            }
            if (this.f3480k == null || !s(view, coordinatorLayout)) {
                m(view, coordinatorLayout);
            }
            return this.f3480k;
        }

        public b e() {
            return this.f3470a;
        }

        public boolean f() {
            return this.f3485p;
        }

        public Rect g() {
            return this.f3486q;
        }

        public boolean h(CoordinatorLayout coordinatorLayout, View view) {
            boolean z3 = this.f3482m;
            if (z3) {
                return true;
            }
            b bVar = this.f3470a;
            boolean a3 = (bVar != null ? bVar.a(coordinatorLayout, view) : false) | z3;
            this.f3482m = a3;
            return a3;
        }

        public boolean i(int i3) {
            if (i3 == 0) {
                return this.f3483n;
            }
            if (i3 != 1) {
                return false;
            }
            return this.f3484o;
        }

        public void j() {
            this.f3485p = false;
        }

        public void k(int i3) {
            q(i3, false);
        }

        public void l() {
            this.f3482m = false;
        }

        public final void m(View view, CoordinatorLayout coordinatorLayout) {
            View findViewById = coordinatorLayout.findViewById(this.f3475f);
            this.f3480k = findViewById;
            if (findViewById == null) {
                if (coordinatorLayout.isInEditMode()) {
                    this.f3481l = null;
                    this.f3480k = null;
                    return;
                }
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f3475f) + " to anchor view " + view);
            }
            if (findViewById == coordinatorLayout) {
                if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
                this.f3481l = null;
                this.f3480k = null;
                return;
            }
            for (ViewParent parent = findViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                if (parent == view) {
                    if (!coordinatorLayout.isInEditMode()) {
                        throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                    }
                    this.f3481l = null;
                    this.f3480k = null;
                    return;
                }
                if (parent instanceof View) {
                    findViewById = parent;
                }
            }
            this.f3481l = findViewById;
        }

        public void n(b bVar) {
            b bVar2 = this.f3470a;
            if (bVar2 != bVar) {
                if (bVar2 != null) {
                    bVar2.j();
                }
                this.f3470a = bVar;
                this.f3487r = null;
                this.f3471b = true;
                if (bVar != null) {
                    bVar.g(this);
                }
            }
        }

        public void o(boolean z3) {
            this.f3485p = z3;
        }

        public void p(Rect rect) {
            this.f3486q.set(rect);
        }

        public void q(int i3, boolean z3) {
            if (i3 == 0) {
                this.f3483n = z3;
            } else {
                if (i3 != 1) {
                    return;
                }
                this.f3484o = z3;
            }
        }

        public final boolean r(View view, int i3) {
            int b3 = AbstractC0213s.b(((e) view.getLayoutParams()).f3476g, i3);
            return b3 != 0 && (AbstractC0213s.b(this.f3477h, i3) & b3) == b3;
        }

        public final boolean s(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f3480k.getId() != this.f3475f) {
                return false;
            }
            View view2 = this.f3480k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f3481l = null;
                    this.f3480k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
            this.f3481l = view2;
            return true;
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3471b = false;
            this.f3472c = 0;
            this.f3473d = 0;
            this.f3474e = -1;
            this.f3475f = -1;
            this.f3476g = 0;
            this.f3477h = 0;
            this.f3486q = new Rect();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w.c.f9897e);
            this.f3472c = obtainStyledAttributes.getInteger(w.c.f9898f, 0);
            this.f3475f = obtainStyledAttributes.getResourceId(w.c.f9899g, -1);
            this.f3473d = obtainStyledAttributes.getInteger(w.c.f9900h, 0);
            this.f3474e = obtainStyledAttributes.getInteger(w.c.f9904l, -1);
            this.f3476g = obtainStyledAttributes.getInt(w.c.f9903k, 0);
            this.f3477h = obtainStyledAttributes.getInt(w.c.f9902j, 0);
            int i3 = w.c.f9901i;
            boolean hasValue = obtainStyledAttributes.hasValue(i3);
            this.f3471b = hasValue;
            if (hasValue) {
                this.f3470a = CoordinatorLayout.I(context, attributeSet, obtainStyledAttributes.getString(i3));
            }
            obtainStyledAttributes.recycle();
            b bVar = this.f3470a;
            if (bVar != null) {
                bVar.g(this);
            }
        }

        public e(e eVar) {
            super((ViewGroup.MarginLayoutParams) eVar);
            this.f3471b = false;
            this.f3472c = 0;
            this.f3473d = 0;
            this.f3474e = -1;
            this.f3475f = -1;
            this.f3476g = 0;
            this.f3477h = 0;
            this.f3486q = new Rect();
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f3471b = false;
            this.f3472c = 0;
            this.f3473d = 0;
            this.f3474e = -1;
            this.f3475f = -1;
            this.f3476g = 0;
            this.f3477h = 0;
            this.f3486q = new Rect();
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3471b = false;
            this.f3472c = 0;
            this.f3473d = 0;
            this.f3474e = -1;
            this.f3475f = -1;
            this.f3476g = 0;
            this.f3477h = 0;
            this.f3486q = new Rect();
        }
    }
}
