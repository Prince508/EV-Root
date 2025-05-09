package P2;

import K2.I0;
import s2.i;

/* loaded from: classes.dex */
public abstract class J {

    /* renamed from: a, reason: collision with root package name */
    public static final F f1745a = new F("NO_THREAD_ELEMENTS");

    /* renamed from: b, reason: collision with root package name */
    public static final B2.p f1746b = a.f1749f;

    /* renamed from: c, reason: collision with root package name */
    public static final B2.p f1747c = b.f1750f;

    /* renamed from: d, reason: collision with root package name */
    public static final B2.p f1748d = c.f1751f;

    public static final class a extends C2.l implements B2.p {

        /* renamed from: f, reason: collision with root package name */
        public static final a f1749f = new a();

        public a() {
            super(2);
        }

        @Override // B2.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object h(Object obj, i.b bVar) {
            if (!(bVar instanceof I0)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int intValue = num != null ? num.intValue() : 1;
            return intValue == 0 ? bVar : Integer.valueOf(intValue + 1);
        }
    }

    public static final class b extends C2.l implements B2.p {

        /* renamed from: f, reason: collision with root package name */
        public static final b f1750f = new b();

        public b() {
            super(2);
        }

        @Override // B2.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final I0 h(I0 i02, i.b bVar) {
            if (i02 != null) {
                return i02;
            }
            if (bVar instanceof I0) {
                return (I0) bVar;
            }
            return null;
        }
    }

    public static final class c extends C2.l implements B2.p {

        /* renamed from: f, reason: collision with root package name */
        public static final c f1751f = new c();

        public c() {
            super(2);
        }

        @Override // B2.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final N h(N n3, i.b bVar) {
            if (bVar instanceof I0) {
                I0 i02 = (I0) bVar;
                n3.a(i02, i02.A(n3.f1752a));
            }
            return n3;
        }
    }

    public static final void a(s2.i iVar, Object obj) {
        if (obj == f1745a) {
            return;
        }
        if (obj instanceof N) {
            ((N) obj).b(iVar);
            return;
        }
        Object e3 = iVar.e(null, f1747c);
        C2.k.c(e3, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((I0) e3).D(iVar, obj);
    }

    public static final Object b(s2.i iVar) {
        Object e3 = iVar.e(0, f1746b);
        C2.k.b(e3);
        return e3;
    }

    public static final Object c(s2.i iVar, Object obj) {
        if (obj == null) {
            obj = b(iVar);
        }
        if (obj == 0) {
            return f1745a;
        }
        if (obj instanceof Integer) {
            return iVar.e(new N(iVar, ((Number) obj).intValue()), f1748d);
        }
        C2.k.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((I0) obj).A(iVar);
    }
}
