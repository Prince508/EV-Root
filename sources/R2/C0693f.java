package r2;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: r2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0693f extends AbstractC0691d {

    /* renamed from: h, reason: collision with root package name */
    public static final a f9004h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    public static final Object[] f9005i = new Object[0];

    /* renamed from: e, reason: collision with root package name */
    public int f9006e;

    /* renamed from: f, reason: collision with root package name */
    public Object[] f9007f = f9005i;

    /* renamed from: g, reason: collision with root package name */
    public int f9008g;

    /* renamed from: r2.f$a */
    public static final class a {
        public /* synthetic */ a(C2.g gVar) {
            this();
        }

        public a() {
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        C2.k.e(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        s();
        n(size() + collection.size());
        k(r(this.f9006e + size()), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        s();
        n(size() + 1);
        int m3 = m(this.f9006e);
        this.f9006e = m3;
        this.f9007f[m3] = obj;
        this.f9008g = size() + 1;
    }

    public final void addLast(Object obj) {
        s();
        n(size() + 1);
        this.f9007f[r(this.f9006e + size())] = obj;
        this.f9008g = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (!isEmpty()) {
            s();
            q(this.f9006e, r(this.f9006e + size()));
        }
        this.f9006e = 0;
        this.f9008g = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i3) {
        AbstractC0690c.f8995e.a(i3, size());
        return this.f9007f[r(this.f9006e + i3)];
    }

    @Override // r2.AbstractC0691d
    public int i() {
        return this.f9008g;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int i3;
        int r3 = r(this.f9006e + size());
        int i4 = this.f9006e;
        if (i4 < r3) {
            while (i4 < r3) {
                if (C2.k.a(obj, this.f9007f[i4])) {
                    i3 = this.f9006e;
                } else {
                    i4++;
                }
            }
            return -1;
        }
        if (i4 < r3) {
            return -1;
        }
        int length = this.f9007f.length;
        while (true) {
            if (i4 >= length) {
                for (int i5 = 0; i5 < r3; i5++) {
                    if (C2.k.a(obj, this.f9007f[i5])) {
                        i4 = i5 + this.f9007f.length;
                        i3 = this.f9006e;
                    }
                }
                return -1;
            }
            if (C2.k.a(obj, this.f9007f[i4])) {
                i3 = this.f9006e;
                break;
            }
            i4++;
        }
        return i4 - i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // r2.AbstractC0691d
    public Object j(int i3) {
        AbstractC0690c.f8995e.a(i3, size());
        if (i3 == AbstractC0700m.g(this)) {
            return removeLast();
        }
        if (i3 == 0) {
            return removeFirst();
        }
        s();
        int r3 = r(this.f9006e + i3);
        Object obj = this.f9007f[r3];
        if (i3 < (size() >> 1)) {
            int i4 = this.f9006e;
            if (r3 >= i4) {
                Object[] objArr = this.f9007f;
                AbstractC0696i.c(objArr, objArr, i4 + 1, i4, r3);
            } else {
                Object[] objArr2 = this.f9007f;
                AbstractC0696i.c(objArr2, objArr2, 1, 0, r3);
                Object[] objArr3 = this.f9007f;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i5 = this.f9006e;
                AbstractC0696i.c(objArr3, objArr3, i5 + 1, i5, objArr3.length - 1);
            }
            Object[] objArr4 = this.f9007f;
            int i6 = this.f9006e;
            objArr4[i6] = null;
            this.f9006e = o(i6);
        } else {
            int r4 = r(this.f9006e + AbstractC0700m.g(this));
            if (r3 <= r4) {
                Object[] objArr5 = this.f9007f;
                AbstractC0696i.c(objArr5, objArr5, r3, r3 + 1, r4 + 1);
            } else {
                Object[] objArr6 = this.f9007f;
                AbstractC0696i.c(objArr6, objArr6, r3, r3 + 1, objArr6.length);
                Object[] objArr7 = this.f9007f;
                objArr7[objArr7.length - 1] = objArr7[0];
                AbstractC0696i.c(objArr7, objArr7, 0, 1, r4 + 1);
            }
            this.f9007f[r4] = null;
        }
        this.f9008g = size() - 1;
        return obj;
    }

    public final void k(int i3, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f9007f.length;
        while (i3 < length && it.hasNext()) {
            this.f9007f[i3] = it.next();
            i3++;
        }
        int i4 = this.f9006e;
        for (int i5 = 0; i5 < i4 && it.hasNext(); i5++) {
            this.f9007f[i5] = it.next();
        }
        this.f9008g = size() + collection.size();
    }

    public final void l(int i3) {
        Object[] objArr = new Object[i3];
        Object[] objArr2 = this.f9007f;
        AbstractC0696i.c(objArr2, objArr, 0, this.f9006e, objArr2.length);
        Object[] objArr3 = this.f9007f;
        int length = objArr3.length;
        int i4 = this.f9006e;
        AbstractC0696i.c(objArr3, objArr, length - i4, 0, i4);
        this.f9006e = 0;
        this.f9007f = objArr;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int h3;
        int i3;
        int r3 = r(this.f9006e + size());
        int i4 = this.f9006e;
        if (i4 < r3) {
            h3 = r3 - 1;
            if (i4 <= h3) {
                while (!C2.k.a(obj, this.f9007f[h3])) {
                    if (h3 != i4) {
                        h3--;
                    }
                }
                i3 = this.f9006e;
                return h3 - i3;
            }
            return -1;
        }
        if (i4 > r3) {
            int i5 = r3 - 1;
            while (true) {
                if (-1 >= i5) {
                    h3 = AbstractC0697j.h(this.f9007f);
                    int i6 = this.f9006e;
                    if (i6 <= h3) {
                        while (!C2.k.a(obj, this.f9007f[h3])) {
                            if (h3 != i6) {
                                h3--;
                            }
                        }
                        i3 = this.f9006e;
                    }
                } else {
                    if (C2.k.a(obj, this.f9007f[i5])) {
                        h3 = i5 + this.f9007f.length;
                        i3 = this.f9006e;
                        break;
                    }
                    i5--;
                }
            }
        }
        return -1;
    }

    public final int m(int i3) {
        return i3 == 0 ? AbstractC0697j.h(this.f9007f) : i3 - 1;
    }

    public final void n(int i3) {
        if (i3 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f9007f;
        if (i3 <= objArr.length) {
            return;
        }
        if (objArr == f9005i) {
            this.f9007f = new Object[G2.e.a(i3, 10)];
        } else {
            l(AbstractC0690c.f8995e.d(objArr.length, i3));
        }
    }

    public final int o(int i3) {
        if (i3 == AbstractC0697j.h(this.f9007f)) {
            return 0;
        }
        return i3 + 1;
    }

    public final int p(int i3) {
        return i3 < 0 ? i3 + this.f9007f.length : i3;
    }

    public final void q(int i3, int i4) {
        if (i3 < i4) {
            AbstractC0696i.e(this.f9007f, null, i3, i4);
            return;
        }
        Object[] objArr = this.f9007f;
        AbstractC0696i.e(objArr, null, i3, objArr.length);
        AbstractC0696i.e(this.f9007f, null, 0, i4);
    }

    public final int r(int i3) {
        Object[] objArr = this.f9007f;
        return i3 >= objArr.length ? i3 - objArr.length : i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection collection) {
        int r3;
        C2.k.e(collection, "elements");
        boolean z3 = false;
        z3 = false;
        z3 = false;
        if (!isEmpty() && this.f9007f.length != 0) {
            int r4 = r(this.f9006e + size());
            int i3 = this.f9006e;
            if (i3 < r4) {
                r3 = i3;
                while (i3 < r4) {
                    Object obj = this.f9007f[i3];
                    if (collection.contains(obj)) {
                        z3 = true;
                    } else {
                        this.f9007f[r3] = obj;
                        r3++;
                    }
                    i3++;
                }
                AbstractC0696i.e(this.f9007f, null, r3, r4);
            } else {
                int length = this.f9007f.length;
                boolean z4 = false;
                int i4 = i3;
                while (i3 < length) {
                    Object[] objArr = this.f9007f;
                    Object obj2 = objArr[i3];
                    objArr[i3] = null;
                    if (collection.contains(obj2)) {
                        z4 = true;
                    } else {
                        this.f9007f[i4] = obj2;
                        i4++;
                    }
                    i3++;
                }
                r3 = r(i4);
                for (int i5 = 0; i5 < r4; i5++) {
                    Object[] objArr2 = this.f9007f;
                    Object obj3 = objArr2[i5];
                    objArr2[i5] = null;
                    if (collection.contains(obj3)) {
                        z4 = true;
                    } else {
                        this.f9007f[r3] = obj3;
                        r3 = o(r3);
                    }
                }
                z3 = z4;
            }
            if (z3) {
                s();
                this.f9008g = p(r3 - this.f9006e);
            }
        }
        return z3;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        s();
        Object[] objArr = this.f9007f;
        int i3 = this.f9006e;
        Object obj = objArr[i3];
        objArr[i3] = null;
        this.f9006e = o(i3);
        this.f9008g = size() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        s();
        int r3 = r(this.f9006e + AbstractC0700m.g(this));
        Object[] objArr = this.f9007f;
        Object obj = objArr[r3];
        objArr[r3] = null;
        this.f9008g = size() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i3, int i4) {
        AbstractC0690c.f8995e.c(i3, i4, size());
        int i5 = i4 - i3;
        if (i5 == 0) {
            return;
        }
        if (i5 == size()) {
            clear();
            return;
        }
        if (i5 == 1) {
            remove(i3);
            return;
        }
        s();
        if (i3 < size() - i4) {
            u(i3, i4);
            int r3 = r(this.f9006e + i5);
            q(this.f9006e, r3);
            this.f9006e = r3;
        } else {
            v(i3, i4);
            int r4 = r(this.f9006e + size());
            q(p(r4 - i5), r4);
        }
        this.f9008g = size() - i5;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection collection) {
        int r3;
        C2.k.e(collection, "elements");
        boolean z3 = false;
        z3 = false;
        z3 = false;
        if (!isEmpty() && this.f9007f.length != 0) {
            int r4 = r(this.f9006e + size());
            int i3 = this.f9006e;
            if (i3 < r4) {
                r3 = i3;
                while (i3 < r4) {
                    Object obj = this.f9007f[i3];
                    if (collection.contains(obj)) {
                        this.f9007f[r3] = obj;
                        r3++;
                    } else {
                        z3 = true;
                    }
                    i3++;
                }
                AbstractC0696i.e(this.f9007f, null, r3, r4);
            } else {
                int length = this.f9007f.length;
                boolean z4 = false;
                int i4 = i3;
                while (i3 < length) {
                    Object[] objArr = this.f9007f;
                    Object obj2 = objArr[i3];
                    objArr[i3] = null;
                    if (collection.contains(obj2)) {
                        this.f9007f[i4] = obj2;
                        i4++;
                    } else {
                        z4 = true;
                    }
                    i3++;
                }
                r3 = r(i4);
                for (int i5 = 0; i5 < r4; i5++) {
                    Object[] objArr2 = this.f9007f;
                    Object obj3 = objArr2[i5];
                    objArr2[i5] = null;
                    if (collection.contains(obj3)) {
                        this.f9007f[r3] = obj3;
                        r3 = o(r3);
                    } else {
                        z4 = true;
                    }
                }
                z3 = z4;
            }
            if (z3) {
                s();
                this.f9008g = p(r3 - this.f9006e);
            }
        }
        return z3;
    }

    public final void s() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i3, Object obj) {
        AbstractC0690c.f8995e.a(i3, size());
        int r3 = r(this.f9006e + i3);
        Object[] objArr = this.f9007f;
        Object obj2 = objArr[r3];
        objArr[r3] = obj;
        return obj2;
    }

    public final Object t() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] objArr) {
        C2.k.e(objArr, "array");
        if (objArr.length < size()) {
            objArr = AbstractC0694g.a(objArr, size());
        }
        Object[] objArr2 = objArr;
        int r3 = r(this.f9006e + size());
        int i3 = this.f9006e;
        if (i3 < r3) {
            AbstractC0696i.d(this.f9007f, objArr2, 0, i3, r3, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr3 = this.f9007f;
            AbstractC0696i.c(objArr3, objArr2, 0, this.f9006e, objArr3.length);
            Object[] objArr4 = this.f9007f;
            AbstractC0696i.c(objArr4, objArr2, objArr4.length - this.f9006e, 0, r3);
        }
        return AbstractC0699l.c(size(), objArr2);
    }

    public final void u(int i3, int i4) {
        int r3 = r(this.f9006e + (i3 - 1));
        int r4 = r(this.f9006e + (i4 - 1));
        while (i3 > 0) {
            int i5 = r3 + 1;
            int min = Math.min(i3, Math.min(i5, r4 + 1));
            Object[] objArr = this.f9007f;
            int i6 = r4 - min;
            int i7 = r3 - min;
            AbstractC0696i.c(objArr, objArr, i6 + 1, i7 + 1, i5);
            r3 = p(i7);
            r4 = p(i6);
            i3 -= min;
        }
    }

    public final void v(int i3, int i4) {
        int r3 = r(this.f9006e + i4);
        int r4 = r(this.f9006e + i3);
        int size = size();
        while (true) {
            size -= i4;
            if (size <= 0) {
                return;
            }
            Object[] objArr = this.f9007f;
            i4 = Math.min(size, Math.min(objArr.length - r3, objArr.length - r4));
            Object[] objArr2 = this.f9007f;
            int i5 = r3 + i4;
            AbstractC0696i.c(objArr2, objArr2, r4, r3, i5);
            r3 = r(i5);
            r4 = r(r4 + i4);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i3, Object obj) {
        AbstractC0690c.f8995e.b(i3, size());
        if (i3 == size()) {
            addLast(obj);
            return;
        }
        if (i3 == 0) {
            addFirst(obj);
            return;
        }
        s();
        n(size() + 1);
        int r3 = r(this.f9006e + i3);
        if (i3 < ((size() + 1) >> 1)) {
            int m3 = m(r3);
            int m4 = m(this.f9006e);
            int i4 = this.f9006e;
            if (m3 >= i4) {
                Object[] objArr = this.f9007f;
                objArr[m4] = objArr[i4];
                AbstractC0696i.c(objArr, objArr, i4, i4 + 1, m3 + 1);
            } else {
                Object[] objArr2 = this.f9007f;
                AbstractC0696i.c(objArr2, objArr2, i4 - 1, i4, objArr2.length);
                Object[] objArr3 = this.f9007f;
                objArr3[objArr3.length - 1] = objArr3[0];
                AbstractC0696i.c(objArr3, objArr3, 0, 1, m3 + 1);
            }
            this.f9007f[m3] = obj;
            this.f9006e = m4;
        } else {
            int r4 = r(this.f9006e + size());
            if (r3 < r4) {
                Object[] objArr4 = this.f9007f;
                AbstractC0696i.c(objArr4, objArr4, r3 + 1, r3, r4);
            } else {
                Object[] objArr5 = this.f9007f;
                AbstractC0696i.c(objArr5, objArr5, 1, 0, r4);
                Object[] objArr6 = this.f9007f;
                objArr6[0] = objArr6[objArr6.length - 1];
                AbstractC0696i.c(objArr6, objArr6, r3 + 1, r3, objArr6.length - 1);
            }
            this.f9007f[r3] = obj;
        }
        this.f9008g = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i3, Collection collection) {
        C2.k.e(collection, "elements");
        AbstractC0690c.f8995e.b(i3, size());
        if (collection.isEmpty()) {
            return false;
        }
        if (i3 == size()) {
            return addAll(collection);
        }
        s();
        n(size() + collection.size());
        int r3 = r(this.f9006e + size());
        int r4 = r(this.f9006e + i3);
        int size = collection.size();
        if (i3 < ((size() + 1) >> 1)) {
            int i4 = this.f9006e;
            int i5 = i4 - size;
            if (r4 < i4) {
                Object[] objArr = this.f9007f;
                AbstractC0696i.c(objArr, objArr, i5, i4, objArr.length);
                if (size >= r4) {
                    Object[] objArr2 = this.f9007f;
                    AbstractC0696i.c(objArr2, objArr2, objArr2.length - size, 0, r4);
                } else {
                    Object[] objArr3 = this.f9007f;
                    AbstractC0696i.c(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f9007f;
                    AbstractC0696i.c(objArr4, objArr4, 0, size, r4);
                }
            } else if (i5 >= 0) {
                Object[] objArr5 = this.f9007f;
                AbstractC0696i.c(objArr5, objArr5, i5, i4, r4);
            } else {
                Object[] objArr6 = this.f9007f;
                i5 += objArr6.length;
                int i6 = r4 - i4;
                int length = objArr6.length - i5;
                if (length >= i6) {
                    AbstractC0696i.c(objArr6, objArr6, i5, i4, r4);
                } else {
                    AbstractC0696i.c(objArr6, objArr6, i5, i4, i4 + length);
                    Object[] objArr7 = this.f9007f;
                    AbstractC0696i.c(objArr7, objArr7, 0, this.f9006e + length, r4);
                }
            }
            this.f9006e = i5;
            k(p(r4 - size), collection);
        } else {
            int i7 = r4 + size;
            if (r4 < r3) {
                int i8 = size + r3;
                Object[] objArr8 = this.f9007f;
                if (i8 <= objArr8.length) {
                    AbstractC0696i.c(objArr8, objArr8, i7, r4, r3);
                } else if (i7 >= objArr8.length) {
                    AbstractC0696i.c(objArr8, objArr8, i7 - objArr8.length, r4, r3);
                } else {
                    int length2 = r3 - (i8 - objArr8.length);
                    AbstractC0696i.c(objArr8, objArr8, 0, length2, r3);
                    Object[] objArr9 = this.f9007f;
                    AbstractC0696i.c(objArr9, objArr9, i7, r4, length2);
                }
            } else {
                Object[] objArr10 = this.f9007f;
                AbstractC0696i.c(objArr10, objArr10, size, 0, r3);
                Object[] objArr11 = this.f9007f;
                if (i7 >= objArr11.length) {
                    AbstractC0696i.c(objArr11, objArr11, i7 - objArr11.length, r4, objArr11.length);
                } else {
                    AbstractC0696i.c(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f9007f;
                    AbstractC0696i.c(objArr12, objArr12, i7, r4, objArr12.length - size);
                }
            }
            k(r4, collection);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
