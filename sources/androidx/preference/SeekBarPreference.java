package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import k0.c;
import k0.g;

/* loaded from: classes.dex */
public class SeekBarPreference extends Preference {

    /* renamed from: H, reason: collision with root package name */
    public int f4105H;

    /* renamed from: I, reason: collision with root package name */
    public int f4106I;

    /* renamed from: J, reason: collision with root package name */
    public int f4107J;

    /* renamed from: K, reason: collision with root package name */
    public int f4108K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f4109L;

    /* renamed from: M, reason: collision with root package name */
    public SeekBar f4110M;

    /* renamed from: N, reason: collision with root package name */
    public TextView f4111N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f4112O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f4113P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f4114Q;

    /* renamed from: R, reason: collision with root package name */
    public final SeekBar.OnSeekBarChangeListener f4115R;

    /* renamed from: S, reason: collision with root package name */
    public final View.OnKeyListener f4116S;

    public class a implements SeekBar.OnSeekBarChangeListener {
        public a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i3, boolean z3) {
            if (z3) {
                SeekBarPreference seekBarPreference = SeekBarPreference.this;
                if (seekBarPreference.f4114Q || !seekBarPreference.f4109L) {
                    seekBarPreference.M(seekBar);
                    return;
                }
            }
            SeekBarPreference seekBarPreference2 = SeekBarPreference.this;
            seekBarPreference2.N(i3 + seekBarPreference2.f4106I);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.f4109L = true;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.f4109L = false;
            int progress = seekBar.getProgress();
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if (progress + seekBarPreference.f4106I != seekBarPreference.f4105H) {
                seekBarPreference.M(seekBar);
            }
        }
    }

    public class b implements View.OnKeyListener {
        public b() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i3, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0) {
                return false;
            }
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if ((!seekBarPreference.f4112O && (i3 == 21 || i3 == 22)) || i3 == 23 || i3 == 66) {
                return false;
            }
            SeekBar seekBar = seekBarPreference.f4110M;
            if (seekBar != null) {
                return seekBar.onKeyDown(i3, keyEvent);
            }
            Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
            return false;
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i3, int i4) {
        super(context, attributeSet, i3, i4);
        this.f4115R = new a();
        this.f4116S = new b();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f8024C0, i3, i4);
        this.f4106I = obtainStyledAttributes.getInt(g.f8030F0, 0);
        J(obtainStyledAttributes.getInt(g.f8026D0, 100));
        K(obtainStyledAttributes.getInt(g.f8032G0, 0));
        this.f4112O = obtainStyledAttributes.getBoolean(g.f8028E0, true);
        this.f4113P = obtainStyledAttributes.getBoolean(g.f8034H0, false);
        this.f4114Q = obtainStyledAttributes.getBoolean(g.f8036I0, false);
        obtainStyledAttributes.recycle();
    }

    public final void J(int i3) {
        int i4 = this.f4106I;
        if (i3 < i4) {
            i3 = i4;
        }
        if (i3 != this.f4107J) {
            this.f4107J = i3;
            v();
        }
    }

    public final void K(int i3) {
        if (i3 != this.f4108K) {
            this.f4108K = Math.min(this.f4107J - this.f4106I, Math.abs(i3));
            v();
        }
    }

    public final void L(int i3, boolean z3) {
        int i4 = this.f4106I;
        if (i3 < i4) {
            i3 = i4;
        }
        int i5 = this.f4107J;
        if (i3 > i5) {
            i3 = i5;
        }
        if (i3 != this.f4105H) {
            this.f4105H = i3;
            N(i3);
            E(i3);
            if (z3) {
                v();
            }
        }
    }

    public void M(SeekBar seekBar) {
        int progress = this.f4106I + seekBar.getProgress();
        if (progress != this.f4105H) {
            if (c(Integer.valueOf(progress))) {
                L(progress, false);
            } else {
                seekBar.setProgress(this.f4105H - this.f4106I);
                N(this.f4105H);
            }
        }
    }

    public void N(int i3) {
        TextView textView = this.f4111N;
        if (textView != null) {
            textView.setText(String.valueOf(i3));
        }
    }

    @Override // androidx.preference.Preference
    public Object z(TypedArray typedArray, int i3) {
        return Integer.valueOf(typedArray.getInt(i3, 0));
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet, int i3) {
        this(context, attributeSet, i3, 0);
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.f8013h);
    }
}
