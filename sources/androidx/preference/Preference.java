package androidx.preference;

import B.i;
import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import java.util.List;
import k0.AbstractC0526a;
import k0.c;
import k0.e;
import k0.g;

/* loaded from: classes.dex */
public class Preference implements Comparable<Preference> {

    /* renamed from: A, reason: collision with root package name */
    public boolean f4065A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f4066B;

    /* renamed from: C, reason: collision with root package name */
    public int f4067C;

    /* renamed from: D, reason: collision with root package name */
    public int f4068D;

    /* renamed from: E, reason: collision with root package name */
    public List f4069E;

    /* renamed from: F, reason: collision with root package name */
    public b f4070F;

    /* renamed from: G, reason: collision with root package name */
    public final View.OnClickListener f4071G;

    /* renamed from: e, reason: collision with root package name */
    public final Context f4072e;

    /* renamed from: f, reason: collision with root package name */
    public int f4073f;

    /* renamed from: g, reason: collision with root package name */
    public int f4074g;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f4075h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f4076i;

    /* renamed from: j, reason: collision with root package name */
    public int f4077j;

    /* renamed from: k, reason: collision with root package name */
    public String f4078k;

    /* renamed from: l, reason: collision with root package name */
    public Intent f4079l;

    /* renamed from: m, reason: collision with root package name */
    public String f4080m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4081n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f4082o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f4083p;

    /* renamed from: q, reason: collision with root package name */
    public String f4084q;

