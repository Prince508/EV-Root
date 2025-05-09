package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.H;
import com.google.crypto.tink.shaded.protobuf.q0;
import com.google.crypto.tink.shaded.protobuf.r0;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.crypto.tink.shaded.protobuf.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0421l implements r0 {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0420k f5842a;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.l$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5843a;

        static {
            int[] iArr = new int[q0.b.values().length];
            f5843a = iArr;
            try {
                iArr[q0.b.f5899n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5843a[q0.b.f5898m.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5843a[q0.b.f5896k.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5843a[q0.b.f5906u.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5843a[q0.b.f5908w.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5843a[q0.b.f5904s.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f5843a[q0.b.f5897l.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f5843a[q0.b.f5894i.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f5843a[q0.b.f5907v.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f5843a[q0.b.f5909x.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f5843a[q0.b.f5895j.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f5843a[q0.b.f5900o.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public C0421l(AbstractC0420k abstractC0420k) {
        AbstractC0420k abstractC0420k2 = (AbstractC0420k) AbstractC0434z.b(abstractC0420k, "output");
        this.f5842a = abstractC0420k2;
        abstractC0420k2.f5836a = this;
    }

    public static C0421l P(AbstractC0420k abstractC0420k) {
        C0421l c0421l = abstractC0420k.f5836a;
        return c0421l != null ? c0421l : new C0421l(abstractC0420k);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void A(int i3, double d3) {
        this.f5842a.b0(i3, d3);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void B(int i3, List list, boolean z3) {
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                this.f5842a.b0(i3, ((Double) list.get(i4)).doubleValue());
                i4++;
            }
            return;
        }
        this.f5842a.D0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            i5 += AbstractC0420k.i(((Double) list.get(i6)).doubleValue());
        }
        this.f5842a.F0(i5);
        while (i4 < list.size()) {
            this.f5842a.c0(((Double) list.get(i4)).doubleValue());
            i4++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void C(int i3, long j3) {
        this.f5842a.w0(i3, j3);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void D(int i3, List list, boolean z3) {
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                this.f5842a.w0(i3, ((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        this.f5842a.D0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            i5 += AbstractC0420k.E(((Long) list.get(i6)).longValue());
        }
        this.f5842a.F0(i5);
        while (i4 < list.size()) {
            this.f5842a.x0(((Long) list.get(i4)).longValue());
            i4++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void E(int i3, int i4) {
        this.f5842a.y0(i3, i4);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void F(int i3, List list) {
        for (int i4 = 0; i4 < list.size(); i4++) {
            this.f5842a.a0(i3, (AbstractC0417h) list.get(i4));
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void G(int i3, List list, boolean z3) {
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                this.f5842a.f0(i3, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        this.f5842a.D0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            i5 += AbstractC0420k.m(((Integer) list.get(i6)).intValue());
        }
        this.f5842a.F0(i5);
        while (i4 < list.size()) {
            this.f5842a.g0(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void H(int i3, List list, boolean z3) {
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                this.f5842a.G0(i3, ((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        this.f5842a.D0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            i5 += AbstractC0420k.P(((Long) list.get(i6)).longValue());
        }
        this.f5842a.F0(i5);
        while (i4 < list.size()) {
            this.f5842a.H0(((Long) list.get(i4)).longValue());
            i4++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void I(int i3, List list, boolean z3) {
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                this.f5842a.Y(i3, ((Boolean) list.get(i4)).booleanValue());
                i4++;
            }
            return;
        }
        this.f5842a.D0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            i5 += AbstractC0420k.e(((Boolean) list.get(i6)).booleanValue());
        }
        this.f5842a.F0(i5);
        while (i4 < list.size()) {
            this.f5842a.Z(((Boolean) list.get(i4)).booleanValue());
            i4++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void J(int i3, AbstractC0417h abstractC0417h) {
        this.f5842a.a0(i3, abstractC0417h);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void K(int i3, List list, e0 e0Var) {
        for (int i4 = 0; i4 < list.size(); i4++) {
            N(i3, list.get(i4), e0Var);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void L(int i3, H.a aVar, Map map) {
        if (this.f5842a.T()) {
            Q(i3, aVar, map);
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            this.f5842a.D0(i3, 2);
            this.f5842a.F0(H.a(aVar, entry.getKey(), entry.getValue()));
            H.b(this.f5842a, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void M(int i3, List list, e0 e0Var) {
        for (int i4 = 0; i4 < list.size(); i4++) {
            O(i3, list.get(i4), e0Var);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void N(int i3, Object obj, e0 e0Var) {
        this.f5842a.l0(i3, (O) obj, e0Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void O(int i3, Object obj, e0 e0Var) {
        this.f5842a.r0(i3, (O) obj, e0Var);
    }

    public final void Q(int i3, H.a aVar, Map map) {
        int[] iArr = a.f5843a;
        throw null;
    }

    public final void R(int i3, Object obj) {
        if (obj instanceof String) {
            this.f5842a.C0(i3, (String) obj);
        } else {
            this.f5842a.a0(i3, (AbstractC0417h) obj);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void a(int i3, List list, boolean z3) {
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                this.f5842a.n0(i3, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        this.f5842a.D0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            i5 += AbstractC0420k.u(((Integer) list.get(i6)).intValue());
        }
        this.f5842a.F0(i5);
        while (i4 < list.size()) {
            this.f5842a.o0(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void b(int i3, List list, boolean z3) {
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                this.f5842a.j0(i3, ((Float) list.get(i4)).floatValue());
                i4++;
            }
            return;
        }
        this.f5842a.D0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            i5 += AbstractC0420k.q(((Float) list.get(i6)).floatValue());
        }
        this.f5842a.F0(i5);
        while (i4 < list.size()) {
            this.f5842a.k0(((Float) list.get(i4)).floatValue());
            i4++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void c(int i3, List list, boolean z3) {
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                this.f5842a.E0(i3, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        this.f5842a.D0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            i5 += AbstractC0420k.N(((Integer) list.get(i6)).intValue());
        }
        this.f5842a.F0(i5);
        while (i4 < list.size()) {
            this.f5842a.F0(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void d(int i3, long j3) {
        this.f5842a.p0(i3, j3);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void e(int i3, List list, boolean z3) {
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                this.f5842a.A0(i3, ((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        this.f5842a.D0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            i5 += AbstractC0420k.I(((Long) list.get(i6)).longValue());
        }
        this.f5842a.F0(i5);
        while (i4 < list.size()) {
            this.f5842a.B0(((Long) list.get(i4)).longValue());
            i4++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void f(int i3, boolean z3) {
        this.f5842a.Y(i3, z3);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void g(int i3, long j3) {
        this.f5842a.h0(i3, j3);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void h(int i3, int i4) {
        this.f5842a.E0(i3, i4);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public final void i(int i3, Object obj) {
        if (obj instanceof AbstractC0417h) {
            this.f5842a.t0(i3, (AbstractC0417h) obj);
        } else {
            this.f5842a.s0(i3, (O) obj);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public r0.a j() {
        return r0.a.ASCENDING;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void k(int i3, long j3) {
        this.f5842a.A0(i3, j3);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void l(int i3, float f3) {
        this.f5842a.j0(i3, f3);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void m(int i3, List list) {
        int i4 = 0;
        if (!(list instanceof D)) {
            while (i4 < list.size()) {
                this.f5842a.C0(i3, (String) list.get(i4));
                i4++;
            }
        } else {
            D d3 = (D) list;
            while (i4 < list.size()) {
                R(i3, d3.c(i4));
                i4++;
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void n(int i3, int i4) {
        this.f5842a.u0(i3, i4);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void o(int i3) {
        this.f5842a.D0(i3, 3);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void p(int i3) {
        this.f5842a.D0(i3, 4);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void q(int i3, String str) {
        this.f5842a.C0(i3, str);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void r(int i3, int i4) {
        this.f5842a.n0(i3, i4);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void s(int i3, List list, boolean z3) {
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                this.f5842a.y0(i3, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        this.f5842a.D0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            i5 += AbstractC0420k.G(((Integer) list.get(i6)).intValue());
        }
        this.f5842a.F0(i5);
        while (i4 < list.size()) {
            this.f5842a.z0(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void t(int i3, long j3) {
        this.f5842a.G0(i3, j3);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void u(int i3, List list, boolean z3) {
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                this.f5842a.h0(i3, ((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        this.f5842a.D0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            i5 += AbstractC0420k.o(((Long) list.get(i6)).longValue());
        }
        this.f5842a.F0(i5);
        while (i4 < list.size()) {
            this.f5842a.i0(((Long) list.get(i4)).longValue());
            i4++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void v(int i3, List list, boolean z3) {
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                this.f5842a.u0(i3, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        this.f5842a.D0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            i5 += AbstractC0420k.C(((Integer) list.get(i6)).intValue());
        }
        this.f5842a.F0(i5);
        while (i4 < list.size()) {
            this.f5842a.v0(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void w(int i3, int i4) {
        this.f5842a.d0(i3, i4);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void x(int i3, List list, boolean z3) {
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                this.f5842a.p0(i3, ((Long) list.get(i4)).longValue());
                i4++;
            }
            return;
        }
        this.f5842a.D0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            i5 += AbstractC0420k.w(((Long) list.get(i6)).longValue());
        }
        this.f5842a.F0(i5);
        while (i4 < list.size()) {
            this.f5842a.q0(((Long) list.get(i4)).longValue());
            i4++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void y(int i3, int i4) {
        this.f5842a.f0(i3, i4);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.r0
    public void z(int i3, List list, boolean z3) {
        int i4 = 0;
        if (!z3) {
            while (i4 < list.size()) {
                this.f5842a.d0(i3, ((Integer) list.get(i4)).intValue());
                i4++;
            }
            return;
        }
        this.f5842a.D0(i3, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            i5 += AbstractC0420k.k(((Integer) list.get(i6)).intValue());
        }
        this.f5842a.F0(i5);
        while (i4 < list.size()) {
            this.f5842a.e0(((Integer) list.get(i4)).intValue());
            i4++;
        }
    }
}
