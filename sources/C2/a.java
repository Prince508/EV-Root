package C2;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class a implements Iterator {

    /* renamed from: e, reason: collision with root package name */
    public final Object[] f296e;

    /* renamed from: f, reason: collision with root package name */
    public int f297f;

    public a(Object[] objArr) {
        k.e(objArr, "array");
        this.f296e = objArr;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f297f < this.f296e.length;
    }

    @Override // java.util.Iterator
    public Object next() {
        try {
            Object[] objArr = this.f296e;
            int i3 = this.f297f;
            this.f297f = i3 + 1;
            return objArr[i3];
        } catch (ArrayIndexOutOfBoundsException e3) {
            this.f297f--;
            throw new NoSuchElementException(e3.getMessage());
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
