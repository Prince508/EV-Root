package com.google.android.material.textfield;

import K.AbstractC0214t;
import K.C0184a;
import K.O;
import L.x;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.view.autofill.AutofillId;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import e1.AbstractC0464a;
import e1.h;
import e1.i;
import f.AbstractC0467a;
import f1.AbstractC0474a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import l.AbstractC0537C;
import l.C0567h;
import l.C0579t;
import m1.AbstractC0597a;
import r1.AbstractC0679b;
import r1.C0678a;
import r1.n;
import s0.C0707c;
import s0.t;
import u1.AbstractC0740c;
import x1.k;
import z1.AbstractC0802h;
import z1.r;
import z1.u;
import z1.y;

/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: G0, reason: collision with root package name */
    public static final int f5520G0 = i.f6952d;

    /* renamed from: H0, reason: collision with root package name */
    public static final int[][] f5521H0 = {new int[]{R.attr.state_pressed}, new int[0]};

    /* renamed from: A, reason: collision with root package name */
    public C0707c f5522A;

    /* renamed from: A0, reason: collision with root package name */
    public boolean f5523A0;

    /* renamed from: B, reason: collision with root package name */
    public C0707c f5524B;

    /* renamed from: B0, reason: collision with root package name */
    public boolean f5525B0;

    /* renamed from: C, reason: collision with root package name */
    public ColorStateList f5526C;

    /* renamed from: C0, reason: collision with root package name */
    public ValueAnimator f5527C0;

    /* renamed from: D, reason: collision with root package name */
    public ColorStateList f5528D;

    /* renamed from: D0, reason: collision with root package name */
    public boolean f5529D0;

    /* renamed from: E, reason: collision with root package name */
    public ColorStateList f5530E;

    /* renamed from: E0, reason: collision with root package name */
    public boolean f5531E0;

    /* renamed from: F, reason: collision with root package name */
    public ColorStateList f5532F;

    /* renamed from: F0, reason: collision with root package name */
    public boolean f5533F0;

    /* renamed from: G, reason: collision with root package name */
    public boolean f5534G;

    /* renamed from: H, reason: collision with root package name */
    public CharSequence f5535H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f5536I;

    /* renamed from: J, reason: collision with root package name */
    public x1.g f5537J;

    /* renamed from: K, reason: collision with root package name */
    public x1.g f5538K;

    /* renamed from: L, reason: collision with root package name */
    public StateListDrawable f5539L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f5540M;

    /* renamed from: N, reason: collision with root package name */
    public x1.g f5541N;

    /* renamed from: O, reason: collision with root package name */
    public x1.g f5542O;

    /* renamed from: P, reason: collision with root package name */
    public k f5543P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f5544Q;

    /* renamed from: R, reason: collision with root package name */
    public final int f5545R;

    /* renamed from: S, reason: collision with root package name */
    public int f5546S;

    /* renamed from: T, reason: collision with root package name */
    public int f5547T;

    /* renamed from: U, reason: collision with root package name */
    public int f5548U;

    /* renamed from: V, reason: collision with root package name */
    public int f5549V;

    /* renamed from: W, reason: collision with root package name */
    public int f5550W;

    /* renamed from: a0, reason: collision with root package name */
    public int f5551a0;

    /* renamed from: b0, reason: collision with root package name */
    public int f5552b0;

    /* renamed from: c0, reason: collision with root package name */
    public final Rect f5553c0;

    /* renamed from: d0, reason: collision with root package name */
    public final Rect f5554d0;

    /* renamed from: e, reason: collision with root package name */
    public final FrameLayout f5555e;

    /* renamed from: e0, reason: collision with root package name */
    public final RectF f5556e0;

    /* renamed from: f, reason: collision with root package name */
    public final y f5557f;

    /* renamed from: f0, reason: collision with root package name */
    public Typeface f5558f0;

    /* renamed from: g, reason: collision with root package name */
    public final com.google.android.material.textfield.a f5559g;

    /* renamed from: g0, reason: collision with root package name */
    public Drawable f5560g0;

    /* renamed from: h, reason: collision with root package name */
    public EditText f5561h;

    /* renamed from: h0, reason: collision with root package name */
    public int f5562h0;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f5563i;

    /* renamed from: i0, reason: collision with root package name */
    public final LinkedHashSet f5564i0;

    /* renamed from: j, reason: collision with root package name */
    public int f5565j;

    /* renamed from: j0, reason: collision with root package name */
    public Drawable f5566j0;

    /* renamed from: k, reason: collision with root package name */
    public int f5567k;

    /* renamed from: k0, reason: collision with root package name */
    public int f5568k0;

    /* renamed from: l, reason: collision with root package name */
    public int f5569l;

    /* renamed from: l0, reason: collision with root package name */
    public Drawable f5570l0;

    /* renamed from: m, reason: collision with root package name */
    public int f5571m;

    /* renamed from: m0, reason: collision with root package name */
    public ColorStateList f5572m0;

    /* renamed from: n, reason: collision with root package name */
    public final u f5573n;

    /* renamed from: n0, reason: collision with root package name */
    public ColorStateList f5574n0;

    /* renamed from: o, reason: collision with root package name */
    public boolean f5575o;

    /* renamed from: o0, reason: collision with root package name */
    public int f5576o0;

    /* renamed from: p, reason: collision with root package name */
    public int f5577p;

    /* renamed from: p0, reason: collision with root package name */
    public int f5578p0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f5579q;

    /* renamed from: q0, reason: collision with root package name */
    public int f5580q0;

    /* renamed from: r, reason: collision with root package name */
    public e f5581r;

    /* renamed from: r0, reason: collision with root package name */
    public ColorStateList f5582r0;

    /* renamed from: s, reason: collision with root package name */
    public TextView f5583s;

    /* renamed from: s0, reason: collision with root package name */
    public int f5584s0;

    /* renamed from: t, reason: collision with root package name */
    public int f5585t;

    /* renamed from: t0, reason: collision with root package name */
    public int f5586t0;

    /* renamed from: u, reason: collision with root package name */
    public int f5587u;

    /* renamed from: u0, reason: collision with root package name */
    public int f5588u0;

    /* renamed from: v, reason: collision with root package name */
    public CharSequence f5589v;

    /* renamed from: v0, reason: collision with root package name */
    public int f5590v0;

    /* renamed from: w, reason: collision with root package name */
    public boolean f5591w;

    /* renamed from: w0, reason: collision with root package name */
    public int f5592w0;

    /* renamed from: x, reason: collision with root package name */
    public TextView f5593x;

    /* renamed from: x0, reason: collision with root package name */
    public int f5594x0;

    /* renamed from: y, reason: collision with root package name */
    public ColorStateList f5595y;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f5596y0;

    /* renamed from: z, reason: collision with root package name */
    public int f5597z;

    /* renamed from: z0, reason: collision with root package name */
    public final C0678a f5598z0;

    public class a implements TextWatcher {

        /* renamed from: e, reason: collision with root package name */
        public int f5599e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ EditText f5600f;

        public a(EditText editText) {
            this.f5600f = editText;
            this.f5599e = editText.getLineCount();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextInputLayout.this.s0(!r0.f5531E0);
            TextInputLayout textInputLayout = TextInputLayout.this;
            if (textInputLayout.f5575o) {
                textInputLayout.i0(editable);
            }
            if (TextInputLayout.this.f5591w) {
                TextInputLayout.this.w0(editable);
            }
            int lineCount = this.f5600f.getLineCount();
            int i3 = this.f5599e;
            if (lineCount != i3) {
                if (lineCount < i3) {
                    int x3 = O.x(this.f5600f);
                    int i4 = TextInputLayout.this.f5594x0;
                    if (x3 != i4) {
                        this.f5600f.setMinimumHeight(i4);
                    }
                }
                this.f5599e = lineCount;
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f5559g.h();
        }
    }

    public class c implements ValueAnimator.AnimatorUpdateListener {
        public c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.f5598z0.c0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class d extends C0184a {

        /* renamed from: d, reason: collision with root package name */
        public final TextInputLayout f5604d;

        public d(TextInputLayout textInputLayout) {
            this.f5604d = textInputLayout;
        }

        @Override // K.C0184a
        public void g(View view, x xVar) {
            super.g(view, xVar);
            EditText editText = this.f5604d.getEditText();
            CharSequence text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f5604d.getHint();
            CharSequence error = this.f5604d.getError();
            CharSequence placeholderText = this.f5604d.getPlaceholderText();
            int counterMaxLength = this.f5604d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f5604d.getCounterOverflowDescription();
            boolean isEmpty = TextUtils.isEmpty(text);
            boolean isEmpty2 = TextUtils.isEmpty(hint);
            boolean P3 = this.f5604d.P();
            boolean isEmpty3 = TextUtils.isEmpty(error);
            boolean z3 = (isEmpty3 && TextUtils.isEmpty(counterOverflowDescription)) ? false : true;
            String charSequence = !isEmpty2 ? hint.toString() : "";
            this.f5604d.f5557f.A(xVar);
            if (!isEmpty) {
                xVar.F0(text);
            } else if (!TextUtils.isEmpty(charSequence)) {
                xVar.F0(charSequence);
                if (!P3 && placeholderText != null) {
                    xVar.F0(charSequence + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                xVar.F0(placeholderText);
            }
            if (!TextUtils.isEmpty(charSequence)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    xVar.t0(charSequence);
                } else {
                    if (!isEmpty) {
                        charSequence = ((Object) text) + ", " + charSequence;
                    }
                    xVar.F0(charSequence);
                }
                xVar.C0(isEmpty);
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            xVar.v0(counterMaxLength);
            if (z3) {
                if (isEmpty3) {
                    error = counterOverflowDescription;
                }
                xVar.p0(error);
            }
            View t3 = this.f5604d.f5573n.t();
            if (t3 != null) {
                xVar.u0(t3);
            }
            this.f5604d.f5559g.m().o(view, xVar);
        }

        @Override // K.C0184a
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            super.h(view, accessibilityEvent);
            this.f5604d.f5559g.m().p(view, accessibilityEvent);
        }
    }

    public interface e {
        int a(Editable editable);
    }

    public interface f {
        void a(TextInputLayout textInputLayout);
    }

    public static class g extends S.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: g, reason: collision with root package name */
        public CharSequence f5605g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f5606h;

        public class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public g[] newArray(int i3) {
                return new g[i3];
            }
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f5605g) + "}";
        }

        @Override // S.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i3) {
            super.writeToParcel(parcel, i3);
            TextUtils.writeToParcel(this.f5605g, parcel, i3);
            parcel.writeInt(this.f5606h ? 1 : 0);
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f5605g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f5606h = parcel.readInt() == 1;
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0464a.f6780E);
    }

    public static Drawable H(x1.g gVar, int i3, int i4, int[][] iArr) {
        return new RippleDrawable(new ColorStateList(iArr, new int[]{AbstractC0597a.j(i4, i3, 0.1f), i3}), gVar, gVar);
    }

    public static Drawable K(Context context, x1.g gVar, int i3, int[][] iArr) {
        int c3 = AbstractC0597a.c(context, AbstractC0464a.f6790h, "TextInputLayout");
        x1.g gVar2 = new x1.g(gVar.A());
        int j3 = AbstractC0597a.j(i3, c3, 0.1f);
        gVar2.T(new ColorStateList(iArr, new int[]{j3, 0}));
        gVar2.setTint(c3);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{j3, c3});
        x1.g gVar3 = new x1.g(gVar.A());
        gVar3.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar2, gVar3), gVar});
    }

    public static void W(ViewGroup viewGroup, boolean z3) {
        int childCount = viewGroup.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = viewGroup.getChildAt(i3);
            childAt.setEnabled(z3);
            if (childAt instanceof ViewGroup) {
                W((ViewGroup) childAt, z3);
            }
        }
    }

    public static /* synthetic */ int b(Editable editable) {
        if (editable != null) {
            return editable.length();
        }
        return 0;
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f5561h;
        if (!(editText instanceof AutoCompleteTextView) || r.a(editText)) {
            return this.f5537J;
        }
        int d3 = AbstractC0597a.d(this.f5561h, AbstractC0464a.f6786d);
        int i3 = this.f5546S;
        if (i3 == 2) {
            return K(getContext(), this.f5537J, d3, f5521H0);
        }
        if (i3 == 1) {
            return H(this.f5537J, this.f5552b0, d3, f5521H0);
        }
        return null;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f5539L == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f5539L = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f5539L.addState(new int[0], G(false));
        }
        return this.f5539L;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f5538K == null) {
            this.f5538K = G(true);
        }
        return this.f5538K;
    }

    public static void j0(Context context, TextView textView, int i3, int i4, boolean z3) {
        textView.setContentDescription(context.getString(z3 ? h.f6931c : h.f6930b, Integer.valueOf(i3), Integer.valueOf(i4)));
    }

    private void setEditText(EditText editText) {
        if (this.f5561h != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f5561h = editText;
        int i3 = this.f5565j;
        if (i3 != -1) {
            setMinEms(i3);
        } else {
            setMinWidth(this.f5569l);
        }
        int i4 = this.f5567k;
        if (i4 != -1) {
            setMaxEms(i4);
        } else {
            setMaxWidth(this.f5571m);
        }
        this.f5540M = false;
        T();
        setTextInputAccessibilityDelegate(new d(this));
        this.f5598z0.i0(this.f5561h.getTypeface());
        this.f5598z0.a0(this.f5561h.getTextSize());
        int i5 = Build.VERSION.SDK_INT;
        this.f5598z0.X(this.f5561h.getLetterSpacing());
        int gravity = this.f5561h.getGravity();
        this.f5598z0.S((gravity & (-113)) | 48);
        this.f5598z0.Z(gravity);
        this.f5594x0 = O.x(editText);
        this.f5561h.addTextChangedListener(new a(editText));
        if (this.f5572m0 == null) {
            this.f5572m0 = this.f5561h.getHintTextColors();
        }
        if (this.f5534G) {
            if (TextUtils.isEmpty(this.f5535H)) {
                CharSequence hint = this.f5561h.getHint();
                this.f5563i = hint;
                setHint(hint);
                this.f5561h.setHint((CharSequence) null);
            }
            this.f5536I = true;
        }
        if (i5 >= 29) {
            l0();
        }
        if (this.f5583s != null) {
            i0(this.f5561h.getText());
        }
        n0();
        this.f5573n.f();
        this.f5557f.bringToFront();
        this.f5559g.bringToFront();
        C();
        this.f5559g.x0();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        t0(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f5535H)) {
            return;
        }
        this.f5535H = charSequence;
        this.f5598z0.g0(charSequence);
        if (this.f5596y0) {
            return;
        }
        U();
    }

    private void setPlaceholderTextEnabled(boolean z3) {
        if (this.f5591w == z3) {
            return;
        }
        if (z3) {
            j();
        } else {
            Y();
            this.f5593x = null;
        }
        this.f5591w = z3;
    }

    public final C0707c A() {
        C0707c c0707c = new C0707c();
        c0707c.h0(t1.d.f(getContext(), AbstractC0464a.f6804v, 87));
        c0707c.j0(t1.d.g(getContext(), AbstractC0464a.f6776A, AbstractC0474a.f7194a));
        return c0707c;
    }

    public final boolean B() {
        return this.f5534G && !TextUtils.isEmpty(this.f5535H) && (this.f5537J instanceof AbstractC0802h);
    }

    public final void C() {
        Iterator it = this.f5564i0.iterator();
        while (it.hasNext()) {
            ((f) it.next()).a(this);
        }
    }

    public final void D(Canvas canvas) {
        x1.g gVar;
        if (this.f5542O == null || (gVar = this.f5541N) == null) {
            return;
        }
        gVar.draw(canvas);
        if (this.f5561h.isFocused()) {
            Rect bounds = this.f5542O.getBounds();
            Rect bounds2 = this.f5541N.getBounds();
            float x3 = this.f5598z0.x();
            int centerX = bounds2.centerX();
            bounds.left = AbstractC0474a.c(centerX, bounds2.left, x3);
            bounds.right = AbstractC0474a.c(centerX, bounds2.right, x3);
            this.f5542O.draw(canvas);
        }
    }

    public final void E(Canvas canvas) {
        if (this.f5534G) {
            this.f5598z0.l(canvas);
        }
    }

    public final void F(boolean z3) {
        ValueAnimator valueAnimator = this.f5527C0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f5527C0.cancel();
        }
        if (z3 && this.f5525B0) {
            l(0.0f);
        } else {
            this.f5598z0.c0(0.0f);
        }
        if (B() && ((AbstractC0802h) this.f5537J).h0()) {
            y();
        }
        this.f5596y0 = true;
        L();
        this.f5557f.l(true);
        this.f5559g.H(true);
    }

    public final x1.g G(boolean z3) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(e1.c.f6833S);
        float f3 = z3 ? dimensionPixelOffset : 0.0f;
        float dimensionPixelOffset2 = getResources().getDimensionPixelOffset(e1.c.f6853o);
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(e1.c.f6831Q);
        k m3 = k.a().A(f3).E(f3).s(dimensionPixelOffset).w(dimensionPixelOffset).m();
        x1.g m4 = x1.g.m(getContext(), dimensionPixelOffset2, null);
        m4.setShapeAppearanceModel(m3);
        m4.V(0, dimensionPixelOffset3, 0, dimensionPixelOffset3);
        return m4;
    }

    public final int I(int i3, boolean z3) {
        return i3 + ((z3 || getPrefixText() == null) ? (!z3 || getSuffixText() == null) ? this.f5561h.getCompoundPaddingLeft() : this.f5559g.y() : this.f5557f.c());
    }

    public final int J(int i3, boolean z3) {
        return i3 - ((z3 || getSuffixText() == null) ? (!z3 || getPrefixText() == null) ? this.f5561h.getCompoundPaddingRight() : this.f5557f.c() : this.f5559g.y());
    }

    public final void L() {
        TextView textView = this.f5593x;
        if (textView == null || !this.f5591w) {
            return;
        }
        textView.setText((CharSequence) null);
        t.a(this.f5555e, this.f5524B);
        this.f5593x.setVisibility(4);
    }

    public boolean M() {
        return this.f5559g.F();
    }

    public boolean N() {
        return this.f5573n.A();
    }

    public boolean O() {
        return this.f5573n.B();
    }

    public final boolean P() {
        return this.f5596y0;
    }

    public final boolean Q() {
        if (b0()) {
            return true;
        }
        return this.f5583s != null && this.f5579q;
    }

    public boolean R() {
        return this.f5536I;
    }

    public final boolean S() {
        return this.f5546S == 1 && this.f5561h.getMinLines() <= 1;
    }

    public final void T() {
        p();
        p0();
        y0();
        f0();
        k();
        if (this.f5546S != 0) {
            r0();
        }
        Z();
    }

    public final void U() {
        if (B()) {
            RectF rectF = this.f5556e0;
            this.f5598z0.o(rectF, this.f5561h.getWidth(), this.f5561h.getGravity());
            if (rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
                return;
            }
            o(rectF);
            rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f5548U);
            ((AbstractC0802h) this.f5537J).k0(rectF);
        }
    }

    public final void V() {
        if (!B() || this.f5596y0) {
            return;
        }
        y();
        U();
    }

    public void X() {
        this.f5557f.m();
    }

    public final void Y() {
        TextView textView = this.f5593x;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    public final void Z() {
        EditText editText = this.f5561h;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.f5546S;
                if (i3 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i3 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    public void a0(TextView textView, int i3) {
        try {
            Q.g.n(textView, i3);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        Q.g.n(textView, i.f6949a);
        textView.setTextColor(A.a.b(getContext(), e1.b.f6809a));
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i3, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.f5555e.addView(view, layoutParams2);
        this.f5555e.setLayoutParams(layoutParams);
        r0();
        setEditText((EditText) view);
    }

    public boolean b0() {
        return this.f5573n.l();
    }

    public final boolean c0() {
        return (this.f5559g.G() || ((this.f5559g.A() && M()) || this.f5559g.w() != null)) && this.f5559g.getMeasuredWidth() > 0;
    }

    public final boolean d0() {
        return (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.f5557f.getMeasuredWidth() > 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i3) {
        AutofillId autofillId;
        EditText editText = this.f5561h;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i3);
            return;
        }
        if (this.f5563i != null) {
            boolean z3 = this.f5536I;
            this.f5536I = false;
            CharSequence hint = editText.getHint();
            this.f5561h.setHint(this.f5563i);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i3);
                return;
            } finally {
                this.f5561h.setHint(hint);
                this.f5536I = z3;
            }
        }
        autofillId = getAutofillId();
        viewStructure.setAutofillId(autofillId);
        onProvideAutofillStructure(viewStructure, i3);
        onProvideAutofillVirtualStructure(viewStructure, i3);
        viewStructure.setChildCount(this.f5555e.getChildCount());
        for (int i4 = 0; i4 < this.f5555e.getChildCount(); i4++) {
            View childAt = this.f5555e.getChildAt(i4);
            ViewStructure newChild = viewStructure.newChild(i4);
            childAt.dispatchProvideAutofillStructure(newChild, i3);
            if (childAt == this.f5561h) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f5531E0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f5531E0 = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        E(canvas);
        D(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.f5529D0) {
            return;
        }
        this.f5529D0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        C0678a c0678a = this.f5598z0;
        boolean f02 = c0678a != null ? c0678a.f0(drawableState) : false;
        if (this.f5561h != null) {
            s0(O.O(this) && isEnabled());
        }
        n0();
        y0();
        if (f02) {
            invalidate();
        }
        this.f5529D0 = false;
    }

    public final void e0() {
        if (this.f5593x == null || !this.f5591w || TextUtils.isEmpty(this.f5589v)) {
            return;
        }
        this.f5593x.setText(this.f5589v);
        t.a(this.f5555e, this.f5522A);
        this.f5593x.setVisibility(0);
        this.f5593x.bringToFront();
        announceForAccessibility(this.f5589v);
    }

    public final void f0() {
        if (this.f5546S == 1) {
            if (AbstractC0740c.g(getContext())) {
                this.f5547T = getResources().getDimensionPixelSize(e1.c.f6863y);
            } else if (AbstractC0740c.f(getContext())) {
                this.f5547T = getResources().getDimensionPixelSize(e1.c.f6862x);
            }
        }
    }

    public final void g0(Rect rect) {
        x1.g gVar = this.f5541N;
        if (gVar != null) {
            int i3 = rect.bottom;
            gVar.setBounds(rect.left, i3 - this.f5549V, rect.right, i3);
        }
        x1.g gVar2 = this.f5542O;
        if (gVar2 != null) {
            int i4 = rect.bottom;
            gVar2.setBounds(rect.left, i4 - this.f5550W, rect.right, i4);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f5561h;
        return editText != null ? editText.getBaseline() + getPaddingTop() + v() : super.getBaseline();
    }

    public x1.g getBoxBackground() {
        int i3 = this.f5546S;
        if (i3 == 1 || i3 == 2) {
            return this.f5537J;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f5552b0;
    }

    public int getBoxBackgroundMode() {
        return this.f5546S;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f5547T;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return n.g(this) ? this.f5543P.j().a(this.f5556e0) : this.f5543P.l().a(this.f5556e0);
    }

    public float getBoxCornerRadiusBottomStart() {
        return n.g(this) ? this.f5543P.l().a(this.f5556e0) : this.f5543P.j().a(this.f5556e0);
    }

    public float getBoxCornerRadiusTopEnd() {
        return n.g(this) ? this.f5543P.r().a(this.f5556e0) : this.f5543P.t().a(this.f5556e0);
    }

    public float getBoxCornerRadiusTopStart() {
        return n.g(this) ? this.f5543P.t().a(this.f5556e0) : this.f5543P.r().a(this.f5556e0);
    }

    public int getBoxStrokeColor() {
        return this.f5580q0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f5582r0;
    }

    public int getBoxStrokeWidth() {
        return this.f5549V;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f5550W;
    }

    public int getCounterMaxLength() {
        return this.f5577p;
    }

    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.f5575o && this.f5579q && (textView = this.f5583s) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f5528D;
    }

    public ColorStateList getCounterTextColor() {
        return this.f5526C;
    }

    public ColorStateList getCursorColor() {
        return this.f5530E;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f5532F;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f5572m0;
    }

    public EditText getEditText() {
        return this.f5561h;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f5559g.l();
    }

    public Drawable getEndIconDrawable() {
        return this.f5559g.n();
    }

    public int getEndIconMinSize() {
        return this.f5559g.o();
    }

    public int getEndIconMode() {
        return this.f5559g.p();
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f5559g.q();
    }

    public CheckableImageButton getEndIconView() {
        return this.f5559g.r();
    }

    public CharSequence getError() {
        if (this.f5573n.A()) {
            return this.f5573n.p();
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f5573n.n();
    }

    public CharSequence getErrorContentDescription() {
        return this.f5573n.o();
    }

    public int getErrorCurrentTextColors() {
        return this.f5573n.q();
    }

    public Drawable getErrorIconDrawable() {
        return this.f5559g.s();
    }

    public CharSequence getHelperText() {
        if (this.f5573n.B()) {
            return this.f5573n.s();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f5573n.u();
    }

    public CharSequence getHint() {
        if (this.f5534G) {
            return this.f5535H;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f5598z0.q();
    }

    public final int getHintCurrentCollapsedTextColor() {
        return this.f5598z0.t();
    }

    public ColorStateList getHintTextColor() {
        return this.f5574n0;
    }

    public e getLengthCounter() {
        return this.f5581r;
    }

    public int getMaxEms() {
        return this.f5567k;
    }

    public int getMaxWidth() {
        return this.f5571m;
    }

    public int getMinEms() {
        return this.f5565j;
    }

    public int getMinWidth() {
        return this.f5569l;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f5559g.u();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f5559g.v();
    }

    public CharSequence getPlaceholderText() {
        if (this.f5591w) {
            return this.f5589v;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f5597z;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f5595y;
    }

    public CharSequence getPrefixText() {
        return this.f5557f.a();
    }

    public ColorStateList getPrefixTextColor() {
        return this.f5557f.b();
    }

    public TextView getPrefixTextView() {
        return this.f5557f.d();
    }

    public k getShapeAppearanceModel() {
        return this.f5543P;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f5557f.e();
    }

    public Drawable getStartIconDrawable() {
        return this.f5557f.f();
    }

    public int getStartIconMinSize() {
        return this.f5557f.g();
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f5557f.h();
    }

    public CharSequence getSuffixText() {
        return this.f5559g.w();
    }

    public ColorStateList getSuffixTextColor() {
        return this.f5559g.x();
    }

    public TextView getSuffixTextView() {
        return this.f5559g.z();
    }

    public Typeface getTypeface() {
        return this.f5558f0;
    }

    public final void h0() {
        if (this.f5583s != null) {
            EditText editText = this.f5561h;
            i0(editText == null ? null : editText.getText());
        }
    }

    public void i(f fVar) {
        this.f5564i0.add(fVar);
        if (this.f5561h != null) {
            fVar.a(this);
        }
    }

    public void i0(Editable editable) {
        int a3 = this.f5581r.a(editable);
        boolean z3 = this.f5579q;
        int i3 = this.f5577p;
        if (i3 == -1) {
            this.f5583s.setText(String.valueOf(a3));
            this.f5583s.setContentDescription(null);
            this.f5579q = false;
        } else {
            this.f5579q = a3 > i3;
            j0(getContext(), this.f5583s, a3, this.f5577p, this.f5579q);
            if (z3 != this.f5579q) {
                k0();
            }
            this.f5583s.setText(I.a.c().j(getContext().getString(h.f6932d, Integer.valueOf(a3), Integer.valueOf(this.f5577p))));
        }
        if (this.f5561h == null || z3 == this.f5579q) {
            return;
        }
        s0(false);
        y0();
        n0();
    }

    public final void j() {
        TextView textView = this.f5593x;
        if (textView != null) {
            this.f5555e.addView(textView);
            this.f5593x.setVisibility(0);
        }
    }

    public final void k() {
        if (this.f5561h == null || this.f5546S != 1) {
            return;
        }
        if (AbstractC0740c.g(getContext())) {
            EditText editText = this.f5561h;
            O.w0(editText, O.B(editText), getResources().getDimensionPixelSize(e1.c.f6861w), O.A(this.f5561h), getResources().getDimensionPixelSize(e1.c.f6860v));
        } else if (AbstractC0740c.f(getContext())) {
            EditText editText2 = this.f5561h;
            O.w0(editText2, O.B(editText2), getResources().getDimensionPixelSize(e1.c.f6859u), O.A(this.f5561h), getResources().getDimensionPixelSize(e1.c.f6858t));
        }
    }

    public final void k0() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f5583s;
        if (textView != null) {
            a0(textView, this.f5579q ? this.f5585t : this.f5587u);
            if (!this.f5579q && (colorStateList2 = this.f5526C) != null) {
                this.f5583s.setTextColor(colorStateList2);
            }
            if (!this.f5579q || (colorStateList = this.f5528D) == null) {
                return;
            }
            this.f5583s.setTextColor(colorStateList);
        }
    }

    public void l(float f3) {
        if (this.f5598z0.x() == f3) {
            return;
        }
        if (this.f5527C0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f5527C0 = valueAnimator;
            valueAnimator.setInterpolator(t1.d.g(getContext(), AbstractC0464a.f6808z, AbstractC0474a.f7195b));
            this.f5527C0.setDuration(t1.d.f(getContext(), AbstractC0464a.f6803u, 167));
            this.f5527C0.addUpdateListener(new c());
        }
        this.f5527C0.setFloatValues(this.f5598z0.x(), f3);
        this.f5527C0.start();
    }

    public final void l0() {
        Drawable textCursorDrawable;
        Drawable textCursorDrawable2;
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f5530E;
        if (colorStateList2 == null) {
            colorStateList2 = AbstractC0597a.g(getContext(), AbstractC0464a.f6785c);
        }
        EditText editText = this.f5561h;
        if (editText != null) {
            textCursorDrawable = editText.getTextCursorDrawable();
            if (textCursorDrawable == null) {
                return;
            }
            textCursorDrawable2 = this.f5561h.getTextCursorDrawable();
            Drawable mutate = D.a.l(textCursorDrawable2).mutate();
            if (Q() && (colorStateList = this.f5532F) != null) {
                colorStateList2 = colorStateList;
            }
            D.a.i(mutate, colorStateList2);
        }
    }

    public final void m() {
        x1.g gVar = this.f5537J;
        if (gVar == null) {
            return;
        }
        k A3 = gVar.A();
        k kVar = this.f5543P;
        if (A3 != kVar) {
            this.f5537J.setShapeAppearanceModel(kVar);
        }
        if (w()) {
            this.f5537J.X(this.f5548U, this.f5551a0);
        }
        int q3 = q();
        this.f5552b0 = q3;
        this.f5537J.T(ColorStateList.valueOf(q3));
        n();
        p0();
    }

    public boolean m0() {
        boolean z3;
        if (this.f5561h == null) {
            return false;
        }
        boolean z4 = true;
        if (d0()) {
            int measuredWidth = this.f5557f.getMeasuredWidth() - this.f5561h.getPaddingLeft();
            if (this.f5560g0 == null || this.f5562h0 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.f5560g0 = colorDrawable;
                this.f5562h0 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] a3 = Q.g.a(this.f5561h);
            Drawable drawable = a3[0];
            Drawable drawable2 = this.f5560g0;
            if (drawable != drawable2) {
                Q.g.i(this.f5561h, drawable2, a3[1], a3[2], a3[3]);
                z3 = true;
            }
            z3 = false;
        } else {
            if (this.f5560g0 != null) {
                Drawable[] a4 = Q.g.a(this.f5561h);
                Q.g.i(this.f5561h, null, a4[1], a4[2], a4[3]);
                this.f5560g0 = null;
                z3 = true;
            }
            z3 = false;
        }
        if (c0()) {
            int measuredWidth2 = this.f5559g.z().getMeasuredWidth() - this.f5561h.getPaddingRight();
            CheckableImageButton k3 = this.f5559g.k();
            if (k3 != null) {
                measuredWidth2 = measuredWidth2 + k3.getMeasuredWidth() + AbstractC0214t.b((ViewGroup.MarginLayoutParams) k3.getLayoutParams());
            }
            Drawable[] a5 = Q.g.a(this.f5561h);
            Drawable drawable3 = this.f5566j0;
            if (drawable3 != null && this.f5568k0 != measuredWidth2) {
                this.f5568k0 = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                Q.g.i(this.f5561h, a5[0], a5[1], this.f5566j0, a5[3]);
                return true;
            }
            if (drawable3 == null) {
                ColorDrawable colorDrawable2 = new ColorDrawable();
                this.f5566j0 = colorDrawable2;
                this.f5568k0 = measuredWidth2;
                colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
            }
            Drawable drawable4 = a5[2];
            Drawable drawable5 = this.f5566j0;
            if (drawable4 != drawable5) {
                this.f5570l0 = drawable4;
                Q.g.i(this.f5561h, a5[0], a5[1], drawable5, a5[3]);
                return true;
            }
        } else if (this.f5566j0 != null) {
            Drawable[] a6 = Q.g.a(this.f5561h);
            if (a6[2] == this.f5566j0) {
                Q.g.i(this.f5561h, a6[0], a6[1], this.f5570l0, a6[3]);
            } else {
                z4 = z3;
            }
            this.f5566j0 = null;
            return z4;
        }
        return z3;
    }

    public final void n() {
        if (this.f5541N == null || this.f5542O == null) {
            return;
        }
        if (x()) {
            this.f5541N.T(this.f5561h.isFocused() ? ColorStateList.valueOf(this.f5576o0) : ColorStateList.valueOf(this.f5551a0));
            this.f5542O.T(ColorStateList.valueOf(this.f5551a0));
        }
        invalidate();
    }

    public void n0() {
        Drawable background;
        TextView textView;
        EditText editText = this.f5561h;
        if (editText == null || this.f5546S != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (AbstractC0537C.a(background)) {
            background = background.mutate();
        }
        if (b0()) {
            background.setColorFilter(C0567h.d(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f5579q && (textView = this.f5583s) != null) {
            background.setColorFilter(C0567h.d(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            D.a.a(background);
            this.f5561h.refreshDrawableState();
        }
    }

    public final void o(RectF rectF) {
        float f3 = rectF.left;
        int i3 = this.f5545R;
        rectF.left = f3 - i3;
        rectF.right += i3;
    }

    public final void o0() {
        O.n0(this.f5561h, getEditTextBoxBackground());
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f5598z0.H(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f5559g.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f5533F0 = false;
        boolean q02 = q0();
        boolean m02 = m0();
        if (q02 || m02) {
            this.f5561h.post(new Runnable() { // from class: z1.F
                @Override // java.lang.Runnable
                public final void run() {
                    TextInputLayout.this.f5561h.requestLayout();
                }
            });
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        super.onLayout(z3, i3, i4, i5, i6);
        EditText editText = this.f5561h;
        if (editText != null) {
            Rect rect = this.f5553c0;
            AbstractC0679b.a(this, editText, rect);
            g0(rect);
            if (this.f5534G) {
                this.f5598z0.a0(this.f5561h.getTextSize());
                int gravity = this.f5561h.getGravity();
                this.f5598z0.S((gravity & (-113)) | 48);
                this.f5598z0.Z(gravity);
                this.f5598z0.O(r(rect));
                this.f5598z0.W(u(rect));
                this.f5598z0.J();
                if (!B() || this.f5596y0) {
                    return;
                }
                U();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i3, int i4) {
        super.onMeasure(i3, i4);
        if (!this.f5533F0) {
            this.f5559g.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f5533F0 = true;
        }
        u0();
        this.f5559g.x0();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.a());
        setError(gVar.f5605g);
        if (gVar.f5606h) {
            post(new b());
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i3) {
        super.onRtlPropertiesChanged(i3);
        boolean z3 = i3 == 1;
        if (z3 != this.f5544Q) {
            float a3 = this.f5543P.r().a(this.f5556e0);
            float a4 = this.f5543P.t().a(this.f5556e0);
            k m3 = k.a().z(this.f5543P.s()).D(this.f5543P.q()).r(this.f5543P.k()).v(this.f5543P.i()).A(a4).E(a3).s(this.f5543P.l().a(this.f5556e0)).w(this.f5543P.j().a(this.f5556e0)).m();
            this.f5544Q = z3;
            setShapeAppearanceModel(m3);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        g gVar = new g(super.onSaveInstanceState());
        if (b0()) {
            gVar.f5605g = getError();
        }
        gVar.f5606h = this.f5559g.E();
        return gVar;
    }

    public final void p() {
        int i3 = this.f5546S;
        if (i3 == 0) {
            this.f5537J = null;
            this.f5541N = null;
            this.f5542O = null;
            return;
        }
        if (i3 == 1) {
            this.f5537J = new x1.g(this.f5543P);
            this.f5541N = new x1.g();
            this.f5542O = new x1.g();
        } else {
            if (i3 != 2) {
                throw new IllegalArgumentException(this.f5546S + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.f5534G || (this.f5537J instanceof AbstractC0802h)) {
                this.f5537J = new x1.g(this.f5543P);
            } else {
                this.f5537J = AbstractC0802h.f0(this.f5543P);
            }
            this.f5541N = null;
            this.f5542O = null;
        }
    }

    public void p0() {
        EditText editText = this.f5561h;
        if (editText == null || this.f5537J == null) {
            return;
        }
        if ((this.f5540M || editText.getBackground() == null) && this.f5546S != 0) {
            o0();
            this.f5540M = true;
        }
    }

    public final int q() {
        return this.f5546S == 1 ? AbstractC0597a.i(AbstractC0597a.e(this, AbstractC0464a.f6790h, 0), this.f5552b0) : this.f5552b0;
    }

    public final boolean q0() {
        int max;
        if (this.f5561h == null || this.f5561h.getMeasuredHeight() >= (max = Math.max(this.f5559g.getMeasuredHeight(), this.f5557f.getMeasuredHeight()))) {
            return false;
        }
        this.f5561h.setMinimumHeight(max);
        return true;
    }

    public final Rect r(Rect rect) {
        if (this.f5561h == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.f5554d0;
        boolean g3 = n.g(this);
        rect2.bottom = rect.bottom;
        int i3 = this.f5546S;
        if (i3 == 1) {
            rect2.left = I(rect.left, g3);
            rect2.top = rect.top + this.f5547T;
            rect2.right = J(rect.right, g3);
            return rect2;
        }
        if (i3 != 2) {
            rect2.left = I(rect.left, g3);
            rect2.top = getPaddingTop();
            rect2.right = J(rect.right, g3);
            return rect2;
        }
        rect2.left = rect.left + this.f5561h.getPaddingLeft();
        rect2.top = rect.top - v();
        rect2.right = rect.right - this.f5561h.getPaddingRight();
        return rect2;
    }

    public final void r0() {
        if (this.f5546S != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f5555e.getLayoutParams();
            int v3 = v();
            if (v3 != layoutParams.topMargin) {
                layoutParams.topMargin = v3;
                this.f5555e.requestLayout();
            }
        }
    }

    public final int s(Rect rect, Rect rect2, float f3) {
        return S() ? (int) (rect2.top + f3) : rect.bottom - this.f5561h.getCompoundPaddingBottom();
    }

    public void s0(boolean z3) {
        t0(z3, false);
    }

    public void setBoxBackgroundColor(int i3) {
        if (this.f5552b0 != i3) {
            this.f5552b0 = i3;
            this.f5584s0 = i3;
            this.f5588u0 = i3;
            this.f5590v0 = i3;
            m();
        }
    }

    public void setBoxBackgroundColorResource(int i3) {
        setBoxBackgroundColor(A.a.b(getContext(), i3));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f5584s0 = defaultColor;
        this.f5552b0 = defaultColor;
        this.f5586t0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f5588u0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f5590v0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        m();
    }

    public void setBoxBackgroundMode(int i3) {
        if (i3 == this.f5546S) {
            return;
        }
        this.f5546S = i3;
        if (this.f5561h != null) {
            T();
        }
    }

    public void setBoxCollapsedPaddingTop(int i3) {
        this.f5547T = i3;
    }

    public void setBoxCornerFamily(int i3) {
        this.f5543P = this.f5543P.v().y(i3, this.f5543P.r()).C(i3, this.f5543P.t()).q(i3, this.f5543P.j()).u(i3, this.f5543P.l()).m();
        m();
    }

    public void setBoxStrokeColor(int i3) {
        if (this.f5580q0 != i3) {
            this.f5580q0 = i3;
            y0();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f5576o0 = colorStateList.getDefaultColor();
            this.f5592w0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f5578p0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f5580q0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f5580q0 != colorStateList.getDefaultColor()) {
            this.f5580q0 = colorStateList.getDefaultColor();
        }
        y0();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f5582r0 != colorStateList) {
            this.f5582r0 = colorStateList;
            y0();
        }
    }

    public void setBoxStrokeWidth(int i3) {
        this.f5549V = i3;
        y0();
    }

    public void setBoxStrokeWidthFocused(int i3) {
        this.f5550W = i3;
        y0();
    }

    public void setBoxStrokeWidthFocusedResource(int i3) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i3));
    }

    public void setBoxStrokeWidthResource(int i3) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i3));
    }

    public void setCounterEnabled(boolean z3) {
        if (this.f5575o != z3) {
            if (z3) {
                C0579t c0579t = new C0579t(getContext());
                this.f5583s = c0579t;
                c0579t.setId(e1.e.f6879H);
                Typeface typeface = this.f5558f0;
                if (typeface != null) {
                    this.f5583s.setTypeface(typeface);
                }
                this.f5583s.setMaxLines(1);
                this.f5573n.e(this.f5583s, 2);
                AbstractC0214t.d((ViewGroup.MarginLayoutParams) this.f5583s.getLayoutParams(), getResources().getDimensionPixelOffset(e1.c.f6838X));
                k0();
                h0();
            } else {
                this.f5573n.C(this.f5583s, 2);
                this.f5583s = null;
            }
            this.f5575o = z3;
        }
    }

    public void setCounterMaxLength(int i3) {
        if (this.f5577p != i3) {
            if (i3 > 0) {
                this.f5577p = i3;
            } else {
                this.f5577p = -1;
            }
            if (this.f5575o) {
                h0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i3) {
        if (this.f5585t != i3) {
            this.f5585t = i3;
            k0();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f5528D != colorStateList) {
            this.f5528D = colorStateList;
            k0();
        }
    }

    public void setCounterTextAppearance(int i3) {
        if (this.f5587u != i3) {
            this.f5587u = i3;
            k0();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f5526C != colorStateList) {
            this.f5526C = colorStateList;
            k0();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f5530E != colorStateList) {
            this.f5530E = colorStateList;
            l0();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f5532F != colorStateList) {
            this.f5532F = colorStateList;
            if (Q()) {
                l0();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f5572m0 = colorStateList;
        this.f5574n0 = colorStateList;
        if (this.f5561h != null) {
            s0(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z3) {
        W(this, z3);
        super.setEnabled(z3);
    }

    public void setEndIconActivated(boolean z3) {
        this.f5559g.N(z3);
    }

    public void setEndIconCheckable(boolean z3) {
        this.f5559g.O(z3);
    }

    public void setEndIconContentDescription(int i3) {
        this.f5559g.P(i3);
    }

    public void setEndIconDrawable(int i3) {
        this.f5559g.R(i3);
    }

    public void setEndIconMinSize(int i3) {
        this.f5559g.T(i3);
    }

    public void setEndIconMode(int i3) {
        this.f5559g.U(i3);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        this.f5559g.V(onClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f5559g.W(onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        this.f5559g.X(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        this.f5559g.Y(colorStateList);
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        this.f5559g.Z(mode);
    }

    public void setEndIconVisible(boolean z3) {
        this.f5559g.a0(z3);
    }

    public void setError(CharSequence charSequence) {
        if (!this.f5573n.A()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f5573n.w();
        } else {
            this.f5573n.Q(charSequence);
        }
    }

    public void setErrorAccessibilityLiveRegion(int i3) {
        this.f5573n.E(i3);
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.f5573n.F(charSequence);
    }

    public void setErrorEnabled(boolean z3) {
        this.f5573n.G(z3);
    }

    public void setErrorIconDrawable(int i3) {
        this.f5559g.b0(i3);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        this.f5559g.d0(onClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f5559g.e0(onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.f5559g.f0(colorStateList);
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        this.f5559g.g0(mode);
    }

    public void setErrorTextAppearance(int i3) {
        this.f5573n.H(i3);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f5573n.I(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z3) {
        if (this.f5523A0 != z3) {
            this.f5523A0 = z3;
            s0(false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (O()) {
                setHelperTextEnabled(false);
            }
        } else {
            if (!O()) {
                setHelperTextEnabled(true);
            }
            this.f5573n.R(charSequence);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f5573n.L(colorStateList);
    }

    public void setHelperTextEnabled(boolean z3) {
        this.f5573n.K(z3);
    }

    public void setHelperTextTextAppearance(int i3) {
        this.f5573n.J(i3);
    }

    public void setHint(CharSequence charSequence) {
        if (this.f5534G) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z3) {
        this.f5525B0 = z3;
    }

    public void setHintEnabled(boolean z3) {
        if (z3 != this.f5534G) {
            this.f5534G = z3;
            if (z3) {
                CharSequence hint = this.f5561h.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f5535H)) {
                        setHint(hint);
                    }
                    this.f5561h.setHint((CharSequence) null);
                }
                this.f5536I = true;
            } else {
                this.f5536I = false;
                if (!TextUtils.isEmpty(this.f5535H) && TextUtils.isEmpty(this.f5561h.getHint())) {
                    this.f5561h.setHint(this.f5535H);
                }
                setHintInternal(null);
            }
            if (this.f5561h != null) {
                r0();
            }
        }
    }

    public void setHintTextAppearance(int i3) {
        this.f5598z0.P(i3);
        this.f5574n0 = this.f5598z0.p();
        if (this.f5561h != null) {
            s0(false);
            r0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f5574n0 != colorStateList) {
            if (this.f5572m0 == null) {
                this.f5598z0.R(colorStateList);
            }
            this.f5574n0 = colorStateList;
            if (this.f5561h != null) {
                s0(false);
            }
        }
    }

    public void setLengthCounter(e eVar) {
        this.f5581r = eVar;
    }

    public void setMaxEms(int i3) {
        this.f5567k = i3;
        EditText editText = this.f5561h;
        if (editText == null || i3 == -1) {
            return;
        }
        editText.setMaxEms(i3);
    }

    public void setMaxWidth(int i3) {
        this.f5571m = i3;
        EditText editText = this.f5561h;
        if (editText == null || i3 == -1) {
            return;
        }
        editText.setMaxWidth(i3);
    }

    public void setMaxWidthResource(int i3) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i3));
    }

    public void setMinEms(int i3) {
        this.f5565j = i3;
        EditText editText = this.f5561h;
        if (editText == null || i3 == -1) {
            return;
        }
        editText.setMinEms(i3);
    }

    public void setMinWidth(int i3) {
        this.f5569l = i3;
        EditText editText = this.f5561h;
        if (editText == null || i3 == -1) {
            return;
        }
        editText.setMinWidth(i3);
    }

    public void setMinWidthResource(int i3) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i3));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i3) {
        this.f5559g.i0(i3);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i3) {
        this.f5559g.k0(i3);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z3) {
        this.f5559g.m0(z3);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f5559g.n0(colorStateList);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f5559g.o0(mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f5593x == null) {
            C0579t c0579t = new C0579t(getContext());
            this.f5593x = c0579t;
            c0579t.setId(e1.e.f6882K);
            O.r0(this.f5593x, 2);
            C0707c A3 = A();
            this.f5522A = A3;
            A3.m0(67L);
            this.f5524B = A();
            setPlaceholderTextAppearance(this.f5597z);
            setPlaceholderTextColor(this.f5595y);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f5591w) {
                setPlaceholderTextEnabled(true);
            }
            this.f5589v = charSequence;
        }
        v0();
    }

    public void setPlaceholderTextAppearance(int i3) {
        this.f5597z = i3;
        TextView textView = this.f5593x;
        if (textView != null) {
            Q.g.n(textView, i3);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f5595y != colorStateList) {
            this.f5595y = colorStateList;
            TextView textView = this.f5593x;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.f5557f.n(charSequence);
    }

    public void setPrefixTextAppearance(int i3) {
        this.f5557f.o(i3);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f5557f.p(colorStateList);
    }

    public void setShapeAppearanceModel(k kVar) {
        x1.g gVar = this.f5537J;
        if (gVar == null || gVar.A() == kVar) {
            return;
        }
        this.f5543P = kVar;
        m();
    }

    public void setStartIconCheckable(boolean z3) {
        this.f5557f.q(z3);
    }

    public void setStartIconContentDescription(int i3) {
        setStartIconContentDescription(i3 != 0 ? getResources().getText(i3) : null);
    }

    public void setStartIconDrawable(int i3) {
        setStartIconDrawable(i3 != 0 ? AbstractC0467a.b(getContext(), i3) : null);
    }

    public void setStartIconMinSize(int i3) {
        this.f5557f.t(i3);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        this.f5557f.u(onClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f5557f.v(onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        this.f5557f.w(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        this.f5557f.x(colorStateList);
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        this.f5557f.y(mode);
    }

    public void setStartIconVisible(boolean z3) {
        this.f5557f.z(z3);
    }

    public void setSuffixText(CharSequence charSequence) {
        this.f5559g.p0(charSequence);
    }

    public void setSuffixTextAppearance(int i3) {
        this.f5559g.q0(i3);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f5559g.r0(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(d dVar) {
        EditText editText = this.f5561h;
        if (editText != null) {
            O.j0(editText, dVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f5558f0) {
            this.f5558f0 = typeface;
            this.f5598z0.i0(typeface);
            this.f5573n.N(typeface);
            TextView textView = this.f5583s;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    public final int t(Rect rect, float f3) {
        return S() ? (int) (rect.centerY() - (f3 / 2.0f)) : rect.top + this.f5561h.getCompoundPaddingTop();
    }

    public final void t0(boolean z3, boolean z4) {
        ColorStateList colorStateList;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText = this.f5561h;
        boolean z5 = false;
        boolean z6 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f5561h;
        if (editText2 != null && editText2.hasFocus()) {
            z5 = true;
        }
        ColorStateList colorStateList2 = this.f5572m0;
        if (colorStateList2 != null) {
            this.f5598z0.M(colorStateList2);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.f5572m0;
            this.f5598z0.M(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f5592w0) : this.f5592w0));
        } else if (b0()) {
            this.f5598z0.M(this.f5573n.r());
        } else if (this.f5579q && (textView = this.f5583s) != null) {
            this.f5598z0.M(textView.getTextColors());
        } else if (z5 && (colorStateList = this.f5574n0) != null) {
            this.f5598z0.R(colorStateList);
        }
        if (z6 || !this.f5523A0 || (isEnabled() && z5)) {
            if (z4 || this.f5596y0) {
                z(z3);
                return;
            }
            return;
        }
        if (z4 || !this.f5596y0) {
            F(z3);
        }
    }

    public final Rect u(Rect rect) {
        if (this.f5561h == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.f5554d0;
        float w3 = this.f5598z0.w();
        rect2.left = rect.left + this.f5561h.getCompoundPaddingLeft();
        rect2.top = t(rect, w3);
        rect2.right = rect.right - this.f5561h.getCompoundPaddingRight();
        rect2.bottom = s(rect, rect2, w3);
        return rect2;
    }

    public final void u0() {
        EditText editText;
        if (this.f5593x == null || (editText = this.f5561h) == null) {
            return;
        }
        this.f5593x.setGravity(editText.getGravity());
        this.f5593x.setPadding(this.f5561h.getCompoundPaddingLeft(), this.f5561h.getCompoundPaddingTop(), this.f5561h.getCompoundPaddingRight(), this.f5561h.getCompoundPaddingBottom());
    }

    public final int v() {
        float q3;
        if (!this.f5534G) {
            return 0;
        }
        int i3 = this.f5546S;
        if (i3 == 0) {
            q3 = this.f5598z0.q();
        } else {
            if (i3 != 2) {
                return 0;
            }
            q3 = this.f5598z0.q() / 2.0f;
        }
        return (int) q3;
    }

    public final void v0() {
        EditText editText = this.f5561h;
        w0(editText == null ? null : editText.getText());
    }

    public final boolean w() {
        return this.f5546S == 2 && x();
    }

    public final void w0(Editable editable) {
        if (this.f5581r.a(editable) != 0 || this.f5596y0) {
            L();
        } else {
            e0();
        }
    }

    public final boolean x() {
        return this.f5548U > -1 && this.f5551a0 != 0;
    }

    public final void x0(boolean z3, boolean z4) {
        int defaultColor = this.f5582r0.getDefaultColor();
        int colorForState = this.f5582r0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f5582r0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z3) {
            this.f5551a0 = colorForState2;
        } else if (z4) {
            this.f5551a0 = colorForState;
        } else {
            this.f5551a0 = defaultColor;
        }
    }

    public final void y() {
        if (B()) {
            ((AbstractC0802h) this.f5537J).i0();
        }
    }

    public void y0() {
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.f5537J == null || this.f5546S == 0) {
            return;
        }
        boolean z3 = false;
        boolean z4 = isFocused() || ((editText2 = this.f5561h) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f5561h) != null && editText.isHovered())) {
            z3 = true;
        }
        if (!isEnabled()) {
            this.f5551a0 = this.f5592w0;
        } else if (b0()) {
            if (this.f5582r0 != null) {
                x0(z4, z3);
            } else {
                this.f5551a0 = getErrorCurrentTextColors();
            }
        } else if (!this.f5579q || (textView = this.f5583s) == null) {
            if (z4) {
                this.f5551a0 = this.f5580q0;
            } else if (z3) {
                this.f5551a0 = this.f5578p0;
            } else {
                this.f5551a0 = this.f5576o0;
            }
        } else if (this.f5582r0 != null) {
            x0(z4, z3);
        } else {
            this.f5551a0 = textView.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            l0();
        }
        this.f5559g.I();
        X();
        if (this.f5546S == 2) {
            int i3 = this.f5548U;
            if (z4 && isEnabled()) {
                this.f5548U = this.f5550W;
            } else {
                this.f5548U = this.f5549V;
            }
            if (this.f5548U != i3) {
                V();
            }
        }
        if (this.f5546S == 1) {
            if (!isEnabled()) {
                this.f5552b0 = this.f5586t0;
            } else if (z3 && !z4) {
                this.f5552b0 = this.f5590v0;
            } else if (z4) {
                this.f5552b0 = this.f5588u0;
            } else {
                this.f5552b0 = this.f5584s0;
            }
        }
        m();
    }

    public final void z(boolean z3) {
        ValueAnimator valueAnimator = this.f5527C0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f5527C0.cancel();
        }
        if (z3 && this.f5525B0) {
            l(1.0f);
        } else {
            this.f5598z0.c0(1.0f);
        }
        this.f5596y0 = false;
        if (B()) {
            U();
        }
        v0();
        this.f5557f.l(false);
        this.f5559g.H(false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public TextInputLayout(android.content.Context r20, android.util.AttributeSet r21, int r22) {
        /*
            Method dump skipped, instructions count: 858
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        this.f5559g.Q(charSequence);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f5559g.S(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f5559g.c0(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f5559g.j0(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f5559g.l0(drawable);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        this.f5557f.r(charSequence);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f5557f.s(drawable);
    }

    public void setHint(int i3) {
        setHint(i3 != 0 ? getResources().getText(i3) : null);
    }
}
