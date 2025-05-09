package D1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f329a = e(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    public static void a(int[] iArr, int i3, int i4, int i5, int i6) {
        int i7 = iArr[i3] + iArr[i4];
        iArr[i3] = i7;
        int b3 = b(i7 ^ iArr[i6], 16);
        iArr[i6] = b3;
        int i8 = iArr[i5] + b3;
        iArr[i5] = i8;
        int b4 = b(iArr[i4] ^ i8, 12);
        iArr[i4] = b4;
        int i9 = iArr[i3] + b4;
        iArr[i3] = i9;
        int b5 = b(iArr[i6] ^ i9, 8);
        iArr[i6] = b5;
        int i10 = iArr[i5] + b5;
        iArr[i5] = i10;
        iArr[i4] = b(iArr[i4] ^ i10, 7);
    }

    public static int b(int i3, int i4) {
        return (i3 >>> (-i4)) | (i3 << i4);
    }

    public static void c(int[] iArr, int[] iArr2) {
        int[] iArr3 = f329a;
        System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
        System.arraycopy(iArr2, 0, iArr, iArr3.length, 8);
    }

    public static void d(int[] iArr) {
        for (int i3 = 0; i3 < 10; i3++) {
            a(iArr, 0, 4, 8, 12);
            a(iArr, 1, 5, 9, 13);
            a(iArr, 2, 6, 10, 14);
            a(iArr, 3, 7, 11, 15);
            a(iArr, 0, 5, 10, 15);
            a(iArr, 1, 6, 11, 12);
            a(iArr, 2, 7, 8, 13);
            a(iArr, 3, 4, 9, 14);
        }
    }

    public static int[] e(byte[] bArr) {
        IntBuffer asIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }
}
