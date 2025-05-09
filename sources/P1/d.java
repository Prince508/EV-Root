package P1;

import G1.b;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class d implements B1.e {

    /* renamed from: c, reason: collision with root package name */
    public static final b.EnumC0011b f1683c = b.EnumC0011b.f580e;

    /* renamed from: d, reason: collision with root package name */
    public static final Collection f1684d = Arrays.asList(64);

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f1685e = new byte[16];

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f1686f = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};

    /* renamed from: a, reason: collision with root package name */
    public final m f1687a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f1688b;

    public d(byte[] bArr) {
        if (!f1683c.c()) {
            throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
        }
        if (f1684d.contains(Integer.valueOf(bArr.length))) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
            this.f1688b = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
            this.f1687a = new m(copyOfRange);
        } else {
            throw new InvalidKeyException("invalid key size: " + bArr.length + " bytes; key must have 64 bytes");
        }
    }

    @Override // B1.e
    public byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length > 2147483631) {
            throw new GeneralSecurityException("plaintext too long");
        }
        Cipher cipher = (Cipher) i.f1710b.a("AES/CTR/NoPadding");
        byte[] c3 = c(bArr2, bArr);
        byte[] bArr3 = (byte[]) c3.clone();
        bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
        bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
        cipher.init(1, new SecretKeySpec(this.f1688b, "AES"), new IvParameterSpec(bArr3));
        return f.a(c3, cipher.doFinal(bArr));
    }

    @Override // B1.e
    public byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr.length < 16) {
            throw new GeneralSecurityException("Ciphertext too short.");
        }
        Cipher cipher = (Cipher) i.f1710b.a("AES/CTR/NoPadding");
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
        byte[] bArr3 = (byte[]) copyOfRange.clone();
        bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
        bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
        cipher.init(2, new SecretKeySpec(this.f1688b, "AES"), new IvParameterSpec(bArr3));
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
        byte[] doFinal = cipher.doFinal(copyOfRange2);
        if (copyOfRange2.length == 0 && doFinal == null && q.b()) {
            doFinal = new byte[0];
        }
        if (f.b(copyOfRange, c(bArr2, doFinal))) {
            return doFinal;
        }
        throw new AEADBadTagException("Integrity check failed.");
    }

    public final byte[] c(byte[]... bArr) {
        if (bArr.length == 0) {
            return this.f1687a.a(f1686f, 16);
        }
        byte[] a3 = this.f1687a.a(f1685e, 16);
        for (int i3 = 0; i3 < bArr.length - 1; i3++) {
            byte[] bArr2 = bArr[i3];
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            a3 = f.e(L1.a.b(a3), this.f1687a.a(bArr2, 16));
        }
        byte[] bArr3 = bArr[bArr.length - 1];
        return this.f1687a.a(bArr3.length >= 16 ? f.f(bArr3, a3) : f.e(L1.a.a(bArr3), L1.a.b(a3)), 16);
    }
}
