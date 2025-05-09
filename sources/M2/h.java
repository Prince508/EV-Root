package M2;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final b f1418a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    public static final c f1419b = new c();

    public static final class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f1420a;

        public a(Throwable th) {
            this.f1420a = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && C2.k.a(this.f1420a, ((a) obj).f1420a);
        }

        public int hashCode() {
            Throwable th = this.f1420a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // M2.h.c
        public String toString() {
            return "Closed(" + this.f1420a + ')';
        }
    }

    public static final class b {
        public /* synthetic */ b(C2.g gVar) {
            this();
        }

        public final Object a(Throwable th) {
            return h.b(new a(th));
        }

        public final Object b() {
            return h.b(h.f1419b);
        }

        public final Object c(Object obj) {
            return h.b(obj);
        }

        public b() {
        }
    }

    public static class c {
        public String toString() {
            return "Failed";
        }
    }

    public static final Throwable c(Object obj) {
        a aVar = obj instanceof a ? (a) obj : null;
        if (aVar != null) {
            return aVar.f1420a;
        }
        return null;
    }

    public static final Object d(Object obj) {
        if (obj instanceof c) {
            return null;
        }
        return obj;
    }

    public static final boolean e(Object obj) {
        return obj instanceof a;
    }

    public static final boolean f(Object obj) {
        return !(obj instanceof c);
    }

    public static Object b(Object obj) {
        return obj;
    }
}
