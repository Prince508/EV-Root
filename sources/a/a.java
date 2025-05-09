package A;

import B.f;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import java.io.File;
import java.util.concurrent.Executor;
import z.h;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f0a = new Object();

    /* renamed from: A.a$a, reason: collision with other inner class name */
    public static class C0000a {
        public static File a(Context context) {
            return context.getCodeCacheDir();
        }

        public static Drawable b(Context context, int i3) {
            return context.getDrawable(i3);
        }

        public static File c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    public static class b {
        public static int a(Context context, int i3) {
            return context.getColor(i3);
        }

        public static <T> T b(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        public static String c(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    public static class c {
        public static Executor a(Context context) {
            return context.getMainExecutor();
        }
    }

    public static int a(Context context, String str) {
        J.c.c(str, "permission must be non-null");
        return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : h.b(context).a() ? 0 : -1;
    }

    public static int b(Context context, int i3) {
        return b.a(context, i3);
    }

    public static ColorStateList c(Context context, int i3) {
        return f.d(context.getResources(), i3, context.getTheme());
    }

    public static Drawable d(Context context, int i3) {
        return C0000a.b(context, i3);
    }

    public static Executor e(Context context) {
        return Build.VERSION.SDK_INT >= 28 ? c.a(context) : G.c.a(new Handler(context.getMainLooper()));
    }

    public static Object f(Context context, Class cls) {
        return b.b(context, cls);
    }
}
