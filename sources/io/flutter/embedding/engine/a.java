package io.flutter.embedding.engine;

import a2.C0313a;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import c2.C0400d;
import e2.InterfaceC0466b;
import g2.AbstractC0483a;
import h2.C0490a;
import h2.C0495f;
import h2.C0496g;
import h2.k;
import h2.l;
import h2.m;
import h2.n;
import h2.o;
import h2.r;
import h2.s;
import h2.t;
import h2.u;
import h2.v;
import h2.w;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import j2.C0522d;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import l2.C0593c;
import o2.AbstractC0655f;

/* loaded from: classes.dex */
public class a implements AbstractC0655f.a {

    /* renamed from: a, reason: collision with root package name */
    public final FlutterJNI f7518a;

    /* renamed from: b, reason: collision with root package name */
    public final FlutterRenderer f7519b;

    /* renamed from: c, reason: collision with root package name */
    public final C0313a f7520c;

    /* renamed from: d, reason: collision with root package name */
    public final Z1.b f7521d;

    /* renamed from: e, reason: collision with root package name */
    public final C0522d f7522e;

    /* renamed from: f, reason: collision with root package name */
    public final C0490a f7523f;

    /* renamed from: g, reason: collision with root package name */
    public final C0496g f7524g;

    /* renamed from: h, reason: collision with root package name */
    public final k f7525h;

    /* renamed from: i, reason: collision with root package name */
    public final l f7526i;

    /* renamed from: j, reason: collision with root package name */
    public final m f7527j;

    /* renamed from: k, reason: collision with root package name */
    public final n f7528k;

    /* renamed from: l, reason: collision with root package name */
    public final C0495f f7529l;

    /* renamed from: m, reason: collision with root package name */
    public final s f7530m;

    /* renamed from: n, reason: collision with root package name */
    public final o f7531n;

    /* renamed from: o, reason: collision with root package name */
    public final r f7532o;

    /* renamed from: p, reason: collision with root package name */
    public final t f7533p;

    /* renamed from: q, reason: collision with root package name */
    public final u f7534q;

    /* renamed from: r, reason: collision with root package name */
    public final v f7535r;

    /* renamed from: s, reason: collision with root package name */
    public final w f7536s;

    /* renamed from: t, reason: collision with root package name */
    public final io.flutter.plugin.platform.r f7537t;

    /* renamed from: u, reason: collision with root package name */
    public final Set f7538u;

    /* renamed from: v, reason: collision with root package name */
    public final b f7539v;

    /* renamed from: io.flutter.embedding.engine.a$a, reason: collision with other inner class name */
    public class C0128a implements b {
        public C0128a() {
        }

        @Override // io.flutter.embedding.engine.a.b
        public void a() {
            W1.b.f("FlutterEngine", "onPreEngineRestart()");
            Iterator it = a.this.f7538u.iterator();
            while (it.hasNext()) {
                ((b) it.next()).a();
            }
            a.this.f7537t.W();
            a.this.f7530m.g();
        }

        @Override // io.flutter.embedding.engine.a.b
        public void b() {
        }
    }

    public interface b {
        void a();

        void b();
    }

    public a(Context context, C0400d c0400d, FlutterJNI flutterJNI, io.flutter.plugin.platform.r rVar, String[] strArr, boolean z3, boolean z4) {
        this(context, c0400d, flutterJNI, rVar, strArr, z3, z4, null);
    }

    public a A(Context context, C0313a.b bVar, String str, List list, io.flutter.plugin.platform.r rVar, boolean z3, boolean z4) {
        if (z()) {
            return new a(context, null, this.f7518a.spawn(bVar.f2674c, bVar.f2673b, str, list), rVar, null, z3, z4);
        }
        throw new IllegalStateException("Spawn can only be called on a fully constructed FlutterEngine");
    }

    @Override // o2.AbstractC0655f.a
    public void a(float f3, float f4, float f5) {
        this.f7518a.updateDisplayMetrics(0, f3, f4, f5);
    }

    public void e(b bVar) {
        this.f7538u.add(bVar);
    }

    public final void f() {
        W1.b.f("FlutterEngine", "Attaching to JNI.");
        this.f7518a.attachToNative();
        if (!z()) {
            throw new RuntimeException("FlutterEngine failed to attach to its native Object reference.");
        }
    }

