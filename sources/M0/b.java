package M0;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f1342a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f1343b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f1344c;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f1345a;

        /* renamed from: b, reason: collision with root package name */
        public final byte f1346b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f1347c;

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f1348d;

        public a(int i3, byte b3, byte[] bArr, byte[] bArr2) {
            this.f1345a = i3;
            this.f1346b = b3;
            this.f1347c = bArr;
            this.f1348d = bArr2;
        }

        public static a a(byte[] bArr) {
            ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            return new a(order.getInt(), order.get(), b.d(order), b.d(order));
        }
    }

    /* renamed from: M0.b$b, reason: collision with other inner class name */
    public static class C0035b {

        /* renamed from: a, reason: collision with root package name */
        public final byte[] f1349a;

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f1350b;

        /* renamed from: c, reason: collision with root package name */
        public final byte[] f1351c;

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f1352d;

        /* renamed from: e, reason: collision with root package name */
        public final int f1353e;

        /* renamed from: f, reason: collision with root package name */
        public final byte[] f1354f;

        public C0035b(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i3, byte[] bArr5) {
            this.f1349a = bArr;
            this.f1350b = bArr2;
            this.f1351c = bArr3;
            this.f1352d = bArr4;
            this.f1353e = i3;
            this.f1354f = bArr5;
        }

        public static C0035b a(byte[] bArr) {
            return b(ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN));
        }

        public static C0035b b(ByteBuffer byteBuffer) {
            return new C0035b(b.d(byteBuffer), b.d(byteBuffer), b.d(byteBuffer), b.d(byteBuffer), byteBuffer.getInt(), b.d(byteBuffer));
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f1355a;

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f1356b;

        public c(int i3, byte[] bArr) {
            this.f1355a = i3;
            this.f1356b = bArr;
        }

        public static c a(ByteBuffer byteBuffer) {
            return new c(byteBuffer.getInt(), b.d(byteBuffer));
        }
    }

    public b(int i3, byte[] bArr, byte[] bArr2) {
        this.f1342a = i3;
        this.f1343b = bArr;
        this.f1344c = bArr2;
    }

    public static int a(byte[] bArr) {
        return (bArr == null ? 0 : bArr.length) + 4;
    }

    public static byte[] b(long j3, a aVar, C0035b c0035b) {
        int a3 = a(aVar.f1347c) + 17 + a(aVar.f1348d) + a(c0035b.f1349a) + a(c0035b.f1350b) + a(c0035b.f1351c);
        ByteBuffer order = ByteBuffer.allocate(a3).order(ByteOrder.LITTLE_ENDIAN);
        order.putInt(a3);
        order.putLong(j3);
        order.putInt(aVar.f1345a);
        order.put(aVar.f1346b);
        h(order, aVar.f1347c);
        h(order, aVar.f1348d);
        h(order, c0035b.f1349a);
        h(order, c0035b.f1350b);
        h(order, c0035b.f1351c);
        return order.array();
    }

    public static byte[] c(InputStream inputStream) {
        try {
            byte[] bArr = new byte[g(inputStream)];
            f(inputStream, bArr);
            return bArr;
        } catch (EOFException unused) {
            return null;
        }
    }

    public static byte[] d(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() < 4) {
            throw new EOFException();
        }
        int i3 = byteBuffer.getInt();
        if (byteBuffer.remaining() < i3) {
            throw new EOFException();
        }
        byte[] bArr = new byte[i3];
        byteBuffer.get(bArr);
        return bArr;
    }

    public static b e(InputStream inputStream) {
        int g3 = g(inputStream);
        if (g3 == 2) {
            return new b(g3, c(inputStream), c(inputStream));
        }
        throw new IOException("Invalid signature version.");
    }

    public static void f(InputStream inputStream, byte[] bArr) {
        int length = bArr.length;
        int i3 = 0;
        while (i3 < length) {
            int read = inputStream.read(bArr, i3, length - i3);
            if (read < 0) {
                throw new EOFException();
            }
            i3 += read;
        }
    }

    public static int g(InputStream inputStream) {
        byte[] bArr = new byte[4];
        f(inputStream, bArr);
        return ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).getInt();
    }

    public static void h(ByteBuffer byteBuffer, byte[] bArr) {
        if (bArr == null) {
            byteBuffer.putInt(0);
        } else {
            byteBuffer.putInt(bArr.length);
            byteBuffer.put(bArr);
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final C0035b f1357a;

        /* renamed from: b, reason: collision with root package name */
        public final c[] f1358b;

        public d(C0035b c0035b) {
            this.f1357a = c0035b;
            this.f1358b = new c[0];
        }

        public static d a(byte[] bArr) {
            ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            C0035b b3 = C0035b.b(order);
            if (!order.hasRemaining()) {
                return new d(b3);
            }
            ArrayList arrayList = new ArrayList(1);
            while (order.hasRemaining()) {
                arrayList.add(c.a(order));
            }
            return new d(b3, (c[]) arrayList.toArray(new c[arrayList.size()]));
        }

        public d(C0035b c0035b, c... cVarArr) {
            this.f1357a = c0035b;
            this.f1358b = cVarArr;
        }
    }
}
