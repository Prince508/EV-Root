package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0334u {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f3847a = Charset.forName("UTF-8");

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f3848b = Charset.forName("ISO-8859-1");

    /* renamed from: c, reason: collision with root package name */
    public static final byte[] f3849c;

    /* renamed from: d, reason: collision with root package name */
    public static final ByteBuffer f3850d;

    /* renamed from: e, reason: collision with root package name */
    public static final AbstractC0321g f3851e;

    /* renamed from: androidx.datastore.preferences.protobuf.u$a */
    public interface a {
        boolean a(int i3);
    }

    /* renamed from: androidx.datastore.preferences.protobuf.u$b */
    public interface b extends List, RandomAccess {
        void b();

        b d(int i3);

        boolean f();
    }

    static {
        byte[] bArr = new byte[0];
        f3849c = bArr;
        f3850d = ByteBuffer.wrap(bArr);
        f3851e = AbstractC0321g.h(bArr);
    }

    public static Object a(Object obj) {
        obj.getClass();
        return obj;
    }

    public static Object b(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static int c(boolean z3) {
        return z3 ? 1231 : 1237;
    }

    public static int d(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    public static int e(byte[] bArr, int i3, int i4) {
        int i5 = i(i4, bArr, i3, i4);
        if (i5 == 0) {
            return 1;
        }
        return i5;
    }

    public static int f(long j3) {
        return (int) (j3 ^ (j3 >>> 32));
    }

    public static boolean g(byte[] bArr) {
        return k0.m(bArr);
    }

    public static Object h(Object obj, Object obj2) {
        return ((J) obj).e().g((J) obj2).d();
    }

    public static int i(int i3, byte[] bArr, int i4, int i5) {
        for (int i6 = i4; i6 < i4 + i5; i6++) {
            i3 = (i3 * 31) + bArr[i6];
        }
        return i3;
    }

    public static String j(byte[] bArr) {
        return new String(bArr, f3847a);
    }
}
