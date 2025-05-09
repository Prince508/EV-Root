package K1;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class l extends q {

    /* renamed from: a, reason: collision with root package name */
    public final int f1109a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1110b;

    /* renamed from: c, reason: collision with root package name */
    public final d f1111c;

    /* renamed from: d, reason: collision with root package name */
    public final c f1112d;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public Integer f1113a;

        /* renamed from: b, reason: collision with root package name */
        public Integer f1114b;

        /* renamed from: c, reason: collision with root package name */
        public c f1115c;

        /* renamed from: d, reason: collision with root package name */
        public d f1116d;

        public static void f(int i3, c cVar) {
            if (i3 < 10) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i3)));
            }
            if (cVar == c.f1117b) {
                if (i3 > 20) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", Integer.valueOf(i3)));
                }
                return;
            }
            if (cVar == c.f1118c) {
                if (i3 > 28) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", Integer.valueOf(i3)));
                }
                return;
            }
            if (cVar == c.f1119d) {
                if (i3 > 32) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", Integer.valueOf(i3)));
                }
            } else if (cVar == c.f1120e) {
                if (i3 > 48) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", Integer.valueOf(i3)));
                }
            } else {
                if (cVar != c.f1121f) {
                    throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
                }
                if (i3 > 64) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", Integer.valueOf(i3)));
                }
            }
        }

        public l a() {
            Integer num = this.f1113a;
            if (num == null) {
                throw new GeneralSecurityException("key size is not set");
            }
            if (this.f1114b == null) {
                throw new GeneralSecurityException("tag size is not set");
            }
            if (this.f1115c == null) {
                throw new GeneralSecurityException("hash type is not set");
            }
            if (this.f1116d == null) {
                throw new GeneralSecurityException("variant is not set");
            }
            if (num.intValue() < 16) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.f1113a));
            }
            f(this.f1114b.intValue(), this.f1115c);
            return new l(this.f1113a.intValue(), this.f1114b.intValue(), this.f1116d, this.f1115c);
        }

        public b b(c cVar) {
            this.f1115c = cVar;
            return this;
        }

        public b c(int i3) {
            this.f1113a = Integer.valueOf(i3);
            return this;
        }

        public b d(int i3) {
            this.f1114b = Integer.valueOf(i3);
            return this;
        }

        public b e(d dVar) {
            this.f1116d = dVar;
            return this;
        }

        public b() {
            this.f1113a = null;
            this.f1114b = null;
            this.f1115c = null;
            this.f1116d = d.f1126e;
        }
    }

    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f1117b = new c("SHA1");

        /* renamed from: c, reason: collision with root package name */
        public static final c f1118c = new c("SHA224");

        /* renamed from: d, reason: collision with root package name */
        public static final c f1119d = new c("SHA256");

        /* renamed from: e, reason: collision with root package name */
        public static final c f1120e = new c("SHA384");

        /* renamed from: f, reason: collision with root package name */
        public static final c f1121f = new c("SHA512");

        /* renamed from: a, reason: collision with root package name */
        public final String f1122a;

        public c(String str) {
            this.f1122a = str;
        }

        public String toString() {
            return this.f1122a;
        }
    }

    public static final class d {

        /* renamed from: b, reason: collision with root package name */
        public static final d f1123b = new d("TINK");

        /* renamed from: c, reason: collision with root package name */
        public static final d f1124c = new d("CRUNCHY");

        /* renamed from: d, reason: collision with root package name */
        public static final d f1125d = new d("LEGACY");

        /* renamed from: e, reason: collision with root package name */
        public static final d f1126e = new d("NO_PREFIX");

        /* renamed from: a, reason: collision with root package name */
        public final String f1127a;

        public d(String str) {
            this.f1127a = str;
        }

        public String toString() {
            return this.f1127a;
        }
    }

    public static b a() {
        return new b();
    }

    public int b() {
        return this.f1110b;
    }

    public c c() {
        return this.f1112d;
    }

    public int d() {
        return this.f1109a;
    }

    public int e() {
        int b3;
        d dVar = this.f1111c;
        if (dVar == d.f1126e) {
            return b();
        }
        if (dVar == d.f1123b) {
            b3 = b();
        } else if (dVar == d.f1124c) {
            b3 = b();
        } else {
            if (dVar != d.f1125d) {
                throw new IllegalStateException("Unknown variant");
            }
            b3 = b();
        }
        return b3 + 5;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return lVar.d() == d() && lVar.e() == e() && lVar.f() == f() && lVar.c() == c();
    }

    public d f() {
        return this.f1111c;
    }

    public boolean g() {
        return this.f1111c != d.f1126e;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f1109a), Integer.valueOf(this.f1110b), this.f1111c, this.f1112d);
    }

    public String toString() {
        return "HMAC Parameters (variant: " + this.f1111c + ", hashType: " + this.f1112d + ", " + this.f1110b + "-byte tags, and " + this.f1109a + "-byte key)";
    }

    public l(int i3, int i4, d dVar, c cVar) {
        this.f1109a = i3;
        this.f1110b = i4;
        this.f1111c = dVar;
        this.f1112d = cVar;
    }
}
