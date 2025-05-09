package T2;

import B2.q;
import C2.l;
import K2.AbstractC0249o;
import K2.C0245m;
import K2.InterfaceC0243l;
import K2.M;
import K2.N0;
import P2.C;
import P2.F;
import j.AbstractC0515e;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p.AbstractC0657b;
import q2.n;
import s2.i;
import t2.AbstractC0732b;
import t2.AbstractC0733c;
import u2.h;

/* loaded from: classes.dex */
public class b extends d implements T2.a {

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f2059i = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "owner");

    /* renamed from: h, reason: collision with root package name */
    public final q f2060h;
    private volatile Object owner;

    public final class a implements InterfaceC0243l, N0 {

        /* renamed from: e, reason: collision with root package name */
        public final C0245m f2061e;

        /* renamed from: f, reason: collision with root package name */
        public final Object f2062f;

        /* renamed from: T2.b$a$a, reason: collision with other inner class name */
        public static final class C0057a extends l implements B2.l {

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ b f2064f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ a f2065g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0057a(b bVar, a aVar) {
                super(1);
                this.f2064f = bVar;
                this.f2065g = aVar;
            }

            public final void a(Throwable th) {
                this.f2064f.a(this.f2065g.f2062f);
            }

            @Override // B2.l
            public /* bridge */ /* synthetic */ Object j(Object obj) {
                a((Throwable) obj);
                return n.f8874a;
            }
        }

        /* renamed from: T2.b$a$b, reason: collision with other inner class name */
        public static final class C0058b extends l implements B2.l {

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ b f2066f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ a f2067g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0058b(b bVar, a aVar) {
                super(1);
                this.f2066f = bVar;
                this.f2067g = aVar;
            }

            public final void a(Throwable th) {
                b.f2059i.set(this.f2066f, this.f2067g.f2062f);
                this.f2066f.a(this.f2067g.f2062f);
            }

            @Override // B2.l
            public /* bridge */ /* synthetic */ Object j(Object obj) {
                a((Throwable) obj);
                return n.f8874a;
            }
        }

        public a(C0245m c0245m, Object obj) {
            this.f2061e = c0245m;
            this.f2062f = obj;
        }

        @Override // K2.InterfaceC0243l
        public void G(B2.l lVar) {
            this.f2061e.G(lVar);
        }

        @Override // K2.InterfaceC0243l
        public void I(Object obj) {
            this.f2061e.I(obj);
        }

        @Override // K2.N0
        public void a(C c3, int i3) {
            this.f2061e.a(c3, i3);
        }

        @Override // K2.InterfaceC0243l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void v(n nVar, B2.l lVar) {
            b.f2059i.set(b.this, this.f2062f);
            this.f2061e.v(nVar, new C0057a(b.this, this));
        }

        @Override // s2.e
        public i c() {
            return this.f2061e.c();
        }

        @Override // K2.InterfaceC0243l
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Object z(n nVar, Object obj, B2.l lVar) {
            Object z3 = this.f2061e.z(nVar, obj, new C0058b(b.this, this));
            if (z3 != null) {
                b.f2059i.set(b.this, this.f2062f);
            }
            return z3;
        }

        @Override // s2.e
        public void u(Object obj) {
            this.f2061e.u(obj);
        }
    }

    /* renamed from: T2.b$b, reason: collision with other inner class name */
    public static final class C0059b extends l implements q {

        /* renamed from: T2.b$b$a */
        public static final class a extends l implements B2.l {

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ b f2069f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ Object f2070g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, Object obj) {
                super(1);
                this.f2069f = bVar;
                this.f2070g = obj;
            }

            public final void a(Throwable th) {
                this.f2069f.a(this.f2070g);
            }

            @Override // B2.l
            public /* bridge */ /* synthetic */ Object j(Object obj) {
                a((Throwable) obj);
                return n.f8874a;
            }
        }

        public C0059b() {
            super(3);
        }

        public final B2.l a(S2.a aVar, Object obj, Object obj2) {
            return new a(b.this, obj);
        }

        @Override // B2.q
        public /* bridge */ /* synthetic */ Object g(Object obj, Object obj2, Object obj3) {
            AbstractC0515e.a(obj);
            return a(null, obj2, obj3);
        }
    }

    public b(boolean z3) {
        super(1, z3 ? 1 : 0);
        this.owner = z3 ? null : c.f2071a;
        this.f2060h = new C0059b();
    }

    public static /* synthetic */ Object o(b bVar, Object obj, s2.e eVar) {
        if (bVar.q(obj)) {
            return n.f8874a;
        }
        Object p3 = bVar.p(obj, eVar);
        return p3 == AbstractC0733c.c() ? p3 : n.f8874a;
    }

    @Override // T2.a
    public void a(Object obj) {
        F f3;
        F f4;
        while (n()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2059i;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            f3 = c.f2071a;
            if (obj2 != f3) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                f4 = c.f2071a;
                if (AbstractC0657b.a(atomicReferenceFieldUpdater, this, obj2, f4)) {
                    h();
                    return;
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    @Override // T2.a
    public Object b(Object obj, s2.e eVar) {
        return o(this, obj, eVar);
    }

    public boolean m(Object obj) {
        F f3;
        while (n()) {
            Object obj2 = f2059i.get(this);
            f3 = c.f2071a;
            if (obj2 != f3) {
                return obj2 == obj;
            }
        }
        return false;
    }

    public boolean n() {
        return g() == 0;
    }

    public final Object p(Object obj, s2.e eVar) {
        C0245m b3 = AbstractC0249o.b(AbstractC0732b.b(eVar));
        try {
            c(new a(b3, obj));
            Object w3 = b3.w();
            if (w3 == AbstractC0733c.c()) {
                h.c(eVar);
            }
            return w3 == AbstractC0733c.c() ? w3 : n.f8874a;
        } catch (Throwable th) {
            b3.L();
            throw th;
        }
    }

    public boolean q(Object obj) {
        int r3 = r(obj);
        if (r3 == 0) {
            return true;
        }
        if (r3 == 1) {
            return false;
        }
        if (r3 != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    public final int r(Object obj) {
        while (!i()) {
            if (obj == null) {
                return 1;
            }
            if (m(obj)) {
                return 2;
            }
            if (n()) {
                return 1;
            }
        }
        f2059i.set(this, obj);
        return 0;
    }

    public String toString() {
        return "Mutex@" + M.b(this) + "[isLocked=" + n() + ",owner=" + f2059i.get(this) + ']';
    }
}
