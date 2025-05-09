package com.google.android.material.timepicker;

import K.O;
import android.content.Context;
import android.content.res.Configuration;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import e1.g;
import r1.j;
import r1.n;

/* loaded from: classes.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: e, reason: collision with root package name */
    public final Chip f5637e;

    /* renamed from: f, reason: collision with root package name */
    public final TextInputLayout f5638f;

    /* renamed from: g, reason: collision with root package name */
    public final EditText f5639g;

    /* renamed from: h, reason: collision with root package name */
    public TextWatcher f5640h;

    /* renamed from: i, reason: collision with root package name */
    public TextView f5641i;

    public class b extends j {
        public b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView.this.f5637e.setText(ChipTextInputComboView.this.c("00"));
                return;
            }
            String c3 = ChipTextInputComboView.this.c(editable);
            Chip chip = ChipTextInputComboView.this.f5637e;
            if (TextUtils.isEmpty(c3)) {
                c3 = ChipTextInputComboView.this.c("00");
            }
            chip.setText(c3);
        }
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final String c(CharSequence charSequence) {
        return e.a(getResources(), charSequence);
    }

    public final void d() {
        this.f5639g.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f5637e.isChecked();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        d();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z3) {
        this.f5637e.setChecked(z3);
        this.f5639g.setVisibility(z3 ? 0 : 4);
        this.f5637e.setVisibility(z3 ? 8 : 0);
        if (isChecked()) {
            n.j(this.f5639g, false);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f5637e.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i3, Object obj) {
        this.f5637e.setTag(i3, obj);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        this.f5637e.toggle();
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(g.f6918g, (ViewGroup) this, false);
        this.f5637e = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(g.f6919h, (ViewGroup) this, false);
        this.f5638f = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f5639g = editText;
        editText.setVisibility(4);
        b bVar = new b();
        this.f5640h = bVar;
        editText.addTextChangedListener(bVar);
        d();
        addView(chip);
        addView(textInputLayout);
        this.f5641i = (TextView) findViewById(e1.e.f6896l);
        editText.setId(O.h());
        O.u0(this.f5641i, editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }
}
