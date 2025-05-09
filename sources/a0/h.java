package a0;

import b0.C0364b;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public abstract class h {

    public static class a implements c {

        /* renamed from: a, reason: collision with root package name */
        public final ByteBuffer f2652a;

        public a(ByteBuffer byteBuffer) {
            this.f2652a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // a0.h.c
        public long a() {
            return h.c(this.f2652a.getInt());
        }

        @Override // a0.h.c
        public void b(int i3) {
            ByteBuffer byteBuffer = this.f2652a;
            byteBuffer.position(byteBuffer.position() + i3);
        }

        @Override // a0.h.c
        public int c() {
            return this.f2652a.getInt();
        }

        @Override // a0.h.c
        public long d() {
            return this.f2652a.position();
        }

        @Override // a0.h.c
        public int readUnsignedShort() {
            return h.d(this.f2652a.getShort());
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final long f2653a;

        /* renamed from: b, reason: collision with root package name */
        public final long f2654b;

        public b(long j3, long j4) {
            this.f2653a = j3;
            this.f2654b = j4;
        }

        public long a() {
            return this.f2653a;
        }
    }

    public interface c {
        long a();

        void b(int i3);

        int c();

        long d();

        int readUnsignedShort();
    }

    public static b a(c cVar) {
        long j3;
        cVar.b(4);
        int readUnsignedShort = cVar.readUnsignedShort();
        if (readUnsignedShort > 100) {
            throw new IOException("Cannot read metadata.");
        }
        cVar.b(6);
        int i3 = 0;
        while (true) {
            if (i3 >= readUnsignedShort) {
                j3 = -1;
                break;
            }
            int c3 = cVar.c();
            cVar.b(4);
            j3 = cVar.a();
            cVar.b(4);
            if (1835365473 == c3) {
                break;
            }
            i3++;
        }
        if (j3 != -1) {
            cVar.b((int) (j3 - cVar.d()));
            cVar.b(12);
            long a3 = cVar.a();
            for (int i4 = 0; i4 < a3; i4++) {
                int c4 = cVar.c();
                long a4 = cVar.a();
                long a5 = cVar.a();
                if (1164798569 == c4 || 1701669481 == c4) {
                    return new b(a4 + j3, a5);
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static C0364b b(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position((int) a(new a(duplicate)).a());
        return C0364b.h(duplicate);
    }

    public static long c(int i3) {
        return i3 & 4294967295L;
    }

    public static int d(short s3) {
        return s3 & 65535;
    }
}
