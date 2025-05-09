package D1;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class i {
    public static byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("The key length in bytes must be 32.");
        }
        long c3 = c(bArr, 0, 0) & 67108863;
        int i3 = 3;
        int i4 = 2;
        long c4 = c(bArr, 3, 2) & 67108611;
        long c5 = c(bArr, 6, 4) & 67092735;
        long c6 = c(bArr, 9, 6) & 66076671;
        long c7 = c(bArr, 12, 8) & 1048575;
        long j3 = c4 * 5;
        long j4 = c5 * 5;
        long j5 = c6 * 5;
        long j6 = c7 * 5;
        byte[] bArr3 = new byte[17];
        long j7 = 0;
        int i5 = 0;
        long j8 = 0;
        long j9 = 0;
        long j10 = 0;
        long j11 = 0;
        while (i5 < bArr2.length) {
            b(bArr3, bArr2, i5);
            long c8 = j11 + c(bArr3, 0, 0);
            long c9 = j7 + c(bArr3, i3, i4);
            long c10 = j8 + c(bArr3, 6, 4);
            long c11 = j9 + c(bArr3, 9, 6);
            long j12 = c4;
            long c12 = j10 + (c(bArr3, 12, 8) | (bArr3[16] << 24));
            long j13 = (c8 * c3) + (c9 * j6) + (c10 * j5) + (c11 * j4) + (c12 * j3);
            long j14 = (c8 * j12) + (c9 * c3) + (c10 * j6) + (c11 * j5) + (c12 * j4);
            long j15 = (c8 * c5) + (c9 * j12) + (c10 * c3) + (c11 * j6) + (c12 * j5);
            long j16 = (c8 * c6) + (c9 * c5) + (c10 * j12) + (c11 * c3) + (c12 * j6);
            long j17 = (c8 * c7) + (c9 * c6) + (c10 * c5) + (c11 * j12) + (c12 * c3);
            long j18 = j14 + (j13 >> 26);
            long j19 = j15 + (j18 >> 26);
            j8 = j19 & 67108863;
            long j20 = j16 + (j19 >> 26);
            j9 = j20 & 67108863;
            long j21 = j17 + (j20 >> 26);
            j10 = j21 & 67108863;
            long j22 = (j13 & 67108863) + ((j21 >> 26) * 5);
            j11 = j22 & 67108863;
            j7 = (j18 & 67108863) + (j22 >> 26);
            i5 += 16;
            c4 = j12;
            i3 = 3;
            i4 = 2;
        }
        long j23 = j8 + (j7 >> 26);
        long j24 = j23 & 67108863;
        long j25 = j9 + (j23 >> 26);
        long j26 = j25 & 67108863;
        long j27 = j10 + (j25 >> 26);
        long j28 = j27 & 67108863;
        long j29 = j11 + ((j27 >> 26) * 5);
        long j30 = j29 & 67108863;
        long j31 = (j7 & 67108863) + (j29 >> 26);
        long j32 = j30 + 5;
        long j33 = j32 & 67108863;
        long j34 = (j32 >> 26) + j31;
        long j35 = j24 + (j34 >> 26);
        long j36 = j26 + (j35 >> 26);
        long j37 = j36 & 67108863;
        long j38 = (j28 + (j36 >> 26)) - 67108864;
        long j39 = j38 >> 63;
        long j40 = j30 & j39;
        long j41 = j31 & j39;
        long j42 = j24 & j39;
        long j43 = j26 & j39;
        long j44 = j28 & j39;
        long j45 = ~j39;
        long j46 = (j34 & 67108863 & j45) | j41;
        long j47 = (j35 & 67108863 & j45) | j42;
        long j48 = (j37 & j45) | j43;
        long j49 = j44 | (j38 & j45);
        long j50 = (j40 | (j33 & j45) | (j46 << 26)) & 4294967295L;
        long j51 = ((j46 >> 6) | (j47 << 20)) & 4294967295L;
        long j52 = ((j47 >> 12) | (j48 << 14)) & 4294967295L;
        long j53 = ((j48 >> 18) | (j49 << 8)) & 4294967295L;
        long d3 = j50 + d(bArr, 16);
        long j54 = d3 & 4294967295L;
        long d4 = j51 + d(bArr, 20) + (d3 >> 32);
        long j55 = d4 & 4294967295L;
        long d5 = j52 + d(bArr, 24) + (d4 >> 32);
        long j56 = d5 & 4294967295L;
        long d6 = (j53 + d(bArr, 28) + (d5 >> 32)) & 4294967295L;
        byte[] bArr4 = new byte[16];
        e(bArr4, j54, 0);
        e(bArr4, j55, 4);
        e(bArr4, j56, 8);
        e(bArr4, d6, 12);
        return bArr4;
    }

    public static void b(byte[] bArr, byte[] bArr2, int i3) {
        int min = Math.min(16, bArr2.length - i3);
        System.arraycopy(bArr2, i3, bArr, 0, min);
        bArr[min] = 1;
        if (min != 16) {
            Arrays.fill(bArr, min + 1, bArr.length, (byte) 0);
        }
    }

    public static long c(byte[] bArr, int i3, int i4) {
        return (d(bArr, i3) >> i4) & 67108863;
    }

    public static long d(byte[] bArr, int i3) {
        return (((bArr[i3 + 3] & 255) << 24) | (bArr[i3] & 255) | ((bArr[i3 + 1] & 255) << 8) | ((bArr[i3 + 2] & 255) << 16)) & 4294967295L;
    }

    public static void e(byte[] bArr, long j3, int i3) {
        int i4 = 0;
        while (i4 < 4) {
            bArr[i3 + i4] = (byte) (255 & j3);
            i4++;
            j3 >>= 8;
        }
    }

    public static void f(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (!P1.f.b(a(bArr, bArr2), bArr3)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }
}
