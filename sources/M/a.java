package M;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: M.a$a, reason: collision with other inner class name */
    public static class C0034a {
        public static Interpolator a(float f3, float f4) {
            return new PathInterpolator(f3, f4);
        }

        public static Interpolator b(float f3, float f4, float f5, float f6) {
            return new PathInterpolator(f3, f4, f5, f6);
        }

        public static Interpolator c(Path path) {
            return new PathInterpolator(path);
        }
    }

    public static Interpolator a(float f3, float f4, float f5, float f6) {
        return C0034a.b(f3, f4, f5, f6);
    }

    public static Interpolator b(Path path) {
        return C0034a.c(path);
    }
}
