package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.widget.b;
import l.c0;

/* loaded from: classes.dex */
public class ActionMenuView extends androidx.appcompat.widget.b implements d.b, h {

    /* renamed from: A, reason: collision with root package name */
    public boolean f2944A;

    /* renamed from: B, reason: collision with root package name */
    public int f2945B;

    /* renamed from: C, reason: collision with root package name */
    public int f2946C;

    /* renamed from: D, reason: collision with root package name */
    public int f2947D;

    /* renamed from: E, reason: collision with root package name */
    public e f2948E;

    /* renamed from: t, reason: collision with root package name */
    public androidx.appcompat.view.menu.d f2949t;

    /* renamed from: u, reason: collision with root package name */
    public Context f2950u;

    /* renamed from: v, reason: collision with root package name */
    public int f2951v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2952w;

    /* renamed from: x, reason: collision with root package name */
    public androidx.appcompat.widget.a f2953x;

    /* renamed from: y, reason: collision with root package name */
    public g.a f2954y;

    /* renamed from: z, reason: collision with root package name */
    public d.a f2955z;

    public interface a {
        boolean a();

        boolean b();
    }

    public static class b implements g.a {
        @Override // androidx.appcompat.view.menu.g.a
        public void b(androidx.appcompat.view.menu.d dVar, boolean z3) {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean c(androidx.appcompat.view.menu.d dVar) {
            return false;
        }
    }

    public static class c extends b.a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f2956a;

        /* renamed from: b, reason: collision with root package name */
        public int f2957b;

        /* renamed from: c, reason: collision with root package name */
        public int f2958c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f2959d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f2960e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f2961f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super(cVar);
            this.f2956a = cVar.f2956a;
        }

