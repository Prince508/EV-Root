package K2;

/* loaded from: classes.dex */
public abstract class x0 {

    /* renamed from: a, reason: collision with root package name */
    public static final P2.F f1231a = new P2.F("COMPLETING_ALREADY");

    /* renamed from: b, reason: collision with root package name */
    public static final P2.F f1232b = new P2.F("COMPLETING_WAITING_CHILDREN");

    /* renamed from: c, reason: collision with root package name */
    public static final P2.F f1233c = new P2.F("COMPLETING_RETRY");

    /* renamed from: d, reason: collision with root package name */
    public static final P2.F f1234d = new P2.F("TOO_LATE_TO_CANCEL");

    /* renamed from: e, reason: collision with root package name */
    public static final P2.F f1235e = new P2.F("SEALED");

    /* renamed from: f, reason: collision with root package name */
    public static final Y f1236f = new Y(false);

    /* renamed from: g, reason: collision with root package name */
    public static final Y f1237g = new Y(true);

    public static final Object g(Object obj) {
        return obj instanceof InterfaceC0242k0 ? new C0244l0((InterfaceC0242k0) obj) : obj;
    }

    public static final Object h(Object obj) {
        InterfaceC0242k0 interfaceC0242k0;
        C0244l0 c0244l0 = obj instanceof C0244l0 ? (C0244l0) obj : null;
        return (c0244l0 == null || (interfaceC0242k0 = c0244l0.f1199a) == null) ? obj : interfaceC0242k0;
    }
}
