package I1;

import B1.r;
import P1.p;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;

/* loaded from: classes.dex */
public final class c implements r {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f824c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final String f825d = "c";

    /* renamed from: a, reason: collision with root package name */
    public final String f826a;

    /* renamed from: b, reason: collision with root package name */
    public KeyStore f827b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public String f828a = null;

        /* renamed from: b, reason: collision with root package name */
        public KeyStore f829b;

        public a() {
            this.f829b = null;
            if (!c.g()) {
                throw new IllegalStateException("need Android Keystore on Android M or newer");
            }
            try {
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.f829b = keyStore;
                keyStore.load(null);
            } catch (IOException | GeneralSecurityException e3) {
                throw new IllegalStateException(e3);
            }
        }
    }

    public c() {
        this(new a());
    }

    public static boolean d(String str) {
        c cVar = new c();
        synchronized (f824c) {
            try {
                if (cVar.f(str)) {
                    return false;
                }
                e(str);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void e(String str) {
        String b3 = P1.r.b("android-keystore://", str);
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(new KeyGenParameterSpec.Builder(b3, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
        keyGenerator.generateKey();
    }

    public static boolean g() {
        return true;
    }

    public static void h() {
        try {
            Thread.sleep((int) (Math.random() * 40.0d));
        } catch (InterruptedException unused) {
        }
    }

    public static B1.a i(B1.a aVar) {
        byte[] c3 = p.c(10);
        byte[] bArr = new byte[0];
        if (Arrays.equals(c3, aVar.b(aVar.a(c3, bArr), bArr))) {
            return aVar;
        }
        throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
    }

    @Override // B1.r
    public synchronized B1.a a(String str) {
        try {
            String str2 = this.f826a;
            if (str2 != null && !str2.equals(str)) {
                throw new GeneralSecurityException(String.format("this client is bound to %s, cannot load keys bound to %s", this.f826a, str));
            }
        } catch (Throwable th) {
            throw th;
        }
        return i(new b(P1.r.b("android-keystore://", str), this.f827b));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0020, code lost:
    
        if (r3.toLowerCase(java.util.Locale.US).startsWith("android-keystore://") != false) goto L17;
     */
    @Override // B1.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean b(java.lang.String r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = r2.f826a     // Catch: java.lang.Throwable -> Le
            r1 = 1
            if (r0 == 0) goto L10
            boolean r0 = r0.equals(r3)     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L10
            monitor-exit(r2)
            return r1
        Le:
            r3 = move-exception
            goto L26
        L10:
            java.lang.String r0 = r2.f826a     // Catch: java.lang.Throwable -> Le
            if (r0 != 0) goto L23
            java.util.Locale r0 = java.util.Locale.US     // Catch: java.lang.Throwable -> Le
            java.lang.String r3 = r3.toLowerCase(r0)     // Catch: java.lang.Throwable -> Le
            java.lang.String r0 = "android-keystore://"
            boolean r3 = r3.startsWith(r0)     // Catch: java.lang.Throwable -> Le
            if (r3 == 0) goto L23
            goto L24
        L23:
            r1 = 0
        L24:
            monitor-exit(r2)
            return r1
        L26:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Le
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: I1.c.b(java.lang.String):boolean");
    }

    public synchronized boolean f(String str) {
        String b3;
        b3 = P1.r.b("android-keystore://", str);
        try {
        } catch (NullPointerException unused) {
            Log.w(f825d, "Keystore is temporarily unavailable, wait, reinitialize Keystore and try again.");
            try {
                h();
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.f827b = keyStore;
                keyStore.load(null);
                return this.f827b.containsAlias(b3);
            } catch (IOException e3) {
                throw new GeneralSecurityException(e3);
            }
        }
        return this.f827b.containsAlias(b3);
    }

    public c(a aVar) {
        this.f826a = aVar.f828a;
        this.f827b = aVar.f829b;
    }
}
