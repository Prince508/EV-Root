package c1;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: c1.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0381i {
    public static boolean a(Context context, String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            intent.addFlags(268435456);
            if (intent.resolveActivity(context.getPackageManager()) != null) {
                context.startActivity(intent);
                return true;
            }
            AbstractC0382j.d("No application can handle this request");
            return false;
        } catch (ActivityNotFoundException unused) {
            AbstractC0382j.d("No application found to open URL");
            return false;
        }
    }
}
