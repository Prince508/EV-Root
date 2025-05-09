package G;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static long f568a;

    /* renamed from: b, reason: collision with root package name */
    public static Method f569b;

    /* renamed from: c, reason: collision with root package name */
    public static Method f570c;

    /* renamed from: d, reason: collision with root package name */
    public static Method f571d;

    /* renamed from: e, reason: collision with root package name */
    public static Method f572e;

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f568a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f569b = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                f570c = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                f571d = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f572e = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e3) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e3);
            }
        }
    }

    public static void a(String str) {
        Trace.beginSection(str);
    }

    public static void b() {
        Trace.endSection();
    }
}
