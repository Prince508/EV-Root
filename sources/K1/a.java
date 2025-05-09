package K1;

import K1.d;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class a extends p {

    /* renamed from: a, reason: collision with root package name */
    public final d f1071a;

    /* renamed from: b, reason: collision with root package name */
    public final Q1.b f1072b;

    /* renamed from: c, reason: collision with root package name */
    public final Q1.a f1073c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f1074d;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public d f1075a;

        /* renamed from: b, reason: collision with root package name */
        public Q1.b f1076b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f1077c;

        public a a() {
            d dVar = this.f1075a;
            if (dVar == null || this.f1076b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (dVar.c() != this.f1076b.b()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f1075a.f() && this.f1077c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f1075a.f() && this.f1077c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new a(this.f1075a, this.f1076b, b(), this.f1077c);
        }

        public final Q1.a b() {
            if (this.f1075a.e() == d.c.f1089e) {
                return Q1.a.a(new byte[0]);
            }
            if (this.f1075a.e() == d.c.f1088d || this.f1075a.e() == d.c.f1087c) {
                return Q1.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f1077c.intValue()).array());
            }
            if (this.f1075a.e() == d.c.f1086b) {
                return Q1.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f1077c.intValue()).array());
            }
            throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: " + this.f1075a.e());
        }

        public b c(Q1.b bVar) {
            this.f1076b = bVar;
            return this;
        }

        public b d(Integer num) {
            this.f1077c = num;
            return this;
        }

        public b e(d dVar) {
            this.f1075a = dVar;
            return this;
        }

        public b() {
            this.f1075a = null;
            this.f1076b = null;
            this.f1077c = null;
        }
    }

    public static b c() {
        return new b();
    }

    @Override // K1.p
    public Q1.a a() {
        return this.f1073c;
    }

    @Override // K1.p
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public d b() {
        return this.f1071a;
    }

    public a(d dVar, Q1.b bVar, Q1.a aVar, Integer num) {
        this.f1071a = dVar;
        this.f1072b = bVar;
        this.f1073c = aVar;
        this.f1074d = num;
    }
}
