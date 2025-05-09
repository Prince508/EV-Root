package C1;

import C1.C0181i;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* renamed from: C1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0179g extends AbstractC0174b {

    /* renamed from: a, reason: collision with root package name */
    public final C0181i f217a;

    /* renamed from: b, reason: collision with root package name */
    public final Q1.b f218b;

    /* renamed from: c, reason: collision with root package name */
    public final Q1.a f219c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f220d;

    /* renamed from: C1.g$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public C0181i f221a;

        /* renamed from: b, reason: collision with root package name */
        public Q1.b f222b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f223c;

        public C0179g a() {
            C0181i c0181i = this.f221a;
            if (c0181i == null || this.f222b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (c0181i.c() != this.f222b.b()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f221a.f() && this.f223c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f221a.f() && this.f223c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new C0179g(this.f221a, this.f222b, b(), this.f223c);
        }

        public final Q1.a b() {
            if (this.f221a.e() == C0181i.c.f235d) {
                return Q1.a.a(new byte[0]);
            }
            if (this.f221a.e() == C0181i.c.f234c) {
                return Q1.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f223c.intValue()).array());
            }
            if (this.f221a.e() == C0181i.c.f233b) {
                return Q1.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f223c.intValue()).array());
            }
            throw new IllegalStateException("Unknown AesEaxParameters.Variant: " + this.f221a.e());
        }

        public b c(Integer num) {
            this.f223c = num;
            return this;
        }

        public b d(Q1.b bVar) {
            this.f222b = bVar;
            return this;
        }

        public b e(C0181i c0181i) {
            this.f221a = c0181i;
            return this;
        }

        public b() {
            this.f221a = null;
            this.f222b = null;
            this.f223c = null;
        }
    }

    public static b a() {
        return new b();
    }

    public C0179g(C0181i c0181i, Q1.b bVar, Q1.a aVar, Integer num) {
        this.f217a = c0181i;
        this.f218b = bVar;
        this.f219c = aVar;
        this.f220d = num;
    }
}
