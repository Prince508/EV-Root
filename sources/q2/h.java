package q2;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class h implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final a f8868e = new a(null);

    public static final class a {
        public /* synthetic */ a(C2.g gVar) {
            this();
        }

        public a() {
        }
    }

    public static final class b implements Serializable {

        /* renamed from: e, reason: collision with root package name */
        public final Throwable f8869e;

        public b(Throwable th) {
            C2.k.e(th, "exception");
            this.f8869e = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && C2.k.a(this.f8869e, ((b) obj).f8869e);
        }

        public int hashCode() {
            return this.f8869e.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f8869e + ')';
        }
    }

    public static final Throwable b(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).f8869e;
        }
        return null;
    }

    public static final boolean c(Object obj) {
        return obj instanceof b;
    }

    public static Object a(Object obj) {
        return obj;
    }
}
