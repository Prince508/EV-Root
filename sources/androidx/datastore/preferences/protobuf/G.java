package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public abstract class G {

    /* renamed from: a, reason: collision with root package name */
    public static final E f3555a = c();

    /* renamed from: b, reason: collision with root package name */
    public static final E f3556b = new F();

    public static E a() {
        return f3555a;
    }

    public static E b() {
        return f3556b;
    }

    public static E c() {
        try {
            return (E) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
