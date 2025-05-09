package K2;

import java.util.concurrent.locks.LockSupport;

/* renamed from: K2.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0224b0 extends Z {
    public abstract Thread L();

    public final void M() {
        Thread L3 = L();
        if (Thread.currentThread() != L3) {
            AbstractC0225c.a();
            LockSupport.unpark(L3);
        }
    }
}
