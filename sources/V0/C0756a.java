package v0;

import C2.k;
import C2.l;
import java.lang.reflect.Method;

/* renamed from: v0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0756a {

    /* renamed from: a, reason: collision with root package name */
    public final ClassLoader f9872a;

    /* renamed from: v0.a$a, reason: collision with other inner class name */
    public static final class C0161a extends l implements B2.a {
        public C0161a() {
            super(0);
        }

        @Override // B2.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Class b() {
            Class<?> loadClass = C0756a.this.f9872a.loadClass("androidx.window.extensions.WindowExtensionsProvider");
            k.d(loadClass, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
            return loadClass;
        }
    }

    /* renamed from: v0.a$b */
    public static final class b extends l implements B2.a {
        public b() {
            super(0);
        }

        @Override // B2.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean b() {
            boolean z3 = false;
            Method declaredMethod = C0756a.this.d().getDeclaredMethod("getWindowExtensions", new Class[0]);
            Class c3 = C0756a.this.c();
            E0.a aVar = E0.a.f339a;
            k.d(declaredMethod, "getWindowExtensionsMethod");
            if (aVar.c(declaredMethod, c3) && aVar.d(declaredMethod)) {
                z3 = true;
            }
            return Boolean.valueOf(z3);
        }
    }

    public C0756a(ClassLoader classLoader) {
        k.e(classLoader, "loader");
        this.f9872a = classLoader;
    }

    public final Class c() {
        Class<?> loadClass = this.f9872a.loadClass("androidx.window.extensions.WindowExtensions");
        k.d(loadClass, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
        return loadClass;
    }

    public final Class d() {
        Class<?> loadClass = this.f9872a.loadClass("androidx.window.extensions.WindowExtensionsProvider");
        k.d(loadClass, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
        return loadClass;
    }

    public final boolean e() {
        return E0.a.f339a.a(new C0161a());
    }

    public final boolean f() {
        return e() && E0.a.e("WindowExtensionsProvider#getWindowExtensions is not valid", new b());
    }
}
