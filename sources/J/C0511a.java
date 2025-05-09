package j;

import android.content.Context;
import android.content.res.Configuration;

/* renamed from: j.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0511a {

    /* renamed from: a, reason: collision with root package name */
    public Context f7929a;

    public C0511a(Context context) {
        this.f7929a = context;
    }

    public static C0511a a(Context context) {
        return new C0511a(context);
    }

    public int b() {
        return this.f7929a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int c() {
        Configuration configuration = this.f7929a.getResources().getConfiguration();
        int i3 = configuration.screenWidthDp;
        int i4 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i3 > 600) {
            return 5;
        }
        if (i3 > 960 && i4 > 720) {
            return 5;
        }
        if (i3 > 720 && i4 > 960) {
            return 5;
        }
        if (i3 >= 500) {
            return 4;
        }
        if (i3 > 640 && i4 > 480) {
            return 4;
        }
        if (i3 <= 480 || i4 <= 640) {
            return i3 >= 360 ? 3 : 2;
        }
        return 4;
    }

    public boolean d() {
        return true;
    }
}
