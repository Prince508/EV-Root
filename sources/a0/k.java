package a0;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* loaded from: classes.dex */
public class k implements Spannable {

    /* renamed from: e, reason: collision with root package name */
    public boolean f2660e = false;

    /* renamed from: f, reason: collision with root package name */
    public Spannable f2661f;

    public static class a {
        public static IntStream a(CharSequence charSequence) {
            return charSequence.chars();
        }

        public static IntStream b(CharSequence charSequence) {
            return charSequence.codePoints();
        }
    }

    public static class b {
        public boolean a(CharSequence charSequence) {
            return false;
        }
    }

    public static class c extends b {
        @Override // a0.k.b
        public boolean a(CharSequence charSequence) {
            return l.a(charSequence);
        }
    }

    public k(Spannable spannable) {
        this.f2661f = spannable;
    }

    public static b c() {
        return Build.VERSION.SDK_INT < 28 ? new b() : new c();
    }

    public final void a() {
        Spannable spannable = this.f2661f;
        if (!this.f2660e && c().a(spannable)) {
            this.f2661f = new SpannableString(spannable);
        }
        this.f2660e = true;
    }

    public Spannable b() {
        return this.f2661f;
    }

    @Override // java.lang.CharSequence
    public char charAt(int i3) {
        return this.f2661f.charAt(i3);
    }

    @Override // java.lang.CharSequence
    public IntStream chars() {
        return a.a(this.f2661f);
    }

    @Override // java.lang.CharSequence
    public IntStream codePoints() {
        return a.b(this.f2661f);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.f2661f.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.f2661f.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.f2661f.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public Object[] getSpans(int i3, int i4, Class cls) {
        return this.f2661f.getSpans(i3, i4, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.f2661f.length();
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i3, int i4, Class cls) {
        return this.f2661f.nextSpanTransition(i3, i4, cls);
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        a();
        this.f2661f.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i3, int i4, int i5) {
        a();
        this.f2661f.setSpan(obj, i3, i4, i5);
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i3, int i4) {
        return this.f2661f.subSequence(i3, i4);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.f2661f.toString();
    }

    public k(CharSequence charSequence) {
        this.f2661f = new SpannableString(charSequence);
    }
}
