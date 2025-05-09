package M0;

import F0.d;
import H0.e;
import H0.i;
import H0.k;
import M0.b;
import R0.h;
import R0.m;
import U0.c;
import java.io.File;
import java.io.FileInputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class a {
    public static e.f.a a(b.C0035b c0035b, byte[] bArr) {
        byte[] encoded;
        e.f.a aVar = new e.f.a();
        aVar.f673a = 0;
        int i3 = c0035b.f1353e;
        byte[] bArr2 = c0035b.f1354f;
        aVar.f704j.add(new e.f.a.c(i3, bArr2));
        k f3 = k.f(i3);
        if (f3 == null) {
            aVar.h(d.e.V4_SIG_UNKNOWN_SIG_ALGORITHM, Integer.valueOf(i3));
            return aVar;
        }
        String str = (String) f3.k().a();
        AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) f3.k().b();
        String i4 = f3.i();
        byte[] bArr3 = c0035b.f1352d;
        try {
            PublicKey generatePublic = KeyFactory.getInstance(i4).generatePublic(new X509EncodedKeySpec(bArr3));
            try {
                Signature signature = Signature.getInstance(str);
                signature.initVerify(generatePublic);
                if (algorithmParameterSpec != null) {
                    signature.setParameter(algorithmParameterSpec);
                }
                signature.update(bArr);
                if (!signature.verify(bArr2)) {
                    aVar.h(d.e.V4_SIG_DID_NOT_VERIFY, f3);
                    return aVar;
                }
                aVar.f705k.put(f3, bArr2);
                if (c0035b.f1350b == null) {
                    aVar.h(d.e.V4_SIG_NO_CERTIFICATE, new Object[0]);
                    return aVar;
                }
                try {
                    h hVar = new h(m.c(c0035b.f1350b), c0035b.f1350b);
                    aVar.f675c.add(hVar);
                    try {
                        encoded = e.j(hVar.getPublicKey());
                    } catch (InvalidKeyException e3) {
                        System.out.println("Caught an exception encoding the public key: " + e3);
                        e3.printStackTrace();
                        encoded = hVar.getPublicKey().getEncoded();
                    }
                    if (!Arrays.equals(bArr3, encoded)) {
                        aVar.h(d.e.V4_SIG_PUBLIC_KEY_MISMATCH_BETWEEN_CERTIFICATE_AND_SIGNATURES_RECORD, e.s(encoded), e.s(bArr3));
                        return aVar;
                    }
                    aVar.f702h.add(new e.f.a.b(0, c0035b.f1349a));
                    return aVar;
                } catch (CertificateException e4) {
                    aVar.h(d.e.V4_SIG_MALFORMED_CERTIFICATE, e4);
                    return aVar;
                }
            } catch (InvalidAlgorithmParameterException e5) {
                e = e5;
                aVar.h(d.e.V4_SIG_VERIFY_EXCEPTION, f3, e);
                return aVar;
            } catch (InvalidKeyException e6) {
                e = e6;
                aVar.h(d.e.V4_SIG_VERIFY_EXCEPTION, f3, e);
                return aVar;
            } catch (SignatureException e7) {
                e = e7;
                aVar.h(d.e.V4_SIG_VERIFY_EXCEPTION, f3, e);
                return aVar;
            }
        } catch (Exception e8) {
            aVar.h(d.e.V4_SIG_MALFORMED_PUBLIC_KEY, e8);
            return aVar;
        }
    }

    public static e.f b(c cVar, File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            b e3 = b.e(fileInputStream);
            byte[] c3 = b.c(fileInputStream);
            fileInputStream.close();
            e.f fVar = new e.f(4);
            if (e3 == null) {
                fVar.c(d.e.V4_SIG_NO_SIGNATURES, "Signature file does not contain a v4 signature.");
                return fVar;
            }
            int i3 = e3.f1342a;
            if (i3 != 2) {
                fVar.d(d.e.V4_SIG_VERSION_NOT_CURRENT, Integer.valueOf(i3), 2);
            }
            b.a a3 = b.a.a(e3.f1343b);
            b.d a4 = b.d.a(e3.f1344c);
            b.C0035b c0035b = a4.f1357a;
            e.f.a a5 = a(c0035b, b.b(cVar.size(), a3, c0035b));
            fVar.f699g.add(a5);
            if (!fVar.a()) {
                b.c[] cVarArr = a4.f1358b;
                int length = cVarArr.length;
                int i4 = 0;
                while (true) {
                    if (i4 < length) {
                        b.C0035b a6 = b.C0035b.a(cVarArr[i4].f1356b);
                        fVar.f699g.add(a(a6, b.b(cVar.size(), a3, a6)));
                        if (fVar.a()) {
                            break;
                        }
                        i4++;
                    } else {
                        c(cVar, a5, a3.f1348d, c3);
                        if (!fVar.a()) {
                            fVar.f669b = true;
                        }
                    }
                }
            }
            return fVar;
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void c(c cVar, e.f.a aVar, byte[] bArr, byte[] bArr2) {
        e.i f3 = e.f(cVar);
        i iVar = f3.f719a;
        byte[] bArr3 = f3.f720b;
        byte[] bArr4 = f3.f721c;
        if (!Arrays.equals(bArr, bArr3)) {
            aVar.h(d.e.V4_SIG_APK_ROOT_DID_NOT_VERIFY, iVar, e.s(bArr), e.s(bArr3));
        } else if (bArr2 == null || Arrays.equals(bArr2, bArr4)) {
            aVar.f703i.put(iVar, bArr3);
        } else {
            aVar.h(d.e.V4_SIG_APK_TREE_DID_NOT_VERIFY, iVar, e.s(bArr), e.s(bArr3));
        }
    }
}
