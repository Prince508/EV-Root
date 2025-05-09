package c1;

import android.content.Context;
import android.os.Build;

/* renamed from: c1.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0390r {
    public static boolean a(Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            return A.a.a(context, "android.permission.READ_MEDIA_IMAGES") == 0 && A.a.a(context, "android.permission.READ_MEDIA_VIDEO") == 0 && A.a.a(context, "android.permission.READ_MEDIA_AUDIO") == 0;
        }
        return A.a.a(context, "android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }
}
