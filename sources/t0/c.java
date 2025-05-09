package T0;

import R0.j;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class c {
    public static void a(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    public static int b(ByteBuffer byteBuffer) {
        a(byteBuffer);
        int capacity = byteBuffer.capacity();
        if (capacity < 22) {
            return -1;
        }
        int i3 = capacity - 22;
        int min = Math.min(i3, 65535);
        for (int i4 = 0; i4 <= min; i4++) {
            int i5 = i3 - i4;
            if (byteBuffer.getInt(i5) == 101010256 && f(byteBuffer, i5 + 20) == i4) {
                return i5;
            }
        }
        return -1;
    }

    public static j c(U0.c cVar) {
        if (cVar.size() < 22) {
            return null;
        }
        j d3 = d(cVar, 0);
        return d3 != null ? d3 : d(cVar, 65535);
    }

    public static j d(U0.c cVar, int i3) {
        if (i3 < 0 || i3 > 65535) {
            throw new IllegalArgumentException("maxCommentSize: " + i3);
        }
        long size = cVar.size();
        if (size < 22) {
            return null;
        }
        int min = ((int) Math.min(i3, size - 22)) + 22;
        long j3 = size - min;
        ByteBuffer c3 = cVar.c(j3, min);
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        c3.order(byteOrder);
        int b3 = b(c3);
        if (b3 == -1) {
            return null;
        }
        c3.position(b3);
        ByteBuffer slice = c3.slice();
        slice.order(byteOrder);
        return j.c(slice, Long.valueOf(j3 + b3));
    }

    public static int e(ByteBuffer byteBuffer) {
        return byteBuffer.getShort() & 65535;
    }

    public static int f(ByteBuffer byteBuffer, int i3) {
        return byteBuffer.getShort(i3) & 65535;
    }

    public static long g(ByteBuffer byteBuffer) {
        return byteBuffer.getInt() & 4294967295L;
    }

    public static long h(ByteBuffer byteBuffer, int i3) {
        return byteBuffer.getInt(i3) & 4294967295L;
    }

    public static long i(ByteBuffer byteBuffer) {
        a(byteBuffer);
        return h(byteBuffer, byteBuffer.position() + 16);
    }

    public static long j(ByteBuffer byteBuffer) {
        a(byteBuffer);
        return h(byteBuffer, byteBuffer.position() + 12);
    }

    public static int k(ByteBuffer byteBuffer) {
        a(byteBuffer);
        return f(byteBuffer, byteBuffer.position() + 10);
    }

    public static List l(U0.c cVar, V0.b bVar) {
        long c3 = bVar.c();
        if (c3 > 2147483647L) {
            throw new G0.a("ZIP Central Directory too large: " + c3);
        }
        long a3 = bVar.a();
        ByteBuffer c4 = cVar.c(a3, (int) c3);
        c4.order(ByteOrder.LITTLE_ENDIAN);
        int b3 = bVar.b();
        ArrayList arrayList = new ArrayList(b3);
        for (int i3 = 0; i3 < b3; i3++) {
            int position = c4.position();
            try {
                a i4 = a.i(c4);
                if (!i4.f().endsWith("/")) {
                    arrayList.add(i4);
                }
            } catch (V0.a e3) {
                throw new G0.a("Malformed ZIP Central Directory record #" + (i3 + 1) + " at file offset " + (a3 + position), e3);
            }
        }
        return arrayList;
    }

    public static void m(ByteBuffer byteBuffer, int i3, long j3) {
        if (j3 >= 0 && j3 <= 4294967295L) {
            byteBuffer.putInt(i3, (int) j3);
            return;
        }
        throw new IllegalArgumentException("uint32 value of out range: " + j3);
    }

    public static void n(ByteBuffer byteBuffer, long j3) {
        a(byteBuffer);
        m(byteBuffer, byteBuffer.position() + 16, j3);
    }
}
