package c1;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: c1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0376d {

    /* renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f4743a = Executors.newScheduledThreadPool(1);

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue f4744b = new ConcurrentLinkedQueue();

    /* renamed from: c, reason: collision with root package name */
    public boolean f4745c = false;

    public void b(Runnable runnable) {
        this.f4744b.offer(runnable);
    }

    public final void c() {
        while (!this.f4744b.isEmpty()) {
            Runnable runnable = (Runnable) this.f4744b.poll();
            if (runnable != null) {
                try {
                    runnable.run();
                    Thread.sleep(10L);
                } catch (Exception e3) {
                    AbstractC0382j.c(e3);
                }
            }
        }
    }

    public void d() {
        if (this.f4745c) {
            return;
        }
        this.f4745c = true;
        this.f4743a.scheduleWithFixedDelay(new Runnable() { // from class: c1.c
            @Override // java.lang.Runnable
            public final void run() {
                C0376d.this.c();
            }
        }, 0L, 100L, TimeUnit.MILLISECONDS);
    }

    public void e() {
        this.f4745c = false;
        this.f4743a.shutdown();
    }
}
