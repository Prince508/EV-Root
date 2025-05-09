package z0;

import android.graphics.Rect;
import z0.InterfaceC0787c;

/* loaded from: classes.dex */
public final class d implements InterfaceC0787c {

    /* renamed from: d, reason: collision with root package name */
    public static final a f10265d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final w0.b f10266a;

    /* renamed from: b, reason: collision with root package name */
    public final b f10267b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC0787c.b f10268c;

    public static final class a {
        public /* synthetic */ a(C2.g gVar) {
            this();
        }

        public final void a(w0.b bVar) {
            C2.k.e(bVar, "bounds");
            if (bVar.d() == 0 && bVar.a() == 0) {
                throw new IllegalArgumentException("Bounds must be non zero");
            }
            if (bVar.b() != 0 && bVar.c() != 0) {
                throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
            }
        }

        public a() {
        }
    }

    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final a f10269b = new a(null);

        /* renamed from: c, reason: collision with root package name */
        public static final b f10270c = new b("FOLD");

        /* renamed from: d, reason: collision with root package name */
        public static final b f10271d = new b("HINGE");

        /* renamed from: a, reason: collision with root package name */
        public final String f10272a;

        public static final class a {
            public /* synthetic */ a(C2.g gVar) {
                this();
            }

            public final b a() {
                return b.f10270c;
            }

            public final b b() {
                return b.f10271d;
            }

            public a() {
            }
        }

        public b(String str) {
            this.f10272a = str;
        }

        public String toString() {
            return this.f10272a;
        }
    }

    public d(w0.b bVar, b bVar2, InterfaceC0787c.b bVar3) {
        C2.k.e(bVar, "featureBounds");
        C2.k.e(bVar2, "type");
        C2.k.e(bVar3, "state");
        this.f10266a = bVar;
        this.f10267b = bVar2;
        this.f10268c = bVar3;
        f10265d.a(bVar);
    }

    @Override // z0.InterfaceC0785a
    public Rect a() {
        return this.f10266a.f();
    }

    @Override // z0.InterfaceC0787c
    public InterfaceC0787c.a b() {
        return (this.f10266a.d() == 0 || this.f10266a.a() == 0) ? InterfaceC0787c.a.f10258c : InterfaceC0787c.a.f10259d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C2.k.a(d.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        C2.k.c(obj, "null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        d dVar = (d) obj;
        return C2.k.a(this.f10266a, dVar.f10266a) && C2.k.a(this.f10267b, dVar.f10267b) && C2.k.a(getState(), dVar.getState());
    }

    @Override // z0.InterfaceC0787c
    public InterfaceC0787c.b getState() {
        return this.f10268c;
    }

    public int hashCode() {
        return (((this.f10266a.hashCode() * 31) + this.f10267b.hashCode()) * 31) + getState().hashCode();
    }

    public String toString() {
        return d.class.getSimpleName() + " { " + this.f10266a + ", type=" + this.f10267b + ", state=" + getState() + " }";
    }
}
