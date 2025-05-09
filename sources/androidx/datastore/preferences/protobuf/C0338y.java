package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0338y extends AbstractC0317c implements InterfaceC0339z, RandomAccess {

    /* renamed from: g, reason: collision with root package name */
    public static final C0338y f3868g;

    /* renamed from: h, reason: collision with root package name */
    public static final InterfaceC0339z f3869h;

    /* renamed from: f, reason: collision with root package name */
    public final List f3870f;

    static {
        C0338y c0338y = new C0338y();
        f3868g = c0338y;
        c0338y.b();
        f3869h = c0338y;
    }

    public C0338y() {
        this(10);
    }

    public static String k(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof AbstractC0320f ? ((AbstractC0320f) obj).y() : AbstractC0334u.j((byte[]) obj);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0339z
    public InterfaceC0339z a() {
        return f() ? new i0(this) : this;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0317c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0339z
    public Object c(int i3) {
        return this.f3870f.get(i3);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0317c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        i();
        this.f3870f.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0339z
    public List e() {
        return Collections.unmodifiableList(this.f3870f);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0317c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0317c, androidx.datastore.preferences.protobuf.AbstractC0334u.b
    public /* bridge */ /* synthetic */ boolean f() {
        return super.f();
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0339z
    public void g(AbstractC0320f abstractC0320f) {
        i();
        this.f3870f.add(abstractC0320f);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0317c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public void add(int i3, String str) {
        i();
        this.f3870f.add(i3, str);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public String get(int i3) {
        Object obj = this.f3870f.get(i3);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC0320f) {
            AbstractC0320f abstractC0320f = (AbstractC0320f) obj;
            String y3 = abstractC0320f.y();
            if (abstractC0320f.q()) {
                this.f3870f.set(i3, y3);
            }
            return y3;
        }
        byte[] bArr = (byte[]) obj;
        String j3 = AbstractC0334u.j(bArr);
        if (AbstractC0334u.g(bArr)) {
            this.f3870f.set(i3, j3);
        }
        return j3;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0334u.b
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public C0338y d(int i3) {
        if (i3 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i3);
        arrayList.addAll(this.f3870f);
        return new C0338y(arrayList);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public String remove(int i3) {
        i();
        Object remove = this.f3870f.remove(i3);
        ((AbstractList) this).modCount++;
        return k(remove);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public String set(int i3, String str) {
        i();
        return k(this.f3870f.set(i3, str));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0317c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0317c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f3870f.size();
    }

    public C0338y(int i3) {
        this(new ArrayList(i3));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0317c, java.util.AbstractList, java.util.List
    public boolean addAll(int i3, Collection collection) {
        i();
        if (collection instanceof InterfaceC0339z) {
            collection = ((InterfaceC0339z) collection).e();
        }
        boolean addAll = this.f3870f.addAll(i3, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0317c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public C0338y(ArrayList arrayList) {
        this.f3870f = arrayList;
    }
}
