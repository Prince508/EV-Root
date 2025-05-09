package androidx.lifecycle;

import java.util.Map;
import n.b;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f4005j = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f4006a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public n.b f4007b = new n.b();

    /* renamed from: c, reason: collision with root package name */
    public int f4008c = 0;

    /* renamed from: d, reason: collision with root package name */
    public volatile Object f4009d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f4010e;

    /* renamed from: f, reason: collision with root package name */
    public int f4011f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4012g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4013h;

    /* renamed from: i, reason: collision with root package name */
    public final Runnable f4014i;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (o.this.f4006a) {
                obj = o.this.f4010e;
                o.this.f4010e = o.f4005j;
            }
            o.this.e(obj);
        }
    }

    public abstract class b {

        /* renamed from: a, reason: collision with root package name */
        public final r f4016a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f4017b;

        /* renamed from: c, reason: collision with root package name */
        public int f4018c;

        public abstract void a(boolean z3);

        public abstract void b();

        public abstract boolean c();
    }

    public o() {
        Object obj = f4005j;
        this.f4010e = obj;
        this.f4014i = new a();
        this.f4009d = obj;
        this.f4011f = -1;
    }

    public static void a(String str) {
        if (m.c.f().b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    public final void b(b bVar) {
        if (bVar.f4017b) {
            if (!bVar.c()) {
                bVar.a(false);
                return;
            }
            int i3 = bVar.f4018c;
            int i4 = this.f4011f;
            if (i3 >= i4) {
                return;
            }
            bVar.f4018c = i4;
            bVar.f4016a.a(this.f4009d);
        }
    }

    public void c(b bVar) {
        if (this.f4012g) {
            this.f4013h = true;
            return;
        }
        this.f4012g = true;
        do {
            this.f4013h = false;
            b.d l3 = this.f4007b.l();
            while (l3.hasNext()) {
                b((b) ((Map.Entry) l3.next()).getValue());
                if (this.f4013h) {
                    break;
                }
            }
        } while (this.f4013h);
        this.f4012g = false;
    }

    public void d(r rVar) {
        a("removeObserver");
    }

    public void e(Object obj) {
        a("setValue");
        this.f4011f++;
        this.f4009d = obj;
        c(null);
    }
}
