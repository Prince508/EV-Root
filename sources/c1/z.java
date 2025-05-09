package C1;

import B1.l;
import J1.d;
import O1.y;
import com.google.crypto.tink.shaded.protobuf.AbstractC0417h;
import com.google.crypto.tink.shaded.protobuf.C0425p;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class z extends J1.d {

    public class a extends J1.m {
        public a(Class cls) {
            super(cls);
        }

        @Override // J1.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public B1.a a(O1.r rVar) {
            return new P1.g(rVar.X().y());
        }
    }

    public z() {
        super(O1.r.class, new a(B1.a.class));
    }

    public static void m(boolean z3) {
        B1.x.l(new z(), z3);
        C.c();
    }

    @Override // J1.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    @Override // J1.d
    public d.a f() {
        return new b(O1.s.class);
    }

    @Override // J1.d
    public y.c g() {
        return y.c.SYMMETRIC;
    }

    public int k() {
        return 0;
    }

    @Override // J1.d
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public O1.r h(AbstractC0417h abstractC0417h) {
        return O1.r.a0(abstractC0417h, C0425p.b());
    }

    @Override // J1.d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void j(O1.r rVar) {
        P1.r.c(rVar.Y(), k());
        if (rVar.X().size() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }

    public class b extends d.a {
        public b(Class cls) {
            super(cls);
        }

        @Override // J1.d.a
        public Map c() {
            HashMap hashMap = new HashMap();
            hashMap.put("CHACHA20_POLY1305", new d.a.C0026a(O1.s.V(), l.b.TINK));
            hashMap.put("CHACHA20_POLY1305_RAW", new d.a.C0026a(O1.s.V(), l.b.RAW));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // J1.d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public O1.r a(O1.s sVar) {
            return (O1.r) O1.r.Z().t(z.this.k()).s(AbstractC0417h.m(P1.p.c(32))).j();
        }

        @Override // J1.d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public O1.s d(AbstractC0417h abstractC0417h) {
            return O1.s.W(abstractC0417h, C0425p.b());
        }

        @Override // J1.d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(O1.s sVar) {
        }
    }
}
