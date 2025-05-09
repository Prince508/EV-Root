package H0;

import G0.d;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f722a = "0123456789abcdef".toCharArray();

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f723a;

        static {
            int[] iArr = new int[i.values().length];
            f723a = iArr;
            try {
                iArr[i.CHUNKED_SHA256.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f723a[i.CHUNKED_SHA512.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f723a[i.VERITY_CHUNKED_SHA256.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static void b(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    public static int c(i iVar, i iVar2) {
        int[] iArr = a.f723a;
        int i3 = iArr[iVar.ordinal()];
        if (i3 == 1) {
            int i4 = iArr[iVar2.ordinal()];
            if (i4 == 1) {
                return 0;
            }
            if (i4 == 2 || i4 == 3) {
                return -1;
            }
            throw new IllegalArgumentException("Unknown alg2: " + iVar2);
        }
        if (i3 == 2) {
            int i5 = iArr[iVar2.ordinal()];
            if (i5 != 1) {
                if (i5 == 2) {
                    return 0;
                }
                if (i5 != 3) {
                    throw new IllegalArgumentException("Unknown alg2: " + iVar2);
                }
            }
            return 1;
        }
        if (i3 != 3) {
            throw new IllegalArgumentException("Unknown alg1: " + iVar);
        }
        int i6 = iArr[iVar2.ordinal()];
        if (i6 == 1) {
            return 1;
        }
        if (i6 == 2) {
            return -1;
        }
        if (i6 == 3) {
            return 0;
        }
        throw new IllegalArgumentException("Unknown alg2: " + iVar2);
    }

    public static int d(k kVar, k kVar2) {
        return c(kVar.g(), kVar2.g());
    }

    public static byte[] e(List list) {
        Iterator it = list.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            i3 += ((byte[]) ((R0.j) it.next()).b()).length + 12;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i3);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            R0.j jVar = (R0.j) it2.next();
            byte[] bArr = (byte[]) jVar.b();
            allocate.putInt(bArr.length + 8);
            allocate.putInt(((Integer) jVar.a()).intValue());
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    public static ByteBuffer f(ByteBuffer byteBuffer, int i3) {
        b(byteBuffer);
        ByteBuffer l3 = l(byteBuffer, 8, byteBuffer.capacity() - 24);
        int i4 = 0;
        while (l3.hasRemaining()) {
            i4++;
            if (l3.remaining() < 8) {
                throw new m("Insufficient data to read size of APK Signing Block entry #" + i4);
            }
            long j3 = l3.getLong();
            if (j3 < 4 || j3 > 2147483647L) {
                throw new m("APK Signing Block entry #" + i4 + " size out of range: " + j3);
            }
            int i5 = (int) j3;
            int position = l3.position() + i5;
            if (i5 > l3.remaining()) {
                throw new m("APK Signing Block entry #" + i4 + " size out of range: " + i5 + ", available: " + l3.remaining());
            }
            if (l3.getInt() == i3) {
                return h(l3, i5 - 4);
            }
            l3.position(position);
        }
        throw new m("No APK Signature Scheme block in APK Signing Block with ID: " + i3);
    }

    public static l g(U0.c cVar, V0.b bVar, int i3) {
        try {
            d.a b3 = G0.d.b(cVar, bVar);
            long b4 = b3.b();
            U0.c a3 = b3.a();
            ByteBuffer c3 = a3.c(0L, (int) a3.size());
            c3.order(ByteOrder.LITTLE_ENDIAN);
            return new l(f(c3, i3), b4, bVar.a(), bVar.e(), bVar.d());
        } catch (G0.b e3) {
            throw new m(e3.getMessage(), e3);
        }
    }

    public static ByteBuffer h(ByteBuffer byteBuffer, int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException("size: " + i3);
        }
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        int i4 = i3 + position;
        if (i4 < position || i4 > limit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i4);
        try {
            ByteBuffer slice = byteBuffer.slice();
            slice.order(byteBuffer.order());
            byteBuffer.position(i4);
            return slice;
        } finally {
            byteBuffer.limit(limit);
        }
    }

    public static ByteBuffer i(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() < 4) {
            throw new G0.a("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + byteBuffer.remaining());
        }
        int i3 = byteBuffer.getInt();
        if (i3 < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i3 <= byteBuffer.remaining()) {
            return h(byteBuffer, i3);
        }
        throw new G0.a("Length-prefixed field longer than remaining buffer. Field length: " + i3 + ", remaining: " + byteBuffer.remaining());
    }

    public static List j(List list, int i3, int i4, boolean z3) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        int i5 = Integer.MAX_VALUE;
        while (it.hasNext()) {
            h hVar = (h) it.next();
            k kVar = hVar.f724a;
            int j3 = z3 ? kVar.j() : kVar.l();
            if (j3 <= i4) {
                if (j3 < i5) {
                    i5 = j3;
                }
                h hVar2 = (h) hashMap.get(Integer.valueOf(j3));
                if (hVar2 == null || d(kVar, hVar2.f724a) > 0) {
                    hashMap.put(Integer.valueOf(j3), hVar);
                }
            }
        }
        if (i3 >= i5) {
            if (hashMap.isEmpty()) {
                throw new j("No supported signature");
            }
            ArrayList arrayList = new ArrayList(hashMap.values());
            Collections.sort(arrayList, new Comparator() { // from class: H0.f
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int compare;
                    compare = Integer.compare(((h) obj).f724a.h(), ((h) obj2).f724a.h());
                    return compare;
                }
            });
            return arrayList;
        }
        throw new j("Minimum provided signature version " + i5 + " > minSdkVersion " + i3);
    }

    public static byte[] k(ByteBuffer byteBuffer) {
        int i3 = byteBuffer.getInt();
        if (i3 < 0) {
            throw new G0.a("Negative length");
        }
        if (i3 <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i3];
            byteBuffer.get(bArr);
            return bArr;
        }
        throw new G0.a("Underflow while reading length-prefixed value. Length: " + i3 + ", available: " + byteBuffer.remaining());
    }

    public static ByteBuffer l(ByteBuffer byteBuffer, int i3, int i4) {
        if (i3 < 0) {
            throw new IllegalArgumentException("start: " + i3);
        }
        if (i4 < i3) {
            throw new IllegalArgumentException("end < start: " + i4 + " < " + i3);
        }
        int capacity = byteBuffer.capacity();
        if (i4 > byteBuffer.capacity()) {
            throw new IllegalArgumentException("end > capacity: " + i4 + " > " + capacity);
        }
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        try {
            byteBuffer.position(0);
            byteBuffer.limit(i4);
            byteBuffer.position(i3);
            ByteBuffer slice = byteBuffer.slice();
            slice.order(byteBuffer.order());
            return slice;
        } finally {
            byteBuffer.position(0);
            byteBuffer.limit(limit);
            byteBuffer.position(position);
        }
    }

    public static String m(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b3 : bArr) {
            char[] cArr = f722a;
            sb.append(cArr[(b3 & 255) >>> 4]);
            sb.append(cArr[b3 & 15]);
        }
        return sb.toString();
    }
}
