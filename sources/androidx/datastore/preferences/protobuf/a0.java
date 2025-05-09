package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC0334u;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public abstract class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f3595a = A();

    /* renamed from: b, reason: collision with root package name */
    public static final f0 f3596b = B(false);

    /* renamed from: c, reason: collision with root package name */
    public static final f0 f3597c = B(true);

    /* renamed from: d, reason: collision with root package name */
    public static final f0 f3598d = new h0();

    public static Class A() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static f0 B(boolean z3) {
        try {
            Class C3 = C();
            if (C3 == null) {
                return null;
            }
            return (f0) C3.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z3));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class C() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void D(AbstractC0328n abstractC0328n, Object obj, Object obj2) {
        C0331q c3 = abstractC0328n.c(obj2);
        if (c3.j()) {
            return;
        }
        abstractC0328n.d(obj).p(c3);
    }

    public static void E(E e3, Object obj, Object obj2, long j3) {
        j0.O(obj, j3, e3.a(j0.A(obj, j3), j0.A(obj2, j3)));
    }

    public static void F(f0 f0Var, Object obj, Object obj2) {
        f0Var.p(obj, f0Var.k(f0Var.g(obj), f0Var.g(obj2)));
    }

    public static f0 G() {
        return f3596b;
    }

    public static f0 H() {
        return f3597c;
    }

    public static void I(Class cls) {
        Class cls2;
        if (!AbstractC0333t.class.isAssignableFrom(cls) && (cls2 = f3595a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static boolean J(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static Object K(int i3, int i4, Object obj, f0 f0Var) {
        if (obj == null) {
            obj = f0Var.n();
        }
        f0Var.e(obj, i3, i4);
        return obj;
    }

    public static f0 L() {
        return f3598d;
    }

    public static void M(int i3, List list, m0 m0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m0Var.I(i3, list, z3);
    }

    public static void N(int i3, List list, m0 m0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m0Var.F(i3, list);
    }

    public static void O(int i3, List list, m0 m0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m0Var.B(i3, list, z3);
    }

    public static void P(int i3, List list, m0 m0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m0Var.z(i3, list, z3);
    }

    public static void Q(int i3, List list, m0 m0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m0Var.G(i3, list, z3);
    }

    public static void R(int i3, List list, m0 m0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m0Var.u(i3, list, z3);
    }

    public static void S(int i3, List list, m0 m0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m0Var.b(i3, list, z3);
    }

    public static void T(int i3, List list, m0 m0Var, Y y3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m0Var.K(i3, list, y3);
    }

    public static void U(int i3, List list, m0 m0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m0Var.a(i3, list, z3);
    }

    public static void V(int i3, List list, m0 m0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m0Var.x(i3, list, z3);
    }

    public static void W(int i3, List list, m0 m0Var, Y y3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m0Var.J(i3, list, y3);
    }

    public static void X(int i3, List list, m0 m0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m0Var.v(i3, list, z3);
    }

    public static void Y(int i3, List list, m0 m0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m0Var.D(i3, list, z3);
    }

    public static void Z(int i3, List list, m0 m0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m0Var.s(i3, list, z3);
    }

    public static int a(int i3, List list, boolean z3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z3 ? AbstractC0323i.P(i3) + AbstractC0323i.y(size) : size * AbstractC0323i.c(i3, true);
    }

    public static void a0(int i3, List list, m0 m0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m0Var.e(i3, list, z3);
    }

    public static int b(List list) {
        return list.size();
    }

    public static void b0(int i3, List list, m0 m0Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m0Var.m(i3, list);
    }

    public static int c(int i3, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int P3 = size * AbstractC0323i.P(i3);
        for (int i4 = 0; i4 < list.size(); i4++) {
            P3 += AbstractC0323i.g((AbstractC0320f) list.get(i4));
        }
        return P3;
    }

    public static void c0(int i3, List list, m0 m0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m0Var.c(i3, list, z3);
    }

    public static int d(int i3, List list, boolean z3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e3 = e(list);
        return z3 ? AbstractC0323i.P(i3) + AbstractC0323i.y(e3) : e3 + (size * AbstractC0323i.P(i3));
    }

    public static void d0(int i3, List list, m0 m0Var, boolean z3) {
        if (list == null || list.isEmpty()) {
            return;
        }
        m0Var.H(i3, list, z3);
    }

    public static int e(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += AbstractC0323i.k(((Integer) list.get(i4)).intValue());
        }
        return i3;
    }

    public static int f(int i3, List list, boolean z3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z3 ? AbstractC0323i.P(i3) + AbstractC0323i.y(size * 4) : size * AbstractC0323i.l(i3, 0);
    }

    public static int g(List list) {
        return list.size() * 4;
    }

    public static int h(int i3, List list, boolean z3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z3 ? AbstractC0323i.P(i3) + AbstractC0323i.y(size * 8) : size * AbstractC0323i.n(i3, 0L);
    }

    public static int i(List list) {
        return list.size() * 8;
    }

    public static int j(int i3, List list, Y y3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 += AbstractC0323i.r(i3, (J) list.get(i5), y3);
        }
        return i4;
    }

    public static int k(int i3, List list, boolean z3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int l3 = l(list);
        return z3 ? AbstractC0323i.P(i3) + AbstractC0323i.y(l3) : l3 + (size * AbstractC0323i.P(i3));
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += AbstractC0323i.v(((Integer) list.get(i4)).intValue());
        }
        return i3;
    }

    public static int m(int i3, List list, boolean z3) {
        if (list.size() == 0) {
            return 0;
        }
        int n3 = n(list);
        return z3 ? AbstractC0323i.P(i3) + AbstractC0323i.y(n3) : n3 + (list.size() * AbstractC0323i.P(i3));
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += AbstractC0323i.x(((Long) list.get(i4)).longValue());
        }
        return i3;
    }

    public static int o(int i3, Object obj, Y y3) {
        return AbstractC0323i.z(i3, (J) obj, y3);
    }

    public static int p(int i3, List list, Y y3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int P3 = AbstractC0323i.P(i3) * size;
        for (int i4 = 0; i4 < size; i4++) {
            P3 += AbstractC0323i.B((J) list.get(i4), y3);
        }
        return P3;
    }

    public static int q(int i3, List list, boolean z3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int r3 = r(list);
        return z3 ? AbstractC0323i.P(i3) + AbstractC0323i.y(r3) : r3 + (size * AbstractC0323i.P(i3));
    }

    public static int r(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += AbstractC0323i.K(((Integer) list.get(i4)).intValue());
        }
        return i3;
    }

    public static int s(int i3, List list, boolean z3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int t3 = t(list);
        return z3 ? AbstractC0323i.P(i3) + AbstractC0323i.y(t3) : t3 + (size * AbstractC0323i.P(i3));
    }

    public static int t(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += AbstractC0323i.M(((Long) list.get(i4)).longValue());
        }
        return i3;
    }

    public static int u(int i3, List list) {
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int P3 = AbstractC0323i.P(i3) * size;
        if (!(list instanceof InterfaceC0339z)) {
            while (i4 < size) {
                Object obj = list.get(i4);
                P3 += obj instanceof AbstractC0320f ? AbstractC0323i.g((AbstractC0320f) obj) : AbstractC0323i.O((String) obj);
                i4++;
            }
            return P3;
        }
        InterfaceC0339z interfaceC0339z = (InterfaceC0339z) list;
        while (i4 < size) {
            Object c3 = interfaceC0339z.c(i4);
            P3 += c3 instanceof AbstractC0320f ? AbstractC0323i.g((AbstractC0320f) c3) : AbstractC0323i.O((String) c3);
            i4++;
        }
        return P3;
    }

    public static int v(int i3, List list, boolean z3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int w3 = w(list);
        return z3 ? AbstractC0323i.P(i3) + AbstractC0323i.y(w3) : w3 + (size * AbstractC0323i.P(i3));
    }

    public static int w(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += AbstractC0323i.R(((Integer) list.get(i4)).intValue());
        }
        return i3;
    }

    public static int x(int i3, List list, boolean z3) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y3 = y(list);
        return z3 ? AbstractC0323i.P(i3) + AbstractC0323i.y(y3) : y3 + (size * AbstractC0323i.P(i3));
    }

    public static int y(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += AbstractC0323i.T(((Long) list.get(i4)).longValue());
        }
        return i3;
    }

    public static Object z(int i3, List list, AbstractC0334u.a aVar, Object obj, f0 f0Var) {
        if (aVar == null) {
            return obj;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                if (!aVar.a(intValue)) {
                    obj = K(i3, intValue, obj, f0Var);
                    it.remove();
                }
            }
            return obj;
        }
        int size = list.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            Integer num = (Integer) list.get(i5);
            int intValue2 = num.intValue();
            if (aVar.a(intValue2)) {
                if (i5 != i4) {
                    list.set(i4, num);
                }
                i4++;
            } else {
                obj = K(i3, intValue2, obj, f0Var);
            }
        }
        if (i4 != size) {
            list.subList(i4, size).clear();
        }
        return obj;
    }
}
