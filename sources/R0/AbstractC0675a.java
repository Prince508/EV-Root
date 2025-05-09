package r0;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: r0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0675a {

    /* renamed from: a, reason: collision with root package name */
    public static long f8875a;

    /* renamed from: b, reason: collision with root package name */
    public static Method f8876b;

    /* renamed from: c, reason: collision with root package name */
    public static Method f8877c;

    /* renamed from: d, reason: collision with root package name */
    public static Method f8878d;

    public static void a(String str, int i3) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC0677c.a(j(str), i3);
        } else {
            b(j(str), i3);
        }
    }

    public static void b(String str, int i3) {
        try {
            if (f8877c == null) {
                f8877c = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
            }
            f8877c.invoke(null, Long.valueOf(f8875a), str, Integer.valueOf(i3));
        } catch (Exception e3) {
            g("asyncTraceBegin", e3);
        }
    }

    public static void c(String str) {
        AbstractC0676b.a(j(str));
    }

    public static void d(String str, int i3) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC0677c.b(j(str), i3);
        } else {
            e(j(str), i3);
        }
    }

    public static void e(String str, int i3) {
        try {
            if (f8878d == null) {
                f8878d = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            }
            f8878d.invoke(null, Long.valueOf(f8875a), str, Integer.valueOf(i3));
        } catch (Exception e3) {
            g("asyncTraceEnd", e3);
        }
    }

    public static void f() {
        AbstractC0676b.b();
    }

    public static void g(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static boolean h() {
        return Build.VERSION.SDK_INT >= 29 ? AbstractC0677c.c() : i();
    }

    public static boolean i() {
        try {
            if (f8876b == null) {
                f8875a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f8876b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f8876b.invoke(null, Long.valueOf(f8875a))).booleanValue();
        } catch (Exception e3) {
            g("isTagEnabled", e3);
            return false;
        }
    }

    public static String j(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }
}
