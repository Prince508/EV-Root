package androidx.preference;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import k0.c;

/* loaded from: classes.dex */
public class DropDownPreference extends ListPreference {

    /* renamed from: S, reason: collision with root package name */
    public final Context f4049S;

    /* renamed from: T, reason: collision with root package name */
    public final ArrayAdapter f4050T;

    /* renamed from: U, reason: collision with root package name */
    public Spinner f4051U;

    /* renamed from: V, reason: collision with root package name */
    public final AdapterView.OnItemSelectedListener f4052V;

    public class a implements AdapterView.OnItemSelectedListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i3, long j3) {
            if (i3 >= 0) {
                String charSequence = DropDownPreference.this.M()[i3].toString();
                if (charSequence.equals(DropDownPreference.this.N()) || !DropDownPreference.this.c(charSequence)) {
                    return;
                }
                DropDownPreference.this.P(charSequence);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.f8008c);
    }

    public ArrayAdapter Q() {
        return new ArrayAdapter(this.f4049S, R.layout.simple_spinner_dropdown_item);
    }

    public final void R() {
        this.f4050T.clear();
        if (K() != null) {
            for (CharSequence charSequence : K()) {
                this.f4050T.add(charSequence.toString());
            }
        }
    }

    @Override // androidx.preference.Preference
    public void v() {
        super.v();
        ArrayAdapter arrayAdapter = this.f4050T;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    public void x() {
        this.f4051U.performClick();
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i3) {
        this(context, attributeSet, i3, 0);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i3, int i4) {
        super(context, attributeSet, i3, i4);
        this.f4052V = new a();
        this.f4049S = context;
        this.f4050T = Q();
        R();
    }
}
