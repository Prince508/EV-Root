package P1;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f1689a = Charset.forName("UTF-8");

    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        public byte[] f1690a;

        /* renamed from: b, reason: collision with root package name */
        public int f1691b;
    }

    public static class b extends a {

        /* renamed from: f, reason: collision with root package name */
        public static final int[] f1692f = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* renamed from: g, reason: collision with root package name */
        public static final int[] f1693g = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* renamed from: c, reason: collision with root package name */
        public int f1694c;

        /* renamed from: d, reason: collision with root package name */
        public int f1695d;

        /* renamed from: e, reason: collision with root package name */
        public final int[] f1696e;

        public b(int i3, byte[] bArr) {
            this.f1690a = bArr;
            this.f1696e = (i3 & 8) == 0 ? f1692f : f1693g;
            this.f1694c = 0;
            this.f1695d = 0;
        }

        public boolean a(byte[] bArr, int i3, int i4, boolean z3) {
            int i5 = this.f1694c;
            if (i5 == 6) {
                return false;
            }
            int i6 = i4 + i3;
            int i7 = this.f1695d;
            byte[] bArr2 = this.f1690a;
            int[] iArr = this.f1696e;
            int i8 = 0;
            int i9 = i7;
            int i10 = i5;
            int i11 = i3;
            while (i11 < i6) {
                if (i10 == 0) {
                    while (true) {
                        int i12 = i11 + 4;
                        if (i12 > i6 || (i9 = (iArr[bArr[i11] & 255] << 18) | (iArr[bArr[i11 + 1] & 255] << 12) | (iArr[bArr[i11 + 2] & 255] << 6) | iArr[bArr[i11 + 3] & 255]) < 0) {
                            break;
                        }
                        bArr2[i8 + 2] = (byte) i9;
                        bArr2[i8 + 1] = (byte) (i9 >> 8);
                        bArr2[i8] = (byte) (i9 >> 16);
                        i8 += 3;
                        i11 = i12;
                    }
                    if (i11 >= i6) {
                        break;
                    }
                }
                int i13 = i11 + 1;
                int i14 = iArr[bArr[i11] & 255];
                if (i10 != 0) {
                    if (i10 == 1) {
                        if (i14 < 0) {
                            if (i14 != -1) {
                                this.f1694c = 6;
                                return false;
                            }
                        }
                        i14 |= i9 << 6;
                    } else if (i10 == 2) {
                        if (i14 < 0) {
                            if (i14 == -2) {
                                bArr2[i8] = (byte) (i9 >> 4);
                                i8++;
                                i10 = 4;
                            } else if (i14 != -1) {
                                this.f1694c = 6;
                                return false;
                            }
                        }
                        i14 |= i9 << 6;
                    } else if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 == 5 && i14 != -1) {
                                this.f1694c = 6;
                                return false;
                            }
                        } else if (i14 == -2) {
                            i10++;
                        } else if (i14 != -1) {
                            this.f1694c = 6;
                            return false;
                        }
                    } else if (i14 >= 0) {
                        int i15 = i14 | (i9 << 6);
                        bArr2[i8 + 2] = (byte) i15;
                        bArr2[i8 + 1] = (byte) (i15 >> 8);
                        bArr2[i8] = (byte) (i15 >> 16);
                        i8 += 3;
                        i9 = i15;
                        i10 = 0;
                    } else if (i14 == -2) {
                        bArr2[i8 + 1] = (byte) (i9 >> 2);
                        bArr2[i8] = (byte) (i9 >> 10);
                        i8 += 2;
                        i10 = 5;
                    } else if (i14 != -1) {
                        this.f1694c = 6;
                        return false;
                    }
                    i10++;
                    i9 = i14;
                } else {
                    if (i14 < 0) {
                        if (i14 != -1) {
                            this.f1694c = 6;
                            return false;
                        }
                    }
                    i10++;
                    i9 = i14;
                }
                i11 = i13;
            }
            if (!z3) {
                this.f1694c = i10;
                this.f1695d = i9;
                this.f1691b = i8;
                return true;
            }
            if (i10 == 1) {
                this.f1694c = 6;
                return false;
            }
            if (i10 == 2) {
                bArr2[i8] = (byte) (i9 >> 4);
                i8++;
            } else if (i10 == 3) {
                int i16 = i8 + 1;
                bArr2[i8] = (byte) (i9 >> 10);
                i8 += 2;
                bArr2[i16] = (byte) (i9 >> 2);
            } else if (i10 == 4) {
                this.f1694c = 6;
                return false;
            }
            this.f1694c = i10;
            this.f1691b = i8;
            return true;
        }
    }

    public static class c extends a {

        /* renamed from: j, reason: collision with root package name */
        public static final byte[] f1697j = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

        /* renamed from: k, reason: collision with root package name */
        public static final byte[] f1698k = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f1699c;

        /* renamed from: d, reason: collision with root package name */
        public int f1700d;

        /* renamed from: e, reason: collision with root package name */
        public int f1701e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f1702f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f1703g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f1704h;

        /* renamed from: i, reason: collision with root package name */
        public final byte[] f1705i;

        public c(int i3, byte[] bArr) {
            this.f1690a = bArr;
            this.f1702f = (i3 & 1) == 0;
            boolean z3 = (i3 & 2) == 0;
            this.f1703g = z3;
            this.f1704h = (i3 & 4) != 0;
            this.f1705i = (i3 & 8) == 0 ? f1697j : f1698k;
            this.f1699c = new byte[2];
            this.f1700d = 0;
            this.f1701e = z3 ? 19 : -1;
        }

        public boolean a(byte[] bArr, int i3, int i4, boolean z3) {
            int i5;
            int i6;
            int i7;
            int i8;
            byte b3;
            byte b4;
            byte b5;
            int i9;
            int i10;
            byte[] bArr2 = this.f1705i;
            byte[] bArr3 = this.f1690a;
            int i11 = this.f1701e;
            int i12 = i4 + i3;
            int i13 = this.f1700d;
            char c3 = 2;
            int i14 = 0;
            if (i13 != 1) {
                if (i13 == 2 && (i10 = i3 + 1) <= i12) {
                    byte[] bArr4 = this.f1699c;
                    i6 = ((bArr4[1] & 255) << 8) | ((bArr4[0] & 255) << 16) | (bArr[i3] & 255);
                    this.f1700d = 0;
                    i5 = i10;
                }
                i5 = i3;
                i6 = -1;
            } else {
                if (i3 + 2 <= i12) {
                    i5 = i3 + 2;
                    i6 = (bArr[i3 + 1] & 255) | ((this.f1699c[0] & 255) << 16) | ((bArr[i3] & 255) << 8);
                    this.f1700d = 0;
                }
                i5 = i3;
                i6 = -1;
            }
            if (i6 != -1) {
                bArr3[0] = bArr2[(i6 >> 18) & 63];
                bArr3[1] = bArr2[(i6 >> 12) & 63];
                bArr3[2] = bArr2[(i6 >> 6) & 63];
                bArr3[3] = bArr2[i6 & 63];
                i11--;
                if (i11 == 0) {
                    if (this.f1704h) {
                        bArr3[4] = 13;
                        i9 = 5;
                    } else {
                        i9 = 4;
                    }
                    i7 = i9 + 1;
                    bArr3[i9] = 10;
                    i11 = 19;
                } else {
                    i7 = 4;
                }
            } else {
                i7 = 0;
            }
            while (true) {
                int i15 = i5 + 3;
                if (i15 > i12) {
                    break;
                }
                char c4 = c3;
                int i16 = ((bArr[i5 + 1] & 255) << 8) | ((bArr[i5] & 255) << 16) | (bArr[i5 + 2] & 255);
                bArr3[i7] = bArr2[(i16 >> 18) & 63];
                bArr3[i7 + 1] = bArr2[(i16 >> 12) & 63];
                bArr3[i7 + 2] = bArr2[(i16 >> 6) & 63];
                bArr3[i7 + 3] = bArr2[i16 & 63];
                int i17 = i7 + 4;
                i11--;
                if (i11 == 0) {
                    if (this.f1704h) {
                        bArr3[i17] = 13;
                        i17 = i7 + 5;
                    }
                    i7 = i17 + 1;
                    bArr3[i17] = 10;
                    c3 = c4;
                    i11 = 19;
                    i5 = i15;
                } else {
                    i7 = i17;
                    i5 = i15;
                    c3 = c4;
                }
            }
            if (z3) {
                int i18 = this.f1700d;
                if (i5 - i18 == i12 - 1) {
                    if (i18 > 0) {
                        b5 = this.f1699c[0];
                        i14 = 1;
                    } else {
                        b5 = bArr[i5];
                    }
                    int i19 = (b5 & 255) << 4;
                    this.f1700d = i18 - i14;
                    bArr3[i7] = bArr2[(i19 >> 6) & 63];
                    int i20 = i7 + 2;
                    bArr3[i7 + 1] = bArr2[i19 & 63];
                    if (this.f1702f) {
                        bArr3[i20] = 61;
                        i20 = i7 + 4;
                        bArr3[i7 + 3] = 61;
                    }
                    if (this.f1703g) {
                        if (this.f1704h) {
                            bArr3[i20] = 13;
                            i20++;
                        }
                        i8 = i20 + 1;
                        bArr3[i20] = 10;
                        i7 = i8;
                    } else {
                        i7 = i20;
                    }
                } else if (i5 - i18 == i12 - 2) {
                    if (i18 > 1) {
                        b3 = this.f1699c[0];
                        i14 = 1;
                    } else {
                        byte b6 = bArr[i5];
                        i5++;
                        b3 = b6;
                    }
                    int i21 = (b3 & 255) << 10;
                    if (i18 > 0) {
                        b4 = this.f1699c[i14];
                        i14++;
                    } else {
                        b4 = bArr[i5];
                    }
                    int i22 = i21 | ((b4 & 255) << 2);
                    this.f1700d = i18 - i14;
                    bArr3[i7] = bArr2[(i22 >> 12) & 63];
                    bArr3[i7 + 1] = bArr2[(i22 >> 6) & 63];
                    int i23 = i7 + 3;
                    bArr3[i7 + 2] = bArr2[i22 & 63];
                    if (this.f1702f) {
                        bArr3[i23] = 61;
                        i23 = i7 + 4;
                    }
                    if (this.f1703g) {
                        if (this.f1704h) {
                            bArr3[i23] = 13;
                            i23++;
                        }
                        i8 = i23 + 1;
                        bArr3[i23] = 10;
                        i7 = i8;
                    } else {
                        i7 = i23;
                    }
                } else if (this.f1703g && i7 > 0 && i11 != 19) {
                    if (this.f1704h) {
                        bArr3[i7] = 13;
                        i7++;
                    }
                    i8 = i7 + 1;
                    bArr3[i7] = 10;
                    i7 = i8;
                }
            } else if (i5 == i12 - 1) {
                byte[] bArr5 = this.f1699c;
                int i24 = this.f1700d;
                this.f1700d = i24 + 1;
                bArr5[i24] = bArr[i5];
            } else if (i5 == i12 - 2) {
                byte[] bArr6 = this.f1699c;
                int i25 = this.f1700d;
                int i26 = i25 + 1;
                this.f1700d = i26;
                bArr6[i25] = bArr[i5];
                this.f1700d = i25 + 2;
                bArr6[i26] = bArr[i5 + 1];
            }
            this.f1691b = i7;
            this.f1701e = i11;
            return true;
        }
    }

    public static byte[] a(String str, int i3) {
        return b(str.getBytes(f1689a), i3);
    }

    public static byte[] b(byte[] bArr, int i3) {
        return c(bArr, 0, bArr.length, i3);
    }

    public static byte[] c(byte[] bArr, int i3, int i4, int i5) {
        b bVar = new b(i5, new byte[(i4 * 3) / 4]);
        if (!bVar.a(bArr, i3, i4, true)) {
            throw new IllegalArgumentException("bad base-64");
        }
        int i6 = bVar.f1691b;
        byte[] bArr2 = bVar.f1690a;
        if (i6 == bArr2.length) {
            return bArr2;
        }
        byte[] bArr3 = new byte[i6];
        System.arraycopy(bArr2, 0, bArr3, 0, i6);
        return bArr3;
    }

    public static String d(byte[] bArr) {
        return g(bArr, 2);
    }

    public static byte[] e(byte[] bArr, int i3) {
        return f(bArr, 0, bArr.length, i3);
    }

    public static byte[] f(byte[] bArr, int i3, int i4, int i5) {
        c cVar = new c(i5, null);
        int i6 = (i4 / 3) * 4;
        if (!cVar.f1702f) {
            int i7 = i4 % 3;
            if (i7 == 1) {
                i6 += 2;
            } else if (i7 == 2) {
                i6 += 3;
            }
        } else if (i4 % 3 > 0) {
            i6 += 4;
        }
        if (cVar.f1703g && i4 > 0) {
            i6 += (((i4 - 1) / 57) + 1) * (cVar.f1704h ? 2 : 1);
        }
        cVar.f1690a = new byte[i6];
        cVar.a(bArr, i3, i4, true);
        return cVar.f1690a;
    }

    public static String g(byte[] bArr, int i3) {
        try {
            return new String(e(bArr, i3), "US-ASCII");
        } catch (UnsupportedEncodingException e3) {
            throw new AssertionError(e3);
        }
    }
}
