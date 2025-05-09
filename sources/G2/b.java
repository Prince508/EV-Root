package G2;

import java.util.NoSuchElementException;
import r2.z;

/* loaded from: classes.dex */
public final class b extends z {

    /* renamed from: e, reason: collision with root package name */
    public final int f587e;

    /* renamed from: f, reason: collision with root package name */
    public final int f588f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f589g;

    /* renamed from: h, reason: collision with root package name */
    public int f590h;

    public b(int i3, int i4, int i5) {
        this.f587e = i5;
        this.f588f = i4;
        boolean z3 = false;
        if (i5 <= 0 ? i3 >= i4 : i3 <= i4) {
            z3 = true;
        }
        this.f589g = z3;
        this.f590h = z3 ? i3 : i4;
    }

    @Override // r2.z
    public int b() {
        int i3 = this.f590h;
        if (i3 != this.f588f) {
            this.f590h = this.f587e + i3;
            return i3;
        }
        if (!this.f589g) {
            throw new NoSuchElementException();
        }
        this.f589g = false;
        return i3;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f589g;
    }
}
