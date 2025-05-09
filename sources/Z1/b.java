package Z1;

import Y1.InterfaceC0299d;
import android.app.Activity;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.AbstractC0347h;
import c2.C0400d;
import e2.InterfaceC0465a;
import e2.InterfaceC0466b;
import f2.InterfaceC0475a;
import i2.k;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import j.AbstractC0515e;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import o2.C0654e;

/* loaded from: classes.dex */
public class b implements InterfaceC0466b, f2.b {

    /* renamed from: b, reason: collision with root package name */
    public final io.flutter.embedding.engine.a f2612b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0465a.b f2613c;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0299d f2615e;

    /* renamed from: f, reason: collision with root package name */
    public c f2616f;

    /* renamed from: i, reason: collision with root package name */
    public Service f2619i;

    /* renamed from: k, reason: collision with root package name */
    public BroadcastReceiver f2621k;

    /* renamed from: m, reason: collision with root package name */
    public ContentProvider f2623m;

    /* renamed from: a, reason: collision with root package name */
    public final Map f2611a = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final Map f2614d = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public boolean f2617g = false;

    /* renamed from: h, reason: collision with root package name */
    public final Map f2618h = new HashMap();

    /* renamed from: j, reason: collision with root package name */
    public final Map f2620j = new HashMap();

    /* renamed from: l, reason: collision with root package name */
    public final Map f2622l = new HashMap();

    /* renamed from: Z1.b$b, reason: collision with other inner class name */
    public static class C0073b implements InterfaceC0465a.InterfaceC0118a {

        /* renamed from: a, reason: collision with root package name */
        public final C0400d f2624a;

        public C0073b(C0400d c0400d) {
            this.f2624a = c0400d;
        }
    }

    public static class c implements f2.c {

        /* renamed from: a, reason: collision with root package name */
        public final Activity f2625a;

        /* renamed from: b, reason: collision with root package name */
        public final HiddenLifecycleReference f2626b;

        /* renamed from: c, reason: collision with root package name */
        public final Set f2627c = new HashSet();

        /* renamed from: d, reason: collision with root package name */
        public final Set f2628d = new HashSet();

        /* renamed from: e, reason: collision with root package name */
        public final Set f2629e = new HashSet();

        /* renamed from: f, reason: collision with root package name */
        public final Set f2630f = new HashSet();

        /* renamed from: g, reason: collision with root package name */
        public final Set f2631g = new HashSet();

        /* renamed from: h, reason: collision with root package name */
        public final Set f2632h = new HashSet();

        public c(Activity activity, AbstractC0347h abstractC0347h) {
            this.f2625a = activity;
            this.f2626b = new HiddenLifecycleReference(abstractC0347h);
        }

        @Override // f2.c
        public void a(k kVar) {
            this.f2628d.remove(kVar);
        }

        @Override // f2.c
        public void b(k kVar) {
            this.f2628d.add(kVar);
        }

        public boolean c(int i3, int i4, Intent intent) {
            Iterator it = new HashSet(this.f2628d).iterator();
            while (true) {
                boolean z3 = false;
                while (it.hasNext()) {
                    if (((k) it.next()).a(i3, i4, intent) || z3) {
                        z3 = true;
                    }
                }
                return z3;
            }
        }

        @Override // f2.c
        public Activity d() {
            return this.f2625a;
        }

        public void e(Intent intent) {
            Iterator it = this.f2629e.iterator();
            if (it.hasNext()) {
                AbstractC0515e.a(it.next());
                throw null;
            }
        }

        public boolean f(int i3, String[] strArr, int[] iArr) {
            Iterator it = this.f2627c.iterator();
            if (!it.hasNext()) {
                return false;
            }
            AbstractC0515e.a(it.next());
            throw null;
        }

        public void g(Bundle bundle) {
            Iterator it = this.f2632h.iterator();
            if (it.hasNext()) {
                AbstractC0515e.a(it.next());
                throw null;
            }
        }

        public void h(Bundle bundle) {
            Iterator it = this.f2632h.iterator();
            if (it.hasNext()) {
                AbstractC0515e.a(it.next());
                throw null;
            }
        }

        public void i() {
            Iterator it = this.f2630f.iterator();
            if (it.hasNext()) {
                AbstractC0515e.a(it.next());
                throw null;
            }
        }
    }

    public b(Context context, io.flutter.embedding.engine.a aVar, C0400d c0400d, io.flutter.embedding.engine.b bVar) {
        this.f2612b = aVar;
        this.f2613c = new InterfaceC0465a.b(context, aVar, aVar.k(), aVar.t(), aVar.q().M(), new C0073b(c0400d), bVar);
    }

