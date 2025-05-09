package U1;

/* loaded from: classes.dex */
public final class G implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public Runnable f2113e;

    public G(Runnable runnable) {
        this.f2113e = runnable;
    }

    public synchronized void a() {
        while (this.f2113e != null) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    @Override // java.lang.Runnable
    public synchronized void run() {
        this.f2113e.run();
        this.f2113e = null;
        notifyAll();
    }
}
