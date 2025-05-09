package C1;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* renamed from: C1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0181i extends AbstractC0175c {

    /* renamed from: a, reason: collision with root package name */
    public final int f225a;

    /* renamed from: b, reason: collision with root package name */
    public final int f226b;

    /* renamed from: c, reason: collision with root package name */
    public final int f227c;

    /* renamed from: d, reason: collision with root package name */
    public final c f228d;

    /* renamed from: C1.i$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public Integer f229a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f230b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f231c;

        /* renamed from: d, reason: collision with root package name */
        public c f232d;

        public C0181i a() {
            Integer num = this.f229a;
            if (num == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.f230b == null) {
                throw new GeneralSecurityException("IV size is not set");
            }
            if (this.f232d == null) {
                throw new GeneralSecurityException("Variant is not set");
            }
            if (this.f231c != null) {
                return new C0181i(num.intValue(), this.f230b.intValue(), this.f231c.intValue(), this.f232d);
            }
            throw new GeneralSecurityException("Tag size is not set");
        }

        public b b(int i3) {
            if (i3 != 12 && i3 != 16) {
                throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(i3)));
            }
            this.f230b = Integer.valueOf(i3);
            return this;
        }

        public b c(int i3) {
            if (i3 != 16 && i3 != 24 && i3 != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i3)));
            }
            this.f229a = Integer.valueOf(i3);
            return this;
        }

        public b d(int i3) {
            if (i3 < 0 || i3 > 16) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; value must be at most 16 bytes", Integer.valueOf(i3)));
            }
            this.f231c = Integer.valueOf(i3);
            return this;
        }

        public b e(c cVar) {
            this.f232d = cVar;
            return this;
        }

        public b() {
            this.f229a = null;
            this.f230b = null;
            this.f231c = null;
            this.f232d = c.f235d;
        }
    }

    /* renamed from: C1.i$c */
    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f233b = new c("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final c f234c = new c("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final c f235d = new c("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        public final String f236a;

        public c(String str) {
            this.f236a = str;
        }

        public String toString() {
            return this.f236a;
        }
    }

    public static b a() {
        return new b();
    }

    public int b() {
        return this.f226b;
    }

    public int c() {
        return this.f225a;
    }

    public int d() {
        return this.f227c;
    }

    public c e() {
        return this.f228d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0181i)) {
            return false;
        }
        C0181i c0181i = (C0181i) obj;
        return c0181i.c() == c() && c0181i.b() == b() && c0181i.d() == d() && c0181i.e() == e();
    }

    public boolean f() {
        return this.f228d != c.f235d;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f225a), Integer.valueOf(this.f226b), Integer.valueOf(this.f227c), this.f228d);
    }

    public String toString() {
        return "AesEax Parameters (variant: " + this.f228d + ", " + this.f226b + "-byte IV, " + this.f227c + "-byte tag, and " + this.f225a + "-byte key)";
    }

    public C0181i(int i3, int i4, int i5, c cVar) {
        this.f225a = i3;
        this.f226b = i4;
        this.f227c = i5;
        this.f228d = cVar;
    }
}
