package J1;

import B1.v;
import M1.b;
import M1.c;
import O1.z;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final b.a f875a = new b(null);

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f876a;

        static {
            int[] iArr = new int[z.values().length];
            f876a = iArr;
            try {
                iArr[z.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f876a[z.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f876a[z.DESTROYED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class b implements b.a {
        public b() {
        }

        public /* synthetic */ b(a aVar) {
            this();
        }

        @Override // M1.b.a
        public void a() {
        }

        @Override // M1.b.a
        public void b(int i3, long j3) {
        }
    }

    public static M1.c a(v vVar) {
        c.b a3 = M1.c.a();
        a3.d(vVar.d());
        Iterator it = vVar.c().iterator();
        while (it.hasNext()) {
            for (v.c cVar : (List) it.next()) {
                a3.a(c(cVar.h()), cVar.d(), b(cVar.e()), cVar.f().name());
            }
        }
        if (vVar.e() != null) {
            a3.e(vVar.e().d());
        }
        try {
            return a3.b();
        } catch (GeneralSecurityException e3) {
            throw new IllegalStateException(e3);
        }
    }

    public static String b(String str) {
        return !str.startsWith("type.googleapis.com/google.crypto.") ? str : str.substring(34);
    }

    public static B1.k c(z zVar) {
        int i3 = a.f876a[zVar.ordinal()];
        if (i3 == 1) {
            return B1.k.f77b;
        }
        if (i3 == 2) {
            return B1.k.f78c;
        }
        if (i3 == 3) {
            return B1.k.f79d;
        }
        throw new IllegalStateException("Unknown key status");
    }
}
