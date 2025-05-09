package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public abstract class TwoStatePreference extends Preference {

    /* renamed from: H, reason: collision with root package name */
    public boolean f4127H;

    /* renamed from: I, reason: collision with root package name */
    public CharSequence f4128I;

    /* renamed from: J, reason: collision with root package name */
    public CharSequence f4129J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f4130K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f4131L;

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i3, int i4) {
        super(context, attributeSet, i3, i4);
    }

    @Override // androidx.preference.Preference
    public boolean H() {
        return (this.f4131L ? this.f4127H : !this.f4127H) || super.H();
    }

    public boolean J() {
        return this.f4127H;
    }

    public void K(boolean z3) {
        boolean z4 = this.f4127H != z3;
        if (z4 || !this.f4130K) {
            this.f4127H = z3;
            this.f4130K = true;
            D(z3);
            if (z4) {
                w(H());
                v();
            }
        }
    }

    public void L(boolean z3) {
        this.f4131L = z3;
    }

    public void M(CharSequence charSequence) {
        this.f4129J = charSequence;
        if (J()) {
            return;
        }
        v();
    }

    public void N(CharSequence charSequence) {
        this.f4128I = charSequence;
        if (J()) {
            v();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void O(android.view.View r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof android.widget.TextView
            if (r0 != 0) goto L5
            goto L4c
        L5:
            android.widget.TextView r5 = (android.widget.TextView) r5
            boolean r0 = r4.f4127H
            r1 = 0
            if (r0 == 0) goto L1b
            java.lang.CharSequence r0 = r4.f4128I
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1b
            java.lang.CharSequence r0 = r4.f4128I
            r5.setText(r0)
        L19:
            r0 = r1
            goto L2e
        L1b:
            boolean r0 = r4.f4127H
            if (r0 != 0) goto L2d
            java.lang.CharSequence r0 = r4.f4129J
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L2d
            java.lang.CharSequence r0 = r4.f4129J
            r5.setText(r0)
            goto L19
        L2d:
            r0 = 1
        L2e:
            if (r0 == 0) goto L3e
            java.lang.CharSequence r2 = r4.p()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L3e
            r5.setText(r2)
            r0 = r1
        L3e:
            if (r0 != 0) goto L41
            goto L43
        L41:
            r1 = 8
        L43:
            int r0 = r5.getVisibility()
            if (r1 == r0) goto L4c
            r5.setVisibility(r1)
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.TwoStatePreference.O(android.view.View):void");
    }

    @Override // androidx.preference.Preference
    public void x() {
        super.x();
        boolean z3 = !J();
        if (c(Boolean.valueOf(z3))) {
            K(z3);
        }
    }

    @Override // androidx.preference.Preference
    public Object z(TypedArray typedArray, int i3) {
        return Boolean.valueOf(typedArray.getBoolean(i3, false));
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i3) {
        this(context, attributeSet, i3, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
