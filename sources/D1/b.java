package D1;

import G1.b;
import P1.q;
import P1.r;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final b.EnumC0011b f330c = b.EnumC0011b.f581f;

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f331d = new a();

    /* renamed from: a, reason: collision with root package name */
    public final SecretKey f332a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f333b;

    public class a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return (Cipher) P1.i.f1710b.a("AES/GCM/NoPadding");
            } catch (GeneralSecurityException e3) {
                throw new IllegalStateException(e3);
            }
        }
    }

    public b(byte[] bArr, boolean z3) {
        if (!f330c.c()) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        r.a(bArr.length);
        this.f332a = new SecretKeySpec(bArr, "AES");
        this.f333b = z3;
    }

    public static AlgorithmParameterSpec c(byte[] bArr) {
        return d(bArr, 0, bArr.length);
    }

    public static AlgorithmParameterSpec d(byte[] bArr, int i3, int i4) {
        return (!q.b() || q.a() > 19) ? new GCMParameterSpec(128, bArr, i3, i4) : new IvParameterSpec(bArr, i3, i4);
    }

    public byte[] a(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        boolean z3 = this.f333b;
        if (bArr2.length < (z3 ? 28 : 16)) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (z3 && !ByteBuffer.wrap(bArr).equals(ByteBuffer.wrap(bArr2, 0, 12))) {
            throw new GeneralSecurityException("iv does not match prepended iv");
        }
        AlgorithmParameterSpec c3 = c(bArr);
        ThreadLocal threadLocal = f331d;
        ((Cipher) threadLocal.get()).init(2, this.f332a, c3);
        if (bArr3 != null && bArr3.length != 0) {
            ((Cipher) threadLocal.get()).updateAAD(bArr3);
        }
        boolean z4 = this.f333b;
        return ((Cipher) threadLocal.get()).doFinal(bArr2, z4 ? 12 : 0, z4 ? bArr2.length - 12 : bArr2.length);
    }

    public byte[] b(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        if (bArr2.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        boolean z3 = this.f333b;
        byte[] bArr4 = new byte[z3 ? bArr2.length + 28 : bArr2.length + 16];
        if (z3) {
            System.arraycopy(bArr, 0, bArr4, 0, 12);
        }
        AlgorithmParameterSpec c3 = c(bArr);
        ThreadLocal threadLocal = f331d;
        ((Cipher) threadLocal.get()).init(1, this.f332a, c3);
        if (bArr3 != null && bArr3.length != 0) {
            ((Cipher) threadLocal.get()).updateAAD(bArr3);
        }
        int doFinal = ((Cipher) threadLocal.get()).doFinal(bArr2, 0, bArr2.length, bArr4, this.f333b ? 12 : 0);
        if (doFinal == bArr2.length + 16) {
            return bArr4;
        }
        throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(doFinal - bArr2.length)));
    }
}
