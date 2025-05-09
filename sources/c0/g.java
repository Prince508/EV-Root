package c0;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.c;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class g implements TextWatcher {

    /* renamed from: e, reason: collision with root package name */
    public final EditText f4734e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f4735f;

    /* renamed from: g, reason: collision with root package name */
    public c.e f4736g;

    /* renamed from: h, reason: collision with root package name */
    public int f4737h = Integer.MAX_VALUE;

    /* renamed from: i, reason: collision with root package name */
    public int f4738i = 0;

    /* renamed from: j, reason: collision with root package name */
    public boolean f4739j = true;

    public static class a extends c.e {

        /* renamed from: a, reason: collision with root package name */
        public final Reference f4740a;

        public a(EditText editText) {
            this.f4740a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.c.e
        public void b() {
            super.b();
            g.b((EditText) this.f4740a.get(), 1);
        }
    }

    public g(EditText editText, boolean z3) {
        this.f4734e = editText;
        this.f4735f = z3;
    }

    public static void b(EditText editText, int i3) {
        if (i3 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            androidx.emoji2.text.c.b().o(editableText);
            d.b(editableText, selectionStart, selectionEnd);
        }
    }

    public final c.e a() {
        if (this.f4736g == null) {
            this.f4736g = new a(this.f4734e);
        }
        return this.f4736g;
    }

    public void c(boolean z3) {
        if (this.f4739j != z3) {
            if (this.f4736g != null) {
                androidx.emoji2.text.c.b().t(this.f4736g);
            }
            this.f4739j = z3;
            if (z3) {
                b(this.f4734e, androidx.emoji2.text.c.b().d());
            }
        }
    }

    public final boolean d() {
        if (this.f4739j) {
            return (this.f4735f || androidx.emoji2.text.c.h()) ? false : true;
        }
        return true;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
        if (this.f4734e.isInEditMode() || d() || i4 > i5 || !(charSequence instanceof Spannable)) {
            return;
        }
        int d3 = androidx.emoji2.text.c.b().d();
        if (d3 != 0) {
            if (d3 == 1) {
                androidx.emoji2.text.c.b().r((Spannable) charSequence, i3, i3 + i5, this.f4737h, this.f4738i);
                return;
            } else if (d3 != 3) {
                return;
            }
        }
        androidx.emoji2.text.c.b().s(a());
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
    }
}
