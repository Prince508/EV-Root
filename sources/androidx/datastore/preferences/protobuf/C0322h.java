package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.l0;
import java.util.List;

/* renamed from: androidx.datastore.preferences.protobuf.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0322h implements X {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0321g f3664a;

    /* renamed from: b, reason: collision with root package name */
    public int f3665b;

    /* renamed from: c, reason: collision with root package name */
    public int f3666c;

    /* renamed from: d, reason: collision with root package name */
    public int f3667d = 0;

    /* renamed from: androidx.datastore.preferences.protobuf.h$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3668a;

        static {
            int[] iArr = new int[l0.b.values().length];
            f3668a = iArr;
            try {
                iArr[l0.b.f3724n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3668a[l0.b.f3728r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3668a[l0.b.f3717g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3668a[l0.b.f3730t.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3668a[l0.b.f3723m.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3668a[l0.b.f3722l.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3668a[l0.b.f3718h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f3668a[l0.b.f3721k.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f3668a[l0.b.f3719i.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f3668a[l0.b.f3727q.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f3668a[l0.b.f3731u.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f3668a[l0.b.f3732v.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f3668a[l0.b.f3733w.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f3668a[l0.b.f3734x.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f3668a[l0.b.f3725o.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f3668a[l0.b.f3729s.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f3668a[l0.b.f3720j.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public C0322h(AbstractC0321g abstractC0321g) {
        AbstractC0321g abstractC0321g2 = (AbstractC0321g) AbstractC0334u.b(abstractC0321g, "input");
        this.f3664a = abstractC0321g2;
        abstractC0321g2.f3639d = this;
    }

    public static C0322h O(AbstractC0321g abstractC0321g) {
        C0322h c0322h = abstractC0321g.f3639d;
        return c0322h != null ? c0322h : new C0322h(abstractC0321g);
    }

    private Object P(l0.b bVar, Class cls, C0327m c0327m) {
        switch (a.f3668a[bVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(E());
            case 2:
                return c();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(e());
            case 5:
                return Integer.valueOf(B());
            case 6:
                return Long.valueOf(l());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(h());
            case 9:
                return Long.valueOf(z());
            case 10:
                return S(cls, c0327m);
            case 11:
                return Integer.valueOf(r());
            case 12:
                return Long.valueOf(I());
            case 13:
                return Integer.valueOf(o());
            case 14:
                return Long.valueOf(q());
            case 15:
                return A();
            case 16:
                return Integer.valueOf(g());
            case 17:
                return Long.valueOf(j());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private Object Q(Y y3, C0327m c0327m) {
        int i3 = this.f3666c;
        this.f3666c = l0.c(l0.a(this.f3665b), 4);
        try {
            Object e3 = y3.e();
            y3.h(e3, this, c0327m);
            y3.f(e3);
            if (this.f3665b == this.f3666c) {
                return e3;
            }
            throw C0335v.g();
        } finally {
            this.f3666c = i3;
        }
    }

    private Object R(Y y3, C0327m c0327m) {
        int C3 = this.f3664a.C();
        AbstractC0321g abstractC0321g = this.f3664a;
        if (abstractC0321g.f3636a >= abstractC0321g.f3637b) {
            throw C0335v.h();
        }
        int l3 = abstractC0321g.l(C3);
        Object e3 = y3.e();
        this.f3664a.f3636a++;
        y3.h(e3, this, c0327m);
        y3.f(e3);
        this.f3664a.a(0);
        r5.f3636a--;
        this.f3664a.k(l3);
        return e3;
    }

    private void U(int i3) {
        if (this.f3664a.d() != i3) {
            throw C0335v.k();
        }
    }

    private void V(int i3) {
        if (l0.b(this.f3665b) != i3) {
            throw C0335v.d();
        }
    }

    private void W(int i3) {
        if ((i3 & 3) != 0) {
            throw C0335v.g();
        }
    }

    private void X(int i3) {
        if ((i3 & 7) != 0) {
            throw C0335v.g();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public String A() {
        V(2);
        return this.f3664a.A();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public int B() {
        V(5);
        return this.f3664a.q();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void C(List list) {
        int B3;
        int b3 = l0.b(this.f3665b);
        if (b3 == 1) {
            do {
                list.add(Long.valueOf(this.f3664a.r()));
                if (this.f3664a.e()) {
                    return;
                } else {
                    B3 = this.f3664a.B();
                }
            } while (B3 == this.f3665b);
            this.f3667d = B3;
            return;
        }
        if (b3 != 2) {
            throw C0335v.d();
        }
        int C3 = this.f3664a.C();
        X(C3);
        int d3 = this.f3664a.d() + C3;
        do {
            list.add(Long.valueOf(this.f3664a.r()));
        } while (this.f3664a.d() < d3);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void D(List list) {
        int B3;
        int b3 = l0.b(this.f3665b);
        if (b3 == 0) {
            do {
                list.add(Integer.valueOf(this.f3664a.t()));
                if (this.f3664a.e()) {
                    return;
                } else {
                    B3 = this.f3664a.B();
                }
            } while (B3 == this.f3665b);
            this.f3667d = B3;
            return;
        }
        if (b3 != 2) {
            throw C0335v.d();
        }
        int d3 = this.f3664a.d() + this.f3664a.C();
        do {
            list.add(Integer.valueOf(this.f3664a.t()));
        } while (this.f3664a.d() < d3);
        U(d3);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public boolean E() {
        V(0);
        return this.f3664a.m();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void F(List list) {
        int B3;
        int b3 = l0.b(this.f3665b);
        if (b3 == 0) {
            do {
                list.add(Integer.valueOf(this.f3664a.p()));
                if (this.f3664a.e()) {
                    return;
                } else {
                    B3 = this.f3664a.B();
                }
            } while (B3 == this.f3665b);
            this.f3667d = B3;
            return;
        }
        if (b3 != 2) {
            throw C0335v.d();
        }
        int d3 = this.f3664a.d() + this.f3664a.C();
        do {
            list.add(Integer.valueOf(this.f3664a.p()));
        } while (this.f3664a.d() < d3);
        U(d3);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public int G() {
        int i3 = this.f3667d;
        if (i3 != 0) {
            this.f3665b = i3;
            this.f3667d = 0;
        } else {
            this.f3665b = this.f3664a.B();
        }
        int i4 = this.f3665b;
        if (i4 == 0 || i4 == this.f3666c) {
            return Integer.MAX_VALUE;
        }
        return l0.a(i4);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void H(List list) {
        T(list, false);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public long I() {
        V(1);
        return this.f3664a.w();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public Object J(Y y3, C0327m c0327m) {
        V(2);
        return R(y3, c0327m);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x005e, code lost:
    
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0061, code lost:
    
        r7.f3664a.k(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0066, code lost:
    
        return;
     */
    @Override // androidx.datastore.preferences.protobuf.X
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void K(java.util.Map r8, androidx.datastore.preferences.protobuf.C.a r9, androidx.datastore.preferences.protobuf.C0327m r10) {
        /*
            r7 = this;
            r0 = 2
            r7.V(r0)
            androidx.datastore.preferences.protobuf.g r1 = r7.f3664a
            int r1 = r1.C()
            androidx.datastore.preferences.protobuf.g r2 = r7.f3664a
            int r1 = r2.l(r1)
            java.lang.Object r2 = r9.f3550b
            java.lang.Object r3 = r9.f3552d
        L14:
            int r4 = r7.G()     // Catch: java.lang.Throwable -> L3a
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5e
            androidx.datastore.preferences.protobuf.g r5 = r7.f3664a     // Catch: java.lang.Throwable -> L3a
            boolean r5 = r5.e()     // Catch: java.lang.Throwable -> L3a
            if (r5 == 0) goto L26
            goto L5e
        L26:
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L49
            if (r4 == r0) goto L3c
            boolean r4 = r7.n()     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C0335v.a -> L51
            if (r4 == 0) goto L34
            goto L14
        L34:
            androidx.datastore.preferences.protobuf.v r4 = new androidx.datastore.preferences.protobuf.v     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C0335v.a -> L51
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C0335v.a -> L51
            throw r4     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C0335v.a -> L51
        L3a:
            r8 = move-exception
            goto L67
        L3c:
            androidx.datastore.preferences.protobuf.l0$b r4 = r9.f3551c     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C0335v.a -> L51
            java.lang.Object r5 = r9.f3552d     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C0335v.a -> L51
            java.lang.Class r5 = r5.getClass()     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C0335v.a -> L51
            java.lang.Object r3 = r7.P(r4, r5, r10)     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C0335v.a -> L51
            goto L14
        L49:
            androidx.datastore.preferences.protobuf.l0$b r4 = r9.f3549a     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C0335v.a -> L51
            r5 = 0
            java.lang.Object r2 = r7.P(r4, r5, r5)     // Catch: java.lang.Throwable -> L3a androidx.datastore.preferences.protobuf.C0335v.a -> L51
            goto L14
        L51:
            boolean r4 = r7.n()     // Catch: java.lang.Throwable -> L3a
            if (r4 == 0) goto L58
            goto L14
        L58:
            androidx.datastore.preferences.protobuf.v r8 = new androidx.datastore.preferences.protobuf.v     // Catch: java.lang.Throwable -> L3a
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L3a
            throw r8     // Catch: java.lang.Throwable -> L3a
        L5e:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L3a
            androidx.datastore.preferences.protobuf.g r8 = r7.f3664a
            r8.k(r1)
            return
        L67:
            androidx.datastore.preferences.protobuf.g r9 = r7.f3664a
            r9.k(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C0322h.K(java.util.Map, androidx.datastore.preferences.protobuf.C$a, androidx.datastore.preferences.protobuf.m):void");
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void L(List list, Y y3, C0327m c0327m) {
        int B3;
        if (l0.b(this.f3665b) != 3) {
            throw C0335v.d();
        }
        int i3 = this.f3665b;
        do {
            list.add(Q(y3, c0327m));
            if (this.f3664a.e() || this.f3667d != 0) {
                return;
            } else {
                B3 = this.f3664a.B();
            }
        } while (B3 == i3);
        this.f3667d = B3;
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void M(List list, Y y3, C0327m c0327m) {
        int B3;
        if (l0.b(this.f3665b) != 2) {
            throw C0335v.d();
        }
        int i3 = this.f3665b;
        do {
            list.add(R(y3, c0327m));
            if (this.f3664a.e() || this.f3667d != 0) {
                return;
            } else {
                B3 = this.f3664a.B();
            }
        } while (B3 == i3);
        this.f3667d = B3;
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public Object N(Y y3, C0327m c0327m) {
        V(3);
        return Q(y3, c0327m);
    }

    public Object S(Class cls, C0327m c0327m) {
        V(2);
        return R(U.a().c(cls), c0327m);
    }

    public void T(List list, boolean z3) {
        int B3;
        int B4;
        if (l0.b(this.f3665b) != 2) {
            throw C0335v.d();
        }
        if (!(list instanceof InterfaceC0339z) || z3) {
            do {
                list.add(z3 ? A() : y());
                if (this.f3664a.e()) {
                    return;
                } else {
                    B3 = this.f3664a.B();
                }
            } while (B3 == this.f3665b);
            this.f3667d = B3;
            return;
        }
        InterfaceC0339z interfaceC0339z = (InterfaceC0339z) list;
        do {
            interfaceC0339z.g(c());
            if (this.f3664a.e()) {
                return;
            } else {
                B4 = this.f3664a.B();
            }
        } while (B4 == this.f3665b);
        this.f3667d = B4;
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void a(List list) {
        int B3;
        int b3 = l0.b(this.f3665b);
        if (b3 == 0) {
            do {
                list.add(Long.valueOf(this.f3664a.D()));
                if (this.f3664a.e()) {
                    return;
                } else {
                    B3 = this.f3664a.B();
                }
            } while (B3 == this.f3665b);
            this.f3667d = B3;
            return;
        }
        if (b3 != 2) {
            throw C0335v.d();
        }
        int d3 = this.f3664a.d() + this.f3664a.C();
        do {
            list.add(Long.valueOf(this.f3664a.D()));
        } while (this.f3664a.d() < d3);
        U(d3);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void b(List list) {
        T(list, true);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public AbstractC0320f c() {
        V(2);
        return this.f3664a.n();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void d(List list) {
        int B3;
        int b3 = l0.b(this.f3665b);
        if (b3 == 0) {
            do {
                list.add(Integer.valueOf(this.f3664a.x()));
                if (this.f3664a.e()) {
                    return;
                } else {
                    B3 = this.f3664a.B();
                }
            } while (B3 == this.f3665b);
            this.f3667d = B3;
            return;
        }
        if (b3 != 2) {
            throw C0335v.d();
        }
        int d3 = this.f3664a.d() + this.f3664a.C();
        do {
            list.add(Integer.valueOf(this.f3664a.x()));
        } while (this.f3664a.d() < d3);
        U(d3);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public int e() {
        V(0);
        return this.f3664a.p();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void f(List list) {
        int B3;
        int b3 = l0.b(this.f3665b);
        if (b3 == 2) {
            int C3 = this.f3664a.C();
            W(C3);
            int d3 = this.f3664a.d() + C3;
            do {
                list.add(Float.valueOf(this.f3664a.s()));
            } while (this.f3664a.d() < d3);
            return;
        }
        if (b3 != 5) {
            throw C0335v.d();
        }
        do {
            list.add(Float.valueOf(this.f3664a.s()));
            if (this.f3664a.e()) {
                return;
            } else {
                B3 = this.f3664a.B();
            }
        } while (B3 == this.f3665b);
        this.f3667d = B3;
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public int g() {
        V(0);
        return this.f3664a.C();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public int h() {
        V(0);
        return this.f3664a.t();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public int i() {
        return this.f3665b;
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public long j() {
        V(0);
        return this.f3664a.D();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void k(List list) {
        int B3;
        int b3 = l0.b(this.f3665b);
        if (b3 == 2) {
            int C3 = this.f3664a.C();
            W(C3);
            int d3 = this.f3664a.d() + C3;
            do {
                list.add(Integer.valueOf(this.f3664a.q()));
            } while (this.f3664a.d() < d3);
            return;
        }
        if (b3 != 5) {
            throw C0335v.d();
        }
        do {
            list.add(Integer.valueOf(this.f3664a.q()));
            if (this.f3664a.e()) {
                return;
            } else {
                B3 = this.f3664a.B();
            }
        } while (B3 == this.f3665b);
        this.f3667d = B3;
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public long l() {
        V(1);
        return this.f3664a.r();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void m(List list) {
        int B3;
        int b3 = l0.b(this.f3665b);
        if (b3 == 2) {
            int C3 = this.f3664a.C();
            W(C3);
            int d3 = this.f3664a.d() + C3;
            do {
                list.add(Integer.valueOf(this.f3664a.v()));
            } while (this.f3664a.d() < d3);
            return;
        }
        if (b3 != 5) {
            throw C0335v.d();
        }
        do {
            list.add(Integer.valueOf(this.f3664a.v()));
            if (this.f3664a.e()) {
                return;
            } else {
                B3 = this.f3664a.B();
            }
        } while (B3 == this.f3665b);
        this.f3667d = B3;
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public boolean n() {
        int i3;
        if (this.f3664a.e() || (i3 = this.f3665b) == this.f3666c) {
            return false;
        }
        return this.f3664a.E(i3);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public int o() {
        V(0);
        return this.f3664a.x();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void p(List list) {
        int B3;
        int b3 = l0.b(this.f3665b);
        if (b3 == 0) {
            do {
                list.add(Long.valueOf(this.f3664a.y()));
                if (this.f3664a.e()) {
                    return;
                } else {
                    B3 = this.f3664a.B();
                }
            } while (B3 == this.f3665b);
            this.f3667d = B3;
            return;
        }
        if (b3 != 2) {
            throw C0335v.d();
        }
        int d3 = this.f3664a.d() + this.f3664a.C();
        do {
            list.add(Long.valueOf(this.f3664a.y()));
        } while (this.f3664a.d() < d3);
        U(d3);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public long q() {
        V(0);
        return this.f3664a.y();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public int r() {
        V(5);
        return this.f3664a.v();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public double readDouble() {
        V(1);
        return this.f3664a.o();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public float readFloat() {
        V(5);
        return this.f3664a.s();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void s(List list) {
        int B3;
        if (l0.b(this.f3665b) != 2) {
            throw C0335v.d();
        }
        do {
            list.add(c());
            if (this.f3664a.e()) {
                return;
            } else {
                B3 = this.f3664a.B();
            }
        } while (B3 == this.f3665b);
        this.f3667d = B3;
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void t(List list) {
        int B3;
        int b3 = l0.b(this.f3665b);
        if (b3 == 0) {
            do {
                list.add(Integer.valueOf(this.f3664a.C()));
                if (this.f3664a.e()) {
                    return;
                } else {
                    B3 = this.f3664a.B();
                }
            } while (B3 == this.f3665b);
            this.f3667d = B3;
            return;
        }
        if (b3 != 2) {
            throw C0335v.d();
        }
        int d3 = this.f3664a.d() + this.f3664a.C();
        do {
            list.add(Integer.valueOf(this.f3664a.C()));
        } while (this.f3664a.d() < d3);
        U(d3);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void u(List list) {
        int B3;
        int b3 = l0.b(this.f3665b);
        if (b3 == 1) {
            do {
                list.add(Double.valueOf(this.f3664a.o()));
                if (this.f3664a.e()) {
                    return;
                } else {
                    B3 = this.f3664a.B();
                }
            } while (B3 == this.f3665b);
            this.f3667d = B3;
            return;
        }
        if (b3 != 2) {
            throw C0335v.d();
        }
        int C3 = this.f3664a.C();
        X(C3);
        int d3 = this.f3664a.d() + C3;
        do {
            list.add(Double.valueOf(this.f3664a.o()));
        } while (this.f3664a.d() < d3);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void v(List list) {
        int B3;
        int b3 = l0.b(this.f3665b);
        if (b3 == 0) {
            do {
                list.add(Long.valueOf(this.f3664a.u()));
                if (this.f3664a.e()) {
                    return;
                } else {
                    B3 = this.f3664a.B();
                }
            } while (B3 == this.f3665b);
            this.f3667d = B3;
            return;
        }
        if (b3 != 2) {
            throw C0335v.d();
        }
        int d3 = this.f3664a.d() + this.f3664a.C();
        do {
            list.add(Long.valueOf(this.f3664a.u()));
        } while (this.f3664a.d() < d3);
        U(d3);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void w(List list) {
        int B3;
        int b3 = l0.b(this.f3665b);
        if (b3 == 0) {
            do {
                list.add(Boolean.valueOf(this.f3664a.m()));
                if (this.f3664a.e()) {
                    return;
                } else {
                    B3 = this.f3664a.B();
                }
            } while (B3 == this.f3665b);
            this.f3667d = B3;
            return;
        }
        if (b3 != 2) {
            throw C0335v.d();
        }
        int d3 = this.f3664a.d() + this.f3664a.C();
        do {
            list.add(Boolean.valueOf(this.f3664a.m()));
        } while (this.f3664a.d() < d3);
        U(d3);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public void x(List list) {
        int B3;
        int b3 = l0.b(this.f3665b);
        if (b3 == 1) {
            do {
                list.add(Long.valueOf(this.f3664a.w()));
                if (this.f3664a.e()) {
                    return;
                } else {
                    B3 = this.f3664a.B();
                }
            } while (B3 == this.f3665b);
            this.f3667d = B3;
            return;
        }
        if (b3 != 2) {
            throw C0335v.d();
        }
        int C3 = this.f3664a.C();
        X(C3);
        int d3 = this.f3664a.d() + C3;
        do {
            list.add(Long.valueOf(this.f3664a.w()));
        } while (this.f3664a.d() < d3);
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public String y() {
        V(2);
        return this.f3664a.z();
    }

    @Override // androidx.datastore.preferences.protobuf.X
    public long z() {
        V(0);
        return this.f3664a.u();
    }
}
