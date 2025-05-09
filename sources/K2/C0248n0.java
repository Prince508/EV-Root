package K2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: K2.n0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0248n0 extends r0 {

    /* renamed from: j, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1207j = AtomicIntegerFieldUpdater.newUpdater(C0248n0.class, "_invoked");
    private volatile int _invoked;

    /* renamed from: i, reason: collision with root package name */
    public final B2.l f1208i;

    public C0248n0(B2.l lVar) {
        this.f1208i = lVar;
    }

    @Override // B2.l
    public /* bridge */ /* synthetic */ Object j(Object obj) {
        y((Throwable) obj);
        return q2.n.f8874a;
    }

    @Override // K2.B
    public void y(Throwable th) {
        if (f1207j.compareAndSet(this, 0, 1)) {
            this.f1208i.j(th);
        }
    }
}
