package z0;

import K.C0205k0;
import android.graphics.Rect;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final w0.b f10297a;

    /* renamed from: b, reason: collision with root package name */
    public final C0205k0 f10298b;

    public k(w0.b bVar, C0205k0 c0205k0) {
        C2.k.e(bVar, "_bounds");
        C2.k.e(c0205k0, "_windowInsetsCompat");
        this.f10297a = bVar;
        this.f10298b = c0205k0;
    }

    public final Rect a() {
        return this.f10297a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C2.k.a(k.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        C2.k.c(obj, "null cannot be cast to non-null type androidx.window.layout.WindowMetrics");
        k kVar = (k) obj;
        return C2.k.a(this.f10297a, kVar.f10297a) && C2.k.a(this.f10298b, kVar.f10298b);
    }

    public int hashCode() {
        return (this.f10297a.hashCode() * 31) + this.f10298b.hashCode();
    }

    public String toString() {
        return "WindowMetrics( bounds=" + this.f10297a + ", windowInsetsCompat=" + this.f10298b + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ k(android.graphics.Rect r1, K.C0205k0 r2, int r3, C2.g r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L12
            K.k0$b r2 = new K.k0$b
            r2.<init>()
            K.k0 r2 = r2.a()
            java.lang.String r3 = "Builder().build()"
            C2.k.d(r2, r3)
        L12:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z0.k.<init>(android.graphics.Rect, K.k0, int, C2.g):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(Rect rect, C0205k0 c0205k0) {
        this(new w0.b(rect), c0205k0);
        C2.k.e(rect, "bounds");
        C2.k.e(c0205k0, "insets");
    }
}
