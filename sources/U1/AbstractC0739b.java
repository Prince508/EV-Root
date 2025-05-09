package u1;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;

/* renamed from: u1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0739b {
    public static TypedValue a(Context context, int i3) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i3, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean b(Context context, int i3, boolean z3) {
        TypedValue a3 = a(context, i3);
        return (a3 == null || a3.type != 18) ? z3 : a3.data != 0;
    }

    public static int c(Context context, int i3, int i4) {
        TypedValue a3 = a(context, i3);
        return (a3 == null || a3.type != 16) ? i4 : a3.data;
    }

    public static int d(Context context, int i3, String str) {
        return e(context, i3, str).data;
    }

    public static TypedValue e(Context context, int i3, String str) {
        TypedValue a3 = a(context, i3);
        if (a3 != null) {
            return a3;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i3)));
    }

    public static TypedValue f(View view, int i3) {
        return e(view.getContext(), i3, view.getClass().getCanonicalName());
    }
}
