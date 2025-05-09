package C1;

import C1.q;
import J1.b;
import O1.C0273l;
import com.google.crypto.tink.shaded.protobuf.C0425p;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final Q1.a f263a;

    /* renamed from: b, reason: collision with root package name */
    public static final J1.k f264b;

    /* renamed from: c, reason: collision with root package name */
    public static final J1.j f265c;

    /* renamed from: d, reason: collision with root package name */
    public static final J1.c f266d;

    /* renamed from: e, reason: collision with root package name */
    public static final J1.b f267e;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f268a;

        static {
            int[] iArr = new int[O1.I.values().length];
            f268a = iArr;
            try {
                iArr[O1.I.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f268a[O1.I.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f268a[O1.I.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f268a[O1.I.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        Q1.a e3 = J1.t.e("type.googleapis.com/google.crypto.tink.AesGcmKey");
        f263a = e3;
        f264b = J1.k.a(new C0182j(), q.class, J1.p.class);
        f265c = J1.j.a(new C0183k(), e3, J1.p.class);
        f266d = J1.c.a(new l(), o.class, J1.o.class);
        f267e = J1.b.a(new b.InterfaceC0025b() { // from class: C1.r
            @Override // J1.b.InterfaceC0025b
            public final B1.g a(J1.q qVar, B1.y yVar) {
                o b3;
                b3 = s.b((J1.o) qVar, yVar);
                return b3;
            }
        }, e3, J1.o.class);
    }

    public static o b(J1.o oVar, B1.y yVar) {
        if (!oVar.f().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmParameters.parseParameters");
        }
        try {
            C0273l a02 = C0273l.a0(oVar.g(), C0425p.b());
            if (a02.Y() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return o.a().e(q.a().c(a02.X().size()).b(12).d(16).e(e(oVar.e())).a()).d(Q1.b.a(a02.X().y(), B1.y.b(yVar))).c(oVar.c()).a();
        } catch (com.google.crypto.tink.shaded.protobuf.A unused) {
            throw new GeneralSecurityException("Parsing AesGcmKey failed");
        }
    }

    public static void c() {
        d(J1.i.a());
    }

    public static void d(J1.i iVar) {
        iVar.h(f264b);
        iVar.g(f265c);
        iVar.f(f266d);
        iVar.e(f267e);
    }

    public static q.c e(O1.I i3) {
        int i4 = a.f268a[i3.ordinal()];
        if (i4 == 1) {
            return q.c.f259b;
        }
        if (i4 == 2 || i4 == 3) {
            return q.c.f260c;
        }
        if (i4 == 4) {
            return q.c.f261d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i3.d());
    }
}
