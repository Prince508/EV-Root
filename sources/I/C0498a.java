package i;

import android.content.Context;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

/* renamed from: i.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0498a implements TransformationMethod {

    /* renamed from: a, reason: collision with root package name */
    public Locale f7458a;

    public C0498a(Context context) {
        this.f7458a = context.getResources().getConfiguration().locale;
    }

    @Override // android.text.method.TransformationMethod
    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.f7458a);
        }
        return null;
    }

    @Override // android.text.method.TransformationMethod
    public void onFocusChanged(View view, CharSequence charSequence, boolean z3, int i3, Rect rect) {
    }
}
