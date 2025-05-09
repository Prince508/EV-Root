package K;

import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* renamed from: K.k0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0205k0 {

    /* renamed from: b, reason: collision with root package name */
    public static final C0205k0 f1019b;

    /* renamed from: a, reason: collision with root package name */
    public final l f1020a;

    /* renamed from: K.k0$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static Field f1021a;

        /* renamed from: b, reason: collision with root package name */
        public static Field f1022b;

        /* renamed from: c, reason: collision with root package name */
        public static Field f1023c;

        /* renamed from: d, reason: collision with root package name */
        public static boolean f1024d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f1021a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f1022b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f1023c = declaredField3;
                declaredField3.setAccessible(true);
                f1024d = true;
            } catch (ReflectiveOperationException e3) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e3.getMessage(), e3);
            }
        }

        public static C0205k0 a(View view) {
            if (f1024d && view.isAttachedToWindow()) {
                try {
                    Object obj = f1021a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f1022b.get(obj);
                        Rect rect2 = (Rect) f1023c.get(obj);
                        if (rect != null && rect2 != null) {
                            C0205k0 a3 = new b().c(C.b.c(rect)).d(C.b.c(rect2)).a();
                            a3.q(a3);
                            a3.d(view.getRootView());
                            return a3;
                        }
                    }
                } catch (IllegalAccessException e3) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e3.getMessage(), e3);
                }
            }
            return null;
        }
    }

    /* renamed from: K.k0$e */
    public static class e extends d {
        public e() {
        }

        @Override // K.C0205k0.f
        public void c(int i3, C.b bVar) {
            this.f1032c.setInsets(n.a(i3), bVar.e());
        }

        public e(C0205k0 c0205k0) {
            super(c0205k0);
        }
    }

    /* renamed from: K.k0$f */
    public static class f {

        /* renamed from: a, reason: collision with root package name */
        public final C0205k0 f1033a;

        /* renamed from: b, reason: collision with root package name */
        public C.b[] f1034b;

        public f() {
            this(new C0205k0((C0205k0) null));
        }

        public final void a() {
            C.b[] bVarArr = this.f1034b;
            if (bVarArr != null) {
                C.b bVar = bVarArr[m.d(1)];
                C.b bVar2 = this.f1034b[m.d(2)];
                if (bVar2 == null) {
                    bVar2 = this.f1033a.f(2);
                }
                if (bVar == null) {
                    bVar = this.f1033a.f(1);
                }
                g(C.b.a(bVar, bVar2));
                C.b bVar3 = this.f1034b[m.d(16)];
                if (bVar3 != null) {
                    f(bVar3);
                }
                C.b bVar4 = this.f1034b[m.d(32)];
                if (bVar4 != null) {
                    d(bVar4);
                }
                C.b bVar5 = this.f1034b[m.d(64)];
                if (bVar5 != null) {
                    h(bVar5);
                }
            }
        }

        public abstract C0205k0 b();

        public void c(int i3, C.b bVar) {
            if (this.f1034b == null) {
                this.f1034b = new C.b[9];
            }
            for (int i4 = 1; i4 <= 256; i4 <<= 1) {
                if ((i3 & i4) != 0) {
                    this.f1034b[m.d(i4)] = bVar;
                }
            }
        }

        public abstract void e(C.b bVar);

        public abstract void g(C.b bVar);

        public f(C0205k0 c0205k0) {
            this.f1033a = c0205k0;
        }

        public void d(C.b bVar) {
        }

        public void f(C.b bVar) {
        }

        public void h(C.b bVar) {
        }
    }

    /* renamed from: K.k0$i */
    public static class i extends h {
        public i(C0205k0 c0205k0, WindowInsets windowInsets) {
            super(c0205k0, windowInsets);
        }

        @Override // K.C0205k0.l
        public C0205k0 a() {
            WindowInsets consumeDisplayCutout;
            consumeDisplayCutout = this.f1040c.consumeDisplayCutout();
            return C0205k0.t(consumeDisplayCutout);
        }

        @Override // K.C0205k0.g, K.C0205k0.l
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Objects.equals(this.f1040c, iVar.f1040c) && Objects.equals(this.f1044g, iVar.f1044g);
        }

        @Override // K.C0205k0.l
        public r f() {
            DisplayCutout displayCutout;
            displayCutout = this.f1040c.getDisplayCutout();
            return r.e(displayCutout);
        }

        @Override // K.C0205k0.l
        public int hashCode() {
            return this.f1040c.hashCode();
        }

        public i(C0205k0 c0205k0, i iVar) {
            super(c0205k0, iVar);
        }
    }

    /* renamed from: K.k0$k */
    public static class k extends j {

        /* renamed from: q, reason: collision with root package name */
        public static final C0205k0 f1049q;

        static {
            WindowInsets windowInsets;
            windowInsets = WindowInsets.CONSUMED;
            f1049q = C0205k0.t(windowInsets);
        }

        public k(C0205k0 c0205k0, WindowInsets windowInsets) {
            super(c0205k0, windowInsets);
        }

        @Override // K.C0205k0.g, K.C0205k0.l
        public C.b g(int i3) {
            Insets insets;
            insets = this.f1040c.getInsets(n.a(i3));
            return C.b.d(insets);
        }

        public k(C0205k0 c0205k0, k kVar) {
            super(c0205k0, kVar);
        }

        @Override // K.C0205k0.g, K.C0205k0.l
        public final void d(View view) {
        }
    }

    /* renamed from: K.k0$m */
    public static final class m {
        public static int a() {
            return 4;
        }

        public static int b() {
            return 128;
        }

        public static int c() {
            return 8;
        }

        public static int d(int i3) {
            if (i3 == 1) {
                return 0;
            }
            if (i3 == 2) {
                return 1;
            }
            if (i3 == 4) {
                return 2;
            }
            if (i3 == 8) {
                return 3;
            }
            if (i3 == 16) {
                return 4;
            }
            if (i3 == 32) {
                return 5;
            }
            if (i3 == 64) {
                return 6;
            }
            if (i3 == 128) {
                return 7;
            }
            if (i3 == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i3);
        }

        public static int e() {
            return 32;
        }

        public static int f() {
            return 2;
        }

        public static int g() {
            return 1;
        }

        public static int h() {
            return 7;
        }

        public static int i() {
            return 16;
        }

        public static int j() {
            return 64;
        }
    }

    /* renamed from: K.k0$n */
    public static final class n {
        public static int a(int i3) {
            int statusBars;
            int i4 = 0;
            for (int i5 = 1; i5 <= 256; i5 <<= 1) {
                if ((i3 & i5) != 0) {
                    if (i5 == 1) {
                        statusBars = WindowInsets.Type.statusBars();
                    } else if (i5 == 2) {
                        statusBars = WindowInsets.Type.navigationBars();
                    } else if (i5 == 4) {
                        statusBars = WindowInsets.Type.captionBar();
                    } else if (i5 == 8) {
                        statusBars = WindowInsets.Type.ime();
                    } else if (i5 == 16) {
                        statusBars = WindowInsets.Type.systemGestures();
                    } else if (i5 == 32) {
                        statusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i5 == 64) {
                        statusBars = WindowInsets.Type.tappableElement();
                    } else if (i5 == 128) {
                        statusBars = WindowInsets.Type.displayCutout();
                    }
                    i4 |= statusBars;
                }
            }
            return i4;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f1019b = k.f1049q;
        } else {
            f1019b = l.f1050b;
        }
    }

    public C0205k0(WindowInsets windowInsets) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 30) {
            this.f1020a = new k(this, windowInsets);
            return;
        }
        if (i3 >= 29) {
            this.f1020a = new j(this, windowInsets);
        } else if (i3 >= 28) {
            this.f1020a = new i(this, windowInsets);
        } else {
            this.f1020a = new h(this, windowInsets);
        }
    }

    public static C.b m(C.b bVar, int i3, int i4, int i5, int i6) {
        int max = Math.max(0, bVar.f128a - i3);
        int max2 = Math.max(0, bVar.f129b - i4);
        int max3 = Math.max(0, bVar.f130c - i5);
        int max4 = Math.max(0, bVar.f131d - i6);
        return (max == i3 && max2 == i4 && max3 == i5 && max4 == i6) ? bVar : C.b.b(max, max2, max3, max4);
    }

    public static C0205k0 t(WindowInsets windowInsets) {
        return u(windowInsets, null);
    }

    public static C0205k0 u(WindowInsets windowInsets, View view) {
        C0205k0 c0205k0 = new C0205k0((WindowInsets) J.g.g(windowInsets));
        if (view != null && view.isAttachedToWindow()) {
            c0205k0.q(O.C(view));
            c0205k0.d(view.getRootView());
        }
        return c0205k0;
    }

    public C0205k0 a() {
        return this.f1020a.a();
    }

    public C0205k0 b() {
        return this.f1020a.b();
    }

    public C0205k0 c() {
        return this.f1020a.c();
    }

    public void d(View view) {
        this.f1020a.d(view);
    }

    public r e() {
        return this.f1020a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0205k0) {
            return J.c.a(this.f1020a, ((C0205k0) obj).f1020a);
        }
        return false;
    }

    public C.b f(int i3) {
        return this.f1020a.g(i3);
    }

    public C.b g() {
        return this.f1020a.i();
    }

    public int h() {
        return this.f1020a.k().f131d;
    }

    public int hashCode() {
        l lVar = this.f1020a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    public int i() {
        return this.f1020a.k().f128a;
    }

    public int j() {
        return this.f1020a.k().f130c;
    }

    public int k() {
        return this.f1020a.k().f129b;
    }

    public C0205k0 l(int i3, int i4, int i5, int i6) {
        return this.f1020a.m(i3, i4, i5, i6);
    }

    public boolean n() {
        return this.f1020a.n();
    }

    public void o(C.b[] bVarArr) {
        this.f1020a.p(bVarArr);
    }

    public void p(C.b bVar) {
        this.f1020a.q(bVar);
    }

    public void q(C0205k0 c0205k0) {
        this.f1020a.r(c0205k0);
    }

    public void r(C.b bVar) {
        this.f1020a.s(bVar);
    }

    public WindowInsets s() {
        l lVar = this.f1020a;
        if (lVar instanceof g) {
            return ((g) lVar).f1040c;
        }
        return null;
    }

    /* renamed from: K.k0$c */
    public static class c extends f {

        /* renamed from: e, reason: collision with root package name */
        public static Field f1026e = null;

        /* renamed from: f, reason: collision with root package name */
        public static boolean f1027f = false;

        /* renamed from: g, reason: collision with root package name */
        public static Constructor f1028g = null;

        /* renamed from: h, reason: collision with root package name */
        public static boolean f1029h = false;

        /* renamed from: c, reason: collision with root package name */
        public WindowInsets f1030c;

        /* renamed from: d, reason: collision with root package name */
        public C.b f1031d;

        public c() {
            this.f1030c = i();
        }

        private static WindowInsets i() {
            if (!f1027f) {
                try {
                    f1026e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e3) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e3);
                }
                f1027f = true;
            }
            Field field = f1026e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e4) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e4);
                }
            }
            if (!f1029h) {
                try {
                    f1028g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e5) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e5);
                }
                f1029h = true;
            }
            Constructor constructor = f1028g;
            if (constructor != null) {
                try {
                    return (WindowInsets) constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e6) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e6);
                }
            }
            return null;
        }

        @Override // K.C0205k0.f
        public C0205k0 b() {
            a();
            C0205k0 t3 = C0205k0.t(this.f1030c);
            t3.o(this.f1034b);
            t3.r(this.f1031d);
            return t3;
        }

        @Override // K.C0205k0.f
        public void e(C.b bVar) {
            this.f1031d = bVar;
        }

        @Override // K.C0205k0.f
        public void g(C.b bVar) {
            WindowInsets windowInsets = this.f1030c;
            if (windowInsets != null) {
                this.f1030c = windowInsets.replaceSystemWindowInsets(bVar.f128a, bVar.f129b, bVar.f130c, bVar.f131d);
            }
        }

        public c(C0205k0 c0205k0) {
            super(c0205k0);
            this.f1030c = c0205k0.s();
        }
    }

    /* renamed from: K.k0$d */
    public static class d extends f {

        /* renamed from: c, reason: collision with root package name */
        public final WindowInsets.Builder f1032c;

        public d() {
            this.f1032c = s0.a();
        }

        @Override // K.C0205k0.f
        public C0205k0 b() {
            WindowInsets build;
            a();
            build = this.f1032c.build();
            C0205k0 t3 = C0205k0.t(build);
            t3.o(this.f1034b);
            return t3;
        }

        @Override // K.C0205k0.f
        public void d(C.b bVar) {
            this.f1032c.setMandatorySystemGestureInsets(bVar.e());
        }

        @Override // K.C0205k0.f
        public void e(C.b bVar) {
            this.f1032c.setStableInsets(bVar.e());
        }

        @Override // K.C0205k0.f
        public void f(C.b bVar) {
            this.f1032c.setSystemGestureInsets(bVar.e());
        }

        @Override // K.C0205k0.f
        public void g(C.b bVar) {
            this.f1032c.setSystemWindowInsets(bVar.e());
        }

        @Override // K.C0205k0.f
        public void h(C.b bVar) {
            this.f1032c.setTappableElementInsets(bVar.e());
        }

        public d(C0205k0 c0205k0) {
            super(c0205k0);
            WindowInsets.Builder a3;
            WindowInsets s3 = c0205k0.s();
            if (s3 != null) {
                a3 = r0.a(s3);
            } else {
                a3 = s0.a();
            }
            this.f1032c = a3;
        }
    }

    /* renamed from: K.k0$h */
    public static class h extends g {

        /* renamed from: m, reason: collision with root package name */
        public C.b f1045m;

        public h(C0205k0 c0205k0, WindowInsets windowInsets) {
            super(c0205k0, windowInsets);
            this.f1045m = null;
        }

        @Override // K.C0205k0.l
        public C0205k0 b() {
            return C0205k0.t(this.f1040c.consumeStableInsets());
        }

        @Override // K.C0205k0.l
        public C0205k0 c() {
            return C0205k0.t(this.f1040c.consumeSystemWindowInsets());
        }

        @Override // K.C0205k0.l
        public final C.b i() {
            if (this.f1045m == null) {
                this.f1045m = C.b.b(this.f1040c.getStableInsetLeft(), this.f1040c.getStableInsetTop(), this.f1040c.getStableInsetRight(), this.f1040c.getStableInsetBottom());
            }
            return this.f1045m;
        }

        @Override // K.C0205k0.l
        public boolean n() {
            return this.f1040c.isConsumed();
        }

        @Override // K.C0205k0.l
        public void s(C.b bVar) {
            this.f1045m = bVar;
        }

        public h(C0205k0 c0205k0, h hVar) {
            super(c0205k0, hVar);
            this.f1045m = null;
            this.f1045m = hVar.f1045m;
        }
    }

    /* renamed from: K.k0$g */
    public static class g extends l {

        /* renamed from: h, reason: collision with root package name */
        public static boolean f1035h = false;

        /* renamed from: i, reason: collision with root package name */
        public static Method f1036i;

        /* renamed from: j, reason: collision with root package name */
        public static Class f1037j;

        /* renamed from: k, reason: collision with root package name */
        public static Field f1038k;

        /* renamed from: l, reason: collision with root package name */
        public static Field f1039l;

        /* renamed from: c, reason: collision with root package name */
        public final WindowInsets f1040c;

        /* renamed from: d, reason: collision with root package name */
        public C.b[] f1041d;

        /* renamed from: e, reason: collision with root package name */
        public C.b f1042e;

        /* renamed from: f, reason: collision with root package name */
        public C0205k0 f1043f;

        /* renamed from: g, reason: collision with root package name */
        public C.b f1044g;

        public g(C0205k0 c0205k0, WindowInsets windowInsets) {
            super(c0205k0);
            this.f1042e = null;
            this.f1040c = windowInsets;
        }

        @SuppressLint({"WrongConstant"})
        private C.b t(int i3, boolean z3) {
            C.b bVar = C.b.f127e;
            for (int i4 = 1; i4 <= 256; i4 <<= 1) {
                if ((i3 & i4) != 0) {
                    bVar = C.b.a(bVar, u(i4, z3));
                }
            }
            return bVar;
        }

        private C.b v() {
            C0205k0 c0205k0 = this.f1043f;
            return c0205k0 != null ? c0205k0.g() : C.b.f127e;
        }

        private C.b w(View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f1035h) {
                x();
            }
            Method method = f1036i;
            if (method != null && f1037j != null && f1038k != null) {
                try {
                    Object invoke = method.invoke(view, new Object[0]);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f1038k.get(f1039l.get(invoke));
                    if (rect != null) {
                        return C.b.c(rect);
                    }
                    return null;
                } catch (ReflectiveOperationException e3) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e3.getMessage(), e3);
                }
            }
            return null;
        }

        @SuppressLint({"PrivateApi"})
        private static void x() {
            try {
                f1036i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f1037j = cls;
                f1038k = cls.getDeclaredField("mVisibleInsets");
                f1039l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f1038k.setAccessible(true);
                f1039l.setAccessible(true);
            } catch (ReflectiveOperationException e3) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e3.getMessage(), e3);
            }
            f1035h = true;
        }

        @Override // K.C0205k0.l
        public void d(View view) {
            C.b w3 = w(view);
            if (w3 == null) {
                w3 = C.b.f127e;
            }
            q(w3);
        }

        @Override // K.C0205k0.l
        public void e(C0205k0 c0205k0) {
            c0205k0.q(this.f1043f);
            c0205k0.p(this.f1044g);
        }

        @Override // K.C0205k0.l
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f1044g, ((g) obj).f1044g);
            }
            return false;
        }

        @Override // K.C0205k0.l
        public C.b g(int i3) {
            return t(i3, false);
        }

        @Override // K.C0205k0.l
        public final C.b k() {
            if (this.f1042e == null) {
                this.f1042e = C.b.b(this.f1040c.getSystemWindowInsetLeft(), this.f1040c.getSystemWindowInsetTop(), this.f1040c.getSystemWindowInsetRight(), this.f1040c.getSystemWindowInsetBottom());
            }
            return this.f1042e;
        }

        @Override // K.C0205k0.l
        public C0205k0 m(int i3, int i4, int i5, int i6) {
            b bVar = new b(C0205k0.t(this.f1040c));
            bVar.d(C0205k0.m(k(), i3, i4, i5, i6));
            bVar.c(C0205k0.m(i(), i3, i4, i5, i6));
            return bVar.a();
        }

        @Override // K.C0205k0.l
        public boolean o() {
            return this.f1040c.isRound();
        }

        @Override // K.C0205k0.l
        public void p(C.b[] bVarArr) {
            this.f1041d = bVarArr;
        }

        @Override // K.C0205k0.l
        public void q(C.b bVar) {
            this.f1044g = bVar;
        }

        @Override // K.C0205k0.l
        public void r(C0205k0 c0205k0) {
            this.f1043f = c0205k0;
        }

        public C.b u(int i3, boolean z3) {
            C.b g3;
            int i4;
            if (i3 == 1) {
                return z3 ? C.b.b(0, Math.max(v().f129b, k().f129b), 0, 0) : C.b.b(0, k().f129b, 0, 0);
            }
            if (i3 == 2) {
                if (z3) {
                    C.b v3 = v();
                    C.b i5 = i();
                    return C.b.b(Math.max(v3.f128a, i5.f128a), 0, Math.max(v3.f130c, i5.f130c), Math.max(v3.f131d, i5.f131d));
                }
                C.b k3 = k();
                C0205k0 c0205k0 = this.f1043f;
                g3 = c0205k0 != null ? c0205k0.g() : null;
                int i6 = k3.f131d;
                if (g3 != null) {
                    i6 = Math.min(i6, g3.f131d);
                }
                return C.b.b(k3.f128a, 0, k3.f130c, i6);
            }
            if (i3 != 8) {
                if (i3 == 16) {
                    return j();
                }
                if (i3 == 32) {
                    return h();
                }
                if (i3 == 64) {
                    return l();
                }
                if (i3 != 128) {
                    return C.b.f127e;
                }
                C0205k0 c0205k02 = this.f1043f;
                r e3 = c0205k02 != null ? c0205k02.e() : f();
                return e3 != null ? C.b.b(e3.b(), e3.d(), e3.c(), e3.a()) : C.b.f127e;
            }
            C.b[] bVarArr = this.f1041d;
            g3 = bVarArr != null ? bVarArr[m.d(8)] : null;
            if (g3 != null) {
                return g3;
            }
            C.b k4 = k();
            C.b v4 = v();
            int i7 = k4.f131d;
            if (i7 > v4.f131d) {
                return C.b.b(0, 0, 0, i7);
            }
            C.b bVar = this.f1044g;
            return (bVar == null || bVar.equals(C.b.f127e) || (i4 = this.f1044g.f131d) <= v4.f131d) ? C.b.f127e : C.b.b(0, 0, 0, i4);
        }

        public g(C0205k0 c0205k0, g gVar) {
            this(c0205k0, new WindowInsets(gVar.f1040c));
        }
    }

    /* renamed from: K.k0$j */
    public static class j extends i {

        /* renamed from: n, reason: collision with root package name */
        public C.b f1046n;

        /* renamed from: o, reason: collision with root package name */
        public C.b f1047o;

        /* renamed from: p, reason: collision with root package name */
        public C.b f1048p;

        public j(C0205k0 c0205k0, WindowInsets windowInsets) {
            super(c0205k0, windowInsets);
            this.f1046n = null;
            this.f1047o = null;
            this.f1048p = null;
        }

        @Override // K.C0205k0.l
        public C.b h() {
            Insets mandatorySystemGestureInsets;
            if (this.f1047o == null) {
                mandatorySystemGestureInsets = this.f1040c.getMandatorySystemGestureInsets();
                this.f1047o = C.b.d(mandatorySystemGestureInsets);
            }
            return this.f1047o;
        }

        @Override // K.C0205k0.l
        public C.b j() {
            Insets systemGestureInsets;
            if (this.f1046n == null) {
                systemGestureInsets = this.f1040c.getSystemGestureInsets();
                this.f1046n = C.b.d(systemGestureInsets);
            }
            return this.f1046n;
        }

        @Override // K.C0205k0.l
        public C.b l() {
            Insets tappableElementInsets;
            if (this.f1048p == null) {
                tappableElementInsets = this.f1040c.getTappableElementInsets();
                this.f1048p = C.b.d(tappableElementInsets);
            }
            return this.f1048p;
        }

        @Override // K.C0205k0.g, K.C0205k0.l
        public C0205k0 m(int i3, int i4, int i5, int i6) {
            WindowInsets inset;
            inset = this.f1040c.inset(i3, i4, i5, i6);
            return C0205k0.t(inset);
        }

        public j(C0205k0 c0205k0, j jVar) {
            super(c0205k0, jVar);
            this.f1046n = null;
            this.f1047o = null;
            this.f1048p = null;
        }

        @Override // K.C0205k0.h, K.C0205k0.l
        public void s(C.b bVar) {
        }
    }

    /* renamed from: K.k0$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final f f1025a;

        public b() {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 30) {
                this.f1025a = new e();
            } else if (i3 >= 29) {
                this.f1025a = new d();
            } else {
                this.f1025a = new c();
            }
        }

        public C0205k0 a() {
            return this.f1025a.b();
        }

        public b b(int i3, C.b bVar) {
            this.f1025a.c(i3, bVar);
            return this;
        }

        public b c(C.b bVar) {
            this.f1025a.e(bVar);
            return this;
        }

        public b d(C.b bVar) {
            this.f1025a.g(bVar);
            return this;
        }

        public b(C0205k0 c0205k0) {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 30) {
                this.f1025a = new e(c0205k0);
            } else if (i3 >= 29) {
                this.f1025a = new d(c0205k0);
            } else {
                this.f1025a = new c(c0205k0);
            }
        }
    }

    public C0205k0(C0205k0 c0205k0) {
        if (c0205k0 != null) {
            l lVar = c0205k0.f1020a;
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 30 && (lVar instanceof k)) {
                this.f1020a = new k(this, (k) lVar);
            } else if (i3 >= 29 && (lVar instanceof j)) {
                this.f1020a = new j(this, (j) lVar);
            } else if (i3 >= 28 && (lVar instanceof i)) {
                this.f1020a = new i(this, (i) lVar);
            } else if (lVar instanceof h) {
                this.f1020a = new h(this, (h) lVar);
            } else if (lVar instanceof g) {
                this.f1020a = new g(this, (g) lVar);
            } else {
                this.f1020a = new l(this);
            }
            lVar.e(this);
            return;
        }
        this.f1020a = new l(this);
    }

    /* renamed from: K.k0$l */
    public static class l {

        /* renamed from: b, reason: collision with root package name */
        public static final C0205k0 f1050b = new b().a().a().b().c();

        /* renamed from: a, reason: collision with root package name */
        public final C0205k0 f1051a;

        public l(C0205k0 c0205k0) {
            this.f1051a = c0205k0;
        }

        public C0205k0 a() {
            return this.f1051a;
        }

        public C0205k0 b() {
            return this.f1051a;
        }

        public C0205k0 c() {
            return this.f1051a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return o() == lVar.o() && n() == lVar.n() && J.c.a(k(), lVar.k()) && J.c.a(i(), lVar.i()) && J.c.a(f(), lVar.f());
        }

        public r f() {
            return null;
        }

        public C.b g(int i3) {
            return C.b.f127e;
        }

        public C.b h() {
            return k();
        }

        public int hashCode() {
            return J.c.b(Boolean.valueOf(o()), Boolean.valueOf(n()), k(), i(), f());
        }

        public C.b i() {
            return C.b.f127e;
        }

        public C.b j() {
            return k();
        }

        public C.b k() {
            return C.b.f127e;
        }

        public C.b l() {
            return k();
        }

        public C0205k0 m(int i3, int i4, int i5, int i6) {
            return f1050b;
        }

        public boolean n() {
            return false;
        }

        public boolean o() {
            return false;
        }

        public void d(View view) {
        }

        public void e(C0205k0 c0205k0) {
        }

        public void p(C.b[] bVarArr) {
        }

        public void q(C.b bVar) {
        }

        public void r(C0205k0 c0205k0) {
        }

        public void s(C.b bVar) {
        }
    }
}
