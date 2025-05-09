package C1;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class v extends AbstractC0175c {

    /* renamed from: a, reason: collision with root package name */
    public final int f277a;

    /* renamed from: b, reason: collision with root package name */
    public final c f278b;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public Integer f279a;

        /* renamed from: b, reason: collision with root package name */
        public c f280b;

        public v a() {
            Integer num = this.f279a;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.f280b != null) {
                return new v(num.intValue(), this.f280b);
            }
            throw new GeneralSecurityException("Variant is not set");
        }

        public b b(int i3) {
            if (i3 != 16 && i3 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i3)));
            }
            this.f279a = Integer.valueOf(i3);
            return this;
        }

        public b c(c cVar) {
            this.f280b = cVar;
            return this;
        }

        public b() {
            this.f279a = null;
            this.f280b = c.f283d;
        }
    }

    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f281b = new c("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final c f282c = new c("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final c f283d = new c("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        public final String f284a;

        public c(String str) {
            this.f284a = str;
        }

        public String toString() {
            return this.f284a;
        }
    }

    public static b a() {
        return new b();
    }

    public int b() {
        return this.f277a;
    }

    public c c() {
        return this.f278b;
    }

    public boolean d() {
        return this.f278b != c.f283d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return vVar.b() == b() && vVar.c() == c();
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f277a), this.f278b);
    }

    public String toString() {
        return "AesGcmSiv Parameters (variant: " + this.f278b + ", " + this.f277a + "-byte key)";
    }

    public v(int i3, c cVar) {
        this.f277a = i3;
        this.f278b = cVar;
    }
}
