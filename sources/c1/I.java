package C1;

import java.util.Objects;

/* loaded from: classes.dex */
public final class I extends AbstractC0175c {

    /* renamed from: a, reason: collision with root package name */
    public final a f188a;

    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f189b = new a("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final a f190c = new a("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final a f191d = new a("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        public final String f192a;

        public a(String str) {
            this.f192a = str;
        }

        public String toString() {
            return this.f192a;
        }
    }

    public I(a aVar) {
        this.f188a = aVar;
    }

    public static I a(a aVar) {
        return new I(aVar);
    }

    public a b() {
        return this.f188a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof I) && ((I) obj).b() == b();
    }

    public int hashCode() {
        return Objects.hashCode(this.f188a);
    }

    public String toString() {
        return "XChaCha20Poly1305 Parameters (variant: " + this.f188a + ")";
    }
}
