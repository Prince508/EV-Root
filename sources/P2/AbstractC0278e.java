package P2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p.AbstractC0657b;

/* renamed from: P2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0278e {

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1760e = AtomicReferenceFieldUpdater.newUpdater(AbstractC0278e.class, Object.class, "_next");

    /* renamed from: f, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1761f = AtomicReferenceFieldUpdater.newUpdater(AbstractC0278e.class, Object.class, "_prev");
    private volatile Object _next;
    private volatile Object _prev;

    public AbstractC0278e(AbstractC0278e abstractC0278e) {
        this._prev = abstractC0278e;
    }

    public final void b() {
        f1761f.lazySet(this, null);
    }

    public final AbstractC0278e c() {
        AbstractC0278e g3 = g();
        while (g3 != null && g3.h()) {
            g3 = (AbstractC0278e) f1761f.get(g3);
        }
        return g3;
    }

    public final AbstractC0278e d() {
        AbstractC0278e e3;
        AbstractC0278e e4 = e();
        C2.k.b(e4);
        while (e4.h() && (e3 = e4.e()) != null) {
            e4 = e3;
        }
        return e4;
    }

    public final AbstractC0278e e() {
        Object f3 = f();
        if (f3 == AbstractC0277d.f1759a) {
            return null;
        }
        return (AbstractC0278e) f3;
    }

    public final Object f() {
        return f1760e.get(this);
    }

    public final AbstractC0278e g() {
        return (AbstractC0278e) f1761f.get(this);
    }

    public abstract boolean h();

    public final boolean i() {
        return e() == null;
    }

    public final boolean j() {
        return AbstractC0657b.a(f1760e, this, null, AbstractC0277d.f1759a);
    }

    public final void k() {
        Object obj;
        if (i()) {
            return;
        }
        while (true) {
            AbstractC0278e c3 = c();
            AbstractC0278e d3 = d();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1761f;
            do {
                obj = atomicReferenceFieldUpdater.get(d3);
            } while (!AbstractC0657b.a(atomicReferenceFieldUpdater, d3, obj, ((AbstractC0278e) obj) == null ? null : c3));
            if (c3 != null) {
                f1760e.set(c3, d3);
            }
            if (!d3.h() || d3.i()) {
                if (c3 == null || !c3.h()) {
                    return;
                }
            }
        }
    }

    public final boolean l(AbstractC0278e abstractC0278e) {
        return AbstractC0657b.a(f1760e, this, null, abstractC0278e);
    }
}
