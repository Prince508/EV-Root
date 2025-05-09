package C1;

import J1.d;
import O1.y;
import com.google.crypto.tink.shaded.protobuf.AbstractC0417h;
import com.google.crypto.tink.shaded.protobuf.C0425p;

/* loaded from: classes.dex */
public class D extends J1.d {

    public class a extends J1.m {
        public a(Class cls) {
            super(cls);
        }

        @Override // J1.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public B1.a a(O1.E e3) {
            String W2 = e3.X().W();
            return B1.s.a(W2).a(W2);
        }
    }

    public D() {
        super(O1.E.class, new a(B1.a.class));
    }

    public static void m(boolean z3) {
        B1.x.l(new D(), z3);
    }

    @Override // J1.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
    }

    @Override // J1.d
    public d.a f() {
        return new b(O1.F.class);
    }

    @Override // J1.d
    public y.c g() {
        return y.c.REMOTE;
    }

    public int k() {
        return 0;
    }

    @Override // J1.d
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public O1.E h(AbstractC0417h abstractC0417h) {
        return O1.E.a0(abstractC0417h, C0425p.b());
    }

    @Override // J1.d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void j(O1.E e3) {
        P1.r.c(e3.Y(), k());
    }

    public class b extends d.a {
        public b(Class cls) {
            super(cls);
        }

        @Override // J1.d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public O1.E a(O1.F f3) {
            return (O1.E) O1.E.Z().s(f3).t(D.this.k()).j();
        }

        @Override // J1.d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public O1.F d(AbstractC0417h abstractC0417h) {
            return O1.F.X(abstractC0417h, C0425p.b());
        }

        @Override // J1.d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(O1.F f3) {
        }
    }
}
