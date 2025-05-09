package H1;

import B1.e;
import B1.v;
import B1.w;
import B1.x;
import J1.f;
import J1.g;
import M1.b;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public class c implements w {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f761a = Logger.getLogger(c.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final c f762b = new c();

    public static class a implements e {

        /* renamed from: a, reason: collision with root package name */
        public final v f763a;

        /* renamed from: b, reason: collision with root package name */
        public final b.a f764b;

        /* renamed from: c, reason: collision with root package name */
        public final b.a f765c;

        public a(v vVar) {
            this.f763a = vVar;
            if (!vVar.i()) {
                b.a aVar = f.f875a;
                this.f764b = aVar;
                this.f765c = aVar;
            } else {
                M1.b a3 = g.b().a();
                M1.c a4 = f.a(vVar);
                this.f764b = a3.a(a4, "daead", "encrypt");
                this.f765c = a3.a(a4, "daead", "decrypt");
            }
        }

        @Override // B1.e
        public byte[] a(byte[] bArr, byte[] bArr2) {
            try {
                byte[] a3 = P1.f.a(this.f763a.e().b(), ((e) this.f763a.e().g()).a(bArr, bArr2));
                this.f764b.b(this.f763a.e().d(), bArr.length);
                return a3;
            } catch (GeneralSecurityException e3) {
                this.f764b.a();
                throw e3;
            }
        }

        @Override // B1.e
        public byte[] b(byte[] bArr, byte[] bArr2) {
            if (bArr.length > 5) {
                byte[] copyOf = Arrays.copyOf(bArr, 5);
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (v.c cVar : this.f763a.f(copyOf)) {
                    try {
                        byte[] b3 = ((e) cVar.g()).b(copyOfRange, bArr2);
                        this.f765c.b(cVar.d(), copyOfRange.length);
                        return b3;
                    } catch (GeneralSecurityException e3) {
                        c.f761a.info("ciphertext prefix matches a key, but cannot decrypt: " + e3);
                    }
                }
            }
            for (v.c cVar2 : this.f763a.h()) {
                try {
                    byte[] b4 = ((e) cVar2.g()).b(bArr, bArr2);
                    this.f765c.b(cVar2.d(), bArr.length);
                    return b4;
                } catch (GeneralSecurityException unused) {
                }
            }
            this.f765c.a();
            throw new GeneralSecurityException("decryption failed");
        }
    }

    public static void e() {
        x.n(f762b);
    }

    @Override // B1.w
    public Class a() {
        return e.class;
    }

    @Override // B1.w
    public Class b() {
        return e.class;
    }

    @Override // B1.w
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public e c(v vVar) {
        return new a(vVar);
    }
}
