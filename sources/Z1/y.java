package z1;

import K.AbstractC0214t;
import K.O;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import l.C0552S;
import l.C0579t;
import u1.AbstractC0740c;

/* loaded from: classes.dex */
public class y extends LinearLayout {

    /* renamed from: e, reason: collision with root package name */
    public final TextInputLayout f10390e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f10391f;

    /* renamed from: g, reason: collision with root package name */
    public CharSequence f10392g;

    /* renamed from: h, reason: collision with root package name */
    public final CheckableImageButton f10393h;

    /* renamed from: i, reason: collision with root package name */
    public ColorStateList f10394i;

    /* renamed from: j, reason: collision with root package name */
    public PorterDuff.Mode f10395j;

    /* renamed from: k, reason: collision with root package name */
    public int f10396k;

    /* renamed from: l, reason: collision with root package name */
    public ImageView.ScaleType f10397l;

    /* renamed from: m, reason: collision with root package name */
    public View.OnLongClickListener f10398m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f10399n;

    public y(TextInputLayout textInputLayout, C0552S c0552s) {
        super(textInputLayout.getContext());
        this.f10390e = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(e1.g.f6914c, (ViewGroup) this, false);
        this.f10393h = checkableImageButton;
        t.e(checkableImageButton);
        C0579t c0579t = new C0579t(getContext());
        this.f10391f = c0579t;
        j(c0552s);
        i(c0552s);
        addView(checkableImageButton);
        addView(c0579t);
    }

    public void A(L.x xVar) {
        if (this.f10391f.getVisibility() != 0) {
            xVar.G0(this.f10393h);
        } else {
            xVar.u0(this.f10391f);
            xVar.G0(this.f10391f);
        }
    }

    public void B() {
        EditText editText = this.f10390e.f5561h;
        if (editText == null) {
            return;
        }
        O.w0(this.f10391f, k() ? 0 : O.B(editText), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(e1.c.f6817C), editText.getCompoundPaddingBottom());
    }

    public final void C() {
        int i3 = (this.f10392g == null || this.f10399n) ? 8 : 0;
        setVisibility((this.f10393h.getVisibility() == 0 || i3 == 0) ? 0 : 8);
        this.f10391f.setVisibility(i3);
        this.f10390e.m0();
    }

    public CharSequence a() {
        return this.f10392g;
    }

    public ColorStateList b() {
        return this.f10391f.getTextColors();
    }

    public int c() {
        return O.B(this) + O.B(this.f10391f) + (k() ? this.f10393h.getMeasuredWidth() + AbstractC0214t.a((ViewGroup.MarginLayoutParams) this.f10393h.getLayoutParams()) : 0);
    }

    public TextView d() {
        return this.f10391f;
    }

    public CharSequence e() {
        return this.f10393h.getContentDescription();
    }

    public Drawable f() {
        return this.f10393h.getDrawable();
    }

    public int g() {
        return this.f10396k;
    }

    public ImageView.ScaleType h() {
        return this.f10397l;
    }

    public final void i(C0552S c0552s) {
        this.f10391f.setVisibility(8);
        this.f10391f.setId(e1.e.f6883L);
        this.f10391f.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        O.l0(this.f10391f, 1);
        o(c0552s.m(e1.j.X5, 0));
        int i3 = e1.j.Y5;
        if (c0552s.q(i3)) {
            p(c0552s.c(i3));
        }
        n(c0552s.o(e1.j.W5));
    }

    public final void j(C0552S c0552s) {
        if (AbstractC0740c.f(getContext())) {
            AbstractC0214t.c((ViewGroup.MarginLayoutParams) this.f10393h.getLayoutParams(), 0);
        }
        u(null);
        v(null);
        int i3 = e1.j.e6;
        if (c0552s.q(i3)) {
            this.f10394i = AbstractC0740c.b(getContext(), c0552s, i3);
        }
        int i4 = e1.j.f6;
        if (c0552s.q(i4)) {
            this.f10395j = r1.n.h(c0552s.j(i4, -1), null);
        }
        int i5 = e1.j.b6;
        if (c0552s.q(i5)) {
            s(c0552s.g(i5));
            int i6 = e1.j.a6;
            if (c0552s.q(i6)) {
                r(c0552s.o(i6));
            }
            q(c0552s.a(e1.j.Z5, true));
        }
        t(c0552s.f(e1.j.c6, getResources().getDimensionPixelSize(e1.c.f6832R)));
        int i7 = e1.j.d6;
        if (c0552s.q(i7)) {
            w(t.b(c0552s.j(i7, -1)));
        }
    }

    public boolean k() {
        return this.f10393h.getVisibility() == 0;
    }

    public void l(boolean z3) {
        this.f10399n = z3;
        C();
    }

    public void m() {
        t.d(this.f10390e, this.f10393h, this.f10394i);
    }

    public void n(CharSequence charSequence) {
        this.f10392g = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f10391f.setText(charSequence);
        C();
    }

    public void o(int i3) {
        Q.g.n(this.f10391f, i3);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i3, int i4) {
        super.onMeasure(i3, i4);
        B();
    }

    public void p(ColorStateList colorStateList) {
        this.f10391f.setTextColor(colorStateList);
    }

    public void q(boolean z3) {
        this.f10393h.setCheckable(z3);
    }

    public void r(CharSequence charSequence) {
        if (e() != charSequence) {
            this.f10393h.setContentDescription(charSequence);
        }
    }

    public void s(Drawable drawable) {
        this.f10393h.setImageDrawable(drawable);
        if (drawable != null) {
            t.a(this.f10390e, this.f10393h, this.f10394i, this.f10395j);
            z(true);
            m();
        } else {
            z(false);
            u(null);
            v(null);
            r(null);
        }
    }

    public void t(int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i3 != this.f10396k) {
            this.f10396k = i3;
            t.g(this.f10393h, i3);
        }
    }

    public void u(View.OnClickListener onClickListener) {
        t.h(this.f10393h, onClickListener, this.f10398m);
    }

    public void v(View.OnLongClickListener onLongClickListener) {
        this.f10398m = onLongClickListener;
        t.i(this.f10393h, onLongClickListener);
    }

    public void w(ImageView.ScaleType scaleType) {
        this.f10397l = scaleType;
        t.j(this.f10393h, scaleType);
    }

    public void x(ColorStateList colorStateList) {
        if (this.f10394i != colorStateList) {
            this.f10394i = colorStateList;
            t.a(this.f10390e, this.f10393h, colorStateList, this.f10395j);
        }
    }

    public void y(PorterDuff.Mode mode) {
        if (this.f10395j != mode) {
            this.f10395j = mode;
            t.a(this.f10390e, this.f10393h, this.f10394i, mode);
        }
    }

    public void z(boolean z3) {
        if (k() != z3) {
            this.f10393h.setVisibility(z3 ? 0 : 8);
            B();
            C();
        }
    }
}
