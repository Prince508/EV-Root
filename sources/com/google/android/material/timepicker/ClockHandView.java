package com.google.android.material.timepicker;

import K.O;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import e1.AbstractC0464a;
import e1.i;
import e1.j;
import f1.AbstractC0474a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import r1.n;
import s1.AbstractC0721a;

/* loaded from: classes.dex */
class ClockHandView extends View {

    /* renamed from: e, reason: collision with root package name */
    public final int f5660e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f5661f;

    /* renamed from: g, reason: collision with root package name */
    public final ValueAnimator f5662g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5663h;

    /* renamed from: i, reason: collision with root package name */
    public float f5664i;

    /* renamed from: j, reason: collision with root package name */
    public float f5665j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f5666k;

    /* renamed from: l, reason: collision with root package name */
    public final int f5667l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f5668m;

    /* renamed from: n, reason: collision with root package name */
    public final List f5669n;

    /* renamed from: o, reason: collision with root package name */
    public final int f5670o;

    /* renamed from: p, reason: collision with root package name */
    public final float f5671p;

    /* renamed from: q, reason: collision with root package name */
    public final Paint f5672q;

    /* renamed from: r, reason: collision with root package name */
    public final RectF f5673r;

    /* renamed from: s, reason: collision with root package name */
    public final int f5674s;

    /* renamed from: t, reason: collision with root package name */
    public float f5675t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f5676u;

    /* renamed from: v, reason: collision with root package name */
    public double f5677v;

    /* renamed from: w, reason: collision with root package name */
    public int f5678w;

