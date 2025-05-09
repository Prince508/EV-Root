package R0;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* loaded from: classes.dex */
public class g implements U0.c {

    /* renamed from: a, reason: collision with root package name */
    public final FileChannel f1861a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1862b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1863c;

    public g(FileChannel fileChannel, long j3, long j4) {
        if (j3 < 0) {
            throw new IndexOutOfBoundsException("offset: " + j4);
        }
        if (j4 >= 0) {
            this.f1861a = fileChannel;
            this.f1862b = j3;
            this.f1863c = j4;
        } else {
            throw new IndexOutOfBoundsException("size: " + j4);
        }
    }

    public static void e(long j3, long j4, long j5) {
        if (j3 < 0) {
            throw new IndexOutOfBoundsException("offset: " + j3);
        }
        if (j4 < 0) {
            throw new IndexOutOfBoundsException("size: " + j4);
        }
        if (j3 > j5) {
            throw new IndexOutOfBoundsException("offset (" + j3 + ") > source size (" + j5 + ")");
        }
        long j6 = j3 + j4;
        if (j6 < j3) {
            throw new IndexOutOfBoundsException("offset (" + j3 + ") + size (" + j4 + ") overflow");
        }
        if (j6 <= j5) {
            return;
        }
        throw new IndexOutOfBoundsException("offset (" + j3 + ") + size (" + j4 + ") > source size (" + j5 + ")");
    }

    @Override // U0.c
    public void a(long j3, long j4, U0.a aVar) {
        e(j3, j4, size());
        if (j4 == 0) {
            return;
        }
        long j5 = this.f1862b + j3;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect((int) Math.min(j4, 1048576L));
        long j6 = j5;
        long j7 = j4;
        while (j7 > 0) {
            int min = (int) Math.min(j7, allocateDirect.capacity());
            allocateDirect.limit(min);
            synchronized (this.f1861a) {
                try {
                    this.f1861a.position(j6);
                    int i3 = min;
                    while (i3 > 0) {
                        int read = this.f1861a.read(allocateDirect);
                        if (read < 0) {
                            throw new IOException("Unexpected EOF encountered");
                        }
                        i3 -= read;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            allocateDirect.flip();
            aVar.b(allocateDirect);
            allocateDirect.clear();
            long j8 = min;
            j6 += j8;
            j7 -= j8;
        }
    }

    @Override // U0.c
    public ByteBuffer c(long j3, int i3) {
        if (i3 >= 0) {
            ByteBuffer allocate = ByteBuffer.allocate(i3);
            d(j3, i3, allocate);
            allocate.flip();
            return allocate;
        }
        throw new IndexOutOfBoundsException("size: " + i3);
    }

    @Override // U0.c
    public void d(long j3, int i3, ByteBuffer byteBuffer) {
        int read;
        e(j3, i3, size());
        if (i3 == 0) {
            return;
        }
        if (i3 > byteBuffer.remaining()) {
            throw new BufferOverflowException();
        }
        long j4 = this.f1862b + j3;
        int limit = byteBuffer.limit();
        try {
            byteBuffer.limit(byteBuffer.position() + i3);
            while (i3 > 0) {
                synchronized (this.f1861a) {
                    this.f1861a.position(j4);
                    read = this.f1861a.read(byteBuffer);
                }
                j4 += read;
                i3 -= read;
            }
        } finally {
            byteBuffer.limit(limit);
        }
    }

    @Override // U0.c
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public g b(long j3, long j4) {
        long size = size();
        e(j3, j4, size);
        return (j3 == 0 && j4 == size) ? this : new g(this.f1861a, this.f1862b + j3, j4);
    }

    @Override // U0.c
    public long size() {
        long j3 = this.f1863c;
        if (j3 != -1) {
            return j3;
        }
        try {
            return this.f1861a.size();
        } catch (IOException unused) {
            return 0L;
        }
    }
}
