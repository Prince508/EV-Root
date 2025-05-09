package c0;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* renamed from: c0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0371a {

    /* renamed from: a, reason: collision with root package name */
    public final b f4713a;

    /* renamed from: b, reason: collision with root package name */
    public int f4714b = Integer.MAX_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public int f4715c = 0;

    /* renamed from: c0.a$a, reason: collision with other inner class name */
    public static class C0103a extends b {

        /* renamed from: a, reason: collision with root package name */
        public final EditText f4716a;

        /* renamed from: b, reason: collision with root package name */
        public final g f4717b;

        public C0103a(EditText editText, boolean z3) {
            this.f4716a = editText;
            g gVar = new g(editText, z3);
            this.f4717b = gVar;
            editText.addTextChangedListener(gVar);
            editText.setEditableFactory(C0372b.getInstance());
        }

        @Override // c0.C0371a.b
        public KeyListener a(KeyListener keyListener) {
            if (keyListener instanceof e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return keyListener instanceof NumberKeyListener ? keyListener : new e(keyListener);
        }

        @Override // c0.C0371a.b
        public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection instanceof c ? inputConnection : new c(this.f4716a, inputConnection, editorInfo);
        }

        @Override // c0.C0371a.b
        public void c(boolean z3) {
            this.f4717b.c(z3);
        }
    }

    /* renamed from: c0.a$b */
    public static class b {
        public abstract KeyListener a(KeyListener keyListener);

        public abstract InputConnection b(InputConnection inputConnection, EditorInfo editorInfo);

        public abstract void c(boolean z3);
    }

    public C0371a(EditText editText, boolean z3) {
        J.g.h(editText, "editText cannot be null");
        this.f4713a = new C0103a(editText, z3);
    }

    public KeyListener a(KeyListener keyListener) {
        return this.f4713a.a(keyListener);
    }

    public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f4713a.b(inputConnection, editorInfo);
    }

    public void c(boolean z3) {
        this.f4713a.c(z3);
    }
}
