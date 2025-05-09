package C1;

import C1.I;
import J1.b;
import com.google.crypto.tink.shaded.protobuf.C0425p;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class K {

    /* renamed from: a, reason: collision with root package name */
    public static final Q1.a f193a;

    /* renamed from: b, reason: collision with root package name */
    public static final J1.k f194b;

    /* renamed from: c, reason: collision with root package name */
    public static final J1.j f195c;

    /* renamed from: d, reason: collision with root package name */
    public static final J1.c f196d;

    /* renamed from: e, reason: collision with root package name */
    public static final J1.b f197e;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f198a;

        static {
            int[] iArr = new int[O1.I.values().length];
            f198a = iArr;
            try {
                iArr[O1.I.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f198a[O1.I.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f198a[O1.I.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f198a[O1.I.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        Q1.a e3 = J1.t.e("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        f193a = e3;
        f194b = J1.k.a(new C0182j(), I.class, J1.p.class);
        f195c = J1.j.a(new C0183k(), e3, J1.p.class);
        f196d = J1.c.a(new l(), G.class, J1.o.class);
        f197e = J1.b.a(new b.InterfaceC0025b() { // from class: C1.J
            @Override // J1.b.InterfaceC0025b
            public final B1.g a(J1.q qVar, B1.y yVar) {
                G b3;
                b3 = K.b((J1.o) qVar, yVar);
                return b3;
            }
        }, e3, J1.o.class);
    }

    public static G b(J1.o oVar, B1.y yVar) {
        if (!oVar.f().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305Parameters.parseParameters");
        }
        try {
            O1.K a02 = O1.K.a0(oVar.g(), C0425p.b());
            if (a02.Y() == 0) {
                return G.a(e(oVar.e()), Q1.b.a(a02.X().y(), B1.y.b(yVar)), oVar.c());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (com.google.crypto.tink.shaded.protobuf.A unused) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
        }
    }

    public static void c() {
        d(J1.i.a());
    }

    public static void d(J1.i iVar) {
        iVar.h(f194b);
        iVar.g(f195c);
        iVar.f(f196d);
        iVar.e(f197e);
    }

    public static I.a e(O1.I i3) {
        int i4 = a.f198a[i3.ordinal()];
        if (i4 == 1) {
            return I.a.f189b;
        }
        if (i4 == 2 || i4 == 3) {
            return I.a.f190c;
        }
        if (i4 == 4) {
            return I.a.f191d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i3.d());
    }
}
