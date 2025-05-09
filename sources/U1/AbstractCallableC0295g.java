package U1;

import android.content.Context;
import android.content.ContextWrapper;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* renamed from: U1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractCallableC0295g extends ContextWrapper implements Callable {

    /* renamed from: e, reason: collision with root package name */
    public static final Method f2128e;

    /* renamed from: f, reason: collision with root package name */
    public static final Method f2129f;

    static {
        try {
            f2128e = Class.forName("android.os.ServiceManager").getDeclaredMethod("getService", String.class);
            Method declaredMethod = ContextWrapper.class.getDeclaredMethod("attachBaseContext", Context.class);
            f2129f = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (Exception e3) {
            throw new RuntimeException(e3);
        }
    }

    public static String a(String str) {
        return "libsu-" + str;
    }
}
