package R0;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public class i implements U0.a {

    /* renamed from: e, reason: collision with root package name */
    public final MessageDigest[] f1866e;

    public i(MessageDigest[] messageDigestArr) {
        this.f1866e = messageDigestArr;
    }

    @Override // U0.a
    public void a(byte[] bArr, int i3, int i4) {
        for (MessageDigest messageDigest : this.f1866e) {
            messageDigest.update(bArr, i3, i4);
        }
    }

    @Override // U0.a
    public void b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        for (MessageDigest messageDigest : this.f1866e) {
            byteBuffer.position(position);
            messageDigest.update(byteBuffer);
        }
    }
}
