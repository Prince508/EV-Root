package P1;

import B1.t;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes.dex */
public class o implements t {

    /* renamed from: a, reason: collision with root package name */
    public final N1.a f1731a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1732b;

    public o(N1.a aVar, int i3) {
        this.f1731a = aVar;
        this.f1732b = i3;
        if (i3 < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        aVar.a(new byte[0], i3);
    }

    @Override // B1.t
    public void a(byte[] bArr, byte[] bArr2) {
        if (!f.b(b(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    @Override // B1.t
    public byte[] b(byte[] bArr) {
        return this.f1731a.a(bArr, this.f1732b);
    }
}
