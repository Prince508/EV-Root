package G;

import C2.k;
import android.os.Build;
import android.os.ext.SdkExtensions;
import java.util.Locale;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f557a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final int f558b;

    /* renamed from: c, reason: collision with root package name */
    public static final int f559c;

    /* renamed from: d, reason: collision with root package name */
    public static final int f560d;

    /* renamed from: e, reason: collision with root package name */
    public static final int f561e;

    /* renamed from: G.a$a, reason: collision with other inner class name */
    public static final class C0009a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0009a f562a = new C0009a();

        public final int a(int i3) {
            return SdkExtensions.getExtensionVersion(i3);
        }
    }

    static {
        int i3 = Build.VERSION.SDK_INT;
        f558b = i3 >= 30 ? C0009a.f562a.a(30) : 0;
        f559c = i3 >= 30 ? C0009a.f562a.a(31) : 0;
        f560d = i3 >= 30 ? C0009a.f562a.a(33) : 0;
        f561e = i3 >= 30 ? C0009a.f562a.a(1000000) : 0;
    }

    public static final boolean a(String str, String str2) {
        k.e(str, "codename");
        k.e(str2, "buildCodename");
        if (k.a("REL", str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String upperCase = str2.toUpperCase(locale);
        k.d(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        String upperCase2 = str.toUpperCase(locale);
        k.d(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase.compareTo(upperCase2) >= 0;
    }

    public static final boolean b() {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 33) {
            return true;
        }
        if (i3 < 32) {
            return false;
        }
        String str = Build.VERSION.CODENAME;
        k.d(str, "CODENAME");
        return a("Tiramisu", str);
    }
}
