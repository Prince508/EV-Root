package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC0414e;
import j.AbstractC0515e;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class T implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final O f5761a;

    /* renamed from: b, reason: collision with root package name */
    public final k0 f5762b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5763c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0426q f5764d;

    public T(k0 k0Var, AbstractC0426q abstractC0426q, O o3) {
        this.f5762b = k0Var;
        this.f5763c = abstractC0426q.e(o3);
        this.f5764d = abstractC0426q;
        this.f5761a = o3;
    }

    private int k(k0 k0Var, Object obj) {
        return k0Var.i(k0Var.g(obj));
    }

    private void l(k0 k0Var, AbstractC0426q abstractC0426q, Object obj, d0 d0Var, C0425p c0425p) {
        k0 k0Var2;
        AbstractC0426q abstractC0426q2;
        d0 d0Var2;
        C0425p c0425p2;
        Object f3 = k0Var.f(obj);
        AbstractC0428t d3 = abstractC0426q.d(obj);
        while (d0Var.G() != Integer.MAX_VALUE) {
            try {
                k0Var2 = k0Var;
                abstractC0426q2 = abstractC0426q;
                d0Var2 = d0Var;
                c0425p2 = c0425p;
            } catch (Throwable th) {
                th = th;
                k0Var2 = k0Var;
            }
            try {
                if (!n(d0Var2, c0425p2, abstractC0426q2, d3, k0Var2, f3)) {
                    k0Var2.o(obj, f3);
                    return;
                }
                d0Var = d0Var2;
                c0425p = c0425p2;
                abstractC0426q = abstractC0426q2;
                k0Var = k0Var2;
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                k0Var2.o(obj, f3);
                throw th3;
            }
        }
        k0Var.o(obj, f3);
    }

    public static T m(k0 k0Var, AbstractC0426q abstractC0426q, O o3) {
        return new T(k0Var, abstractC0426q, o3);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void a(Object obj, Object obj2) {
        g0.F(this.f5762b, obj, obj2);
        if (this.f5763c) {
            g0.D(this.f5764d, obj, obj2);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public final boolean b(Object obj) {
        return this.f5764d.c(obj).e();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public boolean c(Object obj, Object obj2) {
        if (!this.f5762b.g(obj).equals(this.f5762b.g(obj2))) {
            return false;
        }
        if (this.f5763c) {
            return this.f5764d.c(obj).equals(this.f5764d.c(obj2));
        }
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public int d(Object obj) {
        int k3 = k(this.f5762b, obj);
        return this.f5763c ? k3 + this.f5764d.c(obj).b() : k3;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public Object e() {
        O o3 = this.f5761a;
        return o3 instanceof AbstractC0432x ? ((AbstractC0432x) o3).J() : o3.b().d();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void f(Object obj) {
        this.f5762b.j(obj);
        this.f5764d.f(obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public int g(Object obj) {
        int hashCode = this.f5762b.g(obj).hashCode();
        return this.f5763c ? (hashCode * 53) + this.f5764d.c(obj).hashCode() : hashCode;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void h(Object obj, byte[] bArr, int i3, int i4, AbstractC0414e.a aVar) {
        AbstractC0432x abstractC0432x = (AbstractC0432x) obj;
        if (abstractC0432x.unknownFields == l0.c()) {
            abstractC0432x.unknownFields = l0.k();
        }
        AbstractC0515e.a(obj);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void i(Object obj, r0 r0Var) {
        Iterator f3 = this.f5764d.c(obj).f();
        if (f3.hasNext()) {
            AbstractC0515e.a(((Map.Entry) f3.next()).getKey());
            throw null;
        }
        o(this.f5762b, obj, r0Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.e0
    public void j(Object obj, d0 d0Var, C0425p c0425p) {
        l(this.f5762b, this.f5764d, obj, d0Var, c0425p);
    }

    public final boolean n(d0 d0Var, C0425p c0425p, AbstractC0426q abstractC0426q, AbstractC0428t abstractC0428t, k0 k0Var, Object obj) {
        int i3 = d0Var.i();
        if (i3 != q0.f5888a) {
            if (q0.b(i3) != 2) {
                return d0Var.n();
            }
            Object b3 = abstractC0426q.b(c0425p, this.f5761a, q0.a(i3));
            if (b3 == null) {
                return k0Var.m(obj, d0Var);
            }
            abstractC0426q.h(d0Var, b3, c0425p, abstractC0428t);
            return true;
        }
        Object obj2 = null;
        int i4 = 0;
        AbstractC0417h abstractC0417h = null;
        while (d0Var.G() != Integer.MAX_VALUE) {
            int i5 = d0Var.i();
            if (i5 == q0.f5890c) {
                i4 = d0Var.g();
                obj2 = abstractC0426q.b(c0425p, this.f5761a, i4);
            } else if (i5 == q0.f5891d) {
                if (obj2 != null) {
                    abstractC0426q.h(d0Var, obj2, c0425p, abstractC0428t);
                } else {
                    abstractC0417h = d0Var.c();
                }
            } else if (!d0Var.n()) {
                break;
            }
        }
        if (d0Var.i() != q0.f5889b) {
            throw A.b();
        }
        if (abstractC0417h != null) {
            if (obj2 != null) {
                abstractC0426q.i(abstractC0417h, obj2, c0425p, abstractC0428t);
            } else {
                k0Var.d(obj, i4, abstractC0417h);
            }
        }
        return true;
    }

    public final void o(k0 k0Var, Object obj, r0 r0Var) {
        k0Var.s(k0Var.g(obj), r0Var);
    }
}
