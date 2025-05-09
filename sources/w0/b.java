package w0;

import android.graphics.Rect;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f9910a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9911b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9912c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9913d;

    public b(int i3, int i4, int i5, int i6) {
        this.f9910a = i3;
        this.f9911b = i4;
        this.f9912c = i5;
        this.f9913d = i6;
        if (i3 > i5) {
            throw new IllegalArgumentException(("Left must be less than or equal to right, left: " + i3 + ", right: " + i5).toString());
        }
        if (i4 <= i6) {
            return;
        }
        throw new IllegalArgumentException(("top must be less than or equal to bottom, top: " + i4 + ", bottom: " + i6).toString());
    }

    public final int a() {
        return this.f9913d - this.f9911b;
    }

    public final int b() {
        return this.f9910a;
    }

    public final int c() {
        return this.f9911b;
    }

    public final int d() {
        return this.f9912c - this.f9910a;
    }

    public final boolean e() {
        return a() == 0 && d() == 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C2.k.a(b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        C2.k.c(obj, "null cannot be cast to non-null type androidx.window.core.Bounds");
        b bVar = (b) obj;
        return this.f9910a == bVar.f9910a && this.f9911b == bVar.f9911b && this.f9912c == bVar.f9912c && this.f9913d == bVar.f9913d;
    }

    public final Rect f() {
        return new Rect(this.f9910a, this.f9911b, this.f9912c, this.f9913d);
    }

    public int hashCode() {
        return (((((this.f9910a * 31) + this.f9911b) * 31) + this.f9912c) * 31) + this.f9913d;
    }

    public String toString() {
        return b.class.getSimpleName() + " { [" + this.f9910a + ',' + this.f9911b + ',' + this.f9912c + ',' + this.f9913d + "] }";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        C2.k.e(rect, "rect");
    }
}
