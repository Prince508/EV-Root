package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC0434z;

/* renamed from: com.google.crypto.tink.shaded.protobuf.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0414e {

    /* renamed from: com.google.crypto.tink.shaded.protobuf.e$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f5785a;

        /* renamed from: b, reason: collision with root package name */
        public long f5786b;

        /* renamed from: c, reason: collision with root package name */
        public Object f5787c;

        /* renamed from: d, reason: collision with root package name */
        public final C0425p f5788d;

        public a(C0425p c0425p) {
            c0425p.getClass();
            this.f5788d = c0425p;
        }
    }

    public static int A(int i3, byte[] bArr, int i4, int i5, AbstractC0434z.d dVar, a aVar) {
        F f3 = (F) dVar;
        int K3 = K(bArr, i4, aVar);
        f3.j(AbstractC0418i.c(aVar.f5786b));
        while (K3 < i5) {
            int H3 = H(bArr, K3, aVar);
            if (i3 != aVar.f5785a) {
                break;
            }
            K3 = K(bArr, H3, aVar);
            f3.j(AbstractC0418i.c(aVar.f5786b));
        }
        return K3;
    }

    public static int B(byte[] bArr, int i3, a aVar) {
        int H3 = H(bArr, i3, aVar);
        int i4 = aVar.f5785a;
        if (i4 < 0) {
            throw A.g();
        }
        if (i4 == 0) {
            aVar.f5787c = "";
            return H3;
        }
        aVar.f5787c = new String(bArr, H3, i4, AbstractC0434z.f6009b);
        return H3 + i4;
    }

    public static int C(int i3, byte[] bArr, int i4, int i5, AbstractC0434z.d dVar, a aVar) {
        int H3 = H(bArr, i4, aVar);
        int i6 = aVar.f5785a;
        if (i6 < 0) {
            throw A.g();
        }
        if (i6 == 0) {
            dVar.add("");
        } else {
            dVar.add(new String(bArr, H3, i6, AbstractC0434z.f6009b));
            H3 += i6;
        }
        while (H3 < i5) {
            int H4 = H(bArr, H3, aVar);
            if (i3 != aVar.f5785a) {
                break;
            }
            H3 = H(bArr, H4, aVar);
            int i7 = aVar.f5785a;
            if (i7 < 0) {
                throw A.g();
            }
            if (i7 == 0) {
                dVar.add("");
            } else {
                dVar.add(new String(bArr, H3, i7, AbstractC0434z.f6009b));
                H3 += i7;
            }
        }
        return H3;
    }

    public static int D(int i3, byte[] bArr, int i4, int i5, AbstractC0434z.d dVar, a aVar) {
        int H3 = H(bArr, i4, aVar);
        int i6 = aVar.f5785a;
        if (i6 < 0) {
            throw A.g();
        }
        if (i6 == 0) {
            dVar.add("");
        } else {
            int i7 = H3 + i6;
            if (!p0.n(bArr, H3, i7)) {
                throw A.d();
            }
            dVar.add(new String(bArr, H3, i6, AbstractC0434z.f6009b));
            H3 = i7;
        }
        while (H3 < i5) {
            int H4 = H(bArr, H3, aVar);
            if (i3 != aVar.f5785a) {
                break;
            }
            H3 = H(bArr, H4, aVar);
            int i8 = aVar.f5785a;
            if (i8 < 0) {
                throw A.g();
            }
            if (i8 == 0) {
                dVar.add("");
            } else {
                int i9 = H3 + i8;
                if (!p0.n(bArr, H3, i9)) {
                    throw A.d();
                }
                dVar.add(new String(bArr, H3, i8, AbstractC0434z.f6009b));
                H3 = i9;
            }
        }
        return H3;
    }

    public static int E(byte[] bArr, int i3, a aVar) {
        int H3 = H(bArr, i3, aVar);
        int i4 = aVar.f5785a;
        if (i4 < 0) {
            throw A.g();
        }
        if (i4 == 0) {
            aVar.f5787c = "";
            return H3;
        }
        aVar.f5787c = p0.e(bArr, H3, i4);
        return H3 + i4;
    }

    public static int F(int i3, byte[] bArr, int i4, int i5, l0 l0Var, a aVar) {
        if (q0.a(i3) == 0) {
            throw A.c();
        }
        int b3 = q0.b(i3);
        if (b3 == 0) {
            int K3 = K(bArr, i4, aVar);
            l0Var.n(i3, Long.valueOf(aVar.f5786b));
            return K3;
        }
        if (b3 == 1) {
            l0Var.n(i3, Long.valueOf(i(bArr, i4)));
            return i4 + 8;
        }
        if (b3 == 2) {
            int H3 = H(bArr, i4, aVar);
            int i6 = aVar.f5785a;
            if (i6 < 0) {
                throw A.g();
            }
            if (i6 > bArr.length - H3) {
                throw A.m();
            }
            if (i6 == 0) {
                l0Var.n(i3, AbstractC0417h.f5793f);
            } else {
                l0Var.n(i3, AbstractC0417h.n(bArr, H3, i6));
            }
            return H3 + i6;
        }
        if (b3 != 3) {
            if (b3 != 5) {
                throw A.c();
            }
            l0Var.n(i3, Integer.valueOf(g(bArr, i4)));
            return i4 + 4;
        }
        l0 k3 = l0.k();
        int i7 = (i3 & (-8)) | 4;
        int i8 = 0;
        while (true) {
            if (i4 >= i5) {
                break;
            }
            int H4 = H(bArr, i4, aVar);
            i8 = aVar.f5785a;
            if (i8 == i7) {
                i4 = H4;
                break;
            }
            i4 = F(i8, bArr, H4, i5, k3, aVar);
        }
        if (i4 > i5 || i8 != i7) {
            throw A.h();
        }
        l0Var.n(i3, k3);
        return i4;
    }

    public static int G(int i3, byte[] bArr, int i4, a aVar) {
        int i5 = i3 & 127;
        int i6 = i4 + 1;
        byte b3 = bArr[i4];
        if (b3 >= 0) {
            aVar.f5785a = i5 | (b3 << 7);
            return i6;
        }
        int i7 = i5 | ((b3 & Byte.MAX_VALUE) << 7);
        int i8 = i4 + 2;
        byte b4 = bArr[i6];
        if (b4 >= 0) {
            aVar.f5785a = i7 | (b4 << 14);
            return i8;
        }
        int i9 = i7 | ((b4 & Byte.MAX_VALUE) << 14);
        int i10 = i4 + 3;
        byte b5 = bArr[i8];
        if (b5 >= 0) {
            aVar.f5785a = i9 | (b5 << 21);
            return i10;
        }
        int i11 = i9 | ((b5 & Byte.MAX_VALUE) << 21);
        int i12 = i4 + 4;
        byte b6 = bArr[i10];
        if (b6 >= 0) {
            aVar.f5785a = i11 | (b6 << 28);
            return i12;
        }
        int i13 = i11 | ((b6 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i14 = i12 + 1;
            if (bArr[i12] >= 0) {
                aVar.f5785a = i13;
                return i14;
            }
            i12 = i14;
        }
    }

    public static int H(byte[] bArr, int i3, a aVar) {
        int i4 = i3 + 1;
        byte b3 = bArr[i3];
        if (b3 < 0) {
            return G(b3, bArr, i4, aVar);
        }
        aVar.f5785a = b3;
        return i4;
    }

    public static int I(int i3, byte[] bArr, int i4, int i5, AbstractC0434z.d dVar, a aVar) {
        AbstractC0433y abstractC0433y = (AbstractC0433y) dVar;
        int H3 = H(bArr, i4, aVar);
        abstractC0433y.j(aVar.f5785a);
        while (H3 < i5) {
            int H4 = H(bArr, H3, aVar);
            if (i3 != aVar.f5785a) {
                break;
            }
            H3 = H(bArr, H4, aVar);
            abstractC0433y.j(aVar.f5785a);
        }
        return H3;
    }

    public static int J(long j3, byte[] bArr, int i3, a aVar) {
        int i4 = i3 + 1;
        byte b3 = bArr[i3];
        long j4 = (j3 & 127) | ((b3 & Byte.MAX_VALUE) << 7);
        int i5 = 7;
        while (b3 < 0) {
            int i6 = i4 + 1;
            byte b4 = bArr[i4];
            i5 += 7;
            j4 |= (b4 & Byte.MAX_VALUE) << i5;
            i4 = i6;
            b3 = b4;
        }
        aVar.f5786b = j4;
        return i4;
    }

    public static int K(byte[] bArr, int i3, a aVar) {
        int i4 = i3 + 1;
        long j3 = bArr[i3];
        if (j3 < 0) {
            return J(j3, bArr, i4, aVar);
        }
        aVar.f5786b = j3;
        return i4;
    }

    public static int L(int i3, byte[] bArr, int i4, int i5, AbstractC0434z.d dVar, a aVar) {
        F f3 = (F) dVar;
        int K3 = K(bArr, i4, aVar);
        f3.j(aVar.f5786b);
        while (K3 < i5) {
            int H3 = H(bArr, K3, aVar);
            if (i3 != aVar.f5785a) {
                break;
            }
            K3 = K(bArr, H3, aVar);
            f3.j(aVar.f5786b);
        }
        return K3;
    }

    public static int M(Object obj, e0 e0Var, byte[] bArr, int i3, int i4, int i5, a aVar) {
        int f02 = ((S) e0Var).f0(obj, bArr, i3, i4, i5, aVar);
        aVar.f5787c = obj;
        return f02;
    }

    public static int N(Object obj, e0 e0Var, byte[] bArr, int i3, int i4, a aVar) {
        int i5 = i3 + 1;
        int i6 = bArr[i3];
        if (i6 < 0) {
            i5 = G(i6, bArr, i5, aVar);
            i6 = aVar.f5785a;
        }
        int i7 = i5;
        if (i6 < 0 || i6 > i4 - i7) {
            throw A.m();
        }
        int i8 = i7 + i6;
        e0Var.h(obj, bArr, i7, i8, aVar);
        aVar.f5787c = obj;
        return i8;
    }

    public static int a(int i3, byte[] bArr, int i4, int i5, AbstractC0434z.d dVar, a aVar) {
        AbstractC0415f abstractC0415f = (AbstractC0415f) dVar;
        int K3 = K(bArr, i4, aVar);
        abstractC0415f.j(aVar.f5786b != 0);
        while (K3 < i5) {
            int H3 = H(bArr, K3, aVar);
            if (i3 != aVar.f5785a) {
                break;
            }
            K3 = K(bArr, H3, aVar);
            abstractC0415f.j(aVar.f5786b != 0);
        }
        return K3;
    }

    public static int b(byte[] bArr, int i3, a aVar) {
        int H3 = H(bArr, i3, aVar);
        int i4 = aVar.f5785a;
        if (i4 < 0) {
            throw A.g();
        }
        if (i4 > bArr.length - H3) {
            throw A.m();
        }
        if (i4 == 0) {
            aVar.f5787c = AbstractC0417h.f5793f;
            return H3;
        }
        aVar.f5787c = AbstractC0417h.n(bArr, H3, i4);
        return H3 + i4;
    }

    public static int c(int i3, byte[] bArr, int i4, int i5, AbstractC0434z.d dVar, a aVar) {
        int H3 = H(bArr, i4, aVar);
        int i6 = aVar.f5785a;
        if (i6 < 0) {
            throw A.g();
        }
        if (i6 > bArr.length - H3) {
            throw A.m();
        }
        if (i6 == 0) {
            dVar.add(AbstractC0417h.f5793f);
        } else {
            dVar.add(AbstractC0417h.n(bArr, H3, i6));
            H3 += i6;
        }
        while (H3 < i5) {
            int H4 = H(bArr, H3, aVar);
            if (i3 != aVar.f5785a) {
                break;
            }
            H3 = H(bArr, H4, aVar);
            int i7 = aVar.f5785a;
            if (i7 < 0) {
                throw A.g();
            }
            if (i7 > bArr.length - H3) {
                throw A.m();
            }
            if (i7 == 0) {
                dVar.add(AbstractC0417h.f5793f);
            } else {
                dVar.add(AbstractC0417h.n(bArr, H3, i7));
                H3 += i7;
            }
        }
        return H3;
    }

    public static double d(byte[] bArr, int i3) {
        return Double.longBitsToDouble(i(bArr, i3));
    }

    public static int e(int i3, byte[] bArr, int i4, int i5, AbstractC0434z.d dVar, a aVar) {
        AbstractC0422m abstractC0422m = (AbstractC0422m) dVar;
        abstractC0422m.j(d(bArr, i4));
        int i6 = i4 + 8;
        while (i6 < i5) {
            int H3 = H(bArr, i6, aVar);
            if (i3 != aVar.f5785a) {
                break;
            }
            abstractC0422m.j(d(bArr, H3));
            i6 = H3 + 8;
        }
        return i6;
    }

    public static int f(int i3, byte[] bArr, int i4, int i5, Object obj, O o3, k0 k0Var, a aVar) {
        aVar.f5788d.a(o3, i3 >>> 3);
        return F(i3, bArr, i4, i5, S.v(obj), aVar);
    }

    public static int g(byte[] bArr, int i3) {
        return ((bArr[i3 + 3] & 255) << 24) | (bArr[i3] & 255) | ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3 + 2] & 255) << 16);
    }

    public static int h(int i3, byte[] bArr, int i4, int i5, AbstractC0434z.d dVar, a aVar) {
        AbstractC0433y abstractC0433y = (AbstractC0433y) dVar;
        abstractC0433y.j(g(bArr, i4));
        int i6 = i4 + 4;
        while (i6 < i5) {
            int H3 = H(bArr, i6, aVar);
            if (i3 != aVar.f5785a) {
                break;
            }
            abstractC0433y.j(g(bArr, H3));
            i6 = H3 + 4;
        }
        return i6;
    }

    public static long i(byte[] bArr, int i3) {
        return ((bArr[i3 + 7] & 255) << 56) | (bArr[i3] & 255) | ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3 + 2] & 255) << 16) | ((bArr[i3 + 3] & 255) << 24) | ((bArr[i3 + 4] & 255) << 32) | ((bArr[i3 + 5] & 255) << 40) | ((bArr[i3 + 6] & 255) << 48);
    }

    public static int j(int i3, byte[] bArr, int i4, int i5, AbstractC0434z.d dVar, a aVar) {
        F f3 = (F) dVar;
        f3.j(i(bArr, i4));
        int i6 = i4 + 8;
        while (i6 < i5) {
            int H3 = H(bArr, i6, aVar);
            if (i3 != aVar.f5785a) {
                break;
            }
            f3.j(i(bArr, H3));
            i6 = H3 + 8;
        }
        return i6;
    }

    public static float k(byte[] bArr, int i3) {
        return Float.intBitsToFloat(g(bArr, i3));
    }

    public static int l(int i3, byte[] bArr, int i4, int i5, AbstractC0434z.d dVar, a aVar) {
        AbstractC0430v abstractC0430v = (AbstractC0430v) dVar;
        abstractC0430v.j(k(bArr, i4));
        int i6 = i4 + 4;
        while (i6 < i5) {
            int H3 = H(bArr, i6, aVar);
            if (i3 != aVar.f5785a) {
                break;
            }
            abstractC0430v.j(k(bArr, H3));
            i6 = H3 + 4;
        }
        return i6;
    }

    public static int m(e0 e0Var, byte[] bArr, int i3, int i4, int i5, a aVar) {
        Object e3 = e0Var.e();
        int M3 = M(e3, e0Var, bArr, i3, i4, i5, aVar);
        e0Var.f(e3);
        aVar.f5787c = e3;
        return M3;
    }

    public static int n(e0 e0Var, int i3, byte[] bArr, int i4, int i5, AbstractC0434z.d dVar, a aVar) {
        int i6 = (i3 & (-8)) | 4;
        int m3 = m(e0Var, bArr, i4, i5, i6, aVar);
        dVar.add(aVar.f5787c);
        while (m3 < i5) {
            int H3 = H(bArr, m3, aVar);
            if (i3 != aVar.f5785a) {
                break;
            }
            m3 = m(e0Var, bArr, H3, i5, i6, aVar);
            dVar.add(aVar.f5787c);
        }
        return m3;
    }

    public static int o(e0 e0Var, byte[] bArr, int i3, int i4, a aVar) {
        Object e3 = e0Var.e();
        int N3 = N(e3, e0Var, bArr, i3, i4, aVar);
        e0Var.f(e3);
        aVar.f5787c = e3;
        return N3;
    }

    public static int p(e0 e0Var, int i3, byte[] bArr, int i4, int i5, AbstractC0434z.d dVar, a aVar) {
        int o3 = o(e0Var, bArr, i4, i5, aVar);
        dVar.add(aVar.f5787c);
        while (o3 < i5) {
            int H3 = H(bArr, o3, aVar);
            if (i3 != aVar.f5785a) {
                break;
            }
            o3 = o(e0Var, bArr, H3, i5, aVar);
            dVar.add(aVar.f5787c);
        }
        return o3;
    }

    public static int q(byte[] bArr, int i3, AbstractC0434z.d dVar, a aVar) {
        AbstractC0415f abstractC0415f = (AbstractC0415f) dVar;
        int H3 = H(bArr, i3, aVar);
        int i4 = aVar.f5785a + H3;
        while (H3 < i4) {
            H3 = K(bArr, H3, aVar);
            abstractC0415f.j(aVar.f5786b != 0);
        }
        if (H3 == i4) {
            return H3;
        }
        throw A.m();
    }

    public static int r(byte[] bArr, int i3, AbstractC0434z.d dVar, a aVar) {
        AbstractC0422m abstractC0422m = (AbstractC0422m) dVar;
        int H3 = H(bArr, i3, aVar);
        int i4 = aVar.f5785a + H3;
        while (H3 < i4) {
            abstractC0422m.j(d(bArr, H3));
            H3 += 8;
        }
        if (H3 == i4) {
            return H3;
        }
        throw A.m();
    }

    public static int s(byte[] bArr, int i3, AbstractC0434z.d dVar, a aVar) {
        AbstractC0433y abstractC0433y = (AbstractC0433y) dVar;
        int H3 = H(bArr, i3, aVar);
        int i4 = aVar.f5785a + H3;
        while (H3 < i4) {
            abstractC0433y.j(g(bArr, H3));
            H3 += 4;
        }
        if (H3 == i4) {
            return H3;
        }
        throw A.m();
    }

    public static int t(byte[] bArr, int i3, AbstractC0434z.d dVar, a aVar) {
        F f3 = (F) dVar;
        int H3 = H(bArr, i3, aVar);
        int i4 = aVar.f5785a + H3;
        while (H3 < i4) {
            f3.j(i(bArr, H3));
            H3 += 8;
        }
        if (H3 == i4) {
            return H3;
        }
        throw A.m();
    }

    public static int u(byte[] bArr, int i3, AbstractC0434z.d dVar, a aVar) {
        AbstractC0430v abstractC0430v = (AbstractC0430v) dVar;
        int H3 = H(bArr, i3, aVar);
        int i4 = aVar.f5785a + H3;
        while (H3 < i4) {
            abstractC0430v.j(k(bArr, H3));
            H3 += 4;
        }
        if (H3 == i4) {
            return H3;
        }
        throw A.m();
    }

    public static int v(byte[] bArr, int i3, AbstractC0434z.d dVar, a aVar) {
        AbstractC0433y abstractC0433y = (AbstractC0433y) dVar;
        int H3 = H(bArr, i3, aVar);
        int i4 = aVar.f5785a + H3;
        while (H3 < i4) {
            H3 = H(bArr, H3, aVar);
            abstractC0433y.j(AbstractC0418i.b(aVar.f5785a));
        }
        if (H3 == i4) {
            return H3;
        }
        throw A.m();
    }

    public static int w(byte[] bArr, int i3, AbstractC0434z.d dVar, a aVar) {
        F f3 = (F) dVar;
        int H3 = H(bArr, i3, aVar);
        int i4 = aVar.f5785a + H3;
        while (H3 < i4) {
            H3 = K(bArr, H3, aVar);
            f3.j(AbstractC0418i.c(aVar.f5786b));
        }
        if (H3 == i4) {
            return H3;
        }
        throw A.m();
    }

    public static int x(byte[] bArr, int i3, AbstractC0434z.d dVar, a aVar) {
        AbstractC0433y abstractC0433y = (AbstractC0433y) dVar;
        int H3 = H(bArr, i3, aVar);
        int i4 = aVar.f5785a + H3;
        while (H3 < i4) {
            H3 = H(bArr, H3, aVar);
            abstractC0433y.j(aVar.f5785a);
        }
        if (H3 == i4) {
            return H3;
        }
        throw A.m();
    }

    public static int y(byte[] bArr, int i3, AbstractC0434z.d dVar, a aVar) {
        F f3 = (F) dVar;
        int H3 = H(bArr, i3, aVar);
        int i4 = aVar.f5785a + H3;
        while (H3 < i4) {
            H3 = K(bArr, H3, aVar);
            f3.j(aVar.f5786b);
        }
        if (H3 == i4) {
            return H3;
        }
        throw A.m();
    }

    public static int z(int i3, byte[] bArr, int i4, int i5, AbstractC0434z.d dVar, a aVar) {
        AbstractC0433y abstractC0433y = (AbstractC0433y) dVar;
        int H3 = H(bArr, i4, aVar);
        abstractC0433y.j(AbstractC0418i.b(aVar.f5785a));
        while (H3 < i5) {
            int H4 = H(bArr, H3, aVar);
            if (i3 != aVar.f5785a) {
                break;
            }
            H3 = H(bArr, H4, aVar);
            abstractC0433y.j(AbstractC0418i.b(aVar.f5785a));
        }
        return H3;
    }
}
