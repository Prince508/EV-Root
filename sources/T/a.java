package T;

import K.C0184a;
import K.O;
import L.x;
import L.y;
import L.z;
import T.b;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.util.ArrayList;
import java.util.List;
import o.h;

/* loaded from: classes.dex */
public abstract class a extends C0184a {

    /* renamed from: n, reason: collision with root package name */
    public static final Rect f1985n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o, reason: collision with root package name */
    public static final b.a f1986o = new C0051a();

    /* renamed from: p, reason: collision with root package name */
    public static final b.InterfaceC0052b f1987p = new b();

    /* renamed from: h, reason: collision with root package name */
    public final AccessibilityManager f1992h;

    /* renamed from: i, reason: collision with root package name */
    public final View f1993i;

    /* renamed from: j, reason: collision with root package name */
    public c f1994j;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f1988d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    public final Rect f1989e = new Rect();

    /* renamed from: f, reason: collision with root package name */
    public final Rect f1990f = new Rect();

    /* renamed from: g, reason: collision with root package name */
    public final int[] f1991g = new int[2];

    /* renamed from: k, reason: collision with root package name */
    public int f1995k = Integer.MIN_VALUE;

    /* renamed from: l, reason: collision with root package name */
    public int f1996l = Integer.MIN_VALUE;

    /* renamed from: m, reason: collision with root package name */
    public int f1997m = Integer.MIN_VALUE;

