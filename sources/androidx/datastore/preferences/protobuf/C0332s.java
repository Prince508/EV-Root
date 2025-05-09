package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0332s implements I {

    /* renamed from: a, reason: collision with root package name */
    public static final C0332s f3834a = new C0332s();

    public static C0332s c() {
        return f3834a;
    }

    @Override // androidx.datastore.preferences.protobuf.I
    public boolean a(Class cls) {
        return AbstractC0333t.class.isAssignableFrom(cls);
    }

    @Override // androidx.datastore.preferences.protobuf.I
    public H b(Class cls) {
        if (!AbstractC0333t.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (H) AbstractC0333t.u(cls.asSubclass(AbstractC0333t.class)).n();
        } catch (Exception e3) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e3);
        }
    }
}
