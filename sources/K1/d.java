package K1;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class d extends q {

    /* renamed from: a, reason: collision with root package name */
    public final int f1080a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1081b;

    /* renamed from: c, reason: collision with root package name */
    public final c f1082c;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public Integer f1083a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f1084b;

        /* renamed from: c, reason: collision with root package name */
        public c f1085c;

        public d a() {
            Integer num = this.f1083a;
            if (num == null) {
                throw new GeneralSecurityException("key size not set");
            }
            if (this.f1084b == null) {
                throw new GeneralSecurityException("tag size not set");
            }
            if (this.f1085c != null) {
                return new d(num.intValue(), this.f1084b.intValue(), this.f1085c);
            }
            throw new GeneralSecurityException("variant not set");
        }

        public b b(int i3) {
            if (i3 != 16 && i3 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i3 * 8)));
            }
            this.f1083a = Integer.valueOf(i3);
            return this;
        }

        public b c(int i3) {
            if (i3 >= 10 && 16 >= i3) {
                this.f1084b = Integer.valueOf(i3);
                return this;
            }
            throw new GeneralSecurityException("Invalid tag size for AesCmacParameters: " + i3);
        }

        public b d(c cVar) {
            this.f1085c = cVar;
            return this;
        }

        public b() {
            this.f1083a = null;
            this.f1084b = null;
            this.f1085c = c.f1089e;
        }
    }

    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f1086b = new c("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final c f1087c = new c("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final c f1088d = new c("LEGACY");

        /* renamed from: e, reason: collision with root package name */
        public static final c f1089e = new c("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        public final String f1090a;

        public c(String str) {
            this.f1090a = str;
        }

        public String toString() {
            return this.f1090a;
        }
    }

    public static b a() {
        return new b();
    }

    public int b() {
        return this.f1081b;
    }

    public int c() {
        return this.f1080a;
    }

    public int d() {
        int b3;
        c cVar = this.f1082c;
        if (cVar == c.f1089e) {
            return b();
        }
        if (cVar == c.f1086b) {
            b3 = b();
        } else if (cVar == c.f1087c) {
            b3 = b();
        } else {
            if (cVar != c.f1088d) {
                throw new IllegalStateException("Unknown variant");
            }
            b3 = b();
        }
        return b3 + 5;
    }

    public c e() {
        return this.f1082c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return dVar.c() == c() && dVar.d() == d() && dVar.e() == e();
    }

    public boolean f() {
        return this.f1082c != c.f1089e;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f1080a), Integer.valueOf(this.f1081b), this.f1082c);
    }

    public String toString() {
        return "AES-CMAC Parameters (variant: " + this.f1082c + ", " + this.f1081b + "-byte tags, and " + this.f1080a + "-byte key)";
    }

    public d(int i3, int i4, c cVar) {
        this.f1080a = i3;
        this.f1081b = i4;
        this.f1082c = cVar;
    }
}
