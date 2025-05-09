package androidx.preference;

import B.i;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import k0.c;
import k0.d;
import k0.g;

/* loaded from: classes.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {

    /* renamed from: M, reason: collision with root package name */
    public final a f4123M;

    /* renamed from: N, reason: collision with root package name */
    public CharSequence f4124N;

    /* renamed from: O, reason: collision with root package name */
    public CharSequence f4125O;

    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
            if (SwitchPreferenceCompat.this.c(Boolean.valueOf(z3))) {
                SwitchPreferenceCompat.this.K(z3);
            } else {
                compoundButton.setChecked(!z3);
            }
        }
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i3, int i4) {
        super(context, attributeSet, i3, i4);
        this.f4123M = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f8060U0, i3, i4);
        N(i.f(obtainStyledAttributes, g.f8079c1, g.f8062V0));
        M(i.f(obtainStyledAttributes, g.f8076b1, g.f8064W0));
        Q(i.f(obtainStyledAttributes, g.f8085e1, g.f8068Y0));
        P(i.f(obtainStyledAttributes, g.f8082d1, g.f8070Z0));
        L(i.b(obtainStyledAttributes, g.f8073a1, g.f8066X0, false));
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void R(View view) {
        boolean z3 = view instanceof SwitchCompat;
        if (z3) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f4127H);
        }
        if (z3) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.f4124N);
            switchCompat.setTextOff(this.f4125O);
            switchCompat.setOnCheckedChangeListener(this.f4123M);
        }
    }

    private void S(View view) {
        if (((AccessibilityManager) g().getSystemService("accessibility")).isEnabled()) {
            R(view.findViewById(d.f8016a));
            O(view.findViewById(R.id.summary));
        }
    }

    @Override // androidx.preference.Preference
    public void C(View view) {
        super.C(view);
        S(view);
    }

    public void P(CharSequence charSequence) {
        this.f4125O = charSequence;
        v();
    }

    public void Q(CharSequence charSequence) {
        this.f4124N = charSequence;
        v();
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet, int i3) {
        this(context, attributeSet, i3, 0);
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.f8014i);
    }
}
