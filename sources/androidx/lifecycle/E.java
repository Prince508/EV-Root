package androidx.lifecycle;

import i0.AbstractC0499a;
import i0.C0500b;

/* loaded from: classes.dex */
public class E {

    /* renamed from: a, reason: collision with root package name */
    public final G f3956a;

    /* renamed from: b, reason: collision with root package name */
    public final b f3957b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC0499a f3958c;

    public static class a extends c {

        /* renamed from: d, reason: collision with root package name */
        public static final C0087a f3959d = new C0087a(null);

        /* renamed from: e, reason: collision with root package name */
        public static final AbstractC0499a.b f3960e = C0087a.C0088a.f3961a;

        /* renamed from: androidx.lifecycle.E$a$a, reason: collision with other inner class name */
        public static final class C0087a {

            /* renamed from: androidx.lifecycle.E$a$a$a, reason: collision with other inner class name */
            public static final class C0088a implements AbstractC0499a.b {

                /* renamed from: a, reason: collision with root package name */
                public static final C0088a f3961a = new C0088a();
            }

            public /* synthetic */ C0087a(C2.g gVar) {
                this();
            }

            public C0087a() {
            }
        }
    }

    public interface b {

        /* renamed from: a, reason: collision with root package name */
        public static final a f3962a = a.f3963a;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ a f3963a = new a();
        }

        default D a(Class cls) {
            C2.k.e(cls, "modelClass");
            throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
        }

        default D b(Class cls, AbstractC0499a abstractC0499a) {
            C2.k.e(cls, "modelClass");
            C2.k.e(abstractC0499a, "extras");
            return a(cls);
        }
    }

    public static class c implements b {

        /* renamed from: b, reason: collision with root package name */
        public static final a f3964b = new a(null);

        /* renamed from: c, reason: collision with root package name */
        public static final AbstractC0499a.b f3965c = a.C0089a.f3966a;

        public static final class a {

            /* renamed from: androidx.lifecycle.E$c$a$a, reason: collision with other inner class name */
            public static final class C0089a implements AbstractC0499a.b {

                /* renamed from: a, reason: collision with root package name */
                public static final C0089a f3966a = new C0089a();
            }

            public /* synthetic */ a(C2.g gVar) {
                this();
            }

            public a() {
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public E(G g3, b bVar) {
        this(g3, bVar, null, 4, null);
        C2.k.e(g3, "store");
        C2.k.e(bVar, "factory");
    }

    public D a(Class cls) {
        C2.k.e(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
    }

    public D b(String str, Class cls) {
        D a3;
        C2.k.e(str, "key");
        C2.k.e(cls, "modelClass");
        D b3 = this.f3956a.b(str);
        if (cls.isInstance(b3)) {
            C2.k.c(b3, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return b3;
        }
        C0500b c0500b = new C0500b(this.f3958c);
        c0500b.b(c.f3965c, str);
        try {
            a3 = this.f3957b.b(cls, c0500b);
        } catch (AbstractMethodError unused) {
            a3 = this.f3957b.a(cls);
        }
        this.f3956a.c(str, a3);
        return a3;
    }

    public E(G g3, b bVar, AbstractC0499a abstractC0499a) {
        C2.k.e(g3, "store");
        C2.k.e(bVar, "factory");
        C2.k.e(abstractC0499a, "defaultCreationExtras");
        this.f3956a = g3;
        this.f3957b = bVar;
        this.f3958c = abstractC0499a;
    }

    public /* synthetic */ E(G g3, b bVar, AbstractC0499a abstractC0499a, int i3, C2.g gVar) {
        this(g3, bVar, (i3 & 4) != 0 ? AbstractC0499a.C0123a.f7460b : abstractC0499a);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public E(H h3, b bVar) {
        this(h3.b(), bVar, F.a(h3));
        C2.k.e(h3, "owner");
        C2.k.e(bVar, "factory");
    }
}
