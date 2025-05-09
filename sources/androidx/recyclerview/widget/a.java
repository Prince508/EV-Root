package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class a implements h.a {

    /* renamed from: a, reason: collision with root package name */
    public J.d f4470a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f4471b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f4472c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0096a f4473d;

    /* renamed from: e, reason: collision with root package name */
    public Runnable f4474e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f4475f;

    /* renamed from: g, reason: collision with root package name */
    public final h f4476g;

    /* renamed from: h, reason: collision with root package name */
    public int f4477h;

    /* renamed from: androidx.recyclerview.widget.a$a, reason: collision with other inner class name */
    public interface InterfaceC0096a {
        void a(int i3, int i4);

        void b(b bVar);

        RecyclerView.C c(int i3);

        void d(int i3, int i4);

        void e(int i3, int i4);

        void f(b bVar);

        void g(int i3, int i4);

        void h(int i3, int i4, Object obj);
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f4478a;

        /* renamed from: b, reason: collision with root package name */
        public int f4479b;

        /* renamed from: c, reason: collision with root package name */
        public Object f4480c;

        /* renamed from: d, reason: collision with root package name */
        public int f4481d;

        public b(int i3, int i4, int i5, Object obj) {
            this.f4478a = i3;
            this.f4479b = i4;
            this.f4481d = i5;
            this.f4480c = obj;
        }

        public String a() {
            int i3 = this.f4478a;
            return i3 != 1 ? i3 != 2 ? i3 != 4 ? i3 != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            int i3 = this.f4478a;
            if (i3 != bVar.f4478a) {
                return false;
            }
            if (i3 == 8 && Math.abs(this.f4481d - this.f4479b) == 1 && this.f4481d == bVar.f4479b && this.f4479b == bVar.f4481d) {
                return true;
            }
            if (this.f4481d != bVar.f4481d || this.f4479b != bVar.f4479b) {
                return false;
            }
            Object obj2 = this.f4480c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f4480c)) {
                    return false;
                }
            } else if (bVar.f4480c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f4478a * 31) + this.f4479b) * 31) + this.f4481d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + a() + ",s:" + this.f4479b + "c:" + this.f4481d + ",p:" + this.f4480c + "]";
        }
    }

    public a(InterfaceC0096a interfaceC0096a) {
        this(interfaceC0096a, false);
    }

    @Override // androidx.recyclerview.widget.h.a
    public void a(b bVar) {
        if (this.f4475f) {
            return;
        }
        bVar.f4480c = null;
        this.f4470a.a(bVar);
    }

    @Override // androidx.recyclerview.widget.h.a
    public b b(int i3, int i4, int i5, Object obj) {
        b bVar = (b) this.f4470a.b();
        if (bVar == null) {
            return new b(i3, i4, i5, obj);
        }
        bVar.f4478a = i3;
        bVar.f4479b = i4;
        bVar.f4481d = i5;
        bVar.f4480c = obj;
        return bVar;
    }

    public final void c(b bVar) {
        r(bVar);
    }

    public final void d(b bVar) {
        r(bVar);
    }

    public int e(int i3) {
        int size = this.f4471b.size();
        for (int i4 = 0; i4 < size; i4++) {
            b bVar = (b) this.f4471b.get(i4);
            int i5 = bVar.f4478a;
            if (i5 != 1) {
                if (i5 == 2) {
                    int i6 = bVar.f4479b;
                    if (i6 <= i3) {
                        int i7 = bVar.f4481d;
                        if (i6 + i7 > i3) {
                            return -1;
                        }
                        i3 -= i7;
                    } else {
                        continue;
                    }
                } else if (i5 == 8) {
                    int i8 = bVar.f4479b;
                    if (i8 == i3) {
                        i3 = bVar.f4481d;
                    } else {
                        if (i8 < i3) {
                            i3--;
                        }
                        if (bVar.f4481d <= i3) {
                            i3++;
                        }
                    }
                }
            } else if (bVar.f4479b <= i3) {
                i3 += bVar.f4481d;
            }
        }
        return i3;
    }

    public final void f(b bVar) {
        boolean z3;
        char c3;
        int i3 = bVar.f4479b;
        int i4 = bVar.f4481d + i3;
        char c4 = 65535;
        int i5 = i3;
        int i6 = 0;
        while (i5 < i4) {
            if (this.f4473d.c(i5) != null || h(i5)) {
                if (c4 == 0) {
                    k(b(2, i3, i6, null));
                    z3 = true;
                } else {
                    z3 = false;
                }
                c3 = 1;
            } else {
                if (c4 == 1) {
                    r(b(2, i3, i6, null));
                    z3 = true;
                } else {
                    z3 = false;
                }
                c3 = 0;
            }
            if (z3) {
                i5 -= i6;
                i4 -= i6;
                i6 = 1;
            } else {
                i6++;
            }
            i5++;
            c4 = c3;
        }
        if (i6 != bVar.f4481d) {
            a(bVar);
            bVar = b(2, i3, i6, null);
        }
        if (c4 == 0) {
            k(bVar);
        } else {
            r(bVar);
        }
    }

    public final void g(b bVar) {
        int i3 = bVar.f4479b;
        int i4 = bVar.f4481d + i3;
        int i5 = 0;
        boolean z3 = -1;
        int i6 = i3;
        while (i3 < i4) {
            if (this.f4473d.c(i3) != null || h(i3)) {
                if (!z3) {
                    k(b(4, i6, i5, bVar.f4480c));
                    i6 = i3;
                    i5 = 0;
                }
                z3 = true;
            } else {
                if (z3) {
                    r(b(4, i6, i5, bVar.f4480c));
                    i6 = i3;
                    i5 = 0;
                }
                z3 = false;
            }
            i5++;
            i3++;
        }
        if (i5 != bVar.f4481d) {
            Object obj = bVar.f4480c;
            a(bVar);
            bVar = b(4, i6, i5, obj);
        }
        if (z3) {
            r(bVar);
        } else {
            k(bVar);
        }
    }

    public final boolean h(int i3) {
        int size = this.f4472c.size();
        for (int i4 = 0; i4 < size; i4++) {
            b bVar = (b) this.f4472c.get(i4);
            int i5 = bVar.f4478a;
            if (i5 == 8) {
                if (n(bVar.f4481d, i4 + 1) == i3) {
                    return true;
                }
            } else if (i5 == 1) {
                int i6 = bVar.f4479b;
                int i7 = bVar.f4481d + i6;
                while (i6 < i7) {
                    if (n(i6, i4 + 1) == i3) {
                        return true;
                    }
                    i6++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public void i() {
        int size = this.f4472c.size();
        for (int i3 = 0; i3 < size; i3++) {
            this.f4473d.b((b) this.f4472c.get(i3));
        }
        t(this.f4472c);
        this.f4477h = 0;
    }

    public void j() {
        i();
        int size = this.f4471b.size();
        for (int i3 = 0; i3 < size; i3++) {
            b bVar = (b) this.f4471b.get(i3);
            int i4 = bVar.f4478a;
            if (i4 == 1) {
                this.f4473d.b(bVar);
                this.f4473d.g(bVar.f4479b, bVar.f4481d);
            } else if (i4 == 2) {
                this.f4473d.b(bVar);
                this.f4473d.d(bVar.f4479b, bVar.f4481d);
            } else if (i4 == 4) {
                this.f4473d.b(bVar);
                this.f4473d.h(bVar.f4479b, bVar.f4481d, bVar.f4480c);
            } else if (i4 == 8) {
                this.f4473d.b(bVar);
                this.f4473d.a(bVar.f4479b, bVar.f4481d);
            }
            Runnable runnable = this.f4474e;
            if (runnable != null) {
                runnable.run();
            }
        }
        t(this.f4471b);
        this.f4477h = 0;
    }

    public final void k(b bVar) {
        int i3;
        int i4 = bVar.f4478a;
        if (i4 == 1 || i4 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int v3 = v(bVar.f4479b, i4);
        int i5 = bVar.f4479b;
        int i6 = bVar.f4478a;
        if (i6 == 2) {
            i3 = 0;
        } else {
            if (i6 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + bVar);
            }
            i3 = 1;
        }
        int i7 = 1;
        for (int i8 = 1; i8 < bVar.f4481d; i8++) {
            int v4 = v(bVar.f4479b + (i3 * i8), bVar.f4478a);
            int i9 = bVar.f4478a;
            if (i9 == 2 ? v4 != v3 : !(i9 == 4 && v4 == v3 + 1)) {
                b b3 = b(i9, v3, i7, bVar.f4480c);
                l(b3, i5);
                a(b3);
                if (bVar.f4478a == 4) {
                    i5 += i7;
                }
                i7 = 1;
                v3 = v4;
            } else {
                i7++;
            }
        }
        Object obj = bVar.f4480c;
        a(bVar);
        if (i7 > 0) {
            b b4 = b(bVar.f4478a, v3, i7, obj);
            l(b4, i5);
            a(b4);
        }
    }

    public void l(b bVar, int i3) {
        this.f4473d.f(bVar);
        int i4 = bVar.f4478a;
        if (i4 == 2) {
            this.f4473d.d(i3, bVar.f4481d);
        } else {
            if (i4 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            this.f4473d.h(i3, bVar.f4481d, bVar.f4480c);
        }
    }

    public int m(int i3) {
        return n(i3, 0);
    }

    public int n(int i3, int i4) {
        int size = this.f4472c.size();
        while (i4 < size) {
            b bVar = (b) this.f4472c.get(i4);
            int i5 = bVar.f4478a;
            if (i5 == 8) {
                int i6 = bVar.f4479b;
                if (i6 == i3) {
                    i3 = bVar.f4481d;
                } else {
                    if (i6 < i3) {
                        i3--;
                    }
                    if (bVar.f4481d <= i3) {
                        i3++;
                    }
                }
            } else {
                int i7 = bVar.f4479b;
                if (i7 > i3) {
                    continue;
                } else if (i5 == 2) {
                    int i8 = bVar.f4481d;
                    if (i3 < i7 + i8) {
                        return -1;
                    }
                    i3 -= i8;
                } else if (i5 == 1) {
                    i3 += bVar.f4481d;
                }
            }
            i4++;
        }
        return i3;
    }

    public boolean o(int i3) {
        return (i3 & this.f4477h) != 0;
    }

    public boolean p() {
        return this.f4471b.size() > 0;
    }

    public boolean q() {
        return (this.f4472c.isEmpty() || this.f4471b.isEmpty()) ? false : true;
    }

    public final void r(b bVar) {
        this.f4472c.add(bVar);
        int i3 = bVar.f4478a;
        if (i3 == 1) {
            this.f4473d.g(bVar.f4479b, bVar.f4481d);
            return;
        }
        if (i3 == 2) {
            this.f4473d.e(bVar.f4479b, bVar.f4481d);
            return;
        }
        if (i3 == 4) {
            this.f4473d.h(bVar.f4479b, bVar.f4481d, bVar.f4480c);
        } else {
            if (i3 == 8) {
                this.f4473d.a(bVar.f4479b, bVar.f4481d);
                return;
            }
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    public void s() {
        this.f4476g.b(this.f4471b);
        int size = this.f4471b.size();
        for (int i3 = 0; i3 < size; i3++) {
            b bVar = (b) this.f4471b.get(i3);
            int i4 = bVar.f4478a;
            if (i4 == 1) {
                c(bVar);
            } else if (i4 == 2) {
                f(bVar);
            } else if (i4 == 4) {
                g(bVar);
            } else if (i4 == 8) {
                d(bVar);
            }
            Runnable runnable = this.f4474e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f4471b.clear();
    }

    public void t(List list) {
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            a((b) list.get(i3));
        }
        list.clear();
    }

    public void u() {
        t(this.f4471b);
        t(this.f4472c);
        this.f4477h = 0;
    }

    public final int v(int i3, int i4) {
        int i5;
        int i6;
        for (int size = this.f4472c.size() - 1; size >= 0; size--) {
            b bVar = (b) this.f4472c.get(size);
            int i7 = bVar.f4478a;
            if (i7 == 8) {
                int i8 = bVar.f4479b;
                int i9 = bVar.f4481d;
                if (i8 < i9) {
                    i6 = i8;
                    i5 = i9;
                } else {
                    i5 = i8;
                    i6 = i9;
                }
                if (i3 < i6 || i3 > i5) {
                    if (i3 < i8) {
                        if (i4 == 1) {
                            bVar.f4479b = i8 + 1;
                            bVar.f4481d = i9 + 1;
                        } else if (i4 == 2) {
                            bVar.f4479b = i8 - 1;
                            bVar.f4481d = i9 - 1;
                        }
                    }
                } else if (i6 == i8) {
                    if (i4 == 1) {
                        bVar.f4481d = i9 + 1;
                    } else if (i4 == 2) {
                        bVar.f4481d = i9 - 1;
                    }
                    i3++;
                } else {
                    if (i4 == 1) {
                        bVar.f4479b = i8 + 1;
                    } else if (i4 == 2) {
                        bVar.f4479b = i8 - 1;
                    }
                    i3--;
                }
            } else {
                int i10 = bVar.f4479b;
                if (i10 <= i3) {
                    if (i7 == 1) {
                        i3 -= bVar.f4481d;
                    } else if (i7 == 2) {
                        i3 += bVar.f4481d;
                    }
                } else if (i4 == 1) {
                    bVar.f4479b = i10 + 1;
                } else if (i4 == 2) {
                    bVar.f4479b = i10 - 1;
                }
            }
        }
        for (int size2 = this.f4472c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = (b) this.f4472c.get(size2);
            if (bVar2.f4478a == 8) {
                int i11 = bVar2.f4481d;
                if (i11 == bVar2.f4479b || i11 < 0) {
                    this.f4472c.remove(size2);
                    a(bVar2);
                }
            } else if (bVar2.f4481d <= 0) {
                this.f4472c.remove(size2);
                a(bVar2);
            }
        }
        return i3;
    }

    public a(InterfaceC0096a interfaceC0096a, boolean z3) {
        this.f4470a = new J.e(30);
        this.f4471b = new ArrayList();
        this.f4472c = new ArrayList();
        this.f4477h = 0;
        this.f4473d = interfaceC0096a;
        this.f4475f = z3;
        this.f4476g = new h(this);
    }
}
