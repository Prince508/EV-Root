package androidx.appcompat.widget;

import K.O;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import d.i;
import l.C0552S;
import l.c0;

/* loaded from: classes.dex */
public abstract class b extends ViewGroup {

    /* renamed from: e, reason: collision with root package name */
    public boolean f3182e;

    /* renamed from: f, reason: collision with root package name */
    public int f3183f;

    /* renamed from: g, reason: collision with root package name */
    public int f3184g;

    /* renamed from: h, reason: collision with root package name */
    public int f3185h;

    /* renamed from: i, reason: collision with root package name */
    public int f3186i;

    /* renamed from: j, reason: collision with root package name */
    public int f3187j;

    /* renamed from: k, reason: collision with root package name */
    public float f3188k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3189l;

    /* renamed from: m, reason: collision with root package name */
    public int[] f3190m;

    /* renamed from: n, reason: collision with root package name */
    public int[] f3191n;

    /* renamed from: o, reason: collision with root package name */
    public Drawable f3192o;

    /* renamed from: p, reason: collision with root package name */
    public int f3193p;

    /* renamed from: q, reason: collision with root package name */
    public int f3194q;

    /* renamed from: r, reason: collision with root package name */
    public int f3195r;

    /* renamed from: s, reason: collision with root package name */
    public int f3196s;

    public static class a extends LinearLayout.LayoutParams {
        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public a(int i3, int i4) {
            super(i3, i4);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void k(int i3, int i4) {
        int i5;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int i6 = 0;
        while (i6 < i3) {
            View r3 = r(i6);
            if (r3.getVisibility() != 8) {
                a aVar = (a) r3.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).width == -1) {
                    int i7 = ((LinearLayout.LayoutParams) aVar).height;
                    ((LinearLayout.LayoutParams) aVar).height = r3.getMeasuredHeight();
                    i5 = i4;
                    measureChildWithMargins(r3, makeMeasureSpec, 0, i5, 0);
                    ((LinearLayout.LayoutParams) aVar).height = i7;
                    i6++;
                    i4 = i5;
                }
            }
            i5 = i4;
            i6++;
            i4 = i5;
        }
    }

    private void z(View view, int i3, int i4, int i5, int i6) {
        view.layout(i3, i4, i5 + i3, i6 + i4);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public void f(Canvas canvas) {
        int right;
        int left;
        int i3;
        int virtualChildCount = getVirtualChildCount();
        boolean a3 = c0.a(this);
        for (int i4 = 0; i4 < virtualChildCount; i4++) {
            View r3 = r(i4);
            if (r3 != null && r3.getVisibility() != 8 && s(i4)) {
                a aVar = (a) r3.getLayoutParams();
                i(canvas, a3 ? r3.getRight() + ((LinearLayout.LayoutParams) aVar).rightMargin : (r3.getLeft() - ((LinearLayout.LayoutParams) aVar).leftMargin) - this.f3193p);
            }
        }
        if (s(virtualChildCount)) {
            View r4 = r(virtualChildCount - 1);
            if (r4 != null) {
                a aVar2 = (a) r4.getLayoutParams();
                if (a3) {
                    left = r4.getLeft() - ((LinearLayout.LayoutParams) aVar2).leftMargin;
                    i3 = this.f3193p;
                    right = left - i3;
                } else {
                    right = r4.getRight() + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                }
            } else if (a3) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i3 = this.f3193p;
                right = left - i3;
            }
            i(canvas, right);
        }
    }

