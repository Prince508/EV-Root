package o;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* loaded from: classes.dex */
public class g {

    /* renamed from: h, reason: collision with root package name */
    public static Object[] f8755h;

    /* renamed from: i, reason: collision with root package name */
    public static int f8756i;

    /* renamed from: j, reason: collision with root package name */
    public static Object[] f8757j;

    /* renamed from: k, reason: collision with root package name */
    public static int f8758k;

    /* renamed from: e, reason: collision with root package name */
    public int[] f8759e;

    /* renamed from: f, reason: collision with root package name */
    public Object[] f8760f;

    /* renamed from: g, reason: collision with root package name */
    public int f8761g;

    public g() {
        this.f8759e = c.f8724a;
        this.f8760f = c.f8726c;
        this.f8761g = 0;
    }

    public static int b(int[] iArr, int i3, int i4) {
        try {
            return c.a(iArr, i3, i4);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static void d(int[] iArr, Object[] objArr, int i3) {
        if (iArr.length == 8) {
            synchronized (g.class) {
                try {
                    if (f8758k < 10) {
                        objArr[0] = f8757j;
                        objArr[1] = iArr;
                        for (int i4 = (i3 << 1) - 1; i4 >= 2; i4--) {
                            objArr[i4] = null;
                        }
                        f8757j = objArr;
                        f8758k++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (g.class) {
                try {
                    if (f8756i < 10) {
                        objArr[0] = f8755h;
                        objArr[1] = iArr;
                        for (int i5 = (i3 << 1) - 1; i5 >= 2; i5--) {
                            objArr[i5] = null;
                        }
                        f8755h = objArr;
                        f8756i++;
                    }
                } finally {
                }
            }
        }
    }

    public final void a(int i3) {
        if (i3 == 8) {
            synchronized (g.class) {
                try {
                    Object[] objArr = f8757j;
                    if (objArr != null) {
                        this.f8760f = objArr;
                        f8757j = (Object[]) objArr[0];
                        this.f8759e = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f8758k--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i3 == 4) {
            synchronized (g.class) {
                try {
                    Object[] objArr2 = f8755h;
                    if (objArr2 != null) {
                        this.f8760f = objArr2;
                        f8755h = (Object[]) objArr2[0];
                        this.f8759e = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f8756i--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f8759e = new int[i3];
        this.f8760f = new Object[i3 << 1];
    }

    public void c(int i3) {
        int i4 = this.f8761g;
        int[] iArr = this.f8759e;
        if (iArr.length < i3) {
            Object[] objArr = this.f8760f;
            a(i3);
            if (this.f8761g > 0) {
                System.arraycopy(iArr, 0, this.f8759e, 0, i4);
                System.arraycopy(objArr, 0, this.f8760f, 0, i4 << 1);
            }
            d(iArr, objArr, i4);
        }
        if (this.f8761g != i4) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i3 = this.f8761g;
        if (i3 > 0) {
            int[] iArr = this.f8759e;
            Object[] objArr = this.f8760f;
            this.f8759e = c.f8724a;
            this.f8760f = c.f8726c;
            this.f8761g = 0;
            d(iArr, objArr, i3);
        }
        if (this.f8761g > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return f(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return h(obj) >= 0;
    }

    public int e(Object obj, int i3) {
        int i4 = this.f8761g;
        if (i4 == 0) {
            return -1;
        }
        int b3 = b(this.f8759e, i4, i3);
        if (b3 < 0 || obj.equals(this.f8760f[b3 << 1])) {
            return b3;
        }
        int i5 = b3 + 1;
        while (i5 < i4 && this.f8759e[i5] == i3) {
            if (obj.equals(this.f8760f[i5 << 1])) {
                return i5;
            }
            i5++;
        }
        for (int i6 = b3 - 1; i6 >= 0 && this.f8759e[i6] == i3; i6--) {
            if (obj.equals(this.f8760f[i6 << 1])) {
                return i6;
            }
        }
        return ~i5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (size() != gVar.size()) {
                return false;
            }
            for (int i3 = 0; i3 < this.f8761g; i3++) {
                try {
                    Object i4 = i(i3);
                    Object m3 = m(i3);
                    Object obj2 = gVar.get(i4);
                    if (m3 == null) {
                        if (obj2 != null || !gVar.containsKey(i4)) {
                            return false;
                        }
                    } else if (!m3.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i5 = 0; i5 < this.f8761g; i5++) {
                try {
                    Object i6 = i(i5);
                    Object m4 = m(i5);
                    Object obj3 = map.get(i6);
                    if (m4 == null) {
                        if (obj3 != null || !map.containsKey(i6)) {
                            return false;
                        }
                    } else if (!m4.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public int f(Object obj) {
        return obj == null ? g() : e(obj, obj.hashCode());
    }

    public int g() {
        int i3 = this.f8761g;
        if (i3 == 0) {
            return -1;
        }
        int b3 = b(this.f8759e, i3, 0);
        if (b3 < 0 || this.f8760f[b3 << 1] == null) {
            return b3;
        }
        int i4 = b3 + 1;
        while (i4 < i3 && this.f8759e[i4] == 0) {
            if (this.f8760f[i4 << 1] == null) {
                return i4;
            }
            i4++;
        }
        for (int i5 = b3 - 1; i5 >= 0 && this.f8759e[i5] == 0; i5--) {
            if (this.f8760f[i5 << 1] == null) {
                return i5;
            }
        }
        return ~i4;
    }

    public Object get(Object obj) {
        return getOrDefault(obj, null);
    }

    public Object getOrDefault(Object obj, Object obj2) {
        int f3 = f(obj);
        return f3 >= 0 ? this.f8760f[(f3 << 1) + 1] : obj2;
    }

    public int h(Object obj) {
        int i3 = this.f8761g * 2;
        Object[] objArr = this.f8760f;
        if (obj == null) {
            for (int i4 = 1; i4 < i3; i4 += 2) {
                if (objArr[i4] == null) {
                    return i4 >> 1;
                }
            }
            return -1;
        }
        for (int i5 = 1; i5 < i3; i5 += 2) {
            if (obj.equals(objArr[i5])) {
                return i5 >> 1;
            }
        }
        return -1;
    }

    public int hashCode() {
        int[] iArr = this.f8759e;
        Object[] objArr = this.f8760f;
        int i3 = this.f8761g;
        int i4 = 1;
        int i5 = 0;
        int i6 = 0;
        while (i5 < i3) {
            Object obj = objArr[i4];
            i6 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i5];
            i5++;
            i4 += 2;
        }
        return i6;
    }

    public Object i(int i3) {
        return this.f8760f[i3 << 1];
    }

    public boolean isEmpty() {
        return this.f8761g <= 0;
    }

    public void j(g gVar) {
        int i3 = gVar.f8761g;
        c(this.f8761g + i3);
        if (this.f8761g != 0) {
            for (int i4 = 0; i4 < i3; i4++) {
                put(gVar.i(i4), gVar.m(i4));
            }
        } else if (i3 > 0) {
            System.arraycopy(gVar.f8759e, 0, this.f8759e, 0, i3);
            System.arraycopy(gVar.f8760f, 0, this.f8760f, 0, i3 << 1);
            this.f8761g = i3;
        }
    }

    public Object k(int i3) {
        Object[] objArr = this.f8760f;
        int i4 = i3 << 1;
        Object obj = objArr[i4 + 1];
        int i5 = this.f8761g;
        int i6 = 0;
        if (i5 <= 1) {
            d(this.f8759e, objArr, i5);
            this.f8759e = c.f8724a;
            this.f8760f = c.f8726c;
        } else {
            int i7 = i5 - 1;
            int[] iArr = this.f8759e;
            if (iArr.length <= 8 || i5 >= iArr.length / 3) {
                if (i3 < i7) {
                    int i8 = i3 + 1;
                    int i9 = i7 - i3;
                    System.arraycopy(iArr, i8, iArr, i3, i9);
                    Object[] objArr2 = this.f8760f;
                    System.arraycopy(objArr2, i8 << 1, objArr2, i4, i9 << 1);
                }
                Object[] objArr3 = this.f8760f;
                int i10 = i7 << 1;
                objArr3[i10] = null;
                objArr3[i10 + 1] = null;
            } else {
                a(i5 > 8 ? i5 + (i5 >> 1) : 8);
                if (i5 != this.f8761g) {
                    throw new ConcurrentModificationException();
                }
                if (i3 > 0) {
                    System.arraycopy(iArr, 0, this.f8759e, 0, i3);
                    System.arraycopy(objArr, 0, this.f8760f, 0, i4);
                }
                if (i3 < i7) {
                    int i11 = i3 + 1;
                    int i12 = i7 - i3;
                    System.arraycopy(iArr, i11, this.f8759e, i3, i12);
                    System.arraycopy(objArr, i11 << 1, this.f8760f, i4, i12 << 1);
                }
            }
            i6 = i7;
        }
        if (i5 != this.f8761g) {
            throw new ConcurrentModificationException();
        }
        this.f8761g = i6;
        return obj;
    }

    public Object l(int i3, Object obj) {
        int i4 = (i3 << 1) + 1;
        Object[] objArr = this.f8760f;
        Object obj2 = objArr[i4];
        objArr[i4] = obj;
        return obj2;
    }

    public Object m(int i3) {
        return this.f8760f[(i3 << 1) + 1];
    }

    public Object put(Object obj, Object obj2) {
        int i3;
        int e3;
        int i4 = this.f8761g;
        if (obj == null) {
            e3 = g();
            i3 = 0;
        } else {
            int hashCode = obj.hashCode();
            i3 = hashCode;
            e3 = e(obj, hashCode);
        }
        if (e3 >= 0) {
            int i5 = (e3 << 1) + 1;
            Object[] objArr = this.f8760f;
            Object obj3 = objArr[i5];
            objArr[i5] = obj2;
            return obj3;
        }
        int i6 = ~e3;
        int[] iArr = this.f8759e;
        if (i4 >= iArr.length) {
            int i7 = 8;
            if (i4 >= 8) {
                i7 = (i4 >> 1) + i4;
            } else if (i4 < 4) {
                i7 = 4;
            }
            Object[] objArr2 = this.f8760f;
            a(i7);
            if (i4 != this.f8761g) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f8759e;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f8760f, 0, objArr2.length);
            }
            d(iArr, objArr2, i4);
        }
        if (i6 < i4) {
            int[] iArr3 = this.f8759e;
            int i8 = i6 + 1;
            System.arraycopy(iArr3, i6, iArr3, i8, i4 - i6);
            Object[] objArr3 = this.f8760f;
            System.arraycopy(objArr3, i6 << 1, objArr3, i8 << 1, (this.f8761g - i6) << 1);
        }
        int i9 = this.f8761g;
        if (i4 == i9) {
            int[] iArr4 = this.f8759e;
            if (i6 < iArr4.length) {
                iArr4[i6] = i3;
                Object[] objArr4 = this.f8760f;
                int i10 = i6 << 1;
                objArr4[i10] = obj;
                objArr4[i10 + 1] = obj2;
                this.f8761g = i9 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int f3 = f(obj);
        if (f3 >= 0) {
            return k(f3);
        }
        return null;
    }

    public Object replace(Object obj, Object obj2) {
        int f3 = f(obj);
        if (f3 >= 0) {
            return l(f3, obj2);
        }
        return null;
    }

    public int size() {
        return this.f8761g;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f8761g * 28);
        sb.append('{');
        for (int i3 = 0; i3 < this.f8761g; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object i4 = i(i3);
            if (i4 != this) {
                sb.append(i4);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object m3 = m(i3);
            if (m3 != this) {
                sb.append(m3);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public boolean remove(Object obj, Object obj2) {
        int f3 = f(obj);
        if (f3 < 0) {
            return false;
        }
        Object m3 = m(f3);
        if (obj2 != m3 && (obj2 == null || !obj2.equals(m3))) {
            return false;
        }
        k(f3);
        return true;
    }

    public boolean replace(Object obj, Object obj2, Object obj3) {
        int f3 = f(obj);
        if (f3 < 0) {
            return false;
        }
        Object m3 = m(f3);
        if (m3 != obj2 && (obj2 == null || !obj2.equals(m3))) {
            return false;
        }
        l(f3, obj3);
        return true;
    }

    public g(g gVar) {
        this();
        if (gVar != null) {
            j(gVar);
        }
    }
}
