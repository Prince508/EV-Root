package O2;

import C2.w;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final B2.q f1637a;

    public /* synthetic */ class a extends C2.j implements B2.q {

        /* renamed from: n, reason: collision with root package name */
        public static final a f1638n = new a();

        public a() {
            super(3, N2.e.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // B2.q
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object g(N2.e eVar, Object obj, s2.e eVar2) {
            return eVar.d(obj, eVar2);
        }
    }

    static {
        a aVar = a.f1638n;
        C2.k.c(aVar, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>");
        f1637a = (B2.q) w.a(aVar, 3);
    }
}
