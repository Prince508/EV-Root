package c0;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class c extends InputConnectionWrapper {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f4721a;

    /* renamed from: b, reason: collision with root package name */
    public final a f4722b;

    public static class a {
        public boolean a(InputConnection inputConnection, Editable editable, int i3, int i4, boolean z3) {
            return androidx.emoji2.text.c.e(inputConnection, editable, i3, i4, z3);
        }

        public void b(EditorInfo editorInfo) {
            if (androidx.emoji2.text.c.h()) {
                androidx.emoji2.text.c.b().u(editorInfo);
            }
        }
    }

    public c(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        this(textView, inputConnection, editorInfo, new a());
    }

    public final Editable a() {
        return this.f4721a.getEditableText();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i3, int i4) {
        return this.f4722b.a(this, a(), i3, i4, false) || super.deleteSurroundingText(i3, i4);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i3, int i4) {
        return this.f4722b.a(this, a(), i3, i4, true) || super.deleteSurroundingTextInCodePoints(i3, i4);
    }

    public c(TextView textView, InputConnection inputConnection, EditorInfo editorInfo, a aVar) {
        super(inputConnection, false);
        this.f4721a = textView;
        this.f4722b = aVar;
        aVar.b(editorInfo);
    }
}
