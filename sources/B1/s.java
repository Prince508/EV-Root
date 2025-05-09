package B1;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final CopyOnWriteArrayList f98a = new CopyOnWriteArrayList();

    public static r a(String str) {
        Iterator it = f98a.iterator();
        while (it.hasNext()) {
            r rVar = (r) it.next();
            if (rVar.b(str)) {
                return rVar;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: " + str);
    }
}
