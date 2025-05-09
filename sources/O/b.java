package o;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class b implements Collection, Set {

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f8713i = new int[0];

    /* renamed from: j, reason: collision with root package name */
    public static final Object[] f8714j = new Object[0];

    /* renamed from: k, reason: collision with root package name */
    public static Object[] f8715k;

    /* renamed from: l, reason: collision with root package name */
    public static int f8716l;

    /* renamed from: m, reason: collision with root package name */
    public static Object[] f8717m;

    /* renamed from: n, reason: collision with root package name */
    public static int f8718n;

    /* renamed from: e, reason: collision with root package name */
    public int[] f8719e;

    /* renamed from: f, reason: collision with root package name */
    public Object[] f8720f;

    /* renamed from: g, reason: collision with root package name */
    public int f8721g;

    /* renamed from: h, reason: collision with root package name */
    public f f8722h;

    public class a extends f {
        public a() {
        }

        @Override // o.f
        public void a() {
            b.this.clear();
        }

        @Override // o.f
        public Object b(int i3, int i4) {
            return b.this.f8720f[i3];
        }

        @Override // o.f
        public Map c() {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // o.f
        public int d() {
            return b.this.f8721g;
        }

        @Override // o.f
        public int e(Object obj) {
            return b.this.indexOf(obj);
        }

        @Override // o.f
        public int f(Object obj) {
            return b.this.indexOf(obj);
        }

        @Override // o.f
        public void g(Object obj, Object obj2) {
            b.this.add(obj);
        }

        @Override // o.f
        public void h(int i3) {
            b.this.o(i3);
        }

        @Override // o.f
        public Object i(int i3, Object obj) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public b() {
        this(0);
    }

    public static void k(int[] iArr, Object[] objArr, int i3) {
        if (iArr.length == 8) {
            synchronized (b.class) {
                try {
                    if (f8718n < 10) {
                        objArr[0] = f8717m;
                        objArr[1] = iArr;
                        for (int i4 = i3 - 1; i4 >= 2; i4--) {
                            objArr[i4] = null;
                        }
                        f8717m = objArr;
                        f8718n++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (b.class) {
                try {
                    if (f8716l < 10) {
                        objArr[0] = f8715k;
                        objArr[1] = iArr;
                        for (int i5 = i3 - 1; i5 >= 2; i5--) {
                            objArr[i5] = null;
                        }
                        f8715k = objArr;
                        f8716l++;
                    }
                } finally {
                }
            }
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        int i3;
        int m3;
        if (obj == null) {
            m3 = n();
            i3 = 0;
        } else {
            int hashCode = obj.hashCode();
            i3 = hashCode;
            m3 = m(obj, hashCode);
        }
        if (m3 >= 0) {
            return false;
        }
        int i4 = ~m3;
        int i5 = this.f8721g;
        int[] iArr = this.f8719e;
        if (i5 >= iArr.length) {
            int i6 = 8;
            if (i5 >= 8) {
                i6 = (i5 >> 1) + i5;
            } else if (i5 < 4) {
                i6 = 4;
            }
            Object[] objArr = this.f8720f;
            i(i6);
            int[] iArr2 = this.f8719e;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f8720f, 0, objArr.length);
            }
            k(iArr, objArr, this.f8721g);
        }
        int i7 = this.f8721g;
        if (i4 < i7) {
            int[] iArr3 = this.f8719e;
            int i8 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i8, i7 - i4);
            Object[] objArr2 = this.f8720f;
            System.arraycopy(objArr2, i4, objArr2, i8, this.f8721g - i4);
        }
        this.f8719e[i4] = i3;
        this.f8720f[i4] = obj;
        this.f8721g++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        j(this.f8721g + collection.size());
        Iterator it = collection.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            z3 |= add(it.next());
        }
        return z3;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i3 = this.f8721g;
        if (i3 != 0) {
            k(this.f8719e, this.f8720f, i3);
            this.f8719e = f8713i;
            this.f8720f = f8714j;
            this.f8721g = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i3 = 0; i3 < this.f8721g; i3++) {
                try {
                    if (!set.contains(p(i3))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f8719e;
        int i3 = this.f8721g;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            i4 += iArr[i5];
        }
        return i4;
    }

    public final void i(int i3) {
        if (i3 == 8) {
            synchronized (b.class) {
                try {
                    Object[] objArr = f8717m;
                    if (objArr != null) {
                        this.f8720f = objArr;
                        f8717m = (Object[]) objArr[0];
                        this.f8719e = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f8718n--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i3 == 4) {
            synchronized (b.class) {
                try {
                    Object[] objArr2 = f8715k;
                    if (objArr2 != null) {
                        this.f8720f = objArr2;
                        f8715k = (Object[]) objArr2[0];
                        this.f8719e = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f8716l--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f8719e = new int[i3];
        this.f8720f = new Object[i3];
    }

    public int indexOf(Object obj) {
        return obj == null ? n() : m(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f8721g <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return l().m().iterator();
    }

    public void j(int i3) {
        int[] iArr = this.f8719e;
        if (iArr.length < i3) {
            Object[] objArr = this.f8720f;
            i(i3);
            int i4 = this.f8721g;
            if (i4 > 0) {
                System.arraycopy(iArr, 0, this.f8719e, 0, i4);
                System.arraycopy(objArr, 0, this.f8720f, 0, this.f8721g);
            }
            k(iArr, objArr, this.f8721g);
        }
    }

    public final f l() {
        if (this.f8722h == null) {
            this.f8722h = new a();
        }
        return this.f8722h;
    }

    public final int m(Object obj, int i3) {
        int i4 = this.f8721g;
        if (i4 == 0) {
            return -1;
        }
        int a3 = c.a(this.f8719e, i4, i3);
        if (a3 < 0 || obj.equals(this.f8720f[a3])) {
            return a3;
        }
        int i5 = a3 + 1;
        while (i5 < i4 && this.f8719e[i5] == i3) {
            if (obj.equals(this.f8720f[i5])) {
                return i5;
            }
            i5++;
        }
        for (int i6 = a3 - 1; i6 >= 0 && this.f8719e[i6] == i3; i6--) {
            if (obj.equals(this.f8720f[i6])) {
                return i6;
            }
        }
        return ~i5;
    }

    public final int n() {
        int i3 = this.f8721g;
        if (i3 == 0) {
            return -1;
        }
        int a3 = c.a(this.f8719e, i3, 0);
        if (a3 < 0 || this.f8720f[a3] == null) {
            return a3;
        }
        int i4 = a3 + 1;
        while (i4 < i3 && this.f8719e[i4] == 0) {
            if (this.f8720f[i4] == null) {
                return i4;
            }
            i4++;
        }
        for (int i5 = a3 - 1; i5 >= 0 && this.f8719e[i5] == 0; i5--) {
            if (this.f8720f[i5] == null) {
                return i5;
            }
        }
        return ~i4;
    }

    public Object o(int i3) {
        Object[] objArr = this.f8720f;
        Object obj = objArr[i3];
        int i4 = this.f8721g;
        if (i4 <= 1) {
            k(this.f8719e, objArr, i4);
            this.f8719e = f8713i;
            this.f8720f = f8714j;
            this.f8721g = 0;
            return obj;
        }
        int[] iArr = this.f8719e;
        if (iArr.length <= 8 || i4 >= iArr.length / 3) {
            int i5 = i4 - 1;
            this.f8721g = i5;
            if (i3 < i5) {
                int i6 = i3 + 1;
                System.arraycopy(iArr, i6, iArr, i3, i5 - i3);
                Object[] objArr2 = this.f8720f;
                System.arraycopy(objArr2, i6, objArr2, i3, this.f8721g - i3);
            }
            this.f8720f[this.f8721g] = null;
            return obj;
        }
        i(i4 > 8 ? i4 + (i4 >> 1) : 8);
        this.f8721g--;
        if (i3 > 0) {
            System.arraycopy(iArr, 0, this.f8719e, 0, i3);
            System.arraycopy(objArr, 0, this.f8720f, 0, i3);
        }
        int i7 = this.f8721g;
        if (i3 < i7) {
            int i8 = i3 + 1;
            System.arraycopy(iArr, i8, this.f8719e, i3, i7 - i3);
            System.arraycopy(objArr, i8, this.f8720f, i3, this.f8721g - i3);
        }
        return obj;
    }

    public Object p(int i3) {
        return this.f8720f[i3];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        o(indexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean z3 = false;
        while (it.hasNext()) {
            z3 |= remove(it.next());
        }
        return z3;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        boolean z3 = false;
        for (int i3 = this.f8721g - 1; i3 >= 0; i3--) {
            if (!collection.contains(this.f8720f[i3])) {
                o(i3);
                z3 = true;
            }
        }
        return z3;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f8721g;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i3 = this.f8721g;
        Object[] objArr = new Object[i3];
        System.arraycopy(this.f8720f, 0, objArr, 0, i3);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f8721g * 14);
        sb.append('{');
        for (int i3 = 0; i3 < this.f8721g; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object p3 = p(i3);
            if (p3 != this) {
                sb.append(p3);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public b(int i3) {
        if (i3 == 0) {
            this.f8719e = f8713i;
            this.f8720f = f8714j;
        } else {
            i(i3);
        }
        this.f8721g = 0;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray(Object[] objArr) {
        if (objArr.length < this.f8721g) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f8721g);
        }
        System.arraycopy(this.f8720f, 0, objArr, 0, this.f8721g);
        int length = objArr.length;
        int i3 = this.f8721g;
        if (length > i3) {
            objArr[i3] = null;
        }
        return objArr;
    }
}
