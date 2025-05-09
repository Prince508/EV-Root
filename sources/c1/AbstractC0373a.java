package c1;

import android.content.Context;
import android.provider.Settings;
import com.easyvictory.cheto.services.UIServices;

/* renamed from: c1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0373a {
    public static String a(Context context) {
        String str = "onetap.game.tictactoe/" + UIServices.class.getName();
        try {
            String b3 = b(context);
            if (b3.isEmpty()) {
                return str;
            }
            if (b3.contains(str)) {
                return b3;
            }
            return b3 + ":" + str;
        } catch (Exception e3) {
            e3.printStackTrace();
            return str;
        }
    }

    public static String b(Context context) {
        String str = "onetap.game.tictactoe/" + UIServices.class.getName();
        try {
            String string = Settings.Secure.getString(context.getContentResolver(), "enabled_accessibility_services");
            if (string == null || string.isEmpty()) {
                return "";
            }
            String[] split = string.split(":");
            StringBuilder sb = new StringBuilder();
            for (String str2 : split) {
                if (!str2.equals(str) && !str2.equals("com.easyvictory.cheto/com.easyvictory.cheto/com.easyvictory.cheto.Services.UIServices")) {
                    if (sb.length() > 0) {
                        sb.append(":");
                    }
                    sb.append(str2);
                }
            }
            return sb.toString();
        } catch (Exception e3) {
            e3.printStackTrace();
            return "";
        }
    }
}
