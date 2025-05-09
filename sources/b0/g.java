package B0;

import C2.k;
import android.content.Context;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import q2.n;
import z0.j;

/* loaded from: classes.dex */
public final class g implements J.a, Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final Context f64a;

    /* renamed from: b, reason: collision with root package name */
    public final ReentrantLock f65b;

    /* renamed from: c, reason: collision with root package name */
    public j f66c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f67d;

    public g(Context context) {
        k.e(context, "context");
        this.f64a = context;
        this.f65b = new ReentrantLock();
        this.f67d = new LinkedHashSet();
    }

    @Override // J.a, androidx.window.extensions.core.util.function.Consumer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void accept(WindowLayoutInfo windowLayoutInfo) {
        k.e(windowLayoutInfo, "value");
        ReentrantLock reentrantLock = this.f65b;
        reentrantLock.lock();
        try {
            this.f66c = f.f63a.b(this.f64a, windowLayoutInfo);
            Iterator it = this.f67d.iterator();
            while (it.hasNext()) {
                ((J.a) it.next()).accept(this.f66c);
            }
            n nVar = n.f8874a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void b(J.a aVar) {
        k.e(aVar, "listener");
        ReentrantLock reentrantLock = this.f65b;
        reentrantLock.lock();
        try {
            j jVar = this.f66c;
            if (jVar != null) {
                aVar.accept(jVar);
            }
            this.f67d.add(aVar);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final boolean c() {
        return this.f67d.isEmpty();
    }

    public final void d(J.a aVar) {
        k.e(aVar, "listener");
        ReentrantLock reentrantLock = this.f65b;
        reentrantLock.lock();
        try {
            this.f67d.remove(aVar);
        } finally {
            reentrantLock.unlock();
        }
    }
}
