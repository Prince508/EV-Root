package C1;

import C1.v;
import J1.b;
import com.google.crypto.tink.shaded.protobuf.C0425p;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final Q1.a f285a;

    /* renamed from: b, reason: collision with root package name */
    public static final J1.k f286b;

    /* renamed from: c, reason: collision with root package name */
    public static final J1.j f287c;

    /* renamed from: d, reason: collision with root package name */
    public static final J1.c f288d;

    /* renamed from: e, reason: collision with root package name */
    public static final J1.b f289e;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f290a;

        static {
            int[] iArr = new int[O1.I.values().length];
            f290a = iArr;
            try {
                iArr[O1.I.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f290a[O1.I.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f290a[O1.I.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f290a[O1.I.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        Q1.a e3 = J1.t.e("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        f285a = e3;
        f286b = J1.k.a(new C0182j(), v.class, J1.p.class);
        f287c = J1.j.a(new C0183k(), e3, J1.p.class);
        f288d = J1.c.a(new l(), t.class, J1.o.class);
        f289e = J1.b.a(new b.InterfaceC0025b() { // from class: C1.w
            @Override // J1.b.InterfaceC0025b
            public final B1.g a(J1.q qVar, B1.y yVar) {
                t b3;
                b3 = x.b((J1.o) qVar, yVar);
                return b3;
            }
        }, e3, J1.o.class);
    }

    public static t b(J1.o oVar, B1.y yVar) {
        if (!oVar.f().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivParameters.parseParameters");
        }
        try {
            O1.n a02 = O1.n.a0(oVar.g(), C0425p.b());
            if (a02.Y() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return t.a().e(v.a().b(a02.X().size()).c(e(oVar.e())).a()).d(Q1.b.a(a02.X().y(), B1.y.b(yVar))).c(oVar.c()).a();
        } catch (com.google.crypto.tink.shaded.protobuf.A unused) {
            throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
        }
    }

    public static void c() {
        d(J1.i.a());
    }

    public static void d(J1.i iVar) {
        iVar.h(f286b);
        iVar.g(f287c);
        iVar.f(f288d);
        iVar.e(f289e);
    }

    public static v.c e(O1.I i3) {
        int i4 = a.f290a[i3.ordinal()];
        if (i4 == 1) {
            return v.c.f281b;
        }
        if (i4 == 2 || i4 == 3) {
            return v.c.f282c;
        }
        if (i4 == 4) {
            return v.c.f283d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i3.d());
    }
}