    @Override // f2.b
    public boolean a(int i3, int i4, Intent intent) {
        if (!s()) {
            W1.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onActivityResult, but no Activity was attached.");
            return false;
        }
        C0654e f3 = C0654e.f("FlutterEngineConnectionRegistry#onActivityResult");
        try {
            boolean c3 = this.f2616f.c(i3, i4, intent);
            if (f3 != null) {
                f3.close();
            }
            return c3;
        } catch (Throwable th) {
            if (f3 != null) {
                try {
                    f3.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // f2.b
    public void b(InterfaceC0299d interfaceC0299d, AbstractC0347h abstractC0347h) {
        C0654e f3 = C0654e.f("FlutterEngineConnectionRegistry#attachToActivity");
        try {
            InterfaceC0299d interfaceC0299d2 = this.f2615e;
            if (interfaceC0299d2 != null) {
                interfaceC0299d2.e();
            }
            n();
            this.f2615e = interfaceC0299d;
            k((Activity) interfaceC0299d.f(), abstractC0347h);
            if (f3 != null) {
                f3.close();
            }
        } catch (Throwable th) {
            if (f3 != null) {
                try {
                    f3.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // f2.b
    public void c(Intent intent) {
        if (!s()) {
            W1.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onNewIntent, but no Activity was attached.");
            return;
        }
        C0654e f3 = C0654e.f("FlutterEngineConnectionRegistry#onNewIntent");
        try {
            this.f2616f.e(intent);
            if (f3 != null) {
                f3.close();
            }
        } catch (Throwable th) {
            if (f3 != null) {
                try {
                    f3.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // e2.InterfaceC0466b
    public void d(InterfaceC0465a interfaceC0465a) {
        C0654e f3 = C0654e.f("FlutterEngineConnectionRegistry#add " + interfaceC0465a.getClass().getSimpleName());
        try {
            if (r(interfaceC0465a.getClass())) {
                W1.b.g("FlutterEngineCxnRegstry", "Attempted to register plugin (" + interfaceC0465a + ") but it was already registered with this FlutterEngine (" + this.f2612b + ").");
                if (f3 != null) {
                    f3.close();
                    return;
                }
                return;
            }
            W1.b.f("FlutterEngineCxnRegstry", "Adding plugin: " + interfaceC0465a);
            this.f2611a.put(interfaceC0465a.getClass(), interfaceC0465a);
            interfaceC0465a.b(this.f2613c);
            if (interfaceC0465a instanceof InterfaceC0475a) {
                InterfaceC0475a interfaceC0475a = (InterfaceC0475a) interfaceC0465a;
                this.f2614d.put(interfaceC0465a.getClass(), interfaceC0475a);
                if (s()) {
                    interfaceC0475a.e(this.f2616f);
                }
            }
            if (f3 != null) {
                f3.close();
            }
        } catch (Throwable th) {
            if (f3 != null) {
                try {
                    f3.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // f2.b
    public void e(Bundle bundle) {
        if (!s()) {
            W1.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRestoreInstanceState, but no Activity was attached.");
            return;
        }
        C0654e f3 = C0654e.f("FlutterEngineConnectionRegistry#onRestoreInstanceState");
        try {
            this.f2616f.g(bundle);
            if (f3 != null) {
                f3.close();
            }
        } catch (Throwable th) {
            if (f3 != null) {
                try {
                    f3.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // f2.b
    public boolean f(int i3, String[] strArr, int[] iArr) {
        if (!s()) {
            W1.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onRequestPermissionsResult, but no Activity was attached.");
            return false;
        }
        C0654e f3 = C0654e.f("FlutterEngineConnectionRegistry#onRequestPermissionsResult");
        try {
            boolean f4 = this.f2616f.f(i3, strArr, iArr);
            if (f3 != null) {
                f3.close();
            }
            return f4;
        } catch (Throwable th) {
            if (f3 != null) {
                try {
                    f3.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // f2.b
    public void g() {
        if (!s()) {
            W1.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        C0654e f3 = C0654e.f("FlutterEngineConnectionRegistry#detachFromActivity");
        try {
            Iterator it = this.f2614d.values().iterator();
            while (it.hasNext()) {
                ((InterfaceC0475a) it.next()).f();
            }
            m();
            if (f3 != null) {
                f3.close();
            }
        } catch (Throwable th) {
            if (f3 != null) {
                try {
                    f3.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // f2.b
    public void h(Bundle bundle) {
        if (!s()) {
            W1.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onSaveInstanceState, but no Activity was attached.");
            return;
        }
        C0654e f3 = C0654e.f("FlutterEngineConnectionRegistry#onSaveInstanceState");
        try {
            this.f2616f.h(bundle);
            if (f3 != null) {
                f3.close();
            }
        } catch (Throwable th) {
            if (f3 != null) {
                try {
                    f3.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // f2.b
    public void i() {
        if (!s()) {
            W1.b.b("FlutterEngineCxnRegstry", "Attempted to notify ActivityAware plugins of onUserLeaveHint, but no Activity was attached.");
            return;
        }
        C0654e f3 = C0654e.f("FlutterEngineConnectionRegistry#onUserLeaveHint");
        try {
            this.f2616f.i();
            if (f3 != null) {
                f3.close();
            }
        } catch (Throwable th) {
            if (f3 != null) {
                try {
                    f3.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // f2.b
    public void j() {
        if (!s()) {
            W1.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from an Activity when no Activity was attached.");
            return;
        }
        C0654e f3 = C0654e.f("FlutterEngineConnectionRegistry#detachFromActivityForConfigChanges");
        try {
            this.f2617g = true;
            Iterator it = this.f2614d.values().iterator();
            while (it.hasNext()) {
                ((InterfaceC0475a) it.next()).h();
            }
            m();
            if (f3 != null) {
                f3.close();
            }
        } catch (Throwable th) {
            if (f3 != null) {
                try {
                    f3.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public final void k(Activity activity, AbstractC0347h abstractC0347h) {
        this.f2616f = new c(activity, abstractC0347h);
        this.f2612b.q().e0(activity.getIntent() != null ? activity.getIntent().getBooleanExtra("enable-software-rendering", false) : false);
        this.f2612b.q().u(activity, this.f2612b.t(), this.f2612b.k());
        for (InterfaceC0475a interfaceC0475a : this.f2614d.values()) {
            if (this.f2617g) {
                interfaceC0475a.g(this.f2616f);
            } else {
                interfaceC0475a.e(this.f2616f);
            }
        }
        this.f2617g = false;
    }

    public void l() {
        W1.b.f("FlutterEngineCxnRegstry", "Destroying.");
        n();
        y();
    }

    public final void m() {
        this.f2612b.q().E();
        this.f2615e = null;
        this.f2616f = null;
    }

    public final void n() {
        if (s()) {
            g();
            return;
        }
        if (v()) {
            q();
        } else if (t()) {
            o();
        } else if (u()) {
            p();
        }
    }

    public void o() {
        if (!t()) {
            W1.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a BroadcastReceiver when no BroadcastReceiver was attached.");
            return;
        }
        C0654e f3 = C0654e.f("FlutterEngineConnectionRegistry#detachFromBroadcastReceiver");
        try {
            Iterator it = this.f2620j.values().iterator();
            if (it.hasNext()) {
                AbstractC0515e.a(it.next());
                throw null;
            }
            if (f3 != null) {
                f3.close();
            }
        } catch (Throwable th) {
            if (f3 != null) {
                try {
                    f3.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void p() {
        if (!u()) {
            W1.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a ContentProvider when no ContentProvider was attached.");
            return;
        }
        C0654e f3 = C0654e.f("FlutterEngineConnectionRegistry#detachFromContentProvider");
        try {
            Iterator it = this.f2622l.values().iterator();
            if (it.hasNext()) {
                AbstractC0515e.a(it.next());
                throw null;
            }
            if (f3 != null) {
                f3.close();
            }
        } catch (Throwable th) {
            if (f3 != null) {
                try {
                    f3.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void q() {
        if (!v()) {
            W1.b.b("FlutterEngineCxnRegstry", "Attempted to detach plugins from a Service when no Service was attached.");
            return;
        }
        C0654e f3 = C0654e.f("FlutterEngineConnectionRegistry#detachFromService");
        try {
            Iterator it = this.f2618h.values().iterator();
            if (it.hasNext()) {
                AbstractC0515e.a(it.next());
                throw null;
            }
            this.f2619i = null;
            if (f3 != null) {
                f3.close();
            }
        } catch (Throwable th) {
            if (f3 != null) {
                try {
                    f3.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public boolean r(Class cls) {
        return this.f2611a.containsKey(cls);
    }

    public final boolean s() {
        return this.f2615e != null;
    }

    public final boolean t() {
        return this.f2621k != null;
    }

    public final boolean u() {
        return this.f2623m != null;
    }

    public final boolean v() {
        return this.f2619i != null;
    }

    public void w(Class cls) {
        InterfaceC0465a interfaceC0465a = (InterfaceC0465a) this.f2611a.get(cls);
        if (interfaceC0465a == null) {
            return;
        }
        C0654e f3 = C0654e.f("FlutterEngineConnectionRegistry#remove " + cls.getSimpleName());
        try {
            if (interfaceC0465a instanceof InterfaceC0475a) {
                if (s()) {
                    ((InterfaceC0475a) interfaceC0465a).f();
                }
                this.f2614d.remove(cls);
            }
            interfaceC0465a.p(this.f2613c);
            this.f2611a.remove(cls);
            if (f3 != null) {
                f3.close();
            }
        } catch (Throwable th) {
            if (f3 != null) {
                try {
                    f3.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void x(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            w((Class) it.next());
        }
    }

    public void y() {
        x(new HashSet(this.f2611a.keySet()));
        this.f2611a.clear();
    }
}
