package P1;

import G1.b;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c implements B1.a {

    /* renamed from: b, reason: collision with root package name */
    public static final b.EnumC0011b f1681b = b.EnumC0011b.f581f;

    /* renamed from: a, reason: collision with root package name */
    public final D1.b f1682a;

    public c(byte[] bArr) {
        if (!f1681b.c()) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f1682a = new D1.b(bArr, true);
    }

    @Override // B1.a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        return this.f1682a.b(p.c(12), bArr, bArr2);
    }

    @Override // B1.a
    public byte[] b(byte[] bArr, byte[] bArr2) {
        return this.f1682a.a(Arrays.copyOf(bArr, 12), bArr, bArr2);
    }
}
