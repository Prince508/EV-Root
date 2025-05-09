package f1;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import g0.C0477a;
import g0.C0478b;
import g0.C0479c;

/* renamed from: f1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0474a {

    /* renamed from: a, reason: collision with root package name */
    public static final TimeInterpolator f7194a = new LinearInterpolator();

    /* renamed from: b, reason: collision with root package name */
    public static final TimeInterpolator f7195b = new C0478b();

    /* renamed from: c, reason: collision with root package name */
    public static final TimeInterpolator f7196c = new C0477a();

    /* renamed from: d, reason: collision with root package name */
    public static final TimeInterpolator f7197d = new C0479c();

    /* renamed from: e, reason: collision with root package name */
    public static final TimeInterpolator f7198e = new DecelerateInterpolator();

    public static float a(float f3, float f4, float f5) {
        return f3 + (f5 * (f4 - f3));
    }

    public static float b(float f3, float f4, float f5, float f6, float f7) {
        return f7 <= f5 ? f3 : f7 >= f6 ? f4 : a(f3, f4, (f7 - f5) / (f6 - f5));
    }

    public static int c(int i3, int i4, float f3) {
        return i3 + Math.round(f3 * (i4 - i3));
    }
}
