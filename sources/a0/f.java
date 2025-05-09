package a0;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* loaded from: classes.dex */
public abstract class f extends ReplacementSpan {

    /* renamed from: b, reason: collision with root package name */
    public final e f2647b;

    /* renamed from: a, reason: collision with root package name */
    public final Paint.FontMetricsInt f2646a = new Paint.FontMetricsInt();

    /* renamed from: c, reason: collision with root package name */
    public short f2648c = -1;

    /* renamed from: d, reason: collision with root package name */
    public short f2649d = -1;

    /* renamed from: e, reason: collision with root package name */
    public float f2650e = 1.0f;

    public f(e eVar) {
        J.g.h(eVar, "metadata cannot be null");
        this.f2647b = eVar;
    }

    public final e a() {
        return this.f2647b;
    }

    public final int b() {
        return this.f2648c;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        paint.getFontMetricsInt(this.f2646a);
        Paint.FontMetricsInt fontMetricsInt2 = this.f2646a;
        this.f2650e = (Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f) / this.f2647b.e();
        this.f2649d = (short) (this.f2647b.e() * this.f2650e);
        short i5 = (short) (this.f2647b.i() * this.f2650e);
        this.f2648c = i5;
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt3 = this.f2646a;
            fontMetricsInt.ascent = fontMetricsInt3.ascent;
            fontMetricsInt.descent = fontMetricsInt3.descent;
            fontMetricsInt.top = fontMetricsInt3.top;
            fontMetricsInt.bottom = fontMetricsInt3.bottom;
        }
        return i5;
    }
}
