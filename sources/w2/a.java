package w2;

import C2.k;
import java.lang.reflect.Method;
import r2.AbstractC0697j;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: w2.a$a, reason: collision with other inner class name */
    public static final class C0163a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0163a f9963a = new C0163a();

        /* renamed from: b, reason: collision with root package name */
        public static final Method f9964b;

        /* renamed from: c, reason: collision with root package name */
        public static final Method f9965c;

        static {
            Method method;
            Method method2;
            Method[] methods = Throwable.class.getMethods();
            k.b(methods);
            int length = methods.length;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                method = null;
                if (i4 >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i4];
                if (k.a(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    k.d(parameterTypes, "getParameterTypes(...)");
                    if (k.a(AbstractC0697j.l(parameterTypes), Throwable.class)) {
                        break;
                    }
                }
                i4++;
            }
            f9964b = method2;
            int length2 = methods.length;
            while (true) {
                if (i3 >= length2) {
                    break;
                }
                Method method3 = methods[i3];
                if (k.a(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
                i3++;
            }
            f9965c = method;
        }
    }

    public void a(Throwable th, Throwable th2) {
        k.e(th, "cause");
        k.e(th2, "exception");
        Method method = C0163a.f9964b;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    public E2.c b() {
        return new E2.b();
    }
}
