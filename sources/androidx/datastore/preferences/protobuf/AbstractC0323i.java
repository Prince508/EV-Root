package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.k0;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: androidx.datastore.preferences.protobuf.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0323i extends AbstractC0319e {

    /* renamed from: c, reason: collision with root package name */
    public static final Logger f3669c = Logger.getLogger(AbstractC0323i.class.getName());

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f3670d = j0.C();

    /* renamed from: a, reason: collision with root package name */
    public C0324j f3671a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3672b;

    /* renamed from: androidx.datastore.preferences.protobuf.i$b */
    public static abstract class b extends AbstractC0323i {

        /* renamed from: e, reason: collision with root package name */
        public final byte[] f3673e;

        /* renamed from: f, reason: collision with root package name */
        public final int f3674f;

        /* renamed from: g, reason: collision with root package name */
        public int f3675g;

        /* renamed from: h, reason: collision with root package name */
        public int f3676h;

        public b(int i3) {
            super();
            if (i3 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i3, 20)];
            this.f3673e = bArr;
            this.f3674f = bArr.length;
        }

        public final void S0(byte b3) {
            byte[] bArr = this.f3673e;
            int i3 = this.f3675g;
            this.f3675g = i3 + 1;
            bArr[i3] = b3;
            this.f3676h++;
        }

        public final void T0(int i3) {
            byte[] bArr = this.f3673e;
            int i4 = this.f3675g;
            int i5 = i4 + 1;
            this.f3675g = i5;
            bArr[i4] = (byte) (i3 & 255);
            int i6 = i4 + 2;
            this.f3675g = i6;
            bArr[i5] = (byte) ((i3 >> 8) & 255);
            int i7 = i4 + 3;
            this.f3675g = i7;
            bArr[i6] = (byte) ((i3 >> 16) & 255);
            this.f3675g = i4 + 4;
            bArr[i7] = (byte) ((i3 >> 24) & 255);
            this.f3676h += 4;
        }

        public final void U0(long j3) {
            byte[] bArr = this.f3673e;
            int i3 = this.f3675g;
            int i4 = i3 + 1;
            this.f3675g = i4;
            bArr[i3] = (byte) (j3 & 255);
            int i5 = i3 + 2;
            this.f3675g = i5;
            bArr[i4] = (byte) ((j3 >> 8) & 255);
            int i6 = i3 + 3;
            this.f3675g = i6;
            bArr[i5] = (byte) ((j3 >> 16) & 255);
            int i7 = i3 + 4;
            this.f3675g = i7;
            bArr[i6] = (byte) (255 & (j3 >> 24));
            int i8 = i3 + 5;
            this.f3675g = i8;
            bArr[i7] = (byte) (((int) (j3 >> 32)) & 255);
            int i9 = i3 + 6;
            this.f3675g = i9;
            bArr[i8] = (byte) (((int) (j3 >> 40)) & 255);
            int i10 = i3 + 7;
            this.f3675g = i10;
            bArr[i9] = (byte) (((int) (j3 >> 48)) & 255);
            this.f3675g = i3 + 8;
            bArr[i10] = (byte) (((int) (j3 >> 56)) & 255);
            this.f3676h += 8;
        }

        public final void V0(int i3) {
            if (i3 >= 0) {
                X0(i3);
            } else {
                Y0(i3);
            }
        }

        public final void W0(int i3, int i4) {
            X0(l0.c(i3, i4));
        }

        public final void X0(int i3) {
            if (!AbstractC0323i.f3670d) {
                while ((i3 & (-128)) != 0) {
                    byte[] bArr = this.f3673e;
                    int i4 = this.f3675g;
                    this.f3675g = i4 + 1;
                    bArr[i4] = (byte) ((i3 & 127) | 128);
                    this.f3676h++;
                    i3 >>>= 7;
                }
                byte[] bArr2 = this.f3673e;
                int i5 = this.f3675g;
                this.f3675g = i5 + 1;
                bArr2[i5] = (byte) i3;
                this.f3676h++;
                return;
            }
            long j3 = this.f3675g;
            while ((i3 & (-128)) != 0) {
                byte[] bArr3 = this.f3673e;
                int i6 = this.f3675g;
                this.f3675g = i6 + 1;
                j0.H(bArr3, i6, (byte) ((i3 & 127) | 128));
                i3 >>>= 7;
            }
            byte[] bArr4 = this.f3673e;
            int i7 = this.f3675g;
            this.f3675g = i7 + 1;
            j0.H(bArr4, i7, (byte) i3);
            this.f3676h += (int) (this.f3675g - j3);
        }

        public final void Y0(long j3) {
            if (!AbstractC0323i.f3670d) {
                while ((j3 & (-128)) != 0) {
                    byte[] bArr = this.f3673e;
                    int i3 = this.f3675g;
                    this.f3675g = i3 + 1;
                    bArr[i3] = (byte) ((((int) j3) & 127) | 128);
                    this.f3676h++;
                    j3 >>>= 7;
                }
                byte[] bArr2 = this.f3673e;
                int i4 = this.f3675g;
                this.f3675g = i4 + 1;
                bArr2[i4] = (byte) j3;
                this.f3676h++;
                return;
            }
            long j4 = this.f3675g;
            while ((j3 & (-128)) != 0) {
                byte[] bArr3 = this.f3673e;
                int i5 = this.f3675g;
                this.f3675g = i5 + 1;
                j0.H(bArr3, i5, (byte) ((((int) j3) & 127) | 128));
                j3 >>>= 7;
            }
            byte[] bArr4 = this.f3673e;
            int i6 = this.f3675g;
            this.f3675g = i6 + 1;
            j0.H(bArr4, i6, (byte) j3);
            this.f3676h += (int) (this.f3675g - j4);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.i$c */
    public static class c extends IOException {
        public c(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.i$d */
    public static final class d extends b {

        /* renamed from: i, reason: collision with root package name */
        public final OutputStream f3677i;

        public d(OutputStream outputStream, int i3) {
            super(i3);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.f3677i = outputStream;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0323i
        public void A0(J j3) {
            P0(j3.a());
            j3.f(this);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0323i
        public void B0(int i3, J j3) {
            N0(1, 3);
            O0(2, i3);
            c1(3, j3);
            N0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0323i
        public void C0(int i3, AbstractC0320f abstractC0320f) {
            N0(1, 3);
            O0(2, i3);
            f0(3, abstractC0320f);
            N0(1, 4);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0323i
        public void L0(int i3, String str) {
            N0(i3, 2);
            M0(str);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0323i
        public void M0(String str) {
            int g3;
            try {
                int length = str.length() * 3;
                int R3 = AbstractC0323i.R(length);
                int i3 = R3 + length;
                int i4 = this.f3674f;
                if (i3 > i4) {
                    byte[] bArr = new byte[length];
                    int f3 = k0.f(str, bArr, 0, length);
                    P0(f3);
                    a(bArr, 0, f3);
                    return;
                }
                if (i3 > i4 - this.f3675g) {
                    Z0();
                }
                int R4 = AbstractC0323i.R(str.length());
                int i5 = this.f3675g;
                try {
                    if (R4 == R3) {
                        int i6 = i5 + R4;
                        this.f3675g = i6;
                        int f4 = k0.f(str, this.f3673e, i6, this.f3674f - i6);
                        this.f3675g = i5;
                        g3 = (f4 - i5) - R4;
                        X0(g3);
                        this.f3675g = f4;
                    } else {
                        g3 = k0.g(str);
                        X0(g3);
                        this.f3675g = k0.f(str, this.f3673e, this.f3675g, g3);
                    }
                    this.f3676h += g3;
                } catch (k0.d e3) {
                    this.f3676h -= this.f3675g - i5;
                    this.f3675g = i5;
                    throw e3;
                } catch (ArrayIndexOutOfBoundsException e4) {
                    throw new c(e4);
                }
            } catch (k0.d e5) {
                X(str, e5);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0323i
        public void N0(int i3, int i4) {
            P0(l0.c(i3, i4));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0323i
        public void O0(int i3, int i4) {
            a1(20);
            W0(i3, 0);
            X0(i4);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0323i
        public void P0(int i3) {
            a1(5);
            X0(i3);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0323i
        public void Q0(int i3, long j3) {
            a1(20);
            W0(i3, 0);
            Y0(j3);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0323i
        public void R0(long j3) {
            a1(10);
            Y0(j3);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0323i
        public void W() {
            if (this.f3675g > 0) {
                Z0();
            }
        }

        public final void Z0() {
            this.f3677i.write(this.f3673e, 0, this.f3675g);
            this.f3675g = 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0323i, androidx.datastore.preferences.protobuf.AbstractC0319e
        public void a(byte[] bArr, int i3, int i4) {
            b1(bArr, i3, i4);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0323i
        public void a0(byte b3) {
            if (this.f3675g == this.f3674f) {
                Z0();
            }
            S0(b3);
        }

        public final void a1(int i3) {
            if (this.f3674f - this.f3675g < i3) {
                Z0();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0323i
        public void b0(int i3, boolean z3) {
            a1(11);
            W0(i3, 0);
            S0(z3 ? (byte) 1 : (byte) 0);
        }

        public void b1(byte[] bArr, int i3, int i4) {
            int i5 = this.f3674f;
            int i6 = this.f3675g;
            if (i5 - i6 >= i4) {
                System.arraycopy(bArr, i3, this.f3673e, i6, i4);
                this.f3675g += i4;
                this.f3676h += i4;
                return;
            }
            int i7 = i5 - i6;
            System.arraycopy(bArr, i3, this.f3673e, i6, i7);
            int i8 = i3 + i7;
            int i9 = i4 - i7;
            this.f3675g = this.f3674f;
            this.f3676h += i7;
            Z0();
            if (i9 <= this.f3674f) {
                System.arraycopy(bArr, i8, this.f3673e, 0, i9);
                this.f3675g = i9;
            } else {
                this.f3677i.write(bArr, i8, i9);
            }
            this.f3676h += i9;
        }

        public void c1(int i3, J j3) {
            N0(i3, 2);
            A0(j3);
        }

        public void d1(J j3, Y y3) {
            P0(((AbstractC0315a) j3).j(y3));
            y3.i(j3, this.f3671a);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0323i
        public void e0(byte[] bArr, int i3, int i4) {
            P0(i4);
            b1(bArr, i3, i4);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0323i
        public void f0(int i3, AbstractC0320f abstractC0320f) {
            N0(i3, 2);
            g0(abstractC0320f);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0323i
        public void g0(AbstractC0320f abstractC0320f) {
            P0(abstractC0320f.size());
            abstractC0320f.B(this);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0323i
        public void l0(int i3, int i4) {
            a1(14);
            W0(i3, 5);
            T0(i4);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0323i
        public void m0(int i3) {
            a1(4);
            T0(i3);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0323i
        public void n0(int i3, long j3) {
            a1(18);
            W0(i3, 1);
            U0(j3);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0323i
        public void o0(long j3) {
            a1(8);
            U0(j3);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0323i
        public void v0(int i3, int i4) {
            a1(20);
            W0(i3, 0);
            V0(i4);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0323i
        public void w0(int i3) {
            if (i3 >= 0) {
                P0(i3);
            } else {
                R0(i3);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0323i
        public void z0(int i3, J j3, Y y3) {
            N0(i3, 2);
            d1(j3, y3);
        }
    }

    public static int A(J j3) {
        return y(j3.a());
    }

    public static int B(J j3, Y y3) {
        return y(((AbstractC0315a) j3).j(y3));
    }

    public static int C(int i3) {
        if (i3 > 4096) {
            return 4096;
        }
        return i3;
    }

    public static int D(int i3, AbstractC0320f abstractC0320f) {
        return (P(1) * 2) + Q(2, i3) + f(3, abstractC0320f);
    }

    public static int E(int i3) {
        return R(i3);
    }

    public static int F(int i3, int i4) {
        return P(i3) + G(i4);
    }

    public static int G(int i3) {
        return 4;
    }

    public static int H(int i3, long j3) {
        return P(i3) + I(j3);
    }

    public static int I(long j3) {
        return 8;
    }

    public static int J(int i3, int i4) {
        return P(i3) + K(i4);
    }

    public static int K(int i3) {
        return R(U(i3));
    }

    public static int L(int i3, long j3) {
        return P(i3) + M(j3);
    }

    public static int M(long j3) {
        return T(V(j3));
    }

    public static int N(int i3, String str) {
        return P(i3) + O(str);
    }

    public static int O(String str) {
        int length;
        try {
            length = k0.g(str);
        } catch (k0.d unused) {
            length = str.getBytes(AbstractC0334u.f3847a).length;
        }
        return y(length);
    }

    public static int P(int i3) {
        return R(l0.c(i3, 0));
    }

    public static int Q(int i3, int i4) {
        return P(i3) + R(i4);
    }

    public static int R(int i3) {
        if ((i3 & (-128)) == 0) {
            return 1;
        }
        if ((i3 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i3) == 0) {
            return 3;
        }
        return (i3 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int S(int i3, long j3) {
        return P(i3) + T(j3);
    }

    public static int T(long j3) {
        int i3;
        if (((-128) & j3) == 0) {
            return 1;
        }
        if (j3 < 0) {
            return 10;
        }
        if (((-34359738368L) & j3) != 0) {
            j3 >>>= 28;
            i3 = 6;
        } else {
            i3 = 2;
        }
        if (((-2097152) & j3) != 0) {
            i3 += 2;
            j3 >>>= 14;
        }
        return (j3 & (-16384)) != 0 ? i3 + 1 : i3;
    }

    public static int U(int i3) {
        return (i3 >> 31) ^ (i3 << 1);
    }

    public static long V(long j3) {
        return (j3 >> 63) ^ (j3 << 1);
    }

    public static AbstractC0323i Z(OutputStream outputStream, int i3) {
        return new d(outputStream, i3);
    }

    public static int c(int i3, boolean z3) {
        return P(i3) + d(z3);
    }

    public static int d(boolean z3) {
        return 1;
    }

    public static int e(byte[] bArr) {
        return y(bArr.length);
    }

    public static int f(int i3, AbstractC0320f abstractC0320f) {
        return P(i3) + g(abstractC0320f);
    }

    public static int g(AbstractC0320f abstractC0320f) {
        return y(abstractC0320f.size());
    }

    public static int h(int i3, double d3) {
        return P(i3) + i(d3);
    }

    public static int i(double d3) {
        return 8;
    }

    public static int j(int i3, int i4) {
        return P(i3) + k(i4);
    }

    public static int k(int i3) {
        return v(i3);
    }

    public static int l(int i3, int i4) {
        return P(i3) + m(i4);
    }

    public static int m(int i3) {
        return 4;
    }

    public static int n(int i3, long j3) {
        return P(i3) + o(j3);
    }

    public static int o(long j3) {
        return 8;
    }

    public static int p(int i3, float f3) {
        return P(i3) + q(f3);
    }

    public static int q(float f3) {
        return 4;
    }

    public static int r(int i3, J j3, Y y3) {
        return (P(i3) * 2) + t(j3, y3);
    }

    public static int s(J j3) {
        return j3.a();
    }

    public static int t(J j3, Y y3) {
        return ((AbstractC0315a) j3).j(y3);
    }

    public static int u(int i3, int i4) {
        return P(i3) + v(i4);
    }

    public static int v(int i3) {
        if (i3 >= 0) {
            return R(i3);
        }
        return 10;
    }

    public static int w(int i3, long j3) {
        return P(i3) + x(j3);
    }

    public static int x(long j3) {
        return T(j3);
    }

    public static int y(int i3) {
        return R(i3) + i3;
    }

    public static int z(int i3, J j3, Y y3) {
        return P(i3) + B(j3, y3);
    }

    public abstract void A0(J j3);

    public abstract void B0(int i3, J j3);

    public abstract void C0(int i3, AbstractC0320f abstractC0320f);

    public final void D0(int i3, int i4) {
        l0(i3, i4);
    }

    public final void E0(int i3) {
        m0(i3);
    }

    public final void F0(int i3, long j3) {
        n0(i3, j3);
    }

    public final void G0(long j3) {
        o0(j3);
    }

    public final void H0(int i3, int i4) {
        O0(i3, U(i4));
    }

    public final void I0(int i3) {
        P0(U(i3));
    }

    public final void J0(int i3, long j3) {
        Q0(i3, V(j3));
    }

    public final void K0(long j3) {
        R0(V(j3));
    }

    public abstract void L0(int i3, String str);

    public abstract void M0(String str);

    public abstract void N0(int i3, int i4);

    public abstract void O0(int i3, int i4);

    public abstract void P0(int i3);

    public abstract void Q0(int i3, long j3);

    public abstract void R0(long j3);

    public abstract void W();

    public final void X(String str, k0.d dVar) {
        f3669c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(AbstractC0334u.f3847a);
        try {
            P0(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (c e3) {
            throw e3;
        } catch (IndexOutOfBoundsException e4) {
            throw new c(e4);
        }
    }

    public boolean Y() {
        return this.f3672b;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0319e
    public abstract void a(byte[] bArr, int i3, int i4);

    public abstract void a0(byte b3);

    public abstract void b0(int i3, boolean z3);

    public final void c0(boolean z3) {
        a0(z3 ? (byte) 1 : (byte) 0);
    }

    public final void d0(byte[] bArr) {
        e0(bArr, 0, bArr.length);
    }

    public abstract void e0(byte[] bArr, int i3, int i4);

    public abstract void f0(int i3, AbstractC0320f abstractC0320f);

    public abstract void g0(AbstractC0320f abstractC0320f);

    public final void h0(int i3, double d3) {
        n0(i3, Double.doubleToRawLongBits(d3));
    }

    public final void i0(double d3) {
        o0(Double.doubleToRawLongBits(d3));
    }

    public final void j0(int i3, int i4) {
        v0(i3, i4);
    }

    public final void k0(int i3) {
        w0(i3);
    }

    public abstract void l0(int i3, int i4);

    public abstract void m0(int i3);

    public abstract void n0(int i3, long j3);

    public abstract void o0(long j3);

    public final void p0(int i3, float f3) {
        l0(i3, Float.floatToRawIntBits(f3));
    }

    public final void q0(float f3) {
        m0(Float.floatToRawIntBits(f3));
    }

    public final void r0(int i3, J j3) {
        N0(i3, 3);
        t0(j3);
        N0(i3, 4);
    }

    public final void s0(int i3, J j3, Y y3) {
        N0(i3, 3);
        u0(j3, y3);
        N0(i3, 4);
    }

    public final void t0(J j3) {
        j3.f(this);
    }

    public final void u0(J j3, Y y3) {
        y3.i(j3, this.f3671a);
    }

    public abstract void v0(int i3, int i4);

    public abstract void w0(int i3);

    public final void x0(int i3, long j3) {
        Q0(i3, j3);
    }

    public final void y0(long j3) {
        R0(j3);
    }

    public abstract void z0(int i3, J j3, Y y3);

    public AbstractC0323i() {
    }
}
