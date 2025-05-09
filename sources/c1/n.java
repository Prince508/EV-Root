package C1;

import C1.C0181i;
import J1.b;
import O1.C0270i;
import com.google.crypto.tink.shaded.protobuf.C0425p;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final Q1.a f237a;

    /* renamed from: b, reason: collision with root package name */
    public static final J1.k f238b;

    /* renamed from: c, reason: collision with root package name */
    public static final J1.j f239c;

    /* renamed from: d, reason: collision with root package name */
    public static final J1.c f240d;

    /* renamed from: e, reason: collision with root package name */
    public static final J1.b f241e;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f242a;

        static {
            int[] iArr = new int[O1.I.values().length];
            f242a = iArr;
            try {
                iArr[O1.I.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f242a[O1.I.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f242a[O1.I.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f242a[O1.I.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        Q1.a e3 = J1.t.e("type.googleapis.com/google.crypto.tink.AesEaxKey");
        f237a = e3;
        f238b = J1.k.a(new C0182j(), C0181i.class, J1.p.class);
        f239c = J1.j.a(new C0183k(), e3, J1.p.class);
        f240d = J1.c.a(new l(), C0179g.class, J1.o.class);
        f241e = J1.b.a(new b.InterfaceC0025b() { // from class: C1.m
            @Override // J1.b.InterfaceC0025b
            public final B1.g a(J1.q qVar, B1.y yVar) {
                C0179g b3;
                b3 = n.b((J1.o) qVar, yVar);
                return b3;
            }
        }, e3, J1.o.class);
    }

    public static C0179g b(J1.o oVar, B1.y yVar) {
        if (!oVar.f().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxParameters.parseParameters");
        }
        try {
            C0270i c02 = C0270i.c0(oVar.g(), C0425p.b());
            if (c02.a0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return C0179g.a().e(C0181i.a().c(c02.Y().size()).b(c02.Z().X()).d(16).e(e(oVar.e())).a()).d(Q1.b.a(c02.Y().y(), B1.y.b(yVar))).c(oVar.c()).a();
        } catch (com.google.crypto.tink.shaded.protobuf.A unused) {
            throw new GeneralSecurityException("Parsing AesEaxcKey failed");
        }
    }

    public static void c() {
        d(J1.i.a());
    }

    public static void d(J1.i iVar) {
        iVar.h(f238b);
        iVar.g(f239c);
        iVar.f(f240d);
        iVar.e(f241e);
    }

    public static C0181i.c e(O1.I i3) {
        int i4 = a.f242a[i3.ordinal()];
        if (i4 == 1) {
            return C0181i.c.f233b;
        }
        if (i4 == 2 || i4 == 3) {
            return C0181i.c.f234c;
        }
        if (i4 == 4) {
            return C0181i.c.f235d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i3.d());
    }
}
