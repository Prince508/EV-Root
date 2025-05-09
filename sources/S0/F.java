package s0;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public abstract class F {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f9110a = true;

    /* renamed from: b, reason: collision with root package name */
    public static Field f9111b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f9112c;

    public static class a {
        public static float a(View view) {
            float transitionAlpha;
            transitionAlpha = view.getTransitionAlpha();
            return transitionAlpha;
        }

        public static void b(View view, float f3) {
            view.setTransitionAlpha(f3);
        }
    }

    public float b(View view) {
        if (f9110a) {
            try {
                return a.a(view);
            } catch (NoSuchMethodError unused) {
                f9110a = false;
            }
        }
        return view.getAlpha();
    }

    public abstract void d(View view, int i3, int i4, int i5, int i6);

    public void e(View view, float f3) {
        if (f9110a) {
            try {
                a.b(view, f3);
                return;
            } catch (NoSuchMethodError unused) {
                f9110a = false;
            }
        }
        view.setAlpha(f3);
    }

    public void f(View view, int i3) {
        if (!f9112c) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f9111b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f9112c = true;
        }
        Field field = f9111b;
        if (field != null) {
            try {
                f9111b.setInt(view, i3 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public abstract void g(View view, Matrix matrix);

    public abstract void h(View view, Matrix matrix);

    public void a(View view) {
    }

    public void c(View view) {
    }
}
