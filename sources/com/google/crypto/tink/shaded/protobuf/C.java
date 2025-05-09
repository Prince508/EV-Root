package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public class C extends AbstractC0412c implements D, RandomAccess {

    /* renamed from: g, reason: collision with root package name */
    public static final C f5728g;

    /* renamed from: h, reason: collision with root package name */
    public static final D f5729h;

    /* renamed from: f, reason: collision with root package name */
    public final List f5730f;

    static {
        C c3 = new C();
        f5728g = c3;
        c3.b();
        f5729h = c3;
    }

    public C() {
        this(10);
    }

    public static String k(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof AbstractC0417h ? ((AbstractC0417h) obj).C() : AbstractC0434z.i((byte[]) obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.D
    public D a() {
        return f() ? new n0(this) : this;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0412c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.D
    public Object c(int i3) {
        return this.f5730f.get(i3);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0412c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        i();
        this.f5730f.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.D
    public List e() {
        return Collections.unmodifiableList(this.f5730f);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0412c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0412c, com.google.crypto.tink.shaded.protobuf.AbstractC0434z.d
    public /* bridge */ /* synthetic */ boolean f() {
        return super.f();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.D
    public void h(AbstractC0417h abstractC0417h) {
        i();
        this.f5730f.add(abstractC0417h);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0412c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public void add(int i3, String str) {
        i();
        this.f5730f.add(i3, str);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public String get(int i3) {
        Object obj = this.f5730f.get(i3);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC0417h) {
            AbstractC0417h abstractC0417h = (AbstractC0417h) obj;
            String C3 = abstractC0417h.C();
            if (abstractC0417h.r()) {
                this.f5730f.set(i3, C3);
            }
            return C3;
        }
        byte[] bArr = (byte[]) obj;
        String i4 = AbstractC0434z.i(bArr);
        if (AbstractC0434z.g(bArr)) {
            this.f5730f.set(i3, i4);
        }
        return i4;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0434z.d
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public C d(int i3) {
        if (i3 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i3);
        arrayList.addAll(this.f5730f);
        return new C(arrayList);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0412c, java.util.AbstractList, java.util.List
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public String remove(int i3) {
        i();
        Object remove = this.f5730f.remove(i3);
        ((AbstractList) this).modCount++;
        return k(remove);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public String set(int i3, String str) {
        i();
        return k(this.f5730f.set(i3, str));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0412c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0412c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f5730f.size();
    }

    public C(int i3) {
        this(new ArrayList(i3));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0412c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0412c, java.util.AbstractList, java.util.List
    public boolean addAll(int i3, Collection collection) {
        i();
        if (collection instanceof D) {
            collection = ((D) collection).e();
        }
        boolean addAll = this.f5730f.addAll(i3, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0412c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public C(ArrayList arrayList) {
        this.f5730f = arrayList;
    }
}
