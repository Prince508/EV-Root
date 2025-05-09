package z1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import e1.AbstractC0464a;
import f1.AbstractC0474a;

/* renamed from: z1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0800f extends s {

    /* renamed from: e, reason: collision with root package name */
    public final int f10312e;

    /* renamed from: f, reason: collision with root package name */
    public final int f10313f;

    /* renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f10314g;

    /* renamed from: h, reason: collision with root package name */
    public final TimeInterpolator f10315h;

    /* renamed from: i, reason: collision with root package name */
    public EditText f10316i;

    /* renamed from: j, reason: collision with root package name */
    public final View.OnClickListener f10317j;

    /* renamed from: k, reason: collision with root package name */
    public final View.OnFocusChangeListener f10318k;

    /* renamed from: l, reason: collision with root package name */
    public AnimatorSet f10319l;

    /* renamed from: m, reason: collision with root package name */
    public ValueAnimator f10320m;

    /* renamed from: z1.f$a */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C0800f.this.f10349b.a0(true);
        }
    }

    /* renamed from: z1.f$b */
    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            C0800f.this.f10349b.a0(false);
        }
    }

    public C0800f(com.google.android.material.textfield.a aVar) {
        super(aVar);
        this.f10317j = new View.OnClickListener() { // from class: z1.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0800f.v(C0800f.this, view);
            }
        };
        this.f10318k = new View.OnFocusChangeListener() { // from class: z1.b
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z3) {
                r0.A(C0800f.this.E());
            }
        };
        Context context = aVar.getContext();
        int i3 = AbstractC0464a.f6805w;
        this.f10312e = t1.d.f(context, i3, 100);
        this.f10313f = t1.d.f(aVar.getContext(), i3, 150);
        this.f10314g = t1.d.g(aVar.getContext(), AbstractC0464a.f6776A, AbstractC0474a.f7194a);
        this.f10315h = t1.d.g(aVar.getContext(), AbstractC0464a.f6808z, AbstractC0474a.f7197d);
    }

    public static /* synthetic */ void v(C0800f c0800f, View view) {
        EditText editText = c0800f.f10316i;
        if (editText == null) {
            return;
        }
        Editable text = editText.getText();
        if (text != null) {
            text.clear();
        }
        c0800f.r();
    }

    public static /* synthetic */ void x(C0800f c0800f, ValueAnimator valueAnimator) {
        c0800f.getClass();
        c0800f.f10351d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static /* synthetic */ void y(C0800f c0800f, ValueAnimator valueAnimator) {
        c0800f.getClass();
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        c0800f.f10351d.setScaleX(floatValue);
        c0800f.f10351d.setScaleY(floatValue);
    }

    public final void A(boolean z3) {
        boolean z4 = this.f10349b.F() == z3;
        if (z3 && !this.f10319l.isRunning()) {
            this.f10320m.cancel();
            this.f10319l.start();
            if (z4) {
                this.f10319l.end();
                return;
            }
            return;
        }
        if (z3) {
            return;
        }
        this.f10319l.cancel();
        this.f10320m.start();
        if (z4) {
            this.f10320m.end();
        }
    }

    public final ValueAnimator B(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(this.f10314g);
        ofFloat.setDuration(this.f10312e);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: z1.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C0800f.x(C0800f.this, valueAnimator);
            }
        });
        return ofFloat;
    }

    public final ValueAnimator C() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.f10315h);
        ofFloat.setDuration(this.f10313f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: z1.e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C0800f.y(C0800f.this, valueAnimator);
            }
        });
        return ofFloat;
    }

    public final void D() {
        ValueAnimator C3 = C();
        ValueAnimator B3 = B(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f10319l = animatorSet;
        animatorSet.playTogether(C3, B3);
        this.f10319l.addListener(new a());
        ValueAnimator B4 = B(1.0f, 0.0f);
        this.f10320m = B4;
        B4.addListener(new b());
    }

    public final boolean E() {
        EditText editText = this.f10316i;
        if (editText != null) {
            return (editText.hasFocus() || this.f10351d.hasFocus()) && this.f10316i.getText().length() > 0;
        }
        return false;
    }

    @Override // z1.s
    public void a(Editable editable) {
        if (this.f10349b.w() != null) {
            return;
        }
        A(E());
    }

    @Override // z1.s
    public int c() {
        return e1.h.f6933e;
    }

    @Override // z1.s
    public int d() {
        return e1.d.f6870f;
    }

    @Override // z1.s
    public View.OnFocusChangeListener e() {
        return this.f10318k;
    }

    @Override // z1.s
    public View.OnClickListener f() {
        return this.f10317j;
    }

    @Override // z1.s
    public View.OnFocusChangeListener g() {
        return this.f10318k;
    }

    @Override // z1.s
    public void n(EditText editText) {
        this.f10316i = editText;
        this.f10348a.setEndIconVisible(E());
    }

    @Override // z1.s
    public void q(boolean z3) {
        if (this.f10349b.w() == null) {
            return;
        }
        A(z3);
    }

    @Override // z1.s
    public void s() {
        D();
    }

    @Override // z1.s
    public void u() {
        EditText editText = this.f10316i;
        if (editText != null) {
            editText.post(new Runnable() { // from class: z1.d
                @Override // java.lang.Runnable
                public final void run() {
                    C0800f.this.A(true);
                }
            });
        }
    }
}
