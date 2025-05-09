package r2;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* renamed from: r2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0690c extends AbstractC0689b implements List {

    /* renamed from: e, reason: collision with root package name */
    public static final a f8995e = new a(null);

    /* renamed from: r2.c$a */
    public static final class a {
        public /* synthetic */ a(C2.g gVar) {
            this();
        }

        public final void a(int i3, int i4) {
            if (i3 < 0 || i3 >= i4) {
                throw new IndexOutOfBoundsException("index: " + i3 + ", size: " + i4);
            }
        }

        public final void b(int i3, int i4) {
            if (i3 < 0 || i3 > i4) {
                throw new IndexOutOfBoundsException("index: " + i3 + ", size: " + i4);
            }
        }

        public final void c(int i3, int i4, int i5) {
            if (i3 < 0 || i4 > i5) {
                throw new IndexOutOfBoundsException("fromIndex: " + i3 + ", toIndex: " + i4 + ", size: " + i5);
            }
            if (i3 <= i4) {
                return;
            }
            throw new IllegalArgumentException("fromIndex: " + i3 + " > toIndex: " + i4);
        }

        public final int d(int i3, int i4) {
            int i5 = i3 + (i3 >> 1);
            if (i5 - i4 < 0) {
                i5 = i4;
            }
            return i5 - 2147483639 > 0 ? i4 > 2147483639 ? Integer.MAX_VALUE : 2147483639 : i5;
        }

        public final boolean e(Collection collection, Collection collection2) {
            C2.k.e(collection, I1.c.f825d);
            C2.k.e(collection2, "other");
            if (collection.size() != collection2.size()) {
                return false;
            }
            Iterator it = collection2.iterator();
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                if (!C2.k.a(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final int f(Collection collection) {
            C2.k.e(collection, I1.c.f825d);
            Iterator it = collection.iterator();
            int i3 = 1;
            while (it.hasNext()) {
                Object next = it.next();
                i3 = (i3 * 31) + (next != null ? next.hashCode() : 0);
            }
            return i3;
        }

        public a() {
        }
    }

    /* renamed from: r2.c$b */
    public class b implements Iterator {

        /* renamed from: e, reason: collision with root package name */
        public int f8996e;

        public b() {
        }

        public final int b() {
            return this.f8996e;
        }

        public final void c(int i3) {
            this.f8996e = i3;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f8996e < AbstractC0690c.this.size();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            AbstractC0690c abstractC0690c = AbstractC0690c.this;
            int i3 = this.f8996e;
            this.f8996e = i3 + 1;
            return abstractC0690c.get(i3);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: r2.c$c, reason: collision with other inner class name */
    public class C0153c extends b implements ListIterator {
        public C0153c(int i3) {
            super();
            AbstractC0690c.f8995e.b(i3, AbstractC0690c.this.size());
            c(i3);
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return b() > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return b();
        }

        @Override // java.util.ListIterator
        public Object previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            AbstractC0690c abstractC0690c = AbstractC0690c.this;
            c(b() - 1);
            return abstractC0690c.get(b());
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return b() - 1;
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: r2.c$d */
    public static final class d extends AbstractC0690c implements RandomAccess {

        /* renamed from: f, reason: collision with root package name */
        public final AbstractC0690c f8999f;

        /* renamed from: g, reason: collision with root package name */
        public final int f9000g;

        /* renamed from: h, reason: collision with root package name */
        public int f9001h;

        public d(AbstractC0690c abstractC0690c, int i3, int i4) {
            C2.k.e(abstractC0690c, "list");
            this.f8999f = abstractC0690c;
            this.f9000g = i3;
            AbstractC0690c.f8995e.c(i3, i4, abstractC0690c.size());
            this.f9001h = i4 - i3;
        }

        @Override // r2.AbstractC0690c, java.util.List
        public Object get(int i3) {
            AbstractC0690c.f8995e.a(i3, this.f9001h);
            return this.f8999f.get(this.f9000g + i3);
        }

        @Override // r2.AbstractC0689b
        public int j() {
            return this.f9001h;
        }
    }

    @Override // java.util.List
    public void add(int i3, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i3, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            return f8995e.e(this, (Collection) obj);
        }
        return false;
    }

    @Override // java.util.List
    public abstract Object get(int i3);

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return f8995e.f(this);
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        Iterator it = iterator();
        int i3 = 0;
        while (it.hasNext()) {
            if (C2.k.a(it.next(), obj)) {
                return i3;
            }
            i3++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new b();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (C2.k.a(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return new C0153c(0);
    }

    @Override // java.util.List
    public Object remove(int i3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public Object set(int i3, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List subList(int i3, int i4) {
        return new d(this, i3, i4);
    }

    @Override // java.util.List
    public ListIterator listIterator(int i3) {
        return new C0153c(i3);
    }
}
