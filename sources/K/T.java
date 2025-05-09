package K;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.view.InputDevice;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class T {

    /* renamed from: a, reason: collision with root package name */
    public static Method f967a;

    public static class a {
        public static float a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHorizontalScrollFactor();
        }

        public static float b(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledVerticalScrollFactor();
        }
    }

    public static class b {
        public static int a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHoverSlop();
        }

        public static boolean b(ViewConfiguration viewConfiguration) {
            return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
        }
    }

    public static class c {
        public static int a(ViewConfiguration viewConfiguration, int i3, int i4, int i5) {
            return viewConfiguration.getScaledMaximumFlingVelocity(i3, i4, i5);
        }

        public static int b(ViewConfiguration viewConfiguration, int i3, int i4, int i5) {
            return viewConfiguration.getScaledMinimumFlingVelocity(i3, i4, i5);
        }
    }

    static {
        if (Build.VERSION.SDK_INT == 25) {
            try {
                f967a = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", new Class[0]);
            } catch (Exception unused) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
    }

    public static int a(Resources resources, int i3, J.h hVar, int i4) {
        int dimensionPixelSize;
        return i3 != -1 ? (i3 == 0 || (dimensionPixelSize = resources.getDimensionPixelSize(i3)) < 0) ? i4 : dimensionPixelSize : ((Integer) hVar.get()).intValue();
    }

    public static float b(ViewConfiguration viewConfiguration, Context context) {
        Method method;
        if (Build.VERSION.SDK_INT >= 25 && (method = f967a) != null) {
            try {
                return ((Integer) method.invoke(viewConfiguration, new Object[0])).intValue();
            } catch (Exception unused) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
            return typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }

    public static int c(Resources resources, String str, String str2) {
        return resources.getIdentifier(str, str2, "android");
    }

    public static int d(Resources resources, int i3, int i4) {
        if (i3 == 4194304 && i4 == 26) {
            return c(resources, "config_viewMaxRotaryEncoderFlingVelocity", "dimen");
        }
        return -1;
    }

    public static int e(Resources resources, int i3, int i4) {
        if (i3 == 4194304 && i4 == 26) {
            return c(resources, "config_viewMinRotaryEncoderFlingVelocity", "dimen");
        }
        return -1;
    }

    public static float f(ViewConfiguration viewConfiguration, Context context) {
        return Build.VERSION.SDK_INT >= 26 ? a.a(viewConfiguration) : b(viewConfiguration, context);
    }

    public static int g(ViewConfiguration viewConfiguration) {
        return Build.VERSION.SDK_INT >= 28 ? b.a(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
    }

    public static int h(Context context, final ViewConfiguration viewConfiguration, int i3, int i4, int i5) {
        if (Build.VERSION.SDK_INT >= 34) {
            return c.a(viewConfiguration, i3, i4, i5);
        }
        if (!k(i3, i4, i5)) {
            return Integer.MIN_VALUE;
        }
        Resources resources = context.getResources();
        int d3 = d(resources, i5, i4);
        Objects.requireNonNull(viewConfiguration);
        return a(resources, d3, new J.h() { // from class: K.Q
            @Override // J.h
            public final Object get() {
                return Integer.valueOf(viewConfiguration.getScaledMaximumFlingVelocity());
            }
        }, Integer.MIN_VALUE);
    }

    public static int i(Context context, final ViewConfiguration viewConfiguration, int i3, int i4, int i5) {
        if (Build.VERSION.SDK_INT >= 34) {
            return c.b(viewConfiguration, i3, i4, i5);
        }
        if (!k(i3, i4, i5)) {
            return Integer.MAX_VALUE;
        }
        Resources resources = context.getResources();
        int e3 = e(resources, i5, i4);
        Objects.requireNonNull(viewConfiguration);
        return a(resources, e3, new J.h() { // from class: K.S
            @Override // J.h
            public final Object get() {
                return Integer.valueOf(viewConfiguration.getScaledMinimumFlingVelocity());
            }
        }, Integer.MAX_VALUE);
    }

    public static float j(ViewConfiguration viewConfiguration, Context context) {
        return Build.VERSION.SDK_INT >= 26 ? a.b(viewConfiguration) : b(viewConfiguration, context);
    }

    public static boolean k(int i3, int i4, int i5) {
        InputDevice device = InputDevice.getDevice(i3);
        return (device == null || device.getMotionRange(i4, i5) == null) ? false : true;
    }

    public static boolean l(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return b.b(viewConfiguration);
        }
        Resources resources = context.getResources();
        int c3 = c(resources, "config_showMenuShortcutsWhenKeyboardPresent", "bool");
        return c3 != 0 && resources.getBoolean(c3);
    }
}
