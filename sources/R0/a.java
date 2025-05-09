package R0;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class a implements U0.c {

    /* renamed from: a, reason: collision with root package name */
    public final ByteBuffer f1855a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1856b;

    public a(ByteBuffer byteBuffer) {
        this(byteBuffer, true);
    }

    @Override // U0.c
    public void a(long j3, long j4, U0.a aVar) {
        if (j4 >= 0 && j4 <= this.f1856b) {
            aVar.b(c(j3, (int) j4));
            return;
        }
        throw new IndexOutOfBoundsException("size: " + j4 + ", source size: " + this.f1856b);
    }

    @Override // U0.c
    public ByteBuffer c(long j3, int i3) {
        ByteBuffer slice;
        e(j3, i3);
        int i4 = (int) j3;
        int i5 = i3 + i4;
        synchronized (this.f1855a) {
            this.f1855a.position(0);
            this.f1855a.limit(i5);
            this.f1855a.position(i4);
            slice = this.f1855a.slice();
        }
        return slice;
    }

    @Override // U0.c
    public void d(long j3, int i3, ByteBuffer byteBuffer) {
        byteBuffer.put(c(j3, i3));
    }

    public final void e(long j3, long j4) {
        if (j3 < 0) {
            throw new IndexOutOfBoundsException("offset: " + j3);
        }
        if (j4 < 0) {
            throw new IndexOutOfBoundsException("size: " + j4);
        }
        int i3 = this.f1856b;
        if (j3 > i3) {
            throw new IndexOutOfBoundsException("offset (" + j3 + ") > source size (" + this.f1856b + ")");
        }
        long j5 = j3 + j4;
        if (j5 < j3) {
            throw new IndexOutOfBoundsException("offset (" + j3 + ") + size (" + j4 + ") overflow");
        }
        if (j5 <= i3) {
            return;
        }
        throw new IndexOutOfBoundsException("offset (" + j3 + ") + size (" + j4 + ") > source size (" + this.f1856b + ")");
    }

    @Override // U0.c
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public a b(long j3, long j4) {
        if (j3 == 0 && j4 == this.f1856b) {
            return this;
        }
        if (j4 >= 0 && j4 <= this.f1856b) {
            return new a(c(j3, (int) j4), false);
        }
        throw new IndexOutOfBoundsException("size: " + j4 + ", source size: " + this.f1856b);
    }

    @Override // U0.c
    public long size() {
        return this.f1856b;
    }

    public a(ByteBuffer byteBuffer, boolean z3) {
        this.f1855a = z3 ? byteBuffer.slice() : byteBuffer;
        this.f1856b = byteBuffer.remaining();
    }
}