    public void g(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i3 = 0; i3 < virtualChildCount; i3++) {
            View r3 = r(i3);
            if (r3 != null && r3.getVisibility() != 8 && s(i3)) {
                h(canvas, (r3.getTop() - ((LinearLayout.LayoutParams) ((a) r3.getLayoutParams())).topMargin) - this.f3194q);
            }
        }
        if (s(virtualChildCount)) {
            View r4 = r(virtualChildCount - 1);
            h(canvas, r4 == null ? (getHeight() - getPaddingBottom()) - this.f3194q : r4.getBottom() + ((LinearLayout.LayoutParams) ((a) r4.getLayoutParams())).bottomMargin);
        }
    }

    @Override // android.view.View
    public int getBaseline() {
        int i3;
        if (this.f3183f < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i4 = this.f3183f;
        if (childCount <= i4) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i4);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f3183f == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int i5 = this.f3184g;
        if (this.f3185h == 1 && (i3 = this.f3186i & 112) != 48) {
            if (i3 == 16) {
                i5 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f3187j) / 2;
            } else if (i3 == 80) {
                i5 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f3187j;
            }
        }
        return i5 + ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f3183f;
    }

    public Drawable getDividerDrawable() {
        return this.f3192o;
    }

    public int getDividerPadding() {
        return this.f3196s;
    }

    public int getDividerWidth() {
        return this.f3193p;
    }

    public int getGravity() {
        return this.f3186i;
    }

    public int getOrientation() {
        return this.f3185h;
    }

    public int getShowDividers() {
        return this.f3195r;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f3188k;
    }

    public void h(Canvas canvas, int i3) {
        this.f3192o.setBounds(getPaddingLeft() + this.f3196s, i3, (getWidth() - getPaddingRight()) - this.f3196s, this.f3194q + i3);
        this.f3192o.draw(canvas);
    }

    public void i(Canvas canvas, int i3) {
        this.f3192o.setBounds(i3, getPaddingTop() + this.f3196s, this.f3193p + i3, (getHeight() - getPaddingBottom()) - this.f3196s);
        this.f3192o.draw(canvas);
    }

    public final void j(int i3, int i4) {
        int i5;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        int i6 = 0;
        while (i6 < i3) {
            View r3 = r(i6);
            if (r3.getVisibility() != 8) {
                a aVar = (a) r3.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).height == -1) {
                    int i7 = ((LinearLayout.LayoutParams) aVar).width;
                    ((LinearLayout.LayoutParams) aVar).width = r3.getMeasuredWidth();
                    i5 = i4;
                    measureChildWithMargins(r3, i5, 0, makeMeasureSpec, 0);
                    ((LinearLayout.LayoutParams) aVar).width = i7;
                    i6++;
                    i4 = i5;
                }
            }
            i5 = i4;
            i6++;
            i4 = i5;
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        int i3 = this.f3185h;
        if (i3 == 0) {
            return new a(-2, -2);
        }
        if (i3 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public int o(View view, int i3) {
        return 0;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f3192o == null) {
            return;
        }
        if (this.f3185h == 1) {
            g(canvas);
        } else {
            f(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        if (this.f3185h == 1) {
            u(i3, i4, i5, i6);
        } else {
            t(i3, i4, i5, i6);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i3, int i4) {
        if (this.f3185h == 1) {
            y(i3, i4);
        } else {
            w(i3, i4);
        }
    }

    public int p(View view) {
        return 0;
    }

    public int q(View view) {
        return 0;
    }

    public View r(int i3) {
        return getChildAt(i3);
    }

    public boolean s(int i3) {
        if (i3 == 0) {
            return (this.f3195r & 1) != 0;
        }
        if (i3 == getChildCount()) {
            return (this.f3195r & 4) != 0;
        }
        if ((this.f3195r & 2) != 0) {
            for (int i4 = i3 - 1; i4 >= 0; i4--) {
                if (getChildAt(i4).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    public void setBaselineAligned(boolean z3) {
        this.f3182e = z3;
    }

    public void setBaselineAlignedChildIndex(int i3) {
        if (i3 >= 0 && i3 < getChildCount()) {
            this.f3183f = i3;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f3192o) {
            return;
        }
        this.f3192o = drawable;
        if (drawable != null) {
            this.f3193p = drawable.getIntrinsicWidth();
            this.f3194q = drawable.getIntrinsicHeight();
        } else {
            this.f3193p = 0;
            this.f3194q = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i3) {
        this.f3196s = i3;
    }

    public void setGravity(int i3) {
        if (this.f3186i != i3) {
            if ((8388615 & i3) == 0) {
                i3 |= 8388611;
            }
            if ((i3 & 112) == 0) {
                i3 |= 48;
            }
            this.f3186i = i3;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i3) {
        int i4 = i3 & 8388615;
        int i5 = this.f3186i;
        if ((8388615 & i5) != i4) {
            this.f3186i = i4 | ((-8388616) & i5);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z3) {
        this.f3189l = z3;
    }

    public void setOrientation(int i3) {
        if (this.f3185h != i3) {
            this.f3185h = i3;
            requestLayout();
        }
    }

    public void setShowDividers(int i3) {
        if (i3 != this.f3195r) {
            requestLayout();
        }
        this.f3195r = i3;
    }

    public void setVerticalGravity(int i3) {
        int i4 = i3 & 112;
        int i5 = this.f3186i;
        if ((i5 & 112) != i4) {
            this.f3186i = i4 | (i5 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f3) {
        this.f3188k = Math.max(0.0f, f3);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void t(int r22, int r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.b.t(int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void u(int r12, int r13, int r14, int r15) {
        /*
            r11 = this;
            int r0 = r11.getPaddingLeft()
            int r14 = r14 - r12
            int r12 = r11.getPaddingRight()
            int r12 = r14 - r12
            int r14 = r14 - r0
            int r1 = r11.getPaddingRight()
            int r14 = r14 - r1
            int r1 = r11.getVirtualChildCount()
            int r2 = r11.f3186i
            r3 = r2 & 112(0x70, float:1.57E-43)
            r4 = 8388615(0x800007, float:1.1754953E-38)
            r2 = r2 & r4
            r4 = 16
            if (r3 == r4) goto L35
            r4 = 80
            if (r3 == r4) goto L2a
            int r13 = r11.getPaddingTop()
            goto L41
        L2a:
            int r3 = r11.getPaddingTop()
            int r3 = r3 + r15
            int r3 = r3 - r13
            int r13 = r11.f3187j
            int r13 = r3 - r13
            goto L41
        L35:
            int r3 = r11.getPaddingTop()
            int r15 = r15 - r13
            int r13 = r11.f3187j
            int r15 = r15 - r13
            int r15 = r15 / 2
            int r13 = r3 + r15
        L41:
            r15 = 0
        L42:
            if (r15 >= r1) goto Lb9
            android.view.View r4 = r11.r(r15)
            r9 = 1
            if (r4 != 0) goto L52
            int r3 = r11.x(r15)
            int r13 = r13 + r3
        L50:
            r3 = r11
            goto Lb7
        L52:
            int r3 = r4.getVisibility()
            r5 = 8
            if (r3 == r5) goto L50
            int r7 = r4.getMeasuredWidth()
            int r8 = r4.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r3 = r4.getLayoutParams()
            r10 = r3
            androidx.appcompat.widget.b$a r10 = (androidx.appcompat.widget.b.a) r10
            int r3 = r10.gravity
            if (r3 >= 0) goto L6e
            r3 = r2
        L6e:
            int r5 = K.O.w(r11)
            int r3 = K.AbstractC0213s.b(r3, r5)
            r3 = r3 & 7
            if (r3 == r9) goto L88
            r5 = 5
            if (r3 == r5) goto L82
            int r3 = r10.leftMargin
            int r3 = r3 + r0
        L80:
            r5 = r3
            goto L93
        L82:
            int r3 = r12 - r7
            int r5 = r10.rightMargin
        L86:
            int r3 = r3 - r5
            goto L80
        L88:
            int r3 = r14 - r7
            int r3 = r3 / 2
            int r3 = r3 + r0
            int r5 = r10.leftMargin
            int r3 = r3 + r5
            int r5 = r10.rightMargin
            goto L86
        L93:
            boolean r3 = r11.s(r15)
            if (r3 == 0) goto L9c
            int r3 = r11.f3194q
            int r13 = r13 + r3
        L9c:
            int r3 = r10.topMargin
            int r13 = r13 + r3
            int r3 = r11.p(r4)
            int r6 = r13 + r3
            r3 = r11
            r3.z(r4, r5, r6, r7, r8)
            int r5 = r10.bottomMargin
            int r8 = r8 + r5
            int r5 = r11.q(r4)
            int r8 = r8 + r5
            int r13 = r13 + r8
            int r4 = r11.o(r4, r15)
            int r15 = r15 + r4
        Lb7:
            int r15 = r15 + r9
            goto L42
        Lb9:
            r3 = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.b.u(int, int, int, int):void");
    }

    public void v(View view, int i3, int i4, int i5, int i6, int i7) {
        measureChildWithMargins(view, i4, i5, i6, i7);
    }

    /* JADX WARN: Removed duplicated region for block: B:180:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void w(int r39, int r40) {
        /*
            Method dump skipped, instructions count: 1286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.b.w(int, int):void");
    }

    public int x(int i3) {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void y(int r28, int r29) {
        /*
            Method dump skipped, instructions count: 881
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.b.y(int, int):void");
    }

    public b(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        this.f3182e = true;
        this.f3183f = -1;
        this.f3184g = 0;
        this.f3186i = 8388659;
        int[] iArr = i.f6340v0;
        C0552S t3 = C0552S.t(context, attributeSet, iArr, i3, 0);
        O.h0(this, context, iArr, attributeSet, t3.p(), i3, 0);
        int j3 = t3.j(i.f6348x0, -1);
        if (j3 >= 0) {
            setOrientation(j3);
        }
        int j4 = t3.j(i.f6344w0, -1);
        if (j4 >= 0) {
            setGravity(j4);
        }
        boolean a3 = t3.a(i.f6352y0, true);
        if (!a3) {
            setBaselineAligned(a3);
        }
        this.f3188k = t3.h(i.f6157A0, -1.0f);
        this.f3183f = t3.j(i.f6356z0, -1);
        this.f3189l = t3.a(i.f6169D0, false);
        setDividerDrawable(t3.g(i.f6161B0));
        this.f3195r = t3.j(i.f6173E0, 0);
        this.f3196s = t3.f(i.f6165C0, 0);
        t3.u();
    }
}
