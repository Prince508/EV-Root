package P1;

import G1.b;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class m implements N1.a {

    /* renamed from: d, reason: collision with root package name */
    public static final b.EnumC0011b f1721d = b.EnumC0011b.f580e;

    /* renamed from: a, reason: collision with root package name */
    public final SecretKey f1722a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f1723b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f1724c;

    public m(byte[] bArr) {
        r.a(bArr.length);
        this.f1722a = new SecretKeySpec(bArr, "AES");
        b();
    }

    public static Cipher c() {
        if (f1721d.c()) {
            return (Cipher) i.f1710b.a("AES/ECB/NoPadding");
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    @Override // N1.a
    public byte[] a(byte[] bArr, int i3) {
        if (i3 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        Cipher c3 = c();
        c3.init(1, this.f1722a);
        int max = Math.max(1, (int) Math.ceil(bArr.length / 16.0d));
        byte[] d3 = max * 16 == bArr.length ? f.d(bArr, (max - 1) * 16, this.f1723b, 0, 16) : f.e(L1.a.a(Arrays.copyOfRange(bArr, (max - 1) * 16, bArr.length)), this.f1724c);
        byte[] bArr2 = new byte[16];
        for (int i4 = 0; i4 < max - 1; i4++) {
            bArr2 = c3.doFinal(f.d(bArr2, 0, bArr, i4 * 16, 16));
        }
        return Arrays.copyOf(c3.doFinal(f.e(d3, bArr2)), i3);
    }

    public final void b() {
        Cipher c3 = c();
        c3.init(1, this.f1722a);
        byte[] b3 = L1.a.b(c3.doFinal(new byte[16]));
        this.f1723b = b3;
        this.f1724c = L1.a.b(b3);
    }
}
