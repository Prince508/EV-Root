package P1;

import G1.b;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

/* loaded from: classes.dex */
public final class n implements N1.a {

    /* renamed from: e, reason: collision with root package name */
    public static final b.EnumC0011b f1725e = b.EnumC0011b.f581f;

    /* renamed from: a, reason: collision with root package name */
    public final ThreadLocal f1726a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1727b;

    /* renamed from: c, reason: collision with root package name */
    public final Key f1728c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1729d;

    public class a extends ThreadLocal {
        public a() {
        }

        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Mac initialValue() {
            try {
                Mac mac = (Mac) i.f1711c.a(n.this.f1727b);
                mac.init(n.this.f1728c);
                return mac;
            } catch (GeneralSecurityException e3) {
                throw new IllegalStateException(e3);
            }
        }
    }

    public n(String str, Key key) {
        a aVar = new a();
        this.f1726a = aVar;
        if (!f1725e.c()) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.f1727b = str;
        this.f1728c = key;
        if (key.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        str.getClass();
        switch (str) {
            case "HMACSHA1":
                this.f1729d = 20;
                break;
            case "HMACSHA224":
                this.f1729d = 28;
                break;
            case "HMACSHA256":
                this.f1729d = 32;
                break;
            case "HMACSHA384":
                this.f1729d = 48;
                break;
            case "HMACSHA512":
                this.f1729d = 64;
                break;
            default:
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: " + str);
        }
        aVar.get();
    }

    @Override // N1.a
    public byte[] a(byte[] bArr, int i3) {
        if (i3 > this.f1729d) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        ((Mac) this.f1726a.get()).update(bArr);
        return Arrays.copyOf(((Mac) this.f1726a.get()).doFinal(), i3);
    }
}
