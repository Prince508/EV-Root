package androidx.lifecycle;

import androidx.lifecycle.AbstractC0347h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import n.C0607a;
import n.b;

/* loaded from: classes.dex */
public class m extends AbstractC0347h {

    /* renamed from: k, reason: collision with root package name */
    public static final a f3990k = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3991b;

    /* renamed from: c, reason: collision with root package name */
    public C0607a f3992c;

    /* renamed from: d, reason: collision with root package name */
    public AbstractC0347h.b f3993d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f3994e;

    /* renamed from: f, reason: collision with root package name */
    public int f3995f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3996g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3997h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f3998i;

    /* renamed from: j, reason: collision with root package name */
    public final N2.n f3999j;

    public static final class a {
        public /* synthetic */ a(C2.g gVar) {
            this();
        }

        public final AbstractC0347h.b a(AbstractC0347h.b bVar, AbstractC0347h.b bVar2) {
            C2.k.e(bVar, "state1");
            return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
        }

        public a() {
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public AbstractC0347h.b f4000a;

        /* renamed from: b, reason: collision with root package name */
        public InterfaceC0349j f4001b;

        public b(k kVar, AbstractC0347h.b bVar) {
            C2.k.e(bVar, "initialState");
            C2.k.b(kVar);
            this.f4001b = n.f(kVar);
            this.f4000a = bVar;
        }

        public final void a(l lVar, AbstractC0347h.a aVar) {
            C2.k.e(aVar, "event");
            AbstractC0347h.b f3 = aVar.f();
            this.f4000a = m.f3990k.a(this.f4000a, f3);
            InterfaceC0349j interfaceC0349j = this.f4001b;
            C2.k.b(lVar);
            interfaceC0349j.d(lVar, aVar);
            this.f4000a = f3;
        }

        public final AbstractC0347h.b b() {
            return this.f4000a;
        }
    }

    public m(l lVar, boolean z3) {
        this.f3991b = z3;
        this.f3992c = new C0607a();
        AbstractC0347h.b bVar = AbstractC0347h.b.INITIALIZED;
        this.f3993d = bVar;
        this.f3998i = new ArrayList();
        this.f3994e = new WeakReference(lVar);
        this.f3999j = N2.t.a(bVar);
    }

    @Override // androidx.lifecycle.AbstractC0347h
    public void a(k kVar) {
        l lVar;
        C2.k.e(kVar, "observer");
        f("addObserver");
        AbstractC0347h.b bVar = this.f3993d;
        AbstractC0347h.b bVar2 = AbstractC0347h.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = AbstractC0347h.b.INITIALIZED;
        }
        b bVar3 = new b(kVar, bVar2);
        if (((b) this.f3992c.o(kVar, bVar3)) == null && (lVar = (l) this.f3994e.get()) != null) {
            boolean z3 = this.f3995f != 0 || this.f3996g;
            AbstractC0347h.b e3 = e(kVar);
            this.f3995f++;
            while (bVar3.b().compareTo(e3) < 0 && this.f3992c.contains(kVar)) {
                l(bVar3.b());
                AbstractC0347h.a b3 = AbstractC0347h.a.Companion.b(bVar3.b());
                if (b3 == null) {
                    throw new IllegalStateException("no event up from " + bVar3.b());
                }
                bVar3.a(lVar, b3);
                k();
                e3 = e(kVar);
            }
            if (!z3) {
                m();
            }
            this.f3995f--;
        }
    }

    @Override // androidx.lifecycle.AbstractC0347h
    public AbstractC0347h.b b() {
        return this.f3993d;
    }

    @Override // androidx.lifecycle.AbstractC0347h
    public void c(k kVar) {
        C2.k.e(kVar, "observer");
        f("removeObserver");
        this.f3992c.p(kVar);
    }

    public final void d(l lVar) {
        Iterator i3 = this.f3992c.i();
        C2.k.d(i3, "observerMap.descendingIterator()");
        while (i3.hasNext() && !this.f3997h) {
            Map.Entry entry = (Map.Entry) i3.next();
            C2.k.d(entry, "next()");
            k kVar = (k) entry.getKey();
            b bVar = (b) entry.getValue();
            while (bVar.b().compareTo(this.f3993d) > 0 && !this.f3997h && this.f3992c.contains(kVar)) {
                AbstractC0347h.a a3 = AbstractC0347h.a.Companion.a(bVar.b());
                if (a3 == null) {
                    throw new IllegalStateException("no event down from " + bVar.b());
                }
                l(a3.f());
                bVar.a(lVar, a3);
                k();
            }
        }
    }

