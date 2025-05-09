package K;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public final class J0 {

    /* renamed from: a, reason: collision with root package name */
    public final e f937a;

    public static class a extends e {

        /* renamed from: a, reason: collision with root package name */
        public final Window f938a;

        /* renamed from: b, reason: collision with root package name */
        public final H f939b;

        public a(Window window, H h3) {
            this.f938a = window;
            this.f939b = h3;
        }

        @Override // K.J0.e
        public void c(int i3) {
            for (int i4 = 1; i4 <= 256; i4 <<= 1) {
                if ((i3 & i4) != 0) {
                    f(i4);
                }
            }
        }

        public void d(int i3) {
            View decorView = this.f938a.getDecorView();
            decorView.setSystemUiVisibility(i3 | decorView.getSystemUiVisibility());
        }

        public void e(int i3) {
            this.f938a.addFlags(i3);
        }

        public final void f(int i3) {
            if (i3 == 1) {
                g(4);
                h(1024);
            } else if (i3 == 2) {
                g(2);
            } else {
                if (i3 != 8) {
                    return;
                }
                this.f939b.a();
            }
        }

        public void g(int i3) {
            View decorView = this.f938a.getDecorView();
            decorView.setSystemUiVisibility((~i3) & decorView.getSystemUiVisibility());
        }

        public void h(int i3) {
            this.f938a.clearFlags(i3);
        }
    }

    public static class b extends a {
        public b(Window window, H h3) {
            super(window, h3);
        }

        @Override // K.J0.e
        public void b(boolean z3) {
            if (!z3) {
                g(8192);
                return;
            }
            h(67108864);
            e(Integer.MIN_VALUE);
            d(8192);
        }
    }

    public static class c extends b {
        public c(Window window, H h3) {
            super(window, h3);
        }

        @Override // K.J0.e
        public void a(boolean z3) {
            if (!z3) {
                g(16);
                return;
            }
            h(134217728);
            e(Integer.MIN_VALUE);
            d(16);
        }
    }

    public J0(WindowInsetsController windowInsetsController) {
        this.f937a = new d(windowInsetsController, this, new H(windowInsetsController));
    }

    public static J0 d(WindowInsetsController windowInsetsController) {
        return new J0(windowInsetsController);
    }

    public void a(boolean z3) {
        this.f937a.a(z3);
    }

    public void b(boolean z3) {
        this.f937a.b(z3);
    }

    public void c(int i3) {
        this.f937a.c(i3);
    }

    public static class d extends e {

        /* renamed from: a, reason: collision with root package name */
        public final J0 f940a;

        /* renamed from: b, reason: collision with root package name */
        public final WindowInsetsController f941b;

        /* renamed from: c, reason: collision with root package name */
        public final H f942c;

        /* renamed from: d, reason: collision with root package name */
        public final o.g f943d;

        /* renamed from: e, reason: collision with root package name */
        public Window f944e;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public d(android.view.Window r2, K.J0 r3, K.H r4) {
            /*
                r1 = this;
                android.view.WindowInsetsController r0 = K.K0.a(r2)
                r1.<init>(r0, r3, r4)
                r1.f944e = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: K.J0.d.<init>(android.view.Window, K.J0, K.H):void");
        }

        @Override // K.J0.e
        public void a(boolean z3) {
            if (z3) {
                if (this.f944e != null) {
                    d(16);
                }
                this.f941b.setSystemBarsAppearance(16, 16);
            } else {
                if (this.f944e != null) {
                    e(16);
                }
                this.f941b.setSystemBarsAppearance(0, 16);
            }
        }

        @Override // K.J0.e
        public void b(boolean z3) {
            if (z3) {
                if (this.f944e != null) {
                    d(8192);
                }
                this.f941b.setSystemBarsAppearance(8, 8);
            } else {
                if (this.f944e != null) {
                    e(8192);
                }
                this.f941b.setSystemBarsAppearance(0, 8);
            }
        }

        @Override // K.J0.e
        public void c(int i3) {
            if ((i3 & 8) != 0) {
                this.f942c.a();
            }
            this.f941b.show(i3 & (-9));
        }

        public void d(int i3) {
            View decorView = this.f944e.getDecorView();
            decorView.setSystemUiVisibility(i3 | decorView.getSystemUiVisibility());
        }

        public void e(int i3) {
            View decorView = this.f944e.getDecorView();
            decorView.setSystemUiVisibility((~i3) & decorView.getSystemUiVisibility());
        }

        public d(WindowInsetsController windowInsetsController, J0 j02, H h3) {
            this.f943d = new o.g();
            this.f941b = windowInsetsController;
            this.f940a = j02;
            this.f942c = h3;
        }
    }

    public J0(Window window, View view) {
        H h3 = new H(view);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 30) {
            this.f937a = new d(window, this, h3);
        } else if (i3 >= 26) {
            this.f937a = new c(window, h3);
        } else {
            this.f937a = new b(window, h3);
        }
    }

    public static class e {
        public abstract void b(boolean z3);

        public abstract void c(int i3);

        public void a(boolean z3) {
        }
    }
}
