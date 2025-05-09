package Q;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;

/* loaded from: classes.dex */
public abstract class b {

    public static class a {
        public static ColorStateList a(CompoundButton compoundButton) {
            return compoundButton.getButtonTintList();
        }

        public static PorterDuff.Mode b(CompoundButton compoundButton) {
            return compoundButton.getButtonTintMode();
        }

        public static void c(CompoundButton compoundButton, ColorStateList colorStateList) {
            compoundButton.setButtonTintList(colorStateList);
        }

        public static void d(CompoundButton compoundButton, PorterDuff.Mode mode) {
            compoundButton.setButtonTintMode(mode);
        }
    }

    /* renamed from: Q.b$b, reason: collision with other inner class name */
    public static class C0047b {
        public static Drawable a(CompoundButton compoundButton) {
            return compoundButton.getButtonDrawable();
        }
    }

    public static Drawable a(CompoundButton compoundButton) {
        return C0047b.a(compoundButton);
    }

    public static void b(CompoundButton compoundButton, ColorStateList colorStateList) {
        a.c(compoundButton, colorStateList);
    }

    public static void c(CompoundButton compoundButton, PorterDuff.Mode mode) {
        a.d(compoundButton, mode);
    }
}
