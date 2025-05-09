package androidx.preference;

import B.i;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import k0.c;
import k0.g;

/* loaded from: classes.dex */
public abstract class DialogPreference extends Preference {

    /* renamed from: H, reason: collision with root package name */
    public CharSequence f4043H;

    /* renamed from: I, reason: collision with root package name */
    public CharSequence f4044I;

    /* renamed from: J, reason: collision with root package name */
    public Drawable f4045J;

    /* renamed from: K, reason: collision with root package name */
    public CharSequence f4046K;

    /* renamed from: L, reason: collision with root package name */
    public CharSequence f4047L;

    /* renamed from: M, reason: collision with root package name */
    public int f4048M;

    public DialogPreference(Context context, AttributeSet attributeSet, int i3, int i4) {
        super(context, attributeSet, i3, i4);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f8092i, i3, i4);
        String f3 = i.f(obtainStyledAttributes, g.f8112s, g.f8094j);
        this.f4043H = f3;
        if (f3 == null) {
            this.f4043H = r();
        }
        this.f4044I = i.f(obtainStyledAttributes, g.f8110r, g.f8096k);
        this.f4045J = i.c(obtainStyledAttributes, g.f8106p, g.f8098l);
        this.f4046K = i.f(obtainStyledAttributes, g.f8116u, g.f8100m);
        this.f4047L = i.f(obtainStyledAttributes, g.f8114t, g.f8102n);
        this.f4048M = i.e(obtainStyledAttributes, g.f8108q, g.f8104o, 0);
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public void x() {
        o();
        throw null;
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i3) {
        this(context, attributeSet, i3, 0);
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a(context, c.f8007b, R.attr.dialogPreferenceStyle));
    }
}
