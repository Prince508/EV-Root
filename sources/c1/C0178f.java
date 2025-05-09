package C1;

import J1.d;
import O1.C0267f;
import O1.C0268g;
import O1.C0269h;
import O1.y;
import com.google.crypto.tink.shaded.protobuf.AbstractC0417h;
import com.google.crypto.tink.shaded.protobuf.C0425p;
import java.security.GeneralSecurityException;

/* renamed from: C1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0178f extends J1.d {

    /* renamed from: C1.f$a */
    public class a extends J1.m {
        public a(Class cls) {
            super(cls);
        }

        @Override // J1.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public P1.l a(C0267f c0267f) {
            return new P1.a(c0267f.Z().y(), c0267f.a0().X());
        }
    }

    /* renamed from: C1.f$b */
    public class b extends d.a {
        public b(Class cls) {
            super(cls);
        }

        @Override // J1.d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C0267f a(C0268g c0268g) {
            return (C0267f) C0267f.c0().t(c0268g.Z()).s(AbstractC0417h.m(P1.p.c(c0268g.Y()))).u(C0178f.this.l()).j();
        }

        @Override // J1.d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public C0268g d(AbstractC0417h abstractC0417h) {
            return C0268g.b0(abstractC0417h, C0425p.b());
        }

        @Override // J1.d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(C0268g c0268g) {
            P1.r.a(c0268g.Y());
            C0178f.this.o(c0268g.Z());
        }
    }

    public C0178f() {
        super(C0267f.class, new a(P1.l.class));
    }

    @Override // J1.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    @Override // J1.d
    public d.a f() {
        return new b(C0268g.class);
    }

    @Override // J1.d
    public y.c g() {
        return y.c.SYMMETRIC;
    }

    public int l() {
        return 0;
    }

    @Override // J1.d
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public C0267f h(AbstractC0417h abstractC0417h) {
        return C0267f.d0(abstractC0417h, C0425p.b());
    }

    @Override // J1.d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void j(C0267f c0267f) {
        P1.r.c(c0267f.b0(), l());
        P1.r.a(c0267f.Z().size());
        o(c0267f.a0());
    }

    public final void o(C0269h c0269h) {
        if (c0269h.X() < 12 || c0269h.X() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }
}
