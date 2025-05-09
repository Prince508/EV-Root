package u1;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;

/* renamed from: u1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0747j {
    public static Typeface a(Context context, Typeface typeface) {
        return b(context.getResources().getConfiguration(), typeface);
    }

    public static Typeface b(Configuration configuration, Typeface typeface) {
        int i3;
        int i4;
        int weight;
        int i5;
        Typeface create;
        if (Build.VERSION.SDK_INT < 31) {
            return null;
        }
        i3 = configuration.fontWeightAdjustment;
        if (i3 == Integer.MAX_VALUE) {
            return null;
        }
        i4 = configuration.fontWeightAdjustment;
        if (i4 == 0 || typeface == null) {
            return null;
        }
        weight = typeface.getWeight();
        i5 = configuration.fontWeightAdjustment;
        create = Typeface.create(typeface, F.a.b(weight + i5, 1, 1000), typeface.isItalic());
        return create;
    }
}
