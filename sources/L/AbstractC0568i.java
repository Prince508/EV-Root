package l;

import K.C0190d;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;

/* renamed from: l.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0568i extends EditText implements K.E {

    /* renamed from: e, reason: collision with root package name */
    public final C0563d f8367e;

    /* renamed from: f, reason: collision with root package name */
    public final C0578s f8368f;

    /* renamed from: g, reason: collision with root package name */
    public final C0577r f8369g;

    /* renamed from: h, reason: collision with root package name */
    public final Q.h f8370h;

    /* renamed from: i, reason: collision with root package name */
    public final C0569j f8371i;

    /* renamed from: j, reason: collision with root package name */
    public a f8372j;

    /* renamed from: l.i$a */
    public class a {
        public a() {
        }

        public TextClassifier a() {
            return AbstractC0568i.super.getTextClassifier();
        }

        public void b(TextClassifier textClassifier) {
            AbstractC0568i.super.setTextClassifier(textClassifier);
        }
    }

    public AbstractC0568i(Context context, AttributeSet attributeSet, int i3) {
        super(C0549O.b(context), attributeSet, i3);
        AbstractC0548N.a(this, getContext());
        C0563d c0563d = new C0563d(this);
        this.f8367e = c0563d;
        c0563d.e(attributeSet, i3);
        C0578s c0578s = new C0578s(this);
        this.f8368f = c0578s;
        c0578s.m(attributeSet, i3);
        c0578s.b();
        this.f8369g = new C0577r(this);
        this.f8370h = new Q.h();
        C0569j c0569j = new C0569j(this);
        this.f8371i = c0569j;
        c0569j.c(attributeSet, i3);
        d(c0569j);
    }

    private a getSuperCaller() {
        if (this.f8372j == null) {
            this.f8372j = new a();
        }
        return this.f8372j;
    }

    @Override // K.E
    public C0190d a(C0190d c0190d) {
        return this.f8370h.a(this, c0190d);
    }

    public void d(C0569j c0569j) {
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
        C0563d c0563d = this.f8367e;
        if (c0563d != null) {
            c0563d.b();
        }
        C0578s c0578s = this.f8368f;
        if (c0578s != null) {
            c0578s.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return Q.g.p(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0563d c0563d = this.f8367e;
        if (c0563d != null) {
            return c0563d.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0563d c0563d = this.f8367e;
        if (c0563d != null) {
            return c0563d.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f8368f.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f8368f.k();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0577r c0577r;
        return (Build.VERSION.SDK_INT >= 28 || (c0577r = this.f8369g) == null) ? getSuperCaller().a() : c0577r.a();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] z3;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f8368f.r(this, onCreateInputConnection, editorInfo);
        InputConnection a3 = AbstractC0571l.a(onCreateInputConnection, editorInfo, this);
        if (a3 != null && Build.VERSION.SDK_INT <= 30 && (z3 = K.O.z(this)) != null) {
            P.c.d(editorInfo, z3);
            a3 = P.e.c(this, a3, editorInfo);
        }
        return this.f8371i.d(a3, editorInfo);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        if (AbstractC0576q.a(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i3) {
        if (AbstractC0576q.b(this, i3)) {
            return true;
        }
        return super.onTextContextMenuItem(i3);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0563d c0563d = this.f8367e;
        if (c0563d != null) {
            c0563d.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        C0563d c0563d = this.f8367e;
        if (c0563d != null) {
            c0563d.g(i3);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0578s c0578s = this.f8368f;
        if (c0578s != null) {
            c0578s.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0578s c0578s = this.f8368f;
        if (c0578s != null) {
            c0578s.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(Q.g.q(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z3) {
        this.f8371i.e(z3);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f8371i.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0563d c0563d = this.f8367e;
        if (c0563d != null) {
            c0563d.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0563d c0563d = this.f8367e;
        if (c0563d != null) {
            c0563d.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f8368f.w(colorStateList);
        this.f8368f.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f8368f.x(mode);
        this.f8368f.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i3) {
        super.setTextAppearance(context, i3);
        C0578s c0578s = this.f8368f;
        if (c0578s != null) {
            c0578s.q(context, i3);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0577r c0577r;
        if (Build.VERSION.SDK_INT >= 28 || (c0577r = this.f8369g) == null) {
            getSuperCaller().b(textClassifier);
        } else {
            c0577r.b(textClassifier);
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }
}
