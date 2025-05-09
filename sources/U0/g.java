package U0;

import U0.g;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Phaser;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public interface g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f2092a = new g() { // from class: U0.e
        @Override // U0.g
        public final void b(h hVar) {
            hVar.a().run();
        }
    };

    /* renamed from: b, reason: collision with root package name */
    public static final g f2093b = new a();

    public class a implements g {

        /* renamed from: c, reason: collision with root package name */
        public final int f2094c = Math.min(32, Runtime.getRuntime().availableProcessors());

        /* renamed from: d, reason: collision with root package name */
        public final int f2095d = 4;

        public static /* synthetic */ void c(h hVar, Phaser phaser) {
            hVar.a().run();
            phaser.arriveAndDeregister();
        }

        @Override // U0.g
        public void b(final h hVar) {
            int i3 = this.f2094c;
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i3, i3, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(4), new ThreadPoolExecutor.CallerRunsPolicy());
            final Phaser phaser = new Phaser(1);
            for (int i4 = 0; i4 < this.f2094c; i4++) {
                Runnable runnable = new Runnable() { // from class: U0.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        g.a.c(h.this, phaser);
                    }
                };
                phaser.register();
                threadPoolExecutor.execute(runnable);
            }
            phaser.arriveAndAwaitAdvance();
            threadPoolExecutor.shutdownNow();
        }
    }

    void b(h hVar);
}
