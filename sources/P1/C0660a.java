package p1;

import android.content.Context;
import android.graphics.Color;
import e1.AbstractC0464a;
import m1.AbstractC0597a;
import u1.AbstractC0739b;

/* renamed from: p1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0660a {

    /* renamed from: f, reason: collision with root package name */
    public static final int f8843f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f8844a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8845b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8846c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8847d;

    /* renamed from: e, reason: collision with root package name */
    public final float f8848e;

    public C0660a(Context context) {
        this(AbstractC0739b.b(context, AbstractC0464a.f6794l, false), AbstractC0597a.b(context, AbstractC0464a.f6793k, 0), AbstractC0597a.b(context, AbstractC0464a.f6792j, 0), AbstractC0597a.b(context, AbstractC0464a.f6790h, 0), context.getResources().getDisplayMetrics().density);
    }

    public float a(float f3) {
        if (this.f8848e <= 0.0f || f3 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f3 / r0)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public int b(int i3, float f3) {
        int i4;
        float a3 = a(f3);
        int alpha = Color.alpha(i3);
        int j3 = AbstractC0597a.j(C.a.k(i3, 255), this.f8845b, a3);
        if (a3 > 0.0f && (i4 = this.f8846c) != 0) {
            j3 = AbstractC0597a.i(j3, C.a.k(i4, f8843f));
        }
        return C.a.k(j3, alpha);
    }

    public int c(int i3, float f3) {
        return (this.f8844a && e(i3)) ? b(i3, f3) : i3;
    }

    public boolean d() {
        return this.f8844a;
    }

    public final boolean e(int i3) {
        return C.a.k(i3, 255) == this.f8847d;
    }

    public C0660a(boolean z3, int i3, int i4, int i5, float f3) {
        this.f8844a = z3;
        this.f8845b = i3;
        this.f8846c = i4;
        this.f8847d = i5;
        this.f8848e = f3;
    }
}
