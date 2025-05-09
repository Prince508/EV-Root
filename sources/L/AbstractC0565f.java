package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import f.AbstractC0467a;

/* renamed from: l.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0565f extends CheckBox {

    /* renamed from: e, reason: collision with root package name */
    public final C0566g f8348e;

    /* renamed from: f, reason: collision with root package name */
    public final C0563d f8349f;

    /* renamed from: g, reason: collision with root package name */
    public final C0578s f8350g;

    /* renamed from: h, reason: collision with root package name */
    public C0570k f8351h;

    public AbstractC0565f(Context context, AttributeSet attributeSet, int i3) {
        super(C0549O.b(context), attributeSet, i3);
        AbstractC0548N.a(this, getContext());
        C0566g c0566g = new C0566g(this);
        this.f8348e = c0566g;
        c0566g.e(attributeSet, i3);
        C0563d c0563d = new C0563d(this);
        this.f8349f = c0563d;
        c0563d.e(attributeSet, i3);
        C0578s c0578s = new C0578s(this);
        this.f8350g = c0578s;
        c0578s.m(attributeSet, i3);
        getEmojiTextViewHelper().c(attributeSet, i3);
    }

    private C0570k getEmojiTextViewHelper() {
        if (this.f8351h == null) {
            this.f8351h = new C0570k(this);
        }
        return this.f8351h;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0563d c0563d = this.f8349f;
        if (c0563d != null) {
            c0563d.b();
        }
        C0578s c0578s = this.f8350g;
        if (c0578s != null) {
            c0578s.b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        C0566g c0566g = this.f8348e;
        return c0566g != null ? c0566g.b(compoundPaddingLeft) : compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0563d c0563d = this.f8349f;
        if (c0563d != null) {
            return c0563d.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0563d c0563d = this.f8349f;
        if (c0563d != null) {
            return c0563d.d();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        C0566g c0566g = this.f8348e;
        if (c0566g != null) {
            return c0566g.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0566g c0566g = this.f8348e;
        if (c0566g != null) {
            return c0566g.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f8350g.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f8350g.k();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z3) {
        super.setAllCaps(z3);
        getEmojiTextViewHelper().d(z3);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0563d c0563d = this.f8349f;
        if (c0563d != null) {
            c0563d.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        C0563d c0563d = this.f8349f;
        if (c0563d != null) {
            c0563d.g(i3);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0566g c0566g = this.f8348e;
        if (c0566g != null) {
            c0566g.f();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0578s c0578s = this.f8350g;
        if (c0578s != null) {
            c0578s.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0578s c0578s = this.f8350g;
        if (c0578s != null) {
            c0578s.p();
        }
    }

    public void setEmojiCompatEnabled(boolean z3) {
        getEmojiTextViewHelper().e(z3);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0563d c0563d = this.f8349f;
        if (c0563d != null) {
            c0563d.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0563d c0563d = this.f8349f;
        if (c0563d != null) {
            c0563d.j(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0566g c0566g = this.f8348e;
        if (c0566g != null) {
            c0566g.g(colorStateList);
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0566g c0566g = this.f8348e;
        if (c0566g != null) {
            c0566g.h(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f8350g.w(colorStateList);
        this.f8350g.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f8350g.x(mode);
        this.f8350g.b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i3) {
        setButtonDrawable(AbstractC0467a.b(getContext(), i3));
    }
}
