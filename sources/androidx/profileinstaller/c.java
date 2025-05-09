package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.util.Log;
import androidx.profileinstaller.c;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Executor;
import l0.e;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final InterfaceC0094c f4146a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final InterfaceC0094c f4147b = new b();

    public class a implements InterfaceC0094c {
        @Override // androidx.profileinstaller.c.InterfaceC0094c
        public void a(int i3, Object obj) {
        }

        @Override // androidx.profileinstaller.c.InterfaceC0094c
        public void b(int i3, Object obj) {
        }
    }

    public class b implements InterfaceC0094c {
        @Override // androidx.profileinstaller.c.InterfaceC0094c
        public void a(int i3, Object obj) {
            Log.d("ProfileInstaller", i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? i3 != 5 ? "" : "DIAGNOSTIC_PROFILE_IS_COMPRESSED" : "DIAGNOSTIC_REF_PROFILE_DOES_NOT_EXIST" : "DIAGNOSTIC_REF_PROFILE_EXISTS" : "DIAGNOSTIC_CURRENT_PROFILE_DOES_NOT_EXIST" : "DIAGNOSTIC_CURRENT_PROFILE_EXISTS");
        }

        @Override // androidx.profileinstaller.c.InterfaceC0094c
        public void b(int i3, Object obj) {
            String str;
            switch (i3) {
                case 1:
                    str = "RESULT_INSTALL_SUCCESS";
                    break;
                case 2:
                    str = "RESULT_ALREADY_INSTALLED";
                    break;
                case 3:
                    str = "RESULT_UNSUPPORTED_ART_VERSION";
                    break;
                case 4:
                    str = "RESULT_NOT_WRITABLE";
                    break;
                case 5:
                    str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                    break;
                case 6:
                    str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                    break;
                case 7:
                    str = "RESULT_IO_EXCEPTION";
                    break;
                case 8:
                    str = "RESULT_PARSE_EXCEPTION";
                    break;
                case 9:
                default:
                    str = "";
                    break;
                case 10:
                    str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                    break;
                case 11:
                    str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                    break;
            }
            if (i3 == 6 || i3 == 7 || i3 == 8) {
                Log.e("ProfileInstaller", str, (Throwable) obj);
            } else {
                Log.d("ProfileInstaller", str);
            }
        }
    }

    /* renamed from: androidx.profileinstaller.c$c, reason: collision with other inner class name */
    public interface InterfaceC0094c {
        void a(int i3, Object obj);

        void b(int i3, Object obj);
    }

    public static boolean b(File file) {
        return new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
    }

    public static void c(Context context, Executor executor, InterfaceC0094c interfaceC0094c) {
        b(context.getFilesDir());
        f(executor, interfaceC0094c, 11, null);
    }

    public static boolean d(PackageInfo packageInfo, File file, InterfaceC0094c interfaceC0094c) {
        File file2 = new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
        if (!file2.exists()) {
            return false;
        }
        try {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file2));
            try {
                long readLong = dataInputStream.readLong();
                dataInputStream.close();
                boolean z3 = readLong == packageInfo.lastUpdateTime;
                if (z3) {
                    interfaceC0094c.b(2, null);
                }
                return z3;
            } finally {
            }
        } catch (IOException unused) {
            return false;
        }
    }

    public static void e(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public static void f(Executor executor, final InterfaceC0094c interfaceC0094c, final int i3, final Object obj) {
        executor.execute(new Runnable() { // from class: l0.f
            @Override // java.lang.Runnable
            public final void run() {
                c.InterfaceC0094c.this.b(i3, obj);
            }
        });
    }

    public static boolean g(AssetManager assetManager, String str, PackageInfo packageInfo, File file, String str2, Executor executor, InterfaceC0094c interfaceC0094c) {
        androidx.profileinstaller.b bVar = new androidx.profileinstaller.b(assetManager, executor, interfaceC0094c, str2, "dexopt/baseline.prof", "dexopt/baseline.profm", new File(new File("/data/misc/profiles/cur/0", str), "primary.prof"));
        if (!bVar.e()) {
            return false;
        }
        boolean m3 = bVar.h().l().m();
        if (m3) {
            e(packageInfo, file);
        }
        return m3;
    }

    public static void h(Context context) {
        i(context, new e(), f4146a);
    }

    public static void i(Context context, Executor executor, InterfaceC0094c interfaceC0094c) {
        j(context, executor, interfaceC0094c, false);
    }

    public static void j(Context context, Executor executor, InterfaceC0094c interfaceC0094c, boolean z3) {
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        boolean z4 = false;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z3 && d(packageInfo, filesDir, interfaceC0094c)) {
                Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                d.c(context, false);
                return;
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            if (g(assets, packageName, packageInfo, filesDir, name, executor, interfaceC0094c) && z3) {
                z4 = true;
            }
            d.c(context, z4);
        } catch (PackageManager.NameNotFoundException e3) {
            interfaceC0094c.b(7, e3);
            d.c(context, false);
        }
    }

    public static void k(Context context, Executor executor, InterfaceC0094c interfaceC0094c) {
        try {
            e(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
            f(executor, interfaceC0094c, 10, null);
        } catch (PackageManager.NameNotFoundException e3) {
            f(executor, interfaceC0094c, 7, e3);
        }
    }
}
