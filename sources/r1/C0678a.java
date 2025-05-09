package r1;

import K.AbstractC0213s;
import K.O;
import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import f1.AbstractC0474a;
import m1.AbstractC0597a;
import u1.AbstractC0747j;
import u1.C0738a;
import u1.C0741d;

/* renamed from: r1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0678a {

    /* renamed from: t0, reason: collision with root package name */
    public static final boolean f8879t0 = false;

    /* renamed from: u0, reason: collision with root package name */
    public static final Paint f8880u0 = null;

    /* renamed from: A, reason: collision with root package name */
    public Typeface f8881A;

    /* renamed from: B, reason: collision with root package name */
    public Typeface f8882B;

    /* renamed from: C, reason: collision with root package name */
    public Typeface f8883C;

    /* renamed from: D, reason: collision with root package name */
    public C0738a f8884D;

    /* renamed from: E, reason: collision with root package name */
    public C0738a f8885E;

    /* renamed from: G, reason: collision with root package name */
    public CharSequence f8887G;

    /* renamed from: H, reason: collision with root package name */
    public CharSequence f8888H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f8889I;

    /* renamed from: K, reason: collision with root package name */
    public boolean f8891K;

    /* renamed from: L, reason: collision with root package name */
    public Bitmap f8892L;

    /* renamed from: M, reason: collision with root package name */
    public Paint f8893M;

    /* renamed from: N, reason: collision with root package name */
    public float f8894N;

    /* renamed from: O, reason: collision with root package name */
    public float f8895O;

    /* renamed from: P, reason: collision with root package name */
    public float f8896P;

    /* renamed from: Q, reason: collision with root package name */
    public float f8897Q;

    /* renamed from: R, reason: collision with root package name */
    public float f8898R;

    /* renamed from: S, reason: collision with root package name */
    public int f8899S;

    /* renamed from: T, reason: collision with root package name */
    public int[] f8900T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f8901U;

    /* renamed from: V, reason: collision with root package name */
    public final TextPaint f8902V;

    /* renamed from: W, reason: collision with root package name */
    public final TextPaint f8903W;

    /* renamed from: X, reason: collision with root package name */
    public TimeInterpolator f8904X;

    /* renamed from: Y, reason: collision with root package name */
    public TimeInterpolator f8905Y;

    /* renamed from: Z, reason: collision with root package name */
    public float f8906Z;

    /* renamed from: a, reason: collision with root package name */
    public final View f8907a;

    /* renamed from: a0, reason: collision with root package name */
    public float f8908a0;

    /* renamed from: b, reason: collision with root package name */
    public float f8909b;

    /* renamed from: b0, reason: collision with root package name */
    public float f8910b0;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8911c;

    /* renamed from: c0, reason: collision with root package name */
    public ColorStateList f8912c0;

    /* renamed from: d, reason: collision with root package name */
    public float f8913d;

    /* renamed from: d0, reason: collision with root package name */
    public float f8914d0;

    /* renamed from: e, reason: collision with root package name */
    public float f8915e;

    /* renamed from: e0, reason: collision with root package name */
    public float f8916e0;

    /* renamed from: f, reason: collision with root package name */
    public int f8917f;

    /* renamed from: f0, reason: collision with root package name */
    public float f8918f0;

    /* renamed from: g, reason: collision with root package name */
    public final Rect f8919g;

    /* renamed from: g0, reason: collision with root package name */
    public ColorStateList f8920g0;

    /* renamed from: h, reason: collision with root package name */
    public final Rect f8921h;

    /* renamed from: h0, reason: collision with root package name */
    public float f8922h0;

    /* renamed from: i, reason: collision with root package name */
    public final RectF f8923i;

    /* renamed from: i0, reason: collision with root package name */
    public float f8924i0;

    /* renamed from: j0, reason: collision with root package name */
    public float f8926j0;

    /* renamed from: k0, reason: collision with root package name */
    public StaticLayout f8928k0;

    /* renamed from: l0, reason: collision with root package name */
    public float f8930l0;

    /* renamed from: m0, reason: collision with root package name */
    public float f8932m0;

    /* renamed from: n, reason: collision with root package name */
    public ColorStateList f8933n;

    /* renamed from: n0, reason: collision with root package name */
    public float f8934n0;

    /* renamed from: o, reason: collision with root package name */
    public ColorStateList f8935o;

    /* renamed from: o0, reason: collision with root package name */
    public CharSequence f8936o0;

    /* renamed from: p, reason: collision with root package name */
    public int f8937p;

    /* renamed from: q, reason: collision with root package name */
    public float f8939q;

    /* renamed from: r, reason: collision with root package name */
    public float f8941r;

    /* renamed from: s, reason: collision with root package name */
    public float f8943s;

    /* renamed from: t, reason: collision with root package name */
    public float f8945t;

    /* renamed from: u, reason: collision with root package name */
    public float f8946u;

    /* renamed from: v, reason: collision with root package name */
    public float f8947v;

    /* renamed from: w, reason: collision with root package name */
    public Typeface f8948w;

    /* renamed from: x, reason: collision with root package name */
    public Typeface f8949x;

    /* renamed from: y, reason: collision with root package name */
    public Typeface f8950y;

    /* renamed from: z, reason: collision with root package name */
    public Typeface f8951z;

    /* renamed from: j, reason: collision with root package name */
    public int f8925j = 16;

    /* renamed from: k, reason: collision with root package name */
    public int f8927k = 16;

    /* renamed from: l, reason: collision with root package name */
    public float f8929l = 15.0f;

    /* renamed from: m, reason: collision with root package name */
    public float f8931m = 15.0f;

    /* renamed from: F, reason: collision with root package name */
    public TextUtils.TruncateAt f8886F = TextUtils.TruncateAt.END;

    /* renamed from: J, reason: collision with root package name */
    public boolean f8890J = true;

    /* renamed from: p0, reason: collision with root package name */
    public int f8938p0 = 1;

    /* renamed from: q0, reason: collision with root package name */
    public float f8940q0 = 0.0f;

    /* renamed from: r0, reason: collision with root package name */
    public float f8942r0 = 1.0f;

    /* renamed from: s0, reason: collision with root package name */
    public int f8944s0 = g.f8961n;

    /* renamed from: r1.a$a, reason: collision with other inner class name */
    public class C0152a implements C0738a.InterfaceC0159a {
        public C0152a() {
        }

        @Override // u1.C0738a.InterfaceC0159a
        public void a(Typeface typeface) {
            C0678a.this.T(typeface);
        }
    }

    public C0678a(View view) {
        this.f8907a = view;
        TextPaint textPaint = new TextPaint(129);
        this.f8902V = textPaint;
        this.f8903W = new TextPaint(textPaint);
        this.f8921h = new Rect();
        this.f8919g = new Rect();
        this.f8923i = new RectF();
        this.f8915e = e();
        H(view.getContext().getResources().getConfiguration());
    }

    public static boolean C(float f3, float f4) {
        return Math.abs(f3 - f4) < 1.0E-5f;
    }

    public static float G(float f3, float f4, float f5, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f5 = timeInterpolator.getInterpolation(f5);
        }
        return AbstractC0474a.a(f3, f4, f5);
    }

    public static boolean L(Rect rect, int i3, int i4, int i5, int i6) {
        return rect.left == i3 && rect.top == i4 && rect.right == i5 && rect.bottom == i6;
    }

    public static int a(int i3, int i4, float f3) {
        float f4 = 1.0f - f3;
        return Color.argb(Math.round((Color.alpha(i3) * f4) + (Color.alpha(i4) * f3)), Math.round((Color.red(i3) * f4) + (Color.red(i4) * f3)), Math.round((Color.green(i3) * f4) + (Color.green(i4) * f3)), Math.round((Color.blue(i3) * f4) + (Color.blue(i4) * f3)));
    }

    public final void A(TextPaint textPaint) {
        textPaint.setTextSize(this.f8929l);
        textPaint.setTypeface(this.f8951z);
        textPaint.setLetterSpacing(this.f8924i0);
    }

    public final void B(float f3) {
        if (this.f8911c) {
            this.f8923i.set(f3 < this.f8915e ? this.f8919g : this.f8921h);
            return;
        }
        this.f8923i.left = G(this.f8919g.left, this.f8921h.left, f3, this.f8904X);
        this.f8923i.top = G(this.f8939q, this.f8941r, f3, this.f8904X);
        this.f8923i.right = G(this.f8919g.right, this.f8921h.right, f3, this.f8904X);
        this.f8923i.bottom = G(this.f8919g.bottom, this.f8921h.bottom, f3, this.f8904X);
    }

    public final boolean D() {
        return O.w(this.f8907a) == 1;
    }

    public final boolean E() {
        ColorStateList colorStateList = this.f8935o;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f8933n;
        return colorStateList2 != null && colorStateList2.isStateful();
    }

    public final boolean F(CharSequence charSequence, boolean z3) {
        return (z3 ? I.n.f795d : I.n.f794c).a(charSequence, 0, charSequence.length());
    }

    public void H(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f8950y;
            if (typeface != null) {
                this.f8949x = AbstractC0747j.b(configuration, typeface);
            }
            Typeface typeface2 = this.f8882B;
            if (typeface2 != null) {
                this.f8881A = AbstractC0747j.b(configuration, typeface2);
            }
            Typeface typeface3 = this.f8949x;
            if (typeface3 == null) {
                typeface3 = this.f8950y;
            }
            this.f8948w = typeface3;
            Typeface typeface4 = this.f8881A;
            if (typeface4 == null) {
                typeface4 = this.f8882B;
            }
            this.f8951z = typeface4;
            K(true);
        }
    }

    public final float I(TextPaint textPaint, CharSequence charSequence) {
        return textPaint.measureText(charSequence, 0, charSequence.length());
    }

    public void J() {
        K(false);
    }

    public void K(boolean z3) {
        if ((this.f8907a.getHeight() <= 0 || this.f8907a.getWidth() <= 0) && !z3) {
            return;
        }
        b(z3);
        c();
    }

    public void M(ColorStateList colorStateList) {
        if (this.f8935o == colorStateList && this.f8933n == colorStateList) {
            return;
        }
        this.f8935o = colorStateList;
        this.f8933n = colorStateList;
        J();
    }

    public void N(int i3, int i4, int i5, int i6) {
        if (L(this.f8921h, i3, i4, i5, i6)) {
            return;
        }
        this.f8921h.set(i3, i4, i5, i6);
        this.f8901U = true;
    }

    public void O(Rect rect) {
        N(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void P(int i3) {
        C0741d c0741d = new C0741d(this.f8907a.getContext(), i3);
        if (c0741d.i() != null) {
            this.f8935o = c0741d.i();
        }
        if (c0741d.j() != 0.0f) {
            this.f8931m = c0741d.j();
        }
        ColorStateList colorStateList = c0741d.f9619c;
        if (colorStateList != null) {
            this.f8912c0 = colorStateList;
        }
        this.f8908a0 = c0741d.f9624h;
        this.f8910b0 = c0741d.f9625i;
        this.f8906Z = c0741d.f9626j;
        this.f8922h0 = c0741d.f9628l;
        C0738a c0738a = this.f8885E;
        if (c0738a != null) {
            c0738a.c();
        }
        this.f8885E = new C0738a(new C0152a(), c0741d.e());
        c0741d.h(this.f8907a.getContext(), this.f8885E);
        J();
    }

    public final void Q(float f3) {
        this.f8932m0 = f3;
        O.a0(this.f8907a);
    }

    public void R(ColorStateList colorStateList) {
        if (this.f8935o != colorStateList) {
            this.f8935o = colorStateList;
            J();
        }
    }

    public void S(int i3) {
        if (this.f8927k != i3) {
            this.f8927k = i3;
            J();
        }
    }

    public void T(Typeface typeface) {
        if (U(typeface)) {
            J();
        }
    }

    public final boolean U(Typeface typeface) {
        C0738a c0738a = this.f8885E;
        if (c0738a != null) {
            c0738a.c();
        }
        if (this.f8950y == typeface) {
            return false;
        }
        this.f8950y = typeface;
        Typeface b3 = AbstractC0747j.b(this.f8907a.getContext().getResources().getConfiguration(), typeface);
        this.f8949x = b3;
        if (b3 == null) {
            b3 = this.f8950y;
        }
        this.f8948w = b3;
        return true;
    }

    public void V(int i3, int i4, int i5, int i6) {
        if (L(this.f8919g, i3, i4, i5, i6)) {
            return;
        }
        this.f8919g.set(i3, i4, i5, i6);
        this.f8901U = true;
    }

    public void W(Rect rect) {
        V(rect.left, rect.top, rect.right, rect.bottom);
    }

    public void X(float f3) {
        if (this.f8924i0 != f3) {
            this.f8924i0 = f3;
            J();
        }
    }

    public final void Y(float f3) {
        this.f8934n0 = f3;
        O.a0(this.f8907a);
    }

    public void Z(int i3) {
        if (this.f8925j != i3) {
            this.f8925j = i3;
            J();
        }
    }

    public void a0(float f3) {
        if (this.f8929l != f3) {
            this.f8929l = f3;
            J();
        }
    }

    public final void b(boolean z3) {
        StaticLayout staticLayout;
        i(1.0f, z3);
        CharSequence charSequence = this.f8888H;
        if (charSequence != null && (staticLayout = this.f8928k0) != null) {
            this.f8936o0 = TextUtils.ellipsize(charSequence, this.f8902V, staticLayout.getWidth(), this.f8886F);
        }
        CharSequence charSequence2 = this.f8936o0;
        float f3 = 0.0f;
        if (charSequence2 != null) {
            this.f8930l0 = I(this.f8902V, charSequence2);
        } else {
            this.f8930l0 = 0.0f;
        }
        int b3 = AbstractC0213s.b(this.f8927k, this.f8889I ? 1 : 0);
        int i3 = b3 & 112;
        if (i3 == 48) {
            this.f8941r = this.f8921h.top;
        } else if (i3 != 80) {
            this.f8941r = this.f8921h.centerY() - ((this.f8902V.descent() - this.f8902V.ascent()) / 2.0f);
        } else {
            this.f8941r = this.f8921h.bottom + this.f8902V.ascent();
        }
        int i4 = b3 & 8388615;
        if (i4 == 1) {
            this.f8945t = this.f8921h.centerX() - (this.f8930l0 / 2.0f);
        } else if (i4 != 5) {
            this.f8945t = this.f8921h.left;
        } else {
            this.f8945t = this.f8921h.right - this.f8930l0;
        }
        i(0.0f, z3);
        float height = this.f8928k0 != null ? r10.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.f8928k0;
        if (staticLayout2 == null || this.f8938p0 <= 1) {
            CharSequence charSequence3 = this.f8888H;
            if (charSequence3 != null) {
                f3 = I(this.f8902V, charSequence3);
            }
        } else {
            f3 = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.f8928k0;
        this.f8937p = staticLayout3 != null ? staticLayout3.getLineCount() : 0;
        int b4 = AbstractC0213s.b(this.f8925j, this.f8889I ? 1 : 0);
        int i5 = b4 & 112;
        if (i5 == 48) {
            this.f8939q = this.f8919g.top;
        } else if (i5 != 80) {
            this.f8939q = this.f8919g.centerY() - (height / 2.0f);
        } else {
            this.f8939q = (this.f8919g.bottom - height) + this.f8902V.descent();
        }
        int i6 = b4 & 8388615;
        if (i6 == 1) {
            this.f8943s = this.f8919g.centerX() - (f3 / 2.0f);
        } else if (i6 != 5) {
            this.f8943s = this.f8919g.left;
        } else {
            this.f8943s = this.f8919g.right - f3;
        }
        j();
        d0(this.f8909b);
    }

    public final boolean b0(Typeface typeface) {
        C0738a c0738a = this.f8884D;
        if (c0738a != null) {
            c0738a.c();
        }
        if (this.f8882B == typeface) {
            return false;
        }
        this.f8882B = typeface;
        Typeface b3 = AbstractC0747j.b(this.f8907a.getContext().getResources().getConfiguration(), typeface);
        this.f8881A = b3;
        if (b3 == null) {
            b3 = this.f8882B;
        }
        this.f8951z = b3;
        return true;
    }

    public final void c() {
        g(this.f8909b);
    }

    public void c0(float f3) {
        float a3 = F.a.a(f3, 0.0f, 1.0f);
        if (a3 != this.f8909b) {
            this.f8909b = a3;
            c();
        }
    }

    public final float d(float f3) {
        float f4 = this.f8915e;
        return f3 <= f4 ? AbstractC0474a.b(1.0f, 0.0f, this.f8913d, f4, f3) : AbstractC0474a.b(0.0f, 1.0f, f4, 1.0f, f3);
    }

    public final void d0(float f3) {
        h(f3);
        boolean z3 = f8879t0 && this.f8894N != 1.0f;
        this.f8891K = z3;
        if (z3) {
            n();
        }
        O.a0(this.f8907a);
    }

    public final float e() {
        float f3 = this.f8913d;
        return f3 + ((1.0f - f3) * 0.5f);
    }

    public void e0(TimeInterpolator timeInterpolator) {
        this.f8904X = timeInterpolator;
        J();
    }

    public final boolean f(CharSequence charSequence) {
        boolean D3 = D();
        return this.f8890J ? F(charSequence, D3) : D3;
    }

    public final boolean f0(int[] iArr) {
        this.f8900T = iArr;
        if (!E()) {
            return false;
        }
        J();
        return true;
    }

    public final void g(float f3) {
        float f4;
        B(f3);
        if (!this.f8911c) {
            this.f8946u = G(this.f8943s, this.f8945t, f3, this.f8904X);
            this.f8947v = G(this.f8939q, this.f8941r, f3, this.f8904X);
            d0(f3);
            f4 = f3;
        } else if (f3 < this.f8915e) {
            this.f8946u = this.f8943s;
            this.f8947v = this.f8939q;
            d0(0.0f);
            f4 = 0.0f;
        } else {
            this.f8946u = this.f8945t;
            this.f8947v = this.f8941r - Math.max(0, this.f8917f);
            d0(1.0f);
            f4 = 1.0f;
        }
        TimeInterpolator timeInterpolator = AbstractC0474a.f7195b;
        Q(1.0f - G(0.0f, 1.0f, 1.0f - f3, timeInterpolator));
        Y(G(1.0f, 0.0f, f3, timeInterpolator));
        if (this.f8935o != this.f8933n) {
            this.f8902V.setColor(a(v(), t(), f4));
        } else {
            this.f8902V.setColor(t());
        }
        int i3 = Build.VERSION.SDK_INT;
        float f5 = this.f8922h0;
        float f6 = this.f8924i0;
        if (f5 != f6) {
            this.f8902V.setLetterSpacing(G(f6, f5, f3, timeInterpolator));
        } else {
            this.f8902V.setLetterSpacing(f5);
        }
        this.f8896P = G(this.f8914d0, this.f8906Z, f3, null);
        this.f8897Q = G(this.f8916e0, this.f8908a0, f3, null);
        this.f8898R = G(this.f8918f0, this.f8910b0, f3, null);
        int a3 = a(u(this.f8920g0), u(this.f8912c0), f3);
        this.f8899S = a3;
        this.f8902V.setShadowLayer(this.f8896P, this.f8897Q, this.f8898R, a3);
        if (this.f8911c) {
            this.f8902V.setAlpha((int) (d(f3) * this.f8902V.getAlpha()));
            if (i3 >= 31) {
                TextPaint textPaint = this.f8902V;
                textPaint.setShadowLayer(this.f8896P, this.f8897Q, this.f8898R, AbstractC0597a.a(this.f8899S, textPaint.getAlpha()));
            }
        }
        O.a0(this.f8907a);
    }

    public void g0(CharSequence charSequence) {
        if (charSequence == null || !TextUtils.equals(this.f8887G, charSequence)) {
            this.f8887G = charSequence;
            this.f8888H = null;
            j();
            J();
        }
    }

    public final void h(float f3) {
        i(f3, false);
    }

    public void h0(TimeInterpolator timeInterpolator) {
        this.f8905Y = timeInterpolator;
        J();
    }

    public final void i(float f3, boolean z3) {
        float f4;
        float f5;
        Typeface typeface;
        if (this.f8887G == null) {
            return;
        }
        float width = this.f8921h.width();
        float width2 = this.f8919g.width();
        if (C(f3, 1.0f)) {
            f4 = this.f8931m;
            f5 = this.f8922h0;
            this.f8894N = 1.0f;
            typeface = this.f8948w;
        } else {
            float f6 = this.f8929l;
            float f7 = this.f8924i0;
            Typeface typeface2 = this.f8951z;
            if (C(f3, 0.0f)) {
                this.f8894N = 1.0f;
            } else {
                this.f8894N = G(this.f8929l, this.f8931m, f3, this.f8905Y) / this.f8929l;
            }
            float f8 = this.f8931m / this.f8929l;
            width = (z3 || this.f8911c || width2 * f8 <= width) ? width2 : Math.min(width / f8, width2);
            f4 = f6;
            f5 = f7;
            typeface = typeface2;
        }
        if (width > 0.0f) {
            boolean z4 = this.f8895O != f4;
            boolean z5 = this.f8926j0 != f5;
            boolean z6 = this.f8883C != typeface;
            StaticLayout staticLayout = this.f8928k0;
            boolean z7 = z4 || z5 || (staticLayout != null && (width > ((float) staticLayout.getWidth()) ? 1 : (width == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z6 || this.f8901U;
            this.f8895O = f4;
            this.f8926j0 = f5;
            this.f8883C = typeface;
            this.f8901U = false;
            this.f8902V.setLinearText(this.f8894N != 1.0f);
            r5 = z7;
        }
        if (this.f8888H == null || r5) {
            this.f8902V.setTextSize(this.f8895O);
            this.f8902V.setTypeface(this.f8883C);
            this.f8902V.setLetterSpacing(this.f8926j0);
            this.f8889I = f(this.f8887G);
            StaticLayout k3 = k(j0() ? this.f8938p0 : 1, width, this.f8889I);
            this.f8928k0 = k3;
            this.f8888H = k3.getText();
        }
    }

    public void i0(Typeface typeface) {
        boolean U3 = U(typeface);
        boolean b02 = b0(typeface);
        if (U3 || b02) {
            J();
        }
    }

    public final void j() {
        Bitmap bitmap = this.f8892L;
        if (bitmap != null) {
            bitmap.recycle();
            this.f8892L = null;
        }
    }

    public final boolean j0() {
        if (this.f8938p0 > 1) {
            return (!this.f8889I || this.f8911c) && !this.f8891K;
        }
        return false;
    }

    public final StaticLayout k(int i3, float f3, boolean z3) {
        return (StaticLayout) J.g.g(g.b(this.f8887G, this.f8902V, (int) f3).d(this.f8886F).g(z3).c(i3 == 1 ? Layout.Alignment.ALIGN_NORMAL : y()).f(false).i(i3).h(this.f8940q0, this.f8942r0).e(this.f8944s0).j(null).a());
    }

    public void l(Canvas canvas) {
        int save = canvas.save();
        if (this.f8888H == null || this.f8923i.width() <= 0.0f || this.f8923i.height() <= 0.0f) {
            return;
        }
        this.f8902V.setTextSize(this.f8895O);
        float f3 = this.f8946u;
        float f4 = this.f8947v;
        boolean z3 = this.f8891K && this.f8892L != null;
        float f5 = this.f8894N;
        if (f5 != 1.0f && !this.f8911c) {
            canvas.scale(f5, f5, f3, f4);
        }
        if (z3) {
            canvas.drawBitmap(this.f8892L, f3, f4, this.f8893M);
            canvas.restoreToCount(save);
            return;
        }
        if (!j0() || (this.f8911c && this.f8909b <= this.f8915e)) {
            canvas.translate(f3, f4);
            this.f8928k0.draw(canvas);
        } else {
            m(canvas, this.f8946u - this.f8928k0.getLineStart(0), f4);
        }
        canvas.restoreToCount(save);
    }

    public final void m(Canvas canvas, float f3, float f4) {
        int alpha = this.f8902V.getAlpha();
        canvas.translate(f3, f4);
        if (!this.f8911c) {
            this.f8902V.setAlpha((int) (this.f8934n0 * alpha));
            if (Build.VERSION.SDK_INT >= 31) {
                TextPaint textPaint = this.f8902V;
                textPaint.setShadowLayer(this.f8896P, this.f8897Q, this.f8898R, AbstractC0597a.a(this.f8899S, textPaint.getAlpha()));
            }
            this.f8928k0.draw(canvas);
        }
        if (!this.f8911c) {
            this.f8902V.setAlpha((int) (this.f8932m0 * alpha));
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 31) {
            TextPaint textPaint2 = this.f8902V;
            textPaint2.setShadowLayer(this.f8896P, this.f8897Q, this.f8898R, AbstractC0597a.a(this.f8899S, textPaint2.getAlpha()));
        }
        int lineBaseline = this.f8928k0.getLineBaseline(0);
        CharSequence charSequence = this.f8936o0;
        float f5 = lineBaseline;
        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f5, this.f8902V);
        if (i3 >= 31) {
            this.f8902V.setShadowLayer(this.f8896P, this.f8897Q, this.f8898R, this.f8899S);
        }
        if (this.f8911c) {
            return;
        }
        String trim = this.f8936o0.toString().trim();
        if (trim.endsWith("…")) {
            trim = trim.substring(0, trim.length() - 1);
        }
        String str = trim;
        this.f8902V.setAlpha(alpha);
        canvas.drawText(str, 0, Math.min(this.f8928k0.getLineEnd(0), str.length()), 0.0f, f5, (Paint) this.f8902V);
    }

    public final void n() {
        if (this.f8892L != null || this.f8919g.isEmpty() || TextUtils.isEmpty(this.f8888H)) {
            return;
        }
        g(0.0f);
        int width = this.f8928k0.getWidth();
        int height = this.f8928k0.getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        this.f8892L = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        this.f8928k0.draw(new Canvas(this.f8892L));
        if (this.f8893M == null) {
            this.f8893M = new Paint(3);
        }
    }

    public void o(RectF rectF, int i3, int i4) {
        this.f8889I = f(this.f8887G);
        rectF.left = Math.max(r(i3, i4), this.f8921h.left);
        rectF.top = this.f8921h.top;
        rectF.right = Math.min(s(rectF, i3, i4), this.f8921h.right);
        rectF.bottom = this.f8921h.top + q();
    }

    public ColorStateList p() {
        return this.f8935o;
    }

    public float q() {
        z(this.f8903W);
        return -this.f8903W.ascent();
    }

    public final float r(int i3, int i4) {
        return (i4 == 17 || (i4 & 7) == 1) ? (i3 / 2.0f) - (this.f8930l0 / 2.0f) : ((i4 & 8388613) == 8388613 || (i4 & 5) == 5) ? this.f8889I ? this.f8921h.left : this.f8921h.right - this.f8930l0 : this.f8889I ? this.f8921h.right - this.f8930l0 : this.f8921h.left;
    }

    public final float s(RectF rectF, int i3, int i4) {
        return (i4 == 17 || (i4 & 7) == 1) ? (i3 / 2.0f) + (this.f8930l0 / 2.0f) : ((i4 & 8388613) == 8388613 || (i4 & 5) == 5) ? this.f8889I ? rectF.left + this.f8930l0 : this.f8921h.right : this.f8889I ? this.f8921h.right : rectF.left + this.f8930l0;
    }

    public int t() {
        return u(this.f8935o);
    }

    public final int u(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.f8900T;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final int v() {
        return u(this.f8933n);
    }

    public float w() {
        A(this.f8903W);
        return -this.f8903W.ascent();
    }

    public float x() {
        return this.f8909b;
    }

    public final Layout.Alignment y() {
        int b3 = AbstractC0213s.b(this.f8925j, this.f8889I ? 1 : 0) & 7;
        return b3 != 1 ? b3 != 5 ? this.f8889I ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.f8889I ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
    }

    public final void z(TextPaint textPaint) {
        textPaint.setTextSize(this.f8931m);
        textPaint.setTypeface(this.f8948w);
        textPaint.setLetterSpacing(this.f8922h0);
    }
}
