package C1;

import J1.d;
import O1.y;
import com.google.crypto.tink.shaded.protobuf.AbstractC0417h;
import com.google.crypto.tink.shaded.protobuf.C0425p;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public class F extends J1.d {

    public class a extends J1.m {
        public a(Class cls) {
            super(cls);
        }

        @Override // J1.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public B1.a a(O1.G g3) {
            String X2 = g3.X().X();
            return new E(g3.X().W(), B1.s.a(X2).a(X2));
        }
    }

    public class b extends d.a {
        public b(Class cls) {
            super(cls);
        }

        @Override // J1.d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public O1.G a(O1.H h3) {
            return (O1.G) O1.G.Z().s(h3).t(F.this.k()).j();
        }

        @Override // J1.d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public O1.H d(AbstractC0417h abstractC0417h) {
            return O1.H.Z(abstractC0417h, C0425p.b());
        }

        @Override // J1.d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(O1.H h3) {
            if (h3.X().isEmpty() || !h3.Y()) {
                throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
            }
        }
    }

    public F() {
        super(O1.G.class, new a(B1.a.class));
    }

    public static void m(boolean z3) {
        B1.x.l(new F(), z3);
    }

    @Override // J1.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    @Override // J1.d
    public d.a f() {
        return new b(O1.H.class);
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
    public O1.G h(AbstractC0417h abstractC0417h) {
        return O1.G.a0(abstractC0417h, C0425p.b());
    }

    @Override // J1.d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void j(O1.G g3) {
        P1.r.c(g3.Y(), k());
    }
}
