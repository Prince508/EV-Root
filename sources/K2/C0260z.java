package K2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: K2.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0260z {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1244b = AtomicIntegerFieldUpdater.newUpdater(C0260z.class, "_handled");
    private volatile int _handled;

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f1245a;

    public C0260z(Throwable th, boolean z3) {
        this.f1245a = th;
        this._handled = z3 ? 1 : 0;
    }

    public final boolean a() {
        return f1244b.get(this) != 0;
    }

    public final boolean b() {
        return f1244b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return M.a(this) + '[' + this.f1245a + ']';
    }

    public /* synthetic */ C0260z(Throwable th, boolean z3, int i3, C2.g gVar) {
        this(th, (i3 & 2) != 0 ? false : z3);
    }
}
