package U1;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.IBinder;
import java.lang.reflect.Method;

/* renamed from: U1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0292d {

    /* renamed from: a, reason: collision with root package name */
    public static Method f2120a;

    /* renamed from: b, reason: collision with root package name */
    public static Method f2121b;

    /* renamed from: c, reason: collision with root package name */
    public static Method f2122c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f2123d;

    static {
        int i3 = Build.VERSION.SDK_INT;
        f2123d = i3 >= 26 ? 4194304 : 0;
        try {
            Class<?> cls = Class.forName("android.os.ServiceManager");
            Class cls2 = Integer.TYPE;
            if (i3 >= 28) {
                try {
                    f2120a = cls.getDeclaredMethod("addService", String.class, IBinder.class, Boolean.TYPE, cls2);
                } catch (NoSuchMethodException unused) {
                }
            }
            if (f2120a == null) {
                f2120a = cls.getDeclaredMethod("addService", String.class, IBinder.class);
            }
            Method declaredMethod = ContextWrapper.class.getDeclaredMethod("attachBaseContext", Context.class);
            f2121b = declaredMethod;
            declaredMethod.setAccessible(true);
            f2122c = Class.forName("android.ddm.DdmHandleAppName").getDeclaredMethod("setAppName", String.class, cls2);
        } catch (ReflectiveOperationException e3) {
            F.a("IPC", e3);
        }
    }

    public static void a(String str, IBinder iBinder) {
        try {
            if (f2120a.getParameterTypes().length == 4) {
                f2120a.invoke(null, str, iBinder, Boolean.FALSE, 0);
            } else {
                f2120a.invoke(null, str, iBinder);
            }
        } catch (ReflectiveOperationException e3) {
            F.a("IPC", e3);
        }
    }

    public static void b(Object obj, Context context) {
        if (obj instanceof ContextWrapper) {
            try {
                f2121b.invoke(obj, context);
            } catch (ReflectiveOperationException unused) {
            }
        }
    }

    public static void c(String str) {
        try {
            f2122c.invoke(null, str, 0);
        } catch (ReflectiveOperationException e3) {
            throw new RuntimeException(e3);
        }
    }
}
