package K1;

import B1.y;
import C1.C0182j;
import C1.C0183k;
import J1.b;
import J1.t;
import K1.d;
import O1.C0262a;
import O1.I;
import com.google.crypto.tink.shaded.protobuf.A;
import com.google.crypto.tink.shaded.protobuf.C0425p;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final Q1.a f1091a;

    /* renamed from: b, reason: collision with root package name */
    public static final J1.k f1092b;

    /* renamed from: c, reason: collision with root package name */
    public static final J1.j f1093c;

    /* renamed from: d, reason: collision with root package name */
    public static final J1.c f1094d;

    /* renamed from: e, reason: collision with root package name */
    public static final J1.b f1095e;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1096a;

        static {
            int[] iArr = new int[I.values().length];
            f1096a = iArr;
            try {
                iArr[I.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1096a[I.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1096a[I.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1096a[I.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        Q1.a e3 = t.e("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f1091a = e3;
        f1092b = J1.k.a(new C0182j(), d.class, J1.p.class);
        f1093c = J1.j.a(new C0183k(), e3, J1.p.class);
        f1094d = J1.c.a(new C1.l(), K1.a.class, J1.o.class);
        f1095e = J1.b.a(new b.InterfaceC0025b() { // from class: K1.e
            @Override // J1.b.InterfaceC0025b
            public final B1.g a(J1.q qVar, y yVar) {
                a b3;
                b3 = f.b((J1.o) qVar, yVar);
                return b3;
            }
        }, e3, J1.o.class);
    }

    public static K1.a b(J1.o oVar, y yVar) {
        if (!oVar.f().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters");
        }
        try {
            C0262a c02 = C0262a.c0(oVar.g(), C0425p.b());
            if (c02.a0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return K1.a.c().e(d.a().b(c02.Y().size()).c(c02.Z().X()).d(e(oVar.e())).a()).c(Q1.b.a(c02.Y().y(), y.b(yVar))).d(oVar.c()).a();
        } catch (A | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing AesCmacKey failed");
        }
    }

    public static void c() {
        d(J1.i.a());
    }

    public static void d(J1.i iVar) {
        iVar.h(f1092b);
        iVar.g(f1093c);
        iVar.f(f1094d);
        iVar.e(f1095e);
    }

    public static d.c e(I i3) {
        int i4 = a.f1096a[i3.ordinal()];
        if (i4 == 1) {
            return d.c.f1086b;
        }
        if (i4 == 2) {
            return d.c.f1087c;
        }
        if (i4 == 3) {
            return d.c.f1088d;
        }
        if (i4 == 4) {
            return d.c.f1089e;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i3.d());
    }
}
