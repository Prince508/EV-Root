package l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

/* renamed from: l.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0564e extends Button {

    /* renamed from: e, reason: collision with root package name */
    public final C0563d f8345e;

    /* renamed from: f, reason: collision with root package name */
    public final C0578s f8346f;

    /* renamed from: g, reason: collision with root package name */
    public C0570k f8347g;

    public AbstractC0564e(Context context, AttributeSet attributeSet, int i3) {
        super(C0549O.b(context), attributeSet, i3);
        AbstractC0548N.a(this, getContext());
        C0563d c0563d = new C0563d(this);
        this.f8345e = c0563d;
        c0563d.e(attributeSet, i3);
        C0578s c0578s = new C0578s(this);
        this.f8346f = c0578s;
        c0578s.m(attributeSet, i3);
        c0578s.b();
        getEmojiTextViewHelper().c(attributeSet, i3);
    }

    private C0570k getEmojiTextViewHelper() {
        if (this.f8347g == null) {
            this.f8347g = new C0570k(this);
        }
        return this.f8347g;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0563d c0563d = this.f8345e;
        if (c0563d != null) {
            c0563d.b();
        }
        C0578s c0578s = this.f8346f;
        if (c0578s != null) {
            c0578s.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (c0.f8338b) {
            return super.getAutoSizeMaxTextSize();
        }
        C0578s c0578s = this.f8346f;
        if (c0578s != null) {
            return c0578s.e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (c0.f8338b) {
            return super.getAutoSizeMinTextSize();
        }
        C0578s c0578s = this.f8346f;
        if (c0578s != null) {
            return c0578s.f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (c0.f8338b) {
            return super.getAutoSizeStepGranularity();
        }
        C0578s c0578s = this.f8346f;
        if (c0578s != null) {
            return c0578s.g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (c0.f8338b) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0578s c0578s = this.f8346f;
        return c0578s != null ? c0578s.h() : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (c0.f8338b) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0578s c0578s = this.f8346f;
        if (c0578s != null) {
            return c0578s.i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return Q.g.p(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0563d c0563d = this.f8345e;
        if (c0563d != null) {
            return c0563d.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0563d c0563d = this.f8345e;
        if (c0563d != null) {
            return c0563d.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f8346f.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f8346f.k();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        super.onLayout(z3, i3, i4, i5, i6);
        C0578s c0578s = this.f8346f;
        if (c0578s != null) {
            c0578s.o(z3, i3, i4, i5, i6);
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
        super.onTextChanged(charSequence, i3, i4, i5);
        C0578s c0578s = this.f8346f;
        if (c0578s == null || c0.f8338b || !c0578s.l()) {
            return;
        }
        this.f8346f.c();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z3) {
        super.setAllCaps(z3);
        getEmojiTextViewHelper().d(z3);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i3, int i4, int i5, int i6) {
        if (c0.f8338b) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i3, i4, i5, i6);
            return;
        }
        C0578s c0578s = this.f8346f;
        if (c0578s != null) {
            c0578s.t(i3, i4, i5, i6);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i3) {
        if (c0.f8338b) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i3);
            return;
        }
        C0578s c0578s = this.f8346f;
        if (c0578s != null) {
            c0578s.u(iArr, i3);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i3) {
        if (c0.f8338b) {
            super.setAutoSizeTextTypeWithDefaults(i3);
            return;
        }
        C0578s c0578s = this.f8346f;
        if (c0578s != null) {
            c0578s.v(i3);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0563d c0563d = this.f8345e;
        if (c0563d != null) {
            c0563d.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        C0563d c0563d = this.f8345e;
        if (c0563d != null) {
            c0563d.g(i3);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(Q.g.q(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z3) {
        getEmojiTextViewHelper().e(z3);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z3) {
        C0578s c0578s = this.f8346f;
        if (c0578s != null) {
            c0578s.s(z3);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0563d c0563d = this.f8345e;
        if (c0563d != null) {
            c0563d.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0563d c0563d = this.f8345e;
        if (c0563d != null) {
            c0563d.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f8346f.w(colorStateList);
        this.f8346f.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f8346f.x(mode);
        this.f8346f.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i3) {
        super.setTextAppearance(context, i3);
        C0578s c0578s = this.f8346f;
        if (c0578s != null) {
            c0578s.q(context, i3);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i3, float f3) {
        if (c0.f8338b) {
            super.setTextSize(i3, f3);
            return;
        }
        C0578s c0578s = this.f8346f;
        if (c0578s != null) {
            c0578s.A(i3, f3);
        }
    }
}
