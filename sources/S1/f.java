package S1;

import android.content.Context;
import android.content.res.Configuration;
import android.security.keystore.KeyGenParameterSpec;
import java.math.BigInteger;
import java.security.Key;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Calendar;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.security.auth.x500.X500Principal;

/* loaded from: classes.dex */
public class f implements a {

    /* renamed from: a, reason: collision with root package name */
    public final String f1969a = c();

    /* renamed from: b, reason: collision with root package name */
    public final Context f1970b;

    public f(Context context) {
        this.f1970b = context;
        e(context);
    }

    @Override // S1.a
    public byte[] a(Key key) {
        PublicKey h3 = h();
        Cipher i3 = i();
        i3.init(3, h3, f());
        return i3.wrap(key);
    }

    @Override // S1.a
    public Key b(byte[] bArr, String str) {
        PrivateKey g3 = g();
        Cipher i3 = i();
        i3.init(4, g3, f());
        return i3.unwrap(bArr, str, 3);
    }

    public String c() {
        return this.f1970b.getPackageName() + ".FlutterSecureStoragePluginKey";
    }

    public final void d(Context context) {
        Locale locale = Locale.getDefault();
        try {
            k(Locale.ENGLISH);
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.add(1, 25);
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
            keyPairGenerator.initialize(j(context, calendar, calendar2));
            keyPairGenerator.generateKeyPair();
        } finally {
            k(locale);
        }
    }

    public final void e(Context context) {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        if (keyStore.getKey(this.f1969a, null) == null) {
            d(context);
        }
    }

    public AlgorithmParameterSpec f() {
        return null;
    }

    public final PrivateKey g() {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        Key key = keyStore.getKey(this.f1969a, null);
        if (key != null) {
            if (key instanceof PrivateKey) {
                return (PrivateKey) key;
            }
            throw new Exception("Not an instance of a PrivateKey");
        }
        throw new Exception("No key found under alias: " + this.f1969a);
    }

    public final PublicKey h() {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        Certificate certificate = keyStore.getCertificate(this.f1969a);
        if (certificate == null) {
            throw new Exception("No certificate found under alias: " + this.f1969a);
        }
        PublicKey publicKey = certificate.getPublicKey();
        if (publicKey != null) {
            return publicKey;
        }
        throw new Exception("No key found under alias: " + this.f1969a);
    }

    public Cipher i() {
        return Cipher.getInstance("RSA/ECB/PKCS1Padding", "AndroidKeyStoreBCWorkaround");
    }

    public AlgorithmParameterSpec j(Context context, Calendar calendar, Calendar calendar2) {
        return new KeyGenParameterSpec.Builder(this.f1969a, 3).setCertificateSubject(new X500Principal("CN=" + this.f1969a)).setDigests("SHA-256").setBlockModes("ECB").setEncryptionPaddings("PKCS1Padding").setCertificateSerialNumber(BigInteger.valueOf(1L)).setCertificateNotBefore(calendar.getTime()).setCertificateNotAfter(calendar2.getTime()).build();
    }

    public final void k(Locale locale) {
        Locale.setDefault(locale);
        Configuration configuration = this.f1970b.getResources().getConfiguration();
        configuration.setLocale(locale);
        this.f1970b.createConfigurationContext(configuration);
    }
}
