package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class V extends AbstractC0317c implements RandomAccess {

    /* renamed from: h, reason: collision with root package name */
    public static final V f3588h;

    /* renamed from: f, reason: collision with root package name */
    public Object[] f3589f;

    /* renamed from: g, reason: collision with root package name */
    public int f3590g;

    static {
        V v3 = new V(new Object[0], 0);
        f3588h = v3;
        v3.b();
    }

    public V(Object[] objArr, int i3) {
        this.f3589f = objArr;
        this.f3590g = i3;
    }

    public static Object[] j(int i3) {
        return new Object[i3];
    }

    public static V k() {
        return f3588h;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0317c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        i();
        int i3 = this.f3590g;
        Object[] objArr = this.f3589f;
        if (i3 == objArr.length) {
            this.f3589f = Arrays.copyOf(objArr, ((i3 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f3589f;
        int i4 = this.f3590g;
        this.f3590g = i4 + 1;
        objArr2[i4] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i3) {
        l(i3);
        return this.f3589f[i3];
    }

    public final void l(int i3) {
        if (i3 < 0 || i3 >= this.f3590g) {
            throw new IndexOutOfBoundsException(m(i3));
        }
    }

    public final String m(int i3) {
        return "Index:" + i3 + ", Size:" + this.f3590g;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0334u.b
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public V d(int i3) {
        if (i3 >= this.f3590g) {
            return new V(Arrays.copyOf(this.f3589f, i3), this.f3590g);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public Object remove(int i3) {
        i();
        l(i3);
        Object[] objArr = this.f3589f;
        Object obj = objArr[i3];
        if (i3 < this.f3590g - 1) {
            System.arraycopy(objArr, i3 + 1, objArr, i3, (r2 - i3) - 1);
        }
        this.f3590g--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i3, Object obj) {
        i();
        l(i3);
        Object[] objArr = this.f3589f;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f3590g;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i3, Object obj) {
        int i4;
        i();
        if (i3 >= 0 && i3 <= (i4 = this.f3590g)) {
            Object[] objArr = this.f3589f;
            if (i4 < objArr.length) {
                System.arraycopy(objArr, i3, objArr, i3 + 1, i4 - i3);
            } else {
                Object[] j3 = j(((i4 * 3) / 2) + 1);
                System.arraycopy(this.f3589f, 0, j3, 0, i3);
                System.arraycopy(this.f3589f, i3, j3, i3 + 1, this.f3590g - i3);
                this.f3589f = j3;
            }
            this.f3589f[i3] = obj;
            this.f3590g++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m(i3));
    }
}
