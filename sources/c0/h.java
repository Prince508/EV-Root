package c0;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

/* loaded from: classes.dex */
public class h implements TransformationMethod {

    /* renamed from: a, reason: collision with root package name */
    public final TransformationMethod f4741a;

    public h(TransformationMethod transformationMethod) {
        this.f4741a = transformationMethod;
    }

    public TransformationMethod a() {
        return this.f4741a;
    }

    @Override // android.text.method.TransformationMethod
    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f4741a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        return (charSequence == null || androidx.emoji2.text.c.b().d() != 1) ? charSequence : androidx.emoji2.text.c.b().o(charSequence);
    }

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(View view, CharSequence charSequence, boolean z3, int i3, Rect rect) {
        TransformationMethod transformationMethod = this.f4741a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z3, i3, rect);
        }
    }
}
