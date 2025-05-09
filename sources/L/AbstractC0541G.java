package l;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import k.InterfaceC0525c;

/* renamed from: l.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0541G implements InterfaceC0525c {

    /* renamed from: K, reason: collision with root package name */
    public static Method f8190K;

    /* renamed from: L, reason: collision with root package name */
    public static Method f8191L;

    /* renamed from: E, reason: collision with root package name */
    public Runnable f8196E;

    /* renamed from: F, reason: collision with root package name */
    public final Handler f8197F;

    /* renamed from: H, reason: collision with root package name */
    public Rect f8199H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f8200I;

    /* renamed from: J, reason: collision with root package name */
    public PopupWindow f8201J;

    /* renamed from: e, reason: collision with root package name */
    public Context f8202e;

    /* renamed from: f, reason: collision with root package name */
    public ListAdapter f8203f;

    /* renamed from: g, reason: collision with root package name */
    public AbstractC0538D f8204g;

    /* renamed from: j, reason: collision with root package name */
    public int f8207j;

    /* renamed from: k, reason: collision with root package name */
    public int f8208k;

    /* renamed from: m, reason: collision with root package name */
    public boolean f8210m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f8211n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f8212o;

    /* renamed from: t, reason: collision with root package name */
    public View f8217t;

    /* renamed from: v, reason: collision with root package name */
    public DataSetObserver f8219v;

    /* renamed from: w, reason: collision with root package name */
    public View f8220w;

    /* renamed from: x, reason: collision with root package name */
    public Drawable f8221x;

    /* renamed from: y, reason: collision with root package name */
    public AdapterView.OnItemClickListener f8222y;

    /* renamed from: z, reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f8223z;

    /* renamed from: h, reason: collision with root package name */
    public int f8205h = -2;

    /* renamed from: i, reason: collision with root package name */
    public int f8206i = -2;

    /* renamed from: l, reason: collision with root package name */
    public int f8209l = 1002;

    /* renamed from: p, reason: collision with root package name */
    public int f8213p = 0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f8214q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f8215r = false;

    /* renamed from: s, reason: collision with root package name */
    public int f8216s = Integer.MAX_VALUE;

    /* renamed from: u, reason: collision with root package name */
    public int f8218u = 0;

    /* renamed from: A, reason: collision with root package name */
    public final i f8192A = new i();

    /* renamed from: B, reason: collision with root package name */
    public final h f8193B = new h();

    /* renamed from: C, reason: collision with root package name */
    public final g f8194C = new g();

    /* renamed from: D, reason: collision with root package name */
    public final e f8195D = new e();

    /* renamed from: G, reason: collision with root package name */
    public final Rect f8198G = new Rect();

    /* renamed from: l.G$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View i3 = AbstractC0541G.this.i();
            if (i3 == null || i3.getWindowToken() == null) {
                return;
            }
            AbstractC0541G.this.a();
        }
    }

    /* renamed from: l.G$c */
    public static class c {
        public static int a(PopupWindow popupWindow, View view, int i3, boolean z3) {
            return popupWindow.getMaxAvailableHeight(view, i3, z3);
        }
    }

    /* renamed from: l.G$d */
    public static class d {
        public static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        public static void b(PopupWindow popupWindow, boolean z3) {
            popupWindow.setIsClippedToScreen(z3);
        }
    }

    /* renamed from: l.G$e */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC0541G.this.e();
        }
    }

    /* renamed from: l.G$f */
    public class f extends DataSetObserver {
        public f() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (AbstractC0541G.this.f()) {
                AbstractC0541G.this.a();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            AbstractC0541G.this.dismiss();
        }
    }

    /* renamed from: l.G$h */
    public class h implements View.OnTouchListener {
        public h() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x3 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = AbstractC0541G.this.f8201J) != null && popupWindow.isShowing() && x3 >= 0 && x3 < AbstractC0541G.this.f8201J.getWidth() && y3 >= 0 && y3 < AbstractC0541G.this.f8201J.getHeight()) {
                AbstractC0541G abstractC0541G = AbstractC0541G.this;
                abstractC0541G.f8197F.postDelayed(abstractC0541G.f8192A, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            AbstractC0541G abstractC0541G2 = AbstractC0541G.this;
            abstractC0541G2.f8197F.removeCallbacks(abstractC0541G2.f8192A);
            return false;
        }
    }

    /* renamed from: l.G$i */
    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AbstractC0538D abstractC0538D = AbstractC0541G.this.f8204g;
            if (abstractC0538D == null || !K.O.N(abstractC0538D) || AbstractC0541G.this.f8204g.getCount() <= AbstractC0541G.this.f8204g.getChildCount()) {
                return;
            }
            int childCount = AbstractC0541G.this.f8204g.getChildCount();
            AbstractC0541G abstractC0541G = AbstractC0541G.this;
            if (childCount <= abstractC0541G.f8216s) {
                abstractC0541G.f8201J.setInputMethodMode(2);
                AbstractC0541G.this.a();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f8190K = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f8191L = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public AbstractC0541G(Context context, AttributeSet attributeSet, int i3, int i4) {
        this.f8202e = context;
        this.f8197F = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.i.f6181G0, i3, i4);
        this.f8207j = obtainStyledAttributes.getDimensionPixelOffset(d.i.f6185H0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(d.i.f6189I0, 0);
        this.f8208k = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f8210m = true;
        }
        obtainStyledAttributes.recycle();
        C0575p c0575p = new C0575p(context, attributeSet, i3, i4);
        this.f8201J = c0575p;
        c0575p.setInputMethodMode(1);
    }

    public void A(boolean z3) {
        this.f8212o = true;
        this.f8211n = z3;
    }

    public final void B(boolean z3) {
        if (Build.VERSION.SDK_INT > 28) {
            d.b(this.f8201J, z3);
            return;
        }
        Method method = f8190K;
        if (method != null) {
            try {
                method.invoke(this.f8201J, Boolean.valueOf(z3));
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    public void C(int i3) {
        this.f8208k = i3;
        this.f8210m = true;
    }

    public void D(int i3) {
        this.f8206i = i3;
    }

    @Override // k.InterfaceC0525c
    public void a() {
        int d3 = d();
        boolean m3 = m();
        Q.f.b(this.f8201J, this.f8209l);
        if (this.f8201J.isShowing()) {
            if (K.O.N(i())) {
                int i3 = this.f8206i;
                if (i3 == -1) {
                    i3 = -1;
                } else if (i3 == -2) {
                    i3 = i().getWidth();
                }
                int i4 = this.f8205h;
                if (i4 == -1) {
                    if (!m3) {
                        d3 = -1;
                    }
                    if (m3) {
                        this.f8201J.setWidth(this.f8206i == -1 ? -1 : 0);
                        this.f8201J.setHeight(0);
                    } else {
                        this.f8201J.setWidth(this.f8206i == -1 ? -1 : 0);
                        this.f8201J.setHeight(-1);
                    }
                } else if (i4 != -2) {
                    d3 = i4;
                }
                this.f8201J.setOutsideTouchable((this.f8215r || this.f8214q) ? false : true);
                this.f8201J.update(i(), this.f8207j, this.f8208k, i3 < 0 ? -1 : i3, d3 < 0 ? -1 : d3);
                return;
            }
            return;
        }
        int i5 = this.f8206i;
        if (i5 == -1) {
            i5 = -1;
        } else if (i5 == -2) {
            i5 = i().getWidth();
        }
        int i6 = this.f8205h;
        if (i6 == -1) {
            d3 = -1;
        } else if (i6 != -2) {
            d3 = i6;
        }
        this.f8201J.setWidth(i5);
        this.f8201J.setHeight(d3);
        B(true);
        this.f8201J.setOutsideTouchable((this.f8215r || this.f8214q) ? false : true);
        this.f8201J.setTouchInterceptor(this.f8193B);
        if (this.f8212o) {
            Q.f.a(this.f8201J, this.f8211n);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f8191L;
            if (method != null) {
                try {
                    method.invoke(this.f8201J, this.f8199H);
                } catch (Exception e3) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e3);
                }
            }
        } else {
            d.a(this.f8201J, this.f8199H);
        }
        Q.f.c(this.f8201J, i(), this.f8207j, this.f8208k, this.f8213p);
        this.f8204g.setSelection(-1);
        if (!this.f8200I || this.f8204g.isInTouchMode()) {
            e();
        }
        if (this.f8200I) {
            return;
        }
        this.f8197F.post(this.f8195D);
    }

    public final int d() {
        int i3;
        int i4;
        int makeMeasureSpec;
        int i5;
        if (this.f8204g == null) {
            Context context = this.f8202e;
            this.f8196E = new a();
            AbstractC0538D h3 = h(context, !this.f8200I);
            this.f8204g = h3;
            Drawable drawable = this.f8221x;
            if (drawable != null) {
                h3.setSelector(drawable);
            }
            this.f8204g.setAdapter(this.f8203f);
            this.f8204g.setOnItemClickListener(this.f8222y);
            this.f8204g.setFocusable(true);
            this.f8204g.setFocusableInTouchMode(true);
            this.f8204g.setOnItemSelectedListener(new b());
            this.f8204g.setOnScrollListener(this.f8194C);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f8223z;
            if (onItemSelectedListener != null) {
                this.f8204g.setOnItemSelectedListener(onItemSelectedListener);
            }
            View view = this.f8204g;
            View view2 = this.f8217t;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i6 = this.f8218u;
                if (i6 == 0) {
                    linearLayout.addView(view2);
                    linearLayout.addView(view, layoutParams);
                } else if (i6 != 1) {
                    Log.e("ListPopupWindow", "Invalid hint position " + this.f8218u);
                } else {
                    linearLayout.addView(view, layoutParams);
                    linearLayout.addView(view2);
                }
                int i7 = this.f8206i;
                if (i7 >= 0) {
                    i5 = Integer.MIN_VALUE;
                } else {
                    i7 = 0;
                    i5 = 0;
                }
                view2.measure(View.MeasureSpec.makeMeasureSpec(i7, i5), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                i3 = view2.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                i3 = 0;
            }
            this.f8201J.setContentView(view);
        } else {
            View view3 = this.f8217t;
            if (view3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                i3 = view3.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                i3 = 0;
            }
        }
        Drawable background = this.f8201J.getBackground();
        if (background != null) {
            background.getPadding(this.f8198G);
            Rect rect = this.f8198G;
            int i8 = rect.top;
            i4 = rect.bottom + i8;
            if (!this.f8210m) {
                this.f8208k = -i8;
            }
        } else {
            this.f8198G.setEmpty();
            i4 = 0;
        }
        int k3 = k(i(), this.f8208k, this.f8201J.getInputMethodMode() == 2);
        if (this.f8214q || this.f8205h == -1) {
            return k3 + i4;
        }
        int i9 = this.f8206i;
        if (i9 == -2) {
            int i10 = this.f8202e.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.f8198G;
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10 - (rect2.left + rect2.right), Integer.MIN_VALUE);
        } else if (i9 != -1) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
        } else {
            int i11 = this.f8202e.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.f8198G;
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11 - (rect3.left + rect3.right), 1073741824);
        }
        int d3 = this.f8204g.d(makeMeasureSpec, 0, -1, k3 - i3, -1);
        if (d3 > 0) {
            i3 += i4 + this.f8204g.getPaddingTop() + this.f8204g.getPaddingBottom();
        }
        return d3 + i3;
    }

    @Override // k.InterfaceC0525c
    public void dismiss() {
        this.f8201J.dismiss();
        o();
        this.f8201J.setContentView(null);
        this.f8204g = null;
        this.f8197F.removeCallbacks(this.f8192A);
    }

    public void e() {
        AbstractC0538D abstractC0538D = this.f8204g;
        if (abstractC0538D != null) {
            abstractC0538D.setListSelectionHidden(true);
            abstractC0538D.requestLayout();
        }
    }

    @Override // k.InterfaceC0525c
    public boolean f() {
        return this.f8201J.isShowing();
    }

    @Override // k.InterfaceC0525c
    public ListView g() {
        return this.f8204g;
    }

    public abstract AbstractC0538D h(Context context, boolean z3);

    public View i() {
        return this.f8220w;
    }

    public int j() {
        return this.f8207j;
    }

    public final int k(View view, int i3, boolean z3) {
        return c.a(this.f8201J, view, i3, z3);
    }

    public int l() {
        if (this.f8210m) {
            return this.f8208k;
        }
        return 0;
    }

    public boolean m() {
        return this.f8201J.getInputMethodMode() == 2;
    }

    public boolean n() {
        return this.f8200I;
    }

    public final void o() {
        View view = this.f8217t;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f8217t);
            }
        }
    }

    public void p(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f8219v;
        if (dataSetObserver == null) {
            this.f8219v = new f();
        } else {
            ListAdapter listAdapter2 = this.f8203f;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f8203f = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f8219v);
        }
        AbstractC0538D abstractC0538D = this.f8204g;
        if (abstractC0538D != null) {
            abstractC0538D.setAdapter(this.f8203f);
        }
    }

    public void q(View view) {
        this.f8220w = view;
    }

    public void r(int i3) {
        this.f8201J.setAnimationStyle(i3);
    }

    public void s(int i3) {
        Drawable background = this.f8201J.getBackground();
        if (background == null) {
            D(i3);
            return;
        }
        background.getPadding(this.f8198G);
        Rect rect = this.f8198G;
        this.f8206i = rect.left + rect.right + i3;
    }

    public void t(int i3) {
        this.f8213p = i3;
    }

    public void u(Rect rect) {
        this.f8199H = rect != null ? new Rect(rect) : null;
    }

    public void v(int i3) {
        this.f8207j = i3;
    }

    public void w(int i3) {
        this.f8201J.setInputMethodMode(i3);
    }

    public void x(boolean z3) {
        this.f8200I = z3;
        this.f8201J.setFocusable(z3);
    }

    public void y(PopupWindow.OnDismissListener onDismissListener) {
        this.f8201J.setOnDismissListener(onDismissListener);
    }

    public void z(AdapterView.OnItemClickListener onItemClickListener) {
        this.f8222y = onItemClickListener;
    }

    /* renamed from: l.G$b */
    public class b implements AdapterView.OnItemSelectedListener {
        public b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i3, long j3) {
            AbstractC0538D abstractC0538D;
            if (i3 == -1 || (abstractC0538D = AbstractC0541G.this.f8204g) == null) {
                return;
            }
            abstractC0538D.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    /* renamed from: l.G$g */
    public class g implements AbsListView.OnScrollListener {
        public g() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i3) {
            if (i3 != 1 || AbstractC0541G.this.m() || AbstractC0541G.this.f8201J.getContentView() == null) {
                return;
            }
            AbstractC0541G abstractC0541G = AbstractC0541G.this;
            abstractC0541G.f8197F.removeCallbacks(abstractC0541G.f8192A);
            AbstractC0541G.this.f8192A.run();
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i3, int i4, int i5) {
        }
    }
}
