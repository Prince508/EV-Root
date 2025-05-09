package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
public final class U {

    /* renamed from: c, reason: collision with root package name */
    public static final U f3585c = new U();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentMap f3587b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Z f3586a = new B();

    public static U a() {
        return f3585c;
    }

    public Y b(Class cls, Y y3) {
        AbstractC0334u.b(cls, "messageType");
        AbstractC0334u.b(y3, "schema");
        return (Y) this.f3587b.putIfAbsent(cls, y3);
    }

    public Y c(Class cls) {
        Y b3;
        AbstractC0334u.b(cls, "messageType");
        Y y3 = (Y) this.f3587b.get(cls);
        return (y3 != null || (b3 = b(cls, (y3 = this.f3586a.a(cls)))) == null) ? y3 : b3;
    }

    public Y d(Object obj) {
        return c(obj.getClass());
    }
}
