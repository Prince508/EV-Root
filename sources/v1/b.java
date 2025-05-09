package V1;

import T1.b;
import U1.E;
import U1.F;
import U1.p;
import U1.z;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.io.IOException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class b extends ContextWrapper {
    public static final String CATEGORY_DAEMON_MODE = "com.topjohnwu.superuser.DAEMON_MODE";

    public b() {
        super(null);
    }

    public static /* synthetic */ void a(b.c cVar) {
        try {
            T1.b b3 = T1.b.b();
            if (b3.d()) {
                b3.a(cVar);
            }
        } catch (IOException e3) {
            F.b(e3);
        }
    }

    public static Runnable b(final b.c cVar) {
        return new Runnable() { // from class: V1.a
            @Override // java.lang.Runnable
            public final void run() {
                b.a(b.c.this);
            }
        };
    }

    public static void bind(Intent intent, Executor executor, ServiceConnection serviceConnection) {
        b.c bindOrTask;
        if (F.h() || (bindOrTask = bindOrTask(intent, executor, serviceConnection)) == null) {
            return;
        }
        T1.b.f2056e.execute(b(bindOrTask));
    }

    public static b.c bindOrTask(Intent intent, Executor executor, ServiceConnection serviceConnection) {
        return p.t().o(intent, executor, serviceConnection);
    }

    @Deprecated
    public static Runnable createBindTask(Intent intent, Executor executor, ServiceConnection serviceConnection) {
        b.c bindOrTask = bindOrTask(intent, executor, serviceConnection);
        if (bindOrTask == null) {
            return null;
        }
        return b(bindOrTask);
    }

    public static void stop(Intent intent) {
        b.c stopOrTask;
        if (F.h() || (stopOrTask = stopOrTask(intent)) == null) {
            return;
        }
        T1.b.f2056e.execute(b(stopOrTask));
    }

    public static b.c stopOrTask(Intent intent) {
        return p.t().p(intent);
    }

    public static void unbind(ServiceConnection serviceConnection) {
        p.t().x(serviceConnection);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(onAttach(F.d(context)));
        z.K(context).L(this);
        onCreate();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context getApplicationContext() {
        return F.f2112b;
    }

    public ComponentName getComponentName() {
        return new ComponentName(this, getClass());
    }

    public abstract IBinder onBind(Intent intent);

    public abstract boolean onUnbind(Intent intent);

    public final void stopSelf() {
        z.K(this).M(getComponentName());
    }

    public static void bind(Intent intent, ServiceConnection serviceConnection) {
        bind(intent, E.f2110b, serviceConnection);
    }

    public void onCreate() {
    }

    public void onDestroy() {
    }

    public Context onAttach(Context context) {
        return context;
    }

    public void onRebind(Intent intent) {
    }
}
