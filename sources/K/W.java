package K;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public abstract class W {

    public static class a {
        public static void a(Window window, boolean z3) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z3 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    public static class b {
        public static void a(Window window, boolean z3) {
            window.setDecorFitsSystemWindows(z3);
        }
    }

    public static J0 a(Window window, View view) {
        return new J0(window, view);
    }

    public static void b(Window window, boolean z3) {
        if (Build.VERSION.SDK_INT >= 30) {
            b.a(window, z3);
        } else {
            a.a(window, z3);
        }
    }
}
