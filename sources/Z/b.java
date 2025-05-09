package Z;

import K.O;
import Z.a;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class b implements a.b {

    /* renamed from: m, reason: collision with root package name */
    public static final s f2564m = new g("translationX");

    /* renamed from: n, reason: collision with root package name */
    public static final s f2565n = new h("translationY");

    /* renamed from: o, reason: collision with root package name */
    public static final s f2566o = new i("translationZ");

    /* renamed from: p, reason: collision with root package name */
    public static final s f2567p = new j("scaleX");

    /* renamed from: q, reason: collision with root package name */
    public static final s f2568q = new k("scaleY");

    /* renamed from: r, reason: collision with root package name */
    public static final s f2569r = new l("rotation");

    /* renamed from: s, reason: collision with root package name */
    public static final s f2570s = new m("rotationX");

    /* renamed from: t, reason: collision with root package name */
    public static final s f2571t = new n("rotationY");

    /* renamed from: u, reason: collision with root package name */
    public static final s f2572u = new o("x");

    /* renamed from: v, reason: collision with root package name */
    public static final s f2573v = new a("y");

    /* renamed from: w, reason: collision with root package name */
    public static final s f2574w = new C0072b("z");

    /* renamed from: x, reason: collision with root package name */
    public static final s f2575x = new c("alpha");

    /* renamed from: y, reason: collision with root package name */
    public static final s f2576y = new d("scrollX");

    /* renamed from: z, reason: collision with root package name */
    public static final s f2577z = new e("scrollY");

    /* renamed from: e, reason: collision with root package name */
    public final Z.c f2582e;

    /* renamed from: a, reason: collision with root package name */
    public float f2578a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    public float f2579b = Float.MAX_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2580c = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2583f = false;

    /* renamed from: g, reason: collision with root package name */
    public float f2584g = Float.MAX_VALUE;

    /* renamed from: h, reason: collision with root package name */
    public float f2585h = -Float.MAX_VALUE;

    /* renamed from: i, reason: collision with root package name */
    public long f2586i = 0;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f2588k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f2589l = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final Object f2581d = null;

    /* renamed from: j, reason: collision with root package name */
    public float f2587j = 1.0f;

    public static class a extends s {
        public a(String str) {
            super(str, null);
        }

        @Override // Z.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getY();
        }

        @Override // Z.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f3) {
            view.setY(f3);
        }
    }

    /* renamed from: Z.b$b, reason: collision with other inner class name */
    public static class C0072b extends s {
        public C0072b(String str) {
            super(str, null);
        }

        @Override // Z.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return O.I(view);
        }

        @Override // Z.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f3) {
            O.B0(view, f3);
        }
    }

    public static class c extends s {
        public c(String str) {
            super(str, null);
        }

        @Override // Z.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getAlpha();
        }

        @Override // Z.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f3) {
            view.setAlpha(f3);
        }
    }

    public static class d extends s {
        public d(String str) {
            super(str, null);
        }

        @Override // Z.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScrollX();
        }

        @Override // Z.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f3) {
            view.setScrollX((int) f3);
        }
    }

    public static class e extends s {
        public e(String str) {
            super(str, null);
        }

        @Override // Z.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScrollY();
        }

        @Override // Z.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f3) {
            view.setScrollY((int) f3);
        }
    }

    public class f extends Z.c {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Z.d f2590b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, Z.d dVar) {
            super(str);
            this.f2590b = dVar;
        }

        @Override // Z.c
        public float a(Object obj) {
            return this.f2590b.a();
        }

        @Override // Z.c
        public void b(Object obj, float f3) {
            this.f2590b.b(f3);
        }
    }

    public static class g extends s {
        public g(String str) {
            super(str, null);
        }

        @Override // Z.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getTranslationX();
        }

        @Override // Z.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f3) {
            view.setTranslationX(f3);
        }
    }

    public static class h extends s {
        public h(String str) {
            super(str, null);
        }

        @Override // Z.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getTranslationY();
        }

        @Override // Z.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f3) {
            view.setTranslationY(f3);
        }
    }

    public static class i extends s {
        public i(String str) {
            super(str, null);
        }

        @Override // Z.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return O.F(view);
        }

        @Override // Z.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f3) {
            O.z0(view, f3);
        }
    }

    public static class j extends s {
        public j(String str) {
            super(str, null);
        }

        @Override // Z.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScaleX();
        }

        @Override // Z.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f3) {
            view.setScaleX(f3);
        }
    }

    public static class k extends s {
        public k(String str) {
            super(str, null);
        }

        @Override // Z.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScaleY();
        }

        @Override // Z.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f3) {
            view.setScaleY(f3);
        }
    }

    public static class l extends s {
        public l(String str) {
            super(str, null);
        }

        @Override // Z.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getRotation();
        }

        @Override // Z.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f3) {
            view.setRotation(f3);
        }
    }

    public static class m extends s {
        public m(String str) {
            super(str, null);
        }

        @Override // Z.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getRotationX();
        }

        @Override // Z.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f3) {
            view.setRotationX(f3);
        }
    }

    public static class n extends s {
        public n(String str) {
            super(str, null);
        }

        @Override // Z.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getRotationY();
        }

        @Override // Z.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f3) {
            view.setRotationY(f3);
        }
    }

    public static class o extends s {
        public o(String str) {
            super(str, null);
        }

        @Override // Z.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getX();
        }

        @Override // Z.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f3) {
            view.setX(f3);
        }
    }

    public static class p {

        /* renamed from: a, reason: collision with root package name */
        public float f2592a;

        /* renamed from: b, reason: collision with root package name */
        public float f2593b;
    }

    public interface q {
        void a(b bVar, boolean z3, float f3, float f4);
    }

    public interface r {
        void m(b bVar, float f3, float f4);
    }

    public static abstract class s extends Z.c {
        public /* synthetic */ s(String str, g gVar) {
            this(str);
        }

        public s(String str) {
            super(str);
        }
    }

    public b(Z.d dVar) {
        this.f2582e = new f("FloatValueHolder", dVar);
    }

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    @Override // Z.a.b
    public boolean a(long j3) {
        long j4 = this.f2586i;
        if (j4 == 0) {
            this.f2586i = j3;
            l(this.f2579b);
            return false;
        }
        this.f2586i = j3;
        boolean r3 = r(j3 - j4);
        float min = Math.min(this.f2579b, this.f2584g);
        this.f2579b = min;
        float max = Math.max(min, this.f2585h);
        this.f2579b = max;
        l(max);
        if (r3) {
            d(false);
        }
        return r3;
    }

    public b b(q qVar) {
        if (!this.f2588k.contains(qVar)) {
            this.f2588k.add(qVar);
        }
        return this;
    }

    public b c(r rVar) {
        if (g()) {
            throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
        }
        if (!this.f2589l.contains(rVar)) {
            this.f2589l.add(rVar);
        }
        return this;
    }

    public final void d(boolean z3) {
        this.f2583f = false;
        Z.a.d().g(this);
        this.f2586i = 0L;
        this.f2580c = false;
        for (int i3 = 0; i3 < this.f2588k.size(); i3++) {
            if (this.f2588k.get(i3) != null) {
                ((q) this.f2588k.get(i3)).a(this, z3, this.f2579b, this.f2578a);
            }
        }
        h(this.f2588k);
    }

    public final float e() {
        return this.f2582e.a(this.f2581d);
    }

    public float f() {
        return this.f2587j * 0.75f;
    }

    public boolean g() {
        return this.f2583f;
    }

    public b i(float f3) {
        this.f2584g = f3;
        return this;
    }

    public b j(float f3) {
        this.f2585h = f3;
        return this;
    }

    public b k(float f3) {
        if (f3 <= 0.0f) {
            throw new IllegalArgumentException("Minimum visible change must be positive.");
        }
        this.f2587j = f3;
        o(f3 * 0.75f);
        return this;
    }

    public void l(float f3) {
        this.f2582e.b(this.f2581d, f3);
        for (int i3 = 0; i3 < this.f2589l.size(); i3++) {
            if (this.f2589l.get(i3) != null) {
                ((r) this.f2589l.get(i3)).m(this, this.f2579b, this.f2578a);
            }
        }
        h(this.f2589l);
    }

    public b m(float f3) {
        this.f2579b = f3;
        this.f2580c = true;
        return this;
    }

    public b n(float f3) {
        this.f2578a = f3;
        return this;
    }

    public abstract void o(float f3);

    public void p() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f2583f) {
            return;
        }
        q();
    }

    public final void q() {
        if (this.f2583f) {
            return;
        }
        this.f2583f = true;
        if (!this.f2580c) {
            this.f2579b = e();
        }
        float f3 = this.f2579b;
        if (f3 > this.f2584g || f3 < this.f2585h) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        Z.a.d().a(this, 0L);
    }

    public abstract boolean r(long j3);
}
