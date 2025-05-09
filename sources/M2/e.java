package M2;

import K2.AbstractC0221a;
import K2.q0;
import K2.w0;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public abstract class e extends AbstractC0221a implements d {

    /* renamed from: h, reason: collision with root package name */
    public final d f1417h;

    public e(s2.i iVar, d dVar, boolean z3, boolean z4) {
        super(iVar, z3, z4);
        this.f1417h = dVar;
    }

    @Override // M2.t
    public void E(B2.l lVar) {
        this.f1417h.E(lVar);
    }

    @Override // K2.w0
    public void T(Throwable th) {
        CancellationException I02 = w0.I0(this, th, null, 1, null);
        this.f1417h.b(I02);
        R(I02);
    }

    public final d T0() {
        return this.f1417h;
    }

    @Override // K2.w0, K2.p0
    public final void b(CancellationException cancellationException) {
        if (n0()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new q0(W(), null, this);
        }
        T(cancellationException);
    }

    @Override // M2.s
    public f iterator() {
        return this.f1417h.iterator();
    }

    @Override // M2.t
    public Object j(Object obj, s2.e eVar) {
        return this.f1417h.j(obj, eVar);
    }

    @Override // M2.s
    public Object o() {
        return this.f1417h.o();
    }

    @Override // M2.t
    public boolean q(Throwable th) {
        return this.f1417h.q(th);
    }

    @Override // M2.t
    public Object s(Object obj) {
        return this.f1417h.s(obj);
    }

    @Override // M2.s
    public Object w(s2.e eVar) {
        return this.f1417h.w(eVar);
    }

    @Override // M2.t
    public boolean x() {
        return this.f1417h.x();
    }
}
