package c2;

import android.app.ActivityManager;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.k;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import o2.AbstractC0651b;
import o2.C0654e;

/* renamed from: c2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0400d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4780a = false;

    /* renamed from: b, reason: collision with root package name */
    public c f4781b;

    /* renamed from: c, reason: collision with root package name */
    public long f4782c;

    /* renamed from: d, reason: collision with root package name */
    public C0398b f4783d;

    /* renamed from: e, reason: collision with root package name */
    public FlutterJNI f4784e;

    /* renamed from: f, reason: collision with root package name */
    public ExecutorService f4785f;

    /* renamed from: g, reason: collision with root package name */
    public Future f4786g;

    /* renamed from: c2.d$a */
    public class a implements Callable {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Context f4787e;

        public a(Context context) {
            this.f4787e = context;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b call() {
            C0654e f3 = C0654e.f("FlutterLoader initTask");
            try {
                C0400d.a(C0400d.this, this.f4787e);
                try {
                    C0400d.this.f4784e.loadLibrary();
                    C0400d.this.f4784e.updateRefreshRate();
                    C0400d.this.f4785f.execute(new Runnable() { // from class: c2.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            C0400d.this.f4784e.prefetchDefaultFontManager();
                        }
                    });
                    b bVar = new b(AbstractC0651b.d(this.f4787e), AbstractC0651b.a(this.f4787e), AbstractC0651b.c(this.f4787e), null);
                    if (f3 != null) {
                        f3.close();
                    }
                    return bVar;
                } catch (UnsatisfiedLinkError e3) {
                    if (!e3.toString().contains("couldn't find \"libflutter.so\"") && !e3.toString().contains("dlopen failed: library \"libflutter.so\" not found")) {
                        throw e3;
                    }
                    String property = System.getProperty("os.arch");
                    File file = new File(C0400d.this.f4783d.f4777f);
                    throw new UnsupportedOperationException("Could not load libflutter.so this is possibly because the application is running on an architecture that Flutter Android does not support (e.g. x86) see https://docs.flutter.dev/deployment/android#what-are-the-supported-target-architectures for more detail.\nApp is using cpu architecture: " + property + ", and the native libraries directory (with path " + file.getAbsolutePath() + ") contains the following files: " + Arrays.toString(file.list()), e3);
                }
            } catch (Throwable th) {
                if (f3 != null) {
                    try {
                        f3.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    /* renamed from: c2.d$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f4789a;

        /* renamed from: b, reason: collision with root package name */
        public final String f4790b;

        /* renamed from: c, reason: collision with root package name */
        public final String f4791c;

        public /* synthetic */ b(String str, String str2, String str3, a aVar) {
            this(str, str2, str3);
        }

        public b(String str, String str2, String str3) {
            this.f4789a = str;
            this.f4790b = str2;
            this.f4791c = str3;
        }
    }

    /* renamed from: c2.d$c */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public String f4792a;

        public String a() {
            return this.f4792a;
        }
    }

    public C0400d(FlutterJNI flutterJNI, ExecutorService executorService) {
        this.f4784e = flutterJNI;
        this.f4785f = executorService;
    }

    public static /* synthetic */ AbstractC0401e a(C0400d c0400d, Context context) {
        c0400d.j(context);
        return null;
    }

    public static boolean l(Bundle bundle) {
        if (bundle == null) {
            return true;
        }
        return bundle.getBoolean("io.flutter.embedding.android.LeakVM", true);
    }

    public boolean e() {
        return this.f4783d.f4778g;
    }

    public void f(Context context, String[] strArr) {
        Context context2;
        if (this.f4780a) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
        }
        if (this.f4781b == null) {
            throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
        }
        try {
            C0654e f3 = C0654e.f("FlutterLoader#ensureInitializationComplete");
            try {
                b bVar = (b) this.f4786g.get();
                ArrayList arrayList = new ArrayList();
                arrayList.add("--icu-symbol-prefix=_binary_icudtl_dat");
                StringBuilder sb = new StringBuilder();
                sb.append("--icu-native-lib-path=");
                sb.append(this.f4783d.f4777f);
                String str = File.separator;
                sb.append(str);
                sb.append("libflutter.so");
                arrayList.add(sb.toString());
                if (strArr != null) {
                    Collections.addAll(arrayList, strArr);
                }
                arrayList.add("--aot-shared-library-name=" + this.f4783d.f4772a);
                arrayList.add("--aot-shared-library-name=" + this.f4783d.f4777f + str + this.f4783d.f4772a);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("--cache-dir-path=");
                sb2.append(bVar.f4790b);
                arrayList.add(sb2.toString());
                if (this.f4783d.f4776e != null) {
                    arrayList.add("--domain-network-policy=" + this.f4783d.f4776e);
                }
                if (this.f4781b.a() != null) {
                    arrayList.add("--log-tag=" + this.f4781b.a());
                }
                Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                int i3 = bundle != null ? bundle.getInt("io.flutter.embedding.android.OldGenHeapSize") : 0;
                if (i3 == 0) {
                    context2 = context;
                    ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(new ActivityManager.MemoryInfo());
                    i3 = (int) ((r6.totalMem / 1000000.0d) / 2.0d);
                } else {
                    context2 = context;
                }
                arrayList.add("--old-gen-heap-size=" + i3);
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                arrayList.add("--resource-cache-max-bytes-threshold=" + (displayMetrics.widthPixels * displayMetrics.heightPixels * 48));
                arrayList.add("--prefetched-default-font-manager");
                if (bundle != null) {
                    if (bundle.getBoolean("io.flutter.embedding.android.EnableImpeller", false)) {
                        arrayList.add("--enable-impeller");
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.EnableVulkanValidation", false)) {
                        arrayList.add("--enable-vulkan-validation");
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.EnableOpenGLGPUTracing", false)) {
                        arrayList.add("--enable-opengl-gpu-tracing");
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.EnableVulkanGPUTracing", false)) {
                        arrayList.add("--enable-vulkan-gpu-tracing");
                    }
                    String string = bundle.getString("io.flutter.embedding.android.ImpellerBackend");
                    if (string != null) {
                        arrayList.add("--impeller-backend=" + string);
                    }
                }
                arrayList.add("--leak-vm=" + (l(bundle) ? "true" : "false"));
                this.f4784e.init(context2, (String[]) arrayList.toArray(new String[0]), null, bVar.f4789a, bVar.f4790b, SystemClock.uptimeMillis() - this.f4782c);
                this.f4780a = true;
                if (f3 != null) {
                    f3.close();
                }
            } finally {
            }
        } catch (Exception e3) {
            W1.b.c("FlutterLoader", "Flutter initialization failed.", e3);
            throw new RuntimeException(e3);
        }
    }

    public String g() {
        return this.f4783d.f4775d;
    }

    public final String h(String str) {
        return this.f4783d.f4775d + File.separator + str;
    }

    public String i(String str) {
        return h(str);
    }

    public final AbstractC0401e j(Context context) {
        return null;
    }

    public boolean k() {
        return this.f4780a;
    }

    public void m(Context context) {
        n(context, new c());
    }

    public void n(Context context, c cVar) {
        if (this.f4781b != null) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("startInitialization must be called on the main thread");
        }
        C0654e f3 = C0654e.f("FlutterLoader#startInitialization");
        try {
            Context applicationContext = context.getApplicationContext();
            this.f4781b = cVar;
            this.f4782c = SystemClock.uptimeMillis();
            this.f4783d = AbstractC0397a.e(applicationContext);
            k.f((DisplayManager) applicationContext.getSystemService("display"), this.f4784e).g();
            this.f4786g = this.f4785f.submit(new a(applicationContext));
            if (f3 != null) {
                f3.close();
            }
        } catch (Throwable th) {
            if (f3 != null) {
                try {
                    f3.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
