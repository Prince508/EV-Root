package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.AbstractC0347h;
import androidx.lifecycle.w;

/* loaded from: classes.dex */
public final class u implements l {

    /* renamed from: m, reason: collision with root package name */
    public static final b f4021m = new b(null);

    /* renamed from: n, reason: collision with root package name */
    public static final u f4022n = new u();

    /* renamed from: e, reason: collision with root package name */
    public int f4023e;

    /* renamed from: f, reason: collision with root package name */
    public int f4024f;

    /* renamed from: i, reason: collision with root package name */
    public Handler f4027i;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4025g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4026h = true;

    /* renamed from: j, reason: collision with root package name */
    public final m f4028j = new m(this);

    /* renamed from: k, reason: collision with root package name */
    public final Runnable f4029k = new Runnable() { // from class: androidx.lifecycle.t
        @Override // java.lang.Runnable
        public final void run() {
            u.j(u.this);
        }
    };

    /* renamed from: l, reason: collision with root package name */
    public final w.a f4030l = new d();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f4031a = new a();

        public static final void a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            C2.k.e(activity, "activity");
            C2.k.e(activityLifecycleCallbacks, "callback");
            activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    public static final class b {
        public /* synthetic */ b(C2.g gVar) {
            this();
        }

        public final l a() {
            return u.f4022n;
        }

        public final void b(Context context) {
            C2.k.e(context, "context");
            u.f4022n.i(context);
        }

        public b() {
        }
    }

    public static final class c extends AbstractC0344e {

        public static final class a extends AbstractC0344e {
            final /* synthetic */ u this$0;

            public a(u uVar) {
                this.this$0 = uVar;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(Activity activity) {
                C2.k.e(activity, "activity");
                this.this$0.e();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(Activity activity) {
                C2.k.e(activity, "activity");
                this.this$0.f();
            }
        }

        public c() {
        }

        @Override // androidx.lifecycle.AbstractC0344e, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            C2.k.e(activity, "activity");
            if (Build.VERSION.SDK_INT < 29) {
                w.f4035f.b(activity).e(u.this.f4030l);
            }
        }

        @Override // androidx.lifecycle.AbstractC0344e, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            C2.k.e(activity, "activity");
            u.this.d();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            C2.k.e(activity, "activity");
            a.a(activity, new a(u.this));
        }

        @Override // androidx.lifecycle.AbstractC0344e, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            C2.k.e(activity, "activity");
            u.this.g();
        }
    }

    public static final class d implements w.a {
        public d() {
        }

        @Override // androidx.lifecycle.w.a
        public void a() {
        }

        @Override // androidx.lifecycle.w.a
        public void b() {
            u.this.e();
        }

        @Override // androidx.lifecycle.w.a
        public void c() {
            u.this.f();
        }
    }

    public static final void j(u uVar) {
        C2.k.e(uVar, "this$0");
        uVar.k();
        uVar.n();
    }

    public static final l o() {
        return f4021m.a();
    }

    public final void d() {
        int i3 = this.f4024f - 1;
        this.f4024f = i3;
        if (i3 == 0) {
            Handler handler = this.f4027i;
            C2.k.b(handler);
            handler.postDelayed(this.f4029k, 700L);
        }
    }

    public final void e() {
        int i3 = this.f4024f + 1;
        this.f4024f = i3;
        if (i3 == 1) {
            if (this.f4025g) {
                this.f4028j.h(AbstractC0347h.a.ON_RESUME);
                this.f4025g = false;
            } else {
                Handler handler = this.f4027i;
                C2.k.b(handler);
                handler.removeCallbacks(this.f4029k);
            }
        }
    }

    public final void f() {
        int i3 = this.f4023e + 1;
        this.f4023e = i3;
        if (i3 == 1 && this.f4026h) {
            this.f4028j.h(AbstractC0347h.a.ON_START);
            this.f4026h = false;
        }
    }

    public final void g() {
        this.f4023e--;
        n();
    }

    @Override // androidx.lifecycle.l
    public AbstractC0347h h() {
        return this.f4028j;
    }

    public final void i(Context context) {
        C2.k.e(context, "context");
        this.f4027i = new Handler();
        this.f4028j.h(AbstractC0347h.a.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        C2.k.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new c());
    }

    public final void k() {
        if (this.f4024f == 0) {
            this.f4025g = true;
            this.f4028j.h(AbstractC0347h.a.ON_PAUSE);
        }
    }

    public final void n() {
        if (this.f4023e == 0 && this.f4025g) {
            this.f4028j.h(AbstractC0347h.a.ON_STOP);
            this.f4026h = true;
        }
    }
}
