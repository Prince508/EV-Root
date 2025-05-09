package O2;

import K2.I;
import K2.J;
import K2.K;
import K2.M;
import java.util.ArrayList;
import r2.u;
import t2.AbstractC0733c;

/* loaded from: classes.dex */
public abstract class e implements k {

    /* renamed from: e, reason: collision with root package name */
    public final s2.i f1610e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1611f;

    /* renamed from: g, reason: collision with root package name */
    public final M2.a f1612g;

    public static final class a extends u2.k implements B2.p {

        /* renamed from: i, reason: collision with root package name */
        public int f1613i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f1614j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ N2.e f1615k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ e f1616l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(N2.e eVar, e eVar2, s2.e eVar3) {
            super(2, eVar3);
            this.f1615k = eVar;
            this.f1616l = eVar2;
        }

        @Override // u2.AbstractC0748a
        public final s2.e a(Object obj, s2.e eVar) {
            a aVar = new a(this.f1615k, this.f1616l, eVar);
            aVar.f1614j = obj;
            return aVar;
        }

        @Override // u2.AbstractC0748a
        public final Object l(Object obj) {
            Object c3 = AbstractC0733c.c();
            int i3 = this.f1613i;
            if (i3 == 0) {
                q2.i.b(obj);
                I i4 = (I) this.f1614j;
                N2.e eVar = this.f1615k;
                M2.s i5 = this.f1616l.i(i4);
                this.f1613i = 1;
                if (N2.f.c(eVar, i5, this) == c3) {
                    return c3;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q2.i.b(obj);
            }
            return q2.n.f8874a;
        }

        @Override // B2.p
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public final Object h(I i3, s2.e eVar) {
            return ((a) a(i3, eVar)).l(q2.n.f8874a);
        }
    }

    public static final class b extends u2.k implements B2.p {

        /* renamed from: i, reason: collision with root package name */
        public int f1617i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f1618j;

        public b(s2.e eVar) {
            super(2, eVar);
        }

        @Override // u2.AbstractC0748a
        public final s2.e a(Object obj, s2.e eVar) {
            b bVar = e.this.new b(eVar);
            bVar.f1618j = obj;
            return bVar;
        }

        @Override // u2.AbstractC0748a
        public final Object l(Object obj) {
            Object c3 = AbstractC0733c.c();
            int i3 = this.f1617i;
            if (i3 == 0) {
                q2.i.b(obj);
                M2.r rVar = (M2.r) this.f1618j;
                e eVar = e.this;
                this.f1617i = 1;
                if (eVar.e(rVar, this) == c3) {
                    return c3;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q2.i.b(obj);
            }
            return q2.n.f8874a;
        }

        @Override // B2.p
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public final Object h(M2.r rVar, s2.e eVar) {
            return ((b) a(rVar, eVar)).l(q2.n.f8874a);
        }
    }

    public e(s2.i iVar, int i3, M2.a aVar) {
        this.f1610e = iVar;
        this.f1611f = i3;
        this.f1612g = aVar;
    }

    public static /* synthetic */ Object d(e eVar, N2.e eVar2, s2.e eVar3) {
        Object b3 = J.b(new a(eVar2, eVar, null), eVar3);
        return b3 == AbstractC0733c.c() ? b3 : q2.n.f8874a;
    }

    @Override // O2.k
    public N2.d a(s2.i iVar, int i3, M2.a aVar) {
        s2.i r3 = iVar.r(this.f1610e);
        if (aVar == M2.a.SUSPEND) {
            int i4 = this.f1611f;
            if (i4 != -3) {
                if (i3 != -3) {
                    if (i4 != -2) {
                        if (i3 != -2) {
                            i3 += i4;
                            if (i3 < 0) {
                                i3 = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i3 = i4;
            }
            aVar = this.f1612g;
        }
        return (C2.k.a(r3, this.f1610e) && i3 == this.f1611f && aVar == this.f1612g) ? this : f(r3, i3, aVar);
    }

    @Override // N2.d
    public Object b(N2.e eVar, s2.e eVar2) {
        return d(this, eVar, eVar2);
    }

    public String c() {
        return null;
    }

    public abstract Object e(M2.r rVar, s2.e eVar);

    public abstract e f(s2.i iVar, int i3, M2.a aVar);

    public final B2.p g() {
        return new b(null);
    }

    public final int h() {
        int i3 = this.f1611f;
        if (i3 == -3) {
            return -2;
        }
        return i3;
    }

    public M2.s i(I i3) {
        return M2.p.c(i3, this.f1610e, h(), this.f1612g, K.ATOMIC, null, g(), 16, null);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String c3 = c();
        if (c3 != null) {
            arrayList.add(c3);
        }
        if (this.f1610e != s2.j.f9292e) {
            arrayList.add("context=" + this.f1610e);
        }
        if (this.f1611f != -3) {
            arrayList.add("capacity=" + this.f1611f);
        }
        if (this.f1612g != M2.a.SUSPEND) {
            arrayList.add("onBufferOverflow=" + this.f1612g);
        }
        return M.a(this) + '[' + u.t(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }
}
