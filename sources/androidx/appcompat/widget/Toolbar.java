package androidx.appcompat.widget;

import K.AbstractC0213s;
import K.AbstractC0214t;
import K.C0215u;
import K.O;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import d.AbstractC0435a;
import e.AbstractC0442a;
import f.AbstractC0467a;
import j.C0514d;
import j.InterfaceC0512b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import l.AbstractC0556W;
import l.C0546L;
import l.C0552S;
import l.C0572m;
import l.C0574o;
import l.C0579t;
import l.InterfaceC0583x;
import l.c0;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* renamed from: A, reason: collision with root package name */
    public int f3094A;

    /* renamed from: B, reason: collision with root package name */
    public CharSequence f3095B;

    /* renamed from: C, reason: collision with root package name */
    public CharSequence f3096C;

    /* renamed from: D, reason: collision with root package name */
    public ColorStateList f3097D;

    /* renamed from: E, reason: collision with root package name */
    public ColorStateList f3098E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f3099F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f3100G;

    /* renamed from: H, reason: collision with root package name */
    public final ArrayList f3101H;

    /* renamed from: I, reason: collision with root package name */
    public final ArrayList f3102I;

    /* renamed from: J, reason: collision with root package name */
    public final int[] f3103J;

    /* renamed from: K, reason: collision with root package name */
    public final C0215u f3104K;

    /* renamed from: L, reason: collision with root package name */
    public ArrayList f3105L;

    /* renamed from: M, reason: collision with root package name */
    public final ActionMenuView.e f3106M;

    /* renamed from: N, reason: collision with root package name */
    public androidx.appcompat.widget.d f3107N;

    /* renamed from: O, reason: collision with root package name */
    public androidx.appcompat.widget.a f3108O;

    /* renamed from: P, reason: collision with root package name */
    public f f3109P;

    /* renamed from: Q, reason: collision with root package name */
    public g.a f3110Q;

    /* renamed from: R, reason: collision with root package name */
    public d.a f3111R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f3112S;

    /* renamed from: T, reason: collision with root package name */
    public OnBackInvokedCallback f3113T;

    /* renamed from: U, reason: collision with root package name */
    public OnBackInvokedDispatcher f3114U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f3115V;

    /* renamed from: W, reason: collision with root package name */
    public final Runnable f3116W;

    /* renamed from: e, reason: collision with root package name */
    public ActionMenuView f3117e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f3118f;

    /* renamed from: g, reason: collision with root package name */
    public TextView f3119g;

    /* renamed from: h, reason: collision with root package name */
    public ImageButton f3120h;

    /* renamed from: i, reason: collision with root package name */
    public ImageView f3121i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f3122j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f3123k;

    /* renamed from: l, reason: collision with root package name */
    public ImageButton f3124l;

    /* renamed from: m, reason: collision with root package name */
    public View f3125m;

    /* renamed from: n, reason: collision with root package name */
    public Context f3126n;

    /* renamed from: o, reason: collision with root package name */
    public int f3127o;

    /* renamed from: p, reason: collision with root package name */
    public int f3128p;

    /* renamed from: q, reason: collision with root package name */
    public int f3129q;

    /* renamed from: r, reason: collision with root package name */
    public int f3130r;

    /* renamed from: s, reason: collision with root package name */
    public int f3131s;

    /* renamed from: t, reason: collision with root package name */
    public int f3132t;

    /* renamed from: u, reason: collision with root package name */
    public int f3133u;

    /* renamed from: v, reason: collision with root package name */
    public int f3134v;

    /* renamed from: w, reason: collision with root package name */
    public int f3135w;

    /* renamed from: x, reason: collision with root package name */
    public C0546L f3136x;

    /* renamed from: y, reason: collision with root package name */
    public int f3137y;

    /* renamed from: z, reason: collision with root package name */
    public int f3138z;

    public class a implements ActionMenuView.e {
        public a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.e
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (Toolbar.this.f3104K.b(menuItem)) {
                return true;
            }
            Toolbar.this.getClass();
            return false;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.K();
        }
    }

    public class c implements d.a {
        public c() {
        }

        @Override // androidx.appcompat.view.menu.d.a
        public boolean a(androidx.appcompat.view.menu.d dVar, MenuItem menuItem) {
            d.a aVar = Toolbar.this.f3111R;
            return aVar != null && aVar.a(dVar, menuItem);
        }

        @Override // androidx.appcompat.view.menu.d.a
        public void b(androidx.appcompat.view.menu.d dVar) {
            if (!Toolbar.this.f3117e.H()) {
                Toolbar.this.f3104K.c(dVar);
            }
            d.a aVar = Toolbar.this.f3111R;
            if (aVar != null) {
                aVar.b(dVar);
            }
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.d();
        }
    }

    public static class e {
        public static OnBackInvokedDispatcher a(View view) {
            return view.findOnBackInvokedDispatcher();
        }

        public static OnBackInvokedCallback b(final Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new OnBackInvokedCallback() { // from class: l.V
                public final void onBackInvoked() {
                    runnable.run();
                }
            };
        }

        public static void c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
        }

        public static void d(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    public class f implements androidx.appcompat.view.menu.g {

        /* renamed from: e, reason: collision with root package name */
        public androidx.appcompat.view.menu.d f3143e;

        /* renamed from: f, reason: collision with root package name */
        public androidx.appcompat.view.menu.e f3144f;

        public f() {
        }

        @Override // androidx.appcompat.view.menu.g
        public void b(androidx.appcompat.view.menu.d dVar, boolean z3) {
        }

        @Override // androidx.appcompat.view.menu.g
        public boolean c() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.g
        public void d(Context context, androidx.appcompat.view.menu.d dVar) {
            androidx.appcompat.view.menu.e eVar;
            androidx.appcompat.view.menu.d dVar2 = this.f3143e;
            if (dVar2 != null && (eVar = this.f3144f) != null) {
                dVar2.e(eVar);
            }
            this.f3143e = dVar;
        }

        @Override // androidx.appcompat.view.menu.g
        public boolean e(androidx.appcompat.view.menu.d dVar, androidx.appcompat.view.menu.e eVar) {
            KeyEvent.Callback callback = Toolbar.this.f3125m;
            if (callback instanceof InterfaceC0512b) {
                ((InterfaceC0512b) callback).e();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f3125m);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f3124l);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f3125m = null;
            toolbar3.a();
            this.f3144f = null;
            Toolbar.this.requestLayout();
            eVar.q(false);
            Toolbar.this.L();
            return true;
        }

        @Override // androidx.appcompat.view.menu.g
        public boolean h(androidx.appcompat.view.menu.d dVar, androidx.appcompat.view.menu.e eVar) {
            Toolbar.this.e();
            ViewParent parent = Toolbar.this.f3124l.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f3124l);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f3124l);
            }
            Toolbar.this.f3125m = eVar.getActionView();
            this.f3144f = eVar;
            ViewParent parent2 = Toolbar.this.f3125m.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f3125m);
                }
                g generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                generateDefaultLayoutParams.f6378a = (toolbar4.f3130r & 112) | 8388611;
                generateDefaultLayoutParams.f3146b = 2;
                toolbar4.f3125m.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f3125m);
            }
            Toolbar.this.E();
            Toolbar.this.requestLayout();
            eVar.q(true);
            KeyEvent.Callback callback = Toolbar.this.f3125m;
            if (callback instanceof InterfaceC0512b) {
                ((InterfaceC0512b) callback).b();
            }
            Toolbar.this.L();
            return true;
        }

        @Override // androidx.appcompat.view.menu.g
        public boolean j(j jVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.g
        public void k(boolean z3) {
            if (this.f3144f != null) {
                androidx.appcompat.view.menu.d dVar = this.f3143e;
                if (dVar != null) {
                    int size = dVar.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        if (this.f3143e.getItem(i3) == this.f3144f) {
                            return;
                        }
                    }
                }
                e(this.f3143e, this.f3144f);
            }
        }
    }

    public interface h {
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0435a.f6034u);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i3 = 0; i3 < menu.size(); i3++) {
            arrayList.add(menu.getItem(i3));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new C0514d(getContext());
    }

    public final int A(View view, int i3, int i4, int i5, int i6, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i7 = marginLayoutParams.leftMargin - iArr[0];
        int i8 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i7) + Math.max(0, i8);
        iArr[0] = Math.max(0, -i7);
        iArr[1] = Math.max(0, -i8);
        view.measure(ViewGroup.getChildMeasureSpec(i3, getPaddingLeft() + getPaddingRight() + max + i4, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i5, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i6, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final void B(View view, int i3, int i4, int i5, int i6, int i7) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i4, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i5, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i6, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i7 >= 0) {
            if (mode != 0) {
                i7 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i7);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final void C() {
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.f3104K.a(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f3105L = currentMenuItems2;
    }

    public final void D() {
        removeCallbacks(this.f3116W);
        post(this.f3116W);
    }

    public void E() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((g) childAt.getLayoutParams()).f3146b != 2 && childAt != this.f3117e) {
                removeViewAt(childCount);
                this.f3102I.add(childAt);
            }
        }
    }

    public void F(int i3, int i4) {
        f();
        this.f3136x.g(i3, i4);
    }

    public void G(Context context, int i3) {
        this.f3129q = i3;
        TextView textView = this.f3119g;
        if (textView != null) {
            textView.setTextAppearance(context, i3);
        }
    }

    public void H(Context context, int i3) {
        this.f3128p = i3;
        TextView textView = this.f3118f;
        if (textView != null) {
            textView.setTextAppearance(context, i3);
        }
    }

    public final boolean I() {
        if (!this.f3112S) {
            return false;
        }
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (J(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean J(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public boolean K() {
        ActionMenuView actionMenuView = this.f3117e;
        return actionMenuView != null && actionMenuView.M();
    }

    public void L() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher a3 = e.a(this);
            boolean z3 = t() && a3 != null && O.N(this) && this.f3115V;
            if (z3 && this.f3114U == null) {
                if (this.f3113T == null) {
                    this.f3113T = e.b(new Runnable() { // from class: l.T
                        @Override // java.lang.Runnable
                        public final void run() {
                            Toolbar.this.d();
                        }
                    });
                }
                e.c(a3, this.f3113T);
                this.f3114U = a3;
                return;
            }
            if (z3 || (onBackInvokedDispatcher = this.f3114U) == null) {
                return;
            }
            e.d(onBackInvokedDispatcher, this.f3113T);
            this.f3114U = null;
        }
    }

    public void a() {
        for (int size = this.f3102I.size() - 1; size >= 0; size--) {
            addView((View) this.f3102I.get(size));
        }
        this.f3102I.clear();
    }

    public final void b(List list, int i3) {
        boolean z3 = O.w(this) == 1;
        int childCount = getChildCount();
        int b3 = AbstractC0213s.b(i3, O.w(this));
        list.clear();
        if (!z3) {
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.f3146b == 0 && J(childAt) && n(gVar.f6378a) == b3) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i5 = childCount - 1; i5 >= 0; i5--) {
            View childAt2 = getChildAt(i5);
            g gVar2 = (g) childAt2.getLayoutParams();
            if (gVar2.f3146b == 0 && J(childAt2) && n(gVar2.f6378a) == b3) {
                list.add(childAt2);
            }
        }
    }

    public final void c(View view, boolean z3) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        g generateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (g) layoutParams;
        generateDefaultLayoutParams.f3146b = 1;
        if (!z3 || this.f3125m == null) {
            addView(view, generateDefaultLayoutParams);
        } else {
            view.setLayoutParams(generateDefaultLayoutParams);
            this.f3102I.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof g);
    }

    public void d() {
        f fVar = this.f3109P;
        androidx.appcompat.view.menu.e eVar = fVar == null ? null : fVar.f3144f;
        if (eVar != null) {
            eVar.collapseActionView();
        }
    }

    public void e() {
        if (this.f3124l == null) {
            C0572m c0572m = new C0572m(getContext(), null, AbstractC0435a.f6033t);
            this.f3124l = c0572m;
            c0572m.setImageDrawable(this.f3122j);
            this.f3124l.setContentDescription(this.f3123k);
            g generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f6378a = (this.f3130r & 112) | 8388611;
            generateDefaultLayoutParams.f3146b = 2;
            this.f3124l.setLayoutParams(generateDefaultLayoutParams);
            this.f3124l.setOnClickListener(new d());
        }
    }

    public final void f() {
        if (this.f3136x == null) {
            this.f3136x = new C0546L();
        }
    }

    public final void g() {
        if (this.f3121i == null) {
            this.f3121i = new C0574o(getContext());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f3124l;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f3124l;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C0546L c0546l = this.f3136x;
        if (c0546l != null) {
            return c0546l.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i3 = this.f3138z;
        return i3 != Integer.MIN_VALUE ? i3 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C0546L c0546l = this.f3136x;
        if (c0546l != null) {
            return c0546l.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        C0546L c0546l = this.f3136x;
        if (c0546l != null) {
            return c0546l.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        C0546L c0546l = this.f3136x;
        if (c0546l != null) {
            return c0546l.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i3 = this.f3137y;
        return i3 != Integer.MIN_VALUE ? i3 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.d K3;
        ActionMenuView actionMenuView = this.f3117e;
        return (actionMenuView == null || (K3 = actionMenuView.K()) == null || !K3.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f3138z, 0));
    }

    public int getCurrentContentInsetLeft() {
        return O.w(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return O.w(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f3137y, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f3121i;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f3121i;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        h();
        return this.f3117e.getMenu();
    }

    public View getNavButtonView() {
        return this.f3120h;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f3120h;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f3120h;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public androidx.appcompat.widget.a getOuterActionMenuPresenter() {
        return this.f3108O;
    }

    public Drawable getOverflowIcon() {
        h();
        return this.f3117e.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f3126n;
    }

    public int getPopupTheme() {
        return this.f3127o;
    }

    public CharSequence getSubtitle() {
        return this.f3096C;
    }

    public final TextView getSubtitleTextView() {
        return this.f3119g;
    }

    public CharSequence getTitle() {
        return this.f3095B;
    }

    public int getTitleMarginBottom() {
        return this.f3135w;
    }

    public int getTitleMarginEnd() {
        return this.f3133u;
    }

    public int getTitleMarginStart() {
        return this.f3132t;
    }

    public int getTitleMarginTop() {
        return this.f3134v;
    }

    public final TextView getTitleTextView() {
        return this.f3118f;
    }

    public InterfaceC0583x getWrapper() {
        if (this.f3107N == null) {
            this.f3107N = new androidx.appcompat.widget.d(this, true);
        }
        return this.f3107N;
    }

    public final void h() {
        i();
        if (this.f3117e.K() == null) {
            androidx.appcompat.view.menu.d dVar = (androidx.appcompat.view.menu.d) this.f3117e.getMenu();
            if (this.f3109P == null) {
                this.f3109P = new f();
            }
            this.f3117e.setExpandedActionViewsExclusive(true);
            dVar.b(this.f3109P, this.f3126n);
            L();
        }
    }

    public final void i() {
        if (this.f3117e == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f3117e = actionMenuView;
            actionMenuView.setPopupTheme(this.f3127o);
            this.f3117e.setOnMenuItemClickListener(this.f3106M);
            this.f3117e.L(this.f3110Q, new c());
            g generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f6378a = (this.f3130r & 112) | 8388613;
            this.f3117e.setLayoutParams(generateDefaultLayoutParams);
            c(this.f3117e, false);
        }
    }

    public final void j() {
        if (this.f3120h == null) {
            this.f3120h = new C0572m(getContext(), null, AbstractC0435a.f6033t);
            g generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f6378a = (this.f3130r & 112) | 8388611;
            this.f3120h.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public g generateDefaultLayoutParams() {
        return new g(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public g generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public g generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof g ? new g((g) layoutParams) : layoutParams instanceof AbstractC0442a ? new g((AbstractC0442a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new g((ViewGroup.MarginLayoutParams) layoutParams) : new g(layoutParams);
    }

    public final int n(int i3) {
        int w3 = O.w(this);
        int b3 = AbstractC0213s.b(i3, w3) & 7;
        return (b3 == 1 || b3 == 3 || b3 == 5) ? b3 : w3 == 1 ? 5 : 3;
    }

    public final int o(View view, int i3) {
        g gVar = (g) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i3 > 0 ? (measuredHeight - i3) / 2 : 0;
        int p3 = p(gVar.f6378a);
        if (p3 == 48) {
            return getPaddingTop() - i4;
        }
        if (p3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin) - i4;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i5 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i6 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
        if (i5 < i6) {
            i5 = i6;
        } else {
            int i7 = (((height - paddingBottom) - measuredHeight) - i5) - paddingTop;
            int i8 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
            if (i7 < i8) {
                i5 = Math.max(0, i5 - (i8 - i7));
            }
        }
        return paddingTop + i5;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        L();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f3116W);
        L();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f3100G = false;
        }
        if (!this.f3100G) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f3100G = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f3100G = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0298 A[LOOP:0: B:40:0x0296->B:41:0x0298, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02b6 A[LOOP:1: B:44:0x02b4->B:45:0x02b6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02ed A[LOOP:2: B:53:0x02eb->B:54:0x02ed, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x021e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 770
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void onMeasure(int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int[] iArr;
        int i9;
        int i10;
        int i11;
        int[] iArr2 = this.f3103J;
        boolean a3 = c0.a(this);
        int i12 = !a3 ? 1 : 0;
        if (J(this.f3120h)) {
            B(this.f3120h, i3, 0, i4, 0, this.f3131s);
            i5 = this.f3120h.getMeasuredWidth() + q(this.f3120h);
            i6 = Math.max(0, this.f3120h.getMeasuredHeight() + r(this.f3120h));
            i7 = View.combineMeasuredStates(0, this.f3120h.getMeasuredState());
        } else {
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (J(this.f3124l)) {
            B(this.f3124l, i3, 0, i4, 0, this.f3131s);
            i5 = this.f3124l.getMeasuredWidth() + q(this.f3124l);
            i6 = Math.max(i6, this.f3124l.getMeasuredHeight() + r(this.f3124l));
            i7 = View.combineMeasuredStates(i7, this.f3124l.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i5);
        iArr2[a3 ? 1 : 0] = Math.max(0, currentContentInsetStart - i5);
        if (J(this.f3117e)) {
            B(this.f3117e, i3, max, i4, 0, this.f3131s);
            i8 = this.f3117e.getMeasuredWidth() + q(this.f3117e);
            i6 = Math.max(i6, this.f3117e.getMeasuredHeight() + r(this.f3117e));
            i7 = View.combineMeasuredStates(i7, this.f3117e.getMeasuredState());
        } else {
            i8 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i8);
        iArr2[i12] = Math.max(0, currentContentInsetEnd - i8);
        if (J(this.f3125m)) {
            iArr = iArr2;
            max2 += A(this.f3125m, i3, max2, i4, 0, iArr);
            i6 = Math.max(i6, this.f3125m.getMeasuredHeight() + r(this.f3125m));
            i7 = View.combineMeasuredStates(i7, this.f3125m.getMeasuredState());
        } else {
            iArr = iArr2;
        }
        if (J(this.f3121i)) {
            max2 += A(this.f3121i, i3, max2, i4, 0, iArr);
            i6 = Math.max(i6, this.f3121i.getMeasuredHeight() + r(this.f3121i));
            i7 = View.combineMeasuredStates(i7, this.f3121i.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (((g) childAt.getLayoutParams()).f3146b == 0 && J(childAt)) {
                max2 += A(childAt, i3, max2, i4, 0, iArr);
                int max3 = Math.max(i6, childAt.getMeasuredHeight() + r(childAt));
                i7 = View.combineMeasuredStates(i7, childAt.getMeasuredState());
                i6 = max3;
            } else {
                max2 = max2;
            }
        }
        int i14 = max2;
        int i15 = this.f3134v + this.f3135w;
        int i16 = this.f3132t + this.f3133u;
        if (J(this.f3118f)) {
            A(this.f3118f, i3, i14 + i16, i4, i15, iArr);
            int measuredWidth = this.f3118f.getMeasuredWidth() + q(this.f3118f);
            int measuredHeight = this.f3118f.getMeasuredHeight() + r(this.f3118f);
            i9 = measuredWidth;
            i10 = View.combineMeasuredStates(i7, this.f3118f.getMeasuredState());
            i11 = measuredHeight;
        } else {
            i9 = 0;
            i10 = i7;
            i11 = 0;
        }
        if (J(this.f3119g)) {
            i9 = Math.max(i9, A(this.f3119g, i3, i14 + i16, i4, i15 + i11, iArr));
            i11 += this.f3119g.getMeasuredHeight() + r(this.f3119g);
            i10 = View.combineMeasuredStates(i10, this.f3119g.getMeasuredState());
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i14 + i9 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i3, (-16777216) & i10), I() ? 0 : View.resolveSizeAndState(Math.max(Math.max(i6, i11) + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i4, i10 << 16));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.a());
        ActionMenuView actionMenuView = this.f3117e;
        androidx.appcompat.view.menu.d K3 = actionMenuView != null ? actionMenuView.K() : null;
        int i3 = iVar.f3147g;
        if (i3 != 0 && this.f3109P != null && K3 != null && (findItem = K3.findItem(i3)) != null) {
            findItem.expandActionView();
        }
        if (iVar.f3148h) {
            D();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i3) {
        super.onRtlPropertiesChanged(i3);
        f();
        this.f3136x.f(i3 == 1);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.e eVar;
        i iVar = new i(super.onSaveInstanceState());
        f fVar = this.f3109P;
        if (fVar != null && (eVar = fVar.f3144f) != null) {
            iVar.f3147g = eVar.getItemId();
        }
        iVar.f3148h = x();
        return iVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f3099F = false;
        }
        if (!this.f3099F) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f3099F = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f3099F = false;
        }
        return true;
    }

    public final int p(int i3) {
        int i4 = i3 & 112;
        return (i4 == 16 || i4 == 48 || i4 == 80) ? i4 : this.f3094A & 112;
    }

    public final int q(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return AbstractC0214t.b(marginLayoutParams) + AbstractC0214t.a(marginLayoutParams);
    }

    public final int r(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final int s(List list, int[] iArr) {
        int i3 = iArr[0];
        int i4 = iArr[1];
        int size = list.size();
        int i5 = 0;
        int i6 = 0;
        while (i5 < size) {
            View view = (View) list.get(i5);
            g gVar = (g) view.getLayoutParams();
            int i7 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - i3;
            int i8 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - i4;
            int max = Math.max(0, i7);
            int max2 = Math.max(0, i8);
            int max3 = Math.max(0, -i7);
            int max4 = Math.max(0, -i8);
            i6 += max + view.getMeasuredWidth() + max2;
            i5++;
            i4 = max4;
            i3 = max3;
        }
        return i6;
    }

    public void setBackInvokedCallbackEnabled(boolean z3) {
        if (this.f3115V != z3) {
            this.f3115V = z3;
            L();
        }
    }

    public void setCollapseContentDescription(int i3) {
        setCollapseContentDescription(i3 != 0 ? getContext().getText(i3) : null);
    }

    public void setCollapseIcon(int i3) {
        setCollapseIcon(AbstractC0467a.b(getContext(), i3));
    }

    public void setCollapsible(boolean z3) {
        this.f3112S = z3;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i3) {
        if (i3 < 0) {
            i3 = Integer.MIN_VALUE;
        }
        if (i3 != this.f3138z) {
            this.f3138z = i3;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i3) {
        if (i3 < 0) {
            i3 = Integer.MIN_VALUE;
        }
        if (i3 != this.f3137y) {
            this.f3137y = i3;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i3) {
        setLogo(AbstractC0467a.b(getContext(), i3));
    }

    public void setLogoDescription(int i3) {
        setLogoDescription(getContext().getText(i3));
    }

    public void setNavigationContentDescription(int i3) {
        setNavigationContentDescription(i3 != 0 ? getContext().getText(i3) : null);
    }

    public void setNavigationIcon(int i3) {
        setNavigationIcon(AbstractC0467a.b(getContext(), i3));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        j();
        this.f3120h.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(h hVar) {
    }

    public void setOverflowIcon(Drawable drawable) {
        h();
        this.f3117e.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i3) {
        if (this.f3127o != i3) {
            this.f3127o = i3;
            if (i3 == 0) {
                this.f3126n = getContext();
            } else {
                this.f3126n = new ContextThemeWrapper(getContext(), i3);
            }
        }
    }

    public void setSubtitle(int i3) {
        setSubtitle(getContext().getText(i3));
    }

    public void setSubtitleTextColor(int i3) {
        setSubtitleTextColor(ColorStateList.valueOf(i3));
    }

    public void setTitle(int i3) {
        setTitle(getContext().getText(i3));
    }

    public void setTitleMarginBottom(int i3) {
        this.f3135w = i3;
        requestLayout();
    }

    public void setTitleMarginEnd(int i3) {
        this.f3133u = i3;
        requestLayout();
    }

    public void setTitleMarginStart(int i3) {
        this.f3132t = i3;
        requestLayout();
    }

    public void setTitleMarginTop(int i3) {
        this.f3134v = i3;
        requestLayout();
    }

    public void setTitleTextColor(int i3) {
        setTitleTextColor(ColorStateList.valueOf(i3));
    }

    public boolean t() {
        f fVar = this.f3109P;
        return (fVar == null || fVar.f3144f == null) ? false : true;
    }

    public void u(int i3) {
        getMenuInflater().inflate(i3, getMenu());
    }

    public void v() {
        Iterator it = this.f3105L.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        C();
    }

    public final boolean w(View view) {
        return view.getParent() == this || this.f3102I.contains(view);
    }

    public boolean x() {
        ActionMenuView actionMenuView = this.f3117e;
        return actionMenuView != null && actionMenuView.H();
    }

    public final int y(View view, int i3, int[] iArr, int i4) {
        g gVar = (g) view.getLayoutParams();
        int i5 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - iArr[0];
        int max = i3 + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        int o3 = o(view, i4);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, o3, max + measuredWidth, view.getMeasuredHeight() + o3);
        return max + measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).rightMargin;
    }

    public final int z(View view, int i3, int[] iArr, int i4) {
        g gVar = (g) view.getLayoutParams();
        int i5 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - iArr[1];
        int max = i3 - Math.max(0, i5);
        iArr[1] = Math.max(0, -i5);
        int o3 = o(view, i4);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, o3, max, view.getMeasuredHeight() + o3);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).leftMargin);
    }

    public static class g extends AbstractC0442a {

        /* renamed from: b, reason: collision with root package name */
        public int f3146b;

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3146b = 0;
        }

        public void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public g(int i3, int i4) {
            super(i3, i4);
            this.f3146b = 0;
            this.f6378a = 8388627;
        }

        public g(g gVar) {
            super((AbstractC0442a) gVar);
            this.f3146b = 0;
            this.f3146b = gVar.f3146b;
        }

        public g(AbstractC0442a abstractC0442a) {
            super(abstractC0442a);
            this.f3146b = 0;
        }

        public g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f3146b = 0;
            a(marginLayoutParams);
        }

        public g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3146b = 0;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        this.f3094A = 8388627;
        this.f3101H = new ArrayList();
        this.f3102I = new ArrayList();
        this.f3103J = new int[2];
        this.f3104K = new C0215u(new Runnable() { // from class: l.U
            @Override // java.lang.Runnable
            public final void run() {
                Toolbar.this.v();
            }
        });
        this.f3105L = new ArrayList();
        this.f3106M = new a();
        this.f3116W = new b();
        Context context2 = getContext();
        int[] iArr = d.i.f6334t2;
        C0552S t3 = C0552S.t(context2, attributeSet, iArr, i3, 0);
        O.h0(this, context, iArr, attributeSet, t3.p(), i3, 0);
        this.f3128p = t3.m(d.i.V2, 0);
        this.f3129q = t3.m(d.i.f6207M2, 0);
        this.f3094A = t3.k(d.i.f6338u2, this.f3094A);
        this.f3130r = t3.k(d.i.f6342v2, 48);
        int e3 = t3.e(d.i.f6219P2, 0);
        int i4 = d.i.f6239U2;
        e3 = t3.q(i4) ? t3.e(i4, e3) : e3;
        this.f3135w = e3;
        this.f3134v = e3;
        this.f3133u = e3;
        this.f3132t = e3;
        int e4 = t3.e(d.i.f6231S2, -1);
        if (e4 >= 0) {
            this.f3132t = e4;
        }
        int e5 = t3.e(d.i.f6227R2, -1);
        if (e5 >= 0) {
            this.f3133u = e5;
        }
        int e6 = t3.e(d.i.f6235T2, -1);
        if (e6 >= 0) {
            this.f3134v = e6;
        }
        int e7 = t3.e(d.i.f6223Q2, -1);
        if (e7 >= 0) {
            this.f3135w = e7;
        }
        this.f3131s = t3.f(d.i.f6183G2, -1);
        int e8 = t3.e(d.i.f6167C2, Integer.MIN_VALUE);
        int e9 = t3.e(d.i.f6354y2, Integer.MIN_VALUE);
        int f3 = t3.f(d.i.f6159A2, 0);
        int f4 = t3.f(d.i.f6163B2, 0);
        f();
        this.f3136x.e(f3, f4);
        if (e8 != Integer.MIN_VALUE || e9 != Integer.MIN_VALUE) {
            this.f3136x.g(e8, e9);
        }
        this.f3137y = t3.e(d.i.f6171D2, Integer.MIN_VALUE);
        this.f3138z = t3.e(d.i.f6358z2, Integer.MIN_VALUE);
        this.f3122j = t3.g(d.i.f6350x2);
        this.f3123k = t3.o(d.i.f6346w2);
        CharSequence o3 = t3.o(d.i.f6215O2);
        if (!TextUtils.isEmpty(o3)) {
            setTitle(o3);
        }
        CharSequence o4 = t3.o(d.i.f6203L2);
        if (!TextUtils.isEmpty(o4)) {
            setSubtitle(o4);
        }
        this.f3126n = getContext();
        setPopupTheme(t3.m(d.i.f6199K2, 0));
        Drawable g3 = t3.g(d.i.f6195J2);
        if (g3 != null) {
            setNavigationIcon(g3);
        }
        CharSequence o5 = t3.o(d.i.f6191I2);
        if (!TextUtils.isEmpty(o5)) {
            setNavigationContentDescription(o5);
        }
        Drawable g4 = t3.g(d.i.f6175E2);
        if (g4 != null) {
            setLogo(g4);
        }
        CharSequence o6 = t3.o(d.i.f6179F2);
        if (!TextUtils.isEmpty(o6)) {
            setLogoDescription(o6);
        }
        int i5 = d.i.W2;
        if (t3.q(i5)) {
            setTitleTextColor(t3.c(i5));
        }
        int i6 = d.i.f6211N2;
        if (t3.q(i6)) {
            setSubtitleTextColor(t3.c(i6));
        }
        int i7 = d.i.f6187H2;
        if (t3.q(i7)) {
            u(t3.m(i7, 0));
        }
        t3.u();
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            e();
        }
        ImageButton imageButton = this.f3124l;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            e();
            this.f3124l.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.f3124l;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.f3122j);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!w(this.f3121i)) {
                c(this.f3121i, true);
            }
        } else {
            ImageView imageView = this.f3121i;
            if (imageView != null && w(imageView)) {
                removeView(this.f3121i);
                this.f3102I.remove(this.f3121i);
            }
        }
        ImageView imageView2 = this.f3121i;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageView imageView = this.f3121i;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            j();
        }
        ImageButton imageButton = this.f3120h;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            AbstractC0556W.a(this.f3120h, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            j();
            if (!w(this.f3120h)) {
                c(this.f3120h, true);
            }
        } else {
            ImageButton imageButton = this.f3120h;
            if (imageButton != null && w(imageButton)) {
                removeView(this.f3120h);
                this.f3102I.remove(this.f3120h);
            }
        }
        ImageButton imageButton2 = this.f3120h;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f3119g;
            if (textView != null && w(textView)) {
                removeView(this.f3119g);
                this.f3102I.remove(this.f3119g);
            }
        } else {
            if (this.f3119g == null) {
                Context context = getContext();
                C0579t c0579t = new C0579t(context);
                this.f3119g = c0579t;
                c0579t.setSingleLine();
                this.f3119g.setEllipsize(TextUtils.TruncateAt.END);
                int i3 = this.f3129q;
                if (i3 != 0) {
                    this.f3119g.setTextAppearance(context, i3);
                }
                ColorStateList colorStateList = this.f3098E;
                if (colorStateList != null) {
                    this.f3119g.setTextColor(colorStateList);
                }
            }
            if (!w(this.f3119g)) {
                c(this.f3119g, true);
            }
        }
        TextView textView2 = this.f3119g;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f3096C = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f3098E = colorStateList;
        TextView textView = this.f3119g;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f3118f;
            if (textView != null && w(textView)) {
                removeView(this.f3118f);
                this.f3102I.remove(this.f3118f);
            }
        } else {
            if (this.f3118f == null) {
                Context context = getContext();
                C0579t c0579t = new C0579t(context);
                this.f3118f = c0579t;
                c0579t.setSingleLine();
                this.f3118f.setEllipsize(TextUtils.TruncateAt.END);
                int i3 = this.f3128p;
                if (i3 != 0) {
                    this.f3118f.setTextAppearance(context, i3);
                }
                ColorStateList colorStateList = this.f3097D;
                if (colorStateList != null) {
                    this.f3118f.setTextColor(colorStateList);
                }
            }
            if (!w(this.f3118f)) {
                c(this.f3118f, true);
            }
        }
        TextView textView2 = this.f3118f;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f3095B = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f3097D = colorStateList;
        TextView textView = this.f3118f;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public static class i extends S.a {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* renamed from: g, reason: collision with root package name */
        public int f3147g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f3148h;

        public class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public i createFromParcel(Parcel parcel) {
                return new i(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public i createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new i(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public i[] newArray(int i3) {
                return new i[i3];
            }
        }

        public i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3147g = parcel.readInt();
            this.f3148h = parcel.readInt() != 0;
        }

        @Override // S.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i3) {
            super.writeToParcel(parcel, i3);
            parcel.writeInt(this.f3147g);
            parcel.writeInt(this.f3148h ? 1 : 0);
        }

        public i(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