        public c(int i3, int i4) {
            super(i3, i4);
            this.f2956a = false;
        }
    }

    public class d implements d.a {
        public d() {
        }

        @Override // androidx.appcompat.view.menu.d.a
        public boolean a(androidx.appcompat.view.menu.d dVar, MenuItem menuItem) {
            e eVar = ActionMenuView.this.f2948E;
            return eVar != null && eVar.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.d.a
        public void b(androidx.appcompat.view.menu.d dVar) {
            d.a aVar = ActionMenuView.this.f2955z;
            if (aVar != null) {
                aVar.b(dVar);
            }
        }
    }

    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public static int I(View view, int i3, int i4, int i5, int i6) {
        int i7;
        c cVar = (c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i5) - i6, View.MeasureSpec.getMode(i5));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z3 = false;
        boolean z4 = actionMenuItemView != null && actionMenuItemView.r();
        if (i4 > 0) {
            i7 = 2;
            if (!z4 || i4 >= 2) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i4 * i3, Integer.MIN_VALUE), makeMeasureSpec);
                int measuredWidth = view.getMeasuredWidth();
                int i8 = measuredWidth / i3;
                if (measuredWidth % i3 != 0) {
                    i8++;
                }
                if (!z4 || i8 >= 2) {
                    i7 = i8;
                }
                if (!cVar.f2956a && z4) {
                    z3 = true;
                }
                cVar.f2959d = z3;
                cVar.f2957b = i7;
                view.measure(View.MeasureSpec.makeMeasureSpec(i3 * i7, 1073741824), makeMeasureSpec);
                return i7;
            }
        }
        i7 = 0;
        if (!cVar.f2956a) {
            z3 = true;
        }
        cVar.f2959d = z3;
        cVar.f2957b = i7;
        view.measure(View.MeasureSpec.makeMeasureSpec(i3 * i7, 1073741824), makeMeasureSpec);
        return i7;
    }

    public void A() {
        androidx.appcompat.widget.a aVar = this.f2953x;
        if (aVar != null) {
            aVar.w();
        }
    }

    @Override // androidx.appcompat.widget.b
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public c generateDefaultLayoutParams() {
        c cVar = new c(-2, -2);
        ((LinearLayout.LayoutParams) cVar).gravity = 16;
        return cVar;
    }

    @Override // androidx.appcompat.widget.b
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public c generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.b
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        c cVar = layoutParams instanceof c ? new c((c) layoutParams) : new c(layoutParams);
        if (((LinearLayout.LayoutParams) cVar).gravity <= 0) {
            ((LinearLayout.LayoutParams) cVar).gravity = 16;
        }
        return cVar;
    }

    public c E() {
        c generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.f2956a = true;
        return generateDefaultLayoutParams;
    }

    public boolean F(int i3) {
        boolean z3 = false;
        if (i3 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i3 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i3);
        if (i3 < getChildCount() && (childAt instanceof a)) {
            z3 = ((a) childAt).a();
        }
        return (i3 <= 0 || !(childAt2 instanceof a)) ? z3 : ((a) childAt2).b() | z3;
    }

    public void G(androidx.appcompat.view.menu.d dVar) {
        this.f2949t = dVar;
    }

    public boolean H() {
        androidx.appcompat.widget.a aVar = this.f2953x;
        return aVar != null && aVar.B();
    }

    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v48 */
    public final void J(int i3, int i4) {
        long j3;
        int i5;
        int i6;
        boolean z3;
        boolean z4;
        ?? r3;
        int i7;
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i3);
        int size2 = View.MeasureSpec.getSize(i4);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i4, paddingTop, -2);
        int i8 = size - paddingLeft;
        int i9 = this.f2946C;
        int i10 = i8 / i9;
        int i11 = i8 % i9;
        if (i10 == 0) {
            setMeasuredDimension(i8, 0);
            return;
        }
        int i12 = i9 + (i11 / i10);
        int childCount = getChildCount();
        int i13 = 0;
        int i14 = 0;
        boolean z5 = false;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        long j4 = 0;
        while (i14 < childCount) {
            View childAt = getChildAt(i14);
            int i18 = size2;
            if (childAt.getVisibility() == 8) {
                i7 = i12;
            } else {
                boolean z6 = childAt instanceof ActionMenuItemView;
                i15++;
                if (z6) {
                    int i19 = this.f2947D;
                    z4 = z6;
                    r3 = 0;
                    childAt.setPadding(i19, 0, i19, 0);
                } else {
                    z4 = z6;
                    r3 = 0;
                }
                c cVar = (c) childAt.getLayoutParams();
                cVar.f2961f = r3;
                cVar.f2958c = r3;
                cVar.f2957b = r3;
                cVar.f2959d = r3;
                ((LinearLayout.LayoutParams) cVar).leftMargin = r3;
                ((LinearLayout.LayoutParams) cVar).rightMargin = r3;
                cVar.f2960e = z4 && ((ActionMenuItemView) childAt).r();
                int I3 = I(childAt, i12, cVar.f2956a ? 1 : i10, childMeasureSpec, paddingTop);
                i16 = Math.max(i16, I3);
                i7 = i12;
                if (cVar.f2959d) {
                    i17++;
                }
                if (cVar.f2956a) {
                    z5 = true;
                }
                i10 -= I3;
                i13 = Math.max(i13, childAt.getMeasuredHeight());
                if (I3 == 1) {
                    j4 |= 1 << i14;
                }
            }
            i14++;
            size2 = i18;
            i12 = i7;
        }
        int i20 = size2;
        int i21 = i12;
        char c3 = 2;
        boolean z7 = z5 && i15 == 2;
        boolean z8 = false;
        while (i17 > 0 && i10 > 0) {
            int i22 = Integer.MAX_VALUE;
            long j5 = 0;
            char c4 = c3;
            int i23 = 0;
            int i24 = 0;
            j3 = 1;
            while (i24 < childCount) {
                c cVar2 = (c) getChildAt(i24).getLayoutParams();
                boolean z9 = z7;
                if (cVar2.f2959d) {
                    int i25 = cVar2.f2957b;
                    if (i25 < i22) {
                        j5 = 1 << i24;
                        i22 = i25;
                        i23 = 1;
                    } else if (i25 == i22) {
                        j5 |= 1 << i24;
                        i23++;
                    }
                }
                i24++;
                z7 = z9;
            }
            boolean z10 = z7;
            j4 |= j5;
            if (i23 > i10) {
                break;
            }
            int i26 = i22 + 1;
            int i27 = 0;
            while (i27 < childCount) {
                View childAt2 = getChildAt(i27);
                c cVar3 = (c) childAt2.getLayoutParams();
                long j6 = 1 << i27;
                if ((j5 & j6) == 0) {
                    if (cVar3.f2957b == i26) {
                        j4 |= j6;
                    }
                    i6 = i27;
                } else {
                    if (!z10 || !cVar3.f2960e) {
                        i6 = i27;
                        z3 = true;
                    } else if (i10 == 1) {
                        int i28 = this.f2947D;
                        z3 = true;
                        i6 = i27;
                        childAt2.setPadding(i28 + i21, 0, i28, 0);
                    } else {
                        i6 = i27;
                        z3 = true;
                    }
                    cVar3.f2957b++;
                    cVar3.f2961f = z3;
                    i10--;
                }
                i27 = i6 + 1;
            }
            c3 = c4;
            z7 = z10;
            z8 = true;
        }
        j3 = 1;
        boolean z11 = !z5 && i15 == 1;
        if (i10 <= 0 || j4 == 0 || (i10 >= i15 - 1 && !z11 && i16 <= 1)) {
            i5 = 0;
        } else {
            float bitCount = Long.bitCount(j4);
            if (z11) {
                i5 = 0;
            } else {
                if ((j4 & j3) != 0) {
                    i5 = 0;
                    if (!((c) getChildAt(0).getLayoutParams()).f2960e) {
                        bitCount -= 0.5f;
                    }
                } else {
                    i5 = 0;
                }
                int i29 = childCount - 1;
                if ((j4 & (1 << i29)) != 0 && !((c) getChildAt(i29).getLayoutParams()).f2960e) {
                    bitCount -= 0.5f;
                }
            }
            int i30 = bitCount > 0.0f ? (int) ((i10 * i21) / bitCount) : i5;
            boolean z12 = z8;
            for (int i31 = i5; i31 < childCount; i31++) {
                if ((j4 & (1 << i31)) != 0) {
                    View childAt3 = getChildAt(i31);
                    c cVar4 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar4.f2958c = i30;
                        cVar4.f2961f = true;
                        if (i31 == 0 && !cVar4.f2960e) {
                            ((LinearLayout.LayoutParams) cVar4).leftMargin = (-i30) / 2;
                        }
                        z12 = true;
                    } else {
                        if (cVar4.f2956a) {
                            cVar4.f2958c = i30;
                            cVar4.f2961f = true;
                            ((LinearLayout.LayoutParams) cVar4).rightMargin = (-i30) / 2;
                            z12 = true;
                        } else {
                            if (i31 != 0) {
                                ((LinearLayout.LayoutParams) cVar4).leftMargin = i30 / 2;
                            }
                            if (i31 != childCount - 1) {
                                ((LinearLayout.LayoutParams) cVar4).rightMargin = i30 / 2;
                            }
                        }
                    }
                }
            }
            z8 = z12;
        }
        if (z8) {
            for (int i32 = i5; i32 < childCount; i32++) {
                View childAt4 = getChildAt(i32);
                c cVar5 = (c) childAt4.getLayoutParams();
                if (cVar5.f2961f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar5.f2957b * i21) + cVar5.f2958c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i8, mode != 1073741824 ? i13 : i20);
    }

    public androidx.appcompat.view.menu.d K() {
        return this.f2949t;
    }

    public void L(g.a aVar, d.a aVar2) {
        this.f2954y = aVar;
        this.f2955z = aVar2;
    }

    public boolean M() {
        androidx.appcompat.widget.a aVar = this.f2953x;
        return aVar != null && aVar.H();
    }

    @Override // androidx.appcompat.view.menu.d.b
    public boolean a(androidx.appcompat.view.menu.e eVar) {
        return this.f2949t.H(eVar, 0);
    }

    @Override // androidx.appcompat.widget.b, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.f2949t == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.d dVar = new androidx.appcompat.view.menu.d(context);
            this.f2949t = dVar;
            dVar.L(new d());
            androidx.appcompat.widget.a aVar = new androidx.appcompat.widget.a(context);
            this.f2953x = aVar;
            aVar.G(true);
            androidx.appcompat.widget.a aVar2 = this.f2953x;
            g.a aVar3 = this.f2954y;
            if (aVar3 == null) {
                aVar3 = new b();
            }
            aVar2.i(aVar3);
            this.f2949t.b(this.f2953x, this.f2950u);
            this.f2953x.E(this);
        }
        return this.f2949t;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f2953x.y();
    }

    public int getPopupTheme() {
        return this.f2951v;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        androidx.appcompat.widget.a aVar = this.f2953x;
        if (aVar != null) {
            aVar.k(false);
            if (this.f2953x.B()) {
                this.f2953x.z();
                this.f2953x.H();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        A();
    }

    @Override // androidx.appcompat.widget.b, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        int width;
        int i7;
        if (!this.f2944A) {
            super.onLayout(z3, i3, i4, i5, i6);
            return;
        }
        int childCount = getChildCount();
        int i8 = (i6 - i4) / 2;
        int dividerWidth = getDividerWidth();
        int i9 = i5 - i3;
        int paddingRight = (i9 - getPaddingRight()) - getPaddingLeft();
        boolean a3 = c0.a(this);
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f2956a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (F(i12)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a3) {
                        i7 = getPaddingLeft() + ((LinearLayout.LayoutParams) cVar).leftMargin;
                        width = i7 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) cVar).rightMargin;
                        i7 = width - measuredWidth;
                    }
                    int i13 = i8 - (measuredHeight / 2);
                    childAt.layout(i7, i13, width, measuredHeight + i13);
                    paddingRight -= measuredWidth;
                    i10 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) cVar).leftMargin) + ((LinearLayout.LayoutParams) cVar).rightMargin;
                    F(i12);
                    i11++;
                }
            }
        }
        if (childCount == 1 && i10 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i14 = (i9 / 2) - (measuredWidth2 / 2);
            int i15 = i8 - (measuredHeight2 / 2);
            childAt2.layout(i14, i15, measuredWidth2 + i14, measuredHeight2 + i15);
            return;
        }
        int i16 = i11 - (i10 ^ 1);
        int max = Math.max(0, i16 > 0 ? paddingRight / i16 : 0);
        if (a3) {
            int width2 = getWidth() - getPaddingRight();
            for (int i17 = 0; i17 < childCount; i17++) {
                View childAt3 = getChildAt(i17);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f2956a) {
                    int i18 = width2 - ((LinearLayout.LayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i19 = i8 - (measuredHeight3 / 2);
                    childAt3.layout(i18 - measuredWidth3, i19, i18, measuredHeight3 + i19);
                    width2 = i18 - ((measuredWidth3 + ((LinearLayout.LayoutParams) cVar2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt4 = getChildAt(i20);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f2956a) {
                int i21 = paddingLeft + ((LinearLayout.LayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i22 = i8 - (measuredHeight4 / 2);
                childAt4.layout(i21, i22, i21 + measuredWidth4, measuredHeight4 + i22);
                paddingLeft = i21 + measuredWidth4 + ((LinearLayout.LayoutParams) cVar3).rightMargin + max;
            }
        }
    }

    @Override // androidx.appcompat.widget.b, android.view.View
    public void onMeasure(int i3, int i4) {
        androidx.appcompat.view.menu.d dVar;
        boolean z3 = this.f2944A;
        boolean z4 = View.MeasureSpec.getMode(i3) == 1073741824;
        this.f2944A = z4;
        if (z3 != z4) {
            this.f2945B = 0;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (this.f2944A && (dVar = this.f2949t) != null && size != this.f2945B) {
            this.f2945B = size;
            dVar.G(true);
        }
        int childCount = getChildCount();
        if (this.f2944A && childCount > 0) {
            J(i3, i4);
            return;
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            c cVar = (c) getChildAt(i5).getLayoutParams();
            ((LinearLayout.LayoutParams) cVar).rightMargin = 0;
            ((LinearLayout.LayoutParams) cVar).leftMargin = 0;
        }
        super.onMeasure(i3, i4);
    }

    public void setExpandedActionViewsExclusive(boolean z3) {
        this.f2953x.D(z3);
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.f2948E = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f2953x.F(drawable);
    }

    public void setOverflowReserved(boolean z3) {
        this.f2952w = z3;
    }

    public void setPopupTheme(int i3) {
        if (this.f2951v != i3) {
            this.f2951v = i3;
            if (i3 == 0) {
                this.f2950u = getContext();
            } else {
                this.f2950u = new ContextThemeWrapper(getContext(), i3);
            }
        }
    }

    public void setPresenter(androidx.appcompat.widget.a aVar) {
        this.f2953x = aVar;
        aVar.E(this);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f3 = context.getResources().getDisplayMetrics().density;
        this.f2946C = (int) (56.0f * f3);
        this.f2947D = (int) (f3 * 4.0f);
        this.f2950u = context;
        this.f2951v = 0;
    }
}
