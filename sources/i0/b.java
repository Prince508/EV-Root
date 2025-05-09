package I0;

import H0.g;
import H0.j;
import H0.k;
import I0.a;
import R0.h;
import java.io.ByteArrayInputStream;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class b {
    public static void a(ByteBuffer byteBuffer, X509Certificate x509Certificate, H0.c cVar) {
        ByteBuffer i3 = g.i(byteBuffer);
        int i4 = 0;
        while (i3.hasRemaining()) {
            i4++;
            try {
                ByteBuffer i5 = g.i(i3);
                int i6 = i5.getInt();
                byte[] a3 = R0.c.a(i5);
                if (i6 == -1654455305) {
                    b(a3, x509Certificate, cVar);
                } else if (i6 == -465807034) {
                    long j3 = ByteBuffer.wrap(a3).order(ByteOrder.LITTLE_ENDIAN).getLong();
                    if (j3 > 0) {
                        cVar.f674b = j3;
                    } else {
                        cVar.b(38, Long.valueOf(j3));
                    }
                } else {
                    cVar.a(32, Integer.valueOf(i6));
                }
            } catch (G0.a | BufferUnderflowException unused) {
                cVar.b(31, Integer.valueOf(i4));
                return;
            }
        }
    }

    public static void b(byte[] bArr, X509Certificate x509Certificate, H0.c cVar) {
        try {
            List a3 = a.a(ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN));
            for (int i3 = 0; i3 < a3.size(); i3++) {
                cVar.f676d.add(((a.C0022a) a3.get(i3)).f804a);
            }
            if (x509Certificate.equals(cVar.f676d.get(r5.size() - 1))) {
                return;
            }
            cVar.b(34, new Object[0]);
        } catch (IllegalArgumentException unused) {
            cVar.b(34, new Object[0]);
        } catch (SecurityException unused2) {
            cVar.b(35, new Object[0]);
        } catch (Exception unused3) {
            cVar.b(33, new Object[0]);
        }
    }

    public static X509Certificate c(ByteBuffer byteBuffer, CertificateFactory certificateFactory, byte[] bArr, H0.c cVar) {
        byte[] k3 = g.k(byteBuffer);
        try {
            h hVar = new h((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(k3)), k3);
            cVar.f675c.add(hVar);
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(k3);
            byte[] digest = messageDigest.digest();
            if (Arrays.equals(bArr, digest)) {
                return hVar;
            }
            cVar.b(27, g.m(digest), g.m(bArr));
            return null;
        } catch (CertificateException e3) {
            cVar.b(18, e3);
            return null;
        }
    }

    public static void d(byte[] bArr, int i3, int i4, X509Certificate x509Certificate, ByteBuffer byteBuffer, H0.c cVar) {
        ArrayList<H0.h> arrayList = new ArrayList(1);
        int i5 = 0;
        while (byteBuffer.hasRemaining()) {
            i5++;
            try {
                ByteBuffer i6 = g.i(byteBuffer);
                int i7 = i6.getInt();
                byte[] k3 = g.k(i6);
                k f3 = k.f(i7);
                if (f3 == null) {
                    cVar.a(19, Integer.valueOf(i7));
                } else {
                    arrayList.add(new H0.h(f3, k3));
                }
            } catch (G0.a | BufferUnderflowException unused) {
                cVar.b(20, Integer.valueOf(i5));
                return;
            }
        }
        if (arrayList.isEmpty()) {
            cVar.b(17, new Object[0]);
            return;
        }
        try {
            for (H0.h hVar : g.j(arrayList, i3, i4, true)) {
                k kVar = hVar.f724a;
                String str = (String) kVar.k().a();
                AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) kVar.k().b();
                PublicKey publicKey = x509Certificate.getPublicKey();
                try {
                    Signature signature = Signature.getInstance(str);
                    signature.initVerify(publicKey);
                    if (algorithmParameterSpec != null) {
                        signature.setParameter(algorithmParameterSpec);
                    }
                    signature.update(bArr);
                    if (!signature.verify(hVar.f725b)) {
                        cVar.b(21, kVar);
                        return;
                    }
                } catch (InvalidAlgorithmParameterException e3) {
                    e = e3;
                    cVar.b(22, kVar, e);
                    return;
                } catch (InvalidKeyException e4) {
                    e = e4;
                    cVar.b(22, kVar, e);
                    return;
                } catch (NoSuchAlgorithmException e5) {
                    e = e5;
                    cVar.b(22, kVar, e);
                    return;
                } catch (SignatureException e6) {
                    e = e6;
                    cVar.b(22, kVar, e);
                    return;
                }
            }
        } catch (j e7) {
            StringBuilder sb = new StringBuilder();
            for (H0.h hVar2 : arrayList) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                sb.append(hVar2.f724a);
            }
            cVar.b(26, sb.toString(), e7);
        }
    }

    public static void e(ByteBuffer byteBuffer, CertificateFactory certificateFactory, H0.c cVar, Map map, byte[] bArr, int i3, int i4) {
        X509Certificate c3 = c(byteBuffer, certificateFactory, bArr, cVar);
        if (cVar.d() || cVar.c()) {
            return;
        }
        ByteBuffer i5 = g.i(byteBuffer);
        HashMap hashMap = new HashMap();
        while (i5.hasRemaining()) {
            ByteBuffer i6 = g.i(i5);
            int i7 = i6.getInt();
            hashMap.put(Integer.valueOf(i7), g.i(i6));
        }
        for (Map.Entry entry : map.entrySet()) {
            if (((Integer) entry.getKey()).intValue() == 31) {
                cVar.a(39, 31);
            } else {
                if (!hashMap.containsKey(entry.getKey())) {
                    cVar.b(17, new Object[0]);
                    return;
                }
                int i8 = i3;
                int i9 = i4;
                H0.c cVar2 = cVar;
                d((byte[]) entry.getValue(), i8, i9, c3, (ByteBuffer) hashMap.get(entry.getKey()), cVar2);
                X509Certificate x509Certificate = c3;
                if (cVar2.d() || cVar2.c()) {
                    return;
                }
                i4 = i9;
                c3 = x509Certificate;
                cVar = cVar2;
                i3 = i8;
            }
        }
        X509Certificate x509Certificate2 = c3;
        int i10 = i3;
        H0.c cVar3 = cVar;
        int i11 = i4;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer i12 = g.i(byteBuffer);
            ByteBuffer i13 = g.i(byteBuffer);
            byte[] bArr2 = new byte[i12.remaining()];
            i12.get(bArr2);
            i12.flip();
            d(bArr2, i10, i11, x509Certificate2, i13, cVar3);
            if (cVar3.c() || cVar3.d()) {
                return;
            }
            a(i12, x509Certificate2, cVar3);
        }
    }
}
