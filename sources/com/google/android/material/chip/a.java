package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import e1.j;
import f.AbstractC0467a;
import f1.c;
import j1.AbstractC0518a;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import m1.AbstractC0597a;
import o1.AbstractC0648d;
import r1.i;
import r1.k;
import r1.n;
import u1.AbstractC0740c;
import u1.C0741d;
import v1.AbstractC0758b;
import x1.g;

/* loaded from: classes.dex */
public class a extends g implements Drawable.Callback, i.b {

    /* renamed from: N0, reason: collision with root package name */
    public static final int[] f5226N0 = {R.attr.state_enabled};

    /* renamed from: O0, reason: collision with root package name */
    public static final ShapeDrawable f5227O0 = new ShapeDrawable(new OvalShape());

    /* renamed from: A0, reason: collision with root package name */
    public int f5228A0;

    /* renamed from: B0, reason: collision with root package name */
    public ColorFilter f5229B0;

    /* renamed from: C0, reason: collision with root package name */
    public PorterDuffColorFilter f5230C0;

    /* renamed from: D, reason: collision with root package name */
    public ColorStateList f5231D;

    /* renamed from: D0, reason: collision with root package name */
    public ColorStateList f5232D0;

    /* renamed from: E, reason: collision with root package name */
    public ColorStateList f5233E;

    /* renamed from: E0, reason: collision with root package name */
    public PorterDuff.Mode f5234E0;

    /* renamed from: F, reason: collision with root package name */
    public float f5235F;

    /* renamed from: F0, reason: collision with root package name */
    public int[] f5236F0;

    /* renamed from: G, reason: collision with root package name */
    public float f5237G;

    /* renamed from: G0, reason: collision with root package name */
    public boolean f5238G0;

    /* renamed from: H, reason: collision with root package name */
    public ColorStateList f5239H;

    /* renamed from: H0, reason: collision with root package name */
    public ColorStateList f5240H0;

    /* renamed from: I, reason: collision with root package name */
    public float f5241I;

    /* renamed from: I0, reason: collision with root package name */
    public WeakReference f5242I0;

    /* renamed from: J, reason: collision with root package name */
    public ColorStateList f5243J;

    /* renamed from: J0, reason: collision with root package name */
    public TextUtils.TruncateAt f5244J0;

    /* renamed from: K, reason: collision with root package name */
    public CharSequence f5245K;

    /* renamed from: K0, reason: collision with root package name */
    public boolean f5246K0;

    /* renamed from: L, reason: collision with root package name */
    public boolean f5247L;

    /* renamed from: L0, reason: collision with root package name */
    public int f5248L0;

    /* renamed from: M, reason: collision with root package name */
    public Drawable f5249M;

    /* renamed from: M0, reason: collision with root package name */
    public boolean f5250M0;

    /* renamed from: N, reason: collision with root package name */
    public ColorStateList f5251N;

    /* renamed from: O, reason: collision with root package name */
    public float f5252O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f5253P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f5254Q;

    /* renamed from: R, reason: collision with root package name */
    public Drawable f5255R;

    /* renamed from: S, reason: collision with root package name */
    public Drawable f5256S;

    /* renamed from: T, reason: collision with root package name */
    public ColorStateList f5257T;

    /* renamed from: U, reason: collision with root package name */
    public float f5258U;

    /* renamed from: V, reason: collision with root package name */
    public CharSequence f5259V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f5260W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f5261X;

    /* renamed from: Y, reason: collision with root package name */
    public Drawable f5262Y;

    /* renamed from: Z, reason: collision with root package name */
    public ColorStateList f5263Z;

    /* renamed from: a0, reason: collision with root package name */
    public c f5264a0;

    /* renamed from: b0, reason: collision with root package name */
    public c f5265b0;

    /* renamed from: c0, reason: collision with root package name */
    public float f5266c0;

    /* renamed from: d0, reason: collision with root package name */
    public float f5267d0;

    /* renamed from: e0, reason: collision with root package name */
    public float f5268e0;

    /* renamed from: f0, reason: collision with root package name */
    public float f5269f0;

    /* renamed from: g0, reason: collision with root package name */
    public float f5270g0;

    /* renamed from: h0, reason: collision with root package name */
    public float f5271h0;

    /* renamed from: i0, reason: collision with root package name */
    public float f5272i0;

    /* renamed from: j0, reason: collision with root package name */
    public float f5273j0;

    /* renamed from: k0, reason: collision with root package name */
    public final Context f5274k0;

    /* renamed from: l0, reason: collision with root package name */
    public final Paint f5275l0;

    /* renamed from: m0, reason: collision with root package name */
    public final Paint f5276m0;

    /* renamed from: n0, reason: collision with root package name */
    public final Paint.FontMetrics f5277n0;

    /* renamed from: o0, reason: collision with root package name */
    public final RectF f5278o0;

    /* renamed from: p0, reason: collision with root package name */
    public final PointF f5279p0;

    /* renamed from: q0, reason: collision with root package name */
    public final Path f5280q0;

    /* renamed from: r0, reason: collision with root package name */
    public final i f5281r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f5282s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f5283t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f5284u0;

    /* renamed from: v0, reason: collision with root package name */
    public int f5285v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f5286w0;

