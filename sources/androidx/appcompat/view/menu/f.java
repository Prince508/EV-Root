package androidx.appcompat.view.menu;

import K.AbstractC0213s;
import K.O;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.g;
import k.AbstractC0524b;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2851a;

    /* renamed from: b, reason: collision with root package name */
    public final d f2852b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2853c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2854d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2855e;

    /* renamed from: f, reason: collision with root package name */
    public View f2856f;

    /* renamed from: g, reason: collision with root package name */
    public int f2857g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2858h;

    /* renamed from: i, reason: collision with root package name */
    public g.a f2859i;

    /* renamed from: j, reason: collision with root package name */
    public AbstractC0524b f2860j;

    /* renamed from: k, reason: collision with root package name */
    public PopupWindow.OnDismissListener f2861k;

    /* renamed from: l, reason: collision with root package name */
    public final PopupWindow.OnDismissListener f2862l;

    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            f.this.e();
        }
    }

    public static class b {
        public static void a(Display display, Point point) {
            display.getRealSize(point);
        }
    }

    public f(Context context, d dVar, View view, boolean z3, int i3) {
        this(context, dVar, view, z3, i3, 0);
    }

    public final AbstractC0524b a() {
        Display defaultDisplay = ((WindowManager) this.f2851a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        b.a(defaultDisplay, point);
        AbstractC0524b bVar = Math.min(point.x, point.y) >= this.f2851a.getResources().getDimensionPixelSize(d.c.f6041a) ? new androidx.appcompat.view.menu.b(this.f2851a, this.f2856f, this.f2854d, this.f2855e, this.f2853c) : new i(this.f2851a, this.f2852b, this.f2856f, this.f2854d, this.f2855e, this.f2853c);
        bVar.l(this.f2852b);
        bVar.u(this.f2862l);
        bVar.p(this.f2856f);
        bVar.i(this.f2859i);
        bVar.r(this.f2858h);
        bVar.s(this.f2857g);
        return bVar;
    }

    public void b() {
        if (d()) {
            this.f2860j.dismiss();
        }
    }

    public AbstractC0524b c() {
        if (this.f2860j == null) {
            this.f2860j = a();
        }
        return this.f2860j;
    }

    public boolean d() {
        AbstractC0524b abstractC0524b = this.f2860j;
        return abstractC0524b != null && abstractC0524b.f();
    }

    public void e() {
        this.f2860j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f2861k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void f(View view) {
        this.f2856f = view;
    }

    public void g(boolean z3) {
        this.f2858h = z3;
        AbstractC0524b abstractC0524b = this.f2860j;
        if (abstractC0524b != null) {
            abstractC0524b.r(z3);
        }
    }

    public void h(int i3) {
        this.f2857g = i3;
    }

    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.f2861k = onDismissListener;
    }

    public void j(g.a aVar) {
        this.f2859i = aVar;
        AbstractC0524b abstractC0524b = this.f2860j;
        if (abstractC0524b != null) {
            abstractC0524b.i(aVar);
        }
    }

    public void k() {
        if (!m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public final void l(int i3, int i4, boolean z3, boolean z4) {
        AbstractC0524b c3 = c();
        c3.v(z4);
        if (z3) {
            if ((AbstractC0213s.b(this.f2857g, O.w(this.f2856f)) & 7) == 5) {
                i3 -= this.f2856f.getWidth();
            }
            c3.t(i3);
            c3.w(i4);
            int i5 = (int) ((this.f2851a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            c3.q(new Rect(i3 - i5, i4 - i5, i3 + i5, i4 + i5));
        }
        c3.a();
    }

    public boolean m() {
        if (d()) {
            return true;
        }
        if (this.f2856f == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public boolean n(int i3, int i4) {
        if (d()) {
            return true;
        }
        if (this.f2856f == null) {
            return false;
        }
        l(i3, i4, true, true);
        return true;
    }

    public f(Context context, d dVar, View view, boolean z3, int i3, int i4) {
        this.f2857g = 8388611;
        this.f2862l = new a();
        this.f2851a = context;
        this.f2852b = dVar;
        this.f2856f = view;
        this.f2853c = z3;
        this.f2854d = i3;
        this.f2855e = i4;
    }
}
