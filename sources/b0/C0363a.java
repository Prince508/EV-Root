package b0;

import java.nio.ByteBuffer;

/* renamed from: b0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0363a extends AbstractC0365c {
    public C0363a f(int i3, ByteBuffer byteBuffer) {
        g(i3, byteBuffer);
        return this;
    }

    public void g(int i3, ByteBuffer byteBuffer) {
        c(i3, byteBuffer);
    }

    public int h(int i3) {
        int b3 = b(16);
        if (b3 != 0) {
            return this.f4699b.getInt(d(b3) + (i3 * 4));
        }
        return 0;
    }

    public int i() {
        int b3 = b(16);
        if (b3 != 0) {
            return e(b3);
        }
        return 0;
    }

    public boolean j() {
        int b3 = b(6);
        return (b3 == 0 || this.f4699b.get(b3 + this.f4698a) == 0) ? false : true;
    }

    public short k() {
        int b3 = b(14);
        if (b3 != 0) {
            return this.f4699b.getShort(b3 + this.f4698a);
        }
        return (short) 0;
    }

    public int l() {
        int b3 = b(4);
        if (b3 != 0) {
            return this.f4699b.getInt(b3 + this.f4698a);
        }
        return 0;
    }

    public short m() {
        int b3 = b(8);
        if (b3 != 0) {
            return this.f4699b.getShort(b3 + this.f4698a);
        }
        return (short) 0;
    }

    public short n() {
        int b3 = b(12);
        if (b3 != 0) {
            return this.f4699b.getShort(b3 + this.f4698a);
        }
        return (short) 0;
    }
}
