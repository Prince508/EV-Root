package P1;

import G1.b;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class b implements B1.a {

    /* renamed from: e, reason: collision with root package name */
    public static final b.EnumC0011b f1674e = b.EnumC0011b.f580e;

    /* renamed from: f, reason: collision with root package name */
    public static final ThreadLocal f1675f = new a();

    /* renamed from: g, reason: collision with root package name */
    public static final ThreadLocal f1676g = new C0045b();

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f1677a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f1678b;

    /* renamed from: c, reason: collision with root package name */
    public final SecretKeySpec f1679c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1680d;

    public class a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return (Cipher) i.f1710b.a("AES/ECB/NOPADDING");
            } catch (GeneralSecurityException e3) {
                throw new IllegalStateException(e3);
            }
        }
    }

    /* renamed from: P1.b$b, reason: collision with other inner class name */
    public class C0045b extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return (Cipher) i.f1710b.a("AES/CTR/NOPADDING");
            } catch (GeneralSecurityException e3) {
                throw new IllegalStateException(e3);
            }
        }
    }

    public b(byte[] bArr, int i3) {
        if (!f1674e.c()) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i3 != 12 && i3 != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.f1680d = i3;
        r.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f1679c = secretKeySpec;
        Cipher cipher = (Cipher) f1675f.get();
        cipher.init(1, secretKeySpec);
        byte[] c3 = c(cipher.doFinal(new byte[16]));
        this.f1677a = c3;
        this.f1678b = c(c3);
    }

    public static byte[] c(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i3 = 0;
        while (i3 < 15) {
            int i4 = i3 + 1;
            bArr2[i3] = (byte) (((bArr[i3] << 1) ^ ((bArr[i4] & 255) >>> 7)) & 255);
            i3 = i4;
        }
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (bArr[15] << 1));
        return bArr2;
    }

    public static byte[] f(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i3 = 0; i3 < length; i3++) {
            bArr3[i3] = (byte) (bArr[i3] ^ bArr2[i3]);
        }
        return bArr3;
    }

    @Override // B1.a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i3 = this.f1680d;
        if (length > 2147483631 - i3) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + i3 + 16];
        byte[] c3 = p.c(i3);
        System.arraycopy(c3, 0, bArr3, 0, this.f1680d);
        Cipher cipher = (Cipher) f1675f.get();
        cipher.init(1, this.f1679c);
        byte[] d3 = d(cipher, 0, c3, 0, c3.length);
        byte[] bArr4 = bArr2 == null ? new byte[0] : bArr2;
        byte[] d4 = d(cipher, 1, bArr4, 0, bArr4.length);
        Cipher cipher2 = (Cipher) f1676g.get();
        cipher2.init(1, this.f1679c, new IvParameterSpec(d3));
        cipher2.doFinal(bArr, 0, bArr.length, bArr3, this.f1680d);
        byte[] d5 = d(cipher, 2, bArr3, this.f1680d, bArr.length);
        int length2 = bArr.length + this.f1680d;
        for (int i4 = 0; i4 < 16; i4++) {
            bArr3[length2 + i4] = (byte) ((d4[i4] ^ d3[i4]) ^ d5[i4]);
        }
        return bArr3;
    }

    @Override // B1.a
    public byte[] b(byte[] bArr, byte[] bArr2) {
        int length = (bArr.length - this.f1680d) - 16;
        if (length < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        Cipher cipher = (Cipher) f1675f.get();
        cipher.init(1, this.f1679c);
        byte[] d3 = d(cipher, 0, bArr, 0, this.f1680d);
        byte[] bArr3 = bArr2 == null ? new byte[0] : bArr2;
        byte[] d4 = d(cipher, 1, bArr3, 0, bArr3.length);
        byte[] d5 = d(cipher, 2, bArr, this.f1680d, length);
        int length2 = bArr.length - 16;
        byte b3 = 0;
        for (int i3 = 0; i3 < 16; i3++) {
            b3 = (byte) (b3 | (((bArr[length2 + i3] ^ d4[i3]) ^ d3[i3]) ^ d5[i3]));
        }
        if (b3 != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher2 = (Cipher) f1676g.get();
        cipher2.init(1, this.f1679c, new IvParameterSpec(d3));
        return cipher2.doFinal(bArr, this.f1680d, length);
    }

    public final byte[] d(Cipher cipher, int i3, byte[] bArr, int i4, int i5) {
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i3;
        if (i5 == 0) {
            return cipher.doFinal(f(bArr2, this.f1677a));
        }
        byte[] doFinal = cipher.doFinal(bArr2);
        int i6 = 0;
        while (i5 - i6 > 16) {
            for (int i7 = 0; i7 < 16; i7++) {
                doFinal[i7] = (byte) (doFinal[i7] ^ bArr[(i4 + i6) + i7]);
            }
            doFinal = cipher.doFinal(doFinal);
            i6 += 16;
        }
        return cipher.doFinal(f(doFinal, e(Arrays.copyOfRange(bArr, i6 + i4, i4 + i5))));
    }

    public final byte[] e(byte[] bArr) {
        if (bArr.length == 16) {
            return f(bArr, this.f1677a);
        }
        byte[] copyOf = Arrays.copyOf(this.f1678b, 16);
        for (int i3 = 0; i3 < bArr.length; i3++) {
            copyOf[i3] = (byte) (copyOf[i3] ^ bArr[i3]);
        }
        copyOf[bArr.length] = (byte) (copyOf[bArr.length] ^ 128);
        return copyOf;
    }
}
