package C1;

import B1.l;
import G1.b;
import J1.d;
import O1.C0265d;
import O1.C0266e;
import O1.C0267f;
import O1.C0268g;
import O1.C0269h;
import O1.y;
import com.google.crypto.tink.shaded.protobuf.AbstractC0417h;
import com.google.crypto.tink.shaded.protobuf.C0425p;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: C1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0177e extends J1.d {

    /* renamed from: C1.e$a */
    public class a extends J1.m {
        public a(Class cls) {
            super(cls);
        }

        @Override // J1.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public B1.a a(C0265d c0265d) {
            return new P1.h((P1.l) new C0178f().e(c0265d.Y(), P1.l.class), (B1.t) new K1.k().e(c0265d.Z(), B1.t.class), c0265d.Z().a0().Z());
        }
    }

    /* renamed from: C1.e$b */
    public class b extends d.a {
        public b(Class cls) {
            super(cls);
        }

        @Override // J1.d.a
        public Map c() {
            HashMap hashMap = new HashMap();
            O1.u uVar = O1.u.SHA256;
            l.b bVar = l.b.TINK;
            hashMap.put("AES128_CTR_HMAC_SHA256", C0177e.l(16, 16, 32, 16, uVar, bVar));
            l.b bVar2 = l.b.RAW;
            hashMap.put("AES128_CTR_HMAC_SHA256_RAW", C0177e.l(16, 16, 32, 16, uVar, bVar2));
            hashMap.put("AES256_CTR_HMAC_SHA256", C0177e.l(32, 16, 32, 32, uVar, bVar));
            hashMap.put("AES256_CTR_HMAC_SHA256_RAW", C0177e.l(32, 16, 32, 32, uVar, bVar2));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // J1.d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C0265d a(C0266e c0266e) {
            C0267f c0267f = (C0267f) new C0178f().f().a(c0266e.X());
            return (C0265d) C0265d.b0().s(c0267f).t((O1.v) new K1.k().f().a(c0266e.Y())).u(C0177e.this.n()).j();
        }

        @Override // J1.d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public C0266e d(AbstractC0417h abstractC0417h) {
            return C0266e.a0(abstractC0417h, C0425p.b());
        }

        @Override // J1.d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(C0266e c0266e) {
            new C0178f().f().e(c0266e.X());
            new K1.k().f().e(c0266e.Y());
            P1.r.a(c0266e.X().Y());
        }
    }

    public C0177e() {
        super(C0265d.class, new a(B1.a.class));
    }

    public static d.a.C0026a l(int i3, int i4, int i5, int i6, O1.u uVar, l.b bVar) {
        return new d.a.C0026a(m(i3, i4, i5, i6, uVar), bVar);
    }

    public static C0266e m(int i3, int i4, int i5, int i6, O1.u uVar) {
        C0268g c0268g = (C0268g) C0268g.a0().t((C0269h) C0269h.Y().s(i4).j()).s(i3).j();
        return (C0266e) C0266e.Z().s(c0268g).t((O1.w) O1.w.a0().t((O1.x) O1.x.a0().s(uVar).t(i6).j()).s(i5).j()).j();
    }

    public static void p(boolean z3) {
        B1.x.l(new C0177e(), z3);
    }

    @Override // J1.d
    public b.EnumC0011b a() {
        return b.EnumC0011b.f581f;
    }

    @Override // J1.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    @Override // J1.d
    public d.a f() {
        return new b(C0266e.class);
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
    public C0265d h(AbstractC0417h abstractC0417h) {
        return C0265d.c0(abstractC0417h, C0425p.b());
    }

    @Override // J1.d
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public void j(C0265d c0265d) {
        P1.r.c(c0265d.a0(), n());
        new C0178f().j(c0265d.Y());
        new K1.k().j(c0265d.Z());
    }
}
