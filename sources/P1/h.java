package P1;

import B1.t;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class h implements B1.a {

    /* renamed from: a, reason: collision with root package name */
    public final l f1707a;

    /* renamed from: b, reason: collision with root package name */
    public final t f1708b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1709c;

    public h(l lVar, t tVar, int i3) {
        this.f1707a = lVar;
        this.f1708b = tVar;
        this.f1709c = i3;
    }

    @Override // B1.a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] a3 = this.f1707a.a(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return f.a(a3, this.f1708b.b(f.a(bArr2, a3, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))));
    }

    @Override // B1.a
    public byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i3 = this.f1709c;
        if (length < i3) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length - i3);
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - this.f1709c, bArr.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        this.f1708b.a(copyOfRange2, f.a(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8)));
        return this.f1707a.b(copyOfRange);
    }
}
