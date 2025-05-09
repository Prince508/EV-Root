package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0326l {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f3712a = c();

    public static C0327m a() {
        if (f3712a != null) {
            try {
                return b("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return C0327m.f3752e;
    }

    public static final C0327m b(String str) {
        return (C0327m) f3712a.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
    }

    public static Class c() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
