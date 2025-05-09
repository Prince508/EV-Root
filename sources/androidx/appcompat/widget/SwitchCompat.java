package androidx.appcompat.widget;

import K.O;
import Q.g;
import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.emoji2.text.c;
import d.AbstractC0435a;
import d.i;
import f.AbstractC0467a;
import i.C0498a;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import l.AbstractC0537C;
import l.AbstractC0548N;
import l.C0552S;
import l.C0570k;
import l.C0578s;
import l.c0;

/* loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* renamed from: W, reason: collision with root package name */
    public static final Property f3047W = new a(Float.class, "thumbPos");

    /* renamed from: a0, reason: collision with root package name */
    public static final int[] f3048a0 = {R.attr.state_checked};

    /* renamed from: A, reason: collision with root package name */
    public float f3049A;

    /* renamed from: B, reason: collision with root package name */
    public VelocityTracker f3050B;

    /* renamed from: C, reason: collision with root package name */
    public int f3051C;

    /* renamed from: D, reason: collision with root package name */
    public float f3052D;

    /* renamed from: E, reason: collision with root package name */
    public int f3053E;

    /* renamed from: F, reason: collision with root package name */
    public int f3054F;

    /* renamed from: G, reason: collision with root package name */
    public int f3055G;

    /* renamed from: H, reason: collision with root package name */
    public int f3056H;

    /* renamed from: I, reason: collision with root package name */
    public int f3057I;

    /* renamed from: J, reason: collision with root package name */
    public int f3058J;

    /* renamed from: K, reason: collision with root package name */
    public int f3059K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f3060L;

    /* renamed from: M, reason: collision with root package name */
    public final TextPaint f3061M;

    /* renamed from: N, reason: collision with root package name */
    public ColorStateList f3062N;

    /* renamed from: O, reason: collision with root package name */
    public Layout f3063O;

    /* renamed from: P, reason: collision with root package name */
    public Layout f3064P;

    /* renamed from: Q, reason: collision with root package name */
    public TransformationMethod f3065Q;

    /* renamed from: R, reason: collision with root package name */
    public ObjectAnimator f3066R;

    /* renamed from: S, reason: collision with root package name */
    public final C0578s f3067S;

    /* renamed from: T, reason: collision with root package name */
    public C0570k f3068T;

    /* renamed from: U, reason: collision with root package name */
    public c f3069U;

    /* renamed from: V, reason: collision with root package name */
    public final Rect f3070V;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f3071e;

    /* renamed from: f, reason: collision with root package name */
    public ColorStateList f3072f;

    /* renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f3073g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3074h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3075i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f3076j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f3077k;

    /* renamed from: l, reason: collision with root package name */
    public PorterDuff.Mode f3078l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3079m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3080n;

    /* renamed from: o, reason: collision with root package name */
    public int f3081o;

    /* renamed from: p, reason: collision with root package name */
    public int f3082p;

    /* renamed from: q, reason: collision with root package name */
    public int f3083q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3084r;

    /* renamed from: s, reason: collision with root package name */
    public CharSequence f3085s;

    /* renamed from: t, reason: collision with root package name */
    public CharSequence f3086t;

    /* renamed from: u, reason: collision with root package name */
    public CharSequence f3087u;

    /* renamed from: v, reason: collision with root package name */
    public CharSequence f3088v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f3089w;

    /* renamed from: x, reason: collision with root package name */
    public int f3090x;

    /* renamed from: y, reason: collision with root package name */
    public int f3091y;

    /* renamed from: z, reason: collision with root package name */
    public float f3092z;

    public class a extends Property {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.f3052D);
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(SwitchCompat switchCompat, Float f3) {
            switchCompat.setThumbPosition(f3.floatValue());
        }
    }

    public static class b {
        public static void a(ObjectAnimator objectAnimator, boolean z3) {
            objectAnimator.setAutoCancel(z3);
        }
    }

    public static class c extends c.e {

        /* renamed from: a, reason: collision with root package name */
        public final Reference f3093a;

        public c(SwitchCompat switchCompat) {
            this.f3093a = new WeakReference(switchCompat);
        }

        @Override // androidx.emoji2.text.c.e
        public void a(Throwable th) {
            SwitchCompat switchCompat = (SwitchCompat) this.f3093a.get();
            if (switchCompat != null) {
                switchCompat.j();
            }
        }

        @Override // androidx.emoji2.text.c.e
        public void b() {
            SwitchCompat switchCompat = (SwitchCompat) this.f3093a.get();
            if (switchCompat != null) {
                switchCompat.j();
            }
        }
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0435a.f6031r);
    }

    public static float f(float f3, float f4, float f5) {
        return f3 < f4 ? f4 : f3 > f5 ? f5 : f3;
    }

    private C0570k getEmojiTextViewHelper() {
        if (this.f3068T == null) {
            this.f3068T = new C0570k(this);
        }
        return this.f3068T;
    }

    private boolean getTargetCheckedState() {
        return this.f3052D > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((c0.a(this) ? 1.0f - this.f3052D : this.f3052D) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f3076j;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f3070V;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f3071e;
        Rect d3 = drawable2 != null ? AbstractC0537C.d(drawable2) : AbstractC0537C.f8153c;
        return ((((this.f3053E - this.f3055G) - rect.left) - rect.right) - d3.left) - d3.right;
    }

    private void setTextOffInternal(CharSequence charSequence) {
        this.f3087u = charSequence;
        this.f3088v = g(charSequence);
        this.f3064P = null;
        if (this.f3089w) {
            p();
        }
    }

    private void setTextOnInternal(CharSequence charSequence) {
        this.f3085s = charSequence;
        this.f3086t = g(charSequence);
        this.f3063O = null;
        if (this.f3089w) {
            p();
        }
    }

    public final void a(boolean z3) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, (Property<SwitchCompat, Float>) f3047W, z3 ? 1.0f : 0.0f);
        this.f3066R = ofFloat;
        ofFloat.setDuration(250L);
        b.a(this.f3066R, true);
        this.f3066R.start();
    }

    public final void b() {
        Drawable drawable = this.f3071e;
        if (drawable != null) {
            if (this.f3074h || this.f3075i) {
                Drawable mutate = D.a.l(drawable).mutate();
                this.f3071e = mutate;
                if (this.f3074h) {
                    D.a.i(mutate, this.f3072f);
                }
                if (this.f3075i) {
                    D.a.j(this.f3071e, this.f3073g);
                }
                if (this.f3071e.isStateful()) {
                    this.f3071e.setState(getDrawableState());
                }
            }
        }
    }

    public final void c() {
        Drawable drawable = this.f3076j;
        if (drawable != null) {
            if (this.f3079m || this.f3080n) {
                Drawable mutate = D.a.l(drawable).mutate();
                this.f3076j = mutate;
                if (this.f3079m) {
                    D.a.i(mutate, this.f3077k);
                }
                if (this.f3080n) {
                    D.a.j(this.f3076j, this.f3078l);
                }
                if (this.f3076j.isStateful()) {
                    this.f3076j.setState(getDrawableState());
                }
            }
        }
    }

    public final void d() {
        ObjectAnimator objectAnimator = this.f3066R;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i3;
        int i4;
        Rect rect = this.f3070V;
        int i5 = this.f3056H;
        int i6 = this.f3057I;
        int i7 = this.f3058J;
        int i8 = this.f3059K;
        int thumbOffset = getThumbOffset() + i5;
        Drawable drawable = this.f3071e;
        Rect d3 = drawable != null ? AbstractC0537C.d(drawable) : AbstractC0537C.f8153c;
        Drawable drawable2 = this.f3076j;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i9 = rect.left;
            thumbOffset += i9;
            if (d3 != null) {
                int i10 = d3.left;
                if (i10 > i9) {
                    i5 += i10 - i9;
                }
                int i11 = d3.top;
                int i12 = rect.top;
                i3 = i11 > i12 ? (i11 - i12) + i6 : i6;
                int i13 = d3.right;
                int i14 = rect.right;
                if (i13 > i14) {
                    i7 -= i13 - i14;
                }
                int i15 = d3.bottom;
                int i16 = rect.bottom;
                if (i15 > i16) {
                    i4 = i8 - (i15 - i16);
                    this.f3076j.setBounds(i5, i3, i7, i4);
                }
            } else {
                i3 = i6;
            }
            i4 = i8;
            this.f3076j.setBounds(i5, i3, i7, i4);
        }
        Drawable drawable3 = this.f3071e;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i17 = thumbOffset - rect.left;
            int i18 = thumbOffset + this.f3055G + rect.right;
            this.f3071e.setBounds(i17, i6, i18, i8);
            Drawable background = getBackground();
            if (background != null) {
                D.a.f(background, i17, i6, i18, i8);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f3, float f4) {
        super.drawableHotspotChanged(f3, f4);
        Drawable drawable = this.f3071e;
        if (drawable != null) {
            D.a.e(drawable, f3, f4);
        }
        Drawable drawable2 = this.f3076j;
        if (drawable2 != null) {
            D.a.e(drawable2, f3, f4);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f3071e;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f3076j;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    public final void e(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    public final CharSequence g(CharSequence charSequence) {
        TransformationMethod f3 = getEmojiTextViewHelper().f(this.f3065Q);
        return f3 != null ? f3.getTransformation(charSequence, this) : charSequence;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!c0.a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f3053E;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f3083q : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (c0.a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f3053E;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f3083q : compoundPaddingRight;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return g.p(super.getCustomSelectionActionModeCallback());
    }

    public boolean getShowText() {
        return this.f3089w;
    }

    public boolean getSplitTrack() {
        return this.f3084r;
    }

    public int getSwitchMinWidth() {
        return this.f3082p;
    }

    public int getSwitchPadding() {
        return this.f3083q;
    }

    public CharSequence getTextOff() {
        return this.f3087u;
    }

    public CharSequence getTextOn() {
        return this.f3085s;
    }

    public Drawable getThumbDrawable() {
        return this.f3071e;
    }

    public final float getThumbPosition() {
        return this.f3052D;
    }

    public int getThumbTextPadding() {
        return this.f3081o;
    }

    public ColorStateList getThumbTintList() {
        return this.f3072f;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f3073g;
    }

    public Drawable getTrackDrawable() {
        return this.f3076j;
    }

    public ColorStateList getTrackTintList() {
        return this.f3077k;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f3078l;
    }

    public final boolean h(float f3, float f4) {
        if (this.f3071e == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f3071e.getPadding(this.f3070V);
        int i3 = this.f3057I;
        int i4 = this.f3091y;
        int i5 = i3 - i4;
        int i6 = (this.f3056H + thumbOffset) - i4;
        int i7 = this.f3055G + i6;
        Rect rect = this.f3070V;
        return f3 > ((float) i6) && f3 < ((float) (((i7 + rect.left) + rect.right) + i4)) && f4 > ((float) i5) && f4 < ((float) (this.f3059K + i4));
    }

    public final Layout i(CharSequence charSequence) {
        return new StaticLayout(charSequence, this.f3061M, charSequence != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence, r2)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    public void j() {
        setTextOnInternal(this.f3085s);
        setTextOffInternal(this.f3087u);
        requestLayout();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f3071e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f3076j;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f3066R;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f3066R.end();
        this.f3066R = null;
    }

    public final void k() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.f3087u;
            if (charSequence == null) {
                charSequence = getResources().getString(d.g.f6141b);
            }
            O.x0(this, charSequence);
        }
    }

    public final void l() {
        if (Build.VERSION.SDK_INT >= 30) {
            CharSequence charSequence = this.f3085s;
            if (charSequence == null) {
                charSequence = getResources().getString(d.g.f6142c);
            }
            O.x0(this, charSequence);
        }
    }

    public void m(Context context, int i3) {
        C0552S r3 = C0552S.r(context, i3, i.f6290i2);
        ColorStateList c3 = r3.c(i.f6306m2);
        if (c3 != null) {
            this.f3062N = c3;
        } else {
            this.f3062N = getTextColors();
        }
        int f3 = r3.f(i.f6294j2, 0);
        if (f3 != 0) {
            float f4 = f3;
            if (f4 != this.f3061M.getTextSize()) {
                this.f3061M.setTextSize(f4);
                requestLayout();
            }
        }
        o(r3.j(i.f6298k2, -1), r3.j(i.f6302l2, -1));
        if (r3.a(i.f6326r2, false)) {
            this.f3065Q = new C0498a(getContext());
        } else {
            this.f3065Q = null;
        }
        setTextOnInternal(this.f3085s);
        setTextOffInternal(this.f3087u);
        r3.u();
    }

    public void n(Typeface typeface, int i3) {
        if (i3 <= 0) {
            this.f3061M.setFakeBoldText(false);
            this.f3061M.setTextSkewX(0.0f);
            setSwitchTypeface(typeface);
        } else {
            Typeface defaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i3) : Typeface.create(typeface, i3);
            setSwitchTypeface(defaultFromStyle);
            int i4 = (~(defaultFromStyle != null ? defaultFromStyle.getStyle() : 0)) & i3;
            this.f3061M.setFakeBoldText((i4 & 1) != 0);
            this.f3061M.setTextSkewX((i4 & 2) != 0 ? -0.25f : 0.0f);
        }
    }

    public final void o(int i3, int i4) {
        n(i3 != 1 ? i3 != 2 ? i3 != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF, i4);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i3) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i3 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f3048a0);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.f3070V;
        Drawable drawable = this.f3076j;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i3 = this.f3057I;
        int i4 = this.f3059K;
        int i5 = i3 + rect.top;
        int i6 = i4 - rect.bottom;
        Drawable drawable2 = this.f3071e;
        if (drawable != null) {
            if (!this.f3084r || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect d3 = AbstractC0537C.d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += d3.left;
                rect.right -= d3.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.f3063O : this.f3064P;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f3062N;
            if (colorStateList != null) {
                this.f3061M.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.f3061M.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i5 + i6) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (Build.VERSION.SDK_INT < 30) {
            CharSequence charSequence = isChecked() ? this.f3085s : this.f3087u;
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        int i7;
        int width;
        int i8;
        int i9;
        int i10;
        int i11;
        super.onLayout(z3, i3, i4, i5, i6);
        int i12 = 0;
        if (this.f3071e != null) {
            Rect rect = this.f3070V;
            Drawable drawable = this.f3076j;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect d3 = AbstractC0537C.d(this.f3071e);
            i7 = Math.max(0, d3.left - rect.left);
            i12 = Math.max(0, d3.right - rect.right);
        } else {
            i7 = 0;
        }
        if (c0.a(this)) {
            i8 = getPaddingLeft() + i7;
            width = ((this.f3053E + i8) - i7) - i12;
        } else {
            width = (getWidth() - getPaddingRight()) - i12;
            i8 = (width - this.f3053E) + i7 + i12;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int paddingTop = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2;
            i9 = this.f3054F;
            i10 = paddingTop - (i9 / 2);
        } else {
            if (gravity == 80) {
                i11 = getHeight() - getPaddingBottom();
                i10 = i11 - this.f3054F;
                this.f3056H = i8;
                this.f3057I = i10;
                this.f3059K = i11;
                this.f3058J = width;
            }
            i10 = getPaddingTop();
            i9 = this.f3054F;
        }
        i11 = i9 + i10;
        this.f3056H = i8;
        this.f3057I = i10;
        this.f3059K = i11;
        this.f3058J = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i3, int i4) {
        int i5;
        int i6;
        if (this.f3089w) {
            if (this.f3063O == null) {
                this.f3063O = i(this.f3086t);
            }
            if (this.f3064P == null) {
                this.f3064P = i(this.f3088v);
            }
        }
        Rect rect = this.f3070V;
        Drawable drawable = this.f3071e;
        int i7 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i5 = (this.f3071e.getIntrinsicWidth() - rect.left) - rect.right;
            i6 = this.f3071e.getIntrinsicHeight();
        } else {
            i5 = 0;
            i6 = 0;
        }
        this.f3055G = Math.max(this.f3089w ? Math.max(this.f3063O.getWidth(), this.f3064P.getWidth()) + (this.f3081o * 2) : 0, i5);
        Drawable drawable2 = this.f3076j;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i7 = this.f3076j.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i8 = rect.left;
        int i9 = rect.right;
        Drawable drawable3 = this.f3071e;
        if (drawable3 != null) {
            Rect d3 = AbstractC0537C.d(drawable3);
            i8 = Math.max(i8, d3.left);
            i9 = Math.max(i9, d3.right);
        }
        int max = this.f3060L ? Math.max(this.f3082p, (this.f3055G * 2) + i8 + i9) : this.f3082p;
        int max2 = Math.max(i7, i6);
        this.f3053E = max;
        this.f3054F = max2;
        super.onMeasure(i3, i4);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f3085s : this.f3087u;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0012, code lost:
    
        if (r0 != 3) goto L44;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            android.view.VelocityTracker r0 = r6.f3050B
            r0.addMovement(r7)
            int r0 = r7.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L9d
            r2 = 2
            if (r0 == r1) goto L89
            if (r0 == r2) goto L16
            r3 = 3
            if (r0 == r3) goto L89
            goto Lb7
        L16:
            int r0 = r6.f3090x
            if (r0 == r1) goto L55
            if (r0 == r2) goto L1e
            goto Lb7
        L1e:
            float r7 = r7.getX()
            int r0 = r6.getThumbScrollRange()
            float r2 = r6.f3092z
            float r2 = r7 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r0 == 0) goto L32
            float r0 = (float) r0
            float r2 = r2 / r0
            goto L3b
        L32:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L38
            r2 = r3
            goto L3b
        L38:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = r0
        L3b:
            boolean r0 = l.c0.a(r6)
            if (r0 == 0) goto L42
            float r2 = -r2
        L42:
            float r0 = r6.f3052D
            float r0 = r0 + r2
            float r0 = f(r0, r4, r3)
            float r2 = r6.f3052D
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L54
            r6.f3092z = r7
            r6.setThumbPosition(r0)
        L54:
            return r1
        L55:
            float r0 = r7.getX()
            float r3 = r7.getY()
            float r4 = r6.f3092z
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f3091y
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L7b
            float r4 = r6.f3049A
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f3091y
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto Lb7
        L7b:
            r6.f3090x = r2
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            r6.f3092z = r0
            r6.f3049A = r3
            return r1
        L89:
            int r0 = r6.f3090x
            if (r0 != r2) goto L94
            r6.q(r7)
            super.onTouchEvent(r7)
            return r1
        L94:
            r0 = 0
            r6.f3090x = r0
            android.view.VelocityTracker r0 = r6.f3050B
            r0.clear()
            goto Lb7
        L9d:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r3 = r6.isEnabled()
            if (r3 == 0) goto Lb7
            boolean r3 = r6.h(r0, r2)
            if (r3 == 0) goto Lb7
            r6.f3090x = r1
            r6.f3092z = r0
            r6.f3049A = r2
        Lb7:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        if (this.f3069U == null && this.f3068T.b() && androidx.emoji2.text.c.h()) {
            androidx.emoji2.text.c b3 = androidx.emoji2.text.c.b();
            int d3 = b3.d();
            if (d3 == 3 || d3 == 0) {
                c cVar = new c(this);
                this.f3069U = cVar;
                b3.s(cVar);
            }
        }
    }

    public final void q(MotionEvent motionEvent) {
        this.f3090x = 0;
        boolean z3 = true;
        boolean z4 = motionEvent.getAction() == 1 && isEnabled();
        boolean isChecked = isChecked();
        if (z4) {
            this.f3050B.computeCurrentVelocity(1000);
            float xVelocity = this.f3050B.getXVelocity();
            if (Math.abs(xVelocity) <= this.f3051C) {
                z3 = getTargetCheckedState();
            } else if (!c0.a(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                z3 = false;
            }
        } else {
            z3 = isChecked;
        }
        if (z3 != isChecked) {
            playSoundEffect(0);
        }
        setChecked(z3);
        e(motionEvent);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z3) {
        super.setAllCaps(z3);
        getEmojiTextViewHelper().d(z3);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z3) {
        super.setChecked(z3);
        boolean isChecked = isChecked();
        if (isChecked) {
            l();
        } else {
            k();
        }
        if (getWindowToken() != null && O.O(this)) {
            a(isChecked);
        } else {
            d();
            setThumbPosition(isChecked ? 1.0f : 0.0f);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(g.q(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z3) {
        getEmojiTextViewHelper().e(z3);
        setTextOnInternal(this.f3085s);
        setTextOffInternal(this.f3087u);
        requestLayout();
    }

    public final void setEnforceSwitchWidth(boolean z3) {
        this.f3060L = z3;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setShowText(boolean z3) {
        if (this.f3089w != z3) {
            this.f3089w = z3;
            requestLayout();
            if (z3) {
                p();
            }
        }
    }

    public void setSplitTrack(boolean z3) {
        this.f3084r = z3;
        invalidate();
    }

    public void setSwitchMinWidth(int i3) {
        this.f3082p = i3;
        requestLayout();
    }

    public void setSwitchPadding(int i3) {
        this.f3083q = i3;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.f3061M.getTypeface() == null || this.f3061M.getTypeface().equals(typeface)) && (this.f3061M.getTypeface() != null || typeface == null)) {
            return;
        }
        this.f3061M.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        setTextOffInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            return;
        }
        k();
    }

    public void setTextOn(CharSequence charSequence) {
        setTextOnInternal(charSequence);
        requestLayout();
        if (isChecked()) {
            l();
        }
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f3071e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f3071e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f3) {
        this.f3052D = f3;
        invalidate();
    }

    public void setThumbResource(int i3) {
        setThumbDrawable(AbstractC0467a.b(getContext(), i3));
    }

    public void setThumbTextPadding(int i3) {
        this.f3081o = i3;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f3072f = colorStateList;
        this.f3074h = true;
        b();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f3073g = mode;
        this.f3075i = true;
        b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f3076j;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f3076j = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i3) {
        setTrackDrawable(AbstractC0467a.b(getContext(), i3));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f3077k = colorStateList;
        this.f3079m = true;
        c();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f3078l = mode;
        this.f3080n = true;
        c();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f3071e || drawable == this.f3076j;
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        this.f3072f = null;
        this.f3073g = null;
        this.f3074h = false;
        this.f3075i = false;
        this.f3077k = null;
        this.f3078l = null;
        this.f3079m = false;
        this.f3080n = false;
        this.f3050B = VelocityTracker.obtain();
        this.f3060L = true;
        this.f3070V = new Rect();
        AbstractC0548N.a(this, getContext());
        TextPaint textPaint = new TextPaint(1);
        this.f3061M = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        int[] iArr = i.f6234T1;
        C0552S t3 = C0552S.t(context, attributeSet, iArr, i3, 0);
        O.h0(this, context, iArr, attributeSet, t3.p(), i3, 0);
        Drawable g3 = t3.g(i.f6245W1);
        this.f3071e = g3;
        if (g3 != null) {
            g3.setCallback(this);
        }
        Drawable g4 = t3.g(i.f6278f2);
        this.f3076j = g4;
        if (g4 != null) {
            g4.setCallback(this);
        }
        setTextOnInternal(t3.o(i.f6238U1));
        setTextOffInternal(t3.o(i.f6242V1));
        this.f3089w = t3.a(i.f6248X1, true);
        this.f3081o = t3.f(i.f6266c2, 0);
        this.f3082p = t3.f(i.f6254Z1, 0);
        this.f3083q = t3.f(i.f6258a2, 0);
        this.f3084r = t3.a(i.f6251Y1, false);
        ColorStateList c3 = t3.c(i.f6270d2);
        if (c3 != null) {
            this.f3072f = c3;
            this.f3074h = true;
        }
        PorterDuff.Mode e3 = AbstractC0537C.e(t3.j(i.f6274e2, -1), null);
        if (this.f3073g != e3) {
            this.f3073g = e3;
            this.f3075i = true;
        }
        if (this.f3074h || this.f3075i) {
            b();
        }
        ColorStateList c4 = t3.c(i.f6282g2);
        if (c4 != null) {
            this.f3077k = c4;
            this.f3079m = true;
        }
        PorterDuff.Mode e4 = AbstractC0537C.e(t3.j(i.f6286h2, -1), null);
        if (this.f3078l != e4) {
            this.f3078l = e4;
            this.f3080n = true;
        }
        if (this.f3079m || this.f3080n) {
            c();
        }
        int m3 = t3.m(i.f6262b2, 0);
        if (m3 != 0) {
            m(context, m3);
        }
        C0578s c0578s = new C0578s(this);
        this.f3067S = c0578s;
        c0578s.m(attributeSet, i3);
        t3.u();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f3091y = viewConfiguration.getScaledTouchSlop();
        this.f3051C = viewConfiguration.getScaledMinimumFlingVelocity();
        getEmojiTextViewHelper().c(attributeSet, i3);
        refreshDrawableState();
        setChecked(isChecked());
    }
}
