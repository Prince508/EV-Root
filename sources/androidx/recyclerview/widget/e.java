package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: i, reason: collision with root package name */
    public static final ThreadLocal f4574i = new ThreadLocal();

    /* renamed from: j, reason: collision with root package name */
    public static Comparator f4575j = new a();

    /* renamed from: f, reason: collision with root package name */
    public long f4577f;

    /* renamed from: g, reason: collision with root package name */
    public long f4578g;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f4576e = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f4579h = new ArrayList();

    public static class a implements Comparator {
        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            RecyclerView recyclerView = cVar.f4587d;
            if ((recyclerView == null) != (cVar2.f4587d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z3 = cVar.f4584a;
            if (z3 != cVar2.f4584a) {
                return z3 ? -1 : 1;
            }
            int i3 = cVar2.f4585b - cVar.f4585b;
            if (i3 != 0) {
                return i3;
            }
            int i4 = cVar.f4586c - cVar2.f4586c;
            if (i4 != 0) {
                return i4;
            }
            return 0;
        }
    }

    public static class b implements RecyclerView.o.c {

        /* renamed from: a, reason: collision with root package name */
        public int f4580a;

        /* renamed from: b, reason: collision with root package name */
        public int f4581b;

        /* renamed from: c, reason: collision with root package name */
        public int[] f4582c;

        /* renamed from: d, reason: collision with root package name */
        public int f4583d;

        @Override // androidx.recyclerview.widget.RecyclerView.o.c
        public void a(int i3, int i4) {
            if (i3 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i4 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i5 = this.f4583d;
            int i6 = i5 * 2;
            int[] iArr = this.f4582c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f4582c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i6 >= iArr.length) {
                int[] iArr3 = new int[i5 * 4];
                this.f4582c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f4582c;
            iArr4[i6] = i3;
            iArr4[i6 + 1] = i4;
            this.f4583d++;
        }

        public void b() {
            int[] iArr = this.f4582c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f4583d = 0;
        }

        public void c(RecyclerView recyclerView, boolean z3) {
            this.f4583d = 0;
            int[] iArr = this.f4582c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.o oVar = recyclerView.f4274q;
            if (recyclerView.f4272p == null || oVar == null || !oVar.y0()) {
                return;
            }
            if (z3) {
                if (!recyclerView.f4256h.p()) {
                    oVar.u(recyclerView.f4272p.c(), this);
                }
            } else if (!recyclerView.k0()) {
                oVar.t(this.f4580a, this.f4581b, recyclerView.f4263k0, this);
            }
            int i3 = this.f4583d;
            if (i3 > oVar.f4350m) {
                oVar.f4350m = i3;
                oVar.f4351n = z3;
                recyclerView.f4252f.K();
            }
        }

        public boolean d(int i3) {
            if (this.f4582c != null) {
                int i4 = this.f4583d * 2;
                for (int i5 = 0; i5 < i4; i5 += 2) {
                    if (this.f4582c[i5] == i3) {
                        return true;
                    }
                }
            }
            return false;
        }

        public void e(int i3, int i4) {
            this.f4580a = i3;
            this.f4581b = i4;
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public boolean f4584a;

        /* renamed from: b, reason: collision with root package name */
        public int f4585b;

        /* renamed from: c, reason: collision with root package name */
        public int f4586c;

        /* renamed from: d, reason: collision with root package name */
        public RecyclerView f4587d;

        /* renamed from: e, reason: collision with root package name */
        public int f4588e;

        public void a() {
            this.f4584a = false;
            this.f4585b = 0;
            this.f4586c = 0;
            this.f4587d = null;
            this.f4588e = 0;
        }
    }

    public static boolean e(RecyclerView recyclerView, int i3) {
        int j3 = recyclerView.f4258i.j();
        for (int i4 = 0; i4 < j3; i4++) {
            RecyclerView.C e02 = RecyclerView.e0(recyclerView.f4258i.i(i4));
            if (e02.f4304c == i3 && !e02.t()) {
                return true;
            }
        }
        return false;
    }

    public void a(RecyclerView recyclerView) {
        this.f4576e.add(recyclerView);
    }

    public final void b() {
        c cVar;
        int size = this.f4576e.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView = (RecyclerView) this.f4576e.get(i4);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.f4261j0.c(recyclerView, false);
                i3 += recyclerView.f4261j0.f4583d;
            }
        }
        this.f4579h.ensureCapacity(i3);
        int i5 = 0;
        for (int i6 = 0; i6 < size; i6++) {
            RecyclerView recyclerView2 = (RecyclerView) this.f4576e.get(i6);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.f4261j0;
                int abs = Math.abs(bVar.f4580a) + Math.abs(bVar.f4581b);
                for (int i7 = 0; i7 < bVar.f4583d * 2; i7 += 2) {
                    if (i5 >= this.f4579h.size()) {
                        cVar = new c();
                        this.f4579h.add(cVar);
                    } else {
                        cVar = (c) this.f4579h.get(i5);
                    }
                    int[] iArr = bVar.f4582c;
                    int i8 = iArr[i7 + 1];
                    cVar.f4584a = i8 <= abs;
                    cVar.f4585b = abs;
                    cVar.f4586c = i8;
                    cVar.f4587d = recyclerView2;
                    cVar.f4588e = iArr[i7];
                    i5++;
                }
            }
        }
        Collections.sort(this.f4579h, f4575j);
    }

    public final void c(c cVar, long j3) {
        RecyclerView.C i3 = i(cVar.f4587d, cVar.f4588e, cVar.f4584a ? Long.MAX_VALUE : j3);
        if (i3 == null || i3.f4303b == null || !i3.s() || i3.t()) {
            return;
        }
        h((RecyclerView) i3.f4303b.get(), j3);
    }

    public final void d(long j3) {
        for (int i3 = 0; i3 < this.f4579h.size(); i3++) {
            c cVar = (c) this.f4579h.get(i3);
            if (cVar.f4587d == null) {
                return;
            }
            c(cVar, j3);
            cVar.a();
        }
    }

    public void f(RecyclerView recyclerView, int i3, int i4) {
        if (recyclerView.isAttachedToWindow() && this.f4577f == 0) {
            this.f4577f = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.f4261j0.e(i3, i4);
    }

    public void g(long j3) {
        b();
        d(j3);
    }

    public final void h(RecyclerView recyclerView, long j3) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.f4229G && recyclerView.f4258i.j() != 0) {
            recyclerView.S0();
        }
        b bVar = recyclerView.f4261j0;
        bVar.c(recyclerView, true);
        if (bVar.f4583d != 0) {
            try {
                G.d.a("RV Nested Prefetch");
                recyclerView.f4263k0.f(recyclerView.f4272p);
                for (int i3 = 0; i3 < bVar.f4583d * 2; i3 += 2) {
                    i(recyclerView, bVar.f4582c[i3], j3);
                }
            } finally {
                G.d.b();
            }
        }
    }

    public final RecyclerView.C i(RecyclerView recyclerView, int i3, long j3) {
        if (e(recyclerView, i3)) {
            return null;
        }
        RecyclerView.u uVar = recyclerView.f4252f;
        try {
            recyclerView.E0();
            RecyclerView.C I3 = uVar.I(i3, false, j3);
            if (I3 != null) {
                if (!I3.s() || I3.t()) {
                    uVar.a(I3, false);
                } else {
                    uVar.B(I3.f4302a);
                }
            }
            recyclerView.G0(false);
            return I3;
        } catch (Throwable th) {
            recyclerView.G0(false);
            throw th;
        }
    }

    public void j(RecyclerView recyclerView) {
        this.f4576e.remove(recyclerView);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            G.d.a("RV Prefetch");
            if (!this.f4576e.isEmpty()) {
                int size = this.f4576e.size();
                long j3 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    RecyclerView recyclerView = (RecyclerView) this.f4576e.get(i3);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j3 = Math.max(recyclerView.getDrawingTime(), j3);
                    }
                }
                if (j3 != 0) {
                    g(TimeUnit.MILLISECONDS.toNanos(j3) + this.f4578g);
                }
            }
        } finally {
            this.f4577f = 0L;
            G.d.b();
        }
    }
}
