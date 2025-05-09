package androidx.recyclerview.widget;

import K.O;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class d extends RecyclerView.n implements RecyclerView.r {

    /* renamed from: D, reason: collision with root package name */
    public static final int[] f4538D = {R.attr.state_pressed};

    /* renamed from: E, reason: collision with root package name */
    public static final int[] f4539E = new int[0];

    /* renamed from: A, reason: collision with root package name */
    public int f4540A;

    /* renamed from: B, reason: collision with root package name */
    public final Runnable f4541B;

    /* renamed from: C, reason: collision with root package name */
    public final RecyclerView.s f4542C;

    /* renamed from: a, reason: collision with root package name */
    public final int f4543a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4544b;

    /* renamed from: c, reason: collision with root package name */
    public final StateListDrawable f4545c;

    /* renamed from: d, reason: collision with root package name */
    public final Drawable f4546d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4547e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4548f;

    /* renamed from: g, reason: collision with root package name */
    public final StateListDrawable f4549g;

    /* renamed from: h, reason: collision with root package name */
    public final Drawable f4550h;

    /* renamed from: i, reason: collision with root package name */
    public final int f4551i;

    /* renamed from: j, reason: collision with root package name */
    public final int f4552j;

    /* renamed from: k, reason: collision with root package name */
    public int f4553k;

    /* renamed from: l, reason: collision with root package name */
    public int f4554l;

    /* renamed from: m, reason: collision with root package name */
    public float f4555m;

    /* renamed from: n, reason: collision with root package name */
    public int f4556n;

    /* renamed from: o, reason: collision with root package name */
    public int f4557o;

    /* renamed from: p, reason: collision with root package name */
    public float f4558p;

    /* renamed from: s, reason: collision with root package name */
    public RecyclerView f4561s;

    /* renamed from: z, reason: collision with root package name */
    public final ValueAnimator f4568z;

    /* renamed from: q, reason: collision with root package name */
    public int f4559q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f4560r = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f4562t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f4563u = false;

    /* renamed from: v, reason: collision with root package name */
    public int f4564v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f4565w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f4566x = new int[2];

    /* renamed from: y, reason: collision with root package name */
    public final int[] f4567y = new int[2];

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.q(500);
        }
    }

    public class b extends RecyclerView.s {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void b(RecyclerView recyclerView, int i3, int i4) {
            d.this.B(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
        }
    }

    public class c extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public boolean f4571a = false;

        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f4571a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f4571a) {
                this.f4571a = false;
                return;
            }
            if (((Float) d.this.f4568z.getAnimatedValue()).floatValue() == 0.0f) {
                d dVar = d.this;
                dVar.f4540A = 0;
                dVar.y(0);
            } else {
                d dVar2 = d.this;
                dVar2.f4540A = 2;
                dVar2.v();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$d, reason: collision with other inner class name */
    public class C0099d implements ValueAnimator.AnimatorUpdateListener {
        public C0099d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
            d.this.f4545c.setAlpha(floatValue);
            d.this.f4546d.setAlpha(floatValue);
            d.this.v();
        }
    }

    public d(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i3, int i4, int i5) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f4568z = ofFloat;
        this.f4540A = 0;
        this.f4541B = new a();
        this.f4542C = new b();
        this.f4545c = stateListDrawable;
        this.f4546d = drawable;
        this.f4549g = stateListDrawable2;
        this.f4550h = drawable2;
        this.f4547e = Math.max(i3, stateListDrawable.getIntrinsicWidth());
        this.f4548f = Math.max(i3, drawable.getIntrinsicWidth());
        this.f4551i = Math.max(i3, stateListDrawable2.getIntrinsicWidth());
        this.f4552j = Math.max(i3, drawable2.getIntrinsicWidth());
        this.f4543a = i4;
        this.f4544b = i5;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new c());
        ofFloat.addUpdateListener(new C0099d());
        j(recyclerView);
    }

    public void A() {
        int i3 = this.f4540A;
        if (i3 != 0) {
            if (i3 != 3) {
                return;
            } else {
                this.f4568z.cancel();
            }
        }
        this.f4540A = 1;
        ValueAnimator valueAnimator = this.f4568z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.f4568z.setDuration(500L);
        this.f4568z.setStartDelay(0L);
        this.f4568z.start();
    }

    public void B(int i3, int i4) {
        int computeVerticalScrollRange = this.f4561s.computeVerticalScrollRange();
        int i5 = this.f4560r;
        this.f4562t = computeVerticalScrollRange - i5 > 0 && i5 >= this.f4543a;
        int computeHorizontalScrollRange = this.f4561s.computeHorizontalScrollRange();
        int i6 = this.f4559q;
        boolean z3 = computeHorizontalScrollRange - i6 > 0 && i6 >= this.f4543a;
        this.f4563u = z3;
        boolean z4 = this.f4562t;
        if (!z4 && !z3) {
            if (this.f4564v != 0) {
                y(0);
                return;
            }
            return;
        }
        if (z4) {
            float f3 = i5;
            this.f4554l = (int) ((f3 * (i4 + (f3 / 2.0f))) / computeVerticalScrollRange);
            this.f4553k = Math.min(i5, (i5 * i5) / computeVerticalScrollRange);
        }
        if (this.f4563u) {
            float f4 = i6;
            this.f4557o = (int) ((f4 * (i3 + (f4 / 2.0f))) / computeHorizontalScrollRange);
            this.f4556n = Math.min(i6, (i6 * i6) / computeHorizontalScrollRange);
        }
        int i7 = this.f4564v;
        if (i7 == 0 || i7 == 1) {
            y(1);
        }
    }

    public final void C(float f3) {
        int[] p3 = p();
        float max = Math.max(p3[0], Math.min(p3[1], f3));
        if (Math.abs(this.f4554l - max) < 2.0f) {
            return;
        }
        int x3 = x(this.f4555m, max, p3, this.f4561s.computeVerticalScrollRange(), this.f4561s.computeVerticalScrollOffset(), this.f4560r);
        if (x3 != 0) {
            this.f4561s.scrollBy(0, x3);
        }
        this.f4555m = max;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public boolean a(RecyclerView recyclerView, MotionEvent motionEvent) {
        int i3 = this.f4564v;
        if (i3 != 1) {
            return i3 == 2;
        }
        boolean u3 = u(motionEvent.getX(), motionEvent.getY());
        boolean t3 = t(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0 || (!u3 && !t3)) {
            return false;
        }
        if (t3) {
            this.f4565w = 1;
            this.f4558p = (int) motionEvent.getX();
        } else if (u3) {
            this.f4565w = 2;
            this.f4555m = (int) motionEvent.getY();
        }
        y(2);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public void b(RecyclerView recyclerView, MotionEvent motionEvent) {
        if (this.f4564v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean u3 = u(motionEvent.getX(), motionEvent.getY());
            boolean t3 = t(motionEvent.getX(), motionEvent.getY());
            if (u3 || t3) {
                if (t3) {
                    this.f4565w = 1;
                    this.f4558p = (int) motionEvent.getX();
                } else if (u3) {
                    this.f4565w = 2;
                    this.f4555m = (int) motionEvent.getY();
                }
                y(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f4564v == 2) {
            this.f4555m = 0.0f;
            this.f4558p = 0.0f;
            y(1);
            this.f4565w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f4564v == 2) {
            A();
            if (this.f4565w == 1) {
                r(motionEvent.getX());
            }
            if (this.f4565w == 2) {
                C(motionEvent.getY());
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.r
    public void c(boolean z3) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
        if (this.f4559q != this.f4561s.getWidth() || this.f4560r != this.f4561s.getHeight()) {
            this.f4559q = this.f4561s.getWidth();
            this.f4560r = this.f4561s.getHeight();
            y(0);
        } else if (this.f4540A != 0) {
            if (this.f4562t) {
                n(canvas);
            }
            if (this.f4563u) {
                m(canvas);
            }
        }
    }

    public void j(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f4561s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            l();
        }
        this.f4561s = recyclerView;
        if (recyclerView != null) {
            z();
        }
    }

    public final void k() {
        this.f4561s.removeCallbacks(this.f4541B);
    }

    public final void l() {
        this.f4561s.U0(this);
        this.f4561s.V0(this);
        this.f4561s.W0(this.f4542C);
        k();
    }

    public final void m(Canvas canvas) {
        int i3 = this.f4560r;
        int i4 = this.f4551i;
        int i5 = this.f4557o;
        int i6 = this.f4556n;
        this.f4549g.setBounds(0, 0, i6, i4);
        this.f4550h.setBounds(0, 0, this.f4559q, this.f4552j);
        canvas.translate(0.0f, i3 - i4);
        this.f4550h.draw(canvas);
        canvas.translate(i5 - (i6 / 2), 0.0f);
        this.f4549g.draw(canvas);
        canvas.translate(-r2, -r0);
    }

    public final void n(Canvas canvas) {
        int i3 = this.f4559q;
        int i4 = this.f4547e;
        int i5 = i3 - i4;
        int i6 = this.f4554l;
        int i7 = this.f4553k;
        int i8 = i6 - (i7 / 2);
        this.f4545c.setBounds(0, 0, i4, i7);
        this.f4546d.setBounds(0, 0, this.f4548f, this.f4560r);
        if (!s()) {
            canvas.translate(i5, 0.0f);
            this.f4546d.draw(canvas);
            canvas.translate(0.0f, i8);
            this.f4545c.draw(canvas);
            canvas.translate(-i5, -i8);
            return;
        }
        this.f4546d.draw(canvas);
        canvas.translate(this.f4547e, i8);
        canvas.scale(-1.0f, 1.0f);
        this.f4545c.draw(canvas);
        canvas.scale(1.0f, 1.0f);
        canvas.translate(-this.f4547e, -i8);
    }

    public final int[] o() {
        int[] iArr = this.f4567y;
        int i3 = this.f4544b;
        iArr[0] = i3;
        iArr[1] = this.f4559q - i3;
        return iArr;
    }

    public final int[] p() {
        int[] iArr = this.f4566x;
        int i3 = this.f4544b;
        iArr[0] = i3;
        iArr[1] = this.f4560r - i3;
        return iArr;
    }

    public void q(int i3) {
        int i4 = this.f4540A;
        if (i4 == 1) {
            this.f4568z.cancel();
        } else if (i4 != 2) {
            return;
        }
        this.f4540A = 3;
        ValueAnimator valueAnimator = this.f4568z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
        this.f4568z.setDuration(i3);
        this.f4568z.start();
    }

    public final void r(float f3) {
        int[] o3 = o();
        float max = Math.max(o3[0], Math.min(o3[1], f3));
        if (Math.abs(this.f4557o - max) < 2.0f) {
            return;
        }
        int x3 = x(this.f4558p, max, o3, this.f4561s.computeHorizontalScrollRange(), this.f4561s.computeHorizontalScrollOffset(), this.f4559q);
        if (x3 != 0) {
            this.f4561s.scrollBy(x3, 0);
        }
        this.f4558p = max;
    }

    public final boolean s() {
        return O.w(this.f4561s) == 1;
    }

    public boolean t(float f3, float f4) {
        if (f4 < this.f4560r - this.f4551i) {
            return false;
        }
        int i3 = this.f4557o;
        int i4 = this.f4556n;
        return f3 >= ((float) (i3 - (i4 / 2))) && f3 <= ((float) (i3 + (i4 / 2)));
    }

    public boolean u(float f3, float f4) {
        if (s()) {
            if (f3 > this.f4547e / 2) {
                return false;
            }
        } else if (f3 < this.f4559q - this.f4547e) {
            return false;
        }
        int i3 = this.f4554l;
        int i4 = this.f4553k;
        return f4 >= ((float) (i3 - (i4 / 2))) && f4 <= ((float) (i3 + (i4 / 2)));
    }

    public void v() {
        this.f4561s.invalidate();
    }

    public final void w(int i3) {
        k();
        this.f4561s.postDelayed(this.f4541B, i3);
    }

    public final int x(float f3, float f4, int[] iArr, int i3, int i4, int i5) {
        int i6 = iArr[1] - iArr[0];
        if (i6 == 0) {
            return 0;
        }
        int i7 = i3 - i5;
        int i8 = (int) (((f4 - f3) / i6) * i7);
        int i9 = i4 + i8;
        if (i9 >= i7 || i9 < 0) {
            return 0;
        }
        return i8;
    }

    public void y(int i3) {
        if (i3 == 2 && this.f4564v != 2) {
            this.f4545c.setState(f4538D);
            k();
        }
        if (i3 == 0) {
            v();
        } else {
            A();
        }
        if (this.f4564v == 2 && i3 != 2) {
            this.f4545c.setState(f4539E);
            w(1200);
        } else if (i3 == 1) {
            w(1500);
        }
        this.f4564v = i3;
    }

    public final void z() {
        this.f4561s.g(this);
        this.f4561s.i(this);
        this.f4561s.j(this.f4542C);
    }
}
