package s0;

import android.view.View;

/* loaded from: classes.dex */
public abstract class L extends J {

    /* renamed from: f, reason: collision with root package name */
    public static boolean f9115f = true;

    public static class a {
        public static void a(View view, int i3, int i4, int i5, int i6) {
            view.setLeftTopRightBottom(i3, i4, i5, i6);
        }
    }

    @Override // s0.F
    public void d(View view, int i3, int i4, int i5, int i6) {
        if (f9115f) {
            try {
                a.a(view, i3, i4, i5, i6);
            } catch (NoSuchMethodError unused) {
                f9115f = false;
            }
        }
    }
}
