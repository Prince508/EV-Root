package com.google.crypto.tink.shaded.protobuf;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.crypto.tink.shaded.protobuf.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0418i {

    /* renamed from: f, reason: collision with root package name */
    public static volatile int f5805f = 100;

    /* renamed from: a, reason: collision with root package name */
    public int f5806a;

    /* renamed from: b, reason: collision with root package name */
    public int f5807b;

    /* renamed from: c, reason: collision with root package name */
    public int f5808c;

    /* renamed from: d, reason: collision with root package name */
    public C0419j f5809d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5810e;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.i$b */
    public static final class b extends AbstractC0418i {

        /* renamed from: g, reason: collision with root package name */
        public final byte[] f5811g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f5812h;

        /* renamed from: i, reason: collision with root package name */
        public int f5813i;

        /* renamed from: j, reason: collision with root package name */
        public int f5814j;

        /* renamed from: k, reason: collision with root package name */
        public int f5815k;

        /* renamed from: l, reason: collision with root package name */
        public int f5816l;

        /* renamed from: m, reason: collision with root package name */
        public int f5817m;

        /* renamed from: n, reason: collision with root package name */
        public boolean f5818n;

        /* renamed from: o, reason: collision with root package name */
        public int f5819o;

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0418i
        public String A() {
            int J3 = J();
            if (J3 > 0) {
                int i3 = this.f5813i;
                int i4 = this.f5815k;
                if (J3 <= i3 - i4) {
                    String e3 = p0.e(this.f5811g, i4, J3);
                    this.f5815k += J3;
                    return e3;
                }
            }
            if (J3 == 0) {
                return "";
            }
            if (J3 <= 0) {
                throw A.g();
            }
            throw A.m();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0418i
        public int B() {
            if (e()) {
                this.f5817m = 0;
                return 0;
            }
            int J3 = J();
            this.f5817m = J3;
            if (q0.a(J3) != 0) {
                return this.f5817m;
            }
            throw A.c();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0418i
        public int C() {
            return J();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0418i
        public long D() {
            return K();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0418i
        public boolean E(int i3) {
            int b3 = q0.b(i3);
            if (b3 == 0) {
                P();
                return true;
            }
            if (b3 == 1) {
                O(8);
                return true;
            }
            if (b3 == 2) {
                O(J());
                return true;
            }
            if (b3 == 3) {
                N();
                a(q0.c(q0.a(i3), 4));
                return true;
            }
            if (b3 == 4) {
                return false;
            }
            if (b3 != 5) {
                throw A.e();
            }
            O(4);
            return true;
        }

        public byte F() {
            int i3 = this.f5815k;
            if (i3 == this.f5813i) {
                throw A.m();
            }
            byte[] bArr = this.f5811g;
            this.f5815k = i3 + 1;
            return bArr[i3];
        }

        public byte[] G(int i3) {
            if (i3 > 0) {
                int i4 = this.f5813i;
                int i5 = this.f5815k;
                if (i3 <= i4 - i5) {
                    int i6 = i3 + i5;
                    this.f5815k = i6;
                    return Arrays.copyOfRange(this.f5811g, i5, i6);
                }
            }
            if (i3 > 0) {
                throw A.m();
            }
            if (i3 == 0) {
                return AbstractC0434z.f6011d;
            }
            throw A.g();
        }

        public int H() {
            int i3 = this.f5815k;
            if (this.f5813i - i3 < 4) {
                throw A.m();
            }
            byte[] bArr = this.f5811g;
            this.f5815k = i3 + 4;
            return ((bArr[i3 + 3] & 255) << 24) | (bArr[i3] & 255) | ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3 + 2] & 255) << 16);
        }

        public long I() {
            int i3 = this.f5815k;
            if (this.f5813i - i3 < 8) {
                throw A.m();
            }
            byte[] bArr = this.f5811g;
            this.f5815k = i3 + 8;
            return ((bArr[i3 + 7] & 255) << 56) | (bArr[i3] & 255) | ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3 + 2] & 255) << 16) | ((bArr[i3 + 3] & 255) << 24) | ((bArr[i3 + 4] & 255) << 32) | ((bArr[i3 + 5] & 255) << 40) | ((bArr[i3 + 6] & 255) << 48);
        }

        public int J() {
            int i3;
            int i4 = this.f5815k;
            int i5 = this.f5813i;
            if (i5 != i4) {
                byte[] bArr = this.f5811g;
                int i6 = i4 + 1;
                byte b3 = bArr[i4];
                if (b3 >= 0) {
                    this.f5815k = i6;
                    return b3;
                }
                if (i5 - i6 >= 9) {
                    int i7 = i4 + 2;
                    int i8 = (bArr[i6] << 7) ^ b3;
                    if (i8 < 0) {
                        i3 = i8 ^ (-128);
                    } else {
                        int i9 = i4 + 3;
                        int i10 = (bArr[i7] << 14) ^ i8;
                        if (i10 >= 0) {
                            i3 = i10 ^ 16256;
                        } else {
                            int i11 = i4 + 4;
                            int i12 = i10 ^ (bArr[i9] << 21);
                            if (i12 < 0) {
                                i3 = (-2080896) ^ i12;
                            } else {
                                i9 = i4 + 5;
                                byte b4 = bArr[i11];
                                int i13 = (i12 ^ (b4 << 28)) ^ 266354560;
                                if (b4 < 0) {
                                    i11 = i4 + 6;
                                    if (bArr[i9] < 0) {
                                        i9 = i4 + 7;
                                        if (bArr[i11] < 0) {
                                            i11 = i4 + 8;
                                            if (bArr[i9] < 0) {
                                                i9 = i4 + 9;
                                                if (bArr[i11] < 0) {
                                                    int i14 = i4 + 10;
                                                    if (bArr[i9] >= 0) {
                                                        i7 = i14;
                                                        i3 = i13;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i3 = i13;
                                }
                                i3 = i13;
                            }
                            i7 = i11;
                        }
                        i7 = i9;
                    }
                    this.f5815k = i7;
                    return i3;
                }
            }
            return (int) L();
        }

        public long K() {
            long j3;
            long j4;
            long j5;
            int i3 = this.f5815k;
            int i4 = this.f5813i;
            if (i4 != i3) {
                byte[] bArr = this.f5811g;
                int i5 = i3 + 1;
                byte b3 = bArr[i3];
                if (b3 >= 0) {
                    this.f5815k = i5;
                    return b3;
                }
                if (i4 - i5 >= 9) {
                    int i6 = i3 + 2;
                    int i7 = (bArr[i5] << 7) ^ b3;
                    if (i7 < 0) {
                        j3 = i7 ^ (-128);
                    } else {
                        int i8 = i3 + 3;
                        int i9 = (bArr[i6] << 14) ^ i7;
                        if (i9 >= 0) {
                            j3 = i9 ^ 16256;
                            i6 = i8;
                        } else {
                            int i10 = i3 + 4;
                            int i11 = i9 ^ (bArr[i8] << 21);
                            if (i11 < 0) {
                                long j6 = (-2080896) ^ i11;
                                i6 = i10;
                                j3 = j6;
                            } else {
                                long j7 = i11;
                                i6 = i3 + 5;
                                long j8 = j7 ^ (bArr[i10] << 28);
                                if (j8 >= 0) {
                                    j5 = 266354560;
                                } else {
                                    int i12 = i3 + 6;
                                    long j9 = j8 ^ (bArr[i6] << 35);
                                    if (j9 < 0) {
                                        j4 = -34093383808L;
                                    } else {
                                        i6 = i3 + 7;
                                        j8 = j9 ^ (bArr[i12] << 42);
                                        if (j8 >= 0) {
                                            j5 = 4363953127296L;
                                        } else {
                                            i12 = i3 + 8;
                                            j9 = j8 ^ (bArr[i6] << 49);
                                            if (j9 < 0) {
                                                j4 = -558586000294016L;
                                            } else {
                                                i6 = i3 + 9;
                                                long j10 = (j9 ^ (bArr[i12] << 56)) ^ 71499008037633920L;
                                                if (j10 < 0) {
                                                    int i13 = i3 + 10;
                                                    if (bArr[i6] >= 0) {
                                                        i6 = i13;
                                                    }
                                                }
                                                j3 = j10;
                                            }
                                        }
                                    }
                                    j3 = j9 ^ j4;
                                    i6 = i12;
                                }
                                j3 = j8 ^ j5;
                            }
                        }
                    }
                    this.f5815k = i6;
                    return j3;
                }
            }
            return L();
        }

        public long L() {
            long j3 = 0;
            for (int i3 = 0; i3 < 64; i3 += 7) {
                j3 |= (r3 & Byte.MAX_VALUE) << i3;
                if ((F() & 128) == 0) {
                    return j3;
                }
            }
            throw A.f();
        }

        public final void M() {
            int i3 = this.f5813i + this.f5814j;
            this.f5813i = i3;
            int i4 = i3 - this.f5816l;
            int i5 = this.f5819o;
            if (i4 <= i5) {
                this.f5814j = 0;
                return;
            }
            int i6 = i4 - i5;
            this.f5814j = i6;
            this.f5813i = i3 - i6;
        }

        public void N() {
            int B3;
            do {
                B3 = B();
                if (B3 == 0) {
                    return;
                }
            } while (E(B3));
        }

        public void O(int i3) {
            if (i3 >= 0) {
                int i4 = this.f5813i;
                int i5 = this.f5815k;
                if (i3 <= i4 - i5) {
                    this.f5815k = i5 + i3;
                    return;
                }
            }
            if (i3 >= 0) {
                throw A.m();
            }
            throw A.g();
        }

        public final void P() {
            if (this.f5813i - this.f5815k >= 10) {
                Q();
            } else {
                R();
            }
        }

        public final void Q() {
            for (int i3 = 0; i3 < 10; i3++) {
                byte[] bArr = this.f5811g;
                int i4 = this.f5815k;
                this.f5815k = i4 + 1;
                if (bArr[i4] >= 0) {
                    return;
                }
            }
            throw A.f();
        }

        public final void R() {
            for (int i3 = 0; i3 < 10; i3++) {
                if (F() >= 0) {
                    return;
                }
            }
            throw A.f();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0418i
        public void a(int i3) {
            if (this.f5817m != i3) {
                throw A.b();
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0418i
        public int d() {
            return this.f5815k - this.f5816l;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0418i
        public boolean e() {
            return this.f5815k == this.f5813i;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0418i
        public void k(int i3) {
            this.f5819o = i3;
            M();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0418i
        public int l(int i3) {
            if (i3 < 0) {
                throw A.g();
            }
            int d3 = i3 + d();
            if (d3 < 0) {
                throw A.h();
            }
            int i4 = this.f5819o;
            if (d3 > i4) {
                throw A.m();
            }
            this.f5819o = d3;
            M();
            return i4;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0418i
        public boolean m() {
            return K() != 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0418i
        public AbstractC0417h n() {
            int J3 = J();
            if (J3 > 0) {
                int i3 = this.f5813i;
                int i4 = this.f5815k;
                if (J3 <= i3 - i4) {
                    AbstractC0417h F3 = (this.f5812h && this.f5818n) ? AbstractC0417h.F(this.f5811g, i4, J3) : AbstractC0417h.n(this.f5811g, i4, J3);
                    this.f5815k += J3;
                    return F3;
                }
            }
            return J3 == 0 ? AbstractC0417h.f5793f : AbstractC0417h.E(G(J3));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0418i
        public double o() {
            return Double.longBitsToDouble(I());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0418i
        public int p() {
            return J();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0418i
        public int q() {
            return H();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0418i
        public long r() {
            return I();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0418i
        public float s() {
            return Float.intBitsToFloat(H());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0418i
        public int t() {
            return J();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0418i
        public long u() {
            return K();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0418i
        public int v() {
            return H();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0418i
        public long w() {
            return I();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0418i
        public int x() {
            return AbstractC0418i.b(J());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0418i
        public long y() {
            return AbstractC0418i.c(K());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0418i
        public String z() {
            int J3 = J();
            if (J3 > 0) {
                int i3 = this.f5813i;
                int i4 = this.f5815k;
                if (J3 <= i3 - i4) {
                    String str = new String(this.f5811g, i4, J3, AbstractC0434z.f6009b);
                    this.f5815k += J3;
                    return str;
                }
            }
            if (J3 == 0) {
                return "";
            }
            if (J3 < 0) {
                throw A.g();
            }
            throw A.m();
        }

        public b(byte[] bArr, int i3, int i4, boolean z3) {
            super();
            this.f5819o = Integer.MAX_VALUE;
            this.f5811g = bArr;
            this.f5813i = i4 + i3;
            this.f5815k = i3;
            this.f5816l = i3;
            this.f5812h = z3;
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.i$c */
    public static final class c extends AbstractC0418i {

        /* renamed from: g, reason: collision with root package name */
        public final InputStream f5820g;

        /* renamed from: h, reason: collision with root package name */
        public final byte[] f5821h;

        /* renamed from: i, reason: collision with root package name */
        public int f5822i;

        /* renamed from: j, reason: collision with root package name */
        public int f5823j;

        /* renamed from: k, reason: collision with root package name */
        public int f5824k;

        /* renamed from: l, reason: collision with root package name */
        public int f5825l;

        /* renamed from: m, reason: collision with root package name */
        public int f5826m;

        /* renamed from: n, reason: collision with root package name */
        public int f5827n;

        public static int F(InputStream inputStream) {
            try {
                return inputStream.available();
            } catch (A e3) {
                e3.j();
                throw e3;
            }
        }

        public static int G(InputStream inputStream, byte[] bArr, int i3, int i4) {
            try {
                return inputStream.read(bArr, i3, i4);
            } catch (A e3) {
                e3.j();
                throw e3;
            }
        }

        private void R() {
            int i3 = this.f5822i + this.f5823j;
            this.f5822i = i3;
            int i4 = this.f5826m + i3;
            int i5 = this.f5827n;
            if (i4 <= i5) {
                this.f5823j = 0;
                return;
            }
            int i6 = i4 - i5;
            this.f5823j = i6;
            this.f5822i = i3 - i6;
        }

        public static long T(InputStream inputStream, long j3) {
            try {
                return inputStream.skip(j3);
            } catch (A e3) {
                e3.j();
                throw e3;
            }
        }

        private void X() {
            if (this.f5822i - this.f5824k >= 10) {
                Y();
            } else {
                Z();
            }
        }

        private void Y() {
            for (int i3 = 0; i3 < 10; i3++) {
                byte[] bArr = this.f5821h;
                int i4 = this.f5824k;
                this.f5824k = i4 + 1;
                if (bArr[i4] >= 0) {
                    return;
                }
            }
            throw A.f();
        }

        private void Z() {
            for (int i3 = 0; i3 < 10; i3++) {
                if (I() >= 0) {
                    return;
                }
            }
            throw A.f();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0418i
        public String A() {
            byte[] J3;
            int O3 = O();
            int i3 = this.f5824k;
            int i4 = this.f5822i;
            if (O3 <= i4 - i3 && O3 > 0) {
                J3 = this.f5821h;
                this.f5824k = i3 + O3;
            } else {
                if (O3 == 0) {
                    return "";
                }
                i3 = 0;
                if (O3 <= i4) {
                    S(O3);
                    J3 = this.f5821h;
                    this.f5824k = O3;
                } else {
                    J3 = J(O3, false);
                }
            }
            return p0.e(J3, i3, O3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0418i
        public int B() {
            if (e()) {
                this.f5825l = 0;
                return 0;
            }
            int O3 = O();
            this.f5825l = O3;
            if (q0.a(O3) != 0) {
                return this.f5825l;
            }
            throw A.c();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0418i
        public int C() {
            return O();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0418i
        public long D() {
            return P();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0418i
        public boolean E(int i3) {
            int b3 = q0.b(i3);
            if (b3 == 0) {
                X();
                return true;
            }
            if (b3 == 1) {
                V(8);
                return true;
            }
            if (b3 == 2) {
                V(O());
                return true;
            }
            if (b3 == 3) {
                U();
                a(q0.c(q0.a(i3), 4));
                return true;
            }
            if (b3 == 4) {
                return false;
            }
            if (b3 != 5) {
                throw A.e();
            }
            V(4);
            return true;
        }

        public final AbstractC0417h H(int i3) {
            byte[] K3 = K(i3);
            if (K3 != null) {
                return AbstractC0417h.m(K3);
            }
            int i4 = this.f5824k;
            int i5 = this.f5822i;
            int i6 = i5 - i4;
            this.f5826m += i5;
            this.f5824k = 0;
            this.f5822i = 0;
            List<byte[]> L3 = L(i3 - i6);
            byte[] bArr = new byte[i3];
            System.arraycopy(this.f5821h, i4, bArr, 0, i6);
            for (byte[] bArr2 : L3) {
                System.arraycopy(bArr2, 0, bArr, i6, bArr2.length);
                i6 += bArr2.length;
            }
            return AbstractC0417h.E(bArr);
        }

        public byte I() {
            if (this.f5824k == this.f5822i) {
                S(1);
            }
            byte[] bArr = this.f5821h;
            int i3 = this.f5824k;
            this.f5824k = i3 + 1;
            return bArr[i3];
        }

        public final byte[] J(int i3, boolean z3) {
            byte[] K3 = K(i3);
            if (K3 != null) {
                return z3 ? (byte[]) K3.clone() : K3;
            }
            int i4 = this.f5824k;
            int i5 = this.f5822i;
            int i6 = i5 - i4;
            this.f5826m += i5;
            this.f5824k = 0;
            this.f5822i = 0;
            List<byte[]> L3 = L(i3 - i6);
            byte[] bArr = new byte[i3];
            System.arraycopy(this.f5821h, i4, bArr, 0, i6);
            for (byte[] bArr2 : L3) {
                System.arraycopy(bArr2, 0, bArr, i6, bArr2.length);
                i6 += bArr2.length;
            }
            return bArr;
        }

        public final byte[] K(int i3) {
            if (i3 == 0) {
                return AbstractC0434z.f6011d;
            }
            if (i3 < 0) {
                throw A.g();
            }
            int i4 = this.f5826m;
            int i5 = this.f5824k;
            int i6 = i4 + i5 + i3;
            if (i6 - this.f5808c > 0) {
                throw A.l();
            }
            int i7 = this.f5827n;
            if (i6 > i7) {
                V((i7 - i4) - i5);
                throw A.m();
            }
            int i8 = this.f5822i - i5;
            int i9 = i3 - i8;
            if (i9 >= 4096 && i9 > F(this.f5820g)) {
                return null;
            }
            byte[] bArr = new byte[i3];
            System.arraycopy(this.f5821h, this.f5824k, bArr, 0, i8);
            this.f5826m += this.f5822i;
            this.f5824k = 0;
            this.f5822i = 0;
            while (i8 < i3) {
                int G3 = G(this.f5820g, bArr, i8, i3 - i8);
                if (G3 == -1) {
                    throw A.m();
                }
                this.f5826m += G3;
                i8 += G3;
            }
            return bArr;
        }

        public final List L(int i3) {
            ArrayList arrayList = new ArrayList();
            while (i3 > 0) {
                int min = Math.min(i3, 4096);
                byte[] bArr = new byte[min];
                int i4 = 0;
                while (i4 < min) {
                    int read = this.f5820g.read(bArr, i4, min - i4);
                    if (read == -1) {
                        throw A.m();
                    }
                    this.f5826m += read;
                    i4 += read;
                }
                i3 -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        public int M() {
            int i3 = this.f5824k;
            if (this.f5822i - i3 < 4) {
                S(4);
                i3 = this.f5824k;
            }
            byte[] bArr = this.f5821h;
            this.f5824k = i3 + 4;
            return ((bArr[i3 + 3] & 255) << 24) | (bArr[i3] & 255) | ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3 + 2] & 255) << 16);
        }

        public long N() {
            int i3 = this.f5824k;
            if (this.f5822i - i3 < 8) {
                S(8);
                i3 = this.f5824k;
            }
            byte[] bArr = this.f5821h;
            this.f5824k = i3 + 8;
            return ((bArr[i3 + 7] & 255) << 56) | (bArr[i3] & 255) | ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3 + 2] & 255) << 16) | ((bArr[i3 + 3] & 255) << 24) | ((bArr[i3 + 4] & 255) << 32) | ((bArr[i3 + 5] & 255) << 40) | ((bArr[i3 + 6] & 255) << 48);
        }

        public int O() {
            int i3;
            int i4 = this.f5824k;
            int i5 = this.f5822i;
            if (i5 != i4) {
                byte[] bArr = this.f5821h;
                int i6 = i4 + 1;
                byte b3 = bArr[i4];
                if (b3 >= 0) {
                    this.f5824k = i6;
                    return b3;
                }
                if (i5 - i6 >= 9) {
                    int i7 = i4 + 2;
                    int i8 = (bArr[i6] << 7) ^ b3;
                    if (i8 < 0) {
                        i3 = i8 ^ (-128);
                    } else {
                        int i9 = i4 + 3;
                        int i10 = (bArr[i7] << 14) ^ i8;
                        if (i10 >= 0) {
                            i3 = i10 ^ 16256;
                        } else {
                            int i11 = i4 + 4;
                            int i12 = i10 ^ (bArr[i9] << 21);
                            if (i12 < 0) {
                                i3 = (-2080896) ^ i12;
                            } else {
                                i9 = i4 + 5;
                                byte b4 = bArr[i11];
                                int i13 = (i12 ^ (b4 << 28)) ^ 266354560;
                                if (b4 < 0) {
                                    i11 = i4 + 6;
                                    if (bArr[i9] < 0) {
                                        i9 = i4 + 7;
                                        if (bArr[i11] < 0) {
                                            i11 = i4 + 8;
                                            if (bArr[i9] < 0) {
                                                i9 = i4 + 9;
                                                if (bArr[i11] < 0) {
                                                    int i14 = i4 + 10;
                                                    if (bArr[i9] >= 0) {
                                                        i7 = i14;
                                                        i3 = i13;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i3 = i13;
                                }
                                i3 = i13;
                            }
                            i7 = i11;
                        }
                        i7 = i9;
                    }
                    this.f5824k = i7;
                    return i3;
                }
            }
            return (int) Q();
        }

        public long P() {
            long j3;
            long j4;
            long j5;
            int i3 = this.f5824k;
            int i4 = this.f5822i;
            if (i4 != i3) {
                byte[] bArr = this.f5821h;
                int i5 = i3 + 1;
                byte b3 = bArr[i3];
                if (b3 >= 0) {
                    this.f5824k = i5;
                    return b3;
                }
                if (i4 - i5 >= 9) {
                    int i6 = i3 + 2;
                    int i7 = (bArr[i5] << 7) ^ b3;
                    if (i7 < 0) {
                        j3 = i7 ^ (-128);
                    } else {
                        int i8 = i3 + 3;
                        int i9 = (bArr[i6] << 14) ^ i7;
                        if (i9 >= 0) {
                            j3 = i9 ^ 16256;
                            i6 = i8;
                        } else {
                            int i10 = i3 + 4;
                            int i11 = i9 ^ (bArr[i8] << 21);
                            if (i11 < 0) {
                                long j6 = (-2080896) ^ i11;
                                i6 = i10;
                                j3 = j6;
                            } else {
                                long j7 = i11;
                                i6 = i3 + 5;
                                long j8 = j7 ^ (bArr[i10] << 28);
                                if (j8 >= 0) {
                                    j5 = 266354560;
                                } else {
                                    int i12 = i3 + 6;
                                    long j9 = j8 ^ (bArr[i6] << 35);
                                    if (j9 < 0) {
                                        j4 = -34093383808L;
                                    } else {
                                        i6 = i3 + 7;
                                        j8 = j9 ^ (bArr[i12] << 42);
                                        if (j8 >= 0) {
                                            j5 = 4363953127296L;
                                        } else {
                                            i12 = i3 + 8;
                                            j9 = j8 ^ (bArr[i6] << 49);
                                            if (j9 < 0) {
                                                j4 = -558586000294016L;
                                            } else {
                                                i6 = i3 + 9;
                                                long j10 = (j9 ^ (bArr[i12] << 56)) ^ 71499008037633920L;
                                                if (j10 < 0) {
                                                    int i13 = i3 + 10;
                                                    if (bArr[i6] >= 0) {
                                                        i6 = i13;
                                                    }
                                                }
                                                j3 = j10;
                                            }
                                        }
                                    }
                                    j3 = j9 ^ j4;
                                    i6 = i12;
                                }
                                j3 = j8 ^ j5;
                            }
                        }
                    }
                    this.f5824k = i6;
                    return j3;
                }
            }
            return Q();
        }

        public long Q() {
            long j3 = 0;
            for (int i3 = 0; i3 < 64; i3 += 7) {
                j3 |= (r3 & Byte.MAX_VALUE) << i3;
                if ((I() & 128) == 0) {
                    return j3;
                }
            }
            throw A.f();
        }

        public final void S(int i3) {
            if (a0(i3)) {
                return;
            }
            if (i3 <= (this.f5808c - this.f5826m) - this.f5824k) {
                throw A.m();
            }
            throw A.l();
        }

        public void U() {
            int B3;
            do {
                B3 = B();
                if (B3 == 0) {
                    return;
                }
            } while (E(B3));
        }

        public void V(int i3) {
            int i4 = this.f5822i;
            int i5 = this.f5824k;
            if (i3 > i4 - i5 || i3 < 0) {
                W(i3);
            } else {
                this.f5824k = i5 + i3;
            }
        }

        public final void W(int i3) {
            if (i3 < 0) {
                throw A.g();
            }
            int i4 = this.f5826m;
            int i5 = this.f5824k;
            int i6 = i4 + i5 + i3;
            int i7 = this.f5827n;
            if (i6 > i7) {
                V((i7 - i4) - i5);
                throw A.m();
            }
            this.f5826m = i4 + i5;
            int i8 = this.f5822i - i5;
            this.f5822i = 0;
            this.f5824k = 0;
            while (i8 < i3) {
                try {
                    long j3 = i3 - i8;
                    long T3 = T(this.f5820g, j3);
                    if (T3 < 0 || T3 > j3) {
                        throw new IllegalStateException(this.f5820g.getClass() + "#skip returned invalid result: " + T3 + "\nThe InputStream implementation is buggy.");
                    }
                    if (T3 == 0) {
                        break;
                    } else {
                        i8 += (int) T3;
                    }
                } finally {
                    this.f5826m += i8;
                    R();
                }
            }
            if (i8 >= i3) {
                return;
            }
            int i9 = this.f5822i;
            int i10 = i9 - this.f5824k;
            this.f5824k = i9;
            S(1);
            while (true) {
                int i11 = i3 - i10;
                int i12 = this.f5822i;
                if (i11 <= i12) {
                    this.f5824k = i11;
                    return;
                } else {
                    i10 += i12;
                    this.f5824k = i12;
                    S(1);
                }
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0418i
        public void a(int i3) {
            if (this.f5825l != i3) {
                throw A.b();
            }
        }

        public final boolean a0(int i3) {
            int i4 = this.f5824k;
            int i5 = i4 + i3;
            int i6 = this.f5822i;
            if (i5 <= i6) {
                throw new IllegalStateException("refillBuffer() called when " + i3 + " bytes were already available in buffer");
            }
            int i7 = this.f5808c;
            int i8 = this.f5826m;
            if (i3 > (i7 - i8) - i4 || i8 + i4 + i3 > this.f5827n) {
                return false;
            }
            if (i4 > 0) {
                if (i6 > i4) {
                    byte[] bArr = this.f5821h;
                    System.arraycopy(bArr, i4, bArr, 0, i6 - i4);
                }
                this.f5826m += i4;
                this.f5822i -= i4;
                this.f5824k = 0;
            }
            InputStream inputStream = this.f5820g;
            byte[] bArr2 = this.f5821h;
            int i9 = this.f5822i;
            int G3 = G(inputStream, bArr2, i9, Math.min(bArr2.length - i9, (this.f5808c - this.f5826m) - i9));
            if (G3 == 0 || G3 < -1 || G3 > this.f5821h.length) {
                throw new IllegalStateException(this.f5820g.getClass() + "#read(byte[]) returned invalid result: " + G3 + "\nThe InputStream implementation is buggy.");
            }
            if (G3 <= 0) {
                return false;
            }
            this.f5822i += G3;
            R();
            if (this.f5822i >= i3) {
                return true;
            }
            return a0(i3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0418i
        public int d() {
            return this.f5826m + this.f5824k;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0418i
        public boolean e() {
            return this.f5824k == this.f5822i && !a0(1);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0418i
        public void k(int i3) {
            this.f5827n = i3;
            R();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0418i
        public int l(int i3) {
            if (i3 < 0) {
                throw A.g();
            }
            int i4 = i3 + this.f5826m + this.f5824k;
            int i5 = this.f5827n;
            if (i4 > i5) {
                throw A.m();
            }
            this.f5827n = i4;
            R();
            return i5;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0418i
        public boolean m() {
            return P() != 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0418i
        public AbstractC0417h n() {
            int O3 = O();
            int i3 = this.f5822i;
            int i4 = this.f5824k;
            if (O3 > i3 - i4 || O3 <= 0) {
                return O3 == 0 ? AbstractC0417h.f5793f : H(O3);
            }
            AbstractC0417h n3 = AbstractC0417h.n(this.f5821h, i4, O3);
            this.f5824k += O3;
            return n3;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0418i
        public double o() {
            return Double.longBitsToDouble(N());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0418i
        public int p() {
            return O();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0418i
        public int q() {
            return M();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0418i
        public long r() {
            return N();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0418i
        public float s() {
            return Float.intBitsToFloat(M());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0418i
        public int t() {
            return O();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0418i
        public long u() {
            return P();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0418i
        public int v() {
            return M();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0418i
        public long w() {
            return N();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0418i
        public int x() {
            return AbstractC0418i.b(O());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0418i
        public long y() {
            return AbstractC0418i.c(P());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0418i
        public String z() {
            int O3 = O();
            if (O3 > 0) {
                int i3 = this.f5822i;
                int i4 = this.f5824k;
                if (O3 <= i3 - i4) {
                    String str = new String(this.f5821h, i4, O3, AbstractC0434z.f6009b);
                    this.f5824k += O3;
                    return str;
                }
            }
            if (O3 == 0) {
                return "";
            }
            if (O3 > this.f5822i) {
                return new String(J(O3, false), AbstractC0434z.f6009b);
            }
            S(O3);
            String str2 = new String(this.f5821h, this.f5824k, O3, AbstractC0434z.f6009b);
            this.f5824k += O3;
            return str2;
        }

        public c(InputStream inputStream, int i3) {
            super();
            this.f5827n = Integer.MAX_VALUE;
            AbstractC0434z.b(inputStream, "input");
            this.f5820g = inputStream;
            this.f5821h = new byte[i3];
            this.f5822i = 0;
            this.f5824k = 0;
            this.f5826m = 0;
        }
    }

    public static int b(int i3) {
        return (-(i3 & 1)) ^ (i3 >>> 1);
    }

    public static long c(long j3) {
        return (-(j3 & 1)) ^ (j3 >>> 1);
    }

    public static AbstractC0418i f(InputStream inputStream) {
        return g(inputStream, 4096);
    }

    public static AbstractC0418i g(InputStream inputStream, int i3) {
        if (i3 > 0) {
            return inputStream == null ? h(AbstractC0434z.f6011d) : new c(inputStream, i3);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static AbstractC0418i h(byte[] bArr) {
        return i(bArr, 0, bArr.length);
    }

    public static AbstractC0418i i(byte[] bArr, int i3, int i4) {
        return j(bArr, i3, i4, false);
    }

    public static AbstractC0418i j(byte[] bArr, int i3, int i4, boolean z3) {
        b bVar = new b(bArr, i3, i4, z3);
        try {
            bVar.l(i4);
            return bVar;
        } catch (A e3) {
            throw new IllegalArgumentException(e3);
        }
    }

    public abstract String A();

    public abstract int B();

    public abstract int C();

    public abstract long D();

    public abstract boolean E(int i3);

    public abstract void a(int i3);

    public abstract int d();

    public abstract boolean e();

    public abstract void k(int i3);

    public abstract int l(int i3);

    public abstract boolean m();

    public abstract AbstractC0417h n();

    public abstract double o();

    public abstract int p();

    public abstract int q();

    public abstract long r();

    public abstract float s();

    public abstract int t();

    public abstract long u();

    public abstract int v();

    public abstract long w();

    public abstract int x();

    public abstract long y();

    public abstract String z();

    public AbstractC0418i() {
        this.f5807b = f5805f;
        this.f5808c = Integer.MAX_VALUE;
        this.f5810e = false;
    }
}
