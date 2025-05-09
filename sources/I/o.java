package I;

import android.text.TextUtils;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class o {
    public static int a(Locale locale) {
        return TextUtils.getLayoutDirectionFromLocale(locale);
    }
}
