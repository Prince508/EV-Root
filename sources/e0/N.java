package e0;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.AbstractC0347h;
import androidx.lifecycle.E;
import androidx.lifecycle.InterfaceC0346g;
import i0.AbstractC0499a;
import i0.C0500b;
import o0.C0643d;
import o0.C0644e;

/* loaded from: classes.dex */
public class N implements InterfaceC0346g, o0.f, androidx.lifecycle.H {

    /* renamed from: e, reason: collision with root package name */
    public final AbstractComponentCallbacksC0459p f6533e;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.lifecycle.G f6534f;

    /* renamed from: g, reason: collision with root package name */
    public final Runnable f6535g;

    /* renamed from: h, reason: collision with root package name */
    public androidx.lifecycle.m f6536h = null;

    /* renamed from: i, reason: collision with root package name */
    public C0644e f6537i = null;

    public N(AbstractComponentCallbacksC0459p abstractComponentCallbacksC0459p, androidx.lifecycle.G g3, Runnable runnable) {
        this.f6533e = abstractComponentCallbacksC0459p;
        this.f6534f = g3;
        this.f6535g = runnable;
    }

    @Override // androidx.lifecycle.InterfaceC0346g
    public AbstractC0499a a() {
        Application application;
        Context applicationContext = this.f6533e.N0().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        C0500b c0500b = new C0500b();
        if (application != null) {
            c0500b.b(E.a.f3960e, application);
        }
        c0500b.b(androidx.lifecycle.z.f4038a, this.f6533e);
        c0500b.b(androidx.lifecycle.z.f4039b, this);
        if (this.f6533e.j() != null) {
            c0500b.b(androidx.lifecycle.z.f4040c, this.f6533e.j());
        }
        return c0500b;
    }

    @Override // androidx.lifecycle.H
    public androidx.lifecycle.G b() {
        d();
        return this.f6534f;
    }

    public void c(AbstractC0347h.a aVar) {
        this.f6536h.h(aVar);
    }

    public void d() {
        if (this.f6536h == null) {
            this.f6536h = new androidx.lifecycle.m(this);
            C0644e a3 = C0644e.a(this);
            this.f6537i = a3;
            a3.c();
            this.f6535g.run();
        }
    }

    public boolean e() {
        return this.f6536h != null;
    }

    public void f(Bundle bundle) {
        this.f6537i.d(bundle);
    }

    public void g(Bundle bundle) {
        this.f6537i.e(bundle);
    }

    @Override // androidx.lifecycle.l
    public AbstractC0347h h() {
        d();
        return this.f6536h;
    }

    @Override // o0.f
    public C0643d m() {
        d();
        return this.f6537i.b();
    }
}
