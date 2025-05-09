package c1;

import android.os.Build;

/* renamed from: c1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0378f {
    public static String a() {
        String str = ((((((U2.a.a(-24141686468846L) + U2.a.a(-24145981436142L)) + U2.a.a(-24231880782062L) + Build.VERSION.SDK_INT + '\n') + U2.a.a(-24274830455022L) + Build.BOARD + '\n') + U2.a.a(-24309190193390L) + Build.BRAND + '\n') + U2.a.a(-24343549931758L) + Build.MODEL + '\n') + U2.a.a(-24377909670126L) + Build.DEVICE + '\n') + U2.a.a(-24416564375790L) + Build.MANUFACTURER + '\n';
        StringBuilder sb = new StringBuilder(U2.a.a(-24480988885230L));
        for (String str2 : Build.SUPPORTED_ABIS) {
            sb.append(str2);
            sb.append(U2.a.a(-24493873787118L));
        }
        sb.append(U2.a.a(-24502463721710L));
        return str + U2.a.a(-24511053656302L) + ((Object) sb);
    }
}
