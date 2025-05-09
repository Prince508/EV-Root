package C1;

import B1.v;
import M1.b;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;

/* renamed from: C1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0176d implements B1.w {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f210a = Logger.getLogger(C0176d.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final C0176d f211b = new C0176d();

    /* renamed from: C1.d$b */
    public static class b implements B1.a {

        /* renamed from: a, reason: collision with root package name */
        public final B1.v f212a;

        /* renamed from: b, reason: collision with root package name */
        public final b.a f213b;

        /* renamed from: c, reason: collision with root package name */
        public final b.a f214c;

        @Override // B1.a
        public byte[] a(byte[] bArr, byte[] bArr2) {
            try {
                byte[] a3 = P1.f.a(this.f212a.e().b(), ((B1.a) this.f212a.e().g()).a(bArr, bArr2));
                this.f213b.b(this.f212a.e().d(), bArr.length);
                return a3;
            } catch (GeneralSecurityException e3) {
                this.f213b.a();
                throw e3;
            }
        }

        @Override // B1.a
        public byte[] b(byte[] bArr, byte[] bArr2) {
            if (bArr.length > 5) {
                byte[] copyOf = Arrays.copyOf(bArr, 5);
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (v.c cVar : this.f212a.f(copyOf)) {
                    try {
                        byte[] b3 = ((B1.a) cVar.g()).b(copyOfRange, bArr2);
                        this.f214c.b(cVar.d(), copyOfRange.length);
                        return b3;
                    } catch (GeneralSecurityException e3) {
                        C0176d.f210a.info("ciphertext prefix matches a key, but cannot decrypt: " + e3);
                    }
                }
            }
            for (v.c cVar2 : this.f212a.h()) {
                try {
                    byte[] b4 = ((B1.a) cVar2.g()).b(bArr, bArr2);
                    this.f214c.b(cVar2.d(), bArr.length);
                    return b4;
                } catch (GeneralSecurityException unused) {
                }
            }
            this.f214c.a();
            throw new GeneralSecurityException("decryption failed");
        }

        public b(B1.v vVar) {
            this.f212a = vVar;
            if (!vVar.i()) {
                b.a aVar = J1.f.f875a;
                this.f213b = aVar;
                this.f214c = aVar;
            } else {
                M1.b a3 = J1.g.b().a();
                M1.c a4 = J1.f.a(vVar);
                this.f213b = a3.a(a4, "aead", "encrypt");
                this.f214c = a3.a(a4, "aead", "decrypt");
            }
        }
    }

    public static void e() {
        B1.x.n(f211b);
    }

    @Override // B1.w
    public Class a() {
        return B1.a.class;
    }

    @Override // B1.w
    public Class b() {
        return B1.a.class;
    }

    @Override // B1.w
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public B1.a c(B1.v vVar) {
        return new b(vVar);
    }
}
