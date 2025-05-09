package z0;

import B2.p;
import K2.V;
import M2.r;
import android.app.Activity;
import t2.AbstractC0733c;
import z0.i;

/* loaded from: classes.dex */
public final class i implements f {

    /* renamed from: b, reason: collision with root package name */
    public final l f10288b;

    /* renamed from: c, reason: collision with root package name */
    public final A0.a f10289c;

    public static final class a extends u2.k implements p {

        /* renamed from: i, reason: collision with root package name */
        public int f10290i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f10291j;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Activity f10293l;

        /* renamed from: z0.i$a$a, reason: collision with other inner class name */
        public static final class C0171a extends C2.l implements B2.a {

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ i f10294f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ J.a f10295g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0171a(i iVar, J.a aVar) {
                super(0);
                this.f10294f = iVar;
                this.f10295g = aVar;
            }

            public final void a() {
                this.f10294f.f10289c.a(this.f10295g);
            }

            @Override // B2.a
            public /* bridge */ /* synthetic */ Object b() {
                a();
                return q2.n.f8874a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Activity activity, s2.e eVar) {
            super(2, eVar);
            this.f10293l = activity;
        }

        public static final void r(r rVar, j jVar) {
            rVar.s(jVar);
        }

        @Override // u2.AbstractC0748a
        public final s2.e a(Object obj, s2.e eVar) {
            a aVar = i.this.new a(this.f10293l, eVar);
            aVar.f10291j = obj;
            return aVar;
        }

        @Override // u2.AbstractC0748a
        public final Object l(Object obj) {
            Object c3 = AbstractC0733c.c();
            int i3 = this.f10290i;
            if (i3 == 0) {
                q2.i.b(obj);
                final r rVar = (r) this.f10291j;
                J.a aVar = new J.a() { // from class: z0.h
                    @Override // J.a, androidx.window.extensions.core.util.function.Consumer
                    public final void accept(Object obj2) {
                        i.a.r(r.this, (j) obj2);
                    }
                };
                i.this.f10289c.b(this.f10293l, new l0.e(), aVar);
                C0171a c0171a = new C0171a(i.this, aVar);
                this.f10290i = 1;
                if (M2.p.a(rVar, c0171a, this) == c3) {
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
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public final Object h(r rVar, s2.e eVar) {
            return ((a) a(rVar, eVar)).l(q2.n.f8874a);
        }
    }

    public i(l lVar, A0.a aVar) {
        C2.k.e(lVar, "windowMetricsCalculator");
        C2.k.e(aVar, "windowBackend");
        this.f10288b = lVar;
        this.f10289c = aVar;
    }

    @Override // z0.f
    public N2.d a(Activity activity) {
        C2.k.e(activity, "activity");
        return N2.f.h(N2.f.a(new a(activity, null)), V.c());
    }
}
