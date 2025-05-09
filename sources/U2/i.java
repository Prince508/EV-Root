package u2;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f9645a = new i();

    /* renamed from: b, reason: collision with root package name */
    public static final a f9646b = new a(null, null, null);

    /* renamed from: c, reason: collision with root package name */
    public static a f9647c;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Method f9648a;

        /* renamed from: b, reason: collision with root package name */
        public final Method f9649b;

        /* renamed from: c, reason: collision with root package name */
        public final Method f9650c;

        public a(Method method, Method method2, Method method3) {
            this.f9648a = method;
            this.f9649b = method2;
            this.f9650c = method3;
        }
    }

    public final a a(AbstractC0748a abstractC0748a) {
        try {
            a aVar = new a(Class.class.getDeclaredMethod("getModule", new Class[0]), abstractC0748a.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), abstractC0748a.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            f9647c = aVar;
            return aVar;
        } catch (Exception unused) {
            a aVar2 = f9646b;
            f9647c = aVar2;
            return aVar2;
        }
    }

    public final String b(AbstractC0748a abstractC0748a) {
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        C2.k.e(abstractC0748a, "continuation");
        a aVar = f9647c;
        if (aVar == null) {
            aVar = a(abstractC0748a);
        }
        if (aVar != f9646b && (method = aVar.f9648a) != null && (invoke = method.invoke(abstractC0748a.getClass(), new Object[0])) != null && (method2 = aVar.f9649b) != null && (invoke2 = method2.invoke(invoke, new Object[0])) != null) {
            Method method3 = aVar.f9650c;
            Object invoke3 = method3 != null ? method3.invoke(invoke2, new Object[0]) : null;
            if (invoke3 instanceof String) {
                return (String) invoke3;
            }
        }
        return null;
    }
}
