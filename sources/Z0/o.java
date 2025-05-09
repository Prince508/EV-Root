package z0;

import K.C0205k0;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.WindowManager;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import r2.AbstractC0700m;

/* loaded from: classes.dex */
public final class o implements l {

    /* renamed from: b, reason: collision with root package name */
    public static final o f10303b = new o();

    /* renamed from: c, reason: collision with root package name */
    public static final String f10304c;

    /* renamed from: d, reason: collision with root package name */
    public static final ArrayList f10305d;

    static {
        String simpleName = o.class.getSimpleName();
        C2.k.d(simpleName, "WindowMetricsCalculatorC…at::class.java.simpleName");
        f10304c = simpleName;
        f10305d = AbstractC0700m.d(Integer.valueOf(C0205k0.m.g()), Integer.valueOf(C0205k0.m.f()), Integer.valueOf(C0205k0.m.a()), Integer.valueOf(C0205k0.m.c()), Integer.valueOf(C0205k0.m.i()), Integer.valueOf(C0205k0.m.e()), Integer.valueOf(C0205k0.m.j()), Integer.valueOf(C0205k0.m.b()));
    }

    @Override // z0.l
    public k b(Activity activity) {
        C2.k.e(activity, "activity");
        return e(activity);
    }

    public k c(Activity activity) {
        C0205k0 a3;
        C2.k.e(activity, "activity");
        int i3 = Build.VERSION.SDK_INT;
        Rect a4 = i3 >= 30 ? D0.g.f326a.a(activity) : i3 >= 29 ? h(activity) : i3 >= 28 ? g(activity) : f(activity);
        if (i3 >= 30) {
            a3 = i(activity);
        } else {
            a3 = new C0205k0.b().a();
            C2.k.d(a3, "{\n            WindowInse…ilder().build()\n        }");
        }
        return new k(new w0.b(a4), a3);
    }

    public k d(Context context) {
        C2.k.e(context, "context");
        if (Build.VERSION.SDK_INT >= 30) {
            return D0.g.f326a.c(context);
        }
        Context a3 = D0.b.f325a.a(context);
        if (a3 instanceof Activity) {
            return c((Activity) context);
        }
        if (!(a3 instanceof InputMethodService)) {
            throw new IllegalArgumentException(context + " is not a UiContext");
        }
        Object systemService = context.getSystemService("window");
        C2.k.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        C2.k.d(defaultDisplay, "wm.defaultDisplay");
        Point l3 = l(defaultDisplay);
        return new k(new Rect(0, 0, l3.x, l3.y), null, 2, null);
    }

