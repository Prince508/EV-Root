package R0;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class b implements U0.a {

    /* renamed from: e, reason: collision with root package name */
    public final ByteBuffer f1857e;

    public b(ByteBuffer byteBuffer) {
        this.f1857e = byteBuffer;
    }

    @Override // U0.a
    public void a(byte[] bArr, int i3, int i4) {
        try {
            this.f1857e.put(bArr, i3, i4);
        } catch (BufferOverflowException e3) {
            throw new IOException("Insufficient space in output buffer for " + i4 + " bytes", e3);
        }
    }

    @Override // U0.a
    public void b(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        try {
            this.f1857e.put(byteBuffer);
        } catch (BufferOverflowException e3) {
            throw new IOException("Insufficient space in output buffer for " + remaining + " bytes", e3);
        }
    }
}
