package P1;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class s implements B1.a {

    /* renamed from: a, reason: collision with root package name */
    public final D1.h f1736a;

    public s(byte[] bArr) {
        this.f1736a = new D1.h(bArr);
    }

    @Override // B1.a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 40);
        byte[] c3 = p.c(24);
        allocate.put(c3);
        this.f1736a.b(allocate, c3, bArr, bArr2);
        return allocate.array();
    }

    @Override // B1.a
    public byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr.length < 40) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] copyOf = Arrays.copyOf(bArr, 24);
        return this.f1736a.a(ByteBuffer.wrap(bArr, 24, bArr.length - 24), copyOf, bArr2);
    }
}
