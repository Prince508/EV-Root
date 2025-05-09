package l;

import I.l;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import f.AbstractC0467a;
import j.AbstractC0515e;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* renamed from: l.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0579t extends TextView {

    /* renamed from: e, reason: collision with root package name */
    public final C0563d f8414e;

    /* renamed from: f, reason: collision with root package name */
    public final C0578s f8415f;

    /* renamed from: g, reason: collision with root package name */
    public final C0577r f8416g;

    /* renamed from: h, reason: collision with root package name */
    public C0570k f8417h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f8418i;

    /* renamed from: j, reason: collision with root package name */
    public a f8419j;

    /* renamed from: k, reason: collision with root package name */
    public Future f8420k;

    /* renamed from: l.t$a */
    public interface a {
        void a(int[] iArr, int i3);

        void b(TextClassifier textClassifier);

        int c();

        int[] d();

        void e(int i3);

        void f(int i3);

        TextClassifier g();

        int h();

        int i();

        void j(int i3);

        void k(int i3, int i4, int i5, int i6);

        int l();
    }

    /* renamed from: l.t$c */
    public class c extends b {
        public c() {
            super();
        }

        @Override // l.C0579t.b, l.C0579t.a
        public void e(int i3) {
            C0579t.super.setLastBaselineToBottomHeight(i3);
        }

        @Override // l.C0579t.b, l.C0579t.a
        public void f(int i3) {
            C0579t.super.setFirstBaselineToTopHeight(i3);
        }
    }

    public C0579t(Context context) {
        this(context, null);
    }

    private C0570k getEmojiTextViewHelper() {
        if (this.f8417h == null) {
            this.f8417h = new C0570k(this);
        }
        return this.f8417h;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0563d c0563d = this.f8414e;
        if (c0563d != null) {
            c0563d.b();
        }
        C0578s c0578s = this.f8415f;
        if (c0578s != null) {
            c0578s.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (c0.f8338b) {
            return getSuperCaller().i();
        }
        C0578s c0578s = this.f8415f;
        if (c0578s != null) {
            return c0578s.e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (c0.f8338b) {
            return getSuperCaller().c();
        }
        C0578s c0578s = this.f8415f;
        if (c0578s != null) {
            return c0578s.f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (c0.f8338b) {
            return getSuperCaller().h();
        }
        C0578s c0578s = this.f8415f;
        if (c0578s != null) {
            return c0578s.g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (c0.f8338b) {
            return getSuperCaller().d();
        }
        C0578s c0578s = this.f8415f;
        return c0578s != null ? c0578s.h() : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (c0.f8338b) {
            return getSuperCaller().l() == 1 ? 1 : 0;
        }
        C0578s c0578s = this.f8415f;
        if (c0578s != null) {
            return c0578s.i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return Q.g.p(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return Q.g.b(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return Q.g.c(this);
    }

    public a getSuperCaller() {
        if (this.f8419j == null) {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 28) {
                this.f8419j = new c();
            } else if (i3 >= 26) {
                this.f8419j = new b();
            }
        }
        return this.f8419j;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0563d c0563d = this.f8414e;
        if (c0563d != null) {
            return c0563d.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0563d c0563d = this.f8414e;
        if (c0563d != null) {
            return c0563d.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f8415f.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f8415f.k();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        q();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0577r c0577r;
        return (Build.VERSION.SDK_INT >= 28 || (c0577r = this.f8416g) == null) ? getSuperCaller().g() : c0577r.a();
    }

    public l.a getTextMetricsParamsCompat() {
        return Q.g.f(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f8415f.r(this, onCreateInputConnection, editorInfo);
        return AbstractC0571l.a(onCreateInputConnection, editorInfo, this);
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        super.onLayout(z3, i3, i4, i5, i6);
        C0578s c0578s = this.f8415f;
        if (c0578s != null) {
            c0578s.o(z3, i3, i4, i5, i6);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i3, int i4) {
        q();
        super.onMeasure(i3, i4);
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
        super.onTextChanged(charSequence, i3, i4, i5);
        C0578s c0578s = this.f8415f;
        if (c0578s == null || c0.f8338b || !c0578s.l()) {
            return;
        }
        this.f8415f.c();
    }

    public final void q() {
        Future future = this.f8420k;
        if (future != null) {
            try {
                this.f8420k = null;
                AbstractC0515e.a(future.get());
                Q.g.m(this, null);
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z3) {
        super.setAllCaps(z3);
        getEmojiTextViewHelper().d(z3);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i3, int i4, int i5, int i6) {
        if (c0.f8338b) {
            getSuperCaller().k(i3, i4, i5, i6);
            return;
        }
        C0578s c0578s = this.f8415f;
        if (c0578s != null) {
            c0578s.t(i3, i4, i5, i6);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i3) {
        if (c0.f8338b) {
            getSuperCaller().a(iArr, i3);
            return;
        }
        C0578s c0578s = this.f8415f;
        if (c0578s != null) {
            c0578s.u(iArr, i3);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i3) {
        if (c0.f8338b) {
            getSuperCaller().j(i3);
            return;
        }
        C0578s c0578s = this.f8415f;
        if (c0578s != null) {
            c0578s.v(i3);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0563d c0563d = this.f8414e;
        if (c0563d != null) {
            c0563d.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i3) {
        super.setBackgroundResource(i3);
        C0563d c0563d = this.f8414e;
        if (c0563d != null) {
            c0563d.g(i3);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0578s c0578s = this.f8415f;
        if (c0578s != null) {
            c0578s.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0578s c0578s = this.f8415f;
        if (c0578s != null) {
            c0578s.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0578s c0578s = this.f8415f;
        if (c0578s != null) {
            c0578s.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0578s c0578s = this.f8415f;
        if (c0578s != null) {
            c0578s.p();
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

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i3) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().f(i3);
        } else {
            Q.g.j(this, i3);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i3) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().e(i3);
        } else {
            Q.g.k(this, i3);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i3) {
        Q.g.l(this, i3);
    }

    public void setPrecomputedText(I.l lVar) {
        Q.g.m(this, lVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0563d c0563d = this.f8414e;
        if (c0563d != null) {
            c0563d.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0563d c0563d = this.f8414e;
        if (c0563d != null) {
            c0563d.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f8415f.w(colorStateList);
        this.f8415f.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f8415f.x(mode);
        this.f8415f.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i3) {
        super.setTextAppearance(context, i3);
        C0578s c0578s = this.f8415f;
        if (c0578s != null) {
            c0578s.q(context, i3);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0577r c0577r;
        if (Build.VERSION.SDK_INT >= 28 || (c0577r = this.f8416g) == null) {
            getSuperCaller().b(textClassifier);
        } else {
            c0577r.b(textClassifier);
        }
    }

    public void setTextFuture(Future<I.l> future) {
        this.f8420k = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(l.a aVar) {
        Q.g.o(this, aVar);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i3, float f3) {
        if (c0.f8338b) {
            super.setTextSize(i3, f3);
            return;
        }
        C0578s c0578s = this.f8415f;
        if (c0578s != null) {
            c0578s.A(i3, f3);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i3) {
        if (this.f8418i) {
            return;
        }
        Typeface a3 = (typeface == null || i3 <= 0) ? null : C.e.a(getContext(), typeface, i3);
        this.f8418i = true;
        if (a3 != null) {
            typeface = a3;
        }
        try {
            super.setTypeface(typeface, i3);
        } finally {
            this.f8418i = false;
        }
    }

    public C0579t(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public C0579t(Context context, AttributeSet attributeSet, int i3) {
        super(C0549O.b(context), attributeSet, i3);
        this.f8418i = false;
        this.f8419j = null;
        AbstractC0548N.a(this, getContext());
        C0563d c0563d = new C0563d(this);
        this.f8414e = c0563d;
        c0563d.e(attributeSet, i3);
        C0578s c0578s = new C0578s(this);
        this.f8415f = c0578s;
        c0578s.m(attributeSet, i3);
        c0578s.b();
        this.f8416g = new C0577r(this);
        getEmojiTextViewHelper().c(attributeSet, i3);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i3, int i4, int i5, int i6) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i3 != 0 ? AbstractC0467a.b(context, i3) : null, i4 != 0 ? AbstractC0467a.b(context, i4) : null, i5 != 0 ? AbstractC0467a.b(context, i5) : null, i6 != 0 ? AbstractC0467a.b(context, i6) : null);
        C0578s c0578s = this.f8415f;
        if (c0578s != null) {
            c0578s.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i3, int i4, int i5, int i6) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i3 != 0 ? AbstractC0467a.b(context, i3) : null, i4 != 0 ? AbstractC0467a.b(context, i4) : null, i5 != 0 ? AbstractC0467a.b(context, i5) : null, i6 != 0 ? AbstractC0467a.b(context, i6) : null);
        C0578s c0578s = this.f8415f;
        if (c0578s != null) {
            c0578s.p();
        }
    }

    /* renamed from: l.t$b */
    public class b implements a {
        public b() {
        }

        @Override // l.C0579t.a
        public void a(int[] iArr, int i3) {
            C0579t.super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i3);
        }

        @Override // l.C0579t.a
        public void b(TextClassifier textClassifier) {
            C0579t.super.setTextClassifier(textClassifier);
        }

        @Override // l.C0579t.a
        public int c() {
            return C0579t.super.getAutoSizeMinTextSize();
        }

        @Override // l.C0579t.a
        public int[] d() {
            return C0579t.super.getAutoSizeTextAvailableSizes();
        }

        @Override // l.C0579t.a
        public TextClassifier g() {
            return C0579t.super.getTextClassifier();
        }

        @Override // l.C0579t.a
        public int h() {
            return C0579t.super.getAutoSizeStepGranularity();
        }

        @Override // l.C0579t.a
        public int i() {
            return C0579t.super.getAutoSizeMaxTextSize();
        }

        @Override // l.C0579t.a
        public void j(int i3) {
            C0579t.super.setAutoSizeTextTypeWithDefaults(i3);
        }

        @Override // l.C0579t.a
        public void k(int i3, int i4, int i5, int i6) {
            C0579t.super.setAutoSizeTextTypeUniformWithConfiguration(i3, i4, i5, i6);
        }

        @Override // l.C0579t.a
        public int l() {
            return C0579t.super.getAutoSizeTextType();
        }

        @Override // l.C0579t.a
        public void e(int i3) {
        }

        @Override // l.C0579t.a
        public void f(int i3) {
        }
    }
}
