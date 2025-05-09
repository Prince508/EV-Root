package Y1;

import android.util.LongSparseArray;
import android.view.MotionEvent;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class K {

    /* renamed from: c, reason: collision with root package name */
    public static K f2484c;

    /* renamed from: a, reason: collision with root package name */
    public final LongSparseArray f2485a = new LongSparseArray();

    /* renamed from: b, reason: collision with root package name */
    public final PriorityQueue f2486b = new PriorityQueue();

    public static class a {

        /* renamed from: b, reason: collision with root package name */
        public static final AtomicLong f2487b = new AtomicLong(0);

        /* renamed from: a, reason: collision with root package name */
        public final long f2488a;

        public a(long j3) {
            this.f2488a = j3;
        }

        public static a b() {
            return c(f2487b.incrementAndGet());
        }

        public static a c(long j3) {
            return new a(j3);
        }

        public long d() {
            return this.f2488a;
        }
    }

    public static K a() {
        if (f2484c == null) {
            f2484c = new K();
        }
        return f2484c;
    }

    public MotionEvent b(a aVar) {
        while (!this.f2486b.isEmpty() && ((Long) this.f2486b.peek()).longValue() < aVar.f2488a) {
            this.f2485a.remove(((Long) this.f2486b.poll()).longValue());
        }
        if (!this.f2486b.isEmpty() && ((Long) this.f2486b.peek()).longValue() == aVar.f2488a) {
            this.f2486b.poll();
        }
        MotionEvent motionEvent = (MotionEvent) this.f2485a.get(aVar.f2488a);
        this.f2485a.remove(aVar.f2488a);
        return motionEvent;
    }

    public a c(MotionEvent motionEvent) {
        a b3 = a.b();
        this.f2485a.put(b3.f2488a, MotionEvent.obtain(motionEvent));
        this.f2486b.add(Long.valueOf(b3.f2488a));
        return b3;
    }
}
