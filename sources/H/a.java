package H;

import H.f;
import H.g;
import android.graphics.Typeface;
import android.os.Handler;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final g.c f593a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f594b;

    /* renamed from: H.a$a, reason: collision with other inner class name */
    public class RunnableC0014a implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ g.c f595e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Typeface f596f;

        public RunnableC0014a(g.c cVar, Typeface typeface) {
            this.f595e = cVar;
            this.f596f = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f595e.b(this.f596f);
        }
    }

    public class b implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ g.c f598e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f599f;

        public b(g.c cVar, int i3) {
            this.f598e = cVar;
            this.f599f = i3;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f598e.a(this.f599f);
        }
    }

    public a(g.c cVar, Handler handler) {
        this.f593a = cVar;
        this.f594b = handler;
    }

    public final void a(int i3) {
        this.f594b.post(new b(this.f593a, i3));
    }

    public void b(f.e eVar) {
        if (eVar.a()) {
            c(eVar.f623a);
        } else {
            a(eVar.f624b);
        }
    }

    public final void c(Typeface typeface) {
        this.f594b.post(new RunnableC0014a(this.f593a, typeface));
    }
}
