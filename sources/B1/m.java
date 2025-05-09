package B1;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class m {
    public static l a(String str) {
        l lVar = (l) x.i().get(str);
        if (lVar != null) {
            return lVar;
        }
        throw new GeneralSecurityException("cannot find key template: " + str);
    }
}
