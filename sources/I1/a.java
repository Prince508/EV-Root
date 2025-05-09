package I1;

import B1.l;
import B1.n;
import B1.o;
import B1.q;
import P1.k;
import android.content.Context;
import android.preference.PreferenceManager;
import android.util.Log;
import java.io.CharConversionException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static final Object f809d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static final String f810e = "a";

    /* renamed from: a, reason: collision with root package name */
    public final q f811a;

    /* renamed from: b, reason: collision with root package name */
    public final B1.a f812b;

    /* renamed from: c, reason: collision with root package name */
    public o f813c;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public Context f814a = null;

        /* renamed from: b, reason: collision with root package name */
        public String f815b = null;

        /* renamed from: c, reason: collision with root package name */
        public String f816c = null;

        /* renamed from: d, reason: collision with root package name */
        public String f817d = null;

        /* renamed from: e, reason: collision with root package name */
        public B1.a f818e = null;

        /* renamed from: f, reason: collision with root package name */
        public boolean f819f = true;

        /* renamed from: g, reason: collision with root package name */
        public l f820g = null;

        /* renamed from: h, reason: collision with root package name */
        public o f821h;

        public static byte[] h(Context context, String str, String str2) {
            if (str == null) {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
            Context applicationContext = context.getApplicationContext();
            try {
                String string = (str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0)).getString(str, null);
                if (string == null) {
                    return null;
                }
                return k.a(string);
            } catch (ClassCastException | IllegalArgumentException unused) {
                throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", str));
            }
        }

        public synchronized a f() {
            a aVar;
            try {
                if (this.f815b == null) {
                    throw new IllegalArgumentException("keysetName cannot be null");
                }
                synchronized (a.f809d) {
                    try {
                        byte[] h3 = h(this.f814a, this.f815b, this.f816c);
                        if (h3 == null) {
                            if (this.f817d != null) {
                                this.f818e = k();
                            }
                            this.f821h = g();
                        } else {
                            if (this.f817d != null && a.e()) {
                                this.f821h = j(h3);
                            }
                            this.f821h = i(h3);
                        }
                        aVar = new a(this);
                    } finally {
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
            return aVar;
        }

        public final o g() {
            if (this.f820g == null) {
                throw new GeneralSecurityException("cannot read or generate keyset");
            }
            o a3 = o.i().a(this.f820g);
            o h3 = a3.h(a3.d().i().Z(0).Z());
            d dVar = new d(this.f814a, this.f815b, this.f816c);
            if (this.f818e != null) {
                h3.d().r(dVar, this.f818e);
                return h3;
            }
            B1.c.b(h3.d(), dVar);
            return h3;
        }

        public final o i(byte[] bArr) {
            return o.j(B1.c.a(B1.b.b(bArr)));
        }

        public final o j(byte[] bArr) {
            try {
                this.f818e = new c().a(this.f817d);
                try {
                    return o.j(n.n(B1.b.b(bArr), this.f818e));
                } catch (IOException | GeneralSecurityException e3) {
                    try {
                        return i(bArr);
                    } catch (IOException unused) {
                        throw e3;
                    }
                }
            } catch (GeneralSecurityException | ProviderException e4) {
                try {
                    o i3 = i(bArr);
                    Log.w(a.f810e, "cannot use Android Keystore, it'll be disabled", e4);
                    return i3;
                } catch (IOException unused2) {
                    throw e4;
                }
            }
        }

        public final B1.a k() {
            if (!a.e()) {
                Log.w(a.f810e, "Android Keystore requires at least Android M");
                return null;
            }
            c cVar = new c();
            try {
                boolean d3 = c.d(this.f817d);
                try {
                    return cVar.a(this.f817d);
                } catch (GeneralSecurityException | ProviderException e3) {
                    if (!d3) {
                        throw new KeyStoreException(String.format("the master key %s exists but is unusable", this.f817d), e3);
                    }
                    Log.w(a.f810e, "cannot use Android Keystore, it'll be disabled", e3);
                    return null;
                }
            } catch (GeneralSecurityException | ProviderException e4) {
                Log.w(a.f810e, "cannot use Android Keystore, it'll be disabled", e4);
                return null;
            }
        }

        public b l(l lVar) {
            this.f820g = lVar;
            return this;
        }

        public b m(String str) {
            if (!str.startsWith("android-keystore://")) {
                throw new IllegalArgumentException("key URI must start with android-keystore://");
            }
            if (!this.f819f) {
                throw new IllegalArgumentException("cannot call withMasterKeyUri() after calling doNotUseKeystore()");
            }
            this.f817d = str;
            return this;
        }

        public b n(Context context, String str, String str2) {
            if (context == null) {
                throw new IllegalArgumentException("need an Android context");
            }
            if (str == null) {
                throw new IllegalArgumentException("need a keyset name");
            }
            this.f814a = context;
            this.f815b = str;
            this.f816c = str2;
            return this;
        }
    }

    public static boolean e() {
        return true;
    }

    public synchronized n d() {
        return this.f813c.d();
    }

    public a(b bVar) {
        this.f811a = new d(bVar.f814a, bVar.f815b, bVar.f816c);
        this.f812b = bVar.f818e;
        this.f813c = bVar.f821h;
    }
}
