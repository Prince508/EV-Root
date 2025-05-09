package com.google.android.material.button;

import K.AbstractC0214t;
import K.C0184a;
import K.O;
import L.x;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import com.google.android.material.button.MaterialButton;
import e1.AbstractC0464a;
import e1.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import r1.n;
import x1.C0767a;
import x1.k;

/* loaded from: classes.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: o, reason: collision with root package name */
    public static final int f5130o = i.f6957i;

    /* renamed from: e, reason: collision with root package name */
    public final List f5131e;

    /* renamed from: f, reason: collision with root package name */
    public final e f5132f;

    /* renamed from: g, reason: collision with root package name */
    public final LinkedHashSet f5133g;

    /* renamed from: h, reason: collision with root package name */
    public final Comparator f5134h;

    /* renamed from: i, reason: collision with root package name */
    public Integer[] f5135i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f5136j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f5137k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f5138l;

    /* renamed from: m, reason: collision with root package name */
    public final int f5139m;

    /* renamed from: n, reason: collision with root package name */
    public Set f5140n;

    public class a implements Comparator {
        public a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            int compareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
            return compareTo2 != 0 ? compareTo2 : Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton2)));
        }
    }

    public class b extends C0184a {
        public b() {
        }

        @Override // K.C0184a
        public void g(View view, x xVar) {
            super.g(view, xVar);
            xVar.m0(x.f.a(0, 1, MaterialButtonToggleGroup.this.i(view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    public static class c {

        /* renamed from: e, reason: collision with root package name */
        public static final x1.c f5143e = new C0767a(0.0f);

        /* renamed from: a, reason: collision with root package name */
        public x1.c f5144a;

        /* renamed from: b, reason: collision with root package name */
        public x1.c f5145b;

        /* renamed from: c, reason: collision with root package name */
        public x1.c f5146c;

        /* renamed from: d, reason: collision with root package name */
        public x1.c f5147d;

        public c(x1.c cVar, x1.c cVar2, x1.c cVar3, x1.c cVar4) {
            this.f5144a = cVar;
            this.f5145b = cVar3;
            this.f5146c = cVar4;
            this.f5147d = cVar2;
        }

        public static c a(c cVar) {
            x1.c cVar2 = f5143e;
            return new c(cVar2, cVar.f5147d, cVar2, cVar.f5146c);
        }

        public static c b(c cVar, View view) {
            return n.g(view) ? c(cVar) : d(cVar);
        }

        public static c c(c cVar) {
            x1.c cVar2 = cVar.f5144a;
            x1.c cVar3 = cVar.f5147d;
            x1.c cVar4 = f5143e;
            return new c(cVar2, cVar3, cVar4, cVar4);
        }

        public static c d(c cVar) {
            x1.c cVar2 = f5143e;
            return new c(cVar2, cVar2, cVar.f5145b, cVar.f5146c);
        }

        public static c e(c cVar, View view) {
            return n.g(view) ? d(cVar) : c(cVar);
        }

        public static c f(c cVar) {
            x1.c cVar2 = cVar.f5144a;
            x1.c cVar3 = f5143e;
            return new c(cVar2, cVar3, cVar.f5145b, cVar3);
        }
    }

    public interface d {
        void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i3, boolean z3);
    }

    public class e implements MaterialButton.a {
        public e() {
        }

        @Override // com.google.android.material.button.MaterialButton.a
        public void a(MaterialButton materialButton, boolean z3) {
            MaterialButtonToggleGroup.this.invalidate();
        }

        public /* synthetic */ e(MaterialButtonToggleGroup materialButtonToggleGroup, a aVar) {
            this();
        }
    }

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0464a.f6797o);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            if (k(i3)) {
                return i3;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (k(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i3 = 0;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            if ((getChildAt(i4) instanceof MaterialButton) && k(i4)) {
                i3++;
            }
        }
        return i3;
    }

    public static void p(k.b bVar, c cVar) {
        if (cVar == null) {
            bVar.o(0.0f);
        } else {
            bVar.B(cVar.f5144a).t(cVar.f5147d).F(cVar.f5145b).x(cVar.f5146c);
        }
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(O.h());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f5132f);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i3, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        e(materialButton.getId(), materialButton.isChecked());
        k shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f5131e.add(new c(shapeAppearanceModel.r(), shapeAppearanceModel.j(), shapeAppearanceModel.t(), shapeAppearanceModel.l()));
        materialButton.setEnabled(isEnabled());
        O.j0(materialButton, new b());
    }

    public void b(d dVar) {
        this.f5133g.add(dVar);
    }

    public final void c() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i3 = firstVisibleChildIndex + 1; i3 < getChildCount(); i3++) {
            MaterialButton h3 = h(i3);
            int min = Math.min(h3.getStrokeWidth(), h(i3 - 1).getStrokeWidth());
            LinearLayout.LayoutParams d3 = d(h3);
            if (getOrientation() == 0) {
                AbstractC0214t.c(d3, 0);
                AbstractC0214t.d(d3, -min);
                d3.topMargin = 0;
            } else {
                d3.bottomMargin = 0;
                d3.topMargin = -min;
                AbstractC0214t.d(d3, 0);
            }
            h3.setLayoutParams(d3);
        }
        n(firstVisibleChildIndex);
    }

    public final LinearLayout.LayoutParams d(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        r();
        super.dispatchDraw(canvas);
    }

    public final void e(int i3, boolean z3) {
        if (i3 == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i3);
            return;
        }
        HashSet hashSet = new HashSet(this.f5140n);
        if (z3 && !hashSet.contains(Integer.valueOf(i3))) {
            if (this.f5137k && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i3));
        } else {
            if (z3 || !hashSet.contains(Integer.valueOf(i3))) {
                return;
            }
            if (!this.f5138l || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i3));
            }
        }
        q(hashSet);
    }

    public void f() {
        q(new HashSet());
    }

    public final void g(int i3, boolean z3) {
        Iterator it = this.f5133g.iterator();
        while (it.hasNext()) {
            ((d) it.next()).a(this, i3, z3);
        }
    }

    public int getCheckedButtonId() {
        if (!this.f5137k || this.f5140n.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f5140n.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            int id = h(i3).getId();
            if (this.f5140n.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i3, int i4) {
        Integer[] numArr = this.f5135i;
        if (numArr != null && i4 < numArr.length) {
            return numArr[i4].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i4;
    }

    public final MaterialButton h(int i3) {
        return (MaterialButton) getChildAt(i3);
    }

    public final int i(View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            if (getChildAt(i4) == view) {
                return i3;
            }
            if ((getChildAt(i4) instanceof MaterialButton) && k(i4)) {
                i3++;
            }
        }
        return -1;
    }

    public final c j(int i3, int i4, int i5) {
        c cVar = (c) this.f5131e.get(i3);
        if (i4 == i5) {
            return cVar;
        }
        boolean z3 = getOrientation() == 0;
        if (i3 == i4) {
            return z3 ? c.e(cVar, this) : c.f(cVar);
        }
        if (i3 == i5) {
            return z3 ? c.b(cVar, this) : c.a(cVar);
        }
        return null;
    }

    public final boolean k(int i3) {
        return getChildAt(i3).getVisibility() != 8;
    }

    public boolean l() {
        return this.f5137k;
    }

    public void m(MaterialButton materialButton, boolean z3) {
        if (this.f5136j) {
            return;
        }
        e(materialButton.getId(), z3);
    }

    public final void n(int i3) {
        if (getChildCount() == 0 || i3 == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) h(i3).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams.topMargin = 0;
            layoutParams.bottomMargin = 0;
        } else {
            AbstractC0214t.c(layoutParams, 0);
            AbstractC0214t.d(layoutParams, 0);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
        }
    }

    public final void o(int i3, boolean z3) {
        View findViewById = findViewById(i3);
        if (findViewById instanceof MaterialButton) {
            this.f5136j = true;
            ((MaterialButton) findViewById).setChecked(z3);
            this.f5136j = false;
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int i3 = this.f5139m;
        if (i3 != -1) {
            q(Collections.singleton(Integer.valueOf(i3)));
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        x.J0(accessibilityNodeInfo).l0(x.e.a(1, getVisibleButtonCount(), false, l() ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i3, int i4) {
        s();
        c();
        super.onMeasure(i3, i4);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f5131e.remove(indexOfChild);
        }
        s();
        c();
    }

    public final void q(Set set) {
        Set set2 = this.f5140n;
        this.f5140n = new HashSet(set);
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            int id = h(i3).getId();
            o(id, set.contains(Integer.valueOf(id)));
            if (set2.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                g(id, set.contains(Integer.valueOf(id)));
            }
        }
        invalidate();
    }

    public final void r() {
        TreeMap treeMap = new TreeMap(this.f5134h);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            treeMap.put(h(i3), Integer.valueOf(i3));
        }
        this.f5135i = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    public void s() {
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i3 = 0; i3 < childCount; i3++) {
            MaterialButton h3 = h(i3);
            if (h3.getVisibility() != 8) {
                k.b v3 = h3.getShapeAppearanceModel().v();
                p(v3, j(i3, firstVisibleChildIndex, lastVisibleChildIndex));
                h3.setShapeAppearanceModel(v3.m());
            }
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z3) {
        super.setEnabled(z3);
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            h(i3).setEnabled(z3);
        }
    }

    public void setSelectionRequired(boolean z3) {
        this.f5138l = z3;
    }

    public void setSingleSelection(boolean z3) {
        if (this.f5137k != z3) {
            this.f5137k = z3;
            f();
        }
        t();
    }

    public final void t() {
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            h(i3).setA11yClassName((this.f5137k ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MaterialButtonToggleGroup(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = com.google.android.material.button.MaterialButtonToggleGroup.f5130o
            android.content.Context r7 = A1.a.c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r6.f5131e = r7
            com.google.android.material.button.MaterialButtonToggleGroup$e r7 = new com.google.android.material.button.MaterialButtonToggleGroup$e
            r0 = 0
            r7.<init>(r6, r0)
            r6.f5132f = r7
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            r6.f5133g = r7
            com.google.android.material.button.MaterialButtonToggleGroup$a r7 = new com.google.android.material.button.MaterialButtonToggleGroup$a
            r7.<init>()
            r6.f5134h = r7
            r7 = 0
            r6.f5136j = r7
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r6.f5140n = r0
            android.content.Context r0 = r6.getContext()
            int[] r2 = e1.j.f7119o2
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = r1.k.h(r0, r1, r2, r3, r4, r5)
            int r9 = e1.j.f7135s2
            boolean r9 = r8.getBoolean(r9, r7)
            r6.setSingleSelection(r9)
            int r9 = e1.j.f7127q2
            r0 = -1
            int r9 = r8.getResourceId(r9, r0)
            r6.f5139m = r9
            int r9 = e1.j.f7131r2
            boolean r7 = r8.getBoolean(r9, r7)
            r6.f5138l = r7
            r7 = 1
            r6.setChildrenDrawingOrderEnabled(r7)
            int r9 = e1.j.f7123p2
            boolean r9 = r8.getBoolean(r9, r7)
            r6.setEnabled(r9)
            r8.recycle()
            K.O.r0(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButtonToggleGroup.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setSingleSelection(int i3) {
        setSingleSelection(getResources().getBoolean(i3));
    }
}
