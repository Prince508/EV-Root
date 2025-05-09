package com.easyvictory.cheto.overlays;

import U2.a;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.view.WindowManager;
import c1.AbstractC0382j;
import com.easyvictory.cheto.views.ESPView;

/* loaded from: classes.dex */
public class ESPImpl extends ESPView {

    /* renamed from: e, reason: collision with root package name */
    public WindowManager f4811e;

    public ESPImpl(Context context) {
        super(context);
        this.f4811e = (WindowManager) context.getSystemService(a.a(-558021046510L));
        a();
    }

    public void a() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -1, 2032, 1304, 1);
        if (Build.VERSION.SDK_INT >= 28) {
            layoutParams.layoutInDisplayCutoutMode = 1;
        }
        layoutParams.gravity = 8388659;
        try {
            this.f4811e.addView(this, layoutParams);
        } catch (Throwable th) {
            AbstractC0382j.f(th);
        }
    }

    public boolean b() {
        WindowManager windowManager = this.f4811e;
        return windowManager != null && windowManager.getDefaultDisplay().getRotation() == 1;
    }

    public void c() {
        WindowManager windowManager = this.f4811e;
        if (windowManager != null) {
            try {
                windowManager.removeView(this);
            } catch (Throwable unused) {
            }
            this.f4811e = null;
        }
    }

    @Override // com.easyvictory.cheto.views.ESPView
    public void onDrawImpl(Canvas canvas) {
        try {
            onDrawImplJNI(canvas, b());
        } catch (Throwable th) {
            AbstractC0382j.f(th);
        }
    }

    public native void onDrawImplJNI(Canvas canvas, boolean z3);
}
