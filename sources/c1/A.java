package C1;

import java.util.Objects;

/* loaded from: classes.dex */
public final class A extends AbstractC0175c {

    /* renamed from: a, reason: collision with root package name */
    public final a f167a;

    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f168b = new a("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final a f169c = new a("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final a f170d = new a("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        public final String f171a;

        public a(String str) {
            this.f171a = str;
        }

        public String toString() {
            return this.f171a;
        }
    }

    public A(a aVar) {
        this.f167a = aVar;
    }

    public static A a(a aVar) {
        return new A(aVar);
    }

    public a b() {
        return this.f167a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof A) && ((A) obj).b() == b();
    }

    public int hashCode() {
        return Objects.hashCode(this.f167a);
    }

    public String toString() {
        return "ChaCha20Poly1305 Parameters (variant: " + this.f167a + ")";
    }
}
