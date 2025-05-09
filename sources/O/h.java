package o;

/* loaded from: classes.dex */
public class h implements Cloneable {

    /* renamed from: i, reason: collision with root package name */
    public static final Object f8762i = new Object();

    /* renamed from: e, reason: collision with root package name */
    public boolean f8763e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f8764f;

    /* renamed from: g, reason: collision with root package name */
    public Object[] f8765g;

    /* renamed from: h, reason: collision with root package name */
    public int f8766h;

    public h() {
        this(10);
    }

    public void a(int i3, Object obj) {
        int i4 = this.f8766h;
        if (i4 != 0 && i3 <= this.f8764f[i4 - 1]) {
            k(i3, obj);
            return;
        }
        if (this.f8763e && i4 >= this.f8764f.length) {
            e();
        }
        int i5 = this.f8766h;
        if (i5 >= this.f8764f.length) {
            int e3 = c.e(i5 + 1);
            int[] iArr = new int[e3];
            Object[] objArr = new Object[e3];
            int[] iArr2 = this.f8764f;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f8765g;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f8764f = iArr;
            this.f8765g = objArr;
        }
        this.f8764f[i5] = i3;
        this.f8765g[i5] = obj;
        this.f8766h = i5 + 1;
    }

    public void b() {
        int i3 = this.f8766h;
        Object[] objArr = this.f8765g;
        for (int i4 = 0; i4 < i3; i4++) {
            objArr[i4] = null;
        }
        this.f8766h = 0;
        this.f8763e = false;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public h clone() {
        try {
            h hVar = (h) super.clone();
            hVar.f8764f = (int[]) this.f8764f.clone();
            hVar.f8765g = (Object[]) this.f8765g.clone();
            return hVar;
        } catch (CloneNotSupportedException e3) {
            throw new AssertionError(e3);
        }
    }

    public final void e() {
        int i3 = this.f8766h;
        int[] iArr = this.f8764f;
        Object[] objArr = this.f8765g;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            Object obj = objArr[i5];
            if (obj != f8762i) {
                if (i5 != i4) {
                    iArr[i4] = iArr[i5];
                    objArr[i4] = obj;
                    objArr[i5] = null;
                }
                i4++;
            }
        }
        this.f8763e = false;
        this.f8766h = i4;
    }

    public Object f(int i3) {
        return h(i3, null);
    }

    public Object h(int i3, Object obj) {
        Object obj2;
        int a3 = c.a(this.f8764f, this.f8766h, i3);
        return (a3 < 0 || (obj2 = this.f8765g[a3]) == f8762i) ? obj : obj2;
    }

    public int i(Object obj) {
        if (this.f8763e) {
            e();
        }
        for (int i3 = 0; i3 < this.f8766h; i3++) {
            if (this.f8765g[i3] == obj) {
                return i3;
            }
        }
        return -1;
    }

    public int j(int i3) {
        if (this.f8763e) {
            e();
        }
        return this.f8764f[i3];
    }

    public void k(int i3, Object obj) {
        int a3 = c.a(this.f8764f, this.f8766h, i3);
        if (a3 >= 0) {
            this.f8765g[a3] = obj;
            return;
        }
        int i4 = ~a3;
        int i5 = this.f8766h;
        if (i4 < i5) {
            Object[] objArr = this.f8765g;
            if (objArr[i4] == f8762i) {
                this.f8764f[i4] = i3;
                objArr[i4] = obj;
                return;
            }
        }
        if (this.f8763e && i5 >= this.f8764f.length) {
            e();
            i4 = ~c.a(this.f8764f, this.f8766h, i3);
        }
        int i6 = this.f8766h;
        if (i6 >= this.f8764f.length) {
            int e3 = c.e(i6 + 1);
            int[] iArr = new int[e3];
            Object[] objArr2 = new Object[e3];
            int[] iArr2 = this.f8764f;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f8765g;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f8764f = iArr;
            this.f8765g = objArr2;
        }
        int i7 = this.f8766h;
        if (i7 - i4 != 0) {
            int[] iArr3 = this.f8764f;
            int i8 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i8, i7 - i4);
            Object[] objArr4 = this.f8765g;
            System.arraycopy(objArr4, i4, objArr4, i8, this.f8766h - i4);
        }
        this.f8764f[i4] = i3;
        this.f8765g[i4] = obj;
        this.f8766h++;
    }

    public int l() {
        if (this.f8763e) {
            e();
        }
        return this.f8766h;
    }

    public Object m(int i3) {
        if (this.f8763e) {
            e();
        }
        return this.f8765g[i3];
    }

    public String toString() {
        if (l() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f8766h * 28);
        sb.append('{');
        for (int i3 = 0; i3 < this.f8766h; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(j(i3));
            sb.append('=');
            Object m3 = m(i3);
            if (m3 != this) {
                sb.append(m3);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public h(int i3) {
        this.f8763e = false;
        if (i3 == 0) {
            this.f8764f = c.f8724a;
            this.f8765g = c.f8726c;
        } else {
            int e3 = c.e(i3);
            this.f8764f = new int[e3];
            this.f8765g = new Object[e3];
        }
    }
}
