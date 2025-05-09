package C1;

import B1.l;
import G1.b;
import J1.d;
import O1.C0273l;
import O1.y;
import com.google.crypto.tink.shaded.protobuf.AbstractC0417h;
import com.google.crypto.tink.shaded.protobuf.C0425p;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class p extends J1.d {

    public class a extends J1.m {
        public a(Class cls) {
            super(cls);
        }

        @Override // J1.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public B1.a a(C0273l c0273l) {
            return new P1.c(c0273l.X().y());
        }
    }

    public class b extends d.a {
        public b(Class cls) {
            super(cls);
        }

        @Override // J1.d.a
        public Map c() {
            HashMap hashMap = new HashMap();
            l.b bVar = l.b.TINK;
            hashMap.put("AES128_GCM", p.l(16, bVar));
            l.b bVar2 = l.b.RAW;
            hashMap.put("AES128_GCM_RAW", p.l(16, bVar2));
            hashMap.put("AES256_GCM", p.l(32, bVar));
            hashMap.put("AES256_GCM_RAW", p.l(32, bVar2));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // J1.d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C0273l a(O1.m mVar) {
            return (C0273l) C0273l.Z().s(AbstractC0417h.m(P1.p.c(mVar.W()))).t(p.this.m()).j();
        }

        @Override // J1.d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public O1.m d(AbstractC0417h abstractC0417h) {
            return O1.m.Y(abstractC0417h, C0425p.b());
        }

        @Override // J1.d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(O1.m mVar) {
            P1.r.a(mVar.W());
        }
    }

    public p() {
        super(C0273l.class, new a(B1.a.class));
    }

    public static d.a.C0026a l(int i3, l.b bVar) {
        return new d.a.C0026a((O1.m) O1.m.X().s(i3).j(), bVar);
    }

    public static void o(boolean z3) {
        B1.x.l(new p(), z3);
        s.c();
    }

    @Override // J1.d
    public b.EnumC0011b a() {
        return b.EnumC0011b.f581f;
    }

    @Override // J1.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    @Override // J1.d
    public d.a f() {
        return new b(O1.m.class);
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
    public C0273l h(AbstractC0417h abstractC0417h) {
        return C0273l.a0(abstractC0417h, C0425p.b());
    }

    @Override // J1.d
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public void j(C0273l c0273l) {
        P1.r.c(c0273l.Y(), m());
        P1.r.a(c0273l.X().size());
    }
}
