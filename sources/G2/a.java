package G2;

import C2.g;
import r2.z;

/* loaded from: classes.dex */
public class a implements Iterable {

    /* renamed from: h, reason: collision with root package name */
    public static final C0013a f583h = new C0013a(null);

    /* renamed from: e, reason: collision with root package name */
    public final int f584e;

    /* renamed from: f, reason: collision with root package name */
    public final int f585f;

    /* renamed from: g, reason: collision with root package name */
    public final int f586g;

    /* renamed from: G2.a$a, reason: collision with other inner class name */
    public static final class C0013a {
        public /* synthetic */ C0013a(g gVar) {
            this();
        }

        public final a a(int i3, int i4, int i5) {
            return new a(i3, i4, i5);
        }

        public C0013a() {
        }
    }

    public a(int i3, int i4, int i5) {
        if (i5 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i5 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f584e = i3;
        this.f585f = w2.c.b(i3, i4, i5);
        this.f586g = i5;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (isEmpty() && ((a) obj).isEmpty()) {
            return true;
        }
        a aVar = (a) obj;
        return this.f584e == aVar.f584e && this.f585f == aVar.f585f && this.f586g == aVar.f586g;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f584e * 31) + this.f585f) * 31) + this.f586g;
    }

    public final int i() {
        return this.f584e;
    }

    public boolean isEmpty() {
        return this.f586g > 0 ? this.f584e > this.f585f : this.f584e < this.f585f;
    }

    public final int j() {
        return this.f585f;
    }

    public final int k() {
        return this.f586g;
    }

    @Override // java.lang.Iterable
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public z iterator() {
        return new b(this.f584e, this.f585f, this.f586g);
    }

    public String toString() {
        StringBuilder sb;
        int i3;
        if (this.f586g > 0) {
            sb = new StringBuilder();
            sb.append(this.f584e);
            sb.append("..");
            sb.append(this.f585f);
            sb.append(" step ");
            i3 = this.f586g;
        } else {
            sb = new StringBuilder();
            sb.append(this.f584e);
            sb.append(" downTo ");
            sb.append(this.f585f);
            sb.append(" step ");
            i3 = -this.f586g;
        }
        sb.append(i3);
        return sb.toString();
    }
}
