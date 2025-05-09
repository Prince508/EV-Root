package L0;

import H0.e;
import H0.k;
import R0.h;
import R0.m;
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
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class d {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final X509Certificate f1328a;

        /* renamed from: b, reason: collision with root package name */
        public final k f1329b;

        /* renamed from: c, reason: collision with root package name */
        public k f1330c;

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f1331d;

        /* renamed from: e, reason: collision with root package name */
        public int f1332e;

        public a(X509Certificate x509Certificate, k kVar, k kVar2, byte[] bArr, int i3) {
            this.f1328a = x509Certificate;
            this.f1329b = kVar;
            this.f1330c = kVar2;
            this.f1331d = bArr;
            this.f1332e = i3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f1328a.equals(aVar.f1328a) && this.f1329b == aVar.f1329b && this.f1330c == aVar.f1330c && Arrays.equals(this.f1331d, aVar.f1331d) && this.f1332e == aVar.f1332e;
        }

        public int hashCode() {
            return (Objects.hash(this.f1328a, this.f1329b, this.f1330c, Integer.valueOf(this.f1332e)) * 31) + Arrays.hashCode(this.f1331d);
        }
    }

    public static List a(ByteBuffer byteBuffer) {
        ArrayList arrayList = new ArrayList();
        h hVar = null;
        if (byteBuffer == null || !byteBuffer.hasRemaining()) {
            return null;
        }
        e.d(byteBuffer);
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
                    ByteBuffer m3 = e.m(byteBuffer);
                    ByteBuffer m4 = e.m(m3);
                    int i5 = m3.getInt();
                    int i6 = m3.getInt();
                    k f3 = k.f(i4);
                    byte[] q3 = e.q(m3);
                    if (hVar != null) {
                        String str = (String) f3.k().a();
                        AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) f3.k().b();
                        PublicKey publicKey = hVar.getPublicKey();
                        Signature signature = Signature.getInstance(str);
                        signature.initVerify(publicKey);
                        if (algorithmParameterSpec != null) {
                            signature.setParameter(algorithmParameterSpec);
                        }
                        signature.update(m4);
                        if (!signature.verify(q3)) {
                            throw new SecurityException("Unable to verify signature of certificate #" + i3 + " using " + str + " when verifying V3SigningCertificateLineage object");
                        }
                    }
                    m4.rewind();
                    byte[] q4 = e.q(m4);
                    int i7 = m4.getInt();
                    if (hVar != null && i4 != i7) {
                        throw new SecurityException("Signing algorithm ID mismatch for certificate #" + m3 + " when verifying V3SigningCertificateLineage object");
                    }
                    h hVar2 = new h(m.c(q4), q4);
                    if (hashSet.contains(hVar2)) {
                        throw new SecurityException("Encountered duplicate entries in SigningCertificateLineage at certificate #" + i3 + ".  All signing certificates should be unique");
                    }
                    hashSet.add(hVar2);
                    arrayList.add(new a(hVar2, k.f(i7), k.f(i6), q3, i5));
                    hVar = hVar2;
                    i4 = i6;
                }
                return arrayList;
            } catch (InvalidAlgorithmParameterException e3) {
                e = e3;
                throw new SecurityException("Failed to verify signature over signed data for certificate #0 when parsing V3SigningCertificateLineage object", e);
            } catch (InvalidKeyException e4) {
                e = e4;
                throw new SecurityException("Failed to verify signature over signed data for certificate #0 when parsing V3SigningCertificateLineage object", e);
            } catch (NoSuchAlgorithmException e5) {
                e = e5;
                throw new SecurityException("Failed to verify signature over signed data for certificate #0 when parsing V3SigningCertificateLineage object", e);
            } catch (SignatureException e6) {
                e = e6;
                throw new SecurityException("Failed to verify signature over signed data for certificate #0 when parsing V3SigningCertificateLineage object", e);
            } catch (CertificateException e7) {
                throw new SecurityException("Failed to decode certificate #0 when parsing V3SigningCertificateLineage object", e7);
            }
        } catch (G0.a | BufferUnderflowException e8) {
            throw new IOException("Failed to parse V3SigningCertificateLineage object", e8);
        }
    }
}
