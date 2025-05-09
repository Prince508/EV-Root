package Y1;

import a2.C0313a;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.window.BackEvent;
import androidx.lifecycle.AbstractC0347h;
import io.flutter.embedding.engine.b;
import io.flutter.plugin.platform.h;
import java.util.Arrays;
import java.util.List;

/* renamed from: Y1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0305j implements InterfaceC0299d {

    /* renamed from: a, reason: collision with root package name */
    public c f2510a;

    /* renamed from: b, reason: collision with root package name */
    public io.flutter.embedding.engine.a f2511b;

    /* renamed from: c, reason: collision with root package name */
    public A f2512c;

    /* renamed from: d, reason: collision with root package name */
    public io.flutter.plugin.platform.h f2513d;

    /* renamed from: e, reason: collision with root package name */
    public ViewTreeObserver.OnPreDrawListener f2514e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2515f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2516g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2517h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2518i;

    /* renamed from: j, reason: collision with root package name */
    public Integer f2519j;

    /* renamed from: k, reason: collision with root package name */
    public io.flutter.embedding.engine.b f2520k;

    /* renamed from: l, reason: collision with root package name */
    public final io.flutter.embedding.engine.renderer.j f2521l;

    /* renamed from: Y1.j$a */
    public class a implements io.flutter.embedding.engine.renderer.j {
        public a() {
        }

        @Override // io.flutter.embedding.engine.renderer.j
        public void b() {
            C0305j.this.f2510a.b();
            C0305j.this.f2516g = false;
        }

        @Override // io.flutter.embedding.engine.renderer.j
        public void f() {
            C0305j.this.f2510a.f();
            C0305j.this.f2516g = true;
            C0305j.this.f2517h = true;
        }
    }

    /* renamed from: Y1.j$b */
    public class b implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ A f2523e;

        public b(A a3) {
            this.f2523e = a3;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (C0305j.this.f2516g && C0305j.this.f2514e != null) {
                this.f2523e.getViewTreeObserver().removeOnPreDrawListener(this);
                C0305j.this.f2514e = null;
            }
            return C0305j.this.f2516g;
        }
    }

    /* renamed from: Y1.j$c */
    public interface c extends h.d {
        void A(t tVar);

        String B();

        io.flutter.embedding.engine.a C(Context context);

        boolean D();

        M E();

        void F(io.flutter.embedding.engine.a aVar);

        void b();

        Context c();

        Activity d();

        void e();

        void f();

        AbstractC0347h h();

        String i();

        String j();

        Z1.j k();

        List n();

        void o(s sVar);

        boolean p();

        L q();

        boolean r();

        boolean s();

        boolean t();

        String u();

        boolean v();

        String w();

        void x(io.flutter.embedding.engine.a aVar);

        String y();

        io.flutter.plugin.platform.h z(Activity activity, io.flutter.embedding.engine.a aVar);
    }

    public C0305j(c cVar) {
        this(cVar, null);
    }

    public void A(int i3, String[] strArr, int[] iArr) {
        l();
        if (this.f2511b == null) {
            W1.b.g("FlutterActivityAndFragmentDelegate", "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        W1.b.f("FlutterActivityAndFragmentDelegate", "Forwarding onRequestPermissionsResult() to FlutterEngine:\nrequestCode: " + i3 + "\npermissions: " + Arrays.toString(strArr) + "\ngrantResults: " + Arrays.toString(iArr));
        this.f2511b.i().f(i3, strArr, iArr);
    }

    public void B(Bundle bundle) {
        Bundle bundle2;
        byte[] bArr;
        W1.b.f("FlutterActivityAndFragmentDelegate", "onRestoreInstanceState. Giving framework and plugins an opportunity to restore state.");
        l();
        if (bundle != null) {
            bundle2 = bundle.getBundle("plugins");
            bArr = bundle.getByteArray("framework");
        } else {
            bundle2 = null;
            bArr = null;
        }
        if (this.f2510a.v()) {
            this.f2511b.u().j(bArr);
        }
        if (this.f2510a.p()) {
            this.f2511b.i().e(bundle2);
        }
    }

    public void C() {
        io.flutter.embedding.engine.a aVar;
        W1.b.f("FlutterActivityAndFragmentDelegate", "onResume()");
        l();
        if (!this.f2510a.t() || (aVar = this.f2511b) == null) {
            return;
        }
        aVar.l().e();
    }

    public void D(Bundle bundle) {
        W1.b.f("FlutterActivityAndFragmentDelegate", "onSaveInstanceState. Giving framework and plugins an opportunity to save state.");
        l();
        if (this.f2510a.v()) {
            bundle.putByteArray("framework", this.f2511b.u().h());
        }
        if (this.f2510a.p()) {
            Bundle bundle2 = new Bundle();
            this.f2511b.i().h(bundle2);
            bundle.putBundle("plugins", bundle2);
        }
    }

    public void E() {
        W1.b.f("FlutterActivityAndFragmentDelegate", "onStart()");
        l();
        k();
        Integer num = this.f2519j;
        if (num != null) {
            this.f2512c.setVisibility(num.intValue());
        }
    }

    public void F() {
        io.flutter.embedding.engine.a aVar;
        W1.b.f("FlutterActivityAndFragmentDelegate", "onStop()");
        l();
        if (this.f2510a.t() && (aVar = this.f2511b) != null) {
            aVar.l().d();
        }
        this.f2519j = Integer.valueOf(this.f2512c.getVisibility());
        this.f2512c.setVisibility(8);
        io.flutter.embedding.engine.a aVar2 = this.f2511b;
        if (aVar2 != null) {
            aVar2.t().k(40);
        }
    }

    public void G(int i3) {
        l();
        io.flutter.embedding.engine.a aVar = this.f2511b;
        if (aVar != null) {
            if (this.f2517h && i3 >= 10) {
                aVar.k().j();
                this.f2511b.x().a();
            }
            this.f2511b.t().k(i3);
            this.f2511b.q().Y(i3);
        }
    }

    public void H() {
        l();
        if (this.f2511b == null) {
            W1.b.g("FlutterActivityAndFragmentDelegate", "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity.");
        } else {
            W1.b.f("FlutterActivityAndFragmentDelegate", "Forwarding onUserLeaveHint() to FlutterEngine.");
            this.f2511b.i().i();
        }
    }

    public void I(boolean z3) {
        io.flutter.embedding.engine.a aVar;
        l();
        StringBuilder sb = new StringBuilder();
        sb.append("Received onWindowFocusChanged: ");
        sb.append(z3 ? "true" : "false");
        W1.b.f("FlutterActivityAndFragmentDelegate", sb.toString());
        if (!this.f2510a.t() || (aVar = this.f2511b) == null) {
            return;
        }
        if (z3) {
            aVar.l().a();
        } else {
            aVar.l().f();
        }
    }

    public void J() {
        this.f2510a = null;
        this.f2511b = null;
        this.f2512c = null;
        this.f2513d = null;
    }

    public void K() {
        W1.b.f("FlutterActivityAndFragmentDelegate", "Setting up FlutterEngine.");
        String u3 = this.f2510a.u();
        if (u3 != null) {
            io.flutter.embedding.engine.a a3 = Z1.a.b().a(u3);
            this.f2511b = a3;
            this.f2515f = true;
            if (a3 != null) {
                return;
            }
            throw new IllegalStateException("The requested cached FlutterEngine did not exist in the FlutterEngineCache: '" + u3 + "'");
        }
        c cVar = this.f2510a;
        io.flutter.embedding.engine.a C3 = cVar.C(cVar.c());
        this.f2511b = C3;
        if (C3 != null) {
            this.f2515f = true;
            return;
        }
        String i3 = this.f2510a.i();
        if (i3 == null) {
            W1.b.f("FlutterActivityAndFragmentDelegate", "No preferred FlutterEngine was provided. Creating a new FlutterEngine for this FlutterFragment.");
            io.flutter.embedding.engine.b bVar = this.f2520k;
            if (bVar == null) {
                bVar = new io.flutter.embedding.engine.b(this.f2510a.c(), this.f2510a.k().b());
            }
            this.f2511b = bVar.a(g(new b.C0129b(this.f2510a.c()).h(false).l(this.f2510a.v())));
            this.f2515f = false;
            return;
        }
        io.flutter.embedding.engine.b a4 = Z1.c.b().a(i3);
        if (a4 != null) {
            this.f2511b = a4.a(g(new b.C0129b(this.f2510a.c())));
            this.f2515f = false;
        } else {
            throw new IllegalStateException("The requested cached FlutterEngineGroup did not exist in the FlutterEngineGroupCache: '" + i3 + "'");
        }
    }

    public void L(BackEvent backEvent) {
        l();
        if (this.f2511b == null) {
            W1.b.g("FlutterActivityAndFragmentDelegate", "Invoked startBackGesture() before FlutterFragment was attached to an Activity.");
        } else {
            W1.b.f("FlutterActivityAndFragmentDelegate", "Forwarding startBackGesture() to FlutterEngine.");
            this.f2511b.j().d(backEvent);
        }
    }

    public void M(BackEvent backEvent) {
        l();
        if (this.f2511b == null) {
            W1.b.g("FlutterActivityAndFragmentDelegate", "Invoked updateBackGestureProgress() before FlutterFragment was attached to an Activity.");
        } else {
            W1.b.f("FlutterActivityAndFragmentDelegate", "Forwarding updateBackGestureProgress() to FlutterEngine.");
            this.f2511b.j().e(backEvent);
        }
    }

    public void N() {
        io.flutter.plugin.platform.h hVar = this.f2513d;
        if (hVar != null) {
            hVar.E();
        }
    }

    @Override // Y1.InterfaceC0299d
    public void e() {
        if (!this.f2510a.r()) {
            this.f2510a.e();
            return;
        }
        throw new AssertionError("The internal FlutterEngine created by " + this.f2510a + " has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine");
    }

    public final b.C0129b g(b.C0129b c0129b) {
        String B3 = this.f2510a.B();
        if (B3 == null || B3.isEmpty()) {
            B3 = W1.a.e().c().g();
        }
        C0313a.b bVar = new C0313a.b(B3, this.f2510a.w());
        String j3 = this.f2510a.j();
        if (j3 == null && (j3 = q(this.f2510a.d().getIntent())) == null) {
            j3 = "/";
        }
        return c0129b.i(bVar).k(j3).j(this.f2510a.n());
    }

    public void h() {
        l();
        if (this.f2511b == null) {
            W1.b.g("FlutterActivityAndFragmentDelegate", "Invoked cancelBackGesture() before FlutterFragment was attached to an Activity.");
        } else {
            W1.b.f("FlutterActivityAndFragmentDelegate", "Forwarding cancelBackGesture() to FlutterEngine.");
            this.f2511b.j().b();
        }
    }

    public void i() {
        l();
        if (this.f2511b == null) {
            W1.b.g("FlutterActivityAndFragmentDelegate", "Invoked commitBackGesture() before FlutterFragment was attached to an Activity.");
        } else {
            W1.b.f("FlutterActivityAndFragmentDelegate", "Forwarding commitBackGesture() to FlutterEngine.");
            this.f2511b.j().c();
        }
    }

    public final void j(A a3) {
        if (this.f2510a.q() != L.surface) {
            throw new IllegalArgumentException("Cannot delay the first Android view draw when the render mode is not set to `RenderMode.surface`.");
        }
        if (this.f2514e != null) {
            a3.getViewTreeObserver().removeOnPreDrawListener(this.f2514e);
        }
        this.f2514e = new b(a3);
        a3.getViewTreeObserver().addOnPreDrawListener(this.f2514e);
    }

    public final void k() {
        String str;
        if (this.f2510a.u() == null && !this.f2511b.k().i()) {
            String j3 = this.f2510a.j();
            if (j3 == null && (j3 = q(this.f2510a.d().getIntent())) == null) {
                j3 = "/";
            }
            String y3 = this.f2510a.y();
            if (("Executing Dart entrypoint: " + this.f2510a.w() + ", library uri: " + y3) == null) {
                str = "\"\"";
            } else {
                str = y3 + ", and sending initial route: " + j3;
            }
            W1.b.f("FlutterActivityAndFragmentDelegate", str);
            this.f2511b.o().c(j3);
            String B3 = this.f2510a.B();
            if (B3 == null || B3.isEmpty()) {
                B3 = W1.a.e().c().g();
            }
            this.f2511b.k().h(y3 == null ? new C0313a.b(B3, this.f2510a.w()) : new C0313a.b(B3, y3, this.f2510a.w()), this.f2510a.n());
        }
    }

    public final void l() {
        if (this.f2510a == null) {
            throw new IllegalStateException("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
        }
    }

    @Override // Y1.InterfaceC0299d
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public Activity f() {
        Activity d3 = this.f2510a.d();
        if (d3 != null) {
            return d3;
        }
        throw new AssertionError("FlutterActivityAndFragmentDelegate's getAppComponent should only be queried after onAttach, when the host's activity should always be non-null");
    }

    public io.flutter.embedding.engine.a n() {
        return this.f2511b;
    }

    public boolean o() {
        return this.f2518i;
    }

    public boolean p() {
        return this.f2515f;
    }

    public final String q(Intent intent) {
        Uri data;
        if (!this.f2510a.D() || (data = intent.getData()) == null) {
            return null;
        }
        return data.toString();
    }

    public void r(int i3, int i4, Intent intent) {
        l();
        if (this.f2511b == null) {
            W1.b.g("FlutterActivityAndFragmentDelegate", "onActivityResult() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        W1.b.f("FlutterActivityAndFragmentDelegate", "Forwarding onActivityResult() to FlutterEngine:\nrequestCode: " + i3 + "\nresultCode: " + i4 + "\ndata: " + intent);
        this.f2511b.i().a(i3, i4, intent);
    }

    public void s(Context context) {
        l();
        if (this.f2511b == null) {
            K();
        }
        if (this.f2510a.p()) {
            W1.b.f("FlutterActivityAndFragmentDelegate", "Attaching FlutterEngine to the Activity that owns this delegate.");
            this.f2511b.i().b(this, this.f2510a.h());
        }
        c cVar = this.f2510a;
        this.f2513d = cVar.z(cVar.d(), this.f2511b);
        this.f2510a.F(this.f2511b);
        this.f2518i = true;
    }

    public void t() {
        l();
        if (this.f2511b == null) {
            W1.b.g("FlutterActivityAndFragmentDelegate", "Invoked onBackPressed() before FlutterFragment was attached to an Activity.");
        } else {
            W1.b.f("FlutterActivityAndFragmentDelegate", "Forwarding onBackPressed() to FlutterEngine.");
            this.f2511b.o().a();
        }
    }

    public View u(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, int i3, boolean z3) {
        W1.b.f("FlutterActivityAndFragmentDelegate", "Creating FlutterView.");
        l();
        if (this.f2510a.q() == L.surface) {
            s sVar = new s(this.f2510a.c(), this.f2510a.E() == M.transparent);
            this.f2510a.o(sVar);
            this.f2512c = new A(this.f2510a.c(), sVar);
        } else {
            t tVar = new t(this.f2510a.c());
            tVar.setOpaque(this.f2510a.E() == M.opaque);
            this.f2510a.A(tVar);
            this.f2512c = new A(this.f2510a.c(), tVar);
        }
        this.f2512c.l(this.f2521l);
        if (this.f2510a.s()) {
            W1.b.f("FlutterActivityAndFragmentDelegate", "Attaching FlutterEngine to FlutterView.");
            this.f2512c.n(this.f2511b);
        }
        this.f2512c.setId(i3);
        if (z3) {
            j(this.f2512c);
        }
        return this.f2512c;
    }

    public void v() {
        W1.b.f("FlutterActivityAndFragmentDelegate", "onDestroyView()");
        l();
        if (this.f2514e != null) {
            this.f2512c.getViewTreeObserver().removeOnPreDrawListener(this.f2514e);
            this.f2514e = null;
        }
        A a3 = this.f2512c;
        if (a3 != null) {
            a3.s();
            this.f2512c.x(this.f2521l);
        }
    }

    public void w() {
        io.flutter.embedding.engine.a aVar;
        if (this.f2518i) {
            W1.b.f("FlutterActivityAndFragmentDelegate", "onDetach()");
            l();
            this.f2510a.x(this.f2511b);
            if (this.f2510a.p()) {
                W1.b.f("FlutterActivityAndFragmentDelegate", "Detaching FlutterEngine from the Activity that owns this Fragment.");
                if (this.f2510a.d().isChangingConfigurations()) {
                    this.f2511b.i().j();
                } else {
                    this.f2511b.i().g();
                }
            }
            io.flutter.plugin.platform.h hVar = this.f2513d;
            if (hVar != null) {
                hVar.q();
                this.f2513d = null;
            }
            if (this.f2510a.t() && (aVar = this.f2511b) != null) {
                aVar.l().b();
            }
            if (this.f2510a.r()) {
                this.f2511b.g();
                if (this.f2510a.u() != null) {
                    Z1.a.b().d(this.f2510a.u());
                }
                this.f2511b = null;
            }
            this.f2518i = false;
        }
    }

    public void x(Intent intent) {
        l();
        if (this.f2511b == null) {
            W1.b.g("FlutterActivityAndFragmentDelegate", "onNewIntent() invoked before FlutterFragment was attached to an Activity.");
            return;
        }
        W1.b.f("FlutterActivityAndFragmentDelegate", "Forwarding onNewIntent() to FlutterEngine and sending pushRouteInformation message.");
        this.f2511b.i().c(intent);
        String q3 = q(intent);
        if (q3 == null || q3.isEmpty()) {
            return;
        }
        this.f2511b.o().b(q3);
    }

    public void y() {
        io.flutter.embedding.engine.a aVar;
        W1.b.f("FlutterActivityAndFragmentDelegate", "onPause()");
        l();
        if (!this.f2510a.t() || (aVar = this.f2511b) == null) {
            return;
        }
        aVar.l().c();
    }

    public void z() {
        W1.b.f("FlutterActivityAndFragmentDelegate", "onPostResume()");
        l();
        if (this.f2511b == null) {
            W1.b.g("FlutterActivityAndFragmentDelegate", "onPostResume() invoked before FlutterFragment was attached to an Activity.");
        } else {
            N();
            this.f2511b.q().X();
        }
    }

    public C0305j(c cVar, io.flutter.embedding.engine.b bVar) {
        this.f2521l = new a();
        this.f2510a = cVar;
        this.f2517h = false;
        this.f2520k = bVar;
    }
}
