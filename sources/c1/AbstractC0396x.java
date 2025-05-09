package c1;

import F0.d;
import android.content.Context;
import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.Objects;
import java.util.function.Consumer;

/* renamed from: c1.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0396x {
    public static String b(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b3 : bArr) {
            sb.append(String.format(U2.a.a(-30493943099630L), Byte.valueOf(b3)));
        }
        return sb.toString();
    }

    public static String c(File file) {
        try {
            d.g l3 = new d.c(file).a().l();
            if (l3.r()) {
                X509Certificate[] x509CertificateArr = (X509Certificate[]) l3.k().toArray(new X509Certificate[0]);
                if (x509CertificateArr.length > 0) {
                    return d(x509CertificateArr[0]);
                }
            }
            if (l3.i()) {
                l3.j().forEach(new Consumer() { // from class: c1.w
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        AbstractC0382j.d(U2.a.a(-30515417936110L) + ((d.f) obj).toString());
                    }
                });
            }
        } catch (Exception e3) {
            AbstractC0382j.c(e3);
        }
        return U2.a.a(-30450993426670L);
    }

    public static String d(X509Certificate x509Certificate) {
        try {
            return b(MessageDigest.getInstance(U2.a.a(-30455288393966L)).digest(x509Certificate.getEncoded()));
        } catch (NoSuchAlgorithmException | CertificateEncodingException unused) {
            return U2.a.a(-30489648132334L);
        }
    }

    public static Integer e(Context context) {
        Integer num = null;
        try {
            d.g l3 = new d.c(new File(context.getApplicationInfo().sourceDir)).a().l();
            if (l3.r()) {
                for (X509Certificate x509Certificate : (X509Certificate[]) l3.k().toArray(new X509Certificate[0])) {
                    String name = x509Certificate.getSubjectDN().getName();
                    String name2 = x509Certificate.getIssuerDN().getName();
                    if (Objects.equals(name, U2.a.a(-30034381598958L)) && Objects.equals(name2, U2.a.a(-30103101075694L))) {
                        if (Objects.equals(d(x509Certificate), U2.a.a(-30171820552430L))) {
                            num = Integer.valueOf(x509Certificate.getBasicConstraints());
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        return num;
    }
}
