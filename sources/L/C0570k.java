package l;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.TextView;

/* renamed from: l.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0570k {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f8376a;

    /* renamed from: b, reason: collision with root package name */
    public final c0.f f8377b;

    public C0570k(TextView textView) {
        this.f8376a = textView;
        this.f8377b = new c0.f(textView, false);
    }

    public InputFilter[] a(InputFilter[] inputFilterArr) {
        return this.f8377b.a(inputFilterArr);
    }

    public boolean b() {
        return this.f8377b.b();
    }

    public void c(AttributeSet attributeSet, int i3) {
        TypedArray obtainStyledAttributes = this.f8376a.getContext().obtainStyledAttributes(attributeSet, d.i.f6228S, i3, 0);
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

    public void d(boolean z3) {
        this.f8377b.c(z3);
    }

    public void e(boolean z3) {
        this.f8377b.d(z3);
    }

    public TransformationMethod f(TransformationMethod transformationMethod) {
        return this.f8377b.e(transformationMethod);
    }
}
