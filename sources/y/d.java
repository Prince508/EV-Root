package Y;

import C2.k;
import java.util.Map;
import r2.AbstractC0685C;

/* loaded from: classes.dex */
public abstract class d {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f2386a;

        public a(String str) {
            k.e(str, "name");
            this.f2386a = str;
        }

        public final String a() {
            return this.f2386a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return k.a(this.f2386a, ((a) obj).f2386a);
            }
            return false;
        }

        public int hashCode() {
            return this.f2386a.hashCode();
        }

        public String toString() {
            return this.f2386a;
        }
    }

    public static final class b {
    }

    public abstract Map a();

    public abstract Object b(a aVar);

    public final Y.a c() {
        return new Y.a(AbstractC0685C.i(a()), false);
    }

    public final d d() {
        return new Y.a(AbstractC0685C.i(a()), true);
    }
}
