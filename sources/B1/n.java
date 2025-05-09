package B1;

import B1.v;
import O1.C;
import O1.D;
import O1.I;
import com.google.crypto.tink.shaded.protobuf.A;
import com.google.crypto.tink.shaded.protobuf.AbstractC0417h;
import com.google.crypto.tink.shaded.protobuf.C0425p;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final C f89a;

    /* renamed from: b, reason: collision with root package name */
    public final List f90b;

    /* renamed from: c, reason: collision with root package name */
    public final M1.a f91c = M1.a.f1359b;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f92a;

        static {
            int[] iArr = new int[O1.z.values().length];
            f92a = iArr;
            try {
                iArr[O1.z.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f92a[O1.z.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f92a[O1.z.DESTROYED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final g f93a;

        /* renamed from: b, reason: collision with root package name */
        public final k f94b;

        /* renamed from: c, reason: collision with root package name */
        public final int f95c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f96d;

        public /* synthetic */ b(g gVar, k kVar, int i3, boolean z3, a aVar) {
            this(gVar, kVar, i3, z3);
        }

        public g a() {
            return this.f93a;
        }

        public b(g gVar, k kVar, int i3, boolean z3) {
            this.f93a = gVar;
            this.f94b = kVar;
            this.f95c = i3;
            this.f96d = z3;
        }
    }

    public n(C c3, List list) {
        this.f89a = c3;
        this.f90b = list;
    }

    public static void a(O1.t tVar) {
        if (tVar == null || tVar.X().size() == 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    public static void b(C c3) {
        if (c3 == null || c3.a0() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    public static C c(O1.t tVar, B1.a aVar, byte[] bArr) {
        try {
            C f02 = C.f0(aVar.b(tVar.X().y(), bArr), C0425p.b());
            b(f02);
            return f02;
        } catch (A unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    public static O1.t d(C c3, B1.a aVar, byte[] bArr) {
        byte[] a3 = aVar.a(c3.e(), bArr);
        try {
            if (C.f0(aVar.b(a3, bArr), C0425p.b()).equals(c3)) {
                return (O1.t) O1.t.Y().s(AbstractC0417h.m(a3)).t(z.b(c3)).j();
            }
            throw new GeneralSecurityException("cannot encrypt keyset");
        } catch (A unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    public static final n e(C c3) {
        b(c3);
        return new n(c3, f(c3));
    }

    public static List f(C c3) {
        ArrayList arrayList = new ArrayList(c3.a0());
        for (C.c cVar : c3.b0()) {
            int a02 = cVar.a0();
            try {
                arrayList.add(new b(J1.i.a().d(q(cVar), f.a()), m(cVar.c0()), a02, a02 == c3.c0(), null));
            } catch (GeneralSecurityException unused) {
                arrayList.add(null);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static Object j(C.c cVar, Class cls) {
        try {
            return x.e(cVar.Z(), cls);
        } catch (GeneralSecurityException e3) {
            if (e3.getMessage().contains("No key manager found for key type ") || e3.getMessage().contains(" not supported by key manager of type ")) {
                return null;
            }
            throw e3;
        }
    }

    public static k m(O1.z zVar) {
        int i3 = a.f92a[zVar.ordinal()];
        if (i3 == 1) {
            return k.f77b;
        }
        if (i3 == 2) {
            return k.f78c;
        }
        if (i3 == 3) {
            return k.f79d;
        }
        throw new GeneralSecurityException("Unknown key status");
    }

    public static final n n(p pVar, B1.a aVar) {
        return o(pVar, aVar, new byte[0]);
    }

    public static final n o(p pVar, B1.a aVar, byte[] bArr) {
        O1.t a3 = pVar.a();
        a(a3);
        return e(c(a3, aVar, bArr));
    }

    public static J1.o q(C.c cVar) {
        try {
            return J1.o.b(cVar.Z().a0(), cVar.Z().b0(), cVar.Z().Z(), cVar.b0(), cVar.b0() == I.RAW ? null : Integer.valueOf(cVar.a0()));
        } catch (GeneralSecurityException e3) {
            throw new J1.s("Creating a protokey serialization failed", e3);
        }
    }

    public final Object g(g gVar, Class cls) {
        try {
            return x.c(gVar, cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public C h() {
        return this.f89a;
    }

    public D i() {
        return z.b(this.f89a);
    }

    public Object k(Class cls) {
        Class d3 = x.d(cls);
        if (d3 != null) {
            return l(cls, d3);
        }
        throw new GeneralSecurityException("No wrapper found for " + cls.getName());
    }

    public final Object l(Class cls, Class cls2) {
        z.d(this.f89a);
        v.b j3 = v.j(cls2);
        j3.e(this.f91c);
        for (int i3 = 0; i3 < p(); i3++) {
            C.c Z2 = this.f89a.Z(i3);
            if (Z2.c0().equals(O1.z.ENABLED)) {
                Object j4 = j(Z2, cls2);
                Object g3 = this.f90b.get(i3) != null ? g(((b) this.f90b.get(i3)).a(), cls2) : null;
                if (Z2.a0() == this.f89a.c0()) {
                    j3.b(g3, j4, Z2);
                } else {
                    j3.a(g3, j4, Z2);
                }
            }
        }
        return x.o(j3.d(), cls);
    }

    public int p() {
        return this.f89a.a0();
    }

    public void r(q qVar, B1.a aVar) {
        s(qVar, aVar, new byte[0]);
    }

    public void s(q qVar, B1.a aVar, byte[] bArr) {
        qVar.a(d(this.f89a, aVar, bArr));
    }

    public String toString() {
        return i().toString();
    }
}
