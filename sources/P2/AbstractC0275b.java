package P2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p.AbstractC0657b;

/* renamed from: P2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0275b extends y {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1757a = AtomicReferenceFieldUpdater.newUpdater(AbstractC0275b.class, Object.class, "_consensus");
    private volatile Object _consensus = AbstractC0274a.f1756a;

    @Override // P2.y
    public final Object a(Object obj) {
        Object obj2 = f1757a.get(this);
        if (obj2 == AbstractC0274a.f1756a) {
            obj2 = c(d(obj));
        }
        b(obj, obj2);
        return obj2;
    }

    public abstract void b(Object obj, Object obj2);

    public final Object c(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1757a;
        Object obj2 = atomicReferenceFieldUpdater.get(this);
        Object obj3 = AbstractC0274a.f1756a;
        return obj2 != obj3 ? obj2 : AbstractC0657b.a(atomicReferenceFieldUpdater, this, obj3, obj) ? obj : atomicReferenceFieldUpdater.get(this);
    }

    public abstract Object d(Object obj);
}
