package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C;
import androidx.datastore.preferences.protobuf.l0;
import androidx.datastore.preferences.protobuf.m0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0324j implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0323i f3684a;

    /* renamed from: androidx.datastore.preferences.protobuf.j$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3685a;

        static {
            int[] iArr = new int[l0.b.values().length];
            f3685a = iArr;
            try {
                iArr[l0.b.f3724n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3685a[l0.b.f3723m.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3685a[l0.b.f3721k.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3685a[l0.b.f3731u.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3685a[l0.b.f3733w.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3685a[l0.b.f3729s.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3685a[l0.b.f3722l.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f3685a[l0.b.f3719i.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f3685a[l0.b.f3732v.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f3685a[l0.b.f3734x.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f3685a[l0.b.f3720j.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f3685a[l0.b.f3725o.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public C0324j(AbstractC0323i abstractC0323i) {
        AbstractC0323i abstractC0323i2 = (AbstractC0323i) AbstractC0334u.b(abstractC0323i, "output");
        this.f3684a = abstractC0323i2;
        abstractC0323i2.f3671a = this;
    }

    public static C0324j P(AbstractC0323i abstractC0323i) {
        C0324j c0324j = abstractC0323i.f3671a;
        return c0324j != null ? c0324j : new C0324j(abstractC0323i);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void A(int i3, double d3) {
        this.f3684a.h0(i3, d3);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void B(int i3, List list, boolean z3) {
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                this.f3684a.h0(i3, ((Double) list.get(i4)).doubleValue());
                i4++;
            }
            return;
        }
        this.f3684a.N0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            i5 += AbstractC0323i.i(((Double) list.get(i6)).doubleValue());
        }
        this.f3684a.P0(i5);
        while (i4 < list.size()) {
            this.f3684a.i0(((Double) list.get(i4)).doubleValue());
            i4++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void C(int i3, long j3) {
        this.f3684a.F0(i3, j3);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void D(int i3, List list, boolean z3) {
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                this.f3684a.F0(i3, ((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        this.f3684a.N0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            i5 += AbstractC0323i.I(((Long) list.get(i6)).longValue());
        }
        this.f3684a.P0(i5);
        while (i4 < list.size()) {
            this.f3684a.G0(((Long) list.get(i4)).longValue());
            i4++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void E(int i3, int i4) {
        this.f3684a.H0(i3, i4);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void F(int i3, List list) {
        for (int i4 = 0; i4 < list.size(); i4++) {
            this.f3684a.f0(i3, (AbstractC0320f) list.get(i4));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void G(int i3, List list, boolean z3) {
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                this.f3684a.l0(i3, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        this.f3684a.N0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            i5 += AbstractC0323i.m(((Integer) list.get(i6)).intValue());
        }
        this.f3684a.P0(i5);
        while (i4 < list.size()) {
            this.f3684a.m0(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void H(int i3, List list, boolean z3) {
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                this.f3684a.Q0(i3, ((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        this.f3684a.N0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            i5 += AbstractC0323i.T(((Long) list.get(i6)).longValue());
        }
        this.f3684a.P0(i5);
        while (i4 < list.size()) {
            this.f3684a.R0(((Long) list.get(i4)).longValue());
            i4++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void I(int i3, List list, boolean z3) {
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                this.f3684a.b0(i3, ((Boolean) list.get(i4)).booleanValue());
                i4++;
            }
            return;
        }
        this.f3684a.N0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            i5 += AbstractC0323i.d(((Boolean) list.get(i6)).booleanValue());
        }
        this.f3684a.P0(i5);
        while (i4 < list.size()) {
            this.f3684a.c0(((Boolean) list.get(i4)).booleanValue());
            i4++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void J(int i3, List list, Y y3) {
        for (int i4 = 0; i4 < list.size(); i4++) {
            N(i3, list.get(i4), y3);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void K(int i3, List list, Y y3) {
        for (int i4 = 0; i4 < list.size(); i4++) {
            O(i3, list.get(i4), y3);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void L(int i3, AbstractC0320f abstractC0320f) {
        this.f3684a.f0(i3, abstractC0320f);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void M(int i3, C.a aVar, Map map) {
        if (this.f3684a.Y()) {
            T(i3, aVar, map);
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            this.f3684a.N0(i3, 2);
            this.f3684a.P0(C.b(aVar, entry.getKey(), entry.getValue()));
            C.e(this.f3684a, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void N(int i3, Object obj, Y y3) {
        this.f3684a.z0(i3, (J) obj, y3);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void O(int i3, Object obj, Y y3) {
        this.f3684a.s0(i3, (J) obj, y3);
    }

    public final void Q(int i3, boolean z3, Object obj, C.a aVar) {
        this.f3684a.N0(i3, 2);
        this.f3684a.P0(C.b(aVar, Boolean.valueOf(z3), obj));
        C.e(this.f3684a, aVar, Boolean.valueOf(z3), obj);
    }

    public final void R(int i3, C.a aVar, Map map) {
        int size = map.size();
        int[] iArr = new int[size];
        Iterator it = map.keySet().iterator();
        int i4 = 0;
        while (it.hasNext()) {
            iArr[i4] = ((Integer) it.next()).intValue();
            i4++;
        }
        Arrays.sort(iArr);
        for (int i5 = 0; i5 < size; i5++) {
            int i6 = iArr[i5];
            Object obj = map.get(Integer.valueOf(i6));
            this.f3684a.N0(i3, 2);
            this.f3684a.P0(C.b(aVar, Integer.valueOf(i6), obj));
            C.e(this.f3684a, aVar, Integer.valueOf(i6), obj);
        }
    }

    public final void S(int i3, C.a aVar, Map map) {
        int size = map.size();
        long[] jArr = new long[size];
        Iterator it = map.keySet().iterator();
        int i4 = 0;
        while (it.hasNext()) {
            jArr[i4] = ((Long) it.next()).longValue();
            i4++;
        }
        Arrays.sort(jArr);
        for (int i5 = 0; i5 < size; i5++) {
            long j3 = jArr[i5];
            Object obj = map.get(Long.valueOf(j3));
            this.f3684a.N0(i3, 2);
            this.f3684a.P0(C.b(aVar, Long.valueOf(j3), obj));
            C.e(this.f3684a, aVar, Long.valueOf(j3), obj);
        }
    }

    public final void T(int i3, C.a aVar, Map map) {
        switch (a.f3685a[aVar.f3549a.ordinal()]) {
            case 1:
                Object obj = map.get(Boolean.FALSE);
                if (obj != null) {
                    Q(i3, false, obj, aVar);
                }
                Object obj2 = map.get(Boolean.TRUE);
                if (obj2 != null) {
                    Q(i3, true, obj2, aVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                R(i3, aVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                S(i3, aVar, map);
                return;
            case 12:
                U(i3, aVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + aVar.f3549a);
        }
    }

    public final void U(int i3, C.a aVar, Map map) {
        int size = map.size();
        String[] strArr = new String[size];
        Iterator it = map.keySet().iterator();
        int i4 = 0;
        while (it.hasNext()) {
            strArr[i4] = (String) it.next();
            i4++;
        }
        Arrays.sort(strArr);
        for (int i5 = 0; i5 < size; i5++) {
            String str = strArr[i5];
            Object obj = map.get(str);
            this.f3684a.N0(i3, 2);
            this.f3684a.P0(C.b(aVar, str, obj));
            C.e(this.f3684a, aVar, str, obj);
        }
    }

    public final void V(int i3, Object obj) {
        if (obj instanceof String) {
            this.f3684a.L0(i3, (String) obj);
        } else {
            this.f3684a.f0(i3, (AbstractC0320f) obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void a(int i3, List list, boolean z3) {
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                this.f3684a.v0(i3, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        this.f3684a.N0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            i5 += AbstractC0323i.v(((Integer) list.get(i6)).intValue());
        }
        this.f3684a.P0(i5);
        while (i4 < list.size()) {
            this.f3684a.w0(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void b(int i3, List list, boolean z3) {
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                this.f3684a.p0(i3, ((Float) list.get(i4)).floatValue());
                i4++;
            }
            return;
        }
        this.f3684a.N0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            i5 += AbstractC0323i.q(((Float) list.get(i6)).floatValue());
        }
        this.f3684a.P0(i5);
        while (i4 < list.size()) {
            this.f3684a.q0(((Float) list.get(i4)).floatValue());
            i4++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void c(int i3, List list, boolean z3) {
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                this.f3684a.O0(i3, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        this.f3684a.N0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            i5 += AbstractC0323i.R(((Integer) list.get(i6)).intValue());
        }
        this.f3684a.P0(i5);
        while (i4 < list.size()) {
            this.f3684a.P0(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void d(int i3, long j3) {
        this.f3684a.x0(i3, j3);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void e(int i3, List list, boolean z3) {
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                this.f3684a.J0(i3, ((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        this.f3684a.N0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            i5 += AbstractC0323i.M(((Long) list.get(i6)).longValue());
        }
        this.f3684a.P0(i5);
        while (i4 < list.size()) {
            this.f3684a.K0(((Long) list.get(i4)).longValue());
            i4++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void f(int i3, boolean z3) {
        this.f3684a.b0(i3, z3);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void g(int i3, long j3) {
        this.f3684a.n0(i3, j3);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void h(int i3, int i4) {
        this.f3684a.O0(i3, i4);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public final void i(int i3, Object obj) {
        if (obj instanceof AbstractC0320f) {
            this.f3684a.C0(i3, (AbstractC0320f) obj);
        } else {
            this.f3684a.B0(i3, (J) obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public m0.a j() {
        return m0.a.ASCENDING;
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void k(int i3, long j3) {
        this.f3684a.J0(i3, j3);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void l(int i3, float f3) {
        this.f3684a.p0(i3, f3);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void m(int i3, List list) {
        int i4 = 0;
        if (!(list instanceof InterfaceC0339z)) {
            while (i4 < list.size()) {
                this.f3684a.L0(i3, (String) list.get(i4));
                i4++;
            }
        } else {
            InterfaceC0339z interfaceC0339z = (InterfaceC0339z) list;
            while (i4 < list.size()) {
                V(i3, interfaceC0339z.c(i4));
                i4++;
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void n(int i3, int i4) {
        this.f3684a.D0(i3, i4);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void o(int i3) {
        this.f3684a.N0(i3, 3);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void p(int i3) {
        this.f3684a.N0(i3, 4);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void q(int i3, String str) {
        this.f3684a.L0(i3, str);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void r(int i3, int i4) {
        this.f3684a.v0(i3, i4);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void s(int i3, List list, boolean z3) {
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                this.f3684a.H0(i3, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        this.f3684a.N0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            i5 += AbstractC0323i.K(((Integer) list.get(i6)).intValue());
        }
        this.f3684a.P0(i5);
        while (i4 < list.size()) {
            this.f3684a.I0(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void t(int i3, long j3) {
        this.f3684a.Q0(i3, j3);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void u(int i3, List list, boolean z3) {
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                this.f3684a.n0(i3, ((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        this.f3684a.N0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            i5 += AbstractC0323i.o(((Long) list.get(i6)).longValue());
        }
        this.f3684a.P0(i5);
        while (i4 < list.size()) {
            this.f3684a.o0(((Long) list.get(i4)).longValue());
            i4++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void v(int i3, List list, boolean z3) {
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                this.f3684a.D0(i3, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        this.f3684a.N0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            i5 += AbstractC0323i.G(((Integer) list.get(i6)).intValue());
        }
        this.f3684a.P0(i5);
        while (i4 < list.size()) {
            this.f3684a.E0(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void w(int i3, int i4) {
        this.f3684a.j0(i3, i4);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void x(int i3, List list, boolean z3) {
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                this.f3684a.x0(i3, ((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        this.f3684a.N0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            i5 += AbstractC0323i.x(((Long) list.get(i6)).longValue());
        }
        this.f3684a.P0(i5);
        while (i4 < list.size()) {
            this.f3684a.y0(((Long) list.get(i4)).longValue());
            i4++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void y(int i3, int i4) {
        this.f3684a.l0(i3, i4);
    }

    @Override // androidx.datastore.preferences.protobuf.m0
    public void z(int i3, List list, boolean z3) {
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                this.f3684a.j0(i3, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        this.f3684a.N0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            i5 += AbstractC0323i.k(((Integer) list.get(i6)).intValue());
        }
        this.f3684a.P0(i5);
        while (i4 < list.size()) {
            this.f3684a.k0(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }
}
