package r1;

import K.C;
import K.C0205k0;
import K.J0;
import K.O;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import o1.AbstractC0648d;

/* loaded from: classes.dex */
public abstract class n {

    public class a implements C {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f8988a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f8989b;

        public a(c cVar, d dVar) {
            this.f8988a = cVar;
            this.f8989b = dVar;
        }

        @Override // K.C
        public C0205k0 a(View view, C0205k0 c0205k0) {
            return this.f8988a.a(view, c0205k0, new d(this.f8989b));
        }
    }

    public interface c {
        C0205k0 a(View view, C0205k0 c0205k0, d dVar);
    }

    public static void b(View view, c cVar) {
        O.v0(view, new a(cVar, new d(O.B(view), view.getPaddingTop(), O.A(view), view.getPaddingBottom())));
        i(view);
    }

    public static float c(Context context, int i3) {
        return TypedValue.applyDimension(1, i3, context.getResources().getDisplayMetrics());
    }

    public static Integer d(View view) {
        ColorStateList a3 = AbstractC0648d.a(view.getBackground());
        if (a3 != null) {
            return Integer.valueOf(a3.getDefaultColor());
        }
        return null;
    }

    public static InputMethodManager e(View view) {
        return (InputMethodManager) A.a.f(view.getContext(), InputMethodManager.class);
    }

    public static float f(View view) {
        float f3 = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f3 += O.r((View) parent);
        }
        return f3;
    }

    public static boolean g(View view) {
        return O.w(view) == 1;
    }

    public static PorterDuff.Mode h(int i3, PorterDuff.Mode mode) {
        if (i3 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i3 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i3 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i3) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void i(View view) {
        if (O.N(view)) {
            O.g0(view);
        } else {
            view.addOnAttachStateChangeListener(new b());
        }
    }

    public static void j(final View view, final boolean z3) {
        view.requestFocus();
        view.post(new Runnable() { // from class: r1.m
            @Override // java.lang.Runnable
            public final void run() {
                n.k(view, z3);
            }
        });
    }

    public static void k(View view, boolean z3) {
        J0 G3;
        if (!z3 || (G3 = O.G(view)) == null) {
            e(view).showSoftInput(view, 1);
        } else {
            G3.c(C0205k0.m.c());
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public int f8990a;

        /* renamed from: b, reason: collision with root package name */
        public int f8991b;

        /* renamed from: c, reason: collision with root package name */
        public int f8992c;

        /* renamed from: d, reason: collision with root package name */
        public int f8993d;

        public d(int i3, int i4, int i5, int i6) {
            this.f8990a = i3;
            this.f8991b = i4;
            this.f8992c = i5;
            this.f8993d = i6;
        }

        public d(d dVar) {
            this.f8990a = dVar.f8990a;
            this.f8991b = dVar.f8991b;
            this.f8992c = dVar.f8992c;
            this.f8993d = dVar.f8993d;
        }
    }

    public class b implements View.OnAttachStateChangeListener {
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            O.g0(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }
}
