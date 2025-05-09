package T1;

import android.os.Looper;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public abstract class c {
    public static void a(InputStream inputStream) {
        while (inputStream.available() != 0) {
            try {
                inputStream.skip(inputStream.available());
            } catch (IOException unused) {
                return;
            }
        }
    }

    public static String b(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append('\'');
        int length = str.length();
        for (int i3 = 0; i3 < length; i3++) {
            char charAt = str.charAt(i3);
            if (charAt == '\'') {
                sb.append("'\\''");
            } else {
                sb.append(charAt);
            }
        }
        sb.append('\'');
        return sb.toString();
    }

    public static boolean c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
