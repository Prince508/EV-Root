package k1;

import android.content.Context;
import android.view.View;

/* renamed from: k1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0532f {

    /* renamed from: a, reason: collision with root package name */
    public float f8141a;

    /* renamed from: b, reason: collision with root package name */
    public float f8142b;

    public static int[] a(int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i3 = 0; i3 < length; i3++) {
            iArr2[i3] = iArr[i3] * 2;
        }
        return iArr2;
    }

    public static float b(float f3, float f4, float f5) {
        return 1.0f - ((f3 - f5) / (f4 - f5));
    }

    public float c() {
        return this.f8142b;
    }

    public float d() {
        return this.f8141a;
    }

    public void e(Context context) {
        float f3 = this.f8141a;
        if (f3 <= 0.0f) {
            f3 = com.google.android.material.carousel.a.h(context);
        }
        this.f8141a = f3;
        float f4 = this.f8142b;
        if (f4 <= 0.0f) {
            f4 = com.google.android.material.carousel.a.g(context);
        }
        this.f8142b = f4;
    }

    public boolean f() {
        return true;
    }

    public abstract com.google.android.material.carousel.b g(InterfaceC0528b interfaceC0528b, View view);

    public abstract boolean h(InterfaceC0528b interfaceC0528b, int i3);
}
