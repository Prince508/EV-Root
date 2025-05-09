package C1;

import B1.l;
import J1.d;
import O1.C0270i;
import O1.C0271j;
import O1.C0272k;
import O1.y;
import com.google.crypto.tink.shaded.protobuf.AbstractC0417h;
import com.google.crypto.tink.shaded.protobuf.C0425p;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: C1.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0180h extends J1.d {

    /* renamed from: C1.h$a */
    public class a extends J1.m {
        public a(Class cls) {
            super(cls);
        }

        @Override // J1.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public B1.a a(C0270i c0270i) {
            return new P1.b(c0270i.Y().y(), c0270i.Z().X());
        }
    }

    /* renamed from: C1.h$b */
    public class b extends d.a {
        public b(Class cls) {
            super(cls);
        }

        @Override // J1.d.a
        public Map c() {
            HashMap hashMap = new HashMap();
            l.b bVar = l.b.TINK;
            hashMap.put("AES128_EAX", C0180h.l(16, 16, bVar));
            l.b bVar2 = l.b.RAW;
            hashMap.put("AES128_EAX_RAW", C0180h.l(16, 16, bVar2));
            hashMap.put("AES256_EAX", C0180h.l(32, 16, bVar));
            hashMap.put("AES256_EAX_RAW", C0180h.l(32, 16, bVar2));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // J1.d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C0270i a(C0271j c0271j) {
            return (C0270i) C0270i.b0().s(AbstractC0417h.m(P1.p.c(c0271j.X()))).t(c0271j.Y()).u(C0180h.this.m()).j();
        }

        @Override // J1.d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public C0271j d(AbstractC0417h abstractC0417h) {
            return C0271j.a0(abstractC0417h, C0425p.b());
        }

        @Override // J1.d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(C0271j c0271j) {
            P1.r.a(c0271j.X());
            if (c0271j.Y().X() != 12 && c0271j.Y().X() != 16) {
                throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
            }
        }
    }

    public C0180h() {
        super(C0270i.class, new a(B1.a.class));
    }

    public static d.a.C0026a l(int i3, int i4, l.b bVar) {
        return new d.a.C0026a((C0271j) C0271j.Z().s(i3).t((C0272k) C0272k.Y().s(i4).j()).j(), bVar);
    }

    public static void o(boolean z3) {
        B1.x.l(new C0180h(), z3);
        n.c();
    }

    @Override // J1.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    @Override // J1.d
    public d.a f() {
        return new b(C0271j.class);
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
    public C0270i h(AbstractC0417h abstractC0417h) {
        return C0270i.c0(abstractC0417h, C0425p.b());
    }

    @Override // J1.d
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public void j(C0270i c0270i) {
        P1.r.c(c0270i.a0(), m());
        P1.r.a(c0270i.Y().size());
        if (c0270i.Z().X() != 12 && c0270i.Z().X() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
