package P1;

import G1.b;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class a implements l {

    /* renamed from: d, reason: collision with root package name */
    public static final b.EnumC0011b f1669d = b.EnumC0011b.f581f;

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadLocal f1670e = new C0044a();

    /* renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f1671a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1672b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1673c;

    /* renamed from: P1.a$a, reason: collision with other inner class name */
    public class C0044a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return (Cipher) i.f1710b.a("AES/CTR/NoPadding");
            } catch (GeneralSecurityException e3) {
                throw new IllegalStateException(e3);
            }
        }
    }

    public a(byte[] bArr, int i3) {
        if (!f1669d.c()) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        r.a(bArr.length);
        this.f1671a = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) f1670e.get()).getBlockSize();
        this.f1673c = blockSize;
        if (i3 < 12 || i3 > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f1672b = i3;
    }

    @Override // P1.l
    public byte[] a(byte[] bArr) {
        int length = bArr.length;
        int i3 = this.f1672b;
        if (length > Integer.MAX_VALUE - i3) {
            throw new GeneralSecurityException("plaintext length can not exceed " + (Integer.MAX_VALUE - this.f1672b));
        }
        byte[] bArr2 = new byte[bArr.length + i3];
        byte[] c3 = p.c(i3);
        System.arraycopy(c3, 0, bArr2, 0, this.f1672b);
        c(bArr, 0, bArr.length, bArr2, this.f1672b, c3, true);
        return bArr2;
    }

    @Override // P1.l
    public byte[] b(byte[] bArr) {
        int length = bArr.length;
        int i3 = this.f1672b;
        if (length < i3) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, 0, bArr2, 0, i3);
        int length2 = bArr.length;
        int i4 = this.f1672b;
        byte[] bArr3 = new byte[length2 - i4];
        c(bArr, i4, bArr.length - i4, bArr3, 0, bArr2, false);
        return bArr3;
    }

    public final void c(byte[] bArr, int i3, int i4, byte[] bArr2, int i5, byte[] bArr3, boolean z3) {
        Cipher cipher = (Cipher) f1670e.get();
        byte[] bArr4 = new byte[this.f1673c];
        System.arraycopy(bArr3, 0, bArr4, 0, this.f1672b);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        if (z3) {
            cipher.init(1, this.f1671a, ivParameterSpec);
        } else {
            cipher.init(2, this.f1671a, ivParameterSpec);
        }
        if (cipher.doFinal(bArr, i3, i4, bArr2, i5) != i4) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }
}
