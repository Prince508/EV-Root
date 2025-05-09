package com.google.android.material.textfield;

import K.AbstractC0214t;
import K.O;
import L.c;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import e1.e;
import e1.g;
import e1.h;
import f.AbstractC0467a;
import j.AbstractC0515e;
import java.util.Iterator;
import java.util.LinkedHashSet;
import l.C0552S;
import l.C0579t;
import r1.j;
import r1.n;
import u1.AbstractC0740c;
import z1.C0800f;
import z1.C0801g;
import z1.q;
import z1.s;
import z1.t;
import z1.v;
import z1.x;

/* loaded from: classes.dex */
public class a extends LinearLayout {

    /* renamed from: A, reason: collision with root package name */
    public final TextInputLayout.f f5607A;

    /* renamed from: e, reason: collision with root package name */
    public final TextInputLayout f5608e;

    /* renamed from: f, reason: collision with root package name */
    public final FrameLayout f5609f;

    /* renamed from: g, reason: collision with root package name */
    public final CheckableImageButton f5610g;

    /* renamed from: h, reason: collision with root package name */
    public ColorStateList f5611h;

    /* renamed from: i, reason: collision with root package name */
    public PorterDuff.Mode f5612i;

    /* renamed from: j, reason: collision with root package name */
    public View.OnLongClickListener f5613j;

    /* renamed from: k, reason: collision with root package name */
    public final CheckableImageButton f5614k;

    /* renamed from: l, reason: collision with root package name */
    public final d f5615l;

    /* renamed from: m, reason: collision with root package name */
    public int f5616m;

    /* renamed from: n, reason: collision with root package name */
    public final LinkedHashSet f5617n;

    /* renamed from: o, reason: collision with root package name */
    public ColorStateList f5618o;

    /* renamed from: p, reason: collision with root package name */
    public PorterDuff.Mode f5619p;

    /* renamed from: q, reason: collision with root package name */
    public int f5620q;

    /* renamed from: r, reason: collision with root package name */
    public ImageView.ScaleType f5621r;

    /* renamed from: s, reason: collision with root package name */
    public View.OnLongClickListener f5622s;

    /* renamed from: t, reason: collision with root package name */
    public CharSequence f5623t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f5624u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f5625v;

    /* renamed from: w, reason: collision with root package name */
    public EditText f5626w;

    /* renamed from: x, reason: collision with root package name */
    public final AccessibilityManager f5627x;

    /* renamed from: y, reason: collision with root package name */
    public c.a f5628y;

    /* renamed from: z, reason: collision with root package name */
    public final TextWatcher f5629z;

    /* renamed from: com.google.android.material.textfield.a$a, reason: collision with other inner class name */
    public class C0111a extends j {
        public C0111a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            a.this.m().a(editable);
        }

