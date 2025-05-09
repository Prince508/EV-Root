package D1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public int[] f334a;

    /* renamed from: b, reason: collision with root package name */
    public final int f335b;

    public d(byte[] bArr, int i3) {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f334a = a.e(bArr);
        this.f335b = i3;
    }

    public ByteBuffer a(byte[] bArr, int i3) {
        int[] b3 = b(a.e(bArr), i3);
        int[] iArr = (int[]) b3.clone();
        a.d(iArr);
        for (int i4 = 0; i4 < b3.length; i4++) {
            b3[i4] = b3[i4] + iArr[i4];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(b3, 0, 16);
        return order;
    }

    public abstract int[] b(int[] iArr, int i3);

    public byte[] c(byte[] bArr, ByteBuffer byteBuffer) {
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        f(bArr, allocate, byteBuffer);
        return allocate.array();
    }

    public void d(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        if (byteBuffer.remaining() < bArr2.length) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        f(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
    }

    public abstract int e();

    public final void f(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (bArr.length != e()) {
            throw new GeneralSecurityException("The nonce length (in bytes) must be " + e());
        }
        int remaining = byteBuffer2.remaining();
        int i3 = remaining / 64;
        int i4 = i3 + 1;
        for (int i5 = 0; i5 < i4; i5++) {
            ByteBuffer a3 = a(bArr, this.f335b + i5);
            if (i5 == i3) {
                P1.f.c(byteBuffer, byteBuffer2, a3, remaining % 64);
            } else {
                P1.f.c(byteBuffer, byteBuffer2, a3, 64);
            }
        }
    }
}
