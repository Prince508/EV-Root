package z0;

/* renamed from: z0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0787c extends InterfaceC0785a {

    /* renamed from: z0.c$a */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final C0169a f10257b = new C0169a(null);

        /* renamed from: c, reason: collision with root package name */
        public static final a f10258c = new a("NONE");

        /* renamed from: d, reason: collision with root package name */
        public static final a f10259d = new a("FULL");

        /* renamed from: a, reason: collision with root package name */
        public final String f10260a;

        /* renamed from: z0.c$a$a, reason: collision with other inner class name */
        public static final class C0169a {
            public /* synthetic */ C0169a(C2.g gVar) {
                this();
            }

            public C0169a() {
            }
        }

        public a(String str) {
            this.f10260a = str;
        }

        public String toString() {
            return this.f10260a;
        }
    }

    /* renamed from: z0.c$b */
    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final a f10261b = new a(null);

        /* renamed from: c, reason: collision with root package name */
        public static final b f10262c = new b("FLAT");

        /* renamed from: d, reason: collision with root package name */
        public static final b f10263d = new b("HALF_OPENED");

        /* renamed from: a, reason: collision with root package name */
        public final String f10264a;

        /* renamed from: z0.c$b$a */
        public static final class a {
            public /* synthetic */ a(C2.g gVar) {
                this();
            }

            public a() {
            }
        }

        public b(String str) {
            this.f10264a = str;
        }

        public String toString() {
            return this.f10264a;
        }
    }

    a b();

    b getState();
}
