package C1;

import C1.q;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class o extends AbstractC0174b {

    /* renamed from: a, reason: collision with root package name */
    public final q f243a;

    /* renamed from: b, reason: collision with root package name */
    public final Q1.b f244b;

    /* renamed from: c, reason: collision with root package name */
    public final Q1.a f245c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f246d;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public q f247a;

        /* renamed from: b, reason: collision with root package name */
        public Q1.b f248b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f249c;

        public o a() {
            q qVar = this.f247a;
            if (qVar == null || this.f248b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (qVar.c() != this.f248b.b()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f247a.f() && this.f249c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f247a.f() && this.f249c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new o(this.f247a, this.f248b, b(), this.f249c);
        }

        public final Q1.a b() {
            if (this.f247a.e() == q.c.f261d) {
                return Q1.a.a(new byte[0]);
            }
            if (this.f247a.e() == q.c.f260c) {
                return Q1.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f249c.intValue()).array());
            }
            if (this.f247a.e() == q.c.f259b) {
                return Q1.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f249c.intValue()).array());
            }
            throw new IllegalStateException("Unknown AesGcmParameters.Variant: " + this.f247a.e());
        }

        public b c(Integer num) {
            this.f249c = num;
            return this;
        }

        public b d(Q1.b bVar) {
            this.f248b = bVar;
            return this;
        }

        public b e(q qVar) {
            this.f247a = qVar;
            return this;
        }

        public b() {
            this.f247a = null;
            this.f248b = null;
            this.f249c = null;
        }
    }

    public static b a() {
        return new b();
    }

    public o(q qVar, Q1.b bVar, Q1.a aVar, Integer num) {
        this.f243a = qVar;
        this.f244b = bVar;
        this.f245c = aVar;
        this.f246d = num;
    }
}