    public final AbstractC0347h.b e(k kVar) {
        b bVar;
        Map.Entry q3 = this.f3992c.q(kVar);
        AbstractC0347h.b bVar2 = null;
        AbstractC0347h.b b3 = (q3 == null || (bVar = (b) q3.getValue()) == null) ? null : bVar.b();
        if (!this.f3998i.isEmpty()) {
            bVar2 = (AbstractC0347h.b) this.f3998i.get(r0.size() - 1);
        }
        a aVar = f3990k;
        return aVar.a(aVar.a(this.f3993d, b3), bVar2);
    }

    public final void f(String str) {
        if (!this.f3991b || m.c.f().b()) {
            return;
        }
        throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
    }

    public final void g(l lVar) {
        b.d l3 = this.f3992c.l();
        C2.k.d(l3, "observerMap.iteratorWithAdditions()");
        while (l3.hasNext() && !this.f3997h) {
            Map.Entry entry = (Map.Entry) l3.next();
            k kVar = (k) entry.getKey();
            b bVar = (b) entry.getValue();
            while (bVar.b().compareTo(this.f3993d) < 0 && !this.f3997h && this.f3992c.contains(kVar)) {
                l(bVar.b());
                AbstractC0347h.a b3 = AbstractC0347h.a.Companion.b(bVar.b());
                if (b3 == null) {
                    throw new IllegalStateException("no event up from " + bVar.b());
                }
                bVar.a(lVar, b3);
                k();
            }
        }
    }

    public void h(AbstractC0347h.a aVar) {
        C2.k.e(aVar, "event");
        f("handleLifecycleEvent");
        j(aVar.f());
    }

    public final boolean i() {
        if (this.f3992c.size() == 0) {
            return true;
        }
        Map.Entry j3 = this.f3992c.j();
        C2.k.b(j3);
        AbstractC0347h.b b3 = ((b) j3.getValue()).b();
        Map.Entry m3 = this.f3992c.m();
        C2.k.b(m3);
        AbstractC0347h.b b4 = ((b) m3.getValue()).b();
        return b3 == b4 && this.f3993d == b4;
    }

    public final void j(AbstractC0347h.b bVar) {
        AbstractC0347h.b bVar2 = this.f3993d;
        if (bVar2 == bVar) {
            return;
        }
        if (bVar2 == AbstractC0347h.b.INITIALIZED && bVar == AbstractC0347h.b.DESTROYED) {
            throw new IllegalStateException(("no event down from " + this.f3993d + " in component " + this.f3994e.get()).toString());
        }
        this.f3993d = bVar;
        if (this.f3996g || this.f3995f != 0) {
            this.f3997h = true;
            return;
        }
        this.f3996g = true;
        m();
        this.f3996g = false;
        if (this.f3993d == AbstractC0347h.b.DESTROYED) {
            this.f3992c = new C0607a();
        }
    }

    public final void k() {
        this.f3998i.remove(r0.size() - 1);
    }

    public final void l(AbstractC0347h.b bVar) {
        this.f3998i.add(bVar);
    }

    public final void m() {
        l lVar = (l) this.f3994e.get();
        if (lVar == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (!i()) {
            this.f3997h = false;
            AbstractC0347h.b bVar = this.f3993d;
            Map.Entry j3 = this.f3992c.j();
            C2.k.b(j3);
            if (bVar.compareTo(((b) j3.getValue()).b()) < 0) {
                d(lVar);
            }
            Map.Entry m3 = this.f3992c.m();
            if (!this.f3997h && m3 != null && this.f3993d.compareTo(((b) m3.getValue()).b()) > 0) {
                g(lVar);
            }
        }
        this.f3997h = false;
        this.f3999j.setValue(b());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public m(l lVar) {
        this(lVar, true);
        C2.k.e(lVar, "provider");
    }
}
