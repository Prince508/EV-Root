package z1;

import K.O;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import e1.AbstractC0464a;
import f1.AbstractC0474a;
import java.util.ArrayList;
import java.util.List;
import l.C0579t;
import u1.AbstractC0740c;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f10352A;

    /* renamed from: B, reason: collision with root package name */
    public Typeface f10353B;

    /* renamed from: a, reason: collision with root package name */
    public final int f10354a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10355b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10356c;

    /* renamed from: d, reason: collision with root package name */
    public final TimeInterpolator f10357d;

    /* renamed from: e, reason: collision with root package name */
    public final TimeInterpolator f10358e;

    /* renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f10359f;

    /* renamed from: g, reason: collision with root package name */
    public final Context f10360g;

    /* renamed from: h, reason: collision with root package name */
    public final TextInputLayout f10361h;

    /* renamed from: i, reason: collision with root package name */
    public LinearLayout f10362i;

    /* renamed from: j, reason: collision with root package name */
    public int f10363j;

    /* renamed from: k, reason: collision with root package name */
    public FrameLayout f10364k;

    /* renamed from: l, reason: collision with root package name */
    public Animator f10365l;

    /* renamed from: m, reason: collision with root package name */
    public final float f10366m;

    /* renamed from: n, reason: collision with root package name */
    public int f10367n;

    /* renamed from: o, reason: collision with root package name */
    public int f10368o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f10369p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f10370q;

    /* renamed from: r, reason: collision with root package name */
    public TextView f10371r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f10372s;

    /* renamed from: t, reason: collision with root package name */
    public int f10373t;

    /* renamed from: u, reason: collision with root package name */
    public int f10374u;

    /* renamed from: v, reason: collision with root package name */
    public ColorStateList f10375v;

    /* renamed from: w, reason: collision with root package name */
    public CharSequence f10376w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f10377x;

    /* renamed from: y, reason: collision with root package name */
    public TextView f10378y;

    /* renamed from: z, reason: collision with root package name */
    public int f10379z;

    public class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f10380a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TextView f10381b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f10382c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ TextView f10383d;

        public a(int i3, TextView textView, int i4, TextView textView2) {
            this.f10380a = i3;
            this.f10381b = textView;
            this.f10382c = i4;
            this.f10383d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            u.this.f10367n = this.f10380a;
            u.this.f10365l = null;
            TextView textView = this.f10381b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f10382c == 1 && u.this.f10371r != null) {
                    u.this.f10371r.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f10383d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f10383d.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f10383d;
            if (textView != null) {
                textView.setVisibility(0);
                this.f10383d.setAlpha(0.0f);
            }
        }
    }

    public class b extends View.AccessibilityDelegate {
        public b() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            EditText editText = u.this.f10361h.getEditText();
            if (editText != null) {
                accessibilityNodeInfo.setLabeledBy(editText);
            }
        }
    }

    public u(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f10360g = context;
        this.f10361h = textInputLayout;
        this.f10366m = context.getResources().getDimensionPixelSize(e1.c.f6843e);
        int i3 = AbstractC0464a.f6806x;
        this.f10354a = t1.d.f(context, i3, 217);
        this.f10355b = t1.d.f(context, AbstractC0464a.f6803u, 167);
        this.f10356c = t1.d.f(context, i3, 167);
        int i4 = AbstractC0464a.f6807y;
        this.f10357d = t1.d.g(context, i4, AbstractC0474a.f7197d);
        TimeInterpolator timeInterpolator = AbstractC0474a.f7194a;
        this.f10358e = t1.d.g(context, i4, timeInterpolator);
        this.f10359f = t1.d.g(context, AbstractC0464a.f6776A, timeInterpolator);
    }

    public boolean A() {
        return this.f10370q;
    }

    public boolean B() {
        return this.f10377x;
    }

    public void C(TextView textView, int i3) {
        FrameLayout frameLayout;
        if (this.f10362i == null) {
            return;
        }
        if (!z(i3) || (frameLayout = this.f10364k) == null) {
            this.f10362i.removeView(textView);
        } else {
            frameLayout.removeView(textView);
        }
        int i4 = this.f10363j - 1;
        this.f10363j = i4;
        O(this.f10362i, i4);
    }

    public final void D(int i3, int i4) {
        TextView m3;
        TextView m4;
        if (i3 == i4) {
            return;
        }
        if (i4 != 0 && (m4 = m(i4)) != null) {
            m4.setVisibility(0);
            m4.setAlpha(1.0f);
        }
        if (i3 != 0 && (m3 = m(i3)) != null) {
            m3.setVisibility(4);
            if (i3 == 1) {
                m3.setText((CharSequence) null);
            }
        }
        this.f10367n = i4;
    }

    public void E(int i3) {
        this.f10373t = i3;
        TextView textView = this.f10371r;
        if (textView != null) {
            O.l0(textView, i3);
        }
    }

    public void F(CharSequence charSequence) {
        this.f10372s = charSequence;
        TextView textView = this.f10371r;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    public void G(boolean z3) {
        if (this.f10370q == z3) {
            return;
        }
        h();
        if (z3) {
            C0579t c0579t = new C0579t(this.f10360g);
            this.f10371r = c0579t;
            c0579t.setId(e1.e.f6880I);
            this.f10371r.setTextAlignment(5);
            Typeface typeface = this.f10353B;
            if (typeface != null) {
                this.f10371r.setTypeface(typeface);
            }
            H(this.f10374u);
            I(this.f10375v);
            F(this.f10372s);
            E(this.f10373t);
            this.f10371r.setVisibility(4);
            e(this.f10371r, 0);
        } else {
            w();
            C(this.f10371r, 0);
            this.f10371r = null;
            this.f10361h.n0();
            this.f10361h.y0();
        }
        this.f10370q = z3;
    }

    public void H(int i3) {
        this.f10374u = i3;
        TextView textView = this.f10371r;
        if (textView != null) {
            this.f10361h.a0(textView, i3);
        }
    }

    public void I(ColorStateList colorStateList) {
        this.f10375v = colorStateList;
        TextView textView = this.f10371r;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public void J(int i3) {
        this.f10379z = i3;
        TextView textView = this.f10378y;
        if (textView != null) {
            Q.g.n(textView, i3);
        }
    }

    public void K(boolean z3) {
        if (this.f10377x == z3) {
            return;
        }
        h();
        if (z3) {
            C0579t c0579t = new C0579t(this.f10360g);
            this.f10378y = c0579t;
            c0579t.setId(e1.e.f6881J);
            this.f10378y.setTextAlignment(5);
            Typeface typeface = this.f10353B;
            if (typeface != null) {
                this.f10378y.setTypeface(typeface);
            }
            this.f10378y.setVisibility(4);
            O.l0(this.f10378y, 1);
            J(this.f10379z);
            L(this.f10352A);
            e(this.f10378y, 1);
            this.f10378y.setAccessibilityDelegate(new b());
        } else {
            x();
            C(this.f10378y, 1);
            this.f10378y = null;
            this.f10361h.n0();
            this.f10361h.y0();
        }
        this.f10377x = z3;
    }

    public void L(ColorStateList colorStateList) {
        this.f10352A = colorStateList;
        TextView textView = this.f10378y;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public final void M(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    public void N(Typeface typeface) {
        if (typeface != this.f10353B) {
            this.f10353B = typeface;
            M(this.f10371r, typeface);
            M(this.f10378y, typeface);
        }
    }

    public final void O(ViewGroup viewGroup, int i3) {
        if (i3 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    public final boolean P(TextView textView, CharSequence charSequence) {
        if (O.O(this.f10361h) && this.f10361h.isEnabled()) {
            return (this.f10368o == this.f10367n && textView != null && TextUtils.equals(textView.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    public void Q(CharSequence charSequence) {
        h();
        this.f10369p = charSequence;
        this.f10371r.setText(charSequence);
        int i3 = this.f10367n;
        if (i3 != 1) {
            this.f10368o = 1;
        }
        S(i3, this.f10368o, P(this.f10371r, charSequence));
    }

    public void R(CharSequence charSequence) {
        h();
        this.f10376w = charSequence;
        this.f10378y.setText(charSequence);
        int i3 = this.f10367n;
        if (i3 != 2) {
            this.f10368o = 2;
        }
        S(i3, this.f10368o, P(this.f10378y, charSequence));
    }

    public final void S(int i3, int i4, boolean z3) {
        u uVar;
        if (i3 == i4) {
            return;
        }
        if (z3) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f10365l = animatorSet;
            ArrayList arrayList = new ArrayList();
            uVar = this;
            uVar.i(arrayList, this.f10377x, this.f10378y, 2, i3, i4);
            uVar.i(arrayList, uVar.f10370q, uVar.f10371r, 1, i3, i4);
            f1.b.a(animatorSet, arrayList);
            animatorSet.addListener(uVar.new a(i4, m(i3), i3, m(i4)));
            animatorSet.start();
        } else {
            uVar = this;
            D(i3, i4);
        }
        uVar.f10361h.n0();
        uVar.f10361h.s0(z3);
        uVar.f10361h.y0();
    }

    public void e(TextView textView, int i3) {
        if (this.f10362i == null && this.f10364k == null) {
            LinearLayout linearLayout = new LinearLayout(this.f10360g);
            this.f10362i = linearLayout;
            linearLayout.setOrientation(0);
            this.f10361h.addView(this.f10362i, -1, -2);
            this.f10364k = new FrameLayout(this.f10360g);
            this.f10362i.addView(this.f10364k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f10361h.getEditText() != null) {
                f();
            }
        }
        if (z(i3)) {
            this.f10364k.setVisibility(0);
            this.f10364k.addView(textView);
        } else {
            this.f10362i.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f10362i.setVisibility(0);
        this.f10363j++;
    }

    public void f() {
        if (g()) {
            EditText editText = this.f10361h.getEditText();
            boolean f3 = AbstractC0740c.f(this.f10360g);
            LinearLayout linearLayout = this.f10362i;
            int i3 = e1.c.f6815A;
            O.w0(linearLayout, v(f3, i3, O.B(editText)), v(f3, e1.c.f6816B, this.f10360g.getResources().getDimensionPixelSize(e1.c.f6864z)), v(f3, i3, O.A(editText)), 0);
        }
    }

    public final boolean g() {
        return (this.f10362i == null || this.f10361h.getEditText() == null) ? false : true;
    }

    public void h() {
        Animator animator = this.f10365l;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void i(List list, boolean z3, TextView textView, int i3, int i4, int i5) {
        if (textView == null || !z3) {
            return;
        }
        if (i3 == i5 || i3 == i4) {
            ObjectAnimator j3 = j(textView, i5 == i3);
            if (i3 == i5 && i4 != 0) {
                j3.setStartDelay(this.f10356c);
            }
            list.add(j3);
            if (i5 != i3 || i4 == 0) {
                return;
            }
            ObjectAnimator k3 = k(textView);
            k3.setStartDelay(this.f10356c);
            list.add(k3);
        }
    }

    public final ObjectAnimator j(TextView textView, boolean z3) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z3 ? 1.0f : 0.0f);
        ofFloat.setDuration(z3 ? this.f10355b : this.f10356c);
        ofFloat.setInterpolator(z3 ? this.f10358e : this.f10359f);
        return ofFloat;
    }

    public final ObjectAnimator k(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f10366m, 0.0f);
        ofFloat.setDuration(this.f10354a);
        ofFloat.setInterpolator(this.f10357d);
        return ofFloat;
    }

    public boolean l() {
        return y(this.f10368o);
    }

    public final TextView m(int i3) {
        if (i3 == 1) {
            return this.f10371r;
        }
        if (i3 != 2) {
            return null;
        }
        return this.f10378y;
    }

    public int n() {
        return this.f10373t;
    }

    public CharSequence o() {
        return this.f10372s;
    }

    public CharSequence p() {
        return this.f10369p;
    }

    public int q() {
        TextView textView = this.f10371r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public ColorStateList r() {
        TextView textView = this.f10371r;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    public CharSequence s() {
        return this.f10376w;
    }

    public View t() {
        return this.f10378y;
    }

    public int u() {
        TextView textView = this.f10378y;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public final int v(boolean z3, int i3, int i4) {
        return z3 ? this.f10360g.getResources().getDimensionPixelSize(i3) : i4;
    }

    public void w() {
        this.f10369p = null;
        h();
        if (this.f10367n == 1) {
            if (!this.f10377x || TextUtils.isEmpty(this.f10376w)) {
                this.f10368o = 0;
            } else {
                this.f10368o = 2;
            }
        }
        S(this.f10367n, this.f10368o, P(this.f10371r, ""));
    }

    public void x() {
        h();
        int i3 = this.f10367n;
        if (i3 == 2) {
            this.f10368o = 0;
        }
        S(i3, this.f10368o, P(this.f10378y, ""));
    }

    public final boolean y(int i3) {
        return (i3 != 1 || this.f10371r == null || TextUtils.isEmpty(this.f10369p)) ? false : true;
    }

    public boolean z(int i3) {
        return i3 == 0 || i3 == 1;
    }
}
