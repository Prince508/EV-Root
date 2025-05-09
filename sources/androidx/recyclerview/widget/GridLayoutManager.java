package androidx.recyclerview.widget;

import L.x;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: I, reason: collision with root package name */
    public boolean f4158I;

    /* renamed from: J, reason: collision with root package name */
    public int f4159J;

    /* renamed from: K, reason: collision with root package name */
    public int[] f4160K;

    /* renamed from: L, reason: collision with root package name */
    public View[] f4161L;

    /* renamed from: M, reason: collision with root package name */
    public final SparseIntArray f4162M;

    /* renamed from: N, reason: collision with root package name */
    public final SparseIntArray f4163N;

    /* renamed from: O, reason: collision with root package name */
    public c f4164O;

    /* renamed from: P, reason: collision with root package name */
    public final Rect f4165P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f4166Q;

    public static final class a extends c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int e(int i3, int i4) {
            return i3 % i4;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int f(int i3) {
            return 1;
        }
    }

    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        public final SparseIntArray f4169a = new SparseIntArray();

        /* renamed from: b, reason: collision with root package name */
        public final SparseIntArray f4170b = new SparseIntArray();

        /* renamed from: c, reason: collision with root package name */
        public boolean f4171c = false;

        /* renamed from: d, reason: collision with root package name */
        public boolean f4172d = false;

        public static int a(SparseIntArray sparseIntArray, int i3) {
            int size = sparseIntArray.size() - 1;
            int i4 = 0;
            while (i4 <= size) {
                int i5 = (i4 + size) >>> 1;
                if (sparseIntArray.keyAt(i5) < i3) {
                    i4 = i5 + 1;
                } else {
                    size = i5 - 1;
                }
            }
            int i6 = i4 - 1;
            if (i6 < 0 || i6 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i6);
        }

        public int b(int i3, int i4) {
            if (!this.f4172d) {
                return d(i3, i4);
            }
            int i5 = this.f4170b.get(i3, -1);
            if (i5 != -1) {
                return i5;
            }
            int d3 = d(i3, i4);
            this.f4170b.put(i3, d3);
            return d3;
        }

        public int c(int i3, int i4) {
            if (!this.f4171c) {
                return e(i3, i4);
            }
            int i5 = this.f4169a.get(i3, -1);
            if (i5 != -1) {
                return i5;
            }
            int e3 = e(i3, i4);
            this.f4169a.put(i3, e3);
            return e3;
        }

        public int d(int i3, int i4) {
            int i5;
            int i6;
            int i7;
            int a3;
            if (!this.f4172d || (a3 = a(this.f4170b, i3)) == -1) {
                i5 = 0;
                i6 = 0;
                i7 = 0;
            } else {
                i5 = this.f4170b.get(a3);
                i6 = a3 + 1;
                i7 = c(a3, i4) + f(a3);
                if (i7 == i4) {
                    i5++;
                    i7 = 0;
                }
            }
            int f3 = f(i3);
            while (i6 < i3) {
                int f4 = f(i6);
                i7 += f4;
                if (i7 == i4) {
                    i5++;
                    i7 = 0;
                } else if (i7 > i4) {
                    i5++;
                    i7 = f4;
                }
                i6++;
            }
            return i7 + f3 > i4 ? i5 + 1 : i5;
        }

        public abstract int e(int i3, int i4);

        public abstract int f(int i3);

        public void g() {
            this.f4170b.clear();
        }

        public void h() {
            this.f4169a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i3, int i4) {
        super(context, attributeSet, i3, i4);
        this.f4158I = false;
        this.f4159J = -1;
        this.f4162M = new SparseIntArray();
        this.f4163N = new SparseIntArray();
        this.f4164O = new a();
        this.f4165P = new Rect();
        h3(RecyclerView.o.m0(context, attributeSet, i3, i4).f4359b);
    }

    public static int[] U2(int[] iArr, int i3, int i4) {
        int i5;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i4) {
            iArr = new int[i3 + 1];
        }
        int i6 = 0;
        iArr[0] = 0;
        int i7 = i4 / i3;
        int i8 = i4 % i3;
        int i9 = 0;
        for (int i10 = 1; i10 <= i3; i10++) {
            i6 += i8;
            if (i6 <= 0 || i3 - i6 >= i8) {
                i5 = i7;
            } else {
                i5 = i7 + 1;
                i6 -= i3;
            }
            i9 += i5;
            iArr[i10] = i9;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int A(RecyclerView.z zVar) {
        return this.f4166Q ? X2(zVar) : super.A(zVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int A1(int i3, RecyclerView.u uVar, RecyclerView.z zVar) {
        i3();
        Z2();
        return super.A1(i3, uVar, zVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int C1(int i3, RecyclerView.u uVar, RecyclerView.z zVar) {
        i3();
        Z2();
        return super.C1(i3, uVar, zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void G1(Rect rect, int i3, int i4) {
        int s3;
        int s4;
        if (this.f4160K == null) {
            super.G1(rect, i3, i4);
        }
        int i02 = i0() + j0();
        int k02 = k0() + h0();
        if (this.f4181s == 1) {
            s4 = RecyclerView.o.s(i4, rect.height() + k02, f0());
            int[] iArr = this.f4160K;
            s3 = RecyclerView.o.s(i3, iArr[iArr.length - 1] + i02, g0());
        } else {
            s3 = RecyclerView.o.s(i3, rect.width() + i02, g0());
            int[] iArr2 = this.f4160K;
            s4 = RecyclerView.o.s(i4, iArr2[iArr2.length - 1] + k02, f0());
        }
        F1(s3, s4);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p I() {
        return this.f4181s == 0 ? new b(-2, -1) : new b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void I2(boolean z3) {
        if (z3) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.I2(false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p J(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p K(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new b((ViewGroup.MarginLayoutParams) layoutParams) : new b(layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d3, code lost:
    
        if (r13 == (r2 > r15)) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00f3, code lost:
    
        if (r13 == (r2 > r4)) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0111  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View N0(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.u r26, androidx.recyclerview.widget.RecyclerView.z r27) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.N0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$u, androidx.recyclerview.widget.RecyclerView$z):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public boolean P1() {
        return this.f4176D == null && !this.f4158I;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void R1(RecyclerView.z zVar, LinearLayoutManager.c cVar, RecyclerView.o.c cVar2) {
        int i3 = this.f4159J;
        for (int i4 = 0; i4 < this.f4159J && cVar.c(zVar) && i3 > 0; i4++) {
            int i5 = cVar.f4201d;
            cVar2.a(i5, Math.max(0, cVar.f4204g));
            i3 -= this.f4164O.f(i5);
            cVar.f4201d += cVar.f4202e;
        }
    }

    public final void R2(RecyclerView.u uVar, RecyclerView.z zVar, int i3, boolean z3) {
        int i4;
        int i5;
        int i6;
        int i7 = 0;
        if (z3) {
            i6 = 1;
            i5 = i3;
            i4 = 0;
        } else {
            i4 = i3 - 1;
            i5 = -1;
            i6 = -1;
        }
        while (i4 != i5) {
            View view = this.f4161L[i4];
            b bVar = (b) view.getLayoutParams();
            int d3 = d3(uVar, zVar, l0(view));
            bVar.f4168f = d3;
            bVar.f4167e = i7;
            i7 += d3;
            i4 += i6;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int S(RecyclerView.u uVar, RecyclerView.z zVar) {
        if (this.f4181s == 1) {
            return this.f4159J;
        }
        if (zVar.b() < 1) {
            return 0;
        }
        return b3(uVar, zVar, zVar.b() - 1) + 1;
    }

    public final void S2() {
        int O3 = O();
        for (int i3 = 0; i3 < O3; i3++) {
            b bVar = (b) N(i3).getLayoutParams();
            int a3 = bVar.a();
            this.f4162M.put(a3, bVar.f());
            this.f4163N.put(a3, bVar.e());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void T0(RecyclerView.u uVar, RecyclerView.z zVar, View view, x xVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            super.S0(view, xVar);
            return;
        }
        b bVar = (b) layoutParams;
        int b3 = b3(uVar, zVar, bVar.a());
        if (this.f4181s == 0) {
            xVar.m0(x.f.a(bVar.e(), bVar.f(), b3, 1, false, false));
        } else {
            xVar.m0(x.f.a(b3, 1, bVar.e(), bVar.f(), false, false));
        }
    }

    public final void T2(int i3) {
        this.f4160K = U2(this.f4160K, this.f4159J, i3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void V0(RecyclerView recyclerView, int i3, int i4) {
        this.f4164O.h();
        this.f4164O.g();
    }

    public final void V2() {
        this.f4162M.clear();
        this.f4163N.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void W0(RecyclerView recyclerView) {
        this.f4164O.h();
        this.f4164O.g();
    }

    public final int W2(RecyclerView.z zVar) {
        if (O() != 0 && zVar.b() != 0) {
            X1();
            boolean v22 = v2();
            View c22 = c2(!v22, true);
            View b22 = b2(!v22, true);
            if (c22 != null && b22 != null) {
                int b3 = this.f4164O.b(l0(c22), this.f4159J);
                int b4 = this.f4164O.b(l0(b22), this.f4159J);
                int max = this.f4186x ? Math.max(0, ((this.f4164O.b(zVar.b() - 1, this.f4159J) + 1) - Math.max(b3, b4)) - 1) : Math.max(0, Math.min(b3, b4));
                if (v22) {
                    return Math.round((max * (Math.abs(this.f4183u.d(b22) - this.f4183u.g(c22)) / ((this.f4164O.b(l0(b22), this.f4159J) - this.f4164O.b(l0(c22), this.f4159J)) + 1))) + (this.f4183u.m() - this.f4183u.g(c22)));
                }
                return max;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void X0(RecyclerView recyclerView, int i3, int i4, int i5) {
        this.f4164O.h();
        this.f4164O.g();
    }

    public final int X2(RecyclerView.z zVar) {
        if (O() != 0 && zVar.b() != 0) {
            X1();
            View c22 = c2(!v2(), true);
            View b22 = b2(!v2(), true);
            if (c22 != null && b22 != null) {
                if (!v2()) {
                    return this.f4164O.b(zVar.b() - 1, this.f4159J) + 1;
                }
                int d3 = this.f4183u.d(b22) - this.f4183u.g(c22);
                int b3 = this.f4164O.b(l0(c22), this.f4159J);
                return (int) ((d3 / ((this.f4164O.b(l0(b22), this.f4159J) - b3) + 1)) * (this.f4164O.b(zVar.b() - 1, this.f4159J) + 1));
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void Y0(RecyclerView recyclerView, int i3, int i4) {
        this.f4164O.h();
        this.f4164O.g();
    }

    public final void Y2(RecyclerView.u uVar, RecyclerView.z zVar, LinearLayoutManager.a aVar, int i3) {
        boolean z3 = i3 == 1;
        int c3 = c3(uVar, zVar, aVar.f4190b);
        if (z3) {
            while (c3 > 0) {
                int i4 = aVar.f4190b;
                if (i4 <= 0) {
                    return;
                }
                int i5 = i4 - 1;
                aVar.f4190b = i5;
                c3 = c3(uVar, zVar, i5);
            }
            return;
        }
        int b3 = zVar.b() - 1;
        int i6 = aVar.f4190b;
        while (i6 < b3) {
            int i7 = i6 + 1;
            int c32 = c3(uVar, zVar, i7);
            if (c32 <= c3) {
                break;
            }
            i6 = i7;
            c3 = c32;
        }
        aVar.f4190b = i6;
    }

    public final void Z2() {
        View[] viewArr = this.f4161L;
        if (viewArr == null || viewArr.length != this.f4159J) {
            this.f4161L = new View[this.f4159J];
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void a1(RecyclerView recyclerView, int i3, int i4, Object obj) {
        this.f4164O.h();
        this.f4164O.g();
    }

    public int a3(int i3, int i4) {
        if (this.f4181s != 1 || !u2()) {
            int[] iArr = this.f4160K;
            return iArr[i4 + i3] - iArr[i3];
        }
        int[] iArr2 = this.f4160K;
        int i5 = this.f4159J;
        return iArr2[i5 - i3] - iArr2[(i5 - i3) - i4];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public void b1(RecyclerView.u uVar, RecyclerView.z zVar) {
        if (zVar.e()) {
            S2();
        }
        super.b1(uVar, zVar);
        V2();
    }

    public final int b3(RecyclerView.u uVar, RecyclerView.z zVar, int i3) {
        if (!zVar.e()) {
            return this.f4164O.b(i3, this.f4159J);
        }
        int f3 = uVar.f(i3);
        if (f3 != -1) {
            return this.f4164O.b(f3, this.f4159J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i3);
        return 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public void c1(RecyclerView.z zVar) {
        super.c1(zVar);
        this.f4158I = false;
    }

    public final int c3(RecyclerView.u uVar, RecyclerView.z zVar, int i3) {
        if (!zVar.e()) {
            return this.f4164O.c(i3, this.f4159J);
        }
        int i4 = this.f4163N.get(i3, -1);
        if (i4 != -1) {
            return i4;
        }
        int f3 = uVar.f(i3);
        if (f3 != -1) {
            return this.f4164O.c(f3, this.f4159J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i3);
        return 0;
    }

    public final int d3(RecyclerView.u uVar, RecyclerView.z zVar, int i3) {
        if (!zVar.e()) {
            return this.f4164O.f(i3);
        }
        int i4 = this.f4162M.get(i3, -1);
        if (i4 != -1) {
            return i4;
        }
        int f3 = uVar.f(i3);
        if (f3 != -1) {
            return this.f4164O.f(f3);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i3);
        return 1;
    }

    public final void e3(float f3, int i3) {
        T2(Math.max(Math.round(f3 * this.f4159J), i3));
    }

    public final void f3(View view, int i3, boolean z3) {
        int i4;
        int i5;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.f4363b;
        int i6 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i7 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int a3 = a3(bVar.f4167e, bVar.f4168f);
        if (this.f4181s == 1) {
            i5 = RecyclerView.o.P(a3, i3, i7, ((ViewGroup.MarginLayoutParams) bVar).width, false);
            i4 = RecyclerView.o.P(this.f4183u.n(), c0(), i6, ((ViewGroup.MarginLayoutParams) bVar).height, true);
        } else {
            int P3 = RecyclerView.o.P(a3, i3, i6, ((ViewGroup.MarginLayoutParams) bVar).height, false);
            int P4 = RecyclerView.o.P(this.f4183u.n(), t0(), i7, ((ViewGroup.MarginLayoutParams) bVar).width, true);
            i4 = P3;
            i5 = P4;
        }
        g3(view, i5, i4, z3);
    }

    public final void g3(View view, int i3, int i4, boolean z3) {
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        if (z3 ? L1(view, i3, i4, pVar) : J1(view, i3, i4, pVar)) {
            view.measure(i3, i4);
        }
    }

    public void h3(int i3) {
        if (i3 == this.f4159J) {
            return;
        }
        this.f4158I = true;
        if (i3 >= 1) {
            this.f4159J = i3;
            this.f4164O.h();
            x1();
        } else {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i3);
        }
    }

    public final void i3() {
        int b02;
        int k02;
        if (t2() == 1) {
            b02 = s0() - j0();
            k02 = i0();
        } else {
            b02 = b0() - h0();
            k02 = k0();
        }
        T2(b02 - k02);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public View l2(RecyclerView.u uVar, RecyclerView.z zVar, int i3, int i4, int i5) {
        X1();
        int m3 = this.f4183u.m();
        int i6 = this.f4183u.i();
        int i7 = i4 > i3 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i3 != i4) {
            View N3 = N(i3);
            int l02 = l0(N3);
            if (l02 >= 0 && l02 < i5 && c3(uVar, zVar, l02) == 0) {
                if (((RecyclerView.p) N3.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = N3;
                    }
                } else {
                    if (this.f4183u.g(N3) < i6 && this.f4183u.d(N3) >= m3) {
                        return N3;
                    }
                    if (view == null) {
                        view = N3;
                    }
                }
            }
            i3 += i7;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int o0(RecyclerView.u uVar, RecyclerView.z zVar) {
        if (this.f4181s == 0) {
            return this.f4159J;
        }
        if (zVar.b() < 1) {
            return 0;
        }
        return b3(uVar, zVar, zVar.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean r(RecyclerView.p pVar) {
        return pVar instanceof b;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int w(RecyclerView.z zVar) {
        return this.f4166Q ? W2(zVar) : super.w(zVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x009f, code lost:
    
        r21.f4195b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a1, code lost:
    
        return;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void w2(androidx.recyclerview.widget.RecyclerView.u r18, androidx.recyclerview.widget.RecyclerView.z r19, androidx.recyclerview.widget.LinearLayoutManager.c r20, androidx.recyclerview.widget.LinearLayoutManager.b r21) {
        /*
            Method dump skipped, instructions count: 551
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.w2(androidx.recyclerview.widget.RecyclerView$u, androidx.recyclerview.widget.RecyclerView$z, androidx.recyclerview.widget.LinearLayoutManager$c, androidx.recyclerview.widget.LinearLayoutManager$b):void");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int x(RecyclerView.z zVar) {
        return this.f4166Q ? X2(zVar) : super.x(zVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void y2(RecyclerView.u uVar, RecyclerView.z zVar, LinearLayoutManager.a aVar, int i3) {
        super.y2(uVar, zVar, aVar, i3);
        i3();
        if (zVar.b() > 0 && !zVar.e()) {
            Y2(uVar, zVar, aVar, i3);
        }
        Z2();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int z(RecyclerView.z zVar) {
        return this.f4166Q ? W2(zVar) : super.z(zVar);
    }

    public static class b extends RecyclerView.p {

        /* renamed from: e, reason: collision with root package name */
        public int f4167e;

        /* renamed from: f, reason: collision with root package name */
        public int f4168f;

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4167e = -1;
            this.f4168f = 0;
        }

        public int e() {
            return this.f4167e;
        }

        public int f() {
            return this.f4168f;
        }

        public b(int i3, int i4) {
            super(i3, i4);
            this.f4167e = -1;
            this.f4168f = 0;
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f4167e = -1;
            this.f4168f = 0;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f4167e = -1;
            this.f4168f = 0;
        }
    }

    public GridLayoutManager(Context context, int i3, int i4, boolean z3) {
        super(context, i4, z3);
        this.f4158I = false;
        this.f4159J = -1;
        this.f4162M = new SparseIntArray();
        this.f4163N = new SparseIntArray();
        this.f4164O = new a();
        this.f4165P = new Rect();
        h3(i3);
    }
}
