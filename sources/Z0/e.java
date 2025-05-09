package z0;

import C2.u;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.lang.reflect.Method;
import v0.C0756a;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final ClassLoader f10273a;

    /* renamed from: b, reason: collision with root package name */
    public final w0.d f10274b;

    /* renamed from: c, reason: collision with root package name */
    public final C0756a f10275c;

    public static final class a extends C2.l implements B2.a {
        public a() {
            super(0);
        }

        @Override // B2.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean b() {
            Class f3 = e.this.f();
            boolean z3 = false;
            Method method = f3.getMethod("getBounds", new Class[0]);
            Method method2 = f3.getMethod("getType", new Class[0]);
            Method method3 = f3.getMethod("getState", new Class[0]);
            E0.a aVar = E0.a.f339a;
            C2.k.d(method, "getBoundsMethod");
            if (aVar.b(method, u.b(Rect.class)) && aVar.d(method)) {
                C2.k.d(method2, "getTypeMethod");
                Class cls = Integer.TYPE;
                if (aVar.b(method2, u.b(cls)) && aVar.d(method2)) {
                    C2.k.d(method3, "getStateMethod");
                    if (aVar.b(method3, u.b(cls)) && aVar.d(method3)) {
                        z3 = true;
                    }
                }
            }
            return Boolean.valueOf(z3);
        }
    }

    public static final class b extends C2.l implements B2.a {
        public b() {
            super(0);
        }

        @Override // B2.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean b() {
            boolean z3;
            Class b3 = e.this.f10274b.b();
            if (b3 == null) {
                return Boolean.FALSE;
            }
            Class h3 = e.this.h();
            Method method = h3.getMethod("addWindowLayoutInfoListener", Activity.class, b3);
            Method method2 = h3.getMethod("removeWindowLayoutInfoListener", b3);
            E0.a aVar = E0.a.f339a;
            C2.k.d(method, "addListenerMethod");
            if (aVar.d(method)) {
                C2.k.d(method2, "removeListenerMethod");
                if (aVar.d(method2)) {
                    z3 = true;
                    return Boolean.valueOf(z3);
                }
            }
            z3 = false;
            return Boolean.valueOf(z3);
        }
    }

    public static final class c extends C2.l implements B2.a {
        public c() {
            super(0);
        }

        @Override // B2.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean b() {
            boolean z3;
            Class h3 = e.this.h();
            Method method = h3.getMethod("addWindowLayoutInfoListener", Context.class, Consumer.class);
            Method method2 = h3.getMethod("removeWindowLayoutInfoListener", Consumer.class);
            E0.a aVar = E0.a.f339a;
            C2.k.d(method, "addListenerMethod");
            if (aVar.d(method)) {
                C2.k.d(method2, "removeListenerMethod");
                if (aVar.d(method2)) {
                    z3 = true;
                    return Boolean.valueOf(z3);
                }
            }
            z3 = false;
            return Boolean.valueOf(z3);
        }
    }

    public static final class d extends C2.l implements B2.a {
        public d() {
            super(0);
        }

        @Override // B2.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean b() {
            boolean z3 = false;
            Method method = e.this.f10275c.c().getMethod("getWindowLayoutComponent", new Class[0]);
            Class h3 = e.this.h();
            E0.a aVar = E0.a.f339a;
            C2.k.d(method, "getWindowLayoutComponentMethod");
            if (aVar.d(method) && aVar.c(method, h3)) {
                z3 = true;
            }
            return Boolean.valueOf(z3);
        }
    }

    public e(ClassLoader classLoader, w0.d dVar) {
        C2.k.e(classLoader, "loader");
        C2.k.e(dVar, "consumerAdapter");
        this.f10273a = classLoader;
        this.f10274b = dVar;
        this.f10275c = new C0756a(classLoader);
    }

    public final boolean e() {
        if (!n()) {
            return false;
        }
        int a3 = w0.e.f9922a.a();
        if (a3 == 1) {
            return i();
        }
        if (2 > a3 || a3 > Integer.MAX_VALUE) {
            return false;
        }
        return j();
    }

    public final Class f() {
        Class<?> loadClass = this.f10273a.loadClass("androidx.window.extensions.layout.FoldingFeature");
        C2.k.d(loadClass, "loader.loadClass(FOLDING_FEATURE_CLASS)");
        return loadClass;
    }

    public final WindowLayoutComponent g() {
        if (!e()) {
            return null;
        }
        try {
            return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    public final Class h() {
        Class<?> loadClass = this.f10273a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
        C2.k.d(loadClass, "loader.loadClass(WINDOW_LAYOUT_COMPONENT_CLASS)");
        return loadClass;
    }

    public final boolean i() {
        return l();
    }

    public final boolean j() {
        return i() && m();
    }

    public final boolean k() {
        return E0.a.e("FoldingFeature class is not valid", new a());
    }

    public final boolean l() {
        return E0.a.e("WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid", new b());
    }

    public final boolean m() {
        return E0.a.e("WindowLayoutComponent#addWindowLayoutInfoListener(" + Context.class.getName() + ", androidx.window.extensions.core.util.function.Consumer) is not valid", new c());
    }

    public final boolean n() {
        return this.f10275c.f() && o() && k();
    }

    public final boolean o() {
        return E0.a.e("WindowExtensions#getWindowLayoutComponent is not valid", new d());
    }
}
