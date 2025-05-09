package R0;

import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.Arrays;

/* loaded from: classes.dex */
public class h extends f {

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f1864f;

    /* renamed from: g, reason: collision with root package name */
    public int f1865g;

    public h(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.f1865g = -1;
        this.f1864f = bArr != null ? (byte[]) bArr.clone() : null;
    }

    @Override // java.security.cert.Certificate
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X509Certificate)) {
            return false;
        }
        try {
            return Arrays.equals(getEncoded(), ((X509Certificate) obj).getEncoded());
        } catch (CertificateEncodingException unused) {
            return false;
        }
    }

    @Override // java.security.cert.Certificate
    public byte[] getEncoded() {
        byte[] bArr = this.f1864f;
        if (bArr != null) {
            return (byte[]) bArr.clone();
        }
        return null;
    }

    @Override // java.security.cert.Certificate
    public int hashCode() {
        if (this.f1865g == -1) {
            try {
                this.f1865g = Arrays.hashCode(getEncoded());
            } catch (CertificateEncodingException unused) {
                this.f1865g = 0;
            }
        }
        return this.f1865g;
    }
}
