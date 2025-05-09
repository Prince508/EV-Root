package l;

import B.f;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* renamed from: l.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0578s {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f8393a;

    /* renamed from: b, reason: collision with root package name */
    public C0550P f8394b;

    /* renamed from: c, reason: collision with root package name */
    public C0550P f8395c;

    /* renamed from: d, reason: collision with root package name */
    public C0550P f8396d;

    /* renamed from: e, reason: collision with root package name */
    public C0550P f8397e;

    /* renamed from: f, reason: collision with root package name */
    public C0550P f8398f;

    /* renamed from: g, reason: collision with root package name */
    public C0550P f8399g;

    /* renamed from: h, reason: collision with root package name */
    public C0550P f8400h;

    /* renamed from: i, reason: collision with root package name */
    public final C0580u f8401i;

    /* renamed from: j, reason: collision with root package name */
    public int f8402j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f8403k = -1;

    /* renamed from: l, reason: collision with root package name */
    public Typeface f8404l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f8405m;

    /* renamed from: l.s$b */
    public class b implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ TextView f8410e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Typeface f8411f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f8412g;

        public b(TextView textView, Typeface typeface, int i3) {
            this.f8410e = textView;
            this.f8411f = typeface;
            this.f8412g = i3;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f8410e.setTypeface(this.f8411f, this.f8412g);
        }
    }

    /* renamed from: l.s$c */
    public static class c {
        public static Drawable[] a(TextView textView) {
            return textView.getCompoundDrawablesRelative();
        }

        public static void b(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }

        public static void c(TextView textView, Locale locale) {
            textView.setTextLocale(locale);
        }
    }

    /* renamed from: l.s$d */
    public static class d {
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        public static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    /* renamed from: l.s$e */
    public static class e {
        public static int a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        public static void b(TextView textView, int i3, int i4, int i5, int i6) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i3, i4, i5, i6);
        }

        public static void c(TextView textView, int[] iArr, int i3) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i3);
        }

        public static boolean d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    /* renamed from: l.s$f */
    public static class f {
        public static Typeface a(Typeface typeface, int i3, boolean z3) {
            return Typeface.create(typeface, i3, z3);
        }
    }

    public C0578s(TextView textView) {
        this.f8393a = textView;
        this.f8401i = new C0580u(textView);
    }

    public static C0550P d(Context context, C0567h c0567h, int i3) {
        ColorStateList e3 = c0567h.e(context, i3);
        if (e3 == null) {
            return null;
        }
        C0550P c0550p = new C0550P();
        c0550p.f8292d = true;
        c0550p.f8289a = e3;
        return c0550p;
    }

    public void A(int i3, float f3) {
        if (c0.f8338b || l()) {
            return;
        }
        B(i3, f3);
    }

    public final void B(int i3, float f3) {
        this.f8401i.t(i3, f3);
    }

    public final void C(Context context, C0552S c0552s) {
        String n3;
        this.f8402j = c0552s.j(d.i.f6302l2, this.f8402j);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            int j3 = c0552s.j(d.i.f6314o2, -1);
            this.f8403k = j3;
            if (j3 != -1) {
                this.f8402j &= 2;
            }
        }
        int i4 = d.i.f6310n2;
        if (!c0552s.q(i4) && !c0552s.q(d.i.f6318p2)) {
            int i5 = d.i.f6298k2;
            if (c0552s.q(i5)) {
                this.f8405m = false;
                int j4 = c0552s.j(i5, 1);
                if (j4 == 1) {
                    this.f8404l = Typeface.SANS_SERIF;
                    return;
                } else if (j4 == 2) {
                    this.f8404l = Typeface.SERIF;
                    return;
                } else {
                    if (j4 != 3) {
                        return;
                    }
                    this.f8404l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f8404l = null;
        int i6 = d.i.f6318p2;
        if (c0552s.q(i6)) {
            i4 = i6;
        }
        int i7 = this.f8403k;
        int i8 = this.f8402j;
        if (!context.isRestricted()) {
            try {
                Typeface i9 = c0552s.i(i4, this.f8402j, new a(i7, i8, new WeakReference(this.f8393a)));
                if (i9 != null) {
                    if (i3 < 28 || this.f8403k == -1) {
                        this.f8404l = i9;
                    } else {
                        this.f8404l = f.a(Typeface.create(i9, 0), this.f8403k, (this.f8402j & 2) != 0);
                    }
                }
                this.f8405m = this.f8404l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f8404l != null || (n3 = c0552s.n(i4)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f8403k == -1) {
            this.f8404l = Typeface.create(n3, this.f8402j);
        } else {
            this.f8404l = f.a(Typeface.create(n3, 0), this.f8403k, (this.f8402j & 2) != 0);
        }
    }

    public final void a(Drawable drawable, C0550P c0550p) {
        if (drawable == null || c0550p == null) {
            return;
        }
        C0567h.g(drawable, c0550p, this.f8393a.getDrawableState());
    }

    public void b() {
        if (this.f8394b != null || this.f8395c != null || this.f8396d != null || this.f8397e != null) {
            Drawable[] compoundDrawables = this.f8393a.getCompoundDrawables();
            a(compoundDrawables[0], this.f8394b);
            a(compoundDrawables[1], this.f8395c);
            a(compoundDrawables[2], this.f8396d);
            a(compoundDrawables[3], this.f8397e);
        }
        if (this.f8398f == null && this.f8399g == null) {
            return;
        }
        Drawable[] a3 = c.a(this.f8393a);
        a(a3[0], this.f8398f);
        a(a3[2], this.f8399g);
    }

    public void c() {
        this.f8401i.a();
    }

    public int e() {
        return this.f8401i.f();
    }

    public int f() {
        return this.f8401i.g();
    }

    public int g() {
        return this.f8401i.h();
    }

    public int[] h() {
        return this.f8401i.i();
    }

    public int i() {
        return this.f8401i.j();
    }

    public ColorStateList j() {
        C0550P c0550p = this.f8400h;
        if (c0550p != null) {
            return c0550p.f8289a;
        }
        return null;
    }

    public PorterDuff.Mode k() {
        C0550P c0550p = this.f8400h;
        if (c0550p != null) {
            return c0550p.f8290b;
        }
        return null;
    }

    public boolean l() {
        return this.f8401i.n();
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m(android.util.AttributeSet r20, int r21) {
        /*
            Method dump skipped, instructions count: 600
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l.C0578s.m(android.util.AttributeSet, int):void");
    }

    public void n(WeakReference weakReference, Typeface typeface) {
        if (this.f8405m) {
            this.f8404l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                if (K.O.N(textView)) {
                    textView.post(new b(textView, typeface, this.f8402j));
                } else {
                    textView.setTypeface(typeface, this.f8402j);
                }
            }
        }
    }

    public void o(boolean z3, int i3, int i4, int i5, int i6) {
        if (c0.f8338b) {
            return;
        }
        c();
    }

    public void p() {
        b();
    }

    public void q(Context context, int i3) {
        String n3;
        C0552S r3 = C0552S.r(context, i3, d.i.f6290i2);
        int i4 = d.i.f6326r2;
        if (r3.q(i4)) {
            s(r3.a(i4, false));
        }
        int i5 = Build.VERSION.SDK_INT;
        int i6 = d.i.f6294j2;
        if (r3.q(i6) && r3.f(i6, -1) == 0) {
            this.f8393a.setTextSize(0, 0.0f);
        }
        C(context, r3);
        if (i5 >= 26) {
            int i7 = d.i.f6322q2;
            if (r3.q(i7) && (n3 = r3.n(i7)) != null) {
                e.d(this.f8393a, n3);
            }
        }
        r3.u();
        Typeface typeface = this.f8404l;
        if (typeface != null) {
            this.f8393a.setTypeface(typeface, this.f8402j);
        }
    }

    public void r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        P.c.f(editorInfo, textView.getText());
    }

    public void s(boolean z3) {
        this.f8393a.setAllCaps(z3);
    }

    public void t(int i3, int i4, int i5, int i6) {
        this.f8401i.p(i3, i4, i5, i6);
    }

    public void u(int[] iArr, int i3) {
        this.f8401i.q(iArr, i3);
    }

    public void v(int i3) {
        this.f8401i.r(i3);
    }

    public void w(ColorStateList colorStateList) {
        if (this.f8400h == null) {
            this.f8400h = new C0550P();
        }
        C0550P c0550p = this.f8400h;
        c0550p.f8289a = colorStateList;
        c0550p.f8292d = colorStateList != null;
        z();
    }

    public void x(PorterDuff.Mode mode) {
        if (this.f8400h == null) {
            this.f8400h = new C0550P();
        }
        C0550P c0550p = this.f8400h;
        c0550p.f8290b = mode;
        c0550p.f8291c = mode != null;
        z();
    }

    public final void y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] a3 = c.a(this.f8393a);
            TextView textView = this.f8393a;
            if (drawable5 == null) {
                drawable5 = a3[0];
            }
            if (drawable2 == null) {
                drawable2 = a3[1];
            }
            if (drawable6 == null) {
                drawable6 = a3[2];
            }
            if (drawable4 == null) {
                drawable4 = a3[3];
            }
            c.b(textView, drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] a4 = c.a(this.f8393a);
        Drawable drawable7 = a4[0];
        if (drawable7 != null || a4[2] != null) {
            TextView textView2 = this.f8393a;
            if (drawable2 == null) {
                drawable2 = a4[1];
            }
            Drawable drawable8 = a4[2];
            if (drawable4 == null) {
                drawable4 = a4[3];
            }
            c.b(textView2, drawable7, drawable2, drawable8, drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.f8393a.getCompoundDrawables();
        TextView textView3 = this.f8393a;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    public final void z() {
        C0550P c0550p = this.f8400h;
        this.f8394b = c0550p;
        this.f8395c = c0550p;
        this.f8396d = c0550p;
        this.f8397e = c0550p;
        this.f8398f = c0550p;
        this.f8399g = c0550p;
    }

    /* renamed from: l.s$a */
    public class a extends f.e {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f8406a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f8407b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ WeakReference f8408c;

        public a(int i3, int i4, WeakReference weakReference) {
            this.f8406a = i3;
            this.f8407b = i4;
            this.f8408c = weakReference;
        }

        @Override // B.f.e
        public void g(Typeface typeface) {
            int i3;
            if (Build.VERSION.SDK_INT >= 28 && (i3 = this.f8406a) != -1) {
                typeface = f.a(typeface, i3, (this.f8407b & 2) != 0);
            }
            C0578s.this.n(this.f8408c, typeface);
        }

        @Override // B.f.e
        public void f(int i3) {
        }
    }
}
