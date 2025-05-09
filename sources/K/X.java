package K;

import K.C0205k0;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Insets;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import g0.C0477a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import y.AbstractC0769b;

/* loaded from: classes.dex */
public final class X {

    /* renamed from: a, reason: collision with root package name */
    public e f968a;

    public static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        public WindowInsets f971a;

        /* renamed from: b, reason: collision with root package name */
        public final int f972b;

        public b(int i3) {
            this.f972b = i3;
        }

        public final int a() {
            return this.f972b;
        }

        public abstract void b(X x3);

        public abstract void c(X x3);

        public abstract C0205k0 d(C0205k0 c0205k0, List list);

        public abstract a e(X x3, a aVar);
    }

    public static class c extends e {

        /* renamed from: e, reason: collision with root package name */
        public static final Interpolator f973e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

        /* renamed from: f, reason: collision with root package name */
        public static final Interpolator f974f = new C0477a();

        /* renamed from: g, reason: collision with root package name */
        public static final Interpolator f975g = new DecelerateInterpolator();

        public static class a implements View.OnApplyWindowInsetsListener {

            /* renamed from: a, reason: collision with root package name */
            public final b f976a;

            /* renamed from: b, reason: collision with root package name */
            public C0205k0 f977b;

            /* renamed from: K.X$c$a$a, reason: collision with other inner class name */
            public class C0027a implements ValueAnimator.AnimatorUpdateListener {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ X f978a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ C0205k0 f979b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ C0205k0 f980c;

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ int f981d;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ View f982e;

                public C0027a(X x3, C0205k0 c0205k0, C0205k0 c0205k02, int i3, View view) {
                    this.f978a = x3;
                    this.f979b = c0205k0;
                    this.f980c = c0205k02;
                    this.f981d = i3;
                    this.f982e = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f978a.e(valueAnimator.getAnimatedFraction());
                    c.k(this.f982e, c.o(this.f979b, this.f980c, this.f978a.b(), this.f981d), Collections.singletonList(this.f978a));
                }
            }

            public class b extends AnimatorListenerAdapter {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ X f984a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ View f985b;

                public b(X x3, View view) {
                    this.f984a = x3;
                    this.f985b = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    this.f984a.e(1.0f);
                    c.i(this.f985b, this.f984a);
                }
            }

            /* renamed from: K.X$c$a$c, reason: collision with other inner class name */
            public class RunnableC0028c implements Runnable {

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ View f987e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ X f988f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ a f989g;

                /* renamed from: h, reason: collision with root package name */
                public final /* synthetic */ ValueAnimator f990h;

                public RunnableC0028c(View view, X x3, a aVar, ValueAnimator valueAnimator) {
                    this.f987e = view;
                    this.f988f = x3;
                    this.f989g = aVar;
                    this.f990h = valueAnimator;
                }

                @Override // java.lang.Runnable
                public void run() {
                    c.l(this.f987e, this.f988f, this.f989g);
                    this.f990h.start();
                }
            }

            public a(View view, b bVar) {
                this.f976a = bVar;
                C0205k0 C3 = O.C(view);
                this.f977b = C3 != null ? new C0205k0.b(C3).a() : null;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                if (!view.isLaidOut()) {
                    this.f977b = C0205k0.u(windowInsets, view);
                    return c.m(view, windowInsets);
                }
                C0205k0 u3 = C0205k0.u(windowInsets, view);
                if (this.f977b == null) {
                    this.f977b = O.C(view);
                }
                if (this.f977b == null) {
                    this.f977b = u3;
                    return c.m(view, windowInsets);
                }
                b n3 = c.n(view);
                if (n3 != null && Objects.equals(n3.f971a, windowInsets)) {
                    return c.m(view, windowInsets);
                }
                int e3 = c.e(u3, this.f977b);
                if (e3 == 0) {
                    return c.m(view, windowInsets);
                }
                C0205k0 c0205k0 = this.f977b;
                X x3 = new X(e3, c.g(e3, u3, c0205k0), 160L);
                x3.e(0.0f);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(x3.a());
                a f3 = c.f(u3, c0205k0, e3);
                c.j(view, x3, windowInsets, false);
                duration.addUpdateListener(new C0027a(x3, u3, c0205k0, e3, view));
                duration.addListener(new b(x3, view));
                F.a(view, new RunnableC0028c(view, x3, f3, duration));
                this.f977b = u3;
                return c.m(view, windowInsets);
            }
        }

        public c(int i3, Interpolator interpolator, long j3) {
            super(i3, interpolator, j3);
        }

        public static int e(C0205k0 c0205k0, C0205k0 c0205k02) {
            int i3 = 0;
            for (int i4 = 1; i4 <= 256; i4 <<= 1) {
                if (!c0205k0.f(i4).equals(c0205k02.f(i4))) {
                    i3 |= i4;
                }
            }
            return i3;
        }

        public static a f(C0205k0 c0205k0, C0205k0 c0205k02, int i3) {
            C.b f3 = c0205k0.f(i3);
            C.b f4 = c0205k02.f(i3);
            return new a(C.b.b(Math.min(f3.f128a, f4.f128a), Math.min(f3.f129b, f4.f129b), Math.min(f3.f130c, f4.f130c), Math.min(f3.f131d, f4.f131d)), C.b.b(Math.max(f3.f128a, f4.f128a), Math.max(f3.f129b, f4.f129b), Math.max(f3.f130c, f4.f130c), Math.max(f3.f131d, f4.f131d)));
        }

        public static Interpolator g(int i3, C0205k0 c0205k0, C0205k0 c0205k02) {
            return (i3 & 8) != 0 ? c0205k0.f(C0205k0.m.c()).f131d > c0205k02.f(C0205k0.m.c()).f131d ? f973e : f974f : f975g;
        }

        public static View.OnApplyWindowInsetsListener h(View view, b bVar) {
            return new a(view, bVar);
        }

        public static void i(View view, X x3) {
            b n3 = n(view);
            if (n3 != null) {
                n3.b(x3);
                if (n3.a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                    i(viewGroup.getChildAt(i3), x3);
                }
            }
        }

        public static void j(View view, X x3, WindowInsets windowInsets, boolean z3) {
            b n3 = n(view);
            if (n3 != null) {
                n3.f971a = windowInsets;
                if (!z3) {
                    n3.c(x3);
                    z3 = n3.a() == 0;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                    j(viewGroup.getChildAt(i3), x3, windowInsets, z3);
                }
            }
        }

        public static void k(View view, C0205k0 c0205k0, List list) {
            b n3 = n(view);
            if (n3 != null) {
                c0205k0 = n3.d(c0205k0, list);
                if (n3.a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                    k(viewGroup.getChildAt(i3), c0205k0, list);
                }
            }
        }

        public static void l(View view, X x3, a aVar) {
            b n3 = n(view);
            if (n3 != null) {
                n3.e(x3, aVar);
                if (n3.a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                    l(viewGroup.getChildAt(i3), x3, aVar);
                }
            }
        }

        public static WindowInsets m(View view, WindowInsets windowInsets) {
            return view.getTag(AbstractC0769b.f10122L) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        public static b n(View view) {
            Object tag = view.getTag(AbstractC0769b.f10128R);
            if (tag instanceof a) {
                return ((a) tag).f976a;
            }
            return null;
        }

        public static C0205k0 o(C0205k0 c0205k0, C0205k0 c0205k02, float f3, int i3) {
            C0205k0.b bVar = new C0205k0.b(c0205k0);
            for (int i4 = 1; i4 <= 256; i4 <<= 1) {
                if ((i3 & i4) == 0) {
                    bVar.b(i4, c0205k0.f(i4));
                } else {
                    C.b f4 = c0205k0.f(i4);
                    C.b f5 = c0205k02.f(i4);
                    float f6 = 1.0f - f3;
                    bVar.b(i4, C0205k0.m(f4, (int) (((f4.f128a - f5.f128a) * f6) + 0.5d), (int) (((f4.f129b - f5.f129b) * f6) + 0.5d), (int) (((f4.f130c - f5.f130c) * f6) + 0.5d), (int) (((f4.f131d - f5.f131d) * f6) + 0.5d)));
                }
            }
            return bVar.a();
        }

        public static void p(View view, b bVar) {
            Object tag = view.getTag(AbstractC0769b.f10122L);
            if (bVar == null) {
                view.setTag(AbstractC0769b.f10128R, null);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(null);
                    return;
                }
                return;
            }
            View.OnApplyWindowInsetsListener h3 = h(view, bVar);
            view.setTag(AbstractC0769b.f10128R, h3);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(h3);
            }
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public final int f997a;

        /* renamed from: b, reason: collision with root package name */
        public float f998b;

        /* renamed from: c, reason: collision with root package name */
        public final Interpolator f999c;

        /* renamed from: d, reason: collision with root package name */
        public final long f1000d;

        public e(int i3, Interpolator interpolator, long j3) {
            this.f997a = i3;
            this.f999c = interpolator;
            this.f1000d = j3;
        }

        public long a() {
            return this.f1000d;
        }

        public float b() {
            Interpolator interpolator = this.f999c;
            return interpolator != null ? interpolator.getInterpolation(this.f998b) : this.f998b;
        }

        public int c() {
            return this.f997a;
        }

        public void d(float f3) {
            this.f998b = f3;
        }
    }

    public X(int i3, Interpolator interpolator, long j3) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f968a = new d(i3, interpolator, j3);
        } else {
            this.f968a = new c(i3, interpolator, j3);
        }
    }

    public static void d(View view, b bVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            d.h(view, bVar);
        } else {
            c.p(view, bVar);
        }
    }

    public static X f(WindowInsetsAnimation windowInsetsAnimation) {
        return new X(windowInsetsAnimation);
    }

    public long a() {
        return this.f968a.a();
    }

    public float b() {
        return this.f968a.b();
    }

    public int c() {
        return this.f968a.c();
    }

    public void e(float f3) {
        this.f968a.d(f3);
    }

    public static class d extends e {

        /* renamed from: e, reason: collision with root package name */
        public final WindowInsetsAnimation f992e;

        public static class a extends WindowInsetsAnimation$Callback {

            /* renamed from: a, reason: collision with root package name */
            public final b f993a;

            /* renamed from: b, reason: collision with root package name */
            public List f994b;

            /* renamed from: c, reason: collision with root package name */
            public ArrayList f995c;

            /* renamed from: d, reason: collision with root package name */
            public final HashMap f996d;

            public a(b bVar) {
                super(bVar.a());
                this.f996d = new HashMap();
                this.f993a = bVar;
            }

            public final X a(WindowInsetsAnimation windowInsetsAnimation) {
                X x3 = (X) this.f996d.get(windowInsetsAnimation);
                if (x3 != null) {
                    return x3;
                }
                X f3 = X.f(windowInsetsAnimation);
                this.f996d.put(windowInsetsAnimation, f3);
                return f3;
            }

            public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                this.f993a.b(a(windowInsetsAnimation));
                this.f996d.remove(windowInsetsAnimation);
            }

            public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                this.f993a.c(a(windowInsetsAnimation));
            }

            public WindowInsets onProgress(WindowInsets windowInsets, List list) {
                float fraction;
                ArrayList arrayList = this.f995c;
                if (arrayList == null) {
                    ArrayList arrayList2 = new ArrayList(list.size());
                    this.f995c = arrayList2;
                    this.f994b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation a3 = AbstractC0201i0.a(list.get(size));
                    X a4 = a(a3);
                    fraction = a3.getFraction();
                    a4.e(fraction);
                    this.f995c.add(a4);
                }
                return this.f993a.d(C0205k0.t(windowInsets), this.f994b).s();
            }

            public WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                return this.f993a.e(a(windowInsetsAnimation), a.d(bounds)).c();
            }
        }

        public d(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.f992e = windowInsetsAnimation;
        }

        public static WindowInsetsAnimation.Bounds e(a aVar) {
            AbstractC0199h0.a();
            return AbstractC0197g0.a(aVar.a().e(), aVar.b().e());
        }

        public static C.b f(WindowInsetsAnimation.Bounds bounds) {
            Insets upperBound;
            upperBound = bounds.getUpperBound();
            return C.b.d(upperBound);
        }

        public static C.b g(WindowInsetsAnimation.Bounds bounds) {
            Insets lowerBound;
            lowerBound = bounds.getLowerBound();
            return C.b.d(lowerBound);
        }

        public static void h(View view, b bVar) {
            view.setWindowInsetsAnimationCallback(bVar != null ? new a(bVar) : null);
        }

        @Override // K.X.e
        public long a() {
            long durationMillis;
            durationMillis = this.f992e.getDurationMillis();
            return durationMillis;
        }

        @Override // K.X.e
        public float b() {
            float interpolatedFraction;
            interpolatedFraction = this.f992e.getInterpolatedFraction();
            return interpolatedFraction;
        }

        @Override // K.X.e
        public int c() {
            int typeMask;
            typeMask = this.f992e.getTypeMask();
            return typeMask;
        }

        @Override // K.X.e
        public void d(float f3) {
            this.f992e.setFraction(f3);
        }

        public d(int i3, Interpolator interpolator, long j3) {
            this(AbstractC0195f0.a(i3, interpolator, j3));
        }
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final C.b f969a;

        /* renamed from: b, reason: collision with root package name */
        public final C.b f970b;

        public a(C.b bVar, C.b bVar2) {
            this.f969a = bVar;
            this.f970b = bVar2;
        }

        public static a d(WindowInsetsAnimation.Bounds bounds) {
            return new a(bounds);
        }

        public C.b a() {
            return this.f969a;
        }

        public C.b b() {
            return this.f970b;
        }

        public WindowInsetsAnimation.Bounds c() {
            return d.e(this);
        }

        public String toString() {
            return "Bounds{lower=" + this.f969a + " upper=" + this.f970b + "}";
        }

        public a(WindowInsetsAnimation.Bounds bounds) {
            this.f969a = d.g(bounds);
            this.f970b = d.f(bounds);
        }
    }

    public X(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f968a = new d(windowInsetsAnimation);
        }
    }
}
