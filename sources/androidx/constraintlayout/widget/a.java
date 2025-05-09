package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import t.C0723a;
import v.AbstractC0754d;

/* loaded from: classes.dex */
public class a extends c {

    /* renamed from: m, reason: collision with root package name */
    public int f3315m;

    /* renamed from: n, reason: collision with root package name */
    public int f3316n;

    /* renamed from: o, reason: collision with root package name */
    public C0723a f3317o;

    public a(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // androidx.constraintlayout.widget.c
    public void g(AttributeSet attributeSet) {
        super.g(attributeSet);
        this.f3317o = new C0723a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC0754d.f9768a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == AbstractC0754d.f9832q1) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == AbstractC0754d.f9828p1) {
                    this.f3317o.O0(obtainStyledAttributes.getBoolean(index, true));
                } else if (index == AbstractC0754d.f9836r1) {
                    this.f3317o.Q0(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
        }
        this.f3337h = this.f3317o;
        m();
    }

    public int getMargin() {
        return this.f3317o.M0();
    }

    public int getType() {
        return this.f3315m;
    }

    @Override // androidx.constraintlayout.widget.c
    public void h(t.e eVar, boolean z3) {
        o(eVar, this.f3315m, z3);
    }

    public boolean n() {
        return this.f3317o.K0();
    }

    public final void o(t.e eVar, int i3, boolean z3) {
        this.f3316n = i3;
        if (z3) {
            int i4 = this.f3315m;
            if (i4 == 5) {
                this.f3316n = 1;
            } else if (i4 == 6) {
                this.f3316n = 0;
            }
        } else {
            int i5 = this.f3315m;
            if (i5 == 5) {
                this.f3316n = 0;
            } else if (i5 == 6) {
                this.f3316n = 1;
            }
        }
        if (eVar instanceof C0723a) {
            ((C0723a) eVar).P0(this.f3316n);
        }
    }

    public void setAllowsGoneWidget(boolean z3) {
        this.f3317o.O0(z3);
    }

    public void setDpMargin(int i3) {
        this.f3317o.Q0((int) ((i3 * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i3) {
        this.f3317o.Q0(i3);
    }

    public void setType(int i3) {
        this.f3315m = i3;
    }
}
