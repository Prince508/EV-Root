package P2;

import K2.z0;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final u f1796a;

    /* renamed from: b, reason: collision with root package name */
    public static final z0 f1797b;

    static {
        u uVar = new u();
        f1796a = uVar;
        G.f("kotlinx.coroutines.fast.service.loader", true);
        f1797b = uVar.a();
    }

    public final z0 a() {
        Object next;
        z0 e3;
        try {
            List c3 = I2.g.c(I2.e.a(ServiceLoader.load(t.class, t.class.getClassLoader()).iterator()));
            Iterator it = c3.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int a3 = ((t) next).a();
                    do {
                        Object next2 = it.next();
                        int a4 = ((t) next2).a();
                        if (a3 < a4) {
                            next = next2;
                            a3 = a4;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            t tVar = (t) next;
            if (tVar != null && (e3 = v.e(tVar, c3)) != null) {
                return e3;
            }
            return v.b(null, null, 3, null);
        } catch (Throwable th) {
            return v.b(th, null, 2, null);
        }
    }
}
