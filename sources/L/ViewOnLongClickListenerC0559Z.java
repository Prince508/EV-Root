package l;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;

/* renamed from: l.Z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class ViewOnLongClickListenerC0559Z implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: o, reason: collision with root package name */
    public static ViewOnLongClickListenerC0559Z f8302o;

    /* renamed from: p, reason: collision with root package name */
    public static ViewOnLongClickListenerC0559Z f8303p;

    /* renamed from: e, reason: collision with root package name */
    public final View f8304e;

    /* renamed from: f, reason: collision with root package name */
    public final CharSequence f8305f;

    /* renamed from: g, reason: collision with root package name */
    public final int f8306g;

    /* renamed from: h, reason: collision with root package name */
    public final Runnable f8307h = new Runnable() { // from class: l.X
        @Override // java.lang.Runnable
        public final void run() {
            ViewOnLongClickListenerC0559Z.this.h(false);
        }
    };

    /* renamed from: i, reason: collision with root package name */
    public final Runnable f8308i = new Runnable() { // from class: l.Y
        @Override // java.lang.Runnable
        public final void run() {
            ViewOnLongClickListenerC0559Z.this.d();
        }
    };

    /* renamed from: j, reason: collision with root package name */
    public int f8309j;

    /* renamed from: k, reason: collision with root package name */
    public int f8310k;

    /* renamed from: l, reason: collision with root package name */
    public a0 f8311l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f8312m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f8313n;

    public ViewOnLongClickListenerC0559Z(View view, CharSequence charSequence) {
        this.f8304e = view;
        this.f8305f = charSequence;
        this.f8306g = K.T.g(ViewConfiguration.get(view.getContext()));
        c();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void f(ViewOnLongClickListenerC0559Z viewOnLongClickListenerC0559Z) {
        ViewOnLongClickListenerC0559Z viewOnLongClickListenerC0559Z2 = f8302o;
        if (viewOnLongClickListenerC0559Z2 != null) {
            viewOnLongClickListenerC0559Z2.b();
        }
        f8302o = viewOnLongClickListenerC0559Z;
        if (viewOnLongClickListenerC0559Z != null) {
            viewOnLongClickListenerC0559Z.e();
        }
    }

    public static void g(View view, CharSequence charSequence) {
        ViewOnLongClickListenerC0559Z viewOnLongClickListenerC0559Z = f8302o;
        if (viewOnLongClickListenerC0559Z != null && viewOnLongClickListenerC0559Z.f8304e == view) {
            f(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new ViewOnLongClickListenerC0559Z(view, charSequence);
            return;
        }
        ViewOnLongClickListenerC0559Z viewOnLongClickListenerC0559Z2 = f8303p;
        if (viewOnLongClickListenerC0559Z2 != null && viewOnLongClickListenerC0559Z2.f8304e == view) {
            viewOnLongClickListenerC0559Z2.d();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public final void b() {
        this.f8304e.removeCallbacks(this.f8307h);
    }

    public final void c() {
        this.f8313n = true;
    }

    public void d() {
        if (f8303p == this) {
            f8303p = null;
            a0 a0Var = this.f8311l;
            if (a0Var != null) {
                a0Var.c();
                this.f8311l = null;
                c();
                this.f8304e.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f8302o == this) {
            f(null);
        }
        this.f8304e.removeCallbacks(this.f8308i);
    }

    public final void e() {
        this.f8304e.postDelayed(this.f8307h, ViewConfiguration.getLongPressTimeout());
    }

    public void h(boolean z3) {
        long longPressTimeout;
        long j3;
        long j4;
        if (K.O.N(this.f8304e)) {
            f(null);
            ViewOnLongClickListenerC0559Z viewOnLongClickListenerC0559Z = f8303p;
            if (viewOnLongClickListenerC0559Z != null) {
                viewOnLongClickListenerC0559Z.d();
            }
            f8303p = this;
            this.f8312m = z3;
            a0 a0Var = new a0(this.f8304e.getContext());
            this.f8311l = a0Var;
            a0Var.e(this.f8304e, this.f8309j, this.f8310k, this.f8312m, this.f8305f);
            this.f8304e.addOnAttachStateChangeListener(this);
            if (this.f8312m) {
                j4 = 2500;
            } else {
                if ((K.O.H(this.f8304e) & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j3 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j3 = 15000;
                }
                j4 = j3 - longPressTimeout;
            }
            this.f8304e.removeCallbacks(this.f8308i);
            this.f8304e.postDelayed(this.f8308i, j4);
        }
    }

    public final boolean i(MotionEvent motionEvent) {
        int x3 = (int) motionEvent.getX();
        int y3 = (int) motionEvent.getY();
        if (!this.f8313n && Math.abs(x3 - this.f8309j) <= this.f8306g && Math.abs(y3 - this.f8310k) <= this.f8306g) {
            return false;
        }
        this.f8309j = x3;
        this.f8310k = y3;
        this.f8313n = false;
        return true;
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f8311l != null && this.f8312m) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f8304e.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                c();
                d();
            }
        } else if (this.f8304e.isEnabled() && this.f8311l == null && i(motionEvent)) {
            f(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f8309j = view.getWidth() / 2;
        this.f8310k = view.getHeight() / 2;
        h(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        d();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }
}
