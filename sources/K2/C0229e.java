package K2;

import java.util.concurrent.locks.LockSupport;

/* renamed from: K2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0229e extends AbstractC0221a {

    /* renamed from: h, reason: collision with root package name */
    public final Thread f1191h;

    /* renamed from: i, reason: collision with root package name */
    public final Z f1192i;

    public C0229e(s2.i iVar, Thread thread, Z z3) {
        super(iVar, true, true);
        this.f1191h = thread;
        this.f1192i = z3;
    }

    @Override // K2.w0
    public void O(Object obj) {
        if (C2.k.a(Thread.currentThread(), this.f1191h)) {
            return;
        }
        Thread thread = this.f1191h;
        AbstractC0225c.a();
        LockSupport.unpark(thread);
    }

    public final Object T0() {
        AbstractC0225c.a();
        try {
            Z z3 = this.f1192i;
            if (z3 != null) {
                Z.w(z3, false, 1, null);
            }
            while (!Thread.interrupted()) {
                try {
                    Z z4 = this.f1192i;
                    long E3 = z4 != null ? z4.E() : Long.MAX_VALUE;
                    if (o0()) {
                        Z z5 = this.f1192i;
                        if (z5 != null) {
                            Z.q(z5, false, 1, null);
                        }
                        AbstractC0225c.a();
                        Object h3 = x0.h(j0());
                        C0260z c0260z = h3 instanceof C0260z ? (C0260z) h3 : null;
                        if (c0260z == null) {
                            return h3;
                        }
                        throw c0260z.f1245a;
                    }
                    AbstractC0225c.a();
                    LockSupport.parkNanos(this, E3);
                } catch (Throwable th) {
                    Z z6 = this.f1192i;
                    if (z6 != null) {
                        Z.q(z6, false, 1, null);
                    }
                    throw th;
                }
            }
            InterruptedException interruptedException = new InterruptedException();
            R(interruptedException);
            throw interruptedException;
        } catch (Throwable th2) {
            AbstractC0225c.a();
            throw th2;
        }
    }

    @Override // K2.w0
    public boolean p0() {
        return true;
    }
}
