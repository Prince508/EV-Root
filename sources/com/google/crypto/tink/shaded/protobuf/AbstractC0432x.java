package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC0410a;
import com.google.crypto.tink.shaded.protobuf.AbstractC0414e;
import com.google.crypto.tink.shaded.protobuf.AbstractC0434z;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.crypto.tink.shaded.protobuf.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0432x extends AbstractC0410a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC0432x> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected l0 unknownFields = l0.c();

    /* renamed from: com.google.crypto.tink.shaded.protobuf.x$a */
    public static abstract class a extends AbstractC0410a.AbstractC0112a {

        /* renamed from: e, reason: collision with root package name */
        public final AbstractC0432x f5997e;

        /* renamed from: f, reason: collision with root package name */
        public AbstractC0432x f5998f;

        public a(AbstractC0432x abstractC0432x) {
            this.f5997e = abstractC0432x;
            if (abstractC0432x.D()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.f5998f = r();
        }

        public static void q(Object obj, Object obj2) {
            a0.a().d(obj).a(obj, obj2);
        }

        private AbstractC0432x r() {
            return this.f5997e.J();
        }

        public final AbstractC0432x j() {
            AbstractC0432x k3 = k();
            if (k3.B()) {
                return k3;
            }
            throw AbstractC0410a.AbstractC0112a.i(k3);
        }

        public AbstractC0432x k() {
            if (!this.f5998f.D()) {
                return this.f5998f;
            }
            this.f5998f.E();
            return this.f5998f;
        }

        public a l() {
            a H3 = o().H();
            H3.f5998f = k();
            return H3;
        }

        public final void m() {
            if (this.f5998f.D()) {
                return;
            }
            n();
        }

        public void n() {
            AbstractC0432x r3 = r();
            q(r3, this.f5998f);
            this.f5998f = r3;
        }

        public AbstractC0432x o() {
            return this.f5997e;
        }

        public a p(AbstractC0432x abstractC0432x) {
            if (o().equals(abstractC0432x)) {
                return this;
            }
            m();
            q(this.f5998f, abstractC0432x);
            return this;
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.x$b */
    public static class b extends AbstractC0411b {

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC0432x f5999b;

        public b(AbstractC0432x abstractC0432x) {
            this.f5999b = abstractC0432x;
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.x$c */
    public static class c extends AbstractC0423n {
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.x$d */
    public enum d {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    public static Object A(Method method, Object obj, Object... objArr) {
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

    public static final boolean C(AbstractC0432x abstractC0432x, boolean z3) {
        byte byteValue = ((Byte) abstractC0432x.r(d.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean b3 = a0.a().d(abstractC0432x).b(abstractC0432x);
        if (z3) {
            abstractC0432x.s(d.SET_MEMOIZED_IS_INITIALIZED, b3 ? abstractC0432x : null);
        }
        return b3;
    }

    public static AbstractC0434z.d G(AbstractC0434z.d dVar) {
        int size = dVar.size();
        return dVar.d(size == 0 ? 10 : size * 2);
    }

    public static Object I(O o3, String str, Object[] objArr) {
        return new c0(o3, str, objArr);
    }

    public static AbstractC0432x K(AbstractC0432x abstractC0432x, AbstractC0417h abstractC0417h, C0425p c0425p) {
        return l(N(abstractC0432x, abstractC0417h, c0425p));
    }

    public static AbstractC0432x L(AbstractC0432x abstractC0432x, InputStream inputStream, C0425p c0425p) {
        return l(O(abstractC0432x, AbstractC0418i.f(inputStream), c0425p));
    }

    public static AbstractC0432x M(AbstractC0432x abstractC0432x, byte[] bArr, C0425p c0425p) {
        return l(P(abstractC0432x, bArr, 0, bArr.length, c0425p));
    }

    public static AbstractC0432x N(AbstractC0432x abstractC0432x, AbstractC0417h abstractC0417h, C0425p c0425p) {
        AbstractC0418i u3 = abstractC0417h.u();
        AbstractC0432x O3 = O(abstractC0432x, u3, c0425p);
        try {
            u3.a(0);
            return O3;
        } catch (A e3) {
            throw e3.k(O3);
        }
    }

    public static AbstractC0432x O(AbstractC0432x abstractC0432x, AbstractC0418i abstractC0418i, C0425p c0425p) {
        AbstractC0432x J3 = abstractC0432x.J();
        try {
            e0 d3 = a0.a().d(J3);
            d3.j(J3, C0419j.O(abstractC0418i), c0425p);
            d3.f(J3);
            return J3;
        } catch (A e3) {
            e = e3;
            if (e.a()) {
                e = new A(e);
            }
            throw e.k(J3);
        } catch (j0 e4) {
            throw e4.a().k(J3);
        } catch (IOException e5) {
            if (e5.getCause() instanceof A) {
                throw ((A) e5.getCause());
            }
            throw new A(e5).k(J3);
        } catch (RuntimeException e6) {
            if (e6.getCause() instanceof A) {
                throw ((A) e6.getCause());
            }
            throw e6;
        }
    }

    public static AbstractC0432x P(AbstractC0432x abstractC0432x, byte[] bArr, int i3, int i4, C0425p c0425p) {
        AbstractC0432x J3 = abstractC0432x.J();
        try {
            e0 d3 = a0.a().d(J3);
            d3.h(J3, bArr, i3, i3 + i4, new AbstractC0414e.a(c0425p));
            d3.f(J3);
            return J3;
        } catch (A e3) {
            A a3 = e3;
            if (a3.a()) {
                a3 = new A(a3);
            }
            throw a3.k(J3);
        } catch (j0 e4) {
            throw e4.a().k(J3);
        } catch (IOException e5) {
            if (e5.getCause() instanceof A) {
                throw ((A) e5.getCause());
            }
            throw new A(e5).k(J3);
        } catch (IndexOutOfBoundsException unused) {
            throw A.m().k(J3);
        }
    }

    public static void Q(Class cls, AbstractC0432x abstractC0432x) {
        abstractC0432x.F();
        defaultInstanceMap.put(cls, abstractC0432x);
    }

    public static AbstractC0432x l(AbstractC0432x abstractC0432x) {
        if (abstractC0432x == null || abstractC0432x.B()) {
            return abstractC0432x;
        }
        throw abstractC0432x.j().a().k(abstractC0432x);
    }

    public static AbstractC0434z.d u() {
        return b0.k();
    }

    public static AbstractC0432x v(Class cls) {
        AbstractC0432x abstractC0432x = defaultInstanceMap.get(cls);
        if (abstractC0432x == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC0432x = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e3) {
                throw new IllegalStateException("Class initialization cannot fail.", e3);
            }
        }
        if (abstractC0432x != null) {
            return abstractC0432x;
        }
        AbstractC0432x w3 = ((AbstractC0432x) o0.k(cls)).w();
        if (w3 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, w3);
        return w3;
    }

    public final boolean B() {
        return C(this, true);
    }

    public boolean D() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public void E() {
        a0.a().d(this).f(this);
        F();
    }

    public void F() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final a H() {
        return (a) r(d.NEW_BUILDER);
    }

    public AbstractC0432x J() {
        return (AbstractC0432x) r(d.NEW_MUTABLE_INSTANCE);
    }

    public void R(int i3) {
        this.memoizedHashCode = i3;
    }

    public void S(int i3) {
        if (i3 >= 0) {
            this.memoizedSerializedSize = (i3 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i3);
        }
    }

    public final a T() {
        return ((a) r(d.NEW_BUILDER)).p(this);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.O
    public int a() {
        return g(null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return a0.a().d(this).c(this, (AbstractC0432x) obj);
        }
        return false;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.O
    public void f(AbstractC0420k abstractC0420k) {
        a0.a().d(this).i(this, C0421l.P(abstractC0420k));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC0410a
    public int g(e0 e0Var) {
        if (!D()) {
            if (y() != Integer.MAX_VALUE) {
                return y();
            }
            int p3 = p(e0Var);
            S(p3);
            return p3;
        }
        int p4 = p(e0Var);
        if (p4 >= 0) {
            return p4;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + p4);
    }

    public int hashCode() {
        if (D()) {
            return o();
        }
        if (z()) {
            R(o());
        }
        return x();
    }

    public Object k() {
        return r(d.BUILD_MESSAGE_INFO);
    }

    public void m() {
        this.memoizedHashCode = 0;
    }

    public void n() {
        S(Integer.MAX_VALUE);
    }

    public int o() {
        return a0.a().d(this).g(this);
    }

    public final int p(e0 e0Var) {
        return e0Var == null ? a0.a().d(this).d(this) : e0Var.d(this);
    }

    public final a q() {
        return (a) r(d.NEW_BUILDER);
    }

    public Object r(d dVar) {
        return t(dVar, null, null);
    }

    public Object s(d dVar, Object obj) {
        return t(dVar, obj, null);
    }

    public abstract Object t(d dVar, Object obj, Object obj2);

    public String toString() {
        return Q.f(this, super.toString());
    }

    public final AbstractC0432x w() {
        return (AbstractC0432x) r(d.GET_DEFAULT_INSTANCE);
    }

    public int x() {
        return this.memoizedHashCode;
    }

    public int y() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    public boolean z() {
        return x() == 0;
    }
}
