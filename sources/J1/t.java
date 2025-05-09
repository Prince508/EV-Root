package J1;

import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f918a = Charset.forName("UTF-8");

    public static Integer a() {
        if (b()) {
            return a.a();
        }
        return null;
    }

    public static boolean b() {
        return Objects.equals(System.getProperty("java.vendor"), "The Android Project");
    }

    public static int c() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        int i3 = 0;
        while (i3 == 0) {
            secureRandom.nextBytes(bArr);
            i3 = ((bArr[0] & Byte.MAX_VALUE) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        return i3;
    }

    public static final byte d(char c3) {
        if (c3 >= '!' && c3 <= '~') {
            return (byte) c3;
        }
        throw new s("Not a printable ASCII character: " + c3);
    }

    public static final Q1.a e(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i3 = 0; i3 < str.length(); i3++) {
            bArr[i3] = d(str.charAt(i3));
        }
        return Q1.a.a(bArr);
    }
}
