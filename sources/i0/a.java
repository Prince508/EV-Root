package I0;

import H0.g;
import H0.k;
import R0.h;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: I0.a$a, reason: collision with other inner class name */
    public static class C0022a {

        /* renamed from: a, reason: collision with root package name */
        public final X509Certificate f804a;

        /* renamed from: b, reason: collision with root package name */
        public final k f805b;

        /* renamed from: c, reason: collision with root package name */
        public k f806c;

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f807d;

        /* renamed from: e, reason: collision with root package name */
        public int f808e;

        public C0022a(X509Certificate x509Certificate, k kVar, k kVar2, byte[] bArr, int i3) {
            this.f804a = x509Certificate;
            this.f805b = kVar;
            this.f806c = kVar2;
            this.f807d = bArr;
            this.f808e = i3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0022a)) {
                return false;
            }
            C0022a c0022a = (C0022a) obj;
            return this.f804a.equals(c0022a.f804a) && this.f805b == c0022a.f805b && this.f806c == c0022a.f806c && Arrays.equals(this.f807d, c0022a.f807d) && this.f808e == c0022a.f808e;
        }

        public int hashCode() {
            X509Certificate x509Certificate = this.f804a;
            int hashCode = ((x509Certificate == null ? 0 : x509Certificate.hashCode()) + 31) * 31;
            k kVar = this.f805b;
            int hashCode2 = (hashCode + (kVar == null ? 0 : kVar.hashCode())) * 31;
            k kVar2 = this.f806c;
            return ((((hashCode2 + (kVar2 != null ? kVar2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f807d)) * 31) + this.f808e;
        }
    }

    public static List a(ByteBuffer byteBuffer) {
        h hVar;
        ArrayList arrayList = new ArrayList();
        h hVar2 = null;
        if (byteBuffer == null || !byteBuffer.hasRemaining()) {
            return null;
        }
        g.b(byteBuffer);
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            int i3 = 0;
            try {
                try {
                    if (byteBuffer.getInt() != 1) {
                        throw new IllegalArgumentException("Encoded SigningCertificateLineage has a version different than any of which we are aware");
                    }
                    HashSet hashSet = new HashSet();
                    int i4 = 0;
                    while (byteBuffer.hasRemaining()) {
                        i3++;
                        ByteBuffer i5 = g.i(byteBuffer);
                        ByteBuffer i6 = g.i(i5);
                        int i7 = i5.getInt();
                        int i8 = i5.getInt();
                        k f3 = k.f(i4);
                        byte[] k3 = g.k(i5);
                        if (hVar2 != null) {
                            String str = (String) f3.k().a();
                            AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) f3.k().b();
                            PublicKey publicKey = hVar2.getPublicKey();
                            hVar = hVar2;
                            Signature signature = Signature.getInstance(str);
                            signature.initVerify(publicKey);
                            if (algorithmParameterSpec != null) {
                                signature.setParameter(algorithmParameterSpec);
                            }
                            signature.update(i6);
                            if (!signature.verify(k3)) {
                                throw new SecurityException("Unable to verify signature of certificate #" + i3 + " using " + str + " when verifying SourceStampCertificateLineage object");
                            }
                        } else {
                            hVar = hVar2;
                        }
                        i6.rewind();
                        byte[] k4 = g.k(i6);
                        int i9 = i6.getInt();
                        if (hVar != null && i4 != i9) {
                            throw new SecurityException("Signing algorithm ID mismatch for certificate #" + i5 + " when verifying SourceStampCertificateLineage object");
                        }
                        h hVar3 = new h((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(k4)), k4);
                        if (hashSet.contains(hVar3)) {
                            throw new SecurityException("Encountered duplicate entries in SigningCertificateLineage at certificate #" + i3 + ".  All signing certificates should be unique");
                        }
                        hashSet.add(hVar3);
                        arrayList.add(new C0022a(hVar3, k.f(i9), k.f(i8), k3, i7));
                        hVar2 = hVar3;
                        i4 = i8;
                    }
                    return arrayList;
                } catch (InvalidAlgorithmParameterException e3) {
                    e = e3;
                    throw new SecurityException("Failed to verify signature over signed data for certificate #0 when parsing SourceStampCertificateLineage object", e);
                } catch (InvalidKeyException e4) {
                    e = e4;
                    throw new SecurityException("Failed to verify signature over signed data for certificate #0 when parsing SourceStampCertificateLineage object", e);
                } catch (NoSuchAlgorithmException e5) {
                    e = e5;
                    throw new SecurityException("Failed to verify signature over signed data for certificate #0 when parsing SourceStampCertificateLineage object", e);
                } catch (SignatureException e6) {
                    e = e6;
                    throw new SecurityException("Failed to verify signature over signed data for certificate #0 when parsing SourceStampCertificateLineage object", e);
                } catch (CertificateException e7) {
                    throw new SecurityException("Failed to decode certificate #0 when parsing SourceStampCertificateLineage object", e7);
                }
            } catch (G0.a | BufferUnderflowException e8) {
                throw new IOException("Failed to parse SourceStampCertificateLineage object", e8);
            }
        } catch (CertificateException e9) {
            throw new IllegalStateException("Failed to obtain X.509 CertificateFactory", e9);
        }
    }
}
