package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0318d {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f3622a = a("libcore.io.Memory");

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f3623b;

    static {
        f3623b = a("org.robolectric.Robolectric") != null;
    }

    public static Class a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class b() {
        return f3622a;
    }

    public static boolean c() {
        return (f3622a == null || f3623b) ? false : true;
    }
}
