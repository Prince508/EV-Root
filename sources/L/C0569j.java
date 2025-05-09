package l;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import c0.C0371a;

/* renamed from: l.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0569j {

    /* renamed from: a, reason: collision with root package name */
    public final EditText f8374a;

    /* renamed from: b, reason: collision with root package name */
    public final C0371a f8375b;

    public C0569j(EditText editText) {
        this.f8374a = editText;
        this.f8375b = new C0371a(editText, false);
    }

    public KeyListener a(KeyListener keyListener) {
        return b(keyListener) ? this.f8375b.a(keyListener) : keyListener;
    }

    public boolean b(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    public void c(AttributeSet attributeSet, int i3) {
        TypedArray obtainStyledAttributes = this.f8374a.getContext().obtainStyledAttributes(attributeSet, d.i.f6228S, i3, 0);
        try {
            int i4 = d.i.f6280g0;
            boolean z3 = obtainStyledAttributes.hasValue(i4) ? obtainStyledAttributes.getBoolean(i4, true) : true;
            obtainStyledAttributes.recycle();
            e(z3);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public InputConnection d(InputConnection inputConnection, EditorInfo editorInfo) {
        return this.f8375b.b(inputConnection, editorInfo);
    }

    public void e(boolean z3) {
        this.f8375b.c(z3);
    }
}
