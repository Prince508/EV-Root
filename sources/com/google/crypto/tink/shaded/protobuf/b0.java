package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class b0 extends AbstractC0412c implements RandomAccess {

    /* renamed from: h, reason: collision with root package name */
    public static final b0 f5774h;

    /* renamed from: f, reason: collision with root package name */
    public Object[] f5775f;

    /* renamed from: g, reason: collision with root package name */
    public int f5776g;

    static {
        b0 b0Var = new b0(new Object[0], 0);
        f5774h = b0Var;
        b0Var.b();
    }

    public b0(Object[] objArr, int i3) {
        this.f5775f = objArr;
        this.f5776g = i3;
    }

    public static Object[] j(int i3) {
        return new Object[i3];
    }

    public static b0 k() {
        return f5774h;
    }

    private void l(int i3) {
        if (i3 < 0 || i3 >= this.f5776g) {
            throw new IndexOutOfBoundsException(m(i3));
        }
    }

    private String m(int i3) {
        return "Index:" + i3 + ", Size:" + this.f5776g;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0412c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        i();
        int i3 = this.f5776g;
        Object[] objArr = this.f5775f;
        if (i3 == objArr.length) {
            this.f5775f = Arrays.copyOf(objArr, ((i3 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f5775f;
        int i4 = this.f5776g;
        this.f5776g = i4 + 1;
        objArr2[i4] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i3) {
        l(i3);
        return this.f5775f[i3];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0434z.d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public b0 d(int i3) {
        if (i3 >= this.f5776g) {
            return new b0(Arrays.copyOf(this.f5775f, i3), this.f5776g);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0412c, java.util.AbstractList, java.util.List
    public Object remove(int i3) {
        i();
        l(i3);
        Object[] objArr = this.f5775f;
        Object obj = objArr[i3];
        if (i3 < this.f5776g - 1) {
            System.arraycopy(objArr, i3 + 1, objArr, i3, (r2 - i3) - 1);
        }
        this.f5776g--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i3, Object obj) {
        i();
        l(i3);
        Object[] objArr = this.f5775f;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f5776g;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i3, Object obj) {
        int i4;
        i();
        if (i3 >= 0 && i3 <= (i4 = this.f5776g)) {
            Object[] objArr = this.f5775f;
            if (i4 < objArr.length) {
                System.arraycopy(objArr, i3, objArr, i3 + 1, i4 - i3);
            } else {
                Object[] j3 = j(((i4 * 3) / 2) + 1);
                System.arraycopy(this.f5775f, 0, j3, 0, i3);
                System.arraycopy(this.f5775f, i3, j3, i3 + 1, this.f5776g - i3);
                this.f5775f = j3;
            }
            this.f5775f[i3] = obj;
            this.f5776g++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(m(i3));
    }
}
