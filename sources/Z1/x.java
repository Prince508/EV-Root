package z1;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* loaded from: classes.dex */
public class x extends s {

    /* renamed from: e, reason: collision with root package name */
    public int f10387e;

    /* renamed from: f, reason: collision with root package name */
    public EditText f10388f;

    /* renamed from: g, reason: collision with root package name */
    public final View.OnClickListener f10389g;

    public x(com.google.android.material.textfield.a aVar, int i3) {
        super(aVar);
        this.f10387e = e1.d.f6865a;
        this.f10389g = new View.OnClickListener() { // from class: z1.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x.v(x.this, view);
            }
        };
        if (i3 != 0) {
            this.f10387e = i3;
        }
    }

    public static /* synthetic */ void v(x xVar, View view) {
        EditText editText = xVar.f10388f;
        if (editText == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (xVar.w()) {
            xVar.f10388f.setTransformationMethod(null);
        } else {
            xVar.f10388f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
        if (selectionEnd >= 0) {
            xVar.f10388f.setSelection(selectionEnd);
        }
        xVar.r();
    }

    public static boolean x(EditText editText) {
        if (editText != null) {
            return editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224;
        }
        return false;
    }

    @Override // z1.s
    public void b(CharSequence charSequence, int i3, int i4, int i5) {
        r();
    }

    @Override // z1.s
    public int c() {
        return e1.h.f6947s;
    }

    @Override // z1.s
    public int d() {
        return this.f10387e;
    }

    @Override // z1.s
    public View.OnClickListener f() {
        return this.f10389g;
    }

    @Override // z1.s
    public boolean l() {
        return true;
    }

    @Override // z1.s
    public boolean m() {
        return !w();
    }

    @Override // z1.s
    public void n(EditText editText) {
        this.f10388f = editText;
        r();
    }

    @Override // z1.s
    public void s() {
        if (x(this.f10388f)) {
            this.f10388f.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // z1.s
    public void u() {
        EditText editText = this.f10388f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public final boolean w() {
        EditText editText = this.f10388f;
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }
}
