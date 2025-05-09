package c1;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import java.io.File;

/* renamed from: c1.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0389q {

    /* renamed from: c1.q$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public PackageInfo f4757a;

        /* renamed from: b, reason: collision with root package name */
        public String f4758b;

        public a(PackageInfo packageInfo, String str) {
            this.f4757a = packageInfo;
            this.f4758b = str;
        }
    }

    public static PackageInfo a(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static a b(Context context, String str) {
        try {
            File file = new File(context.getFilesDir(), U2.a.a(-26559753056494L));
            if (!file.exists()) {
                file.mkdirs();
            }
            PackageManager packageManager = context.getPackageManager();
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 0);
            File file2 = new File(file, str + U2.a.a(-26589817827566L));
            if (file2.exists() || AbstractC0377e.b(AbstractC0377e.a(packageManager.getApplicationIcon(applicationInfo)), file2)) {
                return new a(packageInfo, file2.getAbsolutePath());
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static boolean c(Context context, String str) {
        try {
            context.getPackageManager().getPackageInfo(str, 1);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static boolean d(Context context, String str) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
        if (launchIntentForPackage != null) {
            context.startActivity(launchIntentForPackage);
            return true;
        }
        Intent intent = new Intent(U2.a.a(-26834630963438L), Uri.parse(U2.a.a(-26632767500526L) + str));
        intent.addFlags(268435456);
        context.startActivity(intent);
        return false;
    }
}
