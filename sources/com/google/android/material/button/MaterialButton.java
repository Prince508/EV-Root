package com.google.android.material.button;

import K.O;
import Q.g;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import e1.AbstractC0464a;
import e1.i;
import f.AbstractC0467a;
import i1.C0502a;
import j.AbstractC0515e;
import java.util.Iterator;
import java.util.LinkedHashSet;
import l.AbstractC0564e;
import x1.h;
import x1.k;
import x1.n;

/* loaded from: classes.dex */
public class MaterialButton extends AbstractC0564e implements Checkable, n {

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f5112v = {R.attr.state_checkable};

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f5113w = {R.attr.state_checked};

    /* renamed from: x, reason: collision with root package name */
    public static final int f5114x = i.f6955g;

    /* renamed from: h, reason: collision with root package name */
    public final C0502a f5115h;

    /* renamed from: i, reason: collision with root package name */
    public final LinkedHashSet f5116i;

    /* renamed from: j, reason: collision with root package name */
    public a f5117j;

    /* renamed from: k, reason: collision with root package name */
    public PorterDuff.Mode f5118k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f5119l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f5120m;

    /* renamed from: n, reason: collision with root package name */
    public String f5121n;

    /* renamed from: o, reason: collision with root package name */
    public int f5122o;

    /* renamed from: p, reason: collision with root package name */
    public int f5123p;

    /* renamed from: q, reason: collision with root package name */
    public int f5124q;

    /* renamed from: r, reason: collision with root package name */
    public int f5125r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f5126s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f5127t;

    /* renamed from: u, reason: collision with root package name */
    public int f5128u;

    public interface a {
        void a(MaterialButton materialButton, boolean z3);
    }

    public static class b extends S.a {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: g, reason: collision with root package name */
        public boolean f5129g;

        public class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new b(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i3) {
                return new b[i3];
            }
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }

        public final void b(Parcel parcel) {
            this.f5129g = parcel.readInt() == 1;
        }

