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
import android.widget.Switch;
import k0.c;
import k0.g;

/* loaded from: classes.dex */
public class SwitchPreference extends TwoStatePreference {

    /* renamed from: M, reason: collision with root package name */
    public final a f4119M;

    /* renamed from: N, reason: collision with root package name */
    public CharSequence f4120N;

    /* renamed from: O, reason: collision with root package name */
    public CharSequence f4121O;

    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
            if (SwitchPreference.this.c(Boolean.valueOf(z3))) {
                SwitchPreference.this.K(z3);
            } else {
                compoundButton.setChecked(!z3);
            }
        }
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i3, int i4) {
        super(context, attributeSet, i3, i4);
        this.f4119M = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f8038J0, i3, i4);
        N(i.f(obtainStyledAttributes, g.f8054R0, g.f8040K0));
        M(i.f(obtainStyledAttributes, g.f8052Q0, g.f8042L0));
        Q(i.f(obtainStyledAttributes, g.f8058T0, g.f8046N0));
        P(i.f(obtainStyledAttributes, g.f8056S0, g.f8048O0));
        L(i.b(obtainStyledAttributes, g.f8050P0, g.f8044M0, false));
        obtainStyledAttributes.recycle();
    }

    private void S(View view) {
        if (((AccessibilityManager) g().getSystemService("accessibility")).isEnabled()) {
            R(view.findViewById(R.id.switch_widget));
            O(view.findViewById(R.id.summary));
        }
    }

    @Override // androidx.preference.Preference
    public void C(View view) {
        super.C(view);
        S(view);
    }

    public void P(CharSequence charSequence) {
        this.f4121O = charSequence;
        v();
    }

    public void Q(CharSequence charSequence) {
        this.f4120N = charSequence;
        v();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void R(View view) {
        boolean z3 = view instanceof Switch;
        if (z3) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f4127H);
        }
        if (z3) {
            Switch r4 = (Switch) view;
            r4.setTextOn(this.f4120N);
            r4.setTextOff(this.f4121O);
            r4.setOnCheckedChangeListener(this.f4119M);
        }
    }

    public SwitchPreference(Context context, AttributeSet attributeSet, int i3) {
        this(context, attributeSet, i3, 0);
    }

    public SwitchPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a(context, c.f8015j, R.attr.switchPreferenceStyle));
    }
}
