package androidx.profileinstaller;

import android.content.Context;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.io.File;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: androidx.profileinstaller.a$a, reason: collision with other inner class name */
    public static class C0093a {
        public static File a(Context context) {
            return context.createDeviceProtectedStorageContext().getCodeCacheDir();
        }
    }

    public static boolean a(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return false;
        }
        boolean z3 = true;
        for (File file2 : listFiles) {
            z3 = a(file2) && z3;
        }
        return z3;
    }

    public static void b(Context context, ProfileInstallReceiver.a aVar) {
        if (a(C0093a.a(context))) {
            aVar.b(14, null);
        } else {
            aVar.b(15, null);
        }
    }
}
