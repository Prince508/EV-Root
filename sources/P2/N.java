package P2;

import K2.I0;

/* loaded from: classes.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    public final s2.i f1752a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f1753b;

    /* renamed from: c, reason: collision with root package name */
    public final I0[] f1754c;

    /* renamed from: d, reason: collision with root package name */
    public int f1755d;

    public N(s2.i iVar, int i3) {
        this.f1752a = iVar;
        this.f1753b = new Object[i3];
        this.f1754c = new I0[i3];
    }

    public final void a(I0 i02, Object obj) {
        Object[] objArr = this.f1753b;
        int i3 = this.f1755d;
        objArr[i3] = obj;
        I0[] i0Arr = this.f1754c;
        this.f1755d = i3 + 1;
        C2.k.c(i02, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        i0Arr[i3] = i02;
    }

    public final void b(s2.i iVar) {
        int length = this.f1754c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i3 = length - 1;
            I0 i02 = this.f1754c[length];
            C2.k.b(i02);
            i02.D(iVar, this.f1753b[length]);
            if (i3 < 0) {
                return;
            } else {
                length = i3;
            }
        }
    }
}
