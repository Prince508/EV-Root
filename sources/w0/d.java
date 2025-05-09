package w0;

import android.app.Activity;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import q2.n;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ClassLoader f9916a;

    public static final class a implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        public final H2.b f9917a;

        /* renamed from: b, reason: collision with root package name */
        public final B2.l f9918b;

        public a(H2.b bVar, B2.l lVar) {
            C2.k.e(bVar, "clazz");
            C2.k.e(lVar, "consumer");
            this.f9917a = bVar;
            this.f9918b = lVar;
        }

        public final void a(Object obj) {
            C2.k.e(obj, "parameter");
            this.f9918b.j(obj);
        }

        public final boolean b(Method method, Object[] objArr) {
            return C2.k.a(method.getName(), "accept") && objArr != null && objArr.length == 1;
        }

        public final boolean c(Method method, Object[] objArr) {
            return C2.k.a(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1;
        }

        public final boolean d(Method method, Object[] objArr) {
            return C2.k.a(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null;
        }

        public final boolean e(Method method, Object[] objArr) {
            return C2.k.a(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            C2.k.e(obj, "obj");
            C2.k.e(method, "method");
            if (b(method, objArr)) {
                a(H2.c.a(this.f9917a, objArr != null ? objArr[0] : null));
                return n.f8874a;
            }
            if (c(method, objArr)) {
                return Boolean.valueOf(obj == (objArr != null ? objArr[0] : null));
            }
            if (d(method, objArr)) {
                return Integer.valueOf(this.f9918b.hashCode());
            }
            if (e(method, objArr)) {
                return this.f9918b.toString();
            }
            throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
        }
    }

    public interface b {
        void a();
    }

    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Method f9919a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f9920b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f9921c;

        public c(Method method, Object obj, Object obj2) {
            this.f9919a = method;
            this.f9920b = obj;
            this.f9921c = obj2;
        }

        @Override // w0.d.b
        public void a() {
            this.f9919a.invoke(this.f9920b, this.f9921c);
        }
    }

    public d(ClassLoader classLoader) {
        C2.k.e(classLoader, "loader");
        this.f9916a = classLoader;
    }

    public final Object a(H2.b bVar, B2.l lVar) {
        Object newProxyInstance = Proxy.newProxyInstance(this.f9916a, new Class[]{d()}, new a(bVar, lVar));
        C2.k.d(newProxyInstance, "newProxyInstance(loader,…onsumerClass()), handler)");
        return newProxyInstance;
    }

    public final Class b() {
        try {
            return d();
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public final b c(Object obj, H2.b bVar, String str, String str2, Activity activity, B2.l lVar) {
        C2.k.e(obj, "obj");
        C2.k.e(bVar, "clazz");
        C2.k.e(str, "addMethodName");
        C2.k.e(str2, "removeMethodName");
        C2.k.e(activity, "activity");
        C2.k.e(lVar, "consumer");
        Object a3 = a(bVar, lVar);
        obj.getClass().getMethod(str, Activity.class, d()).invoke(obj, activity, a3);
        return new c(obj.getClass().getMethod(str2, d()), obj, a3);
    }

    public final Class d() {
        Class<?> loadClass = this.f9916a.loadClass("java.util.function.Consumer");
        C2.k.d(loadClass, "loader.loadClass(\"java.util.function.Consumer\")");
        return loadClass;
    }
}
