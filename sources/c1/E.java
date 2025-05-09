package C1;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class E implements B1.a {

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f179c = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public final O1.A f180a;

    /* renamed from: b, reason: collision with root package name */
    public final B1.a f181b;

    public E(O1.A a3, B1.a aVar) {
        this.f180a = a3;
        this.f181b = aVar;
    }

    @Override // B1.a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] e3 = B1.x.j(this.f180a).e();
        return c(this.f181b.a(e3, f179c), ((B1.a) B1.x.g(this.f180a.a0(), e3, B1.a.class)).a(bArr, bArr2));
    }

    @Override // B1.a
    public byte[] b(byte[] bArr, byte[] bArr2) {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i3 = wrap.getInt();
            if (i3 <= 0 || i3 > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i3];
            wrap.get(bArr3, 0, i3);
            byte[] bArr4 = new byte[wrap.remaining()];
            wrap.get(bArr4, 0, wrap.remaining());
            return ((B1.a) B1.x.g(this.f180a.a0(), this.f181b.b(bArr3, f179c), B1.a.class)).b(bArr4, bArr2);
        } catch (IndexOutOfBoundsException e3) {
            e = e3;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (NegativeArraySizeException e4) {
            e = e4;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (BufferUnderflowException e5) {
            e = e5;
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }

    public final byte[] c(byte[] bArr, byte[] bArr2) {
        return ByteBuffer.allocate(bArr.length + 4 + bArr2.length).putInt(bArr.length).put(bArr).put(bArr2).array();
    }
}
