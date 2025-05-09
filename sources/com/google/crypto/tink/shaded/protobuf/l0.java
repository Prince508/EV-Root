package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.r0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: f, reason: collision with root package name */
    public static final l0 f5844f = new l0(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f5845a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f5846b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f5847c;

    /* renamed from: d, reason: collision with root package name */
    public int f5848d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5849e;

    public l0() {
        this(0, new int[8], new Object[8], true);
    }

    public static l0 c() {
        return f5844f;
    }

    public static int f(int[] iArr, int i3) {
        int i4 = 17;
        for (int i5 = 0; i5 < i3; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        return i4;
    }

    public static int g(Object[] objArr, int i3) {
        int i4 = 17;
        for (int i5 = 0; i5 < i3; i5++) {
            i4 = (i4 * 31) + objArr[i5].hashCode();
        }
        return i4;
    }

    public static l0 j(l0 l0Var, l0 l0Var2) {
        int i3 = l0Var.f5845a + l0Var2.f5845a;
        int[] copyOf = Arrays.copyOf(l0Var.f5846b, i3);
        System.arraycopy(l0Var2.f5846b, 0, copyOf, l0Var.f5845a, l0Var2.f5845a);
        Object[] copyOf2 = Arrays.copyOf(l0Var.f5847c, i3);
        System.arraycopy(l0Var2.f5847c, 0, copyOf2, l0Var.f5845a, l0Var2.f5845a);
        return new l0(i3, copyOf, copyOf2, true);
    }

    public static l0 k() {
        return new l0();
    }

    public static boolean l(Object[] objArr, Object[] objArr2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            if (!objArr[i4].equals(objArr2[i4])) {
                return false;
            }
        }
        return true;
    }

    public static boolean o(int[] iArr, int[] iArr2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            if (iArr[i4] != iArr2[i4]) {
                return false;
            }
        }
        return true;
    }

    public static void q(int i3, Object obj, r0 r0Var) {
        int a3 = q0.a(i3);
        int b3 = q0.b(i3);
        if (b3 == 0) {
            r0Var.d(a3, ((Long) obj).longValue());
            return;
        }
        if (b3 == 1) {
            r0Var.g(a3, ((Long) obj).longValue());
            return;
        }
        if (b3 == 2) {
            r0Var.J(a3, (AbstractC0417h) obj);
            return;
        }
        if (b3 != 3) {
            if (b3 != 5) {
                throw new RuntimeException(A.e());
            }
            r0Var.y(a3, ((Integer) obj).intValue());
        } else if (r0Var.j() == r0.a.ASCENDING) {
            r0Var.o(a3);
            ((l0) obj).r(r0Var);
            r0Var.p(a3);
        } else {
            r0Var.p(a3);
            ((l0) obj).r(r0Var);
            r0Var.o(a3);
        }
    }

    public void a() {
        if (!this.f5849e) {
            throw new UnsupportedOperationException();
        }
    }

    public final void b(int i3) {
        int[] iArr = this.f5846b;
        if (i3 > iArr.length) {
            int i4 = this.f5845a;
            int i5 = i4 + (i4 / 2);
            if (i5 >= i3) {
                i3 = i5;
            }
            if (i3 < 8) {
                i3 = 8;
            }
            this.f5846b = Arrays.copyOf(iArr, i3);
            this.f5847c = Arrays.copyOf(this.f5847c, i3);
        }
    }

    public int d() {
        int O3;
        int i3 = this.f5848d;
        if (i3 != -1) {
            return i3;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.f5845a; i5++) {
            int i6 = this.f5846b[i5];
            int a3 = q0.a(i6);
            int b3 = q0.b(i6);
            if (b3 == 0) {
                O3 = AbstractC0420k.O(a3, ((Long) this.f5847c[i5]).longValue());
            } else if (b3 == 1) {
                O3 = AbstractC0420k.n(a3, ((Long) this.f5847c[i5]).longValue());
            } else if (b3 == 2) {
                O3 = AbstractC0420k.f(a3, (AbstractC0417h) this.f5847c[i5]);
            } else if (b3 == 3) {
                O3 = (AbstractC0420k.L(a3) * 2) + ((l0) this.f5847c[i5]).d();
            } else {
                if (b3 != 5) {
                    throw new IllegalStateException(A.e());
                }
                O3 = AbstractC0420k.l(a3, ((Integer) this.f5847c[i5]).intValue());
            }
            i4 += O3;
        }
        this.f5848d = i4;
        return i4;
    }

    public int e() {
        int i3 = this.f5848d;
        if (i3 != -1) {
            return i3;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.f5845a; i5++) {
            i4 += AbstractC0420k.A(q0.a(this.f5846b[i5]), (AbstractC0417h) this.f5847c[i5]);
        }
        this.f5848d = i4;
        return i4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        int i3 = this.f5845a;
        return i3 == l0Var.f5845a && o(this.f5846b, l0Var.f5846b, i3) && l(this.f5847c, l0Var.f5847c, this.f5845a);
    }

    public void h() {
        this.f5849e = false;
    }

    public int hashCode() {
        int i3 = this.f5845a;
        return ((((527 + i3) * 31) + f(this.f5846b, i3)) * 31) + g(this.f5847c, this.f5845a);
    }

    public l0 i(l0 l0Var) {
        if (l0Var.equals(c())) {
            return this;
        }
        a();
        int i3 = this.f5845a + l0Var.f5845a;
        b(i3);
        System.arraycopy(l0Var.f5846b, 0, this.f5846b, this.f5845a, l0Var.f5845a);
        System.arraycopy(l0Var.f5847c, 0, this.f5847c, this.f5845a, l0Var.f5845a);
        this.f5845a = i3;
        return this;
    }

    public final void m(StringBuilder sb, int i3) {
        for (int i4 = 0; i4 < this.f5845a; i4++) {
            Q.d(sb, i3, String.valueOf(q0.a(this.f5846b[i4])), this.f5847c[i4]);
        }
    }

    public void n(int i3, Object obj) {
        a();
        b(this.f5845a + 1);
        int[] iArr = this.f5846b;
        int i4 = this.f5845a;
        iArr[i4] = i3;
        this.f5847c[i4] = obj;
        this.f5845a = i4 + 1;
    }

    public void p(r0 r0Var) {
        if (r0Var.j() == r0.a.DESCENDING) {
            for (int i3 = this.f5845a - 1; i3 >= 0; i3--) {
                r0Var.i(q0.a(this.f5846b[i3]), this.f5847c[i3]);
            }
            return;
        }
        for (int i4 = 0; i4 < this.f5845a; i4++) {
            r0Var.i(q0.a(this.f5846b[i4]), this.f5847c[i4]);
        }
    }

    public void r(r0 r0Var) {
        if (this.f5845a == 0) {
            return;
        }
        if (r0Var.j() == r0.a.ASCENDING) {
            for (int i3 = 0; i3 < this.f5845a; i3++) {
                q(this.f5846b[i3], this.f5847c[i3], r0Var);
            }
            return;
        }
        for (int i4 = this.f5845a - 1; i4 >= 0; i4--) {
            q(this.f5846b[i4], this.f5847c[i4], r0Var);
        }
    }

    public l0(int i3, int[] iArr, Object[] objArr, boolean z3) {
        this.f5848d = -1;
        this.f5845a = i3;
        this.f5846b = iArr;
        this.f5847c = objArr;
        this.f5849e = z3;
    }
}
