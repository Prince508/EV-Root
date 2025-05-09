package K1;

import B1.l;
import B1.t;
import B1.x;
import J1.d;
import J1.l;
import O1.C0262a;
import O1.C0263b;
import O1.C0264c;
import O1.y;
import com.google.crypto.tink.shaded.protobuf.AbstractC0417h;
import com.google.crypto.tink.shaded.protobuf.C0425p;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class c extends J1.d {

    /* renamed from: d, reason: collision with root package name */
    public static final J1.l f1078d = J1.l.b(new l.b() { // from class: K1.b
        @Override // J1.l.b
        public final Object a(B1.g gVar) {
            return new L1.b((a) gVar);
        }
    }, K1.a.class, g.class);

    public class a extends J1.m {
        public a(Class cls) {
            super(cls);
        }

        @Override // J1.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public t a(C0262a c0262a) {
            return new P1.o(new P1.m(c0262a.Y().y()), c0262a.Z().X());
        }
    }

    public class b extends d.a {
        public b(Class cls) {
            super(cls);
        }

        @Override // J1.d.a
        public Map c() {
            HashMap hashMap = new HashMap();
            C0263b c0263b = (C0263b) C0263b.Z().s(32).t((C0264c) C0264c.Y().s(16).j()).j();
            l.b bVar = l.b.TINK;
            hashMap.put("AES_CMAC", new d.a.C0026a(c0263b, bVar));
            hashMap.put("AES256_CMAC", new d.a.C0026a((C0263b) C0263b.Z().s(32).t((C0264c) C0264c.Y().s(16).j()).j(), bVar));
            hashMap.put("AES256_CMAC_RAW", new d.a.C0026a((C0263b) C0263b.Z().s(32).t((C0264c) C0264c.Y().s(16).j()).j(), l.b.RAW));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // J1.d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C0262a a(C0263b c0263b) {
            return (C0262a) C0262a.b0().u(0).s(AbstractC0417h.m(P1.p.c(c0263b.X()))).t(c0263b.Y()).j();
        }

        @Override // J1.d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public C0263b d(AbstractC0417h abstractC0417h) {
            return C0263b.a0(abstractC0417h, C0425p.b());
        }

        @Override // J1.d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(C0263b c0263b) {
            c.q(c0263b.Y());
            c.r(c0263b.X());
        }
    }

    public c() {
        super(C0262a.class, new a(t.class));
    }

    public static void o(boolean z3) {
        x.l(new c(), z3);
        f.c();
        J1.h.c().d(f1078d);
    }

    public static void q(C0264c c0264c) {
        if (c0264c.X() < 10) {
            throw new GeneralSecurityException("tag size too short");
        }
        if (c0264c.X() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    public static void r(int i3) {
        if (i3 != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    @Override // J1.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    @Override // J1.d
    public d.a f() {
        return new b(C0263b.class);
    }

    @Override // J1.d
    public y.c g() {
        return y.c.SYMMETRIC;
    }

    public int m() {
        return 0;
    }

    @Override // J1.d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public C0262a h(AbstractC0417h abstractC0417h) {
        return C0262a.c0(abstractC0417h, C0425p.b());
    }

    @Override // J1.d
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public void j(C0262a c0262a) {
        P1.r.c(c0262a.a0(), m());
        r(c0262a.Y().size());
        q(c0262a.Z());
    }
}
