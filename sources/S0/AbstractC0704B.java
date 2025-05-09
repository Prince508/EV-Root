package s0;

import android.os.Build;
import android.view.ViewGroup;

/* renamed from: s0.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0704B {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f9106a = true;

    /* renamed from: s0.B$a */
    public static class a {
        public static int a(ViewGroup viewGroup, int i3) {
            return viewGroup.getChildDrawingOrder(i3);
        }

        public static void b(ViewGroup viewGroup, boolean z3) {
            viewGroup.suppressLayout(z3);
        }
    }

    public static void a(ViewGroup viewGroup, boolean z3) {
        if (f9106a) {
            try {
                a.b(viewGroup, z3);
            } catch (NoSuchMethodError unused) {
                f9106a = false;
            }
        }
    }

    public static void b(ViewGroup viewGroup, boolean z3) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.b(viewGroup, z3);
        } else {
            a(viewGroup, z3);
        }
    }
}
