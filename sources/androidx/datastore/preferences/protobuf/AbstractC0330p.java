package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0330p {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC0328n f3759a = new C0329o();

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC0328n f3760b = c();

    public static AbstractC0328n a() {
        AbstractC0328n abstractC0328n = f3760b;
        if (abstractC0328n != null) {
            return abstractC0328n;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static AbstractC0328n b() {
        return f3759a;
    }

    public static AbstractC0328n c() {
        try {
            return (AbstractC0328n) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
