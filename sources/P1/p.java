package P1;

import java.security.SecureRandom;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f1733a = new a();

    public class a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public SecureRandom initialValue() {
            return p.b();
        }
    }

    public static SecureRandom b() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }

    public static byte[] c(int i3) {
        byte[] bArr = new byte[i3];
        ((SecureRandom) f1733a.get()).nextBytes(bArr);
        return bArr;
    }
}
