package androidx.appcompat.view.menu;

import K.O;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.g;
import k.AbstractC0524b;
import l.C0543I;

/* loaded from: classes.dex */
public final class i extends AbstractC0524b implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, g, View.OnKeyListener {

    /* renamed from: z, reason: collision with root package name */
    public static final int f2864z = d.f.f6136j;

    /* renamed from: f, reason: collision with root package name */
    public final Context f2865f;

    /* renamed from: g, reason: collision with root package name */
    public final d f2866g;

    /* renamed from: h, reason: collision with root package name */
    public final c f2867h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f2868i;

    /* renamed from: j, reason: collision with root package name */
    public final int f2869j;

    /* renamed from: k, reason: collision with root package name */
    public final int f2870k;

    /* renamed from: l, reason: collision with root package name */
    public final int f2871l;

    /* renamed from: m, reason: collision with root package name */
    public final C0543I f2872m;

    /* renamed from: p, reason: collision with root package name */
    public PopupWindow.OnDismissListener f2875p;

    /* renamed from: q, reason: collision with root package name */
    public View f2876q;

    /* renamed from: r, reason: collision with root package name */
    public View f2877r;

    /* renamed from: s, reason: collision with root package name */
    public g.a f2878s;

    /* renamed from: t, reason: collision with root package name */
    public ViewTreeObserver f2879t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2880u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2881v;

    /* renamed from: w, reason: collision with root package name */
    public int f2882w;

    /* renamed from: y, reason: collision with root package name */
    public boolean f2884y;

    /* renamed from: n, reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f2873n = new a();

    /* renamed from: o, reason: collision with root package name */
    public final View.OnAttachStateChangeListener f2874o = new b();

    /* renamed from: x, reason: collision with root package name */
    public int f2883x = 0;

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!i.this.f() || i.this.f2872m.n()) {
                return;
            }
            View view = i.this.f2877r;
            if (view == null || !view.isShown()) {
                i.this.dismiss();
            } else {
                i.this.f2872m.a();
            }
        }
    }

    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = i.this.f2879t;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    i.this.f2879t = view.getViewTreeObserver();
                }
                i iVar = i.this;
                iVar.f2879t.removeGlobalOnLayoutListener(iVar.f2873n);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public i(Context context, d dVar, View view, int i3, int i4, boolean z3) {
        this.f2865f = context;
        this.f2866g = dVar;
        this.f2868i = z3;
        this.f2867h = new c(dVar, LayoutInflater.from(context), z3, f2864z);
        this.f2870k = i3;
        this.f2871l = i4;
        Resources resources = context.getResources();
        this.f2869j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(d.c.f6042b));
        this.f2876q = view;
        this.f2872m = new C0543I(context, null, i3, i4);
        dVar.b(this, context);
    }

    @Override // k.InterfaceC0525c
    public void a() {
        if (!z()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.g
    public void b(d dVar, boolean z3) {
        if (dVar != this.f2866g) {
            return;
        }
        dismiss();
        g.a aVar = this.f2878s;
        if (aVar != null) {
            aVar.b(dVar, z3);
        }
    }

    @Override // androidx.appcompat.view.menu.g
    public boolean c() {
        return false;
    }

    @Override // k.InterfaceC0525c
    public void dismiss() {
        if (f()) {
            this.f2872m.dismiss();
        }
    }

    @Override // k.InterfaceC0525c
    public boolean f() {
        return !this.f2880u && this.f2872m.f();
    }

    @Override // k.InterfaceC0525c
    public ListView g() {
        return this.f2872m.g();
    }

    @Override // androidx.appcompat.view.menu.g
    public void i(g.a aVar) {
        this.f2878s = aVar;
    }

    @Override // androidx.appcompat.view.menu.g
    public boolean j(j jVar) {
        if (jVar.hasVisibleItems()) {
            f fVar = new f(this.f2865f, jVar, this.f2877r, this.f2868i, this.f2870k, this.f2871l);
            fVar.j(this.f2878s);
            fVar.g(AbstractC0524b.x(jVar));
            fVar.i(this.f2875p);
            this.f2875p = null;
            this.f2866g.d(false);
            int j3 = this.f2872m.j();
            int l3 = this.f2872m.l();
            if ((Gravity.getAbsoluteGravity(this.f2883x, O.w(this.f2876q)) & 7) == 5) {
                j3 += this.f2876q.getWidth();
            }
            if (fVar.n(j3, l3)) {
                g.a aVar = this.f2878s;
                if (aVar == null) {
                    return true;
                }
                aVar.c(jVar);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.g
    public void k(boolean z3) {
        this.f2881v = false;
        c cVar = this.f2867h;
        if (cVar != null) {
            cVar.notifyDataSetChanged();
        }
    }

    @Override // k.AbstractC0524b
    public void l(d dVar) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f2880u = true;
        this.f2866g.close();
        ViewTreeObserver viewTreeObserver = this.f2879t;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f2879t = this.f2877r.getViewTreeObserver();
            }
            this.f2879t.removeGlobalOnLayoutListener(this.f2873n);
            this.f2879t = null;
        }
        this.f2877r.removeOnAttachStateChangeListener(this.f2874o);
        PopupWindow.OnDismissListener onDismissListener = this.f2875p;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i3, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i3 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // k.AbstractC0524b
    public void p(View view) {
        this.f2876q = view;
    }

    @Override // k.AbstractC0524b
    public void r(boolean z3) {
        this.f2867h.d(z3);
    }

    @Override // k.AbstractC0524b
    public void s(int i3) {
        this.f2883x = i3;
    }

    @Override // k.AbstractC0524b
    public void t(int i3) {
        this.f2872m.v(i3);
    }

    @Override // k.AbstractC0524b
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.f2875p = onDismissListener;
    }

    @Override // k.AbstractC0524b
    public void v(boolean z3) {
        this.f2884y = z3;
    }

    @Override // k.AbstractC0524b
    public void w(int i3) {
        this.f2872m.C(i3);
    }

    public final boolean z() {
        View view;
        if (f()) {
            return true;
        }
        if (this.f2880u || (view = this.f2876q) == null) {
            return false;
        }
        this.f2877r = view;
        this.f2872m.y(this);
        this.f2872m.z(this);
        this.f2872m.x(true);
        View view2 = this.f2877r;
        boolean z3 = this.f2879t == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f2879t = viewTreeObserver;
        if (z3) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f2873n);
        }
        view2.addOnAttachStateChangeListener(this.f2874o);
        this.f2872m.q(view2);
        this.f2872m.t(this.f2883x);
        if (!this.f2881v) {
            this.f2882w = AbstractC0524b.o(this.f2867h, null, this.f2865f, this.f2869j);
            this.f2881v = true;
        }
        this.f2872m.s(this.f2882w);
        this.f2872m.w(2);
        this.f2872m.u(n());
        this.f2872m.a();
        ListView g3 = this.f2872m.g();
        g3.setOnKeyListener(this);
        if (this.f2884y && this.f2866g.u() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f2865f).inflate(d.f.f6135i, (ViewGroup) g3, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f2866g.u());
            }
            frameLayout.setEnabled(false);
            g3.addHeaderView(frameLayout, null, false);
        }
        this.f2872m.p(this.f2867h);
        this.f2872m.a();
        return true;
    }
}
