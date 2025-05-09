package z0;

import android.app.Activity;

/* loaded from: classes.dex */
public interface l {

    /* renamed from: a, reason: collision with root package name */
    public static final a f10299a = a.f10300a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f10300a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static B2.l f10301b = C0172a.f10302f;

        /* renamed from: z0.l$a$a, reason: collision with other inner class name */
        public static final class C0172a extends C2.l implements B2.l {

            /* renamed from: f, reason: collision with root package name */
            public static final C0172a f10302f = new C0172a();

            public C0172a() {
                super(1);
            }

            @Override // B2.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final l j(l lVar) {
                C2.k.e(lVar, "it");
                return lVar;
            }
        }

        public final l a() {
            return (l) f10301b.j(o.f10303b);
        }
    }

    static l a() {
        return f10299a.a();
    }

    k b(Activity activity);
}
