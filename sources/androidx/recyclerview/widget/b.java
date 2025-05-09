package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0097b f4482a;

    /* renamed from: b, reason: collision with root package name */
    public final a f4483b = new a();

    /* renamed from: c, reason: collision with root package name */
    public final List f4484c = new ArrayList();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public long f4485a = 0;

        /* renamed from: b, reason: collision with root package name */
        public a f4486b;

        public void a(int i3) {
            if (i3 < 64) {
                this.f4485a &= ~(1 << i3);
                return;
            }
            a aVar = this.f4486b;
            if (aVar != null) {
                aVar.a(i3 - 64);
            }
        }

        public int b(int i3) {
            a aVar = this.f4486b;
            return aVar == null ? i3 >= 64 ? Long.bitCount(this.f4485a) : Long.bitCount(this.f4485a & ((1 << i3) - 1)) : i3 < 64 ? Long.bitCount(this.f4485a & ((1 << i3) - 1)) : aVar.b(i3 - 64) + Long.bitCount(this.f4485a);
        }

        public final void c() {
            if (this.f4486b == null) {
                this.f4486b = new a();
            }
        }

        public boolean d(int i3) {
            if (i3 < 64) {
                return (this.f4485a & (1 << i3)) != 0;
            }
            c();
            return this.f4486b.d(i3 - 64);
        }

        public void e(int i3, boolean z3) {
            if (i3 >= 64) {
                c();
                this.f4486b.e(i3 - 64, z3);
                return;
            }
            long j3 = this.f4485a;
            boolean z4 = (Long.MIN_VALUE & j3) != 0;
            long j4 = (1 << i3) - 1;
            this.f4485a = ((j3 & (~j4)) << 1) | (j3 & j4);
            if (z3) {
                h(i3);
            } else {
                a(i3);
            }
            if (z4 || this.f4486b != null) {
                c();
                this.f4486b.e(0, z4);
            }
        }

        public boolean f(int i3) {
            if (i3 >= 64) {
                c();
                return this.f4486b.f(i3 - 64);
            }
            long j3 = 1 << i3;
            long j4 = this.f4485a;
            boolean z3 = (j4 & j3) != 0;
            long j5 = j4 & (~j3);
            this.f4485a = j5;
            long j6 = j3 - 1;
            this.f4485a = (j5 & j6) | Long.rotateRight((~j6) & j5, 1);
            a aVar = this.f4486b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f4486b.f(0);
            }
            return z3;
        }

        public void g() {
            this.f4485a = 0L;
            a aVar = this.f4486b;
            if (aVar != null) {
                aVar.g();
            }
        }

        public void h(int i3) {
            if (i3 < 64) {
                this.f4485a |= 1 << i3;
            } else {
                c();
                this.f4486b.h(i3 - 64);
            }
        }

        public String toString() {
            if (this.f4486b == null) {
                return Long.toBinaryString(this.f4485a);
            }
            return this.f4486b.toString() + "xx" + Long.toBinaryString(this.f4485a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.b$b, reason: collision with other inner class name */
    public interface InterfaceC0097b {
        View a(int i3);

        void b(View view);

        void c(int i3);

        void d();

        RecyclerView.C e(View view);

        void f(int i3);

        void g(View view);

        void h(View view, int i3, ViewGroup.LayoutParams layoutParams);

        void i(View view, int i3);

        int j(View view);

        int k();
    }

    public b(InterfaceC0097b interfaceC0097b) {
        this.f4482a = interfaceC0097b;
    }

    public void a(View view, int i3, boolean z3) {
        int k3 = i3 < 0 ? this.f4482a.k() : h(i3);
        this.f4483b.e(k3, z3);
        if (z3) {
            l(view);
        }
        this.f4482a.i(view, k3);
    }

    public void b(View view, boolean z3) {
        a(view, -1, z3);
    }

    public void c(View view, int i3, ViewGroup.LayoutParams layoutParams, boolean z3) {
        int k3 = i3 < 0 ? this.f4482a.k() : h(i3);
        this.f4483b.e(k3, z3);
        if (z3) {
            l(view);
        }
        this.f4482a.h(view, k3, layoutParams);
    }

    public void d(int i3) {
        int h3 = h(i3);
        this.f4483b.f(h3);
        this.f4482a.f(h3);
    }

    public View e(int i3) {
        int size = this.f4484c.size();
        for (int i4 = 0; i4 < size; i4++) {
            View view = (View) this.f4484c.get(i4);
            RecyclerView.C e3 = this.f4482a.e(view);
            if (e3.m() == i3 && !e3.t() && !e3.v()) {
                return view;
            }
        }
        return null;
    }

    public View f(int i3) {
        return this.f4482a.a(h(i3));
    }

    public int g() {
        return this.f4482a.k() - this.f4484c.size();
    }

    public final int h(int i3) {
        if (i3 < 0) {
            return -1;
        }
        int k3 = this.f4482a.k();
        int i4 = i3;
        while (i4 < k3) {
            int b3 = i3 - (i4 - this.f4483b.b(i4));
            if (b3 == 0) {
                while (this.f4483b.d(i4)) {
                    i4++;
                }
                return i4;
            }
            i4 += b3;
        }
        return -1;
    }

    public View i(int i3) {
        return this.f4482a.a(i3);
    }

    public int j() {
        return this.f4482a.k();
    }

    public void k(View view) {
        int j3 = this.f4482a.j(view);
        if (j3 >= 0) {
            this.f4483b.h(j3);
            l(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public final void l(View view) {
        this.f4484c.add(view);
        this.f4482a.b(view);
    }

    public int m(View view) {
        int j3 = this.f4482a.j(view);
        if (j3 == -1 || this.f4483b.d(j3)) {
            return -1;
        }
        return j3 - this.f4483b.b(j3);
    }

    public boolean n(View view) {
        return this.f4484c.contains(view);
    }

    public void o() {
        this.f4483b.g();
        for (int size = this.f4484c.size() - 1; size >= 0; size--) {
            this.f4482a.g((View) this.f4484c.get(size));
            this.f4484c.remove(size);
        }
        this.f4482a.d();
    }

    public void p(View view) {
        int j3 = this.f4482a.j(view);
        if (j3 < 0) {
            return;
        }
        if (this.f4483b.f(j3)) {
            t(view);
        }
        this.f4482a.c(j3);
    }

    public void q(int i3) {
        int h3 = h(i3);
        View a3 = this.f4482a.a(h3);
        if (a3 == null) {
            return;
        }
        if (this.f4483b.f(h3)) {
            t(a3);
        }
        this.f4482a.c(h3);
    }

    public boolean r(View view) {
        int j3 = this.f4482a.j(view);
        if (j3 == -1) {
            t(view);
            return true;
        }
        if (!this.f4483b.d(j3)) {
            return false;
        }
        this.f4483b.f(j3);
        t(view);
        this.f4482a.c(j3);
        return true;
    }

    public void s(View view) {
        int j3 = this.f4482a.j(view);
        if (j3 < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
        if (this.f4483b.d(j3)) {
            this.f4483b.a(j3);
            t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public final boolean t(View view) {
        if (!this.f4484c.remove(view)) {
            return false;
        }
        this.f4482a.g(view);
        return true;
    }

    public String toString() {
        return this.f4483b.toString() + ", hidden list:" + this.f4484c.size();
    }
}
