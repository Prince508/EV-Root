package C1;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class q extends AbstractC0175c {

    /* renamed from: a, reason: collision with root package name */
    public final int f251a;

    /* renamed from: b, reason: collision with root package name */
    public final int f252b;

    /* renamed from: c, reason: collision with root package name */
    public final int f253c;

    /* renamed from: d, reason: collision with root package name */
    public final c f254d;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public Integer f255a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f256b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f257c;

        /* renamed from: d, reason: collision with root package name */
        public c f258d;

        public q a() {
            Integer num = this.f255a;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.f258d == null) {
                throw new GeneralSecurityException("Variant is not set");
            }
            if (this.f256b == null) {
                throw new GeneralSecurityException("IV size is not set");
            }
            if (this.f257c != null) {
                return new q(num.intValue(), this.f256b.intValue(), this.f257c.intValue(), this.f258d);
            }
            throw new GeneralSecurityException("Tag size is not set");
        }

        public b b(int i3) {
            if (i3 <= 0) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be positive", Integer.valueOf(i3)));
            }
            this.f256b = Integer.valueOf(i3);
            return this;
        }

        public b c(int i3) {
            if (i3 != 16 && i3 != 24 && i3 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i3)));
            }
            this.f255a = Integer.valueOf(i3);
            return this;
        }

        public b d(int i3) {
            if (i3 != 12 && i3 != 13 && i3 != 14 && i3 != 15 && i3 != 16) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; value must be one of the following: 12, 13, 14, 15 or 16 bytes", Integer.valueOf(i3)));
            }
            this.f257c = Integer.valueOf(i3);
            return this;
        }

        public b e(c cVar) {
            this.f258d = cVar;
            return this;
        }

        public b() {
            this.f255a = null;
            this.f256b = null;
            this.f257c = null;
            this.f258d = c.f261d;
        }
    }

    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f259b = new c("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final c f260c = new c("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final c f261d = new c("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        public final String f262a;

        public c(String str) {
            this.f262a = str;
        }

        public String toString() {
            return this.f262a;
        }
    }

    public static b a() {
        return new b();
    }

    public int b() {
        return this.f252b;
    }

    public int c() {
        return this.f251a;
    }

    public int d() {
        return this.f253c;
    }

    public c e() {
        return this.f254d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return qVar.c() == c() && qVar.b() == b() && qVar.d() == d() && qVar.e() == e();
    }

    public boolean f() {
        return this.f254d != c.f261d;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f251a), Integer.valueOf(this.f252b), Integer.valueOf(this.f253c), this.f254d);
    }

    public String toString() {
        return "AesGcm Parameters (variant: " + this.f254d + ", " + this.f252b + "-byte IV, " + this.f253c + "-byte tag, and " + this.f251a + "-byte key)";
    }

    public q(int i3, int i4, int i5, c cVar) {
        this.f251a = i3;
        this.f252b = i4;
        this.f253c = i5;
        this.f254d = cVar;
    }
}
