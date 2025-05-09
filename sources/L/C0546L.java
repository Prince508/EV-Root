package l;

/* renamed from: l.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0546L {

    /* renamed from: a, reason: collision with root package name */
    public int f8248a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f8249b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f8250c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public int f8251d = Integer.MIN_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public int f8252e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f8253f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8254g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f8255h = false;

    public int a() {
        return this.f8254g ? this.f8248a : this.f8249b;
    }

    public int b() {
        return this.f8248a;
    }

    public int c() {
        return this.f8249b;
    }

    public int d() {
        return this.f8254g ? this.f8249b : this.f8248a;
    }

    public void e(int i3, int i4) {
        this.f8255h = false;
        if (i3 != Integer.MIN_VALUE) {
            this.f8252e = i3;
            this.f8248a = i3;
        }
        if (i4 != Integer.MIN_VALUE) {
            this.f8253f = i4;
            this.f8249b = i4;
        }
    }

    public void f(boolean z3) {
        if (z3 == this.f8254g) {
            return;
        }
        this.f8254g = z3;
        if (!this.f8255h) {
            this.f8248a = this.f8252e;
            this.f8249b = this.f8253f;
            return;
        }
        if (z3) {
            int i3 = this.f8251d;
            if (i3 == Integer.MIN_VALUE) {
                i3 = this.f8252e;
            }
            this.f8248a = i3;
            int i4 = this.f8250c;
            if (i4 == Integer.MIN_VALUE) {
                i4 = this.f8253f;
            }
            this.f8249b = i4;
            return;
        }
        int i5 = this.f8250c;
        if (i5 == Integer.MIN_VALUE) {
            i5 = this.f8252e;
        }
        this.f8248a = i5;
        int i6 = this.f8251d;
        if (i6 == Integer.MIN_VALUE) {
            i6 = this.f8253f;
        }
        this.f8249b = i6;
    }

    public void g(int i3, int i4) {
        this.f8250c = i3;
        this.f8251d = i4;
        this.f8255h = true;
        if (this.f8254g) {
            if (i4 != Integer.MIN_VALUE) {
                this.f8248a = i4;
            }
            if (i3 != Integer.MIN_VALUE) {
                this.f8249b = i3;
                return;
            }
            return;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f8248a = i3;
        }
        if (i4 != Integer.MIN_VALUE) {
            this.f8249b = i4;
        }
    }
}
