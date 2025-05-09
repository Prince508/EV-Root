package androidx.preference;

import B.i;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.HashSet;
import java.util.Set;
import k0.c;
import k0.g;

/* loaded from: classes.dex */
public class MultiSelectListPreference extends DialogPreference {

    /* renamed from: N, reason: collision with root package name */
    public CharSequence[] f4062N;

    /* renamed from: O, reason: collision with root package name */
    public CharSequence[] f4063O;

    /* renamed from: P, reason: collision with root package name */
    public Set f4064P;

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i3, int i4) {
        super(context, attributeSet, i3, i4);
        this.f4064P = new HashSet();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f8025D, i3, i4);
        this.f4062N = i.h(obtainStyledAttributes, g.f8031G, g.f8027E);
        this.f4063O = i.h(obtainStyledAttributes, g.f8033H, g.f8029F);
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public Object z(TypedArray typedArray, int i3) {
        CharSequence[] textArray = typedArray.getTextArray(i3);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet, int i3) {
        this(context, attributeSet, i3, 0);
    }

    public MultiSelectListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a(context, c.f8007b, R.attr.dialogPreferenceStyle));
    }
}
