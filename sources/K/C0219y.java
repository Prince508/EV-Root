package K;

import android.view.View;
import android.view.ViewParent;

/* renamed from: K.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0219y {

    /* renamed from: a, reason: collision with root package name */
    public ViewParent f1066a;

    /* renamed from: b, reason: collision with root package name */
    public ViewParent f1067b;

    /* renamed from: c, reason: collision with root package name */
    public final View f1068c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1069d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f1070e;

    public C0219y(View view) {
        this.f1068c = view;
    }

    public boolean a(float f3, float f4, boolean z3) {
        ViewParent h3;
        if (!l() || (h3 = h(0)) == null) {
            return false;
        }
        return V.a(h3, this.f1068c, f3, f4, z3);
    }

    public boolean b(float f3, float f4) {
        ViewParent h3;
        if (!l() || (h3 = h(0)) == null) {
            return false;
        }
        return V.b(h3, this.f1068c, f3, f4);
    }

    public boolean c(int i3, int i4, int[] iArr, int[] iArr2) {
        return d(i3, i4, iArr, iArr2, 0);
    }

    public boolean d(int i3, int i4, int[] iArr, int[] iArr2, int i5) {
        ViewParent h3;
        int i6;
        int i7;
        if (!l() || (h3 = h(i5)) == null) {
            return false;
        }
        if (i3 == 0 && i4 == 0) {
            if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
            return false;
        }
        if (iArr2 != null) {
            this.f1068c.getLocationInWindow(iArr2);
            i6 = iArr2[0];
            i7 = iArr2[1];
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (iArr == null) {
            iArr = i();
        }
        int[] iArr3 = iArr;
        iArr3[0] = 0;
        iArr3[1] = 0;
        V.c(h3, this.f1068c, i3, i4, iArr3, i5);
        if (iArr2 != null) {
            this.f1068c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i6;
            iArr2[1] = iArr2[1] - i7;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public void e(int i3, int i4, int i5, int i6, int[] iArr, int i7, int[] iArr2) {
        g(i3, i4, i5, i6, iArr, i7, iArr2);
    }

    public boolean f(int i3, int i4, int i5, int i6, int[] iArr) {
        return g(i3, i4, i5, i6, iArr, 0, null);
    }

    public final boolean g(int i3, int i4, int i5, int i6, int[] iArr, int i7, int[] iArr2) {
        ViewParent h3;
        int i8;
        int i9;
        int[] iArr3;
        if (!l() || (h3 = h(i7)) == null) {
            return false;
        }
        if (i3 == 0 && i4 == 0 && i5 == 0 && i6 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f1068c.getLocationInWindow(iArr);
            i8 = iArr[0];
            i9 = iArr[1];
        } else {
            i8 = 0;
            i9 = 0;
        }
        if (iArr2 == null) {
            int[] i10 = i();
            i10[0] = 0;
            i10[1] = 0;
            iArr3 = i10;
        } else {
            iArr3 = iArr2;
        }
        V.d(h3, this.f1068c, i3, i4, i5, i6, i7, iArr3);
        if (iArr != null) {
            this.f1068c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i8;
            iArr[1] = iArr[1] - i9;
        }
        return true;
    }

    public final ViewParent h(int i3) {
        if (i3 == 0) {
            return this.f1066a;
        }
        if (i3 != 1) {
            return null;
        }
        return this.f1067b;
    }

    public final int[] i() {
        if (this.f1070e == null) {
            this.f1070e = new int[2];
        }
        return this.f1070e;
    }

    public boolean j() {
        return k(0);
    }

    public boolean k(int i3) {
        return h(i3) != null;
    }

    public boolean l() {
        return this.f1069d;
    }

    public void m(boolean z3) {
        if (this.f1069d) {
            O.D0(this.f1068c);
        }
        this.f1069d = z3;
    }

    public final void n(int i3, ViewParent viewParent) {
        if (i3 == 0) {
            this.f1066a = viewParent;
        } else {
            if (i3 != 1) {
                return;
            }
            this.f1067b = viewParent;
        }
    }

    public boolean o(int i3) {
        return p(i3, 0);
    }

    public boolean p(int i3, int i4) {
        if (k(i4)) {
            return true;
        }
        if (!l()) {
            return false;
        }
        View view = this.f1068c;
        for (ViewParent parent = this.f1068c.getParent(); parent != null; parent = parent.getParent()) {
            if (V.f(parent, view, this.f1068c, i3, i4)) {
                n(i4, parent);
                V.e(parent, view, this.f1068c, i3, i4);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    public void q() {
        r(0);
    }

    public void r(int i3) {
        ViewParent h3 = h(i3);
        if (h3 != null) {
            V.g(h3, this.f1068c, i3);
            n(i3, null);
        }
    }
}
