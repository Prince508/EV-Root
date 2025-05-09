package I;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes.dex */
public abstract class l implements Spannable {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final TextPaint f783a;

        /* renamed from: b, reason: collision with root package name */
        public final TextDirectionHeuristic f784b;

        /* renamed from: c, reason: collision with root package name */
        public final int f785c;

        /* renamed from: d, reason: collision with root package name */
        public final int f786d;

        /* renamed from: e, reason: collision with root package name */
        public final PrecomputedText.Params f787e;

        /* renamed from: I.l$a$a, reason: collision with other inner class name */
        public static class C0021a {

            /* renamed from: a, reason: collision with root package name */
            public final TextPaint f788a;

            /* renamed from: c, reason: collision with root package name */
            public int f790c = 1;

            /* renamed from: d, reason: collision with root package name */
            public int f791d = 1;

            /* renamed from: b, reason: collision with root package name */
            public TextDirectionHeuristic f789b = TextDirectionHeuristics.FIRSTSTRONG_LTR;

            public C0021a(TextPaint textPaint) {
                this.f788a = textPaint;
            }

            public a a() {
                return new a(this.f788a, this.f789b, this.f790c, this.f791d);
            }

            public C0021a b(int i3) {
                this.f790c = i3;
                return this;
            }

            public C0021a c(int i3) {
                this.f791d = i3;
                return this;
            }

            public C0021a d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f789b = textDirectionHeuristic;
                return this;
            }
        }

        public a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i3, int i4) {
            PrecomputedText.Params.Builder breakStrategy;
            PrecomputedText.Params.Builder hyphenationFrequency;
            PrecomputedText.Params.Builder textDirection;
            PrecomputedText.Params build;
            if (Build.VERSION.SDK_INT >= 29) {
                breakStrategy = k.a(textPaint).setBreakStrategy(i3);
                hyphenationFrequency = breakStrategy.setHyphenationFrequency(i4);
                textDirection = hyphenationFrequency.setTextDirection(textDirectionHeuristic);
                build = textDirection.build();
                this.f787e = build;
            } else {
                this.f787e = null;
            }
            this.f783a = textPaint;
            this.f784b = textDirectionHeuristic;
            this.f785c = i3;
            this.f786d = i4;
        }

        public boolean a(a aVar) {
            if (this.f785c == aVar.b() && this.f786d == aVar.c() && this.f783a.getTextSize() == aVar.e().getTextSize() && this.f783a.getTextScaleX() == aVar.e().getTextScaleX() && this.f783a.getTextSkewX() == aVar.e().getTextSkewX() && this.f783a.getLetterSpacing() == aVar.e().getLetterSpacing() && TextUtils.equals(this.f783a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()) && this.f783a.getFlags() == aVar.e().getFlags() && this.f783a.getTextLocales().equals(aVar.e().getTextLocales())) {
                return this.f783a.getTypeface() == null ? aVar.e().getTypeface() == null : this.f783a.getTypeface().equals(aVar.e().getTypeface());
            }
            return false;
        }

        public int b() {
            return this.f785c;
        }

        public int c() {
            return this.f786d;
        }

        public TextDirectionHeuristic d() {
            return this.f784b;
        }

        public TextPaint e() {
            return this.f783a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return a(aVar) && this.f784b == aVar.d();
        }

        public int hashCode() {
            return J.c.b(Float.valueOf(this.f783a.getTextSize()), Float.valueOf(this.f783a.getTextScaleX()), Float.valueOf(this.f783a.getTextSkewX()), Float.valueOf(this.f783a.getLetterSpacing()), Integer.valueOf(this.f783a.getFlags()), this.f783a.getTextLocales(), this.f783a.getTypeface(), Boolean.valueOf(this.f783a.isElegantTextHeight()), this.f784b, Integer.valueOf(this.f785c), Integer.valueOf(this.f786d));
        }

        public String toString() {
            String fontVariationSettings;
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.f783a.getTextSize());
            sb.append(", textScaleX=" + this.f783a.getTextScaleX());
            sb.append(", textSkewX=" + this.f783a.getTextSkewX());
            int i3 = Build.VERSION.SDK_INT;
            sb.append(", letterSpacing=" + this.f783a.getLetterSpacing());
            sb.append(", elegantTextHeight=" + this.f783a.isElegantTextHeight());
            sb.append(", textLocale=" + this.f783a.getTextLocales());
            sb.append(", typeface=" + this.f783a.getTypeface());
            if (i3 >= 26) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(", variationSettings=");
                fontVariationSettings = this.f783a.getFontVariationSettings();
                sb2.append(fontVariationSettings);
                sb.append(sb2.toString());
            }
            sb.append(", textDir=" + this.f784b);
            sb.append(", breakStrategy=" + this.f785c);
            sb.append(", hyphenationFrequency=" + this.f786d);
            sb.append("}");
            return sb.toString();
        }

        public a(PrecomputedText.Params params) {
            TextPaint textPaint;
            TextDirectionHeuristic textDirection;
            int breakStrategy;
            int hyphenationFrequency;
            textPaint = params.getTextPaint();
            this.f783a = textPaint;
            textDirection = params.getTextDirection();
            this.f784b = textDirection;
            breakStrategy = params.getBreakStrategy();
            this.f785c = breakStrategy;
            hyphenationFrequency = params.getHyphenationFrequency();
            this.f786d = hyphenationFrequency;
            this.f787e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}
