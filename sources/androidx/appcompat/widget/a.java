package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionMenuView;
import d.AbstractC0435a;
import j.C0511a;
import java.util.ArrayList;
import k.InterfaceC0525c;
import l.AbstractC0556W;
import l.AbstractViewOnTouchListenerC0540F;
import l.C0574o;

/* loaded from: classes.dex */
public class a extends androidx.appcompat.view.menu.a {

    /* renamed from: A, reason: collision with root package name */
    public final SparseBooleanArray f3153A;

    /* renamed from: B, reason: collision with root package name */
    public e f3154B;

    /* renamed from: C, reason: collision with root package name */
    public C0077a f3155C;

    /* renamed from: D, reason: collision with root package name */
    public c f3156D;

    /* renamed from: E, reason: collision with root package name */
    public b f3157E;

    /* renamed from: F, reason: collision with root package name */
    public final f f3158F;

    /* renamed from: G, reason: collision with root package name */
    public int f3159G;

    /* renamed from: n, reason: collision with root package name */
    public d f3160n;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f3161o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f3162p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3163q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3164r;

    /* renamed from: s, reason: collision with root package name */
    public int f3165s;

    /* renamed from: t, reason: collision with root package name */
    public int f3166t;

    /* renamed from: u, reason: collision with root package name */
    public int f3167u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f3168v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f3169w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f3170x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f3171y;

    /* renamed from: z, reason: collision with root package name */
    public int f3172z;

    /* renamed from: androidx.appcompat.widget.a$a, reason: collision with other inner class name */
    public class C0077a extends androidx.appcompat.view.menu.f {
        public C0077a(Context context, j jVar, View view) {
            super(context, jVar, view, false, AbstractC0435a.f6019f);
            if (!((androidx.appcompat.view.menu.e) jVar.getItem()).k()) {
                View view2 = a.this.f3160n;
                f(view2 == null ? (View) a.this.f2750m : view2);
            }
            j(a.this.f3158F);
        }

        @Override // androidx.appcompat.view.menu.f
        public void e() {
            a aVar = a.this;
            aVar.f3155C = null;
            aVar.f3159G = 0;
            super.e();
        }
    }

    public class b extends ActionMenuItemView.b {
        public b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public InterfaceC0525c a() {
            C0077a c0077a = a.this.f3155C;
            if (c0077a != null) {
                return c0077a.c();
            }
            return null;
        }
    }

    public class c implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        public e f3175e;

