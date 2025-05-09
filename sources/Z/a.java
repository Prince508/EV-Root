package Z;

import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
import o.g;

/* loaded from: classes.dex */
public class a {

    /* renamed from: g, reason: collision with root package name */
    public static final ThreadLocal f2552g = new ThreadLocal();

    /* renamed from: d, reason: collision with root package name */
    public c f2556d;

    /* renamed from: a, reason: collision with root package name */
    public final g f2553a = new g();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f2554b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final C0070a f2555c = new C0070a();

    /* renamed from: e, reason: collision with root package name */
    public long f2557e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2558f = false;

    /* renamed from: Z.a$a, reason: collision with other inner class name */
    public class C0070a {
        public C0070a() {
        }

        public void a() {
            a.this.f2557e = SystemClock.uptimeMillis();
            a aVar = a.this;
            aVar.c(aVar.f2557e);
            if (a.this.f2554b.size() > 0) {
                a.this.e().a();
            }
        }
    }

    public interface b {
        boolean a(long j3);
    }

    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        public final C0070a f2560a;

        public c(C0070a c0070a) {
            this.f2560a = c0070a;
        }

        public abstract void a();
    }

    public static class d extends c {

        /* renamed from: b, reason: collision with root package name */
        public final Choreographer f2561b;

        /* renamed from: c, reason: collision with root package name */
        public final Choreographer.FrameCallback f2562c;

        /* renamed from: Z.a$d$a, reason: collision with other inner class name */
        public class ChoreographerFrameCallbackC0071a implements Choreographer.FrameCallback {
            public ChoreographerFrameCallbackC0071a() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j3) {
                d.this.f2560a.a();
            }
        }

        public d(C0070a c0070a) {
            super(c0070a);
            this.f2561b = Choreographer.getInstance();
            this.f2562c = new ChoreographerFrameCallbackC0071a();
        }

        @Override // Z.a.c
        public void a() {
            this.f2561b.postFrameCallback(this.f2562c);
        }
    }

    public static a d() {
        ThreadLocal threadLocal = f2552g;
        if (threadLocal.get() == null) {
            threadLocal.set(new a());
        }
        return (a) threadLocal.get();
    }

    public void a(b bVar, long j3) {
        if (this.f2554b.size() == 0) {
            e().a();
        }
        if (!this.f2554b.contains(bVar)) {
            this.f2554b.add(bVar);
        }
        if (j3 > 0) {
            this.f2553a.put(bVar, Long.valueOf(SystemClock.uptimeMillis() + j3));
        }
    }

    public final void b() {
        if (this.f2558f) {
            for (int size = this.f2554b.size() - 1; size >= 0; size--) {
                if (this.f2554b.get(size) == null) {
                    this.f2554b.remove(size);
                }
            }
            this.f2558f = false;
        }
    }

    public void c(long j3) {
        long uptimeMillis = SystemClock.uptimeMillis();
        for (int i3 = 0; i3 < this.f2554b.size(); i3++) {
            b bVar = (b) this.f2554b.get(i3);
            if (bVar != null && f(bVar, uptimeMillis)) {
                bVar.a(j3);
            }
        }
        b();
    }

    public c e() {
        if (this.f2556d == null) {
            this.f2556d = new d(this.f2555c);
        }
        return this.f2556d;
    }

    public final boolean f(b bVar, long j3) {
        Long l3 = (Long) this.f2553a.get(bVar);
        if (l3 == null) {
            return true;
        }
        if (l3.longValue() >= j3) {
            return false;
        }
        this.f2553a.remove(bVar);
        return true;
    }

    public void g(b bVar) {
        this.f2553a.remove(bVar);
        int indexOf = this.f2554b.indexOf(bVar);
        if (indexOf >= 0) {
            this.f2554b.set(indexOf, null);
            this.f2558f = true;
        }
    }
}
