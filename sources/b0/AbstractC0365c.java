package b0;

import java.nio.ByteBuffer;

/* renamed from: b0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0365c {

    /* renamed from: a, reason: collision with root package name */
    public int f4698a;

    /* renamed from: b, reason: collision with root package name */
    public ByteBuffer f4699b;

    /* renamed from: c, reason: collision with root package name */
    public int f4700c;

    /* renamed from: d, reason: collision with root package name */
    public int f4701d;

    /* renamed from: e, reason: collision with root package name */
    public AbstractC0366d f4702e = AbstractC0366d.a();

    public int a(int i3) {
        return i3 + this.f4699b.getInt(i3);
    }

    public int b(int i3) {
        if (i3 < this.f4701d) {
            return this.f4699b.getShort(this.f4700c + i3);
        }
        return 0;
    }

    public void c(int i3, ByteBuffer byteBuffer) {
        this.f4699b = byteBuffer;
        if (byteBuffer == null) {
            this.f4698a = 0;
            this.f4700c = 0;
            this.f4701d = 0;
        } else {
            this.f4698a = i3;
            int i4 = i3 - byteBuffer.getInt(i3);
            this.f4700c = i4;
            this.f4701d = this.f4699b.getShort(i4);
        }
    }

    public int d(int i3) {
        int i4 = i3 + this.f4698a;
        return i4 + this.f4699b.getInt(i4) + 4;
    }

    public int e(int i3) {
        int i4 = i3 + this.f4698a;
        return this.f4699b.getInt(i4 + this.f4699b.getInt(i4));
    }
}
