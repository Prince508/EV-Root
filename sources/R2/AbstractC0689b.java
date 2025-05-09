package r2;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: r2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0689b implements Collection {
    public static final CharSequence k(AbstractC0689b abstractC0689b, Object obj) {
        return obj == abstractC0689b ? "(this Collection)" : String.valueOf(obj);
    }

    @Override // java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        if (isEmpty()) {
            return false;
        }
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (C2.k.a(it.next(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        C2.k.e(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
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
        return size() == 0;
    }

    public abstract int j();

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return j();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return C2.f.a(this);
    }

    public String toString() {
        return u.t(this, ", ", "[", "]", 0, null, new B2.l() { // from class: r2.a
            @Override // B2.l
            public final Object j(Object obj) {
                CharSequence k3;
                k3 = AbstractC0689b.k(AbstractC0689b.this, obj);
                return k3;
            }
        }, 24, null);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        C2.k.e(objArr, "array");
        return C2.f.b(this, objArr);
    }
}
