package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;
import t.i;
import v.AbstractC0753c;
import v.AbstractC0754d;

/* loaded from: classes.dex */
public abstract class c extends View {

    /* renamed from: e, reason: collision with root package name */
    public int[] f3334e;

    /* renamed from: f, reason: collision with root package name */
    public int f3335f;

    /* renamed from: g, reason: collision with root package name */
    public Context f3336g;

    /* renamed from: h, reason: collision with root package name */
    public i f3337h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3338i;

    /* renamed from: j, reason: collision with root package name */
    public String f3339j;

    /* renamed from: k, reason: collision with root package name */
    public View[] f3340k;

    /* renamed from: l, reason: collision with root package name */
    public HashMap f3341l;

    public c(Context context) {
        super(context);
        this.f3334e = new int[32];
        this.f3338i = false;
        this.f3340k = null;
        this.f3341l = new HashMap();
        this.f3336g = context;
        g(null);
    }

    public final void a(String str) {
        if (str == null || str.length() == 0 || this.f3336g == null) {
            return;
        }
        String trim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        int f3 = f(trim);
        if (f3 != 0) {
            this.f3341l.put(Integer.valueOf(f3), trim);
            b(f3);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
    }

    public final void b(int i3) {
        if (i3 == getId()) {
            return;
        }
        int i4 = this.f3335f + 1;
        int[] iArr = this.f3334e;
        if (i4 > iArr.length) {
            this.f3334e = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f3334e;
        int i5 = this.f3335f;
        iArr2[i5] = i3;
        this.f3335f = i5 + 1;
    }

    public void c() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        d((ConstraintLayout) parent);
    }

    public void d(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i3 = 0; i3 < this.f3335f; i3++) {
            View h3 = constraintLayout.h(this.f3334e[i3]);
            if (h3 != null) {
                h3.setVisibility(visibility);
                if (elevation > 0.0f) {
                    h3.setTranslationZ(h3.getTranslationZ() + elevation);
                }
            }
        }
    }

    public final int e(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str == null || constraintLayout == null || (resources = this.f3336g.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = constraintLayout.getChildAt(i3);
            if (childAt.getId() != -1) {
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    str2 = null;
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public final int f(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int i3 = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object f3 = constraintLayout.f(0, str);
            if (f3 instanceof Integer) {
                i3 = ((Integer) f3).intValue();
            }
        }
        if (i3 == 0 && constraintLayout != null) {
            i3 = e(constraintLayout, str);
        }
        if (i3 == 0) {
            try {
                i3 = AbstractC0753c.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return i3 == 0 ? this.f3336g.getResources().getIdentifier(str, "id", this.f3336g.getPackageName()) : i3;
    }

    public void g(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC0754d.f9768a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == AbstractC0754d.f9844t1) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f3339j = string;
                    setIds(string);
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f3334e, this.f3335f);
    }

    public abstract void h(t.e eVar, boolean z3);

    public void i(ConstraintLayout constraintLayout) {
    }

    public void j(ConstraintLayout constraintLayout) {
    }

    public void k(ConstraintLayout constraintLayout) {
    }

    public void l(ConstraintLayout constraintLayout) {
        String str;
        int e3;
        if (isInEditMode()) {
            setIds(this.f3339j);
        }
        i iVar = this.f3337h;
        if (iVar == null) {
            return;
        }
        iVar.b();
        for (int i3 = 0; i3 < this.f3335f; i3++) {
            int i4 = this.f3334e[i3];
            View h3 = constraintLayout.h(i4);
            if (h3 == null && (e3 = e(constraintLayout, (str = (String) this.f3341l.get(Integer.valueOf(i4))))) != 0) {
                this.f3334e[i3] = e3;
                this.f3341l.put(Integer.valueOf(e3), str);
                h3 = constraintLayout.h(e3);
            }
            if (h3 != null) {
                this.f3337h.c(constraintLayout.i(h3));
            }
        }
        this.f3337h.a(constraintLayout.f3218g);
    }

    public void m() {
        if (this.f3337h == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            ((ConstraintLayout.b) layoutParams).f3292n0 = (t.e) this.f3337h;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f3339j;
        if (str != null) {
            setIds(str);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i3, int i4) {
        if (this.f3338i) {
            super.onMeasure(i3, i4);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void setIds(String str) {
        this.f3339j = str;
        if (str == null) {
            return;
        }
        int i3 = 0;
        this.f3335f = 0;
        while (true) {
            int indexOf = str.indexOf(44, i3);
            if (indexOf == -1) {
                a(str.substring(i3));
                return;
            } else {
                a(str.substring(i3, indexOf));
                i3 = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f3339j = null;
        this.f3335f = 0;
        for (int i3 : iArr) {
            b(i3);
        }
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3334e = new int[32];
        this.f3338i = false;
        this.f3340k = null;
        this.f3341l = new HashMap();
        this.f3336g = context;
        g(attributeSet);
    }
}