    /* renamed from: x0, reason: collision with root package name */
    public int f5287x0;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f5288y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f5289z0;

    /* renamed from: com.google.android.material.chip.a$a, reason: collision with other inner class name */
    public interface InterfaceC0107a {
        void a();
    }

    public a(Context context, AttributeSet attributeSet, int i3, int i4) {
        super(context, attributeSet, i3, i4);
        this.f5237G = -1.0f;
        this.f5275l0 = new Paint(1);
        this.f5277n0 = new Paint.FontMetrics();
        this.f5278o0 = new RectF();
        this.f5279p0 = new PointF();
        this.f5280q0 = new Path();
        this.f5228A0 = 255;
        this.f5234E0 = PorterDuff.Mode.SRC_IN;
        this.f5242I0 = new WeakReference(null);
        J(context);
        this.f5274k0 = context;
        i iVar = new i(this);
        this.f5281r0 = iVar;
        this.f5245K = "";
        iVar.f().density = context.getResources().getDisplayMetrics().density;
        this.f5276m0 = null;
        int[] iArr = f5226N0;
        setState(iArr);
        f2(iArr);
        this.f5246K0 = true;
        if (AbstractC0758b.f9878a) {
            f5227O0.setTint(-1);
        }
    }

    public static boolean h1(int[] iArr, int i3) {
        if (iArr == null) {
            return false;
        }
        for (int i4 : iArr) {
            if (i4 == i3) {
                return true;
            }
        }
        return false;
    }

