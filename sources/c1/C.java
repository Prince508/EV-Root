package C1;

import C1.A;
import J1.b;
import com.google.crypto.tink.shaded.protobuf.C0425p;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class C {

    /* renamed from: a, reason: collision with root package name */
    public static final Q1.a f172a;

    /* renamed from: b, reason: collision with root package name */
    public static final J1.k f173b;

    /* renamed from: c, reason: collision with root package name */
    public static final J1.j f174c;

    /* renamed from: d, reason: collision with root package name */
    public static final J1.c f175d;

    /* renamed from: e, reason: collision with root package name */
    public static final J1.b f176e;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f177a;

        static {
            int[] iArr = new int[O1.I.values().length];
            f177a = iArr;
            try {
                iArr[O1.I.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f177a[O1.I.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f177a[O1.I.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f177a[O1.I.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        Q1.a e3 = J1.t.e("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        f172a = e3;
        f173b = J1.k.a(new C0182j(), A.class, J1.p.class);
        f174c = J1.j.a(new C0183k(), e3, J1.p.class);
        f175d = J1.c.a(new l(), y.class, J1.o.class);
        f176e = J1.b.a(new b.InterfaceC0025b() { // from class: C1.B
            @Override // J1.b.InterfaceC0025b
            public final B1.g a(J1.q qVar, B1.y yVar) {
                y b3;
                b3 = C.b((J1.o) qVar, yVar);
                return b3;
            }
        }, e3, J1.o.class);
    }

    public static y b(J1.o oVar, B1.y yVar) {
        if (!oVar.f().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305Parameters.parseParameters");
        }
        try {
            O1.r a02 = O1.r.a0(oVar.g(), C0425p.b());
            if (a02.Y() == 0) {
                return y.a(e(oVar.e()), Q1.b.a(a02.X().y(), B1.y.b(yVar)), oVar.c());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (com.google.crypto.tink.shaded.protobuf.A unused) {
            throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
        }
    }

    public static void c() {
        d(J1.i.a());
    }

    public static void d(J1.i iVar) {
        iVar.h(f173b);
        iVar.g(f174c);
        iVar.f(f175d);
        iVar.e(f176e);
    }

    public static A.a e(O1.I i3) {
        int i4 = a.f177a[i3.ordinal()];
        if (i4 == 1) {
            return A.a.f168b;
        }
        if (i4 == 2 || i4 == 3) {
            return A.a.f169c;
        }
        if (i4 == 4) {
            return A.a.f170d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i3.d());
    }
}