        @Override // S.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i3) {
            super.writeToParcel(parcel, i3);
            parcel.writeInt(this.f5129g ? 1 : 0);
        }

        public b(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            b(parcel);
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0464a.f6796n);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float f3 = 0.0f;
        for (int i3 = 0; i3 < lineCount; i3++) {
            f3 = Math.max(f3, getLayout().getLineWidth(i3));
        }
        return (int) Math.ceil(f3);
    }

    public boolean a() {
        C0502a c0502a = this.f5115h;
        return c0502a != null && c0502a.p();
    }

    public final boolean b() {
        int i3 = this.f5128u;
        return i3 == 3 || i3 == 4;
    }

    public final boolean c() {
        int i3 = this.f5128u;
        return i3 == 1 || i3 == 2;
    }

    public final boolean d() {
        int i3 = this.f5128u;
        return i3 == 16 || i3 == 32;
    }

    public final boolean e() {
        return O.w(this) == 1;
    }

    public final boolean f() {
        C0502a c0502a = this.f5115h;
        return (c0502a == null || c0502a.o()) ? false : true;
    }

    public final void g() {
        if (c()) {
            g.i(this, this.f5120m, null, null, null);
        } else if (b()) {
            g.i(this, null, null, this.f5120m, null);
        } else if (d()) {
            g.i(this, null, this.f5120m, null, null);
        }
    }

    public String getA11yClassName() {
        if (TextUtils.isEmpty(this.f5121n)) {
            return (a() ? CompoundButton.class : Button.class).getName();
        }
        return this.f5121n;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (f()) {
            return this.f5115h.b();
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f5120m;
    }

    public int getIconGravity() {
        return this.f5128u;
    }

    public int getIconPadding() {
        return this.f5125r;
    }

    public int getIconSize() {
        return this.f5122o;
    }

    public ColorStateList getIconTint() {
        return this.f5119l;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f5118k;
    }

    public int getInsetBottom() {
        return this.f5115h.c();
    }

    public int getInsetTop() {
        return this.f5115h.d();
    }

    public ColorStateList getRippleColor() {
        if (f()) {
            return this.f5115h.h();
        }
        return null;
    }

    public k getShapeAppearanceModel() {
        if (f()) {
            return this.f5115h.i();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (f()) {
            return this.f5115h.j();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (f()) {
            return this.f5115h.k();
        }
        return 0;
    }

    @Override // l.AbstractC0564e
    public ColorStateList getSupportBackgroundTintList() {
        return f() ? this.f5115h.l() : super.getSupportBackgroundTintList();
    }

    @Override // l.AbstractC0564e
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return f() ? this.f5115h.m() : super.getSupportBackgroundTintMode();
    }

    public final void h(boolean z3) {
        Drawable drawable = this.f5120m;
        if (drawable != null) {
            Drawable mutate = D.a.l(drawable).mutate();
            this.f5120m = mutate;
            D.a.i(mutate, this.f5119l);
            PorterDuff.Mode mode = this.f5118k;
            if (mode != null) {
                D.a.j(this.f5120m, mode);
            }
            int i3 = this.f5122o;
            if (i3 == 0) {
                i3 = this.f5120m.getIntrinsicWidth();
            }
            int i4 = this.f5122o;
            if (i4 == 0) {
                i4 = this.f5120m.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f5120m;
            int i5 = this.f5123p;
            int i6 = this.f5124q;
            drawable2.setBounds(i5, i6, i3 + i5, i4 + i6);
            this.f5120m.setVisible(true, z3);
        }
        if (z3) {
            g();
            return;
        }
        Drawable[] a3 = g.a(this);
        Drawable drawable3 = a3[0];
        Drawable drawable4 = a3[1];
        Drawable drawable5 = a3[2];
        if ((!c() || drawable3 == this.f5120m) && ((!b() || drawable5 == this.f5120m) && (!d() || drawable4 == this.f5120m))) {
            return;
        }
        g();
    }

    public final void i(int i3, int i4) {
        if (this.f5120m == null || getLayout() == null) {
            return;
        }
        if (!c() && !b()) {
            if (d()) {
                this.f5123p = 0;
                if (this.f5128u == 16) {
                    this.f5124q = 0;
                    h(false);
                    return;
                }
                int i5 = this.f5122o;
                if (i5 == 0) {
                    i5 = this.f5120m.getIntrinsicHeight();
                }
                int max = Math.max(0, (((((i4 - getTextHeight()) - getPaddingTop()) - i5) - this.f5125r) - getPaddingBottom()) / 2);
                if (this.f5124q != max) {
                    this.f5124q = max;
                    h(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f5124q = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i6 = this.f5128u;
        if (i6 == 1 || i6 == 3 || ((i6 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i6 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f5123p = 0;
            h(false);
            return;
        }
        int i7 = this.f5122o;
        if (i7 == 0) {
            i7 = this.f5120m.getIntrinsicWidth();
        }
        int textLayoutWidth = ((((i3 - getTextLayoutWidth()) - O.A(this)) - i7) - this.f5125r) - O.B(this);
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        if (e() != (this.f5128u == 4)) {
            textLayoutWidth = -textLayoutWidth;
        }
        if (this.f5123p != textLayoutWidth) {
            this.f5123p = textLayoutWidth;
            h(false);
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f5126s;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (f()) {
            h.f(this, this.f5115h.f());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i3) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i3 + 2);
        if (a()) {
            View.mergeDrawableStates(onCreateDrawableState, f5112v);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f5113w);
        }
        return onCreateDrawableState;
    }

    @Override // l.AbstractC0564e, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // l.AbstractC0564e, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // l.AbstractC0564e, android.widget.TextView, android.view.View
    public void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        super.onLayout(z3, i3, i4, i5, i6);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.a());
        setChecked(bVar.f5129g);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f5129g = this.f5126s;
        return bVar;
    }

    @Override // l.AbstractC0564e, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
        super.onTextChanged(charSequence, i3, i4, i5);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean performClick() {
        if (this.f5115h.q()) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f5120m != null) {
            if (this.f5120m.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f5121n = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i3) {
        if (f()) {
            this.f5115h.s(i3);
        } else {
            super.setBackgroundColor(i3);
        }
    }

    @Override // l.AbstractC0564e, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!f()) {
            super.setBackgroundDrawable(drawable);
        } else {
            if (drawable == getBackground()) {
                getBackground().setState(drawable.getState());
                return;
            }
            Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            this.f5115h.t();
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // l.AbstractC0564e, android.view.View
    public void setBackgroundResource(int i3) {
        setBackgroundDrawable(i3 != 0 ? AbstractC0467a.b(getContext(), i3) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z3) {
        if (f()) {
            this.f5115h.u(z3);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z3) {
        if (a() && isEnabled() && this.f5126s != z3) {
            this.f5126s = z3;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                ((MaterialButtonToggleGroup) getParent()).m(this, this.f5126s);
            }
            if (this.f5127t) {
                return;
            }
            this.f5127t = true;
            Iterator it = this.f5116i.iterator();
            if (it.hasNext()) {
                AbstractC0515e.a(it.next());
                throw null;
            }
            this.f5127t = false;
        }
    }

    public void setCornerRadius(int i3) {
        if (f()) {
            this.f5115h.v(i3);
        }
    }

    public void setCornerRadiusResource(int i3) {
        if (f()) {
            setCornerRadius(getResources().getDimensionPixelSize(i3));
        }
    }

    @Override // android.view.View
    public void setElevation(float f3) {
        super.setElevation(f3);
        if (f()) {
            this.f5115h.f().S(f3);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f5120m != drawable) {
            this.f5120m = drawable;
            h(true);
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i3) {
        if (this.f5128u != i3) {
            this.f5128u = i3;
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i3) {
        if (this.f5125r != i3) {
            this.f5125r = i3;
            setCompoundDrawablePadding(i3);
        }
    }

    public void setIconResource(int i3) {
        setIcon(i3 != 0 ? AbstractC0467a.b(getContext(), i3) : null);
    }

    public void setIconSize(int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f5122o != i3) {
            this.f5122o = i3;
            h(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f5119l != colorStateList) {
            this.f5119l = colorStateList;
            h(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f5118k != mode) {
            this.f5118k = mode;
            h(false);
        }
    }

    public void setIconTintResource(int i3) {
        setIconTint(AbstractC0467a.a(getContext(), i3));
    }

    public void setInsetBottom(int i3) {
        this.f5115h.w(i3);
    }

    public void setInsetTop(int i3) {
        this.f5115h.x(i3);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(a aVar) {
        this.f5117j = aVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z3) {
        a aVar = this.f5117j;
        if (aVar != null) {
            aVar.a(this, z3);
        }
        super.setPressed(z3);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (f()) {
            this.f5115h.y(colorStateList);
        }
    }

    public void setRippleColorResource(int i3) {
        if (f()) {
            setRippleColor(AbstractC0467a.a(getContext(), i3));
        }
    }

    @Override // x1.n
    public void setShapeAppearanceModel(k kVar) {
        if (!f()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f5115h.z(kVar);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z3) {
        if (f()) {
            this.f5115h.A(z3);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (f()) {
            this.f5115h.B(colorStateList);
        }
    }

    public void setStrokeColorResource(int i3) {
        if (f()) {
            setStrokeColor(AbstractC0467a.a(getContext(), i3));
        }
    }

    public void setStrokeWidth(int i3) {
        if (f()) {
            this.f5115h.C(i3);
        }
    }

    public void setStrokeWidthResource(int i3) {
        if (f()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i3));
        }
    }

    @Override // l.AbstractC0564e
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (f()) {
            this.f5115h.D(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // l.AbstractC0564e
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (f()) {
            this.f5115h.E(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i3) {
        super.setTextAlignment(i3);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z3) {
        this.f5115h.F(z3);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f5126s);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MaterialButton(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = com.google.android.material.button.MaterialButton.f5114x
            android.content.Context r7 = A1.a.c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            r6.f5116i = r7
            r7 = 0
            r6.f5126s = r7
            r6.f5127t = r7
            android.content.Context r0 = r6.getContext()
            int[] r2 = e1.j.f7039T1
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = r1.k.h(r0, r1, r2, r3, r4, r5)
            int r9 = e1.j.f7087g2
            int r9 = r8.getDimensionPixelSize(r9, r7)
            r6.f5125r = r9
            int r9 = e1.j.f7099j2
            r2 = -1
            int r9 = r8.getInt(r9, r2)
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            android.graphics.PorterDuff$Mode r9 = r1.n.h(r9, r2)
            r6.f5118k = r9
            android.content.Context r9 = r6.getContext()
            int r2 = e1.j.f7095i2
            android.content.res.ColorStateList r9 = u1.AbstractC0740c.a(r9, r8, r2)
            r6.f5119l = r9
            android.content.Context r9 = r6.getContext()
            int r2 = e1.j.f7079e2
            android.graphics.drawable.Drawable r9 = u1.AbstractC0740c.c(r9, r8, r2)
            r6.f5120m = r9
            int r9 = e1.j.f7083f2
            r2 = 1
            int r9 = r8.getInteger(r9, r2)
            r6.f5128u = r9
            int r9 = e1.j.f7091h2
            int r9 = r8.getDimensionPixelSize(r9, r7)
            r6.f5122o = r9
            x1.k$b r9 = x1.k.e(r0, r1, r3, r4)
            x1.k r9 = r9.m()
            i1.a r0 = new i1.a
            r0.<init>(r6, r9)
            r6.f5115h = r0
            r0.r(r8)
            r8.recycle()
            int r8 = r6.f5125r
            r6.setCompoundDrawablePadding(r8)
            android.graphics.drawable.Drawable r8 = r6.f5120m
            if (r8 == 0) goto L82
            r7 = r2
        L82:
            r6.h(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
