package androidx.recyclerview.widget;

import android.view.View;

/* loaded from: classes.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public final b f4623a;

    /* renamed from: b, reason: collision with root package name */
    public a f4624b = new a();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f4625a = 0;

        /* renamed from: b, reason: collision with root package name */
        public int f4626b;

        /* renamed from: c, reason: collision with root package name */
        public int f4627c;

        /* renamed from: d, reason: collision with root package name */
        public int f4628d;

        /* renamed from: e, reason: collision with root package name */
        public int f4629e;

        public void a(int i3) {
            this.f4625a = i3 | this.f4625a;
        }

        public boolean b() {
            int i3 = this.f4625a;
            if ((i3 & 7) != 0 && (i3 & c(this.f4628d, this.f4626b)) == 0) {
                return false;
            }
            int i4 = this.f4625a;
            if ((i4 & 112) != 0 && (i4 & (c(this.f4628d, this.f4627c) << 4)) == 0) {
                return false;
            }
            int i5 = this.f4625a;
            if ((i5 & 1792) != 0 && (i5 & (c(this.f4629e, this.f4626b) << 8)) == 0) {
                return false;
            }
            int i6 = this.f4625a;
            return (i6 & 28672) == 0 || (i6 & (c(this.f4629e, this.f4627c) << 12)) != 0;
        }

        public int c(int i3, int i4) {
            if (i3 > i4) {
                return 1;
            }
            return i3 == i4 ? 2 : 4;
        }

        public void d() {
            this.f4625a = 0;
        }

        public void e(int i3, int i4, int i5, int i6) {
            this.f4626b = i3;
            this.f4627c = i4;
            this.f4628d = i5;
            this.f4629e = i6;
        }
    }

    public interface b {
        View a(int i3);

        int b();

        int c();

        int d(View view);

        int e(View view);
    }

    public o(b bVar) {
        this.f4623a = bVar;
    }

    public View a(int i3, int i4, int i5, int i6) {
        int c3 = this.f4623a.c();
        int b3 = this.f4623a.b();
        int i7 = i4 > i3 ? 1 : -1;
        View view = null;
        while (i3 != i4) {
            View a3 = this.f4623a.a(i3);
            this.f4624b.e(c3, b3, this.f4623a.e(a3), this.f4623a.d(a3));
            if (i5 != 0) {
                this.f4624b.d();
                this.f4624b.a(i5);
                if (this.f4624b.b()) {
                    return a3;
                }
            }
            if (i6 != 0) {
                this.f4624b.d();
                this.f4624b.a(i6);
                if (this.f4624b.b()) {
                    view = a3;
                }
            }
            i3 += i7;
        }
        return view;
    }

    public boolean b(View view, int i3) {
        this.f4624b.e(this.f4623a.c(), this.f4623a.b(), this.f4623a.e(view), this.f4623a.d(view));
        if (i3 == 0) {
            return false;
        }
        this.f4624b.d();
        this.f4624b.a(i3);
        return this.f4624b.b();
    }
}
