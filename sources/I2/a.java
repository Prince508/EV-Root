package I2;

import C2.k;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f832a;

    public a(b bVar) {
        k.e(bVar, "sequence");
        this.f832a = new AtomicReference(bVar);
    }

    @Override // I2.b
    public Iterator iterator() {
        b bVar = (b) this.f832a.getAndSet(null);
        if (bVar != null) {
            return bVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
