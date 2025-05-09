package i2;

import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class l implements InterfaceC0509g {

    /* renamed from: a, reason: collision with root package name */
    public static final l f7511a = new l();

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f7512b;

    /* renamed from: c, reason: collision with root package name */
    public static final Charset f7513c;

    public static final class a extends ByteArrayOutputStream {
        public byte[] a() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    static {
        f7512b = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN;
        f7513c = Charset.forName("UTF8");
    }

    public static final void c(ByteBuffer byteBuffer, int i3) {
        int position = byteBuffer.position() % i3;
        if (position != 0) {
            byteBuffer.position((byteBuffer.position() + i3) - position);
        }
    }

    public static final byte[] d(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[e(byteBuffer)];
        byteBuffer.get(bArr);
        return bArr;
    }

    public static final int e(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Message corrupted");
        }
        int i3 = byteBuffer.get() & 255;
        return i3 < 254 ? i3 : i3 == 254 ? byteBuffer.getChar() : byteBuffer.getInt();
    }

    public static final void h(ByteArrayOutputStream byteArrayOutputStream, int i3) {
        int size = byteArrayOutputStream.size() % i3;
        if (size != 0) {
            for (int i4 = 0; i4 < i3 - size; i4++) {
                byteArrayOutputStream.write(0);
            }
        }
    }

    public static final void i(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr) {
        o(byteArrayOutputStream, bArr.length);
        byteArrayOutputStream.write(bArr, 0, bArr.length);
    }

    public static final void j(ByteArrayOutputStream byteArrayOutputStream, int i3) {
        if (f7512b) {
            byteArrayOutputStream.write(i3);
            byteArrayOutputStream.write(i3 >>> 8);
        } else {
            byteArrayOutputStream.write(i3 >>> 8);
            byteArrayOutputStream.write(i3);
        }
    }

    public static final void k(ByteArrayOutputStream byteArrayOutputStream, double d3) {
        n(byteArrayOutputStream, Double.doubleToLongBits(d3));
    }

    public static final void l(ByteArrayOutputStream byteArrayOutputStream, float f3) {
        m(byteArrayOutputStream, Float.floatToIntBits(f3));
    }

    public static final void m(ByteArrayOutputStream byteArrayOutputStream, int i3) {
        if (f7512b) {
            byteArrayOutputStream.write(i3);
            byteArrayOutputStream.write(i3 >>> 8);
            byteArrayOutputStream.write(i3 >>> 16);
            byteArrayOutputStream.write(i3 >>> 24);
            return;
        }
        byteArrayOutputStream.write(i3 >>> 24);
        byteArrayOutputStream.write(i3 >>> 16);
        byteArrayOutputStream.write(i3 >>> 8);
        byteArrayOutputStream.write(i3);
    }

    public static final void n(ByteArrayOutputStream byteArrayOutputStream, long j3) {
        if (f7512b) {
            byteArrayOutputStream.write((byte) j3);
            byteArrayOutputStream.write((byte) (j3 >>> 8));
            byteArrayOutputStream.write((byte) (j3 >>> 16));
            byteArrayOutputStream.write((byte) (j3 >>> 24));
            byteArrayOutputStream.write((byte) (j3 >>> 32));
            byteArrayOutputStream.write((byte) (j3 >>> 40));
            byteArrayOutputStream.write((byte) (j3 >>> 48));
            byteArrayOutputStream.write((byte) (j3 >>> 56));
            return;
        }
        byteArrayOutputStream.write((byte) (j3 >>> 56));
        byteArrayOutputStream.write((byte) (j3 >>> 48));
        byteArrayOutputStream.write((byte) (j3 >>> 40));
        byteArrayOutputStream.write((byte) (j3 >>> 32));
        byteArrayOutputStream.write((byte) (j3 >>> 24));
        byteArrayOutputStream.write((byte) (j3 >>> 16));
        byteArrayOutputStream.write((byte) (j3 >>> 8));
        byteArrayOutputStream.write((byte) j3);
    }

    public static final void o(ByteArrayOutputStream byteArrayOutputStream, int i3) {
        if (i3 < 254) {
            byteArrayOutputStream.write(i3);
        } else if (i3 <= 65535) {
            byteArrayOutputStream.write(254);
            j(byteArrayOutputStream, i3);
        } else {
            byteArrayOutputStream.write(255);
            m(byteArrayOutputStream, i3);
        }
    }

    @Override // i2.InterfaceC0509g
    public Object a(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        byteBuffer.order(ByteOrder.nativeOrder());
        Object f3 = f(byteBuffer);
        if (byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Message corrupted");
        }
        return f3;
    }

    @Override // i2.InterfaceC0509g
    public ByteBuffer b(Object obj) {
        if (obj == null) {
            return null;
        }
        a aVar = new a();
        p(aVar, obj);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.a(), 0, aVar.size());
        return allocateDirect;
    }

    public final Object f(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            return g(byteBuffer.get(), byteBuffer);
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    public Object g(byte b3, ByteBuffer byteBuffer) {
        int i3 = 0;
        switch (b3) {
            case 0:
                return null;
            case 1:
                return Boolean.TRUE;
            case 2:
                return Boolean.FALSE;
            case 3:
                return Integer.valueOf(byteBuffer.getInt());
            case 4:
                return Long.valueOf(byteBuffer.getLong());
            case 5:
                return new BigInteger(new String(d(byteBuffer), f7513c), 16);
            case 6:
                c(byteBuffer, 8);
                return Double.valueOf(byteBuffer.getDouble());
            case 7:
                return new String(d(byteBuffer), f7513c);
            case 8:
                return d(byteBuffer);
            case 9:
                int e3 = e(byteBuffer);
                int[] iArr = new int[e3];
                c(byteBuffer, 4);
                byteBuffer.asIntBuffer().get(iArr);
                byteBuffer.position(byteBuffer.position() + (e3 * 4));
                return iArr;
            case 10:
                int e4 = e(byteBuffer);
                long[] jArr = new long[e4];
                c(byteBuffer, 8);
                byteBuffer.asLongBuffer().get(jArr);
                byteBuffer.position(byteBuffer.position() + (e4 * 8));
                return jArr;
            case 11:
                int e5 = e(byteBuffer);
                double[] dArr = new double[e5];
                c(byteBuffer, 8);
                byteBuffer.asDoubleBuffer().get(dArr);
                byteBuffer.position(byteBuffer.position() + (e5 * 8));
                return dArr;
            case 12:
                int e6 = e(byteBuffer);
                ArrayList arrayList = new ArrayList(e6);
                while (i3 < e6) {
                    arrayList.add(f(byteBuffer));
                    i3++;
                }
                return arrayList;
            case 13:
                int e7 = e(byteBuffer);
                HashMap hashMap = new HashMap();
                while (i3 < e7) {
                    hashMap.put(f(byteBuffer), f(byteBuffer));
                    i3++;
                }
                return hashMap;
            case 14:
                int e8 = e(byteBuffer);
                float[] fArr = new float[e8];
                c(byteBuffer, 4);
                byteBuffer.asFloatBuffer().get(fArr);
                byteBuffer.position(byteBuffer.position() + (e8 * 4));
                return fArr;
            default:
                throw new IllegalArgumentException("Message corrupted");
        }
    }

    public void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        int i3 = 0;
        if (obj == null || obj.equals(null)) {
            byteArrayOutputStream.write(0);
            return;
        }
        if (obj instanceof Boolean) {
            byteArrayOutputStream.write(((Boolean) obj).booleanValue() ? 1 : 2);
            return;
        }
        if (obj instanceof Number) {
            if ((obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
                byteArrayOutputStream.write(3);
                m(byteArrayOutputStream, ((Number) obj).intValue());
                return;
            }
            if (obj instanceof Long) {
                byteArrayOutputStream.write(4);
                n(byteArrayOutputStream, ((Long) obj).longValue());
                return;
            }
            if ((obj instanceof Float) || (obj instanceof Double)) {
                byteArrayOutputStream.write(6);
                h(byteArrayOutputStream, 8);
                k(byteArrayOutputStream, ((Number) obj).doubleValue());
                return;
            } else {
                if (!(obj instanceof BigInteger)) {
                    throw new IllegalArgumentException("Unsupported Number type: " + obj.getClass());
                }
                byteArrayOutputStream.write(5);
                i(byteArrayOutputStream, ((BigInteger) obj).toString(16).getBytes(f7513c));
                return;
            }
        }
        if (obj instanceof CharSequence) {
            byteArrayOutputStream.write(7);
            i(byteArrayOutputStream, obj.toString().getBytes(f7513c));
            return;
        }
        if (obj instanceof byte[]) {
            byteArrayOutputStream.write(8);
            i(byteArrayOutputStream, (byte[]) obj);
            return;
        }
        if (obj instanceof int[]) {
            byteArrayOutputStream.write(9);
            int[] iArr = (int[]) obj;
            o(byteArrayOutputStream, iArr.length);
            h(byteArrayOutputStream, 4);
            int length = iArr.length;
            while (i3 < length) {
                m(byteArrayOutputStream, iArr[i3]);
                i3++;
            }
            return;
        }
        if (obj instanceof long[]) {
            byteArrayOutputStream.write(10);
            long[] jArr = (long[]) obj;
            o(byteArrayOutputStream, jArr.length);
            h(byteArrayOutputStream, 8);
            int length2 = jArr.length;
            while (i3 < length2) {
                n(byteArrayOutputStream, jArr[i3]);
                i3++;
            }
            return;
        }
        if (obj instanceof double[]) {
            byteArrayOutputStream.write(11);
            double[] dArr = (double[]) obj;
            o(byteArrayOutputStream, dArr.length);
            h(byteArrayOutputStream, 8);
            int length3 = dArr.length;
            while (i3 < length3) {
                k(byteArrayOutputStream, dArr[i3]);
                i3++;
            }
            return;
        }
        if (obj instanceof List) {
            byteArrayOutputStream.write(12);
            List list = (List) obj;
            o(byteArrayOutputStream, list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                p(byteArrayOutputStream, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            byteArrayOutputStream.write(13);
            Map map = (Map) obj;
            o(byteArrayOutputStream, map.size());
            for (Map.Entry entry : map.entrySet()) {
                p(byteArrayOutputStream, entry.getKey());
                p(byteArrayOutputStream, entry.getValue());
            }
            return;
        }
        if (!(obj instanceof float[])) {
            throw new IllegalArgumentException("Unsupported value: '" + obj + "' of type '" + obj.getClass() + "'");
        }
        byteArrayOutputStream.write(14);
        float[] fArr = (float[]) obj;
        o(byteArrayOutputStream, fArr.length);
        h(byteArrayOutputStream, 4);
        int length4 = fArr.length;
        while (i3 < length4) {
            l(byteArrayOutputStream, fArr[i3]);
            i3++;
        }
    }
}
