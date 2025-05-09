package K0;

import F0.d;
import G0.c;
import H0.e;
import H0.k;
import H0.l;
import R0.c;
import R0.h;
import R0.m;
import U0.g;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class a {
    public static void a(ByteBuffer byteBuffer, CertificateFactory certificateFactory, e.f.a aVar, Set set, Map map, Set set2, int i3, int i4) {
        byte[] encoded;
        ByteBuffer m3 = e.m(byteBuffer);
        byte[] bArr = new byte[m3.remaining()];
        m3.get(bArr);
        m3.flip();
        aVar.f707m = bArr;
        ByteBuffer m4 = e.m(byteBuffer);
        byte[] q3 = e.q(byteBuffer);
        ArrayList arrayList = new ArrayList(1);
        int i5 = 0;
        int i6 = 0;
        while (m4.hasRemaining()) {
            i6++;
            try {
                ByteBuffer m5 = e.m(m4);
                int i7 = m5.getInt();
                byte[] q4 = e.q(m5);
                aVar.f704j.add(new e.f.a.c(i7, q4));
                k f3 = k.f(i7);
                if (f3 == null) {
                    aVar.i(d.e.V2_SIG_UNKNOWN_SIG_ALGORITHM, Integer.valueOf(i7));
                } else {
                    arrayList.add(new e.h(f3, q4));
                }
            } catch (G0.a | BufferUnderflowException unused) {
                aVar.h(d.e.V2_SIG_MALFORMED_SIGNATURE, Integer.valueOf(i6));
                return;
            }
        }
        if (aVar.f704j.isEmpty()) {
            aVar.h(d.e.V2_SIG_NO_SIGNATURES, new Object[0]);
            return;
        }
        try {
            for (e.h hVar : e.n(arrayList, i3, i4)) {
                k kVar = hVar.f724a;
                String str = (String) kVar.k().a();
                AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) kVar.k().b();
                try {
                    PublicKey generatePublic = KeyFactory.getInstance(kVar.i()).generatePublic(new X509EncodedKeySpec(q3));
                    try {
                        Signature signature = Signature.getInstance(str);
                        signature.initVerify(generatePublic);
                        if (algorithmParameterSpec != null) {
                            signature.setParameter(algorithmParameterSpec);
                        }
                        m3.position(0);
                        signature.update(m3);
                        byte[] bArr2 = hVar.f725b;
                        if (!signature.verify(bArr2)) {
                            aVar.h(d.e.V2_SIG_DID_NOT_VERIFY, kVar);
                            return;
                        } else {
                            aVar.f705k.put(kVar, bArr2);
                            set.add(kVar.g());
                        }
                    } catch (InvalidAlgorithmParameterException e3) {
                        e = e3;
                        aVar.h(d.e.V2_SIG_VERIFY_EXCEPTION, kVar, e);
                        return;
                    } catch (InvalidKeyException e4) {
                        e = e4;
                        aVar.h(d.e.V2_SIG_VERIFY_EXCEPTION, kVar, e);
                        return;
                    } catch (SignatureException e5) {
                        e = e5;
                        aVar.h(d.e.V2_SIG_VERIFY_EXCEPTION, kVar, e);
                        return;
                    }
                } catch (Exception e6) {
                    aVar.h(d.e.V2_SIG_MALFORMED_PUBLIC_KEY, e6);
                    return;
                }
            }
            m3.position(0);
            ByteBuffer m6 = e.m(m3);
            ByteBuffer m7 = e.m(m3);
            ByteBuffer m8 = e.m(m3);
            int i8 = -1;
            while (m7.hasRemaining()) {
                int i9 = i8 + 1;
                byte[] q5 = e.q(m7);
                try {
                    aVar.f675c.add(new h(m.d(q5, certificateFactory), q5));
                    i8 = i9;
                } catch (CertificateException e7) {
                    aVar.h(d.e.V2_SIG_MALFORMED_CERTIFICATE, Integer.valueOf(i9), Integer.valueOf(i8 + 2), e7);
                    return;
                }
            }
            if (aVar.f675c.isEmpty()) {
                aVar.h(d.e.V2_SIG_NO_CERTIFICATES, new Object[0]);
                return;
            }
            X509Certificate x509Certificate = (X509Certificate) aVar.f675c.get(0);
            try {
                encoded = e.j(x509Certificate.getPublicKey());
            } catch (InvalidKeyException e8) {
                System.out.println("Caught an exception encoding the public key: " + e8);
                e8.printStackTrace();
                encoded = x509Certificate.getPublicKey().getEncoded();
            }
            if (!Arrays.equals(q3, encoded)) {
                aVar.h(d.e.V2_SIG_PUBLIC_KEY_MISMATCH_BETWEEN_CERTIFICATE_AND_SIGNATURES_RECORD, e.s(encoded), e.s(q3));
                return;
            }
            int i10 = 0;
            while (m6.hasRemaining()) {
                i10++;
                try {
                    ByteBuffer m9 = e.m(m6);
                    aVar.f702h.add(new e.f.a.b(m9.getInt(), e.q(m9)));
                } catch (G0.a | BufferUnderflowException unused2) {
                    aVar.h(d.e.V2_SIG_MALFORMED_DIGEST, Integer.valueOf(i10));
                    return;
                }
            }
            ArrayList arrayList2 = new ArrayList(aVar.f704j.size());
            Iterator it = aVar.f704j.iterator();
            while (it.hasNext()) {
                arrayList2.add(Integer.valueOf(((e.f.a.c) it.next()).a()));
            }
            ArrayList arrayList3 = new ArrayList(aVar.f702h.size());
            Iterator it2 = aVar.f702h.iterator();
            while (it2.hasNext()) {
                arrayList3.add(Integer.valueOf(((e.f.a.b) it2.next()).a()));
            }
            if (!arrayList2.equals(arrayList3)) {
                aVar.h(d.e.V2_SIG_SIG_ALG_MISMATCH_BETWEEN_SIGNATURES_AND_DIGESTS_RECORDS, arrayList2, arrayList3);
                return;
            }
            Set keySet = map.keySet();
            HashSet<Integer> hashSet = new HashSet(1);
            while (m8.hasRemaining()) {
                i5++;
                try {
                    ByteBuffer m10 = e.m(m8);
                    int i11 = m10.getInt();
                    byte[] a3 = c.a(m10);
                    aVar.f706l.add(new e.f.a.C0018a(i11, a3));
                    if (i11 != -1091571699) {
                        aVar.i(d.e.V2_SIG_UNKNOWN_ADDITIONAL_ATTRIBUTE, Integer.valueOf(i11));
                    } else {
                        int i12 = ByteBuffer.wrap(a3).order(ByteOrder.LITTLE_ENDIAN).getInt();
                        if (keySet.contains(Integer.valueOf(i12))) {
                            hashSet.add(Integer.valueOf(i12));
                        } else {
                            aVar.i(d.e.V2_SIG_UNKNOWN_APK_SIG_SCHEME_ID, Integer.valueOf(aVar.f673a), Integer.valueOf(i12));
                        }
                    }
                } catch (G0.a | BufferUnderflowException unused3) {
                    aVar.h(d.e.V2_SIG_MALFORMED_ADDITIONAL_ATTRIBUTE, Integer.valueOf(i5));
                    return;
                }
            }
            for (Integer num : hashSet) {
                num.intValue();
                if (!set2.contains(num)) {
                    aVar.h(d.e.V2_SIG_MISSING_APK_SIG_REFERENCED, Integer.valueOf(aVar.f673a), (String) map.get(num));
                }
            }
        } catch (e.C0017e e9) {
            aVar.h(d.e.V2_SIG_NO_SUPPORTED_SIGNATURES, e9);
        }
    }

    public static void b(ByteBuffer byteBuffer, Set set, Map map, Set set2, int i3, int i4, e.f fVar) {
        try {
            ByteBuffer m3 = e.m(byteBuffer);
            if (!m3.hasRemaining()) {
                fVar.c(d.e.V2_SIG_NO_SIGNERS, new Object[0]);
                return;
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                int i5 = 0;
                while (m3.hasRemaining()) {
                    int i6 = i5 + 1;
                    e.f.a aVar = new e.f.a();
                    aVar.f673a = i5;
                    fVar.f699g.add(aVar);
                    try {
                        a(e.m(m3), certificateFactory, aVar, set, map, set2, i3, i4);
                        i5 = i6;
                    } catch (G0.a | BufferUnderflowException unused) {
                        aVar.h(d.e.V2_SIG_MALFORMED_SIGNER, new Object[0]);
                        return;
                    }
                }
                if (i5 > 10) {
                    fVar.c(d.e.V2_SIG_MAX_SIGNATURES_EXCEEDED, 10, Integer.valueOf(i5));
                }
            } catch (CertificateException e3) {
                throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e3);
            }
        } catch (G0.a unused2) {
            fVar.c(d.e.V2_SIG_MALFORMED_SIGNERS, new Object[0]);
        }
    }

    public static e.f c(g gVar, U0.c cVar, c.C0010c c0010c, Map map, Set set, int i3, int i4) {
        e.f fVar = new e.f(2);
        l k3 = e.k(cVar, c0010c, 1896449818, fVar);
        U0.c b3 = cVar.b(0L, k3.f753b);
        long j3 = k3.f754c;
        d(gVar, b3, k3.f752a, cVar.b(j3, k3.f755d - j3), k3.f756e, map, set, i3, i4, fVar);
        return fVar;
    }

    public static void d(g gVar, U0.c cVar, ByteBuffer byteBuffer, U0.c cVar2, ByteBuffer byteBuffer2, Map map, Set set, int i3, int i4, e.f fVar) {
        HashSet hashSet = new HashSet(1);
        b(byteBuffer, hashSet, map, set, i3, i4, fVar);
        if (fVar.a()) {
            return;
        }
        e.t(gVar, cVar, cVar2, byteBuffer2, hashSet, fVar);
        if (fVar.a()) {
            return;
        }
        fVar.f669b = true;
    }
}
