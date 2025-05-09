package com.google.android.material.chip;

import K.O;
import L.x;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.android.material.chip.a;
import e1.AbstractC0464a;
import e1.h;
import e1.i;
import e1.j;
import java.util.List;
import l.AbstractC0565f;
import r1.f;
import u1.AbstractC0743f;
import u1.C0741d;
import v1.AbstractC0758b;
import x1.k;
import x1.n;

/* loaded from: classes.dex */
public class Chip extends AbstractC0565f implements a.InterfaceC0107a, n, Checkable {

    /* renamed from: A, reason: collision with root package name */
    public static final int f5201A = i.f6956h;

    /* renamed from: B, reason: collision with root package name */
    public static final Rect f5202B = new Rect();

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f5203C = {R.attr.state_selected};

    /* renamed from: D, reason: collision with root package name */
    public static final int[] f5204D = {R.attr.state_checkable};

    /* renamed from: i, reason: collision with root package name */
    public com.google.android.material.chip.a f5205i;

    /* renamed from: j, reason: collision with root package name */
    public InsetDrawable f5206j;

    /* renamed from: k, reason: collision with root package name */
    public RippleDrawable f5207k;

    /* renamed from: l, reason: collision with root package name */
    public View.OnClickListener f5208l;

    /* renamed from: m, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f5209m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f5210n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f5211o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f5212p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f5213q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f5214r;

    /* renamed from: s, reason: collision with root package name */
    public int f5215s;

    /* renamed from: t, reason: collision with root package name */
    public int f5216t;

    /* renamed from: u, reason: collision with root package name */
    public CharSequence f5217u;

    /* renamed from: v, reason: collision with root package name */
    public final c f5218v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f5219w;

    /* renamed from: x, reason: collision with root package name */
    public final Rect f5220x;

    /* renamed from: y, reason: collision with root package name */
    public final RectF f5221y;

    /* renamed from: z, reason: collision with root package name */
    public final AbstractC0743f f5222z;

    public class a extends AbstractC0743f {
        public a() {
        }

        @Override // u1.AbstractC0743f
        public void a(int i3) {
        }

        @Override // u1.AbstractC0743f
        public void b(Typeface typeface, boolean z3) {
            Chip chip = Chip.this;
            chip.setText(chip.f5205i.G2() ? Chip.this.f5205i.b1() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    public class b extends ViewOutlineProvider {
        public b() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (Chip.this.f5205i != null) {
                Chip.this.f5205i.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    public class c extends T.a {
        public c(Chip chip) {
            super(chip);
        }

        @Override // T.a
        public int B(float f3, float f4) {
            return (Chip.this.n() && Chip.this.getCloseIconTouchBounds().contains(f3, f4)) ? 1 : 0;
        }

        @Override // T.a
        public void C(List list) {
            list.add(0);
            if (Chip.this.n() && Chip.this.s() && Chip.this.f5208l != null) {
                list.add(1);
            }
        }

        @Override // T.a
        public boolean J(int i3, int i4, Bundle bundle) {
            if (i4 != 16) {
                return false;
            }
            if (i3 == 0) {
                return Chip.this.performClick();
            }
            if (i3 == 1) {
                return Chip.this.t();
            }
            return false;
        }

        @Override // T.a
        public void M(x xVar) {
            xVar.h0(Chip.this.r());
            xVar.k0(Chip.this.isClickable());
            xVar.j0(Chip.this.getAccessibilityClassName());
            xVar.F0(Chip.this.getText());
        }

        @Override // T.a
        public void N(int i3, x xVar) {
            if (i3 != 1) {
                xVar.n0("");
                xVar.f0(Chip.f5202B);
                return;
            }
            CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                xVar.n0(closeIconContentDescription);
            } else {
                CharSequence text = Chip.this.getText();
                xVar.n0(Chip.this.getContext().getString(h.f6936h, TextUtils.isEmpty(text) ? "" : text).trim());
            }
            xVar.f0(Chip.this.getCloseIconTouchBoundsInt());
            xVar.b(x.a.f1280i);
            xVar.o0(Chip.this.isEnabled());
        }

        @Override // T.a
        public void O(int i3, boolean z3) {
            if (i3 == 1) {
                Chip.this.f5213q = z3;
                Chip.this.refreshDrawableState();
            }
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0464a.f6784b);
    }

    public static /* synthetic */ void b(Chip chip, CompoundButton compoundButton, boolean z3) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = chip.f5209m;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(compoundButton, z3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.f5221y.setEmpty();
        if (n() && this.f5208l != null) {
            this.f5205i.S0(this.f5221y);
        }
        return this.f5221y;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.f5220x.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.f5220x;
    }

    private C0741d getTextAppearance() {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            return aVar.c1();
        }
        return null;
    }

    private void setCloseIconHovered(boolean z3) {
        if (this.f5212p != z3) {
            this.f5212p = z3;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z3) {
        if (this.f5211o != z3) {
            this.f5211o = z3;
            refreshDrawableState();
        }
    }

    public final void A() {
        com.google.android.material.chip.a aVar;
        if (TextUtils.isEmpty(getText()) || (aVar = this.f5205i) == null) {
            return;
        }
        int D02 = (int) (aVar.D0() + this.f5205i.d1() + this.f5205i.k0());
        int I02 = (int) (this.f5205i.I0() + this.f5205i.e1() + this.f5205i.g0());
        if (this.f5206j != null) {
            Rect rect = new Rect();
            this.f5206j.getPadding(rect);
            I02 += rect.left;
            D02 += rect.right;
        }
        O.w0(this, I02, getPaddingTop(), D02, getPaddingBottom());
    }

    public final void B() {
        TextPaint paint = getPaint();
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            paint.drawableState = aVar.getState();
        }
        C0741d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.n(getContext(), paint, this.f5222z);
        }
    }

    public final void C(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        }
    }

