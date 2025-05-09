package U1;

import T1.b;
import U1.InterfaceC0293e;
import U1.p;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import android.util.ArrayMap;
import android.util.Pair;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class p implements Handler.Callback {

    /* renamed from: g, reason: collision with root package name */
    public static p f2146g;

    /* renamed from: a, reason: collision with root package name */
    public d f2147a;

    /* renamed from: b, reason: collision with root package name */
    public d f2148b;

    /* renamed from: c, reason: collision with root package name */
    public int f2149c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final List f2150d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final Map f2151e = new ArrayMap();

    /* renamed from: f, reason: collision with root package name */
    public final Map f2152f = new ArrayMap();

    public interface a {
        boolean run();
    }

    public static class b extends Pair {
        public b(e eVar, Executor executor) {
            super(eVar, executor);
        }

        public void b(final ServiceConnection serviceConnection) {
            ((Executor) ((Pair) this).second).execute(new Runnable() { // from class: U1.q
                @Override // java.lang.Runnable
                public final void run() {
                    serviceConnection.onServiceDisconnected(((p.e) ((Pair) p.b.this).first).f2155a.a());
                }
            });
        }

        public e c() {
            return (e) ((Pair) this).first;
        }
    }

    public interface c {
        boolean a(e eVar);
    }

    public class d extends AbstractC0290b {

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC0293e f2153b;

        public d(InterfaceC0293e interfaceC0293e) {
            super(interfaceC0293e.asBinder());
            this.f2153b = interfaceC0293e;
        }

        public static /* synthetic */ boolean b(d dVar, e eVar) {
            dVar.getClass();
            return eVar.f2157c == dVar;
        }

        @Override // U1.AbstractC0290b
        public void a() {
            if (p.this.f2147a == this) {
                p.this.f2147a = null;
            }
            if (p.this.f2148b == this) {
                p.this.f2148b = null;
            }
            Iterator it = p.this.f2151e.values().iterator();
            while (it.hasNext()) {
                if (((e) it.next()).f2157c == this) {
                    it.remove();
                }
            }
            p.this.q(new c() { // from class: U1.r
                @Override // U1.p.c
                public final boolean a(p.e eVar) {
                    return p.d.b(p.d.this, eVar);
                }
            });
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public final f f2155a;

        /* renamed from: b, reason: collision with root package name */
        public final IBinder f2156b;

        /* renamed from: c, reason: collision with root package name */
        public final d f2157c;

        /* renamed from: d, reason: collision with root package name */
        public int f2158d = 1;

        public e(f fVar, IBinder iBinder, d dVar) {
            this.f2155a = fVar;
            this.f2156b = iBinder;
            this.f2157c = dVar;
        }
    }

    public static class f extends Pair {
        public f(ComponentName componentName, boolean z3) {
            super(componentName, Boolean.valueOf(z3));
        }

        public ComponentName a() {
            return (ComponentName) ((Pair) this).first;
        }

        public boolean b() {
            return ((Boolean) ((Pair) this).second).booleanValue();
        }
    }

    public class g extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        public final Messenger f2159a;

        public g() {
            this.f2159a = new Messenger(new Handler(Looper.getMainLooper(), p.this));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IBinder binder;
            Bundle bundleExtra = intent.getBundleExtra("extra.bundle");
            if (bundleExtra == null || (binder = bundleExtra.getBinder("binder")) == null) {
                return;
            }
            InterfaceC0293e x3 = InterfaceC0293e.a.x(binder);
            try {
                x3.n(this.f2159a.getBinder());
                d dVar = p.this.new d(x3);
                if (intent.getBooleanExtra("extra.daemon", false)) {
                    p.this.f2148b = dVar;
                    p.l(p.this, -3);
                } else {
                    p.this.f2147a = dVar;
                    p.l(p.this, -2);
                }
                for (int size = p.this.f2150d.size() - 1; size >= 0; size--) {
                    if (((a) p.this.f2150d.get(size)).run()) {
                        p.this.f2150d.remove(size);
                    }
                }
            } catch (RemoteException e3) {
                F.a("IPC", e3);
            }
        }
    }

    public static /* synthetic */ void d(Context context, String str, ComponentName componentName, OutputStream outputStream, InputStream inputStream, InputStream inputStream2) {
        Context e3 = F.e();
        File file = new File(e3.getCacheDir(), "main.jar");
        InputStream open = e3.getResources().getAssets().open("main.jar");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                F.j(open, fileOutputStream);
                fileOutputStream.close();
                if (open != null) {
                    open.close();
                }
                StringBuilder sb = new StringBuilder();
                String str2 = "";
                sb.append("");
                sb.append(" -Xnoimage-dex2oat");
                String sb2 = sb.toString();
                str.getClass();
                if (str.equals("daemon")) {
                    str2 = "--nice-name=" + e3.getPackageName() + ":root:daemon";
                } else if (str.equals("start")) {
                    str2 = String.format(Locale.ROOT, "--nice-name=%s:root:%d", e3.getPackageName(), Integer.valueOf(Process.myUid() / 100000));
                }
                String str3 = str2;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("/system/bin/app_process");
                sb3.append(F.g() ? "64" : "32");
                outputStream.write(String.format(Locale.ROOT, "(%s CLASSPATH=%s %s %s /system/bin %s com.topjohnwu.superuser.internal.RootServerMain '%s' %d %s >/dev/null 2>&1)&", "", file, sb3.toString(), sb2, str3, componentName.flattenToString(), Integer.valueOf(Process.myUid()), str).getBytes(StandardCharsets.UTF_8));
                outputStream.write(10);
                outputStream.flush();
            } finally {
            }
        } finally {
        }
    }

    public static /* synthetic */ boolean e(p pVar, Intent intent, Executor executor, ServiceConnection serviceConnection) {
        return pVar.n(intent, executor, serviceConnection) == null;
    }

    public static /* synthetic */ int l(p pVar, int i3) {
        int i4 = i3 & pVar.f2149c;
        pVar.f2149c = i4;
        return i4;
    }

    public static void r() {
        if (!T1.c.c()) {
            throw new IllegalStateException("This method can only be called on the main thread");
        }
    }

    public static Intent s(IBinder iBinder, boolean z3) {
        Bundle bundle = new Bundle();
        bundle.putBinder("binder", iBinder);
        return new Intent("com.topjohnwu.superuser.RECEIVER_BROADCAST").setPackage(F.c().getPackageName()).addFlags(AbstractC0292d.f2123d).putExtra("extra.daemon", z3).putExtra("extra.bundle", bundle);
    }

    public static p t() {
        if (f2146g == null) {
            f2146g = new p();
        }
        return f2146g;
    }

    public static f v(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            throw new IllegalArgumentException("The intent does not have a component set");
        }
        if (component.getPackageName().equals(F.c().getPackageName())) {
            return new f(component, intent.hasCategory(V1.b.CATEGORY_DAEMON_MODE));
        }
        throw new IllegalArgumentException("RootServices outside of the app are not supported");
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what == 1) {
            u(new f((ComponentName) message.obj, message.arg1 != 0));
        }
        return false;
    }

    public final f n(Intent intent, Executor executor, final ServiceConnection serviceConnection) {
        r();
        final f v3 = v(intent);
        e eVar = (e) this.f2151e.get(v3);
        if (eVar != null) {
            this.f2152f.put(serviceConnection, new b(eVar, executor));
            eVar.f2158d++;
            final IBinder iBinder = eVar.f2156b;
            executor.execute(new Runnable() { // from class: U1.m
                @Override // java.lang.Runnable
                public final void run() {
                    serviceConnection.onServiceConnected(v3.a(), iBinder);
                }
            });
            return null;
        }
        d dVar = v3.b() ? this.f2148b : this.f2147a;
        if (dVar == null) {
            return v3;
        }
        try {
            final IBinder t3 = dVar.f2153b.t(intent);
            if (t3 != null) {
                e eVar2 = new e(v3, t3, dVar);
                this.f2152f.put(serviceConnection, new b(eVar2, executor));
                this.f2151e.put(v3, eVar2);
                executor.execute(new Runnable() { // from class: U1.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        serviceConnection.onServiceConnected(v3.a(), t3);
                    }
                });
            } else if (Build.VERSION.SDK_INT >= 28) {
                executor.execute(new Runnable() { // from class: U1.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        serviceConnection.onNullBinding(v3.a());
                    }
                });
            }
            return null;
        } catch (RemoteException e3) {
            F.a("IPC", e3);
            dVar.binderDied();
            return v3;
        }
    }

    public b.c o(final Intent intent, final Executor executor, final ServiceConnection serviceConnection) {
        f n3 = n(intent, executor, serviceConnection);
        if (n3 == null) {
            return null;
        }
        this.f2150d.add(new a() { // from class: U1.k
            @Override // U1.p.a
            public final boolean run() {
                return p.e(p.this, intent, executor, serviceConnection);
            }
        });
        int i3 = n3.b() ? 2 : 1;
        int i4 = this.f2149c;
        if ((i4 & i3) != 0) {
            return null;
        }
        this.f2149c = i3 | i4;
        return w(n3.a(), n3.b() ? "daemon" : "start");
    }

    public b.c p(Intent intent) {
        r();
        f v3 = v(intent);
        d dVar = v3.b() ? this.f2148b : this.f2147a;
        if (dVar == null) {
            if (v3.b()) {
                return w(v3.a(), "stop");
            }
            return null;
        }
        try {
            dVar.f2153b.f(v3.a(), -1);
        } catch (RemoteException e3) {
            F.a("IPC", e3);
        }
        u(v3);
        return null;
    }

    public final void q(c cVar) {
        Iterator it = this.f2152f.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            b bVar = (b) entry.getValue();
            if (cVar.a(bVar.c())) {
                bVar.b((ServiceConnection) entry.getKey());
                it.remove();
            }
        }
    }

    public final void u(f fVar) {
        final e eVar = (e) this.f2151e.remove(fVar);
        if (eVar != null) {
            q(new c() { // from class: U1.j
                @Override // U1.p.c
                public final boolean a(p.e eVar2) {
                    return p.e.this.equals(eVar2);
                }
            });
        }
    }

    public final b.c w(final ComponentName componentName, final String str) {
        final Context c3 = F.c();
        if ((this.f2149c & 4) == 0) {
            IntentFilter intentFilter = new IntentFilter("com.topjohnwu.superuser.RECEIVER_BROADCAST");
            if (Build.VERSION.SDK_INT >= 26) {
                c3.registerReceiver(new g(), intentFilter, "android.permission.BROADCAST_PACKAGE_REMOVED", null, 4);
            } else {
                c3.registerReceiver(new g(), intentFilter, "android.permission.BROADCAST_PACKAGE_REMOVED", null);
            }
            this.f2149c |= 4;
        }
        return new b.c() { // from class: U1.l
            @Override // T1.b.c
            public final void a(OutputStream outputStream, InputStream inputStream, InputStream inputStream2) {
                p.d(c3, str, componentName, outputStream, inputStream, inputStream2);
            }
        };
    }

    public void x(ServiceConnection serviceConnection) {
        r();
        b bVar = (b) this.f2152f.remove(serviceConnection);
        if (bVar != null) {
            e c3 = bVar.c();
            int i3 = c3.f2158d - 1;
            c3.f2158d = i3;
            if (i3 == 0) {
                this.f2151e.remove(c3.f2155a);
                try {
                    c3.f2157c.f2153b.a(c3.f2155a.a());
                } catch (RemoteException e3) {
                    F.a("IPC", e3);
                }
            }
            bVar.b(serviceConnection);
        }
    }
}
