package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Unsafe f5857a = D();

    /* renamed from: b, reason: collision with root package name */
    public static final Class f5858b = AbstractC0413d.b();

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f5859c = o(Long.TYPE);

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f5860d = o(Integer.TYPE);

    /* renamed from: e, reason: collision with root package name */
    public static final e f5861e = B();

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f5862f = T();

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f5863g = S();

    /* renamed from: h, reason: collision with root package name */
    public static final long f5864h;

    /* renamed from: i, reason: collision with root package name */
    public static final long f5865i;

    /* renamed from: j, reason: collision with root package name */
    public static final long f5866j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f5867k;

    /* renamed from: l, reason: collision with root package name */
    public static final long f5868l;

    /* renamed from: m, reason: collision with root package name */
    public static final long f5869m;

    /* renamed from: n, reason: collision with root package name */
    public static final long f5870n;

    /* renamed from: o, reason: collision with root package name */
    public static final long f5871o;

    /* renamed from: p, reason: collision with root package name */
    public static final long f5872p;

    /* renamed from: q, reason: collision with root package name */
    public static final long f5873q;

    /* renamed from: r, reason: collision with root package name */
    public static final long f5874r;

    /* renamed from: s, reason: collision with root package name */
    public static final long f5875s;

    /* renamed from: t, reason: collision with root package name */
    public static final long f5876t;

    /* renamed from: u, reason: collision with root package name */
    public static final long f5877u;

    /* renamed from: v, reason: collision with root package name */
    public static final int f5878v;

    /* renamed from: w, reason: collision with root package name */
    public static final boolean f5879w;

    public class a implements PrivilegedExceptionAction {
        @Override // java.security.PrivilegedExceptionAction
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unsafe run() {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            return null;
        }
    }

    public static final class b extends e {
        public b(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public boolean c(Object obj, long j3) {
            return o0.f5879w ? o0.s(obj, j3) : o0.t(obj, j3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public byte d(Object obj, long j3) {
            return o0.f5879w ? o0.v(obj, j3) : o0.w(obj, j3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public double e(Object obj, long j3) {
            return Double.longBitsToDouble(h(obj, j3));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public float f(Object obj, long j3) {
            return Float.intBitsToFloat(g(obj, j3));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public void k(Object obj, long j3, boolean z3) {
            if (o0.f5879w) {
                o0.I(obj, j3, z3);
            } else {
                o0.J(obj, j3, z3);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public void l(Object obj, long j3, byte b3) {
            if (o0.f5879w) {
                o0.L(obj, j3, b3);
            } else {
                o0.M(obj, j3, b3);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public void m(Object obj, long j3, double d3) {
            p(obj, j3, Double.doubleToLongBits(d3));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public void n(Object obj, long j3, float f3) {
            o(obj, j3, Float.floatToIntBits(f3));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public boolean s() {
            return false;
        }
    }

    public static final class c extends e {
        public c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public boolean c(Object obj, long j3) {
            return o0.f5879w ? o0.s(obj, j3) : o0.t(obj, j3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public byte d(Object obj, long j3) {
            return o0.f5879w ? o0.v(obj, j3) : o0.w(obj, j3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public double e(Object obj, long j3) {
            return Double.longBitsToDouble(h(obj, j3));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public float f(Object obj, long j3) {
            return Float.intBitsToFloat(g(obj, j3));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public void k(Object obj, long j3, boolean z3) {
            if (o0.f5879w) {
                o0.I(obj, j3, z3);
            } else {
                o0.J(obj, j3, z3);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public void l(Object obj, long j3, byte b3) {
            if (o0.f5879w) {
                o0.L(obj, j3, b3);
            } else {
                o0.M(obj, j3, b3);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public void m(Object obj, long j3, double d3) {
            p(obj, j3, Double.doubleToLongBits(d3));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public void n(Object obj, long j3, float f3) {
            o(obj, j3, Float.floatToIntBits(f3));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public boolean s() {
            return false;
        }
    }

    public static final class d extends e {
        public d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public boolean c(Object obj, long j3) {
            return this.f5880a.getBoolean(obj, j3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public byte d(Object obj, long j3) {
            return this.f5880a.getByte(obj, j3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public double e(Object obj, long j3) {
            return this.f5880a.getDouble(obj, j3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public float f(Object obj, long j3) {
            return this.f5880a.getFloat(obj, j3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public void k(Object obj, long j3, boolean z3) {
            this.f5880a.putBoolean(obj, j3, z3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public void l(Object obj, long j3, byte b3) {
            this.f5880a.putByte(obj, j3, b3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public void m(Object obj, long j3, double d3) {
            this.f5880a.putDouble(obj, j3, d3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public void n(Object obj, long j3, float f3) {
            this.f5880a.putFloat(obj, j3, f3);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public boolean r() {
            if (!super.r()) {
                return false;
            }
            try {
                Class<?> cls = this.f5880a.getClass();
                Class cls2 = Long.TYPE;
                cls.getMethod("getByte", Object.class, cls2);
                cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
                cls.getMethod("getBoolean", Object.class, cls2);
                cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
                cls.getMethod("getFloat", Object.class, cls2);
                cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
                cls.getMethod("getDouble", Object.class, cls2);
                cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
                return true;
            } catch (Throwable th) {
                o0.G(th);
                return false;
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.o0.e
        public boolean s() {
            if (!super.s()) {
                return false;
            }
            try {
                Class<?> cls = this.f5880a.getClass();
                Class cls2 = Long.TYPE;
                cls.getMethod("getByte", cls2);
                cls.getMethod("putByte", cls2, Byte.TYPE);
                cls.getMethod("getInt", cls2);
                cls.getMethod("putInt", cls2, Integer.TYPE);
                cls.getMethod("getLong", cls2);
                cls.getMethod("putLong", cls2, cls2);
                cls.getMethod("copyMemory", cls2, cls2, cls2);
                cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
                return true;
            } catch (Throwable th) {
                o0.G(th);
                return false;
            }
        }
    }

    public static abstract class e {

        /* renamed from: a, reason: collision with root package name */
        public Unsafe f5880a;

        public e(Unsafe unsafe) {
            this.f5880a = unsafe;
        }

        public final int a(Class cls) {
            return this.f5880a.arrayBaseOffset(cls);
        }

        public final int b(Class cls) {
            return this.f5880a.arrayIndexScale(cls);
        }

        public abstract boolean c(Object obj, long j3);

        public abstract byte d(Object obj, long j3);

        public abstract double e(Object obj, long j3);

        public abstract float f(Object obj, long j3);

        public final int g(Object obj, long j3) {
            return this.f5880a.getInt(obj, j3);
        }

        public final long h(Object obj, long j3) {
            return this.f5880a.getLong(obj, j3);
        }

        public final Object i(Object obj, long j3) {
            return this.f5880a.getObject(obj, j3);
        }

        public final long j(Field field) {
            return this.f5880a.objectFieldOffset(field);
        }

        public abstract void k(Object obj, long j3, boolean z3);

        public abstract void l(Object obj, long j3, byte b3);

        public abstract void m(Object obj, long j3, double d3);

        public abstract void n(Object obj, long j3, float f3);

        public final void o(Object obj, long j3, int i3) {
            this.f5880a.putInt(obj, j3, i3);
        }

        public final void p(Object obj, long j3, long j4) {
            this.f5880a.putLong(obj, j3, j4);
        }

        public final void q(Object obj, long j3, Object obj2) {
            this.f5880a.putObject(obj, j3, obj2);
        }

        public boolean r() {
            Unsafe unsafe = this.f5880a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("arrayBaseOffset", Class.class);
                cls.getMethod("arrayIndexScale", Class.class);
                Class cls2 = Long.TYPE;
                cls.getMethod("getInt", Object.class, cls2);
                cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
                cls.getMethod("getLong", Object.class, cls2);
                cls.getMethod("putLong", Object.class, cls2, cls2);
                cls.getMethod("getObject", Object.class, cls2);
                cls.getMethod("putObject", Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th) {
                o0.G(th);
                return false;
            }
        }

        public boolean s() {
            Unsafe unsafe = this.f5880a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", Field.class);
                cls.getMethod("getLong", Object.class, Long.TYPE);
                return o0.n() != null;
            } catch (Throwable th) {
                o0.G(th);
                return false;
            }
        }
    }

    static {
        long l3 = l(byte[].class);
        f5864h = l3;
        f5865i = l(boolean[].class);
        f5866j = m(boolean[].class);
        f5867k = l(int[].class);
        f5868l = m(int[].class);
        f5869m = l(long[].class);
        f5870n = m(long[].class);
        f5871o = l(float[].class);
        f5872p = m(float[].class);
        f5873q = l(double[].class);
        f5874r = m(double[].class);
        f5875s = l(Object[].class);
        f5876t = m(Object[].class);
        f5877u = q(n());
        f5878v = (int) (l3 & 7);
        f5879w = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static long A(Object obj, long j3) {
        return f5861e.h(obj, j3);
    }

    public static e B() {
        Unsafe unsafe = f5857a;
        if (unsafe == null) {
            return null;
        }
        if (!AbstractC0413d.c()) {
            return new d(unsafe);
        }
        if (f5859c) {
            return new c(unsafe);
        }
        if (f5860d) {
            return new b(unsafe);
        }
        return null;
    }

    public static Object C(Object obj, long j3) {
        return f5861e.i(obj, j3);
    }

    public static Unsafe D() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean E() {
        return f5863g;
    }

    public static boolean F() {
        return f5862f;
    }

    public static void G(Throwable th) {
        Logger.getLogger(o0.class.getName()).log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
    }

    public static void H(Object obj, long j3, boolean z3) {
        f5861e.k(obj, j3, z3);
    }

    public static void I(Object obj, long j3, boolean z3) {
        L(obj, j3, z3 ? (byte) 1 : (byte) 0);
    }

    public static void J(Object obj, long j3, boolean z3) {
        M(obj, j3, z3 ? (byte) 1 : (byte) 0);
    }

    public static void K(byte[] bArr, long j3, byte b3) {
        f5861e.l(bArr, f5864h + j3, b3);
    }

    public static void L(Object obj, long j3, byte b3) {
        long j4 = (-4) & j3;
        int z3 = z(obj, j4);
        int i3 = ((~((int) j3)) & 3) << 3;
        P(obj, j4, ((255 & b3) << i3) | (z3 & (~(255 << i3))));
    }

    public static void M(Object obj, long j3, byte b3) {
        long j4 = (-4) & j3;
        int i3 = (((int) j3) & 3) << 3;
        P(obj, j4, ((255 & b3) << i3) | (z(obj, j4) & (~(255 << i3))));
    }

    public static void N(Object obj, long j3, double d3) {
        f5861e.m(obj, j3, d3);
    }

    public static void O(Object obj, long j3, float f3) {
        f5861e.n(obj, j3, f3);
    }

    public static void P(Object obj, long j3, int i3) {
        f5861e.o(obj, j3, i3);
    }

    public static void Q(Object obj, long j3, long j4) {
        f5861e.p(obj, j3, j4);
    }

    public static void R(Object obj, long j3, Object obj2) {
        f5861e.q(obj, j3, obj2);
    }

    public static boolean S() {
        e eVar = f5861e;
        if (eVar == null) {
            return false;
        }
        return eVar.r();
    }

    public static boolean T() {
        e eVar = f5861e;
        if (eVar == null) {
            return false;
        }
        return eVar.s();
    }

    public static Object k(Class cls) {
        try {
            return f5857a.allocateInstance(cls);
        } catch (InstantiationException e3) {
            throw new IllegalStateException(e3);
        }
    }

    public static int l(Class cls) {
        if (f5863g) {
            return f5861e.a(cls);
        }
        return -1;
    }

    public static int m(Class cls) {
        if (f5863g) {
            return f5861e.b(cls);
        }
        return -1;
    }

    public static Field n() {
        Field p3;
        if (AbstractC0413d.c() && (p3 = p(Buffer.class, "effectiveDirectAddress")) != null) {
            return p3;
        }
        Field p4 = p(Buffer.class, "address");
        if (p4 == null || p4.getType() != Long.TYPE) {
            return null;
        }
        return p4;
    }

    public static boolean o(Class cls) {
        if (!AbstractC0413d.c()) {
            return false;
        }
        try {
            Class cls2 = f5858b;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static Field p(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static long q(Field field) {
        e eVar;
        if (field == null || (eVar = f5861e) == null) {
            return -1L;
        }
        return eVar.j(field);
    }

    public static boolean r(Object obj, long j3) {
        return f5861e.c(obj, j3);
    }

    public static boolean s(Object obj, long j3) {
        return v(obj, j3) != 0;
    }

    public static boolean t(Object obj, long j3) {
        return w(obj, j3) != 0;
    }

    public static byte u(byte[] bArr, long j3) {
        return f5861e.d(bArr, f5864h + j3);
    }

    public static byte v(Object obj, long j3) {
        return (byte) ((z(obj, (-4) & j3) >>> ((int) (((~j3) & 3) << 3))) & 255);
    }

    public static byte w(Object obj, long j3) {
        return (byte) ((z(obj, (-4) & j3) >>> ((int) ((j3 & 3) << 3))) & 255);
    }

    public static double x(Object obj, long j3) {
        return f5861e.e(obj, j3);
    }

    public static float y(Object obj, long j3) {
        return f5861e.f(obj, j3);
    }

    public static int z(Object obj, long j3) {
        return f5861e.g(obj, j3);
    }
}
