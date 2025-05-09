package o;

/* loaded from: classes.dex */
public class d implements Cloneable {

    /* renamed from: i, reason: collision with root package name */
    public static final Object f8727i = new Object();

    /* renamed from: e, reason: collision with root package name */
    public boolean f8728e;

    /* renamed from: f, reason: collision with root package name */
    public long[] f8729f;

    /* renamed from: g, reason: collision with root package name */
    public Object[] f8730g;

    /* renamed from: h, reason: collision with root package name */
    public int f8731h;

    public d() {
        this(10);
    }

    public void a() {
        int i3 = this.f8731h;
        Object[] objArr = this.f8730g;
        for (int i4 = 0; i4 < i3; i4++) {
            objArr[i4] = null;
        }
        this.f8731h = 0;
        this.f8728e = false;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public d clone() {
        try {
            d dVar = (d) super.clone();
            dVar.f8729f = (long[]) this.f8729f.clone();
            dVar.f8730g = (Object[]) this.f8730g.clone();
            return dVar;
        } catch (CloneNotSupportedException e3) {
            throw new AssertionError(e3);
        }
    }

    public final void c() {
        int i3 = this.f8731h;
        long[] jArr = this.f8729f;
        Object[] objArr = this.f8730g;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            Object obj = objArr[i5];
            if (obj != f8727i) {
                if (i5 != i4) {
                    jArr[i4] = jArr[i5];
                    objArr[i4] = obj;
                    objArr[i5] = null;
                }
                i4++;
            }
        }
        this.f8728e = false;
        this.f8731h = i4;
    }

    public Object e(long j3) {
        return f(j3, null);
    }

    public Object f(long j3, Object obj) {
        Object obj2;
        int b3 = c.b(this.f8729f, this.f8731h, j3);
        return (b3 < 0 || (obj2 = this.f8730g[b3]) == f8727i) ? obj : obj2;
    }

    public int h(long j3) {
        if (this.f8728e) {
            c();
        }
        return c.b(this.f8729f, this.f8731h, j3);
    }

    public long i(int i3) {
        if (this.f8728e) {
            c();
        }
        return this.f8729f[i3];
    }

    public void j(long j3, Object obj) {
        int b3 = c.b(this.f8729f, this.f8731h, j3);
        if (b3 >= 0) {
            this.f8730g[b3] = obj;
            return;
        }
        int i3 = ~b3;
        int i4 = this.f8731h;
        if (i3 < i4) {
            Object[] objArr = this.f8730g;
            if (objArr[i3] == f8727i) {
                this.f8729f[i3] = j3;
                objArr[i3] = obj;
                return;
            }
        }
        if (this.f8728e && i4 >= this.f8729f.length) {
            c();
            i3 = ~c.b(this.f8729f, this.f8731h, j3);
        }
        int i5 = this.f8731h;
        if (i5 >= this.f8729f.length) {
            int f3 = c.f(i5 + 1);
            long[] jArr = new long[f3];
            Object[] objArr2 = new Object[f3];
            long[] jArr2 = this.f8729f;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f8730g;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f8729f = jArr;
            this.f8730g = objArr2;
        }
        int i6 = this.f8731h;
        if (i6 - i3 != 0) {
            long[] jArr3 = this.f8729f;
            int i7 = i3 + 1;
            System.arraycopy(jArr3, i3, jArr3, i7, i6 - i3);
            Object[] objArr4 = this.f8730g;
            System.arraycopy(objArr4, i3, objArr4, i7, this.f8731h - i3);
        }
        this.f8729f[i3] = j3;
        this.f8730g[i3] = obj;
        this.f8731h++;
    }

    public void k(long j3) {
        int b3 = c.b(this.f8729f, this.f8731h, j3);
        if (b3 >= 0) {
            Object[] objArr = this.f8730g;
            Object obj = objArr[b3];
            Object obj2 = f8727i;
            if (obj != obj2) {
                objArr[b3] = obj2;
                this.f8728e = true;
            }
        }
    }

    public void l(int i3) {
        Object[] objArr = this.f8730g;
        Object obj = objArr[i3];
        Object obj2 = f8727i;
        if (obj != obj2) {
            objArr[i3] = obj2;
            this.f8728e = true;
        }
    }

    public int m() {
        if (this.f8728e) {
            c();
        }
        return this.f8731h;
    }

    public Object n(int i3) {
        if (this.f8728e) {
            c();
        }
        return this.f8730g[i3];
    }

    public String toString() {
        if (m() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f8731h * 28);
        sb.append('{');
        for (int i3 = 0; i3 < this.f8731h; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(i(i3));
            sb.append('=');
            Object n3 = n(i3);
            if (n3 != this) {
                sb.append(n3);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public d(int i3) {
        this.f8728e = false;
        if (i3 == 0) {
            this.f8729f = c.f8725b;
            this.f8730g = c.f8726c;
        } else {
            int f3 = c.f(i3);
            this.f8729f = new long[f3];
            this.f8730g = new Object[f3];
        }
    }
}
