package W1;

import android.util.Log;

/* loaded from: classes.dex */
public abstract class b {
    public static void b(String str, String str2) {
        Log.e(str, str2);
    }

    public static void c(String str, String str2, Throwable th) {
        Log.e(str, str2, th);
    }

    public static String d(Throwable th) {
        return Log.getStackTraceString(th);
    }

    public static void g(String str, String str2) {
        Log.w(str, str2);
    }

    public static void h(String str, String str2, Throwable th) {
        Log.w(str, str2, th);
    }

    public static void a(String str, String str2) {
    }

    public static void e(String str, String str2) {
    }

    public static void f(String str, String str2) {
    }
}
