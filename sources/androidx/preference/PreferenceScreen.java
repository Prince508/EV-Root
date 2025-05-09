package androidx.preference;

import B.i;
import android.R;
import android.content.Context;
import android.util.AttributeSet;
import k0.c;

/* loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {

    /* renamed from: P, reason: collision with root package name */
    public boolean f4104P;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, i.a(context, c.f8011f, R.attr.preferenceScreenStyle));
        this.f4104P = true;
    }

    @Override // androidx.preference.Preference
    public void x() {
        if (j() == null && i() == null && K() != 0) {
            o();
            throw null;
        }
    }
}
