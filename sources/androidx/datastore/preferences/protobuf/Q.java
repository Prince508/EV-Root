package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public abstract class Q {

    /* renamed from: a, reason: collision with root package name */
    public static final O f3580a = c();

    /* renamed from: b, reason: collision with root package name */
    public static final O f3581b = new P();

    public static O a() {
        return f3580a;
    }

    public static O b() {
        return f3581b;
    }

    public static O c() {
        try {
            return (O) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
