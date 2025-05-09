package X;

import B2.l;
import C2.k;
import K2.I;
import android.content.Context;
import java.io.File;
import java.util.List;

/* loaded from: classes.dex */
public final class c implements D2.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f2348a;

    /* renamed from: b, reason: collision with root package name */
    public final l f2349b;

    /* renamed from: c, reason: collision with root package name */
    public final I f2350c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2351d;

    /* renamed from: e, reason: collision with root package name */
    public volatile V.f f2352e;

    public static final class a extends C2.l implements B2.a {

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Context f2353f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ c f2354g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, c cVar) {
            super(0);
            this.f2353f = context;
            this.f2354g = cVar;
        }

        @Override // B2.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final File b() {
            Context context = this.f2353f;
            k.d(context, "applicationContext");
            return b.a(context, this.f2354g.f2348a);
        }
    }

    public c(String str, W.b bVar, l lVar, I i3) {
        k.e(str, "name");
        k.e(lVar, "produceMigrations");
        k.e(i3, "scope");
        this.f2348a = str;
        this.f2349b = lVar;
        this.f2350c = i3;
        this.f2351d = new Object();
    }

    @Override // D2.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public V.f a(Context context, H2.h hVar) {
        V.f fVar;
        k.e(context, "thisRef");
        k.e(hVar, "property");
        V.f fVar2 = this.f2352e;
        if (fVar2 != null) {
            return fVar2;
        }
        synchronized (this.f2351d) {
            try {
                if (this.f2352e == null) {
                    Context applicationContext = context.getApplicationContext();
                    Y.c cVar = Y.c.f2384a;
                    l lVar = this.f2349b;
                    k.d(applicationContext, "applicationContext");
                    this.f2352e = cVar.a(null, (List) lVar.j(applicationContext), this.f2350c, new a(applicationContext, this));
                }
                fVar = this.f2352e;
                k.b(fVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }
}
