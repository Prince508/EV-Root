package r1;

import android.os.Build;
import java.util.Locale;

/* renamed from: r1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0682e {
    public static String a() {
        String str = Build.MANUFACTURER;
        return str != null ? str.toLowerCase(Locale.ENGLISH) : "";
    }

    public static boolean b() {
        return a().equals("meizu");
    }
}
