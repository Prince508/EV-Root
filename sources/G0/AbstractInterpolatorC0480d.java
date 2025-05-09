package g0;

import android.view.animation.Interpolator;

/* renamed from: g0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractInterpolatorC0480d implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f7210a;

    /* renamed from: b, reason: collision with root package name */
    public final float f7211b;

    public AbstractInterpolatorC0480d(float[] fArr) {
        this.f7210a = fArr;
        this.f7211b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f3) {
        if (f3 >= 1.0f) {
            return 1.0f;
        }
        if (f3 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f7210a;
        int min = Math.min((int) ((fArr.length - 1) * f3), fArr.length - 2);
        float f4 = this.f7211b;
        float f5 = (f3 - (min * f4)) / f4;
        float[] fArr2 = this.f7210a;
        float f6 = fArr2[min];
        return f6 + (f5 * (fArr2[min + 1] - f6));
    }
}
