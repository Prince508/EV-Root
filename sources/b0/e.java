package B0;

import C2.k;
import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import q2.n;

/* loaded from: classes.dex */
public final class e implements A0.a {

    /* renamed from: a, reason: collision with root package name */
    public final WindowLayoutComponent f59a;

    /* renamed from: b, reason: collision with root package name */
    public final ReentrantLock f60b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f61c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f62d;

    public e(WindowLayoutComponent windowLayoutComponent) {
        k.e(windowLayoutComponent, "component");
        this.f59a = windowLayoutComponent;
        this.f60b = new ReentrantLock();
        this.f61c = new LinkedHashMap();
        this.f62d = new LinkedHashMap();
    }

    @Override // A0.a
    public void a(J.a aVar) {
        k.e(aVar, "callback");
        ReentrantLock reentrantLock = this.f60b;
        reentrantLock.lock();
        try {
            Context context = (Context) this.f62d.get(aVar);
            if (context == null) {
                reentrantLock.unlock();
                return;
            }
            g gVar = (g) this.f61c.get(context);
            if (gVar == null) {
                reentrantLock.unlock();
                return;
            }
            gVar.d(aVar);
            this.f62d.remove(aVar);
            if (gVar.c()) {
                this.f61c.remove(context);
                this.f59a.removeWindowLayoutInfoListener(gVar);
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
        ReentrantLock reentrantLock = this.f60b;
        reentrantLock.lock();
        try {
            g gVar = (g) this.f61c.get(context);
            if (gVar != null) {
                gVar.b(aVar);
                this.f62d.put(aVar, context);
                nVar = n.f8874a;
            } else {
                nVar = null;
            }
            if (nVar == null) {
                g gVar2 = new g(context);
                this.f61c.put(context, gVar2);
                this.f62d.put(aVar, context);
                gVar2.b(aVar);
                this.f59a.addWindowLayoutInfoListener(context, gVar2);
            }
            n nVar2 = n.f8874a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
