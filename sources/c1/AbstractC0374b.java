package c1;

import android.os.Build;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: c1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0374b {
    public static void a(ZipFile zipFile, File file) {
        Enumeration<? extends ZipEntry> entries = zipFile.entries();
        byte[] bArr = null;
        while (entries.hasMoreElements()) {
            ZipEntry nextElement = entries.nextElement();
            String name = nextElement.getName();
            if (name.startsWith(U2.a.a(-24107326730478L))) {
                if (bArr == null) {
                    bArr = new byte[8192];
                }
                File file2 = new File(file, name.substring(name.lastIndexOf(47) + 1));
                if (!file2.exists() || file2.length() != nextElement.getSize()) {
                    try {
                        try {
                            AbstractC0380h.a(bArr, zipFile.getInputStream(nextElement), new FileOutputStream(file2));
                        } catch (IOException e3) {
                            throw new RuntimeException(e3);
                        }
                    } catch (FileNotFoundException e4) {
                        throw new RuntimeException(e4);
                    }
                }
            }
        }
    }

    public static void b(ZipFile zipFile, File file) {
        String str = U2.a.a(-24038607253742L) + Build.CPU_ABI + U2.a.a(-24060082090222L);
        Enumeration<? extends ZipEntry> entries = zipFile.entries();
        byte[] bArr = null;
        while (entries.hasMoreElements()) {
            ZipEntry nextElement = entries.nextElement();
            String name = nextElement.getName();
            if (name.startsWith(U2.a.a(-24068672024814L)) && name.endsWith(U2.a.a(-24090146861294L)) && name.startsWith(str)) {
                if (bArr == null) {
                    bArr = new byte[8192];
                }
                AbstractC0380h.a(bArr, zipFile.getInputStream(nextElement), new FileOutputStream(new File(file, name.substring(name.lastIndexOf(47) + 1))));
            }
        }
    }

    public static boolean c(File file, File file2) {
        if (!file2.exists()) {
            file2.mkdirs();
        }
        try {
            ZipFile zipFile = new ZipFile(file.getAbsolutePath());
            a(zipFile, file2);
            zipFile.close();
            return true;
        } catch (Throwable th) {
            AbstractC0382j.f(th);
            return false;
        }
    }

    public static boolean d(File file, File file2) {
        if (!file2.exists()) {
            file2.mkdirs();
        }
        try {
            ZipFile zipFile = new ZipFile(file.getAbsolutePath());
            b(zipFile, file2);
            zipFile.close();
            return true;
        } catch (Throwable th) {
            AbstractC0382j.f(th);
            return false;
        }
    }
}
