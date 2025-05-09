package C2;

/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final v f322a;

    /* renamed from: b, reason: collision with root package name */
    public static final H2.b[] f323b;

    static {
        v vVar = null;
        try {
            vVar = (v) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (vVar == null) {
            vVar = new v();
        }
        f322a = vVar;
        f323b = new H2.b[0];
    }

    public static H2.e a(i iVar) {
        return f322a.a(iVar);
    }

    public static H2.b b(Class cls) {
        return f322a.b(cls);
    }

    public static H2.d c(Class cls) {
        return f322a.c(cls, "");
    }

    public static H2.f d(n nVar) {
        return f322a.d(nVar);
    }

    public static H2.g e(p pVar) {
        return f322a.e(pVar);
    }

    public static String f(h hVar) {
        return f322a.f(hVar);
    }

    public static String g(l lVar) {
        return f322a.g(lVar);
    }
}
