package C1;

import B1.l;
import J1.d;
import O1.y;
import com.google.crypto.tink.shaded.protobuf.AbstractC0417h;
import com.google.crypto.tink.shaded.protobuf.C0425p;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* loaded from: classes.dex */
public final class u extends J1.d {

    public class a extends J1.m {
        public a(Class cls) {
            super(cls);
        }

        @Override // J1.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public B1.a a(O1.n nVar) {
            return new E1.a(nVar.X().y());
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
            hashMap.put("AES128_GCM_SIV", u.m(16, bVar));
            l.b bVar2 = l.b.RAW;
            hashMap.put("AES128_GCM_SIV_RAW", u.m(16, bVar2));
            hashMap.put("AES256_GCM_SIV", u.m(32, bVar));
            hashMap.put("AES256_GCM_SIV_RAW", u.m(32, bVar2));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // J1.d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public O1.n a(O1.o oVar) {
            return (O1.n) O1.n.Z().s(AbstractC0417h.m(P1.p.c(oVar.W()))).t(u.this.n()).j();
        }

        @Override // J1.d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public O1.o d(AbstractC0417h abstractC0417h) {
            return O1.o.Y(abstractC0417h, C0425p.b());
        }

        @Override // J1.d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(O1.o oVar) {
            P1.r.a(oVar.W());
        }
    }

    public u() {
        super(O1.n.class, new a(B1.a.class));
    }

    public static boolean l() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static d.a.C0026a m(int i3, l.b bVar) {
        return new d.a.C0026a((O1.o) O1.o.X().s(i3).j(), bVar);
    }

    public static void p(boolean z3) {
        if (l()) {
            B1.x.l(new u(), z3);
            x.c();
        }
    }

    @Override // J1.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    @Override // J1.d
    public d.a f() {
        return new b(O1.o.class);
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
    public O1.n h(AbstractC0417h abstractC0417h) {
        return O1.n.a0(abstractC0417h, C0425p.b());
    }

    @Override // J1.d
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public void j(O1.n nVar) {
        P1.r.c(nVar.Y(), n());
        P1.r.a(nVar.X().size());
    }
}
