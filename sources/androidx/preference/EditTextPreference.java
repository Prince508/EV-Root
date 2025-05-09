package androidx.preference;

import B.i;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.preference.Preference;
import k0.c;
import k0.f;
import k0.g;

/* loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {

    /* renamed from: N, reason: collision with root package name */
    public String f4054N;

    public static final class a implements Preference.b {

        /* renamed from: a, reason: collision with root package name */
        public static a f4055a;

        public static a b() {
            if (f4055a == null) {
                f4055a = new a();
            }
            return f4055a;
        }

        @Override // androidx.preference.Preference.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public CharSequence a(EditTextPreference editTextPreference) {
            return TextUtils.isEmpty(editTextPreference.J()) ? editTextPreference.g().getString(f.f8018a) : editTextPreference.J();
        }
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i3, int i4) {
        super(context, attributeSet, i3, i4);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f8118v, i3, i4);
        int i5 = g.f8120w;
        if (i.b(obtainStyledAttributes, i5, i5, false)) {
            G(a.b());
        }
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public boolean H() {
        return TextUtils.isEmpty(this.f4054N) || super.H();
    }

    public String J() {
        return this.f4054N;
    }

    @Override // androidx.preference.Preference
    public Object z(TypedArray typedArray, int i3) {
        return typedArray.getString(i3);
    }

    public EditTextPreference(Context context, AttributeSet attributeSet, int i3) {
        this(context, attributeSet, i3, 0);
    }

    public EditTextPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a(context, c.f8009d, R.attr.editTextPreferenceStyle));
    }
}
