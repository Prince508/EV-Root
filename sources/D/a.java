package D;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: D.a$a, reason: collision with other inner class name */
    public static class C0004a {
        public static void a(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        public static boolean b(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        public static ColorFilter c(Drawable drawable) {
            return drawable.getColorFilter();
        }

        public static void d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        public static void e(Drawable drawable, float f3, float f4) {
            drawable.setHotspot(f3, f4);
        }

        public static void f(Drawable drawable, int i3, int i4, int i5, int i6) {
            drawable.setHotspotBounds(i3, i4, i5, i6);
        }

        public static void g(Drawable drawable, int i3) {
            drawable.setTint(i3);
        }

        public static void h(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        public static void i(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    public static class b {
        public static int a(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        public static boolean b(Drawable drawable, int i3) {
            return drawable.setLayoutDirection(i3);
        }
    }

    public static void a(Drawable drawable) {
        drawable.clearColorFilter();
    }

    public static int b(Drawable drawable) {
        return b.a(drawable);
    }

    public static boolean c(Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    public static void d(Drawable drawable, boolean z3) {
        drawable.setAutoMirrored(z3);
    }

    public static void e(Drawable drawable, float f3, float f4) {
        C0004a.e(drawable, f3, f4);
    }

    public static void f(Drawable drawable, int i3, int i4, int i5, int i6) {
        C0004a.f(drawable, i3, i4, i5, i6);
    }

    public static boolean g(Drawable drawable, int i3) {
        return b.b(drawable, i3);
    }

    public static void h(Drawable drawable, int i3) {
        C0004a.g(drawable, i3);
    }

    public static void i(Drawable drawable, ColorStateList colorStateList) {
        C0004a.h(drawable, colorStateList);
    }

    public static void j(Drawable drawable, PorterDuff.Mode mode) {
        C0004a.i(drawable, mode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Drawable k(Drawable drawable) {
        return drawable instanceof D.b ? ((D.b) drawable).a() : drawable;
    }

    public static Drawable l(Drawable drawable) {
        return drawable;
    }
}
