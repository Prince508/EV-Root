package a0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;

/* loaded from: classes.dex */
public final class j extends f {

    /* renamed from: f, reason: collision with root package name */
    public static Paint f2659f;

    public j(e eVar) {
        super(eVar);
    }

    public static Paint c() {
        if (f2659f == null) {
            TextPaint textPaint = new TextPaint();
            f2659f = textPaint;
            textPaint.setColor(androidx.emoji2.text.c.b().c());
            f2659f.setStyle(Paint.Style.FILL);
        }
        return f2659f;
    }

    @Override // android.text.style.ReplacementSpan
    public void draw(Canvas canvas, CharSequence charSequence, int i3, int i4, float f3, int i5, int i6, int i7, Paint paint) {
        Canvas canvas2;
        float f4;
        if (androidx.emoji2.text.c.b().i()) {
            canvas2 = canvas;
            f4 = f3;
            canvas2.drawRect(f4, i5, f3 + b(), i7, c());
        } else {
            canvas2 = canvas;
            f4 = f3;
        }
        a().a(canvas2, f4, i6, paint);
    }
}
