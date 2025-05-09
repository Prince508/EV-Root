package androidx.recyclerview.widget;

import L.x;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.o implements RecyclerView.y.b {

    /* renamed from: B, reason: collision with root package name */
    public BitSet f4415B;

    /* renamed from: G, reason: collision with root package name */
    public boolean f4420G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f4421H;

    /* renamed from: I, reason: collision with root package name */
    public e f4422I;

    /* renamed from: J, reason: collision with root package name */
    public int f4423J;

    /* renamed from: O, reason: collision with root package name */
    public int[] f4428O;

    /* renamed from: t, reason: collision with root package name */
    public f[] f4431t;

    /* renamed from: u, reason: collision with root package name */
    public i f4432u;

    /* renamed from: v, reason: collision with root package name */
    public i f4433v;

    /* renamed from: w, reason: collision with root package name */
    public int f4434w;

    /* renamed from: x, reason: collision with root package name */
    public int f4435x;

    /* renamed from: y, reason: collision with root package name */
    public final androidx.recyclerview.widget.f f4436y;

    /* renamed from: s, reason: collision with root package name */
    public int f4430s = -1;

    /* renamed from: z, reason: collision with root package name */
    public boolean f4437z = false;

    /* renamed from: A, reason: collision with root package name */
    public boolean f4414A = false;

    /* renamed from: C, reason: collision with root package name */
    public int f4416C = -1;

    /* renamed from: D, reason: collision with root package name */
    public int f4417D = Integer.MIN_VALUE;

    /* renamed from: E, reason: collision with root package name */
    public d f4418E = new d();

    /* renamed from: F, reason: collision with root package name */
    public int f4419F = 2;

    /* renamed from: K, reason: collision with root package name */
    public final Rect f4424K = new Rect();

    /* renamed from: L, reason: collision with root package name */
    public final b f4425L = new b();

    /* renamed from: M, reason: collision with root package name */
    public boolean f4426M = false;

    /* renamed from: N, reason: collision with root package name */
    public boolean f4427N = true;

    /* renamed from: P, reason: collision with root package name */
    public final Runnable f4429P = new a();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.W1();
        }
    }

    public class b {

        /* renamed from: a, reason: collision with root package name */
        public int f4439a;

        /* renamed from: b, reason: collision with root package name */
        public int f4440b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f4441c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f4442d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f4443e;

        /* renamed from: f, reason: collision with root package name */
        public int[] f4444f;

        public b() {
            c();
        }

        public void a() {
            this.f4440b = this.f4441c ? StaggeredGridLayoutManager.this.f4432u.i() : StaggeredGridLayoutManager.this.f4432u.m();
        }

        public void b(int i3) {
            if (this.f4441c) {
                this.f4440b = StaggeredGridLayoutManager.this.f4432u.i() - i3;
            } else {
                this.f4440b = StaggeredGridLayoutManager.this.f4432u.m() + i3;
            }
        }

        public void c() {
            this.f4439a = -1;
            this.f4440b = Integer.MIN_VALUE;
            this.f4441c = false;
            this.f4442d = false;
            this.f4443e = false;
            int[] iArr = this.f4444f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        public void d(f[] fVarArr) {
            int length = fVarArr.length;
            int[] iArr = this.f4444f;
            if (iArr == null || iArr.length < length) {
                this.f4444f = new int[StaggeredGridLayoutManager.this.f4431t.length];
            }
            for (int i3 = 0; i3 < length; i3++) {
                this.f4444f[i3] = fVarArr[i3].p(Integer.MIN_VALUE);
            }
        }
    }

    public static class c extends RecyclerView.p {

        /* renamed from: e, reason: collision with root package name */
        public f f4446e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f4447f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public final int e() {
            f fVar = this.f4446e;
            if (fVar == null) {
                return -1;
            }
            return fVar.f4468e;
        }

        public boolean f() {
            return this.f4447f;
        }

        public c(int i3, int i4) {
            super(i3, i4);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: e, reason: collision with root package name */
        public int f4454e;

        /* renamed from: f, reason: collision with root package name */
        public int f4455f;

        /* renamed from: g, reason: collision with root package name */
        public int f4456g;

        /* renamed from: h, reason: collision with root package name */
        public int[] f4457h;

        /* renamed from: i, reason: collision with root package name */
        public int f4458i;

        /* renamed from: j, reason: collision with root package name */
        public int[] f4459j;

        /* renamed from: k, reason: collision with root package name */
        public List f4460k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f4461l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f4462m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f4463n;

        public static class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public e[] newArray(int i3) {
                return new e[i3];
            }
        }

        public e() {
        }

        public void a() {
            this.f4457h = null;
            this.f4456g = 0;
            this.f4454e = -1;
            this.f4455f = -1;
        }

        public void b() {
            this.f4457h = null;
            this.f4456g = 0;
            this.f4458i = 0;
            this.f4459j = null;
            this.f4460k = null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i3) {
            parcel.writeInt(this.f4454e);
            parcel.writeInt(this.f4455f);
            parcel.writeInt(this.f4456g);
            if (this.f4456g > 0) {
                parcel.writeIntArray(this.f4457h);
            }
            parcel.writeInt(this.f4458i);
            if (this.f4458i > 0) {
                parcel.writeIntArray(this.f4459j);
            }
            parcel.writeInt(this.f4461l ? 1 : 0);
            parcel.writeInt(this.f4462m ? 1 : 0);
            parcel.writeInt(this.f4463n ? 1 : 0);
            parcel.writeList(this.f4460k);
        }

        public e(Parcel parcel) {
            this.f4454e = parcel.readInt();
            this.f4455f = parcel.readInt();
            int readInt = parcel.readInt();
            this.f4456g = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f4457h = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f4458i = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f4459j = iArr2;
                parcel.readIntArray(iArr2);
            }
            this.f4461l = parcel.readInt() == 1;
            this.f4462m = parcel.readInt() == 1;
            this.f4463n = parcel.readInt() == 1;
            this.f4460k = parcel.readArrayList(d.a.class.getClassLoader());
        }

        public e(e eVar) {
            this.f4456g = eVar.f4456g;
            this.f4454e = eVar.f4454e;
            this.f4455f = eVar.f4455f;
            this.f4457h = eVar.f4457h;
            this.f4458i = eVar.f4458i;
            this.f4459j = eVar.f4459j;
            this.f4461l = eVar.f4461l;
            this.f4462m = eVar.f4462m;
            this.f4463n = eVar.f4463n;
            this.f4460k = eVar.f4460k;
        }
    }

    public class f {

        /* renamed from: a, reason: collision with root package name */
        public ArrayList f4464a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        public int f4465b = Integer.MIN_VALUE;

        /* renamed from: c, reason: collision with root package name */
        public int f4466c = Integer.MIN_VALUE;

        /* renamed from: d, reason: collision with root package name */
        public int f4467d = 0;

        /* renamed from: e, reason: collision with root package name */
        public final int f4468e;

        public f(int i3) {
            this.f4468e = i3;
        }

        public void a(View view) {
            c n3 = n(view);
            n3.f4446e = this;
            this.f4464a.add(view);
            this.f4466c = Integer.MIN_VALUE;
            if (this.f4464a.size() == 1) {
                this.f4465b = Integer.MIN_VALUE;
            }
            if (n3.c() || n3.b()) {
                this.f4467d += StaggeredGridLayoutManager.this.f4432u.e(view);
            }
        }

        public void b(boolean z3, int i3) {
            int l3 = z3 ? l(Integer.MIN_VALUE) : p(Integer.MIN_VALUE);
            e();
            if (l3 == Integer.MIN_VALUE) {
                return;
            }
            if (!z3 || l3 >= StaggeredGridLayoutManager.this.f4432u.i()) {
                if (z3 || l3 <= StaggeredGridLayoutManager.this.f4432u.m()) {
                    if (i3 != Integer.MIN_VALUE) {
                        l3 += i3;
                    }
                    this.f4466c = l3;
                    this.f4465b = l3;
                }
            }
        }

        public void c() {
            d.a f3;
            ArrayList arrayList = this.f4464a;
            View view = (View) arrayList.get(arrayList.size() - 1);
            c n3 = n(view);
            this.f4466c = StaggeredGridLayoutManager.this.f4432u.d(view);
            if (n3.f4447f && (f3 = StaggeredGridLayoutManager.this.f4418E.f(n3.a())) != null && f3.f4451f == 1) {
                this.f4466c += f3.a(this.f4468e);
            }
        }

        public void d() {
            d.a f3;
            View view = (View) this.f4464a.get(0);
            c n3 = n(view);
            this.f4465b = StaggeredGridLayoutManager.this.f4432u.g(view);
            if (n3.f4447f && (f3 = StaggeredGridLayoutManager.this.f4418E.f(n3.a())) != null && f3.f4451f == -1) {
                this.f4465b -= f3.a(this.f4468e);
            }
        }

        public void e() {
            this.f4464a.clear();
            q();
            this.f4467d = 0;
        }

        public int f() {
            return StaggeredGridLayoutManager.this.f4437z ? i(this.f4464a.size() - 1, -1, true) : i(0, this.f4464a.size(), true);
        }

        public int g() {
            return StaggeredGridLayoutManager.this.f4437z ? i(0, this.f4464a.size(), true) : i(this.f4464a.size() - 1, -1, true);
        }

        public int h(int i3, int i4, boolean z3, boolean z4, boolean z5) {
            int m3 = StaggeredGridLayoutManager.this.f4432u.m();
            int i5 = StaggeredGridLayoutManager.this.f4432u.i();
            int i6 = i4 > i3 ? 1 : -1;
            while (i3 != i4) {
                View view = (View) this.f4464a.get(i3);
                int g3 = StaggeredGridLayoutManager.this.f4432u.g(view);
                int d3 = StaggeredGridLayoutManager.this.f4432u.d(view);
                boolean z6 = false;
                boolean z7 = !z5 ? g3 >= i5 : g3 > i5;
                if (!z5 ? d3 > m3 : d3 >= m3) {
                    z6 = true;
                }
                if (z7 && z6) {
                    if (z3 && z4) {
                        if (g3 >= m3 && d3 <= i5) {
                            return StaggeredGridLayoutManager.this.l0(view);
                        }
                    } else {
                        if (z4) {
                            return StaggeredGridLayoutManager.this.l0(view);
                        }
                        if (g3 < m3 || d3 > i5) {
                            return StaggeredGridLayoutManager.this.l0(view);
                        }
                    }
                }
                i3 += i6;
            }
            return -1;
        }

        public int i(int i3, int i4, boolean z3) {
            return h(i3, i4, false, false, z3);
        }

        public int j() {
            return this.f4467d;
        }

        public int k() {
            int i3 = this.f4466c;
            if (i3 != Integer.MIN_VALUE) {
                return i3;
            }
            c();
            return this.f4466c;
        }

        public int l(int i3) {
            int i4 = this.f4466c;
            if (i4 != Integer.MIN_VALUE) {
                return i4;
            }
            if (this.f4464a.size() == 0) {
                return i3;
            }
            c();
            return this.f4466c;
        }

        public View m(int i3, int i4) {
            View view = null;
            if (i4 != -1) {
                int size = this.f4464a.size() - 1;
                while (size >= 0) {
                    View view2 = (View) this.f4464a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f4437z && staggeredGridLayoutManager.l0(view2) >= i3) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f4437z && staggeredGridLayoutManager2.l0(view2) <= i3) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
                return view;
            }
            int size2 = this.f4464a.size();
            int i5 = 0;
            while (i5 < size2) {
                View view3 = (View) this.f4464a.get(i5);
                StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                if (staggeredGridLayoutManager3.f4437z && staggeredGridLayoutManager3.l0(view3) <= i3) {
                    break;
                }
                StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                if ((!staggeredGridLayoutManager4.f4437z && staggeredGridLayoutManager4.l0(view3) >= i3) || !view3.hasFocusable()) {
                    break;
                }
                i5++;
                view = view3;
            }
            return view;
        }

        public c n(View view) {
            return (c) view.getLayoutParams();
        }

        public int o() {
            int i3 = this.f4465b;
            if (i3 != Integer.MIN_VALUE) {
                return i3;
            }
            d();
            return this.f4465b;
        }

        public int p(int i3) {
            int i4 = this.f4465b;
            if (i4 != Integer.MIN_VALUE) {
                return i4;
            }
            if (this.f4464a.size() == 0) {
                return i3;
            }
            d();
            return this.f4465b;
        }

        public void q() {
            this.f4465b = Integer.MIN_VALUE;
            this.f4466c = Integer.MIN_VALUE;
        }

        public void r(int i3) {
            int i4 = this.f4465b;
            if (i4 != Integer.MIN_VALUE) {
                this.f4465b = i4 + i3;
            }
            int i5 = this.f4466c;
            if (i5 != Integer.MIN_VALUE) {
                this.f4466c = i5 + i3;
            }
        }

        public void s() {
            int size = this.f4464a.size();
            View view = (View) this.f4464a.remove(size - 1);
            c n3 = n(view);
            n3.f4446e = null;
            if (n3.c() || n3.b()) {
                this.f4467d -= StaggeredGridLayoutManager.this.f4432u.e(view);
            }
            if (size == 1) {
                this.f4465b = Integer.MIN_VALUE;
            }
            this.f4466c = Integer.MIN_VALUE;
        }

        public void t() {
            View view = (View) this.f4464a.remove(0);
            c n3 = n(view);
            n3.f4446e = null;
            if (this.f4464a.size() == 0) {
                this.f4466c = Integer.MIN_VALUE;
            }
            if (n3.c() || n3.b()) {
                this.f4467d -= StaggeredGridLayoutManager.this.f4432u.e(view);
            }
            this.f4465b = Integer.MIN_VALUE;
        }

        public void u(View view) {
            c n3 = n(view);
            n3.f4446e = this;
            this.f4464a.add(0, view);
            this.f4465b = Integer.MIN_VALUE;
            if (this.f4464a.size() == 1) {
                this.f4466c = Integer.MIN_VALUE;
            }
            if (n3.c() || n3.b()) {
                this.f4467d += StaggeredGridLayoutManager.this.f4432u.e(view);
            }
        }

        public void v(int i3) {
            this.f4465b = i3;
            this.f4466c = i3;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i3, int i4) {
        RecyclerView.o.d m02 = RecyclerView.o.m0(context, attributeSet, i3, i4);
        L2(m02.f4358a);
        N2(m02.f4359b);
        M2(m02.f4360c);
        this.f4436y = new androidx.recyclerview.widget.f();
        e2();
    }

    private void I2() {
        if (this.f4434w == 1 || !x2()) {
            this.f4414A = this.f4437z;
        } else {
            this.f4414A = !this.f4437z;
        }
    }

    private int Y1(RecyclerView.z zVar) {
        if (O() == 0) {
            return 0;
        }
        return l.a(zVar, this.f4432u, i2(!this.f4427N), h2(!this.f4427N), this, this.f4427N);
    }

    private int Z1(RecyclerView.z zVar) {
        if (O() == 0) {
            return 0;
        }
        return l.b(zVar, this.f4432u, i2(!this.f4427N), h2(!this.f4427N), this, this.f4427N, this.f4414A);
    }

    private int a2(RecyclerView.z zVar) {
        if (O() == 0) {
            return 0;
        }
        return l.c(zVar, this.f4432u, i2(!this.f4427N), h2(!this.f4427N), this, this.f4427N);
    }

    private int b2(int i3) {
        return i3 != 1 ? i3 != 2 ? i3 != 17 ? i3 != 33 ? i3 != 66 ? (i3 == 130 && this.f4434w == 1) ? 1 : Integer.MIN_VALUE : this.f4434w == 0 ? 1 : Integer.MIN_VALUE : this.f4434w == 1 ? -1 : Integer.MIN_VALUE : this.f4434w == 0 ? -1 : Integer.MIN_VALUE : (this.f4434w != 1 && x2()) ? -1 : 1 : (this.f4434w != 1 && x2()) ? 1 : -1;
    }

    private void y2(View view, int i3, int i4, boolean z3) {
        o(view, this.f4424K);
        c cVar = (c) view.getLayoutParams();
        int i5 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
        Rect rect = this.f4424K;
        int V2 = V2(i3, i5 + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int i6 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        Rect rect2 = this.f4424K;
        int V22 = V2(i4, i6 + rect2.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect2.bottom);
        if (z3 ? L1(view, V2, V22, cVar) : J1(view, V2, V22, cVar)) {
            view.measure(V2, V22);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int A(RecyclerView.z zVar) {
        return a2(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int A1(int i3, RecyclerView.u uVar, RecyclerView.z zVar) {
        return J2(i3, uVar, zVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0152, code lost:
    
        if (W1() != false) goto L87;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A2(androidx.recyclerview.widget.RecyclerView.u r9, androidx.recyclerview.widget.RecyclerView.z r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A2(androidx.recyclerview.widget.RecyclerView$u, androidx.recyclerview.widget.RecyclerView$z, boolean):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void B1(int i3) {
        e eVar = this.f4422I;
        if (eVar != null && eVar.f4454e != i3) {
            eVar.a();
        }
        this.f4416C = i3;
        this.f4417D = Integer.MIN_VALUE;
        x1();
    }

    public final boolean B2(int i3) {
        if (this.f4434w == 0) {
            return (i3 == -1) != this.f4414A;
        }
        return ((i3 == -1) == this.f4414A) == x2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int C1(int i3, RecyclerView.u uVar, RecyclerView.z zVar) {
        return J2(i3, uVar, zVar);
    }

    public void C2(int i3, RecyclerView.z zVar) {
        int n22;
        int i4;
        if (i3 > 0) {
            n22 = o2();
            i4 = 1;
        } else {
            n22 = n2();
            i4 = -1;
        }
        this.f4436y.f4589a = true;
        S2(n22, zVar);
        K2(i4);
        androidx.recyclerview.widget.f fVar = this.f4436y;
        fVar.f4591c = n22 + fVar.f4592d;
        fVar.f4590b = Math.abs(i3);
    }

    public final void D2(View view) {
        for (int i3 = this.f4430s - 1; i3 >= 0; i3--) {
            this.f4431t[i3].u(view);
        }
    }

    public final void E2(RecyclerView.u uVar, androidx.recyclerview.widget.f fVar) {
        if (!fVar.f4589a || fVar.f4597i) {
            return;
        }
        if (fVar.f4590b == 0) {
            if (fVar.f4593e == -1) {
                F2(uVar, fVar.f4595g);
                return;
            } else {
                G2(uVar, fVar.f4594f);
                return;
            }
        }
        if (fVar.f4593e != -1) {
            int r22 = r2(fVar.f4595g) - fVar.f4595g;
            G2(uVar, r22 < 0 ? fVar.f4594f : Math.min(r22, fVar.f4590b) + fVar.f4594f);
        } else {
            int i3 = fVar.f4594f;
            int q22 = i3 - q2(i3);
            F2(uVar, q22 < 0 ? fVar.f4595g : fVar.f4595g - Math.min(q22, fVar.f4590b));
        }
    }

    public final void F2(RecyclerView.u uVar, int i3) {
        for (int O3 = O() - 1; O3 >= 0; O3--) {
            View N3 = N(O3);
            if (this.f4432u.g(N3) < i3 || this.f4432u.q(N3) < i3) {
                return;
            }
            c cVar = (c) N3.getLayoutParams();
            if (cVar.f4447f) {
                for (int i4 = 0; i4 < this.f4430s; i4++) {
                    if (this.f4431t[i4].f4464a.size() == 1) {
                        return;
                    }
                }
                for (int i5 = 0; i5 < this.f4430s; i5++) {
                    this.f4431t[i5].s();
                }
            } else if (cVar.f4446e.f4464a.size() == 1) {
                return;
            } else {
                cVar.f4446e.s();
            }
            q1(N3, uVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void G0(int i3) {
        super.G0(i3);
        for (int i4 = 0; i4 < this.f4430s; i4++) {
            this.f4431t[i4].r(i3);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void G1(Rect rect, int i3, int i4) {
        int s3;
        int s4;
        int i02 = i0() + j0();
        int k02 = k0() + h0();
        if (this.f4434w == 1) {
            s4 = RecyclerView.o.s(i4, rect.height() + k02, f0());
            s3 = RecyclerView.o.s(i3, (this.f4435x * this.f4430s) + i02, g0());
        } else {
            s3 = RecyclerView.o.s(i3, rect.width() + i02, g0());
            s4 = RecyclerView.o.s(i4, (this.f4435x * this.f4430s) + k02, f0());
        }
        F1(s3, s4);
    }

    public final void G2(RecyclerView.u uVar, int i3) {
        while (O() > 0) {
            View N3 = N(0);
            if (this.f4432u.d(N3) > i3 || this.f4432u.p(N3) > i3) {
                return;
            }
            c cVar = (c) N3.getLayoutParams();
            if (cVar.f4447f) {
                for (int i4 = 0; i4 < this.f4430s; i4++) {
                    if (this.f4431t[i4].f4464a.size() == 1) {
                        return;
                    }
                }
                for (int i5 = 0; i5 < this.f4430s; i5++) {
                    this.f4431t[i5].t();
                }
            } else if (cVar.f4446e.f4464a.size() == 1) {
                return;
            } else {
                cVar.f4446e.t();
            }
            q1(N3, uVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void H0(int i3) {
        super.H0(i3);
        for (int i4 = 0; i4 < this.f4430s; i4++) {
            this.f4431t[i4].r(i3);
        }
    }

    public final void H2() {
        if (this.f4433v.k() == 1073741824) {
            return;
        }
        int O3 = O();
        float f3 = 0.0f;
        for (int i3 = 0; i3 < O3; i3++) {
            View N3 = N(i3);
            float e3 = this.f4433v.e(N3);
            if (e3 >= f3) {
                if (((c) N3.getLayoutParams()).f()) {
                    e3 = (e3 * 1.0f) / this.f4430s;
                }
                f3 = Math.max(f3, e3);
            }
        }
        int i4 = this.f4435x;
        int round = Math.round(f3 * this.f4430s);
        if (this.f4433v.k() == Integer.MIN_VALUE) {
            round = Math.min(round, this.f4433v.n());
        }
        T2(round);
        if (this.f4435x == i4) {
            return;
        }
        for (int i5 = 0; i5 < O3; i5++) {
            View N4 = N(i5);
            c cVar = (c) N4.getLayoutParams();
            if (!cVar.f4447f) {
                if (x2() && this.f4434w == 1) {
                    int i6 = this.f4430s;
                    int i7 = cVar.f4446e.f4468e;
                    N4.offsetLeftAndRight(((-((i6 - 1) - i7)) * this.f4435x) - ((-((i6 - 1) - i7)) * i4));
                } else {
                    int i8 = cVar.f4446e.f4468e;
                    int i9 = this.f4435x * i8;
                    int i10 = i8 * i4;
                    if (this.f4434w == 1) {
                        N4.offsetLeftAndRight(i9 - i10);
                    } else {
                        N4.offsetTopAndBottom(i9 - i10);
                    }
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p I() {
        return this.f4434w == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p J(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    public int J2(int i3, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (O() == 0 || i3 == 0) {
            return 0;
        }
        C2(i3, zVar);
        int f22 = f2(uVar, this.f4436y, zVar);
        if (this.f4436y.f4590b >= f22) {
            i3 = i3 < 0 ? -f22 : f22;
        }
        this.f4432u.r(-i3);
        this.f4420G = this.f4414A;
        androidx.recyclerview.widget.f fVar = this.f4436y;
        fVar.f4590b = 0;
        E2(uVar, fVar);
        return i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p K(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    public final void K2(int i3) {
        androidx.recyclerview.widget.f fVar = this.f4436y;
        fVar.f4593e = i3;
        fVar.f4592d = this.f4414A != (i3 == -1) ? -1 : 1;
    }

    public void L2(int i3) {
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        l(null);
        if (i3 == this.f4434w) {
            return;
        }
        this.f4434w = i3;
        i iVar = this.f4432u;
        this.f4432u = this.f4433v;
        this.f4433v = iVar;
        x1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void M0(RecyclerView recyclerView, RecyclerView.u uVar) {
        super.M0(recyclerView, uVar);
        s1(this.f4429P);
        for (int i3 = 0; i3 < this.f4430s; i3++) {
            this.f4431t[i3].e();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void M1(RecyclerView recyclerView, RecyclerView.z zVar, int i3) {
        g gVar = new g(recyclerView.getContext());
        gVar.p(i3);
        N1(gVar);
    }

    public void M2(boolean z3) {
        l(null);
        e eVar = this.f4422I;
        if (eVar != null && eVar.f4461l != z3) {
            eVar.f4461l = z3;
        }
        this.f4437z = z3;
        x1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View N0(View view, int i3, RecyclerView.u uVar, RecyclerView.z zVar) {
        View G3;
        View m3;
        if (O() == 0 || (G3 = G(view)) == null) {
            return null;
        }
        I2();
        int b22 = b2(i3);
        if (b22 == Integer.MIN_VALUE) {
            return null;
        }
        c cVar = (c) G3.getLayoutParams();
        boolean z3 = cVar.f4447f;
        f fVar = cVar.f4446e;
        int o22 = b22 == 1 ? o2() : n2();
        S2(o22, zVar);
        K2(b22);
        androidx.recyclerview.widget.f fVar2 = this.f4436y;
        fVar2.f4591c = fVar2.f4592d + o22;
        fVar2.f4590b = (int) (this.f4432u.n() * 0.33333334f);
        androidx.recyclerview.widget.f fVar3 = this.f4436y;
        fVar3.f4596h = true;
        fVar3.f4589a = false;
        f2(uVar, fVar3, zVar);
        this.f4420G = this.f4414A;
        if (!z3 && (m3 = fVar.m(o22, b22)) != null && m3 != G3) {
            return m3;
        }
        if (B2(b22)) {
            for (int i4 = this.f4430s - 1; i4 >= 0; i4--) {
                View m4 = this.f4431t[i4].m(o22, b22);
                if (m4 != null && m4 != G3) {
                    return m4;
                }
            }
        } else {
            for (int i5 = 0; i5 < this.f4430s; i5++) {
                View m5 = this.f4431t[i5].m(o22, b22);
                if (m5 != null && m5 != G3) {
                    return m5;
                }
            }
        }
        boolean z4 = (this.f4437z ^ true) == (b22 == -1);
        if (!z3) {
            View H3 = H(z4 ? fVar.f() : fVar.g());
            if (H3 != null && H3 != G3) {
                return H3;
            }
        }
        if (B2(b22)) {
            for (int i6 = this.f4430s - 1; i6 >= 0; i6--) {
                if (i6 != fVar.f4468e) {
                    View H4 = H(z4 ? this.f4431t[i6].f() : this.f4431t[i6].g());
                    if (H4 != null && H4 != G3) {
                        return H4;
                    }
                }
            }
        } else {
            for (int i7 = 0; i7 < this.f4430s; i7++) {
                View H5 = H(z4 ? this.f4431t[i7].f() : this.f4431t[i7].g());
                if (H5 != null && H5 != G3) {
                    return H5;
                }
            }
        }
        return null;
    }

    public void N2(int i3) {
        l(null);
        if (i3 != this.f4430s) {
            w2();
            this.f4430s = i3;
            this.f4415B = new BitSet(this.f4430s);
            this.f4431t = new f[this.f4430s];
            for (int i4 = 0; i4 < this.f4430s; i4++) {
                this.f4431t[i4] = new f(i4);
            }
            x1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void O0(AccessibilityEvent accessibilityEvent) {
        super.O0(accessibilityEvent);
        if (O() > 0) {
            View i22 = i2(false);
            View h22 = h2(false);
            if (i22 == null || h22 == null) {
                return;
            }
            int l02 = l0(i22);
            int l03 = l0(h22);
            if (l02 < l03) {
                accessibilityEvent.setFromIndex(l02);
                accessibilityEvent.setToIndex(l03);
            } else {
                accessibilityEvent.setFromIndex(l03);
                accessibilityEvent.setToIndex(l02);
            }
        }
    }

    public final void O2(int i3, int i4) {
        for (int i5 = 0; i5 < this.f4430s; i5++) {
            if (!this.f4431t[i5].f4464a.isEmpty()) {
                U2(this.f4431t[i5], i3, i4);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean P1() {
        return this.f4422I == null;
    }

    public final boolean P2(RecyclerView.z zVar, b bVar) {
        bVar.f4439a = this.f4420G ? k2(zVar.b()) : g2(zVar.b());
        bVar.f4440b = Integer.MIN_VALUE;
        return true;
    }

    public final void Q1(View view) {
        for (int i3 = this.f4430s - 1; i3 >= 0; i3--) {
            this.f4431t[i3].a(view);
        }
    }

    public boolean Q2(RecyclerView.z zVar, b bVar) {
        int i3;
        if (!zVar.e() && (i3 = this.f4416C) != -1) {
            if (i3 >= 0 && i3 < zVar.b()) {
                e eVar = this.f4422I;
                if (eVar == null || eVar.f4454e == -1 || eVar.f4456g < 1) {
                    View H3 = H(this.f4416C);
                    if (H3 != null) {
                        bVar.f4439a = this.f4414A ? o2() : n2();
                        if (this.f4417D != Integer.MIN_VALUE) {
                            if (bVar.f4441c) {
                                bVar.f4440b = (this.f4432u.i() - this.f4417D) - this.f4432u.d(H3);
                            } else {
                                bVar.f4440b = (this.f4432u.m() + this.f4417D) - this.f4432u.g(H3);
                            }
                            return true;
                        }
                        if (this.f4432u.e(H3) > this.f4432u.n()) {
                            bVar.f4440b = bVar.f4441c ? this.f4432u.i() : this.f4432u.m();
                            return true;
                        }
                        int g3 = this.f4432u.g(H3) - this.f4432u.m();
                        if (g3 < 0) {
                            bVar.f4440b = -g3;
                            return true;
                        }
                        int i4 = this.f4432u.i() - this.f4432u.d(H3);
                        if (i4 < 0) {
                            bVar.f4440b = i4;
                            return true;
                        }
                        bVar.f4440b = Integer.MIN_VALUE;
                    } else {
                        int i5 = this.f4416C;
                        bVar.f4439a = i5;
                        int i6 = this.f4417D;
                        if (i6 == Integer.MIN_VALUE) {
                            bVar.f4441c = V1(i5) == 1;
                            bVar.a();
                        } else {
                            bVar.b(i6);
                        }
                        bVar.f4442d = true;
                    }
                } else {
                    bVar.f4440b = Integer.MIN_VALUE;
                    bVar.f4439a = this.f4416C;
                }
                return true;
            }
            this.f4416C = -1;
            this.f4417D = Integer.MIN_VALUE;
        }
        return false;
    }

    public final void R1(b bVar) {
        e eVar = this.f4422I;
        int i3 = eVar.f4456g;
        if (i3 > 0) {
            if (i3 == this.f4430s) {
                for (int i4 = 0; i4 < this.f4430s; i4++) {
                    this.f4431t[i4].e();
                    e eVar2 = this.f4422I;
                    int i5 = eVar2.f4457h[i4];
                    if (i5 != Integer.MIN_VALUE) {
                        i5 += eVar2.f4462m ? this.f4432u.i() : this.f4432u.m();
                    }
                    this.f4431t[i4].v(i5);
                }
            } else {
                eVar.b();
                e eVar3 = this.f4422I;
                eVar3.f4454e = eVar3.f4455f;
            }
        }
        e eVar4 = this.f4422I;
        this.f4421H = eVar4.f4463n;
        M2(eVar4.f4461l);
        I2();
        e eVar5 = this.f4422I;
        int i6 = eVar5.f4454e;
        if (i6 != -1) {
            this.f4416C = i6;
            bVar.f4441c = eVar5.f4462m;
        } else {
            bVar.f4441c = this.f4414A;
        }
        if (eVar5.f4458i > 1) {
            d dVar = this.f4418E;
            dVar.f4448a = eVar5.f4459j;
            dVar.f4449b = eVar5.f4460k;
        }
    }

    public void R2(RecyclerView.z zVar, b bVar) {
        if (Q2(zVar, bVar) || P2(zVar, bVar)) {
            return;
        }
        bVar.a();
        bVar.f4439a = 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int S(RecyclerView.u uVar, RecyclerView.z zVar) {
        return this.f4434w == 1 ? this.f4430s : super.S(uVar, zVar);
    }

    public boolean S1() {
        int l3 = this.f4431t[0].l(Integer.MIN_VALUE);
        for (int i3 = 1; i3 < this.f4430s; i3++) {
            if (this.f4431t[i3].l(Integer.MIN_VALUE) != l3) {
                return false;
            }
        }
        return true;
    }

    public final void S2(int i3, RecyclerView.z zVar) {
        int i4;
        int i5;
        int c3;
        androidx.recyclerview.widget.f fVar = this.f4436y;
        boolean z3 = false;
        fVar.f4590b = 0;
        fVar.f4591c = i3;
        if (!B0() || (c3 = zVar.c()) == -1) {
            i4 = 0;
            i5 = 0;
        } else {
            if (this.f4414A == (c3 < i3)) {
                i4 = this.f4432u.n();
                i5 = 0;
            } else {
                i5 = this.f4432u.n();
                i4 = 0;
            }
        }
        if (R()) {
            this.f4436y.f4594f = this.f4432u.m() - i5;
            this.f4436y.f4595g = this.f4432u.i() + i4;
        } else {
            this.f4436y.f4595g = this.f4432u.h() + i4;
            this.f4436y.f4594f = -i5;
        }
        androidx.recyclerview.widget.f fVar2 = this.f4436y;
        fVar2.f4596h = false;
        fVar2.f4589a = true;
        if (this.f4432u.k() == 0 && this.f4432u.h() == 0) {
            z3 = true;
        }
        fVar2.f4597i = z3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void T0(RecyclerView.u uVar, RecyclerView.z zVar, View view, x xVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof c)) {
            super.S0(view, xVar);
            return;
        }
        c cVar = (c) layoutParams;
        if (this.f4434w == 0) {
            xVar.m0(x.f.a(cVar.e(), cVar.f4447f ? this.f4430s : 1, -1, -1, false, false));
        } else {
            xVar.m0(x.f.a(-1, -1, cVar.e(), cVar.f4447f ? this.f4430s : 1, false, false));
        }
    }

    public boolean T1() {
        int p3 = this.f4431t[0].p(Integer.MIN_VALUE);
        for (int i3 = 1; i3 < this.f4430s; i3++) {
            if (this.f4431t[i3].p(Integer.MIN_VALUE) != p3) {
                return false;
            }
        }
        return true;
    }

    public void T2(int i3) {
        this.f4435x = i3 / this.f4430s;
        this.f4423J = View.MeasureSpec.makeMeasureSpec(i3, this.f4433v.k());
    }

    public final void U1(View view, c cVar, androidx.recyclerview.widget.f fVar) {
        if (fVar.f4593e == 1) {
            if (cVar.f4447f) {
                Q1(view);
                return;
            } else {
                cVar.f4446e.a(view);
                return;
            }
        }
        if (cVar.f4447f) {
            D2(view);
        } else {
            cVar.f4446e.u(view);
        }
    }

    public final void U2(f fVar, int i3, int i4) {
        int j3 = fVar.j();
        if (i3 == -1) {
            if (fVar.o() + j3 <= i4) {
                this.f4415B.set(fVar.f4468e, false);
            }
        } else if (fVar.k() - j3 >= i4) {
            this.f4415B.set(fVar.f4468e, false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void V0(RecyclerView recyclerView, int i3, int i4) {
        u2(i3, i4, 1);
    }

    public final int V1(int i3) {
        if (O() == 0) {
            return this.f4414A ? 1 : -1;
        }
        return (i3 < n2()) != this.f4414A ? -1 : 1;
    }

    public final int V2(int i3, int i4, int i5) {
        int mode;
        return (!(i4 == 0 && i5 == 0) && ((mode = View.MeasureSpec.getMode(i3)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i3) - i4) - i5), mode) : i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void W0(RecyclerView recyclerView) {
        this.f4418E.b();
        x1();
    }

    public boolean W1() {
        int n22;
        int o22;
        if (O() == 0 || this.f4419F == 0 || !v0()) {
            return false;
        }
        if (this.f4414A) {
            n22 = o2();
            o22 = n2();
        } else {
            n22 = n2();
            o22 = o2();
        }
        if (n22 == 0 && v2() != null) {
            this.f4418E.b();
            y1();
            x1();
            return true;
        }
        if (!this.f4426M) {
            return false;
        }
        int i3 = this.f4414A ? -1 : 1;
        int i4 = o22 + 1;
        d.a e3 = this.f4418E.e(n22, i4, i3, true);
        if (e3 == null) {
            this.f4426M = false;
            this.f4418E.d(i4);
            return false;
        }
        d.a e4 = this.f4418E.e(n22, e3.f4450e, i3 * (-1), true);
        if (e4 == null) {
            this.f4418E.d(e3.f4450e);
        } else {
            this.f4418E.d(e4.f4450e + 1);
        }
        y1();
        x1();
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void X0(RecyclerView recyclerView, int i3, int i4, int i5) {
        u2(i3, i4, 8);
    }

    public final boolean X1(f fVar) {
        if (this.f4414A) {
            if (fVar.k() < this.f4432u.i()) {
                ArrayList arrayList = fVar.f4464a;
                return !fVar.n((View) arrayList.get(arrayList.size() - 1)).f4447f;
            }
        } else if (fVar.o() > this.f4432u.m()) {
            return !fVar.n((View) fVar.f4464a.get(0)).f4447f;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void Y0(RecyclerView recyclerView, int i3, int i4) {
        u2(i3, i4, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void a1(RecyclerView recyclerView, int i3, int i4, Object obj) {
        u2(i3, i4, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void b1(RecyclerView.u uVar, RecyclerView.z zVar) {
        A2(uVar, zVar, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void c1(RecyclerView.z zVar) {
        super.c1(zVar);
        this.f4416C = -1;
        this.f4417D = Integer.MIN_VALUE;
        this.f4422I = null;
        this.f4425L.c();
    }

    public final d.a c2(int i3) {
        d.a aVar = new d.a();
        aVar.f4452g = new int[this.f4430s];
        for (int i4 = 0; i4 < this.f4430s; i4++) {
            aVar.f4452g[i4] = i3 - this.f4431t[i4].l(i3);
        }
        return aVar;
    }

    public final d.a d2(int i3) {
        d.a aVar = new d.a();
        aVar.f4452g = new int[this.f4430s];
        for (int i4 = 0; i4 < this.f4430s; i4++) {
            aVar.f4452g[i4] = this.f4431t[i4].p(i3) - i3;
        }
        return aVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.y.b
    public PointF e(int i3) {
        int V12 = V1(i3);
        PointF pointF = new PointF();
        if (V12 == 0) {
            return null;
        }
        if (this.f4434w == 0) {
            pointF.x = V12;
            pointF.y = 0.0f;
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = V12;
        return pointF;
    }

    public final void e2() {
        this.f4432u = i.b(this, this.f4434w);
        this.f4433v = i.b(this, 1 - this.f4434w);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v5 */
    public final int f2(RecyclerView.u uVar, androidx.recyclerview.widget.f fVar, RecyclerView.z zVar) {
        f fVar2;
        int s22;
        int e3;
        int m3;
        int e4;
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        StaggeredGridLayoutManager staggeredGridLayoutManager2 = this;
        ?? r8 = 0;
        staggeredGridLayoutManager2.f4415B.set(0, staggeredGridLayoutManager2.f4430s, true);
        int i3 = staggeredGridLayoutManager2.f4436y.f4597i ? fVar.f4593e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : fVar.f4593e == 1 ? fVar.f4595g + fVar.f4590b : fVar.f4594f - fVar.f4590b;
        staggeredGridLayoutManager2.O2(fVar.f4593e, i3);
        int i4 = staggeredGridLayoutManager2.f4414A ? staggeredGridLayoutManager2.f4432u.i() : staggeredGridLayoutManager2.f4432u.m();
        boolean z3 = false;
        StaggeredGridLayoutManager staggeredGridLayoutManager3 = staggeredGridLayoutManager2;
        while (fVar.a(zVar) && (staggeredGridLayoutManager3.f4436y.f4597i || !staggeredGridLayoutManager3.f4415B.isEmpty())) {
            View b3 = fVar.b(uVar);
            c cVar = (c) b3.getLayoutParams();
            int a3 = cVar.a();
            int g3 = staggeredGridLayoutManager3.f4418E.g(a3);
            boolean z4 = g3 == -1 ? true : r8;
            if (z4) {
                fVar2 = cVar.f4447f ? staggeredGridLayoutManager3.f4431t[r8] : staggeredGridLayoutManager3.t2(fVar);
                staggeredGridLayoutManager3.f4418E.n(a3, fVar2);
            } else {
                fVar2 = staggeredGridLayoutManager3.f4431t[g3];
            }
            f fVar3 = fVar2;
            cVar.f4446e = fVar3;
            if (fVar.f4593e == 1) {
                staggeredGridLayoutManager3.i(b3);
            } else {
                staggeredGridLayoutManager3.j(b3, r8);
            }
            staggeredGridLayoutManager3.z2(b3, cVar, r8);
            if (fVar.f4593e == 1) {
                e3 = cVar.f4447f ? staggeredGridLayoutManager3.p2(i4) : fVar3.l(i4);
                s22 = staggeredGridLayoutManager3.f4432u.e(b3) + e3;
                if (z4 && cVar.f4447f) {
                    d.a c22 = staggeredGridLayoutManager3.c2(e3);
                    c22.f4451f = -1;
                    c22.f4450e = a3;
                    staggeredGridLayoutManager3.f4418E.a(c22);
                }
            } else {
                s22 = cVar.f4447f ? staggeredGridLayoutManager3.s2(i4) : fVar3.p(i4);
                e3 = s22 - staggeredGridLayoutManager3.f4432u.e(b3);
                if (z4 && cVar.f4447f) {
                    d.a d22 = staggeredGridLayoutManager3.d2(s22);
                    d22.f4451f = 1;
                    d22.f4450e = a3;
                    staggeredGridLayoutManager3.f4418E.a(d22);
                }
            }
            if (cVar.f4447f && fVar.f4592d == -1) {
                if (z4) {
                    staggeredGridLayoutManager3.f4426M = true;
                } else {
                    if (!(fVar.f4593e == 1 ? staggeredGridLayoutManager3.S1() : staggeredGridLayoutManager3.T1())) {
                        d.a f3 = staggeredGridLayoutManager3.f4418E.f(a3);
                        if (f3 != null) {
                            f3.f4453h = true;
                        }
                        staggeredGridLayoutManager3.f4426M = true;
                    }
                }
            }
            staggeredGridLayoutManager3.U1(b3, cVar, fVar);
            if (staggeredGridLayoutManager3.x2() && staggeredGridLayoutManager3.f4434w == 1) {
                e4 = cVar.f4447f ? staggeredGridLayoutManager3.f4433v.i() : staggeredGridLayoutManager3.f4433v.i() - (((staggeredGridLayoutManager3.f4430s - 1) - fVar3.f4468e) * staggeredGridLayoutManager3.f4435x);
                m3 = e4 - staggeredGridLayoutManager3.f4433v.e(b3);
            } else {
                m3 = cVar.f4447f ? staggeredGridLayoutManager3.f4433v.m() : (fVar3.f4468e * staggeredGridLayoutManager3.f4435x) + staggeredGridLayoutManager3.f4433v.m();
                e4 = staggeredGridLayoutManager3.f4433v.e(b3) + m3;
            }
            int i5 = e4;
            int i6 = m3;
            if (staggeredGridLayoutManager3.f4434w == 1) {
                staggeredGridLayoutManager3.D0(b3, i6, e3, i5, s22);
                staggeredGridLayoutManager = this;
            } else {
                staggeredGridLayoutManager3.D0(b3, e3, i6, s22, i5);
                staggeredGridLayoutManager = staggeredGridLayoutManager3;
            }
            if (cVar.f4447f) {
                staggeredGridLayoutManager.O2(staggeredGridLayoutManager.f4436y.f4593e, i3);
            } else {
                staggeredGridLayoutManager.U2(fVar3, staggeredGridLayoutManager.f4436y.f4593e, i3);
            }
            staggeredGridLayoutManager.E2(uVar, staggeredGridLayoutManager.f4436y);
            if (staggeredGridLayoutManager.f4436y.f4596h && b3.hasFocusable()) {
                if (cVar.f4447f) {
                    staggeredGridLayoutManager.f4415B.clear();
                } else {
                    staggeredGridLayoutManager.f4415B.set(fVar3.f4468e, false);
                }
            }
            z3 = true;
            r8 = 0;
            staggeredGridLayoutManager3 = staggeredGridLayoutManager;
        }
        if (!z3) {
            staggeredGridLayoutManager3.E2(uVar, staggeredGridLayoutManager3.f4436y);
        }
        int m4 = staggeredGridLayoutManager3.f4436y.f4593e == -1 ? staggeredGridLayoutManager3.f4432u.m() - staggeredGridLayoutManager3.s2(staggeredGridLayoutManager3.f4432u.m()) : staggeredGridLayoutManager3.p2(staggeredGridLayoutManager3.f4432u.i()) - staggeredGridLayoutManager3.f4432u.i();
        if (m4 > 0) {
            return Math.min(fVar.f4590b, m4);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void g1(Parcelable parcelable) {
        if (parcelable instanceof e) {
            this.f4422I = (e) parcelable;
            x1();
        }
    }

    public final int g2(int i3) {
        int O3 = O();
        for (int i4 = 0; i4 < O3; i4++) {
            int l02 = l0(N(i4));
            if (l02 >= 0 && l02 < i3) {
                return l02;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public Parcelable h1() {
        int p3;
        int m3;
        int[] iArr;
        if (this.f4422I != null) {
            return new e(this.f4422I);
        }
        e eVar = new e();
        eVar.f4461l = this.f4437z;
        eVar.f4462m = this.f4420G;
        eVar.f4463n = this.f4421H;
        d dVar = this.f4418E;
        if (dVar == null || (iArr = dVar.f4448a) == null) {
            eVar.f4458i = 0;
        } else {
            eVar.f4459j = iArr;
            eVar.f4458i = iArr.length;
            eVar.f4460k = dVar.f4449b;
        }
        if (O() <= 0) {
            eVar.f4454e = -1;
            eVar.f4455f = -1;
            eVar.f4456g = 0;
            return eVar;
        }
        eVar.f4454e = this.f4420G ? o2() : n2();
        eVar.f4455f = j2();
        int i3 = this.f4430s;
        eVar.f4456g = i3;
        eVar.f4457h = new int[i3];
        for (int i4 = 0; i4 < this.f4430s; i4++) {
            if (this.f4420G) {
                p3 = this.f4431t[i4].l(Integer.MIN_VALUE);
                if (p3 != Integer.MIN_VALUE) {
                    m3 = this.f4432u.i();
                    p3 -= m3;
                    eVar.f4457h[i4] = p3;
                } else {
                    eVar.f4457h[i4] = p3;
                }
            } else {
                p3 = this.f4431t[i4].p(Integer.MIN_VALUE);
                if (p3 != Integer.MIN_VALUE) {
                    m3 = this.f4432u.m();
                    p3 -= m3;
                    eVar.f4457h[i4] = p3;
                } else {
                    eVar.f4457h[i4] = p3;
                }
            }
        }
        return eVar;
    }

    public View h2(boolean z3) {
        int m3 = this.f4432u.m();
        int i3 = this.f4432u.i();
        View view = null;
        for (int O3 = O() - 1; O3 >= 0; O3--) {
            View N3 = N(O3);
            int g3 = this.f4432u.g(N3);
            int d3 = this.f4432u.d(N3);
            if (d3 > m3 && g3 < i3) {
                if (d3 <= i3 || !z3) {
                    return N3;
                }
                if (view == null) {
                    view = N3;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void i1(int i3) {
        if (i3 == 0) {
            W1();
        }
    }

    public View i2(boolean z3) {
        int m3 = this.f4432u.m();
        int i3 = this.f4432u.i();
        int O3 = O();
        View view = null;
        for (int i4 = 0; i4 < O3; i4++) {
            View N3 = N(i4);
            int g3 = this.f4432u.g(N3);
            if (this.f4432u.d(N3) > m3 && g3 < i3) {
                if (g3 >= m3 || !z3) {
                    return N3;
                }
                if (view == null) {
                    view = N3;
                }
            }
        }
        return view;
    }

    public int j2() {
        View h22 = this.f4414A ? h2(true) : i2(true);
        if (h22 == null) {
            return -1;
        }
        return l0(h22);
    }

    public final int k2(int i3) {
        for (int O3 = O() - 1; O3 >= 0; O3--) {
            int l02 = l0(N(O3));
            if (l02 >= 0 && l02 < i3) {
                return l02;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void l(String str) {
        if (this.f4422I == null) {
            super.l(str);
        }
    }

    public final void l2(RecyclerView.u uVar, RecyclerView.z zVar, boolean z3) {
        int i3;
        int p22 = p2(Integer.MIN_VALUE);
        if (p22 != Integer.MIN_VALUE && (i3 = this.f4432u.i() - p22) > 0) {
            int i4 = i3 - (-J2(-i3, uVar, zVar));
            if (!z3 || i4 <= 0) {
                return;
            }
            this.f4432u.r(i4);
        }
    }

    public final void m2(RecyclerView.u uVar, RecyclerView.z zVar, boolean z3) {
        int m3;
        int s22 = s2(Integer.MAX_VALUE);
        if (s22 != Integer.MAX_VALUE && (m3 = s22 - this.f4432u.m()) > 0) {
            int J22 = m3 - J2(m3, uVar, zVar);
            if (!z3 || J22 <= 0) {
                return;
            }
            this.f4432u.r(-J22);
        }
    }

    public int n2() {
        if (O() == 0) {
            return 0;
        }
        return l0(N(0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int o0(RecyclerView.u uVar, RecyclerView.z zVar) {
        return this.f4434w == 0 ? this.f4430s : super.o0(uVar, zVar);
    }

    public int o2() {
        int O3 = O();
        if (O3 == 0) {
            return 0;
        }
        return l0(N(O3 - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean p() {
        return this.f4434w == 0;
    }

    public final int p2(int i3) {
        int l3 = this.f4431t[0].l(i3);
        for (int i4 = 1; i4 < this.f4430s; i4++) {
            int l4 = this.f4431t[i4].l(i3);
            if (l4 > l3) {
                l3 = l4;
            }
        }
        return l3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean q() {
        return this.f4434w == 1;
    }

    public final int q2(int i3) {
        int p3 = this.f4431t[0].p(i3);
        for (int i4 = 1; i4 < this.f4430s; i4++) {
            int p4 = this.f4431t[i4].p(i3);
            if (p4 > p3) {
                p3 = p4;
            }
        }
        return p3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean r(RecyclerView.p pVar) {
        return pVar instanceof c;
    }

    public final int r2(int i3) {
        int l3 = this.f4431t[0].l(i3);
        for (int i4 = 1; i4 < this.f4430s; i4++) {
            int l4 = this.f4431t[i4].l(i3);
            if (l4 < l3) {
                l3 = l4;
            }
        }
        return l3;
    }

    public final int s2(int i3) {
        int p3 = this.f4431t[0].p(i3);
        for (int i4 = 1; i4 < this.f4430s; i4++) {
            int p4 = this.f4431t[i4].p(i3);
            if (p4 < p3) {
                p3 = p4;
            }
        }
        return p3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void t(int i3, int i4, RecyclerView.z zVar, RecyclerView.o.c cVar) {
        int l3;
        int i5;
        if (this.f4434w != 0) {
            i3 = i4;
        }
        if (O() == 0 || i3 == 0) {
            return;
        }
        C2(i3, zVar);
        int[] iArr = this.f4428O;
        if (iArr == null || iArr.length < this.f4430s) {
            this.f4428O = new int[this.f4430s];
        }
        int i6 = 0;
        for (int i7 = 0; i7 < this.f4430s; i7++) {
            androidx.recyclerview.widget.f fVar = this.f4436y;
            if (fVar.f4592d == -1) {
                l3 = fVar.f4594f;
                i5 = this.f4431t[i7].p(l3);
            } else {
                l3 = this.f4431t[i7].l(fVar.f4595g);
                i5 = this.f4436y.f4595g;
            }
            int i8 = l3 - i5;
            if (i8 >= 0) {
                this.f4428O[i6] = i8;
                i6++;
            }
        }
        Arrays.sort(this.f4428O, 0, i6);
        for (int i9 = 0; i9 < i6 && this.f4436y.a(zVar); i9++) {
            cVar.a(this.f4436y.f4591c, this.f4428O[i9]);
            androidx.recyclerview.widget.f fVar2 = this.f4436y;
            fVar2.f4591c += fVar2.f4592d;
        }
    }

    public final f t2(androidx.recyclerview.widget.f fVar) {
        int i3;
        int i4;
        int i5;
        if (B2(fVar.f4593e)) {
            i4 = this.f4430s - 1;
            i3 = -1;
            i5 = -1;
        } else {
            i3 = this.f4430s;
            i4 = 0;
            i5 = 1;
        }
        f fVar2 = null;
        if (fVar.f4593e == 1) {
            int m3 = this.f4432u.m();
            int i6 = Integer.MAX_VALUE;
            while (i4 != i3) {
                f fVar3 = this.f4431t[i4];
                int l3 = fVar3.l(m3);
                if (l3 < i6) {
                    fVar2 = fVar3;
                    i6 = l3;
                }
                i4 += i5;
            }
            return fVar2;
        }
        int i7 = this.f4432u.i();
        int i8 = Integer.MIN_VALUE;
        while (i4 != i3) {
            f fVar4 = this.f4431t[i4];
            int p3 = fVar4.p(i7);
            if (p3 > i8) {
                fVar2 = fVar4;
                i8 = p3;
            }
            i4 += i5;
        }
        return fVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u2(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f4414A
            if (r0 == 0) goto L9
            int r0 = r6.o2()
            goto Ld
        L9:
            int r0 = r6.n2()
        Ld:
            r1 = 8
            if (r9 != r1) goto L1b
            if (r7 >= r8) goto L17
            int r2 = r8 + 1
        L15:
            r3 = r7
            goto L1e
        L17:
            int r2 = r7 + 1
            r3 = r8
            goto L1e
        L1b:
            int r2 = r7 + r8
            goto L15
        L1e:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.f4418E
            r4.h(r3)
            r4 = 1
            if (r9 == r4) goto L3d
            r5 = 2
            if (r9 == r5) goto L37
            if (r9 == r1) goto L2c
            goto L42
        L2c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f4418E
            r9.k(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.f4418E
            r7.j(r8, r4)
            goto L42
        L37:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f4418E
            r9.k(r7, r8)
            goto L42
        L3d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.f4418E
            r9.j(r7, r8)
        L42:
            if (r2 > r0) goto L45
            goto L57
        L45:
            boolean r7 = r6.f4414A
            if (r7 == 0) goto L4e
            int r7 = r6.n2()
            goto L52
        L4e:
            int r7 = r6.o2()
        L52:
            if (r3 > r7) goto L57
            r6.x1()
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.u2(int, int, int):void");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int v(RecyclerView.z zVar) {
        return Y1(zVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View v2() {
        /*
            r12 = this;
            int r0 = r12.O()
            int r1 = r0 + (-1)
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f4430s
            r2.<init>(r3)
            int r3 = r12.f4430s
            r4 = 0
            r5 = 1
            r2.set(r4, r3, r5)
            int r3 = r12.f4434w
            r6 = -1
            if (r3 != r5) goto L21
            boolean r3 = r12.x2()
            if (r3 == 0) goto L21
            r3 = r5
            goto L22
        L21:
            r3 = r6
        L22:
            boolean r7 = r12.f4414A
            if (r7 == 0) goto L28
            r0 = r6
            goto L29
        L28:
            r1 = r4
        L29:
            if (r1 >= r0) goto L2c
            r6 = r5
        L2c:
            if (r1 == r0) goto La4
            android.view.View r7 = r12.N(r1)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f4446e
            int r9 = r9.f4468e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L52
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f4446e
            boolean r9 = r12.X1(r9)
            if (r9 == 0) goto L4b
            goto La1
        L4b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f4446e
            int r9 = r9.f4468e
            r2.clear(r9)
        L52:
            boolean r9 = r8.f4447f
            if (r9 == 0) goto L57
            goto La2
        L57:
            int r9 = r1 + r6
            if (r9 == r0) goto La2
            android.view.View r9 = r12.N(r9)
            boolean r10 = r12.f4414A
            if (r10 == 0) goto L75
            androidx.recyclerview.widget.i r10 = r12.f4432u
            int r10 = r10.d(r7)
            androidx.recyclerview.widget.i r11 = r12.f4432u
            int r11 = r11.d(r9)
            if (r10 >= r11) goto L72
            goto La1
        L72:
            if (r10 != r11) goto La2
            goto L86
        L75:
            androidx.recyclerview.widget.i r10 = r12.f4432u
            int r10 = r10.g(r7)
            androidx.recyclerview.widget.i r11 = r12.f4432u
            int r11 = r11.g(r9)
            if (r10 <= r11) goto L84
            goto La1
        L84:
            if (r10 != r11) goto La2
        L86:
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r8 = r8.f4446e
            int r8 = r8.f4468e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r9.f4446e
            int r9 = r9.f4468e
            int r8 = r8 - r9
            if (r8 >= 0) goto L99
            r8 = r5
            goto L9a
        L99:
            r8 = r4
        L9a:
            if (r3 >= 0) goto L9e
            r9 = r5
            goto L9f
        L9e:
            r9 = r4
        L9f:
            if (r8 == r9) goto La2
        La1:
            return r7
        La2:
            int r1 = r1 + r6
            goto L2c
        La4:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.v2():android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int w(RecyclerView.z zVar) {
        return Z1(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean w0() {
        return this.f4419F != 0;
    }

    public void w2() {
        this.f4418E.b();
        x1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int x(RecyclerView.z zVar) {
        return a2(zVar);
    }

    public boolean x2() {
        return d0() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int y(RecyclerView.z zVar) {
        return Y1(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int z(RecyclerView.z zVar) {
        return Z1(zVar);
    }

    public final void z2(View view, c cVar, boolean z3) {
        if (cVar.f4447f) {
            if (this.f4434w == 1) {
                y2(view, this.f4423J, RecyclerView.o.P(b0(), c0(), k0() + h0(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z3);
                return;
            } else {
                y2(view, RecyclerView.o.P(s0(), t0(), i0() + j0(), ((ViewGroup.MarginLayoutParams) cVar).width, true), this.f4423J, z3);
                return;
            }
        }
        if (this.f4434w == 1) {
            y2(view, RecyclerView.o.P(this.f4435x, t0(), 0, ((ViewGroup.MarginLayoutParams) cVar).width, false), RecyclerView.o.P(b0(), c0(), k0() + h0(), ((ViewGroup.MarginLayoutParams) cVar).height, true), z3);
        } else {
            y2(view, RecyclerView.o.P(s0(), t0(), i0() + j0(), ((ViewGroup.MarginLayoutParams) cVar).width, true), RecyclerView.o.P(this.f4435x, c0(), 0, ((ViewGroup.MarginLayoutParams) cVar).height, false), z3);
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public int[] f4448a;

        /* renamed from: b, reason: collision with root package name */
        public List f4449b;

        public void a(a aVar) {
            if (this.f4449b == null) {
                this.f4449b = new ArrayList();
            }
            int size = this.f4449b.size();
            for (int i3 = 0; i3 < size; i3++) {
                a aVar2 = (a) this.f4449b.get(i3);
                if (aVar2.f4450e == aVar.f4450e) {
                    this.f4449b.remove(i3);
                }
                if (aVar2.f4450e >= aVar.f4450e) {
                    this.f4449b.add(i3, aVar);
                    return;
                }
            }
            this.f4449b.add(aVar);
        }

        public void b() {
            int[] iArr = this.f4448a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f4449b = null;
        }

        public void c(int i3) {
            int[] iArr = this.f4448a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i3, 10) + 1];
                this.f4448a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i3 >= iArr.length) {
                int[] iArr3 = new int[o(i3)];
                this.f4448a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f4448a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        public int d(int i3) {
            List list = this.f4449b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (((a) this.f4449b.get(size)).f4450e >= i3) {
                        this.f4449b.remove(size);
                    }
                }
            }
            return h(i3);
        }

        public a e(int i3, int i4, int i5, boolean z3) {
            List list = this.f4449b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                a aVar = (a) this.f4449b.get(i6);
                int i7 = aVar.f4450e;
                if (i7 >= i4) {
                    return null;
                }
                if (i7 >= i3 && (i5 == 0 || aVar.f4451f == i5 || (z3 && aVar.f4453h))) {
                    return aVar;
                }
            }
            return null;
        }

        public a f(int i3) {
            List list = this.f4449b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f4449b.get(size);
                if (aVar.f4450e == i3) {
                    return aVar;
                }
            }
            return null;
        }

        public int g(int i3) {
            int[] iArr = this.f4448a;
            if (iArr == null || i3 >= iArr.length) {
                return -1;
            }
            return iArr[i3];
        }

        public int h(int i3) {
            int[] iArr = this.f4448a;
            if (iArr == null || i3 >= iArr.length) {
                return -1;
            }
            int i4 = i(i3);
            if (i4 == -1) {
                int[] iArr2 = this.f4448a;
                Arrays.fill(iArr2, i3, iArr2.length, -1);
                return this.f4448a.length;
            }
            int i5 = i4 + 1;
            Arrays.fill(this.f4448a, i3, i5, -1);
            return i5;
        }

        public final int i(int i3) {
            if (this.f4449b == null) {
                return -1;
            }
            a f3 = f(i3);
            if (f3 != null) {
                this.f4449b.remove(f3);
            }
            int size = this.f4449b.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    i4 = -1;
                    break;
                }
                if (((a) this.f4449b.get(i4)).f4450e >= i3) {
                    break;
                }
                i4++;
            }
            if (i4 == -1) {
                return -1;
            }
            a aVar = (a) this.f4449b.get(i4);
            this.f4449b.remove(i4);
            return aVar.f4450e;
        }

        public void j(int i3, int i4) {
            int[] iArr = this.f4448a;
            if (iArr == null || i3 >= iArr.length) {
                return;
            }
            int i5 = i3 + i4;
            c(i5);
            int[] iArr2 = this.f4448a;
            System.arraycopy(iArr2, i3, iArr2, i5, (iArr2.length - i3) - i4);
            Arrays.fill(this.f4448a, i3, i5, -1);
            l(i3, i4);
        }

        public void k(int i3, int i4) {
            int[] iArr = this.f4448a;
            if (iArr == null || i3 >= iArr.length) {
                return;
            }
            int i5 = i3 + i4;
            c(i5);
            int[] iArr2 = this.f4448a;
            System.arraycopy(iArr2, i5, iArr2, i3, (iArr2.length - i3) - i4);
            int[] iArr3 = this.f4448a;
            Arrays.fill(iArr3, iArr3.length - i4, iArr3.length, -1);
            m(i3, i4);
        }

        public final void l(int i3, int i4) {
            List list = this.f4449b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f4449b.get(size);
                int i5 = aVar.f4450e;
                if (i5 >= i3) {
                    aVar.f4450e = i5 + i4;
                }
            }
        }

        public final void m(int i3, int i4) {
            List list = this.f4449b;
            if (list == null) {
                return;
            }
            int i5 = i3 + i4;
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = (a) this.f4449b.get(size);
                int i6 = aVar.f4450e;
                if (i6 >= i3) {
                    if (i6 < i5) {
                        this.f4449b.remove(size);
                    } else {
                        aVar.f4450e = i6 - i4;
                    }
                }
            }
        }

        public void n(int i3, f fVar) {
            c(i3);
            this.f4448a[i3] = fVar.f4468e;
        }

        public int o(int i3) {
            int length = this.f4448a.length;
            while (length <= i3) {
                length *= 2;
            }
            return length;
        }

        public static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0095a();

            /* renamed from: e, reason: collision with root package name */
            public int f4450e;

            /* renamed from: f, reason: collision with root package name */
            public int f4451f;

            /* renamed from: g, reason: collision with root package name */
            public int[] f4452g;

            /* renamed from: h, reason: collision with root package name */
            public boolean f4453h;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a, reason: collision with other inner class name */
            public static class C0095a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public a[] newArray(int i3) {
                    return new a[i3];
                }
            }

            public a(Parcel parcel) {
                this.f4450e = parcel.readInt();
                this.f4451f = parcel.readInt();
                this.f4453h = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f4452g = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            public int a(int i3) {
                int[] iArr = this.f4452g;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i3];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f4450e + ", mGapDir=" + this.f4451f + ", mHasUnwantedGapAfter=" + this.f4453h + ", mGapPerSpan=" + Arrays.toString(this.f4452g) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i3) {
                parcel.writeInt(this.f4450e);
                parcel.writeInt(this.f4451f);
                parcel.writeInt(this.f4453h ? 1 : 0);
                int[] iArr = this.f4452g;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(iArr.length);
                    parcel.writeIntArray(this.f4452g);
                }
            }

            public a() {
            }
        }
    }
}
