package r1;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: n, reason: collision with root package name */
    public static final int f8961n = 1;

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f8962a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f8963b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8964c;

    /* renamed from: e, reason: collision with root package name */
    public int f8966e;

    /* renamed from: l, reason: collision with root package name */
    public boolean f8973l;

    /* renamed from: d, reason: collision with root package name */
    public int f8965d = 0;

    /* renamed from: f, reason: collision with root package name */
    public Layout.Alignment f8967f = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: g, reason: collision with root package name */
    public int f8968g = Integer.MAX_VALUE;

    /* renamed from: h, reason: collision with root package name */
    public float f8969h = 0.0f;

    /* renamed from: i, reason: collision with root package name */
    public float f8970i = 1.0f;

    /* renamed from: j, reason: collision with root package name */
    public int f8971j = f8961n;

    /* renamed from: k, reason: collision with root package name */
    public boolean f8972k = true;

    /* renamed from: m, reason: collision with root package name */
    public TextUtils.TruncateAt f8974m = null;

    public static class a extends Exception {
    }

    public g(CharSequence charSequence, TextPaint textPaint, int i3) {
        this.f8962a = charSequence;
        this.f8963b = textPaint;
        this.f8964c = i3;
        this.f8966e = charSequence.length();
    }

    public static g b(CharSequence charSequence, TextPaint textPaint, int i3) {
        return new g(charSequence, textPaint, i3);
    }

    public StaticLayout a() {
        if (this.f8962a == null) {
            this.f8962a = "";
        }
        int max = Math.max(0, this.f8964c);
        CharSequence charSequence = this.f8962a;
        if (this.f8968g == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.f8963b, max, this.f8974m);
        }
        int min = Math.min(charSequence.length(), this.f8966e);
        this.f8966e = min;
        if (this.f8973l && this.f8968g == 1) {
            this.f8967f = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, this.f8965d, min, this.f8963b, max);
        obtain.setAlignment(this.f8967f);
        obtain.setIncludePad(this.f8972k);
        obtain.setTextDirection(this.f8973l ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f8974m;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f8968g);
        float f3 = this.f8969h;
        if (f3 != 0.0f || this.f8970i != 1.0f) {
            obtain.setLineSpacing(f3, this.f8970i);
        }
        if (this.f8968g > 1) {
            obtain.setHyphenationFrequency(this.f8971j);
        }
        return obtain.build();
    }

    public g c(Layout.Alignment alignment) {
        this.f8967f = alignment;
        return this;
    }

    public g d(TextUtils.TruncateAt truncateAt) {
        this.f8974m = truncateAt;
        return this;
    }

    public g e(int i3) {
        this.f8971j = i3;
        return this;
    }

    public g f(boolean z3) {
        this.f8972k = z3;
        return this;
    }

    public g g(boolean z3) {
        this.f8973l = z3;
        return this;
    }

    public g h(float f3, float f4) {
        this.f8969h = f3;
        this.f8970i = f4;
        return this;
    }

    public g i(int i3) {
        this.f8968g = i3;
        return this;
    }

    public g j(h hVar) {
        return this;
    }
}
