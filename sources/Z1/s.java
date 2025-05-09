package z1;

import L.c;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f10348a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.material.textfield.a f10349b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f10350c;

    /* renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f10351d;

    public s(com.google.android.material.textfield.a aVar) {
        this.f10348a = aVar.f5608e;
        this.f10349b = aVar;
        this.f10350c = aVar.getContext();
        this.f10351d = aVar.r();
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public c.a h() {
        return null;
    }

    public boolean i(int i3) {
        return true;
    }

    public boolean j() {
        return false;
    }

    public boolean k() {
        return false;
    }

    public boolean l() {
        return false;
    }

    public boolean m() {
        return false;
    }

    public final void r() {
        this.f10349b.L(false);
    }

    public boolean t() {
        return false;
    }

    public void s() {
    }

    public void u() {
    }

    public void a(Editable editable) {
    }

    public void n(EditText editText) {
    }

    public void q(boolean z3) {
    }

    public void o(View view, L.x xVar) {
    }

    public void p(View view, AccessibilityEvent accessibilityEvent) {
    }

    public void b(CharSequence charSequence, int i3, int i4, int i5) {
    }
}
