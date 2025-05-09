package H1;

import B1.e;
import B1.l;
import B1.x;
import J1.d;
import J1.m;
import O1.p;
import O1.q;
import O1.y;
import P1.r;
import com.google.crypto.tink.shaded.protobuf.AbstractC0417h;
import com.google.crypto.tink.shaded.protobuf.C0425p;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class a extends d {

    /* renamed from: H1.a$a, reason: collision with other inner class name */
    public class C0019a extends m {
        public C0019a(Class cls) {
            super(cls);
        }

        @Override // J1.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public e a(p pVar) {
            return new P1.d(pVar.X().y());
        }
    }

    public class b extends d.a {
        public b(Class cls) {
            super(cls);
        }

        @Override // J1.d.a
        public Map c() {
            HashMap hashMap = new HashMap();
            hashMap.put("AES256_SIV", new d.a.C0026a((q) q.X().s(64).j(), l.b.TINK));
            hashMap.put("AES256_SIV_RAW", new d.a.C0026a((q) q.X().s(64).j(), l.b.RAW));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // J1.d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public p a(q qVar) {
            return (p) p.Z().s(AbstractC0417h.m(P1.p.c(qVar.W()))).t(a.this.k()).j();
        }

        @Override // J1.d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public q d(AbstractC0417h abstractC0417h) {
            return q.Y(abstractC0417h, C0425p.b());
        }

        @Override // J1.d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(q qVar) {
            if (qVar.W() == 64) {
                return;
            }
            throw new InvalidAlgorithmParameterException("invalid key size: " + qVar.W() + ". Valid keys must have 64 bytes.");
        }
    }

    public a() {
        super(p.class, new C0019a(e.class));
    }

    public static void m(boolean z3) {
        x.l(new a(), z3);
    }

    @Override // J1.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    @Override // J1.d
    public d.a f() {
        return new b(q.class);
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
    public p h(AbstractC0417h abstractC0417h) {
        return p.a0(abstractC0417h, C0425p.b());
    }

    @Override // J1.d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void j(p pVar) {
        r.c(pVar.Y(), k());
        if (pVar.X().size() == 64) {
            return;
        }
        throw new InvalidKeyException("invalid key size: " + pVar.X().size() + ". Valid keys must have 64 bytes.");
    }
}
