package U1;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Process;
import android.util.ArraySet;
import android.util.Log;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class F {

    /* renamed from: a, reason: collision with root package name */
    public static int f2111a = -1;

    /* renamed from: b, reason: collision with root package name */
    public static Context f2112b;

    public static void a(String str, Throwable th) {
        Log.d(str, "", th);
    }

    public static void b(Throwable th) {
        a("LIBSU", th);
    }

    public static Context c() {
        if (f2112b == null) {
            try {
                f2112b = d((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, new Object[0]));
            } catch (Exception e3) {
                b(e3);
            }
        }
        return f2112b;
    }

    public static Context d(Context context) {
        while (context instanceof ContextWrapper) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return context;
    }

    public static Context e() {
        return c().createDeviceProtectedStorageContext();
    }

    public static synchronized Boolean f() {
        synchronized (F.class) {
            int i3 = f2111a;
            if (i3 >= 0) {
                if (i3 == 0) {
                    return Boolean.FALSE;
                }
                if (i3 != 2) {
                    return null;
                }
                return Boolean.TRUE;
            }
            if (Process.myUid() == 0) {
                f2111a = 2;
                return Boolean.TRUE;
            }
            for (String str : System.getenv("PATH").split(":")) {
                if (new File(str, "su").canExecute()) {
                    f2111a = 1;
                    return null;
                }
            }
            f2111a = 0;
            return Boolean.FALSE;
        }
    }

    public static boolean g() {
        return Process.is64Bit();
    }

    public static boolean h() {
        return Objects.equals(f(), Boolean.FALSE);
    }

    public static Set i() {
        return new ArraySet();
    }

    public static long j(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[65536];
        long j3 = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read <= 0) {
                return j3;
            }
            outputStream.write(bArr, 0, read);
            j3 += read;
        }
    }

    public static synchronized void k(boolean z3) {
        synchronized (F.class) {
            f2111a = z3 ? 2 : 0;
        }
    }
}
