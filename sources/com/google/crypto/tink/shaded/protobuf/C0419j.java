package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.H;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.crypto.tink.shaded.protobuf.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0419j implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0418i f5829a;

    /* renamed from: b, reason: collision with root package name */
    public int f5830b;

    /* renamed from: c, reason: collision with root package name */
    public int f5831c;

    /* renamed from: d, reason: collision with root package name */
    public int f5832d = 0;

    public C0419j(AbstractC0418i abstractC0418i) {
        AbstractC0418i abstractC0418i2 = (AbstractC0418i) AbstractC0434z.b(abstractC0418i, "input");
        this.f5829a = abstractC0418i2;
        abstractC0418i2.f5809d = this;
    }

    public static C0419j O(AbstractC0418i abstractC0418i) {
        C0419j c0419j = abstractC0418i.f5809d;
        return c0419j != null ? c0419j : new C0419j(abstractC0418i);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public String A() {
        V(2);
        return this.f5829a.A();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public int B() {
        V(5);
        return this.f5829a.q();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public void C(List list) {
        int B3;
        int B4;
        if (!(list instanceof F)) {
            int b3 = q0.b(this.f5830b);
            if (b3 == 1) {
                do {
                    list.add(Long.valueOf(this.f5829a.r()));
                    if (this.f5829a.e()) {
                        return;
                    } else {
                        B3 = this.f5829a.B();
                    }
                } while (B3 == this.f5830b);
                this.f5832d = B3;
                return;
            }
            if (b3 != 2) {
                throw A.e();
            }
            int C3 = this.f5829a.C();
            X(C3);
            int d3 = this.f5829a.d() + C3;
            do {
                list.add(Long.valueOf(this.f5829a.r()));
            } while (this.f5829a.d() < d3);
            return;
        }
        F f3 = (F) list;
        int b4 = q0.b(this.f5830b);
        if (b4 == 1) {
            do {
                f3.j(this.f5829a.r());
                if (this.f5829a.e()) {
                    return;
                } else {
                    B4 = this.f5829a.B();
                }
            } while (B4 == this.f5830b);
            this.f5832d = B4;
            return;
        }
        if (b4 != 2) {
            throw A.e();
        }
        int C4 = this.f5829a.C();
        X(C4);
        int d4 = this.f5829a.d() + C4;
        do {
            f3.j(this.f5829a.r());
        } while (this.f5829a.d() < d4);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public void D(List list) {
        int B3;
        int B4;
        if (!(list instanceof AbstractC0433y)) {
            int b3 = q0.b(this.f5830b);
            if (b3 == 0) {
                do {
                    list.add(Integer.valueOf(this.f5829a.t()));
                    if (this.f5829a.e()) {
                        return;
                    } else {
                        B3 = this.f5829a.B();
                    }
                } while (B3 == this.f5830b);
                this.f5832d = B3;
                return;
            }
            if (b3 != 2) {
                throw A.e();
            }
            int d3 = this.f5829a.d() + this.f5829a.C();
            do {
                list.add(Integer.valueOf(this.f5829a.t()));
            } while (this.f5829a.d() < d3);
            U(d3);
            return;
        }
        AbstractC0433y abstractC0433y = (AbstractC0433y) list;
        int b4 = q0.b(this.f5830b);
        if (b4 == 0) {
            do {
                abstractC0433y.j(this.f5829a.t());
                if (this.f5829a.e()) {
                    return;
                } else {
                    B4 = this.f5829a.B();
                }
            } while (B4 == this.f5830b);
            this.f5832d = B4;
            return;
        }
        if (b4 != 2) {
            throw A.e();
        }
        int d4 = this.f5829a.d() + this.f5829a.C();
        do {
            abstractC0433y.j(this.f5829a.t());
        } while (this.f5829a.d() < d4);
        U(d4);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public boolean E() {
        V(0);
        return this.f5829a.m();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public void F(List list) {
        int B3;
        int B4;
        if (!(list instanceof AbstractC0433y)) {
            int b3 = q0.b(this.f5830b);
            if (b3 == 0) {
                do {
                    list.add(Integer.valueOf(this.f5829a.p()));
                    if (this.f5829a.e()) {
                        return;
                    } else {
                        B3 = this.f5829a.B();
                    }
                } while (B3 == this.f5830b);
                this.f5832d = B3;
                return;
            }
            if (b3 != 2) {
                throw A.e();
            }
            int d3 = this.f5829a.d() + this.f5829a.C();
            do {
                list.add(Integer.valueOf(this.f5829a.p()));
            } while (this.f5829a.d() < d3);
            U(d3);
            return;
        }
        AbstractC0433y abstractC0433y = (AbstractC0433y) list;
        int b4 = q0.b(this.f5830b);
        if (b4 == 0) {
            do {
                abstractC0433y.j(this.f5829a.p());
                if (this.f5829a.e()) {
                    return;
                } else {
                    B4 = this.f5829a.B();
                }
            } while (B4 == this.f5830b);
            this.f5832d = B4;
            return;
        }
        if (b4 != 2) {
            throw A.e();
        }
        int d4 = this.f5829a.d() + this.f5829a.C();
        do {
            abstractC0433y.j(this.f5829a.p());
        } while (this.f5829a.d() < d4);
        U(d4);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public int G() {
        int i3 = this.f5832d;
        if (i3 != 0) {
            this.f5830b = i3;
            this.f5832d = 0;
        } else {
            this.f5830b = this.f5829a.B();
        }
        int i4 = this.f5830b;
        if (i4 == 0 || i4 == this.f5831c) {
            return Integer.MAX_VALUE;
        }
        return q0.a(i4);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public void H(List list) {
        T(list, false);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public long I() {
        V(1);
        return this.f5829a.w();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public void J(Object obj, e0 e0Var, C0425p c0425p) {
        V(2);
        Q(obj, e0Var, c0425p);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public void K(Map map, H.a aVar, C0425p c0425p) {
        V(2);
        this.f5829a.l(this.f5829a.C());
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public void L(List list, e0 e0Var, C0425p c0425p) {
        int B3;
        if (q0.b(this.f5830b) != 3) {
            throw A.e();
        }
        int i3 = this.f5830b;
        do {
            list.add(R(e0Var, c0425p));
            if (this.f5829a.e() || this.f5832d != 0) {
                return;
            } else {
                B3 = this.f5829a.B();
            }
        } while (B3 == i3);
        this.f5832d = B3;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public void M(List list, e0 e0Var, C0425p c0425p) {
        int B3;
        if (q0.b(this.f5830b) != 2) {
            throw A.e();
        }
        int i3 = this.f5830b;
        do {
            list.add(S(e0Var, c0425p));
            if (this.f5829a.e() || this.f5832d != 0) {
                return;
            } else {
                B3 = this.f5829a.B();
            }
        } while (B3 == i3);
        this.f5832d = B3;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public void N(Object obj, e0 e0Var, C0425p c0425p) {
        V(3);
        P(obj, e0Var, c0425p);
    }

    public final void P(Object obj, e0 e0Var, C0425p c0425p) {
        int i3 = this.f5831c;
        this.f5831c = q0.c(q0.a(this.f5830b), 4);
        try {
            e0Var.j(obj, this, c0425p);
            if (this.f5830b == this.f5831c) {
            } else {
                throw A.h();
            }
        } finally {
            this.f5831c = i3;
        }
    }

    public final void Q(Object obj, e0 e0Var, C0425p c0425p) {
        int C3 = this.f5829a.C();
        AbstractC0418i abstractC0418i = this.f5829a;
        if (abstractC0418i.f5806a >= abstractC0418i.f5807b) {
            throw A.i();
        }
        int l3 = abstractC0418i.l(C3);
        this.f5829a.f5806a++;
        e0Var.j(obj, this, c0425p);
        this.f5829a.a(0);
        r5.f5806a--;
        this.f5829a.k(l3);
    }

    public final Object R(e0 e0Var, C0425p c0425p) {
        Object e3 = e0Var.e();
        P(e3, e0Var, c0425p);
        e0Var.f(e3);
        return e3;
    }

    public final Object S(e0 e0Var, C0425p c0425p) {
        Object e3 = e0Var.e();
        Q(e3, e0Var, c0425p);
        e0Var.f(e3);
        return e3;
    }

    public void T(List list, boolean z3) {
        int B3;
        int B4;
        if (q0.b(this.f5830b) != 2) {
            throw A.e();
        }
        if (!(list instanceof D) || z3) {
            do {
                list.add(z3 ? A() : y());
                if (this.f5829a.e()) {
                    return;
                } else {
                    B3 = this.f5829a.B();
                }
            } while (B3 == this.f5830b);
            this.f5832d = B3;
            return;
        }
        D d3 = (D) list;
        do {
            d3.h(c());
            if (this.f5829a.e()) {
                return;
            } else {
                B4 = this.f5829a.B();
            }
        } while (B4 == this.f5830b);
        this.f5832d = B4;
    }

    public final void U(int i3) {
        if (this.f5829a.d() != i3) {
            throw A.m();
        }
    }

    public final void V(int i3) {
        if (q0.b(this.f5830b) != i3) {
            throw A.e();
        }
    }

    public final void W(int i3) {
        if ((i3 & 3) != 0) {
            throw A.h();
        }
    }

    public final void X(int i3) {
        if ((i3 & 7) != 0) {
            throw A.h();
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public void a(List list) {
        int B3;
        int B4;
        if (!(list instanceof F)) {
            int b3 = q0.b(this.f5830b);
            if (b3 == 0) {
                do {
                    list.add(Long.valueOf(this.f5829a.D()));
                    if (this.f5829a.e()) {
                        return;
                    } else {
                        B3 = this.f5829a.B();
                    }
                } while (B3 == this.f5830b);
                this.f5832d = B3;
                return;
            }
            if (b3 != 2) {
                throw A.e();
            }
            int d3 = this.f5829a.d() + this.f5829a.C();
            do {
                list.add(Long.valueOf(this.f5829a.D()));
            } while (this.f5829a.d() < d3);
            U(d3);
            return;
        }
        F f3 = (F) list;
        int b4 = q0.b(this.f5830b);
        if (b4 == 0) {
            do {
                f3.j(this.f5829a.D());
                if (this.f5829a.e()) {
                    return;
                } else {
                    B4 = this.f5829a.B();
                }
            } while (B4 == this.f5830b);
            this.f5832d = B4;
            return;
        }
        if (b4 != 2) {
            throw A.e();
        }
        int d4 = this.f5829a.d() + this.f5829a.C();
        do {
            f3.j(this.f5829a.D());
        } while (this.f5829a.d() < d4);
        U(d4);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public void b(List list) {
        T(list, true);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public AbstractC0417h c() {
        V(2);
        return this.f5829a.n();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public void d(List list) {
        int B3;
        int B4;
        if (!(list instanceof AbstractC0433y)) {
            int b3 = q0.b(this.f5830b);
            if (b3 == 0) {
                do {
                    list.add(Integer.valueOf(this.f5829a.x()));
                    if (this.f5829a.e()) {
                        return;
                    } else {
                        B3 = this.f5829a.B();
                    }
                } while (B3 == this.f5830b);
                this.f5832d = B3;
                return;
            }
            if (b3 != 2) {
                throw A.e();
            }
            int d3 = this.f5829a.d() + this.f5829a.C();
            do {
                list.add(Integer.valueOf(this.f5829a.x()));
            } while (this.f5829a.d() < d3);
            U(d3);
            return;
        }
        AbstractC0433y abstractC0433y = (AbstractC0433y) list;
        int b4 = q0.b(this.f5830b);
        if (b4 == 0) {
            do {
                abstractC0433y.j(this.f5829a.x());
                if (this.f5829a.e()) {
                    return;
                } else {
                    B4 = this.f5829a.B();
                }
            } while (B4 == this.f5830b);
            this.f5832d = B4;
            return;
        }
        if (b4 != 2) {
            throw A.e();
        }
        int d4 = this.f5829a.d() + this.f5829a.C();
        do {
            abstractC0433y.j(this.f5829a.x());
        } while (this.f5829a.d() < d4);
        U(d4);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public int e() {
        V(0);
        return this.f5829a.p();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public void f(List list) {
        int B3;
        int B4;
        if (!(list instanceof AbstractC0430v)) {
            int b3 = q0.b(this.f5830b);
            if (b3 == 2) {
                int C3 = this.f5829a.C();
                W(C3);
                int d3 = this.f5829a.d() + C3;
                do {
                    list.add(Float.valueOf(this.f5829a.s()));
                } while (this.f5829a.d() < d3);
                return;
            }
            if (b3 != 5) {
                throw A.e();
            }
            do {
                list.add(Float.valueOf(this.f5829a.s()));
                if (this.f5829a.e()) {
                    return;
                } else {
                    B3 = this.f5829a.B();
                }
            } while (B3 == this.f5830b);
            this.f5832d = B3;
            return;
        }
        AbstractC0430v abstractC0430v = (AbstractC0430v) list;
        int b4 = q0.b(this.f5830b);
        if (b4 == 2) {
            int C4 = this.f5829a.C();
            W(C4);
            int d4 = this.f5829a.d() + C4;
            do {
                abstractC0430v.j(this.f5829a.s());
            } while (this.f5829a.d() < d4);
            return;
        }
        if (b4 != 5) {
            throw A.e();
        }
        do {
            abstractC0430v.j(this.f5829a.s());
            if (this.f5829a.e()) {
                return;
            } else {
                B4 = this.f5829a.B();
            }
        } while (B4 == this.f5830b);
        this.f5832d = B4;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public int g() {
        V(0);
        return this.f5829a.C();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public int h() {
        V(0);
        return this.f5829a.t();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public int i() {
        return this.f5830b;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public long j() {
        V(0);
        return this.f5829a.D();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public void k(List list) {
        int B3;
        int B4;
        if (!(list instanceof AbstractC0433y)) {
            int b3 = q0.b(this.f5830b);
            if (b3 == 2) {
                int C3 = this.f5829a.C();
                W(C3);
                int d3 = this.f5829a.d() + C3;
                do {
                    list.add(Integer.valueOf(this.f5829a.q()));
                } while (this.f5829a.d() < d3);
                return;
            }
            if (b3 != 5) {
                throw A.e();
            }
            do {
                list.add(Integer.valueOf(this.f5829a.q()));
                if (this.f5829a.e()) {
                    return;
                } else {
                    B3 = this.f5829a.B();
                }
            } while (B3 == this.f5830b);
            this.f5832d = B3;
            return;
        }
        AbstractC0433y abstractC0433y = (AbstractC0433y) list;
        int b4 = q0.b(this.f5830b);
        if (b4 == 2) {
            int C4 = this.f5829a.C();
            W(C4);
            int d4 = this.f5829a.d() + C4;
            do {
                abstractC0433y.j(this.f5829a.q());
            } while (this.f5829a.d() < d4);
            return;
        }
        if (b4 != 5) {
            throw A.e();
        }
        do {
            abstractC0433y.j(this.f5829a.q());
            if (this.f5829a.e()) {
                return;
            } else {
                B4 = this.f5829a.B();
            }
        } while (B4 == this.f5830b);
        this.f5832d = B4;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public long l() {
        V(1);
        return this.f5829a.r();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public void m(List list) {
        int B3;
        int B4;
        if (!(list instanceof AbstractC0433y)) {
            int b3 = q0.b(this.f5830b);
            if (b3 == 2) {
                int C3 = this.f5829a.C();
                W(C3);
                int d3 = this.f5829a.d() + C3;
                do {
                    list.add(Integer.valueOf(this.f5829a.v()));
                } while (this.f5829a.d() < d3);
                return;
            }
            if (b3 != 5) {
                throw A.e();
            }
            do {
                list.add(Integer.valueOf(this.f5829a.v()));
                if (this.f5829a.e()) {
                    return;
                } else {
                    B3 = this.f5829a.B();
                }
            } while (B3 == this.f5830b);
            this.f5832d = B3;
            return;
        }
        AbstractC0433y abstractC0433y = (AbstractC0433y) list;
        int b4 = q0.b(this.f5830b);
        if (b4 == 2) {
            int C4 = this.f5829a.C();
            W(C4);
            int d4 = this.f5829a.d() + C4;
            do {
                abstractC0433y.j(this.f5829a.v());
            } while (this.f5829a.d() < d4);
            return;
        }
        if (b4 != 5) {
            throw A.e();
        }
        do {
            abstractC0433y.j(this.f5829a.v());
            if (this.f5829a.e()) {
                return;
            } else {
                B4 = this.f5829a.B();
            }
        } while (B4 == this.f5830b);
        this.f5832d = B4;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public boolean n() {
        int i3;
        if (this.f5829a.e() || (i3 = this.f5830b) == this.f5831c) {
            return false;
        }
        return this.f5829a.E(i3);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public int o() {
        V(0);
        return this.f5829a.x();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public void p(List list) {
        int B3;
        int B4;
        if (!(list instanceof F)) {
            int b3 = q0.b(this.f5830b);
            if (b3 == 0) {
                do {
                    list.add(Long.valueOf(this.f5829a.y()));
                    if (this.f5829a.e()) {
                        return;
                    } else {
                        B3 = this.f5829a.B();
                    }
                } while (B3 == this.f5830b);
                this.f5832d = B3;
                return;
            }
            if (b3 != 2) {
                throw A.e();
            }
            int d3 = this.f5829a.d() + this.f5829a.C();
            do {
                list.add(Long.valueOf(this.f5829a.y()));
            } while (this.f5829a.d() < d3);
            U(d3);
            return;
        }
        F f3 = (F) list;
        int b4 = q0.b(this.f5830b);
        if (b4 == 0) {
            do {
                f3.j(this.f5829a.y());
                if (this.f5829a.e()) {
                    return;
                } else {
                    B4 = this.f5829a.B();
                }
            } while (B4 == this.f5830b);
            this.f5832d = B4;
            return;
        }
        if (b4 != 2) {
            throw A.e();
        }
        int d4 = this.f5829a.d() + this.f5829a.C();
        do {
            f3.j(this.f5829a.y());
        } while (this.f5829a.d() < d4);
        U(d4);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public long q() {
        V(0);
        return this.f5829a.y();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public int r() {
        V(5);
        return this.f5829a.v();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public double readDouble() {
        V(1);
        return this.f5829a.o();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public float readFloat() {
        V(5);
        return this.f5829a.s();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public void s(List list) {
        int B3;
        if (q0.b(this.f5830b) != 2) {
            throw A.e();
        }
        do {
            list.add(c());
            if (this.f5829a.e()) {
                return;
            } else {
                B3 = this.f5829a.B();
            }
        } while (B3 == this.f5830b);
        this.f5832d = B3;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public void t(List list) {
        int B3;
        int B4;
        if (!(list instanceof AbstractC0433y)) {
            int b3 = q0.b(this.f5830b);
            if (b3 == 0) {
                do {
                    list.add(Integer.valueOf(this.f5829a.C()));
                    if (this.f5829a.e()) {
                        return;
                    } else {
                        B3 = this.f5829a.B();
                    }
                } while (B3 == this.f5830b);
                this.f5832d = B3;
                return;
            }
            if (b3 != 2) {
                throw A.e();
            }
            int d3 = this.f5829a.d() + this.f5829a.C();
            do {
                list.add(Integer.valueOf(this.f5829a.C()));
            } while (this.f5829a.d() < d3);
            U(d3);
            return;
        }
        AbstractC0433y abstractC0433y = (AbstractC0433y) list;
        int b4 = q0.b(this.f5830b);
        if (b4 == 0) {
            do {
                abstractC0433y.j(this.f5829a.C());
                if (this.f5829a.e()) {
                    return;
                } else {
                    B4 = this.f5829a.B();
                }
            } while (B4 == this.f5830b);
            this.f5832d = B4;
            return;
        }
        if (b4 != 2) {
            throw A.e();
        }
        int d4 = this.f5829a.d() + this.f5829a.C();
        do {
            abstractC0433y.j(this.f5829a.C());
        } while (this.f5829a.d() < d4);
        U(d4);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public void u(List list) {
        int B3;
        int B4;
        if (!(list instanceof AbstractC0422m)) {
            int b3 = q0.b(this.f5830b);
            if (b3 == 1) {
                do {
                    list.add(Double.valueOf(this.f5829a.o()));
                    if (this.f5829a.e()) {
                        return;
                    } else {
                        B3 = this.f5829a.B();
                    }
                } while (B3 == this.f5830b);
                this.f5832d = B3;
                return;
            }
            if (b3 != 2) {
                throw A.e();
            }
            int C3 = this.f5829a.C();
            X(C3);
            int d3 = this.f5829a.d() + C3;
            do {
                list.add(Double.valueOf(this.f5829a.o()));
            } while (this.f5829a.d() < d3);
            return;
        }
        AbstractC0422m abstractC0422m = (AbstractC0422m) list;
        int b4 = q0.b(this.f5830b);
        if (b4 == 1) {
            do {
                abstractC0422m.j(this.f5829a.o());
                if (this.f5829a.e()) {
                    return;
                } else {
                    B4 = this.f5829a.B();
                }
            } while (B4 == this.f5830b);
            this.f5832d = B4;
            return;
        }
        if (b4 != 2) {
            throw A.e();
        }
        int C4 = this.f5829a.C();
        X(C4);
        int d4 = this.f5829a.d() + C4;
        do {
            abstractC0422m.j(this.f5829a.o());
        } while (this.f5829a.d() < d4);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public void v(List list) {
        int B3;
        int B4;
        if (!(list instanceof F)) {
            int b3 = q0.b(this.f5830b);
            if (b3 == 0) {
                do {
                    list.add(Long.valueOf(this.f5829a.u()));
                    if (this.f5829a.e()) {
                        return;
                    } else {
                        B3 = this.f5829a.B();
                    }
                } while (B3 == this.f5830b);
                this.f5832d = B3;
                return;
            }
            if (b3 != 2) {
                throw A.e();
            }
            int d3 = this.f5829a.d() + this.f5829a.C();
            do {
                list.add(Long.valueOf(this.f5829a.u()));
            } while (this.f5829a.d() < d3);
            U(d3);
            return;
        }
        F f3 = (F) list;
        int b4 = q0.b(this.f5830b);
        if (b4 == 0) {
            do {
                f3.j(this.f5829a.u());
                if (this.f5829a.e()) {
                    return;
                } else {
                    B4 = this.f5829a.B();
                }
            } while (B4 == this.f5830b);
            this.f5832d = B4;
            return;
        }
        if (b4 != 2) {
            throw A.e();
        }
        int d4 = this.f5829a.d() + this.f5829a.C();
        do {
            f3.j(this.f5829a.u());
        } while (this.f5829a.d() < d4);
        U(d4);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public void w(List list) {
        int B3;
        int B4;
        if (!(list instanceof AbstractC0415f)) {
            int b3 = q0.b(this.f5830b);
            if (b3 == 0) {
                do {
                    list.add(Boolean.valueOf(this.f5829a.m()));
                    if (this.f5829a.e()) {
                        return;
                    } else {
                        B3 = this.f5829a.B();
                    }
                } while (B3 == this.f5830b);
                this.f5832d = B3;
                return;
            }
            if (b3 != 2) {
                throw A.e();
            }
            int d3 = this.f5829a.d() + this.f5829a.C();
            do {
                list.add(Boolean.valueOf(this.f5829a.m()));
            } while (this.f5829a.d() < d3);
            U(d3);
            return;
        }
        AbstractC0415f abstractC0415f = (AbstractC0415f) list;
        int b4 = q0.b(this.f5830b);
        if (b4 == 0) {
            do {
                abstractC0415f.j(this.f5829a.m());
                if (this.f5829a.e()) {
                    return;
                } else {
                    B4 = this.f5829a.B();
                }
            } while (B4 == this.f5830b);
            this.f5832d = B4;
            return;
        }
        if (b4 != 2) {
            throw A.e();
        }
        int d4 = this.f5829a.d() + this.f5829a.C();
        do {
            abstractC0415f.j(this.f5829a.m());
        } while (this.f5829a.d() < d4);
        U(d4);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public void x(List list) {
        int B3;
        int B4;
        if (!(list instanceof F)) {
            int b3 = q0.b(this.f5830b);
            if (b3 == 1) {
                do {
                    list.add(Long.valueOf(this.f5829a.w()));
                    if (this.f5829a.e()) {
                        return;
                    } else {
                        B3 = this.f5829a.B();
                    }
                } while (B3 == this.f5830b);
                this.f5832d = B3;
                return;
            }
            if (b3 != 2) {
                throw A.e();
            }
            int C3 = this.f5829a.C();
            X(C3);
            int d3 = this.f5829a.d() + C3;
            do {
                list.add(Long.valueOf(this.f5829a.w()));
            } while (this.f5829a.d() < d3);
            return;
        }
        F f3 = (F) list;
        int b4 = q0.b(this.f5830b);
        if (b4 == 1) {
            do {
                f3.j(this.f5829a.w());
                if (this.f5829a.e()) {
                    return;
                } else {
                    B4 = this.f5829a.B();
                }
            } while (B4 == this.f5830b);
            this.f5832d = B4;
            return;
        }
        if (b4 != 2) {
            throw A.e();
        }
        int C4 = this.f5829a.C();
        X(C4);
        int d4 = this.f5829a.d() + C4;
        do {
            f3.j(this.f5829a.w());
        } while (this.f5829a.d() < d4);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public String y() {
        V(2);
        return this.f5829a.z();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d0
    public long z() {
        V(0);
        return this.f5829a.u();
    }
}
