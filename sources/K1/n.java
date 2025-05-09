package K1;

import B1.y;
import C1.C0182j;
import C1.C0183k;
import J1.b;
import J1.t;
import K1.l;
import O1.I;
import O1.u;
import O1.v;
import com.google.crypto.tink.shaded.protobuf.A;
import com.google.crypto.tink.shaded.protobuf.C0425p;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final Q1.a f1128a;

    /* renamed from: b, reason: collision with root package name */
    public static final J1.k f1129b;

    /* renamed from: c, reason: collision with root package name */
    public static final J1.j f1130c;

    /* renamed from: d, reason: collision with root package name */
    public static final J1.c f1131d;

    /* renamed from: e, reason: collision with root package name */
    public static final J1.b f1132e;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1133a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f1134b;

        static {
            int[] iArr = new int[I.values().length];
            f1134b = iArr;
            try {
                iArr[I.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1134b[I.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1134b[I.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1134b[I.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[u.values().length];
            f1133a = iArr2;
            try {
                iArr2[u.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1133a[u.SHA224.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1133a[u.SHA256.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f1133a[u.SHA384.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f1133a[u.SHA512.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    static {
        Q1.a e3 = t.e("type.googleapis.com/google.crypto.tink.HmacKey");
        f1128a = e3;
        f1129b = J1.k.a(new C0182j(), l.class, J1.p.class);
        f1130c = J1.j.a(new C0183k(), e3, J1.p.class);
        f1131d = J1.c.a(new C1.l(), i.class, J1.o.class);
        f1132e = J1.b.a(new b.InterfaceC0025b() { // from class: K1.m
            @Override // J1.b.InterfaceC0025b
            public final B1.g a(J1.q qVar, y yVar) {
                i b3;
                b3 = n.b((J1.o) qVar, yVar);
                return b3;
            }
        }, e3, J1.o.class);
    }

    public static i b(J1.o oVar, y yVar) {
        if (!oVar.f().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
        try {
            v d02 = v.d0(oVar.g(), C0425p.b());
            if (d02.b0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return i.c().e(l.a().c(d02.Z().size()).d(d02.a0().Z()).b(e(d02.a0().Y())).e(f(oVar.e())).a()).d(Q1.b.a(d02.Z().y(), y.b(yVar))).c(oVar.c()).a();
        } catch (A | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing HmacKey failed");
        }
    }

    public static void c() {
        d(J1.i.a());
    }

    public static void d(J1.i iVar) {
        iVar.h(f1129b);
        iVar.g(f1130c);
        iVar.f(f1131d);
        iVar.e(f1132e);
    }

    public static l.c e(u uVar) {
        int i3 = a.f1133a[uVar.ordinal()];
        if (i3 == 1) {
            return l.c.f1117b;
        }
        if (i3 == 2) {
            return l.c.f1118c;
        }
        if (i3 == 3) {
            return l.c.f1119d;
        }
        if (i3 == 4) {
            return l.c.f1120e;
        }
        if (i3 == 5) {
            return l.c.f1121f;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + uVar.d());
    }

    public static l.d f(I i3) {
        int i4 = a.f1134b[i3.ordinal()];
        if (i4 == 1) {
            return l.d.f1123b;
        }
        if (i4 == 2) {
            return l.d.f1124c;
        }
        if (i4 == 3) {
            return l.d.f1125d;
        }
        if (i4 == 4) {
            return l.d.f1126e;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i3.d());
    }
}
