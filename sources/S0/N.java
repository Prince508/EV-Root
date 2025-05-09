package s0;

import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public class N extends L {

    /* renamed from: g, reason: collision with root package name */
    public static boolean f9116g = true;

    public static class a {
        public static void a(View view, int i3) {
            view.setTransitionVisibility(i3);
        }
    }

    @Override // s0.F
    public void f(View view, int i3) {
        if (Build.VERSION.SDK_INT == 28) {
            super.f(view, i3);
        } else if (f9116g) {
            try {
                a.a(view, i3);
            } catch (NoSuchMethodError unused) {
                f9116g = false;
            }
        }
    }
}
