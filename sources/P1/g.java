package P1;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class g implements B1.a {

    /* renamed from: a, reason: collision with root package name */
    public final D1.e f1706a;

    public g(byte[] bArr) {
        this.f1706a = new D1.e(bArr);
    }

    @Override // B1.a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 28);
        byte[] c3 = p.c(12);
        allocate.put(c3);
        this.f1706a.b(allocate, c3, bArr, bArr2);
        return allocate.array();
    }

    @Override // B1.a
    public byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr.length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] copyOf = Arrays.copyOf(bArr, 12);
        return this.f1706a.a(ByteBuffer.wrap(bArr, 12, bArr.length - 12), copyOf, bArr2);
    }
}
