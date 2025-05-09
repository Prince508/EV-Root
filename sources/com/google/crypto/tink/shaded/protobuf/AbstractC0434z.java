package com.google.crypto.tink.shaded.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.crypto.tink.shaded.protobuf.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0434z {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f6008a = Charset.forName("US-ASCII");

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f6009b = Charset.forName("UTF-8");

    /* renamed from: c, reason: collision with root package name */
    public static final Charset f6010c = Charset.forName("ISO-8859-1");

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f6011d;

    /* renamed from: e, reason: collision with root package name */
    public static final ByteBuffer f6012e;

    /* renamed from: f, reason: collision with root package name */
    public static final AbstractC0418i f6013f;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.z$a */
    public interface a {
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.z$b */
    public interface b {
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.z$c */
    public interface c {
        boolean a(int i3);
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.z$d */
    public interface d extends List, RandomAccess {
        void b();

        d d(int i3);

        boolean f();
    }

    static {
        byte[] bArr = new byte[0];
        f6011d = bArr;
        f6012e = ByteBuffer.wrap(bArr);
        f6013f = AbstractC0418i.h(bArr);
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
        int h3 = h(i4, bArr, i3, i4);
        if (h3 == 0) {
            return 1;
        }
        return h3;
    }

    public static int f(long j3) {
        return (int) (j3 ^ (j3 >>> 32));
    }

    public static boolean g(byte[] bArr) {
        return p0.m(bArr);
    }

    public static int h(int i3, byte[] bArr, int i4, int i5) {
        for (int i6 = i4; i6 < i4 + i5; i6++) {
            i3 = (i3 * 31) + bArr[i6];
        }
        return i3;
    }

    public static String i(byte[] bArr) {
        return new String(bArr, f6009b);
    }
}
