package androidx.preference;

import B.i;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.preference.Preference;
import k0.c;
import k0.f;
import k0.g;

/* loaded from: classes.dex */
public class ListPreference extends DialogPreference {

    /* renamed from: N, reason: collision with root package name */
    public CharSequence[] f4056N;

    /* renamed from: O, reason: collision with root package name */
    public CharSequence[] f4057O;

    /* renamed from: P, reason: collision with root package name */
    public String f4058P;

    /* renamed from: Q, reason: collision with root package name */
    public String f4059Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f4060R;

    public static final class a implements Preference.b {

        /* renamed from: a, reason: collision with root package name */
        public static a f4061a;

        public static a b() {
            if (f4061a == null) {
                f4061a = new a();
            }
            return f4061a;
        }

        @Override // androidx.preference.Preference.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public CharSequence a(ListPreference listPreference) {
            return TextUtils.isEmpty(listPreference.L()) ? listPreference.g().getString(f.f8018a) : listPreference.L();
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i3, int i4) {
        super(context, attributeSet, i3, i4);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f8122x, i3, i4);
        this.f4056N = i.h(obtainStyledAttributes, g.f8019A, g.f8124y);
        this.f4057O = i.h(obtainStyledAttributes, g.f8021B, g.f8126z);
        int i5 = g.f8023C;
        if (i.b(obtainStyledAttributes, i5, i5, false)) {
            G(a.b());
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, g.f8035I, i3, i4);
        this.f4059Q = i.f(obtainStyledAttributes2, g.f8109q0, g.f8051Q);
        obtainStyledAttributes2.recycle();
    }

    public int J(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.f4057O) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (TextUtils.equals(this.f4057O[length].toString(), str)) {
                return length;
            }
        }
        return -1;
    }

    public CharSequence[] K() {
        return this.f4056N;
    }

    public CharSequence L() {
        CharSequence[] charSequenceArr;
        int O3 = O();
        if (O3 < 0 || (charSequenceArr = this.f4056N) == null) {
            return null;
        }
        return charSequenceArr[O3];
    }

    public CharSequence[] M() {
        return this.f4057O;
    }

    public String N() {
        return this.f4058P;
    }

    public final int O() {
        return J(this.f4058P);
    }

    public void P(String str) {
        boolean equals = TextUtils.equals(this.f4058P, str);
        if (equals && this.f4060R) {
            return;
        }
        this.f4058P = str;
        this.f4060R = true;
        F(str);
        if (equals) {
            return;
        }
        v();
    }

    @Override // androidx.preference.Preference
    public CharSequence p() {
        if (q() != null) {
            return q().a(this);
        }
        CharSequence L3 = L();
        CharSequence p3 = super.p();
        String str = this.f4059Q;
        if (str != null) {
            if (L3 == null) {
                L3 = "";
            }
            String format = String.format(str, L3);
            if (!TextUtils.equals(format, p3)) {
                Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
                return format;
            }
        }
        return p3;
    }

    @Override // androidx.preference.Preference
    public Object z(TypedArray typedArray, int i3) {
        return typedArray.getString(i3);
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i3) {
        this(context, attributeSet, i3, 0);
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a(context, c.f8007b, R.attr.dialogPreferenceStyle));
    }
}
