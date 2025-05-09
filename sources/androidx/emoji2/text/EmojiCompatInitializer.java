package androidx.emoji2.text;

import android.content.Context;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.emoji2.text.c;
import androidx.lifecycle.AbstractC0347h;
import androidx.lifecycle.InterfaceC0342c;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.l;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import q0.C0670a;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements q0.b {

    public class a implements InterfaceC0342c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AbstractC0347h f3871a;

        public a(AbstractC0347h abstractC0347h) {
            this.f3871a = abstractC0347h;
        }

        @Override // androidx.lifecycle.InterfaceC0342c
        public void a(l lVar) {
            EmojiCompatInitializer.this.e();
            this.f3871a.c(this);
        }
    }

    public static class b extends c.AbstractC0086c {
        public b(Context context) {
            super(new c(context));
            b(1);
        }
    }

    public static class c implements c.g {

        /* renamed from: a, reason: collision with root package name */
        public final Context f3873a;

        public class a extends c.h {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c.h f3874a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ThreadPoolExecutor f3875b;

            public a(c.h hVar, ThreadPoolExecutor threadPoolExecutor) {
                this.f3874a = hVar;
                this.f3875b = threadPoolExecutor;
            }

            @Override // androidx.emoji2.text.c.h
            public void a(Throwable th) {
                try {
                    this.f3874a.a(th);
                } finally {
                    this.f3875b.shutdown();
                }
            }

            @Override // androidx.emoji2.text.c.h
            public void b(f fVar) {
                try {
                    this.f3874a.b(fVar);
                } finally {
                    this.f3875b.shutdown();
                }
            }
        }

        public c(Context context) {
            this.f3873a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.c.g
        public void a(final c.h hVar) {
            final ThreadPoolExecutor b3 = a0.c.b("EmojiCompatInitializer");
            b3.execute(new Runnable() { // from class: a0.d
                @Override // java.lang.Runnable
                public final void run() {
                    EmojiCompatInitializer.c.this.c(hVar, b3);
                }
            });
        }

        public void c(c.h hVar, ThreadPoolExecutor threadPoolExecutor) {
            try {
                e a3 = androidx.emoji2.text.a.a(this.f3873a);
                if (a3 == null) {
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                }
                a3.c(threadPoolExecutor);
                a3.a().a(new a(hVar, threadPoolExecutor));
            } catch (Throwable th) {
                hVar.a(th);
                threadPoolExecutor.shutdown();
            }
        }
    }

    public static class d implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                G.d.a("EmojiCompat.EmojiCompatInitializer.run");
                if (androidx.emoji2.text.c.h()) {
                    androidx.emoji2.text.c.b().k();
                }
            } finally {
                G.d.b();
            }
        }
    }

    @Override // q0.b
    public List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // q0.b
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Boolean b(Context context) {
        androidx.emoji2.text.c.g(new b(context));
        d(context);
        return Boolean.TRUE;
    }

    public void d(Context context) {
        AbstractC0347h h3 = ((l) C0670a.e(context).f(ProcessLifecycleInitializer.class)).h();
        h3.a(new a(h3));
    }

    public void e() {
        a0.c.c().postDelayed(new d(), 500L);
    }
}