    /* renamed from: T.a$a, reason: collision with other inner class name */
    public class C0051a implements b.a {
        @Override // T.b.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(x xVar, Rect rect) {
            xVar.l(rect);
        }
    }

    public class b implements b.InterfaceC0052b {
        @Override // T.b.InterfaceC0052b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public x b(h hVar, int i3) {
            return (x) hVar.m(i3);
        }

        @Override // T.b.InterfaceC0052b
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public int a(h hVar) {
            return hVar.l();
        }
    }

    public class c extends y {
        public c() {
        }

        @Override // L.y
        public x b(int i3) {
            return x.Y(a.this.H(i3));
        }

        @Override // L.y
        public x d(int i3) {
            int i4 = i3 == 2 ? a.this.f1995k : a.this.f1996l;
            if (i4 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i4);
        }

        @Override // L.y
        public boolean f(int i3, int i4, Bundle bundle) {
            return a.this.P(i3, i4, bundle);
        }
    }

    public a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f1993i = view;
        this.f1992h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (O.u(view) == 0) {
            O.r0(view, 1);
        }
    }

    public static Rect D(View view, int i3, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i3 == 17) {
            rect.set(width, 0, width, height);
            return rect;
        }
        if (i3 == 33) {
            rect.set(0, height, width, height);
            return rect;
        }
        if (i3 == 66) {
            rect.set(-1, 0, -1, height);
            return rect;
        }
        if (i3 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        rect.set(0, -1, width, -1);
        return rect;
    }

    public static int F(int i3) {
        if (i3 == 19) {
            return 33;
        }
        if (i3 != 21) {
            return i3 != 22 ? 130 : 66;
        }
        return 17;
    }

    public final int A() {
        return this.f1996l;
    }

    public abstract int B(float f3, float f4);

    public abstract void C(List list);

    public final boolean E(Rect rect) {
        if (rect == null || rect.isEmpty() || this.f1993i.getWindowVisibility() != 0) {
            return false;
        }
        Object parent = this.f1993i.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        return parent != null;
    }

    public final boolean G(int i3, Rect rect) {
        x xVar;
        h y3 = y();
        int i4 = this.f1996l;
        x xVar2 = i4 == Integer.MIN_VALUE ? null : (x) y3.f(i4);
        if (i3 == 1 || i3 == 2) {
            xVar = (x) T.b.d(y3, f1987p, f1986o, xVar2, i3, O.w(this.f1993i) == 1, false);
        } else {
            if (i3 != 17 && i3 != 33 && i3 != 66 && i3 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i5 = this.f1996l;
            if (i5 != Integer.MIN_VALUE) {
                z(i5, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                D(this.f1993i, i3, rect2);
            }
            xVar = (x) T.b.c(y3, f1987p, f1986o, xVar2, rect2, i3);
        }
        return T(xVar != null ? y3.j(y3.i(xVar)) : Integer.MIN_VALUE);
    }

    public x H(int i3) {
        return i3 == -1 ? u() : t(i3);
    }

    public final void I(boolean z3, int i3, Rect rect) {
        int i4 = this.f1996l;
        if (i4 != Integer.MIN_VALUE) {
            o(i4);
        }
        if (z3) {
            G(i3, rect);
        }
    }

    public abstract boolean J(int i3, int i4, Bundle bundle);

    public abstract void M(x xVar);

    public abstract void N(int i3, x xVar);

    public abstract void O(int i3, boolean z3);

    public boolean P(int i3, int i4, Bundle bundle) {
        return i3 != -1 ? Q(i3, i4, bundle) : R(i4, bundle);
    }

    public final boolean Q(int i3, int i4, Bundle bundle) {
        return i4 != 1 ? i4 != 2 ? i4 != 64 ? i4 != 128 ? J(i3, i4, bundle) : n(i3) : S(i3) : o(i3) : T(i3);
    }

    public final boolean R(int i3, Bundle bundle) {
        return O.Y(this.f1993i, i3, bundle);
    }

    public final boolean S(int i3) {
        int i4;
        if (!this.f1992h.isEnabled() || !this.f1992h.isTouchExplorationEnabled() || (i4 = this.f1995k) == i3) {
            return false;
        }
        if (i4 != Integer.MIN_VALUE) {
            n(i4);
        }
        this.f1995k = i3;
        this.f1993i.invalidate();
        U(i3, 32768);
        return true;
    }

    public final boolean T(int i3) {
        int i4;
        if ((!this.f1993i.isFocused() && !this.f1993i.requestFocus()) || (i4 = this.f1996l) == i3) {
            return false;
        }
        if (i4 != Integer.MIN_VALUE) {
            o(i4);
        }
        if (i3 == Integer.MIN_VALUE) {
            return false;
        }
        this.f1996l = i3;
        O(i3, true);
        U(i3, 8);
        return true;
    }

    public final boolean U(int i3, int i4) {
        ViewParent parent;
        if (i3 == Integer.MIN_VALUE || !this.f1992h.isEnabled() || (parent = this.f1993i.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.f1993i, q(i3, i4));
    }

    public final void V(int i3) {
        int i4 = this.f1997m;
        if (i4 == i3) {
            return;
        }
        this.f1997m = i3;
        U(i3, 128);
        U(i4, 256);
    }

    @Override // K.C0184a
    public y b(View view) {
        if (this.f1994j == null) {
            this.f1994j = new c();
        }
        return this.f1994j;
    }

    @Override // K.C0184a
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        K(accessibilityEvent);
    }

    @Override // K.C0184a
    public void g(View view, x xVar) {
        super.g(view, xVar);
        M(xVar);
    }

    public final boolean n(int i3) {
        if (this.f1995k != i3) {
            return false;
        }
        this.f1995k = Integer.MIN_VALUE;
        this.f1993i.invalidate();
        U(i3, 65536);
        return true;
    }

    public final boolean o(int i3) {
        if (this.f1996l != i3) {
            return false;
        }
        this.f1996l = Integer.MIN_VALUE;
        O(i3, false);
        U(i3, 8);
        return true;
    }

    public final boolean p() {
        int i3 = this.f1996l;
        return i3 != Integer.MIN_VALUE && J(i3, 16, null);
    }

    public final AccessibilityEvent q(int i3, int i4) {
        return i3 != -1 ? r(i3, i4) : s(i4);
    }

    public final AccessibilityEvent r(int i3, int i4) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i4);
        x H3 = H(i3);
        obtain.getText().add(H3.A());
        obtain.setContentDescription(H3.s());
        obtain.setScrollable(H3.S());
        obtain.setPassword(H3.R());
        obtain.setEnabled(H3.L());
        obtain.setChecked(H3.I());
        L(i3, obtain);
        if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        obtain.setClassName(H3.p());
        z.c(obtain, this.f1993i, i3);
        obtain.setPackageName(this.f1993i.getContext().getPackageName());
        return obtain;
    }

    public final AccessibilityEvent s(int i3) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i3);
        this.f1993i.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    public final x t(int i3) {
        x X2 = x.X();
        X2.o0(true);
        X2.q0(true);
        X2.j0("android.view.View");
        Rect rect = f1985n;
        X2.f0(rect);
        X2.g0(rect);
        X2.y0(this.f1993i);
        N(i3, X2);
        if (X2.A() == null && X2.s() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        X2.l(this.f1989e);
        if (this.f1989e.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int j3 = X2.j();
        if ((j3 & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((j3 & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        X2.w0(this.f1993i.getContext().getPackageName());
        X2.D0(this.f1993i, i3);
        if (this.f1995k == i3) {
            X2.d0(true);
            X2.a(128);
        } else {
            X2.d0(false);
            X2.a(64);
        }
        boolean z3 = this.f1996l == i3;
        if (z3) {
            X2.a(2);
        } else if (X2.M()) {
            X2.a(1);
        }
        X2.r0(z3);
        this.f1993i.getLocationOnScreen(this.f1991g);
        X2.m(this.f1988d);
        if (this.f1988d.equals(rect)) {
            X2.l(this.f1988d);
            if (X2.f1252b != -1) {
                x X3 = x.X();
                for (int i4 = X2.f1252b; i4 != -1; i4 = X3.f1252b) {
                    X3.z0(this.f1993i, -1);
                    X3.f0(f1985n);
                    N(i4, X3);
                    X3.l(this.f1989e);
                    Rect rect2 = this.f1988d;
                    Rect rect3 = this.f1989e;
                    rect2.offset(rect3.left, rect3.top);
                }
                X3.b0();
            }
            this.f1988d.offset(this.f1991g[0] - this.f1993i.getScrollX(), this.f1991g[1] - this.f1993i.getScrollY());
        }
        if (this.f1993i.getLocalVisibleRect(this.f1990f)) {
            this.f1990f.offset(this.f1991g[0] - this.f1993i.getScrollX(), this.f1991g[1] - this.f1993i.getScrollY());
            if (this.f1988d.intersect(this.f1990f)) {
                X2.g0(this.f1988d);
                if (E(this.f1988d)) {
                    X2.H0(true);
                }
            }
        }
        return X2;
    }

    public final x u() {
        x Z2 = x.Z(this.f1993i);
        O.W(this.f1993i, Z2);
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        if (Z2.o() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            Z2.c(this.f1993i, ((Integer) arrayList.get(i3)).intValue());
        }
        return Z2;
    }

    public final boolean v(MotionEvent motionEvent) {
        if (this.f1992h.isEnabled() && this.f1992h.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action != 7 && action != 9) {
                if (action != 10 || this.f1997m == Integer.MIN_VALUE) {
                    return false;
                }
                V(Integer.MIN_VALUE);
                return true;
            }
            int B3 = B(motionEvent.getX(), motionEvent.getY());
            V(B3);
            if (B3 != Integer.MIN_VALUE) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final boolean w(KeyEvent keyEvent) {
        int i3 = 0;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                int F3 = F(keyCode);
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z3 = false;
                                while (i3 < repeatCount && G(F3, null)) {
                                    i3++;
                                    z3 = true;
                                }
                                return z3;
                            }
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    p();
                    return true;
                }
            } else {
                if (keyEvent.hasNoModifiers()) {
                    return G(2, null);
                }
                if (keyEvent.hasModifiers(1)) {
                    return G(1, null);
                }
            }
        }
        return false;
    }

    public final int x() {
        return this.f1995k;
    }

    public final h y() {
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        h hVar = new h();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            hVar.k(((Integer) arrayList.get(i3)).intValue(), t(((Integer) arrayList.get(i3)).intValue()));
        }
        return hVar;
    }

    public final void z(int i3, Rect rect) {
        H(i3).l(rect);
    }

    public void K(AccessibilityEvent accessibilityEvent) {
    }

    public void L(int i3, AccessibilityEvent accessibilityEvent) {
    }
}
