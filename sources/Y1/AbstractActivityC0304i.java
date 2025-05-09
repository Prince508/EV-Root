package Y1;

import Y1.C0305j;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC0347h;
import g2.AbstractC0483a;
import java.util.List;

/* renamed from: Y1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0304i extends Activity implements C0305j.c, androidx.lifecycle.l {

    /* renamed from: i, reason: collision with root package name */
    public static final int f2504i = View.generateViewId();

    /* renamed from: e, reason: collision with root package name */
    public boolean f2505e = false;

    /* renamed from: f, reason: collision with root package name */
    public C0305j f2506f;

    /* renamed from: g, reason: collision with root package name */
    public androidx.lifecycle.m f2507g;

    /* renamed from: h, reason: collision with root package name */
    public final OnBackInvokedCallback f2508h;

    /* renamed from: Y1.i$a */
    public class a implements OnBackAnimationCallback {
        public a() {
        }

        public void onBackCancelled() {
            AbstractActivityC0304i.this.G();
        }

        public void onBackInvoked() {
            AbstractActivityC0304i.this.H();
        }

        public void onBackProgressed(BackEvent backEvent) {
            AbstractActivityC0304i.this.W(backEvent);
        }

        public void onBackStarted(BackEvent backEvent) {
            AbstractActivityC0304i.this.S(backEvent);
        }
    }

    public AbstractActivityC0304i() {
        this.f2508h = Build.VERSION.SDK_INT < 33 ? null : L();
        this.f2507g = new androidx.lifecycle.m(this);
    }

    @Override // Y1.C0305j.c
    public String B() {
        String dataString;
        if (P() && "android.intent.action.RUN".equals(getIntent().getAction()) && (dataString = getIntent().getDataString()) != null) {
            return dataString;
        }
        return null;
    }

    @Override // Y1.C0305j.c
    public io.flutter.embedding.engine.a C(Context context) {
        return null;
    }

    @Override // Y1.C0305j.c
    public boolean D() {
        try {
            Bundle O3 = O();
            if (O3 != null) {
                return O3.getBoolean("flutter_deeplinking_enabled");
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    @Override // Y1.C0305j.c
    public M E() {
        return M() == EnumC0306k.opaque ? M.opaque : M.transparent;
    }

    @Override // Y1.C0305j.c
    public void F(io.flutter.embedding.engine.a aVar) {
        if (this.f2506f.p()) {
            return;
        }
        AbstractC0483a.a(aVar);
    }

    public void G() {
        if (T("cancelBackGesture")) {
            this.f2506f.h();
        }
    }

    public void H() {
        if (T("commitBackGesture")) {
            this.f2506f.i();
        }
    }

    public final void I() {
        Window window = getWindow();
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(1073741824);
        window.getDecorView().setSystemUiVisibility(1280);
    }

    public final void J() {
        if (M() == EnumC0306k.transparent) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    public final View K() {
        return this.f2506f.u(null, null, null, f2504i, q() == L.surface);
    }

    public final OnBackInvokedCallback L() {
        return Build.VERSION.SDK_INT >= 34 ? new a() : new OnBackInvokedCallback() { // from class: Y1.h
            public final void onBackInvoked() {
                AbstractActivityC0304i.this.onBackPressed();
            }
        };
    }

    public EnumC0306k M() {
        return getIntent().hasExtra("background_mode") ? EnumC0306k.valueOf(getIntent().getStringExtra("background_mode")) : EnumC0306k.opaque;
    }

    public io.flutter.embedding.engine.a N() {
        return this.f2506f.n();
    }

    public Bundle O() {
        return getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
    }

    public final boolean P() {
        return (getApplicationInfo().flags & 2) != 0;
    }

    public void Q() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.registerOnBackInvokedCallback(0, this.f2508h);
            this.f2505e = true;
        }
    }

    public void R() {
        V();
        C0305j c0305j = this.f2506f;
        if (c0305j != null) {
            c0305j.J();
            this.f2506f = null;
        }
    }

    public void S(BackEvent backEvent) {
        if (T("startBackGesture")) {
            this.f2506f.L(backEvent);
        }
    }

    public final boolean T(String str) {
        C0305j c0305j = this.f2506f;
        if (c0305j == null) {
            W1.b.g("FlutterActivity", "FlutterActivity " + hashCode() + " " + str + " called after release.");
            return false;
        }
        if (c0305j.o()) {
            return true;
        }
        W1.b.g("FlutterActivity", "FlutterActivity " + hashCode() + " " + str + " called after detach.");
        return false;
    }

    public final void U() {
        try {
            Bundle O3 = O();
            if (O3 == null) {
                W1.b.f("FlutterActivity", "Using the launch theme as normal theme.");
                return;
            }
            int i3 = O3.getInt("io.flutter.embedding.android.NormalTheme", -1);
            if (i3 != -1) {
                setTheme(i3);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            W1.b.b("FlutterActivity", "Could not read meta-data for FlutterActivity. Using the launch theme as normal theme.");
        }
    }

    public void V() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.f2508h);
            this.f2505e = false;
        }
    }

    public void W(BackEvent backEvent) {
        if (T("updateBackGestureProgress")) {
            this.f2506f.M(backEvent);
        }
    }

    @Override // io.flutter.plugin.platform.h.d
    public boolean a() {
        return false;
    }

    @Override // Y1.C0305j.c
    public void e() {
        W1.b.g("FlutterActivity", "FlutterActivity " + this + " connection to the engine " + N() + " evicted by another attaching activity");
        C0305j c0305j = this.f2506f;
        if (c0305j != null) {
            c0305j.v();
            this.f2506f.w();
        }
    }

    @Override // Y1.C0305j.c
    public void f() {
        if (Build.VERSION.SDK_INT >= 29) {
            reportFullyDrawn();
        }
    }

    @Override // io.flutter.plugin.platform.h.d
    public void g(boolean z3) {
        if (z3 && !this.f2505e) {
            Q();
        } else {
            if (z3 || !this.f2505e) {
                return;
            }
            V();
        }
    }

    @Override // Y1.C0305j.c, androidx.lifecycle.l
    public AbstractC0347h h() {
        return this.f2507g;
    }

    @Override // Y1.C0305j.c
    public String i() {
        return getIntent().getStringExtra("cached_engine_group_id");
    }

    @Override // Y1.C0305j.c
    public String j() {
        if (getIntent().hasExtra("route")) {
            return getIntent().getStringExtra("route");
        }
        try {
            Bundle O3 = O();
            if (O3 != null) {
                return O3.getString("io.flutter.InitialRoute");
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Override // Y1.C0305j.c
    public Z1.j k() {
        return Z1.j.a(getIntent());
    }

    @Override // Y1.C0305j.c
    public List n() {
        return (List) getIntent().getSerializableExtra("dart_entrypoint_args");
    }

    @Override // android.app.Activity
    public void onActivityResult(int i3, int i4, Intent intent) {
        if (T("onActivityResult")) {
            this.f2506f.r(i3, i4, intent);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (T("onBackPressed")) {
            this.f2506f.t();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        U();
        super.onCreate(bundle);
        C0305j c0305j = new C0305j(this);
        this.f2506f = c0305j;
        c0305j.s(this);
        this.f2506f.B(bundle);
        this.f2507g.h(AbstractC0347h.a.ON_CREATE);
        J();
        setContentView(K());
        I();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (T("onDestroy")) {
            this.f2506f.v();
            this.f2506f.w();
        }
        R();
        this.f2507g.h(AbstractC0347h.a.ON_DESTROY);
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (T("onNewIntent")) {
            this.f2506f.x(intent);
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        if (T("onPause")) {
            this.f2506f.y();
        }
        this.f2507g.h(AbstractC0347h.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        if (T("onPostResume")) {
            this.f2506f.z();
        }
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i3, String[] strArr, int[] iArr) {
        if (T("onRequestPermissionsResult")) {
            this.f2506f.A(i3, strArr, iArr);
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        this.f2507g.h(AbstractC0347h.a.ON_RESUME);
        if (T("onResume")) {
            this.f2506f.C();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (T("onSaveInstanceState")) {
            this.f2506f.D(bundle);
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        this.f2507g.h(AbstractC0347h.a.ON_START);
        if (T("onStart")) {
            this.f2506f.E();
        }
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        if (T("onStop")) {
            this.f2506f.F();
        }
        this.f2507g.h(AbstractC0347h.a.ON_STOP);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i3) {
        super.onTrimMemory(i3);
        if (T("onTrimMemory")) {
            this.f2506f.G(i3);
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        if (T("onUserLeaveHint")) {
            this.f2506f.H();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z3) {
        super.onWindowFocusChanged(z3);
        if (T("onWindowFocusChanged")) {
            this.f2506f.I(z3);
        }
    }

    @Override // Y1.C0305j.c
    public boolean p() {
        return true;
    }

    @Override // Y1.C0305j.c
    public L q() {
        return M() == EnumC0306k.opaque ? L.surface : L.texture;
    }

    @Override // Y1.C0305j.c
    public boolean r() {
        boolean booleanExtra = getIntent().getBooleanExtra("destroy_engine_with_activity", false);
        return (u() != null || this.f2506f.p()) ? booleanExtra : getIntent().getBooleanExtra("destroy_engine_with_activity", true);
    }

    @Override // Y1.C0305j.c
    public boolean s() {
        return true;
    }

    @Override // Y1.C0305j.c
    public boolean t() {
        return true;
    }

    @Override // Y1.C0305j.c
    public String u() {
        return getIntent().getStringExtra("cached_engine_id");
    }

    @Override // Y1.C0305j.c
    public boolean v() {
        return getIntent().hasExtra("enable_state_restoration") ? getIntent().getBooleanExtra("enable_state_restoration", false) : u() == null;
    }

    @Override // Y1.C0305j.c
    public String w() {
        String string;
        if (getIntent().hasExtra("dart_entrypoint")) {
            return getIntent().getStringExtra("dart_entrypoint");
        }
        try {
            Bundle O3 = O();
            string = O3 != null ? O3.getString("io.flutter.Entrypoint") : null;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return string != null ? string : "main";
    }

    @Override // Y1.C0305j.c
    public String y() {
        try {
            Bundle O3 = O();
            if (O3 != null) {
                return O3.getString("io.flutter.EntrypointUri");
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Override // Y1.C0305j.c
    public io.flutter.plugin.platform.h z(Activity activity, io.flutter.embedding.engine.a aVar) {
        return new io.flutter.plugin.platform.h(d(), aVar.p(), this);
    }

    @Override // Y1.C0305j.c
    public void b() {
    }

    @Override // Y1.C0305j.c
    public Context c() {
        return this;
    }

    @Override // Y1.C0305j.c
    public Activity d() {
        return this;
    }

    @Override // Y1.C0305j.c
    public void A(t tVar) {
    }

    @Override // Y1.C0305j.c
    public void o(s sVar) {
    }

    @Override // Y1.C0305j.c
    public void x(io.flutter.embedding.engine.a aVar) {
    }
}
