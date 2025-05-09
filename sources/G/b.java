package G;

import android.os.CancellationSignal;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public boolean f563a;

    /* renamed from: b, reason: collision with root package name */
    public a f564b;

    /* renamed from: c, reason: collision with root package name */
    public Object f565c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f566d;

    public interface a {
        void a();
    }

    public void a() {
        synchronized (this) {
            try {
                if (this.f563a) {
                    return;
                }
                this.f563a = true;
                this.f566d = true;
                a aVar = this.f564b;
                Object obj = this.f565c;
                if (aVar != null) {
                    try {
                        aVar.a();
                    } catch (Throwable th) {
                        synchronized (this) {
                            this.f566d = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                if (obj != null) {
                    ((CancellationSignal) obj).cancel();
                }
                synchronized (this) {
                    this.f566d = false;
                    notifyAll();
                }
            } finally {
            }
        }
    }

    public void b(a aVar) {
        synchronized (this) {
            try {
                c();
                if (this.f564b == aVar) {
                    return;
                }
                this.f564b = aVar;
                if (this.f563a && aVar != null) {
                    aVar.a();
                }
            } finally {
            }
        }
    }

    public final void c() {
        while (this.f566d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }
}
