package C1;

import C1.v;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class t extends AbstractC0174b {

    /* renamed from: a, reason: collision with root package name */
    public final v f269a;

    /* renamed from: b, reason: collision with root package name */
    public final Q1.b f270b;

    /* renamed from: c, reason: collision with root package name */
    public final Q1.a f271c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f272d;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public v f273a;

        /* renamed from: b, reason: collision with root package name */
        public Q1.b f274b;

        /* renamed from: c, reason: collision with root package name */
        public Integer f275c;

        public t a() {
            v vVar = this.f273a;
            if (vVar == null || this.f274b == null) {
                throw new GeneralSecurityException("Cannot build without parameters and/or key material");
            }
            if (vVar.b() != this.f274b.b()) {
                throw new GeneralSecurityException("Key size mismatch");
            }
            if (this.f273a.d() && this.f275c == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.f273a.d() && this.f275c != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            return new t(this.f273a, this.f274b, b(), this.f275c);
        }

        public final Q1.a b() {
            if (this.f273a.c() == v.c.f283d) {
                return Q1.a.a(new byte[0]);
            }
            if (this.f273a.c() == v.c.f282c) {
                return Q1.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(this.f275c.intValue()).array());
            }
            if (this.f273a.c() == v.c.f281b) {
                return Q1.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(this.f275c.intValue()).array());
            }
            throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: " + this.f273a.c());
        }

        public b c(Integer num) {
            this.f275c = num;
            return this;
        }

        public b d(Q1.b bVar) {
            this.f274b = bVar;
            return this;
        }

        public b e(v vVar) {
            this.f273a = vVar;
            return this;
        }

        public b() {
            this.f273a = null;
            this.f274b = null;
            this.f275c = null;
        }
    }

    public static b a() {
        return new b();
    }

    public t(v vVar, Q1.b bVar, Q1.a aVar, Integer num) {
        this.f269a = vVar;
        this.f270b = bVar;
        this.f271c = aVar;
        this.f272d = num;
    }
}
