package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;
import p.C0658c;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final C0658c f4148a = C0658c.o();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f4149b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static c f4150c = null;

    public static class a {
        public static PackageInfo a(PackageManager packageManager, Context context) {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f4151a;

        /* renamed from: b, reason: collision with root package name */
        public final int f4152b;

        /* renamed from: c, reason: collision with root package name */
        public final long f4153c;

        /* renamed from: d, reason: collision with root package name */
        public final long f4154d;

        public b(int i3, int i4, long j3, long j4) {
            this.f4151a = i3;
            this.f4152b = i4;
            this.f4153c = j3;
            this.f4154d = j4;
        }

        public static b a(File file) {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                b bVar = new b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } finally {
            }
        }

        public void b(File file) {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f4151a);
                dataOutputStream.writeInt(this.f4152b);
                dataOutputStream.writeLong(this.f4153c);
                dataOutputStream.writeLong(this.f4154d);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof b)) {
                b bVar = (b) obj;
                if (this.f4152b == bVar.f4152b && this.f4153c == bVar.f4153c && this.f4151a == bVar.f4151a && this.f4154d == bVar.f4154d) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f4152b), Long.valueOf(this.f4153c), Integer.valueOf(this.f4151a), Long.valueOf(this.f4154d));
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f4155a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f4156b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f4157c;

        public c(int i3, boolean z3, boolean z4) {
            this.f4155a = i3;
            this.f4157c = z4;
            this.f4156b = z3;
        }
    }

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? a.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static c b(int i3, boolean z3, boolean z4) {
        c cVar = new c(i3, z3, z4);
        f4150c = cVar;
        f4148a.m(cVar);
        return f4150c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:24|25|26|(2:63|64)(1:28)|29|(8:36|(1:40)|(1:47)|48|(2:55|56)|52|53|54)|(1:62)|(1:40)|(3:42|45|47)|48|(1:50)|55|56|52|53|54) */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ce, code lost:
    
        r13 = 196608;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a0, code lost:
    
        r3 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.profileinstaller.d.c c(android.content.Context r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.profileinstaller.d.c(android.content.Context, boolean):androidx.profileinstaller.d$c");
    }
}
