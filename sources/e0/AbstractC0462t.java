package e0;

/* renamed from: e0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0462t {

    /* renamed from: a, reason: collision with root package name */
    public static final o.g f6769a = new o.g();

    public static boolean b(ClassLoader classLoader, String str) {
        try {
            return AbstractComponentCallbacksC0459p.class.isAssignableFrom(c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static Class c(ClassLoader classLoader, String str) {
        o.g gVar = f6769a;
        o.g gVar2 = (o.g) gVar.get(classLoader);
        if (gVar2 == null) {
            gVar2 = new o.g();
            gVar.put(classLoader, gVar2);
        }
        Class cls = (Class) gVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        gVar2.put(str, cls2);
        return cls2;
    }

    public abstract AbstractComponentCallbacksC0459p a(ClassLoader classLoader, String str);
}
