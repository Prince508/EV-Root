package D0;

import K.C0205k0;
import android.content.Context;
import android.graphics.Rect;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f326a = new g();

    public final Rect a(Context context) {
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        C2.k.e(context, "context");
        currentWindowMetrics = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics();
        bounds = currentWindowMetrics.getBounds();
        C2.k.d(bounds, "wm.currentWindowMetrics.bounds");
        return bounds;
    }

    public final C0205k0 b(Context context) {
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        C2.k.e(context, "context");
        currentWindowMetrics = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics();
        windowInsets = currentWindowMetrics.getWindowInsets();
        C2.k.d(windowInsets, "context.getSystemService…indowMetrics.windowInsets");
        C0205k0 t3 = C0205k0.t(windowInsets);
        C2.k.d(t3, "toWindowInsetsCompat(platformInsets)");
        return t3;
    }

    public final z0.k c(Context context) {
        WindowMetrics currentWindowMetrics;
        WindowInsets windowInsets;
        WindowMetrics currentWindowMetrics2;
        Rect bounds;
        C2.k.e(context, "context");
        WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        currentWindowMetrics = windowManager.getCurrentWindowMetrics();
        windowInsets = currentWindowMetrics.getWindowInsets();
        C0205k0 t3 = C0205k0.t(windowInsets);
        C2.k.d(t3, "toWindowInsetsCompat(wm.…ndowMetrics.windowInsets)");
        currentWindowMetrics2 = windowManager.getCurrentWindowMetrics();
        bounds = currentWindowMetrics2.getBounds();
        C2.k.d(bounds, "wm.currentWindowMetrics.bounds");
        return new z0.k(bounds, t3);
    }

    public final Rect d(Context context) {
        WindowMetrics maximumWindowMetrics;
        Rect bounds;
        C2.k.e(context, "context");
        maximumWindowMetrics = ((WindowManager) context.getSystemService(WindowManager.class)).getMaximumWindowMetrics();
        bounds = maximumWindowMetrics.getBounds();
        C2.k.d(bounds, "wm.maximumWindowMetrics.bounds");
        return bounds;
    }
}
