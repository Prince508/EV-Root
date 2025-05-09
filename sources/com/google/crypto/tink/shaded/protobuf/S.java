package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC0414e;
import com.google.crypto.tink.shaded.protobuf.AbstractC0434z;
import com.google.crypto.tink.shaded.protobuf.H;
import com.google.crypto.tink.shaded.protobuf.r0;
import j.AbstractC0515e;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class S implements e0 {

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f5742r = new int[0];

    /* renamed from: s, reason: collision with root package name */
    public static final Unsafe f5743s = o0.D();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f5744a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f5745b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5746c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5747d;

    /* renamed from: e, reason: collision with root package name */
    public final O f5748e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f5749f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f5750g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f5751h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f5752i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f5753j;

    /* renamed from: k, reason: collision with root package name */
    public final int f5754k;

    /* renamed from: l, reason: collision with root package name */
    public final int f5755l;

    /* renamed from: m, reason: collision with root package name */
    public final U f5756m;

    /* renamed from: n, reason: collision with root package name */
    public final E f5757n;

    /* renamed from: o, reason: collision with root package name */
    public final k0 f5758o;

    /* renamed from: p, reason: collision with root package name */
    public final AbstractC0426q f5759p;

    /* renamed from: q, reason: collision with root package name */
    public final J f5760q;

    public S(int[] iArr, Object[] objArr, int i3, int i4, O o3, boolean z3, boolean z4, int[] iArr2, int i5, int i6, U u3, E e3, k0 k0Var, AbstractC0426q abstractC0426q, J j3) {
        this.f5744a = iArr;
        this.f5745b = objArr;
        this.f5746c = i3;
        this.f5747d = i4;
        this.f5750g = o3 instanceof AbstractC0432x;
        this.f5751h = z3;
        this.f5749f = abstractC0426q != null && abstractC0426q.e(o3);
        this.f5752i = z4;
        this.f5753j = iArr2;
        this.f5754k = i5;
        this.f5755l = i6;
        this.f5756m = u3;
        this.f5757n = e3;
        this.f5758o = k0Var;
        this.f5759p = abstractC0426q;
        this.f5748e = o3;
        this.f5760q = j3;
    }

    public static boolean A(int i3) {
        return (i3 & 536870912) != 0;
    }

    public static boolean D(Object obj, int i3, e0 e0Var) {
        return e0Var.b(o0.C(obj, X(i3)));
    }

    public static boolean G(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof AbstractC0432x) {
            return ((AbstractC0432x) obj).D();
        }
        return true;
    }

    public static boolean J(int i3) {
        return (i3 & 268435456) != 0;
    }

    public static List K(Object obj, long j3) {
        return (List) o0.C(obj, j3);
    }

    public static long L(Object obj, long j3) {
        return o0.A(obj, j3);
    }

    public static S T(Class cls, M m3, U u3, E e3, k0 k0Var, AbstractC0426q abstractC0426q, J j3) {
        if (m3 instanceof c0) {
            return V((c0) m3, u3, e3, k0Var, abstractC0426q, j3);
        }
        AbstractC0515e.a(m3);
        return U(null, u3, e3, k0Var, abstractC0426q, j3);
    }

    public static S U(h0 h0Var, U u3, E e3, k0 k0Var, AbstractC0426q abstractC0426q, J j3) {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x025b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.crypto.tink.shaded.protobuf.S V(com.google.crypto.tink.shaded.protobuf.c0 r33, com.google.crypto.tink.shaded.protobuf.U r34, com.google.crypto.tink.shaded.protobuf.E r35, com.google.crypto.tink.shaded.protobuf.k0 r36, com.google.crypto.tink.shaded.protobuf.AbstractC0426q r37, com.google.crypto.tink.shaded.protobuf.J r38) {
        /*
            Method dump skipped, instructions count: 977
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.S.V(com.google.crypto.tink.shaded.protobuf.c0, com.google.crypto.tink.shaded.protobuf.U, com.google.crypto.tink.shaded.protobuf.E, com.google.crypto.tink.shaded.protobuf.k0, com.google.crypto.tink.shaded.protobuf.q, com.google.crypto.tink.shaded.protobuf.J):com.google.crypto.tink.shaded.protobuf.S");
    }

    public static long X(int i3) {
        return i3 & 1048575;
    }

    public static boolean Y(Object obj, long j3) {
        return ((Boolean) o0.C(obj, j3)).booleanValue();
    }

    public static double Z(Object obj, long j3) {
        return ((Double) o0.C(obj, j3)).doubleValue();
    }

    public static float a0(Object obj, long j3) {
        return ((Float) o0.C(obj, j3)).floatValue();
    }

    public static int b0(Object obj, long j3) {
        return ((Integer) o0.C(obj, j3)).intValue();
    }

    public static long c0(Object obj, long j3) {
        return ((Long) o0.C(obj, j3)).longValue();
    }

    public static boolean l(Object obj, long j3) {
        return o0.r(obj, j3);
    }

    public static void m(Object obj) {
        if (G(obj)) {
            return;
        }
        throw new IllegalArgumentException("Mutating immutable message: " + obj);
    }

    public static double o(Object obj, long j3) {
        return o0.x(obj, j3);
    }

    public static Field p0(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    public static float r(Object obj, long j3) {
        return o0.y(obj, j3);
    }

    public static l0 v(Object obj) {
        AbstractC0432x abstractC0432x = (AbstractC0432x) obj;
        l0 l0Var = abstractC0432x.unknownFields;
        if (l0Var != l0.c()) {
            return l0Var;
        }
        l0 k3 = l0.k();
        abstractC0432x.unknownFields = k3;
        return k3;
    }

    public static int v0(int i3) {
        return (i3 & 267386880) >>> 20;
    }

    public static int z(Object obj, long j3) {
        return o0.z(obj, j3);
    }

    public final void A0(r0 r0Var, int i3, Object obj, int i4) {
        if (obj != null) {
            this.f5760q.h(t(i4));
            r0Var.L(i3, null, this.f5760q.b(obj));
        }
    }

    public final boolean B(Object obj, int i3) {
        int k02 = k0(i3);
        long j3 = 1048575 & k02;
        if (j3 != 1048575) {
            return (o0.z(obj, j3) & (1 << (k02 >>> 20))) != 0;
        }
        int w02 = w0(i3);
        long X2 = X(w02);
        switch (v0(w02)) {
            case 0:
                return Double.doubleToRawLongBits(o0.x(obj, X2)) != 0;
            case 1:
                return Float.floatToRawIntBits(o0.y(obj, X2)) != 0;
            case 2:
                return o0.A(obj, X2) != 0;
            case 3:
                return o0.A(obj, X2) != 0;
            case 4:
                return o0.z(obj, X2) != 0;
            case 5:
                return o0.A(obj, X2) != 0;
            case 6:
                return o0.z(obj, X2) != 0;
            case 7:
                return o0.r(obj, X2);
            case 8:
                Object C3 = o0.C(obj, X2);
                if (C3 instanceof String) {
                    return !((String) C3).isEmpty();
                }
                if (C3 instanceof AbstractC0417h) {
                    return !AbstractC0417h.f5793f.equals(C3);
                }
                throw new IllegalArgumentException();
            case 9:
                return o0.C(obj, X2) != null;
            case 10:
                return !AbstractC0417h.f5793f.equals(o0.C(obj, X2));
            case 11:
                return o0.z(obj, X2) != 0;
            case 12:
                return o0.z(obj, X2) != 0;
            case 13:
                return o0.z(obj, X2) != 0;
            case 14:
                return o0.A(obj, X2) != 0;
            case 15:
                return o0.z(obj, X2) != 0;
            case 16:
                return o0.A(obj, X2) != 0;
            case 17:
                return o0.C(obj, X2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final void B0(int i3, Object obj, r0 r0Var) {
        if (obj instanceof String) {
            r0Var.q(i3, (String) obj);
        } else {
            r0Var.J(i3, (AbstractC0417h) obj);
        }
    }

    public final boolean C(Object obj, int i3, int i4, int i5, int i6) {
        return i4 == 1048575 ? B(obj, i3) : (i5 & i6) != 0;
    }

    public final void C0(k0 k0Var, Object obj, r0 r0Var) {
        k0Var.t(k0Var.g(obj), r0Var);
    }

    public final boolean E(Object obj, int i3, int i4) {
        List list = (List) o0.C(obj, X(i3));
        if (list.isEmpty()) {
            return true;
        }
        e0 u3 = u(i4);
        for (int i5 = 0; i5 < list.size(); i5++) {
            if (!u3.b(list.get(i5))) {
                return false;
            }
        }
        return true;
    }

    public final boolean F(Object obj, int i3, int i4) {
        if (this.f5760q.b(o0.C(obj, X(i3))).isEmpty()) {
            return true;
        }
        this.f5760q.h(t(i4));
        throw null;
    }

    public final boolean H(Object obj, Object obj2, int i3) {
        long k02 = k0(i3) & 1048575;
        return o0.z(obj, k02) == o0.z(obj2, k02);
    }

    public final boolean I(Object obj, int i3, int i4) {
        return o0.z(obj, (long) (k0(i4) & 1048575)) == i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:294:0x00a4, code lost:
    
        r0 = r9.f5754k;
        r4 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x00a9, code lost:
    
        if (r0 >= r9.f5755l) goto L357;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x00ab, code lost:
    
        r1 = r9;
        r4 = r1.q(r2, r9.f5753j[r0], r4, r17, r19);
        r6 = r17;
        r0 = r0 + 1;
        r9 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x00c0, code lost:
    
        if (r4 == null) goto L359;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x00c2, code lost:
    
        r6.o(r2, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x06ff A[Catch: all -> 0x0723, TRY_LEAVE, TryCatch #4 {all -> 0x0723, blocks: (B:38:0x06f9, B:40:0x06ff), top: B:37:0x06f9 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0726  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0763 A[LOOP:4: B:69:0x075f->B:71:0x0763, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0777  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void M(com.google.crypto.tink.shaded.protobuf.k0 r17, com.google.crypto.tink.shaded.protobuf.AbstractC0426q r18, java.lang.Object r19, com.google.crypto.tink.shaded.protobuf.d0 r20, com.google.crypto.tink.shaded.protobuf.C0425p r21) {
        /*
            Method dump skipped, instructions count: 2058
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.S.M(com.google.crypto.tink.shaded.protobuf.k0, com.google.crypto.tink.shaded.protobuf.q, java.lang.Object, com.google.crypto.tink.shaded.protobuf.d0, com.google.crypto.tink.shaded.protobuf.p):void");
    }

    public final void N(Object obj, int i3, Object obj2, C0425p c0425p, d0 d0Var) {
        long X2 = X(w0(i3));
        Object C3 = o0.C(obj, X2);
        if (C3 == null) {
            C3 = this.f5760q.c(obj2);
            o0.R(obj, X2, C3);
        } else if (this.f5760q.f(C3)) {
            Object c3 = this.f5760q.c(obj2);
            this.f5760q.a(c3, C3);
            o0.R(obj, X2, c3);
            C3 = c3;
        }
        Map e3 = this.f5760q.e(C3);
        this.f5760q.h(obj2);
        d0Var.K(e3, null, c0425p);
    }

    public final void O(Object obj, Object obj2, int i3) {
        if (B(obj2, i3)) {
            long X2 = X(w0(i3));
            Unsafe unsafe = f5743s;
            Object object = unsafe.getObject(obj2, X2);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + W(i3) + " is present but null: " + obj2);
            }
            e0 u3 = u(i3);
            if (!B(obj, i3)) {
                if (G(object)) {
                    Object e3 = u3.e();
                    u3.a(e3, object);
                    unsafe.putObject(obj, X2, e3);
                } else {
                    unsafe.putObject(obj, X2, object);
                }
                q0(obj, i3);
                return;
            }
            Object object2 = unsafe.getObject(obj, X2);
            if (!G(object2)) {
                Object e4 = u3.e();
                u3.a(e4, object2);
                unsafe.putObject(obj, X2, e4);
                object2 = e4;
            }
            u3.a(object2, object);
        }
    }

    public final void P(Object obj, Object obj2, int i3) {
        int W2 = W(i3);
        if (I(obj2, W2, i3)) {
            long X2 = X(w0(i3));
            Unsafe unsafe = f5743s;
            Object object = unsafe.getObject(obj2, X2);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + W(i3) + " is present but null: " + obj2);
            }
            e0 u3 = u(i3);
            if (!I(obj, W2, i3)) {
                if (G(object)) {
                    Object e3 = u3.e();
                    u3.a(e3, object);
                    unsafe.putObject(obj, X2, e3);
                } else {
                    unsafe.putObject(obj, X2, object);
                }
                r0(obj, W2, i3);
                return;
            }
            Object object2 = unsafe.getObject(obj, X2);
            if (!G(object2)) {
                Object e4 = u3.e();
                u3.a(e4, object2);
                unsafe.putObject(obj, X2, e4);
                object2 = e4;
            }
            u3.a(object2, object);
        }
    }

    public final void Q(Object obj, Object obj2, int i3) {
        int w02 = w0(i3);
        long X2 = X(w02);
        int W2 = W(i3);
        switch (v0(w02)) {
            case 0:
                if (B(obj2, i3)) {
                    o0.N(obj, X2, o0.x(obj2, X2));
                    q0(obj, i3);
                    break;
                }
                break;
            case 1:
                if (B(obj2, i3)) {
                    o0.O(obj, X2, o0.y(obj2, X2));
                    q0(obj, i3);
                    break;
                }
                break;
            case 2:
                if (B(obj2, i3)) {
                    o0.Q(obj, X2, o0.A(obj2, X2));
                    q0(obj, i3);
                    break;
                }
                break;
            case 3:
                if (B(obj2, i3)) {
                    o0.Q(obj, X2, o0.A(obj2, X2));
                    q0(obj, i3);
                    break;
                }
                break;
            case 4:
                if (B(obj2, i3)) {
                    o0.P(obj, X2, o0.z(obj2, X2));
                    q0(obj, i3);
                    break;
                }
                break;
            case 5:
                if (B(obj2, i3)) {
                    o0.Q(obj, X2, o0.A(obj2, X2));
                    q0(obj, i3);
                    break;
                }
                break;
            case 6:
                if (B(obj2, i3)) {
                    o0.P(obj, X2, o0.z(obj2, X2));
                    q0(obj, i3);
                    break;
                }
                break;
            case 7:
                if (B(obj2, i3)) {
                    o0.H(obj, X2, o0.r(obj2, X2));
                    q0(obj, i3);
                    break;
                }
                break;
            case 8:
                if (B(obj2, i3)) {
                    o0.R(obj, X2, o0.C(obj2, X2));
                    q0(obj, i3);
                    break;
                }
                break;
            case 9:
                O(obj, obj2, i3);
                break;
            case 10:
                if (B(obj2, i3)) {
                    o0.R(obj, X2, o0.C(obj2, X2));
                    q0(obj, i3);
                    break;
                }
                break;
            case 11:
                if (B(obj2, i3)) {
                    o0.P(obj, X2, o0.z(obj2, X2));
                    q0(obj, i3);
                    break;
                }
                break;
            case 12:
                if (B(obj2, i3)) {
                    o0.P(obj, X2, o0.z(obj2, X2));
                    q0(obj, i3);
                    break;
                }
                break;
            case 13:
                if (B(obj2, i3)) {
                    o0.P(obj, X2, o0.z(obj2, X2));
                    q0(obj, i3);
                    break;
                }
                break;
            case 14:
                if (B(obj2, i3)) {
                    o0.Q(obj, X2, o0.A(obj2, X2));
                    q0(obj, i3);
                    break;
                }
                break;
            case 15:
                if (B(obj2, i3)) {
                    o0.P(obj, X2, o0.z(obj2, X2));
                    q0(obj, i3);
                    break;
                }
                break;
            case 16:
                if (B(obj2, i3)) {
                    o0.Q(obj, X2, o0.A(obj2, X2));
                    q0(obj, i3);
                    break;
                }
                break;
            case 17:
                O(obj, obj2, i3);
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.f5757n.d(obj, obj2, X2);
                break;
            case 50:
                g0.E(this.f5760q, obj, obj2, X2);
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (I(obj2, W2, i3)) {
                    o0.R(obj, X2, o0.C(obj2, X2));
                    r0(obj, W2, i3);
                    break;
                }
                break;
            case 60:
                P(obj, obj2, i3);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (I(obj2, W2, i3)) {
                    o0.R(obj, X2, o0.C(obj2, X2));
                    r0(obj, W2, i3);
                    break;
                }
                break;
            case 68:
                P(obj, obj2, i3);
                break;
        }
    }

    public final Object R(Object obj, int i3) {
        e0 u3 = u(i3);
        long X2 = X(w0(i3));
        if (!B(obj, i3)) {
            return u3.e();
        }
        Object object = f5743s.getObject(obj, X2);
        if (G(object)) {
            return object;
        }
        Object e3 = u3.e();
        if (object != null) {
            u3.a(e3, object);
        }
        return e3;
    }

    public final Object S(Object obj, int i3, int i4) {
        e0 u3 = u(i4);
        if (!I(obj, i3, i4)) {
            return u3.e();
        }
        Object object = f5743s.getObject(obj, X(w0(i4)));
        if (G(object)) {
            return object;
        }
        Object e3 = u3.e();
        if (object != null) {
            u3.a(e3, object);
        }
        return e3;
    }

    public final int W(int i3) {
        return this.f5744a[i3];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void a(Object obj, Object obj2) {
        m(obj);
        obj2.getClass();
        for (int i3 = 0; i3 < this.f5744a.length; i3 += 3) {
            Q(obj, obj2, i3);
        }
        g0.F(this.f5758o, obj, obj2);
        if (this.f5749f) {
            g0.D(this.f5759p, obj, obj2);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public final boolean b(Object obj) {
        int i3;
        int i4;
        int i5 = 1048575;
        int i6 = 0;
        int i7 = 0;
        while (i6 < this.f5754k) {
            int i8 = this.f5753j[i6];
            int W2 = W(i8);
            int w02 = w0(i8);
            int i9 = this.f5744a[i8 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i5) {
                if (i10 != 1048575) {
                    i7 = f5743s.getInt(obj, i10);
                }
                i4 = i7;
                i3 = i10;
            } else {
                i3 = i5;
                i4 = i7;
            }
            Object obj2 = obj;
            if (J(w02) && !C(obj2, i8, i3, i4, i11)) {
                return false;
            }
            int v02 = v0(w02);
            if (v02 != 9 && v02 != 17) {
                if (v02 != 27) {
                    if (v02 == 60 || v02 == 68) {
                        if (I(obj2, W2, i8) && !D(obj2, w02, u(i8))) {
                            return false;
                        }
                    } else if (v02 != 49) {
                        if (v02 == 50 && !F(obj2, w02, i8)) {
                            return false;
                        }
                    }
                }
                if (!E(obj2, w02, i8)) {
                    return false;
                }
            } else if (C(obj2, i8, i3, i4, i11) && !D(obj2, w02, u(i8))) {
                return false;
            }
            i6++;
            obj = obj2;
            i5 = i3;
            i7 = i4;
        }
        return !this.f5749f || this.f5759p.c(obj).e();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public boolean c(Object obj, Object obj2) {
        int length = this.f5744a.length;
        for (int i3 = 0; i3 < length; i3 += 3) {
            if (!p(obj, obj2, i3)) {
                return false;
            }
        }
        if (!this.f5758o.g(obj).equals(this.f5758o.g(obj2))) {
            return false;
        }
        if (this.f5749f) {
            return this.f5759p.c(obj).equals(this.f5759p.c(obj2));
        }
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public int d(Object obj) {
        return this.f5751h ? x(obj) : w(obj);
    }

    public final int d0(Object obj, byte[] bArr, int i3, int i4, int i5, long j3, AbstractC0414e.a aVar) {
        Unsafe unsafe = f5743s;
        Object t3 = t(i5);
        Object object = unsafe.getObject(obj, j3);
        if (this.f5760q.f(object)) {
            Object c3 = this.f5760q.c(t3);
            this.f5760q.a(c3, object);
            unsafe.putObject(obj, j3, c3);
            object = c3;
        }
        this.f5760q.h(t3);
        return n(bArr, i3, i4, null, this.f5760q.e(object), aVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public Object e() {
        return this.f5756m.a(this.f5748e);
    }

    public final int e0(Object obj, byte[] bArr, int i3, int i4, int i5, int i6, int i7, int i8, int i9, long j3, int i10, AbstractC0414e.a aVar) {
        int i11;
        Unsafe unsafe = f5743s;
        long j4 = this.f5744a[i10 + 2] & 1048575;
        switch (i9) {
            case 51:
                if (i7 != 1) {
                    return i3;
                }
                unsafe.putObject(obj, j3, Double.valueOf(AbstractC0414e.d(bArr, i3)));
                int i12 = i3 + 8;
                unsafe.putInt(obj, j4, i6);
                return i12;
            case 52:
                if (i7 != 5) {
                    return i3;
                }
                unsafe.putObject(obj, j3, Float.valueOf(AbstractC0414e.k(bArr, i3)));
                int i13 = i3 + 4;
                unsafe.putInt(obj, j4, i6);
                return i13;
            case 53:
            case 54:
                if (i7 != 0) {
                    return i3;
                }
                int K3 = AbstractC0414e.K(bArr, i3, aVar);
                unsafe.putObject(obj, j3, Long.valueOf(aVar.f5786b));
                unsafe.putInt(obj, j4, i6);
                return K3;
            case 55:
            case 62:
                if (i7 != 0) {
                    return i3;
                }
                int H3 = AbstractC0414e.H(bArr, i3, aVar);
                unsafe.putObject(obj, j3, Integer.valueOf(aVar.f5785a));
                unsafe.putInt(obj, j4, i6);
                return H3;
            case 56:
            case 65:
                if (i7 != 1) {
                    return i3;
                }
                unsafe.putObject(obj, j3, Long.valueOf(AbstractC0414e.i(bArr, i3)));
                int i14 = i3 + 8;
                unsafe.putInt(obj, j4, i6);
                return i14;
            case 57:
            case 64:
                if (i7 != 5) {
                    return i3;
                }
                unsafe.putObject(obj, j3, Integer.valueOf(AbstractC0414e.g(bArr, i3)));
                int i15 = i3 + 4;
                unsafe.putInt(obj, j4, i6);
                return i15;
            case 58:
                if (i7 != 0) {
                    return i3;
                }
                int K4 = AbstractC0414e.K(bArr, i3, aVar);
                unsafe.putObject(obj, j3, Boolean.valueOf(aVar.f5786b != 0));
                unsafe.putInt(obj, j4, i6);
                return K4;
            case 59:
                if (i7 != 2) {
                    return i3;
                }
                int H4 = AbstractC0414e.H(bArr, i3, aVar);
                int i16 = aVar.f5785a;
                if (i16 == 0) {
                    unsafe.putObject(obj, j3, "");
                } else {
                    if ((i8 & 536870912) != 0 && !p0.n(bArr, H4, H4 + i16)) {
                        throw A.d();
                    }
                    unsafe.putObject(obj, j3, new String(bArr, H4, i16, AbstractC0434z.f6009b));
                    H4 += i16;
                }
                unsafe.putInt(obj, j4, i6);
                return H4;
            case 60:
                i11 = i3;
                if (i7 == 2) {
                    Object S3 = S(obj, i6, i10);
                    int N3 = AbstractC0414e.N(S3, u(i10), bArr, i11, i4, aVar);
                    u0(obj, i6, i10, S3);
                    return N3;
                }
                break;
            case 61:
                i11 = i3;
                if (i7 == 2) {
                    int b3 = AbstractC0414e.b(bArr, i11, aVar);
                    unsafe.putObject(obj, j3, aVar.f5787c);
                    unsafe.putInt(obj, j4, i6);
                    return b3;
                }
                break;
            case 63:
                i11 = i3;
                if (i7 == 0) {
                    int H5 = AbstractC0414e.H(bArr, i11, aVar);
                    int i17 = aVar.f5785a;
                    s(i10);
                    unsafe.putObject(obj, j3, Integer.valueOf(i17));
                    unsafe.putInt(obj, j4, i6);
                    return H5;
                }
                break;
            case 66:
                i11 = i3;
                if (i7 == 0) {
                    int H6 = AbstractC0414e.H(bArr, i11, aVar);
                    unsafe.putObject(obj, j3, Integer.valueOf(AbstractC0418i.b(aVar.f5785a)));
                    unsafe.putInt(obj, j4, i6);
                    return H6;
                }
                break;
            case 67:
                i11 = i3;
                if (i7 == 0) {
                    int K5 = AbstractC0414e.K(bArr, i11, aVar);
                    unsafe.putObject(obj, j3, Long.valueOf(AbstractC0418i.c(aVar.f5786b)));
                    unsafe.putInt(obj, j4, i6);
                    return K5;
                }
                break;
            case 68:
                if (i7 == 3) {
                    Object S4 = S(obj, i6, i10);
                    int M3 = AbstractC0414e.M(S4, u(i10), bArr, i3, i4, (i5 & (-8)) | 4, aVar);
                    u0(obj, i6, i10, S4);
                    return M3;
                }
            default:
                return i3;
        }
        return i11;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void f(Object obj) {
        if (G(obj)) {
            if (obj instanceof AbstractC0432x) {
                AbstractC0432x abstractC0432x = (AbstractC0432x) obj;
                abstractC0432x.n();
                abstractC0432x.m();
                abstractC0432x.F();
            }
            int length = this.f5744a.length;
            for (int i3 = 0; i3 < length; i3 += 3) {
                int w02 = w0(i3);
                long X2 = X(w02);
                int v02 = v0(w02);
                if (v02 != 9) {
                    switch (v02) {
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            this.f5757n.c(obj, X2);
                            break;
                        case 50:
                            Unsafe unsafe = f5743s;
                            Object object = unsafe.getObject(obj, X2);
                            if (object != null) {
                                unsafe.putObject(obj, X2, this.f5760q.g(object));
                                break;
                            } else {
                                break;
                            }
                    }
                }
                if (B(obj, i3)) {
                    u(i3).f(f5743s.getObject(obj, X2));
                }
            }
            this.f5758o.j(obj);
            if (this.f5749f) {
                this.f5759p.f(obj);
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:103:0x0094. Please report as an issue. */
    public int f0(Object obj, byte[] bArr, int i3, int i4, int i5, AbstractC0414e.a aVar) {
        Object obj2;
        int i6;
        Unsafe unsafe;
        S s3;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        AbstractC0414e.a aVar2;
        int i15;
        Object obj3;
        int F3;
        int i16;
        int i17;
        byte[] bArr2;
        int i18;
        Unsafe unsafe2;
        int i19;
        AbstractC0414e.a aVar3;
        Unsafe unsafe3;
        AbstractC0414e.a aVar4;
        Object obj4;
        Unsafe unsafe4;
        int i20;
        int K3;
        byte[] bArr3;
        AbstractC0414e.a aVar5;
        Unsafe unsafe5;
        int i21;
        Object obj5;
        int b3;
        byte[] bArr4;
        int i22;
        int i23;
        S s4 = this;
        Object obj6 = obj;
        byte[] bArr5 = bArr;
        int i24 = i4;
        AbstractC0414e.a aVar6 = aVar;
        m(obj6);
        Unsafe unsafe6 = f5743s;
        int i25 = -1;
        int i26 = i3;
        int i27 = -1;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        int i31 = 1048575;
        while (true) {
            if (i26 < i24) {
                int i32 = i26 + 1;
                int i33 = bArr5[i26];
                if (i33 < 0) {
                    i32 = AbstractC0414e.G(i33, bArr5, i32, aVar6);
                    i33 = aVar6.f5785a;
                }
                int i34 = i32;
                int i35 = i33;
                int i36 = i35 >>> 3;
                int i37 = i35 & 7;
                int j02 = i36 > i27 ? s4.j0(i36, i28 / 3) : s4.i0(i36);
                if (j02 == i25) {
                    i9 = i34;
                    i10 = i31;
                    unsafe = unsafe6;
                    i11 = i25;
                    i12 = i29;
                    i13 = i36;
                    i14 = 0;
                    aVar2 = aVar;
                    s3 = s4;
                    i15 = i35;
                } else {
                    int i38 = s4.f5744a[j02 + 1];
                    int i39 = i25;
                    int v02 = v0(i38);
                    long X2 = X(i38);
                    if (v02 <= 17) {
                        int i40 = s4.f5744a[j02 + 2];
                        int i41 = 1 << (i40 >>> 20);
                        int i42 = i40 & 1048575;
                        if (i42 != i31) {
                            i17 = i36;
                            if (i31 != 1048575) {
                                unsafe6.putInt(obj6, i31, i29);
                            }
                            i29 = unsafe6.getInt(obj6, i42);
                        } else {
                            i17 = i36;
                            i42 = i31;
                        }
                        switch (v02) {
                            case 0:
                                bArr4 = bArr;
                                i18 = j02;
                                i19 = i34;
                                unsafe4 = unsafe6;
                                aVar3 = aVar;
                                if (i37 == 1) {
                                    o0.N(obj6, X2, AbstractC0414e.d(bArr4, i19));
                                    i22 = i19 + 8;
                                    i29 |= i41;
                                    i24 = i4;
                                    aVar6 = aVar3;
                                    i31 = i42;
                                    i28 = i18;
                                    i27 = i17;
                                    i25 = i39;
                                    i30 = i35;
                                    unsafe6 = unsafe4;
                                    i26 = i22;
                                    bArr5 = bArr4;
                                    break;
                                } else {
                                    s3 = s4;
                                    unsafe = unsafe4;
                                    aVar2 = aVar3;
                                    i9 = i19;
                                    i13 = i17;
                                    i11 = i39;
                                    i15 = i35;
                                    i10 = i42;
                                    i12 = i29;
                                    i14 = i18;
                                    break;
                                }
                            case 1:
                                bArr4 = bArr;
                                i18 = j02;
                                i19 = i34;
                                unsafe4 = unsafe6;
                                aVar3 = aVar;
                                if (i37 == 5) {
                                    o0.O(obj6, X2, AbstractC0414e.k(bArr4, i19));
                                    i22 = i19 + 4;
                                    i29 |= i41;
                                    i24 = i4;
                                    aVar6 = aVar3;
                                    i31 = i42;
                                    i28 = i18;
                                    i27 = i17;
                                    i25 = i39;
                                    i30 = i35;
                                    unsafe6 = unsafe4;
                                    i26 = i22;
                                    bArr5 = bArr4;
                                    break;
                                } else {
                                    s3 = s4;
                                    unsafe = unsafe4;
                                    aVar2 = aVar3;
                                    i9 = i19;
                                    i13 = i17;
                                    i11 = i39;
                                    i15 = i35;
                                    i10 = i42;
                                    i12 = i29;
                                    i14 = i18;
                                    break;
                                }
                            case 2:
                            case 3:
                                bArr2 = bArr;
                                i18 = j02;
                                unsafe2 = unsafe6;
                                i19 = i34;
                                aVar3 = aVar;
                                if (i37 == 0) {
                                    int K4 = AbstractC0414e.K(bArr2, i19, aVar3);
                                    Object obj7 = obj6;
                                    unsafe2.putLong(obj7, X2, aVar3.f5786b);
                                    obj6 = obj7;
                                    i29 |= i41;
                                    unsafe6 = unsafe2;
                                    i26 = K4;
                                    aVar6 = aVar3;
                                    i24 = i4;
                                    i31 = i42;
                                    i28 = i18;
                                    bArr5 = bArr2;
                                    i27 = i17;
                                    i25 = i39;
                                    i30 = i35;
                                    break;
                                } else {
                                    unsafe4 = unsafe2;
                                    s3 = s4;
                                    unsafe = unsafe4;
                                    aVar2 = aVar3;
                                    i9 = i19;
                                    i13 = i17;
                                    i11 = i39;
                                    i15 = i35;
                                    i10 = i42;
                                    i12 = i29;
                                    i14 = i18;
                                    break;
                                }
                            case 4:
                            case 11:
                                bArr4 = bArr;
                                i18 = j02;
                                unsafe2 = unsafe6;
                                i19 = i34;
                                aVar3 = aVar;
                                if (i37 == 0) {
                                    int H3 = AbstractC0414e.H(bArr4, i19, aVar3);
                                    unsafe2.putInt(obj6, X2, aVar3.f5785a);
                                    i29 |= i41;
                                    i24 = i4;
                                    i26 = H3;
                                    aVar6 = aVar3;
                                    i31 = i42;
                                    i28 = i18;
                                    i27 = i17;
                                    i25 = i39;
                                    i30 = i35;
                                    unsafe6 = unsafe2;
                                    bArr5 = bArr4;
                                    break;
                                } else {
                                    unsafe4 = unsafe2;
                                    s3 = s4;
                                    unsafe = unsafe4;
                                    aVar2 = aVar3;
                                    i9 = i19;
                                    i13 = i17;
                                    i11 = i39;
                                    i15 = i35;
                                    i10 = i42;
                                    i12 = i29;
                                    i14 = i18;
                                    break;
                                }
                            case 5:
                            case 14:
                                bArr4 = bArr;
                                i18 = j02;
                                Unsafe unsafe7 = unsafe6;
                                Object obj8 = obj6;
                                if (i37 == 1) {
                                    aVar3 = aVar;
                                    unsafe7.putLong(obj8, X2, AbstractC0414e.i(bArr4, i34));
                                    unsafe2 = unsafe7;
                                    obj6 = obj8;
                                    i26 = i34 + 8;
                                    i29 |= i41;
                                    i24 = i4;
                                    aVar6 = aVar3;
                                    i31 = i42;
                                    i28 = i18;
                                    i27 = i17;
                                    i25 = i39;
                                    i30 = i35;
                                    unsafe6 = unsafe2;
                                    bArr5 = bArr4;
                                    break;
                                } else {
                                    unsafe2 = unsafe7;
                                    i19 = i34;
                                    aVar3 = aVar;
                                    unsafe4 = unsafe2;
                                    s3 = s4;
                                    unsafe = unsafe4;
                                    aVar2 = aVar3;
                                    i9 = i19;
                                    i13 = i17;
                                    i11 = i39;
                                    i15 = i35;
                                    i10 = i42;
                                    i12 = i29;
                                    i14 = i18;
                                    break;
                                }
                            case 6:
                            case 13:
                                bArr2 = bArr;
                                i18 = j02;
                                unsafe3 = unsafe6;
                                aVar4 = aVar;
                                obj4 = obj6;
                                if (i37 == 5) {
                                    unsafe3.putInt(obj4, X2, AbstractC0414e.g(bArr2, i34));
                                    i26 = i34 + 4;
                                    i29 |= i41;
                                    i24 = i4;
                                    aVar6 = aVar4;
                                    obj6 = obj4;
                                    i31 = i42;
                                    unsafe6 = unsafe3;
                                    i28 = i18;
                                    bArr5 = bArr2;
                                    i27 = i17;
                                    i25 = i39;
                                    i30 = i35;
                                    break;
                                } else {
                                    unsafe4 = unsafe3;
                                    i19 = i34;
                                    aVar3 = aVar4;
                                    s3 = s4;
                                    unsafe = unsafe4;
                                    aVar2 = aVar3;
                                    i9 = i19;
                                    i13 = i17;
                                    i11 = i39;
                                    i15 = i35;
                                    i10 = i42;
                                    i12 = i29;
                                    i14 = i18;
                                    break;
                                }
                            case 7:
                                bArr2 = bArr;
                                i18 = j02;
                                unsafe3 = unsafe6;
                                i20 = i34;
                                aVar4 = aVar;
                                obj4 = obj6;
                                if (i37 == 0) {
                                    K3 = AbstractC0414e.K(bArr2, i20, aVar4);
                                    o0.H(obj4, X2, aVar4.f5786b != 0);
                                    i29 |= i41;
                                    i24 = i4;
                                    i26 = K3;
                                    aVar6 = aVar4;
                                    obj6 = obj4;
                                    i31 = i42;
                                    unsafe6 = unsafe3;
                                    i28 = i18;
                                    bArr5 = bArr2;
                                    i27 = i17;
                                    i25 = i39;
                                    i30 = i35;
                                    break;
                                } else {
                                    unsafe4 = unsafe3;
                                    aVar3 = aVar4;
                                    i19 = i20;
                                    s3 = s4;
                                    unsafe = unsafe4;
                                    aVar2 = aVar3;
                                    i9 = i19;
                                    i13 = i17;
                                    i11 = i39;
                                    i15 = i35;
                                    i10 = i42;
                                    i12 = i29;
                                    i14 = i18;
                                    break;
                                }
                            case 8:
                                bArr2 = bArr;
                                i18 = j02;
                                unsafe3 = unsafe6;
                                i20 = i34;
                                aVar4 = aVar;
                                obj4 = obj6;
                                if (i37 == 2) {
                                    K3 = (536870912 & i38) == 0 ? AbstractC0414e.B(bArr2, i20, aVar4) : AbstractC0414e.E(bArr2, i20, aVar4);
                                    unsafe3.putObject(obj4, X2, aVar4.f5787c);
                                    i29 |= i41;
                                    i24 = i4;
                                    i26 = K3;
                                    aVar6 = aVar4;
                                    obj6 = obj4;
                                    i31 = i42;
                                    unsafe6 = unsafe3;
                                    i28 = i18;
                                    bArr5 = bArr2;
                                    i27 = i17;
                                    i25 = i39;
                                    i30 = i35;
                                    break;
                                } else {
                                    unsafe4 = unsafe3;
                                    aVar3 = aVar4;
                                    i19 = i20;
                                    s3 = s4;
                                    unsafe = unsafe4;
                                    aVar2 = aVar3;
                                    i9 = i19;
                                    i13 = i17;
                                    i11 = i39;
                                    i15 = i35;
                                    i10 = i42;
                                    i12 = i29;
                                    i14 = i18;
                                    break;
                                }
                            case 9:
                                i18 = j02;
                                unsafe3 = unsafe6;
                                obj4 = obj6;
                                if (i37 == 2) {
                                    Object R3 = s4.R(obj4, i18);
                                    int N3 = AbstractC0414e.N(R3, s4.u(i18), bArr, i34, i4, aVar);
                                    bArr2 = bArr;
                                    aVar4 = aVar;
                                    s4.t0(obj4, i18, R3);
                                    i29 |= i41;
                                    i24 = i4;
                                    i26 = N3;
                                    aVar6 = aVar4;
                                    obj6 = obj4;
                                    i31 = i42;
                                    unsafe6 = unsafe3;
                                    i28 = i18;
                                    bArr5 = bArr2;
                                    i27 = i17;
                                    i25 = i39;
                                    i30 = i35;
                                    break;
                                } else {
                                    i20 = i34;
                                    aVar4 = aVar;
                                    unsafe4 = unsafe3;
                                    aVar3 = aVar4;
                                    i19 = i20;
                                    s3 = s4;
                                    unsafe = unsafe4;
                                    aVar2 = aVar3;
                                    i9 = i19;
                                    i13 = i17;
                                    i11 = i39;
                                    i15 = i35;
                                    i10 = i42;
                                    i12 = i29;
                                    i14 = i18;
                                    break;
                                }
                            case 10:
                                bArr3 = bArr;
                                aVar5 = aVar;
                                i18 = j02;
                                unsafe5 = unsafe6;
                                i21 = i34;
                                obj5 = obj6;
                                if (i37 == 2) {
                                    b3 = AbstractC0414e.b(bArr3, i21, aVar5);
                                    unsafe5.putObject(obj5, X2, aVar5.f5787c);
                                    i29 |= i41;
                                    i24 = i4;
                                    i26 = b3;
                                    bArr5 = bArr3;
                                    obj6 = obj5;
                                    i31 = i42;
                                    unsafe6 = unsafe5;
                                    i28 = i18;
                                    aVar6 = aVar5;
                                    i27 = i17;
                                    i25 = i39;
                                    i30 = i35;
                                    break;
                                } else {
                                    unsafe4 = unsafe5;
                                    aVar3 = aVar5;
                                    i19 = i21;
                                    s3 = s4;
                                    unsafe = unsafe4;
                                    aVar2 = aVar3;
                                    i9 = i19;
                                    i13 = i17;
                                    i11 = i39;
                                    i15 = i35;
                                    i10 = i42;
                                    i12 = i29;
                                    i14 = i18;
                                    break;
                                }
                            case 12:
                                bArr3 = bArr;
                                aVar5 = aVar;
                                i18 = j02;
                                unsafe5 = unsafe6;
                                i21 = i34;
                                obj5 = obj6;
                                if (i37 == 0) {
                                    b3 = AbstractC0414e.H(bArr3, i21, aVar5);
                                    int i43 = aVar5.f5785a;
                                    s4.s(i18);
                                    unsafe5.putInt(obj5, X2, i43);
                                    i29 |= i41;
                                    i24 = i4;
                                    i26 = b3;
                                    bArr5 = bArr3;
                                    obj6 = obj5;
                                    i31 = i42;
                                    unsafe6 = unsafe5;
                                    i28 = i18;
                                    aVar6 = aVar5;
                                    i27 = i17;
                                    i25 = i39;
                                    i30 = i35;
                                    break;
                                } else {
                                    unsafe4 = unsafe5;
                                    aVar3 = aVar5;
                                    i19 = i21;
                                    s3 = s4;
                                    unsafe = unsafe4;
                                    aVar2 = aVar3;
                                    i9 = i19;
                                    i13 = i17;
                                    i11 = i39;
                                    i15 = i35;
                                    i10 = i42;
                                    i12 = i29;
                                    i14 = i18;
                                    break;
                                }
                            case 15:
                                bArr3 = bArr;
                                aVar5 = aVar;
                                i18 = j02;
                                unsafe5 = unsafe6;
                                i21 = i34;
                                obj5 = obj6;
                                if (i37 == 0) {
                                    b3 = AbstractC0414e.H(bArr3, i21, aVar5);
                                    unsafe5.putInt(obj5, X2, AbstractC0418i.b(aVar5.f5785a));
                                    i29 |= i41;
                                    i24 = i4;
                                    i26 = b3;
                                    bArr5 = bArr3;
                                    obj6 = obj5;
                                    i31 = i42;
                                    unsafe6 = unsafe5;
                                    i28 = i18;
                                    aVar6 = aVar5;
                                    i27 = i17;
                                    i25 = i39;
                                    i30 = i35;
                                    break;
                                } else {
                                    unsafe4 = unsafe5;
                                    aVar3 = aVar5;
                                    i19 = i21;
                                    s3 = s4;
                                    unsafe = unsafe4;
                                    aVar2 = aVar3;
                                    i9 = i19;
                                    i13 = i17;
                                    i11 = i39;
                                    i15 = i35;
                                    i10 = i42;
                                    i12 = i29;
                                    i14 = i18;
                                    break;
                                }
                            case 16:
                                bArr3 = bArr;
                                aVar5 = aVar;
                                i18 = j02;
                                if (i37 == 0) {
                                    int K5 = AbstractC0414e.K(bArr3, i34, aVar5);
                                    Object obj9 = obj6;
                                    Unsafe unsafe8 = unsafe6;
                                    unsafe8.putLong(obj9, X2, AbstractC0418i.c(aVar5.f5786b));
                                    unsafe5 = unsafe8;
                                    obj5 = obj9;
                                    i29 |= i41;
                                    i24 = i4;
                                    i26 = K5;
                                    bArr5 = bArr3;
                                    obj6 = obj5;
                                    i31 = i42;
                                    unsafe6 = unsafe5;
                                    i28 = i18;
                                    aVar6 = aVar5;
                                    i27 = i17;
                                    i25 = i39;
                                    i30 = i35;
                                    break;
                                } else {
                                    i19 = i34;
                                    unsafe4 = unsafe6;
                                    aVar3 = aVar5;
                                    s3 = s4;
                                    unsafe = unsafe4;
                                    aVar2 = aVar3;
                                    i9 = i19;
                                    i13 = i17;
                                    i11 = i39;
                                    i15 = i35;
                                    i10 = i42;
                                    i12 = i29;
                                    i14 = i18;
                                    break;
                                }
                            case 17:
                                if (i37 == 3) {
                                    Object R4 = s4.R(obj6, j02);
                                    i18 = j02;
                                    i26 = AbstractC0414e.M(R4, s4.u(j02), bArr, i34, i4, (i17 << 3) | 4, aVar);
                                    aVar5 = aVar;
                                    s4.t0(obj6, i18, R4);
                                    i29 |= i41;
                                    i24 = i4;
                                    bArr5 = bArr;
                                    i31 = i42;
                                    i28 = i18;
                                    aVar6 = aVar5;
                                    i27 = i17;
                                    i25 = i39;
                                    i30 = i35;
                                    break;
                                } else {
                                    i18 = j02;
                                    unsafe4 = unsafe6;
                                    i19 = i34;
                                    aVar3 = aVar;
                                    s3 = s4;
                                    unsafe = unsafe4;
                                    aVar2 = aVar3;
                                    i9 = i19;
                                    i13 = i17;
                                    i11 = i39;
                                    i15 = i35;
                                    i10 = i42;
                                    i12 = i29;
                                    i14 = i18;
                                    break;
                                }
                            default:
                                i18 = j02;
                                unsafe4 = unsafe6;
                                i19 = i34;
                                aVar3 = aVar;
                                s3 = s4;
                                unsafe = unsafe4;
                                aVar2 = aVar3;
                                i9 = i19;
                                i13 = i17;
                                i11 = i39;
                                i15 = i35;
                                i10 = i42;
                                i12 = i29;
                                i14 = i18;
                                break;
                        }
                    } else {
                        int i44 = i35;
                        int i45 = j02;
                        Unsafe unsafe9 = unsafe6;
                        if (v02 != 27) {
                            i23 = i34;
                            if (v02 <= 49) {
                                unsafe = unsafe9;
                                i11 = i39;
                                i10 = i31;
                                i12 = i29;
                                int h02 = s4.h0(obj, bArr, i23, i4, i44, i36, i37, i45, i38, v02, X2, aVar);
                                i44 = i44;
                                i13 = i36;
                                i14 = i45;
                                if (h02 != i23) {
                                    s4 = this;
                                    obj6 = obj;
                                    bArr5 = bArr;
                                    i24 = i4;
                                    i26 = h02;
                                    i27 = i13;
                                    i28 = i14;
                                    i31 = i10;
                                    i29 = i12;
                                    i25 = i11;
                                    i30 = i44;
                                    unsafe6 = unsafe;
                                    aVar6 = aVar;
                                } else {
                                    s3 = this;
                                    aVar2 = aVar;
                                    i9 = h02;
                                }
                            } else {
                                i44 = i44;
                                unsafe = unsafe9;
                                i13 = i36;
                                i11 = i39;
                                i10 = i31;
                                i12 = i29;
                                i14 = i45;
                                if (v02 != 50) {
                                    int e02 = e0(obj, bArr, i23, i4, i44, i13, i37, i38, v02, X2, i14, aVar);
                                    s3 = this;
                                    i15 = i44;
                                    i13 = i13;
                                    aVar2 = aVar;
                                    if (e02 != i23) {
                                        obj6 = obj;
                                        bArr5 = bArr;
                                        i24 = i4;
                                        i30 = i15;
                                        i26 = e02;
                                        s4 = s3;
                                        i27 = i13;
                                        i28 = i14;
                                        aVar6 = aVar2;
                                        i31 = i10;
                                        i29 = i12;
                                        i25 = i11;
                                    } else {
                                        i9 = e02;
                                    }
                                } else if (i37 == 2) {
                                    int d02 = d0(obj, bArr, i23, i4, i14, X2, aVar);
                                    if (d02 != i23) {
                                        s4 = this;
                                        obj6 = obj;
                                        bArr5 = bArr;
                                        i24 = i4;
                                        aVar6 = aVar;
                                        i26 = d02;
                                        i27 = i13;
                                        i28 = i14;
                                        i31 = i10;
                                        i29 = i12;
                                        i25 = i11;
                                        i30 = i44;
                                    } else {
                                        s3 = this;
                                        aVar2 = aVar;
                                        i9 = d02;
                                    }
                                } else {
                                    s3 = this;
                                    aVar2 = aVar;
                                    i9 = i23;
                                }
                                unsafe6 = unsafe;
                            }
                        } else if (i37 == 2) {
                            AbstractC0434z.d dVar = (AbstractC0434z.d) unsafe9.getObject(obj6, X2);
                            if (!dVar.f()) {
                                int size = dVar.size();
                                dVar = dVar.d(size == 0 ? 10 : size * 2);
                                unsafe9.putObject(obj6, X2, dVar);
                            }
                            unsafe6 = unsafe9;
                            i24 = i4;
                            aVar6 = aVar;
                            i26 = AbstractC0414e.p(s4.u(i45), i44, bArr, i34, i4, dVar, aVar);
                            i28 = i45;
                            i27 = i36;
                            i25 = i39;
                            obj6 = obj;
                            i30 = i44;
                            bArr5 = bArr;
                        } else {
                            unsafe = unsafe9;
                            i13 = i36;
                            i23 = i34;
                            i10 = i31;
                            i11 = i39;
                            i12 = i29;
                            i14 = i45;
                            s3 = this;
                            aVar2 = aVar;
                            i9 = i23;
                        }
                        i15 = i44;
                    }
                }
                if (i15 != i5 || i5 == 0) {
                    if (!s3.f5749f || aVar2.f5788d == C0425p.b()) {
                        obj3 = obj;
                        F3 = AbstractC0414e.F(i15, bArr, i9, i4, v(obj3), aVar);
                        i16 = i4;
                    } else {
                        F3 = AbstractC0414e.f(i15, bArr, i9, i4, obj, s3.f5748e, s3.f5758o, aVar2);
                        obj3 = obj;
                        i16 = i4;
                    }
                    i26 = F3;
                    bArr5 = bArr;
                    i30 = i15;
                    obj6 = obj3;
                    i24 = i16;
                    s4 = s3;
                    i27 = i13;
                    i28 = i14;
                    i31 = i10;
                    i29 = i12;
                    i25 = i11;
                    unsafe6 = unsafe;
                    aVar6 = aVar;
                } else {
                    obj2 = obj;
                    i6 = i4;
                    i30 = i15;
                    i7 = i9;
                    i8 = i10;
                    i29 = i12;
                }
            } else {
                obj2 = obj6;
                i6 = i24;
                int i46 = i31;
                unsafe = unsafe6;
                s3 = s4;
                i7 = i26;
                i8 = i46;
            }
        }
        if (i8 != 1048575) {
            unsafe.putInt(obj2, i8, i29);
        }
        l0 l0Var = null;
        for (int i47 = s3.f5754k; i47 < s3.f5755l; i47++) {
            l0Var = (l0) s3.q(obj2, s3.f5753j[i47], l0Var, s3.f5758o, obj);
        }
        Object obj10 = obj2;
        S s5 = s3;
        if (l0Var != null) {
            s5.f5758o.o(obj10, l0Var);
        }
        if (i5 == 0) {
            if (i7 != i6) {
                throw A.h();
            }
        } else if (i7 > i6 || i30 != i5) {
            throw A.h();
        }
        return i7;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public int g(Object obj) {
        int i3;
        int f3;
        int length = this.f5744a.length;
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5 += 3) {
            int w02 = w0(i5);
            int W2 = W(i5);
            long X2 = X(w02);
            int i6 = 37;
            switch (v0(w02)) {
                case 0:
                    i3 = i4 * 53;
                    f3 = AbstractC0434z.f(Double.doubleToLongBits(o0.x(obj, X2)));
                    i4 = i3 + f3;
                    break;
                case 1:
                    i3 = i4 * 53;
                    f3 = Float.floatToIntBits(o0.y(obj, X2));
                    i4 = i3 + f3;
                    break;
                case 2:
                    i3 = i4 * 53;
                    f3 = AbstractC0434z.f(o0.A(obj, X2));
                    i4 = i3 + f3;
                    break;
                case 3:
                    i3 = i4 * 53;
                    f3 = AbstractC0434z.f(o0.A(obj, X2));
                    i4 = i3 + f3;
                    break;
                case 4:
                    i3 = i4 * 53;
                    f3 = o0.z(obj, X2);
                    i4 = i3 + f3;
                    break;
                case 5:
                    i3 = i4 * 53;
                    f3 = AbstractC0434z.f(o0.A(obj, X2));
                    i4 = i3 + f3;
                    break;
                case 6:
                    i3 = i4 * 53;
                    f3 = o0.z(obj, X2);
                    i4 = i3 + f3;
                    break;
                case 7:
                    i3 = i4 * 53;
                    f3 = AbstractC0434z.c(o0.r(obj, X2));
                    i4 = i3 + f3;
                    break;
                case 8:
                    i3 = i4 * 53;
                    f3 = ((String) o0.C(obj, X2)).hashCode();
                    i4 = i3 + f3;
                    break;
                case 9:
                    Object C3 = o0.C(obj, X2);
                    if (C3 != null) {
                        i6 = C3.hashCode();
                    }
                    i4 = (i4 * 53) + i6;
                    break;
                case 10:
                    i3 = i4 * 53;
                    f3 = o0.C(obj, X2).hashCode();
                    i4 = i3 + f3;
                    break;
                case 11:
                    i3 = i4 * 53;
                    f3 = o0.z(obj, X2);
                    i4 = i3 + f3;
                    break;
                case 12:
                    i3 = i4 * 53;
                    f3 = o0.z(obj, X2);
                    i4 = i3 + f3;
                    break;
                case 13:
                    i3 = i4 * 53;
                    f3 = o0.z(obj, X2);
                    i4 = i3 + f3;
                    break;
                case 14:
                    i3 = i4 * 53;
                    f3 = AbstractC0434z.f(o0.A(obj, X2));
                    i4 = i3 + f3;
                    break;
                case 15:
                    i3 = i4 * 53;
                    f3 = o0.z(obj, X2);
                    i4 = i3 + f3;
                    break;
                case 16:
                    i3 = i4 * 53;
                    f3 = AbstractC0434z.f(o0.A(obj, X2));
                    i4 = i3 + f3;
                    break;
                case 17:
                    Object C4 = o0.C(obj, X2);
                    if (C4 != null) {
                        i6 = C4.hashCode();
                    }
                    i4 = (i4 * 53) + i6;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i3 = i4 * 53;
                    f3 = o0.C(obj, X2).hashCode();
                    i4 = i3 + f3;
                    break;
                case 50:
                    i3 = i4 * 53;
                    f3 = o0.C(obj, X2).hashCode();
                    i4 = i3 + f3;
                    break;
                case 51:
                    if (I(obj, W2, i5)) {
                        i3 = i4 * 53;
                        f3 = AbstractC0434z.f(Double.doubleToLongBits(Z(obj, X2)));
                        i4 = i3 + f3;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (I(obj, W2, i5)) {
                        i3 = i4 * 53;
                        f3 = Float.floatToIntBits(a0(obj, X2));
                        i4 = i3 + f3;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (I(obj, W2, i5)) {
                        i3 = i4 * 53;
                        f3 = AbstractC0434z.f(c0(obj, X2));
                        i4 = i3 + f3;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (I(obj, W2, i5)) {
                        i3 = i4 * 53;
                        f3 = AbstractC0434z.f(c0(obj, X2));
                        i4 = i3 + f3;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (I(obj, W2, i5)) {
                        i3 = i4 * 53;
                        f3 = b0(obj, X2);
                        i4 = i3 + f3;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (I(obj, W2, i5)) {
                        i3 = i4 * 53;
                        f3 = AbstractC0434z.f(c0(obj, X2));
                        i4 = i3 + f3;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (I(obj, W2, i5)) {
                        i3 = i4 * 53;
                        f3 = b0(obj, X2);
                        i4 = i3 + f3;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (I(obj, W2, i5)) {
                        i3 = i4 * 53;
                        f3 = AbstractC0434z.c(Y(obj, X2));
                        i4 = i3 + f3;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (I(obj, W2, i5)) {
                        i3 = i4 * 53;
                        f3 = ((String) o0.C(obj, X2)).hashCode();
                        i4 = i3 + f3;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (I(obj, W2, i5)) {
                        i3 = i4 * 53;
                        f3 = o0.C(obj, X2).hashCode();
                        i4 = i3 + f3;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (I(obj, W2, i5)) {
                        i3 = i4 * 53;
                        f3 = o0.C(obj, X2).hashCode();
                        i4 = i3 + f3;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (I(obj, W2, i5)) {
                        i3 = i4 * 53;
                        f3 = b0(obj, X2);
                        i4 = i3 + f3;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (I(obj, W2, i5)) {
                        i3 = i4 * 53;
                        f3 = b0(obj, X2);
                        i4 = i3 + f3;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (I(obj, W2, i5)) {
                        i3 = i4 * 53;
                        f3 = b0(obj, X2);
                        i4 = i3 + f3;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (I(obj, W2, i5)) {
                        i3 = i4 * 53;
                        f3 = AbstractC0434z.f(c0(obj, X2));
                        i4 = i3 + f3;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (I(obj, W2, i5)) {
                        i3 = i4 * 53;
                        f3 = b0(obj, X2);
                        i4 = i3 + f3;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (I(obj, W2, i5)) {
                        i3 = i4 * 53;
                        f3 = AbstractC0434z.f(c0(obj, X2));
                        i4 = i3 + f3;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (I(obj, W2, i5)) {
                        i3 = i4 * 53;
                        f3 = o0.C(obj, X2).hashCode();
                        i4 = i3 + f3;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i4 * 53) + this.f5758o.g(obj).hashCode();
        return this.f5749f ? (hashCode * 53) + this.f5759p.c(obj).hashCode() : hashCode;
    }

    public final int g0(Object obj, byte[] bArr, int i3, int i4, AbstractC0414e.a aVar) {
        Object obj2;
        Unsafe unsafe;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        byte[] bArr2;
        AbstractC0414e.a aVar2;
        int i10;
        int i11;
        int H3;
        Object obj3;
        Unsafe unsafe2;
        int i12;
        AbstractC0414e.a aVar3;
        byte[] bArr3;
        int K3;
        int i13;
        int i14;
        int i15;
        int i16;
        S s3 = this;
        Object obj4 = obj;
        byte[] bArr4 = bArr;
        int i17 = i4;
        AbstractC0414e.a aVar4 = aVar;
        m(obj4);
        Unsafe unsafe3 = f5743s;
        int i18 = -1;
        int i19 = i3;
        int i20 = -1;
        int i21 = 0;
        int i22 = 0;
        int i23 = 1048575;
        while (i19 < i17) {
            int i24 = i19 + 1;
            int i25 = bArr4[i19];
            if (i25 < 0) {
                i24 = AbstractC0414e.G(i25, bArr4, i24, aVar4);
                i25 = aVar4.f5785a;
            }
            int i26 = i25 >>> 3;
            int i27 = i25 & 7;
            int j02 = i26 > i20 ? s3.j0(i26, i21 / 3) : s3.i0(i26);
            if (j02 == i18) {
                obj2 = obj4;
                unsafe = unsafe3;
                i5 = i25;
                i6 = i24;
                i7 = i18;
                i8 = i26;
                i9 = 0;
            } else {
                int i28 = s3.f5744a[j02 + 1];
                int v02 = v0(i28);
                i5 = i25;
                int i29 = j02;
                long X2 = X(i28);
                if (v02 <= 17) {
                    int i30 = s3.f5744a[i29 + 2];
                    int i31 = 1 << (i30 >>> 20);
                    int i32 = i30 & 1048575;
                    if (i32 != i23) {
                        int i33 = 1048575;
                        if (i23 != 1048575) {
                            unsafe3.putInt(obj4, i23, i22);
                            i32 = i32;
                            i33 = 1048575;
                        }
                        if (i32 != i33) {
                            i22 = unsafe3.getInt(obj4, i32);
                        }
                        i23 = i32;
                    }
                    switch (v02) {
                        case 0:
                            byte[] bArr5 = bArr4;
                            i10 = i24;
                            i11 = i29;
                            if (i27 != 1) {
                                unsafe = unsafe3;
                                i6 = i10;
                                i9 = i11;
                                i8 = i26;
                                i7 = -1;
                                obj2 = obj4;
                                break;
                            } else {
                                o0.N(obj4, X2, AbstractC0414e.d(bArr5, i10));
                                i19 = i10 + 8;
                                i22 |= i31;
                                i17 = i4;
                                i21 = i11;
                                i20 = i26;
                                bArr4 = bArr5;
                                i18 = -1;
                                aVar4 = aVar;
                                break;
                            }
                        case 1:
                            AbstractC0414e.a aVar5 = aVar4;
                            bArr2 = bArr4;
                            aVar2 = aVar5;
                            i10 = i24;
                            i11 = i29;
                            if (i27 != 5) {
                                unsafe = unsafe3;
                                i6 = i10;
                                i9 = i11;
                                i8 = i26;
                                i7 = -1;
                                obj2 = obj4;
                                break;
                            } else {
                                o0.O(obj4, X2, AbstractC0414e.k(bArr2, i10));
                                i19 = i10 + 4;
                                i22 |= i31;
                                byte[] bArr6 = bArr2;
                                aVar4 = aVar2;
                                bArr4 = bArr6;
                                i17 = i4;
                                i21 = i11;
                                i20 = i26;
                                i18 = -1;
                                break;
                            }
                        case 2:
                        case 3:
                            AbstractC0414e.a aVar6 = aVar4;
                            byte[] bArr7 = bArr4;
                            i10 = i24;
                            i11 = i29;
                            if (i27 != 0) {
                                unsafe = unsafe3;
                                i6 = i10;
                                i9 = i11;
                                i8 = i26;
                                i7 = -1;
                                obj2 = obj4;
                                break;
                            } else {
                                int K4 = AbstractC0414e.K(bArr7, i10, aVar6);
                                Unsafe unsafe4 = unsafe3;
                                Object obj5 = obj4;
                                unsafe4.putLong(obj5, X2, aVar6.f5786b);
                                unsafe3 = unsafe4;
                                obj4 = obj5;
                                i22 |= i31;
                                aVar4 = aVar6;
                                bArr4 = bArr7;
                                i19 = K4;
                                i21 = i11;
                                i20 = i26;
                                i18 = -1;
                                i17 = i4;
                                break;
                            }
                        case 4:
                        case 11:
                            AbstractC0414e.a aVar7 = aVar4;
                            byte[] bArr8 = bArr4;
                            i10 = i24;
                            i11 = i29;
                            if (i27 != 0) {
                                unsafe = unsafe3;
                                i6 = i10;
                                i9 = i11;
                                i8 = i26;
                                i7 = -1;
                                obj2 = obj4;
                                break;
                            } else {
                                H3 = AbstractC0414e.H(bArr8, i10, aVar7);
                                unsafe3.putInt(obj4, X2, aVar7.f5785a);
                                i22 |= i31;
                                aVar4 = aVar7;
                                bArr4 = bArr8;
                                i17 = i4;
                                i19 = H3;
                                i21 = i11;
                                i20 = i26;
                                i18 = -1;
                                break;
                            }
                        case 5:
                        case 14:
                            byte[] bArr9 = bArr4;
                            Object obj6 = obj4;
                            AbstractC0414e.a aVar8 = aVar4;
                            bArr2 = bArr9;
                            Unsafe unsafe5 = unsafe3;
                            int i34 = i24;
                            i11 = i29;
                            if (i27 != 1) {
                                obj4 = obj6;
                                i10 = i34;
                                unsafe3 = unsafe5;
                                unsafe = unsafe3;
                                i6 = i10;
                                i9 = i11;
                                i8 = i26;
                                i7 = -1;
                                obj2 = obj4;
                                break;
                            } else {
                                aVar2 = aVar8;
                                unsafe5.putLong(obj6, X2, AbstractC0414e.i(bArr2, i34));
                                unsafe3 = unsafe5;
                                obj4 = obj6;
                                i19 = i34 + 8;
                                i22 |= i31;
                                byte[] bArr62 = bArr2;
                                aVar4 = aVar2;
                                bArr4 = bArr62;
                                i17 = i4;
                                i21 = i11;
                                i20 = i26;
                                i18 = -1;
                                break;
                            }
                        case 6:
                        case 13:
                            byte[] bArr10 = bArr4;
                            obj3 = obj4;
                            AbstractC0414e.a aVar9 = aVar4;
                            unsafe2 = unsafe3;
                            i12 = i24;
                            i11 = i29;
                            if (i27 != 5) {
                                Unsafe unsafe6 = unsafe2;
                                i10 = i12;
                                unsafe3 = unsafe6;
                                obj4 = obj3;
                                unsafe = unsafe3;
                                i6 = i10;
                                i9 = i11;
                                i8 = i26;
                                i7 = -1;
                                obj2 = obj4;
                                break;
                            } else {
                                unsafe2.putInt(obj3, X2, AbstractC0414e.g(bArr10, i12));
                                i19 = i12 + 4;
                                i22 |= i31;
                                aVar4 = aVar9;
                                obj4 = obj3;
                                bArr4 = bArr10;
                                unsafe3 = unsafe2;
                                i21 = i11;
                                i20 = i26;
                                i18 = -1;
                                i17 = i4;
                                break;
                            }
                        case 7:
                            byte[] bArr11 = bArr4;
                            obj3 = obj4;
                            aVar3 = aVar4;
                            bArr3 = bArr11;
                            unsafe2 = unsafe3;
                            i12 = i24;
                            i11 = i29;
                            if (i27 != 0) {
                                Unsafe unsafe62 = unsafe2;
                                i10 = i12;
                                unsafe3 = unsafe62;
                                obj4 = obj3;
                                unsafe = unsafe3;
                                i6 = i10;
                                i9 = i11;
                                i8 = i26;
                                i7 = -1;
                                obj2 = obj4;
                                break;
                            } else {
                                K3 = AbstractC0414e.K(bArr3, i12, aVar3);
                                o0.H(obj3, X2, aVar3.f5786b != 0);
                                i22 |= i31;
                                byte[] bArr12 = bArr3;
                                aVar4 = aVar3;
                                obj4 = obj3;
                                bArr4 = bArr12;
                                i19 = K3;
                                unsafe3 = unsafe2;
                                i21 = i11;
                                i20 = i26;
                                i18 = -1;
                                i17 = i4;
                                break;
                            }
                        case 8:
                            byte[] bArr13 = bArr4;
                            obj3 = obj4;
                            aVar3 = aVar4;
                            bArr3 = bArr13;
                            unsafe2 = unsafe3;
                            i12 = i24;
                            i11 = i29;
                            if (i27 != 2) {
                                Unsafe unsafe622 = unsafe2;
                                i10 = i12;
                                unsafe3 = unsafe622;
                                obj4 = obj3;
                                unsafe = unsafe3;
                                i6 = i10;
                                i9 = i11;
                                i8 = i26;
                                i7 = -1;
                                obj2 = obj4;
                                break;
                            } else {
                                K3 = (i28 & 536870912) == 0 ? AbstractC0414e.B(bArr3, i12, aVar3) : AbstractC0414e.E(bArr3, i12, aVar3);
                                unsafe2.putObject(obj3, X2, aVar3.f5787c);
                                i22 |= i31;
                                byte[] bArr122 = bArr3;
                                aVar4 = aVar3;
                                obj4 = obj3;
                                bArr4 = bArr122;
                                i19 = K3;
                                unsafe3 = unsafe2;
                                i21 = i11;
                                i20 = i26;
                                i18 = -1;
                                i17 = i4;
                                break;
                            }
                        case 9:
                            i11 = i29;
                            if (i27 != 2) {
                                obj4 = obj4;
                                i10 = i24;
                                unsafe = unsafe3;
                                i6 = i10;
                                i9 = i11;
                                i8 = i26;
                                i7 = -1;
                                obj2 = obj4;
                                break;
                            } else {
                                Object obj7 = obj4;
                                Object R3 = s3.R(obj7, i11);
                                byte[] bArr14 = bArr4;
                                obj3 = obj7;
                                int i35 = i17;
                                unsafe2 = unsafe3;
                                int i36 = i24;
                                AbstractC0414e.a aVar10 = aVar4;
                                K3 = AbstractC0414e.N(R3, s3.u(i11), bArr14, i36, i35, aVar10);
                                bArr3 = bArr14;
                                aVar3 = aVar10;
                                s3.t0(obj3, i11, R3);
                                i22 |= i31;
                                byte[] bArr1222 = bArr3;
                                aVar4 = aVar3;
                                obj4 = obj3;
                                bArr4 = bArr1222;
                                i19 = K3;
                                unsafe3 = unsafe2;
                                i21 = i11;
                                i20 = i26;
                                i18 = -1;
                                i17 = i4;
                                break;
                            }
                        case 10:
                            i11 = i29;
                            if (i27 != 2) {
                                i10 = i24;
                                unsafe = unsafe3;
                                i6 = i10;
                                i9 = i11;
                                i8 = i26;
                                i7 = -1;
                                obj2 = obj4;
                                break;
                            } else {
                                H3 = AbstractC0414e.b(bArr4, i24, aVar4);
                                unsafe3.putObject(obj4, X2, aVar4.f5787c);
                                i22 |= i31;
                                i19 = H3;
                                i21 = i11;
                                i20 = i26;
                                i18 = -1;
                                break;
                            }
                        case 12:
                            i11 = i29;
                            if (i27 != 0) {
                                i10 = i24;
                                unsafe = unsafe3;
                                i6 = i10;
                                i9 = i11;
                                i8 = i26;
                                i7 = -1;
                                obj2 = obj4;
                                break;
                            } else {
                                H3 = AbstractC0414e.H(bArr4, i24, aVar4);
                                unsafe3.putInt(obj4, X2, aVar4.f5785a);
                                i22 |= i31;
                                i19 = H3;
                                i21 = i11;
                                i20 = i26;
                                i18 = -1;
                                break;
                            }
                        case 15:
                            i11 = i29;
                            if (i27 != 0) {
                                i10 = i24;
                                unsafe = unsafe3;
                                i6 = i10;
                                i9 = i11;
                                i8 = i26;
                                i7 = -1;
                                obj2 = obj4;
                                break;
                            } else {
                                H3 = AbstractC0414e.H(bArr4, i24, aVar4);
                                unsafe3.putInt(obj4, X2, AbstractC0418i.b(aVar4.f5785a));
                                i22 |= i31;
                                i19 = H3;
                                i21 = i11;
                                i20 = i26;
                                i18 = -1;
                                break;
                            }
                        case 16:
                            if (i27 != 0) {
                                i10 = i24;
                                i11 = i29;
                                unsafe = unsafe3;
                                i6 = i10;
                                i9 = i11;
                                i8 = i26;
                                i7 = -1;
                                obj2 = obj4;
                                break;
                            } else {
                                int K5 = AbstractC0414e.K(bArr4, i24, aVar4);
                                Unsafe unsafe7 = unsafe3;
                                Object obj8 = obj4;
                                unsafe7.putLong(obj8, X2, AbstractC0418i.c(aVar4.f5786b));
                                unsafe3 = unsafe7;
                                obj4 = obj8;
                                i22 |= i31;
                                i19 = K5;
                                i20 = i26;
                                i21 = i29;
                                i18 = -1;
                                break;
                            }
                        default:
                            i10 = i24;
                            i11 = i29;
                            unsafe = unsafe3;
                            i6 = i10;
                            i9 = i11;
                            i8 = i26;
                            i7 = -1;
                            obj2 = obj4;
                            break;
                    }
                } else {
                    int i37 = i24;
                    byte[] bArr15 = bArr4;
                    if (v02 != 27) {
                        Unsafe unsafe8 = unsafe3;
                        if (v02 <= 49) {
                            i14 = i22;
                            unsafe = unsafe8;
                            i7 = -1;
                            i16 = i23;
                            int h02 = s3.h0(obj, bArr, i37, i4, i5, i26, i27, i29, i28, v02, X2, aVar);
                            i15 = i26;
                            i9 = i29;
                            if (h02 != i37) {
                                s3 = this;
                                obj4 = obj;
                                i17 = i4;
                                aVar4 = aVar;
                                i19 = h02;
                                i20 = i15;
                                i23 = i16;
                                i18 = -1;
                                i21 = i9;
                                i22 = i14;
                                unsafe3 = unsafe;
                                bArr4 = bArr;
                            } else {
                                obj2 = obj;
                                i6 = h02;
                                i8 = i15;
                            }
                        } else {
                            unsafe = unsafe8;
                            i14 = i22;
                            i9 = i29;
                            i7 = -1;
                            i16 = i23;
                            i15 = i26;
                            i13 = i37;
                            if (v02 != 50) {
                                i8 = i15;
                                int e02 = e0(obj, bArr, i13, i4, i5, i8, i27, i28, v02, X2, i9, aVar);
                                obj2 = obj;
                                if (e02 != i13) {
                                    s3 = this;
                                    aVar4 = aVar;
                                    i20 = i8;
                                    i19 = e02;
                                    obj4 = obj2;
                                    i23 = i16;
                                    i18 = -1;
                                    i21 = i9;
                                    i22 = i14;
                                    unsafe3 = unsafe;
                                    bArr4 = bArr;
                                    i17 = i4;
                                } else {
                                    i6 = e02;
                                }
                            } else if (i27 == 2) {
                                int d02 = d0(obj, bArr, i13, i4, i9, X2, aVar);
                                if (d02 != i13) {
                                    s3 = this;
                                    obj4 = obj;
                                    bArr4 = bArr;
                                    i17 = i4;
                                    aVar4 = aVar;
                                    i19 = d02;
                                    i20 = i15;
                                    i23 = i16;
                                    i18 = -1;
                                    i21 = i9;
                                    i22 = i14;
                                    unsafe3 = unsafe;
                                } else {
                                    obj2 = obj;
                                    i6 = d02;
                                    i8 = i15;
                                }
                            } else {
                                obj2 = obj;
                                i6 = i13;
                                i8 = i15;
                            }
                        }
                    } else if (i27 == 2) {
                        AbstractC0434z.d dVar = (AbstractC0434z.d) unsafe3.getObject(obj4, X2);
                        if (!dVar.f()) {
                            int size = dVar.size();
                            dVar = dVar.d(size == 0 ? 10 : size * 2);
                            unsafe3.putObject(obj4, X2, dVar);
                        }
                        int p3 = AbstractC0414e.p(s3.u(i29), i5, bArr15, i37, i4, dVar, aVar);
                        bArr4 = bArr;
                        aVar4 = aVar;
                        i19 = p3;
                        unsafe3 = unsafe3;
                        i20 = i26;
                        i21 = i29;
                        i18 = -1;
                        obj4 = obj;
                        i17 = i4;
                    } else {
                        i13 = i37;
                        unsafe = unsafe3;
                        i14 = i22;
                        i15 = i26;
                        i9 = i29;
                        i7 = -1;
                        i16 = i23;
                        obj2 = obj;
                        i6 = i13;
                        i8 = i15;
                    }
                    i23 = i16;
                    i22 = i14;
                }
            }
            int F3 = AbstractC0414e.F(i5, bArr, i6, i4, v(obj2), aVar);
            bArr4 = bArr;
            aVar4 = aVar;
            i20 = i8;
            obj4 = obj2;
            i18 = i7;
            i21 = i9;
            unsafe3 = unsafe;
            i17 = i4;
            i19 = F3;
            s3 = this;
        }
        Unsafe unsafe9 = unsafe3;
        int i38 = i17;
        int i39 = i23;
        int i40 = i22;
        Object obj9 = obj4;
        if (i39 != 1048575) {
            unsafe9.putInt(obj9, i39, i40);
        }
        if (i19 == i38) {
            return i19;
        }
        throw A.h();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void h(Object obj, byte[] bArr, int i3, int i4, AbstractC0414e.a aVar) {
        if (this.f5751h) {
            g0(obj, bArr, i3, i4, aVar);
        } else {
            f0(obj, bArr, i3, i4, 0, aVar);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int h0(Object obj, byte[] bArr, int i3, int i4, int i5, int i6, int i7, int i8, long j3, int i9, long j4, AbstractC0414e.a aVar) {
        int I3;
        Unsafe unsafe = f5743s;
        AbstractC0434z.d dVar = (AbstractC0434z.d) unsafe.getObject(obj, j4);
        if (!dVar.f()) {
            int size = dVar.size();
            dVar = dVar.d(size == 0 ? 10 : size * 2);
            unsafe.putObject(obj, j4, dVar);
        }
        AbstractC0434z.d dVar2 = dVar;
        switch (i9) {
            case 18:
            case 35:
                if (i7 == 2) {
                    return AbstractC0414e.r(bArr, i3, dVar2, aVar);
                }
                if (i7 == 1) {
                    return AbstractC0414e.e(i5, bArr, i3, i4, dVar2, aVar);
                }
                return i3;
            case 19:
            case 36:
                if (i7 == 2) {
                    return AbstractC0414e.u(bArr, i3, dVar2, aVar);
                }
                if (i7 == 5) {
                    return AbstractC0414e.l(i5, bArr, i3, i4, dVar2, aVar);
                }
                return i3;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i7 == 2) {
                    return AbstractC0414e.y(bArr, i3, dVar2, aVar);
                }
                if (i7 == 0) {
                    return AbstractC0414e.L(i5, bArr, i3, i4, dVar2, aVar);
                }
                return i3;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i7 == 2) {
                    return AbstractC0414e.x(bArr, i3, dVar2, aVar);
                }
                if (i7 == 0) {
                    return AbstractC0414e.I(i5, bArr, i3, i4, dVar2, aVar);
                }
                return i3;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i7 == 2) {
                    return AbstractC0414e.t(bArr, i3, dVar2, aVar);
                }
                if (i7 == 1) {
                    return AbstractC0414e.j(i5, bArr, i3, i4, dVar2, aVar);
                }
                return i3;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i7 == 2) {
                    return AbstractC0414e.s(bArr, i3, dVar2, aVar);
                }
                if (i7 == 5) {
                    return AbstractC0414e.h(i5, bArr, i3, i4, dVar2, aVar);
                }
                return i3;
            case 25:
            case 42:
                if (i7 == 2) {
                    return AbstractC0414e.q(bArr, i3, dVar2, aVar);
                }
                if (i7 == 0) {
                    return AbstractC0414e.a(i5, bArr, i3, i4, dVar2, aVar);
                }
                return i3;
            case 26:
                if (i7 == 2) {
                    return (j3 & 536870912) == 0 ? AbstractC0414e.C(i5, bArr, i3, i4, dVar2, aVar) : AbstractC0414e.D(i5, bArr, i3, i4, dVar2, aVar);
                }
                return i3;
            case 27:
                if (i7 == 2) {
                    return AbstractC0414e.p(u(i8), i5, bArr, i3, i4, dVar2, aVar);
                }
                return i3;
            case 28:
                if (i7 == 2) {
                    return AbstractC0414e.c(i5, bArr, i3, i4, dVar2, aVar);
                }
                return i3;
            case 30:
            case 44:
                if (i7 != 2) {
                    if (i7 == 0) {
                        I3 = AbstractC0414e.I(i5, bArr, i3, i4, dVar2, aVar);
                    }
                    return i3;
                }
                I3 = AbstractC0414e.x(bArr, i3, dVar2, aVar);
                s(i8);
                g0.z(obj, i6, dVar2, null, null, this.f5758o);
                return I3;
            case 33:
            case 47:
                if (i7 == 2) {
                    return AbstractC0414e.v(bArr, i3, dVar2, aVar);
                }
                if (i7 == 0) {
                    return AbstractC0414e.z(i5, bArr, i3, i4, dVar2, aVar);
                }
                return i3;
            case 34:
            case 48:
                if (i7 == 2) {
                    return AbstractC0414e.w(bArr, i3, dVar2, aVar);
                }
                if (i7 == 0) {
                    return AbstractC0414e.A(i5, bArr, i3, i4, dVar2, aVar);
                }
                return i3;
            case 49:
                if (i7 == 3) {
                    return AbstractC0414e.n(u(i8), i5, bArr, i3, i4, dVar2, aVar);
                }
                return i3;
            default:
                return i3;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void i(Object obj, r0 r0Var) {
        if (r0Var.j() == r0.a.DESCENDING) {
            z0(obj, r0Var);
        } else if (this.f5751h) {
            y0(obj, r0Var);
        } else {
            x0(obj, r0Var);
        }
    }

    public final int i0(int i3) {
        if (i3 < this.f5746c || i3 > this.f5747d) {
            return -1;
        }
        return s0(i3, 0);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void j(Object obj, d0 d0Var, C0425p c0425p) {
        c0425p.getClass();
        m(obj);
        M(this.f5758o, this.f5759p, obj, d0Var, c0425p);
    }

    public final int j0(int i3, int i4) {
        if (i3 < this.f5746c || i3 > this.f5747d) {
            return -1;
        }
        return s0(i3, i4);
    }

    public final boolean k(Object obj, Object obj2, int i3) {
        return B(obj, i3) == B(obj2, i3);
    }

    public final int k0(int i3) {
        return this.f5744a[i3 + 2];
    }

    public final void l0(Object obj, long j3, d0 d0Var, e0 e0Var, C0425p c0425p) {
        d0Var.L(this.f5757n.e(obj, j3), e0Var, c0425p);
    }

    public final void m0(Object obj, int i3, d0 d0Var, e0 e0Var, C0425p c0425p) {
        d0Var.M(this.f5757n.e(obj, X(i3)), e0Var, c0425p);
    }

    public final int n(byte[] bArr, int i3, int i4, H.a aVar, Map map, AbstractC0414e.a aVar2) {
        int H3 = AbstractC0414e.H(bArr, i3, aVar2);
        int i5 = aVar2.f5785a;
        if (i5 < 0 || i5 > i4 - H3) {
            throw A.m();
        }
        throw null;
    }

    public final void n0(Object obj, int i3, d0 d0Var) {
        if (A(i3)) {
            o0.R(obj, X(i3), d0Var.A());
        } else if (this.f5750g) {
            o0.R(obj, X(i3), d0Var.y());
        } else {
            o0.R(obj, X(i3), d0Var.c());
        }
    }

    public final void o0(Object obj, int i3, d0 d0Var) {
        if (A(i3)) {
            d0Var.b(this.f5757n.e(obj, X(i3)));
        } else {
            d0Var.H(this.f5757n.e(obj, X(i3)));
        }
    }

    public final boolean p(Object obj, Object obj2, int i3) {
        int w02 = w0(i3);
        long X2 = X(w02);
        switch (v0(w02)) {
            case 0:
                if (!k(obj, obj2, i3) || Double.doubleToLongBits(o0.x(obj, X2)) != Double.doubleToLongBits(o0.x(obj2, X2))) {
                }
                break;
            case 1:
                if (!k(obj, obj2, i3) || Float.floatToIntBits(o0.y(obj, X2)) != Float.floatToIntBits(o0.y(obj2, X2))) {
                }
                break;
            case 2:
                if (!k(obj, obj2, i3) || o0.A(obj, X2) != o0.A(obj2, X2)) {
                }
                break;
            case 3:
                if (!k(obj, obj2, i3) || o0.A(obj, X2) != o0.A(obj2, X2)) {
                }
                break;
            case 4:
                if (!k(obj, obj2, i3) || o0.z(obj, X2) != o0.z(obj2, X2)) {
                }
                break;
            case 5:
                if (!k(obj, obj2, i3) || o0.A(obj, X2) != o0.A(obj2, X2)) {
                }
                break;
            case 6:
                if (!k(obj, obj2, i3) || o0.z(obj, X2) != o0.z(obj2, X2)) {
                }
                break;
            case 7:
                if (!k(obj, obj2, i3) || o0.r(obj, X2) != o0.r(obj2, X2)) {
                }
                break;
            case 8:
                if (!k(obj, obj2, i3) || !g0.J(o0.C(obj, X2), o0.C(obj2, X2))) {
                }
                break;
            case 9:
                if (!k(obj, obj2, i3) || !g0.J(o0.C(obj, X2), o0.C(obj2, X2))) {
                }
                break;
            case 10:
                if (!k(obj, obj2, i3) || !g0.J(o0.C(obj, X2), o0.C(obj2, X2))) {
                }
                break;
            case 11:
                if (!k(obj, obj2, i3) || o0.z(obj, X2) != o0.z(obj2, X2)) {
                }
                break;
            case 12:
                if (!k(obj, obj2, i3) || o0.z(obj, X2) != o0.z(obj2, X2)) {
                }
                break;
            case 13:
                if (!k(obj, obj2, i3) || o0.z(obj, X2) != o0.z(obj2, X2)) {
                }
                break;
            case 14:
                if (!k(obj, obj2, i3) || o0.A(obj, X2) != o0.A(obj2, X2)) {
                }
                break;
            case 15:
                if (!k(obj, obj2, i3) || o0.z(obj, X2) != o0.z(obj2, X2)) {
                }
                break;
            case 16:
                if (!k(obj, obj2, i3) || o0.A(obj, X2) != o0.A(obj2, X2)) {
                }
                break;
            case 17:
                if (!k(obj, obj2, i3) || !g0.J(o0.C(obj, X2), o0.C(obj2, X2))) {
                }
                break;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                if (!H(obj, obj2, i3) || !g0.J(o0.C(obj, X2), o0.C(obj2, X2))) {
                }
                break;
        }
        return true;
    }

    public final Object q(Object obj, int i3, Object obj2, k0 k0Var, Object obj3) {
        W(i3);
        if (o0.C(obj, X(w0(i3))) == null) {
            return obj2;
        }
        s(i3);
        return obj2;
    }

    public final void q0(Object obj, int i3) {
        int k02 = k0(i3);
        long j3 = 1048575 & k02;
        if (j3 == 1048575) {
            return;
        }
        o0.P(obj, j3, (1 << (k02 >>> 20)) | o0.z(obj, j3));
    }

    public final void r0(Object obj, int i3, int i4) {
        o0.P(obj, k0(i4) & 1048575, i3);
    }

    public final AbstractC0434z.c s(int i3) {
        AbstractC0515e.a(this.f5745b[((i3 / 3) * 2) + 1]);
        return null;
    }

    public final int s0(int i3, int i4) {
        int length = (this.f5744a.length / 3) - 1;
        while (i4 <= length) {
            int i5 = (length + i4) >>> 1;
            int i6 = i5 * 3;
            int W2 = W(i6);
            if (i3 == W2) {
                return i6;
            }
            if (i3 < W2) {
                length = i5 - 1;
            } else {
                i4 = i5 + 1;
            }
        }
        return -1;
    }

    public final Object t(int i3) {
        return this.f5745b[(i3 / 3) * 2];
    }

    public final void t0(Object obj, int i3, Object obj2) {
        f5743s.putObject(obj, X(w0(i3)), obj2);
        q0(obj, i3);
    }

    public final e0 u(int i3) {
        int i4 = (i3 / 3) * 2;
        e0 e0Var = (e0) this.f5745b[i4];
        if (e0Var != null) {
            return e0Var;
        }
        e0 c3 = a0.a().c((Class) this.f5745b[i4 + 1]);
        this.f5745b[i4] = c3;
        return c3;
    }

    public final void u0(Object obj, int i3, int i4, Object obj2) {
        f5743s.putObject(obj, X(w0(i4)), obj2);
        r0(obj, i3, i4);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int w(Object obj) {
        int i3;
        int i4;
        int h3;
        int d3;
        boolean z3;
        int f3;
        int i5;
        int L3;
        int N3;
        Unsafe unsafe = f5743s;
        int i6 = 1048575;
        int i7 = 1048575;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i8 < this.f5744a.length) {
            int w02 = w0(i8);
            int W2 = W(i8);
            int v02 = v0(w02);
            if (v02 <= 17) {
                i3 = this.f5744a[i8 + 2];
                int i11 = i3 & i6;
                i4 = 1 << (i3 >>> 20);
                if (i11 != i7) {
                    i10 = unsafe.getInt(obj, i11);
                    i7 = i11;
                }
            } else {
                i3 = (!this.f5752i || v02 < EnumC0429u.f5947S.c() || v02 > EnumC0429u.f5960f0.c()) ? 0 : this.f5744a[i8 + 2] & i6;
                i4 = 0;
            }
            long X2 = X(w02);
            switch (v02) {
                case 0:
                    if ((i10 & i4) == 0) {
                        break;
                    } else {
                        h3 = AbstractC0420k.h(W2, 0.0d);
                        i9 += h3;
                        break;
                    }
                case 1:
                    if ((i10 & i4) == 0) {
                        break;
                    } else {
                        h3 = AbstractC0420k.p(W2, 0.0f);
                        i9 += h3;
                        break;
                    }
                case 2:
                    if ((i10 & i4) == 0) {
                        break;
                    } else {
                        h3 = AbstractC0420k.v(W2, unsafe.getLong(obj, X2));
                        i9 += h3;
                        break;
                    }
                case 3:
                    if ((i10 & i4) == 0) {
                        break;
                    } else {
                        h3 = AbstractC0420k.O(W2, unsafe.getLong(obj, X2));
                        i9 += h3;
                        break;
                    }
                case 4:
                    if ((i10 & i4) == 0) {
                        break;
                    } else {
                        h3 = AbstractC0420k.t(W2, unsafe.getInt(obj, X2));
                        i9 += h3;
                        break;
                    }
                case 5:
                    if ((i10 & i4) == 0) {
                        break;
                    } else {
                        h3 = AbstractC0420k.n(W2, 0L);
                        i9 += h3;
                        break;
                    }
                case 6:
                    if ((i10 & i4) != 0) {
                        h3 = AbstractC0420k.l(W2, 0);
                        i9 += h3;
                        break;
                    }
                    break;
                case 7:
                    if ((i10 & i4) != 0) {
                        d3 = AbstractC0420k.d(W2, true);
                        i9 += d3;
                    }
                    break;
                case 8:
                    if ((i10 & i4) != 0) {
                        Object object = unsafe.getObject(obj, X2);
                        d3 = object instanceof AbstractC0417h ? AbstractC0420k.f(W2, (AbstractC0417h) object) : AbstractC0420k.J(W2, (String) object);
                        i9 += d3;
                    }
                    break;
                case 9:
                    if ((i10 & i4) != 0) {
                        d3 = g0.o(W2, unsafe.getObject(obj, X2), u(i8));
                        i9 += d3;
                    }
                    break;
                case 10:
                    if ((i10 & i4) != 0) {
                        d3 = AbstractC0420k.f(W2, (AbstractC0417h) unsafe.getObject(obj, X2));
                        i9 += d3;
                    }
                    break;
                case 11:
                    if ((i10 & i4) != 0) {
                        d3 = AbstractC0420k.M(W2, unsafe.getInt(obj, X2));
                        i9 += d3;
                    }
                    break;
                case 12:
                    if ((i10 & i4) != 0) {
                        d3 = AbstractC0420k.j(W2, unsafe.getInt(obj, X2));
                        i9 += d3;
                    }
                    break;
                case 13:
                    if ((i10 & i4) != 0) {
                        d3 = AbstractC0420k.B(W2, 0);
                        i9 += d3;
                    }
                    break;
                case 14:
                    if ((i10 & i4) != 0) {
                        d3 = AbstractC0420k.D(W2, 0L);
                        i9 += d3;
                    }
                    break;
                case 15:
                    if ((i10 & i4) != 0) {
                        d3 = AbstractC0420k.F(W2, unsafe.getInt(obj, X2));
                        i9 += d3;
                    }
                    break;
                case 16:
                    if ((i10 & i4) != 0) {
                        d3 = AbstractC0420k.H(W2, unsafe.getLong(obj, X2));
                        i9 += d3;
                    }
                    break;
                case 17:
                    if ((i10 & i4) != 0) {
                        d3 = AbstractC0420k.r(W2, (O) unsafe.getObject(obj, X2), u(i8));
                        i9 += d3;
                    }
                    break;
                case 18:
                    d3 = g0.h(W2, (List) unsafe.getObject(obj, X2), false);
                    i9 += d3;
                    break;
                case 19:
                    z3 = false;
                    f3 = g0.f(W2, (List) unsafe.getObject(obj, X2), false);
                    i9 += f3;
                    break;
                case 20:
                    z3 = false;
                    f3 = g0.m(W2, (List) unsafe.getObject(obj, X2), false);
                    i9 += f3;
                    break;
                case 21:
                    z3 = false;
                    f3 = g0.x(W2, (List) unsafe.getObject(obj, X2), false);
                    i9 += f3;
                    break;
                case 22:
                    z3 = false;
                    f3 = g0.k(W2, (List) unsafe.getObject(obj, X2), false);
                    i9 += f3;
                    break;
                case 23:
                    z3 = false;
                    f3 = g0.h(W2, (List) unsafe.getObject(obj, X2), false);
                    i9 += f3;
                    break;
                case 24:
                    z3 = false;
                    f3 = g0.f(W2, (List) unsafe.getObject(obj, X2), false);
                    i9 += f3;
                    break;
                case 25:
                    z3 = false;
                    f3 = g0.a(W2, (List) unsafe.getObject(obj, X2), false);
                    i9 += f3;
                    break;
                case 26:
                    d3 = g0.u(W2, (List) unsafe.getObject(obj, X2));
                    i9 += d3;
                    break;
                case 27:
                    d3 = g0.p(W2, (List) unsafe.getObject(obj, X2), u(i8));
                    i9 += d3;
                    break;
                case 28:
                    d3 = g0.c(W2, (List) unsafe.getObject(obj, X2));
                    i9 += d3;
                    break;
                case 29:
                    d3 = g0.v(W2, (List) unsafe.getObject(obj, X2), false);
                    i9 += d3;
                    break;
                case 30:
                    z3 = false;
                    f3 = g0.d(W2, (List) unsafe.getObject(obj, X2), false);
                    i9 += f3;
                    break;
                case 31:
                    z3 = false;
                    f3 = g0.f(W2, (List) unsafe.getObject(obj, X2), false);
                    i9 += f3;
                    break;
                case 32:
                    z3 = false;
                    f3 = g0.h(W2, (List) unsafe.getObject(obj, X2), false);
                    i9 += f3;
                    break;
                case 33:
                    z3 = false;
                    f3 = g0.q(W2, (List) unsafe.getObject(obj, X2), false);
                    i9 += f3;
                    break;
                case 34:
                    z3 = false;
                    f3 = g0.s(W2, (List) unsafe.getObject(obj, X2), false);
                    i9 += f3;
                    break;
                case 35:
                    i5 = g0.i((List) unsafe.getObject(obj, X2));
                    if (i5 > 0) {
                        if (this.f5752i) {
                            unsafe.putInt(obj, i3, i5);
                        }
                        L3 = AbstractC0420k.L(W2);
                        N3 = AbstractC0420k.N(i5);
                        i9 += L3 + N3 + i5;
                    }
                    break;
                case 36:
                    i5 = g0.g((List) unsafe.getObject(obj, X2));
                    if (i5 > 0) {
                        if (this.f5752i) {
                            unsafe.putInt(obj, i3, i5);
                        }
                        L3 = AbstractC0420k.L(W2);
                        N3 = AbstractC0420k.N(i5);
                        i9 += L3 + N3 + i5;
                    }
                    break;
                case 37:
                    i5 = g0.n((List) unsafe.getObject(obj, X2));
                    if (i5 > 0) {
                        if (this.f5752i) {
                            unsafe.putInt(obj, i3, i5);
                        }
                        L3 = AbstractC0420k.L(W2);
                        N3 = AbstractC0420k.N(i5);
                        i9 += L3 + N3 + i5;
                    }
                    break;
                case 38:
                    i5 = g0.y((List) unsafe.getObject(obj, X2));
                    if (i5 > 0) {
                        if (this.f5752i) {
                            unsafe.putInt(obj, i3, i5);
                        }
                        L3 = AbstractC0420k.L(W2);
                        N3 = AbstractC0420k.N(i5);
                        i9 += L3 + N3 + i5;
                    }
                    break;
                case 39:
                    i5 = g0.l((List) unsafe.getObject(obj, X2));
                    if (i5 > 0) {
                        if (this.f5752i) {
                            unsafe.putInt(obj, i3, i5);
                        }
                        L3 = AbstractC0420k.L(W2);
                        N3 = AbstractC0420k.N(i5);
                        i9 += L3 + N3 + i5;
                    }
                    break;
                case 40:
                    i5 = g0.i((List) unsafe.getObject(obj, X2));
                    if (i5 > 0) {
                        if (this.f5752i) {
                            unsafe.putInt(obj, i3, i5);
                        }
                        L3 = AbstractC0420k.L(W2);
                        N3 = AbstractC0420k.N(i5);
                        i9 += L3 + N3 + i5;
                    }
                    break;
                case 41:
                    i5 = g0.g((List) unsafe.getObject(obj, X2));
                    if (i5 > 0) {
                        if (this.f5752i) {
                            unsafe.putInt(obj, i3, i5);
                        }
                        L3 = AbstractC0420k.L(W2);
                        N3 = AbstractC0420k.N(i5);
                        i9 += L3 + N3 + i5;
                    }
                    break;
                case 42:
                    i5 = g0.b((List) unsafe.getObject(obj, X2));
                    if (i5 > 0) {
                        if (this.f5752i) {
                            unsafe.putInt(obj, i3, i5);
                        }
                        L3 = AbstractC0420k.L(W2);
                        N3 = AbstractC0420k.N(i5);
                        i9 += L3 + N3 + i5;
                    }
                    break;
                case 43:
                    i5 = g0.w((List) unsafe.getObject(obj, X2));
                    if (i5 > 0) {
                        if (this.f5752i) {
                            unsafe.putInt(obj, i3, i5);
                        }
                        L3 = AbstractC0420k.L(W2);
                        N3 = AbstractC0420k.N(i5);
                        i9 += L3 + N3 + i5;
                    }
                    break;
                case 44:
                    i5 = g0.e((List) unsafe.getObject(obj, X2));
                    if (i5 > 0) {
                        if (this.f5752i) {
                            unsafe.putInt(obj, i3, i5);
                        }
                        L3 = AbstractC0420k.L(W2);
                        N3 = AbstractC0420k.N(i5);
                        i9 += L3 + N3 + i5;
                    }
                    break;
                case 45:
                    i5 = g0.g((List) unsafe.getObject(obj, X2));
                    if (i5 > 0) {
                        if (this.f5752i) {
                            unsafe.putInt(obj, i3, i5);
                        }
                        L3 = AbstractC0420k.L(W2);
                        N3 = AbstractC0420k.N(i5);
                        i9 += L3 + N3 + i5;
                    }
                    break;
                case 46:
                    i5 = g0.i((List) unsafe.getObject(obj, X2));
                    if (i5 > 0) {
                        if (this.f5752i) {
                            unsafe.putInt(obj, i3, i5);
                        }
                        L3 = AbstractC0420k.L(W2);
                        N3 = AbstractC0420k.N(i5);
                        i9 += L3 + N3 + i5;
                    }
                    break;
                case 47:
                    i5 = g0.r((List) unsafe.getObject(obj, X2));
                    if (i5 > 0) {
                        if (this.f5752i) {
                            unsafe.putInt(obj, i3, i5);
                        }
                        L3 = AbstractC0420k.L(W2);
                        N3 = AbstractC0420k.N(i5);
                        i9 += L3 + N3 + i5;
                    }
                    break;
                case 48:
                    i5 = g0.t((List) unsafe.getObject(obj, X2));
                    if (i5 > 0) {
                        if (this.f5752i) {
                            unsafe.putInt(obj, i3, i5);
                        }
                        L3 = AbstractC0420k.L(W2);
                        N3 = AbstractC0420k.N(i5);
                        i9 += L3 + N3 + i5;
                    }
                    break;
                case 49:
                    d3 = g0.j(W2, (List) unsafe.getObject(obj, X2), u(i8));
                    i9 += d3;
                    break;
                case 50:
                    d3 = this.f5760q.d(W2, unsafe.getObject(obj, X2), t(i8));
                    i9 += d3;
                    break;
                case 51:
                    if (I(obj, W2, i8)) {
                        d3 = AbstractC0420k.h(W2, 0.0d);
                        i9 += d3;
                    }
                    break;
                case 52:
                    if (I(obj, W2, i8)) {
                        d3 = AbstractC0420k.p(W2, 0.0f);
                        i9 += d3;
                    }
                    break;
                case 53:
                    if (I(obj, W2, i8)) {
                        d3 = AbstractC0420k.v(W2, c0(obj, X2));
                        i9 += d3;
                    }
                    break;
                case 54:
                    if (I(obj, W2, i8)) {
                        d3 = AbstractC0420k.O(W2, c0(obj, X2));
                        i9 += d3;
                    }
                    break;
                case 55:
                    if (I(obj, W2, i8)) {
                        d3 = AbstractC0420k.t(W2, b0(obj, X2));
                        i9 += d3;
                    }
                    break;
                case 56:
                    if (I(obj, W2, i8)) {
                        d3 = AbstractC0420k.n(W2, 0L);
                        i9 += d3;
                    }
                    break;
                case 57:
                    if (I(obj, W2, i8)) {
                        d3 = AbstractC0420k.l(W2, 0);
                        i9 += d3;
                    }
                    break;
                case 58:
                    if (I(obj, W2, i8)) {
                        d3 = AbstractC0420k.d(W2, true);
                        i9 += d3;
                    }
                    break;
                case 59:
                    if (I(obj, W2, i8)) {
                        Object object2 = unsafe.getObject(obj, X2);
                        d3 = object2 instanceof AbstractC0417h ? AbstractC0420k.f(W2, (AbstractC0417h) object2) : AbstractC0420k.J(W2, (String) object2);
                        i9 += d3;
                    }
                    break;
                case 60:
                    if (I(obj, W2, i8)) {
                        d3 = g0.o(W2, unsafe.getObject(obj, X2), u(i8));
                        i9 += d3;
                    }
                    break;
                case 61:
                    if (I(obj, W2, i8)) {
                        d3 = AbstractC0420k.f(W2, (AbstractC0417h) unsafe.getObject(obj, X2));
                        i9 += d3;
                    }
                    break;
                case 62:
                    if (I(obj, W2, i8)) {
                        d3 = AbstractC0420k.M(W2, b0(obj, X2));
                        i9 += d3;
                    }
                    break;
                case 63:
                    if (I(obj, W2, i8)) {
                        d3 = AbstractC0420k.j(W2, b0(obj, X2));
                        i9 += d3;
                    }
                    break;
                case 64:
                    if (I(obj, W2, i8)) {
                        d3 = AbstractC0420k.B(W2, 0);
                        i9 += d3;
                    }
                    break;
                case 65:
                    if (I(obj, W2, i8)) {
                        d3 = AbstractC0420k.D(W2, 0L);
                        i9 += d3;
                    }
                    break;
                case 66:
                    if (I(obj, W2, i8)) {
                        d3 = AbstractC0420k.F(W2, b0(obj, X2));
                        i9 += d3;
                    }
                    break;
                case 67:
                    if (I(obj, W2, i8)) {
                        d3 = AbstractC0420k.H(W2, c0(obj, X2));
                        i9 += d3;
                    }
                    break;
                case 68:
                    if (I(obj, W2, i8)) {
                        d3 = AbstractC0420k.r(W2, (O) unsafe.getObject(obj, X2), u(i8));
                        i9 += d3;
                    }
                    break;
            }
            i8 += 3;
            i6 = 1048575;
        }
        int y3 = i9 + y(this.f5758o, obj);
        return this.f5749f ? y3 + this.f5759p.c(obj).c() : y3;
    }

    public final int w0(int i3) {
        return this.f5744a[i3 + 1];
    }

    public final int x(Object obj) {
        int h3;
        int i3;
        int L3;
        int N3;
        Unsafe unsafe = f5743s;
        int i4 = 0;
        for (int i5 = 0; i5 < this.f5744a.length; i5 += 3) {
            int w02 = w0(i5);
            int v02 = v0(w02);
            int W2 = W(i5);
            long X2 = X(w02);
            int i6 = (v02 < EnumC0429u.f5947S.c() || v02 > EnumC0429u.f5960f0.c()) ? 0 : this.f5744a[i5 + 2] & 1048575;
            switch (v02) {
                case 0:
                    if (B(obj, i5)) {
                        h3 = AbstractC0420k.h(W2, 0.0d);
                        i4 += h3;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (B(obj, i5)) {
                        h3 = AbstractC0420k.p(W2, 0.0f);
                        i4 += h3;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (B(obj, i5)) {
                        h3 = AbstractC0420k.v(W2, o0.A(obj, X2));
                        i4 += h3;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (B(obj, i5)) {
                        h3 = AbstractC0420k.O(W2, o0.A(obj, X2));
                        i4 += h3;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (B(obj, i5)) {
                        h3 = AbstractC0420k.t(W2, o0.z(obj, X2));
                        i4 += h3;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (B(obj, i5)) {
                        h3 = AbstractC0420k.n(W2, 0L);
                        i4 += h3;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (B(obj, i5)) {
                        h3 = AbstractC0420k.l(W2, 0);
                        i4 += h3;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (B(obj, i5)) {
                        h3 = AbstractC0420k.d(W2, true);
                        i4 += h3;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (B(obj, i5)) {
                        Object C3 = o0.C(obj, X2);
                        h3 = C3 instanceof AbstractC0417h ? AbstractC0420k.f(W2, (AbstractC0417h) C3) : AbstractC0420k.J(W2, (String) C3);
                        i4 += h3;
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (B(obj, i5)) {
                        h3 = g0.o(W2, o0.C(obj, X2), u(i5));
                        i4 += h3;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (B(obj, i5)) {
                        h3 = AbstractC0420k.f(W2, (AbstractC0417h) o0.C(obj, X2));
                        i4 += h3;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (B(obj, i5)) {
                        h3 = AbstractC0420k.M(W2, o0.z(obj, X2));
                        i4 += h3;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (B(obj, i5)) {
                        h3 = AbstractC0420k.j(W2, o0.z(obj, X2));
                        i4 += h3;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (B(obj, i5)) {
                        h3 = AbstractC0420k.B(W2, 0);
                        i4 += h3;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (B(obj, i5)) {
                        h3 = AbstractC0420k.D(W2, 0L);
                        i4 += h3;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (B(obj, i5)) {
                        h3 = AbstractC0420k.F(W2, o0.z(obj, X2));
                        i4 += h3;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (B(obj, i5)) {
                        h3 = AbstractC0420k.H(W2, o0.A(obj, X2));
                        i4 += h3;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (B(obj, i5)) {
                        h3 = AbstractC0420k.r(W2, (O) o0.C(obj, X2), u(i5));
                        i4 += h3;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    h3 = g0.h(W2, K(obj, X2), false);
                    i4 += h3;
                    break;
                case 19:
                    h3 = g0.f(W2, K(obj, X2), false);
                    i4 += h3;
                    break;
                case 20:
                    h3 = g0.m(W2, K(obj, X2), false);
                    i4 += h3;
                    break;
                case 21:
                    h3 = g0.x(W2, K(obj, X2), false);
                    i4 += h3;
                    break;
                case 22:
                    h3 = g0.k(W2, K(obj, X2), false);
                    i4 += h3;
                    break;
                case 23:
                    h3 = g0.h(W2, K(obj, X2), false);
                    i4 += h3;
                    break;
                case 24:
                    h3 = g0.f(W2, K(obj, X2), false);
                    i4 += h3;
                    break;
                case 25:
                    h3 = g0.a(W2, K(obj, X2), false);
                    i4 += h3;
                    break;
                case 26:
                    h3 = g0.u(W2, K(obj, X2));
                    i4 += h3;
                    break;
                case 27:
                    h3 = g0.p(W2, K(obj, X2), u(i5));
                    i4 += h3;
                    break;
                case 28:
                    h3 = g0.c(W2, K(obj, X2));
                    i4 += h3;
                    break;
                case 29:
                    h3 = g0.v(W2, K(obj, X2), false);
                    i4 += h3;
                    break;
                case 30:
                    h3 = g0.d(W2, K(obj, X2), false);
                    i4 += h3;
                    break;
                case 31:
                    h3 = g0.f(W2, K(obj, X2), false);
                    i4 += h3;
                    break;
                case 32:
                    h3 = g0.h(W2, K(obj, X2), false);
                    i4 += h3;
                    break;
                case 33:
                    h3 = g0.q(W2, K(obj, X2), false);
                    i4 += h3;
                    break;
                case 34:
                    h3 = g0.s(W2, K(obj, X2), false);
                    i4 += h3;
                    break;
                case 35:
                    i3 = g0.i((List) unsafe.getObject(obj, X2));
                    if (i3 <= 0) {
                        break;
                    } else {
                        if (this.f5752i) {
                            unsafe.putInt(obj, i6, i3);
                        }
                        L3 = AbstractC0420k.L(W2);
                        N3 = AbstractC0420k.N(i3);
                        h3 = L3 + N3 + i3;
                        i4 += h3;
                        break;
                    }
                case 36:
                    i3 = g0.g((List) unsafe.getObject(obj, X2));
                    if (i3 <= 0) {
                        break;
                    } else {
                        if (this.f5752i) {
                            unsafe.putInt(obj, i6, i3);
                        }
                        L3 = AbstractC0420k.L(W2);
                        N3 = AbstractC0420k.N(i3);
                        h3 = L3 + N3 + i3;
                        i4 += h3;
                        break;
                    }
                case 37:
                    i3 = g0.n((List) unsafe.getObject(obj, X2));
                    if (i3 <= 0) {
                        break;
                    } else {
                        if (this.f5752i) {
                            unsafe.putInt(obj, i6, i3);
                        }
                        L3 = AbstractC0420k.L(W2);
                        N3 = AbstractC0420k.N(i3);
                        h3 = L3 + N3 + i3;
                        i4 += h3;
                        break;
                    }
                case 38:
                    i3 = g0.y((List) unsafe.getObject(obj, X2));
                    if (i3 <= 0) {
                        break;
                    } else {
                        if (this.f5752i) {
                            unsafe.putInt(obj, i6, i3);
                        }
                        L3 = AbstractC0420k.L(W2);
                        N3 = AbstractC0420k.N(i3);
                        h3 = L3 + N3 + i3;
                        i4 += h3;
                        break;
                    }
                case 39:
                    i3 = g0.l((List) unsafe.getObject(obj, X2));
                    if (i3 <= 0) {
                        break;
                    } else {
                        if (this.f5752i) {
                            unsafe.putInt(obj, i6, i3);
                        }
                        L3 = AbstractC0420k.L(W2);
                        N3 = AbstractC0420k.N(i3);
                        h3 = L3 + N3 + i3;
                        i4 += h3;
                        break;
                    }
                case 40:
                    i3 = g0.i((List) unsafe.getObject(obj, X2));
                    if (i3 <= 0) {
                        break;
                    } else {
                        if (this.f5752i) {
                            unsafe.putInt(obj, i6, i3);
                        }
                        L3 = AbstractC0420k.L(W2);
                        N3 = AbstractC0420k.N(i3);
                        h3 = L3 + N3 + i3;
                        i4 += h3;
                        break;
                    }
                case 41:
                    i3 = g0.g((List) unsafe.getObject(obj, X2));
                    if (i3 <= 0) {
                        break;
                    } else {
                        if (this.f5752i) {
                            unsafe.putInt(obj, i6, i3);
                        }
                        L3 = AbstractC0420k.L(W2);
                        N3 = AbstractC0420k.N(i3);
                        h3 = L3 + N3 + i3;
                        i4 += h3;
                        break;
                    }
                case 42:
                    i3 = g0.b((List) unsafe.getObject(obj, X2));
                    if (i3 <= 0) {
                        break;
                    } else {
                        if (this.f5752i) {
                            unsafe.putInt(obj, i6, i3);
                        }
                        L3 = AbstractC0420k.L(W2);
                        N3 = AbstractC0420k.N(i3);
                        h3 = L3 + N3 + i3;
                        i4 += h3;
                        break;
                    }
                case 43:
                    i3 = g0.w((List) unsafe.getObject(obj, X2));
                    if (i3 <= 0) {
                        break;
                    } else {
                        if (this.f5752i) {
                            unsafe.putInt(obj, i6, i3);
                        }
                        L3 = AbstractC0420k.L(W2);
                        N3 = AbstractC0420k.N(i3);
                        h3 = L3 + N3 + i3;
                        i4 += h3;
                        break;
                    }
                case 44:
                    i3 = g0.e((List) unsafe.getObject(obj, X2));
                    if (i3 <= 0) {
                        break;
                    } else {
                        if (this.f5752i) {
                            unsafe.putInt(obj, i6, i3);
                        }
                        L3 = AbstractC0420k.L(W2);
                        N3 = AbstractC0420k.N(i3);
                        h3 = L3 + N3 + i3;
                        i4 += h3;
                        break;
                    }
                case 45:
                    i3 = g0.g((List) unsafe.getObject(obj, X2));
                    if (i3 <= 0) {
                        break;
                    } else {
                        if (this.f5752i) {
                            unsafe.putInt(obj, i6, i3);
                        }
                        L3 = AbstractC0420k.L(W2);
                        N3 = AbstractC0420k.N(i3);
                        h3 = L3 + N3 + i3;
                        i4 += h3;
                        break;
                    }
                case 46:
                    i3 = g0.i((List) unsafe.getObject(obj, X2));
                    if (i3 <= 0) {
                        break;
                    } else {
                        if (this.f5752i) {
                            unsafe.putInt(obj, i6, i3);
                        }
                        L3 = AbstractC0420k.L(W2);
                        N3 = AbstractC0420k.N(i3);
                        h3 = L3 + N3 + i3;
                        i4 += h3;
                        break;
                    }
                case 47:
                    i3 = g0.r((List) unsafe.getObject(obj, X2));
                    if (i3 <= 0) {
                        break;
                    } else {
                        if (this.f5752i) {
                            unsafe.putInt(obj, i6, i3);
                        }
                        L3 = AbstractC0420k.L(W2);
                        N3 = AbstractC0420k.N(i3);
                        h3 = L3 + N3 + i3;
                        i4 += h3;
                        break;
                    }
                case 48:
                    i3 = g0.t((List) unsafe.getObject(obj, X2));
                    if (i3 <= 0) {
                        break;
                    } else {
                        if (this.f5752i) {
                            unsafe.putInt(obj, i6, i3);
                        }
                        L3 = AbstractC0420k.L(W2);
                        N3 = AbstractC0420k.N(i3);
                        h3 = L3 + N3 + i3;
                        i4 += h3;
                        break;
                    }
                case 49:
                    h3 = g0.j(W2, K(obj, X2), u(i5));
                    i4 += h3;
                    break;
                case 50:
                    h3 = this.f5760q.d(W2, o0.C(obj, X2), t(i5));
                    i4 += h3;
                    break;
                case 51:
                    if (I(obj, W2, i5)) {
                        h3 = AbstractC0420k.h(W2, 0.0d);
                        i4 += h3;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (I(obj, W2, i5)) {
                        h3 = AbstractC0420k.p(W2, 0.0f);
                        i4 += h3;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (I(obj, W2, i5)) {
                        h3 = AbstractC0420k.v(W2, c0(obj, X2));
                        i4 += h3;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (I(obj, W2, i5)) {
                        h3 = AbstractC0420k.O(W2, c0(obj, X2));
                        i4 += h3;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (I(obj, W2, i5)) {
                        h3 = AbstractC0420k.t(W2, b0(obj, X2));
                        i4 += h3;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (I(obj, W2, i5)) {
                        h3 = AbstractC0420k.n(W2, 0L);
                        i4 += h3;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (I(obj, W2, i5)) {
                        h3 = AbstractC0420k.l(W2, 0);
                        i4 += h3;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (I(obj, W2, i5)) {
                        h3 = AbstractC0420k.d(W2, true);
                        i4 += h3;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (I(obj, W2, i5)) {
                        Object C4 = o0.C(obj, X2);
                        h3 = C4 instanceof AbstractC0417h ? AbstractC0420k.f(W2, (AbstractC0417h) C4) : AbstractC0420k.J(W2, (String) C4);
                        i4 += h3;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (I(obj, W2, i5)) {
                        h3 = g0.o(W2, o0.C(obj, X2), u(i5));
                        i4 += h3;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (I(obj, W2, i5)) {
                        h3 = AbstractC0420k.f(W2, (AbstractC0417h) o0.C(obj, X2));
                        i4 += h3;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (I(obj, W2, i5)) {
                        h3 = AbstractC0420k.M(W2, b0(obj, X2));
                        i4 += h3;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (I(obj, W2, i5)) {
                        h3 = AbstractC0420k.j(W2, b0(obj, X2));
                        i4 += h3;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (I(obj, W2, i5)) {
                        h3 = AbstractC0420k.B(W2, 0);
                        i4 += h3;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (I(obj, W2, i5)) {
                        h3 = AbstractC0420k.D(W2, 0L);
                        i4 += h3;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (I(obj, W2, i5)) {
                        h3 = AbstractC0420k.F(W2, b0(obj, X2));
                        i4 += h3;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (I(obj, W2, i5)) {
                        h3 = AbstractC0420k.H(W2, c0(obj, X2));
                        i4 += h3;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (I(obj, W2, i5)) {
                        h3 = AbstractC0420k.r(W2, (O) o0.C(obj, X2), u(i5));
                        i4 += h3;
                        break;
                    } else {
                        break;
                    }
            }
        }
        return i4 + y(this.f5758o, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:228:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x0(java.lang.Object r19, com.google.crypto.tink.shaded.protobuf.r0 r20) {
        /*
            Method dump skipped, instructions count: 1336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.S.x0(java.lang.Object, com.google.crypto.tink.shaded.protobuf.r0):void");
    }

    public final int y(k0 k0Var, Object obj) {
        return k0Var.h(k0Var.g(obj));
    }

    /* JADX WARN: Removed duplicated region for block: B:275:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void y0(java.lang.Object r13, com.google.crypto.tink.shaded.protobuf.r0 r14) {
        /*
            Method dump skipped, instructions count: 1584
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.S.y0(java.lang.Object, com.google.crypto.tink.shaded.protobuf.r0):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:275:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void z0(java.lang.Object r11, com.google.crypto.tink.shaded.protobuf.r0 r12) {
        /*
            Method dump skipped, instructions count: 1586
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.S.z0(java.lang.Object, com.google.crypto.tink.shaded.protobuf.r0):void");
    }
}
