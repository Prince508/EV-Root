package V;

/* loaded from: classes.dex */
public final class c extends n {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2198a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2199b;

    public c(Object obj, int i3) {
        super(null);
        this.f2198a = obj;
        this.f2199b = i3;
    }

    public final void a() {
        Object obj = this.f2198a;
        if (!((obj != null ? obj.hashCode() : 0) == this.f2199b)) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
        }
    }

    public final Object b() {
        return this.f2198a;
    }
}
