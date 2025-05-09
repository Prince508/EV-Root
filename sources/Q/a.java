package Q;

import K.O;
import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {

    /* renamed from: v, reason: collision with root package name */
    public static final int f1802v = ViewConfiguration.getTapTimeout();

    /* renamed from: g, reason: collision with root package name */
    public final View f1805g;

    /* renamed from: h, reason: collision with root package name */
    public Runnable f1806h;

    /* renamed from: k, reason: collision with root package name */
    public int f1809k;

    /* renamed from: l, reason: collision with root package name */
    public int f1810l;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1814p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1815q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1816r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1817s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f1818t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f1819u;

    /* renamed from: e, reason: collision with root package name */
    public final C0046a f1803e = new C0046a();

    /* renamed from: f, reason: collision with root package name */
    public final Interpolator f1804f = new AccelerateInterpolator();

    /* renamed from: i, reason: collision with root package name */
    public float[] f1807i = {0.0f, 0.0f};

    /* renamed from: j, reason: collision with root package name */
    public float[] f1808j = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: m, reason: collision with root package name */
    public float[] f1811m = {0.0f, 0.0f};

    /* renamed from: n, reason: collision with root package name */
    public float[] f1812n = {0.0f, 0.0f};

    /* renamed from: o, reason: collision with root package name */
    public float[] f1813o = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: Q.a$a, reason: collision with other inner class name */
    public static class C0046a {

        /* renamed from: a, reason: collision with root package name */
        public int f1820a;

        /* renamed from: b, reason: collision with root package name */
        public int f1821b;

        /* renamed from: c, reason: collision with root package name */
        public float f1822c;

        /* renamed from: d, reason: collision with root package name */
        public float f1823d;

        /* renamed from: j, reason: collision with root package name */
        public float f1829j;

        /* renamed from: k, reason: collision with root package name */
        public int f1830k;

        /* renamed from: e, reason: collision with root package name */
        public long f1824e = Long.MIN_VALUE;

        /* renamed from: i, reason: collision with root package name */
        public long f1828i = -1;

        /* renamed from: f, reason: collision with root package name */
        public long f1825f = 0;

        /* renamed from: g, reason: collision with root package name */
        public int f1826g = 0;

        /* renamed from: h, reason: collision with root package name */
        public int f1827h = 0;

        public void a() {
            if (this.f1825f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float g3 = g(e(currentAnimationTimeMillis));
            long j3 = currentAnimationTimeMillis - this.f1825f;
            this.f1825f = currentAnimationTimeMillis;
            float f3 = j3 * g3;
            this.f1826g = (int) (this.f1822c * f3);
            this.f1827h = (int) (f3 * this.f1823d);
        }

        public int b() {
            return this.f1826g;
        }

        public int c() {
            return this.f1827h;
        }

        public int d() {
            float f3 = this.f1822c;
            return (int) (f3 / Math.abs(f3));
        }

        public final float e(long j3) {
            if (j3 < this.f1824e) {
                return 0.0f;
            }
            long j4 = this.f1828i;
            if (j4 < 0 || j3 < j4) {
                return a.e((j3 - r0) / this.f1820a, 0.0f, 1.0f) * 0.5f;
            }
            float f3 = this.f1829j;
            return (1.0f - f3) + (f3 * a.e((j3 - j4) / this.f1830k, 0.0f, 1.0f));
        }

        public int f() {
            float f3 = this.f1823d;
            return (int) (f3 / Math.abs(f3));
        }

        public final float g(float f3) {
            return ((-4.0f) * f3 * f3) + (f3 * 4.0f);
        }

        public boolean h() {
            return this.f1828i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f1828i + ((long) this.f1830k);
        }

        public void i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f1830k = a.f((int) (currentAnimationTimeMillis - this.f1824e), 0, this.f1821b);
            this.f1829j = e(currentAnimationTimeMillis);
            this.f1828i = currentAnimationTimeMillis;
        }

        public void j(int i3) {
            this.f1821b = i3;
        }

        public void k(int i3) {
            this.f1820a = i3;
        }

        public void l(float f3, float f4) {
            this.f1822c = f3;
            this.f1823d = f4;
        }

        public void m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f1824e = currentAnimationTimeMillis;
            this.f1828i = -1L;
            this.f1825f = currentAnimationTimeMillis;
            this.f1829j = 0.5f;
            this.f1826g = 0;
            this.f1827h = 0;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (aVar.f1817s) {
                if (aVar.f1815q) {
                    aVar.f1815q = false;
                    aVar.f1803e.m();
                }
                C0046a c0046a = a.this.f1803e;
                if (c0046a.h() || !a.this.u()) {
                    a.this.f1817s = false;
                    return;
                }
                a aVar2 = a.this;
                if (aVar2.f1816r) {
                    aVar2.f1816r = false;
                    aVar2.c();
                }
                c0046a.a();
                a.this.j(c0046a.b(), c0046a.c());
                O.b0(a.this.f1805g, this);
            }
        }
    }

    public a(View view) {
        this.f1805g = view;
        float f3 = Resources.getSystem().getDisplayMetrics().density;
        float f4 = (int) ((1575.0f * f3) + 0.5f);
        o(f4, f4);
        float f5 = (int) ((f3 * 315.0f) + 0.5f);
        p(f5, f5);
        l(1);
        n(Float.MAX_VALUE, Float.MAX_VALUE);
        s(0.2f, 0.2f);
        t(1.0f, 1.0f);
        k(f1802v);
        r(500);
        q(500);
    }

    public static float e(float f3, float f4, float f5) {
        return f3 > f5 ? f5 : f3 < f4 ? f4 : f3;
    }

    public static int f(int i3, int i4, int i5) {
        return i3 > i5 ? i5 : i3 < i4 ? i4 : i3;
    }

    public abstract boolean a(int i3);

    public abstract boolean b(int i3);

    public void c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f1805g.onTouchEvent(obtain);
        obtain.recycle();
    }

    public final float d(int i3, float f3, float f4, float f5) {
        float h3 = h(this.f1807i[i3], f4, this.f1808j[i3], f3);
        if (h3 == 0.0f) {
            return 0.0f;
        }
        float f6 = this.f1811m[i3];
        float f7 = this.f1812n[i3];
        float f8 = this.f1813o[i3];
        float f9 = f6 * f5;
        return h3 > 0.0f ? e(h3 * f9, f7, f8) : -e((-h3) * f9, f7, f8);
    }

    public final float g(float f3, float f4) {
        if (f4 == 0.0f) {
            return 0.0f;
        }
        int i3 = this.f1809k;
        if (i3 == 0 || i3 == 1) {
            if (f3 < f4) {
                if (f3 >= 0.0f) {
                    return 1.0f - (f3 / f4);
                }
                if (this.f1817s && i3 == 1) {
                    return 1.0f;
                }
            }
        } else if (i3 == 2 && f3 < 0.0f) {
            return f3 / (-f4);
        }
        return 0.0f;
    }

    public final float h(float f3, float f4, float f5, float f6) {
        float interpolation;
        float e3 = e(f3 * f4, 0.0f, f5);
        float g3 = g(f4 - f6, e3) - g(f6, e3);
        if (g3 < 0.0f) {
            interpolation = -this.f1804f.getInterpolation(-g3);
        } else {
            if (g3 <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f1804f.getInterpolation(g3);
        }
        return e(interpolation, -1.0f, 1.0f);
    }

    public final void i() {
        if (this.f1815q) {
            this.f1817s = false;
        } else {
            this.f1803e.i();
        }
    }

    public abstract void j(int i3, int i4);

    public a k(int i3) {
        this.f1810l = i3;
        return this;
    }

    public a l(int i3) {
        this.f1809k = i3;
        return this;
    }

    public a m(boolean z3) {
        if (this.f1818t && !z3) {
            i();
        }
        this.f1818t = z3;
        return this;
    }

    public a n(float f3, float f4) {
        float[] fArr = this.f1808j;
        fArr[0] = f3;
        fArr[1] = f4;
        return this;
    }

    public a o(float f3, float f4) {
        float[] fArr = this.f1813o;
        fArr[0] = f3 / 1000.0f;
        fArr[1] = f4 / 1000.0f;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
    
        if (r0 != 3) goto L20;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f1818t
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r6 = 3
            if (r0 == r6) goto L16
            goto L58
        L16:
            r5.i()
            goto L58
        L1a:
            r5.f1816r = r2
            r5.f1814p = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f1805g
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f1805g
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.d(r2, r7, r6, r3)
            Q.a$a r7 = r5.f1803e
            r7.l(r0, r6)
            boolean r6 = r5.f1817s
            if (r6 != 0) goto L58
            boolean r6 = r5.u()
            if (r6 == 0) goto L58
            r5.v()
        L58:
            boolean r6 = r5.f1819u
            if (r6 == 0) goto L61
            boolean r6 = r5.f1817s
            if (r6 == 0) goto L61
            return r2
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Q.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public a p(float f3, float f4) {
        float[] fArr = this.f1812n;
        fArr[0] = f3 / 1000.0f;
        fArr[1] = f4 / 1000.0f;
        return this;
    }

    public a q(int i3) {
        this.f1803e.j(i3);
        return this;
    }

    public a r(int i3) {
        this.f1803e.k(i3);
        return this;
    }

    public a s(float f3, float f4) {
        float[] fArr = this.f1807i;
        fArr[0] = f3;
        fArr[1] = f4;
        return this;
    }

    public a t(float f3, float f4) {
        float[] fArr = this.f1811m;
        fArr[0] = f3 / 1000.0f;
        fArr[1] = f4 / 1000.0f;
        return this;
    }

    public boolean u() {
        C0046a c0046a = this.f1803e;
        int f3 = c0046a.f();
        int d3 = c0046a.d();
        if (f3 == 0 || !b(f3)) {
            return d3 != 0 && a(d3);
        }
        return true;
    }

    public final void v() {
        int i3;
        if (this.f1806h == null) {
            this.f1806h = new b();
        }
        this.f1817s = true;
        this.f1815q = true;
        if (this.f1814p || (i3 = this.f1810l) <= 0) {
            this.f1806h.run();
        } else {
            O.c0(this.f1805g, this.f1806h, i3);
        }
        this.f1814p = true;
    }
}
