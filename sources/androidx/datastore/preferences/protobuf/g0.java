package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.m0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: f, reason: collision with root package name */
    public static final g0 f3658f = new g0(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    public int f3659a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f3660b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f3661c;

    /* renamed from: d, reason: collision with root package name */
    public int f3662d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3663e;

    public g0() {
        this(0, new int[8], new Object[8], true);
    }

    public static boolean c(int[] iArr, int[] iArr2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            if (iArr[i4] != iArr2[i4]) {
                return false;
            }
        }
        return true;
    }

    public static boolean d(Object[] objArr, Object[] objArr2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            if (!objArr[i4].equals(objArr2[i4])) {
                return false;
            }
        }
        return true;
    }

    public static g0 e() {
        return f3658f;
    }

    public static int h(int[] iArr, int i3) {
        int i4 = 17;
        for (int i5 = 0; i5 < i3; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        return i4;
    }

    public static int i(Object[] objArr, int i3) {
        int i4 = 17;
        for (int i5 = 0; i5 < i3; i5++) {
            i4 = (i4 * 31) + objArr[i5].hashCode();
        }
        return i4;
    }

    public static g0 k(g0 g0Var, g0 g0Var2) {
        int i3 = g0Var.f3659a + g0Var2.f3659a;
        int[] copyOf = Arrays.copyOf(g0Var.f3660b, i3);
        System.arraycopy(g0Var2.f3660b, 0, copyOf, g0Var.f3659a, g0Var2.f3659a);
        Object[] copyOf2 = Arrays.copyOf(g0Var.f3661c, i3);
        System.arraycopy(g0Var2.f3661c, 0, copyOf2, g0Var.f3659a, g0Var2.f3659a);
        return new g0(i3, copyOf, copyOf2, true);
    }

    public static g0 l() {
        return new g0();
    }

    public static void p(int i3, Object obj, m0 m0Var) {
        int a3 = l0.a(i3);
        int b3 = l0.b(i3);
        if (b3 == 0) {
            m0Var.d(a3, ((Long) obj).longValue());
            return;
        }
        if (b3 == 1) {
            m0Var.g(a3, ((Long) obj).longValue());
            return;
        }
        if (b3 == 2) {
            m0Var.L(a3, (AbstractC0320f) obj);
            return;
        }
        if (b3 != 3) {
            if (b3 != 5) {
                throw new RuntimeException(C0335v.d());
            }
            m0Var.y(a3, ((Integer) obj).intValue());
        } else if (m0Var.j() == m0.a.ASCENDING) {
            m0Var.o(a3);
            ((g0) obj).q(m0Var);
            m0Var.p(a3);
        } else {
            m0Var.p(a3);
            ((g0) obj).q(m0Var);
            m0Var.o(a3);
        }
    }

    public void a() {
        if (!this.f3663e) {
            throw new UnsupportedOperationException();
        }
    }

    public final void b() {
        int i3 = this.f3659a;
        int[] iArr = this.f3660b;
        if (i3 == iArr.length) {
            int i4 = i3 + (i3 < 4 ? 8 : i3 >> 1);
            this.f3660b = Arrays.copyOf(iArr, i4);
            this.f3661c = Arrays.copyOf(this.f3661c, i4);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        int i3 = this.f3659a;
        return i3 == g0Var.f3659a && c(this.f3660b, g0Var.f3660b, i3) && d(this.f3661c, g0Var.f3661c, this.f3659a);
    }

    public int f() {
        int S3;
        int i3 = this.f3662d;
        if (i3 != -1) {
            return i3;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.f3659a; i5++) {
            int i6 = this.f3660b[i5];
            int a3 = l0.a(i6);
            int b3 = l0.b(i6);
            if (b3 == 0) {
                S3 = AbstractC0323i.S(a3, ((Long) this.f3661c[i5]).longValue());
            } else if (b3 == 1) {
                S3 = AbstractC0323i.n(a3, ((Long) this.f3661c[i5]).longValue());
            } else if (b3 == 2) {
                S3 = AbstractC0323i.f(a3, (AbstractC0320f) this.f3661c[i5]);
            } else if (b3 == 3) {
                S3 = (AbstractC0323i.P(a3) * 2) + ((g0) this.f3661c[i5]).f();
            } else {
                if (b3 != 5) {
                    throw new IllegalStateException(C0335v.d());
                }
                S3 = AbstractC0323i.l(a3, ((Integer) this.f3661c[i5]).intValue());
            }
            i4 += S3;
        }
        this.f3662d = i4;
        return i4;
    }

    public int g() {
        int i3 = this.f3662d;
        if (i3 != -1) {
            return i3;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.f3659a; i5++) {
            i4 += AbstractC0323i.D(l0.a(this.f3660b[i5]), (AbstractC0320f) this.f3661c[i5]);
        }
        this.f3662d = i4;
        return i4;
    }

    public int hashCode() {
        int i3 = this.f3659a;
        return ((((527 + i3) * 31) + h(this.f3660b, i3)) * 31) + i(this.f3661c, this.f3659a);
    }

    public void j() {
        this.f3663e = false;
    }

    public final void m(StringBuilder sb, int i3) {
        for (int i4 = 0; i4 < this.f3659a; i4++) {
            L.c(sb, i3, String.valueOf(l0.a(this.f3660b[i4])), this.f3661c[i4]);
        }
    }

    public void n(int i3, Object obj) {
        a();
        b();
        int[] iArr = this.f3660b;
        int i4 = this.f3659a;
        iArr[i4] = i3;
        this.f3661c[i4] = obj;
        this.f3659a = i4 + 1;
    }

    public void o(m0 m0Var) {
        if (m0Var.j() == m0.a.DESCENDING) {
            for (int i3 = this.f3659a - 1; i3 >= 0; i3--) {
                m0Var.i(l0.a(this.f3660b[i3]), this.f3661c[i3]);
            }
            return;
        }
        for (int i4 = 0; i4 < this.f3659a; i4++) {
            m0Var.i(l0.a(this.f3660b[i4]), this.f3661c[i4]);
        }
    }

    public void q(m0 m0Var) {
        if (this.f3659a == 0) {
            return;
        }
        if (m0Var.j() == m0.a.ASCENDING) {
            for (int i3 = 0; i3 < this.f3659a; i3++) {
                p(this.f3660b[i3], this.f3661c[i3], m0Var);
            }
            return;
        }
        for (int i4 = this.f3659a - 1; i4 >= 0; i4--) {
            p(this.f3660b[i4], this.f3661c[i4], m0Var);
        }
    }

    public g0(int i3, int[] iArr, Object[] objArr, boolean z3) {
        this.f3662d = -1;
        this.f3659a = i3;
        this.f3660b = iArr;
        this.f3661c = objArr;
        this.f3663e = z3;
    }
}
