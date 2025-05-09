package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.p0;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.crypto.tink.shaded.protobuf.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0420k extends AbstractC0416g {

    /* renamed from: c, reason: collision with root package name */
    public static final Logger f5834c = Logger.getLogger(AbstractC0420k.class.getName());

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f5835d = o0.E();

    /* renamed from: a, reason: collision with root package name */
    public C0421l f5836a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5837b;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.k$b */
    public static class b extends AbstractC0420k {

        /* renamed from: e, reason: collision with root package name */
        public final byte[] f5838e;

        /* renamed from: f, reason: collision with root package name */
        public final int f5839f;

        /* renamed from: g, reason: collision with root package name */
        public final int f5840g;

        /* renamed from: h, reason: collision with root package name */
        public int f5841h;

        public b(byte[] bArr, int i3, int i4) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i5 = i3 + i4;
            if ((i3 | i4 | (bArr.length - i5)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i3), Integer.valueOf(i4)));
            }
            this.f5838e = bArr;
            this.f5839f = i3;
            this.f5841h = i3;
            this.f5840g = i5;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0420k
        public final void C0(int i3, String str) {
            D0(i3, 2);
            M0(str);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0420k
        public final void D0(int i3, int i4) {
            F0(q0.c(i3, i4));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0420k
        public final void E0(int i3, int i4) {
            D0(i3, 0);
            F0(i4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0420k
        public final void F0(int i3) {
            while ((i3 & (-128)) != 0) {
                try {
                    byte[] bArr = this.f5838e;
                    int i4 = this.f5841h;
                    this.f5841h = i4 + 1;
                    bArr[i4] = (byte) ((i3 & 127) | 128);
                    i3 >>>= 7;
                } catch (IndexOutOfBoundsException e3) {
                    throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f5841h), Integer.valueOf(this.f5840g), 1), e3);
                }
            }
            byte[] bArr2 = this.f5838e;
            int i5 = this.f5841h;
            this.f5841h = i5 + 1;
            bArr2[i5] = (byte) i3;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0420k
        public final void G0(int i3, long j3) {
            D0(i3, 0);
            H0(j3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0420k
        public final void H0(long j3) {
            if (AbstractC0420k.f5835d && W() >= 10) {
                while ((j3 & (-128)) != 0) {
                    byte[] bArr = this.f5838e;
                    int i3 = this.f5841h;
                    this.f5841h = i3 + 1;
                    o0.K(bArr, i3, (byte) ((((int) j3) & 127) | 128));
                    j3 >>>= 7;
                }
                byte[] bArr2 = this.f5838e;
                int i4 = this.f5841h;
                this.f5841h = i4 + 1;
                o0.K(bArr2, i4, (byte) j3);
                return;
            }
            while ((j3 & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f5838e;
                    int i5 = this.f5841h;
                    this.f5841h = i5 + 1;
                    bArr3[i5] = (byte) ((((int) j3) & 127) | 128);
                    j3 >>>= 7;
                } catch (IndexOutOfBoundsException e3) {
                    throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f5841h), Integer.valueOf(this.f5840g), 1), e3);
                }
            }
            byte[] bArr4 = this.f5838e;
            int i6 = this.f5841h;
            this.f5841h = i6 + 1;
            bArr4[i6] = (byte) j3;
        }

        public final void I0(byte[] bArr, int i3, int i4) {
            try {
                System.arraycopy(bArr, i3, this.f5838e, this.f5841h, i4);
                this.f5841h += i4;
            } catch (IndexOutOfBoundsException e3) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f5841h), Integer.valueOf(this.f5840g), Integer.valueOf(i4)), e3);
            }
        }

        public final void J0(AbstractC0417h abstractC0417h) {
            F0(abstractC0417h.size());
            abstractC0417h.G(this);
        }

        public final void K0(int i3, O o3) {
            D0(i3, 2);
            L0(o3);
        }

        public final void L0(O o3) {
            F0(o3.a());
            o3.f(this);
        }

        public final void M0(String str) {
            int i3 = this.f5841h;
            try {
                int N3 = AbstractC0420k.N(str.length() * 3);
                int N4 = AbstractC0420k.N(str.length());
                if (N4 != N3) {
                    F0(p0.g(str));
                    this.f5841h = p0.f(str, this.f5838e, this.f5841h, W());
                    return;
                }
                int i4 = i3 + N4;
                this.f5841h = i4;
                int f3 = p0.f(str, this.f5838e, i4, W());
                this.f5841h = i3;
                F0((f3 - i3) - N4);
                this.f5841h = f3;
            } catch (p0.d e3) {
                this.f5841h = i3;
                S(str, e3);
            } catch (IndexOutOfBoundsException e4) {
                throw new c(e4);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0420k
        public final int W() {
            return this.f5840g - this.f5841h;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0420k
        public final void X(byte b3) {
            try {
                byte[] bArr = this.f5838e;
                int i3 = this.f5841h;
                this.f5841h = i3 + 1;
                bArr[i3] = b3;
            } catch (IndexOutOfBoundsException e3) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f5841h), Integer.valueOf(this.f5840g), 1), e3);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0420k
        public final void Y(int i3, boolean z3) {
            D0(i3, 0);
            X(z3 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0420k, com.google.crypto.tink.shaded.protobuf.AbstractC0416g
        public final void a(byte[] bArr, int i3, int i4) {
            I0(bArr, i3, i4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0420k
        public final void a0(int i3, AbstractC0417h abstractC0417h) {
            D0(i3, 2);
            J0(abstractC0417h);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0420k
        public final void f0(int i3, int i4) {
            D0(i3, 5);
            g0(i4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0420k
        public final void g0(int i3) {
            try {
                byte[] bArr = this.f5838e;
                int i4 = this.f5841h;
                int i5 = i4 + 1;
                this.f5841h = i5;
                bArr[i4] = (byte) (i3 & 255);
                int i6 = i4 + 2;
                this.f5841h = i6;
                bArr[i5] = (byte) ((i3 >> 8) & 255);
                int i7 = i4 + 3;
                this.f5841h = i7;
                bArr[i6] = (byte) ((i3 >> 16) & 255);
                this.f5841h = i4 + 4;
                bArr[i7] = (byte) ((i3 >> 24) & 255);
            } catch (IndexOutOfBoundsException e3) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f5841h), Integer.valueOf(this.f5840g), 1), e3);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0420k
        public final void h0(int i3, long j3) {
            D0(i3, 1);
            i0(j3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0420k
        public final void i0(long j3) {
            try {
                byte[] bArr = this.f5838e;
                int i3 = this.f5841h;
                int i4 = i3 + 1;
                this.f5841h = i4;
                bArr[i3] = (byte) (((int) j3) & 255);
                int i5 = i3 + 2;
                this.f5841h = i5;
                bArr[i4] = (byte) (((int) (j3 >> 8)) & 255);
                int i6 = i3 + 3;
                this.f5841h = i6;
                bArr[i5] = (byte) (((int) (j3 >> 16)) & 255);
                int i7 = i3 + 4;
                this.f5841h = i7;
                bArr[i6] = (byte) (((int) (j3 >> 24)) & 255);
                int i8 = i3 + 5;
                this.f5841h = i8;
                bArr[i7] = (byte) (((int) (j3 >> 32)) & 255);
                int i9 = i3 + 6;
                this.f5841h = i9;
                bArr[i8] = (byte) (((int) (j3 >> 40)) & 255);
                int i10 = i3 + 7;
                this.f5841h = i10;
                bArr[i9] = (byte) (((int) (j3 >> 48)) & 255);
                this.f5841h = i3 + 8;
                bArr[i10] = (byte) (((int) (j3 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e3) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f5841h), Integer.valueOf(this.f5840g), 1), e3);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0420k
        public final void n0(int i3, int i4) {
            D0(i3, 0);
            o0(i4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0420k
        public final void o0(int i3) {
            if (i3 >= 0) {
                F0(i3);
            } else {
                H0(i3);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0420k
        public final void r0(int i3, O o3, e0 e0Var) {
            D0(i3, 2);
            F0(((AbstractC0410a) o3).g(e0Var));
            e0Var.i(o3, this.f5836a);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0420k
        public final void s0(int i3, O o3) {
            D0(1, 3);
            E0(2, i3);
            K0(3, o3);
            D0(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0420k
        public final void t0(int i3, AbstractC0417h abstractC0417h) {
            D0(1, 3);
            E0(2, i3);
            a0(3, abstractC0417h);
            D0(1, 4);
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.k$c */
    public static class c extends IOException {
        public c(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        public c(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }
    }

    public static int A(int i3, AbstractC0417h abstractC0417h) {
        return (L(1) * 2) + M(2, i3) + f(3, abstractC0417h);
    }

    public static int B(int i3, int i4) {
        return L(i3) + C(i4);
    }

    public static int C(int i3) {
        return 4;
    }

    public static int D(int i3, long j3) {
        return L(i3) + E(j3);
    }

    public static int E(long j3) {
        return 8;
    }

    public static int F(int i3, int i4) {
        return L(i3) + G(i4);
    }

    public static int G(int i3) {
        return N(Q(i3));
    }

    public static int H(int i3, long j3) {
        return L(i3) + I(j3);
    }

    public static int I(long j3) {
        return P(R(j3));
    }

    public static int J(int i3, String str) {
        return L(i3) + K(str);
    }

    public static int K(String str) {
        int length;
        try {
            length = p0.g(str);
        } catch (p0.d unused) {
            length = str.getBytes(AbstractC0434z.f6009b).length;
        }
        return x(length);
    }

    public static int L(int i3) {
        return N(q0.c(i3, 0));
    }

    public static int M(int i3, int i4) {
        return L(i3) + N(i4);
    }

    public static int N(int i3) {
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

    public static int O(int i3, long j3) {
        return L(i3) + P(j3);
    }

    public static int P(long j3) {
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

    public static int Q(int i3) {
        return (i3 >> 31) ^ (i3 << 1);
    }

    public static long R(long j3) {
        return (j3 >> 63) ^ (j3 << 1);
    }

    public static AbstractC0420k U(byte[] bArr) {
        return V(bArr, 0, bArr.length);
    }

    public static AbstractC0420k V(byte[] bArr, int i3, int i4) {
        return new b(bArr, i3, i4);
    }

    public static int d(int i3, boolean z3) {
        return L(i3) + e(z3);
    }

    public static int e(boolean z3) {
        return 1;
    }

    public static int f(int i3, AbstractC0417h abstractC0417h) {
        return L(i3) + g(abstractC0417h);
    }

    public static int g(AbstractC0417h abstractC0417h) {
        return x(abstractC0417h.size());
    }

    public static int h(int i3, double d3) {
        return L(i3) + i(d3);
    }

    public static int i(double d3) {
        return 8;
    }

    public static int j(int i3, int i4) {
        return L(i3) + k(i4);
    }

    public static int k(int i3) {
        return u(i3);
    }

    public static int l(int i3, int i4) {
        return L(i3) + m(i4);
    }

    public static int m(int i3) {
        return 4;
    }

    public static int n(int i3, long j3) {
        return L(i3) + o(j3);
    }

    public static int o(long j3) {
        return 8;
    }

    public static int p(int i3, float f3) {
        return L(i3) + q(f3);
    }

    public static int q(float f3) {
        return 4;
    }

    public static int r(int i3, O o3, e0 e0Var) {
        return (L(i3) * 2) + s(o3, e0Var);
    }

    public static int s(O o3, e0 e0Var) {
        return ((AbstractC0410a) o3).g(e0Var);
    }

    public static int t(int i3, int i4) {
        return L(i3) + u(i4);
    }

    public static int u(int i3) {
        if (i3 >= 0) {
            return N(i3);
        }
        return 10;
    }

    public static int v(int i3, long j3) {
        return L(i3) + w(j3);
    }

    public static int w(long j3) {
        return P(j3);
    }

    public static int x(int i3) {
        return N(i3) + i3;
    }

    public static int y(int i3, O o3, e0 e0Var) {
        return L(i3) + z(o3, e0Var);
    }

    public static int z(O o3, e0 e0Var) {
        return x(((AbstractC0410a) o3).g(e0Var));
    }

    public final void A0(int i3, long j3) {
        G0(i3, R(j3));
    }

    public final void B0(long j3) {
        H0(R(j3));
    }

    public abstract void C0(int i3, String str);

    public abstract void D0(int i3, int i4);

    public abstract void E0(int i3, int i4);

    public abstract void F0(int i3);

    public abstract void G0(int i3, long j3);

    public abstract void H0(long j3);

    public final void S(String str, p0.d dVar) {
        f5834c.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(AbstractC0434z.f6009b);
        try {
            F0(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e3) {
            throw new c(e3);
        }
    }

    public boolean T() {
        return this.f5837b;
    }

    public abstract int W();

    public abstract void X(byte b3);

    public abstract void Y(int i3, boolean z3);

    public final void Z(boolean z3) {
        X(z3 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0416g
    public abstract void a(byte[] bArr, int i3, int i4);

    public abstract void a0(int i3, AbstractC0417h abstractC0417h);

    public final void b0(int i3, double d3) {
        h0(i3, Double.doubleToRawLongBits(d3));
    }

    public final void c() {
        if (W() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public final void c0(double d3) {
        i0(Double.doubleToRawLongBits(d3));
    }

    public final void d0(int i3, int i4) {
        n0(i3, i4);
    }

    public final void e0(int i3) {
        o0(i3);
    }

    public abstract void f0(int i3, int i4);

    public abstract void g0(int i3);

    public abstract void h0(int i3, long j3);

    public abstract void i0(long j3);

    public final void j0(int i3, float f3) {
        f0(i3, Float.floatToRawIntBits(f3));
    }

    public final void k0(float f3) {
        g0(Float.floatToRawIntBits(f3));
    }

    public final void l0(int i3, O o3, e0 e0Var) {
        D0(i3, 3);
        m0(o3, e0Var);
        D0(i3, 4);
    }

    public final void m0(O o3, e0 e0Var) {
        e0Var.i(o3, this.f5836a);
    }

    public abstract void n0(int i3, int i4);

    public abstract void o0(int i3);

    public final void p0(int i3, long j3) {
        G0(i3, j3);
    }

    public final void q0(long j3) {
        H0(j3);
    }

    public abstract void r0(int i3, O o3, e0 e0Var);

    public abstract void s0(int i3, O o3);

    public abstract void t0(int i3, AbstractC0417h abstractC0417h);

    public final void u0(int i3, int i4) {
        f0(i3, i4);
    }

    public final void v0(int i3) {
        g0(i3);
    }

    public final void w0(int i3, long j3) {
        h0(i3, j3);
    }

    public final void x0(long j3) {
        i0(j3);
    }

    public final void y0(int i3, int i4) {
        E0(i3, Q(i4));
    }

    public final void z0(int i3) {
        F0(Q(i3));
    }

    public AbstractC0420k() {
    }
}
