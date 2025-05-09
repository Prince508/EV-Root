package o;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public b f8740a;

    /* renamed from: b, reason: collision with root package name */
    public c f8741b;

    /* renamed from: c, reason: collision with root package name */
    public e f8742c;

    public final class a implements Iterator {

        /* renamed from: e, reason: collision with root package name */
        public final int f8743e;

        /* renamed from: f, reason: collision with root package name */
        public int f8744f;

        /* renamed from: g, reason: collision with root package name */
        public int f8745g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f8746h = false;

        public a(int i3) {
            this.f8743e = i3;
            this.f8744f = f.this.d();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f8745g < this.f8744f;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Object b3 = f.this.b(this.f8745g, this.f8743e);
            this.f8745g++;
            this.f8746h = true;
            return b3;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f8746h) {
                throw new IllegalStateException();
            }
            int i3 = this.f8745g - 1;
            this.f8745g = i3;
            this.f8744f--;
            this.f8746h = false;
            f.this.h(i3);
        }
    }

    public final class b implements Set {
        public b() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection collection) {
            int d3 = f.this.d();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                f.this.g(entry.getKey(), entry.getValue());
            }
            return d3 != f.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            f.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int e3 = f.this.e(entry.getKey());
            if (e3 < 0) {
                return false;
            }
            return o.c.c(f.this.b(e3, 1), entry.getValue());
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return f.k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i3 = 0;
            for (int d3 = f.this.d() - 1; d3 >= 0; d3--) {
                Object b3 = f.this.b(d3, 0);
                Object b4 = f.this.b(d3, 1);
                i3 += (b3 == null ? 0 : b3.hashCode()) ^ (b4 == null ? 0 : b4.hashCode());
            }
            return i3;
        }

        @Override // java.util.Set, java.util.Collection
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry entry) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return f.this.d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return f.this.new d();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return f.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            throw new UnsupportedOperationException();
        }
    }

    public final class c implements Set {
        public c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            f.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return f.this.e(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection collection) {
            return f.j(f.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return f.k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i3 = 0;
            for (int d3 = f.this.d() - 1; d3 >= 0; d3--) {
                Object b3 = f.this.b(d3, 0);
                i3 += b3 == null ? 0 : b3.hashCode();
            }
            return i3;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return f.this.d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return f.this.new a(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int e3 = f.this.e(obj);
            if (e3 < 0) {
                return false;
            }
            f.this.h(e3);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection collection) {
            return f.o(f.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection collection) {
            return f.p(f.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return f.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return f.this.q(0);
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return f.this.r(objArr, 0);
        }
    }

    public final class d implements Iterator, Map.Entry {

        /* renamed from: e, reason: collision with root package name */
        public int f8750e;

        /* renamed from: g, reason: collision with root package name */
        public boolean f8752g = false;

        /* renamed from: f, reason: collision with root package name */
        public int f8751f = -1;

        public d() {
            this.f8750e = f.this.d() - 1;
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f8751f++;
            this.f8752g = true;
            return this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!this.f8752g) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return o.c.c(entry.getKey(), f.this.b(this.f8751f, 0)) && o.c.c(entry.getValue(), f.this.b(this.f8751f, 1));
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            if (this.f8752g) {
                return f.this.b(this.f8751f, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            if (this.f8752g) {
                return f.this.b(this.f8751f, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f8751f < this.f8750e;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (!this.f8752g) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            Object b3 = f.this.b(this.f8751f, 0);
            Object b4 = f.this.b(this.f8751f, 1);
            return (b3 == null ? 0 : b3.hashCode()) ^ (b4 != null ? b4.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f8752g) {
                throw new IllegalStateException();
            }
            f.this.h(this.f8751f);
            this.f8751f--;
            this.f8750e--;
            this.f8752g = false;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (this.f8752g) {
                return f.this.i(this.f8751f, obj);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    public final class e implements Collection {
        public e() {
        }

        @Override // java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            f.this.a();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return f.this.f(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return f.this.d() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return f.this.new a(1);
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int f3 = f.this.f(obj);
            if (f3 < 0) {
                return false;
            }
            f.this.h(f3);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection collection) {
            int d3 = f.this.d();
            int i3 = 0;
            boolean z3 = false;
            while (i3 < d3) {
                if (collection.contains(f.this.b(i3, 1))) {
                    f.this.h(i3);
                    i3--;
                    d3--;
                    z3 = true;
                }
                i3++;
            }
            return z3;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection collection) {
            int d3 = f.this.d();
            int i3 = 0;
            boolean z3 = false;
            while (i3 < d3) {
                if (!collection.contains(f.this.b(i3, 1))) {
                    f.this.h(i3);
                    i3--;
                    d3--;
                    z3 = true;
                }
                i3++;
            }
            return z3;
        }

        @Override // java.util.Collection
        public int size() {
            return f.this.d();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return f.this.q(1);
        }

        @Override // java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return f.this.r(objArr, 1);
        }
    }

    public static boolean j(Map map, Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean k(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static boolean o(Map map, Collection collection) {
        int size = map.size();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    public static boolean p(Map map, Collection collection) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public abstract void a();

    public abstract Object b(int i3, int i4);

    public abstract Map c();

    public abstract int d();

    public abstract int e(Object obj);

    public abstract int f(Object obj);

    public abstract void g(Object obj, Object obj2);

    public abstract void h(int i3);

    public abstract Object i(int i3, Object obj);

    public Set l() {
        if (this.f8740a == null) {
            this.f8740a = new b();
        }
        return this.f8740a;
    }

    public Set m() {
        if (this.f8741b == null) {
            this.f8741b = new c();
        }
        return this.f8741b;
    }

    public Collection n() {
        if (this.f8742c == null) {
            this.f8742c = new e();
        }
        return this.f8742c;
    }

    public Object[] q(int i3) {
        int d3 = d();
        Object[] objArr = new Object[d3];
        for (int i4 = 0; i4 < d3; i4++) {
            objArr[i4] = b(i4, i3);
        }
        return objArr;
    }

    public Object[] r(Object[] objArr, int i3) {
        int d3 = d();
        if (objArr.length < d3) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), d3);
        }
        for (int i4 = 0; i4 < d3; i4++) {
            objArr[i4] = b(i4, i3);
        }
        if (objArr.length > d3) {
            objArr[d3] = null;
        }
        return objArr;
    }
}
