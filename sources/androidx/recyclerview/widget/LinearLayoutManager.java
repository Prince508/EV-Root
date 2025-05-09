package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.o implements RecyclerView.y.b {

    /* renamed from: A, reason: collision with root package name */
    public int f4173A;

    /* renamed from: B, reason: collision with root package name */
    public int f4174B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f4175C;

    /* renamed from: D, reason: collision with root package name */
    public d f4176D;

    /* renamed from: E, reason: collision with root package name */
    public final a f4177E;

    /* renamed from: F, reason: collision with root package name */
    public final b f4178F;

    /* renamed from: G, reason: collision with root package name */
    public int f4179G;

    /* renamed from: H, reason: collision with root package name */
    public int[] f4180H;

    /* renamed from: s, reason: collision with root package name */
    public int f4181s;

    /* renamed from: t, reason: collision with root package name */
    public c f4182t;

    /* renamed from: u, reason: collision with root package name */
    public i f4183u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f4184v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f4185w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f4186x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f4187y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f4188z;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public i f4189a;

        /* renamed from: b, reason: collision with root package name */
        public int f4190b;

        /* renamed from: c, reason: collision with root package name */
        public int f4191c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f4192d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f4193e;

        public a() {
            e();
        }

        public void a() {
            this.f4191c = this.f4192d ? this.f4189a.i() : this.f4189a.m();
        }

        public void b(View view, int i3) {
            if (this.f4192d) {
                this.f4191c = this.f4189a.d(view) + this.f4189a.o();
            } else {
                this.f4191c = this.f4189a.g(view);
            }
            this.f4190b = i3;
        }

        public void c(View view, int i3) {
            int o3 = this.f4189a.o();
            if (o3 >= 0) {
                b(view, i3);
                return;
            }
            this.f4190b = i3;
            if (this.f4192d) {
                int i4 = (this.f4189a.i() - o3) - this.f4189a.d(view);
                this.f4191c = this.f4189a.i() - i4;
                if (i4 > 0) {
                    int e3 = this.f4191c - this.f4189a.e(view);
                    int m3 = this.f4189a.m();
                    int min = e3 - (m3 + Math.min(this.f4189a.g(view) - m3, 0));
                    if (min < 0) {
                        this.f4191c += Math.min(i4, -min);
                        return;
                    }
                    return;
                }
                return;
            }
            int g3 = this.f4189a.g(view);
            int m4 = g3 - this.f4189a.m();
            this.f4191c = g3;
            if (m4 > 0) {
                int i5 = (this.f4189a.i() - Math.min(0, (this.f4189a.i() - o3) - this.f4189a.d(view))) - (g3 + this.f4189a.e(view));
                if (i5 < 0) {
                    this.f4191c -= Math.min(m4, -i5);
                }
            }
        }

        public boolean d(View view, RecyclerView.z zVar) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return !pVar.c() && pVar.a() >= 0 && pVar.a() < zVar.b();
        }

        public void e() {
            this.f4190b = -1;
            this.f4191c = Integer.MIN_VALUE;
            this.f4192d = false;
            this.f4193e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f4190b + ", mCoordinate=" + this.f4191c + ", mLayoutFromEnd=" + this.f4192d + ", mValid=" + this.f4193e + '}';
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f4194a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f4195b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f4196c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f4197d;

        public void a() {
            this.f4194a = 0;
            this.f4195b = false;
            this.f4196c = false;
            this.f4197d = false;
        }
    }

    public static class c {

        /* renamed from: b, reason: collision with root package name */
        public int f4199b;

        /* renamed from: c, reason: collision with root package name */
        public int f4200c;

        /* renamed from: d, reason: collision with root package name */
        public int f4201d;

        /* renamed from: e, reason: collision with root package name */
        public int f4202e;

        /* renamed from: f, reason: collision with root package name */
        public int f4203f;

        /* renamed from: g, reason: collision with root package name */
        public int f4204g;

        /* renamed from: k, reason: collision with root package name */
        public int f4208k;

        /* renamed from: m, reason: collision with root package name */
        public boolean f4210m;

        /* renamed from: a, reason: collision with root package name */
        public boolean f4198a = true;

        /* renamed from: h, reason: collision with root package name */
        public int f4205h = 0;

        /* renamed from: i, reason: collision with root package name */
        public int f4206i = 0;

        /* renamed from: j, reason: collision with root package name */
        public boolean f4207j = false;

        /* renamed from: l, reason: collision with root package name */
        public List f4209l = null;

        public void a() {
            b(null);
        }

        public void b(View view) {
            View f3 = f(view);
            if (f3 == null) {
                this.f4201d = -1;
            } else {
                this.f4201d = ((RecyclerView.p) f3.getLayoutParams()).a();
            }
        }

        public boolean c(RecyclerView.z zVar) {
            int i3 = this.f4201d;
            return i3 >= 0 && i3 < zVar.b();
        }

        public View d(RecyclerView.u uVar) {
            if (this.f4209l != null) {
                return e();
            }
            View o3 = uVar.o(this.f4201d);
            this.f4201d += this.f4202e;
            return o3;
        }

        public final View e() {
            int size = this.f4209l.size();
            for (int i3 = 0; i3 < size; i3++) {
                View view = ((RecyclerView.C) this.f4209l.get(i3)).f4302a;
                RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
                if (!pVar.c() && this.f4201d == pVar.a()) {
                    b(view);
                    return view;
                }
            }
            return null;
        }

        public View f(View view) {
            int a3;
            int size = this.f4209l.size();
            View view2 = null;
            int i3 = Integer.MAX_VALUE;
            for (int i4 = 0; i4 < size; i4++) {
                View view3 = ((RecyclerView.C) this.f4209l.get(i4)).f4302a;
                RecyclerView.p pVar = (RecyclerView.p) view3.getLayoutParams();
                if (view3 != view && !pVar.c() && (a3 = (pVar.a() - this.f4201d) * this.f4202e) >= 0 && a3 < i3) {
                    if (a3 == 0) {
                        return view3;
                    }
                    view2 = view3;
                    i3 = a3;
                }
            }
            return view2;
        }
    }

    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: e, reason: collision with root package name */
        public int f4211e;

        /* renamed from: f, reason: collision with root package name */
        public int f4212f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f4213g;

        public static class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public d[] newArray(int i3) {
                return new d[i3];
            }
        }

        public d() {
        }

        public boolean a() {
            return this.f4211e >= 0;
        }

        public void b() {
            this.f4211e = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i3) {
            parcel.writeInt(this.f4211e);
            parcel.writeInt(this.f4212f);
            parcel.writeInt(this.f4213g ? 1 : 0);
        }

        public d(Parcel parcel) {
            this.f4211e = parcel.readInt();
            this.f4212f = parcel.readInt();
            this.f4213g = parcel.readInt() == 1;
        }

        public d(d dVar) {
            this.f4211e = dVar.f4211e;
            this.f4212f = dVar.f4212f;
            this.f4213g = dVar.f4213g;
        }
    }

    public LinearLayoutManager(Context context, int i3, boolean z3) {
        this.f4181s = 1;
        this.f4185w = false;
        this.f4186x = false;
        this.f4187y = false;
        this.f4188z = true;
        this.f4173A = -1;
        this.f4174B = Integer.MIN_VALUE;
        this.f4176D = null;
        this.f4177E = new a();
        this.f4178F = new b();
        this.f4179G = 2;
        this.f4180H = new int[2];
        G2(i3);
        H2(z3);
    }

    private View q2() {
        return N(this.f4186x ? 0 : O() - 1);
    }

    private View r2() {
        return N(this.f4186x ? O() - 1 : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int A(RecyclerView.z zVar) {
        return U1(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int A1(int i3, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (this.f4181s == 1) {
            return 0;
        }
        return F2(i3, uVar, zVar);
    }

    public final void A2(RecyclerView.u uVar, int i3, int i4) {
        if (i3 == i4) {
            return;
        }
        if (i4 <= i3) {
            while (i3 > i4) {
                r1(i3, uVar);
                i3--;
            }
        } else {
            for (int i5 = i4 - 1; i5 >= i3; i5--) {
                r1(i5, uVar);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void B1(int i3) {
        this.f4173A = i3;
        this.f4174B = Integer.MIN_VALUE;
        d dVar = this.f4176D;
        if (dVar != null) {
            dVar.b();
        }
        x1();
    }

    public final void B2(RecyclerView.u uVar, int i3, int i4) {
        int O3 = O();
        if (i3 < 0) {
            return;
        }
        int h3 = (this.f4183u.h() - i3) + i4;
        if (this.f4186x) {
            for (int i5 = 0; i5 < O3; i5++) {
                View N3 = N(i5);
                if (this.f4183u.g(N3) < h3 || this.f4183u.q(N3) < h3) {
                    A2(uVar, 0, i5);
                    return;
                }
            }
            return;
        }
        int i6 = O3 - 1;
        for (int i7 = i6; i7 >= 0; i7--) {
            View N4 = N(i7);
            if (this.f4183u.g(N4) < h3 || this.f4183u.q(N4) < h3) {
                A2(uVar, i6, i7);
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int C1(int i3, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (this.f4181s == 0) {
            return 0;
        }
        return F2(i3, uVar, zVar);
    }

    public final void C2(RecyclerView.u uVar, int i3, int i4) {
        if (i3 < 0) {
            return;
        }
        int i5 = i3 - i4;
        int O3 = O();
        if (!this.f4186x) {
            for (int i6 = 0; i6 < O3; i6++) {
                View N3 = N(i6);
                if (this.f4183u.d(N3) > i5 || this.f4183u.p(N3) > i5) {
                    A2(uVar, 0, i6);
                    return;
                }
            }
            return;
        }
        int i7 = O3 - 1;
        for (int i8 = i7; i8 >= 0; i8--) {
            View N4 = N(i8);
            if (this.f4183u.d(N4) > i5 || this.f4183u.p(N4) > i5) {
                A2(uVar, i7, i8);
                return;
            }
        }
    }

    public boolean D2() {
        return this.f4183u.k() == 0 && this.f4183u.h() == 0;
    }

    public final void E2() {
        if (this.f4181s == 1 || !u2()) {
            this.f4186x = this.f4185w;
        } else {
            this.f4186x = !this.f4185w;
        }
    }

    public int F2(int i3, RecyclerView.u uVar, RecyclerView.z zVar) {
        if (O() == 0 || i3 == 0) {
            return 0;
        }
        X1();
        this.f4182t.f4198a = true;
        int i4 = i3 > 0 ? 1 : -1;
        int abs = Math.abs(i3);
        M2(i4, abs, true, zVar);
        c cVar = this.f4182t;
        int Y12 = cVar.f4204g + Y1(uVar, cVar, zVar, false);
        if (Y12 < 0) {
            return 0;
        }
        if (abs > Y12) {
            i3 = i4 * Y12;
        }
        this.f4183u.r(-i3);
        this.f4182t.f4208k = i3;
        return i3;
    }

    public void G2(int i3) {
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i3);
        }
        l(null);
        if (i3 != this.f4181s || this.f4183u == null) {
            i b3 = i.b(this, i3);
            this.f4183u = b3;
            this.f4177E.f4189a = b3;
            this.f4181s = i3;
            x1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View H(int i3) {
        int O3 = O();
        if (O3 == 0) {
            return null;
        }
        int l02 = i3 - l0(N(0));
        if (l02 >= 0 && l02 < O3) {
            View N3 = N(l02);
            if (l0(N3) == i3) {
                return N3;
            }
        }
        return super.H(i3);
    }

    public void H2(boolean z3) {
        l(null);
        if (z3 == this.f4185w) {
            return;
        }
        this.f4185w = z3;
        x1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p I() {
        return new RecyclerView.p(-2, -2);
    }

    public void I2(boolean z3) {
        l(null);
        if (this.f4187y == z3) {
            return;
        }
        this.f4187y = z3;
        x1();
    }

    public final boolean J2(RecyclerView.u uVar, RecyclerView.z zVar, a aVar) {
        if (O() == 0) {
            return false;
        }
        View a02 = a0();
        if (a02 != null && aVar.d(a02, zVar)) {
            aVar.c(a02, l0(a02));
            return true;
        }
        if (this.f4184v != this.f4187y) {
            return false;
        }
        View m22 = aVar.f4192d ? m2(uVar, zVar) : n2(uVar, zVar);
        if (m22 == null) {
            return false;
        }
        aVar.b(m22, l0(m22));
        if (!zVar.e() && P1() && (this.f4183u.g(m22) >= this.f4183u.i() || this.f4183u.d(m22) < this.f4183u.m())) {
            aVar.f4191c = aVar.f4192d ? this.f4183u.i() : this.f4183u.m();
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean K1() {
        return (c0() == 1073741824 || t0() == 1073741824 || !u0()) ? false : true;
    }

    public final boolean K2(RecyclerView.z zVar, a aVar) {
        int i3;
        if (!zVar.e() && (i3 = this.f4173A) != -1) {
            if (i3 >= 0 && i3 < zVar.b()) {
                aVar.f4190b = this.f4173A;
                d dVar = this.f4176D;
                if (dVar != null && dVar.a()) {
                    boolean z3 = this.f4176D.f4213g;
                    aVar.f4192d = z3;
                    if (z3) {
                        aVar.f4191c = this.f4183u.i() - this.f4176D.f4212f;
                    } else {
                        aVar.f4191c = this.f4183u.m() + this.f4176D.f4212f;
                    }
                    return true;
                }
                if (this.f4174B != Integer.MIN_VALUE) {
                    boolean z4 = this.f4186x;
                    aVar.f4192d = z4;
                    if (z4) {
                        aVar.f4191c = this.f4183u.i() - this.f4174B;
                    } else {
                        aVar.f4191c = this.f4183u.m() + this.f4174B;
                    }
                    return true;
                }
                View H3 = H(this.f4173A);
                if (H3 == null) {
                    if (O() > 0) {
                        aVar.f4192d = (this.f4173A < l0(N(0))) == this.f4186x;
                    }
                    aVar.a();
                } else {
                    if (this.f4183u.e(H3) > this.f4183u.n()) {
                        aVar.a();
                        return true;
                    }
                    if (this.f4183u.g(H3) - this.f4183u.m() < 0) {
                        aVar.f4191c = this.f4183u.m();
                        aVar.f4192d = false;
                        return true;
                    }
                    if (this.f4183u.i() - this.f4183u.d(H3) < 0) {
                        aVar.f4191c = this.f4183u.i();
                        aVar.f4192d = true;
                        return true;
                    }
                    aVar.f4191c = aVar.f4192d ? this.f4183u.d(H3) + this.f4183u.o() : this.f4183u.g(H3);
                }
                return true;
            }
            this.f4173A = -1;
            this.f4174B = Integer.MIN_VALUE;
        }
        return false;
    }

    public final void L2(RecyclerView.u uVar, RecyclerView.z zVar, a aVar) {
        if (K2(zVar, aVar) || J2(uVar, zVar, aVar)) {
            return;
        }
        aVar.a();
        aVar.f4190b = this.f4187y ? zVar.b() - 1 : 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void M0(RecyclerView recyclerView, RecyclerView.u uVar) {
        super.M0(recyclerView, uVar);
        if (this.f4175C) {
            o1(uVar);
            uVar.c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void M1(RecyclerView recyclerView, RecyclerView.z zVar, int i3) {
        g gVar = new g(recyclerView.getContext());
        gVar.p(i3);
        N1(gVar);
    }

    public final void M2(int i3, int i4, boolean z3, RecyclerView.z zVar) {
        int m3;
        this.f4182t.f4210m = D2();
        this.f4182t.f4203f = i3;
        int[] iArr = this.f4180H;
        iArr[0] = 0;
        iArr[1] = 0;
        Q1(zVar, iArr);
        int max = Math.max(0, this.f4180H[0]);
        int max2 = Math.max(0, this.f4180H[1]);
        boolean z4 = i3 == 1;
        c cVar = this.f4182t;
        int i5 = z4 ? max2 : max;
        cVar.f4205h = i5;
        if (!z4) {
            max = max2;
        }
        cVar.f4206i = max;
        if (z4) {
            cVar.f4205h = i5 + this.f4183u.j();
            View q22 = q2();
            c cVar2 = this.f4182t;
            cVar2.f4202e = this.f4186x ? -1 : 1;
            int l02 = l0(q22);
            c cVar3 = this.f4182t;
            cVar2.f4201d = l02 + cVar3.f4202e;
            cVar3.f4199b = this.f4183u.d(q22);
            m3 = this.f4183u.d(q22) - this.f4183u.i();
        } else {
            View r22 = r2();
            this.f4182t.f4205h += this.f4183u.m();
            c cVar4 = this.f4182t;
            cVar4.f4202e = this.f4186x ? 1 : -1;
            int l03 = l0(r22);
            c cVar5 = this.f4182t;
            cVar4.f4201d = l03 + cVar5.f4202e;
            cVar5.f4199b = this.f4183u.g(r22);
            m3 = (-this.f4183u.g(r22)) + this.f4183u.m();
        }
        c cVar6 = this.f4182t;
        cVar6.f4200c = i4;
        if (z3) {
            cVar6.f4200c = i4 - m3;
        }
        cVar6.f4204g = m3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View N0(View view, int i3, RecyclerView.u uVar, RecyclerView.z zVar) {
        int V12;
        E2();
        if (O() == 0 || (V12 = V1(i3)) == Integer.MIN_VALUE) {
            return null;
        }
        X1();
        M2(V12, (int) (this.f4183u.n() * 0.33333334f), false, zVar);
        c cVar = this.f4182t;
        cVar.f4204g = Integer.MIN_VALUE;
        cVar.f4198a = false;
        Y1(uVar, cVar, zVar, true);
        View k22 = V12 == -1 ? k2() : j2();
        View r22 = V12 == -1 ? r2() : q2();
        if (!r22.hasFocusable()) {
            return k22;
        }
        if (k22 == null) {
            return null;
        }
        return r22;
    }

    public final void N2(int i3, int i4) {
        this.f4182t.f4200c = this.f4183u.i() - i4;
        c cVar = this.f4182t;
        cVar.f4202e = this.f4186x ? -1 : 1;
        cVar.f4201d = i3;
        cVar.f4203f = 1;
        cVar.f4199b = i4;
        cVar.f4204g = Integer.MIN_VALUE;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void O0(AccessibilityEvent accessibilityEvent) {
        super.O0(accessibilityEvent);
        if (O() > 0) {
            accessibilityEvent.setFromIndex(d2());
            accessibilityEvent.setToIndex(g2());
        }
    }

    public final void O2(a aVar) {
        N2(aVar.f4190b, aVar.f4191c);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean P1() {
        return this.f4176D == null && this.f4184v == this.f4187y;
    }

    public final void P2(int i3, int i4) {
        this.f4182t.f4200c = i4 - this.f4183u.m();
        c cVar = this.f4182t;
        cVar.f4201d = i3;
        cVar.f4202e = this.f4186x ? 1 : -1;
        cVar.f4203f = -1;
        cVar.f4199b = i4;
        cVar.f4204g = Integer.MIN_VALUE;
    }

    public void Q1(RecyclerView.z zVar, int[] iArr) {
        int i3;
        int s22 = s2(zVar);
        if (this.f4182t.f4203f == -1) {
            i3 = 0;
        } else {
            i3 = s22;
            s22 = 0;
        }
        iArr[0] = s22;
        iArr[1] = i3;
    }

    public final void Q2(a aVar) {
        P2(aVar.f4190b, aVar.f4191c);
    }

    public void R1(RecyclerView.z zVar, c cVar, RecyclerView.o.c cVar2) {
        int i3 = cVar.f4201d;
        if (i3 < 0 || i3 >= zVar.b()) {
            return;
        }
        cVar2.a(i3, Math.max(0, cVar.f4204g));
    }

    public final int S1(RecyclerView.z zVar) {
        if (O() == 0) {
            return 0;
        }
        X1();
        return l.a(zVar, this.f4183u, c2(!this.f4188z, true), b2(!this.f4188z, true), this, this.f4188z);
    }

    public final int T1(RecyclerView.z zVar) {
        if (O() == 0) {
            return 0;
        }
        X1();
        return l.b(zVar, this.f4183u, c2(!this.f4188z, true), b2(!this.f4188z, true), this, this.f4188z, this.f4186x);
    }

    public final int U1(RecyclerView.z zVar) {
        if (O() == 0) {
            return 0;
        }
        X1();
        return l.c(zVar, this.f4183u, c2(!this.f4188z, true), b2(!this.f4188z, true), this, this.f4188z);
    }

    public int V1(int i3) {
        return i3 != 1 ? i3 != 2 ? i3 != 17 ? i3 != 33 ? i3 != 66 ? (i3 == 130 && this.f4181s == 1) ? 1 : Integer.MIN_VALUE : this.f4181s == 0 ? 1 : Integer.MIN_VALUE : this.f4181s == 1 ? -1 : Integer.MIN_VALUE : this.f4181s == 0 ? -1 : Integer.MIN_VALUE : (this.f4181s != 1 && u2()) ? -1 : 1 : (this.f4181s != 1 && u2()) ? 1 : -1;
    }

    public c W1() {
        return new c();
    }

    public void X1() {
        if (this.f4182t == null) {
            this.f4182t = W1();
        }
    }

    public int Y1(RecyclerView.u uVar, c cVar, RecyclerView.z zVar, boolean z3) {
        int i3 = cVar.f4200c;
        int i4 = cVar.f4204g;
        if (i4 != Integer.MIN_VALUE) {
            if (i3 < 0) {
                cVar.f4204g = i4 + i3;
            }
            z2(uVar, cVar);
        }
        int i5 = cVar.f4200c + cVar.f4205h;
        b bVar = this.f4178F;
        while (true) {
            if ((!cVar.f4210m && i5 <= 0) || !cVar.c(zVar)) {
                break;
            }
            bVar.a();
            w2(uVar, zVar, cVar, bVar);
            if (!bVar.f4195b) {
                cVar.f4199b += bVar.f4194a * cVar.f4203f;
                if (!bVar.f4196c || cVar.f4209l != null || !zVar.e()) {
                    int i6 = cVar.f4200c;
                    int i7 = bVar.f4194a;
                    cVar.f4200c = i6 - i7;
                    i5 -= i7;
                }
                int i8 = cVar.f4204g;
                if (i8 != Integer.MIN_VALUE) {
                    int i9 = i8 + bVar.f4194a;
                    cVar.f4204g = i9;
                    int i10 = cVar.f4200c;
                    if (i10 < 0) {
                        cVar.f4204g = i9 + i10;
                    }
                    z2(uVar, cVar);
                }
                if (z3 && bVar.f4197d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i3 - cVar.f4200c;
    }

    public final View Z1() {
        return h2(0, O());
    }

    public final View a2(RecyclerView.u uVar, RecyclerView.z zVar) {
        return l2(uVar, zVar, 0, O(), zVar.b());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void b1(RecyclerView.u uVar, RecyclerView.z zVar) {
        int i3;
        int i4;
        int i5;
        int i6;
        int o22;
        int i7;
        View H3;
        int g3;
        int i8;
        int i9 = -1;
        if (!(this.f4176D == null && this.f4173A == -1) && zVar.b() == 0) {
            o1(uVar);
            return;
        }
        d dVar = this.f4176D;
        if (dVar != null && dVar.a()) {
            this.f4173A = this.f4176D.f4211e;
        }
        X1();
        this.f4182t.f4198a = false;
        E2();
        View a02 = a0();
        a aVar = this.f4177E;
        if (!aVar.f4193e || this.f4173A != -1 || this.f4176D != null) {
            aVar.e();
            a aVar2 = this.f4177E;
            aVar2.f4192d = this.f4186x ^ this.f4187y;
            L2(uVar, zVar, aVar2);
            this.f4177E.f4193e = true;
        } else if (a02 != null && (this.f4183u.g(a02) >= this.f4183u.i() || this.f4183u.d(a02) <= this.f4183u.m())) {
            this.f4177E.c(a02, l0(a02));
        }
        c cVar = this.f4182t;
        cVar.f4203f = cVar.f4208k >= 0 ? 1 : -1;
        int[] iArr = this.f4180H;
        iArr[0] = 0;
        iArr[1] = 0;
        Q1(zVar, iArr);
        int max = Math.max(0, this.f4180H[0]) + this.f4183u.m();
        int max2 = Math.max(0, this.f4180H[1]) + this.f4183u.j();
        if (zVar.e() && (i7 = this.f4173A) != -1 && this.f4174B != Integer.MIN_VALUE && (H3 = H(i7)) != null) {
            if (this.f4186x) {
                i8 = this.f4183u.i() - this.f4183u.d(H3);
                g3 = this.f4174B;
            } else {
                g3 = this.f4183u.g(H3) - this.f4183u.m();
                i8 = this.f4174B;
            }
            int i10 = i8 - g3;
            if (i10 > 0) {
                max += i10;
            } else {
                max2 -= i10;
            }
        }
        a aVar3 = this.f4177E;
        if (!aVar3.f4192d ? !this.f4186x : this.f4186x) {
            i9 = 1;
        }
        y2(uVar, zVar, aVar3, i9);
        B(uVar);
        this.f4182t.f4210m = D2();
        this.f4182t.f4207j = zVar.e();
        this.f4182t.f4206i = 0;
        a aVar4 = this.f4177E;
        if (aVar4.f4192d) {
            Q2(aVar4);
            c cVar2 = this.f4182t;
            cVar2.f4205h = max;
            Y1(uVar, cVar2, zVar, false);
            c cVar3 = this.f4182t;
            i4 = cVar3.f4199b;
            int i11 = cVar3.f4201d;
            int i12 = cVar3.f4200c;
            if (i12 > 0) {
                max2 += i12;
            }
            O2(this.f4177E);
            c cVar4 = this.f4182t;
            cVar4.f4205h = max2;
            cVar4.f4201d += cVar4.f4202e;
            Y1(uVar, cVar4, zVar, false);
            c cVar5 = this.f4182t;
            i3 = cVar5.f4199b;
            int i13 = cVar5.f4200c;
            if (i13 > 0) {
                P2(i11, i4);
                c cVar6 = this.f4182t;
                cVar6.f4205h = i13;
                Y1(uVar, cVar6, zVar, false);
                i4 = this.f4182t.f4199b;
            }
        } else {
            O2(aVar4);
            c cVar7 = this.f4182t;
            cVar7.f4205h = max2;
            Y1(uVar, cVar7, zVar, false);
            c cVar8 = this.f4182t;
            i3 = cVar8.f4199b;
            int i14 = cVar8.f4201d;
            int i15 = cVar8.f4200c;
            if (i15 > 0) {
                max += i15;
            }
            Q2(this.f4177E);
            c cVar9 = this.f4182t;
            cVar9.f4205h = max;
            cVar9.f4201d += cVar9.f4202e;
            Y1(uVar, cVar9, zVar, false);
            c cVar10 = this.f4182t;
            i4 = cVar10.f4199b;
            int i16 = cVar10.f4200c;
            if (i16 > 0) {
                N2(i14, i3);
                c cVar11 = this.f4182t;
                cVar11.f4205h = i16;
                Y1(uVar, cVar11, zVar, false);
                i3 = this.f4182t.f4199b;
            }
        }
        if (O() > 0) {
            if (this.f4186x ^ this.f4187y) {
                int o23 = o2(i3, uVar, zVar, true);
                i5 = i4 + o23;
                i6 = i3 + o23;
                o22 = p2(i5, uVar, zVar, false);
            } else {
                int p22 = p2(i4, uVar, zVar, true);
                i5 = i4 + p22;
                i6 = i3 + p22;
                o22 = o2(i6, uVar, zVar, false);
            }
            i4 = i5 + o22;
            i3 = i6 + o22;
        }
        x2(uVar, zVar, i4, i3);
        if (zVar.e()) {
            this.f4177E.e();
        } else {
            this.f4183u.s();
        }
        this.f4184v = this.f4187y;
    }

    public View b2(boolean z3, boolean z4) {
        return this.f4186x ? i2(0, O(), z3, z4) : i2(O() - 1, -1, z3, z4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void c1(RecyclerView.z zVar) {
        super.c1(zVar);
        this.f4176D = null;
        this.f4173A = -1;
        this.f4174B = Integer.MIN_VALUE;
        this.f4177E.e();
    }

    public View c2(boolean z3, boolean z4) {
        return this.f4186x ? i2(O() - 1, -1, z3, z4) : i2(0, O(), z3, z4);
    }

    public int d2() {
        View i22 = i2(0, O(), false, true);
        if (i22 == null) {
            return -1;
        }
        return l0(i22);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.y.b
    public PointF e(int i3) {
        if (O() == 0) {
            return null;
        }
        int i4 = (i3 < l0(N(0))) != this.f4186x ? -1 : 1;
        return this.f4181s == 0 ? new PointF(i4, 0.0f) : new PointF(0.0f, i4);
    }

    public final View e2() {
        return h2(O() - 1, -1);
    }

    public final View f2(RecyclerView.u uVar, RecyclerView.z zVar) {
        return l2(uVar, zVar, O() - 1, -1, zVar.b());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void g1(Parcelable parcelable) {
        if (parcelable instanceof d) {
            this.f4176D = (d) parcelable;
            x1();
        }
    }

    public int g2() {
        View i22 = i2(O() - 1, -1, false, true);
        if (i22 == null) {
            return -1;
        }
        return l0(i22);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public Parcelable h1() {
        if (this.f4176D != null) {
            return new d(this.f4176D);
        }
        d dVar = new d();
        if (O() <= 0) {
            dVar.b();
            return dVar;
        }
        X1();
        boolean z3 = this.f4184v ^ this.f4186x;
        dVar.f4213g = z3;
        if (z3) {
            View q22 = q2();
            dVar.f4212f = this.f4183u.i() - this.f4183u.d(q22);
            dVar.f4211e = l0(q22);
            return dVar;
        }
        View r22 = r2();
        dVar.f4211e = l0(r22);
        dVar.f4212f = this.f4183u.g(r22) - this.f4183u.m();
        return dVar;
    }

    public View h2(int i3, int i4) {
        int i5;
        int i6;
        X1();
        if (i4 <= i3 && i4 >= i3) {
            return N(i3);
        }
        if (this.f4183u.g(N(i3)) < this.f4183u.m()) {
            i5 = 16644;
            i6 = 16388;
        } else {
            i5 = 4161;
            i6 = 4097;
        }
        return this.f4181s == 0 ? this.f4342e.a(i3, i4, i5, i6) : this.f4343f.a(i3, i4, i5, i6);
    }

    public View i2(int i3, int i4, boolean z3, boolean z4) {
        X1();
        int i5 = z3 ? 24579 : 320;
        int i6 = z4 ? 320 : 0;
        return this.f4181s == 0 ? this.f4342e.a(i3, i4, i5, i6) : this.f4343f.a(i3, i4, i5, i6);
    }

    public final View j2() {
        return this.f4186x ? Z1() : e2();
    }

    public final View k2() {
        return this.f4186x ? e2() : Z1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void l(String str) {
        if (this.f4176D == null) {
            super.l(str);
        }
    }

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
            if (l02 >= 0 && l02 < i5) {
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

    public final View m2(RecyclerView.u uVar, RecyclerView.z zVar) {
        return this.f4186x ? a2(uVar, zVar) : f2(uVar, zVar);
    }

    public final View n2(RecyclerView.u uVar, RecyclerView.z zVar) {
        return this.f4186x ? f2(uVar, zVar) : a2(uVar, zVar);
    }

    public final int o2(int i3, RecyclerView.u uVar, RecyclerView.z zVar, boolean z3) {
        int i4;
        int i5 = this.f4183u.i() - i3;
        if (i5 <= 0) {
            return 0;
        }
        int i6 = -F2(-i5, uVar, zVar);
        int i7 = i3 + i6;
        if (!z3 || (i4 = this.f4183u.i() - i7) <= 0) {
            return i6;
        }
        this.f4183u.r(i4);
        return i4 + i6;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean p() {
        return this.f4181s == 0;
    }

    public final int p2(int i3, RecyclerView.u uVar, RecyclerView.z zVar, boolean z3) {
        int m3;
        int m4 = i3 - this.f4183u.m();
        if (m4 <= 0) {
            return 0;
        }
        int i4 = -F2(m4, uVar, zVar);
        int i5 = i3 + i4;
        if (!z3 || (m3 = i5 - this.f4183u.m()) <= 0) {
            return i4;
        }
        this.f4183u.r(-m3);
        return i4 - m3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean q() {
        return this.f4181s == 1;
    }

    public int s2(RecyclerView.z zVar) {
        if (zVar.d()) {
            return this.f4183u.n();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void t(int i3, int i4, RecyclerView.z zVar, RecyclerView.o.c cVar) {
        if (this.f4181s != 0) {
            i3 = i4;
        }
        if (O() == 0 || i3 == 0) {
            return;
        }
        X1();
        M2(i3 > 0 ? 1 : -1, Math.abs(i3), true, zVar);
        R1(zVar, this.f4182t, cVar);
    }

    public int t2() {
        return this.f4181s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void u(int i3, RecyclerView.o.c cVar) {
        boolean z3;
        int i4;
        d dVar = this.f4176D;
        if (dVar == null || !dVar.a()) {
            E2();
            z3 = this.f4186x;
            i4 = this.f4173A;
            if (i4 == -1) {
                i4 = z3 ? i3 - 1 : 0;
            }
        } else {
            d dVar2 = this.f4176D;
            z3 = dVar2.f4213g;
            i4 = dVar2.f4211e;
        }
        int i5 = z3 ? -1 : 1;
        for (int i6 = 0; i6 < this.f4179G && i4 >= 0 && i4 < i3; i6++) {
            cVar.a(i4, 0);
            i4 += i5;
        }
    }

    public boolean u2() {
        return d0() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int v(RecyclerView.z zVar) {
        return S1(zVar);
    }

    public boolean v2() {
        return this.f4188z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int w(RecyclerView.z zVar) {
        return T1(zVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean w0() {
        return true;
    }

    public void w2(RecyclerView.u uVar, RecyclerView.z zVar, c cVar, b bVar) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i02;
        int f3;
        int i7;
        int i8;
        View d3 = cVar.d(uVar);
        if (d3 == null) {
            bVar.f4195b = true;
            return;
        }
        RecyclerView.p pVar = (RecyclerView.p) d3.getLayoutParams();
        if (cVar.f4209l == null) {
            if (this.f4186x == (cVar.f4203f == -1)) {
                i(d3);
            } else {
                j(d3, 0);
            }
        } else {
            if (this.f4186x == (cVar.f4203f == -1)) {
                g(d3);
            } else {
                h(d3, 0);
            }
        }
        E0(d3, 0, 0);
        bVar.f4194a = this.f4183u.e(d3);
        if (this.f4181s == 1) {
            if (u2()) {
                f3 = s0() - j0();
                i02 = f3 - this.f4183u.f(d3);
            } else {
                i02 = i0();
                f3 = this.f4183u.f(d3) + i02;
            }
            if (cVar.f4203f == -1) {
                i8 = cVar.f4199b;
                i7 = i8 - bVar.f4194a;
            } else {
                i7 = cVar.f4199b;
                i8 = bVar.f4194a + i7;
            }
            int i9 = i02;
            i6 = i7;
            i5 = i9;
            i4 = i8;
            i3 = f3;
        } else {
            int k02 = k0();
            int f4 = this.f4183u.f(d3) + k02;
            if (cVar.f4203f == -1) {
                int i10 = cVar.f4199b;
                i5 = i10 - bVar.f4194a;
                i3 = i10;
                i4 = f4;
            } else {
                int i11 = cVar.f4199b;
                i3 = bVar.f4194a + i11;
                i4 = f4;
                i5 = i11;
            }
            i6 = k02;
        }
        D0(d3, i5, i6, i3, i4);
        if (pVar.c() || pVar.b()) {
            bVar.f4196c = true;
        }
        bVar.f4197d = d3.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int x(RecyclerView.z zVar) {
        return U1(zVar);
    }

    public final void x2(RecyclerView.u uVar, RecyclerView.z zVar, int i3, int i4) {
        if (!zVar.g() || O() == 0 || zVar.e() || !P1()) {
            return;
        }
        List k3 = uVar.k();
        int size = k3.size();
        int l02 = l0(N(0));
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            RecyclerView.C c3 = (RecyclerView.C) k3.get(i7);
            if (!c3.v()) {
                if ((c3.m() < l02) != this.f4186x) {
                    i5 += this.f4183u.e(c3.f4302a);
                } else {
                    i6 += this.f4183u.e(c3.f4302a);
                }
            }
        }
        this.f4182t.f4209l = k3;
        if (i5 > 0) {
            P2(l0(r2()), i3);
            c cVar = this.f4182t;
            cVar.f4205h = i5;
            cVar.f4200c = 0;
            cVar.a();
            Y1(uVar, this.f4182t, zVar, false);
        }
        if (i6 > 0) {
            N2(l0(q2()), i4);
            c cVar2 = this.f4182t;
            cVar2.f4205h = i6;
            cVar2.f4200c = 0;
            cVar2.a();
            Y1(uVar, this.f4182t, zVar, false);
        }
        this.f4182t.f4209l = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int y(RecyclerView.z zVar) {
        return S1(zVar);
    }

    public void y2(RecyclerView.u uVar, RecyclerView.z zVar, a aVar, int i3) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int z(RecyclerView.z zVar) {
        return T1(zVar);
    }

    public final void z2(RecyclerView.u uVar, c cVar) {
        if (!cVar.f4198a || cVar.f4210m) {
            return;
        }
        int i3 = cVar.f4204g;
        int i4 = cVar.f4206i;
        if (cVar.f4203f == -1) {
            B2(uVar, i3, i4);
        } else {
            C2(uVar, i3, i4);
        }
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i3, int i4) {
        this.f4181s = 1;
        this.f4185w = false;
        this.f4186x = false;
        this.f4187y = false;
        this.f4188z = true;
        this.f4173A = -1;
        this.f4174B = Integer.MIN_VALUE;
        this.f4176D = null;
        this.f4177E = new a();
        this.f4178F = new b();
        this.f4179G = 2;
        this.f4180H = new int[2];
        RecyclerView.o.d m02 = RecyclerView.o.m0(context, attributeSet, i3, i4);
        G2(m02.f4358a);
        H2(m02.f4360c);
        I2(m02.f4361d);
    }
}
