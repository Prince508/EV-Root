package K1;

import K1.l;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class i extends p {

    /* renamed from: a, reason: collision with root package name */
    public final l f1099a;

    /* renamed from: b, reason: collision with root package name */
    public final Q1.b f1100b;

    /* renamed from: c, reason: collision with root package name */
    public final Q1.a f1101c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f1102d;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public l f1103a;

        /* renamed from: b, reason: collision with root package name */
        public Q1.b f1104b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f1105c;

        public i a() {
            l lVar = this.f1103a;
            if (lVar == null || this.f1104b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (lVar.d() != this.f1104b.b()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f1103a.g() && this.f1105c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f1103a.g() && this.f1105c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new i(this.f1103a, this.f1104b, b(), this.f1105c);
        }

        public final Q1.a b() {
            if (this.f1103a.f() == l.d.f1126e) {
                return Q1.a.a(new byte[0]);
            }
            if (this.f1103a.f() == l.d.f1125d || this.f1103a.f() == l.d.f1124c) {
                return Q1.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f1105c.intValue()).array());
            }
            if (this.f1103a.f() == l.d.f1123b) {
                return Q1.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f1105c.intValue()).array());
            }
            throw new IllegalStateException("Unknown HmacParameters.Variant: " + this.f1103a.f());
        }

        public b c(Integer num) {
            this.f1105c = num;
            return this;
        }

        public b d(Q1.b bVar) {
            this.f1104b = bVar;
            return this;
        }

        public b e(l lVar) {
            this.f1103a = lVar;
            return this;
        }

        public b() {
            this.f1103a = null;
            this.f1104b = null;
            this.f1105c = null;
        }
    }

    public static b c() {
        return new b();
    }

    @Override // K1.p
    public Q1.a a() {
        return this.f1101c;
    }

    @Override // K1.p
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public l b() {
        return this.f1099a;
    }

    public i(l lVar, Q1.b bVar, Q1.a aVar, Integer num) {
        this.f1099a = lVar;
        this.f1100b = bVar;
        this.f1101c = aVar;
        this.f1102d = num;
    }
}