    public static boolean l1(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean m1(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public static boolean n1(C0741d c0741d) {
        return (c0741d == null || c0741d.i() == null || !c0741d.i().isStateful()) ? false : true;
    }

    public static a p0(Context context, AttributeSet attributeSet, int i3, int i4) {
        a aVar = new a(context, attributeSet, i3, i4);
        aVar.o1(attributeSet, i3, i4);
        return aVar;
    }

    public ColorStateList A0() {
        return this.f5263Z;
    }

    public void A1(int i3) {
        z1(AbstractC0467a.a(this.f5274k0, i3));
    }

    public void A2(float f3) {
        if (this.f5270g0 != f3) {
            this.f5270g0 = f3;
            invalidateSelf();
            p1();
        }
    }

    public ColorStateList B0() {
        return this.f5233E;
    }

    public void B1(float f3) {
        if (this.f5237G != f3) {
            this.f5237G = f3;
            setShapeAppearanceModel(A().w(f3));
        }
    }

    public void B2(int i3) {
        A2(this.f5274k0.getResources().getDimension(i3));
    }

    public float C0() {
        return this.f5250M0 ? C() : this.f5237G;
    }

    public void C1(int i3) {
        B1(this.f5274k0.getResources().getDimension(i3));
    }

    public void C2(float f3) {
        C0741d c12 = c1();
        if (c12 != null) {
            c12.l(f3);
            this.f5281r0.f().setTextSize(f3);
            a();
        }
    }

    public float D0() {
        return this.f5273j0;
    }

    public void D1(float f3) {
        if (this.f5273j0 != f3) {
            this.f5273j0 = f3;
            invalidateSelf();
            p1();
        }
    }

    public void D2(float f3) {
        if (this.f5269f0 != f3) {
            this.f5269f0 = f3;
            invalidateSelf();
            p1();
        }
    }

    public Drawable E0() {
        Drawable drawable = this.f5249M;
        if (drawable != null) {
            return D.a.k(drawable);
        }
        return null;
    }

    public void E1(int i3) {
        D1(this.f5274k0.getResources().getDimension(i3));
    }

    public void E2(int i3) {
        D2(this.f5274k0.getResources().getDimension(i3));
    }

    public float F0() {
        return this.f5252O;
    }

    public void F1(Drawable drawable) {
        Drawable E02 = E0();
        if (E02 != drawable) {
            float g02 = g0();
            this.f5249M = drawable != null ? D.a.l(drawable).mutate() : null;
            float g03 = g0();
            K2(E02);
            if (I2()) {
                e0(this.f5249M);
            }
            invalidateSelf();
            if (g02 != g03) {
                p1();
            }
        }
    }

    public void F2(boolean z3) {
        if (this.f5238G0 != z3) {
            this.f5238G0 = z3;
            L2();
            onStateChange(getState());
        }
    }

    public ColorStateList G0() {
        return this.f5251N;
    }

    public void G1(int i3) {
        F1(AbstractC0467a.b(this.f5274k0, i3));
    }

    public boolean G2() {
        return this.f5246K0;
    }

    public float H0() {
        return this.f5235F;
    }

    public void H1(float f3) {
        if (this.f5252O != f3) {
            float g02 = g0();
            this.f5252O = f3;
            float g03 = g0();
            invalidateSelf();
            if (g02 != g03) {
                p1();
            }
        }
    }

    public final boolean H2() {
        return this.f5261X && this.f5262Y != null && this.f5288y0;
    }

    public float I0() {
        return this.f5266c0;
    }

    public void I1(int i3) {
        H1(this.f5274k0.getResources().getDimension(i3));
    }

    public final boolean I2() {
        return this.f5247L && this.f5249M != null;
    }

    public ColorStateList J0() {
        return this.f5239H;
    }

    public void J1(ColorStateList colorStateList) {
        this.f5253P = true;
        if (this.f5251N != colorStateList) {
            this.f5251N = colorStateList;
            if (I2()) {
                D.a.i(this.f5249M, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final boolean J2() {
        return this.f5254Q && this.f5255R != null;
    }

    public float K0() {
        return this.f5241I;
    }

    public void K1(int i3) {
        J1(AbstractC0467a.a(this.f5274k0, i3));
    }

    public final void K2(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public Drawable L0() {
        Drawable drawable = this.f5255R;
        if (drawable != null) {
            return D.a.k(drawable);
        }
        return null;
    }

    public void L1(int i3) {
        M1(this.f5274k0.getResources().getBoolean(i3));
    }

    public final void L2() {
        this.f5240H0 = this.f5238G0 ? AbstractC0758b.a(this.f5243J) : null;
    }

    public CharSequence M0() {
        return this.f5259V;
    }

    public void M1(boolean z3) {
        if (this.f5247L != z3) {
            boolean I22 = I2();
            this.f5247L = z3;
            boolean I23 = I2();
            if (I22 != I23) {
                if (I23) {
                    e0(this.f5249M);
                } else {
                    K2(this.f5249M);
                }
                invalidateSelf();
                p1();
            }
        }
    }

    public final void M2() {
        this.f5256S = new RippleDrawable(AbstractC0758b.a(Z0()), this.f5255R, f5227O0);
    }

    public float N0() {
        return this.f5272i0;
    }

    public void N1(float f3) {
        if (this.f5235F != f3) {
            this.f5235F = f3;
            invalidateSelf();
            p1();
        }
    }

    public float O0() {
        return this.f5258U;
    }

    public void O1(int i3) {
        N1(this.f5274k0.getResources().getDimension(i3));
    }

    public float P0() {
        return this.f5271h0;
    }

    public void P1(float f3) {
        if (this.f5266c0 != f3) {
            this.f5266c0 = f3;
            invalidateSelf();
            p1();
        }
    }

    public int[] Q0() {
        return this.f5236F0;
    }

    public void Q1(int i3) {
        P1(this.f5274k0.getResources().getDimension(i3));
    }

    public ColorStateList R0() {
        return this.f5257T;
    }

    public void R1(ColorStateList colorStateList) {
        if (this.f5239H != colorStateList) {
            this.f5239H = colorStateList;
            if (this.f5250M0) {
                Z(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void S0(RectF rectF) {
        j0(getBounds(), rectF);
    }

    public void S1(int i3) {
        R1(AbstractC0467a.a(this.f5274k0, i3));
    }

    public final float T0() {
        Drawable drawable = this.f5288y0 ? this.f5262Y : this.f5249M;
        float f3 = this.f5252O;
        if (f3 <= 0.0f && drawable != null) {
            f3 = (float) Math.ceil(n.c(this.f5274k0, 24));
            if (drawable.getIntrinsicHeight() <= f3) {
                return drawable.getIntrinsicHeight();
            }
        }
        return f3;
    }

    public void T1(float f3) {
        if (this.f5241I != f3) {
            this.f5241I = f3;
            this.f5275l0.setStrokeWidth(f3);
            if (this.f5250M0) {
                super.a0(f3);
            }
            invalidateSelf();
        }
    }

    public final float U0() {
        Drawable drawable = this.f5288y0 ? this.f5262Y : this.f5249M;
        float f3 = this.f5252O;
        return (f3 > 0.0f || drawable == null) ? f3 : drawable.getIntrinsicWidth();
    }

    public void U1(int i3) {
        T1(this.f5274k0.getResources().getDimension(i3));
    }

    public TextUtils.TruncateAt V0() {
        return this.f5244J0;
    }

    public final void V1(ColorStateList colorStateList) {
        if (this.f5231D != colorStateList) {
            this.f5231D = colorStateList;
            onStateChange(getState());
        }
    }

    public c W0() {
        return this.f5265b0;
    }

    public void W1(Drawable drawable) {
        Drawable L02 = L0();
        if (L02 != drawable) {
            float k02 = k0();
            this.f5255R = drawable != null ? D.a.l(drawable).mutate() : null;
            if (AbstractC0758b.f9878a) {
                M2();
            }
            float k03 = k0();
            K2(L02);
            if (J2()) {
                e0(this.f5255R);
            }
            invalidateSelf();
            if (k02 != k03) {
                p1();
            }
        }
    }

    public float X0() {
        return this.f5268e0;
    }

    public void X1(CharSequence charSequence) {
        if (this.f5259V != charSequence) {
            this.f5259V = I.a.c().h(charSequence);
            invalidateSelf();
        }
    }

    public float Y0() {
        return this.f5267d0;
    }

    public void Y1(float f3) {
        if (this.f5272i0 != f3) {
            this.f5272i0 = f3;
            invalidateSelf();
            if (J2()) {
                p1();
            }
        }
    }

    public ColorStateList Z0() {
        return this.f5243J;
    }

    public void Z1(int i3) {
        Y1(this.f5274k0.getResources().getDimension(i3));
    }

    @Override // r1.i.b
    public void a() {
        p1();
        invalidateSelf();
    }

    public c a1() {
        return this.f5264a0;
    }

    public void a2(int i3) {
        W1(AbstractC0467a.b(this.f5274k0, i3));
    }

    public CharSequence b1() {
        return this.f5245K;
    }

    public void b2(float f3) {
        if (this.f5258U != f3) {
            this.f5258U = f3;
            invalidateSelf();
            if (J2()) {
                p1();
            }
        }
    }

    public C0741d c1() {
        return this.f5281r0.e();
    }

    public void c2(int i3) {
        b2(this.f5274k0.getResources().getDimension(i3));
    }

    public float d1() {
        return this.f5270g0;
    }

    public void d2(float f3) {
        if (this.f5271h0 != f3) {
            this.f5271h0 = f3;
            invalidateSelf();
            if (J2()) {
                p1();
            }
        }
    }

    @Override // x1.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Canvas canvas2;
        int i3;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0) {
            return;
        }
        int i4 = this.f5228A0;
        if (i4 < 255) {
            canvas2 = canvas;
            i3 = AbstractC0518a.a(canvas2, bounds.left, bounds.top, bounds.right, bounds.bottom, i4);
        } else {
            canvas2 = canvas;
            i3 = 0;
        }
        u0(canvas2, bounds);
        r0(canvas2, bounds);
        if (this.f5250M0) {
            super.draw(canvas2);
        }
        t0(canvas2, bounds);
        w0(canvas2, bounds);
        s0(canvas2, bounds);
        q0(canvas2, bounds);
        if (this.f5246K0) {
            y0(canvas2, bounds);
        }
        v0(canvas2, bounds);
        x0(canvas2, bounds);
        if (this.f5228A0 < 255) {
            canvas2.restoreToCount(i3);
        }
    }

    public final void e0(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        D.a.g(drawable, D.a.b(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f5255R) {
            if (drawable.isStateful()) {
                drawable.setState(Q0());
            }
            D.a.i(drawable, this.f5257T);
            return;
        }
        Drawable drawable2 = this.f5249M;
        if (drawable == drawable2 && this.f5253P) {
            D.a.i(drawable2, this.f5251N);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public float e1() {
        return this.f5269f0;
    }

    public void e2(int i3) {
        d2(this.f5274k0.getResources().getDimension(i3));
    }

    public final void f0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (I2() || H2()) {
            float f3 = this.f5266c0 + this.f5267d0;
            float U02 = U0();
            if (D.a.b(this) == 0) {
                float f4 = rect.left + f3;
                rectF.left = f4;
                rectF.right = f4 + U02;
            } else {
                float f5 = rect.right - f3;
                rectF.right = f5;
                rectF.left = f5 - U02;
            }
            float T02 = T0();
            float exactCenterY = rect.exactCenterY() - (T02 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + T02;
        }
    }

    public final ColorFilter f1() {
        ColorFilter colorFilter = this.f5229B0;
        return colorFilter != null ? colorFilter : this.f5230C0;
    }

    public boolean f2(int[] iArr) {
        if (Arrays.equals(this.f5236F0, iArr)) {
            return false;
        }
        this.f5236F0 = iArr;
        if (J2()) {
            return q1(getState(), iArr);
        }
        return false;
    }

    public float g0() {
        if (I2() || H2()) {
            return this.f5267d0 + U0() + this.f5268e0;
        }
        return 0.0f;
    }

    public boolean g1() {
        return this.f5238G0;
    }

    public void g2(ColorStateList colorStateList) {
        if (this.f5257T != colorStateList) {
            this.f5257T = colorStateList;
            if (J2()) {
                D.a.i(this.f5255R, colorStateList);
            }
            onStateChange(getState());
        }
    }

    @Override // x1.g, android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f5228A0;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f5229B0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.f5235F;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f5266c0 + g0() + this.f5269f0 + this.f5281r0.g(b1().toString()) + this.f5270g0 + k0() + this.f5273j0), this.f5248L0);
    }

    @Override // x1.g, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // x1.g, android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Outline outline2;
        if (this.f5250M0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.f5237G);
        } else {
            outline.setRoundRect(bounds, this.f5237G);
            outline2 = outline;
        }
        outline2.setAlpha(getAlpha() / 255.0f);
    }

    public final void h0(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (J2()) {
            float f3 = this.f5273j0 + this.f5272i0 + this.f5258U + this.f5271h0 + this.f5270g0;
            if (D.a.b(this) == 0) {
                rectF.right = rect.right - f3;
            } else {
                rectF.left = rect.left + f3;
            }
        }
    }

    public void h2(int i3) {
        g2(AbstractC0467a.a(this.f5274k0, i3));
    }

    public final void i0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (J2()) {
            float f3 = this.f5273j0 + this.f5272i0;
            if (D.a.b(this) == 0) {
                float f4 = rect.right - f3;
                rectF.right = f4;
                rectF.left = f4 - this.f5258U;
            } else {
                float f5 = rect.left + f3;
                rectF.left = f5;
                rectF.right = f5 + this.f5258U;
            }
            float exactCenterY = rect.exactCenterY();
            float f6 = this.f5258U;
            float f7 = exactCenterY - (f6 / 2.0f);
            rectF.top = f7;
            rectF.bottom = f7 + f6;
        }
    }

    public boolean i1() {
        return this.f5260W;
    }

    public void i2(boolean z3) {
        if (this.f5254Q != z3) {
            boolean J22 = J2();
            this.f5254Q = z3;
            boolean J23 = J2();
            if (J22 != J23) {
                if (J23) {
                    e0(this.f5255R);
                } else {
                    K2(this.f5255R);
                }
                invalidateSelf();
                p1();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // x1.g, android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (l1(this.f5231D) || l1(this.f5233E) || l1(this.f5239H)) {
            return true;
        }
        return (this.f5238G0 && l1(this.f5240H0)) || n1(this.f5281r0.e()) || o0() || m1(this.f5249M) || m1(this.f5262Y) || l1(this.f5232D0);
    }

    public final void j0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (J2()) {
            float f3 = this.f5273j0 + this.f5272i0 + this.f5258U + this.f5271h0 + this.f5270g0;
            if (D.a.b(this) == 0) {
                float f4 = rect.right;
                rectF.right = f4;
                rectF.left = f4 - f3;
            } else {
                int i3 = rect.left;
                rectF.left = i3;
                rectF.right = i3 + f3;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    public boolean j1() {
        return m1(this.f5255R);
    }

    public void j2(InterfaceC0107a interfaceC0107a) {
        this.f5242I0 = new WeakReference(interfaceC0107a);
    }

    public float k0() {
        if (J2()) {
            return this.f5271h0 + this.f5258U + this.f5272i0;
        }
        return 0.0f;
    }

    public boolean k1() {
        return this.f5254Q;
    }

    public void k2(TextUtils.TruncateAt truncateAt) {
        this.f5244J0 = truncateAt;
    }

    public final void l0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.f5245K != null) {
            float g02 = this.f5266c0 + g0() + this.f5269f0;
            float k02 = this.f5273j0 + k0() + this.f5270g0;
            if (D.a.b(this) == 0) {
                rectF.left = rect.left + g02;
                rectF.right = rect.right - k02;
            } else {
                rectF.left = rect.left + k02;
                rectF.right = rect.right - g02;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    public void l2(c cVar) {
        this.f5265b0 = cVar;
    }

    public final float m0() {
        this.f5281r0.f().getFontMetrics(this.f5277n0);
        Paint.FontMetrics fontMetrics = this.f5277n0;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    public void m2(int i3) {
        l2(c.c(this.f5274k0, i3));
    }

    public Paint.Align n0(Rect rect, PointF pointF) {
        pointF.set(0.0f, 0.0f);
        Paint.Align align = Paint.Align.LEFT;
        if (this.f5245K != null) {
            float g02 = this.f5266c0 + g0() + this.f5269f0;
            if (D.a.b(this) == 0) {
                pointF.x = rect.left + g02;
            } else {
                pointF.x = rect.right - g02;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - m0();
        }
        return align;
    }

    public void n2(float f3) {
        if (this.f5268e0 != f3) {
            float g02 = g0();
            this.f5268e0 = f3;
            float g03 = g0();
            invalidateSelf();
            if (g02 != g03) {
                p1();
            }
        }
    }

    public final boolean o0() {
        return this.f5261X && this.f5262Y != null && this.f5260W;
    }

    public final void o1(AttributeSet attributeSet, int i3, int i4) {
        TypedArray h3 = k.h(this.f5274k0, attributeSet, j.f7065b0, i3, i4, new int[0]);
        this.f5250M0 = h3.hasValue(j.f7010M0);
        V1(AbstractC0740c.a(this.f5274k0, h3, j.f7161z0));
        z1(AbstractC0740c.a(this.f5274k0, h3, j.f7109m0));
        N1(h3.getDimension(j.f7141u0, 0.0f));
        int i5 = j.f7113n0;
        if (h3.hasValue(i5)) {
            B1(h3.getDimension(i5, 0.0f));
        }
        R1(AbstractC0740c.a(this.f5274k0, h3, j.f7153x0));
        T1(h3.getDimension(j.f7157y0, 0.0f));
        s2(AbstractC0740c.a(this.f5274k0, h3, j.f7006L0));
        x2(h3.getText(j.f7085g0));
        C0741d e3 = AbstractC0740c.e(this.f5274k0, h3, j.f7069c0);
        e3.l(h3.getDimension(j.f7073d0, e3.j()));
        y2(e3);
        int i6 = h3.getInt(j.f7077e0, 0);
        if (i6 == 1) {
            k2(TextUtils.TruncateAt.START);
        } else if (i6 == 2) {
            k2(TextUtils.TruncateAt.MIDDLE);
        } else if (i6 == 3) {
            k2(TextUtils.TruncateAt.END);
        }
        M1(h3.getBoolean(j.f7137t0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            M1(h3.getBoolean(j.f7125q0, false));
        }
        F1(AbstractC0740c.c(this.f5274k0, h3, j.f7121p0));
        int i7 = j.f7133s0;
        if (h3.hasValue(i7)) {
            J1(AbstractC0740c.a(this.f5274k0, h3, i7));
        }
        H1(h3.getDimension(j.f7129r0, -1.0f));
        i2(h3.getBoolean(j.f6986G0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            i2(h3.getBoolean(j.f6966B0, false));
        }
        W1(AbstractC0740c.c(this.f5274k0, h3, j.f6962A0));
        g2(AbstractC0740c.a(this.f5274k0, h3, j.f6982F0));
        b2(h3.getDimension(j.f6974D0, 0.0f));
        r1(h3.getBoolean(j.f7089h0, false));
        y1(h3.getBoolean(j.f7105l0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            y1(h3.getBoolean(j.f7097j0, false));
        }
        t1(AbstractC0740c.c(this.f5274k0, h3, j.f7093i0));
        int i8 = j.f7101k0;
        if (h3.hasValue(i8)) {
            v1(AbstractC0740c.a(this.f5274k0, h3, i8));
        }
        v2(c.b(this.f5274k0, h3, j.f7014N0));
        l2(c.b(this.f5274k0, h3, j.f6994I0));
        P1(h3.getDimension(j.f7149w0, 0.0f));
        p2(h3.getDimension(j.f7002K0, 0.0f));
        n2(h3.getDimension(j.f6998J0, 0.0f));
        D2(h3.getDimension(j.f7022P0, 0.0f));
        A2(h3.getDimension(j.f7018O0, 0.0f));
        d2(h3.getDimension(j.f6978E0, 0.0f));
        Y1(h3.getDimension(j.f6970C0, 0.0f));
        D1(h3.getDimension(j.f7117o0, 0.0f));
        r2(h3.getDimensionPixelSize(j.f7081f0, Integer.MAX_VALUE));
        h3.recycle();
    }

    public void o2(int i3) {
        n2(this.f5274k0.getResources().getDimension(i3));
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i3) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i3);
        if (I2()) {
            onLayoutDirectionChanged |= D.a.g(this.f5249M, i3);
        }
        if (H2()) {
            onLayoutDirectionChanged |= D.a.g(this.f5262Y, i3);
        }
        if (J2()) {
            onLayoutDirectionChanged |= D.a.g(this.f5255R, i3);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i3) {
        boolean onLevelChange = super.onLevelChange(i3);
        if (I2()) {
            onLevelChange |= this.f5249M.setLevel(i3);
        }
        if (H2()) {
            onLevelChange |= this.f5262Y.setLevel(i3);
        }
        if (J2()) {
            onLevelChange |= this.f5255R.setLevel(i3);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // x1.g, android.graphics.drawable.Drawable, r1.i.b
    public boolean onStateChange(int[] iArr) {
        if (this.f5250M0) {
            super.onStateChange(iArr);
        }
        return q1(iArr, Q0());
    }

    public void p1() {
        InterfaceC0107a interfaceC0107a = (InterfaceC0107a) this.f5242I0.get();
        if (interfaceC0107a != null) {
            interfaceC0107a.a();
        }
    }

    public void p2(float f3) {
        if (this.f5267d0 != f3) {
            float g02 = g0();
            this.f5267d0 = f3;
            float g03 = g0();
            invalidateSelf();
            if (g02 != g03) {
                p1();
            }
        }
    }

    public final void q0(Canvas canvas, Rect rect) {
        if (H2()) {
            f0(rect, this.f5278o0);
            RectF rectF = this.f5278o0;
            float f3 = rectF.left;
            float f4 = rectF.top;
            canvas.translate(f3, f4);
            this.f5262Y.setBounds(0, 0, (int) this.f5278o0.width(), (int) this.f5278o0.height());
            this.f5262Y.draw(canvas);
            canvas.translate(-f3, -f4);
        }
    }

    public final boolean q1(int[] iArr, int[] iArr2) {
        boolean z3;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.f5231D;
        int l3 = l(colorStateList != null ? colorStateList.getColorForState(iArr, this.f5282s0) : 0);
        boolean z4 = true;
        if (this.f5282s0 != l3) {
            this.f5282s0 = l3;
            onStateChange = true;
        }
        ColorStateList colorStateList2 = this.f5233E;
        int l4 = l(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f5283t0) : 0);
        if (this.f5283t0 != l4) {
            this.f5283t0 = l4;
            onStateChange = true;
        }
        int i3 = AbstractC0597a.i(l3, l4);
        if ((this.f5284u0 != i3) | (v() == null)) {
            this.f5284u0 = i3;
            T(ColorStateList.valueOf(i3));
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.f5239H;
        int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f5285v0) : 0;
        if (this.f5285v0 != colorForState) {
            this.f5285v0 = colorForState;
            onStateChange = true;
        }
        int colorForState2 = (this.f5240H0 == null || !AbstractC0758b.b(iArr)) ? 0 : this.f5240H0.getColorForState(iArr, this.f5286w0);
        if (this.f5286w0 != colorForState2) {
            this.f5286w0 = colorForState2;
            if (this.f5238G0) {
                onStateChange = true;
            }
        }
        int colorForState3 = (this.f5281r0.e() == null || this.f5281r0.e().i() == null) ? 0 : this.f5281r0.e().i().getColorForState(iArr, this.f5287x0);
        if (this.f5287x0 != colorForState3) {
            this.f5287x0 = colorForState3;
            onStateChange = true;
        }
        boolean z5 = h1(getState(), R.attr.state_checked) && this.f5260W;
        if (this.f5288y0 == z5 || this.f5262Y == null) {
            z3 = false;
        } else {
            float g02 = g0();
            this.f5288y0 = z5;
            if (g02 != g0()) {
                onStateChange = true;
                z3 = true;
            } else {
                z3 = false;
                onStateChange = true;
            }
        }
        ColorStateList colorStateList4 = this.f5232D0;
        int colorForState4 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f5289z0) : 0;
        if (this.f5289z0 != colorForState4) {
            this.f5289z0 = colorForState4;
            this.f5230C0 = AbstractC0648d.c(this, this.f5232D0, this.f5234E0);
        } else {
            z4 = onStateChange;
        }
        if (m1(this.f5249M)) {
            z4 |= this.f5249M.setState(iArr);
        }
        if (m1(this.f5262Y)) {
            z4 |= this.f5262Y.setState(iArr);
        }
        if (m1(this.f5255R)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            z4 |= this.f5255R.setState(iArr3);
        }
        if (AbstractC0758b.f9878a && m1(this.f5256S)) {
            z4 |= this.f5256S.setState(iArr2);
        }
        if (z4) {
            invalidateSelf();
        }
        if (z3) {
            p1();
        }
        return z4;
    }

    public void q2(int i3) {
        p2(this.f5274k0.getResources().getDimension(i3));
    }

    public final void r0(Canvas canvas, Rect rect) {
        if (this.f5250M0) {
            return;
        }
        this.f5275l0.setColor(this.f5283t0);
        this.f5275l0.setStyle(Paint.Style.FILL);
        this.f5275l0.setColorFilter(f1());
        this.f5278o0.set(rect);
        canvas.drawRoundRect(this.f5278o0, C0(), C0(), this.f5275l0);
    }

    public void r1(boolean z3) {
        if (this.f5260W != z3) {
            this.f5260W = z3;
            float g02 = g0();
            if (!z3 && this.f5288y0) {
                this.f5288y0 = false;
            }
            float g03 = g0();
            invalidateSelf();
            if (g02 != g03) {
                p1();
            }
        }
    }

    public void r2(int i3) {
        this.f5248L0 = i3;
    }

    public final void s0(Canvas canvas, Rect rect) {
        if (I2()) {
            f0(rect, this.f5278o0);
            RectF rectF = this.f5278o0;
            float f3 = rectF.left;
            float f4 = rectF.top;
            canvas.translate(f3, f4);
            this.f5249M.setBounds(0, 0, (int) this.f5278o0.width(), (int) this.f5278o0.height());
            this.f5249M.draw(canvas);
            canvas.translate(-f3, -f4);
        }
    }

    public void s1(int i3) {
        r1(this.f5274k0.getResources().getBoolean(i3));
    }

    public void s2(ColorStateList colorStateList) {
        if (this.f5243J != colorStateList) {
            this.f5243J = colorStateList;
            L2();
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j3) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j3);
        }
    }

    @Override // x1.g, android.graphics.drawable.Drawable
    public void setAlpha(int i3) {
        if (this.f5228A0 != i3) {
            this.f5228A0 = i3;
            invalidateSelf();
        }
    }

    @Override // x1.g, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f5229B0 != colorFilter) {
            this.f5229B0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // x1.g, android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (this.f5232D0 != colorStateList) {
            this.f5232D0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // x1.g, android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.f5234E0 != mode) {
            this.f5234E0 = mode;
            this.f5230C0 = AbstractC0648d.c(this, this.f5232D0, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z3, boolean z4) {
        boolean visible = super.setVisible(z3, z4);
        if (I2()) {
            visible |= this.f5249M.setVisible(z3, z4);
        }
        if (H2()) {
            visible |= this.f5262Y.setVisible(z3, z4);
        }
        if (J2()) {
            visible |= this.f5255R.setVisible(z3, z4);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void t0(Canvas canvas, Rect rect) {
        if (this.f5241I <= 0.0f || this.f5250M0) {
            return;
        }
        this.f5275l0.setColor(this.f5285v0);
        this.f5275l0.setStyle(Paint.Style.STROKE);
        if (!this.f5250M0) {
            this.f5275l0.setColorFilter(f1());
        }
        RectF rectF = this.f5278o0;
        float f3 = rect.left;
        float f4 = this.f5241I;
        rectF.set(f3 + (f4 / 2.0f), rect.top + (f4 / 2.0f), rect.right - (f4 / 2.0f), rect.bottom - (f4 / 2.0f));
        float f5 = this.f5237G - (this.f5241I / 2.0f);
        canvas.drawRoundRect(this.f5278o0, f5, f5, this.f5275l0);
    }

    public void t1(Drawable drawable) {
        if (this.f5262Y != drawable) {
            float g02 = g0();
            this.f5262Y = drawable;
            float g03 = g0();
            K2(this.f5262Y);
            e0(this.f5262Y);
            invalidateSelf();
            if (g02 != g03) {
                p1();
            }
        }
    }

    public void t2(int i3) {
        s2(AbstractC0467a.a(this.f5274k0, i3));
    }

    public final void u0(Canvas canvas, Rect rect) {
        if (this.f5250M0) {
            return;
        }
        this.f5275l0.setColor(this.f5282s0);
        this.f5275l0.setStyle(Paint.Style.FILL);
        this.f5278o0.set(rect);
        canvas.drawRoundRect(this.f5278o0, C0(), C0(), this.f5275l0);
    }

    public void u1(int i3) {
        t1(AbstractC0467a.b(this.f5274k0, i3));
    }

    public void u2(boolean z3) {
        this.f5246K0 = z3;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void v0(Canvas canvas, Rect rect) {
        if (J2()) {
            i0(rect, this.f5278o0);
            RectF rectF = this.f5278o0;
            float f3 = rectF.left;
            float f4 = rectF.top;
            canvas.translate(f3, f4);
            this.f5255R.setBounds(0, 0, (int) this.f5278o0.width(), (int) this.f5278o0.height());
            if (AbstractC0758b.f9878a) {
                this.f5256S.setBounds(this.f5255R.getBounds());
                this.f5256S.jumpToCurrentState();
                this.f5256S.draw(canvas);
            } else {
                this.f5255R.draw(canvas);
            }
            canvas.translate(-f3, -f4);
        }
    }

    public void v1(ColorStateList colorStateList) {
        if (this.f5263Z != colorStateList) {
            this.f5263Z = colorStateList;
            if (o0()) {
                D.a.i(this.f5262Y, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void v2(c cVar) {
        this.f5264a0 = cVar;
    }

    public final void w0(Canvas canvas, Rect rect) {
        this.f5275l0.setColor(this.f5286w0);
        this.f5275l0.setStyle(Paint.Style.FILL);
        this.f5278o0.set(rect);
        if (!this.f5250M0) {
            canvas.drawRoundRect(this.f5278o0, C0(), C0(), this.f5275l0);
        } else {
            h(new RectF(rect), this.f5280q0);
            super.p(canvas, this.f5275l0, this.f5280q0, s());
        }
    }

    public void w1(int i3) {
        v1(AbstractC0467a.a(this.f5274k0, i3));
    }

    public void w2(int i3) {
        v2(c.c(this.f5274k0, i3));
    }

    public final void x0(Canvas canvas, Rect rect) {
        Canvas canvas2;
        Paint paint = this.f5276m0;
        if (paint != null) {
            paint.setColor(C.a.k(-16777216, 127));
            canvas.drawRect(rect, this.f5276m0);
            if (I2() || H2()) {
                f0(rect, this.f5278o0);
                canvas.drawRect(this.f5278o0, this.f5276m0);
            }
            if (this.f5245K != null) {
                canvas2 = canvas;
                canvas2.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.f5276m0);
            } else {
                canvas2 = canvas;
            }
            if (J2()) {
                i0(rect, this.f5278o0);
                canvas2.drawRect(this.f5278o0, this.f5276m0);
            }
            this.f5276m0.setColor(C.a.k(-65536, 127));
            h0(rect, this.f5278o0);
            canvas2.drawRect(this.f5278o0, this.f5276m0);
            this.f5276m0.setColor(C.a.k(-16711936, 127));
            j0(rect, this.f5278o0);
            canvas2.drawRect(this.f5278o0, this.f5276m0);
        }
    }

    public void x1(int i3) {
        y1(this.f5274k0.getResources().getBoolean(i3));
    }

    public void x2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.f5245K, charSequence)) {
            return;
        }
        this.f5245K = charSequence;
        this.f5281r0.k(true);
        invalidateSelf();
        p1();
    }

    public final void y0(Canvas canvas, Rect rect) {
        if (this.f5245K != null) {
            Paint.Align n02 = n0(rect, this.f5279p0);
            l0(rect, this.f5278o0);
            if (this.f5281r0.e() != null) {
                this.f5281r0.f().drawableState = getState();
                this.f5281r0.l(this.f5274k0);
            }
            this.f5281r0.f().setTextAlign(n02);
            int i3 = 0;
            boolean z3 = Math.round(this.f5281r0.g(b1().toString())) > Math.round(this.f5278o0.width());
            if (z3) {
                i3 = canvas.save();
                canvas.clipRect(this.f5278o0);
            }
            CharSequence charSequence = this.f5245K;
            if (z3 && this.f5244J0 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.f5281r0.f(), this.f5278o0.width(), this.f5244J0);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF = this.f5279p0;
            canvas.drawText(charSequence2, 0, length, pointF.x, pointF.y, this.f5281r0.f());
            if (z3) {
                canvas.restoreToCount(i3);
            }
        }
    }

    public void y1(boolean z3) {
        if (this.f5261X != z3) {
            boolean H22 = H2();
            this.f5261X = z3;
            boolean H23 = H2();
            if (H22 != H23) {
                if (H23) {
                    e0(this.f5262Y);
                } else {
                    K2(this.f5262Y);
                }
                invalidateSelf();
                p1();
            }
        }
    }

    public void y2(C0741d c0741d) {
        this.f5281r0.j(c0741d, this.f5274k0);
    }

    public Drawable z0() {
        return this.f5262Y;
    }

    public void z1(ColorStateList colorStateList) {
        if (this.f5233E != colorStateList) {
            this.f5233E = colorStateList;
            onStateChange(getState());
        }
    }

    public void z2(int i3) {
        y2(new C0741d(this.f5274k0, i3));
    }
}
