package K2;

/* loaded from: classes.dex */
public final class Y implements InterfaceC0242k0 {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1180e;

    public Y(boolean z3) {
        this.f1180e = z3;
    }

    @Override // K2.InterfaceC0242k0
    public boolean d() {
        return this.f1180e;
    }

    @Override // K2.InterfaceC0242k0
    public A0 f() {
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        sb.append(d() ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
