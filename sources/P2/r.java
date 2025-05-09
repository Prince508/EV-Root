package P2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p.AbstractC0657b;

/* loaded from: classes.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1786a = AtomicReferenceFieldUpdater.newUpdater(r.class, Object.class, "_cur");
    private volatile Object _cur;

    public r(boolean z3) {
        this._cur = new s(8, z3);
    }

    public final boolean a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1786a;
        while (true) {
            s sVar = (s) atomicReferenceFieldUpdater.get(this);
            int a3 = sVar.a(obj);
            if (a3 == 0) {
                return true;
            }
            if (a3 == 1) {
                AbstractC0657b.a(f1786a, this, sVar, sVar.i());
            } else if (a3 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1786a;
        while (true) {
            s sVar = (s) atomicReferenceFieldUpdater.get(this);
            if (sVar.d()) {
                return;
            } else {
                AbstractC0657b.a(f1786a, this, sVar, sVar.i());
            }
        }
    }

    public final int c() {
        return ((s) f1786a.get(this)).f();
    }

    public final Object d() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1786a;
        while (true) {
            s sVar = (s) atomicReferenceFieldUpdater.get(this);
            Object j3 = sVar.j();
            if (j3 != s.f1790h) {
                return j3;
            }
            AbstractC0657b.a(f1786a, this, sVar, sVar.i());
        }
    }
}
