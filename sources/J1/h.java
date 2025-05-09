package J1;

import B1.v;
import B1.w;
import J1.n;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: b, reason: collision with root package name */
    public static h f880b = new h();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f881a = new AtomicReference(new n.b().c());

    public static h c() {
        return f880b;
    }

    public Class a(Class cls) {
        return ((n) this.f881a.get()).c(cls);
    }

    public Object b(B1.g gVar, Class cls) {
        return ((n) this.f881a.get()).d(gVar, cls);
    }

    public synchronized void d(l lVar) {
        this.f881a.set(new n.b((n) this.f881a.get()).d(lVar).c());
    }

    public synchronized void e(w wVar) {
        this.f881a.set(new n.b((n) this.f881a.get()).e(wVar).c());
    }

    public Object f(v vVar, Class cls) {
        return ((n) this.f881a.get()).e(vVar, cls);
    }
}
