package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: androidx.lifecycle.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0348i {

    /* renamed from: a, reason: collision with root package name */
    public static final C0348i f3988a = new C0348i();

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f3989b = new AtomicBoolean(false);

    /* renamed from: androidx.lifecycle.i$a */
    public static final class a extends AbstractC0344e {
        @Override // androidx.lifecycle.AbstractC0344e, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            C2.k.e(activity, "activity");
            w.f4035f.c(activity);
        }
    }

    public static final void a(Context context) {
        C2.k.e(context, "context");
        if (f3989b.getAndSet(true)) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        C2.k.c(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new a());
    }
}
