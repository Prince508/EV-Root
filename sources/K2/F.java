package K2;

import P2.AbstractC0287n;
import P2.C0283j;
import P2.C0286m;
import s2.AbstractC0722a;
import s2.f;
import s2.i;

/* loaded from: classes.dex */
public abstract class F extends AbstractC0722a implements s2.f {

    /* renamed from: f, reason: collision with root package name */
    public static final a f1153f = new a(null);

    public static final class a extends s2.b {

        /* renamed from: K2.F$a$a, reason: collision with other inner class name */
        public static final class C0032a extends C2.l implements B2.l {

            /* renamed from: f, reason: collision with root package name */
            public static final C0032a f1154f = new C0032a();

            public C0032a() {
                super(1);
            }

            @Override // B2.l
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final F j(i.b bVar) {
                if (bVar instanceof F) {
                    return (F) bVar;
                }
                return null;
            }
        }

        public /* synthetic */ a(C2.g gVar) {
            this();
        }

        public a() {
            super(s2.f.f9290d, C0032a.f1154f);
        }
    }

    public F() {
        super(s2.f.f9290d);
    }

    @Override // s2.f
    public final void B(s2.e eVar) {
        C2.k.c(eVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        ((C0283j) eVar).o();
    }

    @Override // s2.AbstractC0722a, s2.i
    public s2.i H(i.c cVar) {
        return f.a.b(this, cVar);
    }

    @Override // s2.f
    public final s2.e J(s2.e eVar) {
        return new C0283j(this, eVar);
    }

    @Override // s2.AbstractC0722a, s2.i.b, s2.i
    public i.b a(i.c cVar) {
        return f.a.a(this, cVar);
    }

    public abstract void c(s2.i iVar, Runnable runnable);

    public boolean j(s2.i iVar) {
        return true;
    }

    public F m(int i3) {
        AbstractC0287n.a(i3);
        return new C0286m(this, i3);
    }

    public String toString() {
        return M.a(this) + '@' + M.b(this);
    }
}
