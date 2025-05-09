package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public class i0 extends AbstractList implements InterfaceC0339z, RandomAccess {

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0339z f3678e;

    public class a implements ListIterator {

        /* renamed from: e, reason: collision with root package name */
        public ListIterator f3679e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f3680f;

        public a(int i3) {
            this.f3680f = i3;
            this.f3679e = i0.this.f3678e.listIterator(i3);
        }

        @Override // java.util.ListIterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.f3679e.next();
        }

        @Override // java.util.ListIterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return (String) this.f3679e.previous();
        }

        @Override // java.util.ListIterator
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f3679e.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f3679e.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f3679e.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f3679e.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public class b implements Iterator {

        /* renamed from: e, reason: collision with root package name */
        public Iterator f3682e;

        public b() {
            this.f3682e = i0.this.f3678e.iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.f3682e.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f3682e.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public i0(InterfaceC0339z interfaceC0339z) {
        this.f3678e = interfaceC0339z;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0339z
    public InterfaceC0339z a() {
        return this;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0339z
    public Object c(int i3) {
        return this.f3678e.c(i3);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0339z
    public List e() {
        return this.f3678e.e();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0339z
    public void g(AbstractC0320f abstractC0320f) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new b();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public String get(int i3) {
        return (String) this.f3678e.get(i3);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i3) {
        return new a(i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f3678e.size();
    }
}
