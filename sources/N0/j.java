package N0;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public final ByteBuffer f1455a;

    public j(ByteBuffer byteBuffer) {
        this.f1455a = byteBuffer.slice();
    }

    public ByteBuffer a() {
        return this.f1455a.slice();
    }

    public j(byte[] bArr) {
        this.f1455a = ByteBuffer.wrap(bArr);
    }
}