        public c(e eVar) {
            this.f3175e = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f2744g != null) {
                a.this.f2744g.c();
            }
            View view = (View) a.this.f2750m;
            if (view != null && view.getWindowToken() != null && this.f3175e.m()) {
                a.this.f3154B = this.f3175e;
            }
            a.this.f3156D = null;
        }
    }

    public class d extends C0574o implements ActionMenuView.a {

        /* renamed from: androidx.appcompat.widget.a$d$a, reason: collision with other inner class name */
        public class C0078a extends AbstractViewOnTouchListenerC0540F {

            /* renamed from: n, reason: collision with root package name */
            public final /* synthetic */ a f3178n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0078a(View view, a aVar) {
                super(view);
                this.f3178n = aVar;
            }

            @Override // l.AbstractViewOnTouchListenerC0540F
            public InterfaceC0525c b() {
                e eVar = a.this.f3154B;
                if (eVar == null) {
                    return null;
                }
                return eVar.c();
            }

            @Override // l.AbstractViewOnTouchListenerC0540F
            public boolean c() {
                a.this.H();
                return true;
            }

            @Override // l.AbstractViewOnTouchListenerC0540F
            public boolean d() {
                a aVar = a.this;
                if (aVar.f3156D != null) {
                    return false;
                }
                aVar.z();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, AbstractC0435a.f6018e);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            AbstractC0556W.a(this, getContentDescription());
            setOnTouchListener(new C0078a(this, a.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            a.this.H();
            return true;
        }

        @Override // android.widget.ImageView
        public boolean setFrame(int i3, int i4, int i5, int i6) {
            boolean frame = super.setFrame(i3, i4, i5, i6);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                D.a.f(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    public class e extends androidx.appcompat.view.menu.f {
        public e(Context context, androidx.appcompat.view.menu.d dVar, View view, boolean z3) {
            super(context, dVar, view, z3, AbstractC0435a.f6019f);
            h(8388613);
            j(a.this.f3158F);
        }

        @Override // androidx.appcompat.view.menu.f
        public void e() {
            if (a.this.f2744g != null) {
                a.this.f2744g.close();
            }
            a.this.f3154B = null;
            super.e();
        }
    }

    public class f implements g.a {
        public f() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(androidx.appcompat.view.menu.d dVar, boolean z3) {
            if (dVar instanceof j) {
                dVar.z().d(false);
            }
            g.a m3 = a.this.m();
            if (m3 != null) {
                m3.b(dVar, z3);
            }
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean c(androidx.appcompat.view.menu.d dVar) {
            if (dVar == a.this.f2744g) {
                return false;
            }
            a.this.f3159G = ((j) dVar).getItem().getItemId();
            g.a m3 = a.this.m();
            if (m3 != null) {
                return m3.c(dVar);
            }
            return false;
        }
    }

    public a(Context context) {
        super(context, d.f.f6129c, d.f.f6128b);
        this.f3153A = new SparseBooleanArray();
        this.f3158F = new f();
    }

    public boolean A() {
        C0077a c0077a = this.f3155C;
        if (c0077a == null) {
            return false;
        }
        c0077a.b();
        return true;
    }

    public boolean B() {
        e eVar = this.f3154B;
        return eVar != null && eVar.d();
    }

    public void C(Configuration configuration) {
        if (!this.f3168v) {
            this.f3167u = C0511a.a(this.f2743f).c();
        }
        androidx.appcompat.view.menu.d dVar = this.f2744g;
        if (dVar != null) {
            dVar.G(true);
        }
    }

    public void D(boolean z3) {
        this.f3171y = z3;
    }

    public void E(ActionMenuView actionMenuView) {
        this.f2750m = actionMenuView;
        actionMenuView.G(this.f2744g);
    }

    public void F(Drawable drawable) {
        d dVar = this.f3160n;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            this.f3162p = true;
            this.f3161o = drawable;
        }
    }

    public void G(boolean z3) {
        this.f3163q = z3;
        this.f3164r = true;
    }

    public boolean H() {
        androidx.appcompat.view.menu.d dVar;
        if (!this.f3163q || B() || (dVar = this.f2744g) == null || this.f2750m == null || this.f3156D != null || dVar.v().isEmpty()) {
            return false;
        }
        c cVar = new c(new e(this.f2743f, this.f2744g, this.f3160n, true));
        this.f3156D = cVar;
        ((View) this.f2750m).post(cVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.g
    public void b(androidx.appcompat.view.menu.d dVar, boolean z3) {
        w();
        super.b(dVar, z3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    @Override // androidx.appcompat.view.menu.g
    public boolean c() {
        ArrayList arrayList;
        int i3;
        int i4;
        int i5;
        boolean z3;
        int i6;
        a aVar = this;
        androidx.appcompat.view.menu.d dVar = aVar.f2744g;
        View view = null;
        ?? r3 = 0;
        if (dVar != null) {
            arrayList = dVar.A();
            i3 = arrayList.size();
        } else {
            arrayList = null;
            i3 = 0;
        }
        int i7 = aVar.f3167u;
        int i8 = aVar.f3166t;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) aVar.f2750m;
        boolean z4 = false;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < i3; i11++) {
            androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) arrayList.get(i11);
            if (eVar.n()) {
                i9++;
            } else if (eVar.m()) {
                i10++;
            } else {
                z4 = true;
            }
            if (aVar.f3171y && eVar.isActionViewExpanded()) {
                i7 = 0;
            }
        }
        if (aVar.f3163q && (z4 || i10 + i9 > i7)) {
            i7--;
        }
        int i12 = i7 - i9;
        SparseBooleanArray sparseBooleanArray = aVar.f3153A;
        sparseBooleanArray.clear();
        if (aVar.f3169w) {
            int i13 = aVar.f3172z;
            i5 = i8 / i13;
            i4 = i13 + ((i8 % i13) / i5);
        } else {
            i4 = 0;
            i5 = 0;
        }
        int i14 = 0;
        int i15 = 0;
        while (i14 < i3) {
            androidx.appcompat.view.menu.e eVar2 = (androidx.appcompat.view.menu.e) arrayList.get(i14);
            if (eVar2.n()) {
                View n3 = aVar.n(eVar2, view, viewGroup);
                if (aVar.f3169w) {
                    i5 -= ActionMenuView.I(n3, i4, i5, makeMeasureSpec, r3);
                } else {
                    n3.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = n3.getMeasuredWidth();
                i8 -= measuredWidth;
                if (i15 == 0) {
                    i15 = measuredWidth;
                }
                int groupId = eVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                eVar2.t(true);
                z3 = r3;
                i6 = i3;
            } else if (eVar2.m()) {
                int groupId2 = eVar2.getGroupId();
                boolean z5 = sparseBooleanArray.get(groupId2);
                boolean z6 = (i12 > 0 || z5) && i8 > 0 && (!aVar.f3169w || i5 > 0);
                boolean z7 = z6;
                i6 = i3;
                if (z6) {
                    View n4 = aVar.n(eVar2, null, viewGroup);
                    if (aVar.f3169w) {
                        int I3 = ActionMenuView.I(n4, i4, i5, makeMeasureSpec, 0);
                        i5 -= I3;
                        if (I3 == 0) {
                            z7 = false;
                        }
                    } else {
                        n4.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z8 = z7;
                    int measuredWidth2 = n4.getMeasuredWidth();
                    i8 -= measuredWidth2;
                    if (i15 == 0) {
                        i15 = measuredWidth2;
                    }
                    z6 = z8 & (!aVar.f3169w ? i8 + i15 <= 0 : i8 < 0);
                }
                if (z6 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z5) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i16 = 0; i16 < i14; i16++) {
                        androidx.appcompat.view.menu.e eVar3 = (androidx.appcompat.view.menu.e) arrayList.get(i16);
                        if (eVar3.getGroupId() == groupId2) {
                            if (eVar3.k()) {
                                i12++;
                            }
                            eVar3.t(false);
                        }
                    }
                }
                if (z6) {
                    i12--;
                }
                eVar2.t(z6);
                z3 = false;
            } else {
                z3 = r3;
                i6 = i3;
                eVar2.t(z3);
            }
            i14++;
            r3 = z3;
            i3 = i6;
            view = null;
            aVar = this;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.g
    public void d(Context context, androidx.appcompat.view.menu.d dVar) {
        super.d(context, dVar);
        Resources resources = context.getResources();
        C0511a a3 = C0511a.a(context);
        if (!this.f3164r) {
            this.f3163q = a3.d();
        }
        if (!this.f3170x) {
            this.f3165s = a3.b();
        }
        if (!this.f3168v) {
            this.f3167u = a3.c();
        }
        int i3 = this.f3165s;
        if (this.f3163q) {
            if (this.f3160n == null) {
                d dVar2 = new d(this.f2742e);
                this.f3160n = dVar2;
                if (this.f3162p) {
                    dVar2.setImageDrawable(this.f3161o);
                    this.f3161o = null;
                    this.f3162p = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f3160n.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i3 -= this.f3160n.getMeasuredWidth();
        } else {
            this.f3160n = null;
        }
        this.f3166t = i3;
        this.f3172z = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.a
    public void f(androidx.appcompat.view.menu.e eVar, h.a aVar) {
        aVar.d(eVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f2750m);
        if (this.f3157E == null) {
            this.f3157E = new b();
        }
        actionMenuItemView.setPopupCallback(this.f3157E);
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.g
    public boolean j(j jVar) {
        boolean z3 = false;
        if (!jVar.hasVisibleItems()) {
            return false;
        }
        j jVar2 = jVar;
        while (jVar2.W() != this.f2744g) {
            jVar2 = (j) jVar2.W();
        }
        View x3 = x(jVar2.getItem());
        if (x3 == null) {
            return false;
        }
        this.f3159G = jVar.getItem().getItemId();
        int size = jVar.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            MenuItem item = jVar.getItem(i3);
            if (item.isVisible() && item.getIcon() != null) {
                z3 = true;
                break;
            }
            i3++;
        }
        C0077a c0077a = new C0077a(this.f2743f, jVar, x3);
        this.f3155C = c0077a;
        c0077a.g(z3);
        this.f3155C.k();
        super.j(jVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.g
    public void k(boolean z3) {
        super.k(z3);
        ((View) this.f2750m).requestLayout();
        androidx.appcompat.view.menu.d dVar = this.f2744g;
        boolean z4 = false;
        if (dVar != null) {
            ArrayList r3 = dVar.r();
            int size = r3.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((androidx.appcompat.view.menu.e) r3.get(i3)).g();
            }
        }
        androidx.appcompat.view.menu.d dVar2 = this.f2744g;
        ArrayList v3 = dVar2 != null ? dVar2.v() : null;
        if (this.f3163q && v3 != null) {
            int size2 = v3.size();
            if (size2 == 1) {
                z4 = !((androidx.appcompat.view.menu.e) v3.get(0)).isActionViewExpanded();
            } else if (size2 > 0) {
                z4 = true;
            }
        }
        if (z4) {
            if (this.f3160n == null) {
                this.f3160n = new d(this.f2742e);
            }
            ViewGroup viewGroup = (ViewGroup) this.f3160n.getParent();
            if (viewGroup != this.f2750m) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f3160n);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f2750m;
                actionMenuView.addView(this.f3160n, actionMenuView.E());
            }
        } else {
            d dVar3 = this.f3160n;
            if (dVar3 != null) {
                Object parent = dVar3.getParent();
                Object obj = this.f2750m;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f3160n);
                }
            }
        }
        ((ActionMenuView) this.f2750m).setOverflowReserved(this.f3163q);
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean l(ViewGroup viewGroup, int i3) {
        if (viewGroup.getChildAt(i3) == this.f3160n) {
            return false;
        }
        return super.l(viewGroup, i3);
    }

    @Override // androidx.appcompat.view.menu.a
    public View n(androidx.appcompat.view.menu.e eVar, View view, ViewGroup viewGroup) {
        View actionView = eVar.getActionView();
        if (actionView == null || eVar.i()) {
            actionView = super.n(eVar, view, viewGroup);
        }
        actionView.setVisibility(eVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean o(int i3, androidx.appcompat.view.menu.e eVar) {
        return eVar.k();
    }

    public boolean w() {
        return z() | A();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View x(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f2750m;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = viewGroup.getChildAt(i3);
            if ((childAt instanceof h.a) && ((h.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public Drawable y() {
        d dVar = this.f3160n;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f3162p) {
            return this.f3161o;
        }
        return null;
    }

    public boolean z() {
        Object obj;
        c cVar = this.f3156D;
        if (cVar != null && (obj = this.f2750m) != null) {
            ((View) obj).removeCallbacks(cVar);
            this.f3156D = null;
            return true;
        }
        e eVar = this.f3154B;
        if (eVar == null) {
            return false;
        }
        eVar.b();
        return true;
    }
}