    /* renamed from: r, reason: collision with root package name */
    public Object f4085r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f4086s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f4087t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f4088u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f4089v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f4090w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f4091x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f4092y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f4093z;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Preference.this.C(view);
        }
    }

    public interface b {
        CharSequence a(Preference preference);
    }

    public Preference(Context context, AttributeSet attributeSet, int i3, int i4) {
        this.f4073f = Integer.MAX_VALUE;
        this.f4074g = 0;
        this.f4081n = true;
        this.f4082o = true;
        this.f4083p = true;
        this.f4086s = true;
        this.f4087t = true;
        this.f4088u = true;
        this.f4089v = true;
        this.f4090w = true;
        this.f4092y = true;
        this.f4066B = true;
        int i5 = e.f8017a;
        this.f4067C = i5;
        this.f4071G = new a();
        this.f4072e = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f8035I, i3, i4);
        this.f4077j = i.e(obtainStyledAttributes, g.f8089g0, g.f8037J, 0);
        this.f4078k = i.f(obtainStyledAttributes, g.f8095j0, g.f8049P);
        this.f4075h = i.g(obtainStyledAttributes, g.f8111r0, g.f8045N);
        this.f4076i = i.g(obtainStyledAttributes, g.f8109q0, g.f8051Q);
        this.f4073f = i.d(obtainStyledAttributes, g.f8099l0, g.f8053R, Integer.MAX_VALUE);
        this.f4080m = i.f(obtainStyledAttributes, g.f8087f0, g.f8063W);
        this.f4067C = i.e(obtainStyledAttributes, g.f8097k0, g.f8043M, i5);
        this.f4068D = i.e(obtainStyledAttributes, g.f8113s0, g.f8055S, 0);
        this.f4081n = i.b(obtainStyledAttributes, g.f8084e0, g.f8041L, true);
        this.f4082o = i.b(obtainStyledAttributes, g.f8103n0, g.f8047O, true);
        this.f4083p = i.b(obtainStyledAttributes, g.f8101m0, g.f8039K, true);
        this.f4084q = i.f(obtainStyledAttributes, g.f8078c0, g.f8057T);
        int i6 = g.f8069Z;
        this.f4089v = i.b(obtainStyledAttributes, i6, i6, this.f4082o);
        int i7 = g.f8072a0;
        this.f4090w = i.b(obtainStyledAttributes, i7, i7, this.f4082o);
        int i8 = g.f8075b0;
        if (obtainStyledAttributes.hasValue(i8)) {
            this.f4085r = z(obtainStyledAttributes, i8);
        } else {
            int i9 = g.f8059U;
            if (obtainStyledAttributes.hasValue(i9)) {
                this.f4085r = z(obtainStyledAttributes, i9);
            }
        }
        this.f4066B = i.b(obtainStyledAttributes, g.f8105o0, g.f8061V, true);
        int i10 = g.f8107p0;
        boolean hasValue = obtainStyledAttributes.hasValue(i10);
        this.f4091x = hasValue;
        if (hasValue) {
            this.f4092y = i.b(obtainStyledAttributes, i10, g.f8065X, true);
        }
        this.f4093z = i.b(obtainStyledAttributes, g.f8091h0, g.f8067Y, false);
        int i11 = g.f8093i0;
        this.f4088u = i.b(obtainStyledAttributes, i11, i11, true);
        int i12 = g.f8081d0;
        this.f4065A = i.b(obtainStyledAttributes, i12, i12, false);
        obtainStyledAttributes.recycle();
    }

    public void A(Preference preference, boolean z3) {
        if (this.f4087t == z3) {
            this.f4087t = !z3;
            w(H());
            v();
        }
    }

    public void B() {
        if (t() && u()) {
            x();
            o();
            if (this.f4079l != null) {
                g().startActivity(this.f4079l);
            }
        }
    }

    public void C(View view) {
        B();
    }

    public boolean D(boolean z3) {
        if (!I()) {
            return false;
        }
        if (z3 == k(!z3)) {
            return true;
        }
        n();
        Object obj = null;
        obj.getClass();
        throw null;
    }

    public boolean E(int i3) {
        if (!I()) {
            return false;
        }
        if (i3 == l(~i3)) {
            return true;
        }
        n();
        Object obj = null;
        obj.getClass();
        throw null;
    }

    public boolean F(String str) {
        if (!I()) {
            return false;
        }
        Object obj = null;
        if (TextUtils.equals(str, m(null))) {
            return true;
        }
        n();
        obj.getClass();
        throw null;
    }

    public final void G(b bVar) {
        this.f4070F = bVar;
        v();
    }

    public boolean H() {
        return !t();
    }

    public boolean I() {
        return false;
    }

    public boolean c(Object obj) {
        return true;
    }

    @Override // java.lang.Comparable
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public int compareTo(Preference preference) {
        int i3 = this.f4073f;
        int i4 = preference.f4073f;
        if (i3 != i4) {
            return i3 - i4;
        }
        CharSequence charSequence = this.f4075h;
        CharSequence charSequence2 = preference.f4075h;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.f4075h.toString());
    }

    public Context g() {
        return this.f4072e;
    }

    public StringBuilder h() {
        StringBuilder sb = new StringBuilder();
        CharSequence r3 = r();
        if (!TextUtils.isEmpty(r3)) {
            sb.append(r3);
            sb.append(' ');
        }
        CharSequence p3 = p();
        if (!TextUtils.isEmpty(p3)) {
            sb.append(p3);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb;
    }

    public String i() {
        return this.f4080m;
    }

    public Intent j() {
        return this.f4079l;
    }

    public boolean k(boolean z3) {
        if (!I()) {
            return z3;
        }
        n();
        Object obj = null;
        obj.getClass();
        throw null;
    }

    public int l(int i3) {
        if (!I()) {
            return i3;
        }
        n();
        Object obj = null;
        obj.getClass();
        throw null;
    }

    public String m(String str) {
        if (!I()) {
            return str;
        }
        n();
        Object obj = null;
        obj.getClass();
        throw null;
    }

    public AbstractC0526a n() {
        return null;
    }

    public k0.b o() {
        return null;
    }

    public CharSequence p() {
        return q() != null ? q().a(this) : this.f4076i;
    }

    public final b q() {
        return this.f4070F;
    }

    public CharSequence r() {
        return this.f4075h;
    }

    public boolean s() {
        return !TextUtils.isEmpty(this.f4078k);
    }

    public boolean t() {
        return this.f4081n && this.f4086s && this.f4087t;
    }

    public String toString() {
        return h().toString();
    }

    public boolean u() {
        return this.f4082o;
    }

    public void v() {
    }

    public void w(boolean z3) {
        List list = this.f4069E;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((Preference) list.get(i3)).y(this, z3);
        }
    }

    public void x() {
    }

    public void y(Preference preference, boolean z3) {
        if (this.f4086s == z3) {
            this.f4086s = !z3;
            w(H());
            v();
        }
    }

    public Object z(TypedArray typedArray, int i3) {
        return null;
    }

    public Preference(Context context, AttributeSet attributeSet, int i3) {
        this(context, attributeSet, i3, 0);
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.a(context, c.f8012g, R.attr.preferenceStyle));
    }
}
