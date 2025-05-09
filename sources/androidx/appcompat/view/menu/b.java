package androidx.appcompat.view.menu;

import K.AbstractC0213s;
import K.O;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k.AbstractC0524b;
import l.C0543I;
import l.InterfaceC0542H;

/* loaded from: classes.dex */
public final class b extends AbstractC0524b implements g, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: F, reason: collision with root package name */
    public static final int f2751F = d.f.f6131e;

    /* renamed from: A, reason: collision with root package name */
    public boolean f2752A;

    /* renamed from: B, reason: collision with root package name */
    public g.a f2753B;

    /* renamed from: C, reason: collision with root package name */
    public ViewTreeObserver f2754C;

    /* renamed from: D, reason: collision with root package name */
    public PopupWindow.OnDismissListener f2755D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f2756E;

    /* renamed from: f, reason: collision with root package name */
    public final Context f2757f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2758g;

    /* renamed from: h, reason: collision with root package name */
    public final int f2759h;

    /* renamed from: i, reason: collision with root package name */
    public final int f2760i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f2761j;

    /* renamed from: k, reason: collision with root package name */
    public final Handler f2762k;

    /* renamed from: s, reason: collision with root package name */
    public View f2770s;

    /* renamed from: t, reason: collision with root package name */
    public View f2771t;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2773v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2774w;

    /* renamed from: x, reason: collision with root package name */
    public int f2775x;

    /* renamed from: y, reason: collision with root package name */
    public int f2776y;

    /* renamed from: l, reason: collision with root package name */
    public final List f2763l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final List f2764m = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f2765n = new a();

    /* renamed from: o, reason: collision with root package name */
    public final View.OnAttachStateChangeListener f2766o = new ViewOnAttachStateChangeListenerC0076b();

    /* renamed from: p, reason: collision with root package name */
    public final InterfaceC0542H f2767p = new c();

    /* renamed from: q, reason: collision with root package name */
    public int f2768q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f2769r = 0;

    /* renamed from: z, reason: collision with root package name */
    public boolean f2777z = false;

    /* renamed from: u, reason: collision with root package name */
    public int f2772u = D();

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!b.this.f() || b.this.f2764m.size() <= 0 || ((d) b.this.f2764m.get(0)).f2785a.n()) {
                return;
            }
            View view = b.this.f2771t;
            if (view == null || !view.isShown()) {
                b.this.dismiss();
                return;
            }
            Iterator it = b.this.f2764m.iterator();
            while (it.hasNext()) {
                ((d) it.next()).f2785a.a();
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$b, reason: collision with other inner class name */
    public class ViewOnAttachStateChangeListenerC0076b implements View.OnAttachStateChangeListener {
        public ViewOnAttachStateChangeListenerC0076b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = b.this.f2754C;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    b.this.f2754C = view.getViewTreeObserver();
                }
                b bVar = b.this;
                bVar.f2754C.removeGlobalOnLayoutListener(bVar.f2765n);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public class c implements InterfaceC0542H {

        public class a implements Runnable {

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ d f2781e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ MenuItem f2782f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ androidx.appcompat.view.menu.d f2783g;

            public a(d dVar, MenuItem menuItem, androidx.appcompat.view.menu.d dVar2) {
                this.f2781e = dVar;
                this.f2782f = menuItem;
                this.f2783g = dVar2;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.f2781e;
                if (dVar != null) {
                    b.this.f2756E = true;
                    dVar.f2786b.d(false);
                    b.this.f2756E = false;
                }
                if (this.f2782f.isEnabled() && this.f2782f.hasSubMenu()) {
                    this.f2783g.H(this.f2782f, 4);
                }
            }
        }

        public c() {
        }

        @Override // l.InterfaceC0542H
        public void b(androidx.appcompat.view.menu.d dVar, MenuItem menuItem) {
            b.this.f2762k.removeCallbacksAndMessages(null);
            int size = b.this.f2764m.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    i3 = -1;
                    break;
                } else if (dVar == ((d) b.this.f2764m.get(i3)).f2786b) {
                    break;
                } else {
                    i3++;
                }
            }
            if (i3 == -1) {
                return;
            }
            int i4 = i3 + 1;
            b.this.f2762k.postAtTime(new a(i4 < b.this.f2764m.size() ? (d) b.this.f2764m.get(i4) : null, menuItem, dVar), dVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // l.InterfaceC0542H
        public void c(androidx.appcompat.view.menu.d dVar, MenuItem menuItem) {
            b.this.f2762k.removeCallbacksAndMessages(dVar);
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final C0543I f2785a;

        /* renamed from: b, reason: collision with root package name */
        public final androidx.appcompat.view.menu.d f2786b;

        /* renamed from: c, reason: collision with root package name */
        public final int f2787c;

        public d(C0543I c0543i, androidx.appcompat.view.menu.d dVar, int i3) {
            this.f2785a = c0543i;
            this.f2786b = dVar;
            this.f2787c = i3;
        }

        public ListView a() {
            return this.f2785a.g();
        }
    }

    public b(Context context, View view, int i3, int i4, boolean z3) {
        this.f2757f = context;
        this.f2770s = view;
        this.f2759h = i3;
        this.f2760i = i4;
        this.f2761j = z3;
        Resources resources = context.getResources();
        this.f2758g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(d.c.f6042b));
        this.f2762k = new Handler();
    }

    public final int A(androidx.appcompat.view.menu.d dVar) {
        int size = this.f2764m.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (dVar == ((d) this.f2764m.get(i3)).f2786b) {
                return i3;
            }
        }
        return -1;
    }

    public final MenuItem B(androidx.appcompat.view.menu.d dVar, androidx.appcompat.view.menu.d dVar2) {
        int size = dVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            MenuItem item = dVar.getItem(i3);
            if (item.hasSubMenu() && dVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    public final View C(d dVar, androidx.appcompat.view.menu.d dVar2) {
        androidx.appcompat.view.menu.c cVar;
        int i3;
        int firstVisiblePosition;
        MenuItem B3 = B(dVar.f2786b, dVar2);
        if (B3 == null) {
            return null;
        }
        ListView a3 = dVar.a();
        ListAdapter adapter = a3.getAdapter();
        int i4 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i3 = headerViewListAdapter.getHeadersCount();
            cVar = (androidx.appcompat.view.menu.c) headerViewListAdapter.getWrappedAdapter();
        } else {
            cVar = (androidx.appcompat.view.menu.c) adapter;
            i3 = 0;
        }
        int count = cVar.getCount();
        while (true) {
            if (i4 >= count) {
                i4 = -1;
                break;
            }
            if (B3 == cVar.getItem(i4)) {
                break;
            }
            i4++;
        }
        if (i4 != -1 && (firstVisiblePosition = (i4 + i3) - a3.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < a3.getChildCount()) {
            return a3.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    public final int D() {
        return O.w(this.f2770s) == 1 ? 0 : 1;
    }

    public final int E(int i3) {
        List list = this.f2764m;
        ListView a3 = ((d) list.get(list.size() - 1)).a();
        int[] iArr = new int[2];
        a3.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f2771t.getWindowVisibleDisplayFrame(rect);
        return this.f2772u == 1 ? (iArr[0] + a3.getWidth()) + i3 > rect.right ? 0 : 1 : iArr[0] - i3 < 0 ? 1 : 0;
    }

    public final void F(androidx.appcompat.view.menu.d dVar) {
        d dVar2;
        View view;
        int i3;
        int i4;
        int i5;
        LayoutInflater from = LayoutInflater.from(this.f2757f);
        androidx.appcompat.view.menu.c cVar = new androidx.appcompat.view.menu.c(dVar, from, this.f2761j, f2751F);
        if (!f() && this.f2777z) {
            cVar.d(true);
        } else if (f()) {
            cVar.d(AbstractC0524b.x(dVar));
        }
        int o3 = AbstractC0524b.o(cVar, null, this.f2757f, this.f2758g);
        C0543I z3 = z();
        z3.p(cVar);
        z3.s(o3);
        z3.t(this.f2769r);
        if (this.f2764m.size() > 0) {
            List list = this.f2764m;
            dVar2 = (d) list.get(list.size() - 1);
            view = C(dVar2, dVar);
        } else {
            dVar2 = null;
            view = null;
        }
        if (view != null) {
            z3.H(false);
            z3.E(null);
            int E3 = E(o3);
            boolean z4 = E3 == 1;
            this.f2772u = E3;
            if (Build.VERSION.SDK_INT >= 26) {
                z3.q(view);
                i4 = 0;
                i3 = 0;
            } else {
                int[] iArr = new int[2];
                this.f2770s.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f2769r & 7) == 5) {
                    iArr[0] = iArr[0] + this.f2770s.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i3 = iArr2[0] - iArr[0];
                i4 = iArr2[1] - iArr[1];
            }
            if ((this.f2769r & 5) == 5) {
                if (!z4) {
                    o3 = view.getWidth();
                    i5 = i3 - o3;
                }
                i5 = i3 + o3;
            } else {
                if (z4) {
                    o3 = view.getWidth();
                    i5 = i3 + o3;
                }
                i5 = i3 - o3;
            }
            z3.v(i5);
            z3.A(true);
            z3.C(i4);
        } else {
            if (this.f2773v) {
                z3.v(this.f2775x);
            }
            if (this.f2774w) {
                z3.C(this.f2776y);
            }
            z3.u(n());
        }
        this.f2764m.add(new d(z3, dVar, this.f2772u));
        z3.a();
        ListView g3 = z3.g();
        g3.setOnKeyListener(this);
        if (dVar2 == null && this.f2752A && dVar.u() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(d.f.f6135i, (ViewGroup) g3, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(dVar.u());
            g3.addHeaderView(frameLayout, null, false);
            z3.a();
        }
    }

    @Override // k.InterfaceC0525c
    public void a() {
        if (f()) {
            return;
        }
        Iterator it = this.f2763l.iterator();
        while (it.hasNext()) {
            F((androidx.appcompat.view.menu.d) it.next());
        }
        this.f2763l.clear();
        View view = this.f2770s;
        this.f2771t = view;
        if (view != null) {
            boolean z3 = this.f2754C == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f2754C = viewTreeObserver;
            if (z3) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f2765n);
            }
            this.f2771t.addOnAttachStateChangeListener(this.f2766o);
        }
    }

    @Override // androidx.appcompat.view.menu.g
    public void b(androidx.appcompat.view.menu.d dVar, boolean z3) {
        int A3 = A(dVar);
        if (A3 < 0) {
            return;
        }
        int i3 = A3 + 1;
        if (i3 < this.f2764m.size()) {
            ((d) this.f2764m.get(i3)).f2786b.d(false);
        }
        d dVar2 = (d) this.f2764m.remove(A3);
        dVar2.f2786b.K(this);
        if (this.f2756E) {
            dVar2.f2785a.F(null);
            dVar2.f2785a.r(0);
        }
        dVar2.f2785a.dismiss();
        int size = this.f2764m.size();
        if (size > 0) {
            this.f2772u = ((d) this.f2764m.get(size - 1)).f2787c;
        } else {
            this.f2772u = D();
        }
        if (size != 0) {
            if (z3) {
                ((d) this.f2764m.get(0)).f2786b.d(false);
                return;
            }
            return;
        }
        dismiss();
        g.a aVar = this.f2753B;
        if (aVar != null) {
            aVar.b(dVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f2754C;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f2754C.removeGlobalOnLayoutListener(this.f2765n);
            }
            this.f2754C = null;
        }
        this.f2771t.removeOnAttachStateChangeListener(this.f2766o);
        this.f2755D.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.g
    public boolean c() {
        return false;
    }

    @Override // k.InterfaceC0525c
    public void dismiss() {
        int size = this.f2764m.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.f2764m.toArray(new d[size]);
            for (int i3 = size - 1; i3 >= 0; i3--) {
                d dVar = dVarArr[i3];
                if (dVar.f2785a.f()) {
                    dVar.f2785a.dismiss();
                }
            }
        }
    }

    @Override // k.InterfaceC0525c
    public boolean f() {
        return this.f2764m.size() > 0 && ((d) this.f2764m.get(0)).f2785a.f();
    }

    @Override // k.InterfaceC0525c
    public ListView g() {
        if (this.f2764m.isEmpty()) {
            return null;
        }
        return ((d) this.f2764m.get(r0.size() - 1)).a();
    }

    @Override // androidx.appcompat.view.menu.g
    public void i(g.a aVar) {
        this.f2753B = aVar;
    }

    @Override // androidx.appcompat.view.menu.g
    public boolean j(j jVar) {
        for (d dVar : this.f2764m) {
            if (jVar == dVar.f2786b) {
                dVar.a().requestFocus();
                return true;
            }
        }
        if (!jVar.hasVisibleItems()) {
            return false;
        }
        l(jVar);
        g.a aVar = this.f2753B;
        if (aVar != null) {
            aVar.c(jVar);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.g
    public void k(boolean z3) {
        Iterator it = this.f2764m.iterator();
        while (it.hasNext()) {
            AbstractC0524b.y(((d) it.next()).a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // k.AbstractC0524b
    public void l(androidx.appcompat.view.menu.d dVar) {
        dVar.b(this, this.f2757f);
        if (f()) {
            F(dVar);
        } else {
            this.f2763l.add(dVar);
        }
    }

    @Override // k.AbstractC0524b
    public boolean m() {
        return false;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.f2764m.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                dVar = null;
                break;
            }
            dVar = (d) this.f2764m.get(i3);
            if (!dVar.f2785a.f()) {
                break;
            } else {
                i3++;
            }
        }
        if (dVar != null) {
            dVar.f2786b.d(false);
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
        if (this.f2770s != view) {
            this.f2770s = view;
            this.f2769r = AbstractC0213s.b(this.f2768q, O.w(view));
        }
    }

    @Override // k.AbstractC0524b
    public void r(boolean z3) {
        this.f2777z = z3;
    }

    @Override // k.AbstractC0524b
    public void s(int i3) {
        if (this.f2768q != i3) {
            this.f2768q = i3;
            this.f2769r = AbstractC0213s.b(i3, O.w(this.f2770s));
        }
    }

    @Override // k.AbstractC0524b
    public void t(int i3) {
        this.f2773v = true;
        this.f2775x = i3;
    }

    @Override // k.AbstractC0524b
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.f2755D = onDismissListener;
    }

    @Override // k.AbstractC0524b
    public void v(boolean z3) {
        this.f2752A = z3;
    }

    @Override // k.AbstractC0524b
    public void w(int i3) {
        this.f2774w = true;
        this.f2776y = i3;
    }

    public final C0543I z() {
        C0543I c0543i = new C0543I(this.f2757f, null, this.f2759h, this.f2760i);
        c0543i.G(this.f2767p);
        c0543i.z(this);
        c0543i.y(this);
        c0543i.q(this.f2770s);
        c0543i.t(this.f2769r);
        c0543i.x(true);
        c0543i.w(2);
        return c0543i;
    }
}