    @Override // com.google.android.material.chip.a.InterfaceC0107a
    public void a() {
        l(this.f5216t);
        requestLayout();
        invalidateOutline();
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return !this.f5219w ? super.dispatchHoverEvent(motionEvent) : this.f5218v.v(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f5219w) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (!this.f5218v.w(keyEvent) || this.f5218v.A() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // l.AbstractC0565f, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        com.google.android.material.chip.a aVar = this.f5205i;
        if ((aVar == null || !aVar.j1()) ? false : this.f5205i.f2(k())) {
            invalidate();
        }
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f5217u)) {
            return this.f5217u;
        }
        if (!r()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f5206j;
        return insetDrawable == null ? this.f5205i : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            return aVar.z0();
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            return aVar.A0();
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            return aVar.B0();
        }
        return null;
    }

    public float getChipCornerRadius() {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            return Math.max(0.0f, aVar.C0());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f5205i;
    }

    public float getChipEndPadding() {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            return aVar.D0();
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            return aVar.E0();
        }
        return null;
    }

    public float getChipIconSize() {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            return aVar.F0();
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            return aVar.G0();
        }
        return null;
    }

    public float getChipMinHeight() {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            return aVar.H0();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            return aVar.I0();
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            return aVar.J0();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            return aVar.K0();
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            return aVar.L0();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            return aVar.M0();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            return aVar.N0();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            return aVar.O0();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            return aVar.P0();
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            return aVar.R0();
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            return aVar.V0();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        if (this.f5219w && (this.f5218v.A() == 1 || this.f5218v.x() == 1)) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public f1.c getHideMotionSpec() {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            return aVar.W0();
        }
        return null;
    }

    public float getIconEndPadding() {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            return aVar.X0();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            return aVar.Y0();
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            return aVar.Z0();
        }
        return null;
    }

    public k getShapeAppearanceModel() {
        return this.f5205i.A();
    }

    public f1.c getShowMotionSpec() {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            return aVar.a1();
        }
        return null;
    }

    public float getTextEndPadding() {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            return aVar.d1();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            return aVar.e1();
        }
        return 0.0f;
    }

    public final void j(com.google.android.material.chip.a aVar) {
        aVar.j2(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final int[] k() {
        ?? isEnabled = isEnabled();
        int i3 = isEnabled;
        if (this.f5213q) {
            i3 = isEnabled + 1;
        }
        int i4 = i3;
        if (this.f5212p) {
            i4 = i3 + 1;
        }
        int i5 = i4;
        if (this.f5211o) {
            i5 = i4 + 1;
        }
        int i6 = i5;
        if (isChecked()) {
            i6 = i5 + 1;
        }
        int[] iArr = new int[i6];
        int i7 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i7 = 1;
        }
        if (this.f5213q) {
            iArr[i7] = 16842908;
            i7++;
        }
        if (this.f5212p) {
            iArr[i7] = 16843623;
            i7++;
        }
        if (this.f5211o) {
            iArr[i7] = 16842919;
            i7++;
        }
        if (isChecked()) {
            iArr[i7] = 16842913;
        }
        return iArr;
    }

    public boolean l(int i3) {
        this.f5216t = i3;
        if (!v()) {
            if (this.f5206j != null) {
                u();
            } else {
                y();
            }
            return false;
        }
        int max = Math.max(0, i3 - this.f5205i.getIntrinsicHeight());
        int max2 = Math.max(0, i3 - this.f5205i.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            if (this.f5206j != null) {
                u();
            } else {
                y();
            }
            return false;
        }
        int i4 = max2 > 0 ? max2 / 2 : 0;
        int i5 = max > 0 ? max / 2 : 0;
        if (this.f5206j != null) {
            Rect rect = new Rect();
            this.f5206j.getPadding(rect);
            if (rect.top == i5 && rect.bottom == i5 && rect.left == i4 && rect.right == i4) {
                y();
                return true;
            }
        }
        if (getMinHeight() != i3) {
            setMinHeight(i3);
        }
        if (getMinWidth() != i3) {
            setMinWidth(i3);
        }
        q(i4, i5, i4, i5);
        y();
        return true;
    }

    public final void m() {
        if (getBackgroundDrawable() == this.f5206j && this.f5205i.getCallback() == null) {
            this.f5205i.setCallback(this.f5206j);
        }
    }

    public final boolean n() {
        com.google.android.material.chip.a aVar = this.f5205i;
        return (aVar == null || aVar.L0() == null) ? false : true;
    }

    public final void o(Context context, AttributeSet attributeSet, int i3) {
        TypedArray h3 = r1.k.h(context, attributeSet, j.f7065b0, i3, f5201A, new int[0]);
        this.f5214r = h3.getBoolean(j.f6990H0, false);
        this.f5216t = (int) Math.ceil(h3.getDimension(j.f7145v0, (float) Math.ceil(r1.n.c(getContext(), 48))));
        h3.recycle();
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        x1.h.f(this, this.f5205i);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i3) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i3 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f5203C);
        }
        if (r()) {
            View.mergeDrawableStates(onCreateDrawableState, f5204D);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z3, int i3, Rect rect) {
        super.onFocusChanged(z3, i3, rect);
        if (this.f5219w) {
            this.f5218v.I(z3, i3, rect);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(r());
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i3) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i3);
    }

    @Override // android.widget.TextView, android.view.View
    public void onRtlPropertiesChanged(int i3) {
        super.onRtlPropertiesChanged(i3);
        if (this.f5215s != i3) {
            this.f5215s = i3;
            A();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r0 != 3) goto L22;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L3a
            if (r0 == r2) goto L2c
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L35
            goto L40
        L21:
            boolean r0 = r5.f5211o
            if (r0 == 0) goto L40
            if (r1 != 0) goto L2a
            r5.setCloseIconPressed(r3)
        L2a:
            r0 = r2
            goto L41
        L2c:
            boolean r0 = r5.f5211o
            if (r0 == 0) goto L35
            r5.t()
            r0 = r2
            goto L36
        L35:
            r0 = r3
        L36:
            r5.setCloseIconPressed(r3)
            goto L41
        L3a:
            if (r1 == 0) goto L40
            r5.setCloseIconPressed(r2)
            goto L2a
        L40:
            r0 = r3
        L41:
            if (r0 != 0) goto L4b
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L4a
            goto L4b
        L4a:
            return r3
        L4b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        setOutlineProvider(new b());
    }

    public final void q(int i3, int i4, int i5, int i6) {
        this.f5206j = new InsetDrawable((Drawable) this.f5205i, i3, i4, i5, i6);
    }

    public boolean r() {
        com.google.android.material.chip.a aVar = this.f5205i;
        return aVar != null && aVar.i1();
    }

    public boolean s() {
        com.google.android.material.chip.a aVar = this.f5205i;
        return aVar != null && aVar.k1();
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f5217u = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f5207k) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i3) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // l.AbstractC0565f, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f5207k) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // l.AbstractC0565f, android.view.View
    public void setBackgroundResource(int i3) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z3) {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            aVar.r1(z3);
        }
    }

    public void setCheckableResource(int i3) {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            aVar.s1(i3);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z3) {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar == null) {
            this.f5210n = z3;
        } else if (aVar.i1()) {
            super.setChecked(z3);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            aVar.t1(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z3) {
        setCheckedIconVisible(z3);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i3) {
        setCheckedIconVisible(i3);
    }

    public void setCheckedIconResource(int i3) {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            aVar.u1(i3);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            aVar.v1(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i3) {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            aVar.w1(i3);
        }
    }

    public void setCheckedIconVisible(int i3) {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            aVar.x1(i3);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            aVar.z1(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(int i3) {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            aVar.A1(i3);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f3) {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            aVar.B1(f3);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i3) {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            aVar.C1(i3);
        }
    }

    public void setChipDrawable(com.google.android.material.chip.a aVar) {
        com.google.android.material.chip.a aVar2 = this.f5205i;
        if (aVar2 != aVar) {
            w(aVar2);
            this.f5205i = aVar;
            aVar.u2(false);
            j(this.f5205i);
            l(this.f5216t);
        }
    }

    public void setChipEndPadding(float f3) {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            aVar.D1(f3);
        }
    }

    public void setChipEndPaddingResource(int i3) {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            aVar.E1(i3);
        }
    }

    public void setChipIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            aVar.F1(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z3) {
        setChipIconVisible(z3);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i3) {
        setChipIconVisible(i3);
    }

    public void setChipIconResource(int i3) {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            aVar.G1(i3);
        }
    }

    public void setChipIconSize(float f3) {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            aVar.H1(f3);
        }
    }

    public void setChipIconSizeResource(int i3) {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            aVar.I1(i3);
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            aVar.J1(colorStateList);
        }
    }

    public void setChipIconTintResource(int i3) {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            aVar.K1(i3);
        }
    }

    public void setChipIconVisible(int i3) {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            aVar.L1(i3);
        }
    }

    public void setChipMinHeight(float f3) {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            aVar.N1(f3);
        }
    }

    public void setChipMinHeightResource(int i3) {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            aVar.O1(i3);
        }
    }

    public void setChipStartPadding(float f3) {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            aVar.P1(f3);
        }
    }

    public void setChipStartPaddingResource(int i3) {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            aVar.Q1(i3);
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            aVar.R1(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i3) {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            aVar.S1(i3);
        }
    }

    public void setChipStrokeWidth(float f3) {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            aVar.T1(f3);
        }
    }

    public void setChipStrokeWidthResource(int i3) {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            aVar.U1(i3);
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i3) {
        setText(getResources().getString(i3));
    }

    public void setCloseIcon(Drawable drawable) {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            aVar.W1(drawable);
        }
        x();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            aVar.X1(charSequence);
        }
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z3) {
        setCloseIconVisible(z3);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i3) {
        setCloseIconVisible(i3);
    }

    public void setCloseIconEndPadding(float f3) {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            aVar.Y1(f3);
        }
    }

    public void setCloseIconEndPaddingResource(int i3) {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            aVar.Z1(i3);
        }
    }

    public void setCloseIconResource(int i3) {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            aVar.a2(i3);
        }
        x();
    }

    public void setCloseIconSize(float f3) {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            aVar.b2(f3);
        }
    }

    public void setCloseIconSizeResource(int i3) {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            aVar.c2(i3);
        }
    }

    public void setCloseIconStartPadding(float f3) {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            aVar.d2(f3);
        }
    }

    public void setCloseIconStartPaddingResource(int i3) {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            aVar.e2(i3);
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            aVar.g2(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i3) {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            aVar.h2(i3);
        }
    }

    public void setCloseIconVisible(int i3) {
        setCloseIconVisible(getResources().getBoolean(i3));
    }

    @Override // l.AbstractC0565f, android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // l.AbstractC0565f, android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i3, int i4, int i5, int i6) {
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i5 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i3, i4, i5, i6);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i3, int i4, int i5, int i6) {
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i5 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i3, i4, i5, i6);
    }

    @Override // android.view.View
    public void setElevation(float f3) {
        super.setElevation(f3);
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            aVar.S(f3);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f5205i == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            aVar.k2(truncateAt);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z3) {
        this.f5214r = z3;
        l(this.f5216t);
    }

    @Override // android.widget.TextView
    public void setGravity(int i3) {
        if (i3 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i3);
        }
    }

    public void setHideMotionSpec(f1.c cVar) {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            aVar.l2(cVar);
        }
    }

    public void setHideMotionSpecResource(int i3) {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            aVar.m2(i3);
        }
    }

    public void setIconEndPadding(float f3) {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            aVar.n2(f3);
        }
    }

    public void setIconEndPaddingResource(int i3) {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            aVar.o2(i3);
        }
    }

    public void setIconStartPadding(float f3) {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            aVar.p2(f3);
        }
    }

    public void setIconStartPaddingResource(int i3) {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            aVar.q2(i3);
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i3) {
        if (this.f5205i == null) {
            return;
        }
        super.setLayoutDirection(i3);
    }

    @Override // android.widget.TextView
    public void setLines(int i3) {
        if (i3 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i3);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i3) {
        if (i3 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i3);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i3) {
        super.setMaxWidth(i3);
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            aVar.r2(i3);
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i3) {
        if (i3 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i3);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f5209m = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f5208l = onClickListener;
        x();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            aVar.s2(colorStateList);
        }
        if (this.f5205i.g1()) {
            return;
        }
        z();
    }

    public void setRippleColorResource(int i3) {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            aVar.t2(i3);
            if (this.f5205i.g1()) {
                return;
            }
            z();
        }
    }

    @Override // x1.n
    public void setShapeAppearanceModel(k kVar) {
        this.f5205i.setShapeAppearanceModel(kVar);
    }

    public void setShowMotionSpec(f1.c cVar) {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            aVar.v2(cVar);
        }
    }

    public void setShowMotionSpecResource(int i3) {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            aVar.w2(i3);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z3) {
        if (!z3) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z3);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(aVar.G2() ? null : charSequence, bufferType);
        com.google.android.material.chip.a aVar2 = this.f5205i;
        if (aVar2 != null) {
            aVar2.x2(charSequence);
        }
    }

    public void setTextAppearance(C0741d c0741d) {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            aVar.y2(c0741d);
        }
        B();
    }

    public void setTextAppearanceResource(int i3) {
        setTextAppearance(getContext(), i3);
    }

    public void setTextEndPadding(float f3) {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            aVar.A2(f3);
        }
    }

    public void setTextEndPaddingResource(int i3) {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            aVar.B2(i3);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i3, float f3) {
        super.setTextSize(i3, f3);
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            aVar.C2(TypedValue.applyDimension(i3, f3, getResources().getDisplayMetrics()));
        }
        B();
    }

    public void setTextStartPadding(float f3) {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            aVar.D2(f3);
        }
    }

    public void setTextStartPaddingResource(int i3) {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            aVar.E2(i3);
        }
    }

    public boolean t() {
        boolean z3 = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f5208l;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z3 = true;
        }
        if (this.f5219w) {
            this.f5218v.U(1, 1);
        }
        return z3;
    }

    public final void u() {
        if (this.f5206j != null) {
            this.f5206j = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            y();
        }
    }

    public boolean v() {
        return this.f5214r;
    }

    public final void w(com.google.android.material.chip.a aVar) {
        if (aVar != null) {
            aVar.j2(null);
        }
    }

    public final void x() {
        if (n() && s() && this.f5208l != null) {
            O.j0(this, this.f5218v);
            this.f5219w = true;
        } else {
            O.j0(this, null);
            this.f5219w = false;
        }
    }

    public final void y() {
        if (AbstractC0758b.f9878a) {
            z();
            return;
        }
        this.f5205i.F2(true);
        O.n0(this, getBackgroundDrawable());
        A();
        m();
    }

    public final void z() {
        this.f5207k = new RippleDrawable(AbstractC0758b.a(this.f5205i.Z0()), getBackgroundDrawable(), null);
        this.f5205i.F2(false);
        O.n0(this, this.f5207k);
        A();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Chip(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = com.google.android.material.chip.Chip.f5201A
            android.content.Context r7 = A1.a.c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            r6.f5220x = r7
            android.graphics.RectF r7 = new android.graphics.RectF
            r7.<init>()
            r6.f5221y = r7
            com.google.android.material.chip.Chip$a r7 = new com.google.android.material.chip.Chip$a
            r7.<init>()
            r6.f5222z = r7
            android.content.Context r0 = r6.getContext()
            r6.C(r8)
            com.google.android.material.chip.a r7 = com.google.android.material.chip.a.p0(r0, r8, r9, r4)
            r6.o(r0, r8, r9)
            r6.setChipDrawable(r7)
            float r1 = K.O.r(r6)
            r7.S(r1)
            int[] r2 = e1.j.f7065b0
            r1 = 0
            int[] r5 = new int[r1]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = r1.k.h(r0, r1, r2, r3, r4, r5)
            int r9 = e1.j.f7010M0
            boolean r9 = r8.hasValue(r9)
            r8.recycle()
            com.google.android.material.chip.Chip$c r8 = new com.google.android.material.chip.Chip$c
            r8.<init>(r6)
            r6.f5218v = r8
            r6.x()
            if (r9 != 0) goto L59
            r6.p()
        L59:
            boolean r8 = r6.f5210n
            r6.setChecked(r8)
            java.lang.CharSequence r8 = r7.b1()
            r6.setText(r8)
            android.text.TextUtils$TruncateAt r7 = r7.V0()
            r6.setEllipsize(r7)
            r6.B()
            com.google.android.material.chip.a r7 = r6.f5205i
            boolean r7 = r7.G2()
            if (r7 != 0) goto L7e
            r7 = 1
            r6.setLines(r7)
            r6.setHorizontallyScrolling(r7)
        L7e:
            r7 = 8388627(0x800013, float:1.175497E-38)
            r6.setGravity(r7)
            r6.A()
            boolean r7 = r6.v()
            if (r7 == 0) goto L92
            int r7 = r6.f5216t
            r6.setMinHeight(r7)
        L92:
            int r7 = K.O.w(r6)
            r6.f5215s = r7
            l1.a r7 = new l1.a
            r7.<init>()
            super.setOnCheckedChangeListener(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setCloseIconVisible(boolean z3) {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            aVar.i2(z3);
        }
        x();
    }

    public void setCheckedIconVisible(boolean z3) {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            aVar.y1(z3);
        }
    }

    public void setChipIconVisible(boolean z3) {
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            aVar.M1(z3);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i3) {
        super.setTextAppearance(context, i3);
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            aVar.z2(i3);
        }
        B();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i3) {
        super.setTextAppearance(i3);
        com.google.android.material.chip.a aVar = this.f5205i;
        if (aVar != null) {
            aVar.z2(i3);
        }
        B();
    }

    public void setInternalOnCheckedChangeListener(f fVar) {
    }
}
