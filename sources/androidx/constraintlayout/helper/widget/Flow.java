package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import t.e;
import t.g;
import t.l;
import v.AbstractC0754d;
import v.AbstractC0755e;

/* loaded from: classes.dex */
public class Flow extends AbstractC0755e {

    /* renamed from: o, reason: collision with root package name */
    public g f3214o;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // v.AbstractC0755e, androidx.constraintlayout.widget.c
    public void g(AttributeSet attributeSet) {
        super.g(attributeSet);
        this.f3214o = new g();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC0754d.f9768a1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == AbstractC0754d.f9772b1) {
                    this.f3214o.S1(obtainStyledAttributes.getInt(index, 0));
                } else if (index == AbstractC0754d.f9776c1) {
                    this.f3214o.Y0(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == AbstractC0754d.f9816m1) {
                    this.f3214o.d1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == AbstractC0754d.f9820n1) {
                    this.f3214o.a1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == AbstractC0754d.f9780d1) {
                    this.f3214o.b1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == AbstractC0754d.f9784e1) {
                    this.f3214o.e1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == AbstractC0754d.f9788f1) {
                    this.f3214o.c1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == AbstractC0754d.f9792g1) {
                    this.f3214o.Z0(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == AbstractC0754d.f9713L1) {
                    this.f3214o.X1(obtainStyledAttributes.getInt(index, 0));
                } else if (index == AbstractC0754d.f9673B1) {
                    this.f3214o.M1(obtainStyledAttributes.getInt(index, 0));
                } else if (index == AbstractC0754d.f9709K1) {
                    this.f3214o.W1(obtainStyledAttributes.getInt(index, 0));
                } else if (index == AbstractC0754d.f9852v1) {
                    this.f3214o.G1(obtainStyledAttributes.getInt(index, 0));
                } else if (index == AbstractC0754d.f9681D1) {
                    this.f3214o.O1(obtainStyledAttributes.getInt(index, 0));
                } else if (index == AbstractC0754d.f9860x1) {
                    this.f3214o.I1(obtainStyledAttributes.getInt(index, 0));
                } else if (index == AbstractC0754d.f9689F1) {
                    this.f3214o.Q1(obtainStyledAttributes.getInt(index, 0));
                } else if (index == AbstractC0754d.f9868z1) {
                    this.f3214o.K1(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == AbstractC0754d.f9848u1) {
                    this.f3214o.F1(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == AbstractC0754d.f9677C1) {
                    this.f3214o.N1(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == AbstractC0754d.f9856w1) {
                    this.f3214o.H1(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == AbstractC0754d.f9685E1) {
                    this.f3214o.P1(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == AbstractC0754d.f9701I1) {
                    this.f3214o.U1(obtainStyledAttributes.getFloat(index, 0.5f));
                } else if (index == AbstractC0754d.f9864y1) {
                    this.f3214o.J1(obtainStyledAttributes.getInt(index, 2));
                } else if (index == AbstractC0754d.f9697H1) {
                    this.f3214o.T1(obtainStyledAttributes.getInt(index, 2));
                } else if (index == AbstractC0754d.f9669A1) {
                    this.f3214o.L1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == AbstractC0754d.f9705J1) {
                    this.f3214o.V1(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                } else if (index == AbstractC0754d.f9693G1) {
                    this.f3214o.R1(obtainStyledAttributes.getInt(index, -1));
                }
            }
        }
        this.f3337h = this.f3214o;
        m();
    }

    @Override // androidx.constraintlayout.widget.c
    public void h(e eVar, boolean z3) {
        this.f3214o.K0(z3);
    }

    @Override // v.AbstractC0755e
    public void n(l lVar, int i3, int i4) {
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i3);
        int mode2 = View.MeasureSpec.getMode(i4);
        int size2 = View.MeasureSpec.getSize(i4);
        if (lVar == null) {
            setMeasuredDimension(0, 0);
        } else {
            lVar.S0(mode, size, mode2, size2);
            setMeasuredDimension(lVar.N0(), lVar.M0());
        }
    }

    @Override // androidx.constraintlayout.widget.c, android.view.View
    public void onMeasure(int i3, int i4) {
        n(this.f3214o, i3, i4);
    }

    public void setFirstHorizontalBias(float f3) {
        this.f3214o.F1(f3);
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i3) {
        this.f3214o.G1(i3);
        requestLayout();
    }

    public void setFirstVerticalBias(float f3) {
        this.f3214o.H1(f3);
        requestLayout();
    }

    public void setFirstVerticalStyle(int i3) {
        this.f3214o.I1(i3);
        requestLayout();
    }

    public void setHorizontalAlign(int i3) {
        this.f3214o.J1(i3);
        requestLayout();
    }

    public void setHorizontalBias(float f3) {
        this.f3214o.K1(f3);
        requestLayout();
    }

    public void setHorizontalGap(int i3) {
        this.f3214o.L1(i3);
        requestLayout();
    }

    public void setHorizontalStyle(int i3) {
        this.f3214o.M1(i3);
        requestLayout();
    }

    public void setMaxElementsWrap(int i3) {
        this.f3214o.R1(i3);
        requestLayout();
    }

    public void setOrientation(int i3) {
        this.f3214o.S1(i3);
        requestLayout();
    }

    public void setPadding(int i3) {
        this.f3214o.Y0(i3);
        requestLayout();
    }

    public void setPaddingBottom(int i3) {
        this.f3214o.Z0(i3);
        requestLayout();
    }

    public void setPaddingLeft(int i3) {
        this.f3214o.b1(i3);
        requestLayout();
    }

    public void setPaddingRight(int i3) {
        this.f3214o.c1(i3);
        requestLayout();
    }

    public void setPaddingTop(int i3) {
        this.f3214o.e1(i3);
        requestLayout();
    }

    public void setVerticalAlign(int i3) {
        this.f3214o.T1(i3);
        requestLayout();
    }

    public void setVerticalBias(float f3) {
        this.f3214o.U1(f3);
        requestLayout();
    }

    public void setVerticalGap(int i3) {
        this.f3214o.V1(i3);
        requestLayout();
    }

    public void setVerticalStyle(int i3) {
        this.f3214o.W1(i3);
        requestLayout();
    }

    public void setWrapMode(int i3) {
        this.f3214o.X1(i3);
        requestLayout();
    }
}
