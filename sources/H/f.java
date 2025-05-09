package H;

import H.g;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final o.e f609a = new o.e(16);

    /* renamed from: b, reason: collision with root package name */
    public static final ExecutorService f610b = h.a("fonts-androidx", 10, 10000);

    /* renamed from: c, reason: collision with root package name */
    public static final Object f611c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final o.g f612d = new o.g();

    public class a implements Callable {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f613e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Context f614f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ H.e f615g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ int f616h;

        public a(String str, Context context, H.e eVar, int i3) {
            this.f613e = str;
            this.f614f = context;
            this.f615g = eVar;
            this.f616h = i3;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            return f.c(this.f613e, this.f614f, this.f615g, this.f616h);
        }
    }

    public class b implements J.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ H.a f617a;

        public b(H.a aVar) {
            this.f617a = aVar;
        }

        @Override // J.a, androidx.window.extensions.core.util.function.Consumer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.f617a.b(eVar);
        }
    }

    public class c implements Callable {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f618e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Context f619f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ H.e f620g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ int f621h;

        public c(String str, Context context, H.e eVar, int i3) {
            this.f618e = str;
            this.f619f = context;
            this.f620g = eVar;
            this.f621h = i3;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            try {
                return f.c(this.f618e, this.f619f, this.f620g, this.f621h);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    public class d implements J.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f622a;

        public d(String str) {
            this.f622a = str;
        }

        @Override // J.a, androidx.window.extensions.core.util.function.Consumer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            synchronized (f.f611c) {
                try {
                    o.g gVar = f.f612d;
                    ArrayList arrayList = (ArrayList) gVar.get(this.f622a);
                    if (arrayList == null) {
                        return;
                    }
                    gVar.remove(this.f622a);
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        ((J.a) arrayList.get(i3)).accept(eVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static String a(H.e eVar, int i3) {
        return eVar.d() + "-" + i3;
    }

    public static int b(g.a aVar) {
        int i3 = 1;
        if (aVar.c() != 0) {
            return aVar.c() != 1 ? -3 : -2;
        }
        g.b[] b3 = aVar.b();
        if (b3 != null && b3.length != 0) {
            i3 = 0;
            for (g.b bVar : b3) {
                int b4 = bVar.b();
                if (b4 != 0) {
                    if (b4 < 0) {
                        return -3;
                    }
                    return b4;
                }
            }
        }
        return i3;
    }

    public static e c(String str, Context context, H.e eVar, int i3) {
        o.e eVar2 = f609a;
        Typeface typeface = (Typeface) eVar2.c(str);
        if (typeface != null) {
            return new e(typeface);
        }
        try {
            g.a e3 = H.d.e(context, eVar, null);
            int b3 = b(e3);
            if (b3 != 0) {
                return new e(b3);
            }
            Typeface b4 = C.e.b(context, null, e3.b(), i3);
            if (b4 == null) {
                return new e(-3);
            }
            eVar2.d(str, b4);
            return new e(b4);
        } catch (PackageManager.NameNotFoundException unused) {
            return new e(-1);
        }
    }

    public static Typeface d(Context context, H.e eVar, int i3, Executor executor, H.a aVar) {
        String a3 = a(eVar, i3);
        Typeface typeface = (Typeface) f609a.c(a3);
        if (typeface != null) {
            aVar.b(new e(typeface));
            return typeface;
        }
        b bVar = new b(aVar);
        synchronized (f611c) {
            try {
                o.g gVar = f612d;
                ArrayList arrayList = (ArrayList) gVar.get(a3);
                if (arrayList != null) {
                    arrayList.add(bVar);
                    return null;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(bVar);
                gVar.put(a3, arrayList2);
                c cVar = new c(a3, context, eVar, i3);
                if (executor == null) {
                    executor = f610b;
                }
                h.b(executor, cVar, new d(a3));
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Typeface e(Context context, H.e eVar, H.a aVar, int i3, int i4) {
        String a3 = a(eVar, i3);
        Typeface typeface = (Typeface) f609a.c(a3);
        if (typeface != null) {
            aVar.b(new e(typeface));
            return typeface;
        }
        if (i4 == -1) {
            e c3 = c(a3, context, eVar, i3);
            aVar.b(c3);
            return c3.f623a;
        }
        try {
            e eVar2 = (e) h.c(f610b, new a(a3, context, eVar, i3), i4);
            aVar.b(eVar2);
            return eVar2.f623a;
        } catch (InterruptedException unused) {
            aVar.b(new e(-3));
            return null;
        }
    }

    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final Typeface f623a;

        /* renamed from: b, reason: collision with root package name */
        public final int f624b;

        public e(int i3) {
            this.f623a = null;
            this.f624b = i3;
        }

        public boolean a() {
            return this.f624b == 0;
        }

        public e(Typeface typeface) {
            this.f623a = typeface;
            this.f624b = 0;
        }
    }
}
