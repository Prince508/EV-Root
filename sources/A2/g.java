package a2;

import a2.c;
import android.os.Handler;
import android.os.Looper;
import o2.AbstractC0650a;

/* loaded from: classes.dex */
public class g implements c.d {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f2707a = AbstractC0650a.a(Looper.getMainLooper());

    @Override // a2.c.d
    public void a(Runnable runnable) {
        this.f2707a.post(runnable);
    }
}
