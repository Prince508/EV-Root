package R2;

import K2.AbstractC0232f0;

/* loaded from: classes.dex */
public abstract class f extends AbstractC0232f0 {

    /* renamed from: h, reason: collision with root package name */
    public final int f1939h;

    /* renamed from: i, reason: collision with root package name */
    public final int f1940i;

    /* renamed from: j, reason: collision with root package name */
    public final long f1941j;

    /* renamed from: k, reason: collision with root package name */
    public final String f1942k;

    /* renamed from: l, reason: collision with root package name */
    public a f1943l = o();

    public f(int i3, int i4, long j3, String str) {
        this.f1939h = i3;
        this.f1940i = i4;
        this.f1941j = j3;
        this.f1942k = str;
    }

    @Override // K2.F
    public void c(s2.i iVar, Runnable runnable) {
        a.g(this.f1943l, runnable, null, false, 6, null);
    }

    public final a o() {
        return new a(this.f1939h, this.f1940i, this.f1941j, this.f1942k);
    }

    public final void q(Runnable runnable, i iVar, boolean z3) {
        this.f1943l.f(runnable, iVar, z3);
    }
}
