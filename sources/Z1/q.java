package z1;

import K.O;
import L.c;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import e1.AbstractC0464a;
import f1.AbstractC0474a;

/* loaded from: classes.dex */
public class q extends s {

    /* renamed from: s, reason: collision with root package name */
    public static final boolean f10332s = true;

    /* renamed from: e, reason: collision with root package name */
    public final int f10333e;

    /* renamed from: f, reason: collision with root package name */
    public final int f10334f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f10335g;

    /* renamed from: h, reason: collision with root package name */
    public AutoCompleteTextView f10336h;

    /* renamed from: i, reason: collision with root package name */
    public final View.OnClickListener f10337i;

    /* renamed from: j, reason: collision with root package name */
    public final View.OnFocusChangeListener f10338j;

    /* renamed from: k, reason: collision with root package name */
    public final c.a f10339k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f10340l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f10341m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f10342n;

    /* renamed from: o, reason: collision with root package name */
    public long f10343o;

    /* renamed from: p, reason: collision with root package name */
    public AccessibilityManager f10344p;

    /* renamed from: q, reason: collision with root package name */
    public ValueAnimator f10345q;

    /* renamed from: r, reason: collision with root package name */
    public ValueAnimator f10346r;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            q.this.r();
            q.this.f10346r.start();
        }
    }

    public q(com.google.android.material.textfield.a aVar) {
        super(aVar);
        this.f10337i = new View.OnClickListener() { // from class: z1.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                q.this.J();
            }
        };
        this.f10338j = new View.OnFocusChangeListener() { // from class: z1.n
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z3) {
                q.y(q.this, view, z3);
            }
        };
        this.f10339k = new c.a() { // from class: z1.o
            @Override // L.c.a
            public final void onTouchExplorationStateChanged(boolean z3) {
                q.w(q.this, z3);
            }
        };
        this.f10343o = Long.MAX_VALUE;
        Context context = aVar.getContext();
        int i3 = AbstractC0464a.f6805w;
        this.f10334f = t1.d.f(context, i3, 67);
        this.f10333e = t1.d.f(aVar.getContext(), i3, 50);
        this.f10335g = t1.d.g(aVar.getContext(), AbstractC0464a.f6776A, AbstractC0474a.f7194a);
    }

    public static /* synthetic */ void A(q qVar) {
        qVar.K();
        qVar.H(false);
    }

    public static AutoCompleteTextView D(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    private void F() {
        this.f10346r = E(this.f10334f, 0.0f, 1.0f);
        ValueAnimator E3 = E(this.f10333e, 1.0f, 0.0f);
        this.f10345q = E3;
        E3.addListener(new a());
    }

    public static /* synthetic */ void v(q qVar) {
        boolean isPopupShowing = qVar.f10336h.isPopupShowing();
        qVar.H(isPopupShowing);
        qVar.f10341m = isPopupShowing;
    }

    public static /* synthetic */ void w(q qVar, boolean z3) {
        AutoCompleteTextView autoCompleteTextView = qVar.f10336h;
        if (autoCompleteTextView == null || r.a(autoCompleteTextView)) {
            return;
        }
        O.r0(qVar.f10351d, z3 ? 2 : 1);
    }

    public static /* synthetic */ void x(q qVar, ValueAnimator valueAnimator) {
        qVar.getClass();
        qVar.f10351d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static /* synthetic */ void y(q qVar, View view, boolean z3) {
        qVar.f10340l = z3;
        qVar.r();
        if (z3) {
            return;
        }
        qVar.H(false);
        qVar.f10341m = false;
    }

    public static /* synthetic */ boolean z(q qVar, View view, MotionEvent motionEvent) {
        qVar.getClass();
        if (motionEvent.getAction() == 1) {
            if (qVar.G()) {
                qVar.f10341m = false;
            }
            qVar.J();
            qVar.K();
        }
        return false;
    }

    public final ValueAnimator E(int i3, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.f10335g);
        ofFloat.setDuration(i3);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: z1.j
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                q.x(q.this, valueAnimator);
            }
        });
        return ofFloat;
    }

    public final boolean G() {
        long currentTimeMillis = System.currentTimeMillis() - this.f10343o;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }

    public final void H(boolean z3) {
        if (this.f10342n != z3) {
            this.f10342n = z3;
            this.f10346r.cancel();
            this.f10345q.start();
        }
    }

    public final void I() {
        this.f10336h.setOnTouchListener(new View.OnTouchListener() { // from class: z1.k
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return q.z(q.this, view, motionEvent);
            }
        });
        if (f10332s) {
            this.f10336h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: z1.l
                @Override // android.widget.AutoCompleteTextView.OnDismissListener
                public final void onDismiss() {
                    q.A(q.this);
                }
            });
        }
        this.f10336h.setThreshold(0);
    }

    public final void J() {
        if (this.f10336h == null) {
            return;
        }
        if (G()) {
            this.f10341m = false;
        }
        if (this.f10341m) {
            this.f10341m = false;
            return;
        }
        if (f10332s) {
            H(!this.f10342n);
        } else {
            this.f10342n = !this.f10342n;
            r();
        }
        if (!this.f10342n) {
            this.f10336h.dismissDropDown();
        } else {
            this.f10336h.requestFocus();
            this.f10336h.showDropDown();
        }
    }

    public final void K() {
        this.f10341m = true;
        this.f10343o = System.currentTimeMillis();
    }

    @Override // z1.s
    public void a(Editable editable) {
        if (this.f10344p.isTouchExplorationEnabled() && r.a(this.f10336h) && !this.f10351d.hasFocus()) {
            this.f10336h.dismissDropDown();
        }
        this.f10336h.post(new Runnable() { // from class: z1.p
            @Override // java.lang.Runnable
            public final void run() {
                q.v(q.this);
            }
        });
    }

    @Override // z1.s
    public int c() {
        return e1.h.f6935g;
    }

    @Override // z1.s
    public int d() {
        return f10332s ? e1.d.f6868d : e1.d.f6869e;
    }

    @Override // z1.s
    public View.OnFocusChangeListener e() {
        return this.f10338j;
    }

    @Override // z1.s
    public View.OnClickListener f() {
        return this.f10337i;
    }

    @Override // z1.s
    public c.a h() {
        return this.f10339k;
    }

    @Override // z1.s
    public boolean i(int i3) {
        return i3 != 0;
    }

    @Override // z1.s
    public boolean j() {
        return true;
    }

    @Override // z1.s
    public boolean k() {
        return this.f10340l;
    }

    @Override // z1.s
    public boolean l() {
        return true;
    }

    @Override // z1.s
    public boolean m() {
        return this.f10342n;
    }

    @Override // z1.s
    public void n(EditText editText) {
        this.f10336h = D(editText);
        I();
        this.f10348a.setErrorIconDrawable((Drawable) null);
        if (!r.a(editText) && this.f10344p.isTouchExplorationEnabled()) {
            O.r0(this.f10351d, 2);
        }
        this.f10348a.setEndIconVisible(true);
    }

    @Override // z1.s
    public void o(View view, L.x xVar) {
        if (!r.a(this.f10336h)) {
            xVar.j0(Spinner.class.getName());
        }
        if (xVar.U()) {
            xVar.t0(null);
        }
    }

    @Override // z1.s
    public void p(View view, AccessibilityEvent accessibilityEvent) {
        if (!this.f10344p.isEnabled() || r.a(this.f10336h)) {
            return;
        }
        boolean z3 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f10342n && !this.f10336h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z3) {
            J();
            K();
        }
    }

    @Override // z1.s
    public void s() {
        F();
        this.f10344p = (AccessibilityManager) this.f10350c.getSystemService("accessibility");
    }

    @Override // z1.s
    public boolean t() {
        return true;
    }

    @Override // z1.s
    public void u() {
        AutoCompleteTextView autoCompleteTextView = this.f10336h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            if (f10332s) {
                this.f10336h.setOnDismissListener(null);
            }
        }
    }
}