    /* renamed from: x, reason: collision with root package name */
    public int f5679x;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            animator.end();
        }
    }

    public interface b {
        void a(float f3, boolean z3);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0464a.f6799q);
    }

    public static /* synthetic */ void a(ClockHandView clockHandView, ValueAnimator valueAnimator) {
        clockHandView.getClass();
        clockHandView.o(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
    }

    public void b(b bVar) {
        this.f5669n.add(bVar);
    }

    public final void c(float f3, float f4) {
        this.f5679x = AbstractC0721a.a((float) (getWidth() / 2), (float) (getHeight() / 2), f3, f4) > ((float) h(2)) + n.c(getContext(), 12) ? 1 : 2;
    }

    public final void d(Canvas canvas) {
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f3 = width;
        float h3 = h(this.f5679x);
        float cos = (((float) Math.cos(this.f5677v)) * h3) + f3;
        float f4 = height;
        float sin = (h3 * ((float) Math.sin(this.f5677v))) + f4;
        this.f5672q.setStrokeWidth(0.0f);
        canvas.drawCircle(cos, sin, this.f5670o, this.f5672q);
        double sin2 = Math.sin(this.f5677v);
        double cos2 = Math.cos(this.f5677v);
        this.f5672q.setStrokeWidth(this.f5674s);
        canvas.drawLine(f3, f4, width + ((int) (cos2 * r2)), height + ((int) (r2 * sin2)), this.f5672q);
        canvas.drawCircle(f3, f4, this.f5671p, this.f5672q);
    }

    public RectF e() {
        return this.f5673r;
    }

    public final int f(float f3, float f4) {
        int degrees = (int) Math.toDegrees(Math.atan2(f4 - (getHeight() / 2), f3 - (getWidth() / 2)));
        int i3 = degrees + 90;
        return i3 < 0 ? degrees + 450 : i3;
    }

    public float g() {
        return this.f5675t;
    }

    public final int h(int i3) {
        return i3 == 2 ? Math.round(this.f5678w * 0.66f) : this.f5678w;
    }

    public int i() {
        return this.f5670o;
    }

    public final Pair j(float f3) {
        float g3 = g();
        if (Math.abs(g3 - f3) > 180.0f) {
            if (g3 > 180.0f && f3 < 180.0f) {
                f3 += 360.0f;
            }
            if (g3 < 180.0f && f3 > 180.0f) {
                g3 += 360.0f;
            }
        }
        return new Pair(Float.valueOf(g3), Float.valueOf(f3));
    }

    public final boolean k(float f3, float f4, boolean z3, boolean z4, boolean z5) {
        float f5 = f(f3, f4);
        boolean z6 = false;
        boolean z7 = g() != f5;
        if (z4 && z7) {
            return true;
        }
        if (!z7 && !z3) {
            return false;
        }
        if (z5 && this.f5663h) {
            z6 = true;
        }
        n(f5, z6);
        return true;
    }

    public void l(int i3) {
        this.f5678w = i3;
        invalidate();
    }

    public void m(float f3) {
        n(f3, false);
    }

    public void n(float f3, boolean z3) {
        ValueAnimator valueAnimator = this.f5662g;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z3) {
            o(f3, false);
            return;
        }
        Pair j3 = j(f3);
        this.f5662g.setFloatValues(((Float) j3.first).floatValue(), ((Float) j3.second).floatValue());
        this.f5662g.setDuration(this.f5660e);
        this.f5662g.setInterpolator(this.f5661f);
        this.f5662g.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.timepicker.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ClockHandView.a(ClockHandView.this, valueAnimator2);
            }
        });
        this.f5662g.addListener(new a());
        this.f5662g.start();
    }

    public final void o(float f3, boolean z3) {
        float f4 = f3 % 360.0f;
        this.f5675t = f4;
        this.f5677v = Math.toRadians(f4 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float h3 = h(this.f5679x);
        float cos = width + (((float) Math.cos(this.f5677v)) * h3);
        float sin = height + (h3 * ((float) Math.sin(this.f5677v)));
        RectF rectF = this.f5673r;
        int i3 = this.f5670o;
        rectF.set(cos - i3, sin - i3, cos + i3, sin + i3);
        Iterator it = this.f5669n.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(f4, z3);
        }
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        d(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        super.onLayout(z3, i3, i4, i5, i6);
        if (this.f5662g.isRunning()) {
            return;
        }
        m(g());
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z3;
        boolean z4;
        boolean z5;
        int actionMasked = motionEvent.getActionMasked();
        float x3 = motionEvent.getX();
        float y3 = motionEvent.getY();
        if (actionMasked == 0) {
            this.f5664i = x3;
            this.f5665j = y3;
            this.f5666k = true;
            this.f5676u = false;
            z3 = true;
            z4 = false;
            z5 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            int i3 = (int) (x3 - this.f5664i);
            int i4 = (int) (y3 - this.f5665j);
            this.f5666k = (i3 * i3) + (i4 * i4) > this.f5667l;
            z4 = this.f5676u;
            boolean z6 = actionMasked == 1;
            if (this.f5668m) {
                c(x3, y3);
            }
            z5 = z6;
            z3 = false;
        } else {
            z4 = false;
            z3 = false;
            z5 = false;
        }
        this.f5676u |= k(x3, y3, z4, z3, z5);
        return true;
    }

    public void p(boolean z3) {
        if (this.f5668m && !z3) {
            this.f5679x = 1;
        }
        this.f5668m = z3;
        invalidate();
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        this.f5662g = new ValueAnimator();
        this.f5669n = new ArrayList();
        Paint paint = new Paint();
        this.f5672q = paint;
        this.f5673r = new RectF();
        this.f5679x = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f7046V0, i3, i.f6959k);
        this.f5660e = t1.d.f(context, AbstractC0464a.f6801s, 200);
        this.f5661f = t1.d.g(context, AbstractC0464a.f6808z, AbstractC0474a.f7195b);
        this.f5678w = obtainStyledAttributes.getDimensionPixelSize(j.f7052X0, 0);
        this.f5670o = obtainStyledAttributes.getDimensionPixelSize(j.f7055Y0, 0);
        this.f5674s = getResources().getDimensionPixelSize(e1.c.f6856r);
        this.f5671p = r7.getDimensionPixelSize(e1.c.f6854p);
        int color = obtainStyledAttributes.getColor(j.f7049W0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        m(0.0f);
        this.f5667l = ViewConfiguration.get(context).getScaledTouchSlop();
        O.r0(this, 2);
        obtainStyledAttributes.recycle();
    }
}