    public k e(Context context) {
        Rect rect;
        C0205k0 a3;
        C2.k.e(context, "context");
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 30) {
            rect = D0.g.f326a.d(context);
        } else {
            Object systemService = context.getSystemService("window");
            C2.k.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            C2.k.d(defaultDisplay, "display");
            Point l3 = l(defaultDisplay);
            rect = new Rect(0, 0, l3.x, l3.y);
        }
        if (i3 >= 30) {
            a3 = i(context);
        } else {
            a3 = new C0205k0.b().a();
            C2.k.d(a3, "{\n            WindowInse…ilder().build()\n        }");
        }
        return new k(new w0.b(rect), a3);
    }

    public final Rect f(Activity activity) {
        C2.k.e(activity, "activity");
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!D0.a.f324a.a(activity)) {
            C2.k.d(defaultDisplay, "defaultDisplay");
            Point l3 = l(defaultDisplay);
            int k3 = k(activity);
            int i3 = rect.bottom;
            if (i3 + k3 == l3.y) {
                rect.bottom = i3 + k3;
                return rect;
            }
            int i4 = rect.right;
            if (i4 + k3 == l3.x) {
                rect.right = i4 + k3;
            }
        }
        return rect;
    }

    public final Rect g(Activity activity) {
        DisplayCutout j3;
        C2.k.e(activity, "activity");
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (D0.a.f324a.a(activity)) {
                Object invoke = obj.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj, new Object[0]);
                C2.k.c(invoke, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) invoke);
            } else {
                Object invoke2 = obj.getClass().getDeclaredMethod("getAppBounds", new Class[0]).invoke(obj, new Object[0]);
                C2.k.c(invoke2, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) invoke2);
            }
        } catch (IllegalAccessException e3) {
            Log.w(f10304c, e3);
            m(activity, rect);
        } catch (NoSuchFieldException e4) {
            Log.w(f10304c, e4);
            m(activity, rect);
        } catch (NoSuchMethodException e5) {
            Log.w(f10304c, e5);
            m(activity, rect);
        } catch (InvocationTargetException e6) {
            Log.w(f10304c, e6);
            m(activity, rect);
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        D0.h hVar = D0.h.f327a;
        C2.k.d(defaultDisplay, "currentDisplay");
        hVar.a(defaultDisplay, point);
        D0.a aVar = D0.a.f324a;
        if (!aVar.a(activity)) {
            int k3 = k(activity);
            int i3 = rect.bottom;
            if (i3 + k3 == point.y) {
                rect.bottom = i3 + k3;
            } else {
                int i4 = rect.right;
                if (i4 + k3 == point.x) {
                    rect.right = i4 + k3;
                } else if (rect.left == k3) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !aVar.a(activity) && (j3 = j(defaultDisplay)) != null) {
            int i5 = rect.left;
            D0.m mVar = D0.m.f328a;
            if (i5 == mVar.b(j3)) {
                rect.left = 0;
            }
            if (point.x - rect.right == mVar.c(j3)) {
                rect.right += mVar.c(j3);
            }
            if (rect.top == mVar.d(j3)) {
                rect.top = 0;
            }
            if (point.y - rect.bottom == mVar.a(j3)) {
                rect.bottom += mVar.a(j3);
            }
        }
        return rect;
    }

    public final Rect h(Activity activity) {
        C2.k.e(activity, "activity");
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object invoke = obj.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj, new Object[0]);
            C2.k.c(invoke, "null cannot be cast to non-null type android.graphics.Rect");
            return new Rect((Rect) invoke);
        } catch (IllegalAccessException e3) {
            Log.w(f10304c, e3);
            return g(activity);
        } catch (NoSuchFieldException e4) {
            Log.w(f10304c, e4);
            return g(activity);
        } catch (NoSuchMethodException e5) {
            Log.w(f10304c, e5);
            return g(activity);
        } catch (InvocationTargetException e6) {
            Log.w(f10304c, e6);
            return g(activity);
        }
    }

    public final C0205k0 i(Context context) {
        C2.k.e(context, "context");
        if (Build.VERSION.SDK_INT >= 30) {
            return D0.g.f326a.b(context);
        }
        throw new Exception("Incompatible SDK version");
    }

    public final DisplayCutout j(Display display) {
        try {
            Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(new Class[0]);
            constructor.setAccessible(true);
            Object newInstance = constructor.newInstance(new Object[0]);
            Method declaredMethod = display.getClass().getDeclaredMethod("getDisplayInfo", newInstance.getClass());
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(display, newInstance);
            Field declaredField = newInstance.getClass().getDeclaredField("displayCutout");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(newInstance);
            if (m.a(obj)) {
                return n.a(obj);
            }
            return null;
        } catch (ClassNotFoundException e3) {
            Log.w(f10304c, e3);
            return null;
        } catch (IllegalAccessException e4) {
            Log.w(f10304c, e4);
            return null;
        } catch (InstantiationException e5) {
            Log.w(f10304c, e5);
            return null;
        } catch (NoSuchFieldException e6) {
            Log.w(f10304c, e6);
            return null;
        } catch (NoSuchMethodException e7) {
            Log.w(f10304c, e7);
            return null;
        } catch (InvocationTargetException e8) {
            Log.w(f10304c, e8);
            return null;
        }
    }

    public final int k(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public final Point l(Display display) {
        C2.k.e(display, "display");
        Point point = new Point();
        D0.h.f327a.a(display, point);
        return point;
    }

    public final void m(Activity activity, Rect rect) {
        activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
    }
}
