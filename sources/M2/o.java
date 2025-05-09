package M2;

import K2.N0;
import M2.h;
import P2.O;
import P2.x;
import q2.AbstractC0672a;

/* loaded from: classes.dex */
public class o extends b {

    /* renamed from: q, reason: collision with root package name */
    public final int f1423q;

    /* renamed from: r, reason: collision with root package name */
    public final a f1424r;

    public o(int i3, a aVar, B2.l lVar) {
        super(i3, lVar);
        this.f1423q = i3;
        this.f1424r = aVar;
        if (aVar == a.SUSPEND) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + C2.u.b(b.class).b() + " instead").toString());
        }
        if (i3 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i3 + " was specified").toString());
    }

    public static /* synthetic */ Object H0(o oVar, Object obj, s2.e eVar) {
        O d3;
        Object K02 = oVar.K0(obj, true);
        if (!(K02 instanceof h.a)) {
            return q2.n.f8874a;
        }
        h.c(K02);
        B2.l lVar = oVar.f1386f;
        if (lVar == null || (d3 = x.d(lVar, obj, null, 2, null)) == null) {
            throw oVar.N();
        }
        AbstractC0672a.a(d3, oVar.N());
        throw d3;
    }

    public final Object I0(Object obj, boolean z3) {
        B2.l lVar;
        O d3;
        Object s3 = super.s(obj);
        if (h.f(s3) || h.e(s3)) {
            return s3;
        }
        if (!z3 || (lVar = this.f1386f) == null || (d3 = x.d(lVar, obj, null, 2, null)) == null) {
            return h.f1418a.c(q2.n.f8874a);
        }
        throw d3;
    }

    public final Object J0(Object obj) {
        j jVar;
        int i3;
        o oVar;
        Object obj2 = c.f1397d;
        j jVar2 = (j) b.f1380l.get(this);
        while (true) {
            long andIncrement = b.f1376h.getAndIncrement(this);
            long j3 = andIncrement & 1152921504606846975L;
            boolean X2 = X(andIncrement);
            int i4 = c.f1395b;
            long j4 = j3 / i4;
            int i5 = (int) (j3 % i4);
            if (jVar2.f1739g != j4) {
                jVar = I(j4, jVar2);
                if (jVar != null) {
                    oVar = this;
                    i3 = i5;
                } else if (X2) {
                    return h.f1418a.a(N());
                }
            } else {
                jVar = jVar2;
                i3 = i5;
                oVar = this;
            }
            Object obj3 = obj;
            int C02 = oVar.C0(jVar, i3, obj3, j3, obj2, X2);
            jVar2 = jVar;
            if (C02 == 0) {
                jVar2.b();
                return h.f1418a.c(q2.n.f8874a);
            }
            if (C02 == 1) {
                return h.f1418a.c(q2.n.f8874a);
            }
            if (C02 == 2) {
                if (X2) {
                    jVar2.p();
                    return h.f1418a.a(N());
                }
                N0 n02 = obj2 instanceof N0 ? (N0) obj2 : null;
                if (n02 != null) {
                    m0(n02, jVar2, i3);
                }
                D((jVar2.f1739g * i4) + i3);
                return h.f1418a.c(q2.n.f8874a);
            }
            if (C02 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (C02 == 4) {
                if (j3 < M()) {
                    jVar2.b();
                }
                return h.f1418a.a(N());
            }
            if (C02 == 5) {
                jVar2.b();
            }
            obj = obj3;
        }
    }

    public final Object K0(Object obj, boolean z3) {
        return this.f1424r == a.DROP_LATEST ? I0(obj, z3) : J0(obj);
    }

    @Override // M2.b
    public boolean Y() {
        return this.f1424r == a.DROP_OLDEST;
    }

    @Override // M2.b, M2.t
    public Object j(Object obj, s2.e eVar) {
        return H0(this, obj, eVar);
    }

    @Override // M2.b, M2.t
    public Object s(Object obj) {
        return K0(obj, false);
    }
}
