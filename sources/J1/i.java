package J1;

import B1.y;
import J1.r;
import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    public static final i f882b = new i();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f883a = new AtomicReference(new r.b().e());

    public static i a() {
        return f882b;
    }

    public boolean b(q qVar) {
        return ((r) this.f883a.get()).e(qVar);
    }

    public B1.g c(q qVar, y yVar) {
        return ((r) this.f883a.get()).f(qVar, yVar);
    }

    public B1.g d(o oVar, y yVar) {
        if (yVar == null) {
            throw new NullPointerException("access cannot be null");
        }
        if (b(oVar)) {
            return c(oVar, yVar);
        }
        try {
            return new e(oVar, yVar);
        } catch (GeneralSecurityException e3) {
            throw new s("Creating a LegacyProtoKey failed", e3);
        }
    }

    public synchronized void e(b bVar) {
        this.f883a.set(new r.b((r) this.f883a.get()).f(bVar).e());
    }

    public synchronized void f(c cVar) {
        this.f883a.set(new r.b((r) this.f883a.get()).g(cVar).e());
    }

    public synchronized void g(j jVar) {
        this.f883a.set(new r.b((r) this.f883a.get()).h(jVar).e());
    }

    public synchronized void h(k kVar) {
        this.f883a.set(new r.b((r) this.f883a.get()).i(kVar).e());
    }
}
