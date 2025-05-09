package b;

import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import b.C0361i;
import java.util.ListIterator;
import q2.n;
import r2.C0693f;

/* renamed from: b.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0361i {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f4677a;

    /* renamed from: b, reason: collision with root package name */
    public final J.a f4678b;

    /* renamed from: c, reason: collision with root package name */
    public final C0693f f4679c;

    /* renamed from: d, reason: collision with root package name */
    public AbstractC0360h f4680d;

    /* renamed from: e, reason: collision with root package name */
    public OnBackInvokedCallback f4681e;

    /* renamed from: f, reason: collision with root package name */
    public OnBackInvokedDispatcher f4682f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f4683g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4684h;

    /* renamed from: b.i$a */
    public static final class a extends C2.l implements B2.l {
        public a() {
            super(1);
        }

        public final void a(C0354b c0354b) {
            C2.k.e(c0354b, "backEvent");
            C0361i.this.g(c0354b);
        }

        @Override // B2.l
        public /* bridge */ /* synthetic */ Object j(Object obj) {
            a((C0354b) obj);
            return n.f8874a;
        }
    }

    /* renamed from: b.i$b */
    public static final class b extends C2.l implements B2.l {
        public b() {
            super(1);
        }

        public final void a(C0354b c0354b) {
            C2.k.e(c0354b, "backEvent");
            C0361i.this.f(c0354b);
        }

        @Override // B2.l
        public /* bridge */ /* synthetic */ Object j(Object obj) {
            a((C0354b) obj);
            return n.f8874a;
        }
    }

    /* renamed from: b.i$c */
    public static final class c extends C2.l implements B2.a {
        public c() {
            super(0);
        }

        public final void a() {
            C0361i.this.e();
        }

        @Override // B2.a
        public /* bridge */ /* synthetic */ Object b() {
            a();
            return n.f8874a;
        }
    }

    /* renamed from: b.i$d */
    public static final class d extends C2.l implements B2.a {
        public d() {
            super(0);
        }

        public final void a() {
            C0361i.this.d();
        }

        @Override // B2.a
        public /* bridge */ /* synthetic */ Object b() {
            a();
            return n.f8874a;
        }
    }

    /* renamed from: b.i$e */
    public static final class e extends C2.l implements B2.a {
        public e() {
            super(0);
        }

        public final void a() {
            C0361i.this.e();
        }

        @Override // B2.a
        public /* bridge */ /* synthetic */ Object b() {
            a();
            return n.f8874a;
        }
    }

    /* renamed from: b.i$f */
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public static final f f4690a = new f();

        public static final void c(B2.a aVar) {
            C2.k.e(aVar, "$onBackInvoked");
            aVar.b();
        }

        public final OnBackInvokedCallback b(final B2.a aVar) {
            C2.k.e(aVar, "onBackInvoked");
            return new OnBackInvokedCallback() { // from class: b.j
                public final void onBackInvoked() {
                    C0361i.f.c(B2.a.this);
                }
            };
        }

        public final void d(Object obj, int i3, Object obj2) {
            C2.k.e(obj, "dispatcher");
            C2.k.e(obj2, "callback");
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i3, (OnBackInvokedCallback) obj2);
        }

        public final void e(Object obj, Object obj2) {
            C2.k.e(obj, "dispatcher");
            C2.k.e(obj2, "callback");
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* renamed from: b.i$g */
    public static final class g {

        /* renamed from: a, reason: collision with root package name */
        public static final g f4691a = new g();

        /* renamed from: b.i$g$a */
        public static final class a implements OnBackAnimationCallback {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ B2.l f4692a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ B2.l f4693b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ B2.a f4694c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ B2.a f4695d;

            public a(B2.l lVar, B2.l lVar2, B2.a aVar, B2.a aVar2) {
                this.f4692a = lVar;
                this.f4693b = lVar2;
                this.f4694c = aVar;
                this.f4695d = aVar2;
            }

            public void onBackCancelled() {
                this.f4695d.b();
            }

            public void onBackInvoked() {
                this.f4694c.b();
            }

            public void onBackProgressed(BackEvent backEvent) {
                C2.k.e(backEvent, "backEvent");
                this.f4693b.j(new C0354b(backEvent));
            }

            public void onBackStarted(BackEvent backEvent) {
                C2.k.e(backEvent, "backEvent");
                this.f4692a.j(new C0354b(backEvent));
            }
        }

        public final OnBackInvokedCallback a(B2.l lVar, B2.l lVar2, B2.a aVar, B2.a aVar2) {
            C2.k.e(lVar, "onBackStarted");
            C2.k.e(lVar2, "onBackProgressed");
            C2.k.e(aVar, "onBackInvoked");
            C2.k.e(aVar2, "onBackCancelled");
            return new a(lVar, lVar2, aVar, aVar2);
        }
    }

    public C0361i(Runnable runnable, J.a aVar) {
        this.f4677a = runnable;
        this.f4678b = aVar;
        this.f4679c = new C0693f();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 33) {
            this.f4681e = i3 >= 34 ? g.f4691a.a(new a(), new b(), new c(), new d()) : f.f4690a.b(new e());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void d() {
        AbstractC0360h abstractC0360h;
        AbstractC0360h abstractC0360h2 = this.f4680d;
        if (abstractC0360h2 == null) {
            C0693f c0693f = this.f4679c;
            ListIterator listIterator = c0693f.listIterator(c0693f.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    abstractC0360h = 0;
                    break;
                } else {
                    abstractC0360h = listIterator.previous();
                    if (((AbstractC0360h) abstractC0360h).e()) {
                        break;
                    }
                }
            }
            abstractC0360h2 = abstractC0360h;
        }
        this.f4680d = null;
        if (abstractC0360h2 != null) {
            abstractC0360h2.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void e() {
        AbstractC0360h abstractC0360h;
        AbstractC0360h abstractC0360h2 = this.f4680d;
        if (abstractC0360h2 == null) {
            C0693f c0693f = this.f4679c;
            ListIterator listIterator = c0693f.listIterator(c0693f.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    abstractC0360h = 0;
                    break;
                } else {
                    abstractC0360h = listIterator.previous();
                    if (((AbstractC0360h) abstractC0360h).e()) {
                        break;
                    }
                }
            }
            abstractC0360h2 = abstractC0360h;
        }
        this.f4680d = null;
        if (abstractC0360h2 != null) {
            abstractC0360h2.b();
            return;
        }
        Runnable runnable = this.f4677a;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    public final void f(C0354b c0354b) {
        AbstractC0360h abstractC0360h;
        AbstractC0360h abstractC0360h2 = this.f4680d;
        if (abstractC0360h2 == null) {
            C0693f c0693f = this.f4679c;
            ListIterator listIterator = c0693f.listIterator(c0693f.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    abstractC0360h = 0;
                    break;
                } else {
                    abstractC0360h = listIterator.previous();
                    if (((AbstractC0360h) abstractC0360h).e()) {
                        break;
                    }
                }
            }
            abstractC0360h2 = abstractC0360h;
        }
        if (abstractC0360h2 != null) {
            abstractC0360h2.c(c0354b);
        }
    }

    public final void g(C0354b c0354b) {
        Object obj;
        C0693f c0693f = this.f4679c;
        ListIterator<E> listIterator = c0693f.listIterator(c0693f.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            } else {
                obj = listIterator.previous();
                if (((AbstractC0360h) obj).e()) {
                    break;
                }
            }
        }
        AbstractC0360h abstractC0360h = (AbstractC0360h) obj;
        this.f4680d = abstractC0360h;
        if (abstractC0360h != null) {
            abstractC0360h.d(c0354b);
        }
    }

    public final void h(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        C2.k.e(onBackInvokedDispatcher, "invoker");
        this.f4682f = onBackInvokedDispatcher;
        i(this.f4684h);
    }

    public final void i(boolean z3) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f4682f;
        OnBackInvokedCallback onBackInvokedCallback = this.f4681e;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (z3 && !this.f4683g) {
            f.f4690a.d(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f4683g = true;
        } else {
            if (z3 || !this.f4683g) {
                return;
            }
            f.f4690a.e(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f4683g = false;
        }
    }

    public C0361i(Runnable runnable) {
        this(runnable, null);
    }
}
