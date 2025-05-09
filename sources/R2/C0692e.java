package r2;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: r2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0692e implements Collection {

    /* renamed from: e, reason: collision with root package name */
    public final Object[] f9002e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f9003f;

    public C0692e(Object[] objArr, boolean z3) {
        C2.k.e(objArr, "values");
        this.f9002e = objArr;
        this.f9003f = z3;
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
        return AbstractC0697j.f(this.f9002e, obj);
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

    public int i() {
        return this.f9002e.length;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f9002e.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return C2.b.a(this.f9002e);
    }

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
        return i();
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        C2.k.e(objArr, "array");
        return C2.f.b(this, objArr);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return AbstractC0699l.a(this.f9002e, this.f9003f);
    }
}
