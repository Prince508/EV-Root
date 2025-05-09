package a0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import b0.C0363a;

/* loaded from: classes.dex */
public class e {

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f2642d = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final int f2643a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.emoji2.text.f f2644b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f2645c = 0;

    public e(androidx.emoji2.text.f fVar, int i3) {
        this.f2644b = fVar;
        this.f2643a = i3;
    }

    public void a(Canvas canvas, float f3, float f4, Paint paint) {
        Typeface g3 = this.f2644b.g();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(g3);
        canvas.drawText(this.f2644b.c(), this.f2643a * 2, 2, f3, f4, paint);
        paint.setTypeface(typeface);
    }

    public int b(int i3) {
        return g().h(i3);
    }

    public int c() {
        return g().i();
    }

    public int d() {
        return this.f2645c;
    }

    public short e() {
        return g().k();
    }

    public int f() {
        return g().l();
    }

    public final C0363a g() {
        ThreadLocal threadLocal = f2642d;
        C0363a c0363a = (C0363a) threadLocal.get();
        if (c0363a == null) {
            c0363a = new C0363a();
            threadLocal.set(c0363a);
        }
        this.f2644b.d().j(c0363a, this.f2643a);
        return c0363a;
    }

    public short h() {
        return g().m();
    }

    public short i() {
        return g().n();
    }

    public boolean j() {
        return g().j();
    }

    public void k(boolean z3) {
        this.f2645c = z3 ? 2 : 1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(f()));
        sb.append(", codepoints:");
        int c3 = c();
        for (int i3 = 0; i3 < c3; i3++) {
            sb.append(Integer.toHexString(b(i3)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
