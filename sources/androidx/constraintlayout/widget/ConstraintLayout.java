package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import t.e;
import t.f;
import t.h;
import u.b;
import v.AbstractC0752b;
import v.AbstractC0754d;
import v.C0751a;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: A, reason: collision with root package name */
    public int f3215A;

    /* renamed from: e, reason: collision with root package name */
    public SparseArray f3216e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f3217f;

    /* renamed from: g, reason: collision with root package name */
    public f f3218g;

    /* renamed from: h, reason: collision with root package name */
    public int f3219h;

    /* renamed from: i, reason: collision with root package name */
    public int f3220i;

    /* renamed from: j, reason: collision with root package name */
    public int f3221j;

    /* renamed from: k, reason: collision with root package name */
    public int f3222k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3223l;

    /* renamed from: m, reason: collision with root package name */
    public int f3224m;

    /* renamed from: n, reason: collision with root package name */
    public d f3225n;

    /* renamed from: o, reason: collision with root package name */
    public C0751a f3226o;

    /* renamed from: p, reason: collision with root package name */
    public int f3227p;

    /* renamed from: q, reason: collision with root package name */
    public HashMap f3228q;

    /* renamed from: r, reason: collision with root package name */
    public int f3229r;

    /* renamed from: s, reason: collision with root package name */
    public int f3230s;

    /* renamed from: t, reason: collision with root package name */
    public int f3231t;

    /* renamed from: u, reason: collision with root package name */
    public int f3232u;

    /* renamed from: v, reason: collision with root package name */
    public int f3233v;

    /* renamed from: w, reason: collision with root package name */
    public int f3234w;

    /* renamed from: x, reason: collision with root package name */
    public SparseArray f3235x;

    /* renamed from: y, reason: collision with root package name */
    public c f3236y;

    /* renamed from: z, reason: collision with root package name */
    public int f3237z;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3238a;

        static {
            int[] iArr = new int[e.b.values().length];
            f3238a = iArr;
            try {
                iArr[e.b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3238a[e.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3238a[e.b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3238a[e.b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public class c implements b.InterfaceC0158b {

        /* renamed from: a, reason: collision with root package name */
        public ConstraintLayout f3307a;

        /* renamed from: b, reason: collision with root package name */
        public int f3308b;

        /* renamed from: c, reason: collision with root package name */
        public int f3309c;

        /* renamed from: d, reason: collision with root package name */
        public int f3310d;

        /* renamed from: e, reason: collision with root package name */
        public int f3311e;

        /* renamed from: f, reason: collision with root package name */
        public int f3312f;

        /* renamed from: g, reason: collision with root package name */
        public int f3313g;

        public c(ConstraintLayout constraintLayout) {
            this.f3307a = constraintLayout;
        }

        /* JADX WARN: Removed duplicated region for block: B:101:0x01fd A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:104:0x0212 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:107:0x0218  */
        /* JADX WARN: Removed duplicated region for block: B:109:0x021e  */
        /* JADX WARN: Removed duplicated region for block: B:112:0x0208 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:114:0x01f0  */
        /* JADX WARN: Removed duplicated region for block: B:115:0x01de  */
        /* JADX WARN: Removed duplicated region for block: B:116:0x01cf  */
        /* JADX WARN: Removed duplicated region for block: B:117:0x01c0  */
        /* JADX WARN: Removed duplicated region for block: B:123:0x013b  */
        /* JADX WARN: Removed duplicated region for block: B:124:0x0135  */
        /* JADX WARN: Removed duplicated region for block: B:145:0x0123  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00bd  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0133  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0139  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0143  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x014e  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x015a  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0166  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0182 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0235  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x023e  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x024e  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x0252  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0238  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x019a  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x01b9  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x01c8  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x01d9  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x01e3  */
        /* JADX WARN: Removed duplicated region for block: B:95:0x01eb  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x01f5  */
        @Override // u.b.InterfaceC0158b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a(t.e r21, u.b.a r22) {
            /*
                Method dump skipped, instructions count: 616
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.c.a(t.e, u.b$a):void");
        }

        @Override // u.b.InterfaceC0158b
        public final void b() {
            int childCount = this.f3307a.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                this.f3307a.getChildAt(i3);
            }
            int size = this.f3307a.f3217f.size();
            if (size > 0) {
                for (int i4 = 0; i4 < size; i4++) {
                    ((androidx.constraintlayout.widget.c) this.f3307a.f3217f.get(i4)).j(this.f3307a);
                }
            }
        }

        public void c(int i3, int i4, int i5, int i6, int i7, int i8) {
            this.f3308b = i5;
            this.f3309c = i6;
            this.f3310d = i7;
            this.f3311e = i8;
            this.f3312f = i3;
            this.f3313g = i4;
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3216e = new SparseArray();
        this.f3217f = new ArrayList(4);
        this.f3218g = new f();
        this.f3219h = 0;
        this.f3220i = 0;
        this.f3221j = Integer.MAX_VALUE;
        this.f3222k = Integer.MAX_VALUE;
        this.f3223l = true;
        this.f3224m = 263;
        this.f3225n = null;
        this.f3226o = null;
        this.f3227p = -1;
        this.f3228q = new HashMap();
        this.f3229r = -1;
        this.f3230s = -1;
        this.f3231t = -1;
        this.f3232u = -1;
        this.f3233v = 0;
        this.f3234w = 0;
        this.f3235x = new SparseArray();
        this.f3236y = new c(this);
        this.f3237z = 0;
        this.f3215A = 0;
        j(attributeSet, 0, 0);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int max2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        return max2 > 0 ? max2 : max;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i3, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i3, layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void c(boolean r17, android.view.View r18, t.e r19, androidx.constraintlayout.widget.ConstraintLayout.b r20, android.util.SparseArray r21) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.c(boolean, android.view.View, t.e, androidx.constraintlayout.widget.ConstraintLayout$b, android.util.SparseArray):void");
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    @Override // android.view.ViewGroup
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f3217f;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i3 = 0; i3 < size; i3++) {
                ((androidx.constraintlayout.widget.c) this.f3217f.get(i3)).k(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i5 = (int) ((parseInt / 1080.0f) * width);
                        int i6 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f3 = i5;
                        float f4 = i6;
                        float f5 = i5 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f3, f4, f5, f4, paint);
                        float parseInt4 = i6 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f5, f4, f5, parseInt4, paint);
                        canvas.drawLine(f5, parseInt4, f3, parseInt4, paint);
                        canvas.drawLine(f3, parseInt4, f3, f4, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f3, f4, f5, parseInt4, paint);
                        canvas.drawLine(f3, parseInt4, f5, f4, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public Object f(int i3, Object obj) {
        if (i3 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap hashMap = this.f3228q;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.f3228q.get(str);
    }

    @Override // android.view.View
    public void forceLayout() {
        l();
        super.forceLayout();
    }

    public final t.e g(int i3) {
        if (i3 == 0) {
            return this.f3218g;
        }
        View view = (View) this.f3216e.get(i3);
        if (view == null && (view = findViewById(i3)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.f3218g;
        }
        if (view == null) {
            return null;
        }
        return ((b) view.getLayoutParams()).f3292n0;
    }

    public int getMaxHeight() {
        return this.f3222k;
    }

    public int getMaxWidth() {
        return this.f3221j;
    }

    public int getMinHeight() {
        return this.f3220i;
    }

    public int getMinWidth() {
        return this.f3219h;
    }

    public int getOptimizationLevel() {
        return this.f3218g.V0();
    }

    public View h(int i3) {
        return (View) this.f3216e.get(i3);
    }

    public final t.e i(View view) {
        if (view == this) {
            return this.f3218g;
        }
        if (view == null) {
            return null;
        }
        return ((b) view.getLayoutParams()).f3292n0;
    }

    public final void j(AttributeSet attributeSet, int i3, int i4) {
        this.f3218g.c0(this);
        this.f3218g.f1(this.f3236y);
        this.f3216e.put(getId(), this);
        this.f3225n = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC0754d.f9768a1, i3, i4);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = obtainStyledAttributes.getIndex(i5);
                if (index == AbstractC0754d.f9808k1) {
                    this.f3219h = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3219h);
                } else if (index == AbstractC0754d.f9812l1) {
                    this.f3220i = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3220i);
                } else if (index == AbstractC0754d.f9800i1) {
                    this.f3221j = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3221j);
                } else if (index == AbstractC0754d.f9804j1) {
                    this.f3222k = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3222k);
                } else if (index == AbstractC0754d.f9714L2) {
                    this.f3224m = obtainStyledAttributes.getInt(index, this.f3224m);
                } else if (index == AbstractC0754d.f9717M1) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            m(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f3226o = null;
                        }
                    }
                } else if (index == AbstractC0754d.f9840s1) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        d dVar = new d();
                        this.f3225n = dVar;
                        dVar.k(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f3225n = null;
                    }
                    this.f3227p = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f3218g.g1(this.f3224m);
    }

    public boolean k() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    public final void l() {
        this.f3223l = true;
        this.f3229r = -1;
        this.f3230s = -1;
        this.f3231t = -1;
        this.f3232u = -1;
        this.f3233v = 0;
        this.f3234w = 0;
    }

    public void m(int i3) {
        this.f3226o = new C0751a(getContext(), this, i3);
    }

    public void n(int i3, int i4, int i5, int i6, boolean z3, boolean z4) {
        c cVar = this.f3236y;
        int i7 = cVar.f3311e;
        int resolveSizeAndState = View.resolveSizeAndState(i5 + cVar.f3310d, i3, 0);
        int resolveSizeAndState2 = View.resolveSizeAndState(i6 + i7, i4, 0) & 16777215;
        int min = Math.min(this.f3221j, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.f3222k, resolveSizeAndState2);
        if (z3) {
            min |= 16777216;
        }
        if (z4) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
        this.f3229r = min;
        this.f3230s = min2;
    }

    public void o(f fVar, int i3, int i4, int i5) {
        int i6;
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        int mode2 = View.MeasureSpec.getMode(i5);
        int size2 = View.MeasureSpec.getSize(i5);
        int max = Math.max(0, getPaddingTop());
        int max2 = Math.max(0, getPaddingBottom());
        int i7 = max + max2;
        int paddingWidth = getPaddingWidth();
        this.f3236y.c(i4, i5, max, max2, paddingWidth, i7);
        int max3 = Math.max(0, getPaddingStart());
        int max4 = Math.max(0, getPaddingEnd());
        if (max3 <= 0 && max4 <= 0) {
            max3 = Math.max(0, getPaddingLeft());
        } else if (k()) {
            i6 = max4;
            int i8 = size - paddingWidth;
            int i9 = size2 - i7;
            r(fVar, mode, i8, mode2, i9);
            fVar.c1(i3, mode, i8, mode2, i9, this.f3229r, this.f3230s, i6, max);
        }
        i6 = max3;
        int i82 = size - paddingWidth;
        int i92 = size2 - i7;
        r(fVar, mode, i82, mode2, i92);
        fVar.c1(i3, mode, i82, mode2, i92, this.f3229r, this.f3230s, i6, max);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i3, int i4, int i5, int i6) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            b bVar = (b) childAt.getLayoutParams();
            t.e eVar = bVar.f3292n0;
            if ((childAt.getVisibility() != 8 || bVar.f3264Z || bVar.f3266a0 || bVar.f3270c0 || isInEditMode) && !bVar.f3268b0) {
                int Q3 = eVar.Q();
                int R3 = eVar.R();
                childAt.layout(Q3, R3, eVar.P() + Q3, eVar.v() + R3);
            }
        }
        int size = this.f3217f.size();
        if (size > 0) {
            for (int i8 = 0; i8 < size; i8++) {
                ((androidx.constraintlayout.widget.c) this.f3217f.get(i8)).i(this);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i3, int i4) {
        this.f3237z = i3;
        this.f3215A = i4;
        this.f3218g.h1(k());
        if (this.f3223l) {
            this.f3223l = false;
            if (s()) {
                this.f3218g.j1();
            }
        }
        o(this.f3218g, this.f3224m, i3, i4);
        n(i3, i4, this.f3218g.P(), this.f3218g.v(), this.f3218g.b1(), this.f3218g.Z0());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        t.e i3 = i(view);
        if ((view instanceof e) && !(i3 instanceof h)) {
            b bVar = (b) view.getLayoutParams();
            h hVar = new h();
            bVar.f3292n0 = hVar;
            bVar.f3264Z = true;
            hVar.R0(bVar.f3257S);
        }
        if (view instanceof androidx.constraintlayout.widget.c) {
            androidx.constraintlayout.widget.c cVar = (androidx.constraintlayout.widget.c) view;
            cVar.m();
            ((b) view.getLayoutParams()).f3266a0 = true;
            if (!this.f3217f.contains(cVar)) {
                this.f3217f.add(cVar);
            }
        }
        this.f3216e.put(view.getId(), view);
        this.f3223l = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f3216e.remove(view.getId());
        this.f3218g.L0(i(view));
        this.f3217f.remove(view);
        this.f3223l = true;
    }

    public final void p() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            t.e i4 = i(getChildAt(i3));
            if (i4 != null) {
                i4.Y();
            }
        }
        if (isInEditMode) {
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    q(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    g(childAt.getId()).d0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.f3227p != -1) {
            for (int i6 = 0; i6 < childCount; i6++) {
                getChildAt(i6).getId();
            }
        }
        d dVar = this.f3225n;
        if (dVar != null) {
            dVar.d(this, true);
        }
        this.f3218g.M0();
        int size = this.f3217f.size();
        if (size > 0) {
            for (int i7 = 0; i7 < size; i7++) {
                ((androidx.constraintlayout.widget.c) this.f3217f.get(i7)).l(this);
            }
        }
        for (int i8 = 0; i8 < childCount; i8++) {
            getChildAt(i8);
        }
        this.f3235x.clear();
        this.f3235x.put(0, this.f3218g);
        this.f3235x.put(getId(), this.f3218g);
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt2 = getChildAt(i9);
            this.f3235x.put(childAt2.getId(), i(childAt2));
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt3 = getChildAt(i10);
            t.e i11 = i(childAt3);
            if (i11 != null) {
                b bVar = (b) childAt3.getLayoutParams();
                this.f3218g.c(i11);
                c(isInEditMode, childAt3, i11, bVar, this.f3235x);
            }
        }
    }

    public void q(int i3, Object obj, Object obj2) {
        if (i3 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f3228q == null) {
                this.f3228q = new HashMap();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            Integer num = (Integer) obj2;
            num.intValue();
            this.f3228q.put(str, num);
        }
    }

    public void r(f fVar, int i3, int i4, int i5, int i6) {
        e.b bVar;
        c cVar = this.f3236y;
        int i7 = cVar.f3311e;
        int i8 = cVar.f3310d;
        e.b bVar2 = e.b.FIXED;
        int childCount = getChildCount();
        if (i3 == Integer.MIN_VALUE) {
            bVar = e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i4 = Math.max(0, this.f3219h);
            }
        } else if (i3 == 0) {
            bVar = e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i4 = Math.max(0, this.f3219h);
            }
            i4 = 0;
        } else if (i3 != 1073741824) {
            bVar = bVar2;
            i4 = 0;
        } else {
            i4 = Math.min(this.f3221j - i8, i4);
            bVar = bVar2;
        }
        if (i5 == Integer.MIN_VALUE) {
            bVar2 = e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i6 = Math.max(0, this.f3220i);
            }
        } else if (i5 != 0) {
            if (i5 == 1073741824) {
                i6 = Math.min(this.f3222k - i7, i6);
            }
            i6 = 0;
        } else {
            bVar2 = e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i6 = Math.max(0, this.f3220i);
            }
            i6 = 0;
        }
        if (i4 != fVar.P() || i6 != fVar.v()) {
            fVar.Y0();
        }
        fVar.F0(0);
        fVar.G0(0);
        fVar.s0(this.f3221j - i8);
        fVar.r0(this.f3222k - i7);
        fVar.u0(0);
        fVar.t0(0);
        fVar.l0(bVar);
        fVar.E0(i4);
        fVar.A0(bVar2);
        fVar.h0(i6);
        fVar.u0(this.f3219h - i8);
        fVar.t0(this.f3220i - i7);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        super.removeView(view);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        l();
        super.requestLayout();
    }

    public final boolean s() {
        int childCount = getChildCount();
        boolean z3 = false;
        int i3 = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            if (getChildAt(i3).isLayoutRequested()) {
                z3 = true;
                break;
            }
            i3++;
        }
        if (z3) {
            p();
        }
        return z3;
    }

    public void setConstraintSet(d dVar) {
        this.f3225n = dVar;
    }

    @Override // android.view.View
    public void setId(int i3) {
        this.f3216e.remove(getId());
        super.setId(i3);
        this.f3216e.put(getId(), this);
    }

    public void setMaxHeight(int i3) {
        if (i3 == this.f3222k) {
            return;
        }
        this.f3222k = i3;
        requestLayout();
    }

    public void setMaxWidth(int i3) {
        if (i3 == this.f3221j) {
            return;
        }
        this.f3221j = i3;
        requestLayout();
    }

    public void setMinHeight(int i3) {
        if (i3 == this.f3220i) {
            return;
        }
        this.f3220i = i3;
        requestLayout();
    }

    public void setMinWidth(int i3) {
        if (i3 == this.f3219h) {
            return;
        }
        this.f3219h = i3;
        requestLayout();
    }

    public void setOnConstraintsChanged(AbstractC0752b abstractC0752b) {
        C0751a c0751a = this.f3226o;
        if (c0751a != null) {
            c0751a.c(abstractC0752b);
        }
    }

    public void setOptimizationLevel(int i3) {
        this.f3224m = i3;
        this.f3218g.g1(i3);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i3) {
        super(context, attributeSet, i3);
        this.f3216e = new SparseArray();
        this.f3217f = new ArrayList(4);
        this.f3218g = new f();
        this.f3219h = 0;
        this.f3220i = 0;
        this.f3221j = Integer.MAX_VALUE;
        this.f3222k = Integer.MAX_VALUE;
        this.f3223l = true;
        this.f3224m = 263;
        this.f3225n = null;
        this.f3226o = null;
        this.f3227p = -1;
        this.f3228q = new HashMap();
        this.f3229r = -1;
        this.f3230s = -1;
        this.f3231t = -1;
        this.f3232u = -1;
        this.f3233v = 0;
        this.f3234w = 0;
        this.f3235x = new SparseArray();
        this.f3236y = new c(this);
        this.f3237z = 0;
        this.f3215A = 0;
        j(attributeSet, i3, 0);
    }

    public static class b extends ViewGroup.MarginLayoutParams {

        /* renamed from: A, reason: collision with root package name */
        public float f3239A;

        /* renamed from: B, reason: collision with root package name */
        public String f3240B;

        /* renamed from: C, reason: collision with root package name */
        public float f3241C;

        /* renamed from: D, reason: collision with root package name */
        public int f3242D;

        /* renamed from: E, reason: collision with root package name */
        public float f3243E;

        /* renamed from: F, reason: collision with root package name */
        public float f3244F;

        /* renamed from: G, reason: collision with root package name */
        public int f3245G;

        /* renamed from: H, reason: collision with root package name */
        public int f3246H;

        /* renamed from: I, reason: collision with root package name */
        public int f3247I;

        /* renamed from: J, reason: collision with root package name */
        public int f3248J;

        /* renamed from: K, reason: collision with root package name */
        public int f3249K;

        /* renamed from: L, reason: collision with root package name */
        public int f3250L;

        /* renamed from: M, reason: collision with root package name */
        public int f3251M;

        /* renamed from: N, reason: collision with root package name */
        public int f3252N;

        /* renamed from: O, reason: collision with root package name */
        public float f3253O;

        /* renamed from: P, reason: collision with root package name */
        public float f3254P;

        /* renamed from: Q, reason: collision with root package name */
        public int f3255Q;

        /* renamed from: R, reason: collision with root package name */
        public int f3256R;

        /* renamed from: S, reason: collision with root package name */
        public int f3257S;

        /* renamed from: T, reason: collision with root package name */
        public boolean f3258T;

        /* renamed from: U, reason: collision with root package name */
        public boolean f3259U;

        /* renamed from: V, reason: collision with root package name */
        public String f3260V;

        /* renamed from: W, reason: collision with root package name */
        public boolean f3261W;

        /* renamed from: X, reason: collision with root package name */
        public boolean f3262X;

        /* renamed from: Y, reason: collision with root package name */
        public boolean f3263Y;

        /* renamed from: Z, reason: collision with root package name */
        public boolean f3264Z;

        /* renamed from: a, reason: collision with root package name */
        public int f3265a;

        /* renamed from: a0, reason: collision with root package name */
        public boolean f3266a0;

        /* renamed from: b, reason: collision with root package name */
        public int f3267b;

        /* renamed from: b0, reason: collision with root package name */
        public boolean f3268b0;

        /* renamed from: c, reason: collision with root package name */
        public float f3269c;

        /* renamed from: c0, reason: collision with root package name */
        public boolean f3270c0;

        /* renamed from: d, reason: collision with root package name */
        public int f3271d;

        /* renamed from: d0, reason: collision with root package name */
        public int f3272d0;

        /* renamed from: e, reason: collision with root package name */
        public int f3273e;

        /* renamed from: e0, reason: collision with root package name */
        public int f3274e0;

        /* renamed from: f, reason: collision with root package name */
        public int f3275f;

        /* renamed from: f0, reason: collision with root package name */
        public int f3276f0;

        /* renamed from: g, reason: collision with root package name */
        public int f3277g;

        /* renamed from: g0, reason: collision with root package name */
        public int f3278g0;

        /* renamed from: h, reason: collision with root package name */
        public int f3279h;

        /* renamed from: h0, reason: collision with root package name */
        public int f3280h0;

        /* renamed from: i, reason: collision with root package name */
        public int f3281i;

        /* renamed from: i0, reason: collision with root package name */
        public int f3282i0;

        /* renamed from: j, reason: collision with root package name */
        public int f3283j;

        /* renamed from: j0, reason: collision with root package name */
        public float f3284j0;

        /* renamed from: k, reason: collision with root package name */
        public int f3285k;

        /* renamed from: k0, reason: collision with root package name */
        public int f3286k0;

        /* renamed from: l, reason: collision with root package name */
        public int f3287l;

        /* renamed from: l0, reason: collision with root package name */
        public int f3288l0;

        /* renamed from: m, reason: collision with root package name */
        public int f3289m;

        /* renamed from: m0, reason: collision with root package name */
        public float f3290m0;

        /* renamed from: n, reason: collision with root package name */
        public int f3291n;

        /* renamed from: n0, reason: collision with root package name */
        public t.e f3292n0;

        /* renamed from: o, reason: collision with root package name */
        public float f3293o;

        /* renamed from: o0, reason: collision with root package name */
        public boolean f3294o0;

        /* renamed from: p, reason: collision with root package name */
        public int f3295p;

        /* renamed from: q, reason: collision with root package name */
        public int f3296q;

        /* renamed from: r, reason: collision with root package name */
        public int f3297r;

        /* renamed from: s, reason: collision with root package name */
        public int f3298s;

        /* renamed from: t, reason: collision with root package name */
        public int f3299t;

        /* renamed from: u, reason: collision with root package name */
        public int f3300u;

        /* renamed from: v, reason: collision with root package name */
        public int f3301v;

        /* renamed from: w, reason: collision with root package name */
        public int f3302w;

        /* renamed from: x, reason: collision with root package name */
        public int f3303x;

        /* renamed from: y, reason: collision with root package name */
        public int f3304y;

        /* renamed from: z, reason: collision with root package name */
        public float f3305z;

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            public static final SparseIntArray f3306a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f3306a = sparseIntArray;
                sparseIntArray.append(AbstractC0754d.f9813l2, 8);
                sparseIntArray.append(AbstractC0754d.f9817m2, 9);
                sparseIntArray.append(AbstractC0754d.f9825o2, 10);
                sparseIntArray.append(AbstractC0754d.f9829p2, 11);
                sparseIntArray.append(AbstractC0754d.f9853v2, 12);
                sparseIntArray.append(AbstractC0754d.f9849u2, 13);
                sparseIntArray.append(AbstractC0754d.f9745T1, 14);
                sparseIntArray.append(AbstractC0754d.f9741S1, 15);
                sparseIntArray.append(AbstractC0754d.f9733Q1, 16);
                sparseIntArray.append(AbstractC0754d.f9749U1, 2);
                sparseIntArray.append(AbstractC0754d.f9756W1, 3);
                sparseIntArray.append(AbstractC0754d.f9753V1, 4);
                sparseIntArray.append(AbstractC0754d.f9682D2, 49);
                sparseIntArray.append(AbstractC0754d.f9686E2, 50);
                sparseIntArray.append(AbstractC0754d.f9769a2, 5);
                sparseIntArray.append(AbstractC0754d.f9773b2, 6);
                sparseIntArray.append(AbstractC0754d.f9777c2, 7);
                sparseIntArray.append(AbstractC0754d.f9772b1, 1);
                sparseIntArray.append(AbstractC0754d.f9833q2, 17);
                sparseIntArray.append(AbstractC0754d.f9837r2, 18);
                sparseIntArray.append(AbstractC0754d.f9765Z1, 19);
                sparseIntArray.append(AbstractC0754d.f9762Y1, 20);
                sparseIntArray.append(AbstractC0754d.f9698H2, 21);
                sparseIntArray.append(AbstractC0754d.f9710K2, 22);
                sparseIntArray.append(AbstractC0754d.f9702I2, 23);
                sparseIntArray.append(AbstractC0754d.f9690F2, 24);
                sparseIntArray.append(AbstractC0754d.f9706J2, 25);
                sparseIntArray.append(AbstractC0754d.f9694G2, 26);
                sparseIntArray.append(AbstractC0754d.f9797h2, 29);
                sparseIntArray.append(AbstractC0754d.f9857w2, 30);
                sparseIntArray.append(AbstractC0754d.f9759X1, 44);
                sparseIntArray.append(AbstractC0754d.f9805j2, 45);
                sparseIntArray.append(AbstractC0754d.f9865y2, 46);
                sparseIntArray.append(AbstractC0754d.f9801i2, 47);
                sparseIntArray.append(AbstractC0754d.f9861x2, 48);
                sparseIntArray.append(AbstractC0754d.f9725O1, 27);
                sparseIntArray.append(AbstractC0754d.f9721N1, 28);
                sparseIntArray.append(AbstractC0754d.f9869z2, 31);
                sparseIntArray.append(AbstractC0754d.f9781d2, 32);
                sparseIntArray.append(AbstractC0754d.f9674B2, 33);
                sparseIntArray.append(AbstractC0754d.f9670A2, 34);
                sparseIntArray.append(AbstractC0754d.f9678C2, 35);
                sparseIntArray.append(AbstractC0754d.f9789f2, 36);
                sparseIntArray.append(AbstractC0754d.f9785e2, 37);
                sparseIntArray.append(AbstractC0754d.f9793g2, 38);
                sparseIntArray.append(AbstractC0754d.f9809k2, 39);
                sparseIntArray.append(AbstractC0754d.f9845t2, 40);
                sparseIntArray.append(AbstractC0754d.f9821n2, 41);
                sparseIntArray.append(AbstractC0754d.f9737R1, 42);
                sparseIntArray.append(AbstractC0754d.f9729P1, 43);
                sparseIntArray.append(AbstractC0754d.f9841s2, 51);
            }
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            int i3;
            this.f3265a = -1;
            this.f3267b = -1;
            this.f3269c = -1.0f;
            this.f3271d = -1;
            this.f3273e = -1;
            this.f3275f = -1;
            this.f3277g = -1;
            this.f3279h = -1;
            this.f3281i = -1;
            this.f3283j = -1;
            this.f3285k = -1;
            this.f3287l = -1;
            this.f3289m = -1;
            this.f3291n = 0;
            this.f3293o = 0.0f;
            this.f3295p = -1;
            this.f3296q = -1;
            this.f3297r = -1;
            this.f3298s = -1;
            this.f3299t = -1;
            this.f3300u = -1;
            this.f3301v = -1;
            this.f3302w = -1;
            this.f3303x = -1;
            this.f3304y = -1;
            this.f3305z = 0.5f;
            this.f3239A = 0.5f;
            this.f3240B = null;
            this.f3241C = 0.0f;
            this.f3242D = 1;
            this.f3243E = -1.0f;
            this.f3244F = -1.0f;
            this.f3245G = 0;
            this.f3246H = 0;
            this.f3247I = 0;
            this.f3248J = 0;
            this.f3249K = 0;
            this.f3250L = 0;
            this.f3251M = 0;
            this.f3252N = 0;
            this.f3253O = 1.0f;
            this.f3254P = 1.0f;
            this.f3255Q = -1;
            this.f3256R = -1;
            this.f3257S = -1;
            this.f3258T = false;
            this.f3259U = false;
            this.f3260V = null;
            this.f3261W = true;
            this.f3262X = true;
            this.f3263Y = false;
            this.f3264Z = false;
            this.f3266a0 = false;
            this.f3268b0 = false;
            this.f3270c0 = false;
            this.f3272d0 = -1;
            this.f3274e0 = -1;
            this.f3276f0 = -1;
            this.f3278g0 = -1;
            this.f3280h0 = -1;
            this.f3282i0 = -1;
            this.f3284j0 = 0.5f;
            this.f3292n0 = new t.e();
            this.f3294o0 = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0754d.f9768a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                int i5 = a.f3306a.get(index);
                switch (i5) {
                    case 1:
                        this.f3257S = obtainStyledAttributes.getInt(index, this.f3257S);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f3289m);
                        this.f3289m = resourceId;
                        if (resourceId == -1) {
                            this.f3289m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        this.f3291n = obtainStyledAttributes.getDimensionPixelSize(index, this.f3291n);
                        break;
                    case 4:
                        float f3 = obtainStyledAttributes.getFloat(index, this.f3293o) % 360.0f;
                        this.f3293o = f3;
                        if (f3 < 0.0f) {
                            this.f3293o = (360.0f - f3) % 360.0f;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        this.f3265a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3265a);
                        break;
                    case 6:
                        this.f3267b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3267b);
                        break;
                    case 7:
                        this.f3269c = obtainStyledAttributes.getFloat(index, this.f3269c);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f3271d);
                        this.f3271d = resourceId2;
                        if (resourceId2 == -1) {
                            this.f3271d = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f3273e);
                        this.f3273e = resourceId3;
                        if (resourceId3 == -1) {
                            this.f3273e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f3275f);
                        this.f3275f = resourceId4;
                        if (resourceId4 == -1) {
                            this.f3275f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f3277g);
                        this.f3277g = resourceId5;
                        if (resourceId5 == -1) {
                            this.f3277g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f3279h);
                        this.f3279h = resourceId6;
                        if (resourceId6 == -1) {
                            this.f3279h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f3281i);
                        this.f3281i = resourceId7;
                        if (resourceId7 == -1) {
                            this.f3281i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f3283j);
                        this.f3283j = resourceId8;
                        if (resourceId8 == -1) {
                            this.f3283j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f3285k);
                        this.f3285k = resourceId9;
                        if (resourceId9 == -1) {
                            this.f3285k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f3287l);
                        this.f3287l = resourceId10;
                        if (resourceId10 == -1) {
                            this.f3287l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f3295p);
                        this.f3295p = resourceId11;
                        if (resourceId11 == -1) {
                            this.f3295p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f3296q);
                        this.f3296q = resourceId12;
                        if (resourceId12 == -1) {
                            this.f3296q = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f3297r);
                        this.f3297r = resourceId13;
                        if (resourceId13 == -1) {
                            this.f3297r = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f3298s);
                        this.f3298s = resourceId14;
                        if (resourceId14 == -1) {
                            this.f3298s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 21:
                        this.f3299t = obtainStyledAttributes.getDimensionPixelSize(index, this.f3299t);
                        break;
                    case 22:
                        this.f3300u = obtainStyledAttributes.getDimensionPixelSize(index, this.f3300u);
                        break;
                    case 23:
                        this.f3301v = obtainStyledAttributes.getDimensionPixelSize(index, this.f3301v);
                        break;
                    case 24:
                        this.f3302w = obtainStyledAttributes.getDimensionPixelSize(index, this.f3302w);
                        break;
                    case 25:
                        this.f3303x = obtainStyledAttributes.getDimensionPixelSize(index, this.f3303x);
                        break;
                    case 26:
                        this.f3304y = obtainStyledAttributes.getDimensionPixelSize(index, this.f3304y);
                        break;
                    case 27:
                        this.f3258T = obtainStyledAttributes.getBoolean(index, this.f3258T);
                        break;
                    case 28:
                        this.f3259U = obtainStyledAttributes.getBoolean(index, this.f3259U);
                        break;
                    case 29:
                        this.f3305z = obtainStyledAttributes.getFloat(index, this.f3305z);
                        break;
                    case 30:
                        this.f3239A = obtainStyledAttributes.getFloat(index, this.f3239A);
                        break;
                    case 31:
                        int i6 = obtainStyledAttributes.getInt(index, 0);
                        this.f3247I = i6;
                        if (i6 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 32:
                        int i7 = obtainStyledAttributes.getInt(index, 0);
                        this.f3248J = i7;
                        if (i7 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 33:
                        try {
                            this.f3249K = obtainStyledAttributes.getDimensionPixelSize(index, this.f3249K);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.f3249K) == -2) {
                                this.f3249K = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.f3251M = obtainStyledAttributes.getDimensionPixelSize(index, this.f3251M);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.f3251M) == -2) {
                                this.f3251M = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 35:
                        this.f3253O = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f3253O));
                        this.f3247I = 2;
                        break;
                    case 36:
                        try {
                            this.f3250L = obtainStyledAttributes.getDimensionPixelSize(index, this.f3250L);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.f3250L) == -2) {
                                this.f3250L = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.f3252N = obtainStyledAttributes.getDimensionPixelSize(index, this.f3252N);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.f3252N) == -2) {
                                this.f3252N = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 38:
                        this.f3254P = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f3254P));
                        this.f3248J = 2;
                        break;
                    default:
                        switch (i5) {
                            case 44:
                                String string = obtainStyledAttributes.getString(index);
                                this.f3240B = string;
                                this.f3241C = Float.NaN;
                                this.f3242D = -1;
                                if (string != null) {
                                    int length = string.length();
                                    int indexOf = this.f3240B.indexOf(44);
                                    if (indexOf <= 0 || indexOf >= length - 1) {
                                        i3 = 0;
                                    } else {
                                        String substring = this.f3240B.substring(0, indexOf);
                                        if (substring.equalsIgnoreCase("W")) {
                                            this.f3242D = 0;
                                        } else if (substring.equalsIgnoreCase("H")) {
                                            this.f3242D = 1;
                                        }
                                        i3 = indexOf + 1;
                                    }
                                    int indexOf2 = this.f3240B.indexOf(58);
                                    if (indexOf2 < 0 || indexOf2 >= length - 1) {
                                        String substring2 = this.f3240B.substring(i3);
                                        if (substring2.length() > 0) {
                                            this.f3241C = Float.parseFloat(substring2);
                                            break;
                                        } else {
                                            break;
                                        }
                                    } else {
                                        String substring3 = this.f3240B.substring(i3, indexOf2);
                                        String substring4 = this.f3240B.substring(indexOf2 + 1);
                                        if (substring3.length() > 0 && substring4.length() > 0) {
                                            try {
                                                float parseFloat = Float.parseFloat(substring3);
                                                float parseFloat2 = Float.parseFloat(substring4);
                                                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                                                    if (this.f3242D == 1) {
                                                        this.f3241C = Math.abs(parseFloat2 / parseFloat);
                                                        break;
                                                    } else {
                                                        this.f3241C = Math.abs(parseFloat / parseFloat2);
                                                        break;
                                                    }
                                                }
                                            } catch (NumberFormatException unused5) {
                                                break;
                                            }
                                        }
                                    }
                                } else {
                                    break;
                                }
                                break;
                            case 45:
                                this.f3243E = obtainStyledAttributes.getFloat(index, this.f3243E);
                                break;
                            case 46:
                                this.f3244F = obtainStyledAttributes.getFloat(index, this.f3244F);
                                break;
                            case 47:
                                this.f3245G = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.f3246H = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.f3255Q = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3255Q);
                                break;
                            case 50:
                                this.f3256R = obtainStyledAttributes.getDimensionPixelOffset(index, this.f3256R);
                                break;
                            case 51:
                                this.f3260V = obtainStyledAttributes.getString(index);
                                break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
            a();
        }

        public void a() {
            this.f3264Z = false;
            this.f3261W = true;
            this.f3262X = true;
            int i3 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i3 == -2 && this.f3258T) {
                this.f3261W = false;
                if (this.f3247I == 0) {
                    this.f3247I = 1;
                }
            }
            int i4 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i4 == -2 && this.f3259U) {
                this.f3262X = false;
                if (this.f3248J == 0) {
                    this.f3248J = 1;
                }
            }
            if (i3 == 0 || i3 == -1) {
                this.f3261W = false;
                if (i3 == 0 && this.f3247I == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f3258T = true;
                }
            }
            if (i4 == 0 || i4 == -1) {
                this.f3262X = false;
                if (i4 == 0 && this.f3248J == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f3259U = true;
                }
            }
            if (this.f3269c == -1.0f && this.f3265a == -1 && this.f3267b == -1) {
                return;
            }
            this.f3264Z = true;
            this.f3261W = true;
            this.f3262X = true;
            if (!(this.f3292n0 instanceof h)) {
                this.f3292n0 = new h();
            }
            ((h) this.f3292n0).R0(this.f3257S);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x007c  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void resolveLayoutDirection(int r10) {
            /*
                Method dump skipped, instructions count: 253
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.b.resolveLayoutDirection(int):void");
        }

        public b(int i3, int i4) {
            super(i3, i4);
            this.f3265a = -1;
            this.f3267b = -1;
            this.f3269c = -1.0f;
            this.f3271d = -1;
            this.f3273e = -1;
            this.f3275f = -1;
            this.f3277g = -1;
            this.f3279h = -1;
            this.f3281i = -1;
            this.f3283j = -1;
            this.f3285k = -1;
            this.f3287l = -1;
            this.f3289m = -1;
            this.f3291n = 0;
            this.f3293o = 0.0f;
            this.f3295p = -1;
            this.f3296q = -1;
            this.f3297r = -1;
            this.f3298s = -1;
            this.f3299t = -1;
            this.f3300u = -1;
            this.f3301v = -1;
            this.f3302w = -1;
            this.f3303x = -1;
            this.f3304y = -1;
            this.f3305z = 0.5f;
            this.f3239A = 0.5f;
            this.f3240B = null;
            this.f3241C = 0.0f;
            this.f3242D = 1;
            this.f3243E = -1.0f;
            this.f3244F = -1.0f;
            this.f3245G = 0;
            this.f3246H = 0;
            this.f3247I = 0;
            this.f3248J = 0;
            this.f3249K = 0;
            this.f3250L = 0;
            this.f3251M = 0;
            this.f3252N = 0;
            this.f3253O = 1.0f;
            this.f3254P = 1.0f;
            this.f3255Q = -1;
            this.f3256R = -1;
            this.f3257S = -1;
            this.f3258T = false;
            this.f3259U = false;
            this.f3260V = null;
            this.f3261W = true;
            this.f3262X = true;
            this.f3263Y = false;
            this.f3264Z = false;
            this.f3266a0 = false;
            this.f3268b0 = false;
            this.f3270c0 = false;
            this.f3272d0 = -1;
            this.f3274e0 = -1;
            this.f3276f0 = -1;
            this.f3278g0 = -1;
            this.f3280h0 = -1;
            this.f3282i0 = -1;
            this.f3284j0 = 0.5f;
            this.f3292n0 = new t.e();
            this.f3294o0 = false;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3265a = -1;
            this.f3267b = -1;
            this.f3269c = -1.0f;
            this.f3271d = -1;
            this.f3273e = -1;
            this.f3275f = -1;
            this.f3277g = -1;
            this.f3279h = -1;
            this.f3281i = -1;
            this.f3283j = -1;
            this.f3285k = -1;
            this.f3287l = -1;
            this.f3289m = -1;
            this.f3291n = 0;
            this.f3293o = 0.0f;
            this.f3295p = -1;
            this.f3296q = -1;
            this.f3297r = -1;
            this.f3298s = -1;
            this.f3299t = -1;
            this.f3300u = -1;
            this.f3301v = -1;
            this.f3302w = -1;
            this.f3303x = -1;
            this.f3304y = -1;
            this.f3305z = 0.5f;
            this.f3239A = 0.5f;
            this.f3240B = null;
            this.f3241C = 0.0f;
            this.f3242D = 1;
            this.f3243E = -1.0f;
            this.f3244F = -1.0f;
            this.f3245G = 0;
            this.f3246H = 0;
            this.f3247I = 0;
            this.f3248J = 0;
            this.f3249K = 0;
            this.f3250L = 0;
            this.f3251M = 0;
            this.f3252N = 0;
            this.f3253O = 1.0f;
            this.f3254P = 1.0f;
            this.f3255Q = -1;
            this.f3256R = -1;
            this.f3257S = -1;
            this.f3258T = false;
            this.f3259U = false;
            this.f3260V = null;
            this.f3261W = true;
            this.f3262X = true;
            this.f3263Y = false;
            this.f3264Z = false;
            this.f3266a0 = false;
            this.f3268b0 = false;
            this.f3270c0 = false;
            this.f3272d0 = -1;
            this.f3274e0 = -1;
            this.f3276f0 = -1;
            this.f3278g0 = -1;
            this.f3280h0 = -1;
            this.f3282i0 = -1;
            this.f3284j0 = 0.5f;
            this.f3292n0 = new t.e();
            this.f3294o0 = false;
        }
    }
}
