package androidx.datastore.preferences.protobuf;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: androidx.datastore.preferences.protobuf.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0321g {

    /* renamed from: a, reason: collision with root package name */
    public int f3636a;

    /* renamed from: b, reason: collision with root package name */
    public int f3637b;

    /* renamed from: c, reason: collision with root package name */
    public int f3638c;

    /* renamed from: d, reason: collision with root package name */
    public C0322h f3639d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3640e;

    /* renamed from: androidx.datastore.preferences.protobuf.g$b */
    public static final class b extends AbstractC0321g {

        /* renamed from: f, reason: collision with root package name */
        public final byte[] f3641f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f3642g;

        /* renamed from: h, reason: collision with root package name */
        public int f3643h;

        /* renamed from: i, reason: collision with root package name */
        public int f3644i;

        /* renamed from: j, reason: collision with root package name */
        public int f3645j;

        /* renamed from: k, reason: collision with root package name */
        public int f3646k;

        /* renamed from: l, reason: collision with root package name */
        public int f3647l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f3648m;

        /* renamed from: n, reason: collision with root package name */
        public int f3649n;

        @Override // androidx.datastore.preferences.protobuf.AbstractC0321g
        public String A() {
            int J3 = J();
            if (J3 > 0) {
                int i3 = this.f3643h;
                int i4 = this.f3645j;
                if (J3 <= i3 - i4) {
                    String e3 = k0.e(this.f3641f, i4, J3);
                    this.f3645j += J3;
                    return e3;
                }
            }
            if (J3 == 0) {
                return "";
            }
            if (J3 <= 0) {
                throw C0335v.f();
            }
            throw C0335v.k();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0321g
        public int B() {
            if (e()) {
                this.f3647l = 0;
                return 0;
            }
            int J3 = J();
            this.f3647l = J3;
            if (l0.a(J3) != 0) {
                return this.f3647l;
            }
            throw C0335v.b();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0321g
        public int C() {
            return J();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0321g
        public long D() {
            return K();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0321g
        public boolean E(int i3) {
            int b3 = l0.b(i3);
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
                a(l0.c(l0.a(i3), 4));
                return true;
            }
            if (b3 == 4) {
                return false;
            }
            if (b3 != 5) {
                throw C0335v.d();
            }
            O(4);
            return true;
        }

        public byte F() {
            int i3 = this.f3645j;
            if (i3 == this.f3643h) {
                throw C0335v.k();
            }
            byte[] bArr = this.f3641f;
            this.f3645j = i3 + 1;
            return bArr[i3];
        }

        public byte[] G(int i3) {
            if (i3 > 0) {
                int i4 = this.f3643h;
                int i5 = this.f3645j;
                if (i3 <= i4 - i5) {
                    int i6 = i3 + i5;
                    this.f3645j = i6;
                    return Arrays.copyOfRange(this.f3641f, i5, i6);
                }
            }
            if (i3 > 0) {
                throw C0335v.k();
            }
            if (i3 == 0) {
                return AbstractC0334u.f3849c;
            }
            throw C0335v.f();
        }

        public int H() {
            int i3 = this.f3645j;
            if (this.f3643h - i3 < 4) {
                throw C0335v.k();
            }
            byte[] bArr = this.f3641f;
            this.f3645j = i3 + 4;
            return ((bArr[i3 + 3] & 255) << 24) | (bArr[i3] & 255) | ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3 + 2] & 255) << 16);
        }

        public long I() {
            int i3 = this.f3645j;
            if (this.f3643h - i3 < 8) {
                throw C0335v.k();
            }
            byte[] bArr = this.f3641f;
            this.f3645j = i3 + 8;
            return ((bArr[i3 + 7] & 255) << 56) | (bArr[i3] & 255) | ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3 + 2] & 255) << 16) | ((bArr[i3 + 3] & 255) << 24) | ((bArr[i3 + 4] & 255) << 32) | ((bArr[i3 + 5] & 255) << 40) | ((bArr[i3 + 6] & 255) << 48);
        }

        public int J() {
            int i3;
            int i4 = this.f3645j;
            int i5 = this.f3643h;
            if (i5 != i4) {
                byte[] bArr = this.f3641f;
                int i6 = i4 + 1;
                byte b3 = bArr[i4];
                if (b3 >= 0) {
                    this.f3645j = i6;
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
                    this.f3645j = i7;
                    return i3;
                }
            }
            return (int) L();
        }

        public long K() {
            long j3;
            long j4;
            long j5;
            int i3 = this.f3645j;
            int i4 = this.f3643h;
            if (i4 != i3) {
                byte[] bArr = this.f3641f;
                int i5 = i3 + 1;
                byte b3 = bArr[i3];
                if (b3 >= 0) {
                    this.f3645j = i5;
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
                    this.f3645j = i6;
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
            throw C0335v.e();
        }

        public final void M() {
            int i3 = this.f3643h + this.f3644i;
            this.f3643h = i3;
            int i4 = i3 - this.f3646k;
            int i5 = this.f3649n;
            if (i4 <= i5) {
                this.f3644i = 0;
                return;
            }
            int i6 = i4 - i5;
            this.f3644i = i6;
            this.f3643h = i3 - i6;
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
                int i4 = this.f3643h;
                int i5 = this.f3645j;
                if (i3 <= i4 - i5) {
                    this.f3645j = i5 + i3;
                    return;
                }
            }
            if (i3 >= 0) {
                throw C0335v.k();
            }
            throw C0335v.f();
        }

        public final void P() {
            if (this.f3643h - this.f3645j >= 10) {
                Q();
            } else {
                R();
            }
        }

        public final void Q() {
            for (int i3 = 0; i3 < 10; i3++) {
                byte[] bArr = this.f3641f;
                int i4 = this.f3645j;
                this.f3645j = i4 + 1;
                if (bArr[i4] >= 0) {
                    return;
                }
            }
            throw C0335v.e();
        }

        public final void R() {
            for (int i3 = 0; i3 < 10; i3++) {
                if (F() >= 0) {
                    return;
                }
            }
            throw C0335v.e();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0321g
        public void a(int i3) {
            if (this.f3647l != i3) {
                throw C0335v.a();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0321g
        public int d() {
            return this.f3645j - this.f3646k;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0321g
        public boolean e() {
            return this.f3645j == this.f3643h;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0321g
        public void k(int i3) {
            this.f3649n = i3;
            M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0321g
        public int l(int i3) {
            if (i3 < 0) {
                throw C0335v.f();
            }
            int d3 = i3 + d();
            int i4 = this.f3649n;
            if (d3 > i4) {
                throw C0335v.k();
            }
            this.f3649n = d3;
            M();
            return i4;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0321g
        public boolean m() {
            return K() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0321g
        public AbstractC0320f n() {
            int J3 = J();
            if (J3 > 0) {
                int i3 = this.f3643h;
                int i4 = this.f3645j;
                if (J3 <= i3 - i4) {
                    AbstractC0320f A3 = (this.f3642g && this.f3648m) ? AbstractC0320f.A(this.f3641f, i4, J3) : AbstractC0320f.n(this.f3641f, i4, J3);
                    this.f3645j += J3;
                    return A3;
                }
            }
            return J3 == 0 ? AbstractC0320f.f3626f : AbstractC0320f.z(G(J3));
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0321g
        public double o() {
            return Double.longBitsToDouble(I());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0321g
        public int p() {
            return J();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0321g
        public int q() {
            return H();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0321g
        public long r() {
            return I();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0321g
        public float s() {
            return Float.intBitsToFloat(H());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0321g
        public int t() {
            return J();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0321g
        public long u() {
            return K();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0321g
        public int v() {
            return H();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0321g
        public long w() {
            return I();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0321g
        public int x() {
            return AbstractC0321g.b(J());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0321g
        public long y() {
            return AbstractC0321g.c(K());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0321g
        public String z() {
            int J3 = J();
            if (J3 > 0) {
                int i3 = this.f3643h;
                int i4 = this.f3645j;
                if (J3 <= i3 - i4) {
                    String str = new String(this.f3641f, i4, J3, AbstractC0334u.f3847a);
                    this.f3645j += J3;
                    return str;
                }
            }
            if (J3 == 0) {
                return "";
            }
            if (J3 < 0) {
                throw C0335v.f();
            }
            throw C0335v.k();
        }

        public b(byte[] bArr, int i3, int i4, boolean z3) {
            super();
            this.f3649n = Integer.MAX_VALUE;
            this.f3641f = bArr;
            this.f3643h = i4 + i3;
            this.f3645j = i3;
            this.f3646k = i3;
            this.f3642g = z3;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.g$c */
    public static final class c extends AbstractC0321g {

        /* renamed from: f, reason: collision with root package name */
        public final InputStream f3650f;

        /* renamed from: g, reason: collision with root package name */
        public final byte[] f3651g;

        /* renamed from: h, reason: collision with root package name */
        public int f3652h;

        /* renamed from: i, reason: collision with root package name */
        public int f3653i;

        /* renamed from: j, reason: collision with root package name */
        public int f3654j;

        /* renamed from: k, reason: collision with root package name */
        public int f3655k;

        /* renamed from: l, reason: collision with root package name */
        public int f3656l;

        /* renamed from: m, reason: collision with root package name */
        public int f3657m;

        private void P() {
            int i3 = this.f3652h + this.f3653i;
            this.f3652h = i3;
            int i4 = this.f3656l + i3;
            int i5 = this.f3657m;
            if (i4 <= i5) {
                this.f3653i = 0;
                return;
            }
            int i6 = i4 - i5;
            this.f3653i = i6;
            this.f3652h = i3 - i6;
        }

        private void U() {
            if (this.f3652h - this.f3654j >= 10) {
                V();
            } else {
                W();
            }
        }

        private void V() {
            for (int i3 = 0; i3 < 10; i3++) {
                byte[] bArr = this.f3651g;
                int i4 = this.f3654j;
                this.f3654j = i4 + 1;
                if (bArr[i4] >= 0) {
                    return;
                }
            }
            throw C0335v.e();
        }

        private void W() {
            for (int i3 = 0; i3 < 10; i3++) {
                if (G() >= 0) {
                    return;
                }
            }
            throw C0335v.e();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0321g
        public String A() {
            byte[] H3;
            int M3 = M();
            int i3 = this.f3654j;
            int i4 = this.f3652h;
            if (M3 <= i4 - i3 && M3 > 0) {
                H3 = this.f3651g;
                this.f3654j = i3 + M3;
            } else {
                if (M3 == 0) {
                    return "";
                }
                i3 = 0;
                if (M3 <= i4) {
                    Q(M3);
                    H3 = this.f3651g;
                    this.f3654j = M3;
                } else {
                    H3 = H(M3, false);
                }
            }
            return k0.e(H3, i3, M3);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0321g
        public int B() {
            if (e()) {
                this.f3655k = 0;
                return 0;
            }
            int M3 = M();
            this.f3655k = M3;
            if (l0.a(M3) != 0) {
                return this.f3655k;
            }
            throw C0335v.b();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0321g
        public int C() {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0321g
        public long D() {
            return N();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0321g
        public boolean E(int i3) {
            int b3 = l0.b(i3);
            if (b3 == 0) {
                U();
                return true;
            }
            if (b3 == 1) {
                S(8);
                return true;
            }
            if (b3 == 2) {
                S(M());
                return true;
            }
            if (b3 == 3) {
                R();
                a(l0.c(l0.a(i3), 4));
                return true;
            }
            if (b3 == 4) {
                return false;
            }
            if (b3 != 5) {
                throw C0335v.d();
            }
            S(4);
            return true;
        }

        public final AbstractC0320f F(int i3) {
            byte[] I3 = I(i3);
            if (I3 != null) {
                return AbstractC0320f.m(I3);
            }
            int i4 = this.f3654j;
            int i5 = this.f3652h;
            int i6 = i5 - i4;
            this.f3656l += i5;
            this.f3654j = 0;
            this.f3652h = 0;
            List<byte[]> J3 = J(i3 - i6);
            byte[] bArr = new byte[i3];
            System.arraycopy(this.f3651g, i4, bArr, 0, i6);
            for (byte[] bArr2 : J3) {
                System.arraycopy(bArr2, 0, bArr, i6, bArr2.length);
                i6 += bArr2.length;
            }
            return AbstractC0320f.z(bArr);
        }

        public byte G() {
            if (this.f3654j == this.f3652h) {
                Q(1);
            }
            byte[] bArr = this.f3651g;
            int i3 = this.f3654j;
            this.f3654j = i3 + 1;
            return bArr[i3];
        }

        public final byte[] H(int i3, boolean z3) {
            byte[] I3 = I(i3);
            if (I3 != null) {
                return z3 ? (byte[]) I3.clone() : I3;
            }
            int i4 = this.f3654j;
            int i5 = this.f3652h;
            int i6 = i5 - i4;
            this.f3656l += i5;
            this.f3654j = 0;
            this.f3652h = 0;
            List<byte[]> J3 = J(i3 - i6);
            byte[] bArr = new byte[i3];
            System.arraycopy(this.f3651g, i4, bArr, 0, i6);
            for (byte[] bArr2 : J3) {
                System.arraycopy(bArr2, 0, bArr, i6, bArr2.length);
                i6 += bArr2.length;
            }
            return bArr;
        }

        public final byte[] I(int i3) {
            if (i3 == 0) {
                return AbstractC0334u.f3849c;
            }
            if (i3 < 0) {
                throw C0335v.f();
            }
            int i4 = this.f3656l;
            int i5 = this.f3654j;
            int i6 = i4 + i5 + i3;
            if (i6 - this.f3638c > 0) {
                throw C0335v.j();
            }
            int i7 = this.f3657m;
            if (i6 > i7) {
                S((i7 - i4) - i5);
                throw C0335v.k();
            }
            int i8 = this.f3652h - i5;
            int i9 = i3 - i8;
            if (i9 >= 4096 && i9 > this.f3650f.available()) {
                return null;
            }
            byte[] bArr = new byte[i3];
            System.arraycopy(this.f3651g, this.f3654j, bArr, 0, i8);
            this.f3656l += this.f3652h;
            this.f3654j = 0;
            this.f3652h = 0;
            while (i8 < i3) {
                int read = this.f3650f.read(bArr, i8, i3 - i8);
                if (read == -1) {
                    throw C0335v.k();
                }
                this.f3656l += read;
                i8 += read;
            }
            return bArr;
        }

        public final List J(int i3) {
            ArrayList arrayList = new ArrayList();
            while (i3 > 0) {
                int min = Math.min(i3, 4096);
                byte[] bArr = new byte[min];
                int i4 = 0;
                while (i4 < min) {
                    int read = this.f3650f.read(bArr, i4, min - i4);
                    if (read == -1) {
                        throw C0335v.k();
                    }
                    this.f3656l += read;
                    i4 += read;
                }
                i3 -= min;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        public int K() {
            int i3 = this.f3654j;
            if (this.f3652h - i3 < 4) {
                Q(4);
                i3 = this.f3654j;
            }
            byte[] bArr = this.f3651g;
            this.f3654j = i3 + 4;
            return ((bArr[i3 + 3] & 255) << 24) | (bArr[i3] & 255) | ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3 + 2] & 255) << 16);
        }

        public long L() {
            int i3 = this.f3654j;
            if (this.f3652h - i3 < 8) {
                Q(8);
                i3 = this.f3654j;
            }
            byte[] bArr = this.f3651g;
            this.f3654j = i3 + 8;
            return ((bArr[i3 + 7] & 255) << 56) | (bArr[i3] & 255) | ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3 + 2] & 255) << 16) | ((bArr[i3 + 3] & 255) << 24) | ((bArr[i3 + 4] & 255) << 32) | ((bArr[i3 + 5] & 255) << 40) | ((bArr[i3 + 6] & 255) << 48);
        }

        public int M() {
            int i3;
            int i4 = this.f3654j;
            int i5 = this.f3652h;
            if (i5 != i4) {
                byte[] bArr = this.f3651g;
                int i6 = i4 + 1;
                byte b3 = bArr[i4];
                if (b3 >= 0) {
                    this.f3654j = i6;
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
                    this.f3654j = i7;
                    return i3;
                }
            }
            return (int) O();
        }

        public long N() {
            long j3;
            long j4;
            long j5;
            int i3 = this.f3654j;
            int i4 = this.f3652h;
            if (i4 != i3) {
                byte[] bArr = this.f3651g;
                int i5 = i3 + 1;
                byte b3 = bArr[i3];
                if (b3 >= 0) {
                    this.f3654j = i5;
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
                    this.f3654j = i6;
                    return j3;
                }
            }
            return O();
        }

        public long O() {
            long j3 = 0;
            for (int i3 = 0; i3 < 64; i3 += 7) {
                j3 |= (r3 & Byte.MAX_VALUE) << i3;
                if ((G() & 128) == 0) {
                    return j3;
                }
            }
            throw C0335v.e();
        }

        public final void Q(int i3) {
            if (X(i3)) {
                return;
            }
            if (i3 <= (this.f3638c - this.f3656l) - this.f3654j) {
                throw C0335v.k();
            }
            throw C0335v.j();
        }

        public void R() {
            int B3;
            do {
                B3 = B();
                if (B3 == 0) {
                    return;
                }
            } while (E(B3));
        }

        public void S(int i3) {
            int i4 = this.f3652h;
            int i5 = this.f3654j;
            if (i3 > i4 - i5 || i3 < 0) {
                T(i3);
            } else {
                this.f3654j = i5 + i3;
            }
        }

        public final void T(int i3) {
            if (i3 < 0) {
                throw C0335v.f();
            }
            int i4 = this.f3656l;
            int i5 = this.f3654j;
            int i6 = i4 + i5 + i3;
            int i7 = this.f3657m;
            if (i6 > i7) {
                S((i7 - i4) - i5);
                throw C0335v.k();
            }
            this.f3656l = i4 + i5;
            int i8 = this.f3652h - i5;
            this.f3652h = 0;
            this.f3654j = 0;
            while (i8 < i3) {
                try {
                    long j3 = i3 - i8;
                    long skip = this.f3650f.skip(j3);
                    if (skip < 0 || skip > j3) {
                        throw new IllegalStateException(this.f3650f.getClass() + "#skip returned invalid result: " + skip + "\nThe InputStream implementation is buggy.");
                    }
                    if (skip == 0) {
                        break;
                    } else {
                        i8 += (int) skip;
                    }
                } finally {
                    this.f3656l += i8;
                    P();
                }
            }
            if (i8 >= i3) {
                return;
            }
            int i9 = this.f3652h;
            int i10 = i9 - this.f3654j;
            this.f3654j = i9;
            Q(1);
            while (true) {
                int i11 = i3 - i10;
                int i12 = this.f3652h;
                if (i11 <= i12) {
                    this.f3654j = i11;
                    return;
                } else {
                    i10 += i12;
                    this.f3654j = i12;
                    Q(1);
                }
            }
        }

        public final boolean X(int i3) {
            int i4 = this.f3654j;
            int i5 = i4 + i3;
            int i6 = this.f3652h;
            if (i5 <= i6) {
                throw new IllegalStateException("refillBuffer() called when " + i3 + " bytes were already available in buffer");
            }
            int i7 = this.f3638c;
            int i8 = this.f3656l;
            if (i3 > (i7 - i8) - i4 || i8 + i4 + i3 > this.f3657m) {
                return false;
            }
            if (i4 > 0) {
                if (i6 > i4) {
                    byte[] bArr = this.f3651g;
                    System.arraycopy(bArr, i4, bArr, 0, i6 - i4);
                }
                this.f3656l += i4;
                this.f3652h -= i4;
                this.f3654j = 0;
            }
            InputStream inputStream = this.f3650f;
            byte[] bArr2 = this.f3651g;
            int i9 = this.f3652h;
            int read = inputStream.read(bArr2, i9, Math.min(bArr2.length - i9, (this.f3638c - this.f3656l) - i9));
            if (read == 0 || read < -1 || read > this.f3651g.length) {
                throw new IllegalStateException(this.f3650f.getClass() + "#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
            }
            if (read <= 0) {
                return false;
            }
            this.f3652h += read;
            P();
            if (this.f3652h >= i3) {
                return true;
            }
            return X(i3);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0321g
        public void a(int i3) {
            if (this.f3655k != i3) {
                throw C0335v.a();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0321g
        public int d() {
            return this.f3656l + this.f3654j;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0321g
        public boolean e() {
            return this.f3654j == this.f3652h && !X(1);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0321g
        public void k(int i3) {
            this.f3657m = i3;
            P();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0321g
        public int l(int i3) {
            if (i3 < 0) {
                throw C0335v.f();
            }
            int i4 = i3 + this.f3656l + this.f3654j;
            int i5 = this.f3657m;
            if (i4 > i5) {
                throw C0335v.k();
            }
            this.f3657m = i4;
            P();
            return i5;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0321g
        public boolean m() {
            return N() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0321g
        public AbstractC0320f n() {
            int M3 = M();
            int i3 = this.f3652h;
            int i4 = this.f3654j;
            if (M3 > i3 - i4 || M3 <= 0) {
                return M3 == 0 ? AbstractC0320f.f3626f : F(M3);
            }
            AbstractC0320f n3 = AbstractC0320f.n(this.f3651g, i4, M3);
            this.f3654j += M3;
            return n3;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0321g
        public double o() {
            return Double.longBitsToDouble(L());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0321g
        public int p() {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0321g
        public int q() {
            return K();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0321g
        public long r() {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0321g
        public float s() {
            return Float.intBitsToFloat(K());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0321g
        public int t() {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0321g
        public long u() {
            return N();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0321g
        public int v() {
            return K();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0321g
        public long w() {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0321g
        public int x() {
            return AbstractC0321g.b(M());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0321g
        public long y() {
            return AbstractC0321g.c(N());
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0321g
        public String z() {
            int M3 = M();
            if (M3 > 0) {
                int i3 = this.f3652h;
                int i4 = this.f3654j;
                if (M3 <= i3 - i4) {
                    String str = new String(this.f3651g, i4, M3, AbstractC0334u.f3847a);
                    this.f3654j += M3;
                    return str;
                }
            }
            if (M3 == 0) {
                return "";
            }
            if (M3 > this.f3652h) {
                return new String(H(M3, false), AbstractC0334u.f3847a);
            }
            Q(M3);
            String str2 = new String(this.f3651g, this.f3654j, M3, AbstractC0334u.f3847a);
            this.f3654j += M3;
            return str2;
        }

        public c(InputStream inputStream, int i3) {
            super();
            this.f3657m = Integer.MAX_VALUE;
            AbstractC0334u.b(inputStream, "input");
            this.f3650f = inputStream;
            this.f3651g = new byte[i3];
            this.f3652h = 0;
            this.f3654j = 0;
            this.f3656l = 0;
        }
    }

    public static int b(int i3) {
        return (-(i3 & 1)) ^ (i3 >>> 1);
    }

    public static long c(long j3) {
        return (-(j3 & 1)) ^ (j3 >>> 1);
    }

    public static AbstractC0321g f(InputStream inputStream) {
        return g(inputStream, 4096);
    }

    public static AbstractC0321g g(InputStream inputStream, int i3) {
        if (i3 > 0) {
            return inputStream == null ? h(AbstractC0334u.f3849c) : new c(inputStream, i3);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static AbstractC0321g h(byte[] bArr) {
        return i(bArr, 0, bArr.length);
    }

    public static AbstractC0321g i(byte[] bArr, int i3, int i4) {
        return j(bArr, i3, i4, false);
    }

    public static AbstractC0321g j(byte[] bArr, int i3, int i4, boolean z3) {
        b bVar = new b(bArr, i3, i4, z3);
        try {
            bVar.l(i4);
            return bVar;
        } catch (C0335v e3) {
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

    public abstract AbstractC0320f n();

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

    public AbstractC0321g() {
        this.f3637b = 100;
        this.f3638c = Integer.MAX_VALUE;
        this.f3640e = false;
    }
}
