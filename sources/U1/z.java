package U1;

import U1.InterfaceC0293e;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.FileObserver;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.os.UserHandle;
import android.util.ArrayMap;
import android.util.SparseArray;
import java.io.File;
import java.lang.reflect.Constructor;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public class z extends InterfaceC0293e.a implements Runnable {

    /* renamed from: i, reason: collision with root package name */
    public static z f2182i;

    /* renamed from: e, reason: collision with root package name */
    public final FileObserver f2183e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f2184f = new ArrayMap();

    /* renamed from: g, reason: collision with root package name */
    public final SparseArray f2185g = new SparseArray();

    /* renamed from: h, reason: collision with root package name */
    public final boolean f2186h;

    public class a extends FileObserver {

        /* renamed from: a, reason: collision with root package name */
        public final String f2187a;

        public a(File file) {
            super(file.getParent(), 1984);
            file.getParent();
            this.f2187a = file.getName();
        }

        @Override // android.os.FileObserver
        public void onEvent(int i3, String str) {
            if (i3 == 1024 || this.f2187a.equals(str)) {
                z.this.J("Package updated");
            }
        }
    }

    public class b extends AbstractC0290b {

        /* renamed from: b, reason: collision with root package name */
        public final Messenger f2189b;

        /* renamed from: c, reason: collision with root package name */
        public final int f2190c;

        public b(IBinder iBinder, int i3) {
            super(iBinder);
            this.f2189b = new Messenger(iBinder);
            this.f2190c = i3;
        }

        @Override // U1.AbstractC0290b
        public void a() {
            z.this.f2185g.remove(this.f2190c);
            z.this.P(this.f2190c);
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final V1.b f2192a;

        /* renamed from: b, reason: collision with root package name */
        public final Set f2193b = F.i();

        /* renamed from: c, reason: collision with root package name */
        public Intent f2194c;

        /* renamed from: d, reason: collision with root package name */
        public IBinder f2195d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f2196e;

        public c(V1.b bVar) {
            this.f2192a = bVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public z(Context context) {
        T1.b.f2057f = System.getenv("LIBSU_VERBOSE_LOGGING") != null;
        F.f2112b = context;
        if (System.getenv("LIBSU_DEBUGGER") == null) {
            a aVar = new a(new File(context.getPackageCodePath()));
            this.f2183e = aVar;
            aVar.startWatching();
            if (!(context instanceof Callable)) {
                throw new IllegalArgumentException("Expected Context to be Callable");
            }
            try {
                Object[] objArr = (Object[]) ((Callable) context).call();
                boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
                this.f2186h = booleanValue;
                if (booleanValue) {
                    AbstractC0292d.a(AbstractCallableC0295g.a(context.getPackageName()), this);
                }
                c(((Integer) objArr[0]).intValue());
                if (booleanValue) {
                    return;
                }
                E.f2109a.postDelayed(this, 10000L);
                return;
            } catch (Exception e3) {
                throw new RuntimeException(e3);
            }
        }
        AbstractC0292d.c(context.getPackageName() + ":root");
        while (true) {
            try {
                Thread.sleep(200L);
            } catch (InterruptedException unused) {
            }
        }
    }

    public static /* synthetic */ void B(z zVar, ComponentName componentName) {
        zVar.getClass();
        componentName.getClassName();
        zVar.O(-1, componentName);
    }

    public static /* synthetic */ void D(z zVar, ComponentName componentName, int i3) {
        zVar.getClass();
        componentName.getClassName();
        zVar.O(i3, componentName);
    }

    public static z K(Context context) {
        if (f2182i == null) {
            f2182i = new z(context);
        }
        return f2182i;
    }

    public static /* synthetic */ void y(z zVar, ComponentName componentName, int i3) {
        zVar.getClass();
        componentName.getClassName();
        zVar.O(-1, componentName);
        zVar.c(i3);
    }

    public static /* synthetic */ void z(z zVar, IBinder[] iBinderArr, int i3, Intent intent) {
        zVar.getClass();
        try {
            iBinderArr[0] = zVar.H(i3, intent);
        } catch (Exception e3) {
            F.a("IPC", e3);
        }
    }

    public final IBinder H(int i3, Intent intent) {
        if (((b) this.f2185g.get(i3)) == null) {
            return null;
        }
        ComponentName component = intent.getComponent();
        c cVar = (c) this.f2184f.get(component);
        if (cVar == null) {
            Context context = F.f2112b;
            Constructor<?> declaredConstructor = context.getClassLoader().loadClass(component.getClassName()).getDeclaredConstructor(new Class[0]);
            declaredConstructor.setAccessible(true);
            AbstractC0292d.b(declaredConstructor.newInstance(new Object[0]), context);
            cVar = (c) this.f2184f.get(component);
            if (cVar == null) {
                return null;
            }
        }
        if (cVar.f2195d != null) {
            component.getClassName();
            if (cVar.f2196e) {
                cVar.f2192a.onRebind(cVar.f2194c);
            }
        } else {
            component.getClassName();
            cVar.f2195d = cVar.f2192a.onBind(intent);
            cVar.f2194c = intent.cloneFilter();
        }
        cVar.f2193b.add(Integer.valueOf(i3));
        return cVar.f2195d;
    }

    public final void I(int i3, IBinder iBinder) {
        if (this.f2185g.get(i3) != null) {
            return;
        }
        try {
            this.f2185g.put(i3, new b(iBinder, i3));
            E.f2109a.removeCallbacks(this);
        } catch (RemoteException e3) {
            F.a("IPC", e3);
        }
    }

    public final void J(String str) {
        System.exit(0);
    }

    public void L(V1.b bVar) {
        this.f2184f.put(bVar.getComponentName(), new c(bVar));
    }

    public void M(final ComponentName componentName) {
        E.a(new Runnable() { // from class: U1.u
            @Override // java.lang.Runnable
            public final void run() {
                z.B(z.this, componentName);
            }
        });
    }

    public final void N(c cVar, int i3, Runnable runnable) {
        boolean isEmpty = cVar.f2193b.isEmpty();
        cVar.f2193b.remove(Integer.valueOf(i3));
        if (i3 < 0 || cVar.f2193b.isEmpty()) {
            if (!isEmpty) {
                cVar.f2196e = cVar.f2192a.onUnbind(cVar.f2194c);
            }
            if (i3 < 0 || !this.f2186h) {
                cVar.f2192a.onDestroy();
                runnable.run();
                Iterator it = cVar.f2193b.iterator();
                while (it.hasNext()) {
                    b bVar = (b) this.f2185g.get(((Integer) it.next()).intValue());
                    if (bVar != null) {
                        Message obtain = Message.obtain();
                        obtain.what = 1;
                        obtain.arg1 = this.f2186h ? 1 : 0;
                        obtain.obj = cVar.f2194c.getComponent();
                        try {
                            try {
                                bVar.f2189b.send(obtain);
                            } catch (RemoteException e3) {
                                F.a("IPC", e3);
                            }
                        } finally {
                            obtain.recycle();
                        }
                    }
                }
            }
        }
        if (this.f2184f.isEmpty()) {
            J("No active services");
        }
    }

    public final void O(int i3, final ComponentName componentName) {
        c cVar = (c) this.f2184f.get(componentName);
        if (cVar == null) {
            return;
        }
        N(cVar, i3, new Runnable() { // from class: U1.x
            @Override // java.lang.Runnable
            public final void run() {
                z.this.f2184f.remove(componentName);
            }
        });
    }

    public final void P(int i3) {
        final Iterator it = this.f2184f.entrySet().iterator();
        while (it.hasNext()) {
            c cVar = (c) ((Map.Entry) it.next()).getValue();
            if (i3 < 0) {
                cVar.f2193b.clear();
            }
            N(cVar, i3, new Runnable() { // from class: U1.y
                @Override // java.lang.Runnable
                public final void run() {
                    it.remove();
                }
            });
        }
    }

    @Override // U1.InterfaceC0293e
    public void a(final ComponentName componentName) {
        final int callingUid = Binder.getCallingUid();
        E.a(new Runnable() { // from class: U1.s
            @Override // java.lang.Runnable
            public final void run() {
                z.D(z.this, componentName, callingUid);
            }
        });
    }

    @Override // U1.InterfaceC0293e
    public void c(int i3) {
        if (Binder.getCallingUid() != 0) {
            i3 = Binder.getCallingUid();
        }
        F.f2112b.sendBroadcastAsUser(p.s(this, this.f2186h), UserHandle.getUserHandleForUid(i3));
    }

    @Override // U1.InterfaceC0293e
    public void f(final ComponentName componentName, final int i3) {
        if (Binder.getCallingUid() != 0) {
            i3 = Binder.getCallingUid();
        }
        E.a(new Runnable() { // from class: U1.w
            @Override // java.lang.Runnable
            public final void run() {
                z.y(z.this, componentName, i3);
            }
        });
    }

    @Override // U1.InterfaceC0293e
    public void n(final IBinder iBinder) {
        final int callingUid = Binder.getCallingUid();
        E.a(new Runnable() { // from class: U1.t
            @Override // java.lang.Runnable
            public final void run() {
                z.this.I(callingUid, iBinder);
            }
        });
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f2185g.size() == 0) {
            J("No active clients");
        }
    }

    @Override // U1.InterfaceC0293e
    public IBinder t(final Intent intent) {
        final IBinder[] iBinderArr = new IBinder[1];
        final int callingUid = Binder.getCallingUid();
        E.b(new Runnable() { // from class: U1.v
            @Override // java.lang.Runnable
            public final void run() {
                z.z(z.this, iBinderArr, callingUid, intent);
            }
        });
        return iBinderArr[0];
    }
}
