package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC0315a;
import androidx.datastore.preferences.protobuf.AbstractC0334u;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: androidx.datastore.preferences.protobuf.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0333t extends AbstractC0315a {
    private static Map<Object, AbstractC0333t> defaultInstanceMap = new ConcurrentHashMap();
    protected g0 unknownFields = g0.e();
    protected int memoizedSerializedSize = -1;

    /* renamed from: androidx.datastore.preferences.protobuf.t$a */
    public static abstract class a extends AbstractC0315a.AbstractC0081a {

        /* renamed from: e, reason: collision with root package name */
        public final AbstractC0333t f3835e;

        /* renamed from: f, reason: collision with root package name */
        public AbstractC0333t f3836f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f3837g = false;

        public a(AbstractC0333t abstractC0333t) {
            this.f3835e = abstractC0333t;
            this.f3836f = (AbstractC0333t) abstractC0333t.q(d.NEW_MUTABLE_INSTANCE);
        }

        public final AbstractC0333t m() {
            AbstractC0333t d3 = d();
            if (d3.x()) {
                return d3;
            }
            throw AbstractC0315a.AbstractC0081a.l(d3);
        }

        @Override // androidx.datastore.preferences.protobuf.J.a
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public AbstractC0333t d() {
            if (this.f3837g) {
                return this.f3836f;
            }
            this.f3836f.z();
            this.f3837g = true;
            return this.f3836f;
        }

        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a b3 = c().b();
            b3.s(d());
            return b3;
        }

        public void p() {
            if (this.f3837g) {
                AbstractC0333t abstractC0333t = (AbstractC0333t) this.f3836f.q(d.NEW_MUTABLE_INSTANCE);
                t(abstractC0333t, this.f3836f);
                this.f3836f = abstractC0333t;
                this.f3837g = false;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.K
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public AbstractC0333t c() {
            return this.f3835e;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0315a.AbstractC0081a
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public a j(AbstractC0333t abstractC0333t) {
            return s(abstractC0333t);
        }

        public a s(AbstractC0333t abstractC0333t) {
            p();
            t(this.f3836f, abstractC0333t);
            return this;
        }

        public final void t(AbstractC0333t abstractC0333t, AbstractC0333t abstractC0333t2) {
            U.a().d(abstractC0333t).a(abstractC0333t, abstractC0333t2);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.t$b */
    public static class b extends AbstractC0316b {

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC0333t f3838b;

        public b(AbstractC0333t abstractC0333t) {
            this.f3838b = abstractC0333t;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.t$c */
    public static class c extends AbstractC0325k {
    }

    /* renamed from: androidx.datastore.preferences.protobuf.t$d */
    public enum d {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    public static AbstractC0334u.b A(AbstractC0334u.b bVar) {
        int size = bVar.size();
        return bVar.d(size == 0 ? 10 : size * 2);
    }

    public static Object C(J j3, String str, Object[] objArr) {
        return new W(j3, str, objArr);
    }

    public static AbstractC0333t D(AbstractC0333t abstractC0333t, InputStream inputStream) {
        return o(E(abstractC0333t, AbstractC0321g.f(inputStream), C0327m.b()));
    }

    public static AbstractC0333t E(AbstractC0333t abstractC0333t, AbstractC0321g abstractC0321g, C0327m c0327m) {
        AbstractC0333t abstractC0333t2 = (AbstractC0333t) abstractC0333t.q(d.NEW_MUTABLE_INSTANCE);
        try {
            Y d3 = U.a().d(abstractC0333t2);
            d3.h(abstractC0333t2, C0322h.O(abstractC0321g), c0327m);
            d3.f(abstractC0333t2);
            return abstractC0333t2;
        } catch (IOException e3) {
            if (e3.getCause() instanceof C0335v) {
                throw ((C0335v) e3.getCause());
            }
            throw new C0335v(e3.getMessage()).i(abstractC0333t2);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof C0335v) {
                throw ((C0335v) e4.getCause());
            }
            throw e4;
        }
    }

    public static void F(Class cls, AbstractC0333t abstractC0333t) {
        defaultInstanceMap.put(cls, abstractC0333t);
    }

    public static AbstractC0333t o(AbstractC0333t abstractC0333t) {
        if (abstractC0333t == null || abstractC0333t.x()) {
            return abstractC0333t;
        }
        throw abstractC0333t.k().a().i(abstractC0333t);
    }

    public static AbstractC0334u.b t() {
        return V.k();
    }

    public static AbstractC0333t u(Class cls) {
        AbstractC0333t abstractC0333t = defaultInstanceMap.get(cls);
        if (abstractC0333t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC0333t = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e3) {
                throw new IllegalStateException("Class initialization cannot fail.", e3);
            }
        }
        if (abstractC0333t != null) {
            return abstractC0333t;
        }
        AbstractC0333t c3 = ((AbstractC0333t) j0.i(cls)).c();
        if (c3 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, c3);
        return c3;
    }

    public static Object w(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e3);
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static final boolean y(AbstractC0333t abstractC0333t, boolean z3) {
        byte byteValue = ((Byte) abstractC0333t.q(d.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean b3 = U.a().d(abstractC0333t).b(abstractC0333t);
        if (z3) {
            abstractC0333t.r(d.SET_MEMOIZED_IS_INITIALIZED, b3 ? abstractC0333t : null);
        }
        return b3;
    }

    @Override // androidx.datastore.preferences.protobuf.J
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public final a b() {
        return (a) q(d.NEW_BUILDER);
    }

    @Override // androidx.datastore.preferences.protobuf.J
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public final a e() {
        a aVar = (a) q(d.NEW_BUILDER);
        aVar.s(this);
        return aVar;
    }

    @Override // androidx.datastore.preferences.protobuf.J
    public int a() {
        if (this.memoizedSerializedSize == -1) {
            this.memoizedSerializedSize = U.a().d(this).d(this);
        }
        return this.memoizedSerializedSize;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (c().getClass().isInstance(obj)) {
            return U.a().d(this).c(this, (AbstractC0333t) obj);
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.J
    public void f(AbstractC0323i abstractC0323i) {
        U.a().d(this).i(this, C0324j.P(abstractC0323i));
    }

    public int hashCode() {
        int i3 = this.memoizedHashCode;
        if (i3 != 0) {
            return i3;
        }
        int g3 = U.a().d(this).g(this);
        this.memoizedHashCode = g3;
        return g3;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0315a
    public int i() {
        return this.memoizedSerializedSize;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0315a
    public void l(int i3) {
        this.memoizedSerializedSize = i3;
    }

    public Object n() {
        return q(d.BUILD_MESSAGE_INFO);
    }

    public final a p() {
        return (a) q(d.NEW_BUILDER);
    }

    public Object q(d dVar) {
        return s(dVar, null, null);
    }

    public Object r(d dVar, Object obj) {
        return s(dVar, obj, null);
    }

    public abstract Object s(d dVar, Object obj, Object obj2);

    public String toString() {
        return L.e(this, super.toString());
    }

    @Override // androidx.datastore.preferences.protobuf.K
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final AbstractC0333t c() {
        return (AbstractC0333t) q(d.GET_DEFAULT_INSTANCE);
    }

    public final boolean x() {
        return y(this, true);
    }

    public void z() {
        U.a().d(this).f(this);
    }
}
