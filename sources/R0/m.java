package R0;

import j.AbstractC0515e;
import java.io.ByteArrayInputStream;
import java.nio.ByteBuffer;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Base64;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static volatile CertificateFactory f1878a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f1879b = "-----BEGIN CERTIFICATE-----".getBytes();

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f1880c = "-----END CERTIFICATE-----".getBytes();

    public static void a() {
        if (f1878a != null) {
            return;
        }
        b();
    }

    public static synchronized void b() {
        synchronized (m.class) {
            if (f1878a != null) {
                return;
            }
            try {
                f1878a = CertificateFactory.getInstance("X.509");
            } catch (CertificateException e3) {
                throw new RuntimeException("Failed to create X.509 CertificateFactory", e3);
            }
        }
    }

    public static X509Certificate c(byte[] bArr) {
        a();
        return d(bArr, f1878a);
    }

    public static X509Certificate d(byte[] bArr, CertificateFactory certificateFactory) {
        try {
            try {
                return (X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArr));
            } catch (N0.e | N0.h | CertificateException e3) {
                throw new CertificateException("Failed to parse certificate", e3);
            }
        } catch (CertificateException unused) {
            ByteBuffer e4 = e(ByteBuffer.wrap(bArr));
            int position = e4.position();
            AbstractC0515e.a(N0.c.s(e4, S0.a.class));
            X509Certificate x509Certificate = (X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(N0.g.n(null)));
            byte[] bArr2 = new byte[e4.position() - position];
            e4.position(position);
            e4.get(bArr2);
            return new h(x509Certificate, bArr2);
        }
    }

    public static ByteBuffer e(ByteBuffer byteBuffer) {
        Base64.Decoder decoder;
        byte[] decode;
        char c3;
        if (byteBuffer == null) {
            throw new NullPointerException("The certificateBuffer cannot be null");
        }
        if (byteBuffer.remaining() < f1879b.length) {
            return byteBuffer;
        }
        byteBuffer.mark();
        int i3 = 0;
        while (true) {
            byte[] bArr = f1879b;
            if (i3 >= bArr.length) {
                StringBuilder sb = new StringBuilder();
                while (byteBuffer.hasRemaining() && (c3 = (char) byteBuffer.get()) != '-') {
                    if (!Character.isWhitespace(c3)) {
                        sb.append(c3);
                    }
                }
                int i4 = 1;
                while (true) {
                    byte[] bArr2 = f1880c;
                    if (i4 >= bArr2.length) {
                        decoder = Base64.getDecoder();
                        decode = decoder.decode(sb.toString());
                        int position = byteBuffer.position();
                        while (byteBuffer.hasRemaining() && Character.isWhitespace((char) byteBuffer.get())) {
                            position++;
                        }
                        byteBuffer.position(position);
                        return ByteBuffer.wrap(decode);
                    }
                    if (!byteBuffer.hasRemaining()) {
                        throw new CertificateException("The provided input contains the PEM certificate header but does not contain sufficient data for the footer");
                    }
                    if (byteBuffer.get() != bArr2[i4]) {
                        throw new CertificateException("The provided input contains the PEM certificate header without a valid certificate footer");
                    }
                    i4++;
                }
            } else {
                if (byteBuffer.get() != bArr[i3]) {
                    byteBuffer.reset();
                    return byteBuffer;
                }
                i3++;
            }
        }
    }
}
