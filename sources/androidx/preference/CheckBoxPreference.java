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
import k0.c;
import k0.g;

/* loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {

    /* renamed from: M, reason: collision with root package name */
    public final a f4041M;

    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
            if (CheckBoxPreference.this.c(Boolean.valueOf(z3))) {
                CheckBoxPreference.this.K(z3);
            } else {
                compoundButton.setChecked(!z3);
            }
        }
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i3) {
        this(context, attributeSet, i3, 0);
    }

    @Override // androidx.preference.Preference
    public void C(View view) {
        super.C(view);
        Q(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void P(View view) {
        boolean z3 = view instanceof CompoundButton;
        if (z3) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.f4127H);
        }
        if (z3) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.f4041M);
        }
    }

    public final void Q(View view) {
        if (((AccessibilityManager) g().getSystemService("accessibility")).isEnabled()) {
            P(view.findViewById(R.id.checkbox));
            O(view.findViewById(R.id.summary));
        }
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet, int i3, int i4) {
        super(context, attributeSet, i3, i4);
        this.f4041M = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f8074b, i3, i4);
        N(i.f(obtainStyledAttributes, g.f8090h, g.f8077c));
        M(i.f(obtainStyledAttributes, g.f8088g, g.f8080d));
        L(i.b(obtainStyledAttributes, g.f8086f, g.f8083e, false));
        obtainStyledAttributes.recycle();
    }

    public CheckBoxPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a(context, c.f8006a, R.attr.checkBoxPreferenceStyle));
    }
}
