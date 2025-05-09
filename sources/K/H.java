package K;

import android.R;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;

/* loaded from: classes.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    public final c f933a;

    public static class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public final View f934a;

        public a(View view) {
            this.f934a = view;
        }

        @Override // K.H.c
        public void a() {
            final View view = this.f934a;
            if (view == null) {
                return;
            }
            if (view.isInEditMode() || view.onCheckIsTextEditor()) {
                view.requestFocus();
            } else {
                view = view.getRootView().findFocus();
            }
            if (view == null) {
                view = this.f934a.getRootView().findViewById(R.id.content);
            }
            if (view == null || !view.hasWindowFocus()) {
                return;
            }
            view.post(new Runnable() { // from class: K.G
                @Override // java.lang.Runnable
                public final void run() {
                    ((InputMethodManager) r0.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                }
            });
        }
    }

    public static class c {
        public abstract void a();
    }

    public H(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f933a = new b(view);
        } else {
            this.f933a = new a(view);
        }
    }

    public void a() {
        this.f933a.a();
    }

    public static class b extends a {

        /* renamed from: b, reason: collision with root package name */
        public View f935b;

        /* renamed from: c, reason: collision with root package name */
        public WindowInsetsController f936c;

        public b(View view) {
            super(view);
            this.f935b = view;
        }

        @Override // K.H.a, K.H.c
        public void a() {
            int ime;
            View view = this.f935b;
            if (view != null && Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
            }
            WindowInsetsController windowInsetsController = this.f936c;
            if (windowInsetsController == null) {
                View view2 = this.f935b;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController != null) {
                ime = WindowInsets.Type.ime();
                windowInsetsController.show(ime);
            }
            super.a();
        }

        public b(WindowInsetsController windowInsetsController) {
            super(null);
            this.f936c = windowInsetsController;
        }
    }

    public H(WindowInsetsController windowInsetsController) {
        this.f933a = new b(windowInsetsController);
    }
}
