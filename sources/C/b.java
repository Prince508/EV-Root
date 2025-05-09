package C;

import android.graphics.Insets;
import android.graphics.Rect;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final b f127e = new b(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f128a;

    /* renamed from: b, reason: collision with root package name */
    public final int f129b;

    /* renamed from: c, reason: collision with root package name */
    public final int f130c;

    /* renamed from: d, reason: collision with root package name */
    public final int f131d;

    public static class a {
        public static Insets a(int i3, int i4, int i5, int i6) {
            return Insets.of(i3, i4, i5, i6);
        }
    }

    public b(int i3, int i4, int i5, int i6) {
        this.f128a = i3;
        this.f129b = i4;
        this.f130c = i5;
        this.f131d = i6;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.f128a, bVar2.f128a), Math.max(bVar.f129b, bVar2.f129b), Math.max(bVar.f130c, bVar2.f130c), Math.max(bVar.f131d, bVar2.f131d));
    }

    public static b b(int i3, int i4, int i5, int i6) {
        return (i3 == 0 && i4 == 0 && i5 == 0 && i6 == 0) ? f127e : new b(i3, i4, i5, i6);
    }

    public static b c(Rect rect) {
        return b(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static b d(Insets insets) {
        int i3;
        int i4;
        int i5;
        int i6;
        i3 = insets.left;
        i4 = insets.top;
        i5 = insets.right;
        i6 = insets.bottom;
        return b(i3, i4, i5, i6);
    }

    public Insets e() {
        return a.a(this.f128a, this.f129b, this.f130c, this.f131d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f131d == bVar.f131d && this.f128a == bVar.f128a && this.f130c == bVar.f130c && this.f129b == bVar.f129b;
    }

    public int hashCode() {
        return (((((this.f128a * 31) + this.f129b) * 31) + this.f130c) * 31) + this.f131d;
    }

    public String toString() {
        return "Insets{left=" + this.f128a + ", top=" + this.f129b + ", right=" + this.f130c + ", bottom=" + this.f131d + '}';
    }
}