    public void g() {
        W1.b.f("FlutterEngine", "Destroying.");
        Iterator it = this.f7538u.iterator();
        while (it.hasNext()) {
            ((b) it.next()).b();
        }
        this.f7521d.l();
        this.f7537t.S();
        this.f7520c.l();
        this.f7518a.removeEngineLifecycleListener(this.f7539v);
        this.f7518a.setDeferredComponentManager(null);
        this.f7518a.detachFromNativeAndReleaseResources();
        W1.a.e().a();
    }

    public C0490a h() {
        return this.f7523f;
    }

    public f2.b i() {
        return this.f7521d;
    }

    public C0495f j() {
        return this.f7529l;
    }

    public C0313a k() {
        return this.f7520c;
    }

    public k l() {
        return this.f7525h;
    }

    public C0522d m() {
        return this.f7522e;
    }

    public m n() {
        return this.f7527j;
    }

    public n o() {
        return this.f7528k;
    }

    public o p() {
        return this.f7531n;
    }

    public io.flutter.plugin.platform.r q() {
        return this.f7537t;
    }

    public InterfaceC0466b r() {
        return this.f7521d;
    }

    public r s() {
        return this.f7532o;
    }

    public FlutterRenderer t() {
        return this.f7519b;
    }

    public s u() {
        return this.f7530m;
    }

    public t v() {
        return this.f7533p;
    }

    public u w() {
        return this.f7534q;
    }

    public v x() {
        return this.f7535r;
    }

    public w y() {
        return this.f7536s;
    }

    public final boolean z() {
        return this.f7518a.isAttached();
    }

    public a(Context context, C0400d c0400d, FlutterJNI flutterJNI, io.flutter.plugin.platform.r rVar, String[] strArr, boolean z3, boolean z4, io.flutter.embedding.engine.b bVar) {
        AssetManager assets;
        this.f7538u = new HashSet();
        this.f7539v = new C0128a();
        try {
            assets = context.createPackageContext(context.getPackageName(), 0).getAssets();
        } catch (PackageManager.NameNotFoundException unused) {
            assets = context.getAssets();
        }
        W1.a e3 = W1.a.e();
        flutterJNI = flutterJNI == null ? e3.d().a() : flutterJNI;
        this.f7518a = flutterJNI;
        C0313a c0313a = new C0313a(flutterJNI, assets);
        this.f7520c = c0313a;
        c0313a.k();
        W1.a.e().a();
        this.f7523f = new C0490a(c0313a, flutterJNI);
        this.f7524g = new C0496g(c0313a);
        this.f7525h = new k(c0313a);
        l lVar = new l(c0313a);
        this.f7526i = lVar;
        this.f7527j = new m(c0313a);
        this.f7528k = new n(c0313a);
        this.f7529l = new C0495f(c0313a);
        this.f7531n = new o(c0313a);
        this.f7532o = new r(c0313a, context.getPackageManager());
        this.f7530m = new s(c0313a, z4);
        this.f7533p = new t(c0313a);
        this.f7534q = new u(c0313a);
        this.f7535r = new v(c0313a);
        this.f7536s = new w(c0313a);
        C0522d c0522d = new C0522d(context, lVar);
        this.f7522e = c0522d;
        c0400d = c0400d == null ? e3.c() : c0400d;
        if (!flutterJNI.isAttached()) {
            c0400d.m(context.getApplicationContext());
            c0400d.f(context, strArr);
        }
        flutterJNI.addEngineLifecycleListener(this.f7539v);
        flutterJNI.setPlatformViewsController(rVar);
        flutterJNI.setLocalizationPlugin(c0522d);
        e3.a();
        flutterJNI.setDeferredComponentManager(null);
        if (!flutterJNI.isAttached()) {
            f();
        }
        this.f7519b = new FlutterRenderer(flutterJNI);
        this.f7537t = rVar;
        rVar.Q();
        Z1.b bVar2 = new Z1.b(context.getApplicationContext(), this, c0400d, bVar);
        this.f7521d = bVar2;
        c0522d.d(context.getResources().getConfiguration());
        if (z3 && c0400d.e()) {
            AbstractC0483a.a(this);
        }
        AbstractC0655f.a(context, this);
        bVar2.d(new C0593c(s()));
    }
}
