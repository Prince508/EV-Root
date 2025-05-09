package x0;

import B2.p;
import K2.AbstractC0236h0;
import K2.AbstractC0237i;
import K2.I;
import K2.J;
import K2.p0;
import N2.d;
import N2.e;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import q2.i;
import q2.n;
import t2.AbstractC0733c;
import u2.k;

/* renamed from: x0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0766a {

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f9973a = new ReentrantLock();

    /* renamed from: b, reason: collision with root package name */
    public final Map f9974b = new LinkedHashMap();

    /* renamed from: x0.a$a, reason: collision with other inner class name */
    public static final class C0164a extends k implements p {

        /* renamed from: i, reason: collision with root package name */
        public int f9975i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ d f9976j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ J.a f9977k;

        /* renamed from: x0.a$a$a, reason: collision with other inner class name */
        public static final class C0165a implements e {

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ J.a f9978e;

            public C0165a(J.a aVar) {
                this.f9978e = aVar;
            }

            @Override // N2.e
            public final Object d(Object obj, s2.e eVar) {
                this.f9978e.accept(obj);
                return n.f8874a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0164a(d dVar, J.a aVar, s2.e eVar) {
            super(2, eVar);
            this.f9976j = dVar;
            this.f9977k = aVar;
        }

        @Override // u2.AbstractC0748a
        public final s2.e a(Object obj, s2.e eVar) {
            return new C0164a(this.f9976j, this.f9977k, eVar);
        }

        @Override // u2.AbstractC0748a
        public final Object l(Object obj) {
            Object c3 = AbstractC0733c.c();
            int i3 = this.f9975i;
            if (i3 == 0) {
                i.b(obj);
                d dVar = this.f9976j;
                C0165a c0165a = new C0165a(this.f9977k);
                this.f9975i = 1;
                if (dVar.b(c0165a, this) == c3) {
                    return c3;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i.b(obj);
            }
            return n.f8874a;
        }

        @Override // B2.p
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public final Object h(I i3, s2.e eVar) {
            return ((C0164a) a(i3, eVar)).l(n.f8874a);
        }
    }

    public final void a(Executor executor, J.a aVar, d dVar) {
        p0 b3;
        C2.k.e(executor, "executor");
        C2.k.e(aVar, "consumer");
        C2.k.e(dVar, "flow");
        ReentrantLock reentrantLock = this.f9973a;
        reentrantLock.lock();
        try {
            if (this.f9974b.get(aVar) == null) {
                I a3 = J.a(AbstractC0236h0.a(executor));
                Map map = this.f9974b;
                b3 = AbstractC0237i.b(a3, null, null, new C0164a(dVar, aVar, null), 3, null);
                map.put(aVar, b3);
            }
            n nVar = n.f8874a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void b(J.a aVar) {
        C2.k.e(aVar, "consumer");
        ReentrantLock reentrantLock = this.f9973a;
        reentrantLock.lock();
        try {
            p0 p0Var = (p0) this.f9974b.get(aVar);
            if (p0Var != null) {
                p0.a.a(p0Var, null, 1, null);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
