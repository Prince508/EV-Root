package B1;

import O1.C;
import O1.D;
import O1.I;
import O1.y;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f125a = Charset.forName("UTF-8");

    public static D.c a(C.c cVar) {
        return (D.c) D.c.a0().v(cVar.Z().a0()).u(cVar.c0()).t(cVar.b0()).s(cVar.a0()).j();
    }

    public static D b(C c3) {
        D.b t3 = D.a0().t(c3.c0());
        Iterator it = c3.b0().iterator();
        while (it.hasNext()) {
            t3.s(a((C.c) it.next()));
        }
        return (D) t3.j();
    }

    public static void c(C.c cVar) {
        if (!cVar.d0()) {
            throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(cVar.a0())));
        }
        if (cVar.b0() == I.UNKNOWN_PREFIX) {
            throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(cVar.a0())));
        }
        if (cVar.c0() == O1.z.UNKNOWN_STATUS) {
            throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(cVar.a0())));
        }
    }

    public static void d(C c3) {
        int c02 = c3.c0();
        int i3 = 0;
        boolean z3 = false;
        boolean z4 = true;
        for (C.c cVar : c3.b0()) {
            if (cVar.c0() == O1.z.ENABLED) {
                c(cVar);
                if (cVar.a0() == c02) {
                    if (z3) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z3 = true;
                }
                if (cVar.Z().Z() != y.c.ASYMMETRIC_PUBLIC) {
                    z4 = false;
                }
                i3++;
            }
        }
        if (i3 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z3 && !z4) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}
