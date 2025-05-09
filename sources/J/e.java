package J;

import C2.k;

/* loaded from: classes.dex */
public class e implements d {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f834a;

    /* renamed from: b, reason: collision with root package name */
    public int f835b;

    public e(int i3) {
        if (i3 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f834a = new Object[i3];
    }

    @Override // J.d
    public boolean a(Object obj) {
        k.e(obj, "instance");
        if (c(obj)) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i3 = this.f835b;
        Object[] objArr = this.f834a;
        if (i3 >= objArr.length) {
            return false;
        }
        objArr[i3] = obj;
        this.f835b = i3 + 1;
        return true;
    }

    @Override // J.d
    public Object b() {
        int i3 = this.f835b;
        if (i3 <= 0) {
            return null;
        }
        int i4 = i3 - 1;
        Object obj = this.f834a[i4];
        k.c(obj, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool");
        this.f834a[i4] = null;
        this.f835b--;
        return obj;
    }

    public final boolean c(Object obj) {
        int i3 = this.f835b;
        for (int i4 = 0; i4 < i3; i4++) {
            if (this.f834a[i4] == obj) {
                return true;
            }
        }
        return false;
    }
}
