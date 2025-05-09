package F0;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class a {
    public static T0.a a(List list, String str) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            T0.a aVar = (T0.a) it.next();
            if (str.equals(aVar.f())) {
                return aVar;
            }
        }
        return null;
    }

    public static ByteBuffer b(List list, U0.c cVar) {
        T0.a a3 = a(list, "AndroidManifest.xml");
        if (a3 != null) {
            return ByteBuffer.wrap(T0.b.b(cVar, a3, cVar.size()));
        }
        throw new G0.a("Missing AndroidManifest.xml");
    }
}
