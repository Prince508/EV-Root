package X1;

import android.app.Activity;
import android.app.Application;

/* loaded from: classes.dex */
public abstract class a extends Application {

    /* renamed from: e, reason: collision with root package name */
    public Activity f2376e = null;

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        W1.a.e().c().m(this);
    }
}
