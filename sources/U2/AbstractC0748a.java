package u2;

import java.io.Serializable;
import q2.h;
import t2.AbstractC0733c;

/* renamed from: u2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0748a implements s2.e, e, Serializable {

    /* renamed from: e, reason: collision with root package name */
    public final s2.e f9641e;

    public AbstractC0748a(s2.e eVar) {
        this.f9641e = eVar;
    }

    public s2.e a(Object obj, s2.e eVar) {
        C2.k.e(eVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public final s2.e f() {
        return this.f9641e;
    }

    public StackTraceElement k() {
        return g.d(this);
    }

    public abstract Object l(Object obj);

    public e m() {
        s2.e eVar = this.f9641e;
        if (eVar instanceof e) {
            return (e) eVar;
        }
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object k3 = k();
        if (k3 == null) {
            k3 = getClass().getName();
        }
        sb.append(k3);
        return sb.toString();
    }

    @Override // s2.e
    public final void u(Object obj) {
        Object l3;
        s2.e eVar = this;
        while (true) {
            h.b(eVar);
            AbstractC0748a abstractC0748a = (AbstractC0748a) eVar;
            s2.e eVar2 = abstractC0748a.f9641e;
            C2.k.b(eVar2);
            try {
                l3 = abstractC0748a.l(obj);
            } catch (Throwable th) {
                h.a aVar = q2.h.f8868e;
                obj = q2.h.a(q2.i.a(th));
            }
            if (l3 == AbstractC0733c.c()) {
                return;
            }
            obj = q2.h.a(l3);
            abstractC0748a.n();
            if (!(eVar2 instanceof AbstractC0748a)) {
                eVar2.u(obj);
                return;
            }
            eVar = eVar2;
        }
    }

    public void n() {
    }
}
