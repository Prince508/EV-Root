package M1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f1359b = a().a();

    /* renamed from: a, reason: collision with root package name */
    public final Map f1360a;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public HashMap f1361a = new HashMap();

        public a a() {
            if (this.f1361a == null) {
                throw new IllegalStateException("cannot call build() twice");
            }
            a aVar = new a(Collections.unmodifiableMap(this.f1361a));
            this.f1361a = null;
            return aVar;
        }
    }

    public static b a() {
        return new b();
    }

    public Map b() {
        return this.f1360a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f1360a.equals(((a) obj).f1360a);
        }
        return false;
    }

    public int hashCode() {
        return this.f1360a.hashCode();
    }

    public String toString() {
        return this.f1360a.toString();
    }

    public a(Map map) {
        this.f1360a = map;
    }
}
