package K1;

import B1.t;
import B1.v;
import B1.w;
import B1.x;
import M1.b;
import O1.I;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public class r implements w {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f1139a = Logger.getLogger(r.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f1140b = {0};

    /* renamed from: c, reason: collision with root package name */
    public static final r f1141c = new r();

    public static class b implements t {

        /* renamed from: a, reason: collision with root package name */
        public final v f1142a;

        /* renamed from: b, reason: collision with root package name */
        public final b.a f1143b;

        /* renamed from: c, reason: collision with root package name */
        public final b.a f1144c;

        @Override // B1.t
        public void a(byte[] bArr, byte[] bArr2) {
            if (bArr.length <= 5) {
                this.f1144c.a();
                throw new GeneralSecurityException("tag too short");
            }
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
            for (v.c cVar : this.f1142a.f(copyOf)) {
                try {
                    ((t) cVar.g()).a(copyOfRange, cVar.f().equals(I.LEGACY) ? P1.f.a(bArr2, r.f1140b) : bArr2);
                    this.f1144c.b(cVar.d(), r3.length);
                    return;
                } catch (GeneralSecurityException e3) {
                    r.f1139a.info("tag prefix matches a key, but cannot verify: " + e3);
                }
            }
            for (v.c cVar2 : this.f1142a.h()) {
                try {
                    ((t) cVar2.g()).a(bArr, bArr2);
                    this.f1144c.b(cVar2.d(), bArr2.length);
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            this.f1144c.a();
            throw new GeneralSecurityException("invalid MAC");
        }

        @Override // B1.t
        public byte[] b(byte[] bArr) {
            if (this.f1142a.e().f().equals(I.LEGACY)) {
                bArr = P1.f.a(bArr, r.f1140b);
            }
            try {
                byte[] a3 = P1.f.a(this.f1142a.e().b(), ((t) this.f1142a.e().g()).b(bArr));
                this.f1143b.b(this.f1142a.e().d(), bArr.length);
                return a3;
            } catch (GeneralSecurityException e3) {
                this.f1143b.a();
                throw e3;
            }
        }

        public b(v vVar) {
            this.f1142a = vVar;
            if (!vVar.i()) {
                b.a aVar = J1.f.f875a;
                this.f1143b = aVar;
                this.f1144c = aVar;
            } else {
                M1.b a3 = J1.g.b().a();
                M1.c a4 = J1.f.a(vVar);
                this.f1143b = a3.a(a4, "mac", "compute");
                this.f1144c = a3.a(a4, "mac", "verify");
            }
        }
    }

    public static void f() {
        x.n(f1141c);
    }

    @Override // B1.w
    public Class a() {
        return t.class;
    }

    @Override // B1.w
    public Class b() {
        return t.class;
    }

    public final void g(v vVar) {
        Iterator it = vVar.c().iterator();
        while (it.hasNext()) {
            for (v.c cVar : (List) it.next()) {
                if (cVar.c() instanceof p) {
                    p pVar = (p) cVar.c();
                    Q1.a a3 = Q1.a.a(cVar.b());
                    if (!a3.equals(pVar.a())) {
                        throw new GeneralSecurityException("Mac Key with parameters " + pVar.b() + " has wrong output prefix (" + pVar.a() + ") instead of (" + a3 + ")");
                    }
                }
            }
        }
    }

    @Override // B1.w
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public t c(v vVar) {
        g(vVar);
        return new b(vVar);
    }
}
