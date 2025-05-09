package O0;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class e implements c {

    /* renamed from: a, reason: collision with root package name */
    public final ByteBuffer f1533a;

    public e(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            throw new NullPointerException("buf == null");
        }
        this.f1533a = byteBuffer;
    }

    @Override // O0.c
    public a a() {
        int position;
        int f3;
        int position2 = this.f1533a.position();
        if (!this.f1533a.hasRemaining()) {
            return null;
        }
        byte b3 = this.f1533a.get();
        int e3 = e(b3);
        boolean e4 = d.e(b3);
        if (!this.f1533a.hasRemaining()) {
            throw new b("Missing length");
        }
        byte b4 = this.f1533a.get();
        int i3 = b4 & 255;
        if ((b4 & 128) == 0) {
            f3 = d(i3);
            position = this.f1533a.position() - position2;
            g(f3);
        } else if (i3 != 128) {
            f3 = c(i3);
            position = this.f1533a.position() - position2;
            g(f3);
        } else {
            position = this.f1533a.position() - position2;
            f3 = e4 ? f() : h();
        }
        int position3 = this.f1533a.position();
        this.f1533a.position(position2);
        int limit = this.f1533a.limit();
        this.f1533a.limit(position3);
        ByteBuffer slice = this.f1533a.slice();
        ByteBuffer byteBuffer = this.f1533a;
        byteBuffer.position(byteBuffer.limit());
        this.f1533a.limit(limit);
        slice.position(position);
        slice.limit(position + f3);
        ByteBuffer slice2 = slice.slice();
        slice.clear();
        return new a(slice, slice2, d.a(b3), e4, e3);
    }

    public final int b() {
        int i3 = 0;
        while (this.f1533a.hasRemaining()) {
            byte b3 = this.f1533a.get();
            if (i3 > 16777215) {
                throw new b("Tag number too large");
            }
            i3 = (i3 << 7) | (b3 & Byte.MAX_VALUE);
            if ((b3 & 128) == 0) {
                return i3;
            }
        }
        throw new b("Truncated tag number");
    }

    public final int c(int i3) {
        int i4 = i3 & 127;
        if (i4 > 4) {
            throw new b("Length too large: " + i4 + " bytes");
        }
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            if (!this.f1533a.hasRemaining()) {
                throw new b("Truncated length");
            }
            byte b3 = this.f1533a.get();
            if (i5 > 8388607) {
                throw new b("Length too large");
            }
            i5 = (i5 << 8) | (b3 & 255);
        }
        return i5;
    }

    public final int d(int i3) {
        return i3 & 127;
    }

    public final int e(byte b3) {
        int c3 = d.c(b3);
        return c3 == 31 ? b() : c3;
    }

    public final int f() {
        int position = this.f1533a.position();
        while (this.f1533a.hasRemaining()) {
            if (this.f1533a.remaining() > 1) {
                ByteBuffer byteBuffer = this.f1533a;
                if (byteBuffer.getShort(byteBuffer.position()) == 0) {
                    int position2 = this.f1533a.position() - position;
                    ByteBuffer byteBuffer2 = this.f1533a;
                    byteBuffer2.position(byteBuffer2.position() + 2);
                    return position2;
                }
            }
            a();
        }
        throw new b("Truncated indefinite-length contents: " + (this.f1533a.position() - position) + " bytes read");
    }

    public final void g(int i3) {
        if (this.f1533a.remaining() >= i3) {
            ByteBuffer byteBuffer = this.f1533a;
            byteBuffer.position(byteBuffer.position() + i3);
            return;
        }
        throw new b("Truncated contents. Need: " + i3 + " bytes, available: " + this.f1533a.remaining());
    }

    public final int h() {
        int i3 = 0;
        boolean z3 = false;
        while (this.f1533a.hasRemaining()) {
            byte b3 = this.f1533a.get();
            int i4 = i3 + 1;
            if (i4 < 0) {
                throw new b("Indefinite-length contents too long");
            }
            if (b3 != 0) {
                z3 = false;
            } else {
                if (z3) {
                    return i3 - 1;
                }
                z3 = true;
            }
            i3 = i4;
        }
        throw new b("Truncated indefinite-length contents: " + i3 + " bytes read");
    }
}
