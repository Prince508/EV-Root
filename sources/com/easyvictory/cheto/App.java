package com.easyvictory.cheto;

import X1.a;
import c1.AbstractC0382j;
import c1.AbstractC0390r;
import c1.AbstractC0396x;
import c1.C0383k;
import com.easyvictory.cheto.App;

/* loaded from: classes.dex */
public class App extends a {

    /* renamed from: g, reason: collision with root package name */
    public static Integer f4793g;

    /* renamed from: f, reason: collision with root package name */
    public C0383k f4794f = new C0383k(U2.a.a(-3970265326L));

    static {
        System.loadLibrary(U2.a.a(-188653859054L));
        f4793g = 1;
    }

    public final /* synthetic */ void b() {
        f4793g = AbstractC0396x.e(this);
    }

    public final void c() {
        if (AbstractC0390r.a(this)) {
            new Thread(this.f4794f.f4752a).start();
        } else {
            AbstractC0382j.d(U2.a.a(-94164578542L));
        }
    }

    @Override // X1.a, android.app.Application
    public void onCreate() {
        super.onCreate();
        new Thread(new Runnable() { // from class: W0.a
            @Override // java.lang.Runnable
            public final void run() {
                App.this.b();
            }
        }).start();
        c();
    }
}
