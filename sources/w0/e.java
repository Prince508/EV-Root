package w0;

import C2.u;
import android.util.Log;
import androidx.window.extensions.WindowExtensionsProvider;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f9922a = new e();

    /* renamed from: b, reason: collision with root package name */
    public static final String f9923b = u.b(e.class).b();

    public final int a() {
        try {
            return WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        } catch (NoClassDefFoundError unused) {
            if (c.f9914a.a() != j.LOG) {
                return 0;
            }
            Log.d(f9923b, "Embedding extension version not found");
            return 0;
        } catch (UnsupportedOperationException unused2) {
            if (c.f9914a.a() != j.LOG) {
                return 0;
            }
            Log.d(f9923b, "Stub Extension");
            return 0;
        }
    }
}
