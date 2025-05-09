package z0;

import B0.a;
import C2.u;
import android.app.Activity;
import android.content.Context;
import android.util.Log;
import androidx.window.extensions.layout.WindowLayoutComponent;

/* loaded from: classes.dex */
public interface f {

    /* renamed from: a, reason: collision with root package name */
    public static final a f10280a = a.f10281a;

    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final boolean f10282b = false;

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f10281a = new a();

        /* renamed from: c, reason: collision with root package name */
        public static final String f10283c = u.b(f.class).b();

        /* renamed from: d, reason: collision with root package name */
        public static final q2.d f10284d = q2.e.a(C0170a.f10286f);

        /* renamed from: e, reason: collision with root package name */
        public static g f10285e = C0786b.f10256a;

        /* renamed from: z0.f$a$a, reason: collision with other inner class name */
        public static final class C0170a extends C2.l implements B2.a {

            /* renamed from: f, reason: collision with root package name */
            public static final C0170a f10286f = new C0170a();

            public C0170a() {
                super(0);
            }

            @Override // B2.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final A0.a b() {
                WindowLayoutComponent g3;
                try {
                    ClassLoader classLoader = f.class.getClassLoader();
                    e eVar = classLoader != null ? new e(classLoader, new w0.d(classLoader)) : null;
                    if (eVar == null || (g3 = eVar.g()) == null) {
                        return null;
                    }
                    a.C0002a c0002a = B0.a.f51a;
                    C2.k.d(classLoader, "loader");
                    return c0002a.a(g3, new w0.d(classLoader));
                } catch (Throwable unused) {
                    if (a.f10282b) {
                        Log.d(a.f10283c, "Failed to load WindowExtensions");
                    }
                    return null;
                }
            }
        }

        public final A0.a c() {
            return (A0.a) f10284d.getValue();
        }

        public final f d(Context context) {
            C2.k.e(context, "context");
            A0.a c3 = c();
            if (c3 == null) {
                c3 = androidx.window.layout.adapter.sidecar.b.f4654c.a(context);
            }
            return f10285e.a(new i(o.f10303b, c3));
        }
    }

    N2.d a(Activity activity);
}
