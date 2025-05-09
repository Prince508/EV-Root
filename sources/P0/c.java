package p0;

import android.content.Context;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f8830a;

    /* renamed from: b, reason: collision with root package name */
    public final KeyGenParameterSpec f8831b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f8832a;

        /* renamed from: b, reason: collision with root package name */
        public KeyGenParameterSpec f8833b;

        /* renamed from: c, reason: collision with root package name */
        public b f8834c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f8835d;

        /* renamed from: e, reason: collision with root package name */
        public int f8836e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f8837f;

        /* renamed from: g, reason: collision with root package name */
        public final Context f8838g;

        /* renamed from: p0.c$a$a, reason: collision with other inner class name */
        public static class C0150a {

            /* renamed from: p0.c$a$a$a, reason: collision with other inner class name */
            public static class C0151a {
                public static void a(KeyGenParameterSpec.Builder builder) {
                    builder.setIsStrongBoxBacked(true);
                }
            }

            /* renamed from: p0.c$a$a$b */
            public static class b {
                public static void a(KeyGenParameterSpec.Builder builder, int i3, int i4) {
                    builder.setUserAuthenticationParameters(i3, i4);
                }
            }

            public static c a(a aVar) {
                b bVar = aVar.f8834c;
                if (bVar == null && aVar.f8833b == null) {
                    throw new IllegalArgumentException("build() called before setKeyGenParameterSpec or setKeyScheme.");
                }
                if (bVar == b.AES256_GCM) {
                    KeyGenParameterSpec.Builder keySize = new KeyGenParameterSpec.Builder(aVar.f8832a, 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256);
                    if (aVar.f8835d) {
                        keySize.setUserAuthenticationRequired(true);
                        if (Build.VERSION.SDK_INT >= 30) {
                            b.a(keySize, aVar.f8836e, 3);
                        } else {
                            keySize.setUserAuthenticationValidityDurationSeconds(aVar.f8836e);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 28 && aVar.f8837f && aVar.f8838g.getPackageManager().hasSystemFeature("android.hardware.strongbox_keystore")) {
                        C0151a.a(keySize);
                    }
                    aVar.f8833b = keySize.build();
                }
                KeyGenParameterSpec keyGenParameterSpec = aVar.f8833b;
                if (keyGenParameterSpec != null) {
                    return new c(e.c(keyGenParameterSpec), aVar.f8833b);
                }
                throw new NullPointerException("KeyGenParameterSpec was null after build() check");
            }

            public static String b(KeyGenParameterSpec keyGenParameterSpec) {
                return keyGenParameterSpec.getKeystoreAlias();
            }
        }

        public a(Context context) {
            this(context, "_androidx_security_master_key_");
        }

        public c a() {
            return C0150a.a(this);
        }

        public a b(KeyGenParameterSpec keyGenParameterSpec) {
            if (this.f8834c != null) {
                throw new IllegalArgumentException("KeyGenParamSpec set after setting a KeyScheme");
            }
            if (this.f8832a.equals(C0150a.b(keyGenParameterSpec))) {
                this.f8833b = keyGenParameterSpec;
                return this;
            }
            throw new IllegalArgumentException("KeyGenParamSpec's key alias does not match provided alias (" + this.f8832a + " vs " + C0150a.b(keyGenParameterSpec));
        }

        public a(Context context, String str) {
            this.f8838g = context.getApplicationContext();
            this.f8832a = str;
        }
    }

    public enum b {
        AES256_GCM
    }

    public c(String str, Object obj) {
        this.f8830a = str;
        this.f8831b = (KeyGenParameterSpec) obj;
    }

    public String a() {
        return this.f8830a;
    }

    public boolean b() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            return keyStore.containsAlias(this.f8830a);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
            return false;
        }
    }

    public String toString() {
        return "MasterKey{keyAlias=" + this.f8830a + ", isKeyStoreBacked=" + b() + "}";
    }
}