        @Override // r1.j, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
            a.this.m().b(charSequence, i3, i4, i5);
        }
    }

    public class b implements TextInputLayout.f {
        public b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.f
        public void a(TextInputLayout textInputLayout) {
            if (a.this.f5626w == textInputLayout.getEditText()) {
                return;
            }
            if (a.this.f5626w != null) {
                a.this.f5626w.removeTextChangedListener(a.this.f5629z);
                if (a.this.f5626w.getOnFocusChangeListener() == a.this.m().e()) {
                    a.this.f5626w.setOnFocusChangeListener(null);
                }
            }
            a.this.f5626w = textInputLayout.getEditText();
            if (a.this.f5626w != null) {
                a.this.f5626w.addTextChangedListener(a.this.f5629z);
            }
            a.this.m().n(a.this.f5626w);
            a aVar = a.this;
            aVar.h0(aVar.m());
        }
    }

    public class c implements View.OnAttachStateChangeListener {
        public c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            a.this.g();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            a.this.M();
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final SparseArray f5633a = new SparseArray();

        /* renamed from: b, reason: collision with root package name */
        public final a f5634b;

        /* renamed from: c, reason: collision with root package name */
        public final int f5635c;

        /* renamed from: d, reason: collision with root package name */
        public final int f5636d;

        public d(a aVar, C0552S c0552s) {
            this.f5634b = aVar;
            this.f5635c = c0552s.m(e1.j.r5, 0);
            this.f5636d = c0552s.m(e1.j.P5, 0);
        }

        public final s b(int i3) {
            if (i3 == -1) {
                return new C0801g(this.f5634b);
            }
            if (i3 == 0) {
                return new v(this.f5634b);
            }
            if (i3 == 1) {
                return new x(this.f5634b, this.f5636d);
            }
            if (i3 == 2) {
                return new C0800f(this.f5634b);
            }
            if (i3 == 3) {
                return new q(this.f5634b);
            }
            throw new IllegalArgumentException("Invalid end icon mode: " + i3);
        }

        public s c(int i3) {
            s sVar = (s) this.f5633a.get(i3);
            if (sVar != null) {
                return sVar;
            }
            s b3 = b(i3);
            this.f5633a.append(i3, b3);
            return b3;
        }
    }

    public a(TextInputLayout textInputLayout, C0552S c0552s) {
        super(textInputLayout.getContext());
        this.f5616m = 0;
        this.f5617n = new LinkedHashSet();
        this.f5629z = new C0111a();
        b bVar = new b();
        this.f5607A = bVar;
        this.f5627x = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f5608e = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f5609f = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton i3 = i(this, from, e.f6878G);
        this.f5610g = i3;
        CheckableImageButton i4 = i(frameLayout, from, e.f6877F);
        this.f5614k = i4;
        this.f5615l = new d(this, c0552s);
        C0579t c0579t = new C0579t(getContext());
        this.f5624u = c0579t;
        C(c0552s);
        B(c0552s);
        D(c0552s);
        frameLayout.addView(i4);
        addView(c0579t);
        addView(frameLayout);
        addView(i3);
        textInputLayout.i(bVar);
        addOnAttachStateChangeListener(new c());
    }

    public boolean A() {
        return this.f5616m != 0;
    }

    public final void B(C0552S c0552s) {
        int i3 = e1.j.Q5;
        if (!c0552s.q(i3)) {
            int i4 = e1.j.v5;
            if (c0552s.q(i4)) {
                this.f5618o = AbstractC0740c.b(getContext(), c0552s, i4);
            }
            int i5 = e1.j.w5;
            if (c0552s.q(i5)) {
                this.f5619p = n.h(c0552s.j(i5, -1), null);
            }
        }
        int i6 = e1.j.t5;
        if (c0552s.q(i6)) {
            U(c0552s.j(i6, 0));
            int i7 = e1.j.q5;
            if (c0552s.q(i7)) {
                Q(c0552s.o(i7));
            }
            O(c0552s.a(e1.j.p5, true));
        } else if (c0552s.q(i3)) {
            int i8 = e1.j.R5;
            if (c0552s.q(i8)) {
                this.f5618o = AbstractC0740c.b(getContext(), c0552s, i8);
            }
            int i9 = e1.j.S5;
            if (c0552s.q(i9)) {
                this.f5619p = n.h(c0552s.j(i9, -1), null);
            }
            U(c0552s.a(i3, false) ? 1 : 0);
            Q(c0552s.o(e1.j.O5));
        }
        T(c0552s.f(e1.j.s5, getResources().getDimensionPixelSize(e1.c.f6832R)));
        int i10 = e1.j.u5;
        if (c0552s.q(i10)) {
            X(t.b(c0552s.j(i10, -1)));
        }
    }

    public final void C(C0552S c0552s) {
        int i3 = e1.j.B5;
        if (c0552s.q(i3)) {
            this.f5611h = AbstractC0740c.b(getContext(), c0552s, i3);
        }
        int i4 = e1.j.C5;
        if (c0552s.q(i4)) {
            this.f5612i = n.h(c0552s.j(i4, -1), null);
        }
        int i5 = e1.j.A5;
        if (c0552s.q(i5)) {
            c0(c0552s.g(i5));
        }
        this.f5610g.setContentDescription(getResources().getText(h.f6934f));
        O.r0(this.f5610g, 2);
        this.f5610g.setClickable(false);
        this.f5610g.setPressable(false);
        this.f5610g.setFocusable(false);
    }

    public final void D(C0552S c0552s) {
        this.f5624u.setVisibility(8);
        this.f5624u.setId(e.f6884M);
        this.f5624u.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        O.l0(this.f5624u, 1);
        q0(c0552s.m(e1.j.h6, 0));
        int i3 = e1.j.i6;
        if (c0552s.q(i3)) {
            r0(c0552s.c(i3));
        }
        p0(c0552s.o(e1.j.g6));
    }

    public boolean E() {
        return A() && this.f5614k.isChecked();
    }

    public boolean F() {
        return this.f5609f.getVisibility() == 0 && this.f5614k.getVisibility() == 0;
    }

    public boolean G() {
        return this.f5610g.getVisibility() == 0;
    }

    public void H(boolean z3) {
        this.f5625v = z3;
        y0();
    }

    public void I() {
        w0();
        K();
        J();
        if (m().t()) {
            u0(this.f5608e.b0());
        }
    }

    public void J() {
        t.d(this.f5608e, this.f5614k, this.f5618o);
    }

    public void K() {
        t.d(this.f5608e, this.f5610g, this.f5611h);
    }

    public void L(boolean z3) {
        boolean z4;
        boolean isActivated;
        boolean isChecked;
        s m3 = m();
        boolean z5 = true;
        if (!m3.l() || (isChecked = this.f5614k.isChecked()) == m3.m()) {
            z4 = false;
        } else {
            this.f5614k.setChecked(!isChecked);
            z4 = true;
        }
        if (!m3.j() || (isActivated = this.f5614k.isActivated()) == m3.k()) {
            z5 = z4;
        } else {
            N(!isActivated);
        }
        if (z3 || z5) {
            J();
        }
    }

    public final void M() {
        AccessibilityManager accessibilityManager;
        c.a aVar = this.f5628y;
        if (aVar == null || (accessibilityManager = this.f5627x) == null) {
            return;
        }
        L.c.b(accessibilityManager, aVar);
    }

    public void N(boolean z3) {
        this.f5614k.setActivated(z3);
    }

    public void O(boolean z3) {
        this.f5614k.setCheckable(z3);
    }

    public void P(int i3) {
        Q(i3 != 0 ? getResources().getText(i3) : null);
    }

    public void Q(CharSequence charSequence) {
        if (l() != charSequence) {
            this.f5614k.setContentDescription(charSequence);
        }
    }

    public void R(int i3) {
        S(i3 != 0 ? AbstractC0467a.b(getContext(), i3) : null);
    }

    public void S(Drawable drawable) {
        this.f5614k.setImageDrawable(drawable);
        if (drawable != null) {
            t.a(this.f5608e, this.f5614k, this.f5618o, this.f5619p);
            J();
        }
    }

    public void T(int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i3 != this.f5620q) {
            this.f5620q = i3;
            t.g(this.f5614k, i3);
            t.g(this.f5610g, i3);
        }
    }

    public void U(int i3) {
        if (this.f5616m == i3) {
            return;
        }
        t0(m());
        int i4 = this.f5616m;
        this.f5616m = i3;
        j(i4);
        a0(i3 != 0);
        s m3 = m();
        R(t(m3));
        P(m3.c());
        O(m3.l());
        if (!m3.i(this.f5608e.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + this.f5608e.getBoxBackgroundMode() + " is not supported by the end icon mode " + i3);
        }
        s0(m3);
        V(m3.f());
        EditText editText = this.f5626w;
        if (editText != null) {
            m3.n(editText);
            h0(m3);
        }
        t.a(this.f5608e, this.f5614k, this.f5618o, this.f5619p);
        L(true);
    }

    public void V(View.OnClickListener onClickListener) {
        t.h(this.f5614k, onClickListener, this.f5622s);
    }

    public void W(View.OnLongClickListener onLongClickListener) {
        this.f5622s = onLongClickListener;
        t.i(this.f5614k, onLongClickListener);
    }

    public void X(ImageView.ScaleType scaleType) {
        this.f5621r = scaleType;
        t.j(this.f5614k, scaleType);
        t.j(this.f5610g, scaleType);
    }

    public void Y(ColorStateList colorStateList) {
        if (this.f5618o != colorStateList) {
            this.f5618o = colorStateList;
            t.a(this.f5608e, this.f5614k, colorStateList, this.f5619p);
        }
    }

    public void Z(PorterDuff.Mode mode) {
        if (this.f5619p != mode) {
            this.f5619p = mode;
            t.a(this.f5608e, this.f5614k, this.f5618o, mode);
        }
    }

    public void a0(boolean z3) {
        if (F() != z3) {
            this.f5614k.setVisibility(z3 ? 0 : 8);
            v0();
            x0();
            this.f5608e.m0();
        }
    }

    public void b0(int i3) {
        c0(i3 != 0 ? AbstractC0467a.b(getContext(), i3) : null);
        K();
    }

    public void c0(Drawable drawable) {
        this.f5610g.setImageDrawable(drawable);
        w0();
        t.a(this.f5608e, this.f5610g, this.f5611h, this.f5612i);
    }

    public void d0(View.OnClickListener onClickListener) {
        t.h(this.f5610g, onClickListener, this.f5613j);
    }

    public void e0(View.OnLongClickListener onLongClickListener) {
        this.f5613j = onLongClickListener;
        t.i(this.f5610g, onLongClickListener);
    }

    public void f0(ColorStateList colorStateList) {
        if (this.f5611h != colorStateList) {
            this.f5611h = colorStateList;
            t.a(this.f5608e, this.f5610g, colorStateList, this.f5612i);
        }
    }

    public final void g() {
        if (this.f5628y == null || this.f5627x == null || !O.N(this)) {
            return;
        }
        L.c.a(this.f5627x, this.f5628y);
    }

    public void g0(PorterDuff.Mode mode) {
        if (this.f5612i != mode) {
            this.f5612i = mode;
            t.a(this.f5608e, this.f5610g, this.f5611h, mode);
        }
    }

    public void h() {
        this.f5614k.performClick();
        this.f5614k.jumpDrawablesToCurrentState();
    }

    public final void h0(s sVar) {
        if (this.f5626w == null) {
            return;
        }
        if (sVar.e() != null) {
            this.f5626w.setOnFocusChangeListener(sVar.e());
        }
        if (sVar.g() != null) {
            this.f5614k.setOnFocusChangeListener(sVar.g());
        }
    }

    public final CheckableImageButton i(ViewGroup viewGroup, LayoutInflater layoutInflater, int i3) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(g.f6913b, viewGroup, false);
        checkableImageButton.setId(i3);
        t.e(checkableImageButton);
        if (AbstractC0740c.f(getContext())) {
            AbstractC0214t.d((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    public void i0(int i3) {
        j0(i3 != 0 ? getResources().getText(i3) : null);
    }

    public final void j(int i3) {
        Iterator it = this.f5617n.iterator();
        if (it.hasNext()) {
            AbstractC0515e.a(it.next());
            throw null;
        }
    }

    public void j0(CharSequence charSequence) {
        this.f5614k.setContentDescription(charSequence);
    }

    public CheckableImageButton k() {
        if (G()) {
            return this.f5610g;
        }
        if (A() && F()) {
            return this.f5614k;
        }
        return null;
    }

    public void k0(int i3) {
        l0(i3 != 0 ? AbstractC0467a.b(getContext(), i3) : null);
    }

    public CharSequence l() {
        return this.f5614k.getContentDescription();
    }

    public void l0(Drawable drawable) {
        this.f5614k.setImageDrawable(drawable);
    }

    public s m() {
        return this.f5615l.c(this.f5616m);
    }

    public void m0(boolean z3) {
        if (z3 && this.f5616m != 1) {
            U(1);
        } else {
            if (z3) {
                return;
            }
            U(0);
        }
    }

    public Drawable n() {
        return this.f5614k.getDrawable();
    }

    public void n0(ColorStateList colorStateList) {
        this.f5618o = colorStateList;
        t.a(this.f5608e, this.f5614k, colorStateList, this.f5619p);
    }

    public int o() {
        return this.f5620q;
    }

    public void o0(PorterDuff.Mode mode) {
        this.f5619p = mode;
        t.a(this.f5608e, this.f5614k, this.f5618o, mode);
    }

    public int p() {
        return this.f5616m;
    }

    public void p0(CharSequence charSequence) {
        this.f5623t = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f5624u.setText(charSequence);
        y0();
    }

    public ImageView.ScaleType q() {
        return this.f5621r;
    }

    public void q0(int i3) {
        Q.g.n(this.f5624u, i3);
    }

    public CheckableImageButton r() {
        return this.f5614k;
    }

    public void r0(ColorStateList colorStateList) {
        this.f5624u.setTextColor(colorStateList);
    }

    public Drawable s() {
        return this.f5610g.getDrawable();
    }

    public final void s0(s sVar) {
        sVar.s();
        this.f5628y = sVar.h();
        g();
    }

    public final int t(s sVar) {
        int i3 = this.f5615l.f5635c;
        return i3 == 0 ? sVar.d() : i3;
    }

    public final void t0(s sVar) {
        M();
        this.f5628y = null;
        sVar.u();
    }

    public CharSequence u() {
        return this.f5614k.getContentDescription();
    }

    public final void u0(boolean z3) {
        if (!z3 || n() == null) {
            t.a(this.f5608e, this.f5614k, this.f5618o, this.f5619p);
            return;
        }
        Drawable mutate = D.a.l(n()).mutate();
        D.a.h(mutate, this.f5608e.getErrorCurrentTextColors());
        this.f5614k.setImageDrawable(mutate);
    }

    public Drawable v() {
        return this.f5614k.getDrawable();
    }

    public final void v0() {
        this.f5609f.setVisibility((this.f5614k.getVisibility() != 0 || G()) ? 8 : 0);
        setVisibility((F() || G() || !((this.f5623t == null || this.f5625v) ? 8 : false)) ? 0 : 8);
    }

    public CharSequence w() {
        return this.f5623t;
    }

    public final void w0() {
        this.f5610g.setVisibility(s() != null && this.f5608e.N() && this.f5608e.b0() ? 0 : 8);
        v0();
        x0();
        if (A()) {
            return;
        }
        this.f5608e.m0();
    }

    public ColorStateList x() {
        return this.f5624u.getTextColors();
    }

    public void x0() {
        if (this.f5608e.f5561h == null) {
            return;
        }
        O.w0(this.f5624u, getContext().getResources().getDimensionPixelSize(e1.c.f6817C), this.f5608e.f5561h.getPaddingTop(), (F() || G()) ? 0 : O.A(this.f5608e.f5561h), this.f5608e.f5561h.getPaddingBottom());
    }

    public int y() {
        return O.A(this) + O.A(this.f5624u) + ((F() || G()) ? this.f5614k.getMeasuredWidth() + AbstractC0214t.b((ViewGroup.MarginLayoutParams) this.f5614k.getLayoutParams()) : 0);
    }

    public final void y0() {
        int visibility = this.f5624u.getVisibility();
        int i3 = (this.f5623t == null || this.f5625v) ? 8 : 0;
        if (visibility != i3) {
            m().q(i3 == 0);
        }
        v0();
        this.f5624u.setVisibility(i3);
        this.f5608e.m0();
    }

    public TextView z() {
        return this.f5624u;
    }
}
