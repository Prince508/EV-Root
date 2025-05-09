package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC0434z;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public abstract class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f5789a = A();

    /* renamed from: b, reason: collision with root package name */
    public static final k0 f5790b = B(false);

    /* renamed from: c, reason: collision with root package name */
    public static final k0 f5791c = B(true);

    /* renamed from: d, reason: collision with root package name */
    public static final k0 f5792d = new m0();

    public static Class A() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static k0 B(boolean z3) {
        try {
            Class C3 = C();
            if (C3 == null) {
                return null;
            }
            return (k0) C3.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z3));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class C() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void D(AbstractC0426q abstractC0426q, Object obj, Object obj2) {
        AbstractC0428t c3 = abstractC0426q.c(obj2);
        if (c3.d()) {
            return;
        }
        abstractC0426q.d(obj).h(c3);
    }

    public static void E(J j3, Object obj, Object obj2, long j4) {
        o0.R(obj, j4, j3.a(o0.C(obj, j4), o0.C(obj2, j4)));
    }

    public static void F(k0 k0Var, Object obj, Object obj2) {
        k0Var.p(obj, k0Var.k(k0Var.g(obj), k0Var.g(obj2)));
    }

    public static k0 G() {
        return f5790b;
    }

    public static k0 H() {
        return f5791c;
    }

    public static void I(Class cls) {
        Class cls2;
        if (!AbstractC0432x.class.isAssignableFrom(cls) && (cls2 = f5789a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
    }

    public static boolean J(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static Object K(Object obj, int i3, int i4, Object obj2, k0 k0Var) {
        if (obj2 == null) {
            obj2 = k0Var.f(obj);
        }
        k0Var.e(obj2, i3, i4);
        return obj2;
    }

    public static k0 L() {
        return f5792d;
    }

    public static void M(int i3, List list, r0 r0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0Var.I(i3, list, z3);
    }

    public static void N(int i3, List list, r0 r0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0Var.F(i3, list);
    }

    public static void O(int i3, List list, r0 r0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0Var.B(i3, list, z3);
    }

    public static void P(int i3, List list, r0 r0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0Var.z(i3, list, z3);
    }

    public static void Q(int i3, List list, r0 r0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0Var.G(i3, list, z3);
    }

    public static void R(int i3, List list, r0 r0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0Var.u(i3, list, z3);
    }

    public static void S(int i3, List list, r0 r0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0Var.b(i3, list, z3);
    }

    public static void T(int i3, List list, r0 r0Var, e0 e0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0Var.K(i3, list, e0Var);
    }

    public static void U(int i3, List list, r0 r0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0Var.a(i3, list, z3);
    }

    public static void V(int i3, List list, r0 r0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0Var.x(i3, list, z3);
    }

    public static void W(int i3, List list, r0 r0Var, e0 e0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0Var.M(i3, list, e0Var);
    }

    public static void X(int i3, List list, r0 r0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0Var.v(i3, list, z3);
    }

    public static void Y(int i3, List list, r0 r0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0Var.D(i3, list, z3);
    }

    public static void Z(int i3, List list, r0 r0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0Var.s(i3, list, z3);
    }

    public static int a(int i3, List list, boolean z3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z3 ? AbstractC0420k.L(i3) + AbstractC0420k.x(size) : size * AbstractC0420k.d(i3, true);
    }

    public static void a0(int i3, List list, r0 r0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0Var.e(i3, list, z3);
    }

    public static int b(List list) {
        return list.size();
    }

    public static void b0(int i3, List list, r0 r0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0Var.m(i3, list);
    }

    public static int c(int i3, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int L3 = size * AbstractC0420k.L(i3);
        for (int i4 = 0; i4 < list.size(); i4++) {
            L3 += AbstractC0420k.g((AbstractC0417h) list.get(i4));
        }
        return L3;
    }

    public static void c0(int i3, List list, r0 r0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0Var.c(i3, list, z3);
    }

    public static int d(int i3, List list, boolean z3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e3 = e(list);
        return z3 ? AbstractC0420k.L(i3) + AbstractC0420k.x(e3) : e3 + (size * AbstractC0420k.L(i3));
    }

    public static void d0(int i3, List list, r0 r0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        r0Var.H(i3, list, z3);
    }

    public static int e(List list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof AbstractC0433y)) {
            int i4 = 0;
            while (i3 < size) {
                i4 += AbstractC0420k.k(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return i4;
        }
        AbstractC0433y abstractC0433y = (AbstractC0433y) list;
        int i5 = 0;
        while (i3 < size) {
            i5 += AbstractC0420k.k(abstractC0433y.k(i3));
            i3++;
        }
        return i5;
    }

    public static int f(int i3, List list, boolean z3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z3 ? AbstractC0420k.L(i3) + AbstractC0420k.x(size * 4) : size * AbstractC0420k.l(i3, 0);
    }

    public static int g(List list) {
        return list.size() * 4;
    }

    public static int h(int i3, List list, boolean z3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z3 ? AbstractC0420k.L(i3) + AbstractC0420k.x(size * 8) : size * AbstractC0420k.n(i3, 0L);
    }

    public static int i(List list) {
        return list.size() * 8;
    }

    public static int j(int i3, List list, e0 e0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 += AbstractC0420k.r(i3, (O) list.get(i5), e0Var);
        }
        return i4;
    }

    public static int k(int i3, List list, boolean z3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int l3 = l(list);
        return z3 ? AbstractC0420k.L(i3) + AbstractC0420k.x(l3) : l3 + (size * AbstractC0420k.L(i3));
    }

    public static int l(List list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof AbstractC0433y)) {
            int i4 = 0;
            while (i3 < size) {
                i4 += AbstractC0420k.u(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return i4;
        }
        AbstractC0433y abstractC0433y = (AbstractC0433y) list;
        int i5 = 0;
        while (i3 < size) {
            i5 += AbstractC0420k.u(abstractC0433y.k(i3));
            i3++;
        }
        return i5;
    }

    public static int m(int i3, List list, boolean z3) {
        if (list.size() == 0) {
            return 0;
        }
        int n3 = n(list);
        return z3 ? AbstractC0420k.L(i3) + AbstractC0420k.x(n3) : n3 + (list.size() * AbstractC0420k.L(i3));
    }

    public static int n(List list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof F)) {
            int i4 = 0;
            while (i3 < size) {
                i4 += AbstractC0420k.w(((Long) list.get(i3)).longValue());
                i3++;
            }
            return i4;
        }
        F f3 = (F) list;
        int i5 = 0;
        while (i3 < size) {
            i5 += AbstractC0420k.w(f3.k(i3));
            i3++;
        }
        return i5;
    }

    public static int o(int i3, Object obj, e0 e0Var) {
        return AbstractC0420k.y(i3, (O) obj, e0Var);
    }

    public static int p(int i3, List list, e0 e0Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int L3 = AbstractC0420k.L(i3) * size;
        for (int i4 = 0; i4 < size; i4++) {
            L3 += AbstractC0420k.z((O) list.get(i4), e0Var);
        }
        return L3;
    }

    public static int q(int i3, List list, boolean z3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int r3 = r(list);
        return z3 ? AbstractC0420k.L(i3) + AbstractC0420k.x(r3) : r3 + (size * AbstractC0420k.L(i3));
    }

    public static int r(List list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof AbstractC0433y)) {
            int i4 = 0;
            while (i3 < size) {
                i4 += AbstractC0420k.G(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return i4;
        }
        AbstractC0433y abstractC0433y = (AbstractC0433y) list;
        int i5 = 0;
        while (i3 < size) {
            i5 += AbstractC0420k.G(abstractC0433y.k(i3));
            i3++;
        }
        return i5;
    }

    public static int s(int i3, List list, boolean z3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int t3 = t(list);
        return z3 ? AbstractC0420k.L(i3) + AbstractC0420k.x(t3) : t3 + (size * AbstractC0420k.L(i3));
    }

    public static int t(List list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof F)) {
            int i4 = 0;
            while (i3 < size) {
                i4 += AbstractC0420k.I(((Long) list.get(i3)).longValue());
                i3++;
            }
            return i4;
        }
        F f3 = (F) list;
        int i5 = 0;
        while (i3 < size) {
            i5 += AbstractC0420k.I(f3.k(i3));
            i3++;
        }
        return i5;
    }

    public static int u(int i3, List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int L3 = AbstractC0420k.L(i3) * size;
        if (!(list instanceof D)) {
            while (i4 < size) {
                Object obj = list.get(i4);
                L3 += obj instanceof AbstractC0417h ? AbstractC0420k.g((AbstractC0417h) obj) : AbstractC0420k.K((String) obj);
                i4++;
            }
            return L3;
        }
        D d3 = (D) list;
        while (i4 < size) {
            Object c3 = d3.c(i4);
            L3 += c3 instanceof AbstractC0417h ? AbstractC0420k.g((AbstractC0417h) c3) : AbstractC0420k.K((String) c3);
            i4++;
        }
        return L3;
    }

    public static int v(int i3, List list, boolean z3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int w3 = w(list);
        return z3 ? AbstractC0420k.L(i3) + AbstractC0420k.x(w3) : w3 + (size * AbstractC0420k.L(i3));
    }

    public static int w(List list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof AbstractC0433y)) {
            int i4 = 0;
            while (i3 < size) {
                i4 += AbstractC0420k.N(((Integer) list.get(i3)).intValue());
                i3++;
            }
            return i4;
        }
        AbstractC0433y abstractC0433y = (AbstractC0433y) list;
        int i5 = 0;
        while (i3 < size) {
            i5 += AbstractC0420k.N(abstractC0433y.k(i3));
            i3++;
        }
        return i5;
    }

    public static int x(int i3, List list, boolean z3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y3 = y(list);
        return z3 ? AbstractC0420k.L(i3) + AbstractC0420k.x(y3) : y3 + (size * AbstractC0420k.L(i3));
    }

    public static int y(List list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof F)) {
            int i4 = 0;
            while (i3 < size) {
                i4 += AbstractC0420k.P(((Long) list.get(i3)).longValue());
                i3++;
            }
            return i4;
        }
        F f3 = (F) list;
        int i5 = 0;
        while (i3 < size) {
            i5 += AbstractC0420k.P(f3.k(i3));
            i3++;
        }
        return i5;
    }

    public static Object z(Object obj, int i3, List list, AbstractC0434z.c cVar, Object obj2, k0 k0Var) {
        if (cVar == null) {
            return obj2;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                if (!cVar.a(intValue)) {
                    obj2 = K(obj, i3, intValue, obj2, k0Var);
                    it.remove();
                }
            }
            return obj2;
        }
        int size = list.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            Integer num = (Integer) list.get(i5);
            int intValue2 = num.intValue();
            if (cVar.a(intValue2)) {
                if (i5 != i4) {
                    list.set(i4, num);
                }
                i4++;
            } else {
                obj2 = K(obj, i3, intValue2, obj2, k0Var);
            }
        }
        if (i4 != size) {
            list.subList(i4, size).clear();
        }
        return obj2;
    }
}
