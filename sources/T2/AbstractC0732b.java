package t2;

import B2.p;
import C2.k;
import C2.w;
import q2.i;
import s2.e;
import u2.AbstractC0748a;
import u2.d;
import u2.h;
import u2.j;

/* renamed from: t2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0732b {

    /* renamed from: t2.b$a */
    public static final class a extends j {

        /* renamed from: f, reason: collision with root package name */
        public int f9522f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ p f9523g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Object f9524h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(e eVar, p pVar, Object obj) {
            super(eVar);
            this.f9523g = pVar;
            this.f9524h = obj;
            k.c(eVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // u2.AbstractC0748a
        public Object l(Object obj) {
            int i3 = this.f9522f;
            if (i3 == 0) {
                this.f9522f = 1;
                i.b(obj);
                k.c(this.f9523g, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                return ((p) w.a(this.f9523g, 2)).h(this.f9524h, this);
            }
            if (i3 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f9522f = 2;
            i.b(obj);
            return obj;
        }
    }

    /* renamed from: t2.b$b, reason: collision with other inner class name */
    public static final class C0157b extends d {

        /* renamed from: h, reason: collision with root package name */
        public int f9525h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ p f9526i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Object f9527j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0157b(e eVar, s2.i iVar, p pVar, Object obj) {
            super(eVar, iVar);
            this.f9526i = pVar;
            this.f9527j = obj;
            k.c(eVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // u2.AbstractC0748a
        public Object l(Object obj) {
            int i3 = this.f9525h;
            if (i3 == 0) {
                this.f9525h = 1;
                i.b(obj);
                k.c(this.f9526i, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                return ((p) w.a(this.f9526i, 2)).h(this.f9527j, this);
            }
            if (i3 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f9525h = 2;
            i.b(obj);
            return obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static e a(p pVar, Object obj, e eVar) {
        k.e(pVar, "<this>");
        k.e(eVar, "completion");
        e a3 = h.a(eVar);
        if (pVar instanceof AbstractC0748a) {
            return ((AbstractC0748a) pVar).a(obj, a3);
        }
        s2.i c3 = a3.c();
        return c3 == s2.j.f9292e ? new a(a3, pVar, obj) : new C0157b(a3, c3, pVar, obj);
    }

    public static e b(e eVar) {
        e o3;
        k.e(eVar, "<this>");
        d dVar = eVar instanceof d ? (d) eVar : null;
        return (dVar == null || (o3 = dVar.o()) == null) ? eVar : o3;
    }
}
