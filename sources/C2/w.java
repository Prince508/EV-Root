package C2;

import q2.InterfaceC0673b;

/* loaded from: classes.dex */
public abstract class w {
    public static Object a(Object obj, int i3) {
        if (obj != null && !c(obj, i3)) {
            f(obj, "kotlin.jvm.functions.Function" + i3);
        }
        return obj;
    }

    public static int b(Object obj) {
        if (obj instanceof h) {
            return ((h) obj).e();
        }
        if (obj instanceof B2.a) {
            return 0;
        }
        if (obj instanceof B2.l) {
            return 1;
        }
        if (obj instanceof B2.p) {
            return 2;
        }
        return obj instanceof B2.q ? 3 : -1;
    }

    public static boolean c(Object obj, int i3) {
        return (obj instanceof InterfaceC0673b) && b(obj) == i3;
    }

    public static Throwable d(Throwable th) {
        return k.i(th, w.class.getName());
    }

    public static ClassCastException e(ClassCastException classCastException) {
        throw ((ClassCastException) d(classCastException));
    }

    public static void f(Object obj, String str) {
        g((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
    }

    public static void g(String str) {
        throw e(new ClassCastException(str));
    }
}
