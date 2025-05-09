package com.google.crypto.tink.shaded.protobuf;

import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final b f5887a;

    public static class a {
        public static void h(byte b3, byte b4, byte b5, byte b6, char[] cArr, int i3) {
            if (m(b4) || (((b3 << 28) + (b4 + 112)) >> 30) != 0 || m(b5) || m(b6)) {
                throw A.d();
            }
            int r3 = ((b3 & 7) << 18) | (r(b4) << 12) | (r(b5) << 6) | r(b6);
            cArr[i3] = l(r3);
            cArr[i3 + 1] = q(r3);
        }

        public static void i(byte b3, char[] cArr, int i3) {
            cArr[i3] = (char) b3;
        }

        public static void j(byte b3, byte b4, byte b5, char[] cArr, int i3) {
            if (m(b4) || ((b3 == -32 && b4 < -96) || ((b3 == -19 && b4 >= -96) || m(b5)))) {
                throw A.d();
            }
            cArr[i3] = (char) (((b3 & 15) << 12) | (r(b4) << 6) | r(b5));
        }

        public static void k(byte b3, byte b4, char[] cArr, int i3) {
            if (b3 < -62 || m(b4)) {
                throw A.d();
            }
            cArr[i3] = (char) (((b3 & 31) << 6) | r(b4));
        }

        public static char l(int i3) {
            return (char) ((i3 >>> 10) + 55232);
        }

        public static boolean m(byte b3) {
            return b3 > -65;
        }

        public static boolean n(byte b3) {
            return b3 >= 0;
        }

        public static boolean o(byte b3) {
            return b3 < -16;
        }

        public static boolean p(byte b3) {
            return b3 < -32;
        }

        public static char q(int i3) {
            return (char) ((i3 & 1023) + 56320);
        }

        public static int r(byte b3) {
            return b3 & 63;
        }
    }

    public static abstract class b {
        public abstract String a(byte[] bArr, int i3, int i4);

        public abstract int b(CharSequence charSequence, byte[] bArr, int i3, int i4);

        public final boolean c(byte[] bArr, int i3, int i4) {
            return d(0, bArr, i3, i4) == 0;
        }

        public abstract int d(int i3, byte[] bArr, int i4, int i5);
    }

    public static final class c extends b {
        public static int e(byte[] bArr, int i3, int i4) {
            while (i3 < i4 && bArr[i3] >= 0) {
                i3++;
            }
            if (i3 >= i4) {
                return 0;
            }
            return f(bArr, i3, i4);
        }

        public static int f(byte[] bArr, int i3, int i4) {
            while (i3 < i4) {
                int i5 = i3 + 1;
                byte b3 = bArr[i3];
                if (b3 < 0) {
                    if (b3 < -32) {
                        if (i5 >= i4) {
                            return b3;
                        }
                        if (b3 >= -62) {
                            i3 += 2;
                            if (bArr[i5] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b3 >= -16) {
                        if (i5 >= i4 - 2) {
                            return p0.l(bArr, i5, i4);
                        }
                        int i6 = i3 + 2;
                        byte b4 = bArr[i5];
                        if (b4 <= -65 && (((b3 << 28) + (b4 + 112)) >> 30) == 0) {
                            int i7 = i3 + 3;
                            if (bArr[i6] <= -65) {
                                i3 += 4;
                                if (bArr[i7] > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                    if (i5 >= i4 - 1) {
                        return p0.l(bArr, i5, i4);
                    }
                    int i8 = i3 + 2;
                    byte b5 = bArr[i5];
                    if (b5 <= -65 && ((b3 != -32 || b5 >= -96) && (b3 != -19 || b5 < -96))) {
                        i3 += 3;
                        if (bArr[i8] > -65) {
                        }
                    }
                    return -1;
                }
                i3 = i5;
            }
            return 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p0.b
        public String a(byte[] bArr, int i3, int i4) {
            if ((i3 | i4 | ((bArr.length - i3) - i4)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i3), Integer.valueOf(i4)));
            }
            int i5 = i3 + i4;
            char[] cArr = new char[i4];
            int i6 = 0;
            while (i3 < i5) {
                byte b3 = bArr[i3];
                if (!a.n(b3)) {
                    break;
                }
                i3++;
                a.i(b3, cArr, i6);
                i6++;
            }
            int i7 = i6;
            while (i3 < i5) {
                int i8 = i3 + 1;
                byte b4 = bArr[i3];
                if (a.n(b4)) {
                    int i9 = i7 + 1;
                    a.i(b4, cArr, i7);
                    int i10 = i8;
                    while (i10 < i5) {
                        byte b5 = bArr[i10];
                        if (!a.n(b5)) {
                            break;
                        }
                        i10++;
                        a.i(b5, cArr, i9);
                        i9++;
                    }
                    i7 = i9;
                    i3 = i10;
                } else if (a.p(b4)) {
                    if (i8 >= i5) {
                        throw A.d();
                    }
                    i3 += 2;
                    a.k(b4, bArr[i8], cArr, i7);
                    i7++;
                } else if (a.o(b4)) {
                    if (i8 >= i5 - 1) {
                        throw A.d();
                    }
                    int i11 = i3 + 2;
                    i3 += 3;
                    a.j(b4, bArr[i8], bArr[i11], cArr, i7);
                    i7++;
                } else {
                    if (i8 >= i5 - 2) {
                        throw A.d();
                    }
                    byte b6 = bArr[i8];
                    int i12 = i3 + 3;
                    byte b7 = bArr[i3 + 2];
                    i3 += 4;
                    a.h(b4, b6, b7, bArr[i12], cArr, i7);
                    i7 += 2;
                }
            }
            return new String(cArr, 0, i7);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        
            return r10 + r0;
         */
        @Override // com.google.crypto.tink.shaded.protobuf.p0.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int b(java.lang.CharSequence r8, byte[] r9, int r10, int r11) {
            /*
                Method dump skipped, instructions count: 254
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.p0.c.b(java.lang.CharSequence, byte[], int, int):int");
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
        
            if (r8[r9] > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0046, code lost:
        
            if (r8[r9] > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x0083, code lost:
        
            if (r8[r7] > (-65)) goto L53;
         */
        @Override // com.google.crypto.tink.shaded.protobuf.p0.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int d(int r7, byte[] r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L86
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L1c
                r7 = -62
                if (r0 < r7) goto L1b
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
                goto L1b
            L18:
                r9 = r7
                goto L86
            L1b:
                return r2
            L1c:
                r4 = -16
                if (r0 >= r4) goto L49
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L34
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r7 < r10) goto L31
                int r7 = com.google.crypto.tink.shaded.protobuf.p0.a(r0, r9)
                return r7
            L31:
                r5 = r9
                r9 = r7
                r7 = r5
            L34:
                if (r7 > r3) goto L48
                r4 = -96
                if (r0 != r1) goto L3c
                if (r7 < r4) goto L48
            L3c:
                r1 = -19
                if (r0 != r1) goto L42
                if (r7 >= r4) goto L48
            L42:
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
            L48:
                return r2
            L49:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                if (r1 != 0) goto L5c
                int r7 = r9 + 1
                r1 = r8[r9]
                if (r7 < r10) goto L5a
                int r7 = com.google.crypto.tink.shaded.protobuf.p0.a(r0, r1)
                return r7
            L5a:
                r9 = 0
                goto L62
            L5c:
                int r7 = r7 >> 16
                byte r7 = (byte) r7
                r5 = r9
                r9 = r7
                r7 = r5
            L62:
                if (r9 != 0) goto L72
                int r9 = r7 + 1
                r7 = r8[r7]
                if (r9 < r10) goto L6f
                int r7 = com.google.crypto.tink.shaded.protobuf.p0.b(r0, r1, r7)
                return r7
            L6f:
                r5 = r9
                r9 = r7
                r7 = r5
            L72:
                if (r1 > r3) goto L85
                int r0 = r0 << 28
                int r1 = r1 + 112
                int r0 = r0 + r1
                int r0 = r0 >> 30
                if (r0 != 0) goto L85
                if (r9 > r3) goto L85
                int r9 = r7 + 1
                r7 = r8[r7]
                if (r7 <= r3) goto L86
            L85:
                return r2
            L86:
                int r7 = e(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.p0.c.d(int, byte[], int, int):int");
        }
    }

    public static class d extends IllegalArgumentException {
        public d(int i3, int i4) {
            super("Unpaired surrogate at index " + i3 + " of " + i4);
        }
    }

    public static final class e extends b {
        public static boolean e() {
            return o0.E() && o0.F();
        }

        /* JADX WARN: Code restructure failed: missing block: B:69:0x0039, code lost:
        
            return -1;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static int f(byte[] r10, long r11, int r13) {
            /*
                int r0 = g(r10, r11, r13)
                int r13 = r13 - r0
                long r0 = (long) r0
                long r11 = r11 + r0
            L7:
                r0 = 0
                r1 = r0
            L9:
                r2 = 1
                if (r13 <= 0) goto L1a
                long r4 = r11 + r2
                byte r1 = com.google.crypto.tink.shaded.protobuf.o0.u(r10, r11)
                if (r1 < 0) goto L19
                int r13 = r13 + (-1)
                r11 = r4
                goto L9
            L19:
                r11 = r4
            L1a:
                if (r13 != 0) goto L1d
                return r0
            L1d:
                int r0 = r13 + (-1)
                r4 = -32
                r5 = -1
                r6 = -65
                if (r1 >= r4) goto L3a
                if (r0 != 0) goto L29
                return r1
            L29:
                int r13 = r13 + (-2)
                r0 = -62
                if (r1 < r0) goto L39
                long r2 = r2 + r11
                byte r11 = com.google.crypto.tink.shaded.protobuf.o0.u(r10, r11)
                if (r11 <= r6) goto L37
                goto L39
            L37:
                r11 = r2
                goto L7
            L39:
                return r5
            L3a:
                r7 = -16
                r8 = 2
                if (r1 >= r7) goto L65
                r7 = 2
                if (r0 >= r7) goto L48
                int r10 = h(r10, r1, r11, r0)
                return r10
            L48:
                int r13 = r13 + (-3)
                long r2 = r2 + r11
                byte r0 = com.google.crypto.tink.shaded.protobuf.o0.u(r10, r11)
                if (r0 > r6) goto L64
                r7 = -96
                if (r1 != r4) goto L57
                if (r0 < r7) goto L64
            L57:
                r4 = -19
                if (r1 != r4) goto L5d
                if (r0 >= r7) goto L64
            L5d:
                long r11 = r11 + r8
                byte r0 = com.google.crypto.tink.shaded.protobuf.o0.u(r10, r2)
                if (r0 <= r6) goto L7
            L64:
                return r5
            L65:
                r4 = 3
                if (r0 >= r4) goto L6d
                int r10 = h(r10, r1, r11, r0)
                return r10
            L6d:
                int r13 = r13 + (-4)
                long r2 = r2 + r11
                byte r0 = com.google.crypto.tink.shaded.protobuf.o0.u(r10, r11)
                if (r0 > r6) goto L8f
                int r1 = r1 << 28
                int r0 = r0 + 112
                int r1 = r1 + r0
                int r0 = r1 >> 30
                if (r0 != 0) goto L8f
                long r8 = r8 + r11
                byte r0 = com.google.crypto.tink.shaded.protobuf.o0.u(r10, r2)
                if (r0 > r6) goto L8f
                r0 = 3
                long r11 = r11 + r0
                byte r0 = com.google.crypto.tink.shaded.protobuf.o0.u(r10, r8)
                if (r0 <= r6) goto L7
            L8f:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.p0.e.f(byte[], long, int):int");
        }

        public static int g(byte[] bArr, long j3, int i3) {
            int i4 = 0;
            if (i3 < 16) {
                return 0;
            }
            int i5 = 8 - (((int) j3) & 7);
            while (i4 < i5) {
                long j4 = 1 + j3;
                if (o0.u(bArr, j3) < 0) {
                    return i4;
                }
                i4++;
                j3 = j4;
            }
            while (true) {
                int i6 = i4 + 8;
                if (i6 > i3 || (o0.A(bArr, o0.f5864h + j3) & (-9187201950435737472L)) != 0) {
                    break;
                }
                j3 += 8;
                i4 = i6;
            }
            while (i4 < i3) {
                long j5 = j3 + 1;
                if (o0.u(bArr, j3) < 0) {
                    return i4;
                }
                i4++;
                j3 = j5;
            }
            return i3;
        }

        public static int h(byte[] bArr, int i3, long j3, int i4) {
            if (i4 == 0) {
                return p0.i(i3);
            }
            if (i4 == 1) {
                return p0.j(i3, o0.u(bArr, j3));
            }
            if (i4 == 2) {
                return p0.k(i3, o0.u(bArr, j3), o0.u(bArr, j3 + 1));
            }
            throw new AssertionError();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p0.b
        public String a(byte[] bArr, int i3, int i4) {
            Charset charset = AbstractC0434z.f6009b;
            String str = new String(bArr, i3, i4, charset);
            if (str.contains("�") && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i3, i4 + i3))) {
                throw A.d();
            }
            return str;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.p0.b
        public int b(CharSequence charSequence, byte[] bArr, int i3, int i4) {
            long j3;
            long j4;
            long j5;
            int i5;
            char charAt;
            long j6 = i3;
            long j7 = i4 + j6;
            int length = charSequence.length();
            if (length > i4 || bArr.length - i4 < i3) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i3 + i4));
            }
            int i6 = 0;
            while (true) {
                j3 = 1;
                if (i6 >= length || (charAt = charSequence.charAt(i6)) >= 128) {
                    break;
                }
                o0.K(bArr, j6, (byte) charAt);
                i6++;
                j6 = 1 + j6;
            }
            if (i6 == length) {
                return (int) j6;
            }
            while (i6 < length) {
                char charAt2 = charSequence.charAt(i6);
                if (charAt2 < 128 && j6 < j7) {
                    o0.K(bArr, j6, (byte) charAt2);
                    j5 = j7;
                    j4 = j3;
                    j6 += j3;
                } else if (charAt2 >= 2048 || j6 > j7 - 2) {
                    j4 = j3;
                    if ((charAt2 >= 55296 && 57343 >= charAt2) || j6 > j7 - 3) {
                        j5 = j7;
                        if (j6 > j5 - 4) {
                            if (55296 <= charAt2 && charAt2 <= 57343 && ((i5 = i6 + 1) == length || !Character.isSurrogatePair(charAt2, charSequence.charAt(i5)))) {
                                throw new d(i6, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + j6);
                        }
                        int i7 = i6 + 1;
                        if (i7 != length) {
                            char charAt3 = charSequence.charAt(i7);
                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                o0.K(bArr, j6, (byte) ((codePoint >>> 18) | 240));
                                o0.K(bArr, j6 + j4, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j8 = j6 + 3;
                                o0.K(bArr, j6 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                j6 += 4;
                                o0.K(bArr, j8, (byte) ((codePoint & 63) | 128));
                                i6 = i7;
                            } else {
                                i6 = i7;
                            }
                        }
                        throw new d(i6 - 1, length);
                    }
                    o0.K(bArr, j6, (byte) ((charAt2 >>> '\f') | 480));
                    long j9 = j6 + 2;
                    j5 = j7;
                    o0.K(bArr, j6 + j4, (byte) (((charAt2 >>> 6) & 63) | 128));
                    j6 += 3;
                    o0.K(bArr, j9, (byte) ((charAt2 & '?') | 128));
                } else {
                    j4 = j3;
                    long j10 = j6 + j4;
                    o0.K(bArr, j6, (byte) ((charAt2 >>> 6) | 960));
                    j6 += 2;
                    o0.K(bArr, j10, (byte) ((charAt2 & '?') | 128));
                    j5 = j7;
                }
                i6++;
                j3 = j4;
                j7 = j5;
            }
            return (int) j6;
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x0058, code lost:
        
            if (com.google.crypto.tink.shaded.protobuf.o0.u(r12, r0) > (-65)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x009e, code lost:
        
            if (com.google.crypto.tink.shaded.protobuf.o0.u(r12, r0) > (-65)) goto L59;
         */
        @Override // com.google.crypto.tink.shaded.protobuf.p0.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public int d(int r11, byte[] r12, int r13, int r14) {
            /*
                Method dump skipped, instructions count: 197
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.p0.e.d(int, byte[], int, int):int");
        }
    }

    static {
        f5887a = (!e.e() || AbstractC0413d.c()) ? new c() : new e();
    }

    public static String e(byte[] bArr, int i3, int i4) {
        return f5887a.a(bArr, i3, i4);
    }

    public static int f(CharSequence charSequence, byte[] bArr, int i3, int i4) {
        return f5887a.b(charSequence, bArr, i3, i4);
    }

    public static int g(CharSequence charSequence) {
        int length = charSequence.length();
        int i3 = 0;
        while (i3 < length && charSequence.charAt(i3) < 128) {
            i3++;
        }
        int i4 = length;
        while (true) {
            if (i3 < length) {
                char charAt = charSequence.charAt(i3);
                if (charAt >= 2048) {
                    i4 += h(charSequence, i3);
                    break;
                }
                i4 += (127 - charAt) >>> 31;
                i3++;
            } else {
                break;
            }
        }
        if (i4 >= length) {
            return i4;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i4 + 4294967296L));
    }

    public static int h(CharSequence charSequence, int i3) {
        int length = charSequence.length();
        int i4 = 0;
        while (i3 < length) {
            char charAt = charSequence.charAt(i3);
            if (charAt < 2048) {
                i4 += (127 - charAt) >>> 31;
            } else {
                i4 += 2;
                if (55296 <= charAt && charAt <= 57343) {
                    if (Character.codePointAt(charSequence, i3) < 65536) {
                        throw new d(i3, length);
                    }
                    i3++;
                }
            }
            i3++;
        }
        return i4;
    }

    public static int i(int i3) {
        if (i3 > -12) {
            return -1;
        }
        return i3;
    }

    public static int j(int i3, int i4) {
        if (i3 > -12 || i4 > -65) {
            return -1;
        }
        return i3 ^ (i4 << 8);
    }

    public static int k(int i3, int i4, int i5) {
        if (i3 > -12 || i4 > -65 || i5 > -65) {
            return -1;
        }
        return (i3 ^ (i4 << 8)) ^ (i5 << 16);
    }

    public static int l(byte[] bArr, int i3, int i4) {
        byte b3 = bArr[i3 - 1];
        int i5 = i4 - i3;
        if (i5 == 0) {
            return i(b3);
        }
        if (i5 == 1) {
            return j(b3, bArr[i3]);
        }
        if (i5 == 2) {
            return k(b3, bArr[i3], bArr[i3 + 1]);
        }
        throw new AssertionError();
    }

    public static boolean m(byte[] bArr) {
        return f5887a.c(bArr, 0, bArr.length);
    }

    public static boolean n(byte[] bArr, int i3, int i4) {
        return f5887a.c(bArr, i3, i4);
    }
}
