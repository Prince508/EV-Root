package androidx.preference;

import B.i;
import android.R;
import android.content.Context;
import android.util.AttributeSet;
import k0.c;

/* loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet, int i3, int i4) {
        super(context, attributeSet, i3, i4);
    }

    @Override // androidx.preference.Preference
    public boolean H() {
        return !super.t();
    }

    @Override // androidx.preference.Preference
    public boolean t() {
        return false;
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet, int i3) {
        this(context, attributeSet, i3, 0);
    }

    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a(context, c.f8010e, R.attr.preferenceCategoryStyle));
    }
}
