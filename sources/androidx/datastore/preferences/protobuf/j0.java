package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f3686a = Logger.getLogger(j0.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final Unsafe f3687b = B();

    /* renamed from: c, reason: collision with root package name */
    public static final Class f3688c = AbstractC0318d.b();

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f3689d = m(Long.TYPE);

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f3690e = m(Integer.TYPE);

    /* renamed from: f, reason: collision with root package name */
    public static final e f3691f = z();

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f3692g = Q();

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f3693h = P();

    /* renamed from: i, reason: collision with root package name */
    public static final long f3694i;

    /* renamed from: j, reason: collision with root package name */
    public static final long f3695j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f3696k;

    /* renamed from: l, reason: collision with root package name */
    public static final long f3697l;

    /* renamed from: m, reason: collision with root package name */
    public static final long f3698m;

    /* renamed from: n, reason: collision with root package name */
    public static final long f3699n;

    /* renamed from: o, reason: collision with root package name */
    public static final long f3700o;

    /* renamed from: p, reason: collision with root package name */
    public static final long f3701p;

    /* renamed from: q, reason: collision with root package name */
    public static final long f3702q;

    /* renamed from: r, reason: collision with root package name */
    public static final long f3703r;

    /* renamed from: s, reason: collision with root package name */
    public static final long f3704s;

    /* renamed from: t, reason: collision with root package name */
    public static final long f3705t;

    /* renamed from: u, reason: collision with root package name */
    public static final long f3706u;

    /* renamed from: v, reason: collision with root package name */
    public static final long f3707v;

    /* renamed from: w, reason: collision with root package name */
    public static final int f3708w;

    /* renamed from: x, reason: collision with root package name */
    public static final boolean f3709x;

    public static class a implements PrivilegedExceptionAction {
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

        @Override // androidx.datastore.preferences.protobuf.j0.e
        public boolean c(Object obj, long j3) {
            return j0.f3709x ? j0.q(obj, j3) : j0.r(obj, j3);
        }

        @Override // androidx.datastore.preferences.protobuf.j0.e
        public byte d(Object obj, long j3) {
            return j0.f3709x ? j0.t(obj, j3) : j0.u(obj, j3);
        }

        @Override // androidx.datastore.preferences.protobuf.j0.e
        public double e(Object obj, long j3) {
            return Double.longBitsToDouble(h(obj, j3));
        }

        @Override // androidx.datastore.preferences.protobuf.j0.e
        public float f(Object obj, long j3) {
            return Float.intBitsToFloat(g(obj, j3));
        }

        @Override // androidx.datastore.preferences.protobuf.j0.e
        public void k(Object obj, long j3, boolean z3) {
            if (j0.f3709x) {
                j0.F(obj, j3, z3);
            } else {
                j0.G(obj, j3, z3);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.j0.e
        public void l(Object obj, long j3, byte b3) {
            if (j0.f3709x) {
                j0.I(obj, j3, b3);
            } else {
                j0.J(obj, j3, b3);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.j0.e
        public void m(Object obj, long j3, double d3) {
            p(obj, j3, Double.doubleToLongBits(d3));
        }

        @Override // androidx.datastore.preferences.protobuf.j0.e
        public void n(Object obj, long j3, float f3) {
            o(obj, j3, Float.floatToIntBits(f3));
        }
    }

    public static final class c extends e {
        public c(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.j0.e
        public boolean c(Object obj, long j3) {
            return j0.f3709x ? j0.q(obj, j3) : j0.r(obj, j3);
        }

        @Override // androidx.datastore.preferences.protobuf.j0.e
        public byte d(Object obj, long j3) {
            return j0.f3709x ? j0.t(obj, j3) : j0.u(obj, j3);
        }

        @Override // androidx.datastore.preferences.protobuf.j0.e
        public double e(Object obj, long j3) {
            return Double.longBitsToDouble(h(obj, j3));
        }

        @Override // androidx.datastore.preferences.protobuf.j0.e
        public float f(Object obj, long j3) {
            return Float.intBitsToFloat(g(obj, j3));
        }

        @Override // androidx.datastore.preferences.protobuf.j0.e
        public void k(Object obj, long j3, boolean z3) {
            if (j0.f3709x) {
                j0.F(obj, j3, z3);
            } else {
                j0.G(obj, j3, z3);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.j0.e
        public void l(Object obj, long j3, byte b3) {
            if (j0.f3709x) {
                j0.I(obj, j3, b3);
            } else {
                j0.J(obj, j3, b3);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.j0.e
        public void m(Object obj, long j3, double d3) {
            p(obj, j3, Double.doubleToLongBits(d3));
        }

        @Override // androidx.datastore.preferences.protobuf.j0.e
        public void n(Object obj, long j3, float f3) {
            o(obj, j3, Float.floatToIntBits(f3));
        }
    }

    public static final class d extends e {
        public d(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // androidx.datastore.preferences.protobuf.j0.e
        public boolean c(Object obj, long j3) {
            return this.f3710a.getBoolean(obj, j3);
        }

        @Override // androidx.datastore.preferences.protobuf.j0.e
        public byte d(Object obj, long j3) {
            return this.f3710a.getByte(obj, j3);
        }

        @Override // androidx.datastore.preferences.protobuf.j0.e
        public double e(Object obj, long j3) {
            return this.f3710a.getDouble(obj, j3);
        }

        @Override // androidx.datastore.preferences.protobuf.j0.e
        public float f(Object obj, long j3) {
            return this.f3710a.getFloat(obj, j3);
        }

        @Override // androidx.datastore.preferences.protobuf.j0.e
        public void k(Object obj, long j3, boolean z3) {
            this.f3710a.putBoolean(obj, j3, z3);
        }

        @Override // androidx.datastore.preferences.protobuf.j0.e
        public void l(Object obj, long j3, byte b3) {
            this.f3710a.putByte(obj, j3, b3);
        }

        @Override // androidx.datastore.preferences.protobuf.j0.e
        public void m(Object obj, long j3, double d3) {
            this.f3710a.putDouble(obj, j3, d3);
        }

        @Override // androidx.datastore.preferences.protobuf.j0.e
        public void n(Object obj, long j3, float f3) {
            this.f3710a.putFloat(obj, j3, f3);
        }
    }

    public static abstract class e {

        /* renamed from: a, reason: collision with root package name */
        public Unsafe f3710a;

        public e(Unsafe unsafe) {
            this.f3710a = unsafe;
        }

        public final int a(Class cls) {
            return this.f3710a.arrayBaseOffset(cls);
        }

        public final int b(Class cls) {
            return this.f3710a.arrayIndexScale(cls);
        }

        public abstract boolean c(Object obj, long j3);

        public abstract byte d(Object obj, long j3);

        public abstract double e(Object obj, long j3);

        public abstract float f(Object obj, long j3);

        public final int g(Object obj, long j3) {
            return this.f3710a.getInt(obj, j3);
        }

        public final long h(Object obj, long j3) {
            return this.f3710a.getLong(obj, j3);
        }

        public final Object i(Object obj, long j3) {
            return this.f3710a.getObject(obj, j3);
        }

        public final long j(Field field) {
            return this.f3710a.objectFieldOffset(field);
        }

        public abstract void k(Object obj, long j3, boolean z3);

        public abstract void l(Object obj, long j3, byte b3);

        public abstract void m(Object obj, long j3, double d3);

        public abstract void n(Object obj, long j3, float f3);

        public final void o(Object obj, long j3, int i3) {
            this.f3710a.putInt(obj, j3, i3);
        }

        public final void p(Object obj, long j3, long j4) {
            this.f3710a.putLong(obj, j3, j4);
        }

        public final void q(Object obj, long j3, Object obj2) {
            this.f3710a.putObject(obj, j3, obj2);
        }
    }

    static {
        long j3 = j(byte[].class);
        f3694i = j3;
        f3695j = j(boolean[].class);
        f3696k = k(boolean[].class);
        f3697l = j(int[].class);
        f3698m = k(int[].class);
        f3699n = j(long[].class);
        f3700o = k(long[].class);
        f3701p = j(float[].class);
        f3702q = k(float[].class);
        f3703r = j(double[].class);
        f3704s = k(double[].class);
        f3705t = j(Object[].class);
        f3706u = k(Object[].class);
        f3707v = o(l());
        f3708w = (int) (j3 & 7);
        f3709x = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    public static Object A(Object obj, long j3) {
        return f3691f.i(obj, j3);
    }

    public static Unsafe B() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean C() {
        return f3693h;
    }

    public static boolean D() {
        return f3692g;
    }

    public static void E(Object obj, long j3, boolean z3) {
        f3691f.k(obj, j3, z3);
    }

    public static void F(Object obj, long j3, boolean z3) {
        I(obj, j3, z3 ? (byte) 1 : (byte) 0);
    }

    public static void G(Object obj, long j3, boolean z3) {
        J(obj, j3, z3 ? (byte) 1 : (byte) 0);
    }

    public static void H(byte[] bArr, long j3, byte b3) {
        f3691f.l(bArr, f3694i + j3, b3);
    }

    public static void I(Object obj, long j3, byte b3) {
        long j4 = (-4) & j3;
        int x3 = x(obj, j4);
        int i3 = ((~((int) j3)) & 3) << 3;
        M(obj, j4, ((255 & b3) << i3) | (x3 & (~(255 << i3))));
    }

    public static void J(Object obj, long j3, byte b3) {
        long j4 = (-4) & j3;
        int i3 = (((int) j3) & 3) << 3;
        M(obj, j4, ((255 & b3) << i3) | (x(obj, j4) & (~(255 << i3))));
    }

    public static void K(Object obj, long j3, double d3) {
        f3691f.m(obj, j3, d3);
    }

    public static void L(Object obj, long j3, float f3) {
        f3691f.n(obj, j3, f3);
    }

    public static void M(Object obj, long j3, int i3) {
        f3691f.o(obj, j3, i3);
    }

    public static void N(Object obj, long j3, long j4) {
        f3691f.p(obj, j3, j4);
    }

    public static void O(Object obj, long j3, Object obj2) {
        f3691f.q(obj, j3, obj2);
    }

    public static boolean P() {
        Unsafe unsafe = f3687b;
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
            if (AbstractC0318d.c()) {
                return true;
            }
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
            f3686a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
            return false;
        }
    }

    public static boolean Q() {
        Unsafe unsafe = f3687b;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            Class cls2 = Long.TYPE;
            cls.getMethod("getLong", Object.class, cls2);
            if (l() == null) {
                return false;
            }
            if (AbstractC0318d.c()) {
                return true;
            }
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
            f3686a.log(Level.WARNING, "platform method missing - proto runtime falling back to safer methods: " + th);
            return false;
        }
    }

    public static Object i(Class cls) {
        try {
            return f3687b.allocateInstance(cls);
        } catch (InstantiationException e3) {
            throw new IllegalStateException(e3);
        }
    }

    public static int j(Class cls) {
        if (f3693h) {
            return f3691f.a(cls);
        }
        return -1;
    }

    public static int k(Class cls) {
        if (f3693h) {
            return f3691f.b(cls);
        }
        return -1;
    }

    public static Field l() {
        Field n3;
        if (AbstractC0318d.c() && (n3 = n(Buffer.class, "effectiveDirectAddress")) != null) {
            return n3;
        }
        Field n4 = n(Buffer.class, "address");
        if (n4 == null || n4.getType() != Long.TYPE) {
            return null;
        }
        return n4;
    }

    public static boolean m(Class cls) {
        if (!AbstractC0318d.c()) {
            return false;
        }
        try {
            Class cls2 = f3688c;
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

    public static Field n(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static long o(Field field) {
        e eVar;
        if (field == null || (eVar = f3691f) == null) {
            return -1L;
        }
        return eVar.j(field);
    }

    public static boolean p(Object obj, long j3) {
        return f3691f.c(obj, j3);
    }

    public static boolean q(Object obj, long j3) {
        return t(obj, j3) != 0;
    }

    public static boolean r(Object obj, long j3) {
        return u(obj, j3) != 0;
    }

    public static byte s(byte[] bArr, long j3) {
        return f3691f.d(bArr, f3694i + j3);
    }

    public static byte t(Object obj, long j3) {
        return (byte) ((x(obj, (-4) & j3) >>> ((int) (((~j3) & 3) << 3))) & 255);
    }

    public static byte u(Object obj, long j3) {
        return (byte) ((x(obj, (-4) & j3) >>> ((int) ((j3 & 3) << 3))) & 255);
    }

    public static double v(Object obj, long j3) {
        return f3691f.e(obj, j3);
    }

    public static float w(Object obj, long j3) {
        return f3691f.f(obj, j3);
    }

    public static int x(Object obj, long j3) {
        return f3691f.g(obj, j3);
    }

    public static long y(Object obj, long j3) {
        return f3691f.h(obj, j3);
    }

    public static e z() {
        Unsafe unsafe = f3687b;
        if (unsafe == null) {
            return null;
        }
        if (!AbstractC0318d.c()) {
            return new d(unsafe);
        }
        if (f3689d) {
            return new c(unsafe);
        }
        if (f3690e) {
            return new b(unsafe);
        }
        return null;
    }
}
