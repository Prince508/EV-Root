package K;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class F implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: e, reason: collision with root package name */
    public final View f929e;

    /* renamed from: f, reason: collision with root package name */
    public ViewTreeObserver f930f;

    /* renamed from: g, reason: collision with root package name */
    public final Runnable f931g;

    public F(View view, Runnable runnable) {
        this.f929e = view;
        this.f930f = view.getViewTreeObserver();
        this.f931g = runnable;
    }

    public static F a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        F f3 = new F(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(f3);
        view.addOnAttachStateChangeListener(f3);
        return f3;
    }

    public void b() {
        if (this.f930f.isAlive()) {
            this.f930f.removeOnPreDrawListener(this);
        } else {
            this.f929e.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f929e.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f931g.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f930f = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
