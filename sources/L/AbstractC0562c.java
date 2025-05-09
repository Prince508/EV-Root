package l;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import f.AbstractC0467a;

/* renamed from: l.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0562c extends AutoCompleteTextView {

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f8333h = {R.attr.popupBackground};

    /* renamed from: e, reason: collision with root package name */
    public final C0563d f8334e;

    /* renamed from: f, reason: collision with root package name */
    public final C0578s f8335f;

    /* renamed from: g, reason: collision with root package name */
    public final C0569j f8336g;

    public AbstractC0562c(Context context, AttributeSet attributeSet, int i3) {
        super(C0549O.b(context), attributeSet, i3);
        AbstractC0548N.a(this, getContext());
        C0552S t3 = C0552S.t(getContext(), attributeSet, f8333h, i3, 0);
        if (t3.q(0)) {
            setDropDownBackgroundDrawable(t3.g(0));
        }
        t3.u();
        C0563d c0563d = new C0563d(this);
        this.f8334e = c0563d;
        c0563d.e(attributeSet, i3);
        C0578s c0578s = new C0578s(this);
        this.f8335f = c0578s;
        c0578s.m(attributeSet, i3);
        c0578s.b();
        C0569j c0569j = new C0569j(this);
        this.f8336g = c0569j;
        c0569j.c(attributeSet, i3);
        a(c0569j);
    }

    public void a(C0569j c0569j) {
        KeyListener keyListener = getKeyListener();
        if (c0569j.b(keyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener a3 = c0569j.a(keyListener);
            if (a3 == keyListener) {
                return;
            }
            super.setKeyListener(a3);
            super.setRawInputType(inputType);
            super.setFocusable(isFocusable);
            super.setClickable(isClickable);
            super.setLongClickable(isLongClickable);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0563d c0563d = this.f8334e;
        if (c0563d != null) {
            c0563d.b();
        }
        C0578s c0578s = this.f8335f;
        if (c0578s != null) {
            c0578s.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return Q.g.p(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0563d c0563d = this.f8334e;
        if (c0563d != null) {
            return c0563d.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0563d c0563d = this.f8334e;
        if (c0563d != null) {
            return c0563d.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f8335f.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f8335f.k();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.f8336g.d(AbstractC0571l.a(super.onCreateInputConnection(editorInfo), editorInfo, this), editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0563d c0563d = this.f8334e;
        if (c0563d != null) {
            c0563d.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        C0563d c0563d = this.f8334e;
        if (c0563d != null) {
            c0563d.g(i3);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0578s c0578s = this.f8335f;
        if (c0578s != null) {
            c0578s.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0578s c0578s = this.f8335f;
        if (c0578s != null) {
            c0578s.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(Q.g.q(this, callback));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i3) {
        setDropDownBackgroundDrawable(AbstractC0467a.b(getContext(), i3));
    }

    public void setEmojiCompatEnabled(boolean z3) {
        this.f8336g.e(z3);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f8336g.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0563d c0563d = this.f8334e;
        if (c0563d != null) {
            c0563d.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0563d c0563d = this.f8334e;
        if (c0563d != null) {
            c0563d.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f8335f.w(colorStateList);
        this.f8335f.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f8335f.x(mode);
        this.f8335f.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i3) {
        super.setTextAppearance(context, i3);
        C0578s c0578s = this.f8335f;
        if (c0578s != null) {
            c0578s.q(context, i3);
        }
    }
}
