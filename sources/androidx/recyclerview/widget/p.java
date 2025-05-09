package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public final o.g f4630a = new o.g();

    /* renamed from: b, reason: collision with root package name */
    public final o.d f4631b = new o.d();

    public static class a {

        /* renamed from: d, reason: collision with root package name */
        public static J.d f4632d = new J.e(20);

        /* renamed from: a, reason: collision with root package name */
        public int f4633a;

        /* renamed from: b, reason: collision with root package name */
        public RecyclerView.l.b f4634b;

        /* renamed from: c, reason: collision with root package name */
        public RecyclerView.l.b f4635c;

        public static void a() {
            while (f4632d.b() != null) {
            }
        }

        public static a b() {
            a aVar = (a) f4632d.b();
            return aVar == null ? new a() : aVar;
        }

        public static void c(a aVar) {
            aVar.f4633a = 0;
            aVar.f4634b = null;
            aVar.f4635c = null;
            f4632d.a(aVar);
        }
    }

    public interface b {
        void a(RecyclerView.C c3);

        void b(RecyclerView.C c3, RecyclerView.l.b bVar, RecyclerView.l.b bVar2);

        void c(RecyclerView.C c3, RecyclerView.l.b bVar, RecyclerView.l.b bVar2);

        void d(RecyclerView.C c3, RecyclerView.l.b bVar, RecyclerView.l.b bVar2);
    }

    public void a(RecyclerView.C c3, RecyclerView.l.b bVar) {
        a aVar = (a) this.f4630a.get(c3);
        if (aVar == null) {
            aVar = a.b();
            this.f4630a.put(c3, aVar);
        }
        aVar.f4633a |= 2;
        aVar.f4634b = bVar;
    }

    public void b(RecyclerView.C c3) {
        a aVar = (a) this.f4630a.get(c3);
        if (aVar == null) {
            aVar = a.b();
            this.f4630a.put(c3, aVar);
        }
        aVar.f4633a |= 1;
    }

    public void c(long j3, RecyclerView.C c3) {
        this.f4631b.j(j3, c3);
    }

    public void d(RecyclerView.C c3, RecyclerView.l.b bVar) {
        a aVar = (a) this.f4630a.get(c3);
        if (aVar == null) {
            aVar = a.b();
            this.f4630a.put(c3, aVar);
        }
        aVar.f4635c = bVar;
        aVar.f4633a |= 8;
    }

    public void e(RecyclerView.C c3, RecyclerView.l.b bVar) {
        a aVar = (a) this.f4630a.get(c3);
        if (aVar == null) {
            aVar = a.b();
            this.f4630a.put(c3, aVar);
        }
        aVar.f4634b = bVar;
        aVar.f4633a |= 4;
    }

    public void f() {
        this.f4630a.clear();
        this.f4631b.a();
    }

    public RecyclerView.C g(long j3) {
        return (RecyclerView.C) this.f4631b.e(j3);
    }

    public boolean h(RecyclerView.C c3) {
        a aVar = (a) this.f4630a.get(c3);
        return (aVar == null || (aVar.f4633a & 1) == 0) ? false : true;
    }

    public boolean i(RecyclerView.C c3) {
        a aVar = (a) this.f4630a.get(c3);
        return (aVar == null || (aVar.f4633a & 4) == 0) ? false : true;
    }

    public void j() {
        a.a();
    }

    public void k(RecyclerView.C c3) {
        p(c3);
    }

    public final RecyclerView.l.b l(RecyclerView.C c3, int i3) {
        a aVar;
        RecyclerView.l.b bVar;
        int f3 = this.f4630a.f(c3);
        if (f3 >= 0 && (aVar = (a) this.f4630a.m(f3)) != null) {
            int i4 = aVar.f4633a;
            if ((i4 & i3) != 0) {
                int i5 = (~i3) & i4;
                aVar.f4633a = i5;
                if (i3 == 4) {
                    bVar = aVar.f4634b;
                } else {
                    if (i3 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    bVar = aVar.f4635c;
                }
                if ((i5 & 12) == 0) {
                    this.f4630a.k(f3);
                    a.c(aVar);
                }
                return bVar;
            }
        }
        return null;
    }

    public RecyclerView.l.b m(RecyclerView.C c3) {
        return l(c3, 8);
    }

    public RecyclerView.l.b n(RecyclerView.C c3) {
        return l(c3, 4);
    }

    public void o(b bVar) {
        for (int size = this.f4630a.size() - 1; size >= 0; size--) {
            RecyclerView.C c3 = (RecyclerView.C) this.f4630a.i(size);
            a aVar = (a) this.f4630a.k(size);
            int i3 = aVar.f4633a;
            if ((i3 & 3) == 3) {
                bVar.a(c3);
            } else if ((i3 & 1) != 0) {
                RecyclerView.l.b bVar2 = aVar.f4634b;
                if (bVar2 == null) {
                    bVar.a(c3);
                } else {
                    bVar.c(c3, bVar2, aVar.f4635c);
                }
            } else if ((i3 & 14) == 14) {
                bVar.b(c3, aVar.f4634b, aVar.f4635c);
            } else if ((i3 & 12) == 12) {
                bVar.d(c3, aVar.f4634b, aVar.f4635c);
            } else if ((i3 & 4) != 0) {
                bVar.c(c3, aVar.f4634b, null);
            } else if ((i3 & 8) != 0) {
                bVar.b(c3, aVar.f4634b, aVar.f4635c);
            }
            a.c(aVar);
        }
    }

    public void p(RecyclerView.C c3) {
        a aVar = (a) this.f4630a.get(c3);
        if (aVar == null) {
            return;
        }
        aVar.f4633a &= -2;
    }

    public void q(RecyclerView.C c3) {
        int m3 = this.f4631b.m() - 1;
        while (true) {
            if (m3 < 0) {
                break;
            }
            if (c3 == this.f4631b.n(m3)) {
                this.f4631b.l(m3);
                break;
            }
            m3--;
        }
        a aVar = (a) this.f4630a.remove(c3);
        if (aVar != null) {
            a.c(aVar);
        }
    }
}
