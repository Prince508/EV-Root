package E1;

import P1.i;
import P1.p;
import P1.q;
import P1.r;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class a implements B1.a {

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f340b = new C0005a();

    /* renamed from: a, reason: collision with root package name */
    public final SecretKey f341a;

    /* renamed from: E1.a$a, reason: collision with other inner class name */
    public class C0005a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return (Cipher) i.f1710b.a("AES/GCM-SIV/NoPadding");
            } catch (GeneralSecurityException e3) {
                throw new IllegalStateException(e3);
            }
        }
    }

    public a(byte[] bArr) {
        r.a(bArr.length);
        this.f341a = new SecretKeySpec(bArr, "AES");
    }

    public static AlgorithmParameterSpec c(byte[] bArr) {
        return d(bArr, 0, bArr.length);
    }

    public static AlgorithmParameterSpec d(byte[] bArr, int i3, int i4) {
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            return new GCMParameterSpec(128, bArr, i3, i4);
        } catch (ClassNotFoundException unused) {
            if (q.b()) {
                return new IvParameterSpec(bArr, i3, i4);
            }
            throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
        }
    }

    @Override // B1.a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + 28];
        byte[] c3 = p.c(12);
        System.arraycopy(c3, 0, bArr3, 0, 12);
        AlgorithmParameterSpec c4 = c(c3);
        ThreadLocal threadLocal = f340b;
        ((Cipher) threadLocal.get()).init(1, this.f341a, c4);
        if (bArr2 != null && bArr2.length != 0) {
            ((Cipher) threadLocal.get()).updateAAD(bArr2);
        }
        int doFinal = ((Cipher) threadLocal.get()).doFinal(bArr, 0, bArr.length, bArr3, 12);
        if (doFinal == bArr.length + 16) {
            return bArr3;
        }
        throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(doFinal - bArr.length)));
    }

    @Override // B1.a
    public byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec d3 = d(bArr, 0, 12);
        ThreadLocal threadLocal = f340b;
        ((Cipher) threadLocal.get()).init(2, this.f341a, d3);
        if (bArr2 != null && bArr2.length != 0) {
            ((Cipher) threadLocal.get()).updateAAD(bArr2);
        }
        return ((Cipher) threadLocal.get()).doFinal(bArr, 12, bArr.length - 12);
    }
}
