package s0;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes.dex */
public abstract class J extends F {

    /* renamed from: d, reason: collision with root package name */
    public static boolean f9113d = true;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f9114e = true;

    public static class a {
        public static void a(View view, Matrix matrix) {
            view.setAnimationMatrix(matrix);
        }

        public static void b(View view, Matrix matrix) {
            view.transformMatrixToGlobal(matrix);
        }

        public static void c(View view, Matrix matrix) {
            view.transformMatrixToLocal(matrix);
        }
    }

    @Override // s0.F
    public void g(View view, Matrix matrix) {
        if (f9113d) {
            try {
                a.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f9113d = false;
            }
        }
    }

    @Override // s0.F
    public void h(View view, Matrix matrix) {
        if (f9114e) {
            try {
                a.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f9114e = false;
            }
        }
    }
}
