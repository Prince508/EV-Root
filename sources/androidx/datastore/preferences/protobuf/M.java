package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC0334u;
import androidx.datastore.preferences.protobuf.l0;
import androidx.datastore.preferences.protobuf.m0;
import j.AbstractC0515e;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class M implements Y {

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f3557r = new int[0];

    /* renamed from: s, reason: collision with root package name */
    public static final Unsafe f3558s = j0.B();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f3559a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f3560b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3561c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3562d;

    /* renamed from: e, reason: collision with root package name */
    public final J f3563e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3564f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f3565g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f3566h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f3567i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f3568j;

    /* renamed from: k, reason: collision with root package name */
    public final int f3569k;

    /* renamed from: l, reason: collision with root package name */
    public final int f3570l;

    /* renamed from: m, reason: collision with root package name */
    public final O f3571m;

    /* renamed from: n, reason: collision with root package name */
    public final A f3572n;

    /* renamed from: o, reason: collision with root package name */
    public final f0 f3573o;

    /* renamed from: p, reason: collision with root package name */
    public final AbstractC0328n f3574p;

    /* renamed from: q, reason: collision with root package name */
    public final E f3575q;

    public M(int[] iArr, Object[] objArr, int i3, int i4, J j3, boolean z3, boolean z4, int[] iArr2, int i5, int i6, O o3, A a3, f0 f0Var, AbstractC0328n abstractC0328n, E e3) {
        this.f3559a = iArr;
        this.f3560b = objArr;
        this.f3561c = i3;
        this.f3562d = i4;
        this.f3565g = j3 instanceof AbstractC0333t;
        this.f3566h = z3;
        this.f3564f = abstractC0328n != null && abstractC0328n.e(j3);
        this.f3567i = z4;
        this.f3568j = iArr2;
        this.f3569k = i5;
        this.f3570l = i6;
        this.f3571m = o3;
        this.f3572n = a3;
        this.f3573o = f0Var;
        this.f3574p = abstractC0328n;
        this.f3563e = j3;
        this.f3575q = e3;
    }

    public static boolean E(int i3) {
        return (i3 & 268435456) != 0;
    }

    public static List F(Object obj, long j3) {
        return (List) j0.A(obj, j3);
    }

    public static long G(Object obj, long j3) {
        return j0.y(obj, j3);
    }

    public static M M(Class cls, H h3, O o3, A a3, f0 f0Var, AbstractC0328n abstractC0328n, E e3) {
        if (h3 instanceof W) {
            return O((W) h3, o3, a3, f0Var, abstractC0328n, e3);
        }
        AbstractC0515e.a(h3);
        return N(null, o3, a3, f0Var, abstractC0328n, e3);
    }

    public static M N(c0 c0Var, O o3, A a3, f0 f0Var, AbstractC0328n abstractC0328n, E e3) {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x027e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.datastore.preferences.protobuf.M O(androidx.datastore.preferences.protobuf.W r35, androidx.datastore.preferences.protobuf.O r36, androidx.datastore.preferences.protobuf.A r37, androidx.datastore.preferences.protobuf.f0 r38, androidx.datastore.preferences.protobuf.AbstractC0328n r39, androidx.datastore.preferences.protobuf.E r40) {
        /*
            Method dump skipped, instructions count: 1038
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.M.O(androidx.datastore.preferences.protobuf.W, androidx.datastore.preferences.protobuf.O, androidx.datastore.preferences.protobuf.A, androidx.datastore.preferences.protobuf.f0, androidx.datastore.preferences.protobuf.n, androidx.datastore.preferences.protobuf.E):androidx.datastore.preferences.protobuf.M");
    }

    public static long Q(int i3) {
        return i3 & 1048575;
    }

    public static boolean R(Object obj, long j3) {
        return ((Boolean) j0.A(obj, j3)).booleanValue();
    }

    public static double S(Object obj, long j3) {
        return ((Double) j0.A(obj, j3)).doubleValue();
    }

    public static float T(Object obj, long j3) {
        return ((Float) j0.A(obj, j3)).floatValue();
    }

    public static int U(Object obj, long j3) {
        return ((Integer) j0.A(obj, j3)).intValue();
    }

    public static long V(Object obj, long j3) {
        return ((Long) j0.A(obj, j3)).longValue();
    }

    public static Field c0(Class cls, String str) {
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

    public static int g0(int i3) {
        return (i3 & 267386880) >>> 20;
    }

    public static boolean k(Object obj, long j3) {
        return j0.p(obj, j3);
    }

    public static double l(Object obj, long j3) {
        return j0.v(obj, j3);
    }

    public static float o(Object obj, long j3) {
        return j0.w(obj, j3);
    }

    public static int v(Object obj, long j3) {
        return j0.x(obj, j3);
    }

    public static boolean w(int i3) {
        return (i3 & 536870912) != 0;
    }

    public static boolean z(Object obj, int i3, Y y3) {
        return y3.b(j0.A(obj, Q(i3)));
    }

    public final boolean A(Object obj, int i3, int i4) {
        List list = (List) j0.A(obj, Q(i3));
        if (list.isEmpty()) {
            return true;
        }
        Y r3 = r(i4);
        for (int i5 = 0; i5 < list.size(); i5++) {
            if (!r3.b(list.get(i5))) {
                return false;
            }
        }
        return true;
    }

    public final boolean B(Object obj, int i3, int i4) {
        Map b3 = this.f3575q.b(j0.A(obj, Q(i3)));
        if (b3.isEmpty()) {
            return true;
        }
        if (this.f3575q.h(q(i4)).f3551c.c() != l0.c.MESSAGE) {
            return true;
        }
        Y y3 = null;
        for (Object obj2 : b3.values()) {
            if (y3 == null) {
                y3 = U.a().c(obj2.getClass());
            }
            if (!y3.b(obj2)) {
                return false;
            }
        }
        return true;
    }

    public final boolean C(Object obj, Object obj2, int i3) {
        long X2 = X(i3) & 1048575;
        return j0.x(obj, X2) == j0.x(obj2, X2);
    }

    public final boolean D(Object obj, int i3, int i4) {
        return j0.x(obj, (long) (X(i4) & 1048575)) == i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:211:0x0082, code lost:
    
        r0 = r14.f3569k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0086, code lost:
    
        if (r0 >= r14.f3570l) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0088, code lost:
    
        r7 = n(r9, r14.f3568j[r0], r7, r15);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0093, code lost:
    
        if (r7 == null) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0029, code lost:
    
        r15.o(r9, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:?, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x05f4 A[Catch: all -> 0x0611, TRY_LEAVE, TryCatch #7 {all -> 0x0611, blocks: (B:34:0x05ee, B:36:0x05f4, B:49:0x0615, B:50:0x061a), top: B:33:0x05ee }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0613  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x063e A[LOOP:4: B:63:0x063a->B:65:0x063e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x064b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void H(androidx.datastore.preferences.protobuf.f0 r15, androidx.datastore.preferences.protobuf.AbstractC0328n r16, java.lang.Object r17, androidx.datastore.preferences.protobuf.X r18, androidx.datastore.preferences.protobuf.C0327m r19) {
        /*
            Method dump skipped, instructions count: 1758
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.M.H(androidx.datastore.preferences.protobuf.f0, androidx.datastore.preferences.protobuf.n, java.lang.Object, androidx.datastore.preferences.protobuf.X, androidx.datastore.preferences.protobuf.m):void");
    }

    public final void I(Object obj, int i3, Object obj2, C0327m c0327m, X x3) {
        long Q3 = Q(h0(i3));
        Object A3 = j0.A(obj, Q3);
        if (A3 == null) {
            A3 = this.f3575q.c(obj2);
            j0.O(obj, Q3, A3);
        } else if (this.f3575q.f(A3)) {
            Object c3 = this.f3575q.c(obj2);
            this.f3575q.a(c3, A3);
            j0.O(obj, Q3, c3);
            A3 = c3;
        }
        x3.K(this.f3575q.e(A3), this.f3575q.h(obj2), c0327m);
    }

    public final void J(Object obj, Object obj2, int i3) {
        long Q3 = Q(h0(i3));
        if (x(obj2, i3)) {
            Object A3 = j0.A(obj, Q3);
            Object A4 = j0.A(obj2, Q3);
            if (A3 != null && A4 != null) {
                j0.O(obj, Q3, AbstractC0334u.h(A3, A4));
                d0(obj, i3);
            } else if (A4 != null) {
                j0.O(obj, Q3, A4);
                d0(obj, i3);
            }
        }
    }

    public final void K(Object obj, Object obj2, int i3) {
        int h02 = h0(i3);
        int P3 = P(i3);
        long Q3 = Q(h02);
        if (D(obj2, P3, i3)) {
            Object A3 = j0.A(obj, Q3);
            Object A4 = j0.A(obj2, Q3);
            if (A3 != null && A4 != null) {
                j0.O(obj, Q3, AbstractC0334u.h(A3, A4));
                e0(obj, P3, i3);
            } else if (A4 != null) {
                j0.O(obj, Q3, A4);
                e0(obj, P3, i3);
            }
        }
    }

    public final void L(Object obj, Object obj2, int i3) {
        int h02 = h0(i3);
        long Q3 = Q(h02);
        int P3 = P(i3);
        switch (g0(h02)) {
            case 0:
                if (x(obj2, i3)) {
                    j0.K(obj, Q3, j0.v(obj2, Q3));
                    d0(obj, i3);
                    break;
                }
                break;
            case 1:
                if (x(obj2, i3)) {
                    j0.L(obj, Q3, j0.w(obj2, Q3));
                    d0(obj, i3);
                    break;
                }
                break;
            case 2:
                if (x(obj2, i3)) {
                    j0.N(obj, Q3, j0.y(obj2, Q3));
                    d0(obj, i3);
                    break;
                }
                break;
            case 3:
                if (x(obj2, i3)) {
                    j0.N(obj, Q3, j0.y(obj2, Q3));
                    d0(obj, i3);
                    break;
                }
                break;
            case 4:
                if (x(obj2, i3)) {
                    j0.M(obj, Q3, j0.x(obj2, Q3));
                    d0(obj, i3);
                    break;
                }
                break;
            case 5:
                if (x(obj2, i3)) {
                    j0.N(obj, Q3, j0.y(obj2, Q3));
                    d0(obj, i3);
                    break;
                }
                break;
            case 6:
                if (x(obj2, i3)) {
                    j0.M(obj, Q3, j0.x(obj2, Q3));
                    d0(obj, i3);
                    break;
                }
                break;
            case 7:
                if (x(obj2, i3)) {
                    j0.E(obj, Q3, j0.p(obj2, Q3));
                    d0(obj, i3);
                    break;
                }
                break;
            case 8:
                if (x(obj2, i3)) {
                    j0.O(obj, Q3, j0.A(obj2, Q3));
                    d0(obj, i3);
                    break;
                }
                break;
            case 9:
                J(obj, obj2, i3);
                break;
            case 10:
                if (x(obj2, i3)) {
                    j0.O(obj, Q3, j0.A(obj2, Q3));
                    d0(obj, i3);
                    break;
                }
                break;
            case 11:
                if (x(obj2, i3)) {
                    j0.M(obj, Q3, j0.x(obj2, Q3));
                    d0(obj, i3);
                    break;
                }
                break;
            case 12:
                if (x(obj2, i3)) {
                    j0.M(obj, Q3, j0.x(obj2, Q3));
                    d0(obj, i3);
                    break;
                }
                break;
            case 13:
                if (x(obj2, i3)) {
                    j0.M(obj, Q3, j0.x(obj2, Q3));
                    d0(obj, i3);
                    break;
                }
                break;
            case 14:
                if (x(obj2, i3)) {
                    j0.N(obj, Q3, j0.y(obj2, Q3));
                    d0(obj, i3);
                    break;
                }
                break;
            case 15:
                if (x(obj2, i3)) {
                    j0.M(obj, Q3, j0.x(obj2, Q3));
                    d0(obj, i3);
                    break;
                }
                break;
            case 16:
                if (x(obj2, i3)) {
                    j0.N(obj, Q3, j0.y(obj2, Q3));
                    d0(obj, i3);
                    break;
                }
                break;
            case 17:
                J(obj, obj2, i3);
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
                this.f3572n.d(obj, obj2, Q3);
                break;
            case 50:
                a0.E(this.f3575q, obj, obj2, Q3);
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
                if (D(obj2, P3, i3)) {
                    j0.O(obj, Q3, j0.A(obj2, Q3));
                    e0(obj, P3, i3);
                    break;
                }
                break;
            case 60:
                K(obj, obj2, i3);
                break;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (D(obj2, P3, i3)) {
                    j0.O(obj, Q3, j0.A(obj2, Q3));
                    e0(obj, P3, i3);
                    break;
                }
                break;
            case 68:
                K(obj, obj2, i3);
                break;
        }
    }

    public final int P(int i3) {
        return this.f3559a[i3];
    }

    public final int W(int i3) {
        if (i3 < this.f3561c || i3 > this.f3562d) {
            return -1;
        }
        return f0(i3, 0);
    }

    public final int X(int i3) {
        return this.f3559a[i3 + 2];
    }

    public final void Y(Object obj, long j3, X x3, Y y3, C0327m c0327m) {
        x3.L(this.f3572n.e(obj, j3), y3, c0327m);
    }

    public final void Z(Object obj, int i3, X x3, Y y3, C0327m c0327m) {
        x3.M(this.f3572n.e(obj, Q(i3)), y3, c0327m);
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public void a(Object obj, Object obj2) {
        obj2.getClass();
        for (int i3 = 0; i3 < this.f3559a.length; i3 += 3) {
            L(obj, obj2, i3);
        }
        if (this.f3566h) {
            return;
        }
        a0.F(this.f3573o, obj, obj2);
        if (this.f3564f) {
            a0.D(this.f3574p, obj, obj2);
        }
    }

    public final void a0(Object obj, int i3, X x3) {
        if (w(i3)) {
            j0.O(obj, Q(i3), x3.A());
        } else if (this.f3565g) {
            j0.O(obj, Q(i3), x3.y());
        } else {
            j0.O(obj, Q(i3), x3.c());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public final boolean b(Object obj) {
        int i3;
        int i4 = -1;
        int i5 = 0;
        for (int i6 = 0; i6 < this.f3569k; i6++) {
            int i7 = this.f3568j[i6];
            int P3 = P(i7);
            int h02 = h0(i7);
            if (this.f3566h) {
                i3 = 0;
            } else {
                int i8 = this.f3559a[i7 + 2];
                int i9 = 1048575 & i8;
                i3 = 1 << (i8 >>> 20);
                if (i9 != i4) {
                    i5 = f3558s.getInt(obj, i9);
                    i4 = i9;
                }
            }
            if (E(h02) && !y(obj, i7, i5, i3)) {
                return false;
            }
            int g02 = g0(h02);
            if (g02 != 9 && g02 != 17) {
                if (g02 != 27) {
                    if (g02 == 60 || g02 == 68) {
                        if (D(obj, P3, i7) && !z(obj, h02, r(i7))) {
                            return false;
                        }
                    } else if (g02 != 49) {
                        if (g02 == 50 && !B(obj, h02, i7)) {
                            return false;
                        }
                    }
                }
                if (!A(obj, h02, i7)) {
                    return false;
                }
            } else if (y(obj, i7, i5, i3) && !z(obj, h02, r(i7))) {
                return false;
            }
        }
        return !this.f3564f || this.f3574p.c(obj).k();
    }

    public final void b0(Object obj, int i3, X x3) {
        if (w(i3)) {
            x3.b(this.f3572n.e(obj, Q(i3)));
        } else {
            x3.H(this.f3572n.e(obj, Q(i3)));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public boolean c(Object obj, Object obj2) {
        int length = this.f3559a.length;
        for (int i3 = 0; i3 < length; i3 += 3) {
            if (!m(obj, obj2, i3)) {
                return false;
            }
        }
        if (!this.f3573o.g(obj).equals(this.f3573o.g(obj2))) {
            return false;
        }
        if (this.f3564f) {
            return this.f3574p.c(obj).equals(this.f3574p.c(obj2));
        }
        return true;
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public int d(Object obj) {
        return this.f3566h ? t(obj) : s(obj);
    }

    public final void d0(Object obj, int i3) {
        if (this.f3566h) {
            return;
        }
        int X2 = X(i3);
        long j3 = X2 & 1048575;
        j0.M(obj, j3, j0.x(obj, j3) | (1 << (X2 >>> 20)));
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public Object e() {
        return this.f3571m.a(this.f3563e);
    }

    public final void e0(Object obj, int i3, int i4) {
        j0.M(obj, X(i4) & 1048575, i3);
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public void f(Object obj) {
        int i3;
        int i4 = this.f3569k;
        while (true) {
            i3 = this.f3570l;
            if (i4 >= i3) {
                break;
            }
            long Q3 = Q(h0(this.f3568j[i4]));
            Object A3 = j0.A(obj, Q3);
            if (A3 != null) {
                j0.O(obj, Q3, this.f3575q.g(A3));
            }
            i4++;
        }
        int length = this.f3568j.length;
        while (i3 < length) {
            this.f3572n.c(obj, this.f3568j[i3]);
            i3++;
        }
        this.f3573o.j(obj);
        if (this.f3564f) {
            this.f3574p.f(obj);
        }
    }

    public final int f0(int i3, int i4) {
        int length = (this.f3559a.length / 3) - 1;
        while (i4 <= length) {
            int i5 = (length + i4) >>> 1;
            int i6 = i5 * 3;
            int P3 = P(i6);
            if (i3 == P3) {
                return i6;
            }
            if (i3 < P3) {
                length = i5 - 1;
            } else {
                i4 = i5 + 1;
            }
        }
        return -1;
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public int g(Object obj) {
        int i3;
        int f3;
        int length = this.f3559a.length;
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5 += 3) {
            int h02 = h0(i5);
            int P3 = P(i5);
            long Q3 = Q(h02);
            int i6 = 37;
            switch (g0(h02)) {
                case 0:
                    i3 = i4 * 53;
                    f3 = AbstractC0334u.f(Double.doubleToLongBits(j0.v(obj, Q3)));
                    i4 = i3 + f3;
                    break;
                case 1:
                    i3 = i4 * 53;
                    f3 = Float.floatToIntBits(j0.w(obj, Q3));
                    i4 = i3 + f3;
                    break;
                case 2:
                    i3 = i4 * 53;
                    f3 = AbstractC0334u.f(j0.y(obj, Q3));
                    i4 = i3 + f3;
                    break;
                case 3:
                    i3 = i4 * 53;
                    f3 = AbstractC0334u.f(j0.y(obj, Q3));
                    i4 = i3 + f3;
                    break;
                case 4:
                    i3 = i4 * 53;
                    f3 = j0.x(obj, Q3);
                    i4 = i3 + f3;
                    break;
                case 5:
                    i3 = i4 * 53;
                    f3 = AbstractC0334u.f(j0.y(obj, Q3));
                    i4 = i3 + f3;
                    break;
                case 6:
                    i3 = i4 * 53;
                    f3 = j0.x(obj, Q3);
                    i4 = i3 + f3;
                    break;
                case 7:
                    i3 = i4 * 53;
                    f3 = AbstractC0334u.c(j0.p(obj, Q3));
                    i4 = i3 + f3;
                    break;
                case 8:
                    i3 = i4 * 53;
                    f3 = ((String) j0.A(obj, Q3)).hashCode();
                    i4 = i3 + f3;
                    break;
                case 9:
                    Object A3 = j0.A(obj, Q3);
                    if (A3 != null) {
                        i6 = A3.hashCode();
                    }
                    i4 = (i4 * 53) + i6;
                    break;
                case 10:
                    i3 = i4 * 53;
                    f3 = j0.A(obj, Q3).hashCode();
                    i4 = i3 + f3;
                    break;
                case 11:
                    i3 = i4 * 53;
                    f3 = j0.x(obj, Q3);
                    i4 = i3 + f3;
                    break;
                case 12:
                    i3 = i4 * 53;
                    f3 = j0.x(obj, Q3);
                    i4 = i3 + f3;
                    break;
                case 13:
                    i3 = i4 * 53;
                    f3 = j0.x(obj, Q3);
                    i4 = i3 + f3;
                    break;
                case 14:
                    i3 = i4 * 53;
                    f3 = AbstractC0334u.f(j0.y(obj, Q3));
                    i4 = i3 + f3;
                    break;
                case 15:
                    i3 = i4 * 53;
                    f3 = j0.x(obj, Q3);
                    i4 = i3 + f3;
                    break;
                case 16:
                    i3 = i4 * 53;
                    f3 = AbstractC0334u.f(j0.y(obj, Q3));
                    i4 = i3 + f3;
                    break;
                case 17:
                    Object A4 = j0.A(obj, Q3);
                    if (A4 != null) {
                        i6 = A4.hashCode();
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
                    f3 = j0.A(obj, Q3).hashCode();
                    i4 = i3 + f3;
                    break;
                case 50:
                    i3 = i4 * 53;
                    f3 = j0.A(obj, Q3).hashCode();
                    i4 = i3 + f3;
                    break;
                case 51:
                    if (D(obj, P3, i5)) {
                        i3 = i4 * 53;
                        f3 = AbstractC0334u.f(Double.doubleToLongBits(S(obj, Q3)));
                        i4 = i3 + f3;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (D(obj, P3, i5)) {
                        i3 = i4 * 53;
                        f3 = Float.floatToIntBits(T(obj, Q3));
                        i4 = i3 + f3;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (D(obj, P3, i5)) {
                        i3 = i4 * 53;
                        f3 = AbstractC0334u.f(V(obj, Q3));
                        i4 = i3 + f3;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (D(obj, P3, i5)) {
                        i3 = i4 * 53;
                        f3 = AbstractC0334u.f(V(obj, Q3));
                        i4 = i3 + f3;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (D(obj, P3, i5)) {
                        i3 = i4 * 53;
                        f3 = U(obj, Q3);
                        i4 = i3 + f3;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (D(obj, P3, i5)) {
                        i3 = i4 * 53;
                        f3 = AbstractC0334u.f(V(obj, Q3));
                        i4 = i3 + f3;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (D(obj, P3, i5)) {
                        i3 = i4 * 53;
                        f3 = U(obj, Q3);
                        i4 = i3 + f3;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (D(obj, P3, i5)) {
                        i3 = i4 * 53;
                        f3 = AbstractC0334u.c(R(obj, Q3));
                        i4 = i3 + f3;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (D(obj, P3, i5)) {
                        i3 = i4 * 53;
                        f3 = ((String) j0.A(obj, Q3)).hashCode();
                        i4 = i3 + f3;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (D(obj, P3, i5)) {
                        i3 = i4 * 53;
                        f3 = j0.A(obj, Q3).hashCode();
                        i4 = i3 + f3;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (D(obj, P3, i5)) {
                        i3 = i4 * 53;
                        f3 = j0.A(obj, Q3).hashCode();
                        i4 = i3 + f3;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (D(obj, P3, i5)) {
                        i3 = i4 * 53;
                        f3 = U(obj, Q3);
                        i4 = i3 + f3;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (D(obj, P3, i5)) {
                        i3 = i4 * 53;
                        f3 = U(obj, Q3);
                        i4 = i3 + f3;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (D(obj, P3, i5)) {
                        i3 = i4 * 53;
                        f3 = U(obj, Q3);
                        i4 = i3 + f3;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (D(obj, P3, i5)) {
                        i3 = i4 * 53;
                        f3 = AbstractC0334u.f(V(obj, Q3));
                        i4 = i3 + f3;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (D(obj, P3, i5)) {
                        i3 = i4 * 53;
                        f3 = U(obj, Q3);
                        i4 = i3 + f3;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (D(obj, P3, i5)) {
                        i3 = i4 * 53;
                        f3 = AbstractC0334u.f(V(obj, Q3));
                        i4 = i3 + f3;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (D(obj, P3, i5)) {
                        i3 = i4 * 53;
                        f3 = j0.A(obj, Q3).hashCode();
                        i4 = i3 + f3;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i4 * 53) + this.f3573o.g(obj).hashCode();
        return this.f3564f ? (hashCode * 53) + this.f3574p.c(obj).hashCode() : hashCode;
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public void h(Object obj, X x3, C0327m c0327m) {
        c0327m.getClass();
        H(this.f3573o, this.f3574p, obj, x3, c0327m);
    }

    public final int h0(int i3) {
        return this.f3559a[i3 + 1];
    }

    @Override // androidx.datastore.preferences.protobuf.Y
    public void i(Object obj, m0 m0Var) {
        if (m0Var.j() == m0.a.DESCENDING) {
            k0(obj, m0Var);
        } else if (this.f3566h) {
            j0(obj, m0Var);
        } else {
            i0(obj, m0Var);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:227:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i0(java.lang.Object r19, androidx.datastore.preferences.protobuf.m0 r20) {
        /*
            Method dump skipped, instructions count: 1384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.M.i0(java.lang.Object, androidx.datastore.preferences.protobuf.m0):void");
    }

    public final boolean j(Object obj, Object obj2, int i3) {
        return x(obj, i3) == x(obj2, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:275:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j0(java.lang.Object r13, androidx.datastore.preferences.protobuf.m0 r14) {
        /*
            Method dump skipped, instructions count: 1584
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.M.j0(java.lang.Object, androidx.datastore.preferences.protobuf.m0):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:275:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k0(java.lang.Object r11, androidx.datastore.preferences.protobuf.m0 r12) {
        /*
            Method dump skipped, instructions count: 1586
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.M.k0(java.lang.Object, androidx.datastore.preferences.protobuf.m0):void");
    }

    public final void l0(m0 m0Var, int i3, Object obj, int i4) {
        if (obj != null) {
            m0Var.M(i3, this.f3575q.h(q(i4)), this.f3575q.b(obj));
        }
    }

    public final boolean m(Object obj, Object obj2, int i3) {
        int h02 = h0(i3);
        long Q3 = Q(h02);
        switch (g0(h02)) {
            case 0:
                if (!j(obj, obj2, i3) || Double.doubleToLongBits(j0.v(obj, Q3)) != Double.doubleToLongBits(j0.v(obj2, Q3))) {
                }
                break;
            case 1:
                if (!j(obj, obj2, i3) || Float.floatToIntBits(j0.w(obj, Q3)) != Float.floatToIntBits(j0.w(obj2, Q3))) {
                }
                break;
            case 2:
                if (!j(obj, obj2, i3) || j0.y(obj, Q3) != j0.y(obj2, Q3)) {
                }
                break;
            case 3:
                if (!j(obj, obj2, i3) || j0.y(obj, Q3) != j0.y(obj2, Q3)) {
                }
                break;
            case 4:
                if (!j(obj, obj2, i3) || j0.x(obj, Q3) != j0.x(obj2, Q3)) {
                }
                break;
            case 5:
                if (!j(obj, obj2, i3) || j0.y(obj, Q3) != j0.y(obj2, Q3)) {
                }
                break;
            case 6:
                if (!j(obj, obj2, i3) || j0.x(obj, Q3) != j0.x(obj2, Q3)) {
                }
                break;
            case 7:
                if (!j(obj, obj2, i3) || j0.p(obj, Q3) != j0.p(obj2, Q3)) {
                }
                break;
            case 8:
                if (!j(obj, obj2, i3) || !a0.J(j0.A(obj, Q3), j0.A(obj2, Q3))) {
                }
                break;
            case 9:
                if (!j(obj, obj2, i3) || !a0.J(j0.A(obj, Q3), j0.A(obj2, Q3))) {
                }
                break;
            case 10:
                if (!j(obj, obj2, i3) || !a0.J(j0.A(obj, Q3), j0.A(obj2, Q3))) {
                }
                break;
            case 11:
                if (!j(obj, obj2, i3) || j0.x(obj, Q3) != j0.x(obj2, Q3)) {
                }
                break;
            case 12:
                if (!j(obj, obj2, i3) || j0.x(obj, Q3) != j0.x(obj2, Q3)) {
                }
                break;
            case 13:
                if (!j(obj, obj2, i3) || j0.x(obj, Q3) != j0.x(obj2, Q3)) {
                }
                break;
            case 14:
                if (!j(obj, obj2, i3) || j0.y(obj, Q3) != j0.y(obj2, Q3)) {
                }
                break;
            case 15:
                if (!j(obj, obj2, i3) || j0.x(obj, Q3) != j0.x(obj2, Q3)) {
                }
                break;
            case 16:
                if (!j(obj, obj2, i3) || j0.y(obj, Q3) != j0.y(obj2, Q3)) {
                }
                break;
            case 17:
                if (!j(obj, obj2, i3) || !a0.J(j0.A(obj, Q3), j0.A(obj2, Q3))) {
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
                if (!C(obj, obj2, i3) || !a0.J(j0.A(obj, Q3), j0.A(obj2, Q3))) {
                }
                break;
        }
        return true;
    }

    public final void m0(int i3, Object obj, m0 m0Var) {
        if (obj instanceof String) {
            m0Var.q(i3, (String) obj);
        } else {
            m0Var.L(i3, (AbstractC0320f) obj);
        }
    }

    public final Object n(Object obj, int i3, Object obj2, f0 f0Var) {
        P(i3);
        if (j0.A(obj, Q(h0(i3))) == null) {
            return obj2;
        }
        p(i3);
        return obj2;
    }

    public final void n0(f0 f0Var, Object obj, m0 m0Var) {
        f0Var.t(f0Var.g(obj), m0Var);
    }

    public final AbstractC0334u.a p(int i3) {
        AbstractC0515e.a(this.f3560b[((i3 / 3) * 2) + 1]);
        return null;
    }

    public final Object q(int i3) {
        return this.f3560b[(i3 / 3) * 2];
    }

    public final Y r(int i3) {
        int i4 = (i3 / 3) * 2;
        Y y3 = (Y) this.f3560b[i4];
        if (y3 != null) {
            return y3;
        }
        Y c3 = U.a().c((Class) this.f3560b[i4 + 1]);
        this.f3560b[i4] = c3;
        return c3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int s(Object obj) {
        int i3;
        int i4;
        int h3;
        int c3;
        boolean z3;
        int f3;
        int i5;
        int P3;
        int R3;
        Unsafe unsafe = f3558s;
        int i6 = -1;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i7 < this.f3559a.length) {
            int h02 = h0(i7);
            int P4 = P(i7);
            int g02 = g0(h02);
            if (g02 <= 17) {
                i3 = this.f3559a[i7 + 2];
                int i10 = 1048575 & i3;
                int i11 = 1 << (i3 >>> 20);
                if (i10 != i6) {
                    i9 = unsafe.getInt(obj, i10);
                    i6 = i10;
                }
                i4 = i11;
            } else {
                i3 = (!this.f3567i || g02 < r.f3785S.c() || g02 > r.f3798f0.c()) ? 0 : this.f3559a[i7 + 2] & 1048575;
                i4 = 0;
            }
            long Q3 = Q(h02);
            int i12 = i6;
            switch (g02) {
                case 0:
                    if ((i9 & i4) == 0) {
                        break;
                    } else {
                        h3 = AbstractC0323i.h(P4, 0.0d);
                        i8 += h3;
                        break;
                    }
                case 1:
                    if ((i9 & i4) == 0) {
                        break;
                    } else {
                        h3 = AbstractC0323i.p(P4, 0.0f);
                        i8 += h3;
                        break;
                    }
                case 2:
                    if ((i9 & i4) == 0) {
                        break;
                    } else {
                        h3 = AbstractC0323i.w(P4, unsafe.getLong(obj, Q3));
                        i8 += h3;
                        break;
                    }
                case 3:
                    if ((i9 & i4) == 0) {
                        break;
                    } else {
                        h3 = AbstractC0323i.S(P4, unsafe.getLong(obj, Q3));
                        i8 += h3;
                        break;
                    }
                case 4:
                    if ((i9 & i4) == 0) {
                        break;
                    } else {
                        h3 = AbstractC0323i.u(P4, unsafe.getInt(obj, Q3));
                        i8 += h3;
                        break;
                    }
                case 5:
                    if ((i9 & i4) == 0) {
                        break;
                    } else {
                        h3 = AbstractC0323i.n(P4, 0L);
                        i8 += h3;
                        break;
                    }
                case 6:
                    if ((i9 & i4) != 0) {
                        h3 = AbstractC0323i.l(P4, 0);
                        i8 += h3;
                        break;
                    }
                    break;
                case 7:
                    if ((i9 & i4) != 0) {
                        c3 = AbstractC0323i.c(P4, true);
                        i8 += c3;
                    }
                    break;
                case 8:
                    if ((i9 & i4) != 0) {
                        Object object = unsafe.getObject(obj, Q3);
                        c3 = object instanceof AbstractC0320f ? AbstractC0323i.f(P4, (AbstractC0320f) object) : AbstractC0323i.N(P4, (String) object);
                        i8 += c3;
                    }
                    break;
                case 9:
                    if ((i9 & i4) != 0) {
                        c3 = a0.o(P4, unsafe.getObject(obj, Q3), r(i7));
                        i8 += c3;
                    }
                    break;
                case 10:
                    if ((i9 & i4) != 0) {
                        c3 = AbstractC0323i.f(P4, (AbstractC0320f) unsafe.getObject(obj, Q3));
                        i8 += c3;
                    }
                    break;
                case 11:
                    if ((i9 & i4) != 0) {
                        c3 = AbstractC0323i.Q(P4, unsafe.getInt(obj, Q3));
                        i8 += c3;
                    }
                    break;
                case 12:
                    if ((i9 & i4) != 0) {
                        c3 = AbstractC0323i.j(P4, unsafe.getInt(obj, Q3));
                        i8 += c3;
                    }
                    break;
                case 13:
                    if ((i9 & i4) != 0) {
                        c3 = AbstractC0323i.F(P4, 0);
                        i8 += c3;
                    }
                    break;
                case 14:
                    if ((i9 & i4) != 0) {
                        c3 = AbstractC0323i.H(P4, 0L);
                        i8 += c3;
                    }
                    break;
                case 15:
                    if ((i9 & i4) != 0) {
                        c3 = AbstractC0323i.J(P4, unsafe.getInt(obj, Q3));
                        i8 += c3;
                    }
                    break;
                case 16:
                    if ((i9 & i4) != 0) {
                        c3 = AbstractC0323i.L(P4, unsafe.getLong(obj, Q3));
                        i8 += c3;
                    }
                    break;
                case 17:
                    if ((i9 & i4) != 0) {
                        c3 = AbstractC0323i.r(P4, (J) unsafe.getObject(obj, Q3), r(i7));
                        i8 += c3;
                    }
                    break;
                case 18:
                    c3 = a0.h(P4, (List) unsafe.getObject(obj, Q3), false);
                    i8 += c3;
                    break;
                case 19:
                    z3 = false;
                    f3 = a0.f(P4, (List) unsafe.getObject(obj, Q3), false);
                    i8 += f3;
                    break;
                case 20:
                    z3 = false;
                    f3 = a0.m(P4, (List) unsafe.getObject(obj, Q3), false);
                    i8 += f3;
                    break;
                case 21:
                    z3 = false;
                    f3 = a0.x(P4, (List) unsafe.getObject(obj, Q3), false);
                    i8 += f3;
                    break;
                case 22:
                    z3 = false;
                    f3 = a0.k(P4, (List) unsafe.getObject(obj, Q3), false);
                    i8 += f3;
                    break;
                case 23:
                    z3 = false;
                    f3 = a0.h(P4, (List) unsafe.getObject(obj, Q3), false);
                    i8 += f3;
                    break;
                case 24:
                    z3 = false;
                    f3 = a0.f(P4, (List) unsafe.getObject(obj, Q3), false);
                    i8 += f3;
                    break;
                case 25:
                    z3 = false;
                    f3 = a0.a(P4, (List) unsafe.getObject(obj, Q3), false);
                    i8 += f3;
                    break;
                case 26:
                    c3 = a0.u(P4, (List) unsafe.getObject(obj, Q3));
                    i8 += c3;
                    break;
                case 27:
                    c3 = a0.p(P4, (List) unsafe.getObject(obj, Q3), r(i7));
                    i8 += c3;
                    break;
                case 28:
                    c3 = a0.c(P4, (List) unsafe.getObject(obj, Q3));
                    i8 += c3;
                    break;
                case 29:
                    c3 = a0.v(P4, (List) unsafe.getObject(obj, Q3), false);
                    i8 += c3;
                    break;
                case 30:
                    z3 = false;
                    f3 = a0.d(P4, (List) unsafe.getObject(obj, Q3), false);
                    i8 += f3;
                    break;
                case 31:
                    z3 = false;
                    f3 = a0.f(P4, (List) unsafe.getObject(obj, Q3), false);
                    i8 += f3;
                    break;
                case 32:
                    z3 = false;
                    f3 = a0.h(P4, (List) unsafe.getObject(obj, Q3), false);
                    i8 += f3;
                    break;
                case 33:
                    z3 = false;
                    f3 = a0.q(P4, (List) unsafe.getObject(obj, Q3), false);
                    i8 += f3;
                    break;
                case 34:
                    z3 = false;
                    f3 = a0.s(P4, (List) unsafe.getObject(obj, Q3), false);
                    i8 += f3;
                    break;
                case 35:
                    i5 = a0.i((List) unsafe.getObject(obj, Q3));
                    if (i5 > 0) {
                        if (this.f3567i) {
                            unsafe.putInt(obj, i3, i5);
                        }
                        P3 = AbstractC0323i.P(P4);
                        R3 = AbstractC0323i.R(i5);
                        i8 += P3 + R3 + i5;
                    }
                    break;
                case 36:
                    i5 = a0.g((List) unsafe.getObject(obj, Q3));
                    if (i5 > 0) {
                        if (this.f3567i) {
                            unsafe.putInt(obj, i3, i5);
                        }
                        P3 = AbstractC0323i.P(P4);
                        R3 = AbstractC0323i.R(i5);
                        i8 += P3 + R3 + i5;
                    }
                    break;
                case 37:
                    i5 = a0.n((List) unsafe.getObject(obj, Q3));
                    if (i5 > 0) {
                        if (this.f3567i) {
                            unsafe.putInt(obj, i3, i5);
                        }
                        P3 = AbstractC0323i.P(P4);
                        R3 = AbstractC0323i.R(i5);
                        i8 += P3 + R3 + i5;
                    }
                    break;
                case 38:
                    i5 = a0.y((List) unsafe.getObject(obj, Q3));
                    if (i5 > 0) {
                        if (this.f3567i) {
                            unsafe.putInt(obj, i3, i5);
                        }
                        P3 = AbstractC0323i.P(P4);
                        R3 = AbstractC0323i.R(i5);
                        i8 += P3 + R3 + i5;
                    }
                    break;
                case 39:
                    i5 = a0.l((List) unsafe.getObject(obj, Q3));
                    if (i5 > 0) {
                        if (this.f3567i) {
                            unsafe.putInt(obj, i3, i5);
                        }
                        P3 = AbstractC0323i.P(P4);
                        R3 = AbstractC0323i.R(i5);
                        i8 += P3 + R3 + i5;
                    }
                    break;
                case 40:
                    i5 = a0.i((List) unsafe.getObject(obj, Q3));
                    if (i5 > 0) {
                        if (this.f3567i) {
                            unsafe.putInt(obj, i3, i5);
                        }
                        P3 = AbstractC0323i.P(P4);
                        R3 = AbstractC0323i.R(i5);
                        i8 += P3 + R3 + i5;
                    }
                    break;
                case 41:
                    i5 = a0.g((List) unsafe.getObject(obj, Q3));
                    if (i5 > 0) {
                        if (this.f3567i) {
                            unsafe.putInt(obj, i3, i5);
                        }
                        P3 = AbstractC0323i.P(P4);
                        R3 = AbstractC0323i.R(i5);
                        i8 += P3 + R3 + i5;
                    }
                    break;
                case 42:
                    i5 = a0.b((List) unsafe.getObject(obj, Q3));
                    if (i5 > 0) {
                        if (this.f3567i) {
                            unsafe.putInt(obj, i3, i5);
                        }
                        P3 = AbstractC0323i.P(P4);
                        R3 = AbstractC0323i.R(i5);
                        i8 += P3 + R3 + i5;
                    }
                    break;
                case 43:
                    i5 = a0.w((List) unsafe.getObject(obj, Q3));
                    if (i5 > 0) {
                        if (this.f3567i) {
                            unsafe.putInt(obj, i3, i5);
                        }
                        P3 = AbstractC0323i.P(P4);
                        R3 = AbstractC0323i.R(i5);
                        i8 += P3 + R3 + i5;
                    }
                    break;
                case 44:
                    i5 = a0.e((List) unsafe.getObject(obj, Q3));
                    if (i5 > 0) {
                        if (this.f3567i) {
                            unsafe.putInt(obj, i3, i5);
                        }
                        P3 = AbstractC0323i.P(P4);
                        R3 = AbstractC0323i.R(i5);
                        i8 += P3 + R3 + i5;
                    }
                    break;
                case 45:
                    i5 = a0.g((List) unsafe.getObject(obj, Q3));
                    if (i5 > 0) {
                        if (this.f3567i) {
                            unsafe.putInt(obj, i3, i5);
                        }
                        P3 = AbstractC0323i.P(P4);
                        R3 = AbstractC0323i.R(i5);
                        i8 += P3 + R3 + i5;
                    }
                    break;
                case 46:
                    i5 = a0.i((List) unsafe.getObject(obj, Q3));
                    if (i5 > 0) {
                        if (this.f3567i) {
                            unsafe.putInt(obj, i3, i5);
                        }
                        P3 = AbstractC0323i.P(P4);
                        R3 = AbstractC0323i.R(i5);
                        i8 += P3 + R3 + i5;
                    }
                    break;
                case 47:
                    i5 = a0.r((List) unsafe.getObject(obj, Q3));
                    if (i5 > 0) {
                        if (this.f3567i) {
                            unsafe.putInt(obj, i3, i5);
                        }
                        P3 = AbstractC0323i.P(P4);
                        R3 = AbstractC0323i.R(i5);
                        i8 += P3 + R3 + i5;
                    }
                    break;
                case 48:
                    i5 = a0.t((List) unsafe.getObject(obj, Q3));
                    if (i5 > 0) {
                        if (this.f3567i) {
                            unsafe.putInt(obj, i3, i5);
                        }
                        P3 = AbstractC0323i.P(P4);
                        R3 = AbstractC0323i.R(i5);
                        i8 += P3 + R3 + i5;
                    }
                    break;
                case 49:
                    c3 = a0.j(P4, (List) unsafe.getObject(obj, Q3), r(i7));
                    i8 += c3;
                    break;
                case 50:
                    c3 = this.f3575q.d(P4, unsafe.getObject(obj, Q3), q(i7));
                    i8 += c3;
                    break;
                case 51:
                    if (D(obj, P4, i7)) {
                        c3 = AbstractC0323i.h(P4, 0.0d);
                        i8 += c3;
                    }
                    break;
                case 52:
                    if (D(obj, P4, i7)) {
                        c3 = AbstractC0323i.p(P4, 0.0f);
                        i8 += c3;
                    }
                    break;
                case 53:
                    if (D(obj, P4, i7)) {
                        c3 = AbstractC0323i.w(P4, V(obj, Q3));
                        i8 += c3;
                    }
                    break;
                case 54:
                    if (D(obj, P4, i7)) {
                        c3 = AbstractC0323i.S(P4, V(obj, Q3));
                        i8 += c3;
                    }
                    break;
                case 55:
                    if (D(obj, P4, i7)) {
                        c3 = AbstractC0323i.u(P4, U(obj, Q3));
                        i8 += c3;
                    }
                    break;
                case 56:
                    if (D(obj, P4, i7)) {
                        c3 = AbstractC0323i.n(P4, 0L);
                        i8 += c3;
                    }
                    break;
                case 57:
                    if (D(obj, P4, i7)) {
                        c3 = AbstractC0323i.l(P4, 0);
                        i8 += c3;
                    }
                    break;
                case 58:
                    if (D(obj, P4, i7)) {
                        c3 = AbstractC0323i.c(P4, true);
                        i8 += c3;
                    }
                    break;
                case 59:
                    if (D(obj, P4, i7)) {
                        Object object2 = unsafe.getObject(obj, Q3);
                        c3 = object2 instanceof AbstractC0320f ? AbstractC0323i.f(P4, (AbstractC0320f) object2) : AbstractC0323i.N(P4, (String) object2);
                        i8 += c3;
                    }
                    break;
                case 60:
                    if (D(obj, P4, i7)) {
                        c3 = a0.o(P4, unsafe.getObject(obj, Q3), r(i7));
                        i8 += c3;
                    }
                    break;
                case 61:
                    if (D(obj, P4, i7)) {
                        c3 = AbstractC0323i.f(P4, (AbstractC0320f) unsafe.getObject(obj, Q3));
                        i8 += c3;
                    }
                    break;
                case 62:
                    if (D(obj, P4, i7)) {
                        c3 = AbstractC0323i.Q(P4, U(obj, Q3));
                        i8 += c3;
                    }
                    break;
                case 63:
                    if (D(obj, P4, i7)) {
                        c3 = AbstractC0323i.j(P4, U(obj, Q3));
                        i8 += c3;
                    }
                    break;
                case 64:
                    if (D(obj, P4, i7)) {
                        c3 = AbstractC0323i.F(P4, 0);
                        i8 += c3;
                    }
                    break;
                case 65:
                    if (D(obj, P4, i7)) {
                        c3 = AbstractC0323i.H(P4, 0L);
                        i8 += c3;
                    }
                    break;
                case 66:
                    if (D(obj, P4, i7)) {
                        c3 = AbstractC0323i.J(P4, U(obj, Q3));
                        i8 += c3;
                    }
                    break;
                case 67:
                    if (D(obj, P4, i7)) {
                        c3 = AbstractC0323i.L(P4, V(obj, Q3));
                        i8 += c3;
                    }
                    break;
                case 68:
                    if (D(obj, P4, i7)) {
                        c3 = AbstractC0323i.r(P4, (J) unsafe.getObject(obj, Q3), r(i7));
                        i8 += c3;
                    }
                    break;
            }
            i7 += 3;
            i6 = i12;
        }
        int u3 = i8 + u(this.f3573o, obj);
        return this.f3564f ? u3 + this.f3574p.c(obj).h() : u3;
    }

    public final int t(Object obj) {
        int h3;
        int i3;
        int P3;
        int R3;
        Unsafe unsafe = f3558s;
        int i4 = 0;
        for (int i5 = 0; i5 < this.f3559a.length; i5 += 3) {
            int h02 = h0(i5);
            int g02 = g0(h02);
            int P4 = P(i5);
            long Q3 = Q(h02);
            int i6 = (g02 < r.f3785S.c() || g02 > r.f3798f0.c()) ? 0 : this.f3559a[i5 + 2] & 1048575;
            switch (g02) {
                case 0:
                    if (x(obj, i5)) {
                        h3 = AbstractC0323i.h(P4, 0.0d);
                        i4 += h3;
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (x(obj, i5)) {
                        h3 = AbstractC0323i.p(P4, 0.0f);
                        i4 += h3;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (x(obj, i5)) {
                        h3 = AbstractC0323i.w(P4, j0.y(obj, Q3));
                        i4 += h3;
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (x(obj, i5)) {
                        h3 = AbstractC0323i.S(P4, j0.y(obj, Q3));
                        i4 += h3;
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (x(obj, i5)) {
                        h3 = AbstractC0323i.u(P4, j0.x(obj, Q3));
                        i4 += h3;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (x(obj, i5)) {
                        h3 = AbstractC0323i.n(P4, 0L);
                        i4 += h3;
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (x(obj, i5)) {
                        h3 = AbstractC0323i.l(P4, 0);
                        i4 += h3;
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (x(obj, i5)) {
                        h3 = AbstractC0323i.c(P4, true);
                        i4 += h3;
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (x(obj, i5)) {
                        Object A3 = j0.A(obj, Q3);
                        h3 = A3 instanceof AbstractC0320f ? AbstractC0323i.f(P4, (AbstractC0320f) A3) : AbstractC0323i.N(P4, (String) A3);
                        i4 += h3;
                        break;
                    } else {
                        break;
                    }
                case 9:
                    if (x(obj, i5)) {
                        h3 = a0.o(P4, j0.A(obj, Q3), r(i5));
                        i4 += h3;
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (x(obj, i5)) {
                        h3 = AbstractC0323i.f(P4, (AbstractC0320f) j0.A(obj, Q3));
                        i4 += h3;
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (x(obj, i5)) {
                        h3 = AbstractC0323i.Q(P4, j0.x(obj, Q3));
                        i4 += h3;
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (x(obj, i5)) {
                        h3 = AbstractC0323i.j(P4, j0.x(obj, Q3));
                        i4 += h3;
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (x(obj, i5)) {
                        h3 = AbstractC0323i.F(P4, 0);
                        i4 += h3;
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (x(obj, i5)) {
                        h3 = AbstractC0323i.H(P4, 0L);
                        i4 += h3;
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (x(obj, i5)) {
                        h3 = AbstractC0323i.J(P4, j0.x(obj, Q3));
                        i4 += h3;
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (x(obj, i5)) {
                        h3 = AbstractC0323i.L(P4, j0.y(obj, Q3));
                        i4 += h3;
                        break;
                    } else {
                        break;
                    }
                case 17:
                    if (x(obj, i5)) {
                        h3 = AbstractC0323i.r(P4, (J) j0.A(obj, Q3), r(i5));
                        i4 += h3;
                        break;
                    } else {
                        break;
                    }
                case 18:
                    h3 = a0.h(P4, F(obj, Q3), false);
                    i4 += h3;
                    break;
                case 19:
                    h3 = a0.f(P4, F(obj, Q3), false);
                    i4 += h3;
                    break;
                case 20:
                    h3 = a0.m(P4, F(obj, Q3), false);
                    i4 += h3;
                    break;
                case 21:
                    h3 = a0.x(P4, F(obj, Q3), false);
                    i4 += h3;
                    break;
                case 22:
                    h3 = a0.k(P4, F(obj, Q3), false);
                    i4 += h3;
                    break;
                case 23:
                    h3 = a0.h(P4, F(obj, Q3), false);
                    i4 += h3;
                    break;
                case 24:
                    h3 = a0.f(P4, F(obj, Q3), false);
                    i4 += h3;
                    break;
                case 25:
                    h3 = a0.a(P4, F(obj, Q3), false);
                    i4 += h3;
                    break;
                case 26:
                    h3 = a0.u(P4, F(obj, Q3));
                    i4 += h3;
                    break;
                case 27:
                    h3 = a0.p(P4, F(obj, Q3), r(i5));
                    i4 += h3;
                    break;
                case 28:
                    h3 = a0.c(P4, F(obj, Q3));
                    i4 += h3;
                    break;
                case 29:
                    h3 = a0.v(P4, F(obj, Q3), false);
                    i4 += h3;
                    break;
                case 30:
                    h3 = a0.d(P4, F(obj, Q3), false);
                    i4 += h3;
                    break;
                case 31:
                    h3 = a0.f(P4, F(obj, Q3), false);
                    i4 += h3;
                    break;
                case 32:
                    h3 = a0.h(P4, F(obj, Q3), false);
                    i4 += h3;
                    break;
                case 33:
                    h3 = a0.q(P4, F(obj, Q3), false);
                    i4 += h3;
                    break;
                case 34:
                    h3 = a0.s(P4, F(obj, Q3), false);
                    i4 += h3;
                    break;
                case 35:
                    i3 = a0.i((List) unsafe.getObject(obj, Q3));
                    if (i3 <= 0) {
                        break;
                    } else {
                        if (this.f3567i) {
                            unsafe.putInt(obj, i6, i3);
                        }
                        P3 = AbstractC0323i.P(P4);
                        R3 = AbstractC0323i.R(i3);
                        h3 = P3 + R3 + i3;
                        i4 += h3;
                        break;
                    }
                case 36:
                    i3 = a0.g((List) unsafe.getObject(obj, Q3));
                    if (i3 <= 0) {
                        break;
                    } else {
                        if (this.f3567i) {
                            unsafe.putInt(obj, i6, i3);
                        }
                        P3 = AbstractC0323i.P(P4);
                        R3 = AbstractC0323i.R(i3);
                        h3 = P3 + R3 + i3;
                        i4 += h3;
                        break;
                    }
                case 37:
                    i3 = a0.n((List) unsafe.getObject(obj, Q3));
                    if (i3 <= 0) {
                        break;
                    } else {
                        if (this.f3567i) {
                            unsafe.putInt(obj, i6, i3);
                        }
                        P3 = AbstractC0323i.P(P4);
                        R3 = AbstractC0323i.R(i3);
                        h3 = P3 + R3 + i3;
                        i4 += h3;
                        break;
                    }
                case 38:
                    i3 = a0.y((List) unsafe.getObject(obj, Q3));
                    if (i3 <= 0) {
                        break;
                    } else {
                        if (this.f3567i) {
                            unsafe.putInt(obj, i6, i3);
                        }
                        P3 = AbstractC0323i.P(P4);
                        R3 = AbstractC0323i.R(i3);
                        h3 = P3 + R3 + i3;
                        i4 += h3;
                        break;
                    }
                case 39:
                    i3 = a0.l((List) unsafe.getObject(obj, Q3));
                    if (i3 <= 0) {
                        break;
                    } else {
                        if (this.f3567i) {
                            unsafe.putInt(obj, i6, i3);
                        }
                        P3 = AbstractC0323i.P(P4);
                        R3 = AbstractC0323i.R(i3);
                        h3 = P3 + R3 + i3;
                        i4 += h3;
                        break;
                    }
                case 40:
                    i3 = a0.i((List) unsafe.getObject(obj, Q3));
                    if (i3 <= 0) {
                        break;
                    } else {
                        if (this.f3567i) {
                            unsafe.putInt(obj, i6, i3);
                        }
                        P3 = AbstractC0323i.P(P4);
                        R3 = AbstractC0323i.R(i3);
                        h3 = P3 + R3 + i3;
                        i4 += h3;
                        break;
                    }
                case 41:
                    i3 = a0.g((List) unsafe.getObject(obj, Q3));
                    if (i3 <= 0) {
                        break;
                    } else {
                        if (this.f3567i) {
                            unsafe.putInt(obj, i6, i3);
                        }
                        P3 = AbstractC0323i.P(P4);
                        R3 = AbstractC0323i.R(i3);
                        h3 = P3 + R3 + i3;
                        i4 += h3;
                        break;
                    }
                case 42:
                    i3 = a0.b((List) unsafe.getObject(obj, Q3));
                    if (i3 <= 0) {
                        break;
                    } else {
                        if (this.f3567i) {
                            unsafe.putInt(obj, i6, i3);
                        }
                        P3 = AbstractC0323i.P(P4);
                        R3 = AbstractC0323i.R(i3);
                        h3 = P3 + R3 + i3;
                        i4 += h3;
                        break;
                    }
                case 43:
                    i3 = a0.w((List) unsafe.getObject(obj, Q3));
                    if (i3 <= 0) {
                        break;
                    } else {
                        if (this.f3567i) {
                            unsafe.putInt(obj, i6, i3);
                        }
                        P3 = AbstractC0323i.P(P4);
                        R3 = AbstractC0323i.R(i3);
                        h3 = P3 + R3 + i3;
                        i4 += h3;
                        break;
                    }
                case 44:
                    i3 = a0.e((List) unsafe.getObject(obj, Q3));
                    if (i3 <= 0) {
                        break;
                    } else {
                        if (this.f3567i) {
                            unsafe.putInt(obj, i6, i3);
                        }
                        P3 = AbstractC0323i.P(P4);
                        R3 = AbstractC0323i.R(i3);
                        h3 = P3 + R3 + i3;
                        i4 += h3;
                        break;
                    }
                case 45:
                    i3 = a0.g((List) unsafe.getObject(obj, Q3));
                    if (i3 <= 0) {
                        break;
                    } else {
                        if (this.f3567i) {
                            unsafe.putInt(obj, i6, i3);
                        }
                        P3 = AbstractC0323i.P(P4);
                        R3 = AbstractC0323i.R(i3);
                        h3 = P3 + R3 + i3;
                        i4 += h3;
                        break;
                    }
                case 46:
                    i3 = a0.i((List) unsafe.getObject(obj, Q3));
                    if (i3 <= 0) {
                        break;
                    } else {
                        if (this.f3567i) {
                            unsafe.putInt(obj, i6, i3);
                        }
                        P3 = AbstractC0323i.P(P4);
                        R3 = AbstractC0323i.R(i3);
                        h3 = P3 + R3 + i3;
                        i4 += h3;
                        break;
                    }
                case 47:
                    i3 = a0.r((List) unsafe.getObject(obj, Q3));
                    if (i3 <= 0) {
                        break;
                    } else {
                        if (this.f3567i) {
                            unsafe.putInt(obj, i6, i3);
                        }
                        P3 = AbstractC0323i.P(P4);
                        R3 = AbstractC0323i.R(i3);
                        h3 = P3 + R3 + i3;
                        i4 += h3;
                        break;
                    }
                case 48:
                    i3 = a0.t((List) unsafe.getObject(obj, Q3));
                    if (i3 <= 0) {
                        break;
                    } else {
                        if (this.f3567i) {
                            unsafe.putInt(obj, i6, i3);
                        }
                        P3 = AbstractC0323i.P(P4);
                        R3 = AbstractC0323i.R(i3);
                        h3 = P3 + R3 + i3;
                        i4 += h3;
                        break;
                    }
                case 49:
                    h3 = a0.j(P4, F(obj, Q3), r(i5));
                    i4 += h3;
                    break;
                case 50:
                    h3 = this.f3575q.d(P4, j0.A(obj, Q3), q(i5));
                    i4 += h3;
                    break;
                case 51:
                    if (D(obj, P4, i5)) {
                        h3 = AbstractC0323i.h(P4, 0.0d);
                        i4 += h3;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (D(obj, P4, i5)) {
                        h3 = AbstractC0323i.p(P4, 0.0f);
                        i4 += h3;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (D(obj, P4, i5)) {
                        h3 = AbstractC0323i.w(P4, V(obj, Q3));
                        i4 += h3;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (D(obj, P4, i5)) {
                        h3 = AbstractC0323i.S(P4, V(obj, Q3));
                        i4 += h3;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (D(obj, P4, i5)) {
                        h3 = AbstractC0323i.u(P4, U(obj, Q3));
                        i4 += h3;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (D(obj, P4, i5)) {
                        h3 = AbstractC0323i.n(P4, 0L);
                        i4 += h3;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (D(obj, P4, i5)) {
                        h3 = AbstractC0323i.l(P4, 0);
                        i4 += h3;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (D(obj, P4, i5)) {
                        h3 = AbstractC0323i.c(P4, true);
                        i4 += h3;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (D(obj, P4, i5)) {
                        Object A4 = j0.A(obj, Q3);
                        h3 = A4 instanceof AbstractC0320f ? AbstractC0323i.f(P4, (AbstractC0320f) A4) : AbstractC0323i.N(P4, (String) A4);
                        i4 += h3;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (D(obj, P4, i5)) {
                        h3 = a0.o(P4, j0.A(obj, Q3), r(i5));
                        i4 += h3;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (D(obj, P4, i5)) {
                        h3 = AbstractC0323i.f(P4, (AbstractC0320f) j0.A(obj, Q3));
                        i4 += h3;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (D(obj, P4, i5)) {
                        h3 = AbstractC0323i.Q(P4, U(obj, Q3));
                        i4 += h3;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (D(obj, P4, i5)) {
                        h3 = AbstractC0323i.j(P4, U(obj, Q3));
                        i4 += h3;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (D(obj, P4, i5)) {
                        h3 = AbstractC0323i.F(P4, 0);
                        i4 += h3;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (D(obj, P4, i5)) {
                        h3 = AbstractC0323i.H(P4, 0L);
                        i4 += h3;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (D(obj, P4, i5)) {
                        h3 = AbstractC0323i.J(P4, U(obj, Q3));
                        i4 += h3;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (D(obj, P4, i5)) {
                        h3 = AbstractC0323i.L(P4, V(obj, Q3));
                        i4 += h3;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (D(obj, P4, i5)) {
                        h3 = AbstractC0323i.r(P4, (J) j0.A(obj, Q3), r(i5));
                        i4 += h3;
                        break;
                    } else {
                        break;
                    }
            }
        }
        return i4 + u(this.f3573o, obj);
    }

    public final int u(f0 f0Var, Object obj) {
        return f0Var.h(f0Var.g(obj));
    }

    public final boolean x(Object obj, int i3) {
        if (!this.f3566h) {
            int X2 = X(i3);
            return (j0.x(obj, (long) (X2 & 1048575)) & (1 << (X2 >>> 20))) != 0;
        }
        int h02 = h0(i3);
        long Q3 = Q(h02);
        switch (g0(h02)) {
            case 0:
                return j0.v(obj, Q3) != 0.0d;
            case 1:
                return j0.w(obj, Q3) != 0.0f;
            case 2:
                return j0.y(obj, Q3) != 0;
            case 3:
                return j0.y(obj, Q3) != 0;
            case 4:
                return j0.x(obj, Q3) != 0;
            case 5:
                return j0.y(obj, Q3) != 0;
            case 6:
                return j0.x(obj, Q3) != 0;
            case 7:
                return j0.p(obj, Q3);
            case 8:
                Object A3 = j0.A(obj, Q3);
                if (A3 instanceof String) {
                    return !((String) A3).isEmpty();
                }
                if (A3 instanceof AbstractC0320f) {
                    return !AbstractC0320f.f3626f.equals(A3);
                }
                throw new IllegalArgumentException();
            case 9:
                return j0.A(obj, Q3) != null;
            case 10:
                return !AbstractC0320f.f3626f.equals(j0.A(obj, Q3));
            case 11:
                return j0.x(obj, Q3) != 0;
            case 12:
                return j0.x(obj, Q3) != 0;
            case 13:
                return j0.x(obj, Q3) != 0;
            case 14:
                return j0.y(obj, Q3) != 0;
            case 15:
                return j0.x(obj, Q3) != 0;
            case 16:
                return j0.y(obj, Q3) != 0;
            case 17:
                return j0.A(obj, Q3) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    public final boolean y(Object obj, int i3, int i4, int i5) {
        return this.f3566h ? x(obj, i3) : (i4 & i5) != 0;
    }
}
