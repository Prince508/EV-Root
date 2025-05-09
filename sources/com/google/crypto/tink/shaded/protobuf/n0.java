package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public class n0 extends AbstractList implements D, RandomAccess {

    /* renamed from: e, reason: collision with root package name */
    public final D f5850e;

    public class a implements ListIterator {

        /* renamed from: e, reason: collision with root package name */
        public ListIterator f5851e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f5852f;

        public a(int i3) {
            this.f5852f = i3;
            this.f5851e = n0.this.f5850e.listIterator(i3);
        }

        @Override // java.util.ListIterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.f5851e.next();
        }

        @Override // java.util.ListIterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public String previous() {
            return (String) this.f5851e.previous();
        }

        @Override // java.util.ListIterator
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f5851e.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f5851e.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f5851e.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f5851e.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public class b implements Iterator {

        /* renamed from: e, reason: collision with root package name */
        public Iterator f5854e;

        public b() {
            this.f5854e = n0.this.f5850e.iterator();
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public String next() {
            return (String) this.f5854e.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f5854e.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public n0(D d3) {
        this.f5850e = d3;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.D
    public D a() {
        return this;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.D
    public Object c(int i3) {
        return this.f5850e.c(i3);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.D
    public List e() {
        return this.f5850e.e();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.D
    public void h(AbstractC0417h abstractC0417h) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new b();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public String get(int i3) {
        return (String) this.f5850e.get(i3);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i3) {
        return new a(i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f5850e.size();
    }
}
