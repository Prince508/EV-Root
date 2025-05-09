package androidx.appcompat.widget;

import K.O;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.b;
import d.e;

/* loaded from: classes.dex */
public class AlertDialogLayout extends b {
    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static int A(View view) {
        int x3 = O.x(view);
        if (x3 > 0) {
            return x3;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return A(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    public final boolean B(int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int childCount = getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                int id = childAt.getId();
                if (id == e.f6100B) {
                    view = childAt;
                } else if (id == e.f6107g) {
                    view2 = childAt;
                } else {
                    if ((id != e.f6109i && id != e.f6110j) || view3 != null) {
                        return false;
                    }
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        int mode2 = View.MeasureSpec.getMode(i3);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (view != null) {
            view.measure(i3, 0);
            paddingTop += view.getMeasuredHeight();
            i5 = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            i5 = 0;
        }
        if (view2 != null) {
            view2.measure(i3, 0);
            i6 = A(view2);
            i7 = view2.getMeasuredHeight() - i6;
            paddingTop += i6;
            i5 = View.combineMeasuredStates(i5, view2.getMeasuredState());
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (view3 != null) {
            view3.measure(i3, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingTop), mode));
            i8 = view3.getMeasuredHeight();
            paddingTop += i8;
            i5 = View.combineMeasuredStates(i5, view3.getMeasuredState());
        } else {
            i8 = 0;
        }
        int i10 = size - paddingTop;
        if (view2 != null) {
            int i11 = paddingTop - i6;
            int min = Math.min(i10, i7);
            if (min > 0) {
                i10 -= min;
                i6 += min;
            }
            view2.measure(i3, View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
            paddingTop = i11 + view2.getMeasuredHeight();
            i5 = View.combineMeasuredStates(i5, view2.getMeasuredState());
        }
        if (view3 != null && i10 > 0) {
            view3.measure(i3, View.MeasureSpec.makeMeasureSpec(i8 + i10, mode));
            paddingTop = (paddingTop - i8) + view3.getMeasuredHeight();
            i5 = View.combineMeasuredStates(i5, view3.getMeasuredState());
        }
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt2 = getChildAt(i13);
            if (childAt2.getVisibility() != 8) {
                i12 = Math.max(i12, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i12 + getPaddingLeft() + getPaddingRight(), i3, i5), View.resolveSizeAndState(paddingTop, i4, 0));
        if (mode2 == 1073741824) {
            return true;
        }
        k(childCount, i4);
        return true;
    }

    public final void k(int i3, int i4) {
        int i5;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int i6 = 0;
        while (i6 < i3) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                b.a aVar = (b.a) childAt.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).width == -1) {
                    int i7 = ((LinearLayout.LayoutParams) aVar).height;
                    ((LinearLayout.LayoutParams) aVar).height = childAt.getMeasuredHeight();
                    i5 = i4;
                    measureChildWithMargins(childAt, makeMeasureSpec, 0, i5, 0);
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

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a0  */
    @Override // androidx.appcompat.widget.b, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
        /*
            r10 = this;
            int r11 = r10.getPaddingLeft()
            int r14 = r14 - r12
            int r12 = r10.getPaddingRight()
            int r12 = r14 - r12
            int r14 = r14 - r11
            int r0 = r10.getPaddingRight()
            int r14 = r14 - r0
            int r0 = r10.getMeasuredHeight()
            int r1 = r10.getChildCount()
            int r2 = r10.getGravity()
            r3 = r2 & 112(0x70, float:1.57E-43)
            r4 = 8388615(0x800007, float:1.1754953E-38)
            r2 = r2 & r4
            r4 = 16
            if (r3 == r4) goto L39
            r4 = 80
            if (r3 == r4) goto L30
            int r13 = r10.getPaddingTop()
            goto L43
        L30:
            int r3 = r10.getPaddingTop()
            int r3 = r3 + r15
            int r3 = r3 - r13
            int r13 = r3 - r0
            goto L43
        L39:
            int r3 = r10.getPaddingTop()
            int r15 = r15 - r13
            int r15 = r15 - r0
            int r15 = r15 / 2
            int r13 = r3 + r15
        L43:
            android.graphics.drawable.Drawable r15 = r10.getDividerDrawable()
            r0 = 0
            if (r15 != 0) goto L4c
            r15 = r0
            goto L50
        L4c:
            int r15 = r15.getIntrinsicHeight()
        L50:
            if (r0 >= r1) goto Lb1
            android.view.View r4 = r10.getChildAt(r0)
            if (r4 == 0) goto Lae
            int r3 = r4.getVisibility()
            r5 = 8
            if (r3 == r5) goto Lae
            int r7 = r4.getMeasuredWidth()
            int r8 = r4.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r3 = r4.getLayoutParams()
            r9 = r3
            androidx.appcompat.widget.b$a r9 = (androidx.appcompat.widget.b.a) r9
            int r3 = r9.gravity
            if (r3 >= 0) goto L74
            r3 = r2
        L74:
            int r5 = K.O.w(r10)
            int r3 = K.AbstractC0213s.b(r3, r5)
            r3 = r3 & 7
            r5 = 1
            if (r3 == r5) goto L8f
            r5 = 5
            if (r3 == r5) goto L89
            int r3 = r9.leftMargin
            int r3 = r3 + r11
        L87:
            r5 = r3
            goto L9a
        L89:
            int r3 = r12 - r7
            int r5 = r9.rightMargin
        L8d:
            int r3 = r3 - r5
            goto L87
        L8f:
            int r3 = r14 - r7
            int r3 = r3 / 2
            int r3 = r3 + r11
            int r5 = r9.leftMargin
            int r3 = r3 + r5
            int r5 = r9.rightMargin
            goto L8d
        L9a:
            boolean r3 = r10.s(r0)
            if (r3 == 0) goto La1
            int r13 = r13 + r15
        La1:
            int r3 = r9.topMargin
            int r6 = r13 + r3
            r3 = r10
            r3.z(r4, r5, r6, r7, r8)
            int r13 = r9.bottomMargin
            int r8 = r8 + r13
            int r6 = r6 + r8
            r13 = r6
        Lae:
            int r0 = r0 + 1
            goto L50
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AlertDialogLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // androidx.appcompat.widget.b, android.view.View
    public void onMeasure(int i3, int i4) {
        if (B(i3, i4)) {
            return;
        }
        super.onMeasure(i3, i4);
    }

    public final void z(View view, int i3, int i4, int i5, int i6) {
        view.layout(i3, i4, i5 + i3, i6 + i4);
    }
}
