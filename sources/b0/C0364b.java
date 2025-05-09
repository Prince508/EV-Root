package b0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: b0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0364b extends AbstractC0365c {
    public static C0364b h(ByteBuffer byteBuffer) {
        return i(byteBuffer, new C0364b());
    }

    public static C0364b i(ByteBuffer byteBuffer, C0364b c0364b) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return c0364b.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public C0364b f(int i3, ByteBuffer byteBuffer) {
        g(i3, byteBuffer);
        return this;
    }

    public void g(int i3, ByteBuffer byteBuffer) {
        c(i3, byteBuffer);
    }

    public C0363a j(C0363a c0363a, int i3) {
        int b3 = b(6);
        if (b3 != 0) {
            return c0363a.f(a(d(b3) + (i3 * 4)), this.f4699b);
        }
        return null;
    }

    public int k() {
        int b3 = b(6);
        if (b3 != 0) {
            return e(b3);
        }
        return 0;
    }

    public int l() {
        int b3 = b(4);
        if (b3 != 0) {
            return this.f4699b.getInt(b3 + this.f4698a);
        }
        return 0;
    }
}
