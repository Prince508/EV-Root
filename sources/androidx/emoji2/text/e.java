package androidx.emoji2.text;

import C.l;
import H.g;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.Handler;
import androidx.emoji2.text.c;
import androidx.emoji2.text.e;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public class e extends c.AbstractC0086c {

    /* renamed from: j, reason: collision with root package name */
    public static final a f3925j = new a();

    public static class a {
        public Typeface a(Context context, g.b bVar) {
            return g.a(context, null, new g.b[]{bVar});
        }

        public g.a b(Context context, H.e eVar) {
            return g.b(context, null, eVar);
        }

        public void c(Context context, ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    public static class b implements c.g {

        /* renamed from: a, reason: collision with root package name */
        public final Context f3926a;

        /* renamed from: b, reason: collision with root package name */
        public final H.e f3927b;

        /* renamed from: c, reason: collision with root package name */
        public final a f3928c;

        /* renamed from: d, reason: collision with root package name */
        public final Object f3929d = new Object();

        /* renamed from: e, reason: collision with root package name */
        public Handler f3930e;

        /* renamed from: f, reason: collision with root package name */
        public Executor f3931f;

        /* renamed from: g, reason: collision with root package name */
        public ThreadPoolExecutor f3932g;

        /* renamed from: h, reason: collision with root package name */
        public c.h f3933h;

        /* renamed from: i, reason: collision with root package name */
        public ContentObserver f3934i;

        /* renamed from: j, reason: collision with root package name */
        public Runnable f3935j;

        public b(Context context, H.e eVar, a aVar) {
            J.g.h(context, "Context cannot be null");
            J.g.h(eVar, "FontRequest cannot be null");
            this.f3926a = context.getApplicationContext();
            this.f3927b = eVar;
            this.f3928c = aVar;
        }

        @Override // androidx.emoji2.text.c.g
        public void a(c.h hVar) {
            J.g.h(hVar, "LoaderCallback cannot be null");
            synchronized (this.f3929d) {
                this.f3933h = hVar;
            }
            d();
        }

        public final void b() {
            synchronized (this.f3929d) {
                try {
                    this.f3933h = null;
                    ContentObserver contentObserver = this.f3934i;
                    if (contentObserver != null) {
                        this.f3928c.c(this.f3926a, contentObserver);
                        this.f3934i = null;
                    }
                    Handler handler = this.f3930e;
                    if (handler != null) {
                        handler.removeCallbacks(this.f3935j);
                    }
                    this.f3930e = null;
                    ThreadPoolExecutor threadPoolExecutor = this.f3932g;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.f3931f = null;
                    this.f3932g = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void c() {
            synchronized (this.f3929d) {
                try {
                    if (this.f3933h == null) {
                        return;
                    }
                    try {
                        g.b e3 = e();
                        int b3 = e3.b();
                        if (b3 == 2) {
                            synchronized (this.f3929d) {
                            }
                        }
                        if (b3 != 0) {
                            throw new RuntimeException("fetchFonts result is not OK. (" + b3 + ")");
                        }
                        try {
                            G.d.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                            Typeface a3 = this.f3928c.a(this.f3926a, e3);
                            ByteBuffer f3 = l.f(this.f3926a, null, e3.d());
                            if (f3 == null || a3 == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            f b4 = f.b(a3, f3);
                            G.d.b();
                            synchronized (this.f3929d) {
                                try {
                                    c.h hVar = this.f3933h;
                                    if (hVar != null) {
                                        hVar.b(b4);
                                    }
                                } finally {
                                }
                            }
                            b();
                        } catch (Throwable th) {
                            G.d.b();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        synchronized (this.f3929d) {
                            try {
                                c.h hVar2 = this.f3933h;
                                if (hVar2 != null) {
                                    hVar2.a(th2);
                                }
                                b();
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        public void d() {
            synchronized (this.f3929d) {
                try {
                    if (this.f3933h == null) {
                        return;
                    }
                    if (this.f3931f == null) {
                        ThreadPoolExecutor b3 = a0.c.b("emojiCompat");
                        this.f3932g = b3;
                        this.f3931f = b3;
                    }
                    this.f3931f.execute(new Runnable() { // from class: a0.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            e.b.this.c();
                        }
                    });
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final g.b e() {
            try {
                g.a b3 = this.f3928c.b(this.f3926a, this.f3927b);
                if (b3.c() == 0) {
                    g.b[] b4 = b3.b();
                    if (b4 == null || b4.length == 0) {
                        throw new RuntimeException("fetchFonts failed (empty result)");
                    }
                    return b4[0];
                }
                throw new RuntimeException("fetchFonts failed (" + b3.c() + ")");
            } catch (PackageManager.NameNotFoundException e3) {
                throw new RuntimeException("provider not found", e3);
            }
        }

        public void f(Executor executor) {
            synchronized (this.f3929d) {
                this.f3931f = executor;
            }
        }
    }

    public e(Context context, H.e eVar) {
        super(new b(context, eVar, f3925j));
    }

    public e c(Executor executor) {
        ((b) a()).f(executor);
        return this;
    }
}
