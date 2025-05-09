package K1;

import B1.l;
import B1.t;
import G1.b;
import J1.d;
import J1.l;
import O1.u;
import O1.v;
import O1.w;
import O1.x;
import O1.y;
import com.google.crypto.tink.shaded.protobuf.AbstractC0417h;
import com.google.crypto.tink.shaded.protobuf.C0425p;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class k extends J1.d {

    /* renamed from: d, reason: collision with root package name */
    public static final J1.l f1106d = J1.l.b(new l.b() { // from class: K1.j
        @Override // J1.l.b
        public final Object a(B1.g gVar) {
            return new L1.c((i) gVar);
        }
    }, i.class, g.class);

    public class a extends J1.m {
        public a(Class cls) {
            super(cls);
        }

        @Override // J1.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public t a(v vVar) {
            u Y2 = vVar.a0().Y();
            SecretKeySpec secretKeySpec = new SecretKeySpec(vVar.Z().y(), "HMAC");
            int Z2 = vVar.a0().Z();
            int i3 = c.f1108a[Y2.ordinal()];
            if (i3 == 1) {
                return new P1.o(new P1.n("HMACSHA1", secretKeySpec), Z2);
            }
            if (i3 == 2) {
                return new P1.o(new P1.n("HMACSHA224", secretKeySpec), Z2);
            }
            if (i3 == 3) {
                return new P1.o(new P1.n("HMACSHA256", secretKeySpec), Z2);
            }
            if (i3 == 4) {
                return new P1.o(new P1.n("HMACSHA384", secretKeySpec), Z2);
            }
            if (i3 == 5) {
                return new P1.o(new P1.n("HMACSHA512", secretKeySpec), Z2);
            }
            throw new GeneralSecurityException("unknown hash");
        }
    }

    public class b extends d.a {
        public b(Class cls) {
            super(cls);
        }

        @Override // J1.d.a
        public Map c() {
            HashMap hashMap = new HashMap();
            u uVar = u.SHA256;
            l.b bVar = l.b.TINK;
            hashMap.put("HMAC_SHA256_128BITTAG", k.m(32, 16, uVar, bVar));
            l.b bVar2 = l.b.RAW;
            hashMap.put("HMAC_SHA256_128BITTAG_RAW", k.m(32, 16, uVar, bVar2));
            hashMap.put("HMAC_SHA256_256BITTAG", k.m(32, 32, uVar, bVar));
            hashMap.put("HMAC_SHA256_256BITTAG_RAW", k.m(32, 32, uVar, bVar2));
            u uVar2 = u.SHA512;
            hashMap.put("HMAC_SHA512_128BITTAG", k.m(64, 16, uVar2, bVar));
            hashMap.put("HMAC_SHA512_128BITTAG_RAW", k.m(64, 16, uVar2, bVar2));
            hashMap.put("HMAC_SHA512_256BITTAG", k.m(64, 32, uVar2, bVar));
            hashMap.put("HMAC_SHA512_256BITTAG_RAW", k.m(64, 32, uVar2, bVar2));
            hashMap.put("HMAC_SHA512_512BITTAG", k.m(64, 64, uVar2, bVar));
            hashMap.put("HMAC_SHA512_512BITTAG_RAW", k.m(64, 64, uVar2, bVar2));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // J1.d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public v a(w wVar) {
            return (v) v.c0().u(k.this.n()).t(wVar.Z()).s(AbstractC0417h.m(P1.p.c(wVar.Y()))).j();
        }

        @Override // J1.d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public w d(AbstractC0417h abstractC0417h) {
            return w.b0(abstractC0417h, C0425p.b());
        }

        @Override // J1.d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(w wVar) {
            if (wVar.Y() < 16) {
                throw new GeneralSecurityException("key too short");
            }
            k.r(wVar.Z());
        }
    }

    public static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1108a;

        static {
            int[] iArr = new int[u.values().length];
            f1108a = iArr;
            try {
                iArr[u.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1108a[u.SHA224.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1108a[u.SHA256.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1108a[u.SHA384.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1108a[u.SHA512.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public k() {
        super(v.class, new a(t.class));
    }

    public static d.a.C0026a m(int i3, int i4, u uVar, l.b bVar) {
        return new d.a.C0026a((w) w.a0().t((x) x.a0().s(uVar).t(i4).j()).s(i3).j(), bVar);
    }

    public static void p(boolean z3) {
        B1.x.l(new k(), z3);
        n.c();
        J1.h.c().d(f1106d);
    }

    public static void r(x xVar) {
        if (xVar.Z() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int i3 = c.f1108a[xVar.Y().ordinal()];
        if (i3 == 1) {
            if (xVar.Z() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (i3 == 2) {
            if (xVar.Z() > 28) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (i3 == 3) {
            if (xVar.Z() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (i3 == 4) {
            if (xVar.Z() > 48) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            if (i3 != 5) {
                throw new GeneralSecurityException("unknown hash type");
            }
            if (xVar.Z() > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        }
    }

    @Override // J1.d
    public b.EnumC0011b a() {
        return b.EnumC0011b.f581f;
    }

    @Override // J1.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // J1.d
    public d.a f() {
        return new b(w.class);
    }

    @Override // J1.d
    public y.c g() {
        return y.c.SYMMETRIC;
    }

    public int n() {
        return 0;
    }

    @Override // J1.d
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public v h(AbstractC0417h abstractC0417h) {
        return v.d0(abstractC0417h, C0425p.b());
    }

    @Override // J1.d
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public void j(v vVar) {
        P1.r.c(vVar.b0(), n());
        if (vVar.Z().size() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        r(vVar.a0());
    }
}
