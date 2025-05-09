package x1;

import android.graphics.drawable.Drawable;
import android.view.View;

/* loaded from: classes.dex */
public abstract class h {
    public static d a(int i3) {
        return i3 != 0 ? i3 != 1 ? b() : new e() : new j();
    }

    public static d b() {
        return new j();
    }

    public static f c() {
        return new f();
    }

    public static void d(View view, float f3) {
        Drawable background = view.getBackground();
        if (background instanceof g) {
            ((g) background).S(f3);
        }
    }

    public static void e(View view) {
        Drawable background = view.getBackground();
        if (background instanceof g) {
            f(view, (g) background);
        }
    }

    public static void f(View view, g gVar) {
        if (gVar.L()) {
            gVar.W(r1.n.f(view));
        }
    }
}
