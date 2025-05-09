package I2;

import C2.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import r2.AbstractC0699l;
import r2.AbstractC0700m;

/* loaded from: classes.dex */
public abstract class g extends f {
    public static List c(b bVar) {
        k.e(bVar, "<this>");
        Iterator it = bVar.iterator();
        if (!it.hasNext()) {
            return AbstractC0700m.f();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return AbstractC0699l.b(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
