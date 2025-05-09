package c0;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class e implements KeyListener {

    /* renamed from: a, reason: collision with root package name */
    public final KeyListener f4727a;

    /* renamed from: b, reason: collision with root package name */
    public final a f4728b;

    public static class a {
        public boolean a(Editable editable, int i3, KeyEvent keyEvent) {
            return androidx.emoji2.text.c.f(editable, i3, keyEvent);
        }
    }

    public e(KeyListener keyListener) {
        this(keyListener, new a());
    }

    @Override // android.text.method.KeyListener
    public void clearMetaKeyState(View view, Editable editable, int i3) {
        this.f4727a.clearMetaKeyState(view, editable, i3);
    }

    @Override // android.text.method.KeyListener
    public int getInputType() {
        return this.f4727a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyDown(View view, Editable editable, int i3, KeyEvent keyEvent) {
        return this.f4728b.a(editable, i3, keyEvent) || this.f4727a.onKeyDown(view, editable, i3, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f4727a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public boolean onKeyUp(View view, Editable editable, int i3, KeyEvent keyEvent) {
        return this.f4727a.onKeyUp(view, editable, i3, keyEvent);
    }

    public e(KeyListener keyListener, a aVar) {
        this.f4727a = keyListener;
        this.f4728b = aVar;
    }
}
