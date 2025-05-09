package androidx.emoji2.text;

import android.text.TextPaint;
import androidx.emoji2.text.c;

/* loaded from: classes.dex */
public class b implements c.d {

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f3878b = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f3879a;

    public b() {
        TextPaint textPaint = new TextPaint();
        this.f3879a = textPaint;
        textPaint.setTextSize(10.0f);
    }

    public static StringBuilder b() {
        ThreadLocal threadLocal = f3878b;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        return (StringBuilder) threadLocal.get();
    }

    @Override // androidx.emoji2.text.c.d
    public boolean a(CharSequence charSequence, int i3, int i4, int i5) {
        StringBuilder b3 = b();
        b3.setLength(0);
        while (i3 < i4) {
            b3.append(charSequence.charAt(i3));
            i3++;
        }
        return C.c.a(this.f3879a, b3.toString());
    }
}
