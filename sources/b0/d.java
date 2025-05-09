package B0;

import B2.l;
import C2.j;
import C2.k;
import C2.u;
import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import q2.n;
import r2.AbstractC0700m;
import w0.d;

/* loaded from: classes.dex */
public final class d implements A0.a {

    /* renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f53a;

    /* renamed from: b, reason: collision with root package name */
    public final w0.d f54b;

    /* renamed from: c, reason: collision with root package name */
    public final ReentrantLock f55c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f56d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f57e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f58f;

    public /* synthetic */ class a extends j implements l {
        public a(Object obj) {
            super(1, obj, g.class, "accept", "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", 0);
        }

        @Override // B2.l
        public /* bridge */ /* synthetic */ Object j(Object obj) {
            n((WindowLayoutInfo) obj);
            return n.f8874a;
        }

        public final void n(WindowLayoutInfo windowLayoutInfo) {
            k.e(windowLayoutInfo, "p0");
            ((g) this.f300f).accept(windowLayoutInfo);
        }
    }

    public d(WindowLayoutComponent windowLayoutComponent, w0.d dVar) {
        k.e(windowLayoutComponent, "component");
        k.e(dVar, "consumerAdapter");
        this.f53a = windowLayoutComponent;
        this.f54b = dVar;
        this.f55c = new ReentrantLock();
        this.f56d = new LinkedHashMap();
        this.f57e = new LinkedHashMap();
        this.f58f = new LinkedHashMap();
    }

    @Override // A0.a
    public void a(J.a aVar) {
        k.e(aVar, "callback");
        ReentrantLock reentrantLock = this.f55c;
        reentrantLock.lock();
        try {
            Context context = (Context) this.f57e.get(aVar);
            if (context == null) {
                reentrantLock.unlock();
                return;
            }
            g gVar = (g) this.f56d.get(context);
            if (gVar == null) {
                reentrantLock.unlock();
                return;
            }
            gVar.d(aVar);
            this.f57e.remove(aVar);
            if (gVar.c()) {
                this.f56d.remove(context);
                d.b bVar = (d.b) this.f58f.remove(gVar);
                if (bVar != null) {
                    bVar.a();
                }
            }
            n nVar = n.f8874a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // A0.a
    public void b(Context context, Executor executor, J.a aVar) {
        n nVar;
        k.e(context, "context");
        k.e(executor, "executor");
        k.e(aVar, "callback");
        ReentrantLock reentrantLock = this.f55c;
        reentrantLock.lock();
        try {
            g gVar = (g) this.f56d.get(context);
            if (gVar != null) {
                gVar.b(aVar);
                this.f57e.put(aVar, context);
                nVar = n.f8874a;
            } else {
                nVar = null;
            }
            if (nVar == null) {
                g gVar2 = new g(context);
                this.f56d.put(context, gVar2);
                this.f57e.put(aVar, context);
                gVar2.b(aVar);
                if (!(context instanceof Activity)) {
                    gVar2.accept(new WindowLayoutInfo(AbstractC0700m.f()));
                    reentrantLock.unlock();
                    return;
                } else {
                    this.f58f.put(gVar2, this.f54b.c(this.f53a, u.b(WindowLayoutInfo.class), "addWindowLayoutInfoListener", "removeWindowLayoutInfoListener", (Activity) context, new a(gVar2)));
                }
            }
            n nVar2 = n.f8874a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
