package o1;

import android.content.res.ColorStateList;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* renamed from: o1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0648d {

    /* renamed from: o1.d$a */
    public static class a {
        public static void a(Outline outline, Path path) {
            outline.setConvexPath(path);
        }
    }

    /* renamed from: o1.d$b */
    public static class b {
        public static void a(Outline outline, Path path) {
            outline.setPath(path);
        }
    }

    public static ColorStateList a(Drawable drawable) {
        ColorStateList colorStateList;
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !AbstractC0645a.a(drawable)) {
            return null;
        }
        colorStateList = AbstractC0646b.a(drawable).getColorStateList();
        return colorStateList;
    }

    public static void b(Outline outline, Path path) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 30) {
            b.a(outline, path);
            return;
        }
        if (i3 >= 29) {
            try {
                a.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            a.a(outline, path);
        }
    }

    public static PorterDuffColorFilter c(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
    }
}
