package androidx.window.layout.adapter.sidecar;

import C2.g;
import C2.k;
import android.app.Activity;
import android.content.Context;
import androidx.window.layout.adapter.sidecar.a;
import androidx.window.layout.adapter.sidecar.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import q2.n;
import r2.AbstractC0700m;
import z0.j;

/* loaded from: classes.dex */
public final class b implements A0.a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile b f4655d;

    /* renamed from: a, reason: collision with root package name */
    public androidx.window.layout.adapter.sidecar.a f4657a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f4658b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public static final a f4654c = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public static final ReentrantLock f4656e = new ReentrantLock();

    public static final class a {
        public /* synthetic */ a(g gVar) {
            this();
        }

        public final b a(Context context) {
            k.e(context, "context");
            if (b.f4655d == null) {
                ReentrantLock reentrantLock = b.f4656e;
                reentrantLock.lock();
                try {
                    if (b.f4655d == null) {
                        b.f4655d = new b(b.f4654c.b(context));
                    }
                    n nVar = n.f8874a;
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            b bVar = b.f4655d;
            k.b(bVar);
            return bVar;
        }

        public final androidx.window.layout.adapter.sidecar.a b(Context context) {
            k.e(context, "context");
            try {
                if (c(SidecarCompat.f4642f.c())) {
                    SidecarCompat sidecarCompat = new SidecarCompat(context);
                    if (sidecarCompat.l()) {
                        return sidecarCompat;
                    }
                    return null;
                }
            } catch (Throwable unused) {
            }
            return null;
        }

        public final boolean c(w0.k kVar) {
            return kVar != null && kVar.compareTo(w0.k.f9940j.a()) >= 0;
        }

        public a() {
        }
    }

    /* renamed from: androidx.window.layout.adapter.sidecar.b$b, reason: collision with other inner class name */
    public final class C0101b implements a.InterfaceC0100a {
        public C0101b() {
        }

        @Override // androidx.window.layout.adapter.sidecar.a.InterfaceC0100a
        public void a(Activity activity, j jVar) {
            k.e(activity, "activity");
            k.e(jVar, "newLayout");
            Iterator it = b.this.g().iterator();
            while (it.hasNext()) {
                c cVar = (c) it.next();
                if (k.a(cVar.d(), activity)) {
                    cVar.b(jVar);
                }
            }
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final Activity f4660a;

        /* renamed from: b, reason: collision with root package name */
        public final Executor f4661b;

        /* renamed from: c, reason: collision with root package name */
        public final J.a f4662c;

        /* renamed from: d, reason: collision with root package name */
        public j f4663d;

        public c(Activity activity, Executor executor, J.a aVar) {
            k.e(activity, "activity");
            k.e(executor, "executor");
            k.e(aVar, "callback");
            this.f4660a = activity;
            this.f4661b = executor;
            this.f4662c = aVar;
        }

        public static final void c(c cVar, j jVar) {
            k.e(cVar, "this$0");
            k.e(jVar, "$newLayoutInfo");
            cVar.f4662c.accept(jVar);
        }

        public final void b(final j jVar) {
            k.e(jVar, "newLayoutInfo");
            this.f4663d = jVar;
            this.f4661b.execute(new Runnable() { // from class: C0.b
                @Override // java.lang.Runnable
                public final void run() {
                    b.c.c(b.c.this, jVar);
                }
            });
        }

        public final Activity d() {
            return this.f4660a;
        }

        public final J.a e() {
            return this.f4662c;
        }

        public final j f() {
            return this.f4663d;
        }
    }

    public b(androidx.window.layout.adapter.sidecar.a aVar) {
        this.f4657a = aVar;
        androidx.window.layout.adapter.sidecar.a aVar2 = this.f4657a;
        if (aVar2 != null) {
            aVar2.a(new C0101b());
        }
    }

    @Override // A0.a
    public void a(J.a aVar) {
        k.e(aVar, "callback");
        synchronized (f4656e) {
            try {
                if (this.f4657a == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = this.f4658b.iterator();
                while (it.hasNext()) {
                    c cVar = (c) it.next();
                    if (cVar.e() == aVar) {
                        k.d(cVar, "callbackWrapper");
                        arrayList.add(cVar);
                    }
                }
                this.f4658b.removeAll(arrayList);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    f(((c) it2.next()).d());
                }
                n nVar = n.f8874a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // A0.a
    public void b(Context context, Executor executor, J.a aVar) {
        Object obj;
        k.e(context, "context");
        k.e(executor, "executor");
        k.e(aVar, "callback");
        n nVar = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null) {
            ReentrantLock reentrantLock = f4656e;
            reentrantLock.lock();
            try {
                androidx.window.layout.adapter.sidecar.a aVar2 = this.f4657a;
                if (aVar2 == null) {
                    aVar.accept(new j(AbstractC0700m.f()));
                    return;
                }
                boolean h3 = h(activity);
                c cVar = new c(activity, executor, aVar);
                this.f4658b.add(cVar);
                if (h3) {
                    Iterator it = this.f4658b.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it.next();
                            if (k.a(activity, ((c) obj).d())) {
                                break;
                            }
                        }
                    }
                    c cVar2 = (c) obj;
                    j f3 = cVar2 != null ? cVar2.f() : null;
                    if (f3 != null) {
                        cVar.b(f3);
                    }
                } else {
                    aVar2.c(activity);
                }
                n nVar2 = n.f8874a;
                reentrantLock.unlock();
                nVar = n.f8874a;
            } finally {
                reentrantLock.unlock();
            }
        }
        if (nVar == null) {
            aVar.accept(new j(AbstractC0700m.f()));
        }
    }

    public final void f(Activity activity) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f4658b;
        if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                if (k.a(((c) it.next()).d(), activity)) {
                    return;
                }
            }
        }
        androidx.window.layout.adapter.sidecar.a aVar = this.f4657a;
        if (aVar != null) {
            aVar.b(activity);
        }
    }

    public final CopyOnWriteArrayList g() {
        return this.f4658b;
    }

    public final boolean h(Activity activity) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f4658b;
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            if (k.a(((c) it.next()).d(), activity)) {
                return true;
            }
        }
        return false;
    }
}
